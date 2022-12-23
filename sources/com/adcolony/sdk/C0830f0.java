package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.f0 */
class C0830f0 {

    /* renamed from: e */
    static final SimpleDateFormat f468e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f469a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f470b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0741b0 f471c;

    /* renamed from: d */
    protected String f472d;

    /* renamed from: com.adcolony.sdk.f0$a */
    static class C0831a {

        /* renamed from: a */
        protected C0830f0 f473a = new C0830f0();

        C0831a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0831a mo10770a(int i) {
            int unused = this.f473a.f470b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0831a mo10771a(C0741b0 b0Var) {
            C0741b0 unused = this.f473a.f471c = b0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0831a mo10772a(String str) {
            this.f473a.f472d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0830f0 mo10773a() {
            if (this.f473a.f469a == null) {
                Date unused = this.f473a.f469a = new Date(System.currentTimeMillis());
            }
            return this.f473a;
        }
    }

    C0830f0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10766b() {
        int i = this.f470b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return "Error";
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10767c() {
        return this.f472d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10768d() {
        return f468e.format(this.f469a);
    }

    public String toString() {
        return mo10768d() + " " + mo10766b() + "/" + mo10765a().mo10560a() + ": " + mo10767c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0741b0 mo10765a() {
        return this.f471c;
    }
}
