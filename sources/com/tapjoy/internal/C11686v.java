package com.tapjoy.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tapjoy.internal.v */
public final class C11686v {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f28202a = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        }
    };

    /* renamed from: b */
    private static final ThreadLocal<DateFormat> f28203b = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        }
    };

    /* renamed from: a */
    public static String m32057a(Date date) {
        return f28202a.get().format(date);
    }
}
