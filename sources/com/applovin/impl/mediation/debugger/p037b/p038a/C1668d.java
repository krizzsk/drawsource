package com.applovin.impl.mediation.debugger.p037b.p038a;

import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.d */
public class C1668d implements Comparable<C1668d> {

    /* renamed from: a */
    private final String f2369a;

    /* renamed from: b */
    private final String f2370b;

    /* renamed from: c */
    private final boolean f2371c;

    /* renamed from: d */
    private final C1671b f2372d;

    C1668d(String str, String str2, boolean z, C1671b bVar) {
        this.f2369a = str;
        this.f2370b = str2;
        this.f2371c = z;
        this.f2372d = bVar;
    }

    /* renamed from: a */
    public int compareTo(C1668d dVar) {
        return this.f2370b.compareToIgnoreCase(dVar.f2370b);
    }

    /* renamed from: a */
    public String mo13639a() {
        return this.f2369a;
    }

    /* renamed from: b */
    public String mo13640b() {
        return this.f2370b;
    }

    /* renamed from: c */
    public C1671b mo13641c() {
        return this.f2372d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1668d dVar = (C1668d) obj;
        String str = this.f2369a;
        if (str == null ? dVar.f2369a != null : !str.equals(dVar.f2369a)) {
            return false;
        }
        String str2 = this.f2370b;
        if (str2 == null ? dVar.f2370b == null : str2.equals(dVar.f2370b)) {
            return this.f2371c == dVar.f2371c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2369a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2370b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + (this.f2371c ? 1 : 0);
    }
}
