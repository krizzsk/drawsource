package com.saygames.saypromo.p378a;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.saygames.saypromo.C10370R;
import com.saygames.saypromo.SayPromoThrowable;
import com.saygames.saypromo.widget.SayPromoFrameLayout;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.saygames.saypromo.a.Z */
public abstract class C10548Z extends Activity {

    /* renamed from: a */
    private C10380A5 f26029a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10394C5 f26030b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10394C5 f26031c;

    /* renamed from: d */
    private C10394C5 f26032d;

    /* renamed from: e */
    private SayPromoFrameLayout f26033e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f26034f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10586d6 f26035g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f26036h;

    /* renamed from: i */
    private View f26037i;

    /* renamed from: j */
    private View f26038j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public View f26039k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ViewGroup f26040l;

    /* renamed from: m */
    private C10690q6 f26041m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10467N1 f26042n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10697r5 f26043o;

    /* renamed from: p */
    private boolean f26044p;

    /* renamed from: q */
    private C10726w f26045q = C10705t.f26343a;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C10664n4 f26046r;

    /* renamed from: s */
    private ValueAnimator f26047s;

    /* renamed from: t */
    private ValueAnimator f26048t;

    /* renamed from: u */
    private ValueAnimator f26049u;

    /* renamed from: v */
    private C10499S f26050v = new C10499S((C10747z) null, (C10395D) null, (C10444K) null, (C10486Q) null);

