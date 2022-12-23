package com.applovin.impl.sdk.p053e;

import android.content.Context;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;

/* renamed from: com.applovin.impl.sdk.e.a */
public abstract class C1887a implements Runnable {

    /* renamed from: a */
    private final String f3495a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C1969m f3496b;

    /* renamed from: c */
    private final C2102v f3497c;

    /* renamed from: d */
    private final Context f3498d;

    /* renamed from: e */
    private final boolean f3499e;

    public C1887a(String str, C1969m mVar) {
        this(str, mVar, false);
    }

    public C1887a(String str, C1969m mVar, boolean z) {
        this.f3495a = str;
        this.f3496b = mVar;
        this.f3497c = mVar.mo14509A();
        this.f3498d = mVar.mo14520L();
        this.f3499e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14365a(String str) {
        this.f3497c.mo15012b(this.f3495a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14366a(String str, Throwable th) {
        this.f3497c.mo15013b(this.f3495a, str, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14367b(String str) {
        this.f3497c.mo15014c(this.f3495a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14368c(String str) {
        this.f3497c.mo15015d(this.f3495a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1969m mo14369d() {
        return this.f3496b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14370d(String str) {
        this.f3497c.mo15016e(this.f3495a, str);
    }

    /* renamed from: e */
    public String mo14371e() {
        return this.f3495a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Context mo14372f() {
        return this.f3498d;
    }

    /* renamed from: g */
    public boolean mo14373g() {
        return this.f3499e;
    }
}
