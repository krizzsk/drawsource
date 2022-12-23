package com.saygames.saypromo.p378a;

import kotlin.Unit;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.j3 */
public final class C10631j3 implements C10623i3 {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f26226d = {C10532W4.m30277a(C10631j3.class, "androidId", "getAndroidId()Lcom/saygames/saypromo/common/AndroidId;", 0)};

    /* renamed from: a */
    private final C10484P4 f26227a;

    /* renamed from: b */
    private final C10717u4 f26228b = new C10717u4();

    /* renamed from: c */
    private String f26229c;

    C10631j3(C10491Q4 q4) {
        this.f26227a = q4;
    }

    /* renamed from: a */
    private final C10500S0 m30463a() {
        C10484P4 p4 = this.f26227a;
        KProperty kProperty = f26226d[0];
        return (C10500S0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65485a(String str) {
        synchronized (this.f26228b.f26352a) {
            this.f26229c = str;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final String mo65486b() {
        String str;
        synchronized (this.f26228b.f26352a) {
            str = this.f26229c;
            if (str == null && (str = C10485P5.m30223b(((C10507T0) m30463a()).mo65384b())) == null) {
                str = "null";
            }
        }
        return str;
    }
}
