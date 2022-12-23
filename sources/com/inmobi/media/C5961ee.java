package com.inmobi.media;

import android.view.View;
import com.inmobi.media.C5977el;
import com.inmobi.media.C6074ft;

/* renamed from: com.inmobi.media.ee */
/* compiled from: HtmlPollingVisibilityTracker */
public final class C5961ee extends C5976ek {

    /* renamed from: com.inmobi.media.ee$a */
    /* compiled from: HtmlPollingVisibilityTracker */
    public interface C5962a extends C5977el.C5978a {
        /* renamed from: a */
        boolean mo35087a(View view);
    }

    public C5961ee(C5977el.C5978a aVar, C6074ft.C6091m mVar, byte b) {
        super(aVar, mVar, b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo35081a() {
        if (this.f15145a == null) {
            return 1000;
        }
        return this.f15145a.web.impressionPollIntervalMillis;
    }
}
