package com.bytedance.sdk.component.p118e;

import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.b */
/* compiled from: NetResponse */
public class C2843b {

    /* renamed from: a */
    final int f6355a;

    /* renamed from: b */
    final String f6356b;

    /* renamed from: c */
    final Map<String, String> f6357c;

    /* renamed from: d */
    final String f6358d;

    /* renamed from: e */
    final long f6359e;

    /* renamed from: f */
    final long f6360f;

    /* renamed from: g */
    private File f6361g = null;

    /* renamed from: h */
    private final boolean f6362h;

    /* renamed from: i */
    private byte[] f6363i = null;

    public C2843b(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.f6362h = z;
        this.f6355a = i;
        this.f6356b = str;
        this.f6357c = map;
        this.f6358d = str2;
        this.f6359e = j;
        this.f6360f = j2;
    }

    /* renamed from: a */
    public int mo17695a() {
        return this.f6355a;
    }

    /* renamed from: a */
    public void mo17696a(File file) {
        this.f6361g = file;
    }

    /* renamed from: b */
    public String mo17697b() {
        return this.f6356b;
    }

    /* renamed from: c */
    public Map<String, String> mo17698c() {
        return this.f6357c;
    }

    /* renamed from: d */
    public String mo17699d() {
        return this.f6358d;
    }

    /* renamed from: e */
    public File mo17700e() {
        return this.f6361g;
    }

    /* renamed from: f */
    public boolean mo17701f() {
        return this.f6362h;
    }

    /* renamed from: g */
    public long mo17702g() {
        return this.f6359e - this.f6360f;
    }
}
