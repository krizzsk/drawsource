package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareInternalUtility;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.m */
public final class C4945m implements C4938g {

    /* renamed from: a */
    public final C4938g f13148a;

    /* renamed from: b */
    public final C4938g f13149b;

    /* renamed from: c */
    public final C4938g f13150c;

    /* renamed from: d */
    public final C4938g f13151d;

    /* renamed from: e */
    public C4938g f13152e;

    public C4945m(Context context, C4912a0<? super C4938g> a0Var, C4938g gVar) {
        this.f13148a = (C4938g) C4965a.m15047a(gVar);
        this.f13149b = new C4949q(a0Var);
        this.f13150c = new C4914c(context, a0Var);
        this.f13151d = new C4934e(context, a0Var);
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws IOException {
        boolean z = true;
        C4965a.m15051b(this.f13152e == null);
        String scheme = jVar.f13126a.getScheme();
        Uri uri = jVar.f13126a;
        int i = C4991u.f13270a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals(ShareInternalUtility.STAGING_PARAM)) {
            z = false;
        }
        if (z) {
            if (jVar.f13126a.getPath().startsWith("/android_asset/")) {
                this.f13152e = this.f13150c;
            } else {
                this.f13152e = this.f13149b;
            }
        } else if ("asset".equals(scheme)) {
            this.f13152e = this.f13150c;
        } else if ("content".equals(scheme)) {
            this.f13152e = this.f13151d;
        } else {
            this.f13152e = this.f13148a;
        }
        return this.f13152e.mo24756a(jVar);
    }

    public void close() throws IOException {
        C4938g gVar = this.f13152e;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f13152e = null;
            }
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws IOException {
        return this.f13152e.mo24755a(bArr, i, i2);
    }

    /* renamed from: a */
    public Uri mo24757a() {
        C4938g gVar = this.f13152e;
        if (gVar == null) {
            return null;
        }
        return gVar.mo24757a();
    }
}
