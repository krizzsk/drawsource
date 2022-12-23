package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;

public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* renamed from: a */
    private static final List<C0832f1> f151a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    static void m128a(C0832f1 f1Var) {
        List<C0832f1> list = f151a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(f1Var);
            }
        }
    }

    /* renamed from: b */
    static void m131b() {
        C0866k b = C0723a.m193b();
        if (!b.mo10913v().equals("") && b.mo10871I()) {
            List<C0832f1> list = f151a;
            synchronized (list) {
                for (C0832f1 b2 : list) {
                    m132b(b2);
                }
                f151a.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m133c(C0832f1 f1Var) {
        C0832f1 f = C0773c0.m391f(f1Var, "payload");
        if (C0899l.f618H) {
            C0773c0.m376a(f, TapjoyConstants.TJC_API_KEY, "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            C0773c0.m376a(f, TapjoyConstants.TJC_API_KEY, C0723a.m193b().mo10913v());
        }
        try {
            f1Var.mo10811r("payload");
            f1Var.mo10778a("payload", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m134d(C0832f1 f1Var) {
        C0773c0.m376a(f1Var, TapjoyConstants.TJC_DEVICE_TIMEZONE, TimeZone.getDefault().getID());
        C0773c0.m376a(f1Var, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    public static void logAchievementUnlocked(String str) {
        if (!m130a(str, "logAchievementUnlocked")) {
            HashMap hashMap = new HashMap();
            hashMap.put("description", str);
            logEvent("achievement_unlocked", hashMap);
        }
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent(FirebaseAnalytics.Event.AD_IMPRESSION);
    }

    public static void logAddToCart(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent(FirebaseAnalytics.Event.ADD_TO_CART, hashMap);
    }

    public static void logAddToWishlist(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent(FirebaseAnalytics.Event.ADD_TO_WISHLIST, hashMap);
    }

    public static void logAppOpen() {
        logEvent(FirebaseAnalytics.Event.APP_OPEN);
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("content_id", str);
        hashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, str2);
        logEvent("content_view", hashMap);
    }

    public static void logCreditsSpent(String str, Integer num, Double d, String str2) {
        if (str2 == null || str2.length() == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put(FirebaseAnalytics.Param.QUANTITY, String.valueOf(num));
            hashMap.put("value", String.valueOf(d));
            hashMap.put("currency_code", str2);
            logEvent("credits_spent", hashMap);
            return;
        }
        new C0826e0.C0827a().mo10746a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo10747a(C0826e0.f461h);
    }

    public static void logCustomEvent(String str, String str2) {
        if (!m130a(str2, "logCustomEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("description", str2);
            logEvent("custom_event", hashMap);
        }
    }

    public static void logEvent(String str) {
        logEvent(str, (HashMap<String, String>) null);
    }

    public static void logInvite() {
        logEvent(AppLovinEventTypes.USER_SENT_INVITATION);
    }

    public static void logLevelAchieved(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logLogin(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent("login", hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (!m130a(str2, "logRegistrationCompleted")) {
            HashMap hashMap = new HashMap();
            hashMap.put("method", str);
            hashMap.put("description", str2);
            logEvent("registration_completed", hashMap);
        }
    }

    public static void logReservation() {
        logEvent(AppLovinEventTypes.USER_CREATED_RESERVATION);
    }

    public static void logSearch(String str) {
        if (str == null || str.length() <= 512) {
            HashMap hashMap = new HashMap();
            hashMap.put("search_string", str);
            logEvent("search", hashMap);
            return;
        }
        new C0826e0.C0827a().mo10746a("logSearch searchString cannot exceed 512 characters. Event will ").mo10746a("not be sent.").mo10747a(C0826e0.f461h);
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (!m130a(str2, "logSocialSharingEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("network", str);
            hashMap.put("description", str2);
            logEvent("social_sharing_event", hashMap);
        }
    }

    public static void logTransaction(String str, Integer num, Double d, String str2, String str3, String str4, String str5) {
        if (!m130a(str5, "logTransaction")) {
            if (str2 == null || str2.length() == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", str);
                hashMap.put(FirebaseAnalytics.Param.QUANTITY, String.valueOf(num));
                hashMap.put("price", String.valueOf(d));
                hashMap.put("currency_code", str2);
                hashMap.put("receipt", str3);
                hashMap.put(TapjoyConstants.TJC_STORE, str4);
                hashMap.put("description", str5);
                logEvent("transaction", hashMap);
                return;
            }
            new C0826e0.C0827a().mo10746a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo10747a(C0826e0.f461h);
        }
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logEvent(String str, HashMap<String, String> hashMap) {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, TJAdUnitConstants.PARAM_PLACEMENT_NAME, str);
        C0832f1 b2 = C0773c0.m379b();
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (next.getValue() != null && !((String) next.getValue()).equals("null")) {
                    C0773c0.m376a(b2, (String) next.getKey(), (String) next.getValue());
                }
            }
        }
        m134d(b2);
        C0773c0.m375a(b, "payload", b2);
        m132b(b);
    }

    /* renamed from: a */
    static boolean m129a() {
        boolean z;
        List<C0832f1> list = f151a;
        synchronized (list) {
            z = list.size() != 0;
        }
        return z;
    }

    /* renamed from: b */
    private static void m132b(C0832f1 f1Var) {
        C0866k b = C0723a.m193b();
        if (b.mo10913v().equals("") || !b.mo10871I()) {
            m128a(f1Var);
            return;
        }
        m133c(f1Var);
        new C0850h0("AdColony.log_event", 1, f1Var).mo10838c();
    }

    /* renamed from: a */
    private static boolean m130a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new C0826e0.C0827a().mo10746a("Description of event ").mo10746a(str2).mo10746a(" must be less").mo10746a(" than 512 characters").mo10747a(C0826e0.f461h);
        return true;
    }
}
