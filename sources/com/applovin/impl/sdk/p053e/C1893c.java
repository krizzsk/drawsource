package com.applovin.impl.sdk.p053e;

import android.net.Uri;
import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C1785h;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2032q;
import com.applovin.impl.sdk.C2033r;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.p052d.C1880e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.model.Advertisement;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;

/* renamed from: com.applovin.impl.sdk.e.c */
public abstract class C1893c extends C1887a implements C1785h.C1786a {

    /* renamed from: a */
    protected final C1839e f3504a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAdLoadListener f3505c;

    /* renamed from: d */
    private final C2032q f3506d;

    /* renamed from: e */
    private final C2033r f3507e;

    /* renamed from: f */
    private final Collection<Character> f3508f;

    /* renamed from: g */
    private final C1880e f3509g;

    /* renamed from: h */
    private boolean f3510h;

    C1893c(String str, C1839e eVar, C1969m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, mVar);
        if (eVar != null) {
            this.f3504a = eVar;
            this.f3505c = appLovinAdLoadListener;
            this.f3506d = mVar.mo14552ab();
            this.f3507e = mVar.mo14551aa();
            this.f3508f = m4222j();
            this.f3509g = new C1880e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    /* renamed from: a */
    private Uri m4216a(Uri uri, String str) {
        String str2;
        StringBuilder sb;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                if (C2102v.m5104a()) {
                    mo14365a("Caching " + str + " image...");
                }
                return m4221g(uri2);
            } else if (!C2102v.m5104a()) {
                return null;
            } else {
                sb = new StringBuilder();
                sb.append("Failed to cache ");
                sb.append(str);
                str2 = " image";
            }
        } else if (!C2102v.m5104a()) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        mo14365a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private Uri m4217a(String str, String str2) {
        StringBuilder sb;
        if (this.f3507e != null) {
            return m4220b(str, str2);
        }
        String replace = str2.replace("/", "_");
        String L = this.f3504a.mo14172L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f3506d.mo14847a(replace, this.f3496b.mo14520L());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f3509g.mo14340b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3506d.mo14853a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f3509g)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append(Advertisement.FILE_SCHEME);
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    private Uri m4220b(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String L = this.f3504a.mo14172L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f3507e.mo14860a(replace, this.f3496b.mo14520L());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f3509g.mo14340b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3507e.mo14864a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f3509g)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append(Advertisement.FILE_SCHEME);
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: g */
    private Uri m4221g(String str) {
        return mo14389c(str, this.f3504a.mo14168H(), true);
    }

