package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.video.C11917c;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12081k;

/* renamed from: com.unity3d.services.ads.adunit.h */
/* compiled from: VideoPlayerHandler */
public class C11816h implements C11814f {

    /* renamed from: a */
    private RelativeLayout f28705a;

    /* renamed from: b */
    private C11917c f28706b;

    /* renamed from: a */
    public void mo70742a(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: a */
    public boolean mo70744a() {
        C12065a.m32839a();
        C11917c cVar = this.f28706b;
        if (cVar != null) {
            cVar.mo70869e();
            this.f28706b.stopPlayback();
            C12081k.m32885a(this.f28706b);
            if (this.f28706b.equals(VideoPlayer.getVideoPlayerView())) {
                VideoPlayer.setVideoPlayerView((C11917c) null);
            }
            this.f28706b = null;
        }
        RelativeLayout relativeLayout = this.f28705a;
        if (relativeLayout == null) {
            return true;
        }
        C12081k.m32885a(relativeLayout);
        this.f28705a = null;
        return true;
    }

    /* renamed from: b */
    public View mo70745b() {
        return this.f28705a;
    }

    /* renamed from: c */
    public void mo70747c(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: d */
    public void mo70748d(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: e */
    public boolean mo70749e(AdUnitActivity adUnitActivity) {
        C12065a.m32839a();
        if (this.f28705a == null) {
            this.f28705a = new RelativeLayout(adUnitActivity);
        }
        if (this.f28706b != null) {
            return true;
        }
        this.f28706b = new C11917c(adUnitActivity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f28706b.setLayoutParams(layoutParams);
        this.f28705a.addView(this.f28706b);
        VideoPlayer.setVideoPlayerView(this.f28706b);
        return true;
    }

    /* renamed from: f */
    public void mo70750f(AdUnitActivity adUnitActivity) {
    }

    /* renamed from: b */
    public void mo70746b(AdUnitActivity adUnitActivity) {
        mo70744a();
    }

    /* renamed from: a */
    public void mo70743a(AdUnitActivity adUnitActivity, Bundle bundle) {
        mo70749e(adUnitActivity);
    }
}
