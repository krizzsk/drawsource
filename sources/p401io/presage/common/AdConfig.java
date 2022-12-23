package p401io.presage.common;

import com.ogury.p377ed.internal.C10263mq;

@Deprecated
/* renamed from: io.presage.common.AdConfig */
public final class AdConfig {
    private final String adUnitId;
    private String campaignId;
    private String creativeId;

    public AdConfig(String str) {
        C10263mq.m29882b(str, "adUnitId");
        this.adUnitId = str;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }
}
