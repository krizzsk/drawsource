package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.utils.C2914t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.h */
/* compiled from: ShakeInteract */
public class C2669h implements C2663b<ShakeAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ShakeAnimationView f5843a;

    /* renamed from: b */
    private Context f5844b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f5845c;

    /* renamed from: d */
    private C2617g f5846d;

    /* renamed from: e */
    private String f5847e;

    /* renamed from: f */
    private int f5848f;

    public C2669h(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar, String str, int i) {
        this.f5844b = context;
        this.f5845c = dynamicBaseWidget;
        this.f5846d = gVar;
        this.f5847e = str;
        this.f5848f = i;
        m7204e();
    }

    /* renamed from: e */
    private void m7204e() {
        if ("16".equals(this.f5847e)) {
            Context context = this.f5844b;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, C2914t.m8159f(context, "tt_hand_shake_interaction_type_16"), this.f5848f);
            this.f5843a = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.f5843a.getShakeLayout().setOnClickListener((View.OnClickListener) this.f5845c.getDynamicClickListener());
            }
        } else {
            Context context2 = this.f5844b;
            this.f5843a = new ShakeAnimationView(context2, C2914t.m8159f(context2, "tt_hand_shake"), this.f5848f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2572b.m6622a(this.f5844b, 80.0f);
        this.f5843a.setLayoutParams(layoutParams);
        this.f5843a.setShakeText(this.f5846d.mo17029I());
        this.f5843a.setClipChildren(false);
        this.f5843a.setOnShakeViewListener(new ShakeAnimationView.C2691a() {
            /* renamed from: a */
            public void mo17232a() {
                C2669h.this.f5843a.setOnClickListener((View.OnClickListener) C2669h.this.f5845c.getDynamicClickListener());
                C2669h.this.f5843a.performClick();
            }
        });
    }

    /* renamed from: a */
    public void mo17221a() {
        this.f5843a.mo17323a();
    }

    /* renamed from: b */
    public void mo17222b() {
        this.f5843a.clearAnimation();
    }

    /* renamed from: c */
    public ShakeAnimationView mo17224d() {
        return this.f5843a;
    }
}
