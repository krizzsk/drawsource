package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bytedance.sdk.component.utils.C2905l;
import org.json.JSONObject;

public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_BANNER_NATIVE = 10;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f6578a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f6579b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f6580c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f6581d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f6582e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6583f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f6584g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f6585h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f6586i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f6587j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f6588k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6589l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6590m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6591n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f6592o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f6593p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f6594q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f6595r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f6596s;

    /* renamed from: t */
    private int f6597t;

    /* renamed from: u */
    private int f6598u;

    /* renamed from: v */
    private int f6599v;

    /* renamed from: w */
    private int f6600w;

    private AdSlot() {
        this.f6590m = true;
        this.f6591n = false;
        this.f6597t = 0;
        this.f6598u = 0;
        this.f6599v = 0;
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", (String) null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", (String) null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", (String) null));
            builder.setUserID(jSONObject.optString("mUserID", (String) null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
        } catch (Exception unused) {
        }
        return builder.build();
    }

    public int getAdCount() {
        return this.f6583f;
    }

    public String getAdId() {
        return this.f6593p;
    }

    public String getBidAdm() {
        return this.f6592o;
    }

    public String getCodeId() {
        return this.f6578a;
    }

    public String getCreativeId() {
        return this.f6594q;
    }

    public int getDurationSlotType() {
        return this.f6600w;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f6582e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f6581d;
    }

    public String getExt() {
        return this.f6595r;
    }

    public int getImgAcceptedHeight() {
        return this.f6580c;
    }

    public int getImgAcceptedWidth() {
        return this.f6579b;
    }

    public int getIsRotateBanner() {
        return this.f6597t;
    }

    public String getMediaExtra() {
        return this.f6587j;
    }

    public int getNativeAdType() {
        return this.f6589l;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f6586i;
    }

    @Deprecated
    public String getRewardName() {
        return this.f6585h;
    }

    public int getRotateOrder() {
        return this.f6599v;
    }

    public int getRotateTime() {
        return this.f6598u;
    }

    public String getUserData() {
        return this.f6596s;
    }

    public String getUserID() {
        return this.f6588k;
    }

    public boolean isAutoPlay() {
        return this.f6590m;
    }

    public boolean isExpressAd() {
        return this.f6591n;
    }

    public boolean isSupportDeepLink() {
        return this.f6584g;
    }

    public void setAdCount(int i) {
        this.f6583f = i;
    }

    public void setDurationSlotType(int i) {
        this.f6600w = i;
    }

    public void setIsRotateBanner(int i) {
        this.f6597t = i;
    }

    public void setNativeAdType(int i) {
        this.f6589l = i;
    }

    public void setRotateOrder(int i) {
        this.f6599v = i;
    }

    public void setRotateTime(int i) {
        this.f6598u = i;
    }

    public void setUserData(String str) {
        this.f6596s = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f6578a);
            jSONObject.put("mAdCount", this.f6583f);
            jSONObject.put("mIsAutoPlay", this.f6590m);
            jSONObject.put("mImgAcceptedWidth", this.f6579b);
            jSONObject.put("mImgAcceptedHeight", this.f6580c);
            jSONObject.put("mExpressViewAcceptedWidth", (double) this.f6581d);
            jSONObject.put("mExpressViewAcceptedHeight", (double) this.f6582e);
            jSONObject.put("mSupportDeepLink", this.f6584g);
            jSONObject.put("mRewardName", this.f6585h);
            jSONObject.put("mRewardAmount", this.f6586i);
            jSONObject.put("mMediaExtra", this.f6587j);
            jSONObject.put("mUserID", this.f6588k);
            jSONObject.put("mNativeAdType", this.f6589l);
            jSONObject.put("mIsExpressAd", this.f6591n);
            jSONObject.put("mAdId", this.f6593p);
            jSONObject.put("mCreativeId", this.f6594q);
            jSONObject.put("mExt", this.f6595r);
            jSONObject.put("mBidAdm", this.f6592o);
            jSONObject.put("mUserData", this.f6596s);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f6578a + '\'' + ", mImgAcceptedWidth=" + this.f6579b + ", mImgAcceptedHeight=" + this.f6580c + ", mExpressViewAcceptedWidth=" + this.f6581d + ", mExpressViewAcceptedHeight=" + this.f6582e + ", mAdCount=" + this.f6583f + ", mSupportDeepLink=" + this.f6584g + ", mRewardName='" + this.f6585h + '\'' + ", mRewardAmount=" + this.f6586i + ", mMediaExtra='" + this.f6587j + '\'' + ", mUserID='" + this.f6588k + '\'' + ", mNativeAdType=" + this.f6589l + ", mIsAutoPlay=" + this.f6590m + ", mAdId" + this.f6593p + ", mCreativeId" + this.f6594q + ", mExt" + this.f6595r + ", mUserData" + this.f6596s + '}';
    }

    public static class Builder {

        /* renamed from: a */
        private String f6601a;

        /* renamed from: b */
        private int f6602b = 640;

        /* renamed from: c */
        private int f6603c = 320;

        /* renamed from: d */
        private boolean f6604d = true;

        /* renamed from: e */
        private int f6605e = 1;

        /* renamed from: f */
        private String f6606f = "";

        /* renamed from: g */
        private int f6607g = 0;

        /* renamed from: h */
        private String f6608h;

        /* renamed from: i */
        private String f6609i = "defaultUser";

        /* renamed from: j */
        private int f6610j;

        /* renamed from: k */
        private float f6611k;

        /* renamed from: l */
        private float f6612l;

        /* renamed from: m */
        private boolean f6613m;

        /* renamed from: n */
        private String f6614n;

        /* renamed from: o */
        private String f6615o;

        /* renamed from: p */
        private String f6616p;

        /* renamed from: q */
        private String f6617q;

        /* renamed from: r */
        private String f6618r;

        /* renamed from: s */
        private boolean f6619s = true;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.f6615o = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f6616p = str;
            return this;
        }

        public Builder setExt(String str) {
            this.f6617q = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.f6619s = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f6601a = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.f6613m = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.f6602b = i;
            this.f6603c = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.f6611k = f;
            this.f6612l = f2;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
                C2905l.m8114c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i > 20) {
                C2905l.m8114c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i = 20;
            }
            this.f6605e = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f6608h = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f6609i = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.f6610j = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            C2905l.m8114c("bidding", "AdSlot -> bidAdm=" + C2414b.m5821a(str));
            this.f6614n = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f6618r = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            String unused = adSlot.f6578a = this.f6601a;
            int unused2 = adSlot.f6583f = this.f6605e;
            boolean unused3 = adSlot.f6584g = this.f6604d;
            int unused4 = adSlot.f6579b = this.f6602b;
            int unused5 = adSlot.f6580c = this.f6603c;
            float f = this.f6611k;
            if (f <= 0.0f) {
                float unused6 = adSlot.f6581d = (float) this.f6602b;
                float unused7 = adSlot.f6582e = (float) this.f6603c;
            } else {
                float unused8 = adSlot.f6581d = f;
                float unused9 = adSlot.f6582e = this.f6612l;
            }
            String unused10 = adSlot.f6585h = this.f6606f;
            int unused11 = adSlot.f6586i = this.f6607g;
            String unused12 = adSlot.f6587j = this.f6608h;
            String unused13 = adSlot.f6588k = this.f6609i;
            int unused14 = adSlot.f6589l = this.f6610j;
            boolean unused15 = adSlot.f6590m = this.f6619s;
            boolean unused16 = adSlot.f6591n = this.f6613m;
            String unused17 = adSlot.f6592o = this.f6614n;
            String unused18 = adSlot.f6593p = this.f6615o;
            String unused19 = adSlot.f6594q = this.f6616p;
            String unused20 = adSlot.f6595r = this.f6617q;
            String unused21 = adSlot.f6596s = this.f6618r;
            return adSlot;
        }
    }
}
