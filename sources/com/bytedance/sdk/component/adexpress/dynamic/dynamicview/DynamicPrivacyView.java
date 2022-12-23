package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;

public class DynamicPrivacyView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private TextView f5769a = new TextView(this.f5750k);

    /* renamed from: b */
    private TextView f5770b = new TextView(this.f5750k);

    /* renamed from: s */
    private TextView f5771s = new TextView(this.f5750k);

    /* renamed from: t */
    private LinearLayout f5772t = new LinearLayout(this.f5750k);

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5769a.setTag(9);
        this.f5770b.setTag(10);
        addView(this.f5772t, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo17151d() {
        this.f5769a.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f5769a.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f5770b.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f5770b.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f5746g, this.f5747h);
    }

    /* renamed from: h */
    public boolean mo17171h() {
        this.f5770b.setText("权限列表");
        this.f5771s.setText(" | ");
        this.f5769a.setText("隐私政策");
        if (this.f5751l != null) {
            this.f5770b.setTextColor(this.f5751l.mo17040g());
            this.f5770b.setTextSize(this.f5751l.mo17038e());
            this.f5771s.setTextColor(this.f5751l.mo17040g());
            this.f5769a.setTextColor(this.f5751l.mo17040g());
            this.f5769a.setTextSize(this.f5751l.mo17038e());
        } else {
            this.f5770b.setTextColor(-1);
            this.f5770b.setTextSize(12.0f);
            this.f5771s.setTextColor(-1);
            this.f5769a.setTextColor(-1);
            this.f5769a.setTextSize(12.0f);
        }
        this.f5772t.addView(this.f5770b);
        this.f5772t.addView(this.f5771s);
        this.f5772t.addView(this.f5769a);
        return false;
    }
}
