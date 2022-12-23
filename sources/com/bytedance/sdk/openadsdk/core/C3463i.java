package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3545e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3546f;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;

/* renamed from: com.bytedance.sdk.openadsdk.core.i */
/* compiled from: H5AdInteractionManager */
public class C3463i {

    /* renamed from: a */
    private final Context f8545a;

    /* renamed from: b */
    private final C3431n f8546b;

    /* renamed from: c */
    private C3968c f8547c;

    /* renamed from: d */
    private C3546f f8548d;

    /* renamed from: e */
    private C3545e f8549e;

    /* renamed from: f */
    private View f8550f;

    /* renamed from: g */
    private String f8551g = "rewarded_video";

    public C3463i(Context context, C3431n nVar, View view) {
        this.f8546b = nVar;
        this.f8545a = context;
        this.f8550f = view;
        this.f8551g = C3898x.m12769b(C3898x.m12790e(nVar));
        if (this.f8546b.mo19519L() == 4) {
            this.f8547c = C3969d.m13089a(this.f8545a, this.f8546b, this.f8551g);
        }
        String str = this.f8551g;
        C3546f fVar = new C3546f(context, nVar, str, C3898x.m12747a(str));
        this.f8548d = fVar;
        fVar.mo19305a(this.f8550f);
        this.f8548d.mo19311a(this.f8547c);
        String str2 = this.f8551g;
        C3545e eVar = new C3545e(context, nVar, str2, C3898x.m12747a(str2));
        this.f8549e = eVar;
        eVar.mo19305a(this.f8550f);
        this.f8549e.mo19311a(this.f8547c);
    }

    /* renamed from: a */
    public void mo19790a(int i, C3414j jVar) {
        C3545e eVar;
        if (i != -1 && jVar != null) {
            float f = jVar.f8265a;
            float f2 = jVar.f8266b;
            float f3 = jVar.f8267c;
            float f4 = jVar.f8268d;
            SparseArray<C3362c.C3363a> sparseArray = jVar.f8278n;
            if (i == 1) {
                C3546f fVar = this.f8548d;
                if (fVar != null) {
                    fVar.mo20093a(jVar);
                    this.f8548d.mo18383a(this.f8550f, f, f2, f3, f4, sparseArray, true);
                }
            } else if (i == 2 && (eVar = this.f8549e) != null) {
                eVar.mo20092a(jVar);
                this.f8549e.mo18383a(this.f8550f, f, f2, f3, f4, sparseArray, true);
            }
        }
    }
}
