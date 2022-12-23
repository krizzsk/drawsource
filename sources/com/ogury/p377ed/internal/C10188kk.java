package com.ogury.p377ed.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kk */
class C10188kk extends C10187kj {
    /* renamed from: a */
    public static final <T> boolean m29748a(T[] tArr, T t) {
        C10263mq.m29882b(tArr, "$this$contains");
        return C10184kg.m29749b(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> int m29749b(T[] tArr, T t) {
        C10263mq.m29882b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C10263mq.m29881a((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static final char m29747a(char[] cArr) {
        C10263mq.m29882b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m29750b(T[] tArr) {
        C10263mq.m29882b(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C10190km.m29757a();
        }
        if (length != 1) {
            return C10184kg.m29751c(tArr);
        }
        return C10190km.m29753a(tArr[0]);
    }

    /* renamed from: c */
    public static final <T> List<T> m29751c(T[] tArr) {
        C10263mq.m29882b(tArr, "$this$toMutableList");
        return new ArrayList<>(C10190km.m29756a(tArr));
    }
}
