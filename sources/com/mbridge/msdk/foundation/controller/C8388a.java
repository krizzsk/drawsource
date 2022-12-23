package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.a */
/* compiled from: MBSDKContext */
public class C8388a {

    /* renamed from: a */
    public static final String f20462a = C8388a.class.getSimpleName();

    /* renamed from: b */
    public static List<String> f20463b = new ArrayList();

    /* renamed from: c */
    public static HashMap<String, String> f20464c = new HashMap<>();

    /* renamed from: d */
    private static C8388a f20465d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f20466e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20467f;

    /* renamed from: g */
    private String f20468g;

    /* renamed from: h */
    private String f20469h;

    /* renamed from: i */
    private int f20470i = 0;

    /* renamed from: j */
    private JSONObject f20471j;

    /* renamed from: k */
    private int f20472k;

    /* renamed from: l */
    private boolean f20473l = false;

    /* renamed from: m */
    private int f20474m;

    /* renamed from: n */
    private WeakReference<Context> f20475n;

    /* renamed from: o */
    private WeakReference<Activity> f20476o;

    /* renamed from: p */
    private String f20477p;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$b */
    /* compiled from: MBSDKContext */
    public interface C8394b {
    }

    /* renamed from: a */
    public final WeakReference<Activity> mo56896a() {
        return this.f20476o;
    }

    /* renamed from: a */
    public final void mo56901a(WeakReference<Activity> weakReference) {
        this.f20476o = weakReference;
    }

    /* renamed from: a */
    public final void mo56897a(int i) {
        this.f20472k = i;
    }

