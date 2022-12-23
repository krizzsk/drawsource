package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.t */
public class C5377t {

    /* renamed from: a */
    public final String f14195a;

    /* renamed from: b */
    public final String f14196b;

    /* renamed from: c */
    public final Map<String, String> f14197c;

    public C5377t(WebResourceRequest webResourceRequest) {
        Map<String, String> map;
        this.f14195a = webResourceRequest.getUrl().toString();
        this.f14196b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            map = Collections.emptyMap();
        } else {
            map = webResourceRequest.getRequestHeaders();
        }
        this.f14197c = new HashMap(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5377t.class != obj.getClass()) {
            return false;
        }
        C5377t tVar = (C5377t) obj;
        if (this.f14195a.equals(tVar.f14195a) && this.f14196b.equals(tVar.f14196b)) {
            return this.f14197c.equals(tVar.f14197c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14195a.hashCode() * 31) + this.f14196b.hashCode()) * 31) + this.f14197c.hashCode();
    }
}
