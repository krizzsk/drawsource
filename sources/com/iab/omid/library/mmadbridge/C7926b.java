package com.iab.omid.library.mmadbridge;

import android.content.Context;
import com.iab.omid.library.mmadbridge.p261b.C7928b;
import com.iab.omid.library.mmadbridge.p261b.C7931d;
import com.iab.omid.library.mmadbridge.p261b.C7934f;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7946e;

/* renamed from: com.iab.omid.library.mmadbridge.b */
public class C7926b {

    /* renamed from: a */
    private boolean f19141a;

    /* renamed from: b */
    private void m22366b(Context context) {
        C7946e.m22465a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55522a() {
        return "1.3.29-Mmadbridge";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55523a(Context context) {
        m22366b(context);
        if (!mo55525b()) {
            mo55524a(true);
            C7934f.m22411a().mo55568a(context);
            C7928b.m22378a().mo55532a(context);
            C7942b.m22443a(context);
            C7931d.m22391a().mo55549a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55524a(boolean z) {
        this.f19141a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55525b() {
        return this.f19141a;
    }
}
