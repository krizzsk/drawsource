package com.apm.insight.p025k;

import androidx.browser.trusted.sharing.ShareTarget;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1308i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.apm.insight.k.j */
public class C1290j {

    /* renamed from: a */
    private final String f1291a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b */
    private HttpURLConnection f1292b;

    /* renamed from: c */
    private String f1293c;

    /* renamed from: d */
    private boolean f1294d;

    /* renamed from: e */
    private C1283f f1295e;

    /* renamed from: f */
    private C1294m f1296f;

    public C1290j(String str, String str2, boolean z) {
        this.f1293c = str2;
        this.f1294d = z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f1292b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f1292b.setDoOutput(true);
        this.f1292b.setDoInput(true);
        this.f1292b.setRequestMethod(ShareTarget.METHOD_POST);
        HttpURLConnection httpURLConnection2 = this.f1292b;
        httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f1291a);
        if (z) {
            this.f1292b.setRequestProperty("Content-Encoding", "gzip");
            this.f1296f = new C1294m(this.f1292b.getOutputStream());
            return;
        }
        this.f1295e = new C1283f(this.f1292b.getOutputStream());
    }

    /* renamed from: a */
    public String mo12568a() {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f1291a + "--" + "\r\n").getBytes();
        if (this.f1294d) {
            this.f1296f.write(bytes);
            this.f1296f.mo12577b();
            this.f1296f.mo12576a();
        } else {
            this.f1295e.write(bytes);
            this.f1295e.flush();
            this.f1295e.mo12559a();
        }
        int responseCode = this.f1292b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f1292b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f1292b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    /* renamed from: a */
    public void mo12569a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1291a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry next : map.entrySet()) {
            sb.append("; ");
            sb.append((String) next.getKey());
            sb.append("=\"");
            sb.append((String) next.getValue());
            sb.append("\"");
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f1294d) {
            this.f1296f.write(sb.toString().getBytes());
        } else {
            this.f1295e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f1294d) {
                this.f1296f.write(bArr, 0, read);
            } else {
                this.f1295e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f1294d) {
            this.f1296f.write("\r\n".getBytes());
            return;
        }
        this.f1295e.write("\r\n".getBytes());
        this.f1295e.flush();
    }

    /* renamed from: a */
    public void mo12570a(String str, String str2) {
        mo12571a(str, str2, false);
    }

    /* renamed from: a */
    public void mo12571a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1291a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f1293c);
        sb.append("\r\n");
        sb.append("\r\n");
        try {
            if (this.f1294d) {
                this.f1296f.write(sb.toString().getBytes());
            } else {
                this.f1295e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = C1250h.m1617i().getEncryptImpl().mo12444a(bytes);
        }
        try {
            if (this.f1294d) {
                this.f1296f.write(bytes);
                this.f1296f.write("\r\n".getBytes());
                return;
            }
            this.f1295e.write(bytes);
            this.f1295e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    public void mo12572a(String str, File... fileArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f1291a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f1294d) {
            this.f1296f.write(sb.toString().getBytes());
        } else {
            this.f1295e.write(sb.toString().getBytes());
        }
        C1308i.m1830a(this.f1294d ? this.f1296f : this.f1295e, fileArr);
        if (this.f1294d) {
            this.f1296f.write("\r\n".getBytes());
            return;
        }
        this.f1295e.write("\r\n".getBytes());
        this.f1295e.flush();
    }
}
