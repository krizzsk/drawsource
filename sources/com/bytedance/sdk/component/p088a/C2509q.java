package com.bytedance.sdk.component.p088a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.q */
/* compiled from: Js2JavaCall */
public class C2509q {

    /* renamed from: a */
    public final int f5278a;

    /* renamed from: b */
    public final String f5279b;

    /* renamed from: c */
    public final String f5280c;

    /* renamed from: d */
    public final String f5281d;

    /* renamed from: e */
    public final String f5282e;

    /* renamed from: f */
    public final String f5283f;

    /* renamed from: g */
    public final String f5284g;

    /* renamed from: h */
    public final String f5285h;

    /* renamed from: a */
    public static C2511a m6280a() {
        return new C2511a();
    }

    /* renamed from: a */
    public static C2509q m6281a(String str, int i) {
        return new C2509q(str, i);
    }

    private C2509q(String str, int i) {
        this.f5279b = null;
        this.f5280c = null;
        this.f5281d = null;
        this.f5282e = null;
        this.f5283f = str;
        this.f5284g = null;
        this.f5278a = i;
        this.f5285h = null;
    }

    private C2509q(C2511a aVar) {
        this.f5279b = aVar.f5286a;
        this.f5280c = aVar.f5287b;
        this.f5281d = aVar.f5288c;
        this.f5282e = aVar.f5289d;
        this.f5283f = aVar.f5290e;
        this.f5284g = aVar.f5291f;
        this.f5278a = 1;
        this.f5285h = aVar.f5292g;
    }

    /* renamed from: a */
    public static boolean m6282a(C2509q qVar) {
        if (qVar == null || qVar.f5278a != 1 || TextUtils.isEmpty(qVar.f5281d) || TextUtils.isEmpty(qVar.f5282e)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "methodName: " + this.f5281d + ", params: " + this.f5282e + ", callbackId: " + this.f5283f + ", type: " + this.f5280c + ", version: " + this.f5279b + ", ";
    }

    /* renamed from: com.bytedance.sdk.component.a.q$a */
    /* compiled from: Js2JavaCall */
    public static final class C2511a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5286a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f5287b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f5288c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f5289d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f5290e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f5291f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f5292g;

        private C2511a() {
        }

        /* renamed from: a */
        public C2511a mo16516a(String str) {
            this.f5286a = str;
            return this;
        }

        /* renamed from: b */
        public C2511a mo16518b(String str) {
            this.f5287b = str;
            return this;
        }

        /* renamed from: c */
        public C2511a mo16519c(String str) {
            this.f5288c = str;
            return this;
        }

        /* renamed from: d */
        public C2511a mo16520d(String str) {
            this.f5289d = str;
            return this;
        }

        /* renamed from: e */
        public C2511a mo16521e(String str) {
            this.f5290e = str;
            return this;
        }

        /* renamed from: f */
        public C2511a mo16522f(String str) {
            this.f5291f = str;
            return this;
        }

        /* renamed from: g */
        public C2511a mo16523g(String str) {
            this.f5292g = str;
            return this;
        }

        /* renamed from: a */
        public C2509q mo16517a() {
            return new C2509q(this);
        }
    }
}
