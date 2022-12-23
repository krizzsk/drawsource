package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromoAdLoadError;
import com.saygames.saypromo.SayPromoAdShowError;
import com.saygames.saypromo.SayPromoThrowable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.j5 */
public final class C10633j5 implements C10601f5 {

    /* renamed from: i */
    static final /* synthetic */ KProperty[] f26230i;

    /* renamed from: a */
    private final C10484P4 f26231a;

    /* renamed from: b */
    private final C10484P4 f26232b;

    /* renamed from: c */
    private final C10484P4 f26233c;

    /* renamed from: d */
    private final C10484P4 f26234d;

    /* renamed from: e */
    private final C10484P4 f26235e;

    /* renamed from: f */
    private final C10484P4 f26236f;

    /* renamed from: g */
    private final C10484P4 f26237g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10380A5 f26238h = ((C10725v5) m30483f()).mo65546a();

    static {
        Class<C10633j5> cls = C10633j5.class;
        f26230i = new KProperty[]{C10532W4.m30277a(cls, "adLoaderSteps", "getAdLoaderSteps()Lcom/saygames/saypromo/common/AdLoaderSteps;", 0), C10532W4.m30277a(cls, "adScreenDataManager", "getAdScreenDataManager()Lcom/saygames/saypromo/manager/AdScreenDataManager;", 0), C10532W4.m30277a(cls, "currentDuration", "getCurrentDuration()Lcom/saygames/saypromo/common/CurrentDuration;", 0), C10532W4.m30277a(cls, "eventsManager", "getEventsManager()Lcom/saygames/saypromo/manager/EventsManager;", 0), C10532W4.m30277a(cls, "filesManager", "getFilesManager()Lcom/saygames/saypromo/manager/FilesManager;", 0), C10532W4.m30277a(cls, "taskScopeFactory", "getTaskScopeFactory()Lcom/saygames/saypromo/common/TaskScopeFactory;", 0), C10532W4.m30277a(cls, "timeDiffer", "getTimeDiffer()Lcom/saygames/saypromo/common/TimeDiffer;", 0)};
    }

