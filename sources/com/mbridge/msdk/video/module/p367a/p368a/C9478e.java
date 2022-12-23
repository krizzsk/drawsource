package com.mbridge.msdk.video.module.p367a.p368a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.video.module.a.a.e */
/* compiled from: DefaultImageLoaderListener */
public class C9478e implements C8484c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CampaignEx f23490a;

    /* renamed from: b */
    protected ImageView f23491b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f23492c;

    public C9478e(ImageView imageView) {
        this.f23491b = imageView;
    }

    public C9478e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f23491b = imageView;
        this.f23490a = campaignEx;
        this.f23492c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        if (bitmap == null) {
            try {
                C8672v.m24878d("ImageLoaderListener", "bitmap=null");
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (this.f23491b != null && !bitmap.isRecycled()) {
            this.f23491b.setImageBitmap(bitmap);
            this.f23491b.setVisibility(0);
        }
    }

    public void onFailedLoad(final String str, String str2) {
        C94791 r3 = new Runnable() {
            public final void run() {
                try {
                    C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    if (C9478e.this.f23490a == null) {
                        C8672v.m24874a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    C8468m mVar = new C8468m();
                    mVar.mo57848o("2000044");
                    mVar.mo57822c(C8660r.m24840o(C8388a.m23845e().mo56913g()));
                    mVar.mo57846n(C9478e.this.f23490a.getId());
                    mVar.mo57826d(C9478e.this.f23490a.getImageUrl());
                    mVar.mo57840k(C9478e.this.f23490a.getRequestId());
                    mVar.mo57842l(C9478e.this.f23490a.getRequestIdNotice());
                    mVar.mo57844m(C9478e.this.f23492c);
                    mVar.mo57850p(str);
                    a.mo57056a(mVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        if (C8396b.m23890a().mo56951d()) {
            C8498b.m24359a().execute(r3);
        } else {
            r3.run();
        }
        C8672v.m24878d("ImageLoaderListener", "desc:" + str);
    }
}
