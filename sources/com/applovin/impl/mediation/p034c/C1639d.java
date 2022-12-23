package com.applovin.impl.mediation.p034c;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.network.C2020i;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.d */
public class C1639d extends C1887a {

    /* renamed from: a */
    private final String f2270a;

    /* renamed from: c */
    private final String f2271c;

    /* renamed from: d */
    private final C1588f f2272d;

    /* renamed from: e */
    private final Map<String, String> f2273e;

    /* renamed from: f */
    private final Map<String, String> f2274f;

    /* renamed from: g */
    private final MaxError f2275g;

    public C1639d(String str, Map<String, String> map, MaxError maxError, C1588f fVar, C1969m mVar) {
        super("TaskFireMediationPostbacks", mVar);
        this.f2270a = str;
        this.f2271c = str + "_urls";
        this.f2273e = Utils.toUrlSafeMap(map, mVar);
        this.f2275g = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f2272d = fVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", fVar.mo13431L());
        if (fVar instanceof C1583a) {
            C1583a aVar = (C1583a) fVar;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.mo13385l());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f2274f = hashMap;
    }

    /* renamed from: a */
    private String m3298a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), mo14369d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, mo14369d()));
    }

    /* renamed from: a */
    private List<String> m3299a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String next2 : map.keySet()) {
                next = next.replace(next2, this.f2272d.mo13467g(map.get(next2)));
            }
            arrayList.add(m3298a(m3304b(next, map2), maxError));
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, String> m3300a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f3496b.mo14534a(C1866a.f3077i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: a */
    private void m3302a(String str, Map<String, Object> map) {
        mo14369d().mo14528U().mo14764a(C2017h.m4735o().mo14798c(str).mo14795b(ShareTarget.METHOD_POST).mo14796b(this.f2274f).mo14793a(false).mo14799c(map).mo14797b(((Boolean) this.f3496b.mo14534a(C1866a.f3068V)).booleanValue()).mo14794a());
    }

    /* renamed from: a */
    private void m3303a(List<String> list) {
        if (!list.isEmpty()) {
            for (String c : list) {
                mo14369d().mo14528U().mo14764a(C2017h.m4735o().mo14798c(c).mo14793a(false).mo14796b(this.f2274f).mo14794a());
            }
        }
    }

    /* renamed from: b */
    private String m3304b(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            str = str.replace(next, StringUtils.emptyIfNull(map.get(next)));
        }
        return str;
    }

    /* renamed from: b */
    private void m3305b(List<String> list) {
        if (!list.isEmpty()) {
            for (String d : list) {
                mo14369d().mo14531X().dispatchPostbackRequest(C2020i.m4771b(mo14369d()).mo14724a(d).mo14735c(false).mo14731b(this.f2274f).mo14728a(), C1918o.C1920a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() {
                    public void onPostbackFailure(String str, int i) {
                        if (C2102v.m5104a()) {
                            C1639d dVar = C1639d.this;
                            dVar.mo14370d("Failed to fire postback with code: " + i + " and url: " + str);
                        }
                    }

                    public void onPostbackSuccess(String str) {
                    }
                });
            }
        }
    }

    public void run() {
        List<String> f = this.f2272d.mo13466f(this.f2271c);
        Map<String, String> a = m3300a();
        if (((Boolean) mo14369d().mo14534a(C1866a.f3062P)).booleanValue()) {
            for (String b : f) {
                Uri parse = Uri.parse(m3298a(m3304b(b, this.f2273e), this.f2275g));
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                HashMap hashMap = new HashMap(a.size());
                for (String next : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(next);
                    if (a.containsKey(queryParameter)) {
                        hashMap.put(next, this.f2272d.mo13467g(a.get(queryParameter)));
                    } else {
                        clearQuery.appendQueryParameter(next, queryParameter);
                    }
                }
                m3302a(clearQuery.build().toString(), (Map<String, Object>) hashMap);
            }
            return;
        }
        List<String> a2 = m3299a(f, a, this.f2273e, this.f2275g);
        if (((Boolean) mo14369d().mo14534a(C1866a.f3078j)).booleanValue()) {
            m3303a(a2);
        } else {
            m3305b(a2);
        }
    }
}
