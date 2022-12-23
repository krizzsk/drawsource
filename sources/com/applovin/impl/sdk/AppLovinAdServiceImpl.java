package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1507b;
import com.applovin.impl.adview.activity.p030b.C1450a;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p049ad.C1845f;
import com.applovin.impl.sdk.p052d.C1875a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1909j;
import com.applovin.impl.sdk.p053e.C1910k;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class AppLovinAdServiceImpl implements AppLovinAdService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f2801a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2102v f2802b;

    /* renamed from: c */
    private final Handler f2803c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Map<C1838d, C1791b> f2804d;

    /* renamed from: e */
    private final Object f2805e = new Object();

    /* renamed from: f */
    private final Map<String, String> f2806f = new HashMap();

    /* renamed from: g */
    private final AtomicReference<JSONObject> f2807g = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    private class C1790a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final C1791b f2817b;

        private C1790a(C1791b bVar) {
            this.f2817b = bVar;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            C1838d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof C1845f)) {
                AppLovinAdServiceImpl.this.f2801a.mo14533Z().mo14276a(appLovinAdImpl);
                appLovinAd = new C1845f(adZone, AppLovinAdServiceImpl.this.f2801a);
            }
            synchronized (this.f2817b.f2818a) {
                hashSet = new HashSet<>(this.f2817b.f2820c);
                this.f2817b.f2820c.clear();
                this.f2817b.f2819b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m3781a(appLovinAd, a);
            }
        }

        public void failedToReceiveAd(int i) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f2817b.f2818a) {
                hashSet = new HashSet<>(this.f2817b.f2820c);
                this.f2817b.f2820c.clear();
                this.f2817b.f2819b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m3771a(i, a);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    private static class C1791b {

        /* renamed from: a */
        final Object f2818a;

        /* renamed from: b */
        boolean f2819b;

        /* renamed from: c */
        final Collection<AppLovinAdLoadListener> f2820c;

        private C1791b() {
            this.f2818a = new Object();
            this.f2820c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f2819b + ", pendingAdListeners=" + this.f2820c + '}';
        }
    }

    AppLovinAdServiceImpl(C1969m mVar) {
        this.f2801a = mVar;
        this.f2802b = mVar.mo14509A();
        HashMap hashMap = new HashMap(5);
        this.f2804d = hashMap;
        hashMap.put(C1838d.m3907g(), new C1791b());
        this.f2804d.put(C1838d.m3908h(), new C1791b());
        this.f2804d.put(C1838d.m3909i(), new C1791b());
        this.f2804d.put(C1838d.m3910j(), new C1791b());
        this.f2804d.put(C1838d.m3911k(), new C1791b());
    }

    /* renamed from: a */
    private Uri m3766a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            if (!C2102v.m5104a()) {
                return null;
            }
            C2102v A = this.f2801a.mo14509A();
            A.mo15015d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private C1791b m3767a(C1838d dVar) {
        C1791b bVar;
        synchronized (this.f2805e) {
            bVar = this.f2804d.get(dVar);
            if (bVar == null) {
                bVar = new C1791b();
                this.f2804d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private String m3769a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2802b;
                vVar.mo15013b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m3770a(String str, long j, long j2, List<Long> list, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != C1950h.f3632a) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C1950h.m4399a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3771a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2803c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v.m5106c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m3772a(Uri uri, C1839e eVar, AppLovinAdView appLovinAdView, C1507b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f2801a)) {
            C2053j.m5012c(bVar.mo13117g(), (AppLovinAd) eVar, appLovinAdView);
        }
        bVar.mo13125o();
    }

    /* renamed from: a */
    private void m3773a(Uri uri, C1839e eVar, AppLovinAdView appLovinAdView, C1507b bVar, Context context, C1969m mVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri a = m3766a(uri, "primaryUrl");
            List<Uri> b = m3785b(uri, "primaryTrackingUrl");
            Uri a2 = m3766a(uri, "fallbackUrl");
            List<Uri> b2 = m3785b(uri, "fallbackTrackingUrl");
            if (a != null || a2 != null) {
                if (!m3782a(a, "primary", b, eVar, appLovinAdView, bVar, context, mVar)) {
                    m3782a(a2, "backup", b2, eVar, appLovinAdView, bVar, context, mVar);
                }
                if (bVar != null) {
                    bVar.mo13125o();
                }
            } else if (C2102v.m5104a()) {
                mVar.mo14509A().mo15016e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
            }
        } else if (C2102v.m5104a()) {
            mVar.mo14509A().mo15016e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    /* renamed from: a */
    private void m3774a(Uri uri, C1839e eVar, C1507b bVar, final C1450a aVar) {
        if (C2102v.m5105a(this.f2801a)) {
            C2102v vVar = this.f2802b;
            vVar.mo15012b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f2801a.mo14586p().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f2803c.post(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            if (C2102v.m5105a(AppLovinAdServiceImpl.this.f2801a)) {
                                AppLovinAdServiceImpl.this.f2802b.mo15012b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.mo12999h();
                        }
                    }
                });
            } else if (bVar != null && !Utils.isBML(eVar.getSize())) {
                if (C2102v.m5105a(this.f2801a)) {
                    this.f2802b.mo15012b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.mo13122l();
            }
        }
    }

    /* renamed from: a */
    private void m3777a(C1838d dVar, C1790a aVar) {
        AppLovinAdImpl a = this.f2801a.mo14533Z().mo14275a(dVar);
        if (a != null) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2802b;
                vVar.mo15012b("AppLovinAdService", "Using pre-loaded ad: " + a + " for " + dVar);
            }
            aVar.adReceived(a);
            return;
        }
        m3780a((C1887a) new C1910k(dVar, aVar, this.f2801a));
    }

    /* renamed from: a */
    private void m3778a(C1838d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        } else if (appLovinAdLoadListener != null) {
            if (C2102v.m5104a()) {
                C2102v A = this.f2801a.mo14509A();
                A.mo15012b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
            }
            C1791b a = m3767a(dVar);
            synchronized (a.f2818a) {
                a.f2820c.add(appLovinAdLoadListener);
                if (!a.f2819b) {
                    a.f2819b = true;
                    m3777a(dVar, new C1790a(a));
                } else if (C2102v.m5104a()) {
                    this.f2802b.mo15012b("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    /* renamed from: a */
    private void m3779a(C1875a aVar) {
        if (StringUtils.isValidString(aVar.mo14315a())) {
            this.f2801a.mo14528U().mo14764a(C2017h.m4735o().mo14798c(aVar.mo14315a()).mo14801d(StringUtils.isValidString(aVar.mo14316b()) ? aVar.mo14316b() : null).mo14796b(aVar.mo14317c()).mo14793a(false).mo14800c(aVar.mo14318d()).mo14794a());
        } else if (C2102v.m5104a()) {
            this.f2802b.mo15015d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* renamed from: a */
    private void m3780a(C1887a aVar) {
        if (!this.f2801a.mo14574d() && C2102v.m5104a()) {
            C2102v.m5109h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f2801a.mo14537a();
        this.f2801a.mo14526S().mo14429a(aVar, C1918o.C1920a.MAIN);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3781a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2803c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v.m5106c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m3782a(Uri uri, String str, List<Uri> list, C1839e eVar, AppLovinAdView appLovinAdView, C1507b bVar, Context context, C1969m mVar) {
        if (C2102v.m5104a()) {
            C2102v A = mVar.mo14509A();
            A.mo15012b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, mVar);
        boolean a = C2102v.m5104a();
        if (openUri) {
            if (a) {
                C2102v A2 = mVar.mo14509A();
                A2.mo15012b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            for (Uri uri2 : list) {
                mVar.mo14531X().dispatchPostbackAsync(uri2.toString(), (AppLovinPostbackListener) null);
            }
            if (bVar != null) {
                C2053j.m5012c(bVar.mo13117g(), (AppLovinAd) eVar, appLovinAdView);
            }
        } else if (a) {
            mVar.mo14509A().mo15016e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    /* renamed from: a */
    private boolean m3783a(String str) {
        String str2 = this.f2801a.mo14586p().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    private List<Uri> m3785b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String parse : queryParameters) {
            try {
                arrayList.add(Uri.parse(parse));
            } catch (Throwable unused) {
                if (C2102v.m5104a()) {
                    C2102v A = this.f2801a.mo14509A();
                    A.mo15015d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f2806f) {
            this.f2806f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(C1838d dVar) {
        AppLovinAdImpl b = this.f2801a.mo14533Z().mo14277b(dVar);
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2802b;
            vVar.mo15012b("AppLovinAdService", "Dequeued ad: " + b + " for zone: " + dVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return b;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f2807g.getAndSet((Object) null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        HashMap hashMap;
        synchronized (this.f2806f) {
            hashMap = new HashMap(this.f2806f);
            this.f2806f.clear();
        }
        return hashMap;
    }

    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a = this.f2801a.mo14529V().mo14820a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a;
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m3778a(C1838d.m3901a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2802b;
            vVar.mo15012b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m3778a(C1838d.m3902a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* JADX WARNING: type inference failed for: r11v27, types: [com.applovin.impl.sdk.e.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadNextAdForAdToken(java.lang.String r11, com.applovin.sdk.AppLovinAdLoadListener r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0007
            java.lang.String r11 = r11.trim()
            goto L_0x0008
        L_0x0007:
            r11 = 0
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -8
            java.lang.String r2 = "AppLovinAdService"
            if (r0 == 0) goto L_0x0020
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x001c
            java.lang.String r11 = "Invalid ad token specified"
            com.applovin.impl.sdk.C2102v.m5110i(r2, r11)
        L_0x001c:
            r10.m3771a((int) r1, (com.applovin.sdk.AppLovinAdLoadListener) r12)
            return
        L_0x0020:
            com.applovin.impl.sdk.ad.c r0 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.m r3 = r10.f2801a
            r0.<init>(r11, r3)
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo14147b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p049ad.C1836c.C1837a.REGULAR
            if (r11 != r3) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x004b
            com.applovin.impl.sdk.v r11 = r10.f2802b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Loading next ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r11.mo15012b(r2, r1)
        L_0x004b:
            com.applovin.impl.sdk.e.l r11 = new com.applovin.impl.sdk.e.l
            com.applovin.impl.sdk.m r1 = r10.f2801a
            r11.<init>(r0, r12, r1)
        L_0x0052:
            r10.m3780a((com.applovin.impl.sdk.p053e.C1887a) r11)
            goto L_0x010a
        L_0x0057:
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo14147b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p049ad.C1836c.C1837a.AD_RESPONSE_JSON
            if (r11 != r3) goto L_0x00ed
            org.json.JSONObject r5 = r0.mo14149d()
            if (r5 == 0) goto L_0x00df
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.utils.C2050h.m4966f(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.utils.C2050h.m4962d(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.utils.C2050h.m4961c(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.utils.C2050h.m4964e(r5, r11)
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.C1945f.m4387a((com.applovin.impl.sdk.C1969m) r11)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.lang.String r1 = "ads"
            org.json.JSONArray r11 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r5, r1, r11)
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00bd
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x00ab
            com.applovin.impl.sdk.v r11 = r10.f2802b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Rendering ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo15012b(r2, r0)
        L_0x00ab:
            com.applovin.impl.sdk.m r11 = r10.f2801a
            com.applovin.impl.sdk.ad.d r6 = com.applovin.impl.sdk.utils.Utils.getZone(r5, r11)
            com.applovin.impl.sdk.e.p r11 = new com.applovin.impl.sdk.e.p
            com.applovin.impl.sdk.ad.b r7 = com.applovin.impl.sdk.p049ad.C1835b.DECODED_AD_TOKEN_JSON
            com.applovin.impl.sdk.m r9 = r10.f2801a
            r4 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0052
        L_0x00bd:
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x00d9
            com.applovin.impl.sdk.v r11 = r10.f2802b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No ad returned from the server for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo15016e(r2, r0)
        L_0x00d9:
            r11 = 204(0xcc, float:2.86E-43)
            r12.failedToReceiveAd(r11)
            goto L_0x010a
        L_0x00df:
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0107
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Unable to retrieve ad response JSON from token: "
            goto L_0x00fa
        L_0x00ed:
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0107
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Invalid ad token specified: "
        L_0x00fa:
            r11.append(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.applovin.impl.sdk.C2102v.m5110i(r2, r11)
        L_0x0107:
            r12.failedToReceiveAd(r1)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinAdServiceImpl.loadNextAdForAdToken(java.lang.String, com.applovin.sdk.AppLovinAdLoadListener):void");
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2802b;
                vVar.mo15012b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            m3778a(C1838d.m3903a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinAdService", "No zones were provided");
            }
            m3771a(-7, appLovinAdLoadListener);
            return;
        }
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2802b;
            vVar.mo15012b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        }
        m3780a((C1887a) new C1909j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f2801a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2802b;
            vVar.mo15012b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m3778a(C1838d.m3905b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<C1875a> list) {
        if (list != null && !list.isEmpty()) {
            for (C1875a a : list) {
                m3779a(a);
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f2807g.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f2804d + '}';
    }

    public void trackAndLaunchClick(C1839e eVar, AppLovinAdView appLovinAdView, C1507b bVar, Uri uri, PointF pointF, boolean z) {
        if (eVar != null) {
            if (C2102v.m5104a()) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo14189a(pointF, z));
            if (appLovinAdView == null || uri == null) {
                if (C2102v.m5104a()) {
                    this.f2802b.mo15016e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
                }
            } else if (m3783a(uri.getScheme())) {
                m3774a(uri, eVar, bVar, (C1450a) null);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m3773a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f2801a);
            } else {
                m3772a(uri, eVar, appLovinAdView, bVar);
            }
        } else if (C2102v.m5104a()) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track ad view click. No ad specified");
        }
    }

    public void trackAndLaunchVideoClick(C1839e eVar, Uri uri, PointF pointF, C1450a aVar, Context context) {
        if (eVar != null) {
            if (C2102v.m5104a()) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo14188a(pointF));
            if (m3783a(uri.getScheme())) {
                m3774a(uri, eVar, (C1507b) null, aVar);
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                m3773a(uri, eVar, (AppLovinAdView) null, (C1507b) null, context, this.f2801a);
            } else {
                Utils.openUri(context, uri, this.f2801a);
            }
        } else if (C2102v.m5104a()) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track video click. No ad specified");
        }
    }

    public void trackAppKilled(C1839e eVar) {
        if (eVar != null) {
            if (C2102v.m5104a()) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking app killed during ad...");
            }
            List<C1875a> as = eVar.mo14222as();
            if (as != null && !as.isEmpty()) {
                for (C1875a next : as) {
                    m3779a(new C1875a(next.mo14315a(), next.mo14316b()));
                }
            } else if (C2102v.m5104a()) {
                C2102v vVar = this.f2802b;
                vVar.mo15015d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
            }
        } else if (C2102v.m5104a()) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track app killed. No ad specified");
        }
    }

    public void trackFullScreenAdClosed(C1839e eVar, long j, List<Long> list, long j2, boolean z, int i) {
        boolean a = C2102v.m5104a();
        if (eVar != null) {
            if (a) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking ad closed...");
            }
            List<C1875a> ar = eVar.mo14221ar();
            if (ar != null && !ar.isEmpty()) {
                for (C1875a next : ar) {
                    long j3 = j;
                    long j4 = j2;
                    List<Long> list2 = list;
                    boolean z2 = z;
                    int i2 = i;
                    String a2 = m3770a(next.mo14315a(), j3, j4, list2, z2, i2);
                    String a3 = m3770a(next.mo14316b(), j3, j4, list2, z2, i2);
                    if (StringUtils.isValidString(a2)) {
                        m3779a(new C1875a(a2, a3));
                    } else if (C2102v.m5104a()) {
                        C2102v vVar = this.f2802b;
                        vVar.mo15016e("AppLovinAdService", "Failed to parse url: " + next.mo14315a());
                    }
                }
            } else if (C2102v.m5104a()) {
                C2102v vVar2 = this.f2802b;
                vVar2.mo15015d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
            }
        } else if (a) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
        }
    }

    public void trackImpression(C1839e eVar) {
        if (eVar != null) {
            if (C2102v.m5104a()) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.mo12843at());
        } else if (C2102v.m5104a()) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track impression click. No ad specified");
        }
    }

    public void trackVideoEnd(C1839e eVar, long j, int i, boolean z) {
        boolean a = C2102v.m5104a();
        if (eVar != null) {
            if (a) {
                this.f2802b.mo15012b("AppLovinAdService", "Tracking video end on ad...");
            }
            List<C1875a> aq = eVar.mo14220aq();
            if (aq != null && !aq.isEmpty()) {
                String l = Long.toString(System.currentTimeMillis());
                for (C1875a next : aq) {
                    if (StringUtils.isValidString(next.mo14315a())) {
                        long j2 = j;
                        int i2 = i;
                        String str = l;
                        boolean z2 = z;
                        String a2 = m3769a(next.mo14315a(), j2, i2, str, z2);
                        String a3 = m3769a(next.mo14316b(), j2, i2, str, z2);
                        if (a2 != null) {
                            m3779a(new C1875a(a2, a3));
                        } else if (C2102v.m5104a()) {
                            C2102v vVar = this.f2802b;
                            vVar.mo15016e("AppLovinAdService", "Failed to parse url: " + next.mo14315a());
                        }
                    } else if (C2102v.m5104a()) {
                        this.f2802b.mo15015d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                    }
                }
            } else if (C2102v.m5104a()) {
                C2102v vVar2 = this.f2802b;
                vVar2.mo15015d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
            }
        } else if (a) {
            this.f2802b.mo15016e("AppLovinAdService", "Unable to track video end. No ad specified");
        }
    }
}
