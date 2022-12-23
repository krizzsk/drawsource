package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class FullRewardExpressBackupView extends BackupView {

    /* renamed from: a */
    private View f8820a;

    /* renamed from: m */
    private NativeExpressView f8821m;

    /* renamed from: n */
    private FrameLayout f8822n;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.f8806b = context;
    }

    /* renamed from: a */
    public void mo20014a(C3431n nVar, NativeExpressView nativeExpressView) {
        C2905l.m8111b("FullRewardExpressBackupView", "show backup view");
        if (nVar != null) {
            setBackgroundColor(-1);
            this.f8807c = nVar;
            this.f8821m = nativeExpressView;
            if (C3898x.m12790e(this.f8807c) == 7) {
                this.f8810f = "rewarded_video";
            } else {
                this.f8810f = "fullscreen_interstitial_ad";
            }
            m11006b();
            this.f8821m.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    /* renamed from: b */
    private void m11006b() {
        this.f8811g = C3904y.m12886e(this.f8806b, (float) this.f8821m.getExpectExpressWidth());
        this.f8812h = C3904y.m12886e(this.f8806b, (float) this.f8821m.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f8811g, this.f8812h);
        }
        layoutParams.width = this.f8811g;
        layoutParams.height = this.f8812h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f8807c.mo19660v();
        m11007c();
    }

    /* renamed from: c */
    private void m11007c() {
        View inflate = LayoutInflater.from(this.f8806b).inflate(C2914t.m8159f(this.f8806b, "tt_backup_full_reward"), this, true);
        this.f8820a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C2914t.m8158e(this.f8806b, "tt_bu_video_container"));
        this.f8822n = frameLayout;
        frameLayout.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.f8822n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19169a(View view, int i, C3414j jVar) {
        NativeExpressView nativeExpressView = this.f8821m;
        if (nativeExpressView != null) {
            nativeExpressView.mo16644a(view, i, (C2548b) jVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.f8820a;
    }
}
