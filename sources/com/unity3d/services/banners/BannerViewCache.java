package com.unity3d.services.banners;

import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.C12080j;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class BannerViewCache {

    /* renamed from: a */
    private static BannerViewCache f29008a;

    /* renamed from: b */
    private HashMap<String, WeakReference<BannerView>> f29009b = new HashMap<>();

    /* renamed from: com.unity3d.services.banners.BannerViewCache$a */
    class C11944a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f29010a;

        /* renamed from: b */
        final /* synthetic */ BannerView f29011b;

        C11944a(BannerView.IListener iListener, BannerView bannerView) {
            this.f29010a = iListener;
            this.f29011b = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.f29010a;
            if (iListener != null) {
                iListener.onBannerLoaded(this.f29011b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$b */
    class C11945b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f29013a;

        /* renamed from: b */
        final /* synthetic */ BannerView f29014b;

        C11945b(BannerView.IListener iListener, BannerView bannerView) {
            this.f29013a = iListener;
            this.f29014b = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.f29013a;
            if (iListener != null) {
                iListener.onBannerClick(this.f29014b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$c */
    class C11946c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f29016a;

        /* renamed from: b */
        final /* synthetic */ BannerView f29017b;

        /* renamed from: c */
        final /* synthetic */ BannerErrorInfo f29018c;

        C11946c(BannerView.IListener iListener, BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            this.f29016a = iListener;
            this.f29017b = bannerView;
            this.f29018c = bannerErrorInfo;
        }

        public void run() {
            BannerView.IListener iListener = this.f29016a;
            if (iListener != null) {
                iListener.onBannerFailedToLoad(this.f29017b, this.f29018c);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$d */
    class C11947d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f29020a;

        /* renamed from: b */
        final /* synthetic */ BannerView f29021b;

        C11947d(BannerView.IListener iListener, BannerView bannerView) {
            this.f29020a = iListener;
            this.f29021b = bannerView;
        }

        public void run() {
            BannerView.IListener iListener = this.f29020a;
            if (iListener != null) {
                iListener.onBannerLeftApplication(this.f29021b);
            }
        }
    }

    public static BannerViewCache getInstance() {
        if (f29008a == null) {
            f29008a = new BannerViewCache();
        }
        return f29008a;
    }

    public synchronized String addBannerView(BannerView bannerView) {
        this.f29009b.put(bannerView.getViewId(), new WeakReference(bannerView));
        return bannerView.getViewId();
    }

    public synchronized BannerView getBannerView(String str) {
        WeakReference weakReference = this.f29009b.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (BannerView) weakReference.get();
    }

    public synchronized boolean loadWebPlayer(String str, UnityBannerSize unityBannerSize) {
        boolean z;
        BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.mo70948a(unityBannerSize);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void removeBannerView(String str) {
        this.f29009b.remove(str);
    }

    public synchronized void triggerBannerClickEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (!(bannerView == null || bannerView.getListener() == null)) {
            C12080j.m32879a((Runnable) new C11945b(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerErrorEvent(String str, BannerErrorInfo bannerErrorInfo) {
        BannerView bannerView = getBannerView(str);
        if (!(bannerView == null || bannerView.getListener() == null)) {
            C12080j.m32879a((Runnable) new C11946c(bannerView.getListener(), bannerView, bannerErrorInfo));
        }
    }

    public synchronized void triggerBannerLeftApplicationEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (!(bannerView == null || bannerView.getListener() == null)) {
            C12080j.m32879a((Runnable) new C11947d(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerLoadEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (!(bannerView == null || bannerView.getListener() == null)) {
            C12080j.m32879a((Runnable) new C11944a(bannerView.getListener(), bannerView));
        }
    }
}
