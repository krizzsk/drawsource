package com.adcolony.sdk;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.n0 */
class C0923n0 {

    /* renamed from: a */
    private final int f653a;

    /* renamed from: b */
    private final List<C0924a> f654b = new ArrayList();

    /* renamed from: com.adcolony.sdk.n0$a */
    static class C0924a {

        /* renamed from: a */
        private final String f655a;

        /* renamed from: b */
        private final String f656b;

        /* renamed from: c */
        private final int f657c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String[] f658d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String[] f659e;

        /* renamed from: f */
        private final List<C0925b> f660f = new ArrayList();

        /* renamed from: g */
        private final List<C0926c> f661g = new ArrayList();

        /* renamed from: h */
        private final C0927d f662h;

        /* renamed from: i */
        private final Map<String, String> f663i;

        C0924a(C0832f1 f1Var) throws JSONException {
            this.f655a = f1Var.mo10796e("stream");
            this.f656b = f1Var.mo10796e("table_name");
            this.f657c = f1Var.mo10775a("max_rows", 10000);
            C0828e1 l = f1Var.mo10805l("event_types");
            this.f658d = l != null ? C0773c0.m378a(l) : new String[0];
            C0828e1 l2 = f1Var.mo10805l("request_types");
            this.f659e = l2 != null ? C0773c0.m378a(l2) : new String[0];
            for (C0832f1 bVar : C0773c0.m386b(f1Var.mo10792c("columns"))) {
                this.f660f.add(new C0925b(bVar));
            }
            for (C0832f1 cVar : C0773c0.m386b(f1Var.mo10792c("indexes"))) {
                this.f661g.add(new C0926c(cVar, this.f656b));
            }
            C0832f1 n = f1Var.mo10807n("ttl");
            this.f662h = n != null ? new C0927d(n) : null;
            this.f663i = f1Var.mo10806m("queries").mo10798f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo10962c() {
            return this.f657c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo10963d() {
            return this.f655a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, String> mo10964e() {
            return this.f663i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo10965f() {
            return this.f656b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0927d mo10966g() {
            return this.f662h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C0925b> mo10960a() {
            return this.f660f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C0926c> mo10961b() {
            return this.f661g;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$b */
    static class C0925b {

        /* renamed from: a */
        private final String f664a;

        /* renamed from: b */
        private final String f665b;

        /* renamed from: c */
        private final Object f666c;

        C0925b(C0832f1 f1Var) throws JSONException {
            this.f664a = f1Var.mo10796e("name");
            this.f665b = f1Var.mo10796e("type");
            this.f666c = f1Var.mo10808o(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo10967a() {
            return this.f666c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo10968b() {
            return this.f664a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo10969c() {
            return this.f665b;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$c */
    static class C0926c {

        /* renamed from: a */
        private final String f667a;

        /* renamed from: b */
        private final String[] f668b;

        C0926c(C0832f1 f1Var, String str) throws JSONException {
            this.f667a = str + "_" + f1Var.mo10796e("name");
            this.f668b = C0773c0.m378a(f1Var.mo10792c("columns"));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String[] mo10970a() {
            return this.f668b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo10971b() {
            return this.f667a;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$d */
    static class C0927d {

        /* renamed from: a */
        private final long f669a;

        /* renamed from: b */
        private final String f670b;

        C0927d(C0832f1 f1Var) throws JSONException {
            this.f669a = f1Var.mo10795d("seconds");
            this.f670b = f1Var.mo10796e("column");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10972a() {
            return this.f670b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo10973b() {
            return this.f669a;
        }
    }

    C0923n0(C0832f1 f1Var) throws JSONException {
        this.f653a = f1Var.mo10786b("version");
        for (C0832f1 aVar : C0773c0.m386b(f1Var.mo10792c("streams"))) {
            this.f654b.add(new C0924a(aVar));
        }
    }

    /* renamed from: a */
    static C0923n0 m849a(C0832f1 f1Var) {
        try {
            return new C0923n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10959b() {
        return this.f653a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0924a> mo10958a() {
        return this.f654b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0924a mo10957a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C0924a next : this.f654b) {
            int i = 0;
            for (String equals : next.f658d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b = next.f659e;
            int length = b.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }
}
