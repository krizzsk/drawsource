package com.iab.omid.library.amazon;

import android.content.Context;
import com.iab.omid.library.amazon.p231b.C7676b;
import com.iab.omid.library.amazon.p231b.C7679d;
import com.iab.omid.library.amazon.p231b.C7682f;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.p233d.C7694e;

/* renamed from: com.iab.omid.library.amazon.b */
public class C7674b {

    /* renamed from: a */
    private boolean f18563a;

    /* renamed from: b */
    private void m21231b(Context context) {
        C7694e.m21330a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo54545a() {
        return "1.3.28-Amazon";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54546a(Context context) {
        m21231b(context);
        if (!mo54548b()) {
            mo54547a(true);
            C7682f.m21276a().mo54591a(context);
            C7676b.m21243a().mo54555a(context);
            C7690b.m21308a(context);
            C7679d.m21256a().mo54572a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54547a(boolean z) {
        this.f18563a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo54548b() {
        return this.f18563a;
    }
}