    /* renamed from: a */
    private static void m30294a(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (i != layoutParams.gravity) {
            layoutParams.gravity = i;
            view.requestLayout();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.saygames.saypromo.a.q6] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.saygames.saypromo.a.d6] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30298a(com.saygames.saypromo.p378a.C10444K r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.saygames.saypromo.p378a.C10430I
            r1 = 0
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0062
            android.view.View r0 = r6.f26039k
            if (r0 != 0) goto L_0x000d
            r0 = r3
        L_0x000d:
            r0.setVisibility(r2)
            com.saygames.saypromo.a.d6 r0 = r6.f26035g
            if (r0 != 0) goto L_0x0015
            r0 = r3
        L_0x0015:
            r0.setVisibility(r1)
            com.saygames.saypromo.a.q6 r0 = r6.f26041m
            if (r0 != 0) goto L_0x001d
            r0 = r3
        L_0x001d:
            r0.setVisibility(r2)
            r0 = r7
            com.saygames.saypromo.a.I r0 = (com.saygames.saypromo.p378a.C10430I) r0
            com.saygames.saypromo.a.H r1 = r0.mo65334d()
            com.saygames.saypromo.widget.SayPromoFrameLayout r2 = r6.f26033e
            if (r2 != 0) goto L_0x002c
            r2 = r3
        L_0x002c:
            int r4 = r1.mo65318a()
            int r5 = r1.mo65319b()
            r2.mo65551a(r4, r5)
            com.saygames.saypromo.a.d6 r2 = r6.f26035g
            if (r2 != 0) goto L_0x003c
            r2 = r3
        L_0x003c:
            int r4 = r1.mo65318a()
            int r1 = r1.mo65319b()
            r2.mo65440a((int) r4, (int) r1)
            com.saygames.saypromo.a.X r1 = new com.saygames.saypromo.a.X
            r1.<init>(r7, r6)
            com.saygames.saypromo.a.d6 r7 = r6.f26035g
            if (r7 != 0) goto L_0x0051
            r7 = r3
        L_0x0051:
            r7.mo65441a((com.saygames.saypromo.p378a.C10534X) r1)
            com.saygames.saypromo.a.d6 r7 = r6.f26035g
            if (r7 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = r7
        L_0x005a:
            java.io.File r7 = r0.mo65333c()
            r3.mo65442a((java.io.File) r7)
            goto L_0x00a2
        L_0x0062:
            boolean r0 = r7 instanceof com.saygames.saypromo.p378a.C10437J
            if (r0 == 0) goto L_0x00a2
            android.view.View r0 = r6.f26039k
            if (r0 != 0) goto L_0x006b
            r0 = r3
        L_0x006b:
            r0.setVisibility(r2)
            com.saygames.saypromo.a.d6 r0 = r6.f26035g
            if (r0 != 0) goto L_0x0073
            r0 = r3
        L_0x0073:
            r0.setVisibility(r2)
            com.saygames.saypromo.a.q6 r0 = r6.f26041m
            if (r0 != 0) goto L_0x007b
            r0 = r3
        L_0x007b:
            r0.setVisibility(r1)
            com.saygames.saypromo.widget.SayPromoFrameLayout r0 = r6.f26033e
            if (r0 != 0) goto L_0x0083
            r0 = r3
        L_0x0083:
            r0.mo65551a(r1, r1)
            com.saygames.saypromo.a.Y r0 = new com.saygames.saypromo.a.Y
            r0.<init>(r7, r6)
            com.saygames.saypromo.a.q6 r1 = r6.f26041m
            if (r1 != 0) goto L_0x0090
            r1 = r3
        L_0x0090:
            r1.mo65533a((com.saygames.saypromo.p378a.C10541Y) r0)
            com.saygames.saypromo.a.q6 r0 = r6.f26041m
            if (r0 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = r0
        L_0x0099:
            com.saygames.saypromo.a.J r7 = (com.saygames.saypromo.p378a.C10437J) r7
            java.io.File r7 = r7.mo65340a()
            r3.mo65534a((java.io.File) r7)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10548Z.m30298a(com.saygames.saypromo.a.K):void");
    }

    /* renamed from: a */
    private final void m30299a(C10486Q q) {
        int i;
        View view = null;
        if (q instanceof C10451L) {
            View view2 = this.f26038j;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.f26038j;
            if (view3 != null) {
                view = view3;
            }
            i = 8388691;
        } else if (q instanceof C10458M) {
            View view4 = this.f26038j;
            if (view4 == null) {
                view4 = null;
            }
            view4.setVisibility(0);
            View view5 = this.f26038j;
            if (view5 != null) {
                view = view5;
            }
            i = 8388693;
        } else if (q instanceof C10465N) {
            View view6 = this.f26038j;
            if (view6 != null) {
                view = view6;
            }
            view.setVisibility(8);
            return;
        } else if (q instanceof C10472O) {
            View view7 = this.f26038j;
            if (view7 == null) {
                view7 = null;
            }
            view7.setVisibility(0);
            View view8 = this.f26038j;
            if (view8 != null) {
                view = view8;
            }
            i = 8388659;
        } else if (q instanceof C10479P) {
            View view9 = this.f26038j;
            if (view9 == null) {
                view9 = null;
            }
            view9.setVisibility(0);
            View view10 = this.f26038j;
            if (view10 != null) {
                view = view10;
            }
            i = 8388661;
        } else {
            return;
        }
        m30294a(view, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30304a(C10548Z z, View view) {
        z.m30291a();
    }

    /* renamed from: a */
    public static final void m30305a(C10548Z z, SayPromoThrowable.Show show) {
        z.f26045q = C10698s.f26326a;
        C10697r5 r5Var = z.f26043o;
        if (r5Var == null) {
            r5Var = null;
        }
        C10378A3.m30063a(r5Var, new C10643l(show));
        z.finish();
    }

    /* renamed from: a */
    private final void m30309a(C10700s1 s1Var) {
        C10499S s;
        if (this.f26044p) {
            C10394C5 c5 = null;
            if (s1Var instanceof C10677p1) {
                long a = ((C10677p1) s1Var).mo65524a();
                C10394C5 c52 = this.f26032d;
                if (c52 != null) {
                    c5 = c52;
                }
                long r2 = Duration.m35179minusLRDsOJo(a, c5.mo65267b());
                if (Duration.m35143compareToLRDsOJo(r2, Duration.Companion.m35246getZEROUwyO8pc()) > 0) {
                    C10499S s2 = this.f26050v;
                    s = C10499S.m30245a(s2, new C10374A(r2, 0));
                    if (!Intrinsics.areEqual((Object) s, (Object) s2)) {
                        this.f26050v = s;
                        if (!Intrinsics.areEqual((Object) s.mo65377a(), (Object) s2.mo65377a())) {
                            m30310a(s.mo65377a());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65378b(), (Object) s2.mo65378b())) {
                            m30297a(s.mo65378b());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65379c(), (Object) s2.mo65379c())) {
                            m30298a(s.mo65379c());
                        }
                        if (Intrinsics.areEqual((Object) s.mo65380d(), (Object) s2.mo65380d())) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C10499S s3 = this.f26050v;
                    s = C10499S.m30245a(s3, C10381B.f25734a);
                    if (!Intrinsics.areEqual((Object) s, (Object) s3)) {
                        this.f26050v = s;
                        if (!Intrinsics.areEqual((Object) s.mo65377a(), (Object) s3.mo65377a())) {
                            m30310a(s.mo65377a());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65378b(), (Object) s3.mo65378b())) {
                            m30297a(s.mo65378b());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65379c(), (Object) s3.mo65379c())) {
                            m30298a(s.mo65379c());
                        }
                        if (Intrinsics.areEqual((Object) s.mo65380d(), (Object) s3.mo65380d())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (s1Var instanceof C10685q1) {
                C10499S s4 = this.f26050v;
                s = C10499S.m30245a(s4, C10381B.f25734a);
                if (!Intrinsics.areEqual((Object) s, (Object) s4)) {
                    this.f26050v = s;
                    if (!Intrinsics.areEqual((Object) s.mo65377a(), (Object) s4.mo65377a())) {
                        m30310a(s.mo65377a());
                    }
                    if (!Intrinsics.areEqual((Object) s.mo65378b(), (Object) s4.mo65378b())) {
                        m30297a(s.mo65378b());
                    }
                    if (!Intrinsics.areEqual((Object) s.mo65379c(), (Object) s4.mo65379c())) {
                        m30298a(s.mo65379c());
                    }
                    if (Intrinsics.areEqual((Object) s.mo65380d(), (Object) s4.mo65380d())) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (s1Var instanceof C10693r1) {
                long a2 = ((C10693r1) s1Var).mo65536a();
                C10394C5 c53 = this.f26032d;
                if (c53 != null) {
                    c5 = c53;
                }
                long r22 = Duration.m35179minusLRDsOJo(a2, c5.mo65267b());
                if (Duration.m35143compareToLRDsOJo(r22, Duration.Companion.m35246getZEROUwyO8pc()) > 0) {
                    C10499S s5 = this.f26050v;
                    s = C10499S.m30245a(s5, new C10388C(r22, 0));
                    if (!Intrinsics.areEqual((Object) s, (Object) s5)) {
                        this.f26050v = s;
                        if (!Intrinsics.areEqual((Object) s.mo65377a(), (Object) s5.mo65377a())) {
                            m30310a(s.mo65377a());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65378b(), (Object) s5.mo65378b())) {
                            m30297a(s.mo65378b());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65379c(), (Object) s5.mo65379c())) {
                            m30298a(s.mo65379c());
                        }
                        if (Intrinsics.areEqual((Object) s.mo65380d(), (Object) s5.mo65380d())) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C10499S s6 = this.f26050v;
                    s = C10499S.m30245a(s6, C10381B.f25734a);
                    if (!Intrinsics.areEqual((Object) s, (Object) s6)) {
                        this.f26050v = s;
                        if (!Intrinsics.areEqual((Object) s.mo65377a(), (Object) s6.mo65377a())) {
                            m30310a(s.mo65377a());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65378b(), (Object) s6.mo65378b())) {
                            m30297a(s.mo65378b());
                        }
                        if (!Intrinsics.areEqual((Object) s.mo65379c(), (Object) s6.mo65379c())) {
                            m30298a(s.mo65379c());
                        }
                        if (Intrinsics.areEqual((Object) s.mo65380d(), (Object) s6.mo65380d())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            m30299a(s.mo65380d());
        }
    }

    /* renamed from: a */
    private final void m30310a(C10747z zVar) {
        View view = null;
        if (zVar instanceof C10733x) {
            ViewGroup viewGroup = this.f26040l;
            if (viewGroup == null) {
                viewGroup = null;
            }
            m30294a((View) viewGroup, 8388659);
            View view2 = this.f26036h;
            if (view2 == null) {
                view2 = null;
            }
            view2.setPadding(m30313b(12), m30313b(12), m30313b(20), m30313b(20));
            View view3 = this.f26036h;
            if (view3 == null) {
                view3 = null;
            }
            m30294a(view3, 8388659);
            TextView textView = this.f26034f;
            if (textView == null) {
                textView = null;
            }
            textView.setPadding(0, 0, m30313b(8), 0);
            ViewGroup viewGroup2 = this.f26040l;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            View view4 = this.f26037i;
            if (view4 == null) {
                view4 = null;
            }
            if (viewGroup2.indexOfChild(view4) != 0) {
                ViewGroup viewGroup3 = this.f26040l;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                View view5 = this.f26037i;
                if (view5 == null) {
                    view5 = null;
                }
                viewGroup3.removeView(view5);
                ViewGroup viewGroup4 = this.f26040l;
                if (viewGroup4 == null) {
                    viewGroup4 = null;
                }
                View view6 = this.f26037i;
                if (view6 != null) {
                    view = view6;
                }
                viewGroup4.addView(view, 0);
            }
        } else if (zVar instanceof C10740y) {
            ViewGroup viewGroup5 = this.f26040l;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            m30294a((View) viewGroup5, 8388661);
            View view7 = this.f26036h;
            if (view7 == null) {
                view7 = null;
            }
            view7.setPadding(m30313b(20), m30313b(12), m30313b(12), m30313b(20));
            View view8 = this.f26036h;
            if (view8 == null) {
                view8 = null;
            }
            m30294a(view8, 8388661);
            TextView textView2 = this.f26034f;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setPadding(m30313b(8), 0, 0, 0);
            ViewGroup viewGroup6 = this.f26040l;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            View view9 = this.f26037i;
            if (view9 == null) {
                view9 = null;
            }
            if (viewGroup6.indexOfChild(view9) == 0) {
                ViewGroup viewGroup7 = this.f26040l;
                if (viewGroup7 == null) {
                    viewGroup7 = null;
                }
                View view10 = this.f26037i;
                if (view10 == null) {
                    view10 = null;
                }
                viewGroup7.removeView(view10);
                ViewGroup viewGroup8 = this.f26040l;
                if (viewGroup8 == null) {
                    viewGroup8 = null;
                }
                View view11 = this.f26037i;
                if (view11 != null) {
                    view = view11;
                }
                viewGroup8.addView(view);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30312a(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: b */
    private final int m30313b(int i) {
        return (i * getResources().getDisplayMetrics().densityDpi) / 160;
    }

    /* renamed from: b */
    public static final void m30314b(C10548Z z) {
        z.f26045q = C10698s.f26326a;
        C10697r5 r5Var = z.f26043o;
        if (r5Var == null) {
            r5Var = null;
        }
        C10378A3.m30063a(r5Var, new C10651m());
        z.finish();
    }

    /* renamed from: m */
    public static final void m30326m(C10548Z z) {
        C10586d6 d6Var = z.f26035g;
        C10586d6 d6Var2 = null;
        if (d6Var == null) {
            d6Var = null;
        }
        d6Var.mo65441a((C10534X) null);
        C10586d6 d6Var3 = z.f26035g;
        if (d6Var3 != null) {
            d6Var2 = d6Var3;
        }
        d6Var2.mo65445e();
    }

    /* renamed from: n */
    public static final void m30327n(C10548Z z) {
        C10690q6 q6Var = z.f26041m;
        if (q6Var == null) {
            q6Var = null;
        }
        q6Var.mo65533a((C10541Y) null);
    }

    public final void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C10390C1 a;
        getWindow().getDecorView().setSystemUiVisibility(5638);
        super.onCreate(bundle);
        C10607g3 a2 = C10615h3.m30453a(this);
        C10529W1 w1 = (C10529W1) a2.mo65465e().mo65365a();
        this.f26029a = ((C10725v5) ((C10718u5) a2.mo65472l().mo65365a())).mo65546a();
        this.f26030b = new C10394C5(w1, false);
        this.f26031c = new C10394C5(w1, false);
        this.f26032d = new C10394C5(w1, true);
        C10417G0 b = ((C10424H0) ((C10410F0) a2.mo65462b().mo65365a())).mo65325b();
        if (b == null) {
            finish();
            return;
        }
        this.f26042n = b.mo65302a();
        this.f26043o = b.mo65303b();
        this.f26046r = b.mo65304c();
        C10697r5 r5Var = this.f26043o;
        if (r5Var == null) {
            r5Var = null;
        }
        C10378A3.m30063a(r5Var, new C10635k());
        setContentView(C10370R.layout.sp_activity_ad);
        this.f26036h = findViewById(C10370R.C10372id.sp_close_image_view);
        this.f26040l = (ViewGroup) findViewById(C10370R.C10372id.sp_close_linear_layout);
        this.f26037i = findViewById(C10370R.C10372id.sp_close_space);
        this.f26034f = (TextView) findViewById(C10370R.C10372id.sp_close_text_view);
        this.f26033e = (SayPromoFrameLayout) findViewById(C10370R.C10372id.sp_container_frame_layout);
        this.f26038j = findViewById(C10370R.C10372id.sp_logo_image_view);
        this.f26039k = findViewById(C10370R.C10372id.sp_progress_view);
        this.f26035g = (C10586d6) findViewById(C10370R.C10372id.sp_video_player_view);
        this.f26041m = (C10690q6) findViewById(C10370R.C10372id.sp_web_player_view);
        C10467N1 a3 = b.mo65302a();
        if (a3 instanceof C10446K1) {
            a = ((C10446K1) a3).mo65348a();
        } else if (a3 instanceof C10453L1) {
            a = ((C10453L1) a3).mo65351a();
        } else if (a3 instanceof C10460M1) {
            m30296a(((C10460M1) a3).mo65353a());
            return;
        } else {
            return;
        }
        m30295a(a);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C10726w wVar = this.f26045q;
        if (!(wVar instanceof C10705t)) {
            C10380A5 a5 = this.f26029a;
            C10697r5 r5Var = null;
            if (a5 == null) {
                a5 = null;
            }
            a5.mo65247b();
            ValueAnimator valueAnimator = this.f26047s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26047s = null;
            ValueAnimator valueAnimator2 = this.f26048t;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.f26048t = null;
            ValueAnimator valueAnimator3 = this.f26049u;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.f26049u = null;
            C10586d6 d6Var = this.f26035g;
            if (d6Var == null) {
                d6Var = null;
            }
            d6Var.mo65441a((C10534X) null);
            C10586d6 d6Var2 = this.f26035g;
            if (d6Var2 == null) {
                d6Var2 = null;
            }
            d6Var2.mo65445e();
            C10690q6 q6Var = this.f26041m;
            if (q6Var == null) {
                q6Var = null;
            }
            q6Var.mo65533a((C10541Y) null);
            C10380A5 a52 = this.f26029a;
            if (a52 == null) {
                a52 = null;
            }
            a52.mo65245a();
            if (!(wVar instanceof C10698s)) {
                SayPromoThrowable.Show.Finished finished = new SayPromoThrowable.Show.Finished();
                C10697r5 r5Var2 = this.f26043o;
                if (r5Var2 != null) {
                    r5Var = r5Var2;
                }
                C10378A3.m30063a(r5Var, new C10643l(finished));
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f26044p = true;
        C10394C5 c5 = this.f26032d;
        C10586d6 d6Var = null;
        if (c5 == null) {
            c5 = null;
        }
        c5.mo65268c();
        C10380A5 a5 = this.f26029a;
        if (a5 == null) {
            a5 = null;
        }
        a5.mo65247b();
        ValueAnimator valueAnimator = this.f26047s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f26047s = null;
        ValueAnimator valueAnimator2 = this.f26048t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f26048t = null;
        ValueAnimator valueAnimator3 = this.f26049u;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f26049u = null;
        if (this.f26045q instanceof C10712u) {
            C10586d6 d6Var2 = this.f26035g;
            if (d6Var2 != null) {
                d6Var = d6Var2;
            }
            d6Var.mo65443c();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(5638);
        C10726w wVar = this.f26045q;
        C10394C5 c5 = null;
        if (wVar instanceof C10712u) {
            m30309a(((C10712u) wVar).mo65543a().mo65256b());
            C10586d6 d6Var = this.f26035g;
            if (d6Var == null) {
                d6Var = null;
            }
            d6Var.mo65444d();
        } else if (wVar instanceof C10719v) {
            m30309a(((C10719v) wVar).mo65545a().mo65270a());
        }
        this.f26044p = false;
        C10394C5 c52 = this.f26032d;
        if (c52 != null) {
            c5 = c52;
        }
        c5.mo65269d();
    }

    /* renamed from: a */
    public static final int m30290a(C10548Z z, long j) {
        z.getClass();
        if (Duration.m35143compareToLRDsOJo(j, C10556a0.f26057a) < 0) {
            return 0;
        }
        Duration.Companion companion = Duration.Companion;
        return z.m30313b(Duration.m35143compareToLRDsOJo(j, DurationKt.toDuration(10, DurationUnit.SECONDS)) < 0 ? 28 : 38);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m30315b(C10548Z z, ValueAnimator valueAnimator) {
        TextView textView = z.f26034f;
        if (textView == null) {
            textView = null;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue != textView.getLayoutParams().width) {
            textView.getLayoutParams().width = intValue;
            textView.requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC, Splitter:B:19:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m30307a(com.saygames.saypromo.p378a.C10548Z r3, com.saygames.saypromo.p378a.C10664n4 r4) {
        /*
            r3.getClass()
            if (r4 != 0) goto L_0x0006
            goto L_0x0056
        L_0x0006:
            boolean r0 = r4 instanceof com.saygames.saypromo.p378a.C10648l4
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r0 == 0) goto L_0x0022
            com.saygames.saypromo.a.l4 r4 = (com.saygames.saypromo.p378a.C10648l4) r4
            java.lang.String r4 = r4.mo65493a()
            if (r4 != 0) goto L_0x0015
            goto L_0x0056
        L_0x0015:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0056 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0056 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0056 }
            r3.startActivity(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0022:
            boolean r0 = r4 instanceof com.saygames.saypromo.p378a.C10656m4
            if (r0 == 0) goto L_0x0056
            com.saygames.saypromo.a.m4 r4 = (com.saygames.saypromo.p378a.C10656m4) r4
            java.lang.String r0 = r4.mo65499b()
            if (r0 != 0) goto L_0x002f
            goto L_0x003e
        L_0x002f:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x003e }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x003e }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003e }
            r3.startActivity(r2)     // Catch:{ all -> 0x003e }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0056
            java.lang.String r4 = r4.mo65498a()
            if (r4 != 0) goto L_0x0048
            goto L_0x0056
        L_0x0048:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0056 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0056 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0056 }
            r3.startActivity(r0)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0056 }
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10548Z.m30307a(com.saygames.saypromo.a.Z, com.saygames.saypromo.a.n4):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30311a(Function1 function1) {
        ValueAnimator valueAnimator = this.f26047s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f26047s = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10548Z.m30312a(Function1.this, valueAnimator);
            }
        });
        ofInt.start();
        this.f26047s = ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30293a(int i, int i2) {
        ValueAnimator valueAnimator = this.f26048t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        SayPromoFrameLayout sayPromoFrameLayout = null;
        this.f26048t = null;
        SayPromoFrameLayout sayPromoFrameLayout2 = this.f26033e;
        if (sayPromoFrameLayout2 != null) {
            sayPromoFrameLayout = sayPromoFrameLayout2;
        }
        int width = sayPromoFrameLayout.getWidth();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(width * i) / i2, width});
        ofInt.setDuration((long) (i2 - i));
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10548Z.m30303a(C10548Z.this, valueAnimator);
            }
        });
        ofInt.start();
        this.f26048t = ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30303a(C10548Z z, ValueAnimator valueAnimator) {
        View view = z.f26039k;
        if (view == null) {
            view = null;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue != view.getLayoutParams().width) {
            view.getLayoutParams().width = intValue;
            view.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30292a(int i) {
        ValueAnimator valueAnimator = this.f26049u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        TextView textView = null;
        this.f26049u = null;
        int[] iArr = new int[2];
        TextView textView2 = this.f26034f;
        if (textView2 != null) {
            textView = textView2;
        }
        iArr[0] = textView.getWidth();
        iArr[1] = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.setDuration(200);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10548Z.m30315b(C10548Z.this, valueAnimator);
            }
        });
        ofInt.start();
        this.f26049u = ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30291a() {
        C10394C5 c5 = this.f26030b;
        C10697r5 r5Var = null;
        if (c5 == null) {
            c5 = null;
        }
        if (Duration.m35143compareToLRDsOJo(c5.mo65267b(), C10556a0.f26057a) >= 0) {
            C10394C5 c52 = this.f26030b;
            if (c52 == null) {
                c52 = null;
            }
            c52.mo65266a();
            C10726w wVar = this.f26045q;
            if (wVar instanceof C10712u) {
                C10586d6 d6Var = this.f26035g;
                if (d6Var == null) {
                    d6Var = null;
                }
                d6Var.mo65441a((C10534X) null);
                C10586d6 d6Var2 = this.f26035g;
                if (d6Var2 == null) {
                    d6Var2 = null;
                }
                d6Var2.mo65445e();
                C10467N1 n1 = this.f26042n;
                if (n1 == null) {
                    n1 = null;
                }
                if (n1 instanceof C10446K1) {
                    m30296a(((C10446K1) n1).mo65349b());
                    return;
                }
                this.f26045q = C10698s.f26326a;
                C10697r5 r5Var2 = this.f26043o;
                if (r5Var2 != null) {
                    r5Var = r5Var2;
                }
                C10378A3.m30063a(r5Var, new C10651m());
                finish();
            } else if (wVar instanceof C10719v) {
                C10690q6 q6Var = this.f26041m;
                if (q6Var == null) {
                    q6Var = null;
                }
                q6Var.mo65533a((C10541Y) null);
                this.f26045q = C10698s.f26326a;
                C10697r5 r5Var3 = this.f26043o;
                if (r5Var3 != null) {
                    r5Var = r5Var3;
                }
                C10378A3.m30063a(r5Var, new C10651m());
                finish();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.saygames.saypromo.a.A5} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30297a(com.saygames.saypromo.p378a.C10395D r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.saygames.saypromo.p378a.C10374A
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x00a7
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x000d
            r0 = r3
        L_0x000d:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r4)
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x0017
            r0 = r3
        L_0x0017:
            r0.setVisibility(r2)
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x001f
            r0 = r3
        L_0x001f:
            r0.setOnClickListener(r3)
            android.view.ViewGroup r0 = r10.f26040l
            if (r0 != 0) goto L_0x0027
            r0 = r3
        L_0x0027:
            r0.setAlpha(r1)
            android.view.ViewGroup r0 = r10.f26040l
            if (r0 != 0) goto L_0x002f
            r0 = r3
        L_0x002f:
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.f26034f
            if (r0 != 0) goto L_0x0037
            r0 = r3
        L_0x0037:
            r0.setAlpha(r1)
            android.widget.TextView r0 = r10.f26034f
            if (r0 != 0) goto L_0x003f
            r0 = r3
        L_0x003f:
            r0.setVisibility(r2)
            com.saygames.saypromo.a.A r11 = (com.saygames.saypromo.p378a.C10374A) r11
            long r5 = r11.mo65240a()
            long r0 = kotlin.time.Duration.m35165getInWholeSecondsimpl(r5)
            int r7 = (int) r0
            android.widget.TextView r11 = r10.f26034f
            if (r11 != 0) goto L_0x0052
            r11 = r3
        L_0x0052:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r11.setText(r0)
            long r0 = com.saygames.saypromo.p378a.C10556a0.f26057a
            int r11 = kotlin.time.Duration.m35143compareToLRDsOJo(r5, r0)
            if (r11 >= 0) goto L_0x0064
            goto L_0x007d
        L_0x0064:
            kotlin.time.Duration$Companion r11 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r11 = kotlin.time.DurationUnit.SECONDS
            r0 = 10
            long r0 = kotlin.time.DurationKt.toDuration((int) r0, (kotlin.time.DurationUnit) r11)
            int r11 = kotlin.time.Duration.m35143compareToLRDsOJo(r5, r0)
            if (r11 >= 0) goto L_0x0077
            r11 = 28
            goto L_0x0079
        L_0x0077:
            r11 = 38
        L_0x0079:
            int r2 = r10.m30313b((int) r11)
        L_0x007d:
            android.widget.TextView r11 = r10.f26034f
            if (r11 != 0) goto L_0x0082
            r11 = r3
        L_0x0082:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r0 = r0.width
            if (r2 != r0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r0.width = r2
            r11.requestLayout()
        L_0x0094:
            com.saygames.saypromo.a.A5 r11 = r10.f26029a
            if (r11 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = r11
        L_0x009a:
            com.saygames.saypromo.a.U r11 = new com.saygames.saypromo.a.U
            r9 = 0
            r4 = r11
            r8 = r10
            r4.<init>(r5, r7, r8, r9)
            r3.mo65248b(r11)
            goto L_0x0136
        L_0x00a7:
            boolean r0 = r11 instanceof com.saygames.saypromo.p378a.C10381B
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x00ed
            android.view.View r11 = r10.f26036h
            if (r11 != 0) goto L_0x00b3
            r11 = r3
        L_0x00b3:
            r11.setAlpha(r1)
            android.view.View r11 = r10.f26036h
            if (r11 != 0) goto L_0x00bb
            r11 = r3
        L_0x00bb:
            r11.setVisibility(r2)
            android.view.View r11 = r10.f26036h
            if (r11 != 0) goto L_0x00c3
            r11 = r3
        L_0x00c3:
            com.saygames.saypromo.a.-$$Lambda$Z$Y3JiD0aE96nkexzCLi0z8ZzA0hs r0 = new com.saygames.saypromo.a.-$$Lambda$Z$Y3JiD0aE96nkexzCLi0z8ZzA0hs
            r0.<init>()
            r11.setOnClickListener(r0)
            android.view.ViewGroup r11 = r10.f26040l
            if (r11 != 0) goto L_0x00d0
            r11 = r3
        L_0x00d0:
            r11.setAlpha(r1)
            android.view.ViewGroup r11 = r10.f26040l
            if (r11 != 0) goto L_0x00d8
            r11 = r3
        L_0x00d8:
            r11.setVisibility(r2)
            android.widget.TextView r11 = r10.f26034f
            if (r11 != 0) goto L_0x00e0
            r11 = r3
        L_0x00e0:
            r11.setAlpha(r5)
            android.widget.TextView r11 = r10.f26034f
            if (r11 != 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r3 = r11
        L_0x00e9:
            r3.setVisibility(r4)
            goto L_0x0136
        L_0x00ed:
            boolean r0 = r11 instanceof com.saygames.saypromo.p378a.C10388C
            if (r0 == 0) goto L_0x0136
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x00f6
            r0 = r3
        L_0x00f6:
            r0.setAlpha(r5)
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x00fe
            r0 = r3
        L_0x00fe:
            r0.setVisibility(r4)
            android.view.View r0 = r10.f26036h
            if (r0 != 0) goto L_0x0106
            r0 = r3
        L_0x0106:
            r0.setOnClickListener(r3)
            android.view.ViewGroup r0 = r10.f26040l
            if (r0 != 0) goto L_0x010e
            r0 = r3
        L_0x010e:
            r0.setAlpha(r5)
            android.view.ViewGroup r0 = r10.f26040l
            if (r0 != 0) goto L_0x0116
            r0 = r3
        L_0x0116:
            r0.setVisibility(r4)
            android.widget.TextView r0 = r10.f26034f
            if (r0 != 0) goto L_0x011e
            r0 = r3
        L_0x011e:
            r0.setAlpha(r5)
            android.widget.TextView r0 = r10.f26034f
            if (r0 != 0) goto L_0x0126
            r0 = r3
        L_0x0126:
            r0.setVisibility(r4)
            com.saygames.saypromo.a.A5 r0 = r10.f26029a
            if (r0 != 0) goto L_0x012e
            r0 = r3
        L_0x012e:
            com.saygames.saypromo.a.W r1 = new com.saygames.saypromo.a.W
            r1.<init>(r11, r10, r3)
            r0.mo65248b(r1)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10548Z.m30297a(com.saygames.saypromo.a.D):void");
    }

    /* renamed from: a */
    private final void m30295a(C10390C1 c1) {
        C10747z zVar;
        C10395D d;
        C10416G g;
        C10486Q q;
        C10380A5 a5 = this.f26029a;
        C10394C5 c5 = null;
        if (a5 == null) {
            a5 = null;
        }
        a5.mo65247b();
        ValueAnimator valueAnimator = this.f26047s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f26047s = null;
        ValueAnimator valueAnimator2 = this.f26048t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f26048t = null;
        ValueAnimator valueAnimator3 = this.f26049u;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f26049u = null;
        this.f26045q = new C10712u(c1);
        C10394C5 c52 = this.f26030b;
        if (c52 == null) {
            c52 = null;
        }
        c52.mo65266a();
        C10394C5 c53 = this.f26031c;
        if (c53 == null) {
            c53 = null;
        }
        c53.mo65266a();
        C10394C5 c54 = this.f26032d;
        if (c54 != null) {
            c5 = c54;
        }
        c5.mo65266a();
        C10499S s = this.f26050v;
        C10742y1 c = c1.mo65257c();
        if (c instanceof C10728w1) {
            zVar = C10733x.f26363a;
        } else if (c instanceof C10735x1) {
            zVar = C10740y.f26372a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10700s1 b = c1.mo65256b();
        if (b instanceof C10677p1) {
            d = new C10374A(((C10677p1) b).mo65524a(), 0);
        } else if (b instanceof C10685q1) {
            d = C10381B.f25734a;
        } else if (b instanceof C10693r1) {
            d = new C10388C(((C10693r1) b).mo65536a(), 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        boolean f = c1.mo65260f();
        C10540X5 h = c1.mo65262h();
        if (h instanceof C10526V5) {
            g = C10402E.f25779a;
        } else if (h instanceof C10533W5) {
            g = C10409F.f25799a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10416G g2 = g;
        long a = c1.mo65255a();
        File d2 = c1.mo65258d();
        C10594e6 i = c1.mo65263i();
        C10430I i2 = new C10430I(f, g2, a, d2, new C10423H(i.mo65448a(), i.mo65449b()), 0);
        C10379A4 e = c1.mo65259e();
        if (e instanceof C10724v4) {
            q = C10451L.f25878a;
        } else if (e instanceof C10731w4) {
            q = C10458M.f25888a;
        } else if (e instanceof C10738x4) {
            q = C10465N.f25903a;
        } else if (e instanceof C10745y4) {
            q = C10472O.f25909a;
        } else if (e instanceof C10752z4) {
            q = C10479P.f25918a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        s.getClass();
        C10499S a2 = C10499S.m30246a(zVar, d, i2, q);
        this.f26050v = a2;
        m30310a(a2.mo65377a());
        m30297a(a2.mo65378b());
        m30298a(a2.mo65379c());
        m30299a(a2.mo65380d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30296a(C10397D1 d1) {
        C10747z zVar;
        C10395D d;
        C10486Q q;
        C10380A5 a5 = this.f26029a;
        C10394C5 c5 = null;
        if (a5 == null) {
            a5 = null;
        }
        a5.mo65247b();
        ValueAnimator valueAnimator = this.f26047s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f26047s = null;
        ValueAnimator valueAnimator2 = this.f26048t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f26048t = null;
        ValueAnimator valueAnimator3 = this.f26049u;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f26049u = null;
        this.f26045q = new C10719v(d1);
        C10394C5 c52 = this.f26030b;
        if (c52 == null) {
            c52 = null;
        }
        c52.mo65266a();
        C10394C5 c53 = this.f26031c;
        if (c53 == null) {
            c53 = null;
        }
        c53.mo65266a();
        C10394C5 c54 = this.f26032d;
        if (c54 != null) {
            c5 = c54;
        }
        c5.mo65266a();
        C10499S s = this.f26050v;
        C10742y1 b = d1.mo65271b();
        if (b instanceof C10728w1) {
            zVar = C10733x.f26363a;
        } else if (b instanceof C10735x1) {
            zVar = C10740y.f26372a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10700s1 a = d1.mo65270a();
        if (a instanceof C10677p1) {
            d = new C10374A(((C10677p1) a).mo65524a(), 0);
        } else if (a instanceof C10685q1) {
            d = C10381B.f25734a;
        } else if (a instanceof C10693r1) {
            d = new C10388C(((C10693r1) a).mo65536a(), 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10437J j = new C10437J(d1.mo65275f(), d1.mo65272c());
        C10379A4 d2 = d1.mo65273d();
        if (d2 instanceof C10724v4) {
            q = C10451L.f25878a;
        } else if (d2 instanceof C10731w4) {
            q = C10458M.f25888a;
        } else if (d2 instanceof C10738x4) {
            q = C10465N.f25903a;
        } else if (d2 instanceof C10745y4) {
            q = C10472O.f25909a;
        } else if (d2 instanceof C10752z4) {
            q = C10479P.f25918a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        s.getClass();
        C10499S a2 = C10499S.m30246a(zVar, d, j, q);
        this.f26050v = a2;
        m30310a(a2.mo65377a());
        m30297a(a2.mo65378b());
        m30298a(a2.mo65379c());
        m30299a(a2.mo65380d());
    }
}
