package com.unity3d.services.banners;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.C11928e;
import com.unity3d.services.banners.bridge.C11961a;
import com.unity3d.services.banners.view.C11965b;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import java.util.UUID;
import org.json.JSONObject;

public class BannerView extends RelativeLayout {

    /* renamed from: a */
    private String f28995a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f28996b = UUID.randomUUID().toString();

    /* renamed from: c */
    private UnityBannerSize f28997c;

    /* renamed from: d */
    private IListener f28998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11965b f28999e;

    /* renamed from: f */
    private IInitializationListener f29000f;

    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);
    }

    public static abstract class Listener implements IListener {
        public void onBannerClick(BannerView bannerView) {
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        public void onBannerLeftApplication(BannerView bannerView) {
        }

        public void onBannerLoaded(BannerView bannerView) {
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$a */
    class C11941a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView f29001a;

        C11941a(BannerView bannerView) {
            this.f29001a = bannerView;
        }

        public void run() {
            ViewParent parent = this.f29001a.getParent();
            if (parent != null && (parent instanceof ViewManager)) {
                ((ViewManager) parent).removeView(this.f29001a);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$b */
    class C11942b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView f29003a;

        /* renamed from: b */
        final /* synthetic */ UnityBannerSize f29004b;

        C11942b(BannerView bannerView, UnityBannerSize unityBannerSize) {
            this.f29003a = bannerView;
            this.f29004b = unityBannerSize;
        }

        public void run() {
            JSONObject c = C11928e.m32480a().mo70889c(this.f29003a.f28996b);
            JSONObject b = C11928e.m32480a().mo70887b(this.f29003a.f28996b);
            JSONObject a = C11928e.m32480a().mo70885a(this.f29003a.f28996b);
            if (this.f29003a.f28999e == null) {
                C11965b unused = this.f29003a.f28999e = new C11965b(this.f29003a.getContext(), this.f29003a.f28996b, c, b, a, this.f29004b);
                BannerView bannerView = this.f29003a;
                bannerView.addView(bannerView.f28999e);
                return;
            }
            this.f29003a.f28999e.mo71001a(c, b);
            this.f29003a.f28999e.setWebPlayerEventSettings(a);
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$c */
    class C11943c implements IInitializationListener {

        /* renamed from: a */
        final /* synthetic */ BannerView f29006a;

        C11943c(BannerView bannerView) {
            this.f29006a = bannerView;
        }

        public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
            this.f29006a.m32522d();
            if (this.f29006a.getListener() != null) {
                this.f29006a.getListener().onBannerFailedToLoad(this.f29006a, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        public void onSdkInitialized() {
            this.f29006a.m32522d();
            this.f29006a.m32517a();
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.f28995a = str;
        this.f28997c = unityBannerSize;
        m32520c();
        setBackgroundColor(0);
        C12084a.m32901a(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public void destroy() {
        BannerViewCache.getInstance().removeBannerView(this.f28996b);
        m32522d();
        C11961a.m32551a(this.f28995a);
        C12080j.m32879a((Runnable) new C11941a(this));
        C11965b bVar = this.f28999e;
        if (bVar != null) {
            bVar.mo70999a();
        }
        C12065a.m32850d("Banner [" + this.f28995a + "] was destroyed");
        this.f28996b = null;
        this.f28998d = null;
        this.f28999e = null;
    }

    public IListener getListener() {
        return this.f28998d;
    }

    public String getPlacementId() {
        return this.f28995a;
    }

    public UnityBannerSize getSize() {
        return this.f28997c;
    }

    /* access modifiers changed from: package-private */
    public String getViewId() {
        return this.f28996b;
    }

    public void load() {
        if (C12088d.m32944q()) {
            m32517a();
        } else {
            m32519b();
        }
    }

    public void setListener(IListener iListener) {
        this.f28998d = iListener;
    }

    /* renamed from: b */
    private void m32519b() {
        m32522d();
        this.f29000f = new C11943c(this);
        InitializationNotificationCenter.getInstance().addListener(this.f29000f);
    }

    /* renamed from: c */
    private void m32520c() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(C12081k.m32887b(getContext(), (float) this.f28997c.getWidth())), Math.round(C12081k.m32887b(getContext(), (float) this.f28997c.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m32522d() {
        if (this.f29000f != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.f29000f);
        }
        this.f29000f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70948a(UnityBannerSize unityBannerSize) {
        C12080j.m32879a((Runnable) new C11942b(this, unityBannerSize));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32517a() {
        C11961a.m32554a(this.f28995a, this.f28996b, this.f28997c);
    }
}
