package com.adcolony.sdk;

import android.util.Log;
import android.webkit.WebView;
import com.adcolony.sdk.C0826e0;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.adcolony.sdk.p0 */
class C0939p0 {

    /* renamed from: a */
    private AdSession f694a;

    /* renamed from: b */
    private AdEvents f695b;

    /* renamed from: c */
    private MediaEvents f696c;

    /* renamed from: d */
    private List<VerificationScriptResource> f697d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f698e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f699f = "";

    /* renamed from: g */
    private boolean f700g;

    /* renamed from: h */
    private boolean f701h;

    /* renamed from: i */
    private boolean f702i;

    /* renamed from: j */
    private boolean f703j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f704k;

    /* renamed from: l */
    private int f705l;

    /* renamed from: m */
    private int f706m;

    /* renamed from: n */
    private String f707n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f708o = "";

    /* renamed from: com.adcolony.sdk.p0$a */
    class C0940a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f709a;

        C0940a(String str) {
            this.f709a = str;
        }

        public void run() {
            C0832f1 b = C0773c0.m379b();
            C0832f1 b2 = C0773c0.m379b();
            C0773c0.m383b(b2, "session_type", C0939p0.this.f698e);
            C0773c0.m376a(b2, "session_id", C0939p0.this.f699f);
            C0773c0.m376a(b2, "event", this.f709a);
            C0773c0.m376a(b, "type", "iab_hook");
            C0773c0.m376a(b, "message", b2.toString());
            new C0850h0("CustomMessage.controller_send", 0, b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.p0$b */
    class C0941b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.p0$b$a */
        class C0942a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f712a;

            /* renamed from: b */
            final /* synthetic */ String f713b;

            /* renamed from: c */
            final /* synthetic */ float f714c;

            C0942a(String str, String str2, float f) {
                this.f712a = str;
                this.f713b = str2;
                this.f714c = f;
            }

            public void run() {
                if (this.f712a.equals(C0939p0.this.f708o)) {
                    C0939p0.this.mo11003a(this.f713b, this.f714c);
                    return;
                }
                AdColonyAdView adColonyAdView = C0723a.m193b().mo10889c().mo10720d().get(this.f712a);
                C0939p0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo11003a(this.f713b, this.f714c);
                }
            }
        }