    /* renamed from: b */
    public final String mo56903b() {
        try {
            if (this.f20466e != null) {
                return this.f20466e.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final Context mo56907c() {
        WeakReference<Context> weakReference = this.f20475n;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: a */
    public final void mo56898a(Context context) {
        this.f20475n = new WeakReference<>(context);
    }

    /* renamed from: d */
    public final void mo56910d() {
        try {
            if (this.f20475n != null) {
                this.f20475n.clear();
            }
        } catch (Throwable th) {
            C8672v.m24878d(f20462a, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo56900a(String str) {
        try {
            this.f20477p = str;
            if (!TextUtils.isEmpty(str) && this.f20466e != null) {
                C8614ab.m24712a(this.f20466e, "applicationIds", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C8388a() {
    }

    /* renamed from: e */
    public static synchronized C8388a m23845e() {
        C8388a aVar;
        synchronized (C8388a.class) {
            if (f20465d == null) {
                f20465d = new C8388a();
            }
            aVar = f20465d;
        }
        return aVar;
    }

    /* renamed from: f */
    public final int mo56912f() {
        return this.f20474m;
    }

    /* renamed from: b */
    public final void mo56904b(int i) {
        this.f20474m = i;
    }

    /* renamed from: a */
    public final void mo56899a(C8394b bVar, final Handler handler) {
        if (!this.f20473l) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f20471j = jSONObject;
                jSONObject.put("webgl", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Object b = C8614ab.m24713b(this.f20466e, "ga_id", "-1");
                if (b != null && (b instanceof String)) {
                    String str = (String) b;
                    if (C8616ad.m24718b(str) && !"-1".equals(str) && C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                        C8660r.m24815c(str);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new Thread(new Runnable() {
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0031 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r3 = this;
                        com.mbridge.msdk.foundation.controller.authoritycontroller.a r0 = com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a.m23879a()
                        java.lang.String r1 = "authority_device_id"
                        boolean r0 = r0.mo56941a((java.lang.String) r1)
                        if (r0 == 0) goto L_0x007c
                        java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                        java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        android.content.Context r0 = r0.f20466e     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r1 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.tools.C8660r.m24815c((java.lang.String) r1)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.C8388a.m23843a((com.mbridge.msdk.foundation.controller.C8388a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        goto L_0x0052
                    L_0x002c:
                        r0 = move-exception
                        r0.printStackTrace()
                        goto L_0x0052
                    L_0x0031:
                        com.mbridge.msdk.foundation.controller.a$a r0 = new com.mbridge.msdk.foundation.controller.a$a     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x0052 }
                        r0.<init>()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x0052 }
                        android.content.Context r1 = r1.f20466e     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a$a$a r0 = r0.mo56920a(r1)     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r1 = r0.mo56921a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.tools.C8660r.m24815c((java.lang.String) r1)     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r0 = r0.mo56921a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.C8388a.m23843a((com.mbridge.msdk.foundation.controller.C8388a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0052 }
                    L_0x0052:
                        r0 = 0
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        android.content.Context r1 = r1.f20466e     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        java.lang.String r2 = "com.android.vending"
                        android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        if (r1 == 0) goto L_0x0069
                        r1 = 1
                        goto L_0x006a
                    L_0x0069:
                        r1 = 2
                    L_0x006a:
                        com.mbridge.msdk.foundation.tools.C8660r.m24810b((int) r1)     // Catch:{ NameNotFoundException -> 0x0079, all -> 0x006e }
                        goto L_0x007c
                    L_0x006e:
                        r0 = move-exception
                        java.lang.String r1 = com.mbridge.msdk.foundation.controller.C8388a.f20462a
                        java.lang.String r0 = r0.getMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
                        goto L_0x007c
                    L_0x0079:
                        com.mbridge.msdk.foundation.tools.C8660r.m24810b((int) r0)
                    L_0x007c:
                        com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x00a6 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00a6 }
                        java.lang.String r1 = r1.mo56914h()     // Catch:{ Exception -> 0x00a6 }
                        com.mbridge.msdk.c.a r0 = r0.mo16286b(r1)     // Catch:{ Exception -> 0x00a6 }
                        if (r0 != 0) goto L_0x0096
                        com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x00a6 }
                        com.mbridge.msdk.c.a r0 = r0.mo16285b()     // Catch:{ Exception -> 0x00a6 }
                    L_0x0096:
                        android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x00a6 }
                        r1.obj = r0     // Catch:{ Exception -> 0x00a6 }
                        r0 = 9
                        r1.what = r0     // Catch:{ Exception -> 0x00a6 }
                        android.os.Handler r0 = r4     // Catch:{ Exception -> 0x00a6 }
                        r0.sendMessage(r1)     // Catch:{ Exception -> 0x00a6 }
                        goto L_0x00aa
                    L_0x00a6:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x00aa:
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x00c3 }
                        android.content.Context r0 = r0.f20466e     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.foundation.tools.C8660r.m24811b((android.content.Context) r0)     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x00c3 }
                        android.content.Context r0 = r0.f20466e     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.this     // Catch:{ Exception -> 0x00c3 }
                        java.lang.String r1 = r1.f20467f     // Catch:{ Exception -> 0x00c3 }
                        com.mbridge.msdk.p078c.C2445b.m6021a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x00c3 }
                        goto L_0x00c7
                    L_0x00c3:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x00c7:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C8388a.C83891.run():void");
                }
            }).start();
        }
    }

    /* renamed from: g */
    public final Context mo56913g() {
        return this.f20466e;
    }

    /* renamed from: b */
    public final void mo56905b(Context context) {
        this.f20466e = context;
    }

    /* renamed from: h */
    public final String mo56914h() {
        try {
            if (!TextUtils.isEmpty(this.f20467f)) {
                return this.f20467f;
            }
            if (this.f20466e != null) {
                return (String) C8614ab.m24713b(this.f20466e, "sp_appId", "");
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo56906b(String str) {
        try {
            this.f20467f = str;
            if (!TextUtils.isEmpty(str) && this.f20466e != null) {
                C8614ab.m24712a(this.f20466e, "sp_appId", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public final String mo56915i() {
        if (!TextUtils.isEmpty(this.f20469h)) {
            return this.f20469h;
        }
        Context context = this.f20466e;
        if (context != null) {
            return (String) C8614ab.m24713b(context, "sp_wx_appKey", "");
        }
        return null;
    }

    /* renamed from: c */
    public final void mo56909c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20469h = str;
                if (this.f20466e != null) {
                    C8614ab.m24712a(this.f20466e, "sp_wx_appKey", str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public final String mo56916j() {
        if (!TextUtils.isEmpty(this.f20468g)) {
            return this.f20468g;
        }
        Context context = this.f20466e;
        if (context != null) {
            return (String) C8614ab.m24713b(context, "sp_appKey", "");
        }
        return null;
    }

    /* renamed from: d */
    public final void mo56911d(String str) {
        try {
            this.f20468g = str;
            if (!TextUtils.isEmpty(str) && this.f20466e != null) {
                C8614ab.m24712a(this.f20466e, "sp_appKey", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a */
    /* compiled from: MBSDKContext */
    public class C8390a {
        public C8390a() {
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$a */
        /* compiled from: MBSDKContext */
        public final class C8391a {

            /* renamed from: b */
            private final String f20482b;

            /* renamed from: c */
            private final boolean f20483c;

            C8391a(String str, boolean z) {
                this.f20482b = str;
                this.f20483c = z;
            }

            /* renamed from: a */
            public final String mo56921a() {
                return this.f20482b;
            }
        }

        /* renamed from: a */
        public final C8391a mo56920a(Context context) throws Exception {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    C8392b bVar = new C8392b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, bVar, 1)) {
                        try {
                            C8393c cVar = new C8393c(bVar.mo56922a());
                            C8391a aVar = new C8391a(cVar.mo56925a(), cVar.mo56926a(true));
                            context.unbindService(bVar);
                            return aVar;
                        } catch (Exception e) {
                            throw e;
                        } catch (Throwable th) {
                            context.unbindService(bVar);
                            throw th;
                        }
                    } else {
                        throw new IOException("Google Play connection failed");
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$b */
        /* compiled from: MBSDKContext */
        private final class C8392b implements ServiceConnection {

            /* renamed from: a */
            boolean f20484a;

            /* renamed from: c */
            private final LinkedBlockingQueue<IBinder> f20486c;

            public final void onServiceDisconnected(ComponentName componentName) {
            }

            private C8392b() {
                this.f20484a = false;
                this.f20486c = new LinkedBlockingQueue<>(1);
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    this.f20486c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }

            /* renamed from: a */
            public final IBinder mo56922a() throws InterruptedException {
                if (!this.f20484a) {
                    this.f20484a = true;
                    return this.f20486c.take();
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$c */
        /* compiled from: MBSDKContext */
        private final class C8393c implements IInterface {

            /* renamed from: b */
            private IBinder f20488b;

            public C8393c(IBinder iBinder) {
                this.f20488b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f20488b;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public final String mo56925a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f20488b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* renamed from: a */
            public final boolean mo56926a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z2 = false;
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f20488b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z2;
            }
        }
    }

    /* renamed from: k */
    public final int mo56917k() {
        return this.f20470i;
    }

    /* renamed from: c */
    public final void mo56908c(int i) {
        this.f20470i = i;
    }

    /* renamed from: l */
    public final JSONObject mo56918l() {
        return this.f20471j;
    }

    /* renamed from: a */
    public final void mo56902a(JSONObject jSONObject) {
        this.f20471j = jSONObject;
    }

    /* renamed from: a */
    static /* synthetic */ void m23843a(C8388a aVar, String str) {
        try {
            if (C8616ad.m24718b(str)) {
                C8614ab.m24712a(aVar.f20466e, "ga_id", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
