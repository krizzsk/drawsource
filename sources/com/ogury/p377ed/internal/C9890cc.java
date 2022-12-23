package com.ogury.p377ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cc */
public final class C9890cc {
    /* renamed from: a */
    public static final String m28564a(Activity activity) {
        C10263mq.m29882b(activity, "<this>");
        String a = m28565a((Object) activity);
        List b = C10312oc.m29969b((CharSequence) a, new char[]{'.'});
        if (b.size() <= 2) {
            return a;
        }
        return ((String) b.get(0)) + '.' + ((String) b.get(1)) + '.';
    }

    /* renamed from: a */
    public static final String m28565a(Object obj) {
        C10263mq.m29882b(obj, "<this>");
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String name = obj.getClass().getName();
        C10263mq.m29879a((Object) name, "this.javaClass.name");
        return name;
    }
}
