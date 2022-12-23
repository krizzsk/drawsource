package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.C1537j;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1420f;
import com.applovin.impl.p028a.C1425j;
import com.applovin.impl.p028a.C1426k;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.p028a.C1428m;
import com.applovin.impl.p028a.C1431n;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p048a.C1809d;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.activity.b.c */
public class C1469c extends C1473e {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1411a f1760F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Set<C1425j> f1761G = new HashSet();

    public C1469c(C1839e eVar, Activity activity, C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1411a aVar = (C1411a) eVar;
        this.f1760F = aVar;
        this.f1761G.addAll(aVar.mo12833a(C1411a.C1415c.VIDEO, C1426k.f1630a));
        m2606a(C1411a.C1415c.IMPRESSION);
        m2608a(C1411a.C1415c.VIDEO, "creativeView");
        this.f1760F.mo12863o().mo14069d();
    }

    /* renamed from: E */
    private void m2604E() {
        if (mo13009r() && !this.f1761G.isEmpty()) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1711c;
                vVar.mo15015d("AppLovinFullscreenActivity", "Firing " + this.f1761G.size() + " un-fired video progress trackers when video was completed.");
            }
            m2611a(this.f1761G);
        }
    }

    /* renamed from: a */
    private void m2606a(C1411a.C1415c cVar) {
        m2607a(cVar, C1420f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2607a(C1411a.C1415c cVar, C1420f fVar) {
        m2609a(cVar, "", fVar);
    }

    /* renamed from: a */
    private void m2608a(C1411a.C1415c cVar, String str) {
        m2609a(cVar, str, C1420f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2609a(C1411a.C1415c cVar, String str, C1420f fVar) {
        m2612a(this.f1760F.mo12832a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2611a(Set<C1425j> set) {
        m2612a(set, C1420f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2612a(Set<C1425j> set, C1420f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f1781t.getCurrentPosition());
            C1431n n = this.f1760F.mo12862n();
            Uri a = n != null ? n.mo12939a() : null;
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            C1427l.m2494a(set, seconds, a, fVar, this.f1710b);
        }
    }

    /* renamed from: a */
    public void mo13030a(PointF pointF) {
        m2606a(C1411a.C1415c.VIDEO_CLICK);
        this.f1760F.mo12863o().mo14101o();
        super.mo13030a(pointF);
    }

    /* renamed from: a */
    public void mo12984a(ViewGroup viewGroup) {
        super.mo12984a(viewGroup);
        this.f1787z.mo13188a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (C1537j.C1539a) new C1537j.C1539a() {
            /* renamed from: a */
            public void mo13038a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C1469c.this.f1767B - (C1469c.this.f1781t.getDuration() - C1469c.this.f1781t.getCurrentPosition()));
                int D = C1469c.this.mo13050D();
                HashSet hashSet = new HashSet();
                for (C1425j jVar : new HashSet(C1469c.this.f1761G)) {
                    if (jVar.mo12923a(seconds, D)) {
                        hashSet.add(jVar);
                        C1469c.this.f1761G.remove(jVar);
                    }
                }
                C1469c.this.m2611a((Set<C1425j>) hashSet);
                if (D >= 25 && D < 50) {
                    C1469c.this.f1760F.mo12863o().mo14092f();
                } else if (D >= 50 && D < 75) {
                    C1469c.this.f1760F.mo12863o().mo14093g();
                } else if (D >= 75) {
                    C1469c.this.f1760F.mo12863o().mo14094h();
                }
            }

            /* renamed from: b */
            public boolean mo13039b() {
                return !C1469c.this.f1769D;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.f1782u != null) {
            arrayList.add(new C1809d(this.f1782u, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.f1783v != null) {
            arrayList.add(new C1809d(this.f1783v, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.f1786y != null) {
            arrayList.add(new C1809d(this.f1786y, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.f1784w != null) {
            arrayList.add(new C1809d(this.f1784w, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.f1785x != null) {
            arrayList.add(new C1809d(this.f1785x, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f1760F.mo12863o().mo14062a((View) this.f1780s, (List<C1809d>) arrayList);
    }

    /* renamed from: c */
    public void mo13031c() {
        m2608a(C1411a.C1415c.VIDEO, "skip");
        this.f1760F.mo12863o().mo14100n();
        super.mo13031c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13032c(long j) {
        super.mo13032c(j);
        this.f1760F.mo12863o().mo14090a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f1710b));
    }

    /* renamed from: c */
    public void mo13033c(String str) {
        m2607a(C1411a.C1415c.ERROR, C1420f.MEDIA_FILE_ERROR);
        this.f1760F.mo12863o().mo14064a(str);
        super.mo13033c(str);
    }

    /* renamed from: d */
    public void mo12995d() {
        mo12984a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12996e() {
        this.f1787z.mo13190c();
        super.mo12996e();
    }

    /* renamed from: f */
    public void mo12997f() {
        super.mo12997f();
        m2608a(this.f1769D ? C1411a.C1415c.COMPANION : C1411a.C1415c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f1760F.mo12863o().mo14097k();
    }

    /* renamed from: g */
    public void mo12998g() {
        super.mo12998g();
        m2608a(this.f1769D ? C1411a.C1415c.COMPANION : C1411a.C1415c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f1760F.mo12863o().mo14096j();
    }

    /* renamed from: h */
    public void mo12999h() {
        if (this.f1760F != null) {
            m2608a(C1411a.C1415c.VIDEO, "close");
            m2608a(C1411a.C1415c.COMPANION, "close");
        }
        super.mo12999h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13012u() {
        long j;
        int s;
        long j2 = 0;
        if (this.f1760F.mo14207ad() >= 0 || this.f1760F.mo14208ae() >= 0) {
            if (this.f1760F.mo14207ad() >= 0) {
                j = this.f1760F.mo14207ad();
            } else {
                C1411a aVar = this.f1760F;
                C1428m m = aVar.mo12861m();
                if (m != null && m.mo12930b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) m.mo12930b());
                } else if (this.f1767B > 0) {
                    j2 = 0 + this.f1767B;
                }
                if (aVar.mo14209af() && (s = (int) aVar.mo14235s()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) s);
                }
                j = (long) (((double) j2) * (((double) this.f1760F.mo14208ae()) / 100.0d));
            }
            mo12991b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo13034v() {
        super.mo13034v();
        C1411a aVar = this.f1760F;
        if (aVar != null) {
            aVar.mo12863o().mo14098l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo13035w() {
        super.mo13035w();
        C1411a aVar = this.f1760F;
        if (aVar != null) {
            aVar.mo12863o().mo14099m();
        }
    }

    /* renamed from: x */
    public void mo13036x() {
        super.mo13036x();
        m2608a(C1411a.C1415c.VIDEO, this.f1766A ? "mute" : "unmute");
        this.f1760F.mo12863o().mo14091a(this.f1766A);
    }

    /* renamed from: y */
    public void mo13037y() {
        m2604E();
        if (!C1427l.m2501c(this.f1760F)) {
            if (C2102v.m5104a()) {
                this.f1711c.mo15012b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo12999h();
        } else if (!this.f1769D) {
            m2608a(C1411a.C1415c.COMPANION, "creativeView");
            this.f1760F.mo12863o().mo14095i();
            this.f1760F.mo12863o().mo14062a((View) this.f1714f, (List<C1809d>) Collections.singletonList(new C1809d(this.f1714f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo13037y();
        }
    }
}
