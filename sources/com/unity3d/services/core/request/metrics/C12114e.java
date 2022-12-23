package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12074d;
import com.unity3d.services.core.properties.C12088d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.e */
/* compiled from: MetricCommonTags */
public class C12114e {

    /* renamed from: a */
    private final String f29563a = C12014b.m32742y();

    /* renamed from: b */
    private final String f29564b = "android";

    /* renamed from: c */
    private final String f29565c = C12088d.m32942o();

    /* renamed from: d */
    private final String f29566d = C12014b.m32685G();

    /* renamed from: e */
    private final boolean f29567e = C12088d.m32946s();

    /* renamed from: f */
    private String f29568f;

    /* renamed from: g */
    private String f29569g;

    /* renamed from: h */
    private String f29570h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f29571i = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();

    /* renamed from: j */
    private String f29572j;

    /* renamed from: k */
    private Map<String, String> f29573k;

    /* renamed from: l */
    private final C12074d<PrivacyConfig> f29574l;

    /* renamed from: com.unity3d.services.core.request.metrics.e$a */
    /* compiled from: MetricCommonTags */
    class C12115a implements C12074d<PrivacyConfig> {
        C12115a() {
        }

        /* renamed from: a */
        public void mo70863a(PrivacyConfig privacyConfig) {
            String unused = C12114e.this.f29571i = privacyConfig.getPrivacyStatus().toString().toLowerCase();
        }
    }

    public C12114e() {
        C12115a aVar = new C12115a();
        this.f29574l = aVar;
        PrivacyConfigStorage.getInstance().registerObserver(aVar);
    }

    /* renamed from: b */
    private boolean m33019b() {
        String str = this.f29568f;
        return str == null || str.isEmpty();
    }

    /* renamed from: c */
    private void m33020c() {
        try {
            C12025f a = C12028i.m32764a(C12028i.C12029a.PUBLIC);
            if (a != null && a.mo71166c()) {
                this.f29568f = (String) a.get("mediation.name.value");
                this.f29569g = (String) a.get("mediation.version.value");
                this.f29570h = (String) a.get("mediation.adapter_version.value");
            }
        } catch (Exception e) {
            C12065a.m32843a("Failed to refreshMediationData: %s", e.getLocalizedMessage());
        }
    }

    /* renamed from: d */
    public void mo71279d() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this.f29574l);
    }

    /* renamed from: a */
    public void mo71278a(Configuration configuration) {
        this.f29572j = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this.f29573k = configuration.getExperiments().getExperimentTags();
        }
    }

    /* renamed from: a */
    public Map<String, String> mo71277a() {
        if (m33019b()) {
            m33020c();
        }
        HashMap hashMap = new HashMap();
        String str = this.f29563a;
        if (str != null) {
            hashMap.put("iso", str);
        }
        String str2 = this.f29564b;
        if (str2 != null) {
            hashMap.put("plt", str2);
        }
        if (this.f29563a != null) {
            hashMap.put("sdk", this.f29565c);
        }
        String str3 = this.f29566d;
        if (str3 != null) {
            hashMap.put("system", str3);
        }
        String str4 = this.f29571i;
        if (str4 != null) {
            hashMap.put("prvc", str4);
        }
        String str5 = this.f29572j;
        if (str5 != null) {
            hashMap.put("src", str5);
        }
        String str6 = this.f29568f;
        if (str6 != null) {
            hashMap.put("m_name", str6);
        }
        String str7 = this.f29569g;
        if (str7 != null) {
            hashMap.put("m_ver", str7);
        }
        String str8 = this.f29570h;
        if (str8 != null) {
            hashMap.put("m_ad_ver", str8);
        }
        Map<String, String> map = this.f29573k;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("tm", String.valueOf(this.f29567e));
        return hashMap;
    }
}
