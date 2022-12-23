package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p052d.C1880e;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.Collections;

/* renamed from: com.applovin.impl.sdk.nativeAd.a */
public class C1986a extends C1887a {

    /* renamed from: a */
    private final C1880e f3769a = new C1880e();

    /* renamed from: c */
    private final AppLovinNativeAdImpl f3770c;

    /* renamed from: d */
    private final C1987a f3771d;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    public interface C1987a {
        /* renamed from: a */
        void mo14686a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C1986a(AppLovinNativeAdImpl appLovinNativeAdImpl, C1969m mVar, C1987a aVar) {
        super("TaskCacheNativeAd", mVar);
        this.f3770c = appLovinNativeAdImpl;
        this.f3771d = aVar;
    }

    /* renamed from: a */
    private Uri m4582a(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (C2102v.m5104a()) {
            mo14365a("Attempting to cache resource: " + uri);
        }
        String a = this.f3496b.mo14551aa() != null ? this.f3496b.mo14551aa().mo14861a(mo14372f(), uri.toString(), this.f3770c.getCachePrefix(), Collections.emptyList(), false, this.f3769a) : this.f3496b.mo14552ab().mo14849a(mo14372f(), uri.toString(), this.f3770c.getCachePrefix(), Collections.emptyList(), false, this.f3769a);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3496b.mo14551aa() != null ? this.f3496b.mo14551aa().mo14860a(a, mo14372f()) : this.f3496b.mo14552ab().mo14847a(a, mo14372f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                if (C2102v.m5104a()) {
                    str = "Unable to extract Uri from image file";
                }
            } else if (C2102v.m5104a()) {
                str = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14370d(str);
        }
        return null;
    }

    public void run() {
        if (C2102v.m5104a()) {
            mo14365a("Begin caching ad #" + this.f3770c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        Uri a = m4582a(this.f3770c.getIconUri());
        if (a != null) {
            this.f3770c.setIconUri(a);
        }
        Uri a2 = m4582a(this.f3770c.getMainImageUri());
        if (a2 != null) {
            this.f3770c.setMainImageUri(a2);
        }
        Uri a3 = m4582a(this.f3770c.getPrivacyIconUri());
        if (a3 != null) {
            this.f3770c.setPrivacyIconUri(a3);
        }
        if (C2102v.m5104a()) {
            mo14365a("Finished caching ad #" + this.f3770c.getAdIdNumber());
        }
        this.f3771d.mo14686a(this.f3770c);
    }
}
