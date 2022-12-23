package com.inmobi.media;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.MessageDigest;

/* renamed from: com.inmobi.media.iz */
/* compiled from: UidHelper */
public class C6232iz {

    /* renamed from: a */
    private static final String f15711a = C6232iz.class.getSimpleName();

    /* renamed from: b */
    private static C6231iy f15712b;

    /* renamed from: com.inmobi.media.iz$a */
    /* compiled from: UidHelper */
    static class C6233a {

        /* renamed from: a */
        static final C6232iz f15713a = new C6232iz((byte) 0);
    }

    /* synthetic */ C6232iz(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6232iz m18518a() {
        return C6233a.f15713a;
    }

    private C6232iz() {
    }

    /* renamed from: b */
    public void mo35443b() {
        try {
            m18522i();
            mo35444c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo35444c() {
        try {
            C6231iy e = mo35445e();
            if (e != null) {
                String b = e.mo35442b();
                if (b != null) {
                    C6195ic.m18378a((byte) 2, f15711a, "Publisher device Id is ".concat(String.valueOf(b)));
                    return;
                }
                return;
            }
            String d = m18520d();
            String str = f15711a;
            C6195ic.m18378a((byte) 2, str, "Publisher device Id is " + m18519a(d, "SHA-1"));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static String m18519a(String str, String str2) {
        if (str == null) {
            return "TEST_EMULATOR";
        }
        try {
            if ("".equals(str.trim())) {
                return "TEST_EMULATOR";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    static String m18520d() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return "";
        }
        try {
            String string = Settings.Secure.getString(c.getContentResolver(), "android_id");
            return string == null ? Settings.System.getString(c.getContentResolver(), "android_id") : string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public C6231iy mo35445e() {
        return f15712b;
    }

    /* renamed from: f */
    public void mo35446f() {
        if (f15712b == null) {
            return;
        }
        if (C6221ip.m18478b()) {
            f15712b.f15709a = null;
        } else if (f15712b.mo35442b() == null) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    C6232iz.this.m18522i();
                }
            });
        }
    }

    /* renamed from: h */
    private static boolean m18521h() {
        try {
            AdvertisingIdClient.class.getName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18522i() {
        /*
            r3 = this;
            android.content.Context r0 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            com.inmobi.media.iy r1 = new com.inmobi.media.iy     // Catch:{ Exception -> 0x0033 }
            r1.<init>()     // Catch:{ Exception -> 0x0033 }
            boolean r2 = m18521h()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{  }
            java.lang.String r2 = r0.getId()     // Catch:{  }
            r1.f15709a = r2     // Catch:{  }
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch:{  }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{  }
            r1.mo35441a(r0)     // Catch:{  }
            f15712b = r1     // Catch:{  }
            boolean r0 = com.inmobi.media.C6221ip.m18478b()     // Catch:{  }
            if (r0 == 0) goto L_0x0033
            com.inmobi.media.iy r0 = f15712b     // Catch:{  }
            r1 = 0
            r0.f15709a = r1     // Catch:{  }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6232iz.m18522i():void");
    }

    /* renamed from: g */
    public Boolean mo35447g() {
        C6231iy e = m18518a().mo35445e();
        if (e == null) {
            return null;
        }
        return e.mo35440a();
    }
}
