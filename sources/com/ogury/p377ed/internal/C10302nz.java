package com.ogury.p377ed.internal;

import com.google.android.exoplayer2.C5429C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.nz */
public final class C10302nz {

    /* renamed from: a */
    public static final Charset f25622a;

    /* renamed from: b */
    public static final Charset f25623b;

    /* renamed from: c */
    public static final Charset f25624c;

    /* renamed from: d */
    public static final Charset f25625d;

    /* renamed from: e */
    public static final Charset f25626e;

    /* renamed from: f */
    public static final Charset f25627f;

    /* renamed from: g */
    public static final C10302nz f25628g = new C10302nz();

    static {
        Charset forName = Charset.forName("UTF-8");
        C10263mq.m29879a((Object) forName, "Charset.forName(\"UTF-8\")");
        f25622a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C10263mq.m29879a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f25623b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C10263mq.m29879a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f25624c = forName3;
        Charset forName4 = Charset.forName(C5429C.UTF16LE_NAME);
        C10263mq.m29879a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f25625d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C10263mq.m29879a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f25626e = forName5;
        Charset forName6 = Charset.forName(C5429C.ISO88591_NAME);
        C10263mq.m29879a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f25627f = forName6;
    }

    private C10302nz() {
    }
}
