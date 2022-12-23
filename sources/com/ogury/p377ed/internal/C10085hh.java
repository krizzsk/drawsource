package com.ogury.p377ed.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.ogury.p377ed.internal.C10003ev;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.hh */
public final class C10085hh {

    /* renamed from: a */
    public static final C10085hh f25318a = new C10085hh();

    /* renamed from: b */
    private static C10081hd f25319b = C10081hd.f25312a;

    private C10085hh() {
    }

    /* renamed from: a */
    private static WebResourceResponse m29316a(String str, String str2) {
        String str3 = "javascript:" + str2 + str;
        Charset charset = C10302nz.f25622a;
        if (str3 != null) {
            byte[] bytes = str3.getBytes(charset);
            C10263mq.m29879a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static WebResourceResponse m29315a(Context context, C9991ek ekVar) {
        C10263mq.m29882b(context, "context");
        String a = C10081hd.m29307a(ekVar);
        C10003ev.C10004a aVar = C10003ev.f25164a;
        String b = C10003ev.C10004a.m28961a(context).mo64615b();
        if (b.length() > 0) {
            return m29316a(b, a);
        }
        return null;
    }
}
