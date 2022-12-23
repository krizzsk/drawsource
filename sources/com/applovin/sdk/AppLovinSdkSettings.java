package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f4511a;

    /* renamed from: b */
    private boolean f4512b;

    /* renamed from: c */
    private boolean f4513c;

    /* renamed from: d */
    private boolean f4514d;

    /* renamed from: e */
    private boolean f4515e;

    /* renamed from: f */
    private boolean f4516f = true;

    /* renamed from: g */
    private String f4517g;

    /* renamed from: h */
    private List<String> f4518h = Collections.emptyList();

    /* renamed from: i */
    private List<String> f4519i = Collections.emptyList();

    /* renamed from: j */
    private final Map<String, String> f4520j = new HashMap();

    /* renamed from: k */
    private final Object f4521k = new Object();

    /* renamed from: l */
    private C1969m f4522l;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    public AppLovinSdkSettings(Context context) {
        this.f4511a = Utils.isVerboseLoggingEnabled(context);
        this.f4513c = true;
        this.f4514d = true;
        this.f4515e = true;
    }

    /* access modifiers changed from: protected */
    public void attachAppLovinSdk(C1969m mVar) {
        this.f4522l = mVar;
        if (StringUtils.isValidString(this.f4517g)) {
            mVar.mo14518J().mo13805a(true);
            mVar.mo14518J().mo13803a(this.f4517g);
            this.f4517g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        HashMap hashMap;
        synchronized (this.f4521k) {
            hashMap = new HashMap(this.f4520j);
        }
        return hashMap;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f4519i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f4518h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f4513c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f4514d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f4515e;
    }

    public boolean isMuted() {
        return this.f4512b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f4511a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.f4513c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        this.f4514d = z;
    }

    public void setExtraParameter(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String trim = str2 != null ? str2.trim() : null;
            synchronized (this.f4521k) {
                this.f4520j.put(str, trim);
            }
            if (!"test_mode_network".equalsIgnoreCase(str)) {
                return;
            }
            if (this.f4522l == null) {
                this.f4517g = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f4522l.mo14518J().mo13805a(true);
                this.f4522l.mo14518J().mo13803a(trim);
            } else {
                this.f4522l.mo14518J().mo13805a(false);
                this.f4522l.mo14518J().mo13803a((String) null);
            }
        } else if (C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else if (C2102v.m5104a()) {
                        C2102v.m5110i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f4519i = arrayList;
            return;
        }
        this.f4519i = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z) {
        this.f4515e = z;
    }

    public void setMuted(boolean z) {
        this.f4512b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        this.f4516f = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next != null && next.length() == 36) {
                    arrayList.add(next);
                } else if (C2102v.m5104a()) {
                    C2102v.m5110i("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f4518h = arrayList;
            return;
        }
        this.f4518h = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z) {
        if (Utils.isVerboseLoggingConfigured()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            }
            if (Utils.isVerboseLoggingEnabled((Context) null) != z) {
                C2102v.m5110i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f4511a = z;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f4516f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f4511a + ", muted=" + this.f4512b + ", testDeviceAdvertisingIds=" + this.f4518h.toString() + ", initializationAdUnitIds=" + this.f4519i.toString() + ", creativeDebuggerEnabled=" + this.f4513c + ", exceptionHandlerEnabled=" + this.f4514d + ", locationCollectionEnabled=" + this.f4515e + '}';
    }
}
