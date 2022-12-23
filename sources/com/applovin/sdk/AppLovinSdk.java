package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2045d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap();
    private static final Object sdkInstancesLock = new Object();
    public final C1969m coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    private static class C2269a extends AppLovinSdkSettings {
        C2269a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C1969m mVar) {
        this.coreSdk = mVar;
    }

    /* renamed from: a */
    public static List<AppLovinSdk> m5176a() {
        return new ArrayList(sdkInstances.values());
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new C2269a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C2045d.m4928a(context).mo14890a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        } else if (context != null) {
            synchronized (sdkInstancesLock) {
                if (sdkInstances.containsKey(str)) {
                    AppLovinSdk appLovinSdk = sdkInstances.get(str);
                    return appLovinSdk;
                }
                if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                    if (C2102v.m5104a()) {
                        C2102v.m5110i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                    }
                    if (!sdkInstances.isEmpty()) {
                        AppLovinSdk next = sdkInstances.values().iterator().next();
                        return next;
                    }
                    str = str.replace(File.separator, "");
                }
                C1969m mVar = new C1969m();
                mVar.mo14546a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(mVar);
                mVar.mo14544a(appLovinSdk2);
                appLovinSdkSettings.attachAppLovinSdk(mVar);
                sdkInstances.put(str, appLovinSdk2);
                return appLovinSdk2;
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private static String getVersion() {
        return "11.4.4";
    }

    private static int getVersionCode() {
        return 11040499;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance = getInstance(context);
            if (instance != null) {
                instance.initializeSdk(sdkInitializationListener);
            } else if (C2102v.m5104a()) {
                C2102v.m5110i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk next : sdkInstances.values()) {
                next.coreSdk.mo14568b();
                next.coreSdk.mo14579i();
                if (bool != null) {
                    if (C2102v.m5104a()) {
                        C2102v A = next.coreSdk.mo14509A();
                        A.mo15014c(TAG, "Toggled 'huc' to " + bool);
                    }
                    next.getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    if (C2102v.m5104a()) {
                        C2102v A2 = next.coreSdk.mo14509A();
                        A2.mo15014c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    next.getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    if (C2102v.m5104a()) {
                        C2102v A3 = next.coreSdk.mo14509A();
                        A3.mo15014c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    next.getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.mo14592u();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a = C1655c.m3371a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a.length());
        for (int i = 0; i < a.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.mo14589s();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.mo14594w();
    }

    public String getMediationProvider() {
        return this.coreSdk.mo14590t();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.mo14531X();
    }

    public String getSdkKey() {
        return this.coreSdk.mo14597z();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.mo14586p();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.mo14588r();
    }

    public String getUserIdentifier() {
        return this.coreSdk.mo14583m();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.mo14587q();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.mo14595x();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.mo14596y();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.mo14543a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.mo14574d();
    }

    public boolean isInitialized() {
        return this.coreSdk.mo14574d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.mo14572c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.mo14545a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.mo14570b(str);
    }

    public void showMediationDebugger() {
        this.coreSdk.mo14582l();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.mo14523P() + '}';
    }
}
