package com.tapjoy;

import com.vungle.warren.model.Advertisement;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class TapjoyCachedAssetData implements Serializable {

    /* renamed from: a */
    private long f26765a;

    /* renamed from: b */
    private long f26766b;

    /* renamed from: c */
    private String f26767c;

    /* renamed from: d */
    private String f26768d;

    /* renamed from: e */
    private String f26769e;

    /* renamed from: f */
    private long f26770f;

    /* renamed from: g */
    private String f26771g;

    /* renamed from: h */
    private String f26772h;

    public TapjoyCachedAssetData(String str, String str2, long j) {
        this(str, str2, j, System.currentTimeMillis() / 1000);
    }

    public TapjoyCachedAssetData(String str, String str2, long j, long j2) {
        setAssetURL(str);
        setLocalFilePath(str2);
        this.f26766b = j;
        this.f26765a = j2;
        this.f26770f = j2 + j;
    }

    public void setAssetURL(String str) {
        this.f26767c = str;
        this.f26771g = TapjoyUtil.determineMimeType(str);
    }

    public void setLocalFilePath(String str) {
        this.f26768d = str;
        this.f26769e = Advertisement.FILE_SCHEME.concat(String.valueOf(str));
    }

    public void resetTimeToLive(long j) {
        this.f26766b = j;
        this.f26770f = (System.currentTimeMillis() / 1000) + j;
    }

    public void setOfferID(String str) {
        this.f26772h = str;
    }

    public long getTimestampInSeconds() {
        return this.f26765a;
    }

    public long getTimeToLiveInSeconds() {
        return this.f26766b;
    }

    public long getTimeOfDeathInSeconds() {
        return this.f26770f;
    }

    public String getAssetURL() {
        return this.f26767c;
    }

    public String getLocalFilePath() {
        return this.f26768d;
    }

    public String getLocalURL() {
        return this.f26769e;
    }

    public String getMimeType() {
        return this.f26771g;
    }

    public String getOfferId() {
        return this.f26772h;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", getTimestampInSeconds());
            jSONObject.put(TapjoyConstants.TJC_TIME_TO_LIVE, getTimeToLiveInSeconds());
            jSONObject.put("assetURL", getAssetURL());
            jSONObject.put("localFilePath", getLocalFilePath());
            jSONObject.put("offerID", getOfferId());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toRawJSONString() {
        return toJSON().toString();
    }

    public static TapjoyCachedAssetData fromRawJSONString(String str) {
        try {
            return fromJSONObject(new JSONObject(str));
        } catch (JSONException unused) {
            TapjoyLog.m30842i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
            return null;
        }
    }

    public static TapjoyCachedAssetData fromJSONObject(JSONObject jSONObject) {
        TapjoyCachedAssetData tapjoyCachedAssetData;
        try {
            tapjoyCachedAssetData = new TapjoyCachedAssetData(jSONObject.getString("assetURL"), jSONObject.getString("localFilePath"), jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE), jSONObject.getLong("timestamp"));
            try {
                tapjoyCachedAssetData.setOfferID(jSONObject.optString("offerID"));
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            tapjoyCachedAssetData = null;
            TapjoyLog.m30842i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
            return tapjoyCachedAssetData;
        }
        return tapjoyCachedAssetData;
    }

    public String toString() {
        return "\nURL=" + this.f26769e + "\n" + "AssetURL=" + this.f26767c + "\n" + "MimeType=" + this.f26771g + "\n" + "Timestamp=" + getTimestampInSeconds() + "\n" + "TimeOfDeath=" + this.f26770f + "\n" + "TimeToLive=" + this.f26766b + "\n";
    }
}
