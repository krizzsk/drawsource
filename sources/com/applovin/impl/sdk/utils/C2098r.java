package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.r */
public class C2098r {

    /* renamed from: a */
    public static final C2098r f4117a = new C2098r();

    /* renamed from: b */
    protected String f4118b;

    /* renamed from: c */
    protected final List<C2098r> f4119c;

    /* renamed from: d */
    private final C2098r f4120d;

    /* renamed from: e */
    private final String f4121e;

    /* renamed from: f */
    private final Map<String, String> f4122f;

    private C2098r() {
        this.f4120d = null;
        this.f4121e = "";
        this.f4122f = Collections.emptyMap();
        this.f4118b = "";
        this.f4119c = Collections.emptyList();
    }

    public C2098r(String str, Map<String, String> map, C2098r rVar) {
        this.f4120d = rVar;
        this.f4121e = str;
        this.f4122f = Collections.unmodifiableMap(map);
        this.f4119c = new ArrayList();
    }

    /* renamed from: a */
    public String mo14988a() {
        return this.f4121e;
    }

    /* renamed from: a */
    public List<C2098r> mo14989a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f4119c.size());
            for (C2098r next : this.f4119c) {
                if (str.equalsIgnoreCase(next.mo14988a())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public C2098r mo14990b(String str) {
        if (str != null) {
            for (C2098r next : this.f4119c) {
                if (str.equalsIgnoreCase(next.mo14988a())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public Map<String, String> mo14991b() {
        return this.f4122f;
    }

    /* renamed from: c */
    public C2098r mo14992c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f4119c.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                C2098r rVar = (C2098r) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(rVar.mo14988a())) {
                    return rVar;
                }
                arrayList.addAll(rVar.mo14994d());
            }
            return null;
        }
    }

    /* renamed from: c */
    public String mo14993c() {
        return this.f4118b;
    }

    /* renamed from: d */
    public List<C2098r> mo14994d() {
        return Collections.unmodifiableList(this.f4119c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f4121e + '\'' + ", text='" + this.f4118b + '\'' + ", attributes=" + this.f4122f + '}';
    }
}
