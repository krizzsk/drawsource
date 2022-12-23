package com.bytedance.sdk.openadsdk.core.p144b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.e */
/* compiled from: RewardBarClickListener */
public abstract class C3365e extends C3359a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18392a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3, boolean z);

    public C3365e(Context context, C3431n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        View view2 = view;
        if (mo19315a(view, z)) {
            mo18392a(view, f, f2, f3, f4, sparseArray, this.f8069A, this.f8081y, this.f8082z, z);
        }
        super.mo18383a(view, f, f2, f3, f4, sparseArray, z);
    }
}
