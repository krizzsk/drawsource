package com.fyber.inneractive.sdk.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.j */
public class C4493j {

    /* renamed from: a */
    public int f11042a;

    /* renamed from: b */
    public String f11043b;

    /* renamed from: c */
    public InputStream f11044c;

    /* renamed from: d */
    public Map<String, List<String>> f11045d;

    /* renamed from: e */
    public String f11046e;

    public C4493j() {
    }

    /* renamed from: a */
    public void mo24683a(InputStream inputStream) {
        this.f11044c = inputStream;
    }

    public C4493j(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) {
        this.f11044c = inputStream;
        this.f11042a = i;
        this.f11043b = str;
        this.f11045d = map;
        this.f11046e = str2;
    }

    /* renamed from: a */
    public void mo24682a(int i) {
        this.f11042a = i;
    }

    /* renamed from: a */
    public void mo24685a(Map<String, List<String>> map) {
        this.f11045d = map;
    }

    /* renamed from: a */
    public void mo24684a(String str) {
        this.f11046e = str;
    }

    /* renamed from: a */
    public void mo24680a() throws IOException {
        InputStream inputStream = this.f11044c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
