package com.fyber.inneractive.sdk.bidder;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C4212d;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4257k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.serverapi.C5240a;
import com.fyber.inneractive.sdk.serverapi.C5242b;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.bidder.a */
public class C4151a implements C4173d, C4213d0.C4214a {

    /* renamed from: h */
    public static final C4151a f10188h = new C4151a();

    /* renamed from: a */
    public final TokenParametersOuterClass$TokenParameters.C4138b f10189a;

    /* renamed from: b */
    public final C5242b f10190b;

    /* renamed from: c */
    public final C4171c f10191c;

    /* renamed from: d */
    public C4174e f10192d;

    /* renamed from: e */
    public final Map<String, String> f10193e = new C4152a(this);

    /* renamed from: f */
    public final AtomicReference<String> f10194f = new AtomicReference<>((Object) null);

    /* renamed from: g */
    public final AtomicBoolean f10195g = new AtomicBoolean(false);

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$a */
    public class C4152a extends HashMap<String, String> {
        public C4152a(C4151a aVar) {
            put("max", "token_size_limit_max");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$b */
    public class C4153b implements Runnable {
        public C4153b() {
        }

        public void run() {
            C4151a.this.mo24015a();
        }
    }

    public C4151a() {
        C5242b bVar = new C5242b(C4251s.m13278b());
        this.f10190b = bVar;
        C4171c cVar = new C4171c(bVar);
        this.f10191c = cVar;
        this.f10189a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager.m13177c().mo24212a((C4213d0.C4214a) this);
        mo24018c();
        if (IAConfigManager.m13176b().mo24276a().mo24273a("bidding_token_wait_for_ua", true)) {
            IAConfigManager.m13178d().mo26398d();
            cVar.mo24161a(IAConfigManager.m13178d().mo26394a());
        }
    }

    /* renamed from: a */
    public final void mo24015a() {
        String str;
        String str2;
        Boolean bool;
        TokenParametersOuterClass$TokenParameters.C4148l lVar;
        TokenParametersOuterClass$TokenParameters.C4150n nVar;
        if (this.f10195g.compareAndSet(false, true)) {
            TokenParametersOuterClass$TokenParameters.C4138b bVar = this.f10189a;
            bVar.f13487b = (GeneratedMessageLite) bVar.f13487b.dynamicMethod(GeneratedMessageLite.C5054e.NEW_MUTABLE_INSTANCE);
            TokenParametersOuterClass$TokenParameters.C4138b bVar2 = this.f10189a;
            this.f10191c.getClass();
            TokenParametersOuterClass$TokenParameters.NullableString c = C4175f.m13142c("1.2");
            bVar2.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar2.f13487b).setVersion(c);
            if (this.f10194f.get() != null) {
                this.f10191c.mo24160a();
            }
            TokenParametersOuterClass$TokenParameters.C4138b bVar3 = this.f10189a;
            TokenParametersOuterClass$TokenParameters.NullableString c2 = C4175f.m13142c(this.f10191c.f10250b);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setUserAgent(c2);
            TokenParametersOuterClass$TokenParameters.NullableString c3 = C4175f.m13142c(this.f10191c.f10251c);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setSdkVersion(c3);
            TokenParametersOuterClass$TokenParameters.NullableString c4 = C4175f.m13142c(this.f10191c.f10252d);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setBundleID(c4);
            TokenParametersOuterClass$TokenParameters.NullableString c5 = C4175f.m13142c(this.f10191c.f10253e);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceModel(c5);
            TokenParametersOuterClass$TokenParameters.NullableString c6 = C4175f.m13142c(this.f10191c.f10254f);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setAppVersion(c6);
            TokenParametersOuterClass$TokenParameters.NullableString c7 = C4175f.m13142c(APSAnalytics.OS_NAME);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceOS(c7);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a = C4175f.m13139a(Build.VERSION.SDK_INT);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceApi(a);
            TokenParametersOuterClass$TokenParameters.NullableString c8 = C4175f.m13142c(Build.VERSION.RELEASE);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setOsVersion(c8);
            TokenParametersOuterClass$TokenParameters.NullableString c9 = C4175f.m13142c(this.f10191c.f10255g);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceLanguage(c9);
            TokenParametersOuterClass$TokenParameters.NullableString c10 = C4175f.m13142c(this.f10191c.f10256h);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setCountryCode(c10);
            TokenParametersOuterClass$TokenParameters.NullableString c11 = C4175f.m13142c(this.f10191c.f10257i);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setCarrierName(c11);
            TokenParametersOuterClass$TokenParameters.NullableString c12 = C4175f.m13142c(this.f10191c.f10258j);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setMobileCountryCode(c12);
            TokenParametersOuterClass$TokenParameters.NullableString c13 = C4175f.m13142c(this.f10191c.f10259k);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setMobileNetworkCode(c13);
            boolean c14 = C4257k.m13295c();
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDnt(c14);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a2 = C4175f.m13139a(this.f10191c.f10260l);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setTotalSpace(a2);
            Long l = this.f10191c.f10261m;
            TokenParametersOuterClass$TokenParameters.NullableSInt32.C4131a newBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
            if (l != null) {
                int intValue = l.intValue();
                newBuilder.mo25737c();
                ((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.f13487b).setData(intValue);
            }
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setOffsetFromGMT((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.mo25734a());
            TokenParametersOuterClass$TokenParameters.NullableString c15 = C4175f.m13142c(IAConfigManager.m13179e());
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setUserID(c15);
            IAConfigManager iAConfigManager = IAConfigManager.f10324J;
            C4212d dVar = iAConfigManager.f10329D;
            dVar.getClass();
            JSONArray jSONArray = null;
            if (C5292l.f14015a == null) {
                str = null;
            } else {
                str = dVar.f10394b;
            }
            TokenParametersOuterClass$TokenParameters.NullableString c16 = C4175f.m13142c(str);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setGdprString(c16);
            TokenParametersOuterClass$TokenParameters.NullableBool a3 = C4175f.m13137a(iAConfigManager.f10329D.mo24205a());
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setGdprConsent(a3);
            C4212d dVar2 = iAConfigManager.f10329D;
            dVar2.getClass();
            if (C5292l.f14015a == null) {
                str2 = null;
            } else {
                str2 = dVar2.f10397e;
            }
            TokenParametersOuterClass$TokenParameters.NullableString c17 = C4175f.m13142c(str2);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setCcpaString(c17);
            C4212d dVar3 = iAConfigManager.f10329D;
            dVar3.getClass();
            if (C5292l.f14015a == null) {
                bool = null;
            } else {
                bool = dVar3.f10398f;
            }
            TokenParametersOuterClass$TokenParameters.NullableBool a4 = C4175f.m13137a(bool);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setLgpdConsent(a4);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a5 = C4175f.m13139a(this.f10191c.f10262n);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceWidth(a5);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a6 = C4175f.m13139a(this.f10191c.f10263o);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setDeviceHeight(a6);
            TokenParametersOuterClass$TokenParameters.C4140d dVar4 = this.f10191c.f10264p;
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setFrameworkName(dVar4);
            TokenParametersOuterClass$TokenParameters.NullableString c18 = C4175f.m13142c(this.f10191c.f10265q);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setInputLanguages(c18);
            TokenParametersOuterClass$TokenParameters.NullableString c19 = C4175f.m13142c(this.f10191c.f10248L);
            bVar3.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13487b).setMediationType(c19);
            TokenParametersOuterClass$TokenParameters.C4138b bVar4 = this.f10189a;
            TokenParametersOuterClass$TokenParameters.NullableString c20 = C4175f.m13142c(this.f10191c.f10266r);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setNetwork(c20);
            TokenParametersOuterClass$TokenParameters.C4144h hVar = this.f10191c.f10267s;
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setSecureContent(hVar);
            TokenParametersOuterClass$TokenParameters.NullableBool a7 = C4175f.m13137a(this.f10191c.f10241E);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setBatteryCharging(a7);
            TokenParametersOuterClass$TokenParameters.NullableBool a8 = C4175f.m13137a(this.f10191c.f10268t);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setHeadsetPlugged(a8);
            TokenParametersOuterClass$TokenParameters.NullableBool a9 = C4175f.m13137a(this.f10191c.f10269u);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setBluetoothPlugged(a9);
            TokenParametersOuterClass$TokenParameters.NullableBool a10 = C4175f.m13137a(this.f10191c.f10270v);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setLowPowerMode(a10);
            boolean z = this.f10191c.f10271w;
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setDarkMode(z);
            TokenParametersOuterClass$TokenParameters.NullableBool a11 = C4175f.m13137a(this.f10191c.f10272x);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setAirplaneMode(a11);
            TokenParametersOuterClass$TokenParameters.NullableBool a12 = C4175f.m13137a(this.f10191c.f10273y);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setDndMode(a12);
            TokenParametersOuterClass$TokenParameters.NullableBool a13 = C4175f.m13137a(this.f10191c.f10274z);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setIsRingMuted(a13);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a14 = C4175f.m13139a(this.f10191c.f10237A);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setSessionDuration(a14);
            TokenParametersOuterClass$TokenParameters.NullableFloat a15 = C4175f.m13138a(this.f10190b.mo26327d());
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setLatitude(a15);
            TokenParametersOuterClass$TokenParameters.NullableFloat a16 = C4175f.m13138a(this.f10190b.mo26328e());
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setLongitude(a16);
            TokenParametersOuterClass$TokenParameters.NullableFloat a17 = C4175f.m13138a(this.f10190b.mo26326c());
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setHorAccuracy(a17);
            TokenParametersOuterClass$TokenParameters.NullableFloat a18 = C4175f.m13138a(this.f10190b.mo26330g());
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setVerAccuracy(a18);
            TokenParametersOuterClass$TokenParameters.NullableFloat a19 = C4175f.m13138a(this.f10191c.f10238B);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setTimeAccuracy(a19);
            String str3 = this.f10191c.f10242F;
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4133a newBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (!TextUtils.isEmpty(str3)) {
                newBuilder2.mo23990a(Integer.parseInt(str3));
            }
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setBatteryLevel((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.mo25734a());
            Long l2 = this.f10191c.f10239C;
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4133a newBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (l2 != null) {
                newBuilder3.mo23990a(l2.intValue());
            }
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setFreeSpace((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder3.mo25734a());
            TokenParametersOuterClass$TokenParameters.NullableBool a20 = C4175f.m13137a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f10358x.mo24209a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setPriorSkip(a20);
            TokenParametersOuterClass$TokenParameters.NullableString c21 = C4175f.m13142c(this.f10191c.f10243G);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setKeywords(c21);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a21 = C4175f.m13139a(this.f10191c.f10244H);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setUserAge(a21);
            InneractiveUserConfig.Gender gender = this.f10191c.f10245I;
            if (gender == InneractiveUserConfig.Gender.FEMALE) {
                lVar = TokenParametersOuterClass$TokenParameters.C4148l.FEMALE;
            } else if (gender == InneractiveUserConfig.Gender.MALE) {
                lVar = TokenParametersOuterClass$TokenParameters.C4148l.MALE;
            } else {
                lVar = TokenParametersOuterClass$TokenParameters.C4148l.UNKNOWN;
            }
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setUserGender(lVar);
            TokenParametersOuterClass$TokenParameters.NullableString c22 = C4175f.m13142c(this.f10191c.f10247K);
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setZipCode(c22);
            boolean z2 = this.f10191c.f10246J;
            bVar4.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13487b).setMuteAudio(z2);
            if (C4257k.m13294b()) {
                TokenParametersOuterClass$TokenParameters.C4138b bVar5 = this.f10189a;
                TokenParametersOuterClass$TokenParameters.NullableString c23 = C4175f.m13142c(this.f10191c.f10240D);
                bVar5.mo25737c();
                ((TokenParametersOuterClass$TokenParameters) bVar5.f13487b).setAmazonId(c23);
            } else {
                TokenParametersOuterClass$TokenParameters.C4138b bVar6 = this.f10189a;
                TokenParametersOuterClass$TokenParameters.NullableString c24 = C4175f.m13142c(this.f10191c.f10240D);
                bVar6.mo25737c();
                ((TokenParametersOuterClass$TokenParameters) bVar6.f13487b).setAaid(c24);
            }
            for (UnitDisplayType unitDisplayType : UnitDisplayType.values()) {
                if (!unitDisplayType.isDeprecated()) {
                    TokenParametersOuterClass$TokenParameters.C4147k a22 = C4175f.m13140a(unitDisplayType);
                    HashMap<String, Integer> hashMap = C5240a.f13901a;
                    IAConfigManager iAConfigManager2 = IAConfigManager.f10324J;
                    String a23 = iAConfigManager2.f10358x.mo24209a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                    if (!TextUtils.isEmpty(a23) && a23.contains(",")) {
                        a23 = a23.split(",")[0];
                    }
                    if (!TextUtils.isEmpty(a23)) {
                        TokenParametersOuterClass$TokenParameters.C4138b bVar7 = this.f10189a;
                        TokenParametersOuterClass$TokenParameters.LastAdomain.C4127a newBuilder4 = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                        newBuilder4.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.f13487b).setAdomain(a23);
                        newBuilder4.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.f13487b).setType(a22);
                        bVar7.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters) bVar7.f13487b).addLastAdomains((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.mo25734a());
                    }
                    String a24 = iAConfigManager2.f10358x.mo24209a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                    if (!TextUtils.isEmpty(a24)) {
                        TokenParametersOuterClass$TokenParameters.C4138b bVar8 = this.f10189a;
                        TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.C4128a newBuilder5 = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                        newBuilder5.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.f13487b).setLastBundle(a24);
                        newBuilder5.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.f13487b).setType(a22);
                        bVar8.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters) bVar8.f13487b).addLastAdvertisedBundles((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.mo25734a());
                    }
                    if (TextUtils.equals(iAConfigManager2.f10358x.mo24209a(unitDisplayType, "LAST_CLICKED"), "1")) {
                        TokenParametersOuterClass$TokenParameters.C4138b bVar9 = this.f10189a;
                        TokenParametersOuterClass$TokenParameters.C4147k a25 = C4175f.m13140a(unitDisplayType);
                        bVar9.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters) bVar9.f13487b).addPriorClicks(a25);
                    }
                    mo24016a("display", unitDisplayType, a22);
                    if (unitDisplayType.isFullscreenUnit()) {
                        mo24016a("video", unitDisplayType, a22);
                        String a26 = iAConfigManager2.f10358x.mo24209a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                        if (!TextUtils.isEmpty(a26)) {
                            TokenParametersOuterClass$TokenParameters.C4138b bVar10 = this.f10189a;
                            TokenParametersOuterClass$TokenParameters.PriorVideoClickType.C4134a newBuilder6 = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                            a26.getClass();
                            char c25 = 65535;
                            switch (a26.hashCode()) {
                                case 49:
                                    if (a26.equals("1")) {
                                        c25 = 0;
                                        break;
                                    }
                                    break;
                                case 50:
                                    if (a26.equals("2")) {
                                        c25 = 1;
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (a26.equals("3")) {
                                        c25 = 2;
                                        break;
                                    }
                                    break;
                            }
                            if (c25 == 0) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4150n.CTABUTTON;
                            } else if (c25 == 1) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4150n.COMPANION;
                            } else if (c25 != 2) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4150n.NOCLICK;
                            } else {
                                nVar = TokenParametersOuterClass$TokenParameters.C4150n.VIDEOVIEW;
                            }
                            newBuilder6.mo25737c();
                            ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.f13487b).setClickType(nVar);
                            newBuilder6.mo25737c();
                            ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.f13487b).setType(a22);
                            bVar10.mo25737c();
                            ((TokenParametersOuterClass$TokenParameters) bVar10.f13487b).addPriorClickTypes((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.mo25734a());
                        }
                    }
                }
            }
            C5242b bVar11 = this.f10190b;
            bVar11.getClass();
            C4251s sVar = new C4251s();
            bVar11.f13906a = sVar;
            sVar.mo24267a("");
            C4251s sVar2 = this.f10190b.f13906a;
            if (sVar2 != null) {
                jSONArray = sVar2.mo24269d();
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        TokenParametersOuterClass$TokenParameters.Experiment.C4126a newBuilder7 = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                        String optString = optJSONObject.optString("id");
                        newBuilder7.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.f13487b).setIdentifier(optString);
                        String optString2 = optJSONObject.optString("v");
                        newBuilder7.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.f13487b).setVariant(optString2);
                        TokenParametersOuterClass$TokenParameters.C4138b bVar12 = this.f10189a;
                        bVar12.mo25737c();
                        ((TokenParametersOuterClass$TokenParameters) bVar12.f13487b).addAbExperiments((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.mo25734a());
                    }
                }
            }
            TokenParametersOuterClass$TokenParameters.C4138b bVar13 = this.f10189a;
            int i2 = C4215e.f10405a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.number");
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4133a newBuilder8 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (!TextUtils.isEmpty(property)) {
                newBuilder8.mo23990a(Integer.parseInt(property));
            }
            bVar13.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar13.f13487b).setPortal((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder8.mo25734a());
            TokenParametersOuterClass$TokenParameters.C4138b bVar14 = this.f10189a;
            TokenParametersOuterClass$TokenParameters.NullableString c26 = C4175f.m13142c(System.getProperty("ia.testEnvironmentConfiguration.response"));
            bVar14.mo25737c();
            ((TokenParametersOuterClass$TokenParameters) bVar14.f13487b).setMockResponseId(c26);
            this.f10194f.set(Base64.encodeToString(((TokenParametersOuterClass$TokenParameters) this.f10189a.mo25734a()).toByteArray(), 2));
            this.f10195g.set(false);
        }
    }

    /* renamed from: b */
    public void mo24017b() {
        C5299n.m16520a(new C4153b());
    }

    /* renamed from: c */
    public final void mo24018c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C5292l.f14015a.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            connectivityManager.registerDefaultNetworkCallback(new C4170b(this));
        }
        C4174e eVar = new C4174e(this);
        this.f10192d = eVar;
        C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i >= 23) {
            C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        if (i >= 21) {
            C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        }
        if (i >= 17) {
            C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        if (C5292l.m16510b("android.permission.BLUETOOTH")) {
            C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            C5292l.f14015a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24016a(java.lang.String r9, com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4147k r11) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.d0 r0 = r0.f10358x
            com.fyber.inneractive.sdk.cache.session.d r0 = r0.f10400a
            if (r0 == 0) goto L_0x00e7
            java.lang.String r10 = r10.value()
            java.util.HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, com.fyber.inneractive.sdk.cache.session.h> r1 = r0.f10298b
            com.fyber.inneractive.sdk.cache.session.enums.b r10 = com.fyber.inneractive.sdk.cache.session.enums.C4193b.m13172a(r10, r9)
            java.lang.Object r10 = r1.get(r10)
            com.fyber.inneractive.sdk.cache.session.h r10 = (com.fyber.inneractive.sdk.cache.session.C4198h) r10
            r1 = 0
            if (r10 == 0) goto L_0x002e
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r10)
            com.fyber.inneractive.sdk.cache.session.g r4 = new com.fyber.inneractive.sdk.cache.session.g
            r4.<init>(r10)
            java.util.Collections.sort(r3, r4)
            r2.<init>(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r10 = r0.mo24176a()
            if (r10 <= 0) goto L_0x00cf
            if (r2 == 0) goto L_0x00cf
            int r0 = r2.size()
            if (r0 < r10) goto L_0x00cf
            java.lang.String r0 = "video"
            boolean r1 = r9.equals(r0)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "display"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0050
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4146j.UNITCONTENTTYPEUNKNOWN
            goto L_0x0055
        L_0x0050:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4146j.DISPLAY
            goto L_0x0055
        L_0x0053:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4146j.f10162d
        L_0x0055:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession$a r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.newBuilder()
            r3.mo25737c()
            MessageType r4 = r3.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r4
            r4.setSubType(r1)
            r1 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r4 = r2.next()
            com.fyber.inneractive.sdk.cache.session.e r4 = (com.fyber.inneractive.sdk.cache.session.C4191e) r4
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData$a r5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.newBuilder()
            int r6 = r4.f10303b
            r5.mo25737c()
            MessageType r7 = r5.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setClicks(r6)
            int r6 = r4.f10302a
            r5.mo25737c()
            MessageType r7 = r5.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setImpressions(r6)
            boolean r6 = r9.equals(r0)
            if (r6 != 0) goto L_0x009e
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k r6 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4147k.REWARDED
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00aa
        L_0x009e:
            int r4 = r4.f10304c
            r5.mo25737c()
            MessageType r6 = r5.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r6 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r6
            r6.setCompletions(r4)
        L_0x00aa:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r4 = r5.mo25734a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r4
            r3.mo25737c()
            MessageType r5 = r3.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r5
            r5.addSessionDataItems(r4)
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0068
        L_0x00be:
            r3.mo25737c()
            MessageType r9 = r3.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r9
            r9.setType(r11)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r9 = r3.mo25734a()
            r1 = r9
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r1 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r1
        L_0x00cf:
            if (r1 == 0) goto L_0x00e7
            java.util.List r9 = r1.getSessionDataItemsList()
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x00e7
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r9 = r8.f10189a
            r9.mo25737c()
            MessageType r9 = r9.f13487b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r9
            r9.addUserSessions(r1)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C4151a.mo24016a(java.lang.String, com.fyber.inneractive.sdk.config.enums.UnitDisplayType, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k):void");
    }
}
