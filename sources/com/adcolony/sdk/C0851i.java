package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.adcolony.sdk.i */
class C0851i extends ContentObserver {

    /* renamed from: a */
    private AudioManager f509a;

    /* renamed from: b */
    private AdColonyInterstitial f510b;

    C0851i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context a = C0723a.m186a();
        if (a != null) {
            this.f509a = (AudioManager) a.getSystemService("audio");
            this.f510b = adColonyInterstitial;
            a.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10839a() {
        Context a = C0723a.m186a();
        if (a != null) {
            a.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f510b = null;
        this.f509a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f509a != null && (adColonyInterstitial = this.f510b) != null && adColonyInterstitial.mo10443d() != null) {
            double streamVolume = (double) ((((float) this.f509a.getStreamVolume(3)) / 15.0f) * 100.0f);
            C0832f1 b = C0773c0.m379b();
            C0773c0.m373a(b, "audio_percentage", streamVolume);
            C0773c0.m376a(b, "ad_session_id", this.f510b.mo10443d().mo10625a());
            C0773c0.m383b(b, "id", this.f510b.mo10443d().mo10634c());
            new C0850h0("AdContainer.on_audio_change", this.f510b.mo10443d().mo10653k(), b).mo10838c();
        }
    }
}
