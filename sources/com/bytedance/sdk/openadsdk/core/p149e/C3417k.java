package com.bytedance.sdk.openadsdk.core.p149e;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTImage;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.k */
/* compiled from: Image */
public class C3417k {

    /* renamed from: a */
    private String f8297a;

    /* renamed from: b */
    private int f8298b;

    /* renamed from: c */
    private int f8299c;

    /* renamed from: d */
    private double f8300d;

    /* renamed from: e */
    private boolean f8301e;

    /* renamed from: f */
    private String f8302f;

    /* renamed from: a */
    public static TTImage m10248a(C3417k kVar) {
        if (kVar == null || !kVar.mo19477e()) {
            return null;
        }
        return new TTImage(kVar.mo19475c(), kVar.mo19472b(), kVar.mo19468a(), kVar.mo19476d());
    }

    /* renamed from: a */
    public String mo19468a() {
        return this.f8297a;
    }

    /* renamed from: a */
    public void mo19469a(int i) {
        this.f8298b = i;
    }

    /* renamed from: a */
    public void mo19470a(String str) {
        this.f8297a = str;
    }

    /* renamed from: a */
    public void mo19471a(boolean z) {
        this.f8301e = z;
    }

    /* renamed from: b */
    public int mo19472b() {
        return this.f8298b;
    }

    /* renamed from: b */
    public void mo19473b(int i) {
        this.f8299c = i;
    }

    /* renamed from: b */
    public void mo19474b(String str) {
        this.f8302f = str;
    }

    /* renamed from: c */
    public int mo19475c() {
        return this.f8299c;
    }

    /* renamed from: d */
    public double mo19476d() {
        return this.f8300d;
    }

    /* renamed from: e */
    public boolean mo19477e() {
        return !TextUtils.isEmpty(this.f8297a) && this.f8298b > 0 && this.f8299c > 0;
    }

    /* renamed from: f */
    public boolean mo19478f() {
        return this.f8301e;
    }

    /* renamed from: g */
    public String mo19479g() {
        return this.f8302f;
    }
}
