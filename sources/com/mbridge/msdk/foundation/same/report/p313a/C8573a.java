package com.mbridge.msdk.foundation.same.report.p313a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8462g;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8418k;
import com.mbridge.msdk.foundation.tools.C8660r;

/* renamed from: com.mbridge.msdk.foundation.same.report.a.a */
/* compiled from: CampaignRequestTimeUtil */
public final class C8573a {

    /* renamed from: a */
    private C8462g f21057a;

    /* renamed from: b */
    private C8414g f21058b = null;

    /* renamed from: c */
    private Context f21059c;

    public C8573a(C8462g gVar) {
        Context context;
        this.f21057a = gVar;
        Context g = C8388a.m23845e().mo56913g();
        this.f21059c = g;
        this.f21058b = C8414g.m23969a(g);
        if (this.f21057a != null && (context = this.f21059c) != null) {
            int o = C8660r.m24840o(context);
            this.f21057a.mo57743d(o);
            this.f21057a.mo57741c(C8660r.m24806a(this.f21059c, o));
        }
    }

    /* renamed from: a */
    public final void mo58048a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f21057a.mo57735a(str);
        }
    }

    /* renamed from: a */
    public final void mo58047a(int i) {
        C8462g gVar = this.f21057a;
        if (gVar != null) {
            gVar.mo57737b(i);
        }
    }

    /* renamed from: b */
    public final void mo58049b(int i) {
        C8462g gVar = this.f21057a;
        if (gVar != null) {
            gVar.mo57740c(i);
        }
    }

    /* renamed from: a */
    public final void mo58046a() {
        if (this.f21057a != null) {
            C8418k.m23993a((C8412f) this.f21058b).mo57035a(this.f21057a);
        }
    }

    /* renamed from: b */
    public final void mo58050b(String str) {
        C8462g gVar = this.f21057a;
        if (gVar != null) {
            gVar.mo57738b(str);
        }
    }

    /* renamed from: c */
    public final void mo58051c(int i) {
        C8462g gVar = this.f21057a;
        if (gVar != null) {
            gVar.mo57734a(i);
        }
    }
}
