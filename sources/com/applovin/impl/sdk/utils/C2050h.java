package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1868c;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p051c.C1870e;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.h */
public class C2050h {

    /* renamed from: a */
    private static final int[] f3995a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f3996b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f3997c = {15, 13};

    /* renamed from: d */
    private static final int[] f3998d = {20};

    /* renamed from: a */
    public static String m4949a(InputStream inputStream, C1969m mVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) mVar.mo14534a(C1867b.f3227cW)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m4950a(String str, C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3119aT), str, mVar);
    }

    /* renamed from: a */
    public static String m4951a(String str, String str2, C1969m mVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (mVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static JSONObject m4952a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    public static void m4953a(int i, C1969m mVar) {
        if (i == 401 && C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "SDK key \"" + mVar.mo14597z() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            mVar.mo14519K().mo14286a((C1867b<?>) C1867b.f3095W, (Object) true);
            mVar.mo14519K().mo14285a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) mVar.mo14534a(C1867b.f3097Y)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) mVar.mo14534a(C1867b.f3097Y)).booleanValue()) {
                return;
            }
            mVar.mo14581k();
        }
    }

    /* renamed from: a */
    public static void m4954a(JSONObject jSONObject, boolean z, C1969m mVar) {
        mVar.mo14557ag().mo14487a(jSONObject, z);
    }

    /* renamed from: a */
    public static boolean m4955a() {
        return m4958a((String) null);
    }

    /* renamed from: a */
    private static boolean m4956a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4957a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b = m4959b(context);
        if (b != null) {
            return b.isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4958a(String str) {
        if (C2049g.m4943e()) {
            return (!C2049g.m4944f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    /* renamed from: b */
    private static NetworkInfo m4959b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m4960b(String str, C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3120aU), str, mVar);
    }

    /* renamed from: c */
    public static void m4961c(JSONObject jSONObject, C1969m mVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", (String) null);
        if (StringUtils.isValidString(string)) {
            mVar.mo14541a(C1869d.f3394z, string);
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15014c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* renamed from: d */
    public static void m4962d(JSONObject jSONObject, C1969m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (mVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    C1868c K = mVar.mo14519K();
                    if (!jSONObject.isNull("settings")) {
                        K.mo14287a(jSONObject.getJSONObject("settings"));
                        K.mo14285a();
                    }
                }
            } catch (JSONException e) {
                if (C2102v.m5104a()) {
                    mVar.mo14509A().mo15013b("ConnectionUtils", "Unable to parse settings out of API response", e);
                }
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: e */
    public static Map<String, String> m4963e(C1969m mVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) mVar.mo14534a(C1867b.f3098Z);
        if (StringUtils.isValidString(str2)) {
            str = "device_token";
        } else {
            if (!((Boolean) mVar.mo14534a(C1867b.f3348ep)).booleanValue()) {
                str2 = mVar.mo14597z();
                str = TapjoyConstants.TJC_API_KEY;
            }
            hashMap.putAll(Utils.stringifyObjectMap(mVar.mo14529V().mo14830i()));
            return hashMap;
        }
        hashMap.put(str, str2);
        hashMap.putAll(Utils.stringifyObjectMap(mVar.mo14529V().mo14830i()));
        return hashMap;
    }

    /* renamed from: e */
    public static void m4964e(JSONObject jSONObject, C1969m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mVar.mo14520L()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    C1870e.m4102a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: f */
    public static String m4965f(C1969m mVar) {
        NetworkInfo b = m4959b(mVar.mo14520L());
        if (b == null) {
            return "unknown";
        }
        int type = b.getType();
        int subtype = b.getSubtype();
        return type == 1 ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : type == 0 ? m4956a(subtype, f3995a) ? "2g" : m4956a(subtype, f3996b) ? "3g" : m4956a(subtype, f3997c) ? "4g" : m4956a(subtype, f3998d) ? "5g" : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "unknown";
    }

    /* renamed from: f */
    public static void m4966f(JSONObject jSONObject, C1969m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            mVar.mo14596y().updateVariables(jSONObject2);
        }
    }

    /* renamed from: g */
    public static String m4967g(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3117aR), ((Boolean) mVar.mo14534a(C1867b.f3287de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    /* renamed from: h */
    public static String m4968h(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3118aS), ((Boolean) mVar.mo14534a(C1867b.f3287de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    /* renamed from: i */
    public static String m4969i(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3117aR), "4.0/ad", mVar);
    }

    /* renamed from: j */
    public static String m4970j(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3118aS), "4.0/ad", mVar);
    }

    /* renamed from: k */
    public static String m4971k(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3123aX), "1.0/variable_config", mVar);
    }

    /* renamed from: l */
    public static String m4972l(C1969m mVar) {
        return m4951a((String) mVar.mo14534a(C1867b.f3124aY), "1.0/variable_config", mVar);
    }
}
