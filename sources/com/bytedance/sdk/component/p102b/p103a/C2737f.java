package com.bytedance.sdk.component.p102b.p103a;

import com.bytedance.sdk.component.p102b.p103a.p106b.C2725a;
import com.bytedance.sdk.component.p102b.p103a.p106b.C2733i;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.sdk.component.b.a.f */
/* compiled from: HttpUrl */
public final class C2737f {

    /* renamed from: d */
    private static final char[] f6084d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f6085a;

    /* renamed from: b */
    final String f6086b;

    /* renamed from: c */
    final int f6087c;

    /* renamed from: e */
    private final String f6088e;

    /* renamed from: f */
    private final String f6089f;

    /* renamed from: g */
    private final List<String> f6090g;

    /* renamed from: h */
    private final List<String> f6091h;

    /* renamed from: i */
    private final String f6092i;

    /* renamed from: j */
    private final String f6093j;

    C2737f(C2738a aVar) {
        this.f6085a = aVar.f6094a;
        this.f6088e = m7420a(aVar.f6095b, false);
        this.f6089f = m7420a(aVar.f6096c, false);
        this.f6086b = aVar.f6097d;
        this.f6087c = aVar.mo17486a();
        this.f6090g = m7421a(aVar.f6099f, false);
        String str = null;
        this.f6091h = aVar.f6100g != null ? m7421a(aVar.f6100g, true) : null;
        this.f6092i = aVar.f6101h != null ? m7420a(aVar.f6101h, false) : str;
        this.f6093j = aVar.toString();
    }

