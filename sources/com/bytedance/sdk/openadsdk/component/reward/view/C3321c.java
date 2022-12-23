package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.c */
/* compiled from: RewardFullNativeVideoLayout */
public class C3321c extends C3322d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19213a() {
        return false;
    }

    public C3321c(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public void mo19212a(int i, int i2) {
        super.mo19212a(i, i2);
        if (this.f7934c != null && C3431n.m10311c(this.f7934c) && this.f7934c.mo19656t() == 3 && this.f7934c.mo19660v() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f7933b.findViewById(C2914t.m8158e(this.f7933b, "tt_video_container_back"));
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f7934c.mo19579am() == 1) {
                    int e = C3904y.m12886e(C3513m.m10963a(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = e;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
