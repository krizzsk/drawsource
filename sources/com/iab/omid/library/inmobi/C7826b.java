package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.p249b.C7828b;
import com.iab.omid.library.inmobi.p249b.C7831d;
import com.iab.omid.library.inmobi.p249b.C7834f;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7846e;

/* renamed from: com.iab.omid.library.inmobi.b */
public class C7826b {

    /* renamed from: a */
    private boolean f18913a;

    /* renamed from: b */
    private void m21919b(Context context) {
        C7846e.m22016a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55138a() {
        return "1.3.17-Inmobi";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55139a(Context context) {
        m21919b(context);
        if (!mo55141b()) {
            mo55140a(true);
            C7834f.m21964a().mo55184a(context);
            C7828b.m21931a().mo55148a(context);
            C7842b.m21996a(context);
            C7831d.m21944a().mo55165a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55140a(boolean z) {
        this.f18913a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55141b() {
        return this.f18913a;
    }
}
