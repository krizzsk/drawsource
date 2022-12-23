package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.metrics.b */
public class C4413b<T extends C5233e> extends C4412a {

    /* renamed from: g */
    public static final String f10832g = String.valueOf(24);

    /* renamed from: h */
    public static final String f10833h = String.valueOf(3);

    /* renamed from: i */
    public static final String f10834i = String.valueOf(24);

    /* renamed from: j */
    public static final String f10835j = String.valueOf(3);

    /* renamed from: b */
    public final String f10836b;

    /* renamed from: c */
    public final UnitDisplayType f10837c;

    /* renamed from: d */
    public final T f10838d;

    /* renamed from: e */
    public final InneractiveAdRequest f10839e;

    /* renamed from: f */
    public final JSONArray f10840f;

    /* renamed from: com.fyber.inneractive.sdk.metrics.b$a */
    public class C4414a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4418f f10841a;

        /* renamed from: b */
        public final /* synthetic */ Map f10842b;

        public C4414a(C4418f fVar, Map map) {
            this.f10841a = fVar;
            this.f10842b = map;
        }

        public void run() {
            UnitDisplayType unitDisplayType;
            String str;
            int i;
            int i2;
            IAlog.m16446a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
            C4413b bVar = C4413b.this;
            if (bVar.f10836b != null && (unitDisplayType = bVar.f10837c) != null) {
                UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
                if (unitDisplayType == unitDisplayType2 || unitDisplayType == UnitDisplayType.MRECT || unitDisplayType.isFullscreenUnit()) {
                    IAlog.m16446a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f10841a.toString());
                    UnitDisplayType unitDisplayType3 = C4413b.this.f10837c;
                    if (unitDisplayType3 == unitDisplayType2 || unitDisplayType3 == UnitDisplayType.MRECT) {
                        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
                        C4252h hVar = iAConfigManager.f10356v.f10459b;
                        String str2 = C4413b.f10832g;
                        if (hVar.f10456a.containsKey("ad_metrics_interval_banner")) {
                            str2 = hVar.f10456a.get("ad_metrics_interval_banner");
                        }
                        C4252h hVar2 = iAConfigManager.f10356v.f10459b;
                        String str3 = C4413b.f10833h;
                        if (hVar2.f10456a.containsKey("ad_metrics_limit_banner")) {
                            str3 = hVar2.f10456a.get("ad_metrics_limit_banner");
                        }
                        i2 = C5312s.m16530a(str2, 24);
                        i = C5312s.m16530a(str3, 3);
                        str = "LastSentMetricsBanner";
                    } else {
                        IAConfigManager iAConfigManager2 = IAConfigManager.f10324J;
                        C4252h hVar3 = iAConfigManager2.f10356v.f10459b;
                        String str4 = C4413b.f10834i;
                        if (hVar3.f10456a.containsKey("ad_metrics_interval_interstitial")) {
                            str4 = hVar3.f10456a.get("ad_metrics_interval_interstitial");
                        }
                        C4252h hVar4 = iAConfigManager2.f10356v.f10459b;
                        String str5 = C4413b.f10835j;
                        if (hVar4.f10456a.containsKey("ad_metrics_limit_interstitial")) {
                            str5 = hVar4.f10456a.get("ad_metrics_limit_interstitial");
                        }
                        i2 = C5312s.m16530a(str4, 24);
                        i = C5312s.m16530a(str5, 3);
                        str = "LastSentMetricsInterstitial";
                    }
                    Application application = C5292l.f14015a;
                    if (application != null) {
                        SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray = new JSONArray(sharedPreferences.getString(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                        } catch (JSONException unused) {
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        C4413b bVar2 = C4413b.this;
                        bVar2.getClass();
                        if (IAConfigManager.f10324J.f10356v.f10459b.mo24273a(bVar2.f10831a, false) && !C4412a.m13570a(i2, i, jSONArray, copyOnWriteArrayList)) {
                            copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                            C4413b bVar3 = C4413b.this;
                            InneractiveAdRequest inneractiveAdRequest = bVar3.f10839e;
                            T t = bVar3.f10838d;
                            Map map = this.f10842b;
                            bVar3.getClass();
                            try {
                                C4509p pVar = C4509p.METRIC_MEASUREMENTS_EVENT;
                                JSONArray jSONArray2 = bVar3.f10840f;
                                C4511q.C4512a aVar = new C4511q.C4512a(t);
                                aVar.f11164c = pVar;
                                aVar.f11162a = inneractiveAdRequest;
                                aVar.f11165d = jSONArray2;
                                JSONObject jSONObject = new JSONObject();
                                for (String str6 : map.keySet()) {
                                    Object obj = map.get(str6);
                                    try {
                                        jSONObject.put(str6, obj);
                                    } catch (Exception unused2) {
                                        IAlog.m16450e("Got exception adding param to json object: %s, %s", str6, obj);
                                    }
                                }
                                aVar.f11167f.put(jSONObject);
                                aVar.mo24693a((String) null);
                            } catch (Exception unused3) {
                            }
                        }
                        sharedPreferences.edit().putString(str, new JSONArray(copyOnWriteArrayList).toString()).apply();
                        return;
                    }
                    return;
                }
                IAlog.m16446a("Unit display type %s is not supported for metric event", C4413b.this.f10837c.value());
            }
        }
    }

    public C4413b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f10838d = t;
        this.f10839e = inneractiveAdRequest;
        this.f10836b = str;
        this.f10837c = unitDisplayType;
        this.f10840f = jSONArray;
    }

    /* renamed from: a */
    public void mo24594a() {
        C4415c cVar = C4415c.f10844c;
        C4418f a = cVar.mo24596a(this.f10836b);
        Map<String, Long> j = a.mo24606j();
        if (!a.mo24597a()) {
            IAlog.m16446a("MetricCreativeReporter: Metric data not valid, data: %s", cVar.mo24596a(this.f10836b).toString());
            return;
        }
        cVar.f10845a.remove(this.f10836b);
        C5299n.m16520a(new C4414a(a, j));
    }
}