    C10633j5(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43, C10491Q4 q44, C10491Q4 q45, C10491Q4 q46, C10491Q4 q47) {
        this.f26231a = q4;
        this.f26232b = q42;
        this.f26233c = q43;
        this.f26234d = q44;
        this.f26235e = q45;
        this.f26236f = q46;
        this.f26237g = q47;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10375A0 m30474a() {
        C10484P4 p4 = this.f26231a;
        KProperty kProperty = f26230i[0];
        return (C10375A0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    private final void m30476a(C10403E0 e0, String str, String str2) {
        C10413F3 d = m30481d();
        ((C10420G3) d).mo65306a(str, e0.mo65277a(), e0.mo65280d(), e0.mo65278b(), ((C10408E5) m30484g()).mo65292a(e0.mo65281e()), str2);
    }

    /* renamed from: b */
    private final C10410F0 m30477b() {
        C10484P4 p4 = this.f26232b;
        KProperty kProperty = f26230i[1];
        return (C10410F0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10529W1 m30480c() {
        C10484P4 p4 = this.f26233c;
        KProperty kProperty = f26230i[2];
        return (C10529W1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: d */
    private final C10413F3 m30481d() {
        C10484P4 p4 = this.f26234d;
        KProperty kProperty = f26230i[3];
        return (C10413F3) ((C10491Q4) p4).mo65365a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C10510T3 m30482e() {
        C10484P4 p4 = this.f26235e;
        KProperty kProperty = f26230i[4];
        return (C10510T3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: f */
    private final C10718u5 m30483f() {
        C10484P4 p4 = this.f26236f;
        KProperty kProperty = f26230i[5];
        return (C10718u5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: g */
    private final C10401D5 m30484g() {
        C10484P4 p4 = this.f26237g;
        KProperty kProperty = f26230i[6];
        return (C10401D5) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65489a(C10697r5 r5Var, C10667o oVar, Object obj) {
        SayPromoAdLoadError unknown;
        String str;
        SayPromoAdShowError sayPromoAdShowError;
        C10689q5 q5Var = (C10689q5) obj;
        if (q5Var instanceof C10649l5) {
            if (oVar instanceof C10563b) {
                C10649l5 l5Var = (C10649l5) q5Var;
                try {
                    ((C10563b) oVar).mo65410a().onError(new SayPromoAdLoadError.State("Ad already destroyed"));
                } catch (Throwable unused) {
                }
            } else if (oVar instanceof C10571c) {
                C10649l5 l5Var2 = (C10649l5) q5Var;
                ((C10571c) oVar).mo65424b().onError(new SayPromoAdShowError.State("Ad already destroyed"));
            } else if (oVar instanceof C10587e) {
                C10587e eVar = (C10587e) oVar;
                String a = ((C10649l5) q5Var).mo65494a();
                ((C10424H0) m30477b()).mo65323a();
                this.f26238h.mo65246a(new C10609g5(this, a, (Continuation) null));
            } else if (oVar instanceof C10643l) {
                C10643l lVar = (C10643l) oVar;
                if (!((C10649l5) q5Var).mo65495b()) {
                    C10378A3.m30063a(r5Var, new C10587e());
                }
            } else if (oVar instanceof C10651m) {
                C10651m mVar = (C10651m) oVar;
                if (!((C10649l5) q5Var).mo65495b()) {
                    C10378A3.m30063a(r5Var, new C10587e());
                }
            }
        } else if (q5Var instanceof C10657m5) {
            if (oVar instanceof C10563b) {
                C10657m5 m5Var = (C10657m5) q5Var;
                ((C10563b) oVar).mo65410a().onError(new SayPromoAdLoadError.State("Ad already displayed"));
            } else if (oVar instanceof C10571c) {
                C10657m5 m5Var2 = (C10657m5) q5Var;
                ((C10571c) oVar).mo65424b().onError(new SayPromoAdShowError.State("Ad already displayed"));
            } else if (oVar instanceof C10627j) {
                C10657m5 m5Var3 = (C10657m5) q5Var;
                C10627j jVar = (C10627j) oVar;
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                String format = decimalFormat.format(Float.valueOf(jVar.mo65483b()));
                String format2 = decimalFormat.format(Float.valueOf(jVar.mo65484c()));
                C10403E0 b = m5Var3.mo65501b();
                m30476a(b, "view_click", "x=" + format + ", y=" + format2 + ", place=" + jVar.mo65482a());
                C10498R5 a2 = m5Var3.mo65500a().mo65411a();
                if (a2 != null) {
                    ((C10420G3) m30481d()).mo65305a(a2.mo65372a().mo65367a("origin", jVar.mo65482a()).mo65367a("x", format).mo65367a("y", format2).mo65368a());
                }
                m5Var3.mo65502c().onClick();
            } else if (oVar instanceof C10635k) {
                C10657m5 m5Var4 = (C10657m5) q5Var;
                C10635k kVar = (C10635k) oVar;
                m30476a(m5Var4.mo65501b(), "view_impression", (String) null);
                C10498R5 f = m5Var4.mo65500a().mo65416f();
                if (f != null) {
                    ((C10420G3) m30481d()).mo65305a(f);
                }
                m5Var4.mo65502c().onDisplayed();
            } else if (oVar instanceof C10643l) {
                C10657m5 m5Var5 = (C10657m5) q5Var;
                SayPromoThrowable.Show a3 = ((C10643l) oVar).mo65491a();
                if (a3 instanceof SayPromoThrowable.Show.Finished) {
                    sayPromoAdShowError = new SayPromoAdShowError.Finished(C10387B5.m30071a(a3));
                } else if (a3 instanceof SayPromoThrowable.Show.Video) {
                    sayPromoAdShowError = new SayPromoAdShowError.Video(C10387B5.m30071a(a3));
                } else if (a3 instanceof SayPromoThrowable.Show.Web) {
                    sayPromoAdShowError = new SayPromoAdShowError.Web(C10387B5.m30071a(a3));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                m30476a(m5Var5.mo65501b(), "view_error", sayPromoAdShowError.getMessage());
                C10498R5 d = m5Var5.mo65500a().mo65414d();
                if (d != null) {
                    ((C10420G3) m30481d()).mo65305a(d.mo65372a().mo65367a("extra", sayPromoAdShowError.getMessage()).mo65368a());
                }
                String c = m5Var5.mo65501b().mo65279c();
                ((C10424H0) m30477b()).mo65323a();
                this.f26238h.mo65246a(new C10609g5(this, c, (Continuation) null));
                m5Var5.mo65502c().onError(sayPromoAdShowError);
            } else if (oVar instanceof C10651m) {
                C10657m5 m5Var6 = (C10657m5) q5Var;
                C10651m mVar2 = (C10651m) oVar;
                m30476a(m5Var6.mo65501b(), "view_close", (String) null);
                C10498R5 b2 = m5Var6.mo65500a().mo65412b();
                if (b2 != null) {
                    ((C10420G3) m30481d()).mo65305a(b2);
                }
                String c2 = m5Var6.mo65501b().mo65279c();
                ((C10424H0) m30477b()).mo65323a();
                this.f26238h.mo65246a(new C10609g5(this, c2, (Continuation) null));
                m5Var6.mo65502c().onHidden();
            } else if (oVar instanceof C10659n) {
                C10657m5 m5Var7 = (C10657m5) q5Var;
                C10659n nVar = (C10659n) oVar;
                m30476a(m5Var7.mo65501b(), "view_event", nVar.mo65503a());
                C10498R5 e = m5Var7.mo65500a().mo65415e();
                if (e != null) {
                    ((C10420G3) m30481d()).mo65305a(e.mo65372a().mo65367a("event", nVar.mo65503a()).mo65368a());
                }
            }
        } else if (q5Var instanceof C10665n5) {
            if (oVar instanceof C10563b) {
                C10665n5 n5Var = (C10665n5) q5Var;
                C10378A3.m30063a(r5Var, new C10619i(new C10403E0(n5Var.mo65512a(), n5Var.mo65516e(), ((C10536X1) m30480c()).mo65397b(), n5Var.mo65514c(), n5Var.mo65515d(), 0), ((C10563b) oVar).mo65410a()));
            } else if (oVar instanceof C10571c) {
                C10665n5 n5Var2 = (C10665n5) q5Var;
                ((C10571c) oVar).mo65424b().onError(new SayPromoAdShowError.State("Ad not loaded yet"));
            } else if (oVar instanceof C10619i) {
                C10619i iVar = (C10619i) oVar;
                m30476a(iVar.mo65477a(), "request_start", (String) null);
                this.f26238h.mo65246a(new C10617h5(r5Var, (Continuation) null));
                this.f26238h.mo65246a(new C10625i5(this, iVar, (C10665n5) q5Var, r5Var, (Continuation) null));
            }
        } else if (q5Var instanceof C10673o5) {
            if (oVar instanceof C10555a) {
                C10673o5 o5Var = (C10673o5) q5Var;
                C10555a aVar = (C10555a) oVar;
                m30476a(o5Var.mo65521b(), "request_clear", (String) null);
                this.f26238h.mo65246a(new C10609g5(this, o5Var.mo65521b().mo65279c(), (Continuation) null));
            } else if (oVar instanceof C10563b) {
                C10673o5 o5Var2 = (C10673o5) q5Var;
                ((C10563b) oVar).mo65410a().onError(new SayPromoAdLoadError.State("Ad already loaded"));
            } else if (oVar instanceof C10571c) {
                C10673o5 o5Var3 = (C10673o5) q5Var;
                C10571c cVar = (C10571c) oVar;
                if (((C10424H0) m30477b()).mo65324a(o5Var3.mo65520a(), r5Var)) {
                    C10378A3.m30063a(r5Var, new C10595f(cVar.mo65423a(), cVar.mo65424b()));
                    return;
                }
                m30476a(o5Var3.mo65521b(), "view_already_displayed", (String) null);
                cVar.mo65424b().onError(new SayPromoAdShowError.State("Ad already displayed"));
            } else if (oVar instanceof C10595f) {
                m30476a(((C10673o5) q5Var).mo65521b(), "view_show", (String) null);
                ((C10683q) ((C10595f) oVar).mo65450a()).mo65532a();
            }
        } else if (!(q5Var instanceof C10681p5)) {
        } else {
            if (oVar instanceof C10555a) {
                C10681p5 p5Var = (C10681p5) q5Var;
                C10555a aVar2 = (C10555a) oVar;
                m30476a(p5Var.mo65527a(), "request_cancel_external", (String) null);
                this.f26238h.mo65246a(new C10609g5(this, p5Var.mo65527a().mo65279c(), (Continuation) null));
            } else if (oVar instanceof C10563b) {
                C10681p5 p5Var2 = (C10681p5) q5Var;
                ((C10563b) oVar).mo65410a().onError(new SayPromoAdLoadError.State("Ad already loading"));
            } else if (oVar instanceof C10571c) {
                C10681p5 p5Var3 = (C10681p5) q5Var;
                ((C10571c) oVar).mo65424b().onError(new SayPromoAdShowError.State("Ad not loaded yet"));
            } else if (oVar instanceof C10579d) {
                C10681p5 p5Var4 = (C10681p5) q5Var;
                C10579d dVar = (C10579d) oVar;
                m30476a(p5Var4.mo65527a(), "request_cancel_internal", (String) null);
                this.f26238h.mo65246a(new C10609g5(this, p5Var4.mo65527a().mo65279c(), (Continuation) null));
                p5Var4.mo65528b().onError(new SayPromoAdLoadError.Timeout("Timeout error"));
            } else if (oVar instanceof C10603g) {
                C10681p5 p5Var5 = (C10681p5) q5Var;
                C10403E0 a4 = p5Var5.mo65527a();
                Throwable a5 = ((C10603g) oVar).mo65457a();
                String a6 = C10387B5.m30071a(a5);
                if (a5 instanceof SayPromoThrowable.Load.Format) {
                    unknown = new SayPromoAdLoadError.Format(a6);
                    str = "request_error_format";
                } else if (a5 instanceof SayPromoThrowable.Load.IoFile) {
                    unknown = new SayPromoAdLoadError.IoFile(a6);
                    str = "request_error_io_file";
                } else if (a5 instanceof SayPromoThrowable.Load.IoServer) {
                    unknown = new SayPromoAdLoadError.IoServer(a6);
                    str = "request_error_io_server";
                } else if (a5 instanceof SayPromoThrowable.Load.NoFill) {
                    unknown = new SayPromoAdLoadError.NoFill(a6);
                    str = "request_error_no_fill";
                } else if (a5 instanceof SayPromoThrowable.Load.NoInternet) {
                    unknown = new SayPromoAdLoadError.NoInternet(a6);
                    str = "request_error_no_internet";
                } else if (a5 instanceof SayPromoThrowable.Load.NoSpace) {
                    unknown = new SayPromoAdLoadError.NoSpace(a6);
                    str = "request_error_no_space";
                } else if (a5 instanceof SayPromoThrowable.Load.Server) {
                    unknown = new SayPromoAdLoadError.Server(a6);
                    str = "request_error_server";
                } else {
                    unknown = new SayPromoAdLoadError.Unknown(a6);
                    str = "request_error_?";
                }
                m30476a(a4, str, a6);
                this.f26238h.mo65246a(new C10609g5(this, a4.mo65279c(), (Continuation) null));
                p5Var5.mo65528b().onError(unknown);
            } else if (oVar instanceof C10611h) {
                C10681p5 p5Var6 = (C10681p5) q5Var;
                m30476a(p5Var6.mo65527a(), "request_success", (String) null);
                C10498R5 h = ((C10611h) oVar).mo65476a().mo65418h();
                if (h != null) {
                    ((C10420G3) m30481d()).mo65305a(h);
                }
                p5Var6.mo65528b().onSuccess();
            }
        }
    }
}
