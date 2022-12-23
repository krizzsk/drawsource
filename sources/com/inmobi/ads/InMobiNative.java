package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.C5761as;
import com.inmobi.media.C5840bp;
import com.inmobi.media.C6130gj;
import com.inmobi.media.C6167hk;
import com.inmobi.media.C6173ho;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6184hx;
import com.inmobi.media.C6195ic;
import com.inmobi.media.C6215il;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19575a = InMobiNative.class.getSimpleName();

    /* renamed from: b */
    private C5761as f19576b;

    /* renamed from: c */
    private NativeCallbacks f19577c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public NativeAdEventListener f19578d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public VideoEventListener f19579e;

    /* renamed from: f */
    private WeakReference<View> f19580f;

    /* renamed from: g */
    private boolean f19581g;

    /* renamed from: h */
    private C5840bp f19582h = new C5840bp();

    /* renamed from: i */
    private WeakReference<Context> f19583i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public LockScreenListener f19584j;

    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    public InMobiNative(Context context, long j, NativeAdEventListener nativeAdEventListener) throws SdkNotInitializedException {
        if (C6183hw.m18323b()) {
            this.f19582h.f14690a = j;
            this.f19583i = new WeakReference<>(context);
            this.f19578d = nativeAdEventListener;
            this.f19577c = new NativeCallbacks(this);
            this.f19576b = new C5761as(this.f19577c);
            return;
        }
        throw new SdkNotInitializedException(f19575a);
    }

    public final void setListener(NativeAdEventListener nativeAdEventListener) {
        this.f19578d = nativeAdEventListener;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        this.f19579e = videoEventListener;
    }

    /* renamed from: a */
    private boolean m23141a(boolean z) {
        if (!z ? this.f19578d != null : !(this.f19576b == null && this.f19578d == null)) {
            WeakReference<Context> weakReference = this.f19583i;
            if (weakReference != null && weakReference.get() != null) {
                return true;
            }
            C6195ic.m18378a((byte) 1, f19575a, "Context supplied is null, your call is ignored.");
            return false;
        }
        C6195ic.m18378a((byte) 1, f19575a, "Listener supplied is null, your call is ignored.");
        return false;
    }

    public final void getSignals() {
        if (m23141a(false)) {
            this.f19577c.mo56259a();
            m23143b();
            this.f19576b.mo34652b((PublisherCallbacks) this.f19577c);
        }
    }

    public final void load(byte[] bArr) {
        if (m23141a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                WeakReference<Context> weakReference = this.f19583i;
                C6215il.m18446a(weakReference == null ? null : (Context) weakReference.get());
            }
            this.f19582h.f14694e = "AB";
            m23143b();
            this.f19577c.mo56259a();
            this.f19576b.mo34580a(bArr, (PublisherCallbacks) this.f19577c);
        }
    }

    /* renamed from: b */
    private void m23143b() {
        WeakReference<Context> weakReference = this.f19583i;
        Context context = weakReference == null ? null : (Context) weakReference.get();
        if (context != null) {
            this.f19576b.mo34623a(this.f19582h, context);
        }
    }

    public final void load() {
        try {
            if (m23141a(true)) {
                this.f19577c.mo56259a();
                if (this.f19581g) {
                    this.f19576b.mo34525a(this.f19576b.mo34587m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    C6195ic.m18378a((byte) 1, f19575a, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    C6215il.m18446a(this.f19583i == null ? null : (Context) this.f19583i.get());
                }
                this.f19582h.f14694e = "NonAB";
                m23143b();
                this.f19576b.mo34626n();
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            C6195ic.m18378a((byte) 1, "InMobi", "Could not load ad; SDK encountered an unexpected error");
        }
    }

    public final void load(Context context) {
        if (m23141a(true)) {
            this.f19583i = new WeakReference<>(context);
            load();
        }
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        WeakReference<Context> weakReference = this.f19583i;
        if (weakReference == null || weakReference.get() == null) {
            C6195ic.m18378a((byte) 1, f19575a, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            this.f19576b.mo34624b(this.f19582h, (Context) this.f19583i.get());
            this.f19584j = lockScreenListener;
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19575a, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f19576b.mo34628p();
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19575a, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void pause() {
        try {
            this.f19576b.mo34629q();
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        try {
            this.f19576b.mo34630r();
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ Exception -> 0x00db }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8 A[Catch:{ Exception -> 0x00db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getPrimaryViewOfWidth(android.content.Context r7, android.view.View r8, android.view.ViewGroup r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "InMobi"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x000e
            java.lang.String r7 = f19575a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "View can not be rendered using null context"
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x000e:
            com.inmobi.media.as r3 = r6.f19576b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.af r3 = r3.mo34587m()     // Catch:{ Exception -> 0x00db }
            if (r3 != 0) goto L_0x0018
            r3 = r2
            goto L_0x0020
        L_0x0018:
            com.inmobi.media.as r3 = r6.f19576b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.af r3 = r3.mo34587m()     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.aq r3 = (com.inmobi.media.C5758aq) r3     // Catch:{ Exception -> 0x00db }
        L_0x0020:
            if (r3 != 0) goto L_0x002a
            java.lang.String r7 = f19575a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()"
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x002a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00db }
            r6.f19583i = r4     // Catch:{ Exception -> 0x00db }
            r3.mo34408a(r7)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00db }
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r5 = r5.getThread()     // Catch:{ Exception -> 0x00db }
            if (r4 != r5) goto L_0x00b7
            boolean r4 = com.inmobi.media.C6219in.m18467h()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0050
            r3.mo34549Y()     // Catch:{ Exception -> 0x00db }
        L_0x004d:
            r9 = r2
            goto L_0x00ca
        L_0x0050:
            boolean r4 = r3.mo34487q()     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x005f
            java.lang.String r8 = "Ad has expired, please create a new instance."
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            r3.mo34549Y()     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x005f:
            boolean r4 = r3.mo34550Z()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0092
            byte r4 = r3.mo34477j()     // Catch:{ Exception -> 0x00db }
            r5 = 6
            if (r4 == r5) goto L_0x0092
            java.lang.String r8 = com.inmobi.media.C5758aq.f14462y     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView()."
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f14465z     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f14465z     // Catch:{ Exception -> 0x00db }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            android.view.View r9 = new android.view.View     // Catch:{ Exception -> 0x00db }
            android.content.Context r10 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ Exception -> 0x00db }
            r9.<init>(r10)     // Catch:{ Exception -> 0x00db }
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()     // Catch:{ Exception -> 0x00db }
            r9.setLayoutParams(r8)     // Catch:{ Exception -> 0x00db }
            goto L_0x00ca
        L_0x0092:
            com.inmobi.media.n r4 = r3.f14347g     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x004d
            boolean r5 = r3.f14463A     // Catch:{ Exception -> 0x00db }
            r4.f15854r = r5     // Catch:{ Exception -> 0x00db }
            r4.f15853q = r10     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.dz r10 = r4.getViewableAd()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = r10.mo35067a(r8, r9, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00db }
            r3.f14465z = r9     // Catch:{ Exception -> 0x00db }
            android.os.Handler r9 = r3.f14349i     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.aq$1 r4 = new com.inmobi.media.aq$1     // Catch:{ Exception -> 0x00db }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00db }
            r9.post(r4)     // Catch:{ Exception -> 0x00db }
            r9 = r8
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r8 = "Please ensure that you call getPrimaryView() on the UI thread"
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus r8 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r9 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD     // Catch:{ Exception -> 0x00db }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r9 = 0
            r10 = 44
            r3.mo34411a((com.inmobi.ads.InMobiAdRequestStatus) r8, (boolean) r9, (byte) r10)     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x00ca:
            r7.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r6.f19580f = r7     // Catch:{ Exception -> 0x00db }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x00db }
            if (r7 != 0) goto L_0x00d8
            return r2
        L_0x00d8:
            r6.f19581g = r1     // Catch:{ Exception -> 0x00db }
            return r7
        L_0x00db:
            r7 = move-exception
            com.inmobi.media.gj r8 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r9 = new com.inmobi.media.hk
            r9.<init>(r7)
            r8.mo35310a((com.inmobi.media.C6167hk) r9)
            java.lang.String r7 = "Could not pause ad; SDK encountered an unexpected error"
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r0, (java.lang.String) r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiNative.getPrimaryViewOfWidth(android.content.Context, android.view.View, android.view.ViewGroup, int):android.view.View");
    }

    @Deprecated
    public final View getPrimaryViewOfWidth(View view, ViewGroup viewGroup, int i) {
        C6195ic.m18378a((byte) 1, f19575a, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"getPrimaryViewOfWidth(View, ViewGroup, int)"}));
        WeakReference<Context> weakReference = this.f19583i;
        if (weakReference != null && weakReference.get() != null) {
            return getPrimaryViewOfWidth((Context) this.f19583i.get(), view, viewGroup, i);
        }
        C6195ic.m18378a((byte) 1, f19575a, "InMobiNative is not initialized or provided context is null.");
        return null;
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f19576b.mo34631s();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the ad customJson ; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f19576b.mo34632t();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the ad title; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f19576b.mo34633u();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the description; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f19576b.mo34634v();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the iconUrl; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f19576b.mo34635w();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f19576b.mo34636x();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get the ctaText; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f19576b.mo34637y();
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            C6195ic.m18378a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            return 0.0f;
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f19576b.mo34638z();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get isAppDownload; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return false;
        }
    }

    public final Boolean isVideo() {
        try {
            return this.f19576b.mo34621A();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Could not get isVideo; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f19576b.mo34622B();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    public final boolean isReady() {
        return this.f19576b.mo34625l();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19576b.mo34648D();
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6184hx.m18346a(map.get("tp"));
            C6184hx.m18348b(map.get("tp-ver"));
        }
        this.f19582h.f14692c = map;
    }

    public final void setKeywords(String str) {
        this.f19582h.f14691b = str;
    }

    public final void setContentUrl(String str) {
        this.f19582h.f14695f = str;
    }

    public final void destroy() {
        try {
            View view = this.f19580f == null ? null : (View) this.f19580f.get();
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f19576b.mo34627o();
            this.f19578d = null;
            this.f19579e = null;
            this.f19581g = false;
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19575a, "Failed to destroy ad; SDK encountered an unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19576b.mo34647C();
    }

    public static final class NativeCallbacks extends PublisherCallbacks {

        /* renamed from: a */
        private WeakReference<InMobiNative> f19585a;

        /* renamed from: b */
        private boolean f19586b = true;

        public final byte getType() {
            return 0;
        }

        NativeCallbacks(InMobiNative inMobiNative) {
            this.f19585a = new WeakReference<>(inMobiNative);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo56259a() {
            this.f19586b = false;
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdReceived(inMobiNative);
            }
            if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdFetchSuccessful(inMobiNative, adMetaInfo);
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            onAdLoadFailed(inMobiAdRequestStatus);
        }

        public final void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f19586b) {
                this.f19586b = true;
                if (inMobiNative.f19578d != null) {
                    inMobiNative.f19578d.onAdLoadSucceeded(inMobiNative);
                }
                if (inMobiNative.f19578d != null) {
                    inMobiNative.f19578d.onAdLoadSucceeded(inMobiNative, adMetaInfo);
                }
            }
        }

        public final void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f19586b) {
                this.f19586b = true;
                if (inMobiNative.f19578d != null) {
                    inMobiNative.f19578d.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
                }
            }
        }

        public final void onAdWillDisplay() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19584j != null) {
                inMobiNative.f19584j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdFullScreenWillDisplay(inMobiNative);
            }
        }

        public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdFullScreenDisplayed(inMobiNative);
            }
        }

        public final void onAdDismissed() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdFullScreenDismissed(inMobiNative);
            }
        }

        public final void onAdClicked(Map<Object, Object> map) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdClicked(inMobiNative);
            }
        }

        public final void onUserLeftApplication() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19584j != null) {
                inMobiNative.f19584j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onUserWillLeaveApplication(inMobiNative);
            }
        }

        public final void onAdImpressed() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdImpressed(inMobiNative);
            }
        }

        public final void onVideoCompleted() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19579e != null) {
                inMobiNative.f19579e.onVideoCompleted(inMobiNative);
            }
        }

        public final void onVideoSkipped() {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19579e != null) {
                inMobiNative.f19579e.onVideoSkipped(inMobiNative);
            }
        }

        public final void onAudioStateChanged(boolean z) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19579e != null) {
                inMobiNative.f19579e.onAudioStateChanged(inMobiNative, z);
            }
        }

        public final void onRequestPayloadCreated(byte[] bArr) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onRequestPayloadCreated(bArr);
            }
        }

        public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
            }
        }

        public final void onAdImpression(C6173ho hoVar) {
            InMobiNative inMobiNative = (InMobiNative) this.f19585a.get();
            if (inMobiNative == null) {
                C6195ic.m18378a((byte) 1, InMobiNative.f19575a, "Lost reference to InMobiNative! callback cannot be given");
                if (hoVar != null) {
                    hoVar.mo35384b();
                }
            } else if (inMobiNative.f19578d != null) {
                inMobiNative.f19578d.onAdImpression(inMobiNative);
                if (hoVar != null) {
                    hoVar.mo35382a();
                }
            } else if (hoVar != null) {
                hoVar.mo35384b();
            }
        }
    }
}
