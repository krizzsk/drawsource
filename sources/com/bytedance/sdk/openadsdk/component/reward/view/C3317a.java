package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3232e;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3246g;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.a */
/* compiled from: RewardFullBackUpEndCard */
public class C3317a {

    /* renamed from: a */
    LinearLayout f7905a;

    /* renamed from: b */
    FrameLayout f7906b;

    /* renamed from: c */
    TTRoundRectImageView f7907c;

    /* renamed from: d */
    TextView f7908d;

    /* renamed from: e */
    TTRatingBar2 f7909e;

    /* renamed from: f */
    TextView f7910f;

    /* renamed from: g */
    TextView f7911g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Activity f7912h;

    /* renamed from: i */
    private boolean f7913i;

    /* renamed from: j */
    private TextView f7914j;

    /* renamed from: k */
    private C3246g f7915k;

    public C3317a(Activity activity) {
        this.f7912h = activity;
    }

    /* renamed from: a */
    public void mo19184a() {
        if (!this.f7913i) {
            this.f7913i = true;
            m9826d();
        }
    }

    /* renamed from: d */
    private void m9826d() {
        Activity activity = this.f7912h;
        this.f7906b = (FrameLayout) activity.findViewById(C2914t.m8158e(activity, "tt_reward_full_endcard_backup_container"));
        Activity activity2 = this.f7912h;
        this.f7905a = (LinearLayout) activity2.findViewById(C2914t.m8158e(activity2, "tt_reward_full_endcard_backup"));
        Activity activity3 = this.f7912h;
        this.f7907c = (TTRoundRectImageView) activity3.findViewById(C2914t.m8158e(activity3, "tt_reward_ad_icon_backup"));
        Activity activity4 = this.f7912h;
        this.f7908d = (TextView) activity4.findViewById(C2914t.m8158e(activity4, "tt_reward_ad_appname_backup"));
        Activity activity5 = this.f7912h;
        this.f7909e = (TTRatingBar2) activity5.findViewById(C2914t.m8158e(activity5, "tt_rb_score_backup"));
        Activity activity6 = this.f7912h;
        this.f7910f = (TextView) activity6.findViewById(C2914t.m8158e(activity6, "tt_comment_backup"));
        Activity activity7 = this.f7912h;
        this.f7911g = (TextView) activity7.findViewById(C2914t.m8158e(activity7, "tt_reward_ad_download_backup"));
        Activity activity8 = this.f7912h;
        this.f7914j = (TextView) activity8.findViewById(C2914t.m8158e(activity8, "tt_ad_endcard_logo"));
    }

    /* renamed from: a */
    public void mo19185a(C3365e eVar) {
        C3904y.m12855a((View) this.f7906b, (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        this.f7911g.setOnClickListener(eVar);
        this.f7911g.setOnTouchListener(eVar);
        if (this.f7915k == null) {
            this.f7915k = new C3246g(this.f7912h);
        }
        this.f7915k.mo19059a(eVar);
    }

    /* renamed from: b */
    public void mo19190b() {
        C3904y.m12853a((View) this.f7906b, 0);
        C3904y.m12853a((View) this.f7905a, 0);
        C3246g gVar = this.f7915k;
        if (gVar != null) {
            gVar.mo19058a();
        }
    }

    /* renamed from: c */
    public void mo19191c() {
        TTRoundRectImageView tTRoundRectImageView = this.f7907c;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, (int) C3904y.m12868b(this.f7912h, 50.0f), 0, 0);
            this.f7907c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo19186a(C3431n nVar) {
        if (nVar.mo19589aw()) {
            if (this.f7915k == null) {
                this.f7915k = new C3246g(this.f7912h);
            }
            this.f7915k.mo19060a(nVar);
            return;
        }
        if (!(this.f7907c == null || nVar.mo19520M() == null || TextUtils.isEmpty(nVar.mo19520M().mo19468a()))) {
            C3792d.m12395a().mo20613a(nVar.mo19520M(), (ImageView) this.f7907c);
        }
        TTRatingBar2 tTRatingBar2 = this.f7909e;
        if (tTRatingBar2 != null) {
            C3904y.m12861a((TextView) null, tTRatingBar2, nVar, (Context) this.f7912h);
        }
        if (this.f7908d != null) {
            if (nVar.mo19567aa() == null || TextUtils.isEmpty(nVar.mo19567aa().mo19404b())) {
                this.f7908d.setText(nVar.mo19528U());
            } else {
                this.f7908d.setText(nVar.mo19567aa().mo19404b());
            }
        }
        TextView textView = this.f7910f;
        if (textView != null) {
            C3904y.m12859a(textView, nVar, (Context) this.f7912h, "tt_comment_num_backup");
        }
    }

    /* renamed from: a */
    public void mo19188a(String str) {
        TextView textView;
        if (!TextUtils.isEmpty(str) && (textView = this.f7911g) != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo19187a(final C3431n nVar, final String str) {
        this.f7914j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m8711a(C3317a.this.f7912h, nVar, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo19189a(C3232e eVar) {
        C3246g gVar = this.f7915k;
        if (gVar == null || !gVar.mo19061a(eVar)) {
            return false;
        }
        C3904y.m12853a((View) this.f7906b, 0);
        C3904y.m12853a((View) this.f7905a, 8);
        return true;
    }
}
