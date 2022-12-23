package com.ogury.core.internal;

import com.google.android.exoplayer2.C5429C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.core.internal.au */
/* compiled from: Charsets.kt */
public final class C9731au {

    /* renamed from: a */
    public static final Charset f24608a;

    static {
        new C9731au();
        Charset forName = Charset.forName("UTF-8");
        C9717ai.m28143a((Object) forName, "Charset.forName(\"UTF-8\")");
        f24608a = forName;
        C9717ai.m28143a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C9717ai.m28143a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C9717ai.m28143a((Object) Charset.forName(C5429C.UTF16LE_NAME), "Charset.forName(\"UTF-16LE\")");
        C9717ai.m28143a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C9717ai.m28143a((Object) Charset.forName(C5429C.ISO88591_NAME), "Charset.forName(\"ISO-8859-1\")");
    }

    private C9731au() {
    }
}
