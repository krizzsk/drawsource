package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.p */
public abstract class C4248p implements C4246n {

    /* renamed from: a */
    public C4246n f10449a;

    /* renamed from: a */
    public String mo24237a(String str, String str2) {
        C4246n nVar = this.f10449a;
        return nVar != null ? nVar.mo24237a(str, str2) : str2;
    }

    /* renamed from: b */
    public Integer mo24240b(String str) {
        C4246n nVar = this.f10449a;
        if (nVar == null || nVar.mo24261a() == null || this.f10449a.mo24261a().size() <= 0) {
            return null;
        }
        return this.f10449a.mo24240b(str);
    }

    /* renamed from: c */
    public String mo24241c(String str) {
        C4246n nVar = this.f10449a;
        if (nVar == null || nVar.mo24261a() == null || this.f10449a.mo24261a().size() <= 0) {
            return null;
        }
        return this.f10449a.mo24241c(str);
    }

    /* renamed from: d */
    public Boolean mo24242d(String str) {
        C4246n nVar = this.f10449a;
        if (nVar == null || nVar.mo24261a() == null || this.f10449a.mo24261a().size() <= 0) {
            return null;
        }
        return this.f10449a.mo24242d(str);
    }

    /* renamed from: a */
    public Double mo24236a(String str) {
        C4246n nVar = this.f10449a;
        if (nVar == null || nVar.mo24261a() == null || this.f10449a.mo24261a().size() <= 0) {
            return null;
        }
        return this.f10449a.mo24236a(str);
    }

    /* renamed from: a */
    public Map<String, Object> mo24261a() {
        C4246n nVar = this.f10449a;
        if (nVar != null) {
            return nVar.mo24261a();
        }
        return null;
    }
}
