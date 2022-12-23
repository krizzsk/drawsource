package com.ogury.p376cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p376cm.internal.bacab;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.abbba */
public final class abbba {

    /* renamed from: a */
    public static final abbba f24320a = new abbba();

    /* renamed from: b */
    private static int f24321b = 2;

    /* renamed from: c */
    private static int f24322c = 1;

    /* renamed from: d */
    private static abbcb f24323d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);

    /* renamed from: e */
    private static acacc f24324e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);

    /* renamed from: f */
    private static accba f24325f = new accba((accca) null, (accbc) null, 3, (bbabb) null);

    /* renamed from: g */
    private static acbbb f24326g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);

    /* renamed from: h */
    private static abbcc f24327h = new abbcc();

    /* renamed from: i */
    private static Date f24328i = new Date();

    /* renamed from: j */
    private static acbcc f24329j = new acbcc(true, (OguryError) null, 2, (bbabb) null);

    /* renamed from: k */
    private static String f24330k = "";

    /* renamed from: l */
    private static String f24331l = "";

    /* renamed from: m */
    private static String f24332m = "";

    /* renamed from: n */
    private static String[] f24333n = new String[0];

    /* renamed from: o */
    private static String f24334o = "";

    /* renamed from: p */
    private static String f24335p = "";

    private abbba() {
    }

    /* renamed from: a */
    public static int m27819a() {
        return f24321b;
    }

    /* renamed from: a */
    public static void m27820a(int i) {
        f24322c = 1;
    }

    /* renamed from: a */
    public static void m27821a(long j) {
        f24328i.setTime(j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m27822a(abbba abbba, int i, int i2, Object obj) {
        f24321b = 2;
        f24323d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);
        f24324e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
        f24325f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f24326g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
    }

    /* renamed from: a */
    public static void m27824a(acbcc acbcc) {
        bbabc.m28052b(acbcc, "<set-?>");
        f24329j = acbcc;
    }

    /* renamed from: a */
    public static void m27825a(String str) {
        bbabc.m28052b(str, "<set-?>");
        f24330k = str;
    }

    /* renamed from: a */
    public static void m27826a(Date date) {
        bbabc.m28052b(date, "<set-?>");
        f24328i = date;
    }

    /* renamed from: a */
    public static void m27827a(String[] strArr) {
        bbabc.m28052b(strArr, "value");
        bbabc.m28052b(strArr, "frameworksInResponse");
        String[] strArr2 = f24333n;
        int length = strArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!bacab.aaaaa.m28029a(strArr, strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m27829b(m27850r());
        }
        f24333n = strArr;
    }

    /* renamed from: b */
    public static int m27828b() {
        return f24322c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m27829b(abbcb abbcb) {
        bbabc.m28052b(abbcb, "consentResult");
        m27848p();
        f24327h = new abbcc();
        f24328i = new Date();
        f24330k = "";
        f24331l = "";
        f24332m = "";
        f24323d = abbcb;
    }

    /* renamed from: b */
    public static void m27830b(String str) {
        bbabc.m28052b(str, "<set-?>");
        f24331l = str;
    }

    /* renamed from: c */
    public static abbcb m27831c() {
        return f24323d;
    }

    /* renamed from: c */
    public static void m27832c(String str) {
        bbabc.m28052b(str, "<set-?>");
        f24332m = str;
    }

    /* renamed from: d */
    public static acacc m27833d() {
        return f24324e;
    }

    /* renamed from: d */
    public static void m27834d(String str) {
        bbabc.m28052b(str, "<set-?>");
        f24334o = str;
    }

    /* renamed from: e */
    public static accba m27835e() {
        return f24325f;
    }

    /* renamed from: e */
    public static void m27836e(String str) {
        bbabc.m28052b(str, "<set-?>");
        f24335p = str;
    }

    /* renamed from: f */
    public static acbbb m27837f() {
        return f24326g;
    }

    /* renamed from: f */
    public static boolean m27838f(String str) {
        bbabc.m28052b(str, "frameworkToCheck");
        return bacab.aaaaa.m28029a(f24333n, str);
    }

    /* renamed from: g */
    public static abbcc m27839g() {
        return f24327h;
    }

    /* renamed from: h */
    public static Date m27840h() {
        return f24328i;
    }

    /* renamed from: i */
    public static acbcc m27841i() {
        return f24329j;
    }

    /* renamed from: j */
    public static String m27842j() {
        return f24330k;
    }

    /* renamed from: k */
    public static String m27843k() {
        return f24331l;
    }

    /* renamed from: l */
    public static String m27844l() {
        return f24332m;
    }

    /* renamed from: m */
    public static String[] m27845m() {
        return f24333n;
    }

    /* renamed from: n */
    public static String m27846n() {
        return f24334o;
    }

    /* renamed from: o */
    public static String m27847o() {
        return f24335p;
    }

    /* renamed from: p */
    public static void m27848p() {
        f24329j = new acbcc(true, (OguryError) null, 2, (bbabb) null);
    }

    /* renamed from: q */
    public static boolean m27849q() {
        return f24329j.mo63914a();
    }

    /* renamed from: r */
    private static abbcb m27850r() {
        return new abbcb(f24321b != 2 ? new abcac() : new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final void mo63839a(abbcb abbcb) {
        bbabc.m28052b(abbcb, "consentResult");
        m27829b(abbcb);
        m27827a(new String[0]);
        f24334o = "";
        f24335p = "";
        f24326g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
        f24325f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f24324e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
    }
}
