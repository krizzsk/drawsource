package com.bytedance.sdk.openadsdk.p176j;

/* renamed from: com.bytedance.sdk.openadsdk.j.f */
/* compiled from: PlayableLog */
public class C3826f {

    /* renamed from: a */
    private static C3827a f9813a;

    /* renamed from: com.bytedance.sdk.openadsdk.j.f$a */
    /* compiled from: PlayableLog */
    public interface C3827a {
        /* renamed from: a */
        void mo18472a(String str, String str2);

        /* renamed from: a */
        void mo18473a(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m12455a(C3827a aVar) {
        f9813a = aVar;
    }

    /* renamed from: a */
    public static boolean m12458a() {
        return f9813a != null;
    }

    /* renamed from: a */
    public static void m12456a(String str, String str2) {
        C3827a aVar = f9813a;
        if (aVar != null) {
            aVar.mo18472a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m12457a(String str, String str2, Throwable th) {
        if (f9813a != null) {
            if (th == null) {
                th = new Throwable();
            }
            f9813a.mo18473a(str, str2, th);
        }
    }
}
