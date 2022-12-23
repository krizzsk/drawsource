package com.bytedance.sdk.openadsdk.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3161d;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3632b;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p166e.C3730d;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import org.json.JSONObject;

public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements C3730d {

    /* renamed from: R */
    AnimatorSet f7055R;

    /* renamed from: S */
    private LinearLayout f7056S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f7057T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f7058U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public View f7059V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f7060W;

    /* renamed from: X */
    private TextView f7061X;

    /* renamed from: Y */
    private TextView f7062Y;

    /* renamed from: Z */
    private TextView f7063Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public TextView f7064aa;

    /* renamed from: ab */
    private TTRoundRectImageView f7065ab;

    /* renamed from: ac */
    private TextView f7066ac;

    /* renamed from: ad */
    private TextView f7067ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public long f7068ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f7069af = false;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f7070ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public C3161d f7071ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public LinearLayout f7072ai;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo18500a() {
        return "tt_activity_videolandingpage_link2";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo18502c() {
        return "tt_top_back";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f7070ag = C3513m.m10973h().mo19854g();
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess() || this.f7031p == null || this.f7016a == null) {
            finish();
            return;
        }
        this.f7016a.setWebViewClient(new C3687d(this.f7020e, this.f7024i, this.f7022g, this.f7008M, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f7057T != null && !TTVideoLandingPageLink2Activity.this.f7060W) {
                        TTVideoLandingPageLink2Activity.this.f7057T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f7072ai != null) {
                        TTVideoLandingPageLink2Activity.this.f7072ai.setVisibility(0);
                    }
                    boolean unused = TTVideoLandingPageLink2Activity.this.f7069af = true;
                    TTVideoLandingPageLink2Activity.this.m8698n();
                    C3090e.m8892a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f7031p, TTVideoLandingPageLink2Activity.this.f7001F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f7068ae, true);
                } catch (Throwable unused2) {
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                long unused = TTVideoLandingPageLink2Activity.this.f7068ae = System.currentTimeMillis();
            }
        });
        this.f7016a.setWebChromeClient(new C3686c(this.f7024i, this.f7008M) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.f7070ag && TTVideoLandingPageLink2Activity.this.f7071ah != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.f7071ah.mo18797a(webView);
                }
                if (TTVideoLandingPageLink2Activity.this.f6998C != null && !TTVideoLandingPageLink2Activity.this.isFinishing() && i == 100 && TTVideoLandingPageLink2Activity.this.f6998C.isShown() && !TTVideoLandingPageLink2Activity.this.f7060W) {
                    if (TTVideoLandingPageLink2Activity.this.f7057T != null) {
                        TTVideoLandingPageLink2Activity.this.f7057T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f7072ai != null) {
                        TTVideoLandingPageLink2Activity.this.f7072ai.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.m8698n();
                }
            }
        });
        TextView textView = (TextView) findViewById(C2914t.m8158e(this, "tt_loading_tip"));
        this.f7066ac = textView;
        if (!(textView == null || this.f7031p.mo19534a() == null)) {
            this.f7066ac.setText(this.f7031p.mo19534a().mo19504c());
        }
        long j = 10000;
        if (!(this.f7031p == null || this.f7031p.mo19534a() == null)) {
            j = this.f7031p.mo19534a().mo19499a() * 1000;
        }
        C3502k.m10922d().postDelayed(new Runnable() {
            public void run() {
                try {
                    boolean unused = TTVideoLandingPageLink2Activity.this.f7060W = true;
                    TTVideoLandingPageLink2Activity.this.f7058U.setVisibility(8);
                    TTVideoLandingPageLink2Activity.this.f7059V.setVisibility(0);
                    if (!TTVideoLandingPageLink2Activity.this.f7069af) {
                        C3090e.m8892a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f7031p, TTVideoLandingPageLink2Activity.this.f7001F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f7068ae, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18503d() {
        super.mo18503d();
        TextView textView = (TextView) findViewById(C2914t.m8158e(this, "tt_top_dislike"));
        this.f7063Z = textView;
        if (textView != null) {
            textView.setText(C2914t.m8151a(C3513m.m10963a(), "tt_reward_feedback"));
            this.f7063Z.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTDelegateActivity.m8479a(TTVideoLandingPageLink2Activity.this.f7031p, "");
                }
            });
        }
        this.f7064aa = (TextView) findViewById(C2914t.m8158e(this, "tt_top_skip"));
        this.f7056S = (LinearLayout) findViewById(C2914t.m8158e(this.f7020e, "wave_container"));
        this.f7057T = findViewById(C2914t.m8158e(this.f7020e, "tt_browser_webview_loading"));
        this.f7059V = findViewById(C2914t.m8158e(this.f7020e, "tt_back_container"));
        this.f7058U = findViewById(C2914t.m8158e(this.f7020e, "tt_loading_container"));
        this.f7061X = (TextView) findViewById(C2914t.m8158e(this.f7020e, "tt_back_container_title"));
        this.f7062Y = (TextView) findViewById(C2914t.m8158e(this.f7020e, "tt_back_container_des"));
        this.f7065ab = (TTRoundRectImageView) findViewById(C2914t.m8158e(this.f7020e, "tt_back_container_icon"));
        this.f7067ad = (TextView) findViewById(C2914t.m8158e(this.f7020e, "tt_back_container_download"));
        if (this.f7031p.mo19520M() != null && !TextUtils.isEmpty(this.f7031p.mo19520M().mo19468a())) {
            C3792d.m12395a().mo20614a(this.f7031p.mo19520M().mo19468a(), (ImageView) this.f7065ab);
        }
        this.f7061X.setText(this.f7031p.mo19518K());
        this.f7062Y.setText(this.f7031p.mo19529V());
        ((TextView) findViewById(C2914t.m8158e(this, "tt_ad_loading_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m8711a(TTVideoLandingPageLink2Activity.this.f7020e, TTVideoLandingPageLink2Activity.this.f7031p, TTVideoLandingPageLink2Activity.this.f7001F);
            }
        });
        if (this.f7070ag) {
            ((ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C2914t.m8158e(this, "tt_bottom_bar"));
            this.f7072ai = linearLayout;
            linearLayout.setVisibility(8);
            this.f7071ah = new C3161d(this, this.f7072ai, this.f7016a, this.f7031p, "landingpage_split_screen");
            if (this.f7016a.getWebView() != null) {
                this.f7016a.getWebView().setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a */
                    float f7078a = 0.0f;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.f7078a = motionEvent.getY();
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.f7078a;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.f7071ah != null) {
                                    TTVideoLandingPageLink2Activity.this.f7071ah.mo18796a();
                                }
                                return false;
                            } else if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.f7071ah != null) {
                                TTVideoLandingPageLink2Activity.this.f7071ah.mo18798b();
                            }
                        }
                        return false;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8684a(String str) {
        C3090e.m8897a(this.f7020e, this.f7031p, "landingpage_split_screen", str, (JSONObject) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8697m();
    }

    /* renamed from: m */
    private void m8697m() {
        this.f7055R = new AnimatorSet();
        LinearLayout linearLayout = this.f7056S;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f7055R.play(duration);
            for (int i = 1; i < this.f7056S.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f7056S.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f7055R.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18504e() {
        if (mo18505f()) {
            super.mo18504e();
            if (this.f7029n.getNativeVideoController() != null) {
                this.f7029n.getNativeVideoController().mo16027a(false);
                ((C3632b) this.f7029n.getNativeVideoController()).mo20250g(false);
                this.f7029n.setIsNeedShowDetail(false);
                this.f7027l.setClickable(true);
                this.f7027l.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.m8684a("click_video");
                        return false;
                    }
                });
            }
            ((C3632b) this.f7029n.getNativeVideoController()).mo16023a((C2405c.C2406a) new C2405c.C2406a() {
                /* renamed from: a */
                public void mo16055a() {
                }

                /* renamed from: a */
                public void mo16056a(long j, int i) {
                }

                /* renamed from: b */
                public void mo16058b(long j, int i) {
                }

                /* renamed from: a */
                public void mo16057a(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.f7064aa != null) {
                        int max = (int) Math.max(0, (j2 - j) / 1000);
                        TextView k = TTVideoLandingPageLink2Activity.this.f7064aa;
                        k.setText(max + "");
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.f7064aa.setVisibility(8);
                        }
                    }
                }
            });
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C3792d.m12395a().mo20613a(this.f7031p.mo19523P().get(0), imageView);
            this.f7027l.setVisibility(0);
            this.f7027l.removeAllViews();
            this.f7027l.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3090e.m8914b(C3513m.m10963a(), TTVideoLandingPageLink2Activity.this.f7031p, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18505f() {
        return this.f7028m == 5 || this.f7028m == 15 || this.f7028m == 50;
    }

    /* renamed from: j */
    public void mo18509j() {
        super.mo18509j();
        if (this.f7031p != null) {
            this.f7031p.mo19556a(true);
        }
        TextView textView = this.f7067ad;
        if (textView != null) {
            textView.setText(mo18501b());
            this.f7067ad.setClickable(true);
            this.f7067ad.setOnClickListener(this.f7012Q);
            this.f7067ad.setOnTouchListener(this.f7012Q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m8698n() {
        AnimatorSet animatorSet = this.f7055R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f7055R.removeAllListeners();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m8698n();
        if (!this.f7060W && this.f7008M != null && this.f7016a != null && this.f7058U.getVisibility() == 8) {
            this.f7008M.mo18696a(this.f7016a);
        }
        super.onDestroy();
    }
}
