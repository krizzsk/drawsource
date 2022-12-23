package com.ogury.core.internal.network;

import com.ogury.core.internal.C9702a;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9731au;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.b */
/* compiled from: NetworkCall.kt */
public final class C9785b implements Call {

    /* renamed from: a */
    private final NetworkRequest f24688a;

    /* renamed from: b */
    private final int f24689b;

    /* renamed from: c */
    private final int f24690c;

    public C9785b(NetworkRequest networkRequest, int i, int i2) {
        C9717ai.m28145b(networkRequest, "request");
        this.f24688a = networkRequest;
        this.f24689b = i;
        this.f24690c = i2;
    }

    public final OguryNetworkResponse execute() {
        OguryNetworkResponse.Success success;
        byte[] bArr;
        try {
            URLConnection openConnection = new URL(this.f24688a.getUrl()).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setReadTimeout(this.f24689b);
                httpURLConnection.setConnectTimeout(this.f24690c);
                httpURLConnection.setRequestMethod(this.f24688a.getMethod());
                boolean z = true;
                httpURLConnection.setDoOutput(this.f24688a.getBody().length() > 0);
                m28242a(httpURLConnection);
                if (this.f24688a.getBody().length() > 0) {
                    if (C9783a.m28240a(this.f24688a.getHeaders())) {
                        bArr = C9702a.m28117a(this.f24688a.getBody());
                    } else {
                        String body = this.f24688a.getBody();
                        Charset charset = C9731au.f24608a;
                        if (body != null) {
                            bArr = body.getBytes(charset);
                            C9717ai.m28143a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    if (outputStream != null) {
                        CloseableUtilKt.closeSafely(outputStream);
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    z = false;
                }
                if (!z) {
                    return new OguryNetworkResponse.Failure(new OguryNetworkException(responseCode));
                }
                if (httpURLConnection.getContentLength() == 0) {
                    success = new OguryNetworkResponse.Success("");
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    C9717ai.m28143a((Object) inputStream, "inputStream");
                    C9717ai.m28145b(inputStream, "$this$readBytes");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
                    C9702a.m28112a(inputStream, (OutputStream) byteArrayOutputStream, 0, 2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C9717ai.m28143a((Object) byteArray, "buffer.toByteArray()");
                    inputStream.close();
                    if (C9783a.m28241a(httpURLConnection)) {
                        success = new OguryNetworkResponse.Success(C9702a.m28116a(byteArray));
                    } else {
                        success = new OguryNetworkResponse.Success(new String(byteArray, C9731au.f24608a));
                    }
                }
                return success;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Exception e) {
            return new OguryNetworkResponse.Failure(e);
        } catch (Throwable th) {
            if (0 != 0) {
                CloseableUtilKt.closeSafely((Closeable) null);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final void m28242a(HttpURLConnection httpURLConnection) {
        for (Map.Entry next : this.f24688a.getHeaders().loadHeaders().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }
}
