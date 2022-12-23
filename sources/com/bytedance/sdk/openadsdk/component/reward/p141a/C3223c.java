package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.C2620c;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.component.reward.top.C3312b;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.c */
/* compiled from: RewardFullTopProxyManager */
public class C3223c {

    /* renamed from: a */
    TopProxyLayout f7596a;

    /* renamed from: b */
    C2620c f7597b;

    /* renamed from: c */
    private Activity f7598c;

    /* renamed from: d */
    private boolean f7599d = false;

    public C3223c(Activity activity) {
        this.f7598c = activity;
    }

    /* renamed from: a */
    public void mo18934a() {
        if (!this.f7599d) {
            this.f7599d = true;
            m9376e();
        }
    }

    /* renamed from: e */
    private void m9376e() {
        Activity activity = this.f7598c;
        this.f7596a = (TopProxyLayout) activity.findViewById(C2914t.m8158e(activity, "tt_top_layout_proxy"));
    }

    /* renamed from: a */
    public void mo18940a(boolean z, C3431n nVar) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19164a(z, nVar);
        }
    }

    /* renamed from: a */
    public void mo18939a(boolean z) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z);
        }
    }

    /* renamed from: b */
    public void mo18943b(boolean z) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        C2620c cVar = this.f7597b;
        if (cVar != null) {
            cVar.setSoundMute(z);
        }
    }

    /* renamed from: c */
    public void mo18946c(boolean z) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z);
        }
    }

    /* renamed from: d */
    public void mo18948d(boolean z) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z);
        }
    }

    /* renamed from: a */
    public void mo18938a(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19152a((CharSequence) String.valueOf(str), charSequence);
        }
    }

    /* renamed from: e */
    public void mo18949e(boolean z) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z);
        }
    }

    /* renamed from: b */
    public void mo18941b() {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19151a();
        }
    }

    /* renamed from: c */
    public void mo18944c() {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19153b();
        }
    }

    /* renamed from: d */
    public void mo18947d() {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19154c();
        }
    }

    /* renamed from: a */
    public void mo18937a(C3312b bVar) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo18936a(C2620c cVar) {
        this.f7597b = cVar;
    }

    /* renamed from: a */
    public void mo18935a(int i) {
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null && (topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.f7596a.getLayoutParams()).topMargin = i - C3904y.m12886e(this.f7598c, 20.0f);
        }
    }

    /* renamed from: b */
    public void mo18942b(int i) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.f7596a;
        if (topProxyLayout != null && topProxyLayout.getITopLayout() != null && (findViewById = this.f7596a.getITopLayout().findViewById(C2914t.m8158e(C3513m.m10963a(), "tt_top_dislike"))) != null && (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && findViewById.getWidth() > 0 && findViewById.getVisibility() == 0) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int width = i - (iArr[0] + findViewById.getWidth());
            if (width < C3904y.m12886e(this.f7598c, 16.0f)) {
                ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += C3904y.m12886e(this.f7598c, 16.0f) - width;
                findViewById.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public void mo18945c(int i) {
        this.f7596a.setVisibility(i);
    }
}
