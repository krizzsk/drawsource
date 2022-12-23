package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.i */
public class C4490i extends C4488h implements C4486g {

    /* renamed from: com.fyber.inneractive.sdk.network.i$a */
    public static class C4491a extends C4493j {

        /* renamed from: f */
        public final HttpURLConnection f11040f;

        public C4491a(HttpURLConnection httpURLConnection, int i, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.f11040f = httpURLConnection;
            mo24682a(i);
            mo24683a(inputStream);
            mo24685a(map);
            mo24684a(str);
        }

        /* renamed from: a */
        public void mo24680a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.f11040f;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            InputStream inputStream = this.f11044c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public <T> C4493j mo24673a(C4474b0<T> b0Var, String str, String str2) throws Exception {
        InputStream inputStream;
        IAlog.m16446a("%s hurl network stack is in use", "HttpExecutorImpl");
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(b0Var.mo24640a()).openConnection();
            C4508o0 i = b0Var.mo24650i();
            httpURLConnection.setConnectTimeout(i.f11132a);
            httpURLConnection.setReadTimeout(i.f11133b);
            mo24678a(httpURLConnection, "User-Agent", str);
            mo24678a(httpURLConnection, HttpHeaders.IF_MODIFIED_SINCE, str2);
            mo24678a(httpURLConnection, HttpHeaders.ACCEPT_ENCODING, "gzip");
            mo24677a(httpURLConnection, b0Var);
            if (b0Var.mo24655n() != C4528y.f11195b) {
                if (b0Var.mo24655n() != C4528y.PUT) {
                    httpURLConnection.connect();
                    inputStream = mo24676a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
                    C4493j a = mo24675a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(HttpHeaders.LAST_MODIFIED));
                    return new C4491a(httpURLConnection, a.f11042a, a.f11044c, a.f11045d, a.f11046e);
                }
            }
            mo24679b(httpURLConnection, b0Var);
            try {
                inputStream = mo24676a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
                inputStream = null;
            }
            try {
                C4493j a2 = mo24675a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(HttpHeaders.LAST_MODIFIED));
                return new C4491a(httpURLConnection, a2.f11042a, a2.f11044c, a2.f11045d, a2.f11046e);
            } catch (IOException e) {
                IAlog.m16445a("failed reading network response", e, new Object[0]);
                throw new C4515q0(e);
            }
        } catch (MalformedURLException e2) {
            IAlog.m16445a("failed creating request URL", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m16445a("failed executing network request", e3, new Object[0]);
            throw new C4473b((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void mo24674b() {
    }

    /* renamed from: b */
    public final void mo24679b(HttpURLConnection httpURLConnection, C4474b0 b0Var) throws Exception {
        httpURLConnection.setRequestMethod(b0Var.mo24655n().f11199a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] k = b0Var.mo24652k();
        int length = k != null ? k.length : 0;
        httpURLConnection.setRequestProperty("Content-Length", "" + length);
        httpURLConnection.setRequestProperty("Content-Type", b0Var.mo24654m());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(k);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final <T> void mo24677a(HttpURLConnection httpURLConnection, C4474b0<T> b0Var) {
        Map<String, String> q = b0Var.mo24657q();
        if (q != null) {
            for (String next : q.keySet()) {
                mo24678a(httpURLConnection, next, q.get(next));
            }
        }
    }

    /* renamed from: a */
    public final void mo24678a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int i = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "%s %s : %s", "REQUEST_HEADER", str, str2);
            httpURLConnection.addRequestProperty(str, str2);
        }
    }
}
