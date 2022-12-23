package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.h0 */
class C0850h0 {

    /* renamed from: a */
    private String f507a;

    /* renamed from: b */
    private C0832f1 f508b;

    C0850h0(C0832f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new C0832f1();
            } catch (JSONException e) {
                new C0826e0.C0827a().mo10746a("JSON Error in ADCMessage constructor: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
                return;
            }
        }
        this.f508b = f1Var;
        this.f507a = f1Var.mo10796e("m_type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0850h0 mo10835a(C0832f1 f1Var) {
        try {
            C0850h0 h0Var = new C0850h0("reply", this.f508b.mo10786b("m_origin"), f1Var);
            h0Var.f508b.mo10788b("m_id", this.f508b.mo10786b("m_id"));
            return h0Var;
        } catch (JSONException e) {
            new C0826e0.C0827a().mo10746a("JSON error in ADCMessage's createReply(): ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return new C0850h0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10837b(C0832f1 f1Var) {
        if (f1Var == null) {
            f1Var = new C0832f1();
        }
        this.f508b = f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10838c() {
        C0723a.m191a(this.f507a, this.f508b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10836b() {
        return this.f507a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0832f1 mo10834a() {
        return this.f508b;
    }

    C0850h0(String str, int i) {
        try {
            this.f507a = str;
            C0832f1 f1Var = new C0832f1();
            this.f508b = f1Var;
            f1Var.mo10788b("m_target", i);
        } catch (JSONException e) {
            new C0826e0.C0827a().mo10746a("JSON Error in ADCMessage constructor: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
        }
    }

    C0850h0(String str, int i, C0832f1 f1Var) {
        try {
            this.f507a = str;
            f1Var = f1Var == null ? new C0832f1() : f1Var;
            this.f508b = f1Var;
            f1Var.mo10788b("m_target", i);
        } catch (JSONException e) {
            new C0826e0.C0827a().mo10746a("JSON Error in ADCMessage constructor: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
        }
    }
}
