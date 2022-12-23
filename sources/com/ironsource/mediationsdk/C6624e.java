package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.smaato.sdk.core.dns.DnsName;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e */
public final class C6624e {

    /* renamed from: c */
    private static final C6624e f17170c = new C6624e();

    /* renamed from: a */
    final ConcurrentHashMap<String, String> f17171a;

    /* renamed from: b */
    final ConcurrentHashMap<String, String> f17172b;

    private C6624e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f17171a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        this.f17171a.put("vungle", "4.1.5");
        this.f17171a.put("applovin", "4.3.3");
        this.f17171a.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f17172b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        this.f17172b.put("admob", "4.3.2");
        this.f17172b.put("applovin", "4.3.3");
        this.f17172b.put("chartboost", "4.1.9");
        this.f17172b.put("fyber", "4.1.0");
        this.f17172b.put("hyprmx", "4.1.2");
        this.f17172b.put("inmobi", "4.3.1");
        this.f17172b.put("maio", "4.1.3");
        this.f17172b.put("tapjoy", "4.0.0");
        this.f17172b.put("unityads", "4.1.4");
        this.f17172b.put("vungle", "4.1.5");
    }

    /* renamed from: a */
    public static C6624e m20158a() {
        return f17170c;
    }

    /* renamed from: a */
    private static boolean m20159a(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split(DnsName.ESCAPED_DOT);
        String[] split2 = str2.split(DnsName.ESCAPED_DOT);
        for (int i = 0; i < 3; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo36654a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean a = m20159a("4.3.0", version);
        if (!a) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36655a(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (!map.containsKey(lowerCase)) {
            return true;
        }
        String version = abstractAdapter.getVersion();
        boolean a = m20159a(map.get(lowerCase), version);
        if (!a) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + " for " + str + " ad unit, please update your adapter to the latest version", 3);
        }
        return a;
    }
}
