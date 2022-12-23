package com.bytedance.sdk.component.p102b.p103a;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.k */
/* compiled from: Request */
public abstract class C2746k {

    /* renamed from: a */
    public C2743i f6129a;

    /* renamed from: a */
    public abstract Object mo17503a();

    /* renamed from: b */
    public abstract C2737f mo17505b();

    /* renamed from: c */
    public abstract String mo17506c();

    /* renamed from: d */
    public abstract Map<String, List<String>> mo17507d();

    /* renamed from: e */
    public abstract C2711a mo17508e();

    /* renamed from: f */
    public C2749l mo17509f() {
        return null;
    }

    /* renamed from: a */
    public void mo17504a(C2743i iVar) {
        this.f6129a = iVar;
    }

    /* renamed from: g */
    public C2747a mo17510g() {
        return new C2747a(this);
    }

    /* renamed from: com.bytedance.sdk.component.b.a.k$a */
    /* compiled from: Request */
    public static class C2747a {

        /* renamed from: a */
        C2711a f6130a;

        /* renamed from: b */
        Map<String, List<String>> f6131b;

        /* renamed from: c */
        C2737f f6132c;

        /* renamed from: d */
        String f6133d;

        /* renamed from: e */
        Object f6134e;

        /* renamed from: f */
        C2749l f6135f;

        public C2747a() {
            this.f6131b = new HashMap();
        }

        /* renamed from: a */
        public C2747a mo17512a(C2711a aVar) {
            this.f6130a = aVar;
            return this;
        }

        C2747a(C2746k kVar) {
            this.f6132c = kVar.mo17505b();
            this.f6133d = kVar.mo17506c();
            this.f6131b = kVar.mo17507d();
            this.f6134e = kVar.mo17503a();
            this.f6135f = kVar.mo17509f();
            this.f6130a = kVar.mo17508e();
        }

        /* renamed from: a */
        public C2747a mo17515a(Object obj) {
            this.f6134e = obj;
            return this;
        }

        /* renamed from: a */
        public C2747a mo17516a(String str) {
            return mo17513a(C2737f.m7428c(str));
        }

        /* renamed from: a */
        public C2747a mo17513a(C2737f fVar) {
            this.f6132c = fVar;
            return this;
        }

        /* renamed from: a */
        public C2747a mo17517a(String str, String str2) {
            return mo17518b(str, str2);
        }

        /* renamed from: b */
        public C2747a mo17518b(String str, String str2) {
            if (!this.f6131b.containsKey(str)) {
                this.f6131b.put(str, new ArrayList());
            }
            this.f6131b.get(str).add(str2);
            return this;
        }

        /* renamed from: a */
        public C2747a mo17511a() {
            return m7474a(ShareTarget.METHOD_GET, (C2749l) null);
        }

        /* renamed from: a */
        private C2747a m7474a(String str, C2749l lVar) {
            this.f6133d = str;
            this.f6135f = lVar;
            return this;
        }

        /* renamed from: a */
        public C2747a mo17514a(C2749l lVar) {
            return m7474a(ShareTarget.METHOD_POST, lVar);
        }

        /* renamed from: b */
        public C2746k mo17519b() {
            return new C2746k() {
                public String toString() {
                    return "";
                }

                /* renamed from: a */
                public Object mo17503a() {
                    return C2747a.this.f6134e;
                }

                /* renamed from: b */
                public C2737f mo17505b() {
                    return C2747a.this.f6132c;
                }

                /* renamed from: c */
                public String mo17506c() {
                    return C2747a.this.f6133d;
                }

                /* renamed from: d */
                public Map mo17507d() {
                    return C2747a.this.f6131b;
                }

                /* renamed from: e */
                public C2711a mo17508e() {
                    return C2747a.this.f6130a;
                }

                /* renamed from: f */
                public C2749l mo17509f() {
                    return C2747a.this.f6135f;
                }
            };
        }
    }
}
