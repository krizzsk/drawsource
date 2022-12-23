package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* renamed from: ln */
    protected String f21607ln;
    private String price;

    /* renamed from: wn */
    protected String f21608wn;

    public String getBidId() {
        return this.bidId;
    }

    /* access modifiers changed from: protected */
    public void setBidId(String str) {
        this.bidId = str;
    }

    public String getPrice() {
        return this.price;
    }

    /* access modifiers changed from: protected */
    public void setPrice(String str) {
        this.price = str;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    /* access modifiers changed from: protected */
    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public String getCur() {
        return this.cur;
    }

    /* access modifiers changed from: protected */
    public void setCur(String str) {
        this.cur = str;
    }

    public String getLn() {
        return this.f21607ln;
    }

    public String getWn() {
        return this.f21608wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (!TextUtils.isEmpty(this.f21607ln) && context != null && bidLossCode != null) {
            StringBuilder sb = new StringBuilder(this.f21607ln);
            if (this.f21607ln.contains("?")) {
                sb.append("&");
            } else {
                sb.append("?");
            }
            sb.append("reason=");
            sb.append(bidLossCode.getCurrentCode());
            C6765a.m20557a(context, (CampaignEx) null, "", sb.toString(), false, false);
        }
    }

    public void sendWinNotice(Context context) {
        if (!TextUtils.isEmpty(this.f21608wn) && context != null) {
            C6765a.m20557a(context, (CampaignEx) null, "", this.f21608wn, false, false);
        }
    }
}
