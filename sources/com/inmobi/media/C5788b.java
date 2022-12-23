package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.b */
/* compiled from: BannerPreloadCallbacks */
public class C5788b extends PublisherCallbacks {

    /* renamed from: a */
    protected WeakReference<InMobiBanner> f14552a;

    public byte getType() {
        return 1;
    }

    public C5788b(InMobiBanner inMobiBanner) {
        this.f14552a = new WeakReference<>(inMobiBanner);
    }

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
        }
    }

    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.inmobi.media.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.inmobi.media.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.inmobi.media.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.view.animation.AlphaAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.inmobi.media.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.inmobi.media.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.inmobi.media.a$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoadSucceeded(com.inmobi.ads.AdMetaInfo r11) {
        /*
            r10 = this;
            java.lang.ref.WeakReference<com.inmobi.ads.InMobiBanner> r0 = r10.f14552a
            java.lang.Object r0 = r0.get()
            com.inmobi.ads.InMobiBanner r0 = (com.inmobi.ads.InMobiBanner) r0
            if (r0 == 0) goto L_0x00a9
            com.inmobi.media.aj r1 = r0.f19546c
            boolean r1 = r1.mo34594t()
            if (r1 != 0) goto L_0x00a9
            com.inmobi.media.aj r1 = r0.f19546c
            boolean r1 = r1.mo34584b((android.widget.RelativeLayout) r0)
            if (r1 == 0) goto L_0x00a9
            com.inmobi.media.aj r1 = r0.f19546c
            r1.mo34590p()
            com.inmobi.ads.InMobiBanner$AnimationType r1 = r0.f19547d     // Catch:{ Exception -> 0x008c }
            int r2 = r0.getWidth()     // Catch:{ Exception -> 0x008c }
            float r2 = (float) r2     // Catch:{ Exception -> 0x008c }
            int r3 = r0.getHeight()     // Catch:{ Exception -> 0x008c }
            float r3 = (float) r3     // Catch:{ Exception -> 0x008c }
            r4 = 0
            com.inmobi.ads.InMobiBanner$AnimationType r5 = com.inmobi.ads.InMobiBanner.AnimationType.ANIMATION_ALPHA     // Catch:{ Exception -> 0x008c }
            r6 = 0
            if (r1 != r5) goto L_0x004a
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation     // Catch:{ Exception -> 0x008c }
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.<init>(r1, r2)     // Catch:{ Exception -> 0x008c }
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.setDuration(r1)     // Catch:{ Exception -> 0x008c }
            r4.setFillAfter(r6)     // Catch:{ Exception -> 0x008c }
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator     // Catch:{ Exception -> 0x008c }
            r1.<init>()     // Catch:{ Exception -> 0x008c }
            r4.setInterpolator(r1)     // Catch:{ Exception -> 0x008c }
            goto L_0x0081
        L_0x004a:
            com.inmobi.ads.InMobiBanner$AnimationType r5 = com.inmobi.ads.InMobiBanner.AnimationType.ROTATE_HORIZONTAL_AXIS     // Catch:{ Exception -> 0x008c }
            r7 = 500(0x1f4, double:2.47E-321)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L_0x0068
            com.inmobi.media.a$a r4 = new com.inmobi.media.a$a     // Catch:{ Exception -> 0x008c }
            float r2 = r2 / r9
            float r3 = r3 / r9
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x008c }
            r4.setDuration(r7)     // Catch:{ Exception -> 0x008c }
            r4.setFillAfter(r6)     // Catch:{ Exception -> 0x008c }
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator     // Catch:{ Exception -> 0x008c }
            r1.<init>()     // Catch:{ Exception -> 0x008c }
            r4.setInterpolator(r1)     // Catch:{ Exception -> 0x008c }
            goto L_0x0081
        L_0x0068:
            com.inmobi.ads.InMobiBanner$AnimationType r5 = com.inmobi.ads.InMobiBanner.AnimationType.ROTATE_VERTICAL_AXIS     // Catch:{ Exception -> 0x008c }
            if (r1 != r5) goto L_0x0081
            com.inmobi.media.a$b r4 = new com.inmobi.media.a$b     // Catch:{ Exception -> 0x008c }
            float r2 = r2 / r9
            float r3 = r3 / r9
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x008c }
            r4.setDuration(r7)     // Catch:{ Exception -> 0x008c }
            r4.setFillAfter(r6)     // Catch:{ Exception -> 0x008c }
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator     // Catch:{ Exception -> 0x008c }
            r1.<init>()     // Catch:{ Exception -> 0x008c }
            r4.setInterpolator(r1)     // Catch:{ Exception -> 0x008c }
        L_0x0081:
            com.inmobi.media.aj r1 = r0.f19546c     // Catch:{ Exception -> 0x008c }
            r1.mo34578a((android.widget.RelativeLayout) r0)     // Catch:{ Exception -> 0x008c }
            if (r4 == 0) goto L_0x0094
            r0.startAnimation(r4)     // Catch:{ Exception -> 0x008c }
            goto L_0x0094
        L_0x008c:
            r1 = 1
            java.lang.String r2 = com.inmobi.ads.InMobiBanner.f19544a
            java.lang.String r3 = "Unexpected error while displaying Banner Ad."
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0094:
            com.inmobi.ads.listeners.BannerAdEventListener r1 = r0.f19545b
            if (r1 == 0) goto L_0x009d
            com.inmobi.ads.listeners.BannerAdEventListener r1 = r0.f19545b
            r1.onAdLoadSucceeded(r0)
        L_0x009d:
            com.inmobi.ads.listeners.BannerAdEventListener r1 = r0.f19545b
            if (r1 == 0) goto L_0x00a6
            com.inmobi.ads.listeners.BannerAdEventListener r1 = r0.f19545b
            r1.onAdLoadSucceeded(r0, r11)
        L_0x00a6:
            r0.mo56187b()
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5788b.onAdLoadSucceeded(com.inmobi.ads.AdMetaInfo):void");
    }

    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null) {
            if (inMobiBanner.f19545b != null) {
                inMobiBanner.f19545b.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
            }
            inMobiBanner.mo56187b();
        }
    }

    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onAdDisplayed(inMobiBanner);
        }
    }

    public void onAdDismissed() {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null) {
            if (inMobiBanner.f19545b != null) {
                inMobiBanner.f19545b.onAdDismissed(inMobiBanner);
            }
            inMobiBanner.mo56187b();
        }
    }

    public void onAdClicked(Map<Object, Object> map) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onAdClicked(inMobiBanner, map);
        }
    }

    public void onUserLeftApplication() {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onUserLeftApplication(inMobiBanner);
        }
    }

    public void onRewardsUnlocked(Map<Object, Object> map) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onRewardsUnlocked(inMobiBanner, map);
        }
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onRequestPayloadCreated(bArr);
        }
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
        }
    }

    public void onAdImpression(C6173ho hoVar) {
        InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
        if (inMobiBanner != null && inMobiBanner.f19545b != null) {
            inMobiBanner.f19545b.onAdImpression(inMobiBanner);
            if (hoVar != null) {
                hoVar.mo35382a();
            }
        } else if (hoVar != null) {
            hoVar.mo35384b();
        }
    }
}
