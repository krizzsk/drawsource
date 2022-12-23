package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.p273b.C8042b;
import com.iab.omid.library.vungle.p273b.C8045d;
import com.iab.omid.library.vungle.p273b.C8048f;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.p275d.C8060e;

/* renamed from: com.iab.omid.library.vungle.b */
public class C8040b {

    /* renamed from: a */
    private boolean f19446a;

    /* renamed from: b */
    private void m22920b(Context context) {
        C8060e.m23017a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo56055a() {
        return "1.3.21-Vungle";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56056a(Context context) {
        m22920b(context);
        if (!mo56058b()) {
            mo56057a(true);
            C8048f.m22965a().mo56101a(context);
            C8042b.m22932a().mo56065a(context);
            C8056b.m22997a(context);
            C8045d.m22945a().mo56082a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56057a(boolean z) {
        this.f19446a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo56058b() {
        return this.f19446a;
    }
}