        C0941b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            C0832f1 b = C0773c0.m380b(adColonyCustomMessage.getMessage());
            String h = C0773c0.m393h(b, "event_type");
            float floatValue = BigDecimal.valueOf(C0773c0.m387c(b, "duration")).floatValue();
            boolean b2 = C0773c0.m382b(b, "replay");
            boolean equals = C0773c0.m393h(b, "skip_type").equals("dec");
            String h2 = C0773c0.m393h(b, "asi");
            if (h.equals("skip") && equals) {
                boolean unused = C0939p0.this.f704k = true;
            } else if (!b2 || (!h.equals("start") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE) && !h.equals("midpoint") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE) && !h.equals("complete"))) {
                C1047z0.m1259b((Runnable) new C0942a(h2, h, floatValue));
            }
        }
    }

    C0939p0(C0832f1 f1Var, String str) {
        VerificationScriptResource verificationScriptResource;
        this.f698e = m911a(f1Var);
        this.f703j = C0773c0.m382b(f1Var, "skippable");
        this.f705l = C0773c0.m389d(f1Var, "skip_offset");
        this.f706m = C0773c0.m389d(f1Var, "video_duration");
        C0828e1 a = C0773c0.m366a(f1Var, "js_resources");
        C0828e1 a2 = C0773c0.m366a(f1Var, "verification_params");
        C0828e1 a3 = C0773c0.m366a(f1Var, "vendor_keys");
        this.f708o = str;
        for (int i = 0; i < a.mo10752b(); i++) {
            try {
                String b = C0773c0.m381b(a2, i);
                String b2 = C0773c0.m381b(a3, i);
                URL url = new URL(C0773c0.m381b(a, i));
                if (b.equals("") || b2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(b2, url, b);
                }
                this.f697d.add(verificationScriptResource);
            } catch (MalformedURLException unused) {
                new C0826e0.C0827a().mo10746a("Invalid js resource url passed to Omid").mo10747a(C0826e0.f462i);
            }
        }
        try {
            this.f707n = C0723a.m193b().mo10907p().mo11162a(C0773c0.m393h(f1Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C0826e0.C0827a().mo10746a("Error loading IAB JS Client").mo10747a(C0826e0.f462i);
        }
    }

    /* renamed from: e */
    private void m918e() {
        AdColony.addCustomMessageListener(new C0941b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo11006d() {
        return this.f698e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11007f() {
        this.f701h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11004b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f694a.finish();
        m916b("end_session");
        this.f694a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo11005c() {
        return this.f694a;
    }

    /* renamed from: a */
    private int m911a(C0832f1 f1Var) {
        if (this.f698e == -1) {
            int d = C0773c0.m389d(f1Var, "ad_unit_type");
            String h = C0773c0.m393h(f1Var, "ad_type");
            if (d == 0) {
                return 0;
            }
            if (d == 1) {
                if (h.equals("video")) {
                    return 0;
                }
                if (h.equals("display")) {
                    return 1;
                }
                if (h.equals("banner_display") || h.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f698e;
    }

    /* renamed from: b */
    private void m916b(String str) {
        if (!C1047z0.m1243a((Runnable) new C0940a(str))) {
            new C0826e0.C0827a().mo10746a("Executing ADCOmidManager.sendIabCustomMessage failed").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11001a(C0761c cVar) {
        MediaEvents mediaEvents;
        VastProperties vastProperties;
        if (!this.f702i && this.f698e >= 0 && this.f694a != null) {
            m915b(cVar);
            m918e();
            if (this.f698e != 0) {
                mediaEvents = null;
            } else {
                mediaEvents = MediaEvents.createMediaEvents(this.f694a);
            }
            this.f696c = mediaEvents;
            try {
                this.f694a.start();
                this.f695b = AdEvents.createAdEvents(this.f694a);
                m916b("start_session");
                if (this.f696c != null) {
                    Position position = Position.PREROLL;
                    if (this.f703j) {
                        vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) this.f705l, true, position);
                    } else {
                        vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                    }
                    this.f695b.loaded(vastProperties);
                } else {
                    this.f695b.loaded();
                }
                this.f702i = true;
            } catch (NullPointerException e) {
                AdSession adSession = this.f694a;
                ErrorType errorType = ErrorType.GENERIC;
                adSession.error(errorType, "Exception occurred on AdSession.start: " + Log.getStackTraceString(e));
                mo11004b();
                C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("Exception in ADCOmidManager on AdSession.start: ").mo10746a(Log.getStackTraceString(e));
                a.mo10746a(" Ad with adSessionId: " + this.f708o + ".").mo10747a(C0826e0.f462i);
            }
        }
    }

    /* renamed from: b */
    private void m915b(C0761c cVar) {
        m916b("register_ad_view");
        C0742b1 b1Var = C0723a.m193b().mo10864B().get(Integer.valueOf(cVar.mo10653k()));
        if (b1Var == null && !cVar.mo10656n().isEmpty()) {
            b1Var = (C0742b1) cVar.mo10656n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f694a;
        if (adSession != null && b1Var != null) {
            adSession.registerAdView(b1Var);
            if (b1Var instanceof C0907l0) {
                ((C0907l0) b1Var).mo10941p();
            }
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo10629a(this.f694a);
            m916b("register_obstructions");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10999a() throws IllegalArgumentException {
        mo11000a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11000a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f698e >= 0 && (str = this.f707n) != null && !str.equals("") && (list = this.f697d) != null) {
            if (!list.isEmpty() || mo11006d() == 2) {
                C0866k b = C0723a.m193b();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo11006d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(b.mo10911t(), this.f707n, this.f697d, (String) null, (String) null));
                    this.f694a = createAdSession;
                    this.f699f = createAdSession.getAdSessionId();
                    m916b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(b.mo10911t(), this.f707n, this.f697d, (String) null, (String) null));
                    this.f694a = createAdSession2;
                    this.f699f = createAdSession2.getAdSessionId();
                    m916b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(b.mo10911t(), webView, "", (String) null));
                    this.f694a = createAdSession3;
                    this.f699f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11002a(String str) {
        mo11003a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11003a(String str, float f) {
        if (C0723a.m195c() && this.f694a != null) {
            if (this.f696c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f695b.impressionOccurred();
                            MediaEvents mediaEvents = this.f696c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f706m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m916b(str);
                            return;
                        case 1:
                            this.f696c.firstQuartile();
                            m916b(str);
                            return;
                        case 2:
                            this.f696c.midpoint();
                            m916b(str);
                            return;
                        case 3:
                            this.f696c.thirdQuartile();
                            m916b(str);
                            return;
                        case 4:
                            this.f704k = true;
                            this.f696c.complete();
                            m916b(str);
                            return;
                        case 5:
                            m916b(str);
                            mo11004b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f696c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m916b(str);
                            mo11004b();
                            return;
                        case 8:
                            this.f696c.volumeChange(0.0f);
                            m916b(str);
                            return;
                        case 9:
                            this.f696c.volumeChange(1.0f);
                            m916b(str);
                            return;
                        case 10:
                            if (!this.f700g && !this.f701h && !this.f704k) {
                                this.f696c.pause();
                                m916b(str);
                                this.f700g = true;
                                this.f701h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f700g && !this.f704k) {
                                this.f696c.resume();
                                m916b(str);
                                this.f700g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f696c.bufferStart();
                            m916b(str);
                            return;
                        case 13:
                            this.f696c.bufferFinish();
                            m916b(str);
                            return;
                        case 14:
                        case 15:
                            this.f696c.adUserInteraction(InteractionType.CLICK);
                            m916b(str);
                            if (this.f701h && !this.f700g && !this.f704k) {
                                this.f696c.pause();
                                m916b(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                                this.f700g = true;
                                this.f701h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    new C0826e0.C0827a().mo10746a("Recording IAB event for ").mo10746a(str).mo10746a(" caused " + e.getClass()).mo10747a(C0826e0.f460g);
                }
            }
        }
    }
}
