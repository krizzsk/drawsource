package com.ogury.p377ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.ol */
class C10321ol extends C10320ok {
    /* renamed from: a */
    public static final String m29948a(String str, String str2, String str3) {
        C10263mq.m29882b(str, "$this$replaceFirst");
        C10263mq.m29882b(str2, "oldValue");
        C10263mq.m29882b(str3, "newValue");
        CharSequence charSequence = str;
        int a = C10312oc.m29955a(charSequence, str2);
        if (a < 0) {
            return str;
        }
        return C10312oc.m29959a(charSequence, a, str2.length() + a, (CharSequence) str3).toString();
    }

    /* renamed from: a */
    public static final boolean m29950a(String str, String str2) {
        C10263mq.m29882b(str, "$this$startsWith");
        C10263mq.m29882b(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: a */
    public static final boolean m29949a(CharSequence charSequence) {
        boolean z;
        C10263mq.m29882b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            Iterator it = C10312oc.m29967b(charSequence).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C10299nw.m29925a(charSequence.charAt(((C10219lb) it).mo65121a()))) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m29951a(String str, String str2, int i, int i2, boolean z) {
        C10263mq.m29882b(str, "$this$regionMatches");
        C10263mq.m29882b(str2, "other");
        if (!z) {
            return str.regionMatches(0, str2, i, i2);
        }
        return str.regionMatches(z, 0, str2, i, i2);
    }
}
