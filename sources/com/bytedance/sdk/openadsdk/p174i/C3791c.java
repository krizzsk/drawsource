package com.bytedance.sdk.openadsdk.p174i;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.p121c.C2855b;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.c */
/* compiled from: TTAdNetDepend */
public class C3791c implements C2855b {

    /* renamed from: a */
    String f9764a = "sp_multi_ttadnet_config";

    /* renamed from: b */
    private Context f9765b;

    /* renamed from: a */
    public Address mo17736a(Context context) {
        return null;
    }

    /* renamed from: b */
    public String mo17739b() {
        return "pangle_sdk";
    }

    /* renamed from: c */
    public String mo17740c() {
        return "android";
    }

    /* renamed from: d */
    public int mo17741d() {
        return BuildConfig.VERSION_CODE;
    }

    public C3791c(Context context) {
        this.f9765b = context;
    }

    /* renamed from: a */
    public int mo17735a() {
        return Integer.parseInt("1371");
    }

    /* renamed from: e */
    public String mo17742e() {
        return C3472j.m10774a(this.f9765b);
    }

    /* renamed from: a */
    public String mo17737a(Context context, String str, String str2) {
        return C3961a.m13035b(this.f9764a, str, str2);
    }

    /* renamed from: a */
    public void mo17738a(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Integer) {
                        C3961a.m13027a(this.f9764a, (String) next.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        C3961a.m13028a(this.f9764a, (String) next.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        C3961a.m13026a(this.f9764a, (String) next.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        C3961a.m13025a(this.f9764a, (String) next.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        C3961a.m13029a(this.f9764a, (String) next.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public String[] mo17743f() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String w = C3513m.m10973h().mo19883w();
        if (!TextUtils.isEmpty(w)) {
            return ("SG".equals(w) || "CN".equals(w)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int o = C3898x.m12828o();
        return (o == 2 || o == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
