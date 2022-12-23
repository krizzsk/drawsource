package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3553k;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;

public class BannerExpressBackupView extends BackupView {

    /* renamed from: a */
    public static C3553k[] f8109a = {new C3553k(1, 6.4f, 320, 50), new C3553k(4, 1.2f, 300, 250)};

    /* renamed from: m */
    private View f8110m;

    /* renamed from: n */
    private NativeExpressView f8111n;

    /* renamed from: o */
    private C3968c f8112o;

    /* renamed from: p */
    private int f8113p = 1;

    /* renamed from: q */
    private String f8114q;

    public void setClosedListenerKey(String str) {
        this.f8114q = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.f8806b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19169a(View view, int i, C3414j jVar) {
        if (this.f8111n != null) {
            if (i == 1 || i == 2) {
                View findViewById = this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_close"));
                if (i == 1) {
                    this.f8111n.getClickListener().mo19317b(findViewById);
                } else {
                    this.f8111n.getClickCreativeListener().mo19317b(findViewById);
                }
            }
            this.f8111n.mo16644a(view, i, (C2548b) jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19329a(C3431n nVar, NativeExpressView nativeExpressView, C3968c cVar) {
        setBackgroundColor(-1);
        this.f8807c = nVar;
        this.f8111n = nativeExpressView;
        this.f8112o = cVar;
        this.f8810f = "banner_ad";
        this.f8111n.addView(this, new ViewGroup.LayoutParams(-2, -2));
        m10014b();
    }

    /* renamed from: b */
    private void m10014b() {
        C3553k a = m10011a(this.f8111n.getExpectExpressWidth(), this.f8111n.getExpectExpressHeight());
        if (this.f8111n.getExpectExpressWidth() <= 0 || this.f8111n.getExpectExpressHeight() <= 0) {
            this.f8811g = C3904y.m12877c(this.f8806b);
            this.f8812h = Float.valueOf(((float) this.f8811g) / a.f8953b).intValue();
        } else {
            this.f8811g = C3904y.m12886e(this.f8806b, (float) this.f8111n.getExpectExpressWidth());
            this.f8812h = C3904y.m12886e(this.f8806b, (float) this.f8111n.getExpectExpressHeight());
        }
        if (this.f8811g > 0 && this.f8811g > C3904y.m12877c(this.f8806b)) {
            float c = ((float) C3904y.m12877c(this.f8806b)) / ((float) this.f8811g);
            this.f8811g = C3904y.m12877c(this.f8806b);
            this.f8812h = Float.valueOf(((float) this.f8812h) * c).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f8811g, this.f8812h);
        }
        layoutParams.width = this.f8811g;
        layoutParams.height = this.f8812h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (a.f8952a == 1) {
            m10016c();
        } else if (a.f8952a == 4) {
            m10018d();
        } else {
            m10018d();
        }
    }

    /* renamed from: a */
    private void m10012a(ImageView imageView) {
        C3792d.m12395a().mo20613a(this.f8807c.mo19523P().get(0), imageView);
    }

    /* renamed from: c */
    private void m10016c() {
        float e = (((float) this.f8812h) * 1.0f) / ((float) C3904y.m12886e(this.f8806b, 50.0f));
        if ((((float) this.f8812h) * 1.0f) / ((float) this.f8811g) > 0.21875f) {
            e = (((float) this.f8811g) * 1.0f) / ((float) C3904y.m12886e(this.f8806b, 320.0f));
        }
        View inflate = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_backup_banner_layout1"), this, true);
        this.f8110m = inflate;
        View findViewById = inflate.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_close"));
        ImageView imageView = (ImageView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_icon"));
        TextView textView = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_title"));
        TextView textView2 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_score"));
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_score_bar"));
        TextView textView3 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_download"));
        textView.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView.getTextSize())) * e);
        textView2.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView2.getTextSize())) * e);
        textView3.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView3.getTextSize())) * e);
        View findViewById2 = this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_backup_logoLayout"));
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m8711a(BannerExpressBackupView.this.f8806b, BannerExpressBackupView.this.f8807c, BannerExpressBackupView.this.f8810f);
                }
            });
        }
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BannerExpressBackupView.this.mo19328a();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) C3904y.m12886e(this.f8806b, 45.0f)) * e);
            layoutParams.height = (int) (((float) C3904y.m12886e(this.f8806b, 45.0f)) * e);
        }
        if (this.f8807c.mo19520M() != null && !TextUtils.isEmpty(this.f8807c.mo19520M().mo19468a())) {
            C3792d.m12395a().mo20614a(this.f8807c.mo19520M().mo19468a(), imageView);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.f8807c.mo19530W())) {
            textView3.setText(this.f8807c.mo19530W());
        } else {
            textView3.setVisibility(8);
        }
        C3904y.m12861a(textView2, tTRatingBar2, this.f8807c, this.f8806b);
        mo19991a(imageView, true);
        imageView.setTag(C2914t.m8158e(C3513m.m10963a(), "tt_id_is_video_picture"), true);
        mo19991a(this, true);
        mo19991a(textView3, true);
    }

    /* renamed from: d */
    private void m10018d() {
        String str;
        if (this.f8807c != null) {
            int ad = this.f8807c.mo19570ad();
            float e = (((float) this.f8812h) * 1.0f) / ((float) C3904y.m12886e(this.f8806b, 250.0f));
            if (this.f8807c.mo19517J() == null) {
                View inflate = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_backup_banner_layout4"), this, true);
                this.f8110m = inflate;
                View findViewById = inflate.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_close"));
                RatioImageView ratioImageView = (RatioImageView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "ratio_image_view"));
                ImageView imageView = (ImageView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_icon"));
                TextView textView = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_title"));
                TextView textView2 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_desc"));
                TextView textView3 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_name"));
                TextView textView4 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_download"));
                FrameLayout frameLayout = (FrameLayout) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_image_layout"));
                LinearLayout linearLayout = (LinearLayout) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_total_title"));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    str = "tt_id_is_video_picture";
                    layoutParams.width = (int) (((float) C3904y.m12886e(this.f8806b, 45.0f)) * e);
                    layoutParams.height = (int) (((float) C3904y.m12886e(this.f8806b, 45.0f)) * e);
                } else {
                    str = "tt_id_is_video_picture";
                }
                textView.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView.getTextSize())) * e);
                textView2.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView2.getTextSize())) * e);
                textView3.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView3.getTextSize())) * e);
                textView4.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView4.getTextSize())) * e);
                try {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    float f = e - 1.0f;
                    if (f > 0.0f) {
                        layoutParams2.topMargin = C3904y.m12886e(this.f8806b, f * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView4.getLayoutParams()).setMargins(0, (int) (((float) C3904y.m12886e(this.f8806b, 16.0f)) * e), 0, 0);
                } catch (Throwable unused) {
                }
                View findViewById2 = this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_backup_logoLayout"));
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            TTWebsiteActivity.m8711a(BannerExpressBackupView.this.f8806b, BannerExpressBackupView.this.f8807c, BannerExpressBackupView.this.f8810f);
                        }
                    });
                }
                if (ad == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 2.5f;
                    ratioImageView.setRatio(1.91f);
                }
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        BannerExpressBackupView.this.mo19328a();
                    }
                });
                int b = (int) C3904y.m12868b(this.f8806b, 15.0f);
                C3904y.m12854a(findViewById, b, b, b, b);
                m10012a((ImageView) ratioImageView);
                if (this.f8807c.mo19520M() != null && !TextUtils.isEmpty(this.f8807c.mo19520M().mo19468a())) {
                    C3792d.m12395a().mo20614a(this.f8807c.mo19520M().mo19468a(), imageView);
                }
                textView3.setText(getNameOrSource());
                textView.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.f8807c.mo19530W())) {
                    textView4.setText(this.f8807c.mo19530W());
                } else {
                    textView4.setVisibility(8);
                }
                mo19991a(ratioImageView, true);
                ratioImageView.setTag(C2914t.m8158e(C3513m.m10963a(), str), true);
                mo19991a(this, true);
                mo19991a(textView4, true);
                return;
            }
            String str2 = "tt_id_is_video_picture";
            View inflate2 = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_backup_banner_layout4_video"), this, true);
            this.f8110m = inflate2;
            View findViewById3 = inflate2.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_close"));
            TextView textView5 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_title"));
            TextView textView6 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_desc"));
            TextView textView7 = (TextView) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_download"));
            RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "ratio_frame_layout"));
            textView5.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView5.getTextSize())) * e);
            textView6.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView6.getTextSize())) * e);
            textView7.setTextSize(2, ((float) C3904y.m12843a(this.f8806b, textView7.getTextSize())) * e);
            View findViewById4 = this.f8110m.findViewById(C2914t.m8158e(this.f8806b, "tt_backup_logoLayout"));
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8711a(BannerExpressBackupView.this.f8806b, BannerExpressBackupView.this.f8807c, BannerExpressBackupView.this.f8810f);
                    }
                });
            }
            if (ad == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (ad == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            View videoView = getVideoView();
            if (videoView != null) {
                ratioFrameLayout.addView(videoView, layoutParams3);
            }
            textView5.setText(getNameOrSource());
            textView6.setText(getDescription());
            if (!TextUtils.isEmpty(this.f8807c.mo19530W())) {
                textView7.setText(this.f8807c.mo19530W());
            } else {
                textView7.setVisibility(8);
            }
            findViewById3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BannerExpressBackupView.this.mo19328a();
                }
            });
            int b2 = (int) C3904y.m12868b(this.f8806b, 15.0f);
            C3904y.m12854a(findViewById3, b2, b2, b2, b2);
            mo19991a(videoView, true);
            videoView.setTag(C2914t.m8158e(C3513m.m10963a(), str2), true);
            mo19991a(this, true);
            mo19991a(textView7, true);
            mo19990a((View) ratioFrameLayout);
        }
    }

    /* renamed from: a */
    public static C3553k m10011a(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? f8109a[1] : f8109a[0];
        } catch (Throwable unused) {
            return f8109a[0];
        }
    }

    /* renamed from: a */
    public void mo19328a() {
        if (this.f8809e != null) {
            this.f8809e.show();
        } else if (this.f8808d != null) {
            this.f8808d.showDislikeDialog();
        } else {
            TTDelegateActivity.m8479a(this.f8807c, this.f8114q);
        }
    }
}
