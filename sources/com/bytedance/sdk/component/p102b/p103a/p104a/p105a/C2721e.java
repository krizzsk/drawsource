package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.e */
/* compiled from: NetInputStram */
public class C2721e extends InputStream {

    /* renamed from: a */
    InputStream f6056a;

    /* renamed from: b */
    HttpURLConnection f6057b;

    public C2721e(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f6056a = inputStream;
        this.f6057b = httpURLConnection;
    }

    public int read() throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0;
    }

    public int available() throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    public void close() throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            inputStream.close();
            this.f6056a = null;
        }
        HttpURLConnection httpURLConnection = this.f6057b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f6057b = null;
        }
    }

    public synchronized void mark(int i) {
        if (this.f6056a != null) {
            this.f6056a.mark(i);
        }
    }

    public void reset() throws IOException {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    public boolean markSupported() {
        InputStream inputStream = this.f6056a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
