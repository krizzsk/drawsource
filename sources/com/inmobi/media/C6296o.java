package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.C5971ej;
import com.inmobi.media.C6234j;
import com.inmobi.media.C6281n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.o */
/* compiled from: NativeVideoAdContainer */
public class C6296o extends C6281n {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final String f15876A = C6296o.class.getSimpleName();

    /* renamed from: B */
    private WeakReference<View> f15877B;

    /* renamed from: C */
    private final C6234j.C6235a f15878C = new C6234j.C6235a() {
        /* renamed from: a */
        public final void mo35461a() {
            String unused = C6296o.f15876A;
            C6281n.C6295c f = C6296o.this.mo35533f();
            if (f != null) {
                f.mo34504a();
            }
        }

        /* renamed from: a */
        public final void mo35462a(Object obj) {
            if (C6296o.this.mo35540m() != null) {
                C5869cj cjVar = (C5869cj) obj;
                String unused = C6296o.f15876A;
                cjVar.f14724v.put("didRequestFullScreen", Boolean.TRUE);
                cjVar.f14724v.put("isFullScreen", Boolean.TRUE);
                cjVar.f14724v.put("shouldAutoPlay", Boolean.TRUE);
                if (cjVar.f14727y != null) {
                    cjVar.f14727y.f14724v.put("didRequestFullScreen", Boolean.TRUE);
                    cjVar.f14727y.f14724v.put("isFullScreen", Boolean.TRUE);
                    cjVar.f14727y.f14724v.put("shouldAutoPlay", Boolean.TRUE);
                }
                if (C6296o.this.getPlacementType() == 0) {
                    C6296o.this.getViewableAd().mo35069a((byte) 1);
                    cjVar.mo34824a("fullscreen", (Map<String, String>) C6296o.this.m18807h(cjVar), (C5817bk) null);
                }
                C6281n.C6295c f = C6296o.this.mo35533f();
                if (f != null) {
                    f.mo34508b();
                }
            }
        }

        /* renamed from: b */
        public final void mo35463b(Object obj) {
            String unused = C6296o.f15876A;
            C5869cj cjVar = (C5869cj) obj;
            cjVar.f14724v.put("didRequestFullScreen", Boolean.FALSE);
            cjVar.f14724v.put("isFullScreen", Boolean.FALSE);
            if (cjVar.f14727y != null) {
                cjVar.f14727y.f14724v.put("didRequestFullScreen", Boolean.FALSE);
                cjVar.f14727y.f14724v.put("isFullScreen", Boolean.FALSE);
                cjVar.f14727y.f14727y = null;
            }
            cjVar.f14727y = null;
            if (C6296o.this.getPlacementType() == 0) {
                C6296o.this.getViewableAd().mo35069a((byte) 2);
                if (C6296o.this.f15848l != null) {
                    C6296o.this.f15848l.getViewableAd().mo35069a((byte) Ascii.DLE);
                }
                cjVar.mo34824a("exitFullscreen", (Map<String, String>) C6296o.this.m18807h(cjVar), (C5817bk) null);
            } else {
                C6296o.this.getViewableAd().mo35069a((byte) 3);
            }
            C6281n.C6295c f = C6296o.this.mo35533f();
            if (f != null) {
                f.mo34512f();
            }
        }
    };

    /* renamed from: z */
    public final C5971ej.C5975a f15879z = new C5971ej.C5975a() {
        /* renamed from: a */
        public final void mo35105a(View view, boolean z) {
            C6296o.this.mo35528a(z);
            C6296o.m18801a(C6296o.this, view, z);
        }
    };

