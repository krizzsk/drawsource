package com.ogury.p377ed.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ogury.ed.internal.fv */
public final class C10037fv {

    /* renamed from: a */
    public static final C10038a f25259a = new C10038a((byte) 0);

    /* renamed from: com.ogury.ed.internal.fv$a */
    public static final class C10038a {
        public /* synthetic */ C10038a(byte b) {
            this();
        }

        private C10038a() {
        }
    }

    /* renamed from: a */
    public static Bitmap m29154a(String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        C10263mq.m29882b(str, "downloadUrl");
        Bitmap bitmap = null;
        try {
            httpURLConnection2 = m29156b(str);
            try {
                inputStream = httpURLConnection2.getInputStream();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                    options.inSampleSize = m29153a(options, C10054gi.m29196b(48), C10054gi.m29196b(48));
                    options.inJustDecodeBounds = false;
                    httpURLConnection = m29156b(str);
                    try {
                        inputStream2 = httpURLConnection.getInputStream();
                        try {
                            bitmap = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        inputStream2 = null;
                    }
                } catch (Throwable unused3) {
                    httpURLConnection = null;
                    inputStream2 = null;
                }
            } catch (Throwable unused4) {
                httpURLConnection = null;
                inputStream = null;
                inputStream2 = inputStream;
                m29155a(httpURLConnection2, inputStream);
                m29155a(httpURLConnection, inputStream2);
                return bitmap;
            }
        } catch (Throwable unused5) {
            httpURLConnection = null;
            httpURLConnection2 = null;
            inputStream = null;
            inputStream2 = inputStream;
            m29155a(httpURLConnection2, inputStream);
            m29155a(httpURLConnection, inputStream2);
            return bitmap;
        }
        m29155a(httpURLConnection2, inputStream);
        m29155a(httpURLConnection, inputStream2);
        return bitmap;
    }

    /* renamed from: b */
    private static HttpURLConnection m29156b(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.connect();
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static int m29153a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static void m29155a(HttpURLConnection httpURLConnection, InputStream inputStream) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
                return;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
