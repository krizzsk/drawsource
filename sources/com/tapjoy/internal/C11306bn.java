package com.tapjoy.internal;

import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bn */
public final class C11306bn implements Closeable {

    /* renamed from: a */
    final Writer f26995a;

    /* renamed from: b */
    private final List<C11303bk> f26996b;

    /* renamed from: c */
    private String f26997c;

    /* renamed from: d */
    private String f26998d = CertificateUtil.DELIMITER;

    /* renamed from: e */
    private boolean f26999e;

    public C11306bn(Writer writer) {
        ArrayList arrayList = new ArrayList();
        this.f26996b = arrayList;
        arrayList.add(C11303bk.EMPTY_DOCUMENT);
        if (writer != null) {
            this.f26995a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final C11306bn mo69735a() {
        return m30984a(C11303bk.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    public final C11306bn mo69743b() {
        return m30983a(C11303bk.EMPTY_ARRAY, C11303bk.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public final C11306bn mo69745c() {
        return m30984a(C11303bk.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public final C11306bn mo69747d() {
        return m30983a(C11303bk.EMPTY_OBJECT, C11303bk.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: a */
    private C11306bn m30984a(C11303bk bkVar, String str) {
        m30990b(true);
        this.f26996b.add(bkVar);
        this.f26995a.write(str);
        return this;
    }

    /* renamed from: a */
    private C11306bn m30983a(C11303bk bkVar, C11303bk bkVar2, String str) {
        C11303bk e = m30992e();
        if (e == bkVar2 || e == bkVar) {
            List<C11303bk> list = this.f26996b;
            list.remove(list.size() - 1);
            if (e == bkVar2) {
                m30994g();
            }
            this.f26995a.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem: " + this.f26996b);
    }

    /* renamed from: e */
    private C11303bk m30992e() {
        List<C11303bk> list = this.f26996b;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    private void m30988a(C11303bk bkVar) {
        List<C11303bk> list = this.f26996b;
        list.set(list.size() - 1, bkVar);
    }

    /* renamed from: a */
    public final C11306bn mo69740a(String str) {
        if (str != null) {
            m30995h();
            m30991c(str);
            return this;
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: b */
    public final C11306bn mo69744b(String str) {
        if (str == null) {
            return m30993f();
        }
        m30990b(false);
        m30991c(str);
        return this;
    }

    /* renamed from: f */
    private C11306bn m30993f() {
        m30990b(false);
        this.f26995a.write("null");
        return this;
    }

    /* renamed from: a */
    private C11306bn m30986a(boolean z) {
        m30990b(false);
        this.f26995a.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    private C11306bn m30982a(double d) {
        if (this.f26999e || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m30990b(false);
            this.f26995a.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
    }

    /* renamed from: a */
    public final C11306bn mo69736a(long j) {
        m30990b(false);
        this.f26995a.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public final C11306bn mo69738a(Number number) {
        if (number == null) {
            return m30993f();
        }
        String obj = number.toString();
        if (this.f26999e || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m30990b(false);
            this.f26995a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    public final void close() {
        this.f26995a.close();
        if (m30992e() != C11303bk.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    /* renamed from: c */
    private void m30991c(String str) {
        this.f26995a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                this.f26995a.write("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '\\') {
                    if (charAt != 8232 && charAt != 8233) {
                        switch (charAt) {
                            case 8:
                                this.f26995a.write("\\b");
                                continue;
                            case 9:
                                this.f26995a.write("\\t");
                                continue;
                            case 10:
                                this.f26995a.write("\\n");
                                continue;
                            default:
                                if (charAt <= 31) {
                                    this.f26995a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    continue;
                                }
                                break;
                        }
                    } else {
                        this.f26995a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    }
                } else {
                    this.f26995a.write(92);
                }
                this.f26995a.write(charAt);
            } else {
                this.f26995a.write("\\r");
            }
        }
        this.f26995a.write("\"");
    }

    /* renamed from: g */
    private void m30994g() {
        if (this.f26997c != null) {
            this.f26995a.write("\n");
            for (int i = 1; i < this.f26996b.size(); i++) {
                this.f26995a.write(this.f26997c);
            }
        }
    }

    /* renamed from: h */
    private void m30995h() {
        C11303bk e = m30992e();
        if (e == C11303bk.NONEMPTY_OBJECT) {
            this.f26995a.write(44);
        } else if (e != C11303bk.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f26996b);
        }
        m30994g();
        m30988a(C11303bk.DANGLING_NAME);
    }

    /* renamed from: com.tapjoy.internal.bn$1 */
    static /* synthetic */ class C113071 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27000a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bk[] r0 = com.tapjoy.internal.C11303bk.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27000a = r0
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.EMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27000a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27000a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.NONEMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27000a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.DANGLING_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27000a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11303bk.NONEMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11306bn.C113071.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m30990b(boolean z) {
        int i = C113071.f27000a[m30992e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                m30988a(C11303bk.NONEMPTY_ARRAY);
                m30994g();
            } else if (i == 3) {
                this.f26995a.append(',');
                m30994g();
            } else if (i == 4) {
                this.f26995a.append(this.f26998d);
                m30988a(C11303bk.NONEMPTY_OBJECT);
            } else if (i != 5) {
                throw new IllegalStateException("Nesting problem: " + this.f26996b);
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (this.f26999e || z) {
            m30988a(C11303bk.NONEMPTY_DOCUMENT);
        } else {
            throw new IllegalStateException("JSON must start with an array or an object.");
        }
    }

    /* renamed from: a */
    public final C11306bn mo69739a(Object obj) {
        if (obj == null) {
            return m30993f();
        }
        if (obj instanceof C11304bl) {
            if (this.f26996b.size() == this.f26996b.size()) {
                return this;
            }
            throw new IllegalStateException(obj.getClass().getName() + ".writeToJson(JsonWriter) wrote incomplete value");
        } else if (obj instanceof Boolean) {
            return m30986a(((Boolean) obj).booleanValue());
        } else {
            if (obj instanceof Number) {
                if (obj instanceof Long) {
                    return mo69736a(((Number) obj).longValue());
                }
                if (obj instanceof Double) {
                    return m30982a(((Number) obj).doubleValue());
                }
                return mo69738a((Number) obj);
            } else if (obj instanceof String) {
                return mo69744b((String) obj);
            } else {
                if (obj instanceof C11294bf) {
                    return mo69737a((C11294bf) obj);
                }
                if (obj instanceof Collection) {
                    return mo69741a((Collection) obj);
                }
                if (obj instanceof Map) {
                    return m30989b((Map) obj);
                }
                if (obj instanceof Date) {
                    return m30985a((Date) obj);
                }
                if (obj instanceof Object[]) {
                    return m30987a((Object[]) obj);
                }
                throw new IllegalArgumentException("Unknown type: " + obj.getClass().getName());
            }
        }
    }

    /* renamed from: a */
    private C11306bn m30987a(Object[] objArr) {
        if (objArr == null) {
            return m30993f();
        }
        mo69735a();
        for (Object a : objArr) {
            mo69739a(a);
        }
        mo69743b();
        return this;
    }

    /* renamed from: a */
    public final C11306bn mo69737a(C11294bf bfVar) {
        m30990b(false);
        bfVar.mo69695a(this.f26995a);
        return this;
    }

    /* renamed from: a */
    public final C11306bn mo69741a(Collection collection) {
        if (collection == null) {
            return m30993f();
        }
        mo69735a();
        for (Object a : collection) {
            mo69739a(a);
        }
        mo69743b();
        return this;
    }

    /* renamed from: b */
    private C11306bn m30989b(Map map) {
        return mo69742a((Map<Object, Object>) map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C11306bn mo69742a(Map<Object, Object> map) {
        if (map == null) {
            return m30993f();
        }
        mo69745c();
        for (Map.Entry next : map.entrySet()) {
            mo69740a(String.valueOf(next.getKey()));
            mo69739a(next.getValue());
        }
        mo69747d();
        return this;
    }

    /* renamed from: a */
    private C11306bn m30985a(Date date) {
        if (date == null) {
            return m30993f();
        }
        return mo69744b(C11686v.m32057a(date));
    }
}
