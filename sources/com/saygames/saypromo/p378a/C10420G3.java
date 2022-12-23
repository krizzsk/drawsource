package com.saygames.saypromo.p378a;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.G3 */
public final class C10420G3 implements C10413F3 {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f25813e;

    /* renamed from: a */
    private final C10484P4 f25814a;

    /* renamed from: b */
    private final C10484P4 f25815b;

    /* renamed from: c */
    private final C10484P4 f25816c;

    /* renamed from: d */
    private AtomicLong f25817d = new AtomicLong(0);

    static {
        Class<C10420G3> cls = C10420G3.class;
        f25813e = new KProperty[]{C10532W4.m30277a(cls, "debugFlag", "getDebugFlag()Lcom/saygames/saypromo/common/DebugFlag;", 0), C10532W4.m30277a(cls, "eventsEngine", "getEventsEngine()Lcom/saygames/saypromo/common/EventsEngine;", 0), C10532W4.m30277a(cls, "urlManager", "getUrlManager()Lcom/saygames/saypromo/manager/UrlManager;", 0)};
    }

    C10420G3(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43) {
        this.f25814a = q4;
        this.f25815b = q42;
        this.f25816c = q43;
    }

    /* renamed from: a */
    private final C10598f2 m30139a() {
        C10484P4 p4 = this.f25814a;
        KProperty kProperty = f25813e[0];
        return (C10598f2) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10385B3 m30140b() {
        C10484P4 p4 = this.f25815b;
        KProperty kProperty = f25813e[1];
        return (C10385B3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10505S5 m30141c() {
        C10484P4 p4 = this.f25816c;
        KProperty kProperty = f25813e[2];
        return (C10505S5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65305a(C10498R5 r5) {
        ((C10399D3) m30140b()).mo65276a(r5);
    }

    /* renamed from: a */
    public final void mo65306a(String str, String str2, String str3, String str4, long j, String str5) {
        if (((C10606g2) m30139a()).mo65460a()) {
            ((C10399D3) m30140b()).mo65276a(((C10512T5) m30141c()).mo65388a(str, str2, str3, str4, str5, this.f25817d.incrementAndGet(), Duration.m35162getInWholeMillisecondsimpl(j)));
        }
    }
}
