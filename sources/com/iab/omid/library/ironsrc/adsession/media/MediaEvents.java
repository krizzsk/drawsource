package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p255b.C7884f;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7896e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7875a adSession;

    private MediaEvents(C7875a aVar) {
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
        C7875a aVar = (C7875a) adSession2;
        C7896e.m22237a((Object) adSession2, "AdSession is null");
        C7896e.m22245g(aVar);
        C7896e.m22236a(aVar);
        C7896e.m22240b(aVar);
        C7896e.m22243e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55388a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C7896e.m22237a((Object) interactionType, "InteractionType is null");
        C7896e.m22241c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7892b.m22221a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55391a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public final void bufferFinish() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a("bufferFinish");
    }

    public final void bufferStart() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a("complete");
    }

    public final void firstQuartile() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void midpoint() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a("midpoint");
    }

    public final void pause() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C7896e.m22237a((Object) playerState, "PlayerState is null");
        C7896e.m22241c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7892b.m22221a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55391a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7896e.m22241c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7892b.m22221a(jSONObject, "duration", Float.valueOf(f));
        C7892b.m22221a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7892b.m22221a(jSONObject, "deviceVolume", Float.valueOf(C7884f.m22186a().mo55373d()));
        this.adSession.getAdSessionStatePublisher().mo55391a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C7896e.m22241c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55389a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C7896e.m22241c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7892b.m22221a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7892b.m22221a(jSONObject, "deviceVolume", Float.valueOf(C7884f.m22186a().mo55373d()));
        this.adSession.getAdSessionStatePublisher().mo55391a("volumeChange", jSONObject);
    }
}
