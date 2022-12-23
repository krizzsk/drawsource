package com.ogury.core.internal.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ogury.core.internal.C9717ai;

/* compiled from: OguryNetworkClient.kt */
public final class OguryNetworkClient {

    /* renamed from: a */
    private final int f24683a;

    /* renamed from: b */
    private final int f24684b;

    public OguryNetworkClient(int i, int i2) {
        this.f24683a = i;
        this.f24684b = i2;
    }

    public final Call newCall(NetworkRequest networkRequest) {
        C9717ai.m28145b(networkRequest, "request");
        return new C9785b(networkRequest, this.f24683a, this.f24684b);
    }

    public final OguryNetworkResponse post(String str, String str2, HeadersLoader headersLoader) {
        C9717ai.m28145b(str, "url");
        C9717ai.m28145b(str2, "body");
        C9717ai.m28145b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, ShareTarget.METHOD_POST, str2, headersLoader)).execute();
    }

    public final OguryNetworkResponse get(String str, HeadersLoader headersLoader) {
        C9717ai.m28145b(str, "url");
        C9717ai.m28145b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, ShareTarget.METHOD_GET, "", headersLoader)).execute();
    }

    public final OguryNetworkResponse put(String str, String str2, HeadersLoader headersLoader) {
        C9717ai.m28145b(str, "url");
        C9717ai.m28145b(str2, "body");
        C9717ai.m28145b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, "PUT", str2, headersLoader)).execute();
    }
}
