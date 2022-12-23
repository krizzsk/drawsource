package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.j */
/* compiled from: SkipProxySelector */
class C2357j extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f4770a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f4771b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f4772c;

    /* renamed from: d */
    private final int f4773d;

    private C2357j(String str, int i) {
        this.f4772c = str;
        this.f4773d = i;
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (!this.f4772c.equalsIgnoreCase(uri.getHost()) || this.f4773d != uri.getPort()) ? this.f4771b.select(uri) : f4770a;
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f4771b.connectFailed(uri, socketAddress, iOException);
    }

    /* renamed from: a */
    static void m5432a(String str, int i) {
        ProxySelector.setDefault(new C2357j(str, i));
    }
}
