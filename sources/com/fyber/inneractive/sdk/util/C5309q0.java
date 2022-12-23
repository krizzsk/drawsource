package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.q0 */
public class C5309q0 {

    /* renamed from: a */
    public int f14037a;

    /* renamed from: b */
    public int f14038b;

    public C5309q0(int i, int i2) {
        this.f14037a = i;
        this.f14038b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5309q0.class != obj.getClass()) {
            return false;
        }
        C5309q0 q0Var = (C5309q0) obj;
        if (this.f14037a != q0Var.f14037a) {
            return false;
        }
        if (this.f14038b == q0Var.f14038b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14037a * 31) + this.f14038b;
    }
}
