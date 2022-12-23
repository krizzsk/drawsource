package com.saygames.saypromo.p378a;

import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.P5 */
public abstract class C10485P5 {
    /* renamed from: a */
    public static final C10498R5 m30221a(String str) {
        URL url = new URL(str);
        C10492Q5 q5 = new C10492Q5(url.getProtocol(), url.getHost());
        String path = url.getPath();
        if (path != null) {
            for (String a : StringsKt.split$default((CharSequence) StringsKt.removePrefix(path, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null)) {
                q5.mo65366a(a);
            }
        }
        String query = url.getQuery();
        if (query != null) {
            for (String split$default : StringsKt.split$default((CharSequence) query, new String[]{"&"}, false, 0, 6, (Object) null)) {
                List split$default2 = StringsKt.split$default((CharSequence) split$default, new String[]{"="}, false, 0, 6, (Object) null);
                if (split$default2.size() >= 2) {
                    q5.mo65367a((String) split$default2.get(0), URLDecoder.decode((String) split$default2.get(1), Charsets.UTF_8.toString()));
                }
            }
        }
        return q5.mo65368a();
    }

    /* renamed from: a */
    public static final void m30222a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str + " is null");
        }
    }

    /* renamed from: b */
    public static final String m30223b(String str) {
        if (str == null) {
            return null;
        }
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() > 0) {
            return obj;
        }
        return null;
    }
}
