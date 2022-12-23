package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.p225b.C7626b;
import com.iab.omid.library.adcolony.p225b.C7629d;
import com.iab.omid.library.adcolony.p225b.C7632f;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7644e;

/* renamed from: com.iab.omid.library.adcolony.b */
public class C7624b {

    /* renamed from: a */
    private boolean f18446a;

    /* renamed from: b */
    private void m21001b(Context context) {
        C7644e.m21100a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54346a() {
        return "1.3.30-Adcolony";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54347a(Context context) {
        m21001b(context);
        if (!mo54349b()) {
            mo54348a(true);
            C7632f.m21046a().mo54392a(context);
            C7626b.m21013a().mo54356a(context);
            C7640b.m21078a(context);
            C7629d.m21026a().mo54373a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54348a(boolean z) {
        this.f18446a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54349b() {
        return this.f18446a;
    }
}
