package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f145a = "";

    /* renamed from: b */
    private C0832f1 f146b = new C0832f1();

    /* renamed from: c */
    private AdColonyUserMetadata f147c;

    public AdColonyAppOptions() {
        setOriginStore(Constants.REFERRER_API_GOOGLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo10381a(String str) {
        if (str == null) {
            return this;
        }
        this.f145a = str;
        C0773c0.m376a(this.f146b, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo10383b() {
        return this.f146b;
    }

    public int getAppOrientation() {
        return C0773c0.m363a(this.f146b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C0773c0.m393h(this.f146b, TapjoyConstants.TJC_APP_VERSION_NAME);
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C0773c0.m393h(this.f146b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C0773c0.m382b(this.f146b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return C0773c0.m382b(this.f146b, "is_child_directed");
    }

    public boolean getKeepScreenOn() {
        return C0773c0.m382b(this.f146b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "name", C0773c0.m393h(this.f146b, "mediation_network"));
        C0773c0.m376a(b, "version", C0773c0.m393h(this.f146b, "mediation_network_version"));
        return b.mo10780a();
    }

    public boolean getMultiWindowEnabled() {
        return C0773c0.m382b(this.f146b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return C0773c0.m392g(this.f146b, str);
    }

    public String getOriginStore() {
        return C0773c0.m393h(this.f146b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "name", C0773c0.m393h(this.f146b, TapjoyConstants.TJC_PLUGIN));
        C0773c0.m376a(b, "version", C0773c0.m393h(this.f146b, "plugin_version"));
        return b.mo10780a();
    }

    public String getPrivacyConsentString(String str) {
        C0832f1 f1Var = this.f146b;
        return C0773c0.m393h(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        C0832f1 f1Var = this.f146b;
        return C0773c0.m382b(f1Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C0773c0.m363a(this.f146b, TJAdUnitConstants.String.ORIENTATION, -1);
    }

    public boolean getTestModeEnabled() {
        return C0773c0.m382b(this.f146b, "test_mode");
    }

    public String getUserID() {
        return C0773c0.m393h(this.f146b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f147c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        C0832f1 f1Var = this.f146b;
        return f1Var.mo10784a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption(TapjoyConstants.TJC_APP_VERSION_NAME, str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        C0773c0.m376a(this.f146b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z) {
        setOption("is_child_directed", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C0773c0.m385b(this.f146b, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        C0773c0.m376a(this.f146b, "mediation_network", str);
        C0773c0.m376a(this.f146b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C0773c0.m385b(this.f146b, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        C0773c0.m385b(this.f146b, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        C0773c0.m376a(this.f146b, TapjoyConstants.TJC_PLUGIN, str);
        C0773c0.m376a(this.f146b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        C0832f1 f1Var = this.f146b;
        C0773c0.m376a(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption(TJAdUnitConstants.String.ORIENTATION, (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C0773c0.m385b(this.f146b, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f147c = adColonyUserMetadata;
        C0773c0.m375a(this.f146b, "user_metadata", adColonyUserMetadata.f191b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10384b(Context context) {
        m121a(context);
        Boolean g = this.f146b.mo10800g("use_forced_controller");
        if (g != null) {
            C0899l.f618H = g.booleanValue();
        }
        if (this.f146b.mo10799f("use_staging_launch_server")) {
            C0866k.f534Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C1047z0.m1253b(context, "IABUSPrivacy_String");
        String b2 = C1047z0.m1253b(context, CmpApiConstants.IABTCF_TC_STRING);
        int a = C1047z0.m1228a(context, CmpApiConstants.IABTCF_GDPR_APPLIES);
        if (b != null) {
            C0773c0.m376a(this.f146b, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C0773c0.m376a(this.f146b, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            C0832f1 f1Var = this.f146b;
            if (a != 1) {
                z = false;
            }
            C0773c0.m385b(f1Var, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        C0773c0.m373a(this.f146b, str, d);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10382a() {
        return this.f145a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        C0773c0.m376a(this.f146b, str, str2);
        return this;
    }

    /* renamed from: a */
    private void m121a(Context context) {
        setOption("bundle_id", C1047z0.m1267d(context));
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", "unknown");
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(CertificateUtil.DELIMITER);
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals(TapjoyConstants.TJC_STORE)) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }
}
