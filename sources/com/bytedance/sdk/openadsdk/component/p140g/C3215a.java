package com.bytedance.sdk.openadsdk.component.p140g;

import android.content.Context;
import android.view.ViewGroup;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3606a;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;

/* renamed from: com.bytedance.sdk.openadsdk.component.g.a */
/* compiled from: TTAppOpenVideoController */
public class C3215a extends C3606a {

    /* renamed from: z */
    private boolean f7566z = false;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo18885t() {
        return 3;
    }

    public C3215a(Context context, ViewGroup viewGroup, C3431n nVar) {
        super(context, viewGroup, nVar);
        mo20185M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18883a(int i, int i2) {
        if (this.f9095h != null) {
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
        if (!this.f7566z) {
            this.f7566z = true;
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18632a(mo16042g());
            aVar.mo18639c(mo16045j());
            aVar.mo18636b(mo16043h());
            aVar.mo18645f(mo16044i());
            C3067a.m8777b(this.f9091d, aVar, (C3100j) null);
        }
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
        C3067a.m8765a((Context) this.f9095h.get(), (C2398a) this.f9091d, aVar, (C3100j) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18890y() {
        C3067a.m8773a(this.f9092e, (C2398a) this.f9091d, this.f9156x);
    }

    /* renamed from: a */
    public void mo18884a(C3084o.C3085a aVar) {
        C3067a.m8767a((C2398a) this.f9091d, aVar, (C3100j) null);
    }

    /* renamed from: z */
    public void mo18891z() {
        C3084o.C3085a aVar = new C3084o.C3085a();
        aVar.mo18632a(mo16042g());
        aVar.mo18639c(mo16045j());
        aVar.mo18636b(mo16043h());
        aVar.mo18645f(mo16044i());
        C3067a.m8785e(this.f9091d, aVar);
    }
}
