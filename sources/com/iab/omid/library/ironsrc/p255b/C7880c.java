package com.iab.omid.library.ironsrc.p255b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.p258e.C7898a;

/* renamed from: com.iab.omid.library.ironsrc.b.c */
public class C7880c {

    /* renamed from: a */
    private final C7898a f19035a;

    /* renamed from: b */
    private final String f19036b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f19037c;

    /* renamed from: d */
    private final String f19038d;

    public C7880c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f19035a = new C7898a(view);
        this.f19036b = view.getClass().getCanonicalName();
        this.f19037c = friendlyObstructionPurpose;
        this.f19038d = str;
    }

    /* renamed from: a */
    public C7898a mo55347a() {
        return this.f19035a;
    }

    /* renamed from: b */
    public String mo55348b() {
        return this.f19036b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo55349c() {
        return this.f19037c;
    }

    /* renamed from: d */
    public String mo55350d() {
        return this.f19038d;
    }
}
