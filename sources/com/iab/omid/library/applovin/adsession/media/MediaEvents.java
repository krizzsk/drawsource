package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p237b.C7732f;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7744e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7723a adSession;

    private MediaEvents(C7723a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        C7723a aVar = (C7723a) adSession2;
        C7744e.m21560a((Object) adSession2, "AdSession is null");
        C7744e.m21568g(aVar);
        C7744e.m21559a(aVar);
        C7744e.m21563b(aVar);
        C7744e.m21566e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54808a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7744e.m21560a((Object) interactionType, "InteractionType is null");
        C7744e.m21564c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7740b.m21543a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54811a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a("bufferFinish");
    }

    public void bufferStart() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a("complete");
    }

    public void firstQuartile() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a("midpoint");
    }

    public void pause() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7744e.m21560a((Object) playerState, "PlayerState is null");
        C7744e.m21564c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7740b.m21543a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54811a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7744e.m21564c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7740b.m21543a(jSONObject, "duration", Float.valueOf(f));
        C7740b.m21543a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7740b.m21543a(jSONObject, "deviceVolume", Float.valueOf(C7732f.m21506a().mo54793d()));
        this.adSession.getAdSessionStatePublisher().mo54811a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7744e.m21564c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54809a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7744e.m21564c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7740b.m21543a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7740b.m21543a(jSONObject, "deviceVolume", Float.valueOf(C7732f.m21506a().mo54793d()));
        this.adSession.getAdSessionStatePublisher().mo54811a("volumeChange", jSONObject);
    }
}
