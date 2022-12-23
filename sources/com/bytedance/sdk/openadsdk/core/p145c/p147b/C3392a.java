package com.bytedance.sdk.openadsdk.core.p145c.p147b;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2642a;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.b.a */
/* compiled from: DynamicClickListener */
public class C3392a extends C3362c implements C2642a {

    /* renamed from: a */
    protected WeakReference<View> f8175a;

    /* renamed from: b */
    protected WeakReference<View> f8176b;

    /* renamed from: c */
    private C2561j f8177c;

    /* renamed from: a */
    public void mo17133a(C2561j jVar) {
        this.f8177c = jVar;
    }

    /* renamed from: a */
    public void mo17132a(View view) {
        this.f8175a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public void mo17134b(View view) {
        this.f8176b = new WeakReference<>(view);
    }

    /* renamed from: a */
    public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        m10093a(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    /* renamed from: a */
    private void m10093a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray) {
        if (this.f8177c != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f8176b;
            if (weakReference != null) {
                int[] a = C3904y.m12867a((View) weakReference.get());
                if (a != null) {
                    iArr = a;
                }
                int[] c = C3904y.m12880c((View) this.f8176b.get());
                if (c != null) {
                    iArr2 = c;
                }
            }
            String str = "";
            try {
                if (view.getTag(C2914t.m8158e(view.getContext(), "tt_id_click_area_type")) != null) {
                    str = String.valueOf(view.getTag(C2914t.m8158e(view.getContext(), "tt_id_click_area_type")));
                }
            } catch (Exception unused) {
            }
            this.f8177c.mo16669a(view, i, new C3414j.C3416a().mo19464d(f).mo19462c(f2).mo19459b(f3).mo19451a(f4).mo19461b(this.f8079w).mo19453a(this.f8080x).mo19463c(iArr[0]).mo19465d(iArr[1]).mo19466e(iArr2[0]).mo19467f(iArr2[1]).mo19454a(sparseArray).mo19457a(this.f8070C).mo19455a(str).mo19458a());
        }
    }
}
