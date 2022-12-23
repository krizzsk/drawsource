package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1552o;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p030b.C1450a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1924p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.activity.a */
public class C1437a implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f1678a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2102v f1679b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<AppLovinFullscreenActivity> f1680c;

    /* renamed from: d */
    private final AtomicBoolean f1681d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Messenger f1682e;

    /* renamed from: com.applovin.impl.adview.activity.a$a */
    private class C1440a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C1440a() {
        }

        /* renamed from: a */
        private void m2536a(Bundle bundle, FullscreenAdService.C1436b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.mo12960a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                C1437a.this.f1682e.send(obtain);
            } catch (RemoteException e) {
                if (C2102v.m5104a()) {
                    C2102v b = C1437a.this.f1679b;
                    b.mo15013b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.mo12960a() + ")", e);
                }
            }
        }

        /* renamed from: a */
        private void m2537a(FullscreenAdService.C1436b bVar) {
            m2536a((Bundle) null, bVar);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            m2537a(FullscreenAdService.C1436b.AD_CLICKED);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            m2537a(FullscreenAdService.C1436b.AD_DISPLAYED);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            m2537a(FullscreenAdService.C1436b.AD_HIDDEN);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            m2537a(FullscreenAdService.C1436b.AD_VIDEO_STARTED);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m2536a(bundle, FullscreenAdService.C1436b.AD_VIDEO_ENDED);
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$b */
    private static class C1441b extends Handler {

        /* renamed from: a */
        private final WeakReference<C1437a> f1689a;

        private C1441b(C1437a aVar) {
            this.f1689a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            C1437a aVar;
            if (message.what != FullscreenAdService.C1436b.AD.mo12960a() || (aVar = (C1437a) this.f1689a.get()) == null) {
                super.handleMessage(message);
                return;
            }
            aVar.m2529a(C1835b.m3894a(message.getData().getInt("ad_source")), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
        }
    }

    public C1437a(AppLovinFullscreenActivity appLovinFullscreenActivity, C1969m mVar) {
        this.f1678a = mVar;
        this.f1679b = mVar.mo14509A();
        this.f1680c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2527a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f1680c.get();
        if (appLovinFullscreenActivity != null) {
            if (C2102v.m5104a()) {
                this.f1679b.mo15012b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (C2102v.m5104a()) {
            this.f1679b.mo15016e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2529a(C1835b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1835b bVar2 = bVar;
            this.f1678a.mo14526S().mo14428a((C1887a) new C1924p(jSONObject, C1838d.m3903a(JsonUtils.getString(jSONObject, "zone_id", "")), bVar2, new AppLovinAdLoadListener() {
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) C1437a.this.f1680c.get();
                    boolean a = C2102v.m5104a();
                    if (appLovinFullscreenActivity != null) {
                        if (a) {
                            C1437a.this.f1679b.mo15012b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C1440a aVar = new C1440a();
                        C1450a.m2549a((C1839e) appLovinAd, aVar, aVar, aVar, C1437a.this.f1678a, appLovinFullscreenActivity, new C1450a.C1462a() {
                            /* renamed from: a */
                            public void mo12789a(C1450a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.mo12995d();
                            }

                            /* renamed from: a */
                            public void mo12790a(String str, Throwable th) {
                                C1552o.m2900a((C1839e) appLovinAd, aVar, str, th, appLovinFullscreenActivity);
                            }
                        });
                    } else if (a) {
                        C2102v b = C1437a.this.f1679b;
                        b.mo15016e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                public void failedToReceiveAd(int i) {
                    C1437a.this.m2527a();
                }
            }, this.f1678a));
        } catch (JSONException e) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1679b;
                vVar.mo15013b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m2527a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1681d.compareAndSet(false, true)) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1679b;
                vVar.mo15012b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f1682e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.C1436b.AD.mo12960a());
            obtain.replyTo = new Messenger(new C1441b());
            try {
                if (C2102v.m5104a()) {
                    this.f1679b.mo15012b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f1682e.send(obtain);
            } catch (RemoteException e) {
                if (C2102v.m5104a()) {
                    this.f1679b.mo15013b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m2527a();
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f1681d.compareAndSet(true, false) && C2102v.m5104a()) {
            C2102v vVar = this.f1679b;
            vVar.mo15012b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
