package com.unity3d.services.ads.gmascar;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.gmascar.adapters.C11840a;
import com.unity3d.services.ads.gmascar.bridges.C11841a;
import com.unity3d.services.ads.gmascar.bridges.C11844c;
import com.unity3d.services.ads.gmascar.bridges.C11846d;
import com.unity3d.services.ads.gmascar.bridges.C11849e;
import com.unity3d.services.ads.gmascar.finder.C11851a;
import com.unity3d.services.ads.gmascar.finder.C11852b;
import com.unity3d.services.ads.gmascar.finder.C11853c;
import com.unity3d.services.ads.gmascar.handlers.C11856b;
import com.unity3d.services.ads.gmascar.handlers.C11857c;
import com.unity3d.services.ads.gmascar.handlers.C11858d;
import com.unity3d.services.ads.gmascar.handlers.C11859e;
import com.unity3d.services.ads.gmascar.utils.C11861a;
import com.unity3d.services.core.misc.C12070a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.timer.C12128b;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.unity3d.services.ads.gmascar.a */
/* compiled from: GMAScarAdapterBridge */
public class C11839a {

    /* renamed from: a */
    private IScarAdapter f28752a;

    /* renamed from: b */
    private final C11849e f28753b;

    /* renamed from: c */
    private final C11853c f28754c;

    /* renamed from: d */
    private final C11846d f28755d;

    /* renamed from: e */
    private final C11844c f28756e;

    /* renamed from: f */
    private final C11841a f28757f;

    /* renamed from: g */
    private final C11852b f28758g;

    /* renamed from: h */
    private final C11851a f28759h;

    /* renamed from: i */
    private final C11859e f28760i = new C11859e();

    /* renamed from: j */
    private final C11840a f28761j = new C11840a();

    /* renamed from: k */
    private final C11861a f28762k;

    public C11839a() {
        C11849e eVar = new C11849e();
        this.f28753b = eVar;
        C11844c cVar = new C11844c();
        this.f28756e = cVar;
        C11846d dVar = new C11846d();
        this.f28755d = dVar;
        C11841a aVar = new C11841a();
        this.f28757f = aVar;
        C11852b bVar = new C11852b(eVar, dVar, cVar, aVar);
        this.f28758g = bVar;
        C11851a aVar2 = new C11851a(eVar, dVar, cVar, aVar);
        this.f28759h = aVar2;
        this.f28754c = new C11853c(eVar, bVar, aVar2);
        this.f28762k = new C11861a();
    }

    /* renamed from: a */
    public void mo70779a(String[] strArr, String[] strArr2) {
        this.f28752a = m32326a();
        C11858d dVar = new C11858d();
        IScarAdapter iScarAdapter = this.f28752a;
        if (iScarAdapter != null) {
            iScarAdapter.getSCARSignals(C12084a.m32908e(), strArr, strArr2, dVar);
        } else {
            this.f28760i.handleError(GMAAdsError.InternalSignalsError("Could not create SCAR adapter object"));
        }
    }

    /* renamed from: b */
    public void mo70780b() {
        this.f28754c.mo70803b();
    }

    /* renamed from: c */
    public void mo70781c() {
        if (this.f28758g.mo70799a()) {
            this.f28762k.mo70807a(GMAEvent.SCAR_PRESENT, new Object[0]);
            this.f28759h.mo70797b();
            return;
        }
        this.f28760i.handleError(new GMAAdsError(GMAEvent.SCAR_NOT_PRESENT, new Object[0]));
    }

    /* renamed from: d */
    public boolean mo70782d() {
        return this.f28759h.mo70798c();
    }

    /* renamed from: b */
    private void m32329b(ScarAdMetadata scarAdMetadata) {
        this.f28752a.loadRewardedAd(C12084a.m32908e(), scarAdMetadata, new C11857c(scarAdMetadata, m32327a(scarAdMetadata.getVideoLengthMs())));
    }

    /* renamed from: a */
    public void mo70778a(boolean z, String str, String str2, String str3, String str4, int i) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2, str4, str3, Integer.valueOf(i));
        IScarAdapter a = m32326a();
        this.f28752a = a;
        if (a == null) {
            this.f28760i.handleError(GMAAdsError.InternalLoadError(scarAdMetadata, "Scar Adapter object is null"));
        } else if (z) {
            m32328a(scarAdMetadata);
        } else {
            m32329b(scarAdMetadata);
        }
    }

    /* renamed from: a */
    private void m32328a(ScarAdMetadata scarAdMetadata) {
        this.f28752a.loadInterstitialAd(C12084a.m32908e(), scarAdMetadata, new C11856b(scarAdMetadata, m32327a(scarAdMetadata.getVideoLengthMs())));
    }

    /* renamed from: a */
    public void mo70777a(String str, String str2, boolean z) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2);
        IScarAdapter a = m32326a();
        this.f28752a = a;
        if (a != null) {
            a.show(C12084a.m32900a(), str2, str);
        } else {
            this.f28760i.handleError(GMAAdsError.InternalShowError(scarAdMetadata, "Scar Adapter object is null"));
        }
    }

    /* renamed from: a */
    private C12070a m32327a(Integer num) {
        return new C12070a(new ArrayDeque(Arrays.asList(new GMAEvent[]{GMAEvent.FIRST_QUARTILE, GMAEvent.MIDPOINT, GMAEvent.THIRD_QUARTILE, GMAEvent.LAST_QUARTILE})), num, new C12128b());
    }

    /* renamed from: a */
    private IScarAdapter m32326a() {
        if (this.f28752a == null) {
            this.f28752a = this.f28761j.mo70783a(this.f28754c.mo70800a(), this.f28760i);
        }
        return this.f28752a;
    }
}
