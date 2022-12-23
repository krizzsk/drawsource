package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoThrowable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.saygames.saypromo.a.P1 */
public final class C10481P1 implements C10474O1 {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f25923f;

    /* renamed from: a */
    private final C10484P4 f25924a;

    /* renamed from: b */
    private final C10484P4 f25925b;

    /* renamed from: c */
    private final C10484P4 f25926c;

    /* renamed from: d */
    private final C10484P4 f25927d;

    /* renamed from: e */
    private final C10484P4 f25928e;

    static {
        Class<C10481P1> cls = C10481P1.class;
        f25923f = new KProperty[]{C10532W4.m30277a(cls, "closeActionDataMapper", "getCloseActionDataMapper()Lcom/saygames/saypromo/common/CloseActionDataMapper;", 0), C10532W4.m30277a(cls, "closePositionDataMapper", "getClosePositionDataMapper()Lcom/saygames/saypromo/common/ClosePositionDataMapper;", 0), C10532W4.m30277a(cls, "filesManager", "getFilesManager()Lcom/saygames/saypromo/manager/FilesManager;", 0), C10532W4.m30277a(cls, "logoPositionDataMapper", "getLogoPositionDataMapper()Lcom/saygames/saypromo/common/LogoPositionDataMapper;", 0), C10532W4.m30277a(cls, "videoClickDataMapper", "getVideoClickDataMapper()Lcom/saygames/saypromo/common/VideoClickDataMapper;", 0)};
    }

    C10481P1(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43, C10491Q4 q44, C10491Q4 q45) {
        this.f25924a = q4;
        this.f25925b = q42;
        this.f25926c = q43;
        this.f25927d = q44;
        this.f25928e = q45;
    }

    /* renamed from: a */
    private final C10390C1 m30214a(C10404E1 e1, String str) {
        boolean f = e1.mo65287f();
        C10700s1 a = ((C10714u1) m30215a()).mo65544a(e1.mo65288g(), e1.mo65289h());
        C10742y1 a2 = ((C10376A1) m30216b()).mo65244a(e1.mo65284c());
        Duration.Companion companion = Duration.Companion;
        return new C10390C1(f, a, a2, DurationKt.toDuration(e1.mo65283b(), DurationUnit.SECONDS), ((C10517U3) m30217c()).mo65392c(str), ((C10393C4) m30218d()).mo65265a(e1.mo65286e()), C10485P5.m30221a(e1.mo65290i()), ((C10554Z5) m30219e()).mo65408a(e1.mo65282a()), new C10594e6(e1.mo65285d(), e1.mo65291j()), 0);
    }

    /* renamed from: a */
    private final C10707t1 m30215a() {
        C10484P4 p4 = this.f25924a;
        KProperty kProperty = f25923f[0];
        return (C10707t1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10749z1 m30216b() {
        C10484P4 p4 = this.f25925b;
        KProperty kProperty = f25923f[1];
        return (C10749z1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10510T3 m30217c() {
        C10484P4 p4 = this.f25926c;
        KProperty kProperty = f25923f[2];
        return (C10510T3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: d */
    private final C10386B4 m30218d() {
        C10484P4 p4 = this.f25927d;
        KProperty kProperty = f25923f[3];
        return (C10386B4) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: e */
    private final C10547Y5 m30219e() {
        C10484P4 p4 = this.f25928e;
        KProperty kProperty = f25923f[4];
        return (C10547Y5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final C10467N1 mo65362a(C10522V1 v1, String str) {
        if (v1 instanceof C10494R1) {
            C10494R1 r1 = (C10494R1) v1;
            C10390C1 a = m30214a(r1.mo65369a(), str);
            C10411F1 b = r1.mo65370b();
            return new C10446K1(a, new C10397D1(b.mo65298f(), ((C10714u1) m30215a()).mo65544a(b.mo65295c(), b.mo65296d()), ((C10376A1) m30216b()).mo65244a(b.mo65293a()), ((C10517U3) m30217c()).mo65391b(str), ((C10393C4) m30218d()).mo65265a(b.mo65294b()), C10485P5.m30221a(b.mo65297e())));
        } else if (v1 instanceof C10501S1) {
            throw new SayPromoThrowable.Load.Format("Creatives is empty", (Throwable) null);
        } else if (v1 instanceof C10508T1) {
            return new C10453L1(m30214a(((C10508T1) v1).mo65385a(), str));
        } else {
            if (v1 instanceof C10515U1) {
                C10411F1 a2 = ((C10515U1) v1).mo65389a();
                return new C10460M1(new C10397D1(a2.mo65298f(), ((C10714u1) m30215a()).mo65544a(a2.mo65295c(), a2.mo65296d()), ((C10376A1) m30216b()).mo65244a(a2.mo65293a()), ((C10517U3) m30217c()).mo65391b(str), ((C10393C4) m30218d()).mo65265a(a2.mo65294b()), C10485P5.m30221a(a2.mo65297e())));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
