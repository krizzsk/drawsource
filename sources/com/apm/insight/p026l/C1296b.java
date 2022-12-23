package com.apm.insight.p026l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.apm.insight.l.b */
public class C1296b {

    /* renamed from: a */
    private static DateFormat f1312a;

    /* renamed from: a */
    public static DateFormat m1787a() {
        if (f1312a == null) {
            f1312a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f1312a;
    }
}
