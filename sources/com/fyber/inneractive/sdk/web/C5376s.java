package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.C5312s;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.web.s */
public class C5376s {

    /* renamed from: g */
    public static final Pattern f14187g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h */
    public static final SimpleDateFormat f14188h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a */
    public final byte[] f14189a;

    /* renamed from: b */
    public final Map<String, String> f14190b;

    /* renamed from: c */
    public final String f14191c;

    /* renamed from: d */
    public final String f14192d;

    /* renamed from: e */
    public final int f14193e;

    /* renamed from: f */
    public final String f14194f;

    public C5376s(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.f14189a = bArr;
        this.f14190b = map;
        this.f14191c = str;
        this.f14192d = str2;
        this.f14193e = i;
        this.f14194f = str3;
    }

    /* renamed from: a */
    public boolean mo26517a() {
        boolean z;
        String str;
        if (TextUtils.isEmpty(this.f14194f)) {
            return false;
        }
        loop0:
        while (true) {
            z = true;
            for (String next : this.f14190b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (next != null && next.equalsIgnoreCase("Cache-Control")) {
                    String str2 = this.f14190b.get(next);
                    if (str2 != null) {
                        Pattern pattern = f14187g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str2.toLowerCase(locale));
                        int a = (!matcher.find() || matcher.groupCount() != 1) ? 0 : C5312s.m16530a(matcher.group(1), 0);
                        if ((str2.toLowerCase(locale).contains("public") || str2.toLowerCase(locale).contains("private") || ((long) a) > TimeUnit.SECONDS.convert(1, TimeUnit.HOURS)) && !str2.toLowerCase(locale).contains("no-") && !str2.toLowerCase(locale).contains("must-")) {
                        }
                    } else {
                        continue;
                    }
                } else if (next == null || !next.equalsIgnoreCase(HttpHeaders.VARY)) {
                    if (next != null && next.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                        String str3 = this.f14190b.get(next);
                        if (str3 != null) {
                            z = !str3.equalsIgnoreCase("no-cache");
                        }
                    } else if (!(next == null || !next.equalsIgnoreCase("Expires") || (str = this.f14190b.get(next)) == null)) {
                        try {
                            Date parse = f14188h.parse(str);
                            if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS) > System.currentTimeMillis()) {
                            }
                        } catch (ParseException unused) {
                            continue;
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        return z;
    }

    /* renamed from: b */
    public WebResourceResponse mo26518b() {
        return new WebResourceResponse(this.f14191c, this.f14192d, this.f14193e, this.f14194f, this.f14190b, new ByteArrayInputStream(this.f14189a));
    }
}
