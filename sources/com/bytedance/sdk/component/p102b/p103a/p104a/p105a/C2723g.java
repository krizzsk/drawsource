package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import com.bytedance.sdk.component.p102b.p103a.C2751n;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.g */
/* compiled from: NetResponseBody */
public class C2723g extends C2751n {

    /* renamed from: a */
    HttpURLConnection f6060a;

    /* renamed from: b */
    InputStream f6061b;

    C2723g(HttpURLConnection httpURLConnection) throws IOException {
        this.f6060a = httpURLConnection;
        this.f6061b = new C2721e(httpURLConnection.getInputStream(), httpURLConnection);
    }

    /* renamed from: a */
    public long mo17427a() {
        try {
            return (long) this.f6060a.getContentLength();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public String mo17428b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6061b));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void close() {
        try {
            this.f6061b.close();
            this.f6060a.disconnect();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public InputStream mo17429c() {
        return this.f6061b;
    }

    /* renamed from: d */
    public byte[] mo17431d() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f6061b.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
