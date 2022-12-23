package com.ogury.p376cm.internal;

import com.ogury.core.OguryError;

/* renamed from: com.ogury.cm.internal.acbcc */
public final class acbcc {

    /* renamed from: a */
    private final boolean f24461a;

    /* renamed from: b */
    private final OguryError f24462b;

    public acbcc(boolean z, OguryError oguryError) {
        bbabc.m28052b(oguryError, "error");
        this.f24461a = z;
        this.f24462b = oguryError;
    }

    public /* synthetic */ acbcc(boolean z, OguryError oguryError, int i, bbabb bbabb) {
        this(true, new OguryError(0, ""));
    }

    /* renamed from: a */
    public final boolean mo63914a() {
        return this.f24461a;
    }

    /* renamed from: b */
    public final OguryError mo63915b() {
        return this.f24462b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acbcc) {
                acbcc acbcc = (acbcc) obj;
                if (!(this.f24461a == acbcc.f24461a) || !bbabc.m28051a((Object) this.f24462b, (Object) acbcc.f24462b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f24461a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        OguryError oguryError = this.f24462b;
        return i + (oguryError != null ? oguryError.hashCode() : 0);
    }

    public final String toString() {
        return "ResponseStatus(status=" + this.f24461a + ", error=" + this.f24462b + ")";
    }
}
