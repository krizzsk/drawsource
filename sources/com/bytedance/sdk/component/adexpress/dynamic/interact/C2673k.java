package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideView;
import com.bytedance.sdk.component.utils.C2914t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.k */
/* compiled from: WriggleGuideInteract */
public class C2673k implements C2663b<WriggleGuideAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WriggleGuideAnimationView f5858a;

    /* renamed from: b */
    private Context f5859b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f5860c;

    /* renamed from: d */
    private C2617g f5861d;

    /* renamed from: e */
    private String f5862e;

    /* renamed from: f */
    private int f5863f;

    public C2673k(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar, String str, int i) {
        this.f5859b = context;
        this.f5860c = dynamicBaseWidget;
        this.f5861d = gVar;
        this.f5862e = str;
        this.f5863f = i;
        m7221e();
    }

    /* renamed from: e */
    private void m7221e() {
        int F = this.f5861d.mo17026F();
        if ("18".equals(this.f5862e)) {
            Context context = this.f5859b;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, C2914t.m8159f(context, "tt_hand_wriggle_guide"), this.f5863f);
            this.f5858a = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.f5858a.getWriggleLayout().setOnClickListener((View.OnClickListener) this.f5860c.getDynamicClickListener());
            }
            if (this.f5858a.getTopTextView() != null) {
                this.f5858a.getTopTextView().setText(C2914t.m8154b(this.f5859b, "tt_splash_wriggle_top_text_style_17"));
            }
        } else {
            Context context2 = this.f5859b;
            this.f5858a = new WriggleGuideAnimationView(context2, C2914t.m8159f(context2, "tt_hand_wriggle_guide"), this.f5863f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2572b.m6622a(this.f5859b, (float) F);
        this.f5858a.setLayoutParams(layoutParams);
        this.f5858a.setShakeText(this.f5861d.mo17029I());
        this.f5858a.setClipChildren(false);
        final WriggleGuideView wriggleProgressIv = this.f5858a.getWriggleProgressIv();
        this.f5858a.setOnShakeViewListener(new WriggleGuideAnimationView.C2706a() {
            /* renamed from: a */
            public void mo17235a() {
                WriggleGuideView wriggleGuideView = wriggleProgressIv;
                if (wriggleGuideView != null) {
                    wriggleGuideView.mo17383a(new WriggleGuideView.C2708a() {
                        /* renamed from: a */
                        public void mo17236a() {
                            C2673k.this.f5858a.setOnClickListener((View.OnClickListener) C2673k.this.f5860c.getDynamicClickListener());
                            C2673k.this.f5858a.performClick();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5858a.mo17368a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5858a.clearAnimation();
    }

    /* renamed from: c */
    public WriggleGuideAnimationView mo17224d() {
        return this.f5858a;
    }
}
