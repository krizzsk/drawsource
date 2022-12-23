package com.ironsource.sdk.controller;

import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p286h.C8305c;
import com.ironsource.sdk.p290k.C8322b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
final class C8142f {

    /* renamed from: a */
    long f19760a;

    /* renamed from: b */
    int f19761b;

    /* renamed from: c */
    int f19762c;

    /* renamed from: d */
    C8146b f19763d = C8146b.NONE;

    /* renamed from: e */
    private String f19764e;

    /* renamed from: f */
    private String f19765f;

    /* renamed from: g */
    private C8322b f19766g;

    /* renamed from: com.ironsource.sdk.controller.f$2 */
    static /* synthetic */ class C81442 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19768a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.C8142f.C8145a.m23276a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19768a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.C8142f.C8145a.f19769a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f19768a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.C8142f.C8145a.f19770b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f19768a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.C8142f.C8145a.f19771c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8142f.C81442.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public enum C8145a {
        ;
        

        /* renamed from: a */
        public static final int f19769a = 1;

        /* renamed from: b */
        public static final int f19770b = 2;

        /* renamed from: c */
        public static final int f19771c = 3;

        static {
            f19772d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m23276a() {
            return (int[]) f19772d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public enum C8146b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g */
        int f19780g;

        private C8146b(int i) {
            this.f19780g = i;
        }
    }

    C8142f(JSONObject jSONObject, String str, String str2, C8322b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f19761b = optInt;
        this.f19762c = optInt != 1 ? optInt != 2 ? C8145a.f19769a : C8145a.f19771c : C8145a.f19770b;
        this.f19764e = str;
        this.f19765f = str2;
        this.f19766g = bVar;
    }

    /* renamed from: a */
    private void m23265a(C8305c cVar) {
        if (!this.f19766g.mo56762b()) {
            this.f19766g.mo56760a(cVar, this.f19765f);
        }
    }

    /* renamed from: g */
    private C8305c m23266g() {
        return new C8305c(this.f19764e, "next_mobileController.html");
    }

    /* renamed from: h */
    private C8305c m23267h() {
        return new C8305c(this.f19764e, "fallback_mobileController.html");
    }

    /* renamed from: i */
    private void m23268i() {
        try {
            C8305c d = mo56408d();
            if (d.exists()) {
                C8305c h = m23267h();
                if (h.exists()) {
                    h.delete();
                }
                IronSourceStorageUtils.renameFile(d.getPath(), h.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56404a(C8146b bVar) {
        C8100a a = new C8100a().mo56293a("generalmessage", Integer.valueOf(this.f19761b)).mo56293a("controllersource", Integer.valueOf(bVar.f19780g));
        if (this.f19760a > 0) {
            a.mo56293a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f19760a));
        }
        C8104d.m23161a(C8106f.f19640s, (Map<String, Object>) a.f19613a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56405a() {
        return this.f19763d != C8146b.NONE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo56406b() {
        C8305c cVar;
        int i = C81442.f19768a[this.f19762c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(mo56408d());
            cVar = new C8305c(this.f19764e, SDKUtils.getFileName(this.f19765f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    C8305c d = mo56408d();
                    C8305c g = m23266g();
                    if (!g.exists() && !d.exists()) {
                        m23265a(new C8305c(this.f19764e, SDKUtils.getFileName(this.f19765f)));
                        return false;
                    } else if (g.exists() || !d.exists()) {
                        m23268i();
                        if (IronSourceStorageUtils.renameFile(m23266g().getPath(), mo56408d().getPath())) {
                            C8146b bVar = C8146b.PREPARED_CONTROLLER_LOADED;
                            this.f19763d = bVar;
                            mo56404a(bVar);
                            mo56407c();
                            m23265a(new C8305c(this.f19764e, g.getName()));
                            return true;
                        } else if (mo56409e()) {
                            C8146b bVar2 = C8146b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f19763d = bVar2;
                            mo56404a(bVar2);
                            m23265a(new C8305c(this.f19764e, g.getName()));
                            return true;
                        } else {
                            m23265a(new C8305c(this.f19764e, SDKUtils.getFileName(this.f19765f)));
                        }
                    } else {
                        C8146b bVar3 = C8146b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f19763d = bVar3;
                        mo56404a(bVar3);
                        m23265a(new C8305c(this.f19764e, g.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            m23268i();
            cVar = new C8305c(this.f19764e, SDKUtils.getFileName(this.f19765f));
        }
        m23265a(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo56407c() {
        IronSourceStorageUtils.deleteFile(m23267h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C8305c mo56408d() {
        return new C8305c(this.f19764e, "mobileController.html");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo56409e() {
        try {
            if (!m23267h().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(m23267h().getPath(), mo56408d().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final JSONObject mo56410f() {
        return new JSONObject() {
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(C8142f.this.f19761b));
                putOpt("controllerSourceCode", Integer.valueOf(C8142f.this.f19763d.f19780g));
            }
        };
    }
}
