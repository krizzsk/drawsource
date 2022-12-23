package com.tapjoy.internal;

import com.tapjoy.internal.C11296bh;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tapjoy.internal.bi */
public final class C11299bi extends C11296bh {

    /* renamed from: a */
    public static final C11296bh.C11298a f26958a = new C11296bh.C11298a() {
        /* renamed from: a */
        public final C11296bh mo69717a(Reader reader) {
            return new C11299bi(reader);
        }

        /* renamed from: a */
        public final C11296bh mo69718a(String str) {
            return new C11299bi(new StringReader(str));
        }
    };

    /* renamed from: b */
    private final C11324cd f26959b = new C11324cd();

    /* renamed from: c */
    private final Reader f26960c;

    /* renamed from: d */
    private boolean f26961d = false;

    /* renamed from: e */
    private final char[] f26962e = new char[1024];

    /* renamed from: f */
    private int f26963f = 0;

    /* renamed from: g */
    private int f26964g = 0;

    /* renamed from: h */
    private int f26965h = 1;

    /* renamed from: i */
    private int f26966i = 1;

    /* renamed from: j */
    private final List<C11303bk> f26967j = new ArrayList();

    /* renamed from: k */
    private C11305bm f26968k;

    /* renamed from: l */
    private String f26969l;

    /* renamed from: m */
    private String f26970m;

    /* renamed from: n */
    private int f26971n;

    /* renamed from: o */
    private int f26972o;

    /* renamed from: p */
    private boolean f26973p;

