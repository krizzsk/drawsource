package com.iab.omid.library.smaato;

import android.content.Context;
import p012c.C0690b;
import p012c.C0693d;
import p012c.C0696f;
import p397e.C12465b;
import p397e.C12469e;

/* renamed from: com.iab.omid.library.smaato.a */
public class C8020a {

    /* renamed from: a */
    private boolean f19357a;

    /* renamed from: b */
    private void m22796b(Context context) {
        C12469e.m33308a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55860a() {
        return "1.3.34-Smaato";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55861a(Context context) {
        m22796b(context);
        if (!mo55863b()) {
            mo55862a(true);
            C0696f.m75c().mo10303a(context);
            C0690b.m41a().mo10267a(context);
            C12465b.m33287a(context);
            C0693d.m54b().mo10285a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55862a(boolean z) {
        this.f19357a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55863b() {
        return this.f19357a;
    }
}
