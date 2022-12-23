package com.unity3d.services.banners;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.properties.C11963a;
import com.unity3d.services.banners.view.C11964a;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.properties.C12084a;
import java.util.concurrent.TimeUnit;

public final class UnityBanners {

    /* renamed from: a */
    private static UnityBanners f29031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public IUnityBannerListener f29032b;

    /* renamed from: c */
    private C11964a f29033c = C11964a.NONE;

    /* renamed from: d */
    private C11957d f29034d;

    /* renamed from: com.unity3d.services.banners.UnityBanners$a */
    class C11950a extends BannerView.Listener {

        /* renamed from: a */
        final /* synthetic */ UnityBanners f29035a;

        /* renamed from: b */
        final /* synthetic */ C11957d f29036b;

        C11950a(UnityBanners unityBanners, C11957d dVar) {
            this.f29035a = unityBanners;
            this.f29036b = dVar;
        }

        public void onBannerClick(BannerView bannerView) {
            if (this.f29035a.f29032b != null) {
                this.f29035a.f29032b.onUnityBannerClick(bannerView.getPlacementId());
            }
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            if (this.f29035a.f29032b != null) {
                IUnityBannerListener a = this.f29035a.f29032b;
                a.onUnityBannerError(bannerView.getPlacementId() + " " + bannerErrorInfo.errorMessage);
            }
        }

