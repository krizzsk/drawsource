package com.unity3d.services.core.configuration;

import com.facebook.AuthenticationTokenClaims;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12099h;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Configuration {

    /* renamed from: A */
    private String f29175A;

    /* renamed from: B */
    private ConfigurationRequestFactory f29176B;

    /* renamed from: C */
    private Map<String, IModuleConfiguration> f29177C;

    /* renamed from: D */
    private String[] f29178D;

    /* renamed from: E */
    private Class[] f29179E;

    /* renamed from: a */
    private String f29180a;

    /* renamed from: b */
    private String f29181b;

    /* renamed from: c */
    private String f29182c;

    /* renamed from: d */
    private String f29183d;

    /* renamed from: e */
    private String f29184e;

    /* renamed from: f */
    private boolean f29185f;

    /* renamed from: g */
    private int f29186g;

    /* renamed from: h */
    private int f29187h;

    /* renamed from: i */
    private long f29188i;

    /* renamed from: j */
    private double f29189j;

    /* renamed from: k */
    private int f29190k;

    /* renamed from: l */
    private int f29191l;

    /* renamed from: m */
    private long f29192m;

    /* renamed from: n */
    private int f29193n;

    /* renamed from: o */
    private int f29194o;

    /* renamed from: p */
    private int f29195p;

    /* renamed from: q */
    private String f29196q;

    /* renamed from: r */
    private double f29197r;

    /* renamed from: s */
    private long f29198s;

    /* renamed from: t */
    private String f29199t;

    /* renamed from: u */
    private String f29200u;

    /* renamed from: v */
    private String f29201v;

    /* renamed from: w */
    private String f29202w;

    /* renamed from: x */
    private ExperimentsReader f29203x;

    /* renamed from: y */
    private int f29204y;

    /* renamed from: z */
    private int f29205z;

    public Configuration() {
        this.f29178D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.f29203x = new ExperimentsReader();
        m32621b(new JSONObject(), false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71033a(org.json.JSONObject r5, boolean r6) throws java.net.MalformedURLException, org.json.JSONException {
        /*
            r4 = this;
            java.lang.String r0 = "hash"
            java.lang.String r1 = "url"
            r2 = 0
            boolean r3 = r5.isNull(r1)     // Catch:{ JSONException -> 0x0010 }
            if (r3 != 0) goto L_0x0010
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0056
            r4.f29180a = r1
            boolean r1 = r5.isNull(r0)     // Catch:{ JSONException -> 0x0028 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            r4.f29181b = r0     // Catch:{ JSONException -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r4.f29181b = r2
        L_0x002a:
            java.lang.String r0 = "tkn"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = r5.optString(r0)
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            r4.f29201v = r0
            java.lang.String r0 = "sid"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L_0x0046
            java.lang.String r2 = r5.optString(r0)
        L_0x0046:
            r4.f29202w = r2
            r4.m32621b(r5, r6)
            org.json.JSONObject r5 = r4.m32619a(r5)
            java.lang.String r5 = r5.toString()
            r4.f29199t = r5
            return
        L_0x0056:
            java.net.MalformedURLException r5 = new java.net.MalformedURLException
            java.lang.String r6 = "WebView URL is null or empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.Configuration.mo71033a(org.json.JSONObject, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71034b() throws Exception {
        if (this.f29200u != null) {
            C12099h webRequest = this.f29176B.getWebRequest();
            InitializeEventsMetricSender.getInstance().didConfigRequestStart();
            try {
                mo71033a(new JSONObject(webRequest.mo71260n()), true);
                saveToDisk();
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new MalformedURLException("Base URL is null");
        }
    }

    public String getConfigUrl() {
        return this.f29200u;
    }

    public int getConnectedEventThreshold() {
        return this.f29190k;
    }

    public boolean getDelayWebViewUpdate() {
        return this.f29185f;
    }

    public Experiments getExperiments() {
        return this.f29203x.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this.f29203x;
    }

    public String getJSONString() {
        return this.f29199t;
    }

    public int getLoadTimeout() {
        return this.f29194o;
    }

    public int getMaxRetries() {
        return this.f29187h;
    }

    public int getMaximumConnectedEvents() {
        return this.f29191l;
    }

    public double getMetricSampleRate() {
        return this.f29197r;
    }

    public String getMetricsUrl() {
        return this.f29196q;
    }

    public IModuleConfiguration getModuleConfiguration(String str) {
        Map<String, IModuleConfiguration> map = this.f29177C;
        if (map != null && map.containsKey(str)) {
            return this.f29177C.get(str);
        }
        try {
            IModuleConfiguration iModuleConfiguration = (IModuleConfiguration) Class.forName(str).newInstance();
            if (iModuleConfiguration != null) {
                if (this.f29177C == null) {
                    HashMap hashMap = new HashMap();
                    this.f29177C = hashMap;
                    hashMap.put(str, iModuleConfiguration);
                }
                return iModuleConfiguration;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String[] getModuleConfigurationList() {
        return this.f29178D;
    }

    public long getNetworkErrorTimeout() {
        return this.f29192m;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this.f29205z;
    }

    public int getResetWebappTimeout() {
        return this.f29186g;
    }

    public long getRetryDelay() {
        return this.f29188i;
    }

    public double getRetryScalingFactor() {
        return this.f29189j;
    }

    public String getSdkVersion() {
        return this.f29184e;
    }

    public int getShowTimeout() {
        return this.f29193n;
    }

    public String getSrc() {
        String str = this.f29175A;
        return str != null ? str : "";
    }

    public String getStateId() {
        String str = this.f29202w;
        return str != null ? str : "";
    }

    public int getTokenTimeout() {
        return this.f29204y;
    }

    public String getUnifiedAuctionToken() {
        return this.f29201v;
    }

    public Class[] getWebAppApiClassList() {
        if (this.f29179E == null) {
            m32620a();
        }
        return this.f29179E;
    }

    public long getWebViewAppCreateTimeout() {
        return this.f29198s;
    }

    public int getWebViewBridgeTimeout() {
        return this.f29195p;
    }

    public String getWebViewData() {
        return this.f29183d;
    }

    public String getWebViewHash() {
        return this.f29181b;
    }

    public String getWebViewUrl() {
        return this.f29180a;
    }

    public String getWebViewVersion() {
        return this.f29182c;
    }

    public void saveToDisk() {
        C12080j.m32881a(new File(C12088d.m32938k()), getJSONString());
    }

    public void setWebViewData(String str) {
        this.f29183d = str;
    }

    public void setWebViewHash(String str) {
        this.f29181b = str;
    }

    public void setWebViewUrl(String str) {
        this.f29180a = str;
    }

    public Configuration(String str) {
        this(str, new Experiments());
    }

    public Configuration(JSONObject jSONObject) throws MalformedURLException, JSONException {
        this.f29178D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.f29203x = new ExperimentsReader();
        mo71033a(jSONObject, false);
    }

    /* renamed from: b */
    private void m32621b(JSONObject jSONObject, boolean z) {
        this.f29182c = jSONObject.optString("version", (String) null);
        this.f29185f = jSONObject.optBoolean("dwu", false);
        this.f29186g = jSONObject.optInt("rwt", 10000);
        this.f29187h = jSONObject.optInt("mr", 6);
        this.f29188i = jSONObject.optLong("rd", 5000);
        this.f29189j = jSONObject.optDouble("rcf", 2.0d);
        this.f29190k = jSONObject.optInt("cet", 10000);
        this.f29191l = jSONObject.optInt("mce", 500);
        this.f29192m = jSONObject.optLong("net", 60000);
        this.f29184e = jSONObject.optString("sdkv", "");
        this.f29193n = jSONObject.optInt("sto", 10000);
        this.f29194o = jSONObject.optInt("lto", 30000);
        this.f29195p = jSONObject.optInt("wto", 5000);
        this.f29196q = jSONObject.optString("murl", "");
        this.f29197r = jSONObject.optDouble("msr", 100.0d);
        this.f29198s = jSONObject.optLong("wct", 60000);
        this.f29204y = jSONObject.optInt("tto", 5000);
        this.f29205z = jSONObject.optInt("prwto", 3000);
        this.f29175A = jSONObject.optString("src", (String) null);
        if (z) {
            this.f29203x.updateRemoteExperiments(new Experiments(jSONObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_EXP)));
        } else {
            this.f29203x.updateLocalExperiments(new Experiments(jSONObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_EXP)));
        }
    }

    /* renamed from: a */
    private void m32620a() {
        ArrayList arrayList = new ArrayList();
        for (String moduleConfiguration : getModuleConfigurationList()) {
            IModuleConfiguration moduleConfiguration2 = getModuleConfiguration(moduleConfiguration);
            if (!(moduleConfiguration2 == null || moduleConfiguration2.getWebAppApiClassList() == null)) {
                arrayList.addAll(Arrays.asList(moduleConfiguration2.getWebAppApiClassList()));
            }
        }
        this.f29179E = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    /* renamed from: a */
    private JSONObject m32619a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!next.equals("tkn") && !next.equals("sid")) {
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    public Configuration(String str, ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this.f29203x = experimentsReader;
    }

    public Configuration(String str, Experiments experiments) {
        this();
        this.f29200u = str;
        this.f29176B = new ConfigurationRequestFactory(this, new C12033a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()));
        this.f29203x.updateLocalExperiments(experiments);
    }
}
