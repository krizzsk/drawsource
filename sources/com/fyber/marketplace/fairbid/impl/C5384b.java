package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4257k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.serverapi.C5240a;
import com.fyber.inneractive.sdk.serverapi.C5242b;
import com.fyber.inneractive.sdk.serverapi.C5243c;
import com.fyber.inneractive.sdk.util.C5291k0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5332z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.b */
public class C5384b implements MarketplaceAuctionParameters {

    /* renamed from: a */
    public HashMap<String, C4251s> f14217a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, C4306g> f14218b = new HashMap<>();

    /* renamed from: c */
    public final C5243c f14219c;

    /* renamed from: d */
    public String f14220d;

    /* renamed from: com.fyber.marketplace.fairbid.impl.b$a */
    public enum C5385a {
        KEY_AVAILABLE_DISK_SPACE("available_disk", "dsk_a", Integer.class),
        KEY_HEADSET("headset", "headset", Boolean.class),
        KEY_BATTERY_CONNECTED("battery_charging", "btry_c", Boolean.class),
        KEY_BATTERY_LEVEL("battery_level", "btry_l", Integer.class),
        KEY_BLUETOOTH_CONNECTED("bluetooth_connected", "bt_con", Boolean.class),
        KEY_ANDROID_LEVEL("d_api", "d_api", Integer.class),
        KEY_AIRPLANE_MODE("apnm", "apnm", Boolean.class),
        KEY_DO_NOT_DISTURB("dnd", "dnd", Boolean.class),
        KEY_IS_MUTED("is_muted", "is_muted", Boolean.class),
        KEY_TOTAL_DISK_SPACE(TapjoyConstants.TJC_TOTAL_DISK_SPACE, "dsk_t", Integer.class),
        KEY_TIME_OF_DAY("time_difference", "tod", Integer.class),
        KEY_LOW_POWER_MODE("low_power_mode", "low_power_mode", Boolean.class),
        KEY_DARK_MODE("dark_mode", "dark_mode", Boolean.class),
        KEY_LAST_DOMAIN_SHOWED("last_adomain", "ldomain", String.class),
        KEY_LAST_BUNDLE_SHOWED("last_bundle", "lbundle", String.class);
        

        /* renamed from: a */
        public String f14237a;

        /* renamed from: b */
        public String f14238b;

        /* renamed from: c */
        public Object f14239c;

        /* access modifiers changed from: public */
        C5385a(String str, String str2, Object obj) {
            this.f14237a = str;
            this.f14238b = str2;
            this.f14239c = obj;
        }
    }

    public C5384b(C5243c cVar) {
        this.f14219c = cVar;
    }

