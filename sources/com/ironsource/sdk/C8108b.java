package com.ironsource.sdk;

import com.ironsource.sdk.p288j.C8310a;
import java.util.Map;

/* renamed from: com.ironsource.sdk.b */
public final class C8108b {

    /* renamed from: a */
    public final boolean f19645a;

    /* renamed from: b */
    public String f19646b;

    /* renamed from: c */
    public String f19647c;

    /* renamed from: d */
    public boolean f19648d;

    /* renamed from: e */
    public C8099a f19649e;

    /* renamed from: f */
    public Map<String, String> f19650f;

    /* renamed from: g */
    public C8310a f19651g;

    /* renamed from: h */
    public boolean f19652h = false;

    /* renamed from: i */
    public boolean f19653i = false;

    C8108b(String str, String str2, boolean z, boolean z2, boolean z3, Map<String, String> map, C8310a aVar, C8099a aVar2) {
        this.f19646b = str;
        this.f19647c = str2;
        this.f19645a = z;
        this.f19648d = z2;
        this.f19650f = map;
        this.f19651g = aVar;
        this.f19649e = aVar2;
        this.f19653i = z3;
    }

    /* renamed from: a */
    public final boolean mo56308a() {
        C8099a aVar = this.f19649e;
        if (aVar != null) {
            if (aVar.f19611b > 0 && aVar.f19610a > 0) {
                return true;
            }
        }
        return false;
    }
}
