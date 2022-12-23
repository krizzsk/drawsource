package com.unity3d.services.core.request;

import com.unity3d.services.core.log.C12065a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.unity3d.services.core.request.h */
/* compiled from: WebRequest */
public class C12099h {

    /* renamed from: a */
    private URL f29504a;

    /* renamed from: b */
    private String f29505b;

    /* renamed from: c */
    private byte[] f29506c;

    /* renamed from: d */
    private Map<String, List<String>> f29507d;

    /* renamed from: e */
    private Map<String, List<String>> f29508e;

    /* renamed from: f */
    private int f29509f;

    /* renamed from: g */
    private long f29510g;

    /* renamed from: h */
    private boolean f29511h;

    /* renamed from: i */
    private ByteArrayOutputStream f29512i;

    /* renamed from: j */
    private int f29513j;

    /* renamed from: k */
    private int f29514k;

    /* renamed from: l */
    private C12095d f29515l;

    /* renamed from: com.unity3d.services.core.request.h$a */
    /* compiled from: WebRequest */
    public enum C12100a {
        f29516a,
        f29517b,
        f29518c
    }

    public C12099h(String str, String str2) throws MalformedURLException {
        this(str, str2, (Map<String, List<String>>) null);
    }

    /* renamed from: f */
    private HttpURLConnection m32967f() throws C12096e, IllegalArgumentException {
        HttpURLConnection httpURLConnection;
        if (mo71258l().toString().startsWith("https://")) {
            try {
                httpURLConnection = (HttpsURLConnection) mo71258l().openConnection();
            } catch (IOException e) {
                throw new C12096e("Open HTTPS connection: " + e.getMessage());
            }
        } else if (mo71258l().toString().startsWith("http://")) {
            try {
                httpURLConnection = (HttpURLConnection) mo71258l().openConnection();
            } catch (IOException e2) {
                throw new C12096e("Open HTTP connection: " + e2.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Invalid url-protocol in url: " + mo71258l().toString());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(mo71250c());
        httpURLConnection.setReadTimeout(mo71254h());
        try {
            httpURLConnection.setRequestMethod(mo71255i());
            if (mo71252e() != null && mo71252e().size() > 0) {
                for (String next : mo71252e().keySet()) {
                    for (String str : mo71252e().get(next)) {
                        C12065a.m32845b("Setting header: " + next + "=" + str);
                        httpURLConnection.setRequestProperty(next, str);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e3) {
            throw new C12096e("Set Request Method: " + mo71255i() + ", " + e3.getMessage());
        }
    }

    /* renamed from: a */
    public void mo71245a() {
        this.f29511h = true;
    }

    /* renamed from: b */
    public byte[] mo71249b() {
        return this.f29506c;
    }

    /* renamed from: c */
    public int mo71250c() {
        return this.f29513j;
    }

    /* renamed from: d */
    public long mo71251d() {
        return this.f29510g;
    }

    /* renamed from: e */
    public Map<String, List<String>> mo71252e() {
        return this.f29507d;
    }

    /* renamed from: g */
    public String mo71253g() {
        URL url = this.f29504a;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    /* renamed from: h */
    public int mo71254h() {
        return this.f29514k;
    }

    /* renamed from: i */
    public String mo71255i() {
        return this.f29505b;
    }

    /* renamed from: j */
    public int mo71256j() {
        return this.f29509f;
    }

    /* renamed from: k */
    public Map<String, List<String>> mo71257k() {
        return this.f29508e;
    }

    /* renamed from: l */
    public URL mo71258l() {
        return this.f29504a;
    }

    /* renamed from: m */
    public boolean mo71259m() {
        return this.f29511h;
    }

    /* renamed from: n */
    public String mo71260n() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f29512i = byteArrayOutputStream;
        mo71244a((OutputStream) byteArrayOutputStream);
        return this.f29512i.toString("UTF-8");
    }

    public C12099h(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    /* renamed from: a */
    public void mo71247a(String str) {
        this.f29506c = str.getBytes(StandardCharsets.UTF_8);
    }

    public C12099h(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this.f29509f = -1;
        this.f29510g = -1;
        this.f29511h = false;
        this.f29504a = new URL(str);
        this.f29505b = str2;
        this.f29507d = map;
        this.f29513j = i;
        this.f29514k = i2;
    }

    /* renamed from: a */
    public void mo71248a(byte[] bArr) {
        this.f29506c = bArr;
    }

    /* renamed from: a */
    public void mo71246a(C12095d dVar) {
        this.f29515l = dVar;
    }

    /* renamed from: a */
    public long mo71244a(OutputStream outputStream) throws Exception {
        InputStream inputStream;
        HttpURLConnection f = m32967f();
        f.setDoInput(true);
        if (mo71255i().equals(C12100a.f29516a.name())) {
            f.setDoOutput(true);
            OutputStream outputStream2 = null;
            try {
                OutputStream outputStream3 = f.getOutputStream();
                if (mo71249b() == null) {
                    String g = mo71253g();
                    if (g != null) {
                        outputStream3.write(g.getBytes(StandardCharsets.UTF_8));
                    }
                } else {
                    outputStream3.write(mo71249b());
                }
                outputStream3.flush();
                try {
                    outputStream3.close();
                } catch (Exception e) {
                    Exception exc = e;
                    C12065a.m32842a("Error closing writer", exc);
                    throw exc;
                }
            } catch (IOException e2) {
                C12065a.m32842a("Error while writing POST params", (Exception) e2);
                throw new C12096e("Error writing POST params: " + e2.getMessage());
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e3) {
                        Exception exc2 = e3;
                        C12065a.m32842a("Error closing writer", exc2);
                        throw exc2;
                    }
                }
                throw th;
            }
        }
        try {
            this.f29509f = f.getResponseCode();
            long contentLength = (long) f.getContentLength();
            this.f29510g = contentLength;
            if (contentLength == -1) {
                this.f29510g = (long) f.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f29512i;
            long j = 0;
            ByteArrayOutputStream byteArrayOutputStream2 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == byteArrayOutputStream2 && this.f29510g > 0) {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream((int) this.f29510g);
                this.f29512i = byteArrayOutputStream3;
                byteArrayOutputStream2 = byteArrayOutputStream3;
            }
            if (f.getHeaderFields() != null) {
                this.f29508e = f.getHeaderFields();
            }
            try {
                inputStream = f.getInputStream();
            } catch (IOException e4) {
                IOException iOException = e4;
                inputStream = f.getErrorStream();
                if (inputStream == null) {
                    throw new C12096e("Can't open error stream: " + iOException.getMessage());
                }
            }
            C12095d dVar = this.f29515l;
            if (dVar != null) {
                dVar.mo71031a(mo71258l().toString(), this.f29510g, this.f29509f, this.f29508e);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!mo71259m() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        byteArrayOutputStream2.write(bArr, 0, i);
                        j += (long) i;
                        C12095d dVar2 = this.f29515l;
                        if (dVar2 != null) {
                            dVar2.mo71032a(mo71258l().toString(), j, this.f29510g);
                        }
                    }
                } catch (IOException e5) {
                    throw new C12096e("Network exception: " + e5.getMessage());
                } catch (Exception e6) {
                    throw new Exception("Unknown Exception: " + e6.getMessage());
                }
            }
            f.disconnect();
            byteArrayOutputStream2.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            throw new C12096e("Response code: " + e7.getMessage());
        }
    }
}
