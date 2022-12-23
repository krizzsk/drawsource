package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.cache.a */
public class C4538a {

    /* renamed from: a */
    public File f11229a;

    /* renamed from: b */
    public String f11230b;

    /* renamed from: c */
    public boolean f11231c;

    /* renamed from: d */
    public Object f11232d = new Object();

    /* renamed from: e */
    public Map<String, String> f11233e = new HashMap();

    /* renamed from: f */
    public volatile boolean f11234f = false;

    public C4538a(String str, String str2, File file, boolean z, String str3) {
        this.f11229a = file;
        this.f11230b = str2;
        this.f11231c = z;
    }

    /* renamed from: a */
    public File mo24728a() {
        File file;
        synchronized (this.f11232d) {
            file = this.f11229a;
        }
        return file;
    }
}
