package com.iab.omid.library.mmadbridge.p261b;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.p264e.C7948a;

/* renamed from: com.iab.omid.library.mmadbridge.b.c */
public class C7930c {

    /* renamed from: a */
    private final C7948a f19149a;

    /* renamed from: b */
    private final String f19150b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f19151c;

    /* renamed from: d */
    private final String f19152d;

    public C7930c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f19149a = new C7948a(view);
        this.f19150b = view.getClass().getCanonicalName();
        this.f19151c = friendlyObstructionPurpose;
        this.f19152d = str;
    }

    /* renamed from: a */
    public C7948a mo55545a() {
        return this.f19149a;
    }

    /* renamed from: b */
    public String mo55546b() {
        return this.f19150b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo55547c() {
        return this.f19151c;
    }

    /* renamed from: d */
    public String mo55548d() {
        return this.f19152d;
    }
}
