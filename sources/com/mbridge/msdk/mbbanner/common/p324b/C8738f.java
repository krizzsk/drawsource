package com.mbridge.msdk.mbbanner.common.p324b;

import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.mbbanner.common.p325c.C8750b;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.f */
/* compiled from: DownloadImageListener */
public class C8738f implements C8484c {

    /* renamed from: a */
    private static final String f21443a = C8738f.class.getSimpleName();

    /* renamed from: b */
    private C8750b f21444b;

    /* renamed from: c */
    private String f21445c;

    public C8738f(C8750b bVar, String str) {
        if (bVar != null) {
            this.f21444b = bVar;
        }
        this.f21445c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        this.f21444b.mo58397a(this.f21445c, 1, str, true);
    }

    public void onFailedLoad(String str, String str2) {
        this.f21444b.mo58397a(this.f21445c, 1, str2, false);
    }
}
