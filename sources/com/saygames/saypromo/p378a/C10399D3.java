package com.saygames.saypromo.p378a;

import java.util.LinkedList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.D3 */
public final class C10399D3 implements C10385B3 {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f25774e;

    /* renamed from: a */
    private final C10484P4 f25775a;

    /* renamed from: b */
    private final C10484P4 f25776b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LinkedList f25777c = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10717u4 f25778d = new C10717u4();

    static {
        Class<C10399D3> cls = C10399D3.class;
        f25774e = new KProperty[]{C10532W4.m30277a(cls, "downloadManager", "getDownloadManager()Lcom/saygames/saypromo/manager/DownloadManager;", 0), C10532W4.m30277a(cls, "taskScopeFactory", "getTaskScopeFactory()Lcom/saygames/saypromo/common/TaskScopeFactory;", 0)};
    }

    C10399D3(C10491Q4 q4, C10491Q4 q42) {
        this.f25775a = q4;
        this.f25776b = q42;
        ((C10725v5) m30106b()).mo65546a().mo65246a(new C10392C3(this, (Continuation) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10679p3 m30103a() {
        C10484P4 p4 = this.f25775a;
        KProperty kProperty = f25774e[0];
        return (C10679p3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10718u5 m30106b() {
        C10484P4 p4 = this.f25776b;
        KProperty kProperty = f25774e[1];
        return (C10718u5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65276a(C10498R5 r5) {
        synchronized (this.f25778d.f26352a) {
            this.f25777c.add(r5);
            Unit unit = Unit.INSTANCE;
        }
    }
}
