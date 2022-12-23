package com.iab.omid.library.smaato;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p397e.C12469e;

/* renamed from: com.iab.omid.library.smaato.b */
class C8022b {

    /* renamed from: a */
    private static final Pattern f19374a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f19375b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f19376c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f19377d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f19378e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f19379f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f19380g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    static String m22821a(String str, String str2) {
        C12469e.m33310a(str, "HTML is null or empty");
        int[][] a = m22824a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (m22826b(str, sb, f19375b, str2, a)) {
            return sb.toString();
        }
        if (m22823a(str, sb, f19374a, str2, a)) {
            return sb.toString();
        }
        if (m22826b(str, sb, f19377d, str2, a)) {
            return sb.toString();
        }
        if (m22823a(str, sb, f19376c, str2, a)) {
            return sb.toString();
        }
        if (m22826b(str, sb, f19379f, str2, a)) {
            return sb.toString();
        }
        if (m22823a(str, sb, f19378e, str2, a)) {
            return sb.toString();
        }
        if (m22823a(str, sb, f19380g, str2, a)) {
            return sb.toString();
        }
        return str2 + str;
    }

    /* renamed from: a */
    private static boolean m22822a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m22823a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m22822a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static int[][] m22824a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
    }

    /* renamed from: b */
    static String m22825b(String str, String str2) {
        return m22821a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: b */
    private static boolean m22826b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m22822a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
