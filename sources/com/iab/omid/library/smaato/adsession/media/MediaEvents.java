package com.iab.omid.library.smaato.adsession.media;

import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;
import p012c.C0696f;
import p397e.C12465b;
import p397e.C12469e;

public final class MediaEvents {
    private final C8021a adSession;

    private MediaEvents(C8021a aVar) {
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
        C8021a aVar = (C8021a) adSession2;
        C12469e.m33308a((Object) adSession2, "AdSession is null");
        C12469e.m33315f(aVar);
        C12469e.m33312c(aVar);
        C12469e.m33311b(aVar);
        C12469e.m33317h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55940a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C12469e.m33308a((Object) interactionType, "InteractionType is null");
        C12469e.m33307a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55943a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a("bufferFinish");
    }

    public void bufferStart() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a("complete");
    }

    public void firstQuartile() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a("midpoint");
    }

    public void pause() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C12469e.m33308a((Object) playerState, "PlayerState is null");
        C12469e.m33307a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55943a("playerStateChange", jSONObject);
    }

    public void resume() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C12469e.m33307a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "duration", Float.valueOf(f));
        C12465b.m33291a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C12465b.m33291a(jSONObject, "deviceVolume", Float.valueOf(C0696f.m75c().mo10304b()));
        this.adSession.getAdSessionStatePublisher().mo55943a("start", jSONObject);
    }

    public void thirdQuartile() {
        C12469e.m33307a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55941a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C12469e.m33307a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C12465b.m33291a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C12465b.m33291a(jSONObject, "deviceVolume", Float.valueOf(C0696f.m75c().mo10304b()));
        this.adSession.getAdSessionStatePublisher().mo55943a("volumeChange", jSONObject);
    }
}
