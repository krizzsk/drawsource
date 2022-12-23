package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.U3 */
public final class C10517U3 implements C10510T3 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26000b = {C10532W4.m30277a(C10517U3.class, "cacheDirectoryManager", "getCacheDirectoryManager()Lcom/saygames/saypromo/manager/CacheDirectoryManager;", 0)};

    /* renamed from: a */
    private final C10484P4 f26001a;

    C10517U3(C10491Q4 q4) {
        this.f26001a = q4;
    }

    /* renamed from: a */
    private final C10637k1 m30269a() {
        C10484P4 p4 = this.f26001a;
        KProperty kProperty = f26000b[0];
        return (C10637k1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final Unit mo65390a(String str) {
        File c = ((C10661n1) m30269a()).mo65505c();
        new File(c, str + ".html").delete();
        new File(c, str + ".mp4").delete();
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final File mo65391b(String str) {
        File c = ((C10661n1) m30269a()).mo65505c();
        return new File(c, str + ".html");
    }

    /* renamed from: c */
    public final File mo65392c(String str) {
        File c = ((C10661n1) m30269a()).mo65505c();
        return new File(c, str + ".mp4");
    }
}
