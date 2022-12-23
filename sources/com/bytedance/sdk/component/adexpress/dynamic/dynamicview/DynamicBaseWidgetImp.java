package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2898h;

public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InteractViewContainer f5759a;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        String b = hVar.mo17082i().mo16876b();
        if ("logo-union".equals(b)) {
            dynamicRootView.setLogoUnionHeight(this.f5747h - ((int) C2572b.m6622a(context, (float) (this.f5751l.mo17035b() + this.f5751l.mo17032a()))));
        } else if ("scoreCountWithIcon".equals(b)) {
            dynamicRootView.setScoreCountWithIcon(this.f5747h - ((int) C2572b.m6622a(context, (float) (this.f5751l.mo17035b() + this.f5751l.mo17032a()))));
        }
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        final View view = this.f5754o == null ? this : this.f5754o;
        view.setContentDescription(this.f5751l.mo17031K());
        Drawable backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f5751l.mo17057x() > 0) {
            postDelayed(new Runnable() {
                public void run() {
                    try {
                        view.setBackground(DynamicBaseWidgetImp.this.mo17145a(true, DynamicBaseWidgetImp.this.f5753n.getBgColor()));
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f5751l.mo17057x() * 1000));
        }
        if (this.f5754o != null) {
            this.f5754o.setPadding((int) C2572b.m6622a(this.f5750k, (float) this.f5751l.mo17036c()), (int) C2572b.m6622a(this.f5750k, (float) this.f5751l.mo17035b()), (int) C2572b.m6622a(this.f5750k, (float) this.f5751l.mo17037d()), (int) C2572b.m6622a(this.f5750k, (float) this.f5751l.mo17032a()));
        }
        if (this.f5755p || this.f5751l.mo17047n() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        final View view = this.f5754o == null ? this : this.f5754o;
        double l = this.f5752m.mo17082i().mo16882e().mo16983l();
        if (l < 90.0d && l > 0.0d) {
            C2898h.m8094b().postDelayed(new Runnable() {
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (l * 1000.0d));
        }
        double k = this.f5752m.mo17082i().mo16882e().mo16979k();
        if (k > 0.0d) {
            C2898h.m8094b().postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f5752m.mo17082i().mo16882e().mo16921ac() == null) {
                        view.setVisibility(0);
                        DynamicBaseWidgetImp.this.setVisibility(0);
                    }
                }
            }, (long) (k * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.f5751l.mo17024D())) {
            mo17130a();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void mo17130a() {
        int G = this.f5751l.mo17027G();
        int H = this.f5751l.mo17028H();
        postDelayed(new Runnable() {
            public void run() {
                if (DynamicBaseWidgetImp.this.f5753n == null || DynamicBaseWidgetImp.this.f5753n.getRenderRequest() == null) {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    Context context = DynamicBaseWidgetImp.this.f5750k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused = dynamicBaseWidgetImp.f5759a = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.f5751l);
                } else {
                    C2563l renderRequest = DynamicBaseWidgetImp.this.f5753n.getRenderRequest();
                    int p = renderRequest.mo16686p();
                    int q = renderRequest.mo16687q();
                    DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                    Context context2 = DynamicBaseWidgetImp.this.f5750k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused2 = dynamicBaseWidgetImp3.f5759a = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.f5751l, p, q);
                }
                DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp5.mo17149a((View) dynamicBaseWidgetImp5.f5759a);
                DynamicBaseWidgetImp.this.f5759a.setTag(2);
                DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp6.addView(dynamicBaseWidgetImp6.f5759a, new FrameLayout.LayoutParams(-1, -1));
                DynamicBaseWidgetImp.this.f5759a.mo17215b();
            }
        }, ((long) G) * 1000);
        if (H < Integer.MAX_VALUE && G < H) {
            postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f5759a != null) {
                        DynamicBaseWidgetImp.this.f5759a.setVisibility(8);
                    }
                }
            }, ((long) H) * 1000);
        }
    }
}
