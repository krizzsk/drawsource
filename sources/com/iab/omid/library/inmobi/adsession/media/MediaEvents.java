package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.p249b.C7834f;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7846e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7825a adSession;

    private MediaEvents(C7825a aVar) {
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
        C7825a aVar = (C7825a) adSession2;
        C7846e.m22016a((Object) adSession2, "AdSession is null");
        C7846e.m22024g(aVar);
        C7846e.m22015a(aVar);
        C7846e.m22019b(aVar);
        C7846e.m22022e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55202a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7846e.m22016a((Object) interactionType, "InteractionType is null");
        C7846e.m22020c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7842b.m22000a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55205a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a("bufferFinish");
    }

    public void bufferStart() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a("complete");
    }

    public void firstQuartile() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a("midpoint");
    }

    public void pause() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7846e.m22016a((Object) playerState, "PlayerState is null");
        C7846e.m22020c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7842b.m22000a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55205a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7846e.m22020c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7842b.m22000a(jSONObject, "duration", Float.valueOf(f));
        C7842b.m22000a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7842b.m22000a(jSONObject, "deviceVolume", Float.valueOf(C7834f.m21964a().mo55187d()));
        this.adSession.getAdSessionStatePublisher().mo55205a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7846e.m22020c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55203a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7846e.m22020c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7842b.m22000a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7842b.m22000a(jSONObject, "deviceVolume", Float.valueOf(C7834f.m21964a().mo55187d()));
        this.adSession.getAdSessionStatePublisher().mo55205a("volumeChange", jSONObject);
    }
}
