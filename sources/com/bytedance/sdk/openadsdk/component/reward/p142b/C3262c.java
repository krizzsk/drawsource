package com.bytedance.sdk.openadsdk.component.reward.p142b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3223c;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3255a;
import com.bytedance.sdk.openadsdk.component.reward.view.C3322d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.c */
/* compiled from: RewardFullTypeInteraction */
public class C3262c extends C3255a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public FullInteractionStyleView f7735i;

    public C3262c(Activity activity, C3431n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
    }

    /* renamed from: a */
    public void mo19082a(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.f7710a, this.f7716g);
        this.f7735i = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.f7717h);
        this.f7735i.mo19170a(this.f7711b, this.f7715f, this.f7714e, this.f7712c, this.f7713d);
        frameLayout.addView(this.f7735i.getInteractionStyleRootView());
    }

    /* renamed from: a */
    public static boolean m9622a(C3431n nVar) {
        return (nVar == null || nVar.mo19580an() == 100.0f) ? false : true;
    }

    /* renamed from: a */
    public C3255a.C3256a mo19079a() {
        return new C3255a.C3256a() {
            /* renamed from: a */
            public void mo19088a(boolean z) {
                if (C3262c.this.f7735i != null) {
                    C3262c.this.f7735i.setIsMute(z);
                }
            }
        };
    }

    /* renamed from: d */
    public FrameLayout mo19096d() {
        FullInteractionStyleView fullInteractionStyleView = this.f7735i;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo19086b() {
        return m9623e();
    }

    /* renamed from: c */
    public boolean mo19087c() {
        return m9623e();
    }

    /* renamed from: a */
    public void mo19083a(C3223c cVar, C3322d dVar) {
        dVar.mo19225b(8);
        dVar.mo19216a(8);
        if (this.f7711b.mo19634l() == 2) {
            cVar.mo18939a(false);
            cVar.mo18946c(false);
            cVar.mo18948d(false);
            dVar.mo19230d(8);
            return;
        }
        cVar.mo18939a(this.f7711b.mo19582ap());
        cVar.mo18946c(m9623e());
        cVar.mo18948d(m9623e());
        if (m9623e()) {
            dVar.mo19230d(8);
            return;
        }
        cVar.mo18947d();
        dVar.mo19230d(0);
    }

    /* renamed from: e */
    private boolean m9623e() {
        return C3431n.m10311c(this.f7711b);
    }
}
