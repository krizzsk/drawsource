package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5706af;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.av */
/* compiled from: UnifiedAdManager */
public abstract class C5771av extends C5706af.C5724a {

    /* renamed from: a */
    public static final String f14488a = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: b */
    public static final String f14489b = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: c */
    public static final String f14490c = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: d */
    public static final String f14491d = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: e */
    public static final String f14492e = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: k */
    private static final String f14493k = C5771av.class.getSimpleName();

    /* renamed from: f */
    byte f14494f = 0;

    /* renamed from: g */
    Boolean f14495g = null;

    /* renamed from: h */
    PublisherCallbacks f14496h;

    /* renamed from: i */
    final Handler f14497i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    AdMetaInfo f14498j;

    /* renamed from: m */
    public abstract C5706af mo34587m();

    C5771av() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34653c(final C5706af afVar, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14494f = 3;
        this.f14497i.post(new Runnable() {
            public final void run() {
                C5706af afVar = afVar;
                if (afVar != null) {
                    afVar.mo34467f((byte) 1);
                }
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onAdLoadFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34523a(AdMetaInfo adMetaInfo) {
        this.f14494f = 7;
    }

    /* renamed from: a */
    public void mo34524a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14494f = 3;
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onAdFetchFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo34532b() {
        byte b = this.f14494f;
        if (b != 4 && b != 5) {
            this.f14497i.post(new Runnable() {
                public final void run() {
                    if (C5771av.this.f14496h != null) {
                        C5771av.this.f14496h.onAdWillDisplay();
                    }
                }
            });
            this.f14494f = 4;
        }
    }

    /* renamed from: c */
    public void mo34538c(final AdMetaInfo adMetaInfo) {
        if (this.f14494f != 5) {
            this.f14498j = adMetaInfo;
            this.f14497i.post(new Runnable() {
                public final void run() {
                    if (C5771av.this.f14496h != null) {
                        C5771av.this.f14496h.onAdDisplayed(adMetaInfo);
                    }
                }
            });
            this.f14494f = 5;
        }
    }

    /* renamed from: a */
    public void mo34525a(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!mo34654c(inMobiAdRequestStatus) || !mo34649a(afVar)) {
            mo34653c(afVar, inMobiAdRequestStatus);
        } else {
            afVar.mo34438b(inMobiAdRequestStatus);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo34654c(InMobiAdRequestStatus inMobiAdRequestStatus) {
        return inMobiAdRequestStatus == null || InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR == inMobiAdRequestStatus.getStatusCode() || InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE == inMobiAdRequestStatus.getStatusCode();
    }

    /* renamed from: a */
    public void mo34529a(final Map<Object, Object> map) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onAdClicked(map);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34652b(PublisherCallbacks publisherCallbacks) {
        C5706af m = mo34587m();
        if (m != null) {
            this.f14496h = publisherCallbacks;
            m.mo34496z();
        }
    }

    /* renamed from: a */
    public final void mo34526a(C5706af afVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            afVar.mo34395S();
        } else {
            afVar.mo34380D();
        }
        mo34583b(afVar, z, inMobiAdRequestStatus);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34583b(C5706af afVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            mo34653c(afVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: C */
    public String mo34647C() {
        AdMetaInfo adMetaInfo = this.f14498j;
        return adMetaInfo == null ? "" : adMetaInfo.getCreativeID();
    }

    /* renamed from: a */
    public void mo34580a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f14495g;
        if (bool == null || !bool.booleanValue()) {
            this.f14495g = Boolean.FALSE;
            this.f14494f = 1;
            C5706af m = mo34587m();
            if (m != null) {
                this.f14496h = publisherCallbacks;
                m.mo34433a(bArr);
                return;
            }
            return;
        }
        C6195ic.m18378a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: D */
    public JSONObject mo34648D() {
        AdMetaInfo adMetaInfo = this.f14498j;
        return adMetaInfo == null ? new JSONObject() : adMetaInfo.getBidInfo();
    }

    /* renamed from: b */
    public void mo34533b(AdMetaInfo adMetaInfo) {
        this.f14498j = adMetaInfo;
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34467f((byte) 1);
        }
    }

    /* renamed from: b */
    public void mo34535b(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        mo34653c(afVar, inMobiAdRequestStatus);
    }

    /* renamed from: d */
    public void mo34539d() {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onUserLeftApplication();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34536b(final Map<Object, Object> map) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onRewardsUnlocked(map);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34531a(final byte[] bArr) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onRequestPayloadCreated(bArr);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo34534b(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34651a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        C5706af m = mo34587m();
        PublisherCallbacks publisherCallbacks2 = this.f14496h;
        if (publisherCallbacks2 == null || publisherCallbacks == null || publisherCallbacks2.getType() == publisherCallbacks.getType()) {
            byte b = this.f14494f;
            if (b != 1) {
                if (b == 5) {
                    C6195ic.m18378a((byte) 1, str, f14488a.concat(String.valueOf(str2)));
                    mo34653c(mo34587m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    if (m != null) {
                        m.mo34404a((byte) Ascii.f18305SI);
                    }
                    return false;
                } else if (b != 8) {
                    return true;
                }
            }
            C6195ic.m18378a((byte) 1, str, f14492e.concat(String.valueOf(str2)));
            if (m != null) {
                m.mo34437b((byte) 53);
            }
            return false;
        }
        C6195ic.m18378a((byte) 1, f14493k, f14490c);
        if (m != null) {
            m.mo34437b((byte) 54);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34650a(String str, String str2) throws IllegalStateException {
        C5706af m = mo34587m();
        byte b = this.f14494f;
        if (b != 1) {
            if (b == 5) {
                C6195ic.m18378a((byte) 1, str, f14488a.concat(String.valueOf(str2)));
                if (m != null) {
                    m.mo34404a((byte) Ascii.f18305SI);
                }
                mo34653c(m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                return false;
            } else if (b == 7) {
                return true;
            } else {
                if (b != 8) {
                    throw new IllegalStateException(f14491d);
                }
            }
        }
        C6195ic.m18378a((byte) 1, str, f14492e.concat(String.valueOf(str2)));
        return false;
    }

    /* renamed from: c */
    public void mo34537c() {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h != null) {
                    C5771av.this.f14496h.onAdDismissed();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34528a(final C6173ho hoVar) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5771av.this.f14496h == null) {
                    C6173ho hoVar = hoVar;
                    if (hoVar != null) {
                        hoVar.mo35384b();
                        return;
                    }
                    return;
                }
                C5771av.this.f14496h.onAdImpression(hoVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34649a(C5706af afVar) {
        return afVar != null && !afVar.f14362v;
    }
}
