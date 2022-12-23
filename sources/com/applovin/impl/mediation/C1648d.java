package com.applovin.impl.mediation;

import android.content.Context;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p034c.C1633b;
import com.applovin.impl.mediation.p034c.C1637c;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.d */
public class C1648d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f2297a;

    /* renamed from: b */
    private final Map<String, C1652b> f2298b = new HashMap(4);

    /* renamed from: c */
    private final Object f2299c = new Object();

    /* renamed from: d */
    private final Map<String, C1583a> f2300d = new HashMap(4);

    /* renamed from: e */
    private final Object f2301e = new Object();

    /* renamed from: com.applovin.impl.mediation.d$a */
    private static class C1650a implements C1614a.C1615a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1969m f2309a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final WeakReference<Context> f2310b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1648d f2311c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1652b f2312d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final MaxAdFormat f2313e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Map<String, Object> f2314f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Map<String, Object> f2315g;

        /* renamed from: h */
        private final int f2316h;

        private C1650a(Map<String, Object> map, Map<String, Object> map2, C1652b bVar, MaxAdFormat maxAdFormat, C1648d dVar, C1969m mVar, Context context) {
            this.f2309a = mVar;
            this.f2310b = new WeakReference<>(context);
            this.f2311c = dVar;
            this.f2312d = bVar;
            this.f2313e = maxAdFormat;
            this.f2315g = map2;
            this.f2314f = map;
            this.f2316h = CollectionUtils.getBoolean(map2, "disable_auto_retries") ? -1 : (!maxAdFormat.isAdViewAd() || !CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? ((Integer) mVar.mo14534a(C1866a.f3060N)).intValue() : Math.min(2, ((Integer) mVar.mo14534a(C1866a.f3060N)).intValue());
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f2309a.mo14549a(C1866a.f3061O, this.f2313e) || this.f2312d.f2322c >= this.f2316h) {
                int unused = this.f2312d.f2322c = 0;
                this.f2312d.f2321b.set(false);
                if (this.f2312d.f2323d != null) {
                    ((MaxErrorImpl) maxError).setLoadTag(this.f2312d.f2320a);
                    C2053j.m4988a((MaxAdListener) this.f2312d.f2323d, str, maxError);
                    C1614a.C1615a unused2 = this.f2312d.f2323d = null;
                    return;
                }
                return;
            }
            C1652b.m3362e(this.f2312d);
            final int pow = (int) Math.pow(2.0d, (double) this.f2312d.f2322c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1650a.this.f2315g.put("retry_delay_sec", Integer.valueOf(pow));
                    C1650a.this.f2315g.put("retry_attempt", Integer.valueOf(C1650a.this.f2312d.f2322c));
                    Context context = (Context) C1650a.this.f2310b.get();
                    if (context == null) {
                        context = C1650a.this.f2309a.mo14520L();
                    }
                    C1650a.this.f2311c.m3344a(str, C1650a.this.f2313e, C1650a.this.f2314f, C1650a.this.f2315g, context, C1650a.this);
                }
            }, TimeUnit.SECONDS.toMillis((long) pow));
        }

        public void onAdLoaded(MaxAd maxAd) {
            C1583a aVar = (C1583a) maxAd;
            aVar.mo13359a(this.f2312d.f2320a);
            int unused = this.f2312d.f2322c = 0;
            if (this.f2312d.f2323d != null) {
                aVar.mo13366g().mo13841e().mo13345a(this.f2312d.f2323d);
                this.f2312d.f2323d.onAdLoaded(aVar);
                if (aVar.mo13363d().endsWith("load")) {
                    this.f2312d.f2323d.onAdRevenuePaid(aVar);
                }
                C1614a.C1615a unused2 = this.f2312d.f2323d = null;
                if ((this.f2309a.mo14567b(C1866a.f3059M).contains(maxAd.getAdUnitId()) || this.f2309a.mo14549a(C1866a.f3058L, maxAd.getFormat())) && !this.f2309a.mo14518J().mo13806a() && !this.f2309a.mo14518J().mo13808b()) {
                    Context context = (Context) this.f2310b.get();
                    if (context == null) {
                        context = this.f2309a.mo14520L();
                    }
                    this.f2311c.m3344a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f2314f, this.f2315g, context, this);
                    return;
                }
            } else {
                this.f2311c.m3341a(aVar);
            }
            this.f2312d.f2321b.set(false);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$b */
    private static class C1652b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f2320a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AtomicBoolean f2321b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f2322c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public volatile C1614a.C1615a f2323d;

        private C1652b(String str) {
            this.f2321b = new AtomicBoolean();
            this.f2320a = str;
        }

        /* renamed from: e */
        static /* synthetic */ int m3362e(C1652b bVar) {
            int i = bVar.f2322c;
            bVar.f2322c = i + 1;
            return i;
        }
    }

    public C1648d(C1969m mVar) {
        this.f2297a = mVar;
    }

    /* renamed from: a */
    private C1652b m3339a(String str, String str2) {
        String str3;
        C1652b bVar;
        synchronized (this.f2299c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (StringUtils.isValidString(str2)) {
                str3 = "-" + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            String sb2 = sb.toString();
            bVar = this.f2298b.get(sb2);
            if (bVar == null) {
                bVar = new C1652b(str2);
                this.f2298b.put(sb2, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3341a(C1583a aVar) {
        synchronized (this.f2301e) {
            if (this.f2300d.containsKey(aVar.getAdUnitId()) && C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f2300d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3344a(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1614a.C1615a aVar) {
        final String str2 = str;
        final MaxAdFormat maxAdFormat2 = maxAdFormat;
        final Map<String, Object> map3 = map;
        final Map<String, Object> map4 = map2;
        final Context context2 = context;
        final C1614a.C1615a aVar2 = aVar;
        this.f2297a.mo14526S().mo14429a((C1887a) new C1633b(maxAdFormat, map, context, this.f2297a, new C1633b.C1635a() {
            /* renamed from: a */
            public void mo13582a(JSONArray jSONArray) {
                C1648d.this.f2297a.mo14526S().mo14428a((C1887a) new C1637c(str2, maxAdFormat2, map3, map4, jSONArray, context2, C1648d.this.f2297a, aVar2));
            }
        }), C1655c.m3369a(maxAdFormat));
    }

    /* renamed from: b */
    private C1583a m3345b(String str) {
        C1583a aVar;
        synchronized (this.f2301e) {
            aVar = this.f2300d.get(str);
            this.f2300d.remove(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo13604a(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1614a.C1615a aVar) {
        C1614a.C1615a aVar2 = aVar;
        C1583a b = (this.f2297a.mo14518J().mo13808b() || Utils.isDspDemoApp(this.f2297a.mo14520L())) ? null : m3345b(str);
        String str3 = str2;
        if (b != null) {
            b.mo13359a(str2);
            b.mo13366g().mo13841e().mo13345a(aVar2);
            aVar2.onAdLoaded(b);
            if (b.mo13363d().endsWith("load")) {
                aVar2.onAdRevenuePaid(b);
            }
        }
        C1652b a = m3339a(str, str2);
        if (a.f2321b.compareAndSet(false, true)) {
            if (b == null) {
                C1614a.C1615a unused = a.f2323d = aVar2;
            }
            m3344a(str, maxAdFormat, map, map2, context, new C1650a(map, map2, a, maxAdFormat, this, this.f2297a, context));
            return;
        }
        if (!(a.f2323d == null || a.f2323d == aVar2 || !C2102v.m5104a())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to load ad for same ad unit id (");
            String str4 = str;
            sb.append(str);
            sb.append(") while another ad load is already in progress!");
            C2102v.m5109h("MediationAdLoadManager", sb.toString());
        }
        C1614a.C1615a unused2 = a.f2323d = aVar2;
    }

    /* renamed from: a */
    public boolean mo13605a(String str) {
        boolean z;
        synchronized (this.f2301e) {
            z = this.f2300d.get(str) != null;
        }
        return z;
    }
}
