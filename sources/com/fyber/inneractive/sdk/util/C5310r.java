package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.util.r */
public class C5310r {
    /* renamed from: a */
    public static boolean m16527a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m16528b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return true;
        }
        IAlog.m16446a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
        return false;
    }

    /* renamed from: a */
    public static String m16525a(String str, int i, int i2, int i3) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            InputStream a = m16524a((URLConnection) httpURLConnection);
            String a2 = m16526a(httpURLConnection);
            if (TextUtils.isEmpty(a2)) {
                String stringBuffer = m16528b(httpURLConnection) ? C5312s.m16535a(a, false).toString() : null;
                httpURLConnection.disconnect();
                return stringBuffer;
            } else if (i3 >= 0) {
                httpURLConnection.disconnect();
                return m16525a(a2, i2, i, i3);
            } else {
                throw new Exception("AdServer returned HTTP redirect response more than " + i3 + " times! aborting");
            }
        } catch (Exception e) {
            IAlog.m16445a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.m16445a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static InputStream m16524a(URLConnection uRLConnection) {
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStream);
            }
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m16526a(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 302 && responseCode != 303 && responseCode != 307) {
            return null;
        }
        IAlog.m16446a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.m16446a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
    }
}
