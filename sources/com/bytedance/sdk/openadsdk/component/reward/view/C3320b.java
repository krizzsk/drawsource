package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3545e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3546f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3552j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.b */
/* compiled from: RewardFullExpressVideoLayout */
public class C3320b {

    /* renamed from: a */
    C3968c f7920a;

    /* renamed from: b */
    Handler f7921b;

    /* renamed from: c */
    boolean f7922c = false;

    /* renamed from: d */
    boolean f7923d = false;

    /* renamed from: e */
    boolean f7924e = false;

    /* renamed from: f */
    private Activity f7925f;

    /* renamed from: g */
    private C3431n f7926g;

    /* renamed from: h */
    private String f7927h;

    /* renamed from: i */
    private FullRewardExpressView f7928i;

    public C3320b(Activity activity) {
        this.f7925f = activity;
    }

    /* renamed from: a */
    public void mo19197a(C3431n nVar, AdSlot adSlot, String str, boolean z) {
        if (!this.f7924e) {
            this.f7924e = true;
            this.f7926g = nVar;
            this.f7927h = str;
            this.f7928i = new FullRewardExpressView(this.f7925f, nVar, adSlot, str, z);
        }
    }

    /* renamed from: a */
    public FullRewardExpressView mo19194a() {
        return this.f7928i;
    }

    /* renamed from: b */
    public FrameLayout mo19201b() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.f7928i.mo20039n()) {
            mo19195a(videoFrameLayout);
        }
        return videoFrameLayout;
    }

    /* renamed from: c */
    public boolean mo19203c() {
        return this.f7922c;
    }

    /* renamed from: a */
    public void mo19200a(boolean z) {
        this.f7922c = z;
    }

    /* renamed from: d */
    public boolean mo19204d() {
        return this.f7923d;
    }

    /* renamed from: b */
    public void mo19202b(boolean z) {
        this.f7923d = z;
    }

    /* renamed from: a */
    public void mo19198a(C3546f fVar, C3545e eVar) {
        C3431n nVar;
        if (this.f7928i != null && (nVar = this.f7926g) != null) {
            this.f7920a = m9836a(nVar);
            C3090e.m8903a(this.f7926g);
            EmptyView a = m9835a((ViewGroup) this.f7928i);
            if (a == null) {
                a = new EmptyView(this.f7925f, this.f7928i);
                this.f7928i.addView(a);
            }
            fVar.mo19305a((View) this.f7928i);
            fVar.mo19311a(this.f7920a);
            this.f7928i.setClickListener(fVar);
            eVar.mo19305a((View) this.f7928i);
            eVar.mo19311a(this.f7920a);
            this.f7928i.setClickCreativeListener(eVar);
            a.setNeedCheckingShow(false);
        }
    }

    /* renamed from: a */
    private C3968c m9836a(C3431n nVar) {
        if (nVar.mo19519L() == 4) {
            return C3969d.m13089a(this.f7925f, nVar, this.f7927h);
        }
        return null;
    }

    /* renamed from: a */
    private EmptyView m9835a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo19199a(C3552j jVar) {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressVideoListenerProxy(jVar);
        }
    }

    /* renamed from: a */
    public void mo19196a(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressInteractionListener(expressAdInteractionListener);
        }
    }

    /* renamed from: e */
    public Handler mo19205e() {
        if (this.f7921b == null) {
            this.f7921b = new Handler(Looper.getMainLooper());
        }
        return this.f7921b;
    }

    /* renamed from: f */
    public void mo19206f() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20037l();
        }
        Handler handler = this.f7921b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: g */
    public void mo19207g() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20036k();
        }
    }

    /* renamed from: h */
    public boolean mo19208h() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.mo20039n();
    }

    /* renamed from: i */
    public int mo19209i() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo19210j() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20034i();
        }
    }

    /* renamed from: k */
    public void mo19211k() {
        FullRewardExpressView fullRewardExpressView = this.f7928i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20035j();
            this.f7928i.mo20036k();
        }
    }

    /* renamed from: a */
    public void mo19195a(FrameLayout frameLayout) {
        C3431n nVar = this.f7926g;
        if (nVar != null && C3431n.m10311c(nVar) && this.f7926g.mo19656t() == 3 && this.f7926g.mo19660v() == 0) {
            try {
                if (this.f7926g.mo19579am() == 1) {
                    int e = C3904y.m12886e(C3513m.m10963a(), 90.0f);
                    FrameLayout frameLayout2 = (FrameLayout) this.f7928i.getBackupContainerBackgroundView();
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.bottomMargin = e;
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