    public C11299bi(Reader reader) {
        m30937a(C11303bk.EMPTY_DOCUMENT);
        this.f26973p = false;
        if (reader != null) {
            this.f26960c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: f */
    public final void mo69720f() {
        m30938a(C11305bm.BEGIN_ARRAY);
    }

    /* renamed from: g */
    public final void mo69721g() {
        m30938a(C11305bm.END_ARRAY);
    }

    /* renamed from: h */
    public final void mo69722h() {
        m30938a(C11305bm.BEGIN_OBJECT);
    }

    /* renamed from: i */
    public final void mo69723i() {
        m30938a(C11305bm.END_OBJECT);
    }

    /* renamed from: a */
    private void m30938a(C11305bm bmVar) {
        mo69725k();
        if (this.f26968k == bmVar) {
            m30945t();
            return;
        }
        throw new IllegalStateException("Expected " + bmVar + " but was " + mo69725k());
    }

    /* renamed from: j */
    public final boolean mo69724j() {
        mo69725k();
        return (this.f26968k == C11305bm.END_OBJECT || this.f26968k == C11305bm.END_ARRAY) ? false : true;
    }

    /* renamed from: k */
    public final C11305bm mo69725k() {
        C11305bm bmVar = this.f26968k;
        if (bmVar != null) {
            return bmVar;
        }
        int[] iArr = C113012.f26974a;
        List<C11303bk> list = this.f26967j;
        switch (iArr[list.get(list.size() - 1).ordinal()]) {
            case 1:
                m30941b(C11303bk.NONEMPTY_DOCUMENT);
                C11305bm v = m30947v();
                if (this.f26961d || this.f26968k == C11305bm.BEGIN_ARRAY || this.f26968k == C11305bm.BEGIN_OBJECT) {
                    return v;
                }
                throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.f26968k);
            case 2:
                return m30934a(true);
            case 3:
                return m30934a(false);
            case 4:
                return m30940b(true);
            case 5:
                int y = m30950y();
                if (y != 58) {
                    if (y == 61) {
                        m30951z();
                        if (this.f26963f < this.f26964g || m30939a(1)) {
                            char[] cArr = this.f26962e;
                            int i = this.f26963f;
                            if (cArr[i] == '>') {
                                this.f26963f = i + 1;
                            }
                        }
                    } else {
                        throw m30944e("Expected ':'");
                    }
                }
                m30941b(C11303bk.NONEMPTY_OBJECT);
                return m30947v();
            case 6:
                return m30940b(false);
            case 7:
                try {
                    C11305bm v2 = m30947v();
                    if (this.f26961d) {
                        return v2;
                    }
                    throw m30944e("Expected EOF");
                } catch (EOFException unused) {
                    C11305bm bmVar2 = C11305bm.END_DOCUMENT;
                    this.f26968k = bmVar2;
                    return bmVar2;
                }
            case 8:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: com.tapjoy.internal.bi$2 */
    static /* synthetic */ class C113012 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26974a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bk[] r0 = com.tapjoy.internal.C11303bk.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26974a = r0
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.EMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.NONEMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.EMPTY_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.DANGLING_NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.NONEMPTY_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.NONEMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26974a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.CLOSED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11299bi.C113012.<clinit>():void");
        }
    }

    /* renamed from: t */
    private C11305bm m30945t() {
        mo69725k();
        C11305bm bmVar = this.f26968k;
        this.f26968k = null;
        this.f26970m = null;
        this.f26969l = null;
        return bmVar;
    }

    /* renamed from: l */
    public final String mo69726l() {
        mo69725k();
        if (this.f26968k == C11305bm.NAME) {
            String str = this.f26969l;
            m30945t();
            return str;
        }
        throw new IllegalStateException("Expected a name but was " + mo69725k());
    }

    /* renamed from: m */
    public final String mo69727m() {
        mo69725k();
        if (this.f26968k == C11305bm.STRING || this.f26968k == C11305bm.NUMBER) {
            String str = this.f26970m;
            m30945t();
            return str;
        }
        throw new IllegalStateException("Expected a string but was " + mo69725k());
    }

    /* renamed from: n */
    public final boolean mo69728n() {
        mo69725k();
        if (this.f26968k == C11305bm.BOOLEAN) {
            boolean z = this.f26970m == "true";
            m30945t();
            return z;
        }
        throw new IllegalStateException("Expected a boolean but was " + this.f26968k);
    }

    /* renamed from: o */
    public final void mo69729o() {
        mo69725k();
        if (this.f26968k == C11305bm.NULL) {
            m30945t();
            return;
        }
        throw new IllegalStateException("Expected null but was " + this.f26968k);
    }

    /* renamed from: p */
    public final double mo69730p() {
        mo69725k();
        if (this.f26968k == C11305bm.STRING || this.f26968k == C11305bm.NUMBER) {
            double parseDouble = Double.parseDouble(this.f26970m);
            m30945t();
            return parseDouble;
        }
        throw new IllegalStateException("Expected a double but was " + this.f26968k);
    }

    /* renamed from: q */
    public final long mo69731q() {
        long j;
        mo69725k();
        if (this.f26968k == C11305bm.STRING || this.f26968k == C11305bm.NUMBER) {
            try {
                j = Long.parseLong(this.f26970m);
            } catch (NumberFormatException unused) {
                double parseDouble = Double.parseDouble(this.f26970m);
                long j2 = (long) parseDouble;
                if (((double) j2) == parseDouble) {
                    j = j2;
                } else {
                    throw new NumberFormatException(this.f26970m);
                }
            }
            m30945t();
            return j;
        }
        throw new IllegalStateException("Expected a long but was " + this.f26968k);
    }

    /* renamed from: r */
    public final int mo69732r() {
        int i;
        mo69725k();
        if (this.f26968k == C11305bm.STRING || this.f26968k == C11305bm.NUMBER) {
            try {
                i = Integer.parseInt(this.f26970m);
            } catch (NumberFormatException unused) {
                double parseDouble = Double.parseDouble(this.f26970m);
                int i2 = (int) parseDouble;
                if (((double) i2) == parseDouble) {
                    i = i2;
                } else {
                    throw new NumberFormatException(this.f26970m);
                }
            }
            m30945t();
            return i;
        }
        throw new IllegalStateException("Expected an int but was " + this.f26968k);
    }

    public final void close() {
        this.f26970m = null;
        this.f26968k = null;
        this.f26967j.clear();
        this.f26967j.add(C11303bk.CLOSED);
        this.f26960c.close();
    }

    /* renamed from: s */
    public final void mo69733s() {
        mo69725k();
        if (this.f26968k == C11305bm.END_ARRAY || this.f26968k == C11305bm.END_OBJECT) {
            throw new IllegalStateException("Expected a value but was " + this.f26968k);
        }
        this.f26973p = true;
        int i = 0;
        do {
            try {
                C11305bm t = m30945t();
                if (t != C11305bm.BEGIN_ARRAY) {
                    if (t != C11305bm.BEGIN_OBJECT) {
                        if (t == C11305bm.END_ARRAY || t == C11305bm.END_OBJECT) {
                            i--;
                            continue;
                        }
                    }
                }
                i++;
                continue;
            } finally {
                this.f26973p = false;
            }
        } while (i != 0);
    }

    /* renamed from: u */
    private C11303bk m30946u() {
        List<C11303bk> list = this.f26967j;
        return list.remove(list.size() - 1);
    }

    /* renamed from: a */
    private void m30937a(C11303bk bkVar) {
        this.f26967j.add(bkVar);
    }

    /* renamed from: b */
    private void m30941b(C11303bk bkVar) {
        List<C11303bk> list = this.f26967j;
        list.set(list.size() - 1, bkVar);
    }

    /* renamed from: a */
    private C11305bm m30934a(boolean z) {
        if (z) {
            m30941b(C11303bk.NONEMPTY_ARRAY);
        } else {
            int y = m30950y();
            if (y != 44) {
                if (y == 59) {
                    m30951z();
                } else if (y == 93) {
                    m30946u();
                    C11305bm bmVar = C11305bm.END_ARRAY;
                    this.f26968k = bmVar;
                    return bmVar;
                } else {
                    throw m30944e("Unterminated array");
                }
            }
        }
        int y2 = m30950y();
        if (!(y2 == 44 || y2 == 59)) {
            if (y2 != 93) {
                this.f26963f--;
                return m30947v();
            } else if (z) {
                m30946u();
                C11305bm bmVar2 = C11305bm.END_ARRAY;
                this.f26968k = bmVar2;
                return bmVar2;
            }
        }
        m30951z();
        this.f26963f--;
        this.f26970m = "null";
        C11305bm bmVar3 = C11305bm.NULL;
        this.f26968k = bmVar3;
        return bmVar3;
    }

    /* renamed from: b */
    private C11305bm m30940b(boolean z) {
        if (!z) {
            int y = m30950y();
            if (!(y == 44 || y == 59)) {
                if (y == 125) {
                    m30946u();
                    C11305bm bmVar = C11305bm.END_OBJECT;
                    this.f26968k = bmVar;
                    return bmVar;
                }
                throw m30944e("Unterminated object");
            }
        } else if (m30950y() != 125) {
            this.f26963f--;
        } else {
            m30946u();
            C11305bm bmVar2 = C11305bm.END_OBJECT;
            this.f26968k = bmVar2;
            return bmVar2;
        }
        int y2 = m30950y();
        if (y2 != 34) {
            if (y2 != 39) {
                m30951z();
                this.f26963f--;
                String c = m30942c(false);
                this.f26969l = c;
                if (c.length() == 0) {
                    throw m30944e("Expected name");
                }
                m30941b(C11303bk.DANGLING_NAME);
                C11305bm bmVar3 = C11305bm.NAME;
                this.f26968k = bmVar3;
                return bmVar3;
            }
            m30951z();
        }
        this.f26969l = m30936a((char) y2);
        m30941b(C11303bk.DANGLING_NAME);
        C11305bm bmVar32 = C11305bm.NAME;
        this.f26968k = bmVar32;
        return bmVar32;
    }

    /* renamed from: v */
    private C11305bm m30947v() {
        int y = m30950y();
        if (y != 34) {
            if (y == 39) {
                m30951z();
            } else if (y == 91) {
                m30937a(C11303bk.EMPTY_ARRAY);
                C11305bm bmVar = C11305bm.BEGIN_ARRAY;
                this.f26968k = bmVar;
                return bmVar;
            } else if (y != 123) {
                this.f26963f--;
                return m30932C();
            } else {
                m30937a(C11303bk.EMPTY_OBJECT);
                C11305bm bmVar2 = C11305bm.BEGIN_OBJECT;
                this.f26968k = bmVar2;
                return bmVar2;
            }
        }
        this.f26970m = m30936a((char) y);
        C11305bm bmVar3 = C11305bm.STRING;
        this.f26968k = bmVar3;
        return bmVar3;
    }

    /* renamed from: a */
    private boolean m30939a(int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            i2 = this.f26963f;
            if (i4 >= i2) {
                break;
            }
            if (this.f26962e[i4] == 10) {
                this.f26965h++;
                this.f26966i = 1;
            } else {
                this.f26966i++;
            }
            i4++;
        }
        int i5 = this.f26964g;
        if (i5 != i2) {
            int i6 = i5 - i2;
            this.f26964g = i6;
            char[] cArr = this.f26962e;
            System.arraycopy(cArr, i2, cArr, 0, i6);
        } else {
            this.f26964g = 0;
        }
        this.f26963f = 0;
        do {
            Reader reader = this.f26960c;
            char[] cArr2 = this.f26962e;
            int i7 = this.f26964g;
            int read = reader.read(cArr2, i7, cArr2.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f26964g + read;
            this.f26964g = i8;
            if (this.f26965h == 1 && (i3 = this.f26966i) == 1 && i8 > 0 && this.f26962e[0] == 65279) {
                this.f26963f++;
                this.f26966i = i3 - 1;
            }
        } while (this.f26964g < i);
        return true;
    }

    /* renamed from: w */
    private int m30948w() {
        int i = this.f26965h;
        for (int i2 = 0; i2 < this.f26963f; i2++) {
            if (this.f26962e[i2] == 10) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: x */
    private int m30949x() {
        int i = this.f26966i;
        for (int i2 = 0; i2 < this.f26963f; i2++) {
            i = this.f26962e[i2] == 10 ? 1 : i + 1;
        }
        return i;
    }

    /* renamed from: y */
    private int m30950y() {
        while (true) {
            if (this.f26963f < this.f26964g || m30939a(1)) {
                char[] cArr = this.f26962e;
                int i = this.f26963f;
                int i2 = i + 1;
                this.f26963f = i2;
                char c = cArr[i];
                if (!(c == 9 || c == 10 || c == 13 || c == ' ')) {
                    if (c == '#') {
                        m30951z();
                        m30930A();
                    } else if (c != '/') {
                        return c;
                    } else {
                        if (i2 == this.f26964g && !m30939a(1)) {
                            return c;
                        }
                        m30951z();
                        char[] cArr2 = this.f26962e;
                        int i3 = this.f26963f;
                        char c2 = cArr2[i3];
                        if (c2 == '*') {
                            this.f26963f = i3 + 1;
                            if (m30943d("*/")) {
                                this.f26963f += 2;
                            } else {
                                throw m30944e("Unterminated comment");
                            }
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.f26963f = i3 + 1;
                            m30930A();
                        }
                    }
                }
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: z */
    private void m30951z() {
        if (!this.f26961d) {
            throw m30944e("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30930A() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.f26963f
            int r1 = r3.f26964g
            if (r0 < r1) goto L_0x000d
            r0 = 1
            boolean r0 = r3.m30939a((int) r0)
            if (r0 == 0) goto L_0x001f
        L_0x000d:
            char[] r0 = r3.f26962e
            int r1 = r3.f26963f
            int r2 = r1 + 1
            r3.f26963f = r2
            char r0 = r0[r1]
            r1 = 13
            if (r0 == r1) goto L_0x001f
            r1 = 10
            if (r0 != r1) goto L_0x0000
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11299bi.m30930A():void");
    }

    /* renamed from: d */
    private boolean m30943d(String str) {
        while (true) {
            int i = 0;
            if (this.f26963f + str.length() > this.f26964g && !m30939a(str.length())) {
                return false;
            }
            while (i < str.length()) {
                if (this.f26962e[this.f26963f + i] == str.charAt(i)) {
                    i++;
                } else {
                    this.f26963f++;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0.append(r6.f26962e, r1, r6.f26963f - r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m30936a(char r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.f26963f
        L_0x0003:
            int r2 = r6.f26963f
            int r3 = r6.f26964g
            r4 = 1
            if (r2 >= r3) goto L_0x004e
            char[] r3 = r6.f26962e
            int r5 = r2 + 1
            r6.f26963f = r5
            char r2 = r3[r2]
            if (r2 != r7) goto L_0x0030
            boolean r7 = r6.f26973p
            if (r7 == 0) goto L_0x001b
            java.lang.String r7 = "skipped!"
            return r7
        L_0x001b:
            if (r0 != 0) goto L_0x0026
            com.tapjoy.internal.cd r7 = r6.f26959b
            int r5 = r5 - r1
            int r5 = r5 - r4
            java.lang.String r7 = r7.mo69774a(r3, r1, r5)
            return r7
        L_0x0026:
            int r5 = r5 - r1
            int r5 = r5 - r4
            r0.append(r3, r1, r5)
            java.lang.String r7 = r0.toString()
            return r7
        L_0x0030:
            r3 = 92
            if (r2 != r3) goto L_0x0003
            if (r0 != 0) goto L_0x003b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x003b:
            char[] r2 = r6.f26962e
            int r3 = r6.f26963f
            int r3 = r3 - r1
            int r3 = r3 - r4
            r0.append(r2, r1, r3)
            char r1 = r6.m30931B()
            r0.append(r1)
            int r1 = r6.f26963f
            goto L_0x0003
        L_0x004e:
            if (r0 != 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0055:
            char[] r2 = r6.f26962e
            int r3 = r6.f26963f
            int r3 = r3 - r1
            r0.append(r2, r1, r3)
            boolean r1 = r6.m30939a((int) r4)
            if (r1 == 0) goto L_0x0064
            goto L_0x0001
        L_0x0064:
            java.lang.String r7 = "Unterminated string"
            java.io.IOException r7 = r6.m30944e(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11299bi.m30936a(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        m30951z();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m30942c(boolean r8) {
        /*
            r7 = this;
            r0 = -1
            r7.f26971n = r0
            r0 = 0
            r7.f26972o = r0
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0009:
            int r4 = r7.f26963f
            int r5 = r4 + r2
            int r6 = r7.f26964g
            if (r5 >= r6) goto L_0x0054
            char[] r5 = r7.f26962e
            int r4 = r4 + r2
            char r4 = r5[r4]
            r5 = 9
            if (r4 == r5) goto L_0x0067
            r5 = 10
            if (r4 == r5) goto L_0x0067
            r5 = 12
            if (r4 == r5) goto L_0x0067
            r5 = 13
            if (r4 == r5) goto L_0x0067
            r5 = 32
            if (r4 == r5) goto L_0x0067
            r5 = 35
            if (r4 == r5) goto L_0x0050
            r5 = 44
            if (r4 == r5) goto L_0x0067
            r5 = 47
            if (r4 == r5) goto L_0x0050
            r5 = 61
            if (r4 == r5) goto L_0x0050
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L_0x0067
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L_0x0067
            r5 = 58
            if (r4 == r5) goto L_0x0067
            r5 = 59
            if (r4 == r5) goto L_0x0050
            switch(r4) {
                case 91: goto L_0x0067;
                case 92: goto L_0x0050;
                case 93: goto L_0x0067;
                default: goto L_0x004d;
            }
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0050:
            r7.m30951z()
            goto L_0x0067
        L_0x0054:
            char[] r4 = r7.f26962e
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0069
            int r4 = r2 + 1
            boolean r4 = r7.m30939a((int) r4)
            if (r4 != 0) goto L_0x0009
            char[] r4 = r7.f26962e
            int r5 = r7.f26964g
            r4[r5] = r0
        L_0x0067:
            r0 = r2
            goto L_0x0088
        L_0x0069:
            if (r3 != 0) goto L_0x0070
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0070:
            char[] r4 = r7.f26962e
            int r5 = r7.f26963f
            r3.append(r4, r5, r2)
            int r4 = r7.f26972o
            int r4 = r4 + r2
            r7.f26972o = r4
            int r4 = r7.f26963f
            int r4 = r4 + r2
            r7.f26963f = r4
            r2 = 1
            boolean r2 = r7.m30939a((int) r2)
            if (r2 != 0) goto L_0x00bb
        L_0x0088:
            if (r8 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x0091
            int r8 = r7.f26963f
            r7.f26971n = r8
            goto L_0x00b0
        L_0x0091:
            boolean r8 = r7.f26973p
            if (r8 == 0) goto L_0x0098
            java.lang.String r1 = "skipped!"
            goto L_0x00b0
        L_0x0098:
            if (r3 != 0) goto L_0x00a5
            com.tapjoy.internal.cd r8 = r7.f26959b
            char[] r1 = r7.f26962e
            int r2 = r7.f26963f
            java.lang.String r1 = r8.mo69774a(r1, r2, r0)
            goto L_0x00b0
        L_0x00a5:
            char[] r8 = r7.f26962e
            int r1 = r7.f26963f
            r3.append(r8, r1, r0)
            java.lang.String r1 = r3.toString()
        L_0x00b0:
            int r8 = r7.f26972o
            int r8 = r8 + r0
            r7.f26972o = r8
            int r8 = r7.f26963f
            int r8 = r8 + r0
            r7.f26963f = r8
            return r1
        L_0x00bb:
            r2 = r0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11299bi.m30942c(boolean):java.lang.String");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" near ");
        StringBuilder sb2 = new StringBuilder();
        int min = Math.min(this.f26963f, 20);
        sb2.append(this.f26962e, this.f26963f - min, min);
        sb2.append(this.f26962e, this.f26963f, Math.min(this.f26964g - this.f26963f, 20));
        sb.append(sb2);
        return sb.toString();
    }

    /* renamed from: B */
    private char m30931B() {
        if (this.f26963f != this.f26964g || m30939a(1)) {
            char[] cArr = this.f26962e;
            int i = this.f26963f;
            int i2 = i + 1;
            this.f26963f = i2;
            char c = cArr[i];
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                return c;
            }
            if (i2 + 4 <= this.f26964g || m30939a(4)) {
                String a = this.f26959b.mo69774a(this.f26962e, this.f26963f, 4);
                this.f26963f += 4;
                return (char) Integer.parseInt(a, 16);
            }
            throw m30944e("Unterminated escape sequence");
        }
        throw m30944e("Unterminated escape sequence");
    }

    /* renamed from: C */
    private C11305bm m30932C() {
        this.f26970m = m30942c(true);
        if (this.f26972o != 0) {
            C11305bm D = m30933D();
            this.f26968k = D;
            if (D == C11305bm.STRING) {
                m30951z();
            }
            return this.f26968k;
        }
        throw m30944e("Expected literal value");
    }

    /* renamed from: D */
    private C11305bm m30933D() {
        int i = this.f26971n;
        if (i == -1) {
            return C11305bm.STRING;
        }
        if (this.f26972o == 4) {
            char[] cArr = this.f26962e;
            if ('n' == cArr[i] || 'N' == cArr[i]) {
                char[] cArr2 = this.f26962e;
                int i2 = this.f26971n;
                if ('u' == cArr2[i2 + 1] || 'U' == cArr2[i2 + 1]) {
                    char[] cArr3 = this.f26962e;
                    int i3 = this.f26971n;
                    if ('l' == cArr3[i3 + 2] || 'L' == cArr3[i3 + 2]) {
                        char[] cArr4 = this.f26962e;
                        int i4 = this.f26971n;
                        if ('l' == cArr4[i4 + 3] || 'L' == cArr4[i4 + 3]) {
                            this.f26970m = "null";
                            return C11305bm.NULL;
                        }
                    }
                }
            }
        }
        if (this.f26972o == 4) {
            char[] cArr5 = this.f26962e;
            int i5 = this.f26971n;
            if ('t' == cArr5[i5] || 'T' == cArr5[i5]) {
                char[] cArr6 = this.f26962e;
                int i6 = this.f26971n;
                if ('r' == cArr6[i6 + 1] || 'R' == cArr6[i6 + 1]) {
                    char[] cArr7 = this.f26962e;
                    int i7 = this.f26971n;
                    if ('u' == cArr7[i7 + 2] || 'U' == cArr7[i7 + 2]) {
                        char[] cArr8 = this.f26962e;
                        int i8 = this.f26971n;
                        if ('e' == cArr8[i8 + 3] || 'E' == cArr8[i8 + 3]) {
                            this.f26970m = "true";
                            return C11305bm.BOOLEAN;
                        }
                    }
                }
            }
        }
        if (this.f26972o == 5) {
            char[] cArr9 = this.f26962e;
            int i9 = this.f26971n;
            if ('f' == cArr9[i9] || 'F' == cArr9[i9]) {
                char[] cArr10 = this.f26962e;
                int i10 = this.f26971n;
                if ('a' == cArr10[i10 + 1] || 'A' == cArr10[i10 + 1]) {
                    char[] cArr11 = this.f26962e;
                    int i11 = this.f26971n;
                    if ('l' == cArr11[i11 + 2] || 'L' == cArr11[i11 + 2]) {
                        char[] cArr12 = this.f26962e;
                        int i12 = this.f26971n;
                        if ('s' == cArr12[i12 + 3] || 'S' == cArr12[i12 + 3]) {
                            char[] cArr13 = this.f26962e;
                            int i13 = this.f26971n;
                            if ('e' == cArr13[i13 + 4] || 'E' == cArr13[i13 + 4]) {
                                this.f26970m = "false";
                                return C11305bm.BOOLEAN;
                            }
                        }
                    }
                }
            }
        }
        this.f26970m = this.f26959b.mo69774a(this.f26962e, this.f26971n, this.f26972o);
        return m30935a(this.f26962e, this.f26971n, this.f26972o);
    }

    /* renamed from: a */
    private static C11305bm m30935a(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        char c2 = cArr[i];
        if (c2 == '-') {
            int i5 = i + 1;
            i3 = i5;
            c2 = cArr[i5];
        } else {
            i3 = i;
        }
        if (c2 == '0') {
            i4 = i3 + 1;
            c = cArr[i4];
        } else if (c2 < '1' || c2 > '9') {
            return C11305bm.STRING;
        } else {
            i4 = i3 + 1;
            c = cArr[i4];
            while (c >= '0' && c <= '9') {
                i4++;
                c = cArr[i4];
            }
        }
        if (c == '.') {
            int i6 = i4 + 1;
            char c3 = cArr[i6];
            while (c >= '0' && c <= '9') {
                i6 = i4 + 1;
                c3 = cArr[i6];
            }
        }
        if (c == 'e' || c == 'E') {
            int i7 = i4 + 1;
            char c4 = cArr[i7];
            if (c4 == '+' || c4 == '-') {
                i7++;
                c4 = cArr[i7];
            }
            if (c4 < '0' || c4 > '9') {
                return C11305bm.STRING;
            }
            int i8 = i7 + 1;
            char c5 = cArr[i8];
            while (c5 >= '0' && c5 <= '9') {
                i8 = i4 + 1;
                c5 = cArr[i8];
            }
        }
        if (i4 == i + i2) {
            return C11305bm.NUMBER;
        }
        return C11305bm.STRING;
    }

    /* renamed from: e */
    private IOException m30944e(String str) {
        throw new C11308bo(str + " at line " + m30948w() + " column " + m30949x());
    }
}
