package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i0 */
public final class C5103i0 implements C5089g1 {

    /* renamed from: b */
    public static final C5143p0 f13574b = new C5104a();

    /* renamed from: a */
    public final C5143p0 f13575a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$a */
    public class C5104a implements C5143p0 {
        /* renamed from: a */
        public boolean mo25930a(Class<?> cls) {
            return false;
        }

        /* renamed from: b */
        public C5140o0 mo25931b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$b */
    public static class C5105b implements C5143p0 {

        /* renamed from: a */
        public C5143p0[] f13576a;

        public C5105b(C5143p0... p0VarArr) {
            this.f13576a = p0VarArr;
        }

        /* renamed from: a */
        public boolean mo25930a(Class<?> cls) {
            for (C5143p0 a : this.f13576a) {
                if (a.mo25930a(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C5140o0 mo25931b(Class<?> cls) {
            for (C5143p0 p0Var : this.f13576a) {
                if (p0Var.mo25930a(cls)) {
                    return p0Var.mo25931b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public C5103i0() {
        this(m15549a());
    }

    /* renamed from: a */
    public static C5143p0 m15549a() {
        C5143p0 p0Var;
        C5143p0[] p0VarArr = new C5143p0[2];
        p0VarArr[0] = C5190x.f13756a;
        try {
            p0Var = (C5143p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f13574b;
        }
        p0VarArr[1] = p0Var;
        return new C5105b(p0VarArr);
    }

    public C5103i0(C5143p0 p0Var) {
        this.f13575a = (C5143p0) C5194z.m16182a(p0Var, "messageInfoFactory");
    }
}
