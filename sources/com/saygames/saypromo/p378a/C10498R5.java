package com.saygames.saypromo.p378a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.saygames.saypromo.a.R5 */
public final class C10498R5 {

    /* renamed from: a */
    private final List f25965a;

    /* renamed from: b */
    private final Map f25966b;

    /* renamed from: c */
    private final String f25967c;

    /* renamed from: d */
    private final String f25968d;

    /* renamed from: e */
    private final String f25969e;

    private C10498R5(ArrayList arrayList, LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        this.f25965a = arrayList;
        this.f25966b = linkedHashMap;
        this.f25967c = str;
        this.f25968d = str2;
        this.f25969e = str3;
    }

    public /* synthetic */ C10498R5(ArrayList arrayList, LinkedHashMap linkedHashMap, String str, String str2, String str3, int i) {
        this(arrayList, linkedHashMap, str, str2, str3);
    }

    /* renamed from: a */
    public final C10492Q5 mo65372a() {
        C10492Q5 q5 = new C10492Q5(this.f25968d, this.f25967c);
        for (String a : this.f25965a) {
            q5.mo65366a(a);
        }
        for (Map.Entry entry : this.f25966b.entrySet()) {
            q5.mo65367a((String) entry.getKey(), (String) entry.getValue());
        }
        return q5;
    }

    /* renamed from: a */
    public final String mo65373a(String str) {
        return (String) this.f25966b.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C10498R5) && Intrinsics.areEqual((Object) ((C10498R5) obj).f25969e, (Object) this.f25969e);
    }

    public final int hashCode() {
        return this.f25969e.hashCode();
    }

    public final String toString() {
        return this.f25969e;
    }
}
