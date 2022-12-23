package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.p243b.C7777b;
import com.iab.omid.library.fyber.p243b.C7780d;
import com.iab.omid.library.fyber.p243b.C7783f;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7795e;

/* renamed from: com.iab.omid.library.fyber.b */
public class C7775b {

    /* renamed from: a */
    private boolean f18797a;

    /* renamed from: b */
    private void m21691b(Context context) {
        C7795e.m21790a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54943a() {
        return "1.3.30-Fyber";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54944a(Context context) {
        m21691b(context);
        if (!mo54946b()) {
            mo54945a(true);
            C7783f.m21736a().mo54989a(context);
            C7777b.m21703a().mo54953a(context);
            C7791b.m21768a(context);
            C7780d.m21716a().mo54970a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54945a(boolean z) {
        this.f18797a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54946b() {
        return this.f18797a;
    }
}
