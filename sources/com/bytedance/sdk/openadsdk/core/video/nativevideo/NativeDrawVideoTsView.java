package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3559o;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class NativeDrawVideoTsView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f9184q;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20004b() {
        if (!this.f9202e || !C3559o.m11210b(this.f9209l)) {
            this.f9201d = false;
        }
        this.f9209l = "draw_ad";
        C3513m.m10973h().mo19873o(String.valueOf(C3898x.m12794f(this.f9198a)));
        super.mo20004b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20005c() {
        if (this.f9184q) {
            super.mo20005c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f9184q = z;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f9206i == null || this.f9206i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m11598e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f9206i == null || this.f9206i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m11598e();
        }
    }

    /* renamed from: d */
    private void m11597d() {
        C3904y.m12853a((View) this.f9204g, 0);
        C3904y.m12853a((View) this.f9205h, 0);
        C3904y.m12853a((View) this.f9207j, 8);
    }

    /* renamed from: e */
    private void m11598e() {
        mo20210g();
        if (this.f9204g != null) {
            if (this.f9204g.getVisibility() != 0) {
                C3792d.m12395a().mo20614a(this.f9198a.mo19517J().mo15951h(), this.f9205h);
            } else {
                return;
            }
        }
        m11597d();
    }

    public void onClick(View view) {
        if (this.f9206i != null && this.f9206i.getVisibility() == 0) {
            C3904y.m12887e((View) this.f9204g);
        }
        mo20005c();
    }
}