    /* renamed from: b */
    private void m18804b(C6038fm fmVar) {
        int videoVolume = fmVar.getVideoVolume();
        int lastVolume = fmVar.getLastVolume();
        if (videoVolume != lastVolume && lastVolume > 0) {
            m18806b(true);
            fmVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: b */
    private void m18806b(boolean z) {
        C6281n.C6295c f;
        if (getPlacementType() == 0 && !mo35537j() && (f = mo35533f()) != null) {
            f.mo34507a(z);
        }
    }

    C6296o(Context context, byte b, C5854ca caVar, String str, Set<C5951dx> set, C6074ft ftVar, long j, boolean z, String str2) {
        super(context, b, caVar, str, set, ftVar, j, z, str2);
        this.f15837a = caVar;
    }

    /* renamed from: a */
    public final void mo35522a(View view) {
        if (!mo35539l() && !this.f15846j && (view instanceof C6038fm)) {
            this.f15845i = true;
            C5869cj cjVar = (C5869cj) ((C6038fm) view).getTag();
            if (!((Boolean) cjVar.f14724v.get("didImpressionFire")).booleanValue()) {
                List<C5868ci> list = cjVar.f14723u;
                Map<String, String> h = m18807h(cjVar);
                List<String> arrayList = new ArrayList<>();
                for (C5868ci next : list) {
                    if ("VideoImpression".equals(next.f14815d)) {
                        if (next.f14813b.startsWith("http")) {
                            C5847bw.m17403a(next, h, (C5817bk) null);
                        }
                        arrayList = (List) next.f14817f.get("referencedEvents");
                        if (arrayList != null) {
                            for (String a : arrayList) {
                                cjVar.mo34823a(a, h);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    cjVar.mo34823a("start", h);
                    cjVar.mo34824a("Impression", h, this.f15860x);
                }
                this.f15837a.f14751d.mo34824a("Impression", m18807h(cjVar), this.f15860x);
                cjVar.f14724v.put("didImpressionFire", Boolean.TRUE);
                this.f15844h.mo35069a((byte) 0);
                if (mo35533f() != null) {
                    mo35533f().mo34510d();
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo35537j() {
        return getPlacementType() == 0 && mo35540m() != null;
    }

    public C5953dz getViewableAd() {
        VastProperties vastProperties;
        Context k = mo35538k();
        if (this.f15844h == null && k != null) {
            mo35535h();
            this.f15844h = new C5970ei(this, new C5958ec(this));
            if (this.f15843g != null) {
                for (C5951dx dxVar : this.f15843g) {
                    try {
                        if (dxVar.f15086a == 3) {
                            C5983en enVar = (C5983en) dxVar.f15087b.get("omidAdSession");
                            boolean booleanValue = ((Boolean) dxVar.f15087b.get("videoAutoPlay")).booleanValue();
                            boolean booleanValue2 = ((Boolean) dxVar.f15087b.get("videoSkippable")).booleanValue();
                            int intValue = ((Integer) dxVar.f15087b.get("videoSkipOffset")).intValue();
                            if (booleanValue2) {
                                vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) intValue, booleanValue, Position.STANDALONE);
                            } else {
                                vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                            }
                            VastProperties vastProperties2 = vastProperties;
                            if (enVar != null) {
                                this.f15844h = new C5990et(k, this.f15844h, this, enVar, vastProperties2);
                            }
                        }
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            }
        }
        return this.f15844h;
    }

    public C6234j.C6235a getFullScreenEventsListener() {
        return this.f15878C;
    }

    public View getVideoContainerView() {
        WeakReference<View> weakReference = this.f15877B;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo35542o() {
        return !this.f15852p;
    }

    /* renamed from: w */
    public final void mo35571w() {
        this.f15844h.mo35069a((byte) 5);
    }

    /* renamed from: y */
    private void m18809y() {
        this.f15844h.mo35069a((byte) Ascii.f18305SI);
    }

    /* renamed from: r */
    public final void mo35552r() {
        super.mo35552r();
        C6051fn fnVar = (C6051fn) getVideoContainerView();
        if (fnVar != null) {
            C6038fm videoView = fnVar.getVideoView();
            if (getPlacementType() == 0 && !mo35537j() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                m18806b(true);
            }
            videoView.pause();
        }
    }

    /* renamed from: z */
    private static String m18810z() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m18799a(int i) {
        long j = (long) i;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - (TimeUnit.MILLISECONDS.toSeconds(j) * 1000))});
    }

    public void destroy() {
        C6051fn fnVar;
        if (!this.f15846j) {
            if (!(getVideoContainerView() == null || (fnVar = (C6051fn) getVideoContainerView()) == null)) {
                fnVar.getVideoView().mo35213g();
            }
            super.destroy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35529b(C5847bw bwVar) {
        C6051fn fnVar;
        byte b = bwVar.f14714l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            super.mo35529b(bwVar);
        } else if (b == 3) {
            try {
                if (ShareConstants.VIDEO_URL.equals(bwVar.f14704b)) {
                    if (this.f15856t != null) {
                        this.f15856t.mo35588d("window.imraid.broadcastEvent('replay');");
                    }
                    if (mo35534g() != null) {
                        View g = mo35534g();
                        C5865ch b2 = C6281n.m18715b(g);
                        if (b2 != null) {
                            b2.mo34854a();
                        }
                        ViewGroup viewGroup = (ViewGroup) g.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(g);
                        }
                    }
                    C6051fn fnVar2 = (C6051fn) getVideoContainerView();
                    if (fnVar2 != null) {
                        fnVar2.getVideoView().mo35228i();
                        fnVar2.getVideoView().start();
                    }
                }
            } catch (Exception e) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0 && (fnVar = (C6051fn) getVideoContainerView()) != null) {
                    C6038fm videoView = fnVar.getVideoView();
                    C5869cj cjVar = (C5869cj) videoView.getTag();
                    if (videoView.getState() != 1) {
                        try {
                            if (this.f15846j) {
                                return;
                            }
                            if (this.f15850n.get() != null) {
                                if (!((Boolean) cjVar.f14724v.get("didRequestFullScreen")).booleanValue()) {
                                    cjVar.f14724v.put("didRequestFullScreen", Boolean.TRUE);
                                    cjVar.f14724v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                                    cjVar.f14724v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                                    if (videoView.getMediaPlayer().isPlaying()) {
                                        videoView.getMediaPlayer().pause();
                                        videoView.getAudioFocusManager().mo35154a();
                                    }
                                    videoView.getMediaPlayer().f15287a = 4;
                                    cjVar.f14724v.put("isFullScreen", Boolean.TRUE);
                                    cjVar.f14724v.put("seekPosition", Integer.valueOf(videoView.getMediaPlayer().getCurrentPosition()));
                                    mo35541n();
                                }
                            }
                        } catch (Exception e2) {
                            C6130gj.m18161a().mo35310a(new C6167hk(e2));
                        }
                    }
                }
            } catch (Exception e3) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in expanding video to fullscreen");
                C6130gj.m18161a().mo35310a(new C6167hk(e3));
            }
        } else if (b != 5) {
            try {
                if (1 == getPlacementType()) {
                    super.mo35529b(bwVar);
                    if (ShareConstants.VIDEO_URL.equals(bwVar.f14704b)) {
                        C6051fn fnVar3 = (C6051fn) getVideoContainerView();
                        if (fnVar3 != null) {
                            fnVar3.getVideoView().mo35227h();
                            C6038fm videoView2 = fnVar3.getVideoView();
                            if (videoView2.mo35212f() && videoView2.f15312a.isPlaying()) {
                                videoView2.f15312a.pause();
                                videoView2.f15312a.seekTo(0);
                                videoView2.f15313b.mo35154a();
                                if (videoView2.getTag() != null) {
                                    C5869cj cjVar2 = (C5869cj) videoView2.getTag();
                                    cjVar2.f14724v.put("didPause", Boolean.TRUE);
                                    cjVar2.f14724v.put("seekPosition", 0);
                                    cjVar2.f14724v.put("didCompleteQ4", Boolean.TRUE);
                                }
                                videoView2.f15312a.f15287a = 4;
                                videoView2.getPlaybackEventListener().mo35185a((byte) 4);
                            }
                            if (videoView2.f15312a != null) {
                                videoView2.f15312a.f15288b = 4;
                            }
                        }
                        m18809y();
                        return;
                    }
                    return;
                }
                C6281n.C6295c f = mo35533f();
                if (f != null) {
                    f.mo34515i();
                }
                m18809y();
            } catch (Exception e4) {
                C6130gj.m18161a().mo35310a(new C6167hk(e4));
            }
        } else {
            try {
                C6051fn fnVar4 = (C6051fn) getVideoContainerView();
                if (fnVar4 != null) {
                    C5869cj cjVar3 = (C5869cj) fnVar4.getVideoView().getTag();
                    cjVar3.f14724v.put("shouldAutoPlay", Boolean.TRUE);
                    if (cjVar3.f14727y != null) {
                        cjVar3.f14727y.f14724v.put("shouldAutoPlay", Boolean.TRUE);
                    }
                    fnVar4.getVideoView().start();
                }
            } catch (Exception e5) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in playing video");
                C6130gj.m18161a().mo35310a(new C6167hk(e5));
            }
        }
    }

    /* renamed from: a */
    public final void mo35564a(C6038fm fmVar) {
        fmVar.setIsLockScreen(this.f15854r);
        C6051fn fnVar = (C6051fn) fmVar.getParent();
        this.f15877B = new WeakReference<>(fnVar);
        C6035fl mediaController = fnVar.getVideoView().getMediaController();
        if (mediaController != null) {
            mediaController.setVideoAd(this);
        }
    }

    /* renamed from: a */
    public final void mo35562a(C5869cj cjVar) {
        if (!this.f15846j) {
            cjVar.mo34824a("error", m18807h(cjVar), (C5817bk) null);
            this.f15844h.mo35069a((byte) 17);
        }
    }

    /* renamed from: b */
    public final void mo35565b(C5869cj cjVar) {
        if (!this.f15846j) {
            if (getPlacementType() == 0) {
                if (((Integer) cjVar.f14724v.get("currentMediaVolume")).intValue() > 0 && ((Integer) cjVar.f14724v.get("lastMediaVolume")).intValue() == 0) {
                    mo35569f(cjVar);
                }
                if (((Integer) cjVar.f14724v.get("currentMediaVolume")).intValue() == 0 && ((Integer) cjVar.f14724v.get("lastMediaVolume")).intValue() > 0) {
                    mo35568e(cjVar);
                }
            }
            if (!((Boolean) cjVar.f14724v.get("didStartPlaying")).booleanValue()) {
                cjVar.f14724v.put("didStartPlaying", Boolean.TRUE);
                getViewableAd().mo35069a((byte) 6);
            }
        }
    }

    /* renamed from: c */
    public final void mo35566c(C5869cj cjVar) {
        if (!this.f15846j) {
            m18719c(mo35534g());
            cjVar.mo34824a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, m18807h(cjVar), (C5817bk) null);
            this.f15844h.mo35069a((byte) 7);
        }
    }

    /* renamed from: d */
    public final void mo35567d(C5869cj cjVar) {
        if (!this.f15846j) {
            m18721d(mo35534g());
            cjVar.mo34824a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, m18807h(cjVar), (C5817bk) null);
            this.f15844h.mo35069a((byte) 8);
        }
    }

    /* renamed from: e */
    public final void mo35568e(C5869cj cjVar) {
        if (!this.f15846j) {
            cjVar.f14724v.put("lastMediaVolume", 0);
            cjVar.mo34824a("mute", m18807h(cjVar), (C5817bk) null);
            this.f15844h.mo35069a((byte) Ascii.f18296CR);
        }
    }

    /* renamed from: f */
    public final void mo35569f(C5869cj cjVar) {
        if (!this.f15846j) {
            cjVar.f14724v.put("lastMediaVolume", 15);
            cjVar.mo34824a("unmute", m18807h(cjVar), (C5817bk) null);
            this.f15844h.mo35069a((byte) Ascii.f18306SO);
        }
    }

    /* renamed from: a */
    public final void mo35563a(C5869cj cjVar, byte b) {
        if (!this.f15846j) {
            if (b == 0) {
                cjVar.mo34824a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, m18807h(cjVar), (C5817bk) null);
                this.f15844h.mo35069a((byte) 9);
            } else if (b == 1) {
                cjVar.mo34824a("midpoint", m18807h(cjVar), (C5817bk) null);
                this.f15844h.mo35069a((byte) 10);
            } else if (b == 2) {
                cjVar.mo34824a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, m18807h(cjVar), (C5817bk) null);
                this.f15844h.mo35069a((byte) Ascii.f18309VT);
            } else if (b == 3 && !((Boolean) cjVar.f14724v.get("didQ4Fire")).booleanValue()) {
                mo35570g(cjVar);
            }
        }
    }

    /* renamed from: g */
    public final void mo35570g(C5869cj cjVar) {
        cjVar.f14724v.put("didQ4Fire", Boolean.TRUE);
        cjVar.mo34824a("complete", m18807h(cjVar), (C5817bk) null);
        this.f15844h.mo35069a((byte) Ascii.f18298FF);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public Map<String, String> m18807h(C5869cj cjVar) {
        C5849by byVar = (C5849by) cjVar.f14722t;
        HashMap hashMap = new HashMap(4);
        C6051fn fnVar = (C6051fn) this.f15877B.get();
        if (fnVar != null) {
            hashMap.put("$MD", String.valueOf((int) Math.round((((double) fnVar.getVideoView().getDuration()) * 1.0d) / 1000.0d)));
        }
        hashMap.put("[ERRORCODE]", "405");
        hashMap.put("[CONTENTPLAYHEAD]", m18799a(((Integer) cjVar.f14724v.get("seekPosition")).intValue()));
        hashMap.put("[CACHEBUSTING]", m18810z());
        hashMap.put("[ASSETURI]", cjVar.mo34867b().mo35061b());
        hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
        hashMap.put("$LTS", String.valueOf(this.f15837a.f14751d.f14742z));
        if (byVar != null) {
            hashMap.put("$STS", String.valueOf(byVar.f14742z));
        }
        if (this.f15837a != null) {
            hashMap.putAll(this.f15837a.mo34843a());
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.inmobi.media.C5869cj) r4.getTag();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m18801a(com.inmobi.media.C6296o r3, android.view.View r4, final boolean r5) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.view.View r4 = r4.findViewById(r0)
            com.inmobi.media.fm r4 = (com.inmobi.media.C6038fm) r4
            if (r4 == 0) goto L_0x0024
            java.lang.Object r0 = r4.getTag()
            com.inmobi.media.cj r0 = (com.inmobi.media.C5869cj) r0
            if (r0 == 0) goto L_0x0024
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.inmobi.media.o$3 r2 = new com.inmobi.media.o$3
            r2.<init>(r0, r5, r4)
            r1.post(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6296o.m18801a(com.inmobi.media.o, android.view.View, boolean):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m18802a(C6296o oVar, C6038fm fmVar) {
        int videoVolume;
        if (oVar.getPlacementType() == 0 && !oVar.mo35537j() && (videoVolume = fmVar.getVideoVolume()) != fmVar.getLastVolume() && fmVar.isPlaying()) {
            oVar.m18806b(videoVolume <= 0);
            fmVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18803a(C6296o oVar, C6038fm fmVar, C5869cj cjVar) {
        if (oVar.getPlacementType() == 0 && !oVar.mo35537j() && !cjVar.f14820C && !fmVar.isPlaying() && fmVar.getState() == 5) {
            oVar.m18804b(fmVar);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m18805b(C6296o oVar, C6038fm fmVar) {
        if (oVar.getPlacementType() == 0 && !oVar.mo35537j() && !oVar.f15847k) {
            oVar.m18804b(fmVar);
        }
    }
}
