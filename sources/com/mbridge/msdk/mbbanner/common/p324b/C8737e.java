package com.mbridge.msdk.mbbanner.common.p324b;

import com.mbridge.msdk.mbbanner.common.p325c.C8750b;
import com.mbridge.msdk.videocommon.download.C9652g;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.e */
/* compiled from: DownloadBannerUrlListener */
public class C8737e implements C9652g.C9658b {

    /* renamed from: a */
    private static final String f21440a = C8737e.class.getSimpleName();

    /* renamed from: b */
    private String f21441b;

    /* renamed from: c */
    private C8750b f21442c;

    public C8737e(C8750b bVar, String str) {
        this.f21442c = bVar;
        this.f21441b = str;
    }

    /* renamed from: a */
    public final void mo58372a(String str) {
        C8750b bVar = this.f21442c;
        if (bVar != null) {
            bVar.mo58397a(this.f21441b, 3, str, true);
        }
    }

    /* renamed from: a */
    public final void mo58373a(String str, String str2) {
        C8750b bVar = this.f21442c;
        if (bVar != null) {
            bVar.mo58397a(this.f21441b, 3, str, false);
        }
    }
}
