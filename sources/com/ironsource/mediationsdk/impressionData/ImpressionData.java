package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a */
    private JSONObject f17224a;

    /* renamed from: b */
    private String f17225b = null;

    /* renamed from: c */
    private String f17226c = null;

    /* renamed from: d */
    private String f17227d = null;

    /* renamed from: e */
    private String f17228e = null;

    /* renamed from: f */
    private String f17229f = null;

    /* renamed from: g */
    private String f17230g = null;

    /* renamed from: h */
    private String f17231h = null;

    /* renamed from: i */
    private String f17232i = null;

    /* renamed from: j */
    private String f17233j = null;

    /* renamed from: k */
    private Double f17234k = null;

    /* renamed from: l */
    private String f17235l = null;

    /* renamed from: m */
    private Double f17236m = null;

    /* renamed from: n */
    private String f17237n = null;

    /* renamed from: o */
    private DecimalFormat f17238o = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f17224a = impressionData.f17224a;
        this.f17225b = impressionData.f17225b;
        this.f17226c = impressionData.f17226c;
        this.f17227d = impressionData.f17227d;
        this.f17228e = impressionData.f17228e;
        this.f17229f = impressionData.f17229f;
        this.f17230g = impressionData.f17230g;
        this.f17231h = impressionData.f17231h;
        this.f17232i = impressionData.f17232i;
        this.f17233j = impressionData.f17233j;
        this.f17235l = impressionData.f17235l;
        this.f17237n = impressionData.f17237n;
        this.f17236m = impressionData.f17236m;
        this.f17234k = impressionData.f17234k;
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d = null;
        if (jSONObject != null) {
            try {
                this.f17224a = jSONObject;
                this.f17225b = jSONObject.optString("auctionId", (String) null);
                this.f17226c = jSONObject.optString("adUnit", (String) null);
                this.f17227d = jSONObject.optString("country", (String) null);
                this.f17228e = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, (String) null);
                this.f17229f = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, (String) null);
                this.f17230g = jSONObject.optString("placement", (String) null);
                this.f17231h = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, (String) null);
                this.f17232i = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_NAME, (String) null);
                this.f17233j = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_ID, (String) null);
                this.f17235l = jSONObject.optString(IMPRESSION_DATA_KEY_PRECISION, (String) null);
                this.f17237n = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, (String) null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f17236m = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble(IMPRESSION_DATA_KEY_REVENUE);
                if (!Double.isNaN(optDouble2)) {
                    d = Double.valueOf(optDouble2);
                }
                this.f17234k = d;
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f17228e;
    }

    public String getAdNetwork() {
        return this.f17231h;
    }

    public String getAdUnit() {
        return this.f17226c;
    }

    public JSONObject getAllData() {
        return this.f17224a;
    }

    public String getAuctionId() {
        return this.f17225b;
    }

    public String getCountry() {
        return this.f17227d;
    }

    public String getEncryptedCPM() {
        return this.f17237n;
    }

    public String getInstanceId() {
        return this.f17233j;
    }

    public String getInstanceName() {
        return this.f17232i;
    }

    public Double getLifetimeRevenue() {
        return this.f17236m;
    }

    public String getPlacement() {
        return this.f17230g;
    }

    public String getPrecision() {
        return this.f17235l;
    }

    public Double getRevenue() {
        return this.f17234k;
    }

    public String getSegmentName() {
        return this.f17229f;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f17230g;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f17230g = replace;
            JSONObject jSONObject = this.f17224a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(this.f17225b);
        sb.append('\'');
        sb.append(", adUnit: '");
        sb.append(this.f17226c);
        sb.append('\'');
        sb.append(", country: '");
        sb.append(this.f17227d);
        sb.append('\'');
        sb.append(", ab: '");
        sb.append(this.f17228e);
        sb.append('\'');
        sb.append(", segmentName: '");
        sb.append(this.f17229f);
        sb.append('\'');
        sb.append(", placement: '");
        sb.append(this.f17230g);
        sb.append('\'');
        sb.append(", adNetwork: '");
        sb.append(this.f17231h);
        sb.append('\'');
        sb.append(", instanceName: '");
        sb.append(this.f17232i);
        sb.append('\'');
        sb.append(", instanceId: '");
        sb.append(this.f17233j);
        sb.append('\'');
        sb.append(", revenue: ");
        Double d = this.f17234k;
        String str = null;
        sb.append(d == null ? null : this.f17238o.format(d));
        sb.append(", precision: '");
        sb.append(this.f17235l);
        sb.append('\'');
        sb.append(", lifetimeRevenue: ");
        Double d2 = this.f17236m;
        if (d2 != null) {
            str = this.f17238o.format(d2);
        }
        sb.append(str);
        sb.append(", encryptedCPM: '");
        sb.append(this.f17237n);
        return sb.toString();
    }
}
