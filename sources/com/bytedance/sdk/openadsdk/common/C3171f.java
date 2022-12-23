package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.common.f */
/* compiled from: TTTitleNewStyleManager */
public class C3171f {

    /* renamed from: a */
    TTAdDislikeDialog f7443a;

    /* renamed from: b */
    TTAdDislikeToast f7444b;

    /* renamed from: c */
    final AtomicBoolean f7445c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f7446d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RelativeLayout f7447e;

    /* renamed from: f */
    private final C3431n f7448f;

    /* renamed from: g */
    private Context f7449g;

    /* renamed from: h */
    private ImageView f7450h;

    /* renamed from: i */
    private TextView f7451i;

    /* renamed from: j */
    private ImageView f7452j;

    /* renamed from: k */
    private ProgressBar f7453k;

    /* renamed from: l */
    private final int f7454l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f7455m;

    public C3171f(Context context, RelativeLayout relativeLayout, C3431n nVar) {
        this.f7449g = context;
        this.f7447e = relativeLayout;
        this.f7448f = nVar;
        this.f7454l = C3904y.m12886e(C3513m.m10963a(), 44.0f);
        m9165e();
    }

    /* renamed from: e */
    private void m9165e() {
        this.f7450h = (ImageView) this.f7447e.findViewById(C2914t.m8158e(this.f7449g, "tt_title_bar_close"));
        this.f7451i = (TextView) this.f7447e.findViewById(C2914t.m8158e(this.f7449g, "tt_title_bar_title"));
        this.f7452j = (ImageView) this.f7447e.findViewById(C2914t.m8158e(this.f7449g, "tt_title_bar_feedback"));
        this.f7453k = (ProgressBar) this.f7447e.findViewById(C2914t.m8158e(this.f7449g, "tt_title_bar_browser_progress"));
        C3431n nVar = this.f7448f;
        if (nVar != null) {
            this.f7451i.setText(TextUtils.isEmpty(nVar.mo19528U()) ? C2914t.m8151a(this.f7449g, "tt_web_title_default") : this.f7448f.mo19528U());
        }
        this.f7452j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3171f.this.mo18814d();
            }
        });
    }

    /* renamed from: a */
    public void mo18811a(WebView webView, int i) {
        if (i == 100) {
            this.f7453k.setVisibility(8);
            return;
        }
        this.f7453k.setVisibility(0);
        this.f7453k.setProgress(i);
    }

    /* renamed from: a */
    public void mo18810a() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7447e.getLayoutParams();
            if (!this.f7455m && marginLayoutParams.topMargin == (-this.f7454l)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.f7454l, 0});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C3171f.this.f7447e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C3171f.this.f7455m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C3171f.this.f7455m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo18812b() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7447e.getLayoutParams();
            if (!this.f7455m && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.f7454l});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C3171f.this.f7447e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C3171f.this.f7455m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C3171f.this.f7455m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public ImageView mo18813c() {
        return this.f7450h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18814d() {
        if (this.f7446d.get()) {
            m9167g();
            return;
        }
        if (this.f7443a == null) {
            m9166f();
        }
        this.f7443a.mo18778a();
    }

    /* renamed from: f */
    private void m9166f() {
        try {
            if (this.f7443a == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f7449g, this.f7448f);
                this.f7443a = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3155a() {
                    /* renamed from: c */
                    public void mo18318c(View view) {
                    }

                    /* renamed from: a */
                    public void mo18316a(View view) {
                        C3171f.this.f7445c.set(true);
                    }

                    /* renamed from: b */
                    public void mo18317b(View view) {
                        C3171f.this.f7445c.set(false);
                    }

                    /* renamed from: a */
                    public void mo18315a(int i, FilterWord filterWord) {
                        if (!C3171f.this.f7446d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                            C3171f.this.f7446d.set(true);
                        }
                    }
                });
            }
            ((FrameLayout) this.f7447e.getRootView().findViewById(16908290)).addView(this.f7443a);
            if (this.f7444b == null) {
                this.f7444b = new TTAdDislikeToast(this.f7449g);
                ((FrameLayout) this.f7447e.getRootView().findViewById(16908290)).addView(this.f7444b);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m9167g() {
        this.f7444b.mo18786a(C3471f.f8594d);
    }
}
