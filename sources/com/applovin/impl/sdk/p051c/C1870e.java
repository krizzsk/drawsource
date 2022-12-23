package com.applovin.impl.sdk.p051c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.e */
public final class C1870e {

    /* renamed from: a */
    private static C1969m f3397a;

    /* renamed from: b */
    private static SharedPreferences f3398b;

    /* renamed from: c */
    private final SharedPreferences f3399c;

    public C1870e(C1969m mVar) {
        this.f3399c = mVar.mo14520L().getSharedPreferences("com.applovin.sdk.preferences." + mVar.mo14597z(), 0);
        if (!mVar.mo14575e()) {
            f3397a = mVar;
        }
    }

    /* renamed from: a */
    private static SharedPreferences m4098a(Context context) {
        if (f3398b == null) {
            f3398b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3398b;
    }

    /* renamed from: a */
    public static <T> T m4099a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        T t2;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    t2 = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    t2 = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    t2 = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0);
                    }
                    t2 = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    t2 = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0)));
                } else {
                    t2 = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                if (t2 != null) {
                    return cls.cast(t2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t;
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("SharedPreferencesManager", "Error getting value for key: " + str, th);
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    private static void m4100a(final SharedPreferences.Editor editor) {
        try {
            if (f3397a != null && ((Boolean) f3397a.mo14534a(C1867b.f3318eJ)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                    return;
                } else if (f3397a.mo14526S() != null) {
                    f3397a.mo14526S().mo14429a((C1887a) new C1944z(f3397a, new Runnable() {
                        public void run() {
                            editor.commit();
                        }
                    }), C1918o.C1920a.BACKGROUND);
                    return;
                }
            }
            editor.apply();
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("SharedPreferencesManager", "Unable to apply changes", th);
            }
        }
    }

    /* renamed from: a */
    public static <T> void m4101a(C1869d<T> dVar, T t, Context context) {
        m4102a(dVar.mo14293a(), t, m4098a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: a */
    public static <T> void m4102a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                if (C2102v.m5104a()) {
                    C2102v.m5110i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                }
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (z && !z2) {
            m4100a(editor);
        }
    }

    /* renamed from: b */
    public static <T> T m4103b(C1869d<T> dVar, T t, Context context) {
        return m4099a(dVar.mo14293a(), t, (Class) dVar.mo14294b(), m4098a(context));
    }

    /* renamed from: a */
    public void mo14296a(SharedPreferences sharedPreferences) {
        m4100a(sharedPreferences.edit().clear());
    }

    /* renamed from: a */
    public <T> void mo14297a(C1869d<T> dVar) {
        m4100a(this.f3399c.edit().remove(dVar.mo14293a()));
    }

    /* renamed from: a */
    public <T> void mo14298a(C1869d<T> dVar, T t) {
        mo14299a(dVar, t, this.f3399c);
    }

    /* renamed from: a */
    public <T> void mo14299a(C1869d<T> dVar, T t, SharedPreferences sharedPreferences) {
        mo14301a(dVar.mo14293a(), t, sharedPreferences);
    }

    /* renamed from: a */
    public <T> void mo14300a(String str, T t, SharedPreferences.Editor editor) {
        m4102a(str, t, (SharedPreferences) null, editor);
    }

    /* renamed from: a */
    public <T> void mo14301a(String str, T t, SharedPreferences sharedPreferences) {
        m4102a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public <T> T mo14302b(C1869d<T> dVar, T t) {
        return mo14303b(dVar, t, this.f3399c);
    }

    /* renamed from: b */
    public <T> T mo14303b(C1869d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return m4099a(dVar.mo14293a(), t, (Class) dVar.mo14294b(), sharedPreferences);
    }
}
