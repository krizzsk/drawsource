package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.flow.C4346a0;

public class InneractiveAdRequest extends C4346a0 {

    /* renamed from: c */
    public String f10618c;

    /* renamed from: d */
    public C4288z f10619d;

    public InneractiveAdRequest(String str) {
        this.f10618c = str;
    }

    @Deprecated
    public String getKeywords() {
        return InneractiveAdManager.getKeywords();
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public C4288z getSelectedUnitConfig() {
        return this.f10619d;
    }

    public String getSpotId() {
        return this.f10618c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setKeywords(String str) {
        InneractiveAdManager.setKeywords(str);
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(C4288z zVar) {
        this.f10619d = zVar;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
