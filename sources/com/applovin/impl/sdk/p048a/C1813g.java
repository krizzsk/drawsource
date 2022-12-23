package com.applovin.impl.sdk.p048a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1416b;
import com.applovin.impl.p028a.C1420f;
import com.applovin.impl.p028a.C1421g;
import com.applovin.impl.p028a.C1425j;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.a.g */
public class C1813g extends C1800b {

    /* renamed from: h */
    static final /* synthetic */ boolean f2897h = (!C1813g.class.desiredAssertionStatus());

    /* renamed from: i */
    private final C1411a f2898i;

    /* renamed from: j */
    private final AtomicBoolean f2899j = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MediaEvents f2900k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final VastProperties f2901l;

    /* renamed from: m */
    private final AtomicBoolean f2902m = new AtomicBoolean();

    /* renamed from: n */
    private final AtomicBoolean f2903n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f2904o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f2905p = new AtomicBoolean();

    public C1813g(C1411a aVar) {
        super(aVar);
        this.f2898i = aVar;
        this.f2901l = aVar.mo12847e() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.mo12847e(), true, Position.STANDALONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo14059a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NATIVE, false);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2872c.mo15013b(this.f2873d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo14060a(WebView webView) {
        Set<C1425j> d;
        C1420f fVar;
        if (f2897h || this.f2898i.mo12842aS() != null) {
            ArrayList arrayList = new ArrayList();
            for (C1416b next : this.f2898i.mo12842aS().mo12886a()) {
                List<C1421g> b = next.mo12880b();
                if (!b.isEmpty()) {
                    ArrayList<C1421g> arrayList2 = new ArrayList<>();
                    for (C1421g next2 : b) {
                        if (CampaignEx.KEY_OMID.equalsIgnoreCase(next2.mo12906a())) {
                            arrayList2.add(next2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        d = next.mo12882d();
                        fVar = C1420f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        C1427l.m2495a(d, fVar, this.f2871b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList<>();
                        for (C1421g b2 : arrayList2) {
                            try {
                                arrayList3.add(new URL(b2.mo12907b()));
                            } catch (Throwable th) {
                                if (C2102v.m5104a()) {
                                    this.f2872c.mo15013b(this.f2873d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c = next.mo12881c();
                            String a = next.mo12879a();
                            if (!StringUtils.isValidString(c) || StringUtils.isValidString(a)) {
                                for (URL url : arrayList3) {
                                    arrayList.add(StringUtils.isValidString(c) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a, url, c) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                d = next.mo12882d();
                fVar = C1420f.FAILED_TO_LOAD_RESOURCE;
                C1427l.m2495a(d, fVar, this.f2871b);
            }
            String e = this.f2871b.mo14562al().mo14088e();
            if (TextUtils.isEmpty(e)) {
                if (C2102v.m5104a()) {
                    this.f2872c.mo15016e(this.f2873d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f2871b.mo14562al().mo14087d(), e, arrayList, this.f2898i.getOpenMeasurementContentUrl(), this.f2898i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                this.f2872c.mo15013b(this.f2873d, "Failed to create ad session context", th2);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo14090a(final float f, final boolean z) {
        if (this.f2902m.compareAndSet(false, true)) {
            mo14065a("track started", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.start(f, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14063a(AdSession adSession) {
        try {
            this.f2900k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2872c.mo15013b(this.f2873d, "Failed to create media events", th);
            }
        }
    }

    /* renamed from: a */
    public void mo14091a(final boolean z) {
        mo14065a("track volume changed", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    /* renamed from: c */
    public void mo14068c() {
        mo14065a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2876g.loaded(C1813g.this.f2901l);
            }
        });
    }

    /* renamed from: f */
    public void mo14092f() {
        if (this.f2903n.compareAndSet(false, true)) {
            mo14065a("track first quartile", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.firstQuartile();
                }
            });
        }
    }

    /* renamed from: g */
    public void mo14093g() {
        if (this.f2904o.compareAndSet(false, true)) {
            mo14065a("track midpoint", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.midpoint();
                }
            });
        }
    }

    /* renamed from: h */
    public void mo14094h() {
        if (this.f2905p.compareAndSet(false, true)) {
            mo14065a("track third quartile", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.thirdQuartile();
                }
            });
        }
    }

    /* renamed from: i */
    public void mo14095i() {
        mo14065a("track completed", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.complete();
            }
        });
    }

    /* renamed from: j */
    public void mo14096j() {
        mo14065a("track paused", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.pause();
            }
        });
    }

    /* renamed from: k */
    public void mo14097k() {
        mo14065a("track resumed", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.resume();
            }
        });
    }

    /* renamed from: l */
    public void mo14098l() {
        if (this.f2899j.compareAndSet(false, true)) {
            mo14065a("buffer started", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.bufferStart();
                }
            });
        }
    }

    /* renamed from: m */
    public void mo14099m() {
        if (this.f2899j.compareAndSet(true, false)) {
            mo14065a("buffer finished", (Runnable) new Runnable() {
                public void run() {
                    C1813g.this.f2900k.bufferFinish();
                }
            });
        }
    }

    /* renamed from: n */
    public void mo14100n() {
        mo14065a("track skipped", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.skipped();
            }
        });
    }

    /* renamed from: o */
    public void mo14101o() {
        mo14065a("track clicked", (Runnable) new Runnable() {
            public void run() {
                C1813g.this.f2900k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
