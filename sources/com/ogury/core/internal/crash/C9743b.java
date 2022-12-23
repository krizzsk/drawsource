package com.ogury.core.internal.crash;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ogury.core.internal.C9717ai;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ogury.core.internal.crash.b */
/* compiled from: CrashApi.kt */
public final class C9743b {

    /* renamed from: a */
    public static final C9743b f24621a = new C9743b();

    private C9743b() {
    }

    /* renamed from: a */
    public static int m28172a(String str, String str2) {
        C9717ai.m28145b(str, "crashJson");
        C9717ai.m28145b(str2, "url");
        URLConnection openConnection = new URL(str2).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            httpURLConnection.connect();
            return httpURLConnection.getResponseCode();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
