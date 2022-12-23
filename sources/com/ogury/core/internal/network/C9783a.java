package com.ogury.core.internal.network;

import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9792u;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.a */
/* compiled from: HeadersLoader.kt */
public final class C9783a {
    /* renamed from: a */
    public static final boolean m28240a(HeadersLoader headersLoader) {
        C9717ai.m28145b(headersLoader, "$this$isContentGzipEncoded");
        return C9717ai.m28144a((Object) headersLoader.loadHeaders().get("Content-Encoding"), (Object) "gzip");
    }

    /* renamed from: a */
    public static final boolean m28241a(HttpURLConnection httpURLConnection) {
        C9717ai.m28145b(httpURLConnection, "$this$isResponseGzipEncoded");
        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
        if (headerField == null) {
            return false;
        }
        Locale locale = Locale.US;
        C9717ai.m28143a((Object) locale, "Locale.US");
        String lowerCase = headerField.toLowerCase(locale);
        C9717ai.m28143a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C9717ai.m28144a((Object) lowerCase, (Object) "gzip");
    }

    /* renamed from: com.ogury.core.internal.network.a$a */
    /* compiled from: HeadersLoader.kt */
    public static final class C9784a implements HeadersLoader {
        C9784a() {
        }

        public final Map<String, String> loadHeaders() {
            return C9792u.m28244a();
        }
    }

    static {
        new C9784a();
    }
}
