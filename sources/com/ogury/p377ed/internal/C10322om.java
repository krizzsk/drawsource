package com.ogury.p377ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.om */
class C10322om extends C10321ol {
    /* renamed from: a */
    public static final void m29963a(int i) {
    }

    /* renamed from: b */
    public static final C10282nh m29967b(CharSequence charSequence) {
        C10263mq.m29882b(charSequence, "$this$indices");
        return new C10282nh(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final int m29971c(CharSequence charSequence) {
        C10263mq.m29882b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    public static final String m29960a(CharSequence charSequence, C10282nh nhVar) {
        C10263mq.m29882b(charSequence, "$this$substring");
        C10263mq.m29882b(nhVar, SessionDescription.ATTR_RANGE);
        return charSequence.subSequence(nhVar.mo65157e().intValue(), nhVar.mo65158f().intValue() + 1).toString();
    }

    /* renamed from: c */
    public static final String m29974c(String str, String str2) {
        C10263mq.m29882b(str, "$this$substringAfterLast");
        C10263mq.m29882b(str2, "missingDelimiterValue");
        int d = C10312oc.m29954a((CharSequence) str, C10312oc.m29971c(str));
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(d + 1, str.length());
        C10263mq.m29879a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final CharSequence m29959a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C10263mq.m29882b(charSequence, "$this$replaceRange");
        C10263mq.m29882b(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C10263mq.m29879a((Object) sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C10263mq.m29879a((Object) sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: a */
    public static final boolean m29965a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C10263mq.m29882b(charSequence, "$this$regionMatchesImpl");
        C10263mq.m29882b(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C10299nw.m29926a(charSequence.charAt(i3 + 0), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final int m29958a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C10263mq.m29882b(charSequence, "$this$indexOfAny");
        C10263mq.m29882b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C10284ni.m29919a(i);
            int c = C10312oc.m29971c(charSequence);
            if (a > c) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C10299nw.m29926a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == c) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C10184kg.m29747a(cArr), i);
        }
    }

    /* renamed from: a */
    public static final int m29957a(CharSequence charSequence, char[] cArr, int i) {
        C10263mq.m29882b(charSequence, "$this$lastIndexOfAny");
        C10263mq.m29882b(cArr, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C10184kg.m29747a(cArr), i);
        }
        for (int b = C10284ni.m29921b(i, C10312oc.m29971c(charSequence)); b >= 0; b--) {
            char charAt = charSequence.charAt(b);
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    break;
                } else if (C10299nw.m29926a(cArr[i2], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return b;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m29966b(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C10279nf nhVar = new C10282nh(C10284ni.m29919a(i), C10284ni.m29921b(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = nhVar.mo65148a();
            int b = nhVar.mo65149b();
            int c = nhVar.mo65150c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (!C10312oc.m29965a(charSequence2, charSequence, a, charSequence2.length(), z)) {
                if (a == b) {
                    return -1;
                }
                a += c;
            }
            return a;
        }
        int a2 = nhVar.mo65148a();
        int b2 = nhVar.mo65149b();
        int c2 = nhVar.mo65150c();
        if (c2 >= 0) {
            if (a2 > b2) {
                return -1;
            }
        } else if (a2 < b2) {
            return -1;
        }
        while (!C10312oc.m29951a((String) charSequence2, (String) charSequence, a2, charSequence2.length(), z)) {
            if (a2 == b2) {
                return -1;
            }
            a2 += c2;
        }
        return a2;
    }

    /* renamed from: a */
    public static final int m29956a(CharSequence charSequence, String str, int i, boolean z) {
        C10263mq.m29882b(charSequence, "$this$indexOf");
        C10263mq.m29882b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m29966b(charSequence, str, i, charSequence.length(), z);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: a */
    public static final int m29954a(CharSequence charSequence, int i) {
        C10263mq.m29882b(charSequence, "$this$lastIndexOf");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(46, i);
        }
        return C10312oc.m29957a(charSequence, new char[]{'.'}, i);
    }

    /* renamed from: a */
    public static final boolean m29964a(CharSequence charSequence, CharSequence charSequence2) {
        C10263mq.m29882b(charSequence, "$this$contains");
        C10263mq.m29882b(charSequence2, "other");
        return charSequence2 instanceof String ? C10312oc.m29956a(charSequence, (String) charSequence2, 0, false) >= 0 : m29966b(charSequence, charSequence2, 0, charSequence.length(), false) >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C10291np<C10282nh> m29973c(CharSequence charSequence, char[] cArr) {
        C10312oc.m29963a(0);
        return new C10306oa(charSequence, 0, new C10323a(cArr, false));
    }

    /* renamed from: com.ogury.ed.internal.om$a */
    static final class C10323a extends C10264mr implements C10239lv<CharSequence, Integer, C10176jz<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f25650a;

        /* renamed from: b */
        final /* synthetic */ boolean f25651b = false;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10323a(char[] cArr, boolean z) {
            super(2);
            this.f25650a = cArr;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64398a(Object obj, Object obj2) {
            return m29977a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        private C10176jz<Integer, Integer> m29977a(CharSequence charSequence, int i) {
            C10263mq.m29882b(charSequence, "$receiver");
            int a = C10312oc.m29958a(charSequence, this.f25650a, i, this.f25651b);
            if (a < 0) {
                return null;
            }
            return C10179kb.m29744a(Integer.valueOf(a), 1);
        }
    }

    /* renamed from: a */
    public static final List<String> m29962a(CharSequence charSequence, char[] cArr) {
        C10263mq.m29882b(charSequence, "$this$split");
        C10263mq.m29882b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m29968b(charSequence, String.valueOf(cArr[0]));
        }
        Iterable<C10282nh> a = C10292nq.m29924a(m29973c(charSequence, cArr));
        Collection arrayList = new ArrayList(C10190km.m29760a(a));
        for (C10282nh a2 : a) {
            arrayList.add(C10312oc.m29960a(charSequence, a2));
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private static final List<String> m29968b(CharSequence charSequence, String str) {
        C10312oc.m29963a(0);
        int a = C10312oc.m29956a(charSequence, str, 0, false);
        if (a == -1) {
            return C10190km.m29753a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, a).toString());
            i = str.length() + a;
            a = C10312oc.m29956a(charSequence, str, i, false);
        } while (a != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }
}
