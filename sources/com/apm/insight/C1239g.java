package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.entity.C1228b;
import com.apm.insight.p024j.C1262b;
import com.apm.insight.p025k.C1291k;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.C1373d;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g */
public class C1239g {

    /* renamed from: b */
    protected static MonitorCrash f1147b;

    /* renamed from: a */
    protected MonitorCrash f1148a;

    private C1239g(MonitorCrash monitorCrash) {
        this.f1148a = monitorCrash;
        C1228b.m1507a(this);
        C1262b.m1661d();
        C1291k.m1766e();
    }

    /* renamed from: a */
    public static Object m1549a() {
        return f1147b;
    }

    /* renamed from: a */
    static void m1551a(Context context, final MonitorCrash monitorCrash) {
        f1147b = monitorCrash;
        C1239g gVar = new C1239g(monitorCrash);
        final C1373d a = C1250h.m1599a();
        Npth.init(context, new ICommonParams(gVar) {

            /* renamed from: a */
            final /* synthetic */ C1239g f1149a;

            {
                this.f1149a = r1;
            }

            public Map<String, Object> getCommonParams() {
                return C1311l.m1864b(this.f1149a.m1555e());
            }

            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a.mo12715d() : monitorCrash.mConfig.mDeviceId;
            }

            public List<String> getPatchInfo() {
                return null;
            }

            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public long getUserId() {
                return 0;
            }
        });
    }

    /* renamed from: a */
    static void m1552a(MonitorCrash monitorCrash) {
        new C1239g(monitorCrash);
    }

    /* renamed from: b */
    private JSONObject m1553b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f1148a.mCustomData == null || (userData = this.f1148a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    /* renamed from: c */
    private JSONObject m1554c(CrashType crashType) {
        return new JSONObject(this.f1148a.mTagMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public JSONObject m1555e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f1148a.mConfig.mPackageName == null) {
                Context g = C1250h.m1615g();
                PackageInfo packageInfo = g.getPackageManager().getPackageInfo(g.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f1148a.mConfig.mVersionInt == -1) {
                        this.f1148a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f1148a.mConfig.mVersionStr == null) {
                        this.f1148a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f1148a.mConfig.mDeviceId) || "0".equals(this.f1148a.mConfig.mDeviceId)) {
            this.f1148a.mConfig.mDeviceId = C1250h.m1611c().mo12744a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f1148a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f1148a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f1148a.mConfig.mVersionInt);
            jSONObject.put(TapjoyConstants.TJC_APP_VERSION_NAME, this.f1148a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f1148a.mConfig.mChannel);
            jSONObject.put("package", C1311l.m1858a(this.f1148a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f1148a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f1148a.mConfig.mUID);
            jSONObject.put("ssid", this.f1148a.mConfig.mSSID);
            jSONObject.put("os", APSAnalytics.OS_NAME);
            jSONObject.put("so_list", C1311l.m1858a(this.f1148a.mConfig.mSoList));
            jSONObject.put("single_upload", mo12516d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONArray mo12509a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        if (this.f1148a.mConfig.mPackageName == null) {
            return new JSONArray().put(new C1326v.C1327a(0, stackTraceElementArr.length).mo12597a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return C1326v.m1965a(stackTraceElementArr, this.f1148a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONArray mo12510a(String[] strArr) {
        return this.f1148a.config().mPackageName == null ? new JSONArray().put(new C1326v.C1327a(0, strArr.length).mo12597a()) : C1326v.m1966a(strArr, this.f1148a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONObject mo12511a(CrashType crashType) {
        return mo12512a(crashType, (JSONArray) null);
    }

    /* renamed from: a */
    public JSONObject mo12512a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m1555e());
            if (crashType != null) {
                jSONObject.put("custom", m1553b(crashType));
                jSONObject.put("filters", m1554c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public boolean mo12513a(Object obj) {
        return this.f1148a == obj;
    }

    /* renamed from: b */
    public String mo12514b() {
        return this.f1148a.mConfig.mAid;
    }

    /* renamed from: c */
    public JSONObject mo12515c() {
        return m1555e();
    }

    /* renamed from: d */
    public boolean mo12516d() {
        return false;
    }
}
