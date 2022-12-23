package com.bytedance.sdk.openadsdk.p165d;

import android.content.Context;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import com.bytedance.sdk.component.p108d.C2759b;
import com.bytedance.sdk.component.p108d.C2807d;
import com.bytedance.sdk.component.p108d.C2823e;
import com.bytedance.sdk.component.p108d.C2827i;
import com.bytedance.sdk.component.p108d.C2830l;
import com.bytedance.sdk.component.p108d.C2831m;
import com.bytedance.sdk.component.p108d.C2836r;
import com.bytedance.sdk.component.p108d.p110b.C2763d;
import com.bytedance.sdk.component.p108d.p110b.C2764e;
import com.bytedance.sdk.component.p108d.p111c.C2788b;
import com.bytedance.sdk.component.p108d.p111c.C2801e;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2767a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.p178l.C3896v;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.d.a */
/* compiled from: ImageLoaderWrapper */
public class C3707a {
    /* renamed from: a */
    public static C2827i m12123a(String str) {
        return C3708a.m12135b(str);
    }

    /* renamed from: a */
    public static C2827i m12122a(C3417k kVar) {
        return C3708a.m12134b(kVar);
    }

    /* renamed from: a */
    public static InputStream m12125a(String str, String str2) {
        return C3708a.m12136b(str, str2);
    }

    /* renamed from: a */
    public static boolean m12126a(String str, String str2, String str3) {
        return C3708a.m12137b(str, str2, str3);
    }

    /* renamed from: a */
    public static C2831m m12124a() {
        return C3708a.f9614a;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.d.a$a */
    /* compiled from: ImageLoaderWrapper */
    private static final class C3708a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C2831m f9614a = m12131a(C3513m.m10963a());

        /* renamed from: a */
        private static C2831m m12131a(Context context) {
            return C2788b.m7647a(context, (C2830l) new C2801e.C2803a().mo17660a((C2759b) new C2767a(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040, new File(CacheDirFactory.getImageCacheDir()))).mo17662a(C2882e.m8033a(5)).mo17661a((C2807d) new C2807d() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.Closeable} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.component.p108d.p110b.C2763d mo17532a(com.bytedance.sdk.component.p108d.C2823e r7) {
                    /*
                        r6 = this;
                        com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.p174i.C3792d.m12395a()
                        com.bytedance.sdk.component.e.a r0 = r0.mo20615b()
                        com.bytedance.sdk.component.b.a.i r0 = r0.mo17686e()
                        com.bytedance.sdk.component.b.a.k$a r1 = new com.bytedance.sdk.component.b.a.k$a
                        r1.<init>()
                        java.lang.String r2 = r7.mo17534a()
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo17516a((java.lang.String) r2)
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo17511a()
                        com.bytedance.sdk.component.b.a.k r1 = r1.mo17519b()
                        boolean r2 = r7.mo17536c()
                        r3 = 0
                        if (r2 == 0) goto L_0x002e
                        com.bytedance.sdk.component.d.b.e r2 = new com.bytedance.sdk.component.d.b.e
                        r2.<init>()
                        goto L_0x002f
                    L_0x002e:
                        r2 = r3
                    L_0x002f:
                        if (r2 == 0) goto L_0x0038
                        long r4 = java.lang.System.currentTimeMillis()
                        r2.mo17544a(r4)
                    L_0x0038:
                        com.bytedance.sdk.component.b.a.b r0 = r0.mo17398a(r1)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.m r3 = r0.mo17389a()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x0049
                        long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo17545b(r0)     // Catch:{ all -> 0x0070 }
                    L_0x0049:
                        java.util.Map r7 = r6.m12139a((com.bytedance.sdk.component.p108d.C2823e) r7, (com.bytedance.sdk.component.p102b.p103a.C2750m) r3)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.n r0 = r3.mo17423f()     // Catch:{ all -> 0x0070 }
                        byte[] r0 = r0.mo17431d()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x005e
                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo17546c(r4)     // Catch:{ all -> 0x0070 }
                    L_0x005e:
                        com.bytedance.sdk.component.d.b.d r1 = new com.bytedance.sdk.component.d.b.d     // Catch:{ all -> 0x0070 }
                        int r4 = r3.mo17419c()     // Catch:{ all -> 0x0070 }
                        java.lang.String r5 = ""
                        r1.<init>(r4, r0, r5, r7)     // Catch:{ all -> 0x0070 }
                        r1.mo17538a(r2)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r3)
                        return r1
                    L_0x0070:
                        r7 = move-exception
                        com.bytedance.sdk.component.d.b.d r7 = r6.m12138a((com.bytedance.sdk.component.p108d.p110b.C2764e) r2, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0079 }
                        com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r3)
                        return r7
                    L_0x0079:
                        r7 = move-exception
                        com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r3)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p165d.C3707a.C3708a.C37091.mo17532a(com.bytedance.sdk.component.d.e):com.bytedance.sdk.component.d.b.d");
                }

                /* renamed from: a */
                private Map<String, String> m12139a(C2823e eVar, C2750m mVar) {
                    if (!eVar.mo17535b()) {
                        return null;
                    }
                    C2736e g = mVar.mo17424g();
                    HashMap hashMap = new HashMap();
                    int a = g.mo17475a();
                    for (int i = 0; i < a; i++) {
                        String a2 = g.mo17476a(i);
                        String b = g.mo17477b(i);
                        if (a2 != null) {
                            hashMap.put(a2, b);
                        }
                    }
                    return hashMap;
                }

                /* renamed from: a */
                private C2763d m12138a(C2764e eVar, Throwable th) {
                    C2905l.m8117d("ImageLoaderWrapper", th.getMessage());
                    if (eVar != null) {
                        eVar.mo17546c(System.currentTimeMillis());
                    }
                    C2763d dVar = new C2763d(0, th, "net failed");
                    dVar.mo17538a(eVar);
                    return dVar;
                }
            }).mo17663a());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2827i m12135b(String str) {
            return m12127a(f9614a.mo17599a(str));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2827i m12134b(C3417k kVar) {
            return m12127a(f9614a.mo17599a(kVar.mo19468a()).mo17634a(kVar.mo19472b()).mo17641b(kVar.mo19475c()).mo17639a(kVar.mo19479g()));
        }

        /* renamed from: a */
        private static C2827i m12127a(C2827i iVar) {
            return C3896v.m12741a() ? iVar.mo17637a((C2836r) new C3710b()) : iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static InputStream m12136b(String str, String str2) {
            return f9614a.mo17600a(str, str2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m12137b(String str, String str2, String str3) {
            return f9614a.mo17601a(str, str2, str3);
        }
    }
}
