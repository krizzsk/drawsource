package com.ironsource.sdk.p278a;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.p198c.C6355b;
import com.ironsource.sdk.p282e.p283a.C8283a;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.core.api.VideoType;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.a.e */
public class C8105e {

    /* renamed from: a */
    private C6538a f19621a = new C6538a();

    /* renamed from: a */
    public static C8293d.C8298e m23162a(C8292c cVar, C8293d.C8298e eVar) {
        return (cVar == null || cVar.f20220d == null || cVar.f20220d.get(VideoType.REWARDED) == null) ? eVar : Boolean.parseBoolean(cVar.f20220d.get(VideoType.REWARDED)) ? C8293d.C8298e.RewardedVideo : C8293d.C8298e.Interstitial;
    }

    /* renamed from: a */
    public static boolean m23163a(C8292c cVar) {
        if (cVar == null || cVar.f20220d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f20220d.get("inAppBidding"));
    }

    /* renamed from: a */
    public void mo56294a(int i) {
        C6538a.m19816a("itp", (Object) Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo56295a(Context context) {
        C6538a.m19815a(context);
    }

    /* renamed from: a */
    public void mo56296a(C6355b bVar) {
        try {
            HashMap hashMap = new HashMap();
            String str = C8283a.f20173a;
            Intrinsics.checkNotNullExpressionValue(str, "OMIDManager.OMID_LIB_VERSION");
            hashMap.put("omv", str);
            hashMap.put("ompv", "7");
            String sDKVersion = SDKUtils.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "SDKUtils.getSDKVersion()");
            hashMap.put("sdkv", sDKVersion);
            C6538a.m19818a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo56297a(Boolean bool) {
        C6538a.m19816a("fs", (Object) bool);
    }

    /* renamed from: a */
    public void mo56298a(String str) {
        C6538a.m19816a("apky", (Object) str);
    }

    /* renamed from: a */
    public void mo56299a(JSONObject jSONObject) {
        C6538a.m19816a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void mo56300a(boolean z) {
        C6538a.m19816a("cnst", (Object) Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo56301b(String str) {
        C6538a.m19816a("medv", (Object) str);
    }

    /* renamed from: b */
    public void mo56302b(JSONObject jSONObject) {
        C6538a.m19816a("tkgp", (Object) jSONObject);
    }

    /* renamed from: b */
    public void mo56303b(boolean z) {
        C6538a.m19816a("gpi", (Object) Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo56304c(String str) {
        C6538a.m19816a("sid", (Object) str);
    }

    /* renamed from: d */
    public void mo56305d(String str) {
        C6538a.m19816a(TapjoyConstants.TJC_PLUGIN, (Object) str);
    }

    /* renamed from: e */
    public void mo56306e(String str) {
        C6538a.m19816a("usid", (Object) str);
    }

    /* renamed from: f */
    public void mo56307f(String str) {
        C6538a.m19816a("audt", (Object) str);
    }
}
