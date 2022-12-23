package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoTokenCallback;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.N5 */
public final class C10471N5 implements C10457L5 {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f25905d;

    /* renamed from: a */
    private final C10484P4 f25906a;

    /* renamed from: b */
    private final C10484P4 f25907b;

    /* renamed from: c */
    private final C10380A5 f25908c = ((C10725v5) m30207a()).mo65546a();

    static {
        Class<C10471N5> cls = C10471N5.class;
        f25905d = new KProperty[]{C10532W4.m30277a(cls, "taskScopeFactory", "getTaskScopeFactory()Lcom/saygames/saypromo/common/TaskScopeFactory;", 0), C10532W4.m30277a(cls, "tokenGenerator", "getTokenGenerator()Lcom/saygames/saypromo/common/TokenGenerator;", 0)};
    }

    C10471N5(C10491Q4 q4, C10491Q4 q42) {
        this.f25906a = q4;
        this.f25907b = q42;
    }

    /* renamed from: a */
    private final C10718u5 m30207a() {
        C10484P4 p4 = this.f25906a;
        KProperty kProperty = f25905d[0];
        return (C10718u5) ((C10491Q4) p4).mo65365a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C10429H5 m30208b() {
        C10484P4 p4 = this.f25907b;
        KProperty kProperty = f25905d[1];
        return (C10429H5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65359a(String str, String str2, SayPromoTokenCallback sayPromoTokenCallback) {
        this.f25908c.mo65246a(new C10464M5(this, str, str2, sayPromoTokenCallback, (Continuation) null));
    }
}
