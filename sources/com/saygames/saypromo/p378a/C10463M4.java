package com.saygames.saypromo.p378a;

import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.saygames.saypromo.a.M4 */
public final class C10463M4 {

    /* renamed from: a */
    private final InputStream f25891a;

    /* renamed from: b */
    private final int f25892b;

    /* renamed from: c */
    private final String f25893c;

    /* renamed from: d */
    final /* synthetic */ HttpURLConnection f25894d;

    C10463M4(HttpURLConnection httpURLConnection) {
        this.f25894d = httpURLConnection;
        this.f25891a = httpURLConnection.getInputStream();
        this.f25892b = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        this.f25893c = responseMessage == null ? "" : responseMessage;
    }

    /* renamed from: a */
    public final void mo65354a() {
        this.f25894d.disconnect();
    }

    /* renamed from: b */
    public final int mo65355b() {
        return this.f25892b;
    }

    /* renamed from: c */
    public final InputStream mo65356c() {
        return this.f25891a;
    }

    /* renamed from: d */
    public final String mo65357d() {
        return this.f25893c;
    }
}
