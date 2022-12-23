package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C1535i;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.l */
class C1542l extends Dialog implements C1541k {

    /* renamed from: a */
    private final Activity f1946a;

    /* renamed from: b */
    private final C1969m f1947b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2102v f1948c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1523d f1949d;

    /* renamed from: e */
    private final C1834a f1950e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f1951f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1535i f1952g;

    C1542l(C1834a aVar, C1523d dVar, Activity activity, C1969m mVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f1947b = mVar;
            this.f1948c = mVar.mo14509A();
            this.f1946a = activity;
            this.f1949d = dVar;
            this.f1950e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* renamed from: a */
    private int m2876a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f1946a, i);
    }

    /* renamed from: a */
    private void m2878a(C1535i.C1536a aVar) {
        if (this.f1952g == null) {
            C1535i a = C1535i.m2857a(aVar, this.f1946a);
            this.f1952g = a;
            a.setVisibility(8);
            this.f1952g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1542l.this.m2882d();
                }
            });
            this.f1952g.setClickable(false);
            int a2 = m2876a(((Integer) this.f1947b.mo14534a(C1867b.f3173bU)).intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(10);
            int i = 9;
            layoutParams.addRule(((Boolean) this.f1947b.mo14534a(C1867b.f3176bX)).booleanValue() ? 9 : 11);
            this.f1952g.mo13182a(a2);
            int a3 = m2876a(((Integer) this.f1947b.mo14534a(C1867b.f3175bW)).intValue());
            int a4 = m2876a(((Integer) this.f1947b.mo14534a(C1867b.f3174bV)).intValue());
            layoutParams.setMargins(a4, a3, a4, 0);
            this.f1951f.addView(this.f1952g, layoutParams);
            this.f1952g.bringToFront();
            int a5 = m2876a(((Integer) this.f1947b.mo14534a(C1867b.f3177bY)).intValue());
            View view = new View(this.f1946a);
            view.setBackgroundColor(0);
            int i2 = a2 + a5;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams2.addRule(10);
            if (!((Boolean) this.f1947b.mo14534a(C1867b.f3176bX)).booleanValue()) {
                i = 11;
            }
            layoutParams2.addRule(i);
            layoutParams2.setMargins(a4 - m2876a(5), a3 - m2876a(5), a4 - m2876a(5), 0);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (C1542l.this.f1952g.isClickable()) {
                        C1542l.this.f1952g.performClick();
                    }
                }
            });
            this.f1951f.addView(view, layoutParams2);
            view.bringToFront();
        } else if (C2102v.m5104a()) {
            this.f1948c.mo15015d("ExpandedAdDialog", "Attempting to create duplicate close button");
        }
    }

    /* renamed from: c */
    private void m2880c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1949d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f1946a);
        this.f1951f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1951f.setBackgroundColor(-1157627904);
        this.f1951f.addView(this.f1949d);
        if (!this.f1950e.mo14143m()) {
            m2878a(this.f1950e.mo14144n());
            m2885e();
        }
        setContentView(this.f1951f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m2882d() {
        this.f1949d.mo13151a("javascript:al_onCloseTapped();", (Runnable) new Runnable() {
            public void run() {
                C1542l.this.dismiss();
            }
        });
    }

    /* renamed from: e */
    private void m2885e() {
        this.f1946a.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1542l.this.f1952g == null) {
                        C1542l.this.m2882d();
                    }
                    C1542l.this.f1952g.setVisibility(0);
                    C1542l.this.f1952g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            C1542l.this.f1952g.setClickable(true);
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    C1542l.this.f1952g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C1542l.this.f1948c.mo15013b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    C1542l.this.m2882d();
                }
            }
        });
    }

    /* renamed from: a */
    public C1834a mo13195a() {
        return this.f1950e;
    }

    /* renamed from: b */
    public C1523d mo13196b() {
        return this.f1949d;
    }

    public void dismiss() {
        C1879d statsManagerHelper = this.f1949d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.mo14333e();
        }
        this.f1946a.runOnUiThread(new Runnable() {
            public void run() {
                C1542l.this.f1951f.removeView(C1542l.this.f1949d);
                C1542l.super.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f1949d.mo13151a("javascript:al_onBackPressed();", (Runnable) new Runnable() {
            public void run() {
                C1542l.this.dismiss();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m2880c();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f1946a.getWindow().getAttributes().flags, this.f1946a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C2102v.m5104a()) {
                this.f1948c.mo15016e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f1948c.mo15013b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
