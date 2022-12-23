package com.inmobi.media;

import com.inmobi.media.C5977el;
import com.inmobi.media.C6074ft;

/* renamed from: com.inmobi.media.ek */
/* compiled from: PollingVisibilityTracker */
class C5976ek extends C5977el {

    /* renamed from: a */
    C6074ft.C6091m f15145a;

    C5976ek(C5977el.C5978a aVar, C6074ft.C6091m mVar, byte b) {
        super(aVar, b);
        this.f15145a = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35081a() {
        C6074ft.C6091m mVar = this.f15145a;
        if (mVar == null) {
            return 100;
        }
        return mVar.visibilityThrottleMillis;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35082b() {
        mo35111h();
    }
}
