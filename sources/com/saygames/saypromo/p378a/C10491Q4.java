package com.saygames.saypromo.p378a;

import kotlin.jvm.functions.Function0;

/* renamed from: com.saygames.saypromo.a.Q4 */
public final class C10491Q4 implements C10484P4 {

    /* renamed from: a */
    private final C10717u4 f25952a = new C10717u4();

    /* renamed from: b */
    private Object f25953b;

    /* renamed from: c */
    final /* synthetic */ Function0 f25954c;

    C10491Q4(Function0 function0) {
        this.f25954c = function0;
    }

    /* renamed from: a */
    public final Object mo65365a() {
        Object obj;
        Object obj2 = this.f25953b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this.f25952a.f26352a) {
            obj = this.f25953b;
            if (obj == null) {
                obj = this.f25954c.invoke();
                this.f25953b = obj;
            }
        }
        return obj;
    }
}
