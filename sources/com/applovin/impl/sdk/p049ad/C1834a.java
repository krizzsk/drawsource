package com.applovin.impl.sdk.p049ad;

import android.net.Uri;
import com.applovin.impl.adview.C1535i;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p048a.C1808c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.a */
public final class C1834a extends C1839e {

    /* renamed from: a */
    private final String f2946a = mo12844b();

    /* renamed from: b */
    private final String f2947b = mo14141i();

    /* renamed from: c */
    private final String f2948c = m3876aM();

    /* renamed from: d */
    private final C1808c f2949d = new C1808c(this);

    public C1834a(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, C1969m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
    }

    /* renamed from: aM */
    private String m3876aM() {
        return getStringFromAdObject("stream_url", "");
    }

    /* renamed from: a */
    public void mo12834a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, this.f2946a);
            JsonUtils.putString(this.adObject, "stream_url", this.f2948c);
        }
    }

    /* renamed from: a */
    public void mo14137a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    /* renamed from: a */
    public void mo14138a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, str);
        }
    }

    /* renamed from: b */
    public String mo12844b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, TJAdUnitConstants.String.HTML, "");
        }
        return string;
    }

    /* renamed from: c */
    public C1808c mo12863o() {
        return this.f2949d;
    }

    /* renamed from: d */
    public String mo12846d() {
        return this.f2947b;
    }

    /* renamed from: e */
    public String mo14139e() {
        return this.f2948c;
    }

    /* renamed from: f */
    public boolean mo12849f() {
        return this.adObject.has("stream_url");
    }

    /* renamed from: g */
    public void mo14140g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, TJAdUnitConstants.String.HTML, this.f2946a);
            JsonUtils.putString(jSONObject, "video", this.f2947b);
            JsonUtils.putString(jSONObject, "stream_url", this.f2948c);
        }
        return deepCopy;
    }

    /* renamed from: h */
    public Uri mo12853h() {
        String aM = m3876aM();
        if (StringUtils.isValidString(aM)) {
            return Uri.parse(aM);
        }
        String i = mo14141i();
        if (StringUtils.isValidString(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        return mo12853h() != null;
    }

    /* renamed from: i */
    public String mo14141i() {
        return getStringFromAdObject("video", "");
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", false);
    }

    /* renamed from: j */
    public Uri mo12858j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo12859k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo12858j();
    }

    /* renamed from: l */
    public float mo14142l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: m */
    public boolean mo14143m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    /* renamed from: n */
    public C1535i.C1536a mo14144n() {
        return mo14187a(getIntFromAdObject("expandable_style", C1535i.C1536a.INVISIBLE.mo13186a()));
    }
}
