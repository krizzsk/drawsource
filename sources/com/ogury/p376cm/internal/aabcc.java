package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.aabcc */
public final class aabcc {

    /* renamed from: a */
    public static final aabcc f24272a = new aabcc();

    private aabcc() {
    }

    /* renamed from: a */
    public static boolean m27767a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static boolean m27768a(Integer[] numArr, int i) {
        int i2;
        bbabc.m28052b(numArr, TtmlNode.RUBY_CONTAINER);
        if (!(!(numArr.length == 0)) || numArr.length <= (i2 = i / 32)) {
            return false;
        }
        return m27767a(numArr[i2].intValue(), (int) Math.pow(2.0d, (double) (i - (i2 * 32))));
    }
}
