package com.ogury.p376cm.internal;

import com.ogury.p376cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.aacba */
public final class aacba {

    /* renamed from: a */
    public static final aacba f24277a = new aacba();

    private aacba() {
    }

    /* renamed from: a */
    public static String m27780a(int i) {
        aacbb aacbb = aacbb.f24278a;
        String a = aacbb.m27782a(i);
        if (a != null) {
            String obj = bbcbc.m28101c(a).toString();
            if (obj != null) {
                String substring = obj.substring(1);
                bbabc.m28049a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
            throw new babca("null cannot be cast to non-null type java.lang.String");
        }
        throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public static String m27781a(String str) {
        bbabc.m28052b(str, "responseArray");
        int i = 0;
        Object[] array = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(str)).toArray(new Integer[0]);
        if (array != null) {
            int length = array.length;
            String str2 = "";
            while (i < length) {
                int intValue = ((Number) array[i]).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                aacbb aacbb = aacbb.f24278a;
                String a = aacbb.m27782a(intValue);
                if (a != null) {
                    sb.append(bbcbc.m28101c(a).toString());
                    str2 = sb.toString();
                    i++;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return str2;
        }
        throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
