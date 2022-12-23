package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6120gh;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jv */
/* compiled from: UnifiedIDNetworkInterface */
public final class C6275jv {

    /* renamed from: a */
    static Set<InMobiUnifiedIdInterface> f15803a = new LinkedHashSet();

    /* renamed from: b */
    static C6277jx f15804b;

    /* renamed from: c */
    private static final Object f15805c = new Object();

    private C6275jv() {
    }

    /* renamed from: a */
    public static void m18667a() {
        synchronized (f15805c) {
            if (m18670c()) {
                f15804b.mo35295b();
            }
        }
        m18672e();
    }

    /* renamed from: e */
    private static void m18672e() {
        C6246jf.m18571a();
        C6120gh.C6124c f = C6246jf.m18574f();
        synchronized (f15805c) {
            String str = f.url;
            C6246jf.m18571a();
            f15804b = new C6277jx(ShareTarget.METHOD_POST, str, C6246jf.m18572d(), C6183hw.m18332f(), f.maxRetries, f.retryInterval, f.timeout);
            C6151gw gwVar = new C6151gw(new C6276jw(f15804b, f15803a), f15804b, JSONObject.class);
            C6168hl.m18270a().mo35377a("UnifiedIdNetworkCallRequested", (Map<String, Object>) new HashMap());
            gwVar.mo35332a();
        }
    }

    /* renamed from: a */
    public static void m18668a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (inMobiUnifiedIdInterface != null) {
            f15803a.add(inMobiUnifiedIdInterface);
        }
        if (!m18670c()) {
            m18672e();
        }
    }

    /* renamed from: b */
    public static void m18669b() {
        synchronized (f15805c) {
            if (f15804b != null) {
                f15804b.mo35295b();
                f15804b = null;
            }
            f15803a.clear();
        }
    }

    /* renamed from: c */
    public static boolean m18670c() {
        boolean z;
        synchronized (f15805c) {
            z = f15804b != null && !f15804b.f15547a.get();
        }
        return z;
    }

    /* renamed from: d */
    protected static void m18671d() {
        synchronized (f15805c) {
            f15804b = null;
        }
    }
}
