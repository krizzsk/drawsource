package com.apm.insight.p026l;

import com.facebook.internal.security.CertificateUtil;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.m */
public class C1312m {

    /* renamed from: a */
    final Writer f1322a;

    /* renamed from: b */
    private final List<C1313a> f1323b = new ArrayList();

    /* renamed from: com.apm.insight.l.m$a */
    enum C1313a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public C1312m(Writer writer) {
        this.f1322a = writer;
    }

    /* renamed from: a */
    private void m1866a(C1313a aVar) {
        List<C1313a> list = this.f1323b;
        list.set(list.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m1867a(JSONArray jSONArray) {
        mo12587a();
        for (int i = 0; i < jSONArray.length(); i++) {
            mo12590a(jSONArray.get(i));
        }
        mo12592b();
    }

    /* renamed from: a */
    public static void m1868a(JSONArray jSONArray, Writer writer) {
        new C1312m(writer).m1867a(jSONArray);
        writer.flush();
    }

    /* renamed from: a */
    private void m1869a(JSONObject jSONObject) {
        mo12593c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo12591a(next).mo12590a(jSONObject.get(next));
        }
        mo12594d();
    }

    /* renamed from: a */
    public static void m1870a(JSONObject jSONObject, Writer writer) {
        new C1312m(writer).m1869a(jSONObject);
        writer.flush();
    }

    /* renamed from: b */
    private void m1871b(String str) {
        Writer writer;
        String str2;
        this.f1322a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer = this.f1322a;
                str2 = "\\f";
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            writer = this.f1322a;
                            str2 = "\\b";
                            break;
                        case 9:
                            writer = this.f1322a;
                            str2 = "\\t";
                            break;
                        case 10:
                            writer = this.f1322a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f1322a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f1322a.write(92);
                }
                this.f1322a.write(charAt);
            } else {
                writer = this.f1322a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f1322a.write("\"");
    }

    /* renamed from: e */
    private C1313a m1872e() {
        List<C1313a> list = this.f1323b;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private void m1873f() {
        C1313a e = m1872e();
        if (e == C1313a.NONEMPTY_OBJECT) {
            this.f1322a.write(44);
        } else if (e != C1313a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m1866a(C1313a.DANGLING_KEY);
    }

    /* renamed from: g */
    private void m1874g() {
        C1313a aVar;
        if (!this.f1323b.isEmpty()) {
            C1313a e = m1872e();
            if (e == C1313a.EMPTY_ARRAY) {
                aVar = C1313a.NONEMPTY_ARRAY;
            } else if (e == C1313a.NONEMPTY_ARRAY) {
                this.f1322a.write(44);
                return;
            } else if (e == C1313a.DANGLING_KEY) {
                this.f1322a.write(CertificateUtil.DELIMITER);
                aVar = C1313a.NONEMPTY_OBJECT;
            } else if (e != C1313a.NULL) {
                throw new JSONException("Nesting problem");
            } else {
                return;
            }
            m1866a(aVar);
        }
    }

    /* renamed from: a */
    public C1312m mo12587a() {
        return mo12589a(C1313a.EMPTY_ARRAY, "[");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1312m mo12588a(C1313a aVar, C1313a aVar2, String str) {
        m1872e();
        List<C1313a> list = this.f1323b;
        list.remove(list.size() - 1);
        this.f1322a.write(str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1312m mo12589a(C1313a aVar, String str) {
        m1874g();
        this.f1323b.add(aVar);
        this.f1322a.write(str);
        return this;
    }

    /* renamed from: a */
    public C1312m mo12590a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            m1867a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m1869a((JSONObject) obj);
            return this;
        } else {
            m1874g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f1322a.write("null");
            } else {
                if (obj instanceof Boolean) {
                    writer = this.f1322a;
                    numberToString = String.valueOf(obj);
                } else if (obj instanceof Number) {
                    writer = this.f1322a;
                    numberToString = JSONObject.numberToString((Number) obj);
                } else {
                    m1871b(obj.toString());
                }
                writer.write(numberToString);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C1312m mo12591a(String str) {
        m1873f();
        m1871b(str);
        return this;
    }

    /* renamed from: b */
    public C1312m mo12592b() {
        return mo12588a(C1313a.EMPTY_ARRAY, C1313a.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public C1312m mo12593c() {
        return mo12589a(C1313a.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public C1312m mo12594d() {
        return mo12588a(C1313a.EMPTY_OBJECT, C1313a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
