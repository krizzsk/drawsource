package com.inmobi.media;

import android.webkit.URLUtil;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gh */
/* compiled from: SignalsConfig */
public class C6120gh extends C6093fu {
    public JSONObject ext = null;
    public C6123b ice = new C6123b();
    public C6124c unifiedIdServiceConfig = new C6124c();

    /* renamed from: com.inmobi.media.gh$b */
    /* compiled from: SignalsConfig */
    public static class C6123b {

        /* renamed from: c */
        public C6122a f15438c = new C6122a();
        public boolean locationEnabled = false;
        public int sampleInterval = 300;
        public boolean sessionEnabled = false;
        public int stopRequestTimeout = 3;

        /* renamed from: w */
        public C6125d f15439w = new C6125d();
    }

    /* renamed from: com.inmobi.media.gh$c */
    /* compiled from: SignalsConfig */
    public static class C6124c {
        public boolean enabled = false;
        public int maxRetries = 0;
        public int retryInterval = 0;
        public int timeout = 10;
        public String url = "https://unif-id.ssp.inmobi.com/fetch";
    }

    /* renamed from: b */
    public String mo35278b() {
        return "signals";
    }

    /* renamed from: a */
    public static C6225is<C6120gh> m18152a() {
        return new C6225is<>();
    }

    C6120gh(String str) {
        super(str);
    }

    /* renamed from: d */
    public boolean mo35280d() {
        return this.ice.sampleInterval >= 0 && this.ice.stopRequestTimeout >= 0 && this.ice.f15439w.f15440wf >= 0 && this.ice.f15438c.cof >= 0 && URLUtil.isValidUrl(this.unifiedIdServiceConfig.url) && this.unifiedIdServiceConfig.maxRetries >= 0 && this.unifiedIdServiceConfig.timeout >= 0 && this.unifiedIdServiceConfig.retryInterval >= 0;
    }

    /* renamed from: com.inmobi.media.gh$d */
    /* compiled from: SignalsConfig */
    public static final class C6125d {
        public boolean cwe;
        public boolean vwe;

        /* renamed from: wf */
        public int f15440wf;

        private C6125d() {
            this.f15440wf = 0;
            this.vwe = false;
            this.cwe = false;
        }
    }

    /* renamed from: com.inmobi.media.gh$a */
    /* compiled from: SignalsConfig */
    public static final class C6122a {
        public boolean cce;
        public int cof;

        /* renamed from: oe */
        public boolean f15437oe;
        public boolean vce;

        private C6122a() {
            this.cof = 0;
            this.f15437oe = false;
            this.vce = false;
            this.cce = false;
        }
    }

    /* renamed from: c */
    public JSONObject mo35279c() {
        return new C6225is().mo35435a(this);
    }
}
