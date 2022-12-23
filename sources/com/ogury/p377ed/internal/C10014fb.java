package com.ogury.p377ed.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.fb */
public final class C10014fb {

    /* renamed from: a */
    public static final C10014fb f25179a = new C10014fb();

    private C10014fb() {
    }

    /* renamed from: a */
    public static String m29008a(String str) {
        C10263mq.m29882b(str, "s");
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            C10263mq.m29879a((Object) instance, "getInstance(\"MD5\")");
            Charset forName = Charset.forName("US-ASCII");
            C10263mq.m29879a((Object) forName, "forName(\"US-ASCII\")");
            byte[] bytes = str.getBytes(forName);
            C10263mq.m29879a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes, 0, str.length());
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            C10268mv mvVar = C10268mv.f25610a;
            String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
            C10263mq.m29879a((Object) format, "java.lang.String.format(format, *args)");
            return format;
        } catch (NoSuchAlgorithmException e) {
            C9925da daVar = C9925da.f24975a;
            C9925da.m28653a(e);
            return "";
        }
    }
}
