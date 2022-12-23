package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p128b.C3086c;
import com.bytedance.sdk.openadsdk.p128b.C3089d;
import com.bytedance.sdk.openadsdk.p128b.C3093f;
import com.bytedance.sdk.openadsdk.p128b.C3094g;
import com.bytedance.sdk.openadsdk.p128b.C3095h;
import com.bytedance.sdk.openadsdk.p128b.C3114q;
import com.bytedance.sdk.openadsdk.p128b.C3115r;
import com.bytedance.sdk.openadsdk.p128b.C3116s;
import com.bytedance.sdk.openadsdk.p128b.C3117t;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3773a;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3779d;
import com.bytedance.sdk.openadsdk.p177k.C3840a;
import com.bytedance.sdk.openadsdk.p177k.C3841b;
import com.bytedance.sdk.openadsdk.p177k.C3845c;
import com.bytedance.sdk.openadsdk.p177k.C3850h;
import com.bytedance.sdk.openadsdk.p178l.C3884m;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.core.m */
/* compiled from: InternalContainer */
public class C3513m {

    /* renamed from: a */
    public static int f8794a = 8;

    /* renamed from: b */
    private static volatile C3086c<C3060a> f8795b;

    /* renamed from: c */
    private static volatile C3086c<C3775c.C3778a> f8796c;

    /* renamed from: d */
    private static volatile C3086c<C3775c.C3778a> f8797d;

    /* renamed from: e */
    private static volatile C3516n<C3060a> f8798e;

    /* renamed from: f */
    private static volatile C3840a f8799f;

    /* renamed from: g */
    private static volatile C3773a f8800g;

    /* renamed from: h */
    private static volatile Context f8801h;

    /* renamed from: i */
    private static volatile C3471f f8802i;

    /* renamed from: a */
    public static synchronized Context m10963a() {
        Context context;
        synchronized (C3513m.class) {
            if (f8801h == null) {
                m10965a((Context) null);
            }
            context = f8801h;
        }
        return context;
    }

