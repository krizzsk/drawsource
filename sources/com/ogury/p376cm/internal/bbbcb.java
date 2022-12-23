package com.ogury.p376cm.internal;

import com.google.android.exoplayer2.C5429C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.cm.internal.bbbcb */
public final class bbbcb {

    /* renamed from: a */
    public static final Charset f24546a;

    /* renamed from: b */
    public static final Charset f24547b;

    /* renamed from: c */
    public static final Charset f24548c;

    /* renamed from: d */
    public static final Charset f24549d;

    /* renamed from: e */
    public static final Charset f24550e;

    /* renamed from: f */
    public static final Charset f24551f;

    /* renamed from: g */
    public static final bbbcb f24552g = new bbbcb();

    static {
        Charset forName = Charset.forName("UTF-8");
        bbabc.m28049a((Object) forName, "Charset.forName(\"UTF-8\")");
        f24546a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        bbabc.m28049a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f24547b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        bbabc.m28049a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f24548c = forName3;
        Charset forName4 = Charset.forName(C5429C.UTF16LE_NAME);
        bbabc.m28049a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f24549d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        bbabc.m28049a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f24550e = forName5;
        Charset forName6 = Charset.forName(C5429C.ISO88591_NAME);
        bbabc.m28049a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f24551f = forName6;
    }

    private bbbcb() {
    }
}
