package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.p237b.C7726b;
import com.iab.omid.library.applovin.p237b.C7729d;
import com.iab.omid.library.applovin.p237b.C7732f;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7744e;

/* renamed from: com.iab.omid.library.applovin.b */
public class C7724b {

    /* renamed from: a */
    private boolean f18680a;

    /* renamed from: b */
    private void m21461b(Context context) {
        C7744e.m21560a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54744a() {
        return "1.3.30-Applovin";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54745a(Context context) {
        m21461b(context);
        if (!mo54747b()) {
            mo54746a(true);
            C7732f.m21506a().mo54790a(context);
            C7726b.m21473a().mo54754a(context);
            C7740b.m21538a(context);
            C7729d.m21486a().mo54771a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54746a(boolean z) {
        this.f18680a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54747b() {
        return this.f18680a;
    }
}
