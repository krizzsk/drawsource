package com.ogury.core.internal;

import com.amazon.aps.shared.util.APSSharedUtil;

/* renamed from: com.ogury.core.internal.j */
/* compiled from: _ArraysJvm.kt */
class C9778j extends C9777i {
    /* renamed from: a */
    public static <T, A extends Appendable> A m28236a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C9714af<? super T, ? extends CharSequence> afVar) {
        C9717ai.m28145b(tArr, "$this$joinTo");
        C9717ai.m28145b(a, "buffer");
        C9717ai.m28145b(charSequence, "separator");
        C9717ai.m28145b(charSequence2, "prefix");
        C9717ai.m28145b(charSequence3, "postfix");
        C9717ai.m28145b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            boolean z = true;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C9717ai.m28145b(a, "$this$appendElement");
            if (afVar != null) {
                a.append((CharSequence) afVar.mo64035a(t));
            } else {
                if (t != null) {
                    z = t instanceof CharSequence;
                }
                if (z) {
                    a.append((CharSequence) t);
                } else if (t instanceof Character) {
                    a.append(((Character) t).charValue());
                } else {
                    a.append(String.valueOf(t));
                }
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m28237a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C9714af afVar, int i2) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = APSSharedUtil.TRUNCATE_SEPARATOR;
        C9717ai.m28145b(objArr, "$this$joinToString");
        C9717ai.m28145b(charSequence, "separator");
        C9717ai.m28145b(charSequence5, "prefix");
        C9717ai.m28145b(charSequence6, "postfix");
        C9717ai.m28145b(charSequence7, "truncated");
        String sb = ((StringBuilder) C9776h.m28236a((T[]) objArr, new StringBuilder(), charSequence, charSequence5, charSequence6, -1, charSequence7, (C9714af) null)).toString();
        C9717ai.m28143a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
