package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tapjoy.internal.C11558hj;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TJInstallReferrer implements InvocationHandler {

    /* renamed from: a */
    private String f26666a = "Tapjoy";

    /* renamed from: b */
    private Object f26667b;

    /* renamed from: c */
    private Context f26668c;

    /* renamed from: d */
    private SharedPreferences f26669d;

    public void init(Context context) {
        this.f26668c = context.getApplicationContext();
        Object a = m30747a();
        this.f26667b = a;
        if (a == null) {
            Log.e(this.f26666a, "Failed to activate InstallReferrerClient. No available InstallReferrrerClient.");
            return;
        }
        Class b = m30752b();
        if (b == null) {
            Log.e(this.f26666a, "InstallReferrerClient setup failed. No available InstallReferrrerStateListener.");
            return;
        }
        Object a2 = m30748a(b);
        if (a2 == null) {
            Log.e(this.f26666a, "InstallReferrerClient setup failed. No available InstallReferrrerStateListener object.");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.tapjoy.referrer", 0);
        this.f26669d = sharedPreferences;
        if (!sharedPreferences.getBoolean("TJInstallReferrerDidSetUp", false)) {
            try {
                if (this.f26667b != null) {
                    Log.e(this.f26666a, "startConnection");
                    try {
                        m30750a(this.f26667b, "startConnection", new Class[]{b}, a2);
                    } catch (NoClassDefFoundError e) {
                        Log.e(this.f26666a, e.getMessage());
                    } catch (Exception e2) {
                        Log.e(this.f26666a, e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                Log.e(this.f26666a, e3.getMessage());
            }
        }
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Context context;
        if (method == null) {
            Log.e(this.f26666a, "Failed to invoke null method");
            return null;
        }
        String name = method.getName();
        if (name == null) {
            Log.e(this.f26666a, "Failed to invoke null method name");
            return null;
        }
        if (objArr == null) {
            Log.e(this.f26666a, "Invoking method with null args");
            objArr = new Object[0];
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                Log.e(this.f26666a, "Invalid args");
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof Integer)) {
                Log.e(this.f26666a, "Invalid args type.");
                return null;
            }
            Integer num = (Integer) obj2;
            if (num == null) {
                Log.e(this.f26666a, "onInstallReferrerSetupFinished response code can't be null");
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                try {
                    SharedPreferences.Editor edit = this.f26669d.edit();
                    edit.putBoolean("TJInstallReferrerDidSetUp", true);
                    edit.apply();
                    Object c = m30753c();
                    if (c == null) {
                        edit.putBoolean("TJInstallReferrerDidSetUp", false);
                        Log.e(this.f26666a, "Failed to get ReferrerDetails instance.");
                    } else {
                        String a = m30751a(c);
                        C11558hj.m31644a();
                        C11558hj.m31646a(this.f26668c, a);
                    }
                    if (this.f26667b != null) {
                        try {
                            m30750a(this.f26667b, "endConnection", (Class[]) null, new Object[0]);
                        } catch (Exception e) {
                            Log.e(this.f26666a, e.getMessage());
                        }
                    }
                } catch (Exception e2) {
                    Log.e(this.f26666a, e2.getMessage());
                }
            } else if (intValue == 1) {
                Log.e(this.f26666a, "Install referrer service isn't available");
            } else if (intValue != 2) {
                Log.e(this.f26666a, "Install referrer service isn't available");
            } else {
                Log.e(this.f26666a, "Install referrer isn't supported on the current Play Store app.");
            }
        } else if (name.equals("onInstallReferrerServiceDisconnected") && (context = this.f26668c) != null) {
            init(context);
        }
        return null;
    }

    /* renamed from: a */
    private Object m30747a() {
        Object a;
        try {
            if (this.f26668c == null || (a = m30749a(Class.forName("com.android.installreferrer.api.InstallReferrerClient"), "newBuilder", (Object) null, new Class[]{Context.class}, this.f26668c)) == null) {
                return null;
            }
            return m30750a(a, "build", (Class[]) null, new Object[0]);
        } catch (NoClassDefFoundError e) {
            Log.e(this.f26666a, e.getMessage());
            return null;
        } catch (Exception e2) {
            Log.e(this.f26666a, e2.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private Class m30752b() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
        } catch (NoClassDefFoundError e) {
            Log.e(this.f26666a, e.getMessage());
            return null;
        } catch (Exception e2) {
            Log.e(this.f26666a, e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private Object m30748a(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (Exception e) {
            Log.e(this.f26666a, e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private Object m30753c() {
        Object obj = this.f26667b;
        if (obj != null) {
            try {
                return m30750a(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
            } catch (Exception e) {
                Log.e(this.f26666a, e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m30751a(Object obj) {
        try {
            return String.valueOf(m30750a(obj, "getInstallReferrer", (Class[]) null, new Object[0]));
        } catch (Exception e) {
            Log.e(this.f26666a, e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Object m30750a(Object obj, String str, Class[] clsArr, Object... objArr) {
        try {
            return m30749a(obj.getClass(), str, obj, clsArr, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Object m30749a(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            if (method == null) {
                return null;
            }
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }
}