    /* renamed from: a */
    public static C3086c<C3775c.C3778a> m10964a(String str, String str2, boolean z) {
        C3093f fVar;
        C3095h.C3098c cVar;
        if (z) {
            fVar = new C3116s(f8801h);
            cVar = C3095h.C3098c.m8985a();
        } else {
            cVar = C3095h.C3098c.m8986b();
            fVar = new C3114q(f8801h);
        }
        C3095h.C3097b b = m10966b(f8801h);
        return new C3086c(fVar, (C3516n) null, cVar, b, new C3117t(str, str2, fVar, (C3516n) null, cVar, b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m10965a(android.content.Context r2) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.core.m> r0 = com.bytedance.sdk.openadsdk.core.C3513m.class
            monitor-enter(r0)
            android.content.Context r1 = f8801h     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C3513m.C3515a.m10977a()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C3513m.C3515a.m10977a()     // Catch:{ all -> 0x0019 }
            f8801h = r1     // Catch:{ all -> 0x0019 }
            android.content.Context r1 = f8801h     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)
            return
        L_0x0019:
            if (r2 == 0) goto L_0x002f
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0031 }
            f8801h = r2     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = m10963a()     // Catch:{ all -> 0x0031 }
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)     // Catch:{ all -> 0x0031 }
            int r2 = r2.getScaledTouchSlop()     // Catch:{ all -> 0x0031 }
            f8794a = r2     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)
            return
        L_0x0031:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3513m.m10965a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C3095h.C3097b m10966b(final Context context) {
        return new C3095h.C3097b() {
            /* renamed from: a */
            public boolean mo18678a() {
                Context context = context;
                if (context == null) {
                    context = C3513m.m10963a();
                }
                return C3884m.m12674b(context);
            }
        };
    }

    /* renamed from: b */
    public static void m10967b() {
        f8795b = null;
        f8799f = null;
        f8800g = null;
    }

    /* renamed from: c */
    public static C3086c<C3060a> m10968c() {
        Class<C3513m> cls = C3513m.class;
        if (!C3470e.m10697a()) {
            return C3086c.m8870c();
        }
        if (f8795b == null) {
            synchronized (cls) {
                if (f8795b == null) {
                    f8795b = C3948b.m12959c() ? new C3089d() : new C3086c<>(new C3094g(f8801h), m10971f(), m10975j(), m10966b(f8801h));
                }
            }
        }
        return f8795b;
    }

    /* renamed from: d */
    public static C3086c<C3775c.C3778a> m10969d() {
        Class<C3513m> cls = C3513m.class;
        if (!C3470e.m10697a()) {
            return C3086c.m8871d();
        }
        if (f8797d == null) {
            synchronized (cls) {
                if (f8797d == null) {
                    f8797d = C3948b.m12959c() ? new C3115r(false) : m10964a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                }
            }
        }
        return f8797d;
    }

    /* renamed from: e */
    public static C3086c<C3775c.C3778a> m10970e() {
        Class<C3513m> cls = C3513m.class;
        if (!C3470e.m10697a()) {
            return C3086c.m8871d();
        }
        if (f8796c == null) {
            synchronized (cls) {
                if (f8796c == null) {
                    f8796c = C3948b.m12959c() ? new C3115r(true) : m10964a("ttad_bk_stats", "AdStatsEventThread", true);
                }
            }
        }
        return f8796c;
    }

    /* renamed from: f */
    public static C3516n<C3060a> m10971f() {
        Class<C3513m> cls = C3513m.class;
        if (f8798e == null) {
            synchronized (cls) {
                if (f8798e == null) {
                    f8798e = new C3562o(f8801h);
                }
            }
        }
        return f8798e;
    }

    /* renamed from: g */
    public static C3840a m10972g() {
        if (!C3470e.m10697a()) {
            return C3841b.m12545d();
        }
        if (f8799f == null) {
            Class<C3840a> cls = C3840a.class;
            synchronized (C3840a.class) {
                try {
                    if (f8799f == null) {
                        f8799f = C3948b.m12959c() ? new C3845c() : new C3841b(f8801h, new C3850h(f8801h));
                    }
                    Class<C3840a> cls2 = C3840a.class;
                    Class<C3840a> cls3 = C3840a.class;
                } catch (Throwable th) {
                    Class<C3840a> cls4 = C3840a.class;
                    Class<C3840a> cls5 = C3840a.class;
                    throw th;
                }
            }
        }
        return f8799f;
    }

    /* renamed from: h */
    public static C3471f m10973h() {
        if (f8802i == null) {
            Class<C3471f> cls = C3471f.class;
            synchronized (C3471f.class) {
                try {
                    if (f8802i == null) {
                        f8802i = new C3471f();
                    }
                    Class<C3471f> cls2 = C3471f.class;
                } catch (Throwable th) {
                    Class<C3471f> cls3 = C3471f.class;
                    Class<C3471f> cls4 = C3471f.class;
                    throw th;
                }
            }
        }
        return f8802i;
    }

    /* renamed from: i */
    public static C3773a m10974i() {
        if (!C3470e.m10697a()) {
            return C3775c.m12334c();
        }
        if (f8800g == null) {
            Class<C3775c> cls = C3775c.class;
            synchronized (C3775c.class) {
                try {
                    if (f8800g == null) {
                        f8800g = C3948b.m12959c() ? new C3779d() : new C3775c();
                    }
                    Class<C3775c> cls2 = C3775c.class;
                    Class<C3775c> cls3 = C3775c.class;
                } catch (Throwable th) {
                    Class<C3775c> cls4 = C3775c.class;
                    Class<C3775c> cls5 = C3775c.class;
                    throw th;
                }
            }
        }
        return f8800g;
    }

    /* renamed from: j */
    private static C3095h.C3098c m10975j() {
        return C3095h.C3098c.m8985a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1659536876602dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(java.lang.String):java.lang.String");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.m$a */
    /* compiled from: InternalContainer */
    private static class C3515a {

        /* renamed from: a */
        private static volatile Application f8804a;

        /* renamed from: a */
        public static Application m10977a() {
            return f8804a;
        }

        static {
            try {
                Object b = m10978b();
                f8804a = (Application) b.getClass().getMethod("getApplication", new Class[0]).invoke(b, new Object[0]);
                C2905l.m8118e("MyApplication", "application get success");
            } catch (Throwable th) {
                C2905l.m8115c("MyApplication", "application get failed", th);
            }
        }

        /* renamed from: b */
        private static Object m10978b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke((Object) null, new Object[0]);
            } catch (Throwable th) {
                C2905l.m8115c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
