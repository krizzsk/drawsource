package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.mbbanner.common.p324b.C8734b;

/* renamed from: com.mbridge.msdk.mbbanner.common.util.a */
/* compiled from: BannerDelivery */
public class C8773a {

    /* renamed from: a */
    private static final String f21559a = C8773a.class.getSimpleName();

    /* renamed from: b */
    private final Handler f21560b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21561c;

    /* renamed from: a */
    public final void mo58424a(boolean z) {
        this.f21561c = z;
    }

    /* renamed from: a */
    public final void mo58421a(final C8734b bVar, final CampaignUnit campaignUnit, final String str) {
        this.f21560b.post(new Runnable() {
            public final void run() {
                C8734b bVar = bVar;
                if (bVar != null) {
                    bVar.mo58339a(str, campaignUnit, C8773a.this.f21561c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58423a(final C8734b bVar, final String str, final String str2) {
        this.f21560b.post(new Runnable() {
            public final void run() {
                C8734b bVar = bVar;
                if (bVar != null) {
                    bVar.mo58340a(str2, str, C8773a.this.f21561c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58422a(final C8734b bVar, final String str) {
        this.f21560b.post(new Runnable() {
            public final void run() {
                C8734b bVar = bVar;
                if (bVar != null) {
                    bVar.mo58341a(str, C8773a.this.f21561c);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo58425b(final C8734b bVar, final String str) {
        this.f21560b.post(new Runnable() {
            public final void run() {
                C8734b bVar = bVar;
                if (bVar != null) {
                    bVar.mo58342b(str, C8773a.this.f21561c);
                }
            }
        });
    }
}
