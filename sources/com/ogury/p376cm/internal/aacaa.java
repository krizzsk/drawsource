package com.ogury.p376cm.internal;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Base64;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.OguryChoiceManager;
import com.ogury.p376cm.OguryCmConfig;
import com.ogury.p376cm.internal.bacab;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.aacaa */
public final class aacaa {

    /* renamed from: a */
    public static final aaaaa f24273a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.aacaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static String m27769a(Integer[] numArr) {
            bbabc.m28052b(numArr, "receiver$0");
            return bacab.aaaaa.m28026a(numArr, (CharSequence) null, "[", "]", 0, (CharSequence) null, (bbaab) null, 57, (Object) null);
        }

        /* renamed from: a */
        public static List<Object> m27770a(JSONArray jSONArray) {
            bbabc.m28052b(jSONArray, "receiver$0");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.get(i));
            }
            return arrayList;
        }

        /* renamed from: a */
        public static JSONObject m27771a(String str) {
            bbabc.m28052b(str, "receiver$0");
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static void m27772a(Context context, OguryCmConfig oguryCmConfig) {
            bbabc.m28052b(context, "context");
            bbabc.m28052b(oguryCmConfig, "oguryCmConfig");
            if (oguryCmConfig.getTcfVersion() == 2) {
                abbcb abbcb = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);
                if (context.getSharedPreferences("cacheConsent", 0).contains("iabString")) {
                    Context applicationContext = context.getApplicationContext();
                    bbabc.m28049a((Object) applicationContext, "context.applicationContext");
                    PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().clear().apply();
                    applicationContext.getSharedPreferences("cacheConsent", 0).edit().clear().apply();
                    applicationContext.getSharedPreferences("cacheConsentMain", 0).edit().clear().apply();
                    abbba.f24320a.mo63839a(abbcb);
                    OguryChoiceManager.INSTANCE.resetClientConsentImpl$consent_manager_prodRelease();
                    return;
                }
                return;
            }
            OguryIntegrationLogger.m28106e("[Consent][setup] Failed to set up versions (TCF version " + oguryCmConfig.getTcfVersion() + " is not allowed)");
            throw new IllegalStateException("Bad TCF version used! Please use one of the declared ones in OguryChoiceManager class.");
        }

        /* renamed from: b */
        public static JSONArray m27773b(String str) {
            bbabc.m28052b(str, "receiver$0");
            try {
                return new JSONArray(str);
            } catch (Exception unused) {
                return new JSONArray();
            }
        }

        /* renamed from: c */
        public static String m27774c(String str) {
            bbabc.m28052b(str, "receiver$0");
            byte[] bytes = str.getBytes(bbbcb.f24546a);
            bbabc.m28049a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 11);
            bbabc.m28049a((Object) encodeToString, "Base64.encodeToString(by…ADDING + Base64.URL_SAFE)");
            return encodeToString;
        }

        /* renamed from: d */
        public static OguryChoiceManager.Answer m27775d(String str) {
            bbabc.m28052b(str, "receiver$0");
            return bbabc.m28051a((Object) str, (Object) OguryChoiceManager.Answer.FULL_APPROVAL.toString()) ? OguryChoiceManager.Answer.FULL_APPROVAL : bbabc.m28051a((Object) str, (Object) OguryChoiceManager.Answer.PARTIAL_APPROVAL.toString()) ? OguryChoiceManager.Answer.PARTIAL_APPROVAL : bbabc.m28051a((Object) str, (Object) OguryChoiceManager.Answer.REFUSAL.toString()) ? OguryChoiceManager.Answer.REFUSAL : bbabc.m28051a((Object) str, (Object) "SALE_DENIED") ? OguryChoiceManager.Answer.CCPAF_SALE_DENIED : bbabc.m28051a((Object) str, (Object) "SALE_ALLOWED") ? OguryChoiceManager.Answer.CCPAF_SALE_ALLOWED : OguryChoiceManager.Answer.NO_ANSWER;
        }

        /* renamed from: e */
        public static String m27776e(String str) {
            bbabc.m28052b(str, "receiver$0");
            return bbcbc.m28085a(str, "-", " ", false, 4, (Object) null);
        }
    }
}
