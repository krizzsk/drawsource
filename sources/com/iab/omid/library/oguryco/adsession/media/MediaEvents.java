package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.p267b.C7985f;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7997e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7975a adSession;

    private MediaEvents(C7975a aVar) {
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
        C7975a aVar = (C7975a) adSession2;
        C7997e.m22696a((Object) adSession2, "AdSession is null");
        C7997e.m22704g(aVar);
        C7997e.m22695a(aVar);
        C7997e.m22699b(aVar);
        C7997e.m22702e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55801a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C7997e.m22696a((Object) interactionType, "InteractionType is null");
        C7997e.m22700c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55804a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public final void bufferFinish() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a("bufferFinish");
    }

    public final void bufferStart() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a("complete");
    }

    public final void firstQuartile() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void loaded(VastProperties vastProperties) {
        C7997e.m22696a((Object) vastProperties, "VastProperties is null");
        C7997e.m22699b(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55804a(TJAdUnitConstants.String.VIDEO_LOADED, vastProperties.mo55715a());
    }

    public final void midpoint() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a("midpoint");
    }

    public final void pause() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C7997e.m22696a((Object) playerState, "PlayerState is null");
        C7997e.m22700c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55804a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7997e.m22700c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "duration", Float.valueOf(f));
        C7993b.m22680a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7993b.m22680a(jSONObject, "deviceVolume", Float.valueOf(C7985f.m22644a().mo55786d()));
        this.adSession.getAdSessionStatePublisher().mo55804a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C7997e.m22700c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55802a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C7997e.m22700c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7993b.m22680a(jSONObject, "deviceVolume", Float.valueOf(C7985f.m22644a().mo55786d()));
        this.adSession.getAdSessionStatePublisher().mo55804a("volumeChange", jSONObject);
    }
}
