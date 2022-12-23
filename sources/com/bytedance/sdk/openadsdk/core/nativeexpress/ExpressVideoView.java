package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f8819q = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20003a(boolean z) {
    }

    public ExpressVideoView(Context context, C3431n nVar, String str, C3100j jVar) {
        super(context, nVar, false, str, false, false, jVar);
        if ("draw_ad".equals(str)) {
            this.f8819q = true;
        }
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20004b() {
        if (!this.f9202e || !C3559o.m11210b(this.f9209l)) {
            this.f9201d = false;
        }
        super.mo20004b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20005c() {
        if (this.f8819q) {
            super.mo20005c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f8819q = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.f9199b != null) {
            this.f9199b.mo16040e(z);
        }
    }

    /* renamed from: d */
    public void mo20006d() {
        if (this.f9207j != null) {
            C3904y.m12853a((View) this.f9207j, 8);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f9206i == null || this.f9206i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m11000o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f9206i == null || this.f9206i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m11000o();
        }
    }

    /* renamed from: n */
    private void m10999n() {
        C3904y.m12853a((View) this.f9204g, 0);
        C3904y.m12853a((View) this.f9205h, 0);
        C3904y.m12853a((View) this.f9207j, 8);
    }

    /* renamed from: o */
    private void m11000o() {
        mo20210g();
        if (this.f9204g != null) {
            if (this.f9204g.getVisibility() != 0) {
                C3792d.m12395a().mo20614a(this.f9198a.mo19517J().mo15951h(), this.f9205h);
            } else {
                return;
            }
        }
        m10999n();
    }

    public void onClick(View view) {
        if (this.f9206i != null && this.f9206i.getVisibility() == 0) {
            C3904y.m12887e((View) this.f9204g);
        }
        mo20005c();
    }

    public void setShowAdInteractionView(boolean z) {
        C2403b o;
        if (this.f9199b != null && (o = this.f9199b.mo16050o()) != null) {
            o.mo16019a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20007e() {
        mo20210g();
        C3904y.m12853a((View) this.f9204g, 0);
    }
}