    /* renamed from: a */
    public URL mo17478a() {
        try {
            return new URL(this.f6093j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String mo17479b() {
        if (this.f6088e.isEmpty()) {
            return "";
        }
        int length = this.f6085a.length() + 3;
        String str = this.f6093j;
        return this.f6093j.substring(length, C2733i.m7397a(str, length, str.length(), ":@"));
    }

    /* renamed from: c */
    public String mo17480c() {
        if (this.f6089f.isEmpty()) {
            return "";
        }
        int indexOf = this.f6093j.indexOf(64);
        return this.f6093j.substring(this.f6093j.indexOf(58, this.f6085a.length() + 3) + 1, indexOf);
    }

    /* renamed from: a */
    public static int m7416a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: a */
    static void m7424a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: d */
    public List<String> mo17481d() {
        int indexOf = this.f6093j.indexOf(47, this.f6085a.length() + 3);
        String str = this.f6093j;
        int a = C2733i.m7397a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C2733i.m7396a(this.f6093j, i, a, '/');
            arrayList.add(this.f6093j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo17482e() {
        if (this.f6091h == null) {
            return null;
        }
        int indexOf = this.f6093j.indexOf(63) + 1;
        String str = this.f6093j;
        return this.f6093j.substring(indexOf, C2733i.m7396a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: b */
    static void m7427b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: b */
    static List<String> m7426b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C2737f m7428c(String str) {
        C2738a aVar = new C2738a();
        if (aVar.mo17487a((C2737f) null, str) == C2738a.C2739a.SUCCESS) {
            return aVar.mo17491b();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2737f) && ((C2737f) obj).f6093j.equals(this.f6093j);
    }

    public int hashCode() {
        return this.f6093j.hashCode();
    }

    public String toString() {
        return this.f6093j;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.f$a */
    /* compiled from: HttpUrl */
    public static final class C2738a {

        /* renamed from: a */
        String f6094a;

        /* renamed from: b */
        String f6095b = "";

        /* renamed from: c */
        String f6096c = "";

        /* renamed from: d */
        String f6097d;

        /* renamed from: e */
        int f6098e = -1;

        /* renamed from: f */
        final List<String> f6099f;

        /* renamed from: g */
        List<String> f6100g;

        /* renamed from: h */
        String f6101h;

        /* renamed from: com.bytedance.sdk.component.b.a.f$a$a */
        /* compiled from: HttpUrl */
        enum C2739a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C2738a() {
            ArrayList arrayList = new ArrayList();
            this.f6099f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public C2738a mo17488a(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f6094a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f6094a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: b */
        public C2738a mo17490b(String str) {
            if (str != null) {
                String e = m7441e(str, 0, str.length());
                if (e != null) {
                    this.f6097d = e;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo17486a() {
            int i = this.f6098e;
            return i != -1 ? i : C2737f.m7416a(this.f6094a);
        }

        /* renamed from: c */
        public C2738a mo17492c(String str) {
            if (str != null) {
                return m7434a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* renamed from: a */
        private C2738a m7434a(String str, boolean z) {
            int i = 0;
            do {
                int a = C2733i.m7397a(str, i, str.length(), "/\\");
                m7436a(str, i, a, a < str.length(), z);
                i = a + 1;
            } while (i <= str.length());
            return this;
        }

        /* renamed from: d */
        public C2738a mo17493d(String str) {
            this.f6100g = str != null ? C2737f.m7426b(C2737f.m7419a(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        /* renamed from: a */
        public C2738a mo17489a(String str, String str2) {
            if (str != null) {
                if (this.f6100g == null) {
                    this.f6100g = new ArrayList();
                }
                this.f6100g.add(C2737f.m7419a(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                this.f6100g.add(str2 != null ? C2737f.m7419a(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C2737f mo17491b() {
            if (this.f6094a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f6097d != null) {
                return new C2737f(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6094a);
            sb.append("://");
            if (!this.f6095b.isEmpty() || !this.f6096c.isEmpty()) {
                sb.append(this.f6095b);
                if (!this.f6096c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f6096c);
                }
                sb.append('@');
            }
            if (this.f6097d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f6097d);
                sb.append(']');
            } else {
                sb.append(this.f6097d);
            }
            int a = mo17486a();
            if (a != C2737f.m7416a(this.f6094a)) {
                sb.append(':');
                sb.append(a);
            }
            C2737f.m7424a(sb, this.f6099f);
            if (this.f6100g != null) {
                sb.append('?');
                C2737f.m7427b(sb, this.f6100g);
            }
            if (this.f6101h != null) {
                sb.append('#');
                sb.append(this.f6101h);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2739a mo17487a(C2737f fVar, String str) {
            int a;
            int i;
            C2737f fVar2 = fVar;
            String str2 = str;
            int a2 = C2733i.m7395a(str2, 0, str.length());
            int b = C2733i.m7403b(str2, a2, str.length());
            if (m7437b(str2, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f6094a = "https";
                    a2 += 6;
                } else if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                    return C2739a.UNSUPPORTED_SCHEME;
                } else {
                    this.f6094a = "http";
                    a2 += 5;
                }
            } else if (fVar2 == null) {
                return C2739a.MISSING_SCHEME;
            } else {
                this.f6094a = fVar2.f6085a;
            }
            int c = m7438c(str2, a2, b);
            char c2 = '?';
            char c3 = '#';
            if (c >= 2 || fVar2 == null || !fVar2.f6085a.equals(this.f6094a)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = a2 + c;
                while (true) {
                    a = C2733i.m7397a(str2, i2, b, "@/\\?#");
                    char charAt = a != b ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int d = m7440d(str2, i2, i3);
                        int i4 = d + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a3 = C2733i.m7396a(str2, i2, a, ':');
                                int i5 = a3;
                                String str3 = "%40";
                                i = a;
                                String a4 = C2737f.m7417a(str, i2, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a4 = this.f6095b + str3 + a4;
                                }
                                this.f6095b = a4;
                                if (i5 != i) {
                                    this.f6096c = C2737f.m7417a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = a;
                                this.f6096c += "%40" + C2737f.m7417a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int d2 = m7440d(str2, i2, i32);
                int i42 = d2 + 1;
                if (i42 < i32) {
                    this.f6097d = m7441e(str2, i2, d2);
                    int f = m7443f(str2, i42, i32);
                    this.f6098e = f;
                    if (f == -1) {
                        return C2739a.INVALID_PORT;
                    }
                } else {
                    this.f6097d = m7441e(str2, i2, d2);
                    this.f6098e = C2737f.m7416a(this.f6094a);
                }
                if (this.f6097d == null) {
                    return C2739a.INVALID_HOST;
                }
                a2 = i32;
            } else {
                this.f6095b = fVar.mo17479b();
                this.f6096c = fVar.mo17480c();
                this.f6097d = fVar2.f6086b;
                this.f6098e = fVar2.f6087c;
                this.f6099f.clear();
                this.f6099f.addAll(fVar.mo17481d());
                if (a2 == b || str2.charAt(a2) == '#') {
                    mo17493d(fVar.mo17482e());
                }
            }
            int a5 = C2733i.m7397a(str2, a2, b, "?#");
            m7435a(str2, a2, a5);
            if (a5 < b && str2.charAt(a5) == '?') {
                int a6 = C2733i.m7396a(str2, a5, b, '#');
                this.f6100g = C2737f.m7426b(C2737f.m7417a(str, a5 + 1, a6, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, (Charset) null));
                a5 = a6;
            }
            if (a5 < b && str2.charAt(a5) == '#') {
                this.f6101h = C2737f.m7417a(str, 1 + a5, b, "", true, false, false, false, (Charset) null);
            }
            return C2739a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: a */
        private void m7435a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f6099f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f6099f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f6099f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.p102b.p103a.p106b.C2733i.m7397a((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m7436a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p102b.p103a.C2737f.C2738a.m7435a(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private void m7436a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C2737f.m7417a(str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true, (Charset) null);
            if (!m7442e(a)) {
                if (m7444f(a)) {
                    m7439c();
                    return;
                }
                List<String> list = this.f6099f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f6099f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f6099f.add(a);
                }
                if (z) {
                    this.f6099f.add("");
                }
            }
        }

        /* renamed from: e */
        private boolean m7442e(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: f */
        private boolean m7444f(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: c */
        private void m7439c() {
            List<String> list = this.f6099f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f6099f.isEmpty()) {
                this.f6099f.add("");
                return;
            }
            List<String> list2 = this.f6099f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: b */
        private static int m7437b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: c */
        private static int m7438c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m7440d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: e */
        private static String m7441e(String str, int i, int i2) {
            return C2733i.m7398a(C2737f.m7418a(str, i, i2, false));
        }

        /* renamed from: f */
        private static int m7443f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C2737f.m7417a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: a */
    static String m7420a(String str, boolean z) {
        return m7418a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m7421a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m7420a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m7418a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C2725a aVar = new C2725a();
                aVar.mo17435a(str, i, i3);
                m7423a(aVar, str, i3, i2, z);
                return aVar.mo17446c();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m7423a(C2725a aVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = C2733i.m7394a(str.charAt(i + 1));
                int a2 = C2733i.m7394a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    aVar.mo17442b((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                aVar.mo17442b(32);
                i += Character.charCount(codePointAt);
            }
            aVar.mo17433a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m7425a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C2733i.m7394a(str.charAt(i + 1)) == -1 || C2733i.m7394a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m7417a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m7425a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C2725a aVar = new C2725a();
            int i5 = i;
            aVar.mo17435a(str, i, i4);
            m7422a(aVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return aVar.mo17446c();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m7422a(C2725a aVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C2725a aVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    aVar.mo17434a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m7425a(str, i, i2)))))) {
                    if (aVar2 == null) {
                        aVar2 = new C2725a();
                    }
                    if (charset == null || charset.equals(C2733i.f6082a)) {
                        aVar2.mo17433a(codePointAt);
                    } else {
                        aVar2.mo17436a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!aVar2.mo17439a()) {
                        byte b = aVar2.mo17441b() & 255;
                        aVar.mo17442b(37);
                        aVar.mo17442b((int) f6084d[(b >> 4) & 15]);
                        aVar.mo17442b((int) f6084d[b & Ascii.f18305SI]);
                    }
                } else {
                    aVar.mo17433a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m7419a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m7417a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }
}
