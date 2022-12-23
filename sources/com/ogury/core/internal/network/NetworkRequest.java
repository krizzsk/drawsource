package com.ogury.core.internal.network;

import com.ogury.core.internal.C9716ah;
import com.ogury.core.internal.C9717ai;

/* compiled from: NetworkRequest.kt */
public final class NetworkRequest {

    /* renamed from: a */
    private final String f24679a;

    /* renamed from: b */
    private final String f24680b;

    /* renamed from: c */
    private final String f24681c;

    /* renamed from: d */
    private final HeadersLoader f24682d;

    public NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader) {
        C9717ai.m28145b(str, "url");
        C9717ai.m28145b(str2, "method");
        C9717ai.m28145b(str3, "body");
        C9717ai.m28145b(headersLoader, "headers");
        this.f24679a = str;
        this.f24680b = str2;
        this.f24681c = str3;
        this.f24682d = headersLoader;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader, int i, C9716ah ahVar) {
        this(str, str2, (i & 4) != 0 ? "" : str3, headersLoader);
    }

    public final String getBody() {
        return this.f24681c;
    }

    public final HeadersLoader getHeaders() {
        return this.f24682d;
    }

    public final String getMethod() {
        return this.f24680b;
    }

    public final String getUrl() {
        return this.f24679a;
    }
}
