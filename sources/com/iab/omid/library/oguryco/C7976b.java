package com.iab.omid.library.oguryco;

import android.content.Context;
import com.iab.omid.library.oguryco.p267b.C7978b;
import com.iab.omid.library.oguryco.p267b.C7982d;
import com.iab.omid.library.oguryco.p267b.C7985f;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7997e;

/* renamed from: com.iab.omid.library.oguryco.b */
public class C7976b {

    /* renamed from: a */
    private boolean f19262a;

    /* renamed from: b */
    private void m22595b(Context context) {
        C7997e.m22696a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo55742a() {
        return "1.3.1-Oguryco";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55743a(Context context) {
        m22595b(context);
        if (!mo55746b()) {
            mo55744a(true);
            C7985f.m22644a().mo55783a(context);
            C7978b.m22608a().mo55753a(context);
            C7993b.m22676a(context);
            C7982d.m22624a().mo55764a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55744a(boolean z) {
        this.f19262a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo55745a(String str) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo55746b() {
        return this.f19262a;
    }
}