    /* renamed from: a */
    public final JSONObject mo26589a(HashMap<String, String> hashMap, C5385a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (C5385a aVar : aVarArr) {
            String str = hashMap.get(aVar.f14238b);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Object a = m16645a(str, aVar.f14239c);
                    if (a != null) {
                        jSONObject.put(aVar.f14237a, a);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public String getAdvertisingId() {
        if (C4257k.m13294b()) {
            return null;
        }
        ((C5242b) this.f14219c).getClass();
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        return TextUtils.isEmpty(property) ? C4257k.m13293a() : property;
    }

    public String getAmazonAdvertisingId() {
        if (!C4257k.m13294b()) {
            return null;
        }
        ((C5242b) this.f14219c).getClass();
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        return TextUtils.isEmpty(property) ? C4257k.m13293a() : property;
    }

    public String getAppVersion() {
        return ((C5242b) this.f14219c).mo26334k();
    }

    public String getBundleId() {
        ((C5242b) this.f14219c).getClass();
        return C5292l.f14015a.getPackageName();
    }

    public String getCarrier() {
        return ((C5242b) this.f14219c).mo26321a();
    }

    public String getDeviceModel() {
        return ((C5242b) this.f14219c).mo26325b();
    }

    public C4251s getFeatureProvider(String str) {
        return this.f14217a.get(str);
    }

    public int getHeight() {
        ((C5242b) this.f14219c).getClass();
        return C5292l.m16512c(C5292l.m16514d());
    }

    public String getHorizontalAccuracy() {
        return ((C5242b) this.f14219c).mo26326c();
    }

    public List<String> getInputLanguages() {
        ((C5242b) this.f14219c).getClass();
        return IAConfigManager.f10324J.f10351q;
    }

    public String getLanguage() {
        ((C5242b) this.f14219c).getClass();
        return IAConfigManager.f10324J.f10350p;
    }

    public String getLatitudeLongitude() {
        String d = ((C5242b) this.f14219c).mo26327d();
        String e = ((C5242b) this.f14219c).mo26328e();
        if (d != null) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(",");
        sb.append(e);
        return sb.toString() != null ? e : "";
    }

    public JSONObject getMarketplaceEntry() {
        HashMap hashMap = new HashMap();
        ((C5242b) this.f14219c).mo26324a(hashMap, this.f14220d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_params", mo26589a((HashMap<String, String>) hashMap, C5385a.KEY_TIME_OF_DAY));
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("device_params", mo26589a((HashMap<String, String>) hashMap, C5385a.KEY_AVAILABLE_DISK_SPACE, C5385a.KEY_DO_NOT_DISTURB, C5385a.KEY_AIRPLANE_MODE, C5385a.KEY_ANDROID_LEVEL, C5385a.KEY_IS_MUTED, C5385a.KEY_HEADSET, C5385a.KEY_BATTERY_CONNECTED, C5385a.KEY_BATTERY_LEVEL, C5385a.KEY_BLUETOOTH_CONNECTED, C5385a.KEY_LOW_POWER_MODE, C5385a.KEY_DARK_MODE, C5385a.KEY_TOTAL_DISK_SPACE));
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("content_params", mo26589a((HashMap<String, String>) hashMap, C5385a.KEY_LAST_BUNDLE_SHOWED, C5385a.KEY_LAST_DOMAIN_SHOWED));
        } catch (Exception unused3) {
        }
        C4251s sVar = new C4251s();
        this.f14217a.put(this.f14220d, sVar);
        sVar.mo24267a(this.f14220d);
        JSONArray d = sVar.mo24269d();
        if (d != null && d.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("experiments", d);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (Exception unused5) {
            }
        }
        C5243c cVar = this.f14219c;
        String str = this.f14220d;
        ((C5242b) cVar).getClass();
        C4306g a = IAConfigManager.f10324J.f10330E.mo24325a(C5240a.m16396a(str));
        String str2 = this.f14220d;
        if (a != null) {
            this.f14218b.put(str2, a);
            try {
                jSONObject.put("gdem_signal", a.f10568a.getQuery());
            } catch (JSONException unused6) {
            }
        }
        try {
            jSONObject.put("version", ((C5242b) this.f14219c).mo26323a("2.2.0"));
        } catch (JSONException unused7) {
        }
        IAlog.m16446a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    public String getMobileCountryCode() {
        return ((C5242b) this.f14219c).mo26331h();
    }

    public String getMobileNetworkCode() {
        return ((C5242b) this.f14219c).mo26332i();
    }

    public String getNetwork() {
        ((C5242b) this.f14219c).getClass();
        return C5291k0.m16498f().f14014a;
    }

    public List<Integer> getSupportedApis() {
        ((C5242b) this.f14219c).getClass();
        return C5242b.f13903d;
    }

    public List<String> getSupportedMimes() {
        ((C5242b) this.f14219c).getClass();
        return C5242b.f13905f;
    }

    public List<Integer> getSupportedProtocols() {
        ((C5242b) this.f14219c).getClass();
        return C5242b.f13904e;
    }

    public int getSupportedTypesBitwise() {
        this.f14219c.getClass();
        return 372;
    }

    public String getTimeAccuracy() {
        return ((C5242b) this.f14219c).mo26329f();
    }

    public String getVerticalAccuracy() {
        return ((C5242b) this.f14219c).mo26330g();
    }

    public int getWidth() {
        ((C5242b) this.f14219c).getClass();
        return C5292l.m16512c(C5292l.m16516e());
    }

    public C4306g getWrapperQueryInfo(String str) {
        C4306g gVar = this.f14218b.get(this.f14220d);
        this.f14218b.remove(this.f14220d);
        return gVar;
    }

    public boolean hasAmazonAdvertisingId() {
        return C4257k.m13294b();
    }

    public Boolean isLimitTrackingEnabled() {
        ((C5242b) this.f14219c).getClass();
        return Boolean.valueOf(C4257k.m13295c());
    }

    /* renamed from: a */
    public static Object m16645a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String obj2 = obj.toString();
        if (TextUtils.equals(obj2, Integer.class.toString())) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (TextUtils.equals(obj2, String.class.toString())) {
            return str;
        } else {
            if (TextUtils.equals(obj2, Boolean.class.toString())) {
                if (str.equalsIgnoreCase("1")) {
                    return Boolean.TRUE;
                }
                if (str.equalsIgnoreCase("0")) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo26590a(String str) {
        this.f14220d = str;
        if (IAConfigManager.f10324J.f10353s) {
            C5242b bVar = (C5242b) this.f14219c;
            bVar.getClass();
            bVar.f13907b = C5332z.C5333a.f14077a.mo26418a();
        }
    }
}
