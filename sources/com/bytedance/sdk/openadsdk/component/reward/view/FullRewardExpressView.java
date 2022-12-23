package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.adexpress.p093b.C2552c;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3552j;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3559o;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class FullRewardExpressView extends NativeExpressView {

    /* renamed from: c */
    public static float f7898c = 100.0f;

    /* renamed from: a */
    C3552j f7899a;

    /* renamed from: b */
    FullRewardExpressBackupView f7900b;

    public FullRewardExpressView(Context context, C3431n nVar, AdSlot adSlot, String str, boolean z) {
        super(context, nVar, adSlot, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19177g() {
        this.f8871m = true;
        this.f8869k = new FrameLayout(this.f8864f);
        addView(this.f8869k, new FrameLayout.LayoutParams(-1, -1));
        super.mo19177g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        m9812h();
    }

    /* renamed from: h */
    private void m9812h() {
        setBackupListener(new C2552c() {
            /* renamed from: a */
            public boolean mo16640a(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).mo20038m();
                    FullRewardExpressView.this.f7900b = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.f7900b.mo20014a(FullRewardExpressView.this.f8867i, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16730a(C2553d<? extends View> dVar, C2565m mVar) {
        if (dVar instanceof C3559o) {
            C3559o oVar = (C3559o) dVar;
            if (oVar.mo20109p() != null) {
                oVar.mo20109p().mo20338a((C3552j) this);
            }
        }
        if (mVar != null && mVar.mo16708a()) {
            m9809a(mVar);
        }
        super.mo16730a(dVar, mVar);
    }

    public void setExpressVideoListenerProxy(C3552j jVar) {
        this.f7899a = jVar;
    }

    /* renamed from: a */
    private void m9809a(final C2565m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m9811b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        FullRewardExpressView.this.m9811b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9811b(C2565m mVar) {
        if (mVar != null) {
            double d = mVar.mo16717d();
            double e = mVar.mo16720e();
            double f = mVar.mo16722f();
            double g = mVar.mo16724g();
            int b = (int) C3904y.m12868b(this.f8864f, (float) d);
            int b2 = (int) C3904y.m12868b(this.f8864f, (float) e);
            int b3 = (int) C3904y.m12868b(this.f8864f, (float) f);
            int b4 = (int) C3904y.m12868b(this.f8864f, (float) g);
            C2905l.m8111b("ExpressView", "videoWidth:" + f);
            C2905l.m8111b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8869k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f8869k.setLayoutParams(layoutParams);
            this.f8869k.removeAllViews();
        }
    }

    /* renamed from: a */
    public void mo18407a(boolean z) {
        C2905l.m8111b("FullRewardExpressView", "onMuteVideo,mute:" + z);
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18407a(z);
        }
        setSoundMute(z);
    }

    /* renamed from: a */
    public void mo18405a() {
        C2905l.m8111b("FullRewardExpressView", "onSkipVideo");
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18405a();
        }
    }

    /* renamed from: b */
    public void mo18408b() {
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18408b();
        }
    }

    /* renamed from: a */
    public void mo18406a(int i) {
        C2905l.m8111b("FullRewardExpressView", "onChangeVideoState,stateType:" + i);
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18406a(i);
        }
    }

    /* renamed from: c */
    public long mo18410c() {
        C2905l.m8111b("FullRewardExpressView", "onGetCurrentPlayTime");
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            return jVar.mo18410c();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo18411d() {
        C2905l.m8111b("FullRewardExpressView", "onGetVideoState");
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            return jVar.mo18411d();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo18412e() {
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18412e();
        }
    }

    /* renamed from: a */
    public void mo16644a(View view, int i, C2548b bVar) {
        if (i == -1 || bVar == null || i != 3) {
            super.mo16644a(view, i, bVar);
        } else {
            mo18412e();
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (mo20039n()) {
            return this.f7900b.getVideoContainer();
        }
        return this.f8869k;
    }

    public View getBackupContainerBackgroundView() {
        if (mo20039n()) {
            return this.f7900b.getBackupContainerBackgroundView();
        }
        return null;
    }

    /* renamed from: b */
    public void mo18409b(int i) {
        C3552j jVar = this.f7899a;
        if (jVar != null) {
            jVar.mo18409b(i);
        }
    }
}
