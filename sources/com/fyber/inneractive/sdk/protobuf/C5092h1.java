package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h1 */
public final class C5092h1 {

    /* renamed from: a */
    public static final Class<?> f13561a;

    /* renamed from: b */
    public static final C5135m1<?, ?> f13562b = m15471a(false);

    /* renamed from: c */
    public static final C5135m1<?, ?> f13563c = m15471a(true);

    /* renamed from: d */
    public static final C5135m1<?, ?> f13564d = new C5141o1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f13561a = cls;
    }

    /* renamed from: a */
    public static void m15477a(int i, List<Boolean> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    Logger logger = C5125l.f13629b;
                    i3++;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26042a(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26048b(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m15485b(int i, List<Double> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 8;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    C5125l lVar = mVar.f13640a;
                    double doubleValue = list.get(i2).doubleValue();
                    lVar.getClass();
                    lVar.mo26050c(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C5125l lVar2 = mVar.f13640a;
                double doubleValue2 = list.get(i2).doubleValue();
                lVar2.getClass();
                lVar2.mo26054f(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m15488c(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15767a(list.get(i4).intValue());
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26053f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26058h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m15491d(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 4;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26052e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26056g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m15494e(int i, List<Long> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 8;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26050c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26054f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m15497f(int i, List<Float> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 4;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    C5125l lVar = mVar.f13640a;
                    float floatValue = list.get(i2).floatValue();
                    lVar.getClass();
                    lVar.mo26052e(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C5125l lVar2 = mVar.f13640a;
                float floatValue2 = list.get(i2).floatValue();
                lVar2.getClass();
                lVar2.mo26056g(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m15500g(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15767a(list.get(i4).intValue());
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26053f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26058h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m15503h(int i, List<Long> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15776a(list.get(i4).longValue());
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26051d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26057g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m15506i(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 4;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26052e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26056g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m15508j(int i, List<Long> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C5125l.f13629b;
                    i3 += 8;
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26050c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26054f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m15509k(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15785c(C5125l.m15788d(list.get(i4).intValue()));
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26055g(C5125l.m15788d(list.get(i2).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26060j(i, C5125l.m15788d(list.get(i2).intValue()));
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m15510l(int i, List<Long> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15776a(C5125l.m15784b(list.get(i4).longValue()));
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26051d(C5125l.m15784b(list.get(i2).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26057g(i, C5125l.m15784b(list.get(i2).longValue()));
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m15511m(int i, List<Integer> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15785c(list.get(i4).intValue());
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26055g(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26060j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m15512n(int i, List<Long> list, C5184u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13640a.mo26059i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5125l.m15776a(list.get(i4).longValue());
                }
                mVar.f13640a.mo26055g(i3);
                while (i2 < list.size()) {
                    mVar.f13640a.mo26051d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26057g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m15475a(int i, List<C5093i> list, C5184u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f13640a.mo26045b(i, list.get(i2));
            }
        }
    }

    /* renamed from: b */
    public static void m15483b(int i, List<String> list, C5184u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (list instanceof C5082f0) {
                C5082f0 f0Var = (C5082f0) list;
                while (i2 < list.size()) {
                    Object a = f0Var.mo25798a(i2);
                    if (a instanceof String) {
                        mVar.f13640a.mo26047b(i, (String) a);
                    } else {
                        mVar.f13640a.mo26045b(i, (C5093i) a);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13640a.mo26047b(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static int m15486c(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C5125l.m15782b(i, 0);
        }
        int i2 = size * 4;
        return C5125l.m15781b(i) + C5125l.m15785c(i2) + i2;
    }

    /* renamed from: d */
    public static int m15490d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15767a(yVar.mo26233e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15767a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m15493e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15776a(h0Var.mo25897d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15776a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m15495f(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int e = m15493e(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(e) + e;
        }
        return e + (list.size() * C5125l.m15781b(i));
    }

    /* renamed from: g */
    public static int m15499g(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15776a(C5125l.m15784b(h0Var.mo25897d(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15776a(C5125l.m15784b(list.get(i2).longValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static int m15501h(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g = m15499g(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(g) + g;
        }
        return g + (size * C5125l.m15781b(i));
    }

    /* renamed from: i */
    public static int m15505i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15776a(h0Var.mo25897d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15776a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static int m15507j(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = m15505i(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(i2) + i2;
        }
        return i2 + (size * C5125l.m15781b(i));
    }

    /* renamed from: a */
    public static void m15476a(int i, List<?> list, C5184u1 u1Var, C5083f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.mo26087a(i, list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: a */
    public static int m15470a(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15767a(yVar.mo26233e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15767a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static int m15487c(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: f */
    public static int m15496f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15785c(C5125l.m15788d(yVar.mo26233e(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15785c(C5125l.m15788d(list.get(i2).intValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static int m15502h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            i = 0;
            while (i2 < size) {
                i += C5125l.m15785c(yVar.mo26233e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5125l.m15785c(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m15484b(int i, List<?> list, C5184u1 u1Var, C5083f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5133m mVar = (C5133m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f13640a.mo26046b(i, (C5149q0) list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: e */
    public static int m15492e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d = m15490d(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(d) + d;
        }
        return d + (size * C5125l.m15781b(i));
    }

    /* renamed from: g */
    public static int m15498g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = m15496f(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(f) + f;
        }
        return f + (size * C5125l.m15781b(i));
    }

    /* renamed from: d */
    public static int m15489d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C5125l.m15771a(i, 0);
        }
        int i2 = size * 8;
        return C5125l.m15781b(i) + C5125l.m15785c(i2) + i2;
    }

    /* renamed from: i */
    public static int m15504i(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = m15502h(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(h) + h;
        }
        return h + (size * C5125l.m15781b(i));
    }

    /* renamed from: b */
    public static int m15481b(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a = m15470a(list);
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(a) + a;
        }
        return a + (size * C5125l.m15781b(i));
    }

    /* renamed from: a */
    public static int m15469a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C5125l.m15781b(i) + C5125l.m15785c(size) + size;
        }
        return size * C5125l.m15775a(i, true);
    }

    /* renamed from: b */
    public static int m15482b(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: b */
    public static int m15479b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int b = C5125l.m15781b(i) * size;
        if (list instanceof C5082f0) {
            C5082f0 f0Var = (C5082f0) list;
            while (i4 < size) {
                Object a = f0Var.mo25798a(i4);
                if (a instanceof C5093i) {
                    i3 = C5125l.m15778a((C5093i) a);
                } else {
                    i3 = C5125l.m15779a((String) a);
                }
                b += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C5093i) {
                    i2 = C5125l.m15778a((C5093i) obj);
                } else {
                    i2 = C5125l.m15779a((String) obj);
                }
                b += i2;
                i4++;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static int m15466a(int i, Object obj, C5083f1 f1Var) {
        if (obj instanceof C5073d0) {
            return C5125l.m15781b(i) + C5125l.m15777a((C5073d0) obj);
        }
        int b = C5125l.m15781b(i);
        int serializedSize = ((C5058a) ((C5149q0) obj)).getSerializedSize(f1Var);
        return b + C5125l.m15785c(serializedSize) + serializedSize;
    }

    /* renamed from: a */
    public static int m15467a(int i, List<C5093i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = size * C5125l.m15781b(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            b += C5125l.m15778a(list.get(i2));
        }
        return b;
    }

    /* renamed from: a */
    public static int m15468a(int i, List<C5149q0> list, C5083f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C5125l.m15773a(i, list.get(i3), f1Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static int m15480b(int i, List<?> list, C5083f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = C5125l.m15781b(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C5073d0) {
                b += C5125l.m15777a((C5073d0) obj);
            } else {
                int serializedSize = ((C5058a) ((C5149q0) obj)).getSerializedSize(f1Var);
                b += C5125l.m15785c(serializedSize) + serializedSize;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static C5135m1<?, ?> m15471a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C5135m1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m15478a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <UT, UB> UB m15473a(int i, List<Integer> list, C5194z.C5198d<?> dVar, UB ub, C5135m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list.get(i3).intValue();
            if (dVar.mo26241a(intValue) != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = m1Var.mo26089a();
                }
                m1Var.mo26100b(ub, i, (long) intValue);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m15474a(int i, List<Integer> list, C5194z.C5199e eVar, UB ub, C5135m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo26242a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = m1Var.mo26089a();
                    }
                    m1Var.mo26100b(ub, i, (long) intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo26242a(intValue2)) {
                    if (ub == null) {
                        ub = m1Var.mo26089a();
                    }
                    m1Var.mo26100b(ub, i, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m15472a(int i, int i2, UB ub, C5135m1<UT, UB> m1Var) {
        if (ub == null) {
            ub = m1Var.mo26089a();
        }
        m1Var.mo26100b(ub, i, (long) i2);
        return ub;
    }
}
