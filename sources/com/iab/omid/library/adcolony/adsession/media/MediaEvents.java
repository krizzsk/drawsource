package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p225b.C7632f;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7644e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7623a adSession;

    private MediaEvents(C7623a aVar) {
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
        C7623a aVar = (C7623a) adSession2;
        C7644e.m21100a((Object) adSession2, "AdSession is null");
        C7644e.m21108g(aVar);
        C7644e.m21099a(aVar);
        C7644e.m21103b(aVar);
        C7644e.m21106e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54410a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7644e.m21100a((Object) interactionType, "InteractionType is null");
        C7644e.m21104c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7640b.m21083a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54413a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a("bufferFinish");
    }

    public void bufferStart() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a("complete");
    }

    public void firstQuartile() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a("midpoint");
    }

    public void pause() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7644e.m21100a((Object) playerState, "PlayerState is null");
        C7644e.m21104c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7640b.m21083a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54413a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7644e.m21104c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7640b.m21083a(jSONObject, "duration", Float.valueOf(f));
        C7640b.m21083a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7640b.m21083a(jSONObject, "deviceVolume", Float.valueOf(C7632f.m21046a().mo54395d()));
        this.adSession.getAdSessionStatePublisher().mo54413a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7644e.m21104c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54411a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7644e.m21104c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7640b.m21083a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7640b.m21083a(jSONObject, "deviceVolume", Float.valueOf(C7632f.m21046a().mo54395d()));
        this.adSession.getAdSessionStatePublisher().mo54413a("volumeChange", jSONObject);
    }
}
