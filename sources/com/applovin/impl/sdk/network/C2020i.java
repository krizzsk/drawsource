package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.i */
public class C2020i<T> extends C2000c {

    /* renamed from: a */
    private String f3921a;

    /* renamed from: b */
    private boolean f3922b;

    /* renamed from: com.applovin.impl.sdk.network.i$a */
    public static class C2021a<T> extends C2000c.C2001a<T> {
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f3923o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f3924p;

        public C2021a(C1969m mVar) {
            super(mVar);
            this.f3839h = ((Integer) mVar.mo14534a(C1867b.f3213cI)).intValue();
            this.f3840i = ((Integer) mVar.mo14534a(C1867b.f3212cH)).intValue();
            this.f3841j = ((Integer) mVar.mo14534a(C1867b.f3218cN)).intValue();
        }

        /* renamed from: b */
        public C2021a mo14723a(T t) {
            this.f3838g = t;
            return this;
        }

        /* renamed from: b */
        public C2021a mo14726a(JSONObject jSONObject) {
            this.f3837f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public C2020i<T> mo14728a() {
            return new C2020i<>(this);
        }

        /* renamed from: c */
        public C2021a mo14725a(Map<String, String> map) {
            this.f3835d = map;
            return this;
        }

        /* renamed from: d */
        public C2021a mo14722a(int i) {
            this.f3839h = i;
            return this;
        }

        /* renamed from: d */
        public C2021a mo14724a(String str) {
            this.f3833b = str;
            return this;
        }

        /* renamed from: d */
        public C2021a mo14731b(Map<String, String> map) {
            this.f3836e = map;
            return this;
        }

        /* renamed from: e */
        public C2021a mo14729b(int i) {
            this.f3840i = i;
            return this;
        }

        /* renamed from: e */
        public C2021a mo14734c(String str) {
            this.f3834c = str;
            return this;
        }

        /* renamed from: e */
        public C2021a mo14735c(boolean z) {
            this.f3844m = z;
            return this;
        }

        /* renamed from: f */
        public C2021a mo14733c(int i) {
            this.f3841j = i;
            return this;
        }

        /* renamed from: f */
        public C2021a mo14730b(String str) {
            this.f3832a = str;
            return this;
        }

        /* renamed from: f */
        public C2021a mo14736d(boolean z) {
            this.f3845n = z;
            return this;
        }

        /* renamed from: g */
        public C2021a mo14818g(String str) {
            this.f3923o = str;
            return this;
        }

        /* renamed from: g */
        public C2021a mo14819g(boolean z) {
            this.f3924p = z;
            return this;
        }
    }

    protected C2020i(C2021a aVar) {
        super(aVar);
        this.f3921a = aVar.f3923o;
        this.f3922b = aVar.f3924p;
    }

    /* renamed from: b */
    public static C2021a m4771b(C1969m mVar) {
        return new C2021a(mVar);
    }

    /* renamed from: p */
    public boolean mo14802p() {
        return this.f3921a != null;
    }

    /* renamed from: q */
    public String mo14803q() {
        return this.f3921a;
    }

    /* renamed from: r */
    public boolean mo14804r() {
        return this.f3922b;
    }
}
