package com.applovin.impl.sdk.p048a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.sdk.a.d */
public class C1809d {

    /* renamed from: a */
    private final View f2890a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f2891b;

    /* renamed from: c */
    private final String f2892c;

    public C1809d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f2890a = view;
        this.f2891b = friendlyObstructionPurpose;
        this.f2892c = str;
    }

    /* renamed from: a */
    public View mo14078a() {
        return this.f2890a;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose mo14079b() {
        return this.f2891b;
    }

    /* renamed from: c */
    public String mo14080c() {
        return this.f2892c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1809d dVar = (C1809d) obj;
        View view = this.f2890a;
        if (view == null ? dVar.f2890a != null : !view.equals(dVar.f2890a)) {
            return false;
        }
        if (this.f2891b != dVar.f2891b) {
            return false;
        }
        String str = this.f2892c;
        String str2 = dVar.f2892c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f2890a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f2891b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f2892c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
