package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7783f;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7795e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7774a adSession;

    private MediaEvents(C7774a aVar) {
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
        C7774a aVar = (C7774a) adSession2;
        C7795e.m21790a((Object) adSession2, "AdSession is null");
        C7795e.m21798g(aVar);
        C7795e.m21789a(aVar);
        C7795e.m21793b(aVar);
        C7795e.m21796e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55007a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7795e.m21790a((Object) interactionType, "InteractionType is null");
        C7795e.m21794c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7791b.m21773a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55010a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a("bufferFinish");
    }

    public void bufferStart() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a("complete");
    }

    public void firstQuartile() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a("midpoint");
    }

    public void pause() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7795e.m21790a((Object) playerState, "PlayerState is null");
        C7795e.m21794c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7791b.m21773a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55010a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7795e.m21794c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7791b.m21773a(jSONObject, "duration", Float.valueOf(f));
        C7791b.m21773a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7791b.m21773a(jSONObject, "deviceVolume", Float.valueOf(C7783f.m21736a().mo54992d()));
        this.adSession.getAdSessionStatePublisher().mo55010a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7795e.m21794c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55008a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7795e.m21794c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7791b.m21773a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7791b.m21773a(jSONObject, "deviceVolume", Float.valueOf(C7783f.m21736a().mo54992d()));
        this.adSession.getAdSessionStatePublisher().mo55010a("volumeChange", jSONObject);
    }
}
