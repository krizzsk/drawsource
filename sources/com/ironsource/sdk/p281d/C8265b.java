package com.ironsource.sdk.p281d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.C8108b;
import com.ironsource.sdk.C8263d;
import com.ironsource.sdk.C8282e;
import com.ironsource.sdk.C8285f;
import com.ironsource.sdk.controller.C8139c;
import com.ironsource.sdk.controller.C8147g;
import com.ironsource.sdk.controller.C8170j;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8105e;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p280c.C8116a;
import com.ironsource.sdk.p284f.C8288b;
import com.ironsource.sdk.p285g.C8289a;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p286h.C8307e;
import com.ironsource.sdk.p288j.C8315b;
import com.ironsource.sdk.p288j.C8316c;
import com.ironsource.sdk.p288j.C8318e;
import com.ironsource.sdk.p288j.C8319f;
import com.ironsource.sdk.p288j.p289a.C8311a;
import com.ironsource.sdk.p288j.p289a.C8312b;
import com.ironsource.sdk.p288j.p289a.C8313c;
import com.ironsource.sdk.p288j.p289a.C8314d;
import com.ironsource.sdk.service.C8335a;
import com.ironsource.sdk.service.C8337c;
import com.ironsource.sdk.service.C8338d;
import com.ironsource.sdk.utils.C8341a;
import com.ironsource.sdk.utils.C8342b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.core.api.VideoType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d.b */
public final class C8265b implements C8281c, C8282e, C8285f, C8311a, C8312b, C8313c, C8314d {

    /* renamed from: g */
    private static C8265b f20119g;

    /* renamed from: a */
    public C8147g f20120a;

    /* renamed from: b */
    C8318e f20121b;

    /* renamed from: c */
    String f20122c;

    /* renamed from: d */
    String f20123d;

    /* renamed from: e */
    C8170j f20124e;

    /* renamed from: f */
    private final String f20125f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: h */
    private long f20126h;

    /* renamed from: i */
    private C8338d f20127i;

    /* renamed from: j */
    private C8337c f20128j;

    /* renamed from: k */
    private boolean f20129k = false;

    /* renamed from: l */
    private C8139c f20130l;

    private C8265b(Context context) {
        m23544b(context);
    }

    private C8265b(String str, String str2, Context context) {
        this.f20122c = str;
        this.f20123d = str2;
        m23544b(context);
    }

