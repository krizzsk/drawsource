package com.bytedance.sdk.openadsdk.component.p134a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.a */
/* compiled from: TTAppOpenAdClickListener */
public class C3190a extends C3359a {
    public C3190a(Context context, C3431n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        if (view.getId() == C2914t.m8158e(C3513m.m10963a(), "tt_open_ad_click_button")) {
            mo19312a("click_bar");
        } else {
            mo19312a("click_material");
        }
        super.mo18383a(view, f, f2, f3, f4, sparseArray, z);
    }
}
