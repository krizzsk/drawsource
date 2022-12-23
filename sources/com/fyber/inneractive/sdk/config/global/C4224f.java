package com.fyber.inneractive.sdk.config.global;

/* renamed from: com.fyber.inneractive.sdk.config.global.f */
public class C4224f implements C4222d {

    /* renamed from: a */
    public String f10421a;

    /* renamed from: b */
    public boolean f10422b;

    public C4224f(String str, boolean z) {
        this.f10421a = str;
        this.f10422b = z;
    }

    /* renamed from: a */
    public boolean mo24231a(C4223e eVar) {
        String str = this.f10421a;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("android")) {
            return !this.f10422b;
        }
        return this.f10422b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"os", this.f10421a, Boolean.valueOf(this.f10422b)});
    }
}
