package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.j */
public class C4234j extends C4229e {

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$a */
    public static /* synthetic */ class C4235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10427a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10427a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10427a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.features.C4234j.C4235a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$b */
    public enum C4236b {
        NONE("none"),
        OPEN("open");
        

        /* renamed from: a */
        public String f10431a;

        /* access modifiers changed from: public */
        C4236b(String str) {
            this.f10431a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$c */
    public enum C4237c {
        NONE("none"),
        ZOOM_IN("endcard_zoom_in");
        

        /* renamed from: a */
        public String f10435a;

        /* access modifiers changed from: public */
        C4237c(String str) {
            this.f10435a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$d */
    public enum C4238d {
        LEGACY("legacy");
        

        /* renamed from: a */
        public String f10438a;

        /* access modifiers changed from: public */
        C4238d(String str) {
            this.f10438a = str;
        }
    }

    public C4234j() {
        super("video_player");
    }

    /* renamed from: a */
    public int mo24245a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b = mo24240b("prebuffer_interstitial");
            if (b != null) {
                return b.intValue();
            }
            return 3;
        }
        Integer b2 = mo24240b("prebuffer_rewarded");
        if (b2 != null) {
            return b2.intValue();
        }
        return 3;
    }

    /* renamed from: b */
    public C4229e mo24234b() {
        C4234j jVar = new C4234j();
        mo24238a((C4229e) jVar);
        return jVar;
    }

    /* renamed from: c */
    public boolean mo24246c() {
        return mo24239a("cta_text_all_caps", false);
    }

    /* renamed from: g */
    public C4237c mo24250g() {
        String a = mo24237a("endcard_animation_type", "none");
        for (C4237c cVar : C4237c.values()) {
            if (a.equalsIgnoreCase(cVar.f10435a)) {
                return cVar;
            }
        }
        return C4237c.NONE;
    }

    /* renamed from: d */
    public int mo24247d() {
        Integer b = mo24240b("dl_retries");
        if (b != null) {
            return b.intValue();
        }
        return 10;
    }

    /* renamed from: e */
    public int mo24248e() {
        Integer b = mo24240b("dl_retry_delay");
        if (b != null) {
            return b.intValue();
        }
        return 500;
    }

    /* renamed from: f */
    public int mo24249f() {
        Integer b = mo24240b("endcard_animation_duration");
        int intValue = b != null ? b.intValue() : 500;
        if (intValue < 500 || intValue > 3000) {
            return 500;
        }
        return intValue;
    }

    /* renamed from: h */
    public int mo24251h() {
        Integer b = mo24240b("max_tries");
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: i */
    public int mo24252i() {
        Integer b = mo24240b("second_checkpoint");
        if (b != null) {
            return b.intValue();
        }
        return 25;
    }
}