        public void onBannerLoaded(BannerView bannerView) {
            if (this.f29035a.f29032b != null) {
                this.f29035a.f29032b.onUnityBannerLoaded(bannerView.getPlacementId(), this.f29036b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$b */
    static class C11951b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f29038a;

        C11951b(String str) {
            this.f29038a = str;
        }

        public void run() {
            IUnityBannerListener bannerListener = UnityBanners.getBannerListener();
            if (bannerListener != null) {
                bannerListener.onUnityBannerError(this.f29038a);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$c */
    private class C11952c extends RelativeLayout {

        /* renamed from: a */
        private String f29039a;

        /* renamed from: b */
        private boolean f29040b = false;

        /* renamed from: c */
        private long f29041c = 30;

        /* renamed from: d */
        private BannerView f29042d;

        /* renamed from: e */
        private boolean f29043e = false;

        /* renamed from: f */
        private boolean f29044f = false;

        /* renamed from: g */
        private C11956d f29045g;

        /* renamed from: h */
        private Handler f29046h;

        /* renamed from: i */
        private Runnable f29047i;

        /* renamed from: j */
        private long f29048j;

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$a */
        class C11953a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ UnityBanners f29050a;

            /* renamed from: b */
            final /* synthetic */ C11952c f29051b;

            C11953a(UnityBanners unityBanners, C11952c cVar) {
                this.f29050a = unityBanners;
                this.f29051b = cVar;
            }

            public void run() {
                this.f29051b.m32537c();
            }
        }

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$b */
        class C11954b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11952c f29053a;

            C11954b(C11952c cVar) {
                this.f29053a = cVar;
            }

            public void run() {
                this.f29053a.removeAllViews();
            }
        }

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$c */
        class C11955c extends C11956d {

            /* renamed from: b */
            final /* synthetic */ C11952c f29055b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11955c(C11952c cVar) {
                super(C11952c.this, (C11950a) null);
                this.f29055b = cVar;
            }

            public void onActivityDestroyed(Activity activity) {
                this.f29055b.m32541f();
            }

            public void onActivityPaused(Activity activity) {
                this.f29055b.m32541f();
            }

            public void onActivityResumed(Activity activity) {
                this.f29055b.m32540e();
            }

            public void onActivityStopped(Activity activity) {
                this.f29055b.m32541f();
            }
        }

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$d */
        private class C11956d implements Application.ActivityLifecycleCallbacks {
            private C11956d() {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            /* synthetic */ C11956d(C11952c cVar, C11950a aVar) {
                this();
            }
        }

        public C11952c(Activity activity, String str, UnityBannerSize unityBannerSize) {
            super(activity);
            this.f29039a = str;
            this.f29046h = new Handler();
            this.f29047i = new C11953a(UnityBanners.this, this);
            m32539d();
            setBackgroundColor(0);
            BannerView bannerView = new BannerView(activity, str, unityBannerSize);
            this.f29042d = bannerView;
            addView(bannerView);
        }

        /* renamed from: d */
        private void m32539d() {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m32540e() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f29048j;
            if (uptimeMillis < j) {
                this.f29046h.postAtTime(this.f29047i, j);
            } else {
                m32537c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m32541f() {
            Runnable runnable;
            Handler handler = this.f29046h;
            if (handler != null && (runnable = this.f29047i) != null) {
                handler.removeCallbacks(runnable);
            }
        }

        /* renamed from: g */
        private void m32542g() {
            if (!this.f29044f && Build.VERSION.SDK_INT >= 14 && C12084a.m32907d() != null) {
                this.f29045g = new C11955c(this);
                this.f29044f = true;
                C12084a.m32907d().registerActivityLifecycleCallbacks(this.f29045g);
            }
        }

        /* renamed from: h */
        private void m32543h() {
            if (this.f29044f && Build.VERSION.SDK_INT >= 14 && this.f29045g != null && C12084a.m32907d() != null) {
                this.f29044f = false;
                C12084a.m32907d().unregisterActivityLifecycleCallbacks(this.f29045g);
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            m32542g();
            if (this.f29043e) {
                m32540e();
            } else {
                this.f29043e = true;
            }
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            m32541f();
            m32543h();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m32537c() {
            this.f29042d.load();
            long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.SECONDS.toMillis(this.f29041c);
            this.f29048j = uptimeMillis;
            this.f29046h.postAtTime(this.f29047i, uptimeMillis);
        }

        /* renamed from: a */
        public void mo70980a(BannerView.IListener iListener) {
            this.f29042d.setListener(iListener);
        }

        /* renamed from: b */
        public void mo70981b() {
            if (!this.f29040b) {
                this.f29040b = true;
                Integer a = C11963a.m32558a().mo70996a(this.f29039a);
                if (a != null) {
                    this.f29041c = a.longValue();
                }
                m32537c();
            }
        }

        /* renamed from: a */
        public void mo70979a() {
            m32541f();
            this.f29042d.destroy();
            C12080j.m32879a((Runnable) new C11954b(this));
            this.f29042d = null;
        }
    }

    private UnityBanners() {
    }

    /* renamed from: b */
    private static UnityBanners m32534b() {
        if (f29031a == null) {
            f29031a = new UnityBanners();
        }
        return f29031a;
    }

    @Deprecated
    public static void destroy() {
        m32534b().m32531a();
    }

    @Deprecated
    public static IUnityBannerListener getBannerListener() {
        return m32534b().f29032b;
    }

    @Deprecated
    public static void loadBanner(Activity activity, String str) {
        C12065a.m32839a();
        if (!UnityAds.isSupported()) {
            m32533a("Unity Ads is not supported on this device.");
        }
        if (!UnityAds.isInitialized()) {
            m32533a("UnityAds is not initialized.");
            return;
        }
        C12084a.m32901a(activity);
        m32534b().m32532a(activity, str);
    }

    @Deprecated
    public static void setBannerListener(IUnityBannerListener iUnityBannerListener) {
        m32534b().f29032b = iUnityBannerListener;
    }

    @Deprecated
    public static void setBannerPosition(C11964a aVar) {
        m32534b().f29033c = aVar;
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$d */
    private class C11957d extends FrameLayout {

        /* renamed from: a */
        private C11964a f29058a = C11964a.NONE;

        /* renamed from: b */
        private C11952c f29059b;

        /* renamed from: com.unity3d.services.banners.UnityBanners$d$a */
        class C11958a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11957d f29061a;

            C11958a(C11957d dVar) {
                this.f29061a = dVar;
            }

            public void run() {
                this.f29061a.removeAllViews();
                C12081k.m32885a(this.f29061a);
            }
        }

        public C11957d(Context context, C11952c cVar) {
            super(context);
            this.f29059b = cVar;
            addView(cVar);
            m32547b();
            setBackgroundColor(0);
        }

        /* renamed from: b */
        private void m32547b() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f29058a.mo70998a();
            setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public void mo70994a(C11964a aVar) {
            this.f29058a = aVar;
            m32547b();
        }

        /* renamed from: a */
        public void mo70993a() {
            C12080j.m32879a((Runnable) new C11958a(this));
            C11952c cVar = this.f29059b;
            if (cVar != null) {
                cVar.mo70979a();
                this.f29059b = null;
            }
        }
    }

    /* renamed from: a */
    private void m32532a(Activity activity, String str) {
        if (this.f29034d == null) {
            C11952c cVar = new C11952c(activity, str, new UnityBannerSize(320, 50));
            C11957d dVar = new C11957d(activity, cVar);
            dVar.mo70994a(this.f29033c);
            this.f29034d = dVar;
            cVar.mo70980a((BannerView.IListener) new C11950a(this, dVar));
            cVar.mo70981b();
            return;
        }
        m32533a("A Banner is already in use, please call destroy before loading another banner!");
    }

    /* renamed from: a */
    private void m32531a() {
        C11957d dVar = this.f29034d;
        if (dVar != null) {
            dVar.mo70993a();
            this.f29034d = null;
        }
    }

    /* renamed from: a */
    private static void m32533a(String str) {
        C12080j.m32879a((Runnable) new C11951b(str));
    }
}
