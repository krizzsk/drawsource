package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a */
/* compiled from: RewardFullDownloadManager */
public class C3218a {

    /* renamed from: a */
    C3968c f7572a;

    /* renamed from: b */
    private Activity f7573b;

    /* renamed from: c */
    private C3431n f7574c;

    /* renamed from: d */
    private String f7575d;

    /* renamed from: e */
    private boolean f7576e = false;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a$a */
    /* compiled from: RewardFullDownloadManager */
    public interface C3219a {
        /* renamed from: a */
        void mo18393a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3);

        /* renamed from: a */
        void mo18394a(String str, JSONObject jSONObject);
    }

    public C3218a(Activity activity) {
        this.f7573b = activity;
    }

    /* renamed from: a */
    public void mo18907a(C3431n nVar, String str) {
        if (!this.f7576e) {
            this.f7576e = true;
            this.f7574c = nVar;
            this.f7575d = str;
            m9336d();
        }
    }

    /* renamed from: d */
    private void m9336d() {
        if (C3948b.m12959c()) {
            C3431n nVar = this.f7574c;
            if (nVar != null && nVar.mo19519L() == 4) {
                this.f7572a = C3969d.m13089a(this.f7573b, this.f7574c, this.f7575d);
                return;
            }
            return;
        }
        this.f7572a = C3580t.m11322a().mo20139g();
    }

    /* renamed from: a */
    public void mo18905a() {
        C3431n nVar;
        if (this.f7572a == null && (nVar = this.f7574c) != null) {
            this.f7572a = C3969d.m13089a(this.f7573b, nVar, this.f7575d);
        }
    }

    /* renamed from: b */
    public void mo18908b() {
        C3968c cVar = this.f7572a;
        if (cVar != null) {
            cVar.mo20860d();
        }
    }

    /* renamed from: c */
    public C3968c mo18909c() {
        return this.f7572a;
    }

    /* renamed from: a */
    public void mo18906a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3, C3219a aVar) {
        C3219a aVar2 = aVar;
        if (this.f7572a == null) {
            aVar.mo18393a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        } else if (view.getId() == C2914t.m8158e(this.f7573b, "tt_rb_score")) {
            aVar2.mo18394a("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == C2914t.m8158e(this.f7573b, "tt_comment_vertical")) {
            aVar2.mo18394a("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == C2914t.m8158e(this.f7573b, "tt_reward_ad_appname")) {
            aVar2.mo18394a("click_play_source", (JSONObject) null);
        } else if (view.getId() == C2914t.m8158e(this.f7573b, "tt_reward_ad_icon")) {
            aVar2.mo18394a("click_play_logo", (JSONObject) null);
        }
    }
}
