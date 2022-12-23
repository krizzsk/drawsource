package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.p255b.C7878b;
import com.iab.omid.library.ironsrc.p255b.C7881d;
import com.iab.omid.library.ironsrc.p255b.C7884f;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7896e;

/* renamed from: com.iab.omid.library.ironsrc.b */
public class C7876b {

    /* renamed from: a */
    private boolean f19026a;

    /* renamed from: b */
    private void m22143b(Context context) {
        C7896e.m22237a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55332a() {
        return "1.3.12-Ironsrc";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55333a(Context context) {
        m22143b(context);
        if (!mo55335b()) {
            mo55334a(true);
            C7884f.m22186a().mo55370a(context);
            C7878b.m22155a().mo55342a(context);
            C7892b.m22217a(context);
            C7881d.m22166a().mo55351a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55334a(boolean z) {
        this.f19026a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55335b() {
        return this.f19026a;
    }
}
