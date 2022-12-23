package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.view.ViewGroup;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3606a;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.h */
/* compiled from: RewardVideoController */
public class C3289h extends C3606a {

    /* renamed from: z */
    private C3100j f7799z;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo18885t() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18891z() {
    }

    public C3289h(Context context, ViewGroup viewGroup, C3431n nVar, C3100j jVar) {
        super(context, viewGroup, nVar);
        this.f7799z = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18883a(int i, int i2) {
        if (this.f9092e != null) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18636b(mo16043h());
            aVar.mo18639c(mo16045j());
            aVar.mo18632a(mo16042g());
            aVar.mo18631a(i);
            aVar.mo18635b(i2);
            C3067a.m8780c(mo20160F(), aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18886u() {
        C3084o.C3085a aVar = new C3084o.C3085a();
        aVar.mo18632a(mo16042g());
        aVar.mo18639c(mo16045j());
        aVar.mo18636b(mo16043h());
        aVar.mo18645f(mo16044i());
        C3067a.m8777b(this.f9091d, aVar, this.f7799z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18887v() {
        C3084o.C3085a aVar = new C3084o.C3085a();
        aVar.mo18632a(mo16042g());
        aVar.mo18639c(mo16045j());
        aVar.mo18636b(mo16043h());
        C3067a.m8766a((C2398a) this.f9091d, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo18888w() {
        C3084o.C3085a aVar = new C3084o.C3085a();
        aVar.mo18632a(mo16042g());
        aVar.mo18639c(mo16045j());
        aVar.mo18636b(mo16043h());
        C3067a.m8776b(mo20160F(), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18889x() {
        C3084o.C3085a aVar = new C3084o.C3085a();
        aVar.mo18633a(true);
        aVar.mo18639c(mo16045j());
        C3067a.m8765a(C3513m.m10963a(), (C2398a) this.f9091d, aVar, this.f7799z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18890y() {
        C3067a.m8773a(this.f9092e, (C2398a) this.f9091d, this.f9156x);
    }
}