    /* renamed from: j */
    private Collection<Character> m4222j() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f3496b.mo14534a(C1867b.f3191bm)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Uri mo14381a(String str, List<String> list, boolean z) {
        String str2;
        if (this.f3507e != null) {
            return mo14386b(str, list, z);
        }
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C2102v.m5104a()) {
            mo14365a("Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a = this.f3506d.mo14849a(mo14372f(), str, this.f3504a.mo14172L(), list, z, this.f3509g);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3506d.mo14847a(a, mo14372f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    if (C2102v.m5104a()) {
                        mo14365a("Finish caching video for ad #" + this.f3504a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    }
                    return fromFile;
                } else if (!C2102v.m5104a()) {
                    return null;
                } else {
                    str2 = "Unable to create URI from cached video file = " + a2;
                }
            } else if (!C2102v.m5104a()) {
                return null;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            mo14370d(str2);
            return null;
        }
        if (C2102v.m5104a()) {
            mo14370d("Failed to cache video");
        }
        mo14394h();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14382a(String str, List<String> list) {
        InputStream inputStream;
        if (this.f3507e != null) {
            return mo14387b(str, list);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (C2102v.m5104a()) {
                    mo14365a("Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f3496b.mo14534a(C1867b.f3328eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f3504a.mo14172L())) {
                fileName = this.f3504a.mo14172L() + fileName;
            }
            try {
                File a = this.f3506d.mo14847a(fileName, mo14372f());
                if (a != null && a.exists()) {
                    return this.f3506d.mo14851a(a);
                }
                inputStream = this.f3506d.mo14848a(str, list, true, this.f3509g);
                if (inputStream != null) {
                    try {
                        this.f3506d.mo14856b(inputStream, a);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Utils.close(inputStream, this.f3496b);
                return this.f3506d.mo14851a(a);
            } catch (Throwable th2) {
                if (C2102v.m5104a()) {
                    mo14366a("Resource at " + str + " failed to load.", th2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14383a(String str, List<String> list, C1839e eVar) {
        StringBuilder sb;
        if (!StringUtils.isValidString(str)) {
            return str;
        }
        if (!((Boolean) this.f3496b.mo14534a(C1867b.f3192bn)).booleanValue()) {
            if (C2102v.m5104a()) {
                mo14365a("Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = eVar.shouldCancelHtmlCachingIfShown();
        boolean aK = eVar.mo14202aK();
        List<String> G = eVar.mo14167G();
        for (String next : list) {
            int i = 0;
            int i2 = 0;
            while (i < sb2.length()) {
                if (mo14388b()) {
                    return str;
                }
                i = sb2.indexOf(next, i2);
                if (i == -1) {
                    continue;
                    break;
                }
                int length = sb2.length();
                int i3 = i;
                while (!this.f3508f.contains(Character.valueOf(sb2.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    if (C2102v.m5104a()) {
                        mo14370d("Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String substring = sb2.substring(next.length() + i, i3);
                if (StringUtils.isValidString(substring)) {
                    if (!shouldCancelHtmlCachingIfShown || !eVar.hasShown()) {
                        if (aK) {
                            if (eVar.mo12846d().equals(next + substring)) {
                                if (C2102v.m5104a()) {
                                    sb = new StringBuilder();
                                    sb.append("Postponing caching for \"");
                                    sb.append(substring);
                                    substring = "\" video resource";
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                        Uri a = m4217a(next, substring);
                        if (a != null) {
                            sb2.replace(i, i3, a.toString());
                            eVar.mo14229b(a);
                            this.f3509g.mo14344e();
                        } else {
                            if (G.contains(next + substring)) {
                                mo14394h();
                                this.f3510h = true;
                            }
                            this.f3509g.mo14345f();
                        }
                        i2 = i3;
                    } else {
                        if (C2102v.m5104a()) {
                            mo14365a("Cancelling HTML caching due to ad being shown already");
                        }
                        this.f3509g.mo14336a();
                        return str;
                    }
                } else if (C2102v.m5104a()) {
                    sb = new StringBuilder();
                    sb.append("Skip caching of non-resource ");
                } else {
                    i2 = i3;
                }
                sb.append(substring);
                mo14365a(sb.toString());
                i2 = i3;
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14384a() {
        this.f3496b.mo14516H().mo13942b(this);
    }

    /* renamed from: a */
    public void mo13943a(C1583a aVar) {
        if (aVar.mo13365f().equalsIgnoreCase(this.f3504a.mo14174N())) {
            if (C2102v.m5104a()) {
                mo14370d("Updating flag for timeout...");
            }
            this.f3510h = true;
        }
        this.f3496b.mo14516H().mo13942b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14385a(AppLovinAdBase appLovinAdBase) {
        C1879d.m4141a(this.f3509g, appLovinAdBase, this.f3496b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo14386b(String str, List<String> list, boolean z) {
        String str2;
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        mo14365a("Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        String a = this.f3507e.mo14861a(mo14372f(), str, this.f3504a.mo14172L(), list, z, this.f3509g);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f3507e.mo14860a(a, mo14372f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    mo14365a("Finish caching video for ad #" + this.f3504a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + a2;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            mo14370d(str2);
            return null;
        }
        mo14370d("Failed to cache video");
        mo14394h();
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", this.f3504a.getAdIdNumber());
        bundle.putInt("load_response_code", this.f3509g.mo14349j());
        Exception i = this.f3509g.mo14348i();
        if (i != null) {
            bundle.putString("load_exception_message", i.getMessage());
        }
        this.f3496b.mo14557ag().mo14480a(bundle, "video_caching_failed");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo14387b(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                mo14365a("Nothing to cache, skipping...");
                return null;
            }
            String fileName = ((Boolean) this.f3496b.mo14534a(C1867b.f3328eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f3504a.mo14172L())) {
                fileName = this.f3504a.mo14172L() + fileName;
            }
            File a = this.f3507e.mo14860a(fileName, mo14372f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.f3507e.mo14858a(a);
            if (a2 == null) {
                a2 = this.f3507e.mo14859a(str, list, true, this.f3509g);
                if (a2 != null) {
                    this.f3507e.mo14863a(a2, a);
                    this.f3509g.mo14338a((long) a2.size());
                }
            } else {
                this.f3509g.mo14340b((long) a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                mo14366a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                mo14366a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14388b() {
        return this.f3510h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Uri mo14389c(String str, List<String> list, boolean z) {
        String str2;
        if (this.f3507e != null) {
            return mo14391d(str, list, z);
        }
        try {
            String a = this.f3506d.mo14849a(mo14372f(), str, this.f3504a.mo14172L(), list, z, this.f3509g);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f3506d.mo14847a(a, mo14372f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                if (!C2102v.m5104a()) {
                    return null;
                }
                str2 = "Unable to extract Uri from image file";
            } else if (!C2102v.m5104a()) {
                return null;
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14370d(str2);
            return null;
        } catch (Throwable th) {
            if (!C2102v.m5104a()) {
                return null;
            }
            mo14366a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14390c() {
        if (C2102v.m5104a()) {
            mo14365a("Caching mute images...");
        }
        Uri a = m4216a(this.f3504a.mo14194aC(), "mute");
        if (a != null) {
            this.f3504a.mo14230c(a);
        }
        Uri a2 = m4216a(this.f3504a.mo14195aD(), "unmute");
        if (a2 != null) {
            this.f3504a.mo14231d(a2);
        }
        if (C2102v.m5104a()) {
            mo14365a("Ad updated with muteImageFilename = " + this.f3504a.mo14194aC() + ", unmuteImageFilename = " + this.f3504a.mo14195aD());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Uri mo14391d(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a = this.f3507e.mo14861a(mo14372f(), str, this.f3504a.mo14172L(), list, z, this.f3509g);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f3507e.mo14860a(a, mo14372f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                str2 = "Unable to extract Uri from image file";
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a;
            }
            mo14370d(str2);
            return null;
        } catch (Throwable th) {
            mo14366a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Uri mo14392e(String str) {
        return mo14381a(str, this.f3504a.mo14168H(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo14393f(final String str) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        C2000c a = C2000c.m4627a(this.f3496b).mo14724a(str).mo14730b(ShareTarget.METHOD_GET).mo14723a("").mo14722a(0).mo14728a();
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        this.f3496b.mo14525R().mo14697a(a, new C1995b.C1997a(), new C1995b.C1999c<String>() {
            /* renamed from: a */
            public void mo13585a(int i, String str, String str2) {
                C1893c cVar = C1893c.this;
                cVar.mo14370d("Failed to load resource from '" + str + "'");
            }

            /* renamed from: a */
            public void mo13587a(String str, int i) {
                atomicReference.set(str);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f3509g.mo14338a((long) str2.length());
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14394h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3505c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f3505c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14395i() {
        if (C2102v.m5104a()) {
            mo14365a("Rendered new ad:" + this.f3504a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1893c.this.f3505c != null) {
                    C1893c.this.f3505c.adReceived(C1893c.this.f3504a);
                    AppLovinAdLoadListener unused = C1893c.this.f3505c = null;
                }
            }
        });
    }

    public void run() {
        if (this.f3504a.mo14173M()) {
            if (C2102v.m5104a()) {
                mo14365a("Subscribing to timeout events...");
            }
            this.f3496b.mo14516H().mo13941a((C1785h.C1786a) this);
        }
    }
}
