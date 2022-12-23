package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.C1433a;
import com.applovin.impl.adview.C1533g;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.adview.activity.p029a.C1448d;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p048a.C1809d;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.C2271R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.g */
public class C1501g extends C1450a implements C1533g {

    /* renamed from: A */
    private AtomicBoolean f1841A = new AtomicBoolean();

    /* renamed from: B */
    private boolean f1842B = Utils.isVideoMutedInitially(this.f1710b);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f1843C = -2;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long f1844D = 0;

    /* renamed from: s */
    private final C1448d f1845s = new C1448d(this.f1709a, this.f1713e, this.f1710b);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1550m f1846t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final ImageView f1847u;

    /* renamed from: v */
    private final C1433a f1848v;

    /* renamed from: w */
    private final boolean f1849w = this.f1709a.mo12849f();

    /* renamed from: x */
    private double f1850x;

    /* renamed from: y */
    private double f1851y;

    /* renamed from: z */
    private AtomicBoolean f1852z = new AtomicBoolean();

    /* renamed from: com.applovin.impl.adview.activity.b.g$a */
    private class C1506a implements View.OnClickListener {
        private C1506a() {
        }

        public void onClick(View view) {
            if (view == C1501g.this.f1846t) {
                if (C1501g.this.mo13010s()) {
                    C1501g.this.mo13007p();
                    C1501g.this.f1725q.mo14264b();
                    return;
                }
                C1501g.this.mo13088v();
            } else if (view == C1501g.this.f1847u) {
                C1501g.this.mo13090x();
            } else if (C2102v.m5104a()) {
                C2102v vVar = C1501g.this.f1711c;
                vVar.mo15016e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1501g(C1839e eVar, Activity activity, C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1506a aVar = new C1506a();
        if (eVar.mo14233q() >= 0) {
            C1550m mVar2 = new C1550m(eVar.mo14239w(), activity);
            this.f1846t = mVar2;
            mVar2.setVisibility(8);
            this.f1846t.setOnClickListener(aVar);
        } else {
            this.f1846t = null;
        }
        if (m2737a(this.f1842B, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.f1847u = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f1847u.setClickable(true);
            this.f1847u.setOnClickListener(aVar);
            m2741d(this.f1842B);
        } else {
            this.f1847u = null;
        }
        if (this.f1849w) {
            C1433a aVar2 = new C1433a(activity, ((Integer) mVar.mo14534a(C1867b.f3206cB)).intValue(), 16842874);
            this.f1848v = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            this.f1848v.setBackgroundColor(Color.parseColor("#00000000"));
            this.f1848v.setVisibility(8);
            return;
        }
        this.f1848v = null;
    }

    /* renamed from: a */
    private static boolean m2737a(boolean z, C1969m mVar) {
        if (!((Boolean) mVar.mo14534a(C1867b.f3247cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14534a(C1867b.f3248cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14534a(C1867b.f3250ct)).booleanValue();
    }

    /* renamed from: d */
    private void m2741d(boolean z) {
        if (C2049g.m4942d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1713e.getDrawable(z ? C2271R.C2272drawable.unmute_to_mute : C2271R.C2272drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1847u.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1847u.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1709a.mo14194aC() : this.f1709a.mo14195aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1847u.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m2742y() {
        if (this.f1841A.compareAndSet(false, true)) {
            mo12985a(this.f1846t, this.f1709a.mo14233q(), new Runnable() {
                public void run() {
                    long unused = C1501g.this.f1843C = -1;
                    long unused2 = C1501g.this.f1844D = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo13025a() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo13084a(double d) {
        mo12992b("javascript:al_setVideoMuted(" + this.f1842B + ");");
        C1433a aVar = this.f1848v;
        if (aVar != null) {
            aVar.mo12956b();
        }
        if (this.f1846t != null) {
            m2742y();
        }
        this.f1714f.getController().mo13123m();
        this.f1851y = d;
        mo13012u();
        if (this.f1709a.mo14216am()) {
            this.f1725q.mo14262a(this.f1709a, (Runnable) null);
        }
    }

    /* renamed from: a */
    public void mo12982a(long j) {
    }

    /* renamed from: a */
    public void mo12984a(ViewGroup viewGroup) {
        this.f1845s.mo12978a(this.f1847u, this.f1846t, this.f1715g, this.f1848v, this.f1714f, viewGroup);
        this.f1714f.getController().mo13102a((C1533g) this);
        mo12989a(false);
        C1433a aVar = this.f1848v;
        if (aVar != null) {
            aVar.mo12955a();
        }
        this.f1714f.renderAd(this.f1709a);
        if (this.f1846t != null) {
            this.f1710b.mo14526S().mo14431a(new C1944z(this.f1710b, new Runnable() {
                public void run() {
                    C1501g.this.m2742y();
                }
            }), C1918o.C1920a.MAIN, this.f1709a.mo14234r(), true);
        }
        this.f1710b.mo14526S().mo14430a((C1887a) new C1944z(this.f1710b, new Runnable() {
            public void run() {
                if (C1501g.this.f1715g != null) {
                    C1501g.this.f1709a.mo12863o().mo14062a((View) C1501g.this.f1714f, (List<C1809d>) Collections.singletonList(new C1809d(C1501g.this.f1715g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C1501g.this.f1709a.mo12863o().mo14061a((View) C1501g.this.f1714f);
                }
            }
        }), C1918o.C1920a.MAIN, 500);
        super.mo12993b(this.f1842B);
    }

    /* renamed from: a_ */
    public void mo13085a_() {
        mo13089w();
    }

    /* renamed from: b */
    public void mo13026b() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo13088v();
    }

    /* renamed from: b */
    public void mo13086b(double d) {
        this.f1850x = d;
    }

    /* renamed from: b_ */
    public void mo13087b_() {
        C1433a aVar = this.f1848v;
        if (aVar != null) {
            aVar.mo12955a();
        }
    }

    /* renamed from: c */
    public void mo13031c() {
        C1433a aVar = this.f1848v;
        if (aVar != null) {
            aVar.mo12956b();
        }
    }

    /* renamed from: d */
    public void mo12995d() {
        mo12984a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12996e() {
    }

    /* renamed from: h */
    public void mo12999h() {
        mo13004m();
        super.mo12999h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13004m() {
        super.mo12981a((int) this.f1850x, this.f1849w, mo13009r(), this.f1843C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo13009r() {
        return this.f1850x >= ((double) this.f1709a.mo14177Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo13010s() {
        return mo13011t() && !mo13009r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13012u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f1709a.mo14207ad() >= 0 || this.f1709a.mo14208ae() >= 0) {
            if (this.f1709a.mo14207ad() >= 0) {
                j = this.f1709a.mo14207ad();
            } else {
                C1834a aVar = (C1834a) this.f1709a;
                if (this.f1851y > 0.0d) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) this.f1851y);
                }
                if (aVar.mo14209af()) {
                    int l = (int) ((C1834a) this.f1709a).mo14142l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int s = (int) aVar.mo14235s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) s);
                        }
                    }
                    j2 += millis;
                }
                j = (long) (((double) j2) * (((double) this.f1709a.mo14208ae()) / 100.0d));
            }
            mo12991b(j);
        }
    }

    /* renamed from: v */
    public void mo13088v() {
        this.f1843C = SystemClock.elapsedRealtime() - this.f1844D;
        if (C2102v.m5104a()) {
            this.f1711c.mo15012b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1843C + "ms");
        }
        this.f1712d.mo14334f();
        this.f1718j++;
        if (this.f1709a.mo14240x()) {
            mo12999h();
        } else {
            mo13089w();
        }
    }

    /* renamed from: w */
    public void mo13089w() {
        if (this.f1852z.compareAndSet(false, true)) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15012b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            mo12992b("javascript:al_showPostitial();");
            C1550m mVar = this.f1846t;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.f1847u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C1433a aVar = this.f1848v;
            if (aVar != null) {
                aVar.mo12956b();
            }
            if (this.f1715g != null) {
                if (this.f1709a.mo14235s() >= 0) {
                    mo12985a(this.f1715g, this.f1709a.mo14235s(), new Runnable() {
                        public void run() {
                            C1501g.this.f1717i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f1715g.setVisibility(0);
                }
            }
            this.f1714f.getController().mo13124n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo13090x() {
        this.f1842B = !this.f1842B;
        mo12992b("javascript:al_setVideoMuted(" + this.f1842B + ");");
        m2741d(this.f1842B);
        mo12990a(this.f1842B, 0);
    }
}