    /* renamed from: a */
    public static synchronized C8265b m23538a(Context context) {
        C8265b a;
        synchronized (C8265b.class) {
            a = m23539a(context, 0);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C8265b m23539a(Context context, int i) {
        C8265b bVar;
        synchronized (C8265b.class) {
            Logger.m23749i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f20119g == null) {
                f20119g = new C8265b(context);
            }
            bVar = f20119g;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C8282e m23540a(String str, String str2, Context context) {
        C8265b bVar;
        synchronized (C8265b.class) {
            if (f20119g == null) {
                C8104d.m23160a(C8106f.f19622a);
                f20119g = new C8265b(str, str2, context);
            } else {
                C8338d.m23726a().mo56787b(str);
                C8338d.m23726a().mo56782a(str2);
            }
            bVar = f20119g;
        }
        return bVar;
    }

    /* renamed from: a */
    private static C8319f m23541a(C8292c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8319f) cVar.f20223g;
    }

    /* renamed from: a */
    private void m23542a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f20129k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C8264a(this));
            } catch (Throwable th) {
                C8100a aVar = new C8100a();
                aVar.mo56293a("generalmessage", th.getMessage());
                C8104d.m23161a(C8106f.f19638q, (Map<String, Object>) aVar.f19613a);
            }
        }
    }

    /* renamed from: b */
    private static C8316c m23543b(C8292c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8316c) cVar.f20223g;
    }

    /* renamed from: b */
    private void m23544b(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            C8342b.m23759a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C8307e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            C8342b.m23758a().mo56792a(SDKUtils.getSDKVersion());
            this.f20127i = m23547c(context);
            this.f20124e = new C8170j();
            C8139c cVar = new C8139c();
            this.f20130l = cVar;
            if (context instanceof Activity) {
                cVar.mo56397a((Activity) context);
            }
            this.f20120a = new C8147g(context, this.f20130l, this.f20127i, this.f20124e, C6385a.f16166a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.m23749i("IronSourceAdsPublisherAgent", "C'tor");
            m23542a(context, networkConfiguration);
            this.f20128j = new C8337c();
            C6538a.m19816a("sdkv", (Object) "5.117");
            this.f20128j.mo56775a();
            this.f20128j.mo56776a(context);
            this.f20128j.mo56777b();
            this.f20128j.mo56779c();
            this.f20128j.mo56778b(context);
            this.f20126h = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m23545b(C8108b bVar, Map<String, String> map) {
        if (bVar.f19652h) {
            m23548c(bVar, map);
        } else {
            m23550d(bVar, map);
        }
    }

    /* renamed from: c */
    private static C8315b m23546c(C8292c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C8315b) cVar.f20223g;
    }

    /* renamed from: c */
    private C8338d m23547c(Context context) {
        C8338d a = C8338d.m23726a();
        a.mo56786b();
        a.mo56781a(context, this.f20122c, this.f20123d);
        return a;
    }

    /* renamed from: c */
    private void m23548c(final C8108b bVar, final Map<String, String> map) {
        Logger.m23745d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f19646b);
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8292c a = C8265b.this.f20124e.mo56461a(C8293d.C8298e.Interstitial, bVar.f19646b);
                if (a != null) {
                    C8265b.this.f20120a.mo56413a(a, (Map<String, String>) map, (C8313c) C8265b.this);
                }
            }
        });
    }

    /* renamed from: d */
    private C8292c m23549d(C8293d.C8298e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f20124e.mo56461a(eVar, str);
    }

    /* renamed from: d */
    private void m23550d(final C8108b bVar, final Map<String, String> map) {
        Logger.m23745d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f19646b);
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8293d.C8298e eVar = bVar.mo56308a() ? C8293d.C8298e.Banner : C8293d.C8298e.Interstitial;
                C8170j jVar = C8265b.this.f20124e;
                C8108b bVar = bVar;
                String str = bVar.f19646b;
                String str2 = bVar.f19647c;
                HashMap hashMap = new HashMap();
                hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, bVar.f19646b);
                hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, bVar.f19647c);
                hashMap.put(VideoType.REWARDED, Boolean.toString(bVar.f19645a));
                hashMap.put("inAppBidding", Boolean.toString(bVar.f19648d));
                hashMap.put("isOneFlow", Boolean.toString(bVar.f19653i));
                hashMap.put("apiVersion", "2");
                String str3 = "0";
                hashMap.put("width", bVar.f19649e != null ? Integer.toString(bVar.f19649e.f19610a) : str3);
                if (bVar.f19649e != null) {
                    str3 = Integer.toString(bVar.f19649e.f19611b);
                }
                hashMap.put("height", str3);
                hashMap.put(Constants.ScionAnalytics.PARAM_LABEL, bVar.f19649e != null ? bVar.f19649e.f19612c : "");
                hashMap.put("isBanner", Boolean.toString(bVar.mo56308a()));
                if (bVar.f19650f != null) {
                    hashMap.putAll(bVar.f19650f);
                }
                C8292c cVar = new C8292c(str, str2, hashMap, bVar.f19651g);
                jVar.mo56464a(eVar, str, cVar);
                C8100a aVar = new C8100a();
                C8100a a = aVar.mo56293a("isbiddinginstance", Boolean.valueOf(bVar.f19648d)).mo56293a("isoneflow", Boolean.valueOf(bVar.f19653i)).mo56293a("demandsourcename", bVar.f19647c).mo56293a("producttype", C8263d.m23536a(bVar));
                C8335a aVar2 = C8335a.f20301a;
                a.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(bVar.f19646b)));
                C8104d.m23161a(C8106f.f19628g, (Map<String, Object>) aVar.f19613a);
                if (eVar == C8293d.C8298e.Banner) {
                    C8265b.this.f20120a.mo56416a(C8265b.this.f20122c, C8265b.this.f20123d, cVar, (C8312b) C8265b.this);
                    bVar.f19652h = true;
                    C8265b.this.f20120a.mo56412a(cVar, (Map<String, String>) map, (C8312b) C8265b.this);
                    return;
                }
                C8265b.this.f20120a.mo56417a(C8265b.this.f20122c, C8265b.this.f20123d, cVar, (C8313c) C8265b.this);
                bVar.f19652h = true;
                C8265b.this.f20120a.mo56413a(cVar, (Map<String, String>) map, (C8313c) C8265b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56659a() {
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56429d();
            }
        });
    }

    /* renamed from: a */
    public final void mo56660a(Activity activity) {
        try {
            Logger.m23749i("IronSourceAdsPublisherAgent", "release()");
            C8341a.m23756a();
            this.f20130l.mo56398b();
            this.f20120a.mo56425b((Context) activity);
            this.f20120a.destroy();
            this.f20120a = null;
        } catch (Exception unused) {
        }
        f20119g = null;
    }

    /* renamed from: a */
    public final void mo56661a(Activity activity, C8108b bVar, Map<String, String> map) {
        this.f20130l.mo56397a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        C8335a aVar = C8335a.f20301a;
        C8335a.m23714a(bVar.f19646b, currentTimeMillis);
        C8100a aVar2 = new C8100a();
        aVar2.mo56293a("isbiddinginstance", Boolean.valueOf(bVar.f19648d)).mo56293a("isoneflow", Boolean.valueOf(bVar.f19653i)).mo56293a("demandsourcename", bVar.f19647c).mo56293a("producttype", C8263d.m23536a(bVar)).mo56293a("custom_c", Long.valueOf(currentTimeMillis));
        C8104d.m23161a(C8106f.f19626e, (Map<String, Object>) aVar2.f19613a);
        Logger.m23745d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f19646b);
        if (bVar.f19648d || bVar.f19653i) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e) {
                C8100a a = new C8100a().mo56293a("callfailreason", e.getMessage()).mo56293a("generalmessage", bVar.f19652h ? C8288b.f20189a : C8288b.f20190b).mo56293a("isbiddinginstance", Boolean.valueOf(bVar.f19648d)).mo56293a("isoneflow", Boolean.valueOf(bVar.f19653i)).mo56293a("demandsourcename", bVar.f19647c).mo56293a("producttype", C8263d.m23536a(bVar));
                C8335a aVar3 = C8335a.f20301a;
                C8100a a2 = a.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(bVar.f19646b)));
                C8335a aVar4 = C8335a.f20301a;
                C8335a.m23715b(bVar.f19646b);
                C8104d.m23161a(C8106f.f19631j, (Map<String, Object>) a2.f19613a);
                e.printStackTrace();
                Logger.m23745d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
            }
            m23545b(bVar, map);
            return;
        }
        m23545b(bVar, map);
    }

    /* renamed from: a */
    public final void mo56662a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.f20130l.mo56397a(activity);
        }
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56421a((Map<String, String>) map, C8265b.this.f20121b);
            }
        });
    }

    /* renamed from: a */
    public final void mo56663a(C8108b bVar, final Map<String, String> map) {
        Logger.m23749i("IronSourceAdsPublisherAgent", "showAd " + bVar.f19646b);
        final C8292c a = this.f20124e.mo56461a(C8293d.C8298e.Interstitial, bVar.f19646b);
        if (a != null) {
            this.f20120a.mo56414a((Runnable) new Runnable() {
                public final void run() {
                    C8265b.this.f20120a.mo56426b(a, map, C8265b.this);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56664a(C8293d.C8298e eVar, String str) {
        C8316c b;
        C8292c d = m23549d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8293d.C8298e.RewardedVideo) {
            C8319f a = m23541a(d);
            if (a != null) {
                a.onRVAdClosed();
            }
        } else if (eVar == C8293d.C8298e.Interstitial && (b = m23543b(d)) != null) {
            b.onInterstitialClose();
        }
    }

    /* renamed from: a */
    public final void mo56665a(C8293d.C8298e eVar, String str, C8289a aVar) {
        C8315b c;
        C8292c d = m23549d(eVar, str);
        if (d != null) {
            d.mo56724a(2);
            if (eVar == C8293d.C8298e.RewardedVideo) {
                C8319f a = m23541a(d);
                if (a != null) {
                    a.onRVInitSuccess(aVar);
                }
            } else if (eVar == C8293d.C8298e.Interstitial) {
                C8316c b = m23543b(d);
                if (b != null) {
                    b.onInterstitialInitSuccess();
                }
            } else if (eVar == C8293d.C8298e.Banner && (c = m23546c(d)) != null) {
                c.onBannerInitSuccess();
            }
        }
    }

    /* renamed from: a */
    public final void mo56666a(C8293d.C8298e eVar, String str, String str2) {
        C8315b c;
        C8292c d = m23549d(eVar, str);
        C8100a a = new C8100a().mo56293a("demandsourcename", str).mo56293a("producttype", eVar).mo56293a("callfailreason", str2);
        C8335a aVar = C8335a.f20301a;
        C8100a a2 = a.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(d.f20218b)));
        C8335a aVar2 = C8335a.f20301a;
        C8335a.m23715b(d.f20218b);
        if (d != null) {
            a2.mo56293a("isbiddinginstance", Boolean.valueOf(C8105e.m23163a(d)));
            d.mo56724a(3);
            if (eVar == C8293d.C8298e.RewardedVideo) {
                C8319f a3 = m23541a(d);
                if (a3 != null) {
                    a3.onRVInitFail(str2);
                }
            } else if (eVar == C8293d.C8298e.Interstitial) {
                C8316c b = m23543b(d);
                if (b != null) {
                    b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C8293d.C8298e.Banner && (c = m23546c(d)) != null) {
                c.onBannerInitFailed(str2);
            }
        }
        C8104d.m23161a(C8106f.f19629h, (Map<String, Object>) a2.f19613a);
    }

    /* renamed from: a */
    public final void mo56667a(C8293d.C8298e eVar, String str, String str2, JSONObject jSONObject) {
        C8315b c;
        C8292c d = m23549d(eVar, str);
        if (d != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.m23749i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d.f20217a);
                if (eVar == C8293d.C8298e.Interstitial) {
                    C8316c b = m23543b(d);
                    if (b != null) {
                        jSONObject.put("demandSourceName", str);
                        b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C8293d.C8298e.RewardedVideo) {
                    C8319f a = m23541a(d);
                    if (a != null) {
                        jSONObject.put("demandSourceName", str);
                        a.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C8293d.C8298e.Banner && (c = m23546c(d)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        c.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo56668a(final C8318e eVar) {
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56419a(C8265b.this.f20122c, C8265b.this.f20123d, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56669a(String str, int i) {
        C8319f a;
        C8292c d = m23549d(C8293d.C8298e.RewardedVideo, str);
        if (d != null && (a = m23541a(d)) != null) {
            a.onRVAdCredited(i);
        }
    }

    /* renamed from: a */
    public final void mo56670a(String str, C8116a aVar) {
        C8315b c;
        C8292c d = m23549d(C8293d.C8298e.Banner, str);
        if (d != null && (c = m23546c(d)) != null) {
            c.onBannerLoadSuccess(aVar);
        }
    }

    /* renamed from: a */
    public final void mo56671a(String str, String str2) {
        C8319f a;
        C8292c d = m23549d(C8293d.C8298e.RewardedVideo, str);
        if (d != null && (a = m23541a(d)) != null) {
            a.onRVShowFail(str2);
        }
    }

    /* renamed from: a */
    public final void mo56672a(String str, String str2, int i) {
        C8293d.C8298e productType;
        C8292c a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a = this.f20124e.mo56461a(productType, str2)) != null) {
            a.f20219c = i;
        }
    }

    /* renamed from: a */
    public final void mo56673a(final String str, final String str2, final C8318e eVar) {
        this.f20122c = str;
        this.f20123d = str2;
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56419a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56674a(final String str, final String str2, String str3, Map<String, String> map, C8316c cVar) {
        this.f20122c = str;
        this.f20123d = str2;
        final C8292c a = this.f20124e.mo56462a(C8293d.C8298e.Interstitial, str3, map, cVar);
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56417a(str, str2, a, (C8313c) C8265b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56675a(final String str, final String str2, String str3, Map<String, String> map, C8319f fVar) {
        this.f20122c = str;
        this.f20123d = str2;
        final C8292c a = this.f20124e.mo56462a(C8293d.C8298e.RewardedVideo, str3, map, fVar);
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56418a(str, str2, a, (C8314d) C8265b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo56676a(String str, String str2, Map<String, String> map, C8318e eVar) {
        this.f20122c = str;
        this.f20123d = str2;
        this.f20121b = eVar;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C8318e eVar2 = eVar;
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56420a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo56677a(final Map<String, String> map, final C8318e eVar) {
        this.f20121b = eVar;
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56420a(C8265b.this.f20122c, C8265b.this.f20123d, (Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56678a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f20127i.mo56784a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56422a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo56679a(C8108b bVar) {
        Logger.m23745d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f19646b);
        C8292c a = this.f20124e.mo56461a(C8293d.C8298e.Interstitial, bVar.f19646b);
        if (a == null) {
            return false;
        }
        return a.f20222f;
    }

    /* renamed from: a */
    public final boolean mo56680a(String str) {
        return this.f20120a.mo56428c(str);
    }

    /* renamed from: b */
    public final void mo56681b(Activity activity) {
        if (!this.f20129k) {
            mo56692d(activity);
        }
    }

    /* renamed from: b */
    public final void mo56682b(C8293d.C8298e eVar, String str) {
        C8315b c;
        C8292c d = m23549d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8293d.C8298e.RewardedVideo) {
            C8319f a = m23541a(d);
            if (a != null) {
                a.onRVAdClicked();
            }
        } else if (eVar == C8293d.C8298e.Interstitial) {
            C8316c b = m23543b(d);
            if (b != null) {
                b.onInterstitialClick();
            }
        } else if (eVar == C8293d.C8298e.Banner && (c = m23546c(d)) != null) {
            c.onBannerClick();
        }
    }

    /* renamed from: b */
    public final void mo56683b(String str) {
        C8319f a;
        C8292c d = m23549d(C8293d.C8298e.RewardedVideo, str);
        if (d != null && (a = m23541a(d)) != null) {
            a.onRVNoMoreOffers();
        }
    }

    /* renamed from: b */
    public final void mo56684b(String str, int i) {
        C8292c d = m23549d(C8293d.C8298e.Interstitial, str);
        C8316c b = m23543b(d);
        if (d != null && b != null) {
            b.onInterstitialAdRewarded(str, i);
        }
    }

    /* renamed from: b */
    public final void mo56685b(String str, String str2) {
        C8292c d = m23549d(C8293d.C8298e.Interstitial, str);
        C8100a aVar = new C8100a();
        aVar.mo56293a("callfailreason", str2).mo56293a("demandsourcename", str);
        if (d != null) {
            C8100a a = aVar.mo56293a("producttype", C8105e.m23162a(d, C8293d.C8298e.Interstitial)).mo56293a("generalmessage", d.f20221e == 2 ? C8288b.f20189a : C8288b.f20190b).mo56293a("isbiddinginstance", Boolean.valueOf(C8105e.m23163a(d)));
            C8335a aVar2 = C8335a.f20301a;
            a.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(d.f20218b)));
            C8335a aVar3 = C8335a.f20301a;
            C8335a.m23715b(d.f20218b);
            C8316c b = m23543b(d);
            if (b != null) {
                b.onInterstitialLoadFailed(str2);
            }
        }
        C8104d.m23161a(C8106f.f19627f, (Map<String, Object>) aVar.f19613a);
    }

    /* renamed from: b */
    public final void mo56686b(final JSONObject jSONObject) {
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56424a(jSONObject, (C8314d) C8265b.this);
            }
        });
    }

    /* renamed from: c */
    public final void mo56687c(Activity activity) {
        if (!this.f20129k) {
            mo56696e(activity);
        }
    }

    /* renamed from: c */
    public final void mo56688c(C8293d.C8298e eVar, String str) {
        C8319f a;
        C8292c d = m23549d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C8293d.C8298e.Interstitial) {
            C8316c b = m23543b(d);
            if (b != null) {
                b.onInterstitialOpen();
            }
        } else if (eVar == C8293d.C8298e.RewardedVideo && (a = m23541a(d)) != null) {
            a.onRVAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo56689c(String str) {
        C8292c d = m23549d(C8293d.C8298e.Interstitial, str);
        C8100a a = new C8100a().mo56293a("demandsourcename", str);
        if (d != null) {
            C8100a a2 = a.mo56293a("producttype", C8105e.m23162a(d, C8293d.C8298e.Interstitial)).mo56293a("isbiddinginstance", Boolean.valueOf(C8105e.m23163a(d)));
            C8335a aVar = C8335a.f20301a;
            a2.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(d.f20218b)));
            C8335a aVar2 = C8335a.f20301a;
            C8335a.m23715b(d.f20218b);
            C8316c b = m23543b(d);
            if (b != null) {
                b.onInterstitialLoadSuccess();
            }
        }
        C8104d.m23161a(C8106f.f19632k, (Map<String, Object>) a.f19613a);
    }

    /* renamed from: c */
    public final void mo56690c(String str, String str2) {
        C8316c b;
        C8292c d = m23549d(C8293d.C8298e.Interstitial, str);
        if (d != null && (b = m23543b(d)) != null) {
            b.onInterstitialShowFailed(str2);
        }
    }

    /* renamed from: c */
    public final void mo56691c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f20120a.mo56414a((Runnable) new Runnable() {
                public final void run() {
                    C8265b.this.f20120a.mo56415a(optString, (C8313c) C8265b.this);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo56692d(Activity activity) {
        try {
            this.f20120a.mo56432f();
            this.f20120a.mo56425b((Context) activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo56693d(String str) {
        C8316c b;
        C8292c d = m23549d(C8293d.C8298e.Interstitial, str);
        if (d != null && (b = m23543b(d)) != null) {
            b.onInterstitialShowSuccess();
        }
    }

    /* renamed from: d */
    public final void mo56694d(String str, String str2) {
        C8315b c;
        C8292c d = m23549d(C8293d.C8298e.Banner, str);
        if (d != null && (c = m23546c(d)) != null) {
            c.onBannerLoadFail(str2);
        }
    }

    /* renamed from: d */
    public final void mo56695d(final JSONObject jSONObject) {
        this.f20120a.mo56414a((Runnable) new Runnable() {
            public final void run() {
                C8265b.this.f20120a.mo56423a(jSONObject, (C8313c) C8265b.this);
            }
        });
    }

    /* renamed from: e */
    public final void mo56696e(Activity activity) {
        this.f20130l.mo56397a(activity);
        this.f20120a.mo56431e();
        this.f20120a.mo56411a((Context) activity);
    }
}
