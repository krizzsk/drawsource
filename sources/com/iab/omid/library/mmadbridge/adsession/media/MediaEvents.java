package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7934f;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7946e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7925a adSession;

    private MediaEvents(C7925a aVar) {
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
        C7925a aVar = (C7925a) adSession2;
        C7946e.m22465a((Object) adSession2, "AdSession is null");
        C7946e.m22473g(aVar);
        C7946e.m22464a(aVar);
        C7946e.m22468b(aVar);
        C7946e.m22471e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55586a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7946e.m22465a((Object) interactionType, "InteractionType is null");
        C7946e.m22469c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7942b.m22448a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55589a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a("bufferFinish");
    }

    public void bufferStart() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a("complete");
    }

    public void firstQuartile() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a("midpoint");
    }

    public void pause() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7946e.m22465a((Object) playerState, "PlayerState is null");
        C7946e.m22469c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7942b.m22448a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55589a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7946e.m22469c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7942b.m22448a(jSONObject, "duration", Float.valueOf(f));
        C7942b.m22448a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7942b.m22448a(jSONObject, "deviceVolume", Float.valueOf(C7934f.m22411a().mo55571d()));
        this.adSession.getAdSessionStatePublisher().mo55589a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7946e.m22469c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55587a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7946e.m22469c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7942b.m22448a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7942b.m22448a(jSONObject, "deviceVolume", Float.valueOf(C7934f.m22411a().mo55571d()));
        this.adSession.getAdSessionStatePublisher().mo55589a("volumeChange", jSONObject);
    }
}
