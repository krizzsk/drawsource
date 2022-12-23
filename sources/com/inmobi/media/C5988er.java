package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.inmobi.media.C5991eu;
import java.util.Map;

/* renamed from: com.inmobi.media.er */
/* compiled from: OmidTrackedHtmlAd */
public class C5988er extends C5952dy {

    /* renamed from: d */
    private static final String f15181d = C5988er.class.getSimpleName();

    /* renamed from: e */
    private final C5953dz f15182e;

    /* renamed from: f */
    private C5983en f15183f;

    /* renamed from: a */
    public static C5983en m17819a(String str, C6301q qVar, boolean z, String str2, byte b, String str3) {
        ImpressionType impressionType;
        AdSessionContext a = m17818a(qVar, str2, str3);
        switch (b) {
            case 1:
                impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                break;
            case 2:
                impressionType = ImpressionType.UNSPECIFIED;
                break;
            case 3:
                impressionType = ImpressionType.LOADED;
                break;
            case 4:
                impressionType = ImpressionType.BEGIN_TO_RENDER;
                break;
            case 5:
                impressionType = ImpressionType.ONE_PIXEL;
                break;
            case 6:
                impressionType = ImpressionType.VIEWABLE;
                break;
            case 7:
                impressionType = ImpressionType.AUDIBLE;
                break;
            default:
                impressionType = ImpressionType.OTHER;
                break;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 112202875) {
                if (hashCode == 1425678798 && str.equals("nonvideo")) {
                    c = 2;
                }
            } else if (str.equals("video")) {
                c = 3;
            }
        } else if (str.equals("unknown")) {
            c = 1;
        }
        if (c == 2) {
            return new C5984eo("html_display_ad", impressionType, a);
        }
        if (c != 3) {
            return null;
        }
        return new C5984eo("html_video_ad", impressionType, a, z);
    }

    public C5988er(C6234j jVar, C5953dz dzVar, C5983en enVar) {
        super(jVar);
        this.f15182e = dzVar;
        this.f15183f = enVar;
    }

    /* renamed from: c */
    public final View mo35074c() {
        return this.f15182e.mo35074c();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15182e.mo35067a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15182e.mo35073b();
    }

    /* renamed from: d */
    public final void mo35075d() {
        try {
            this.f15183f.mo35114a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15182e.mo35075d();
            throw th;
        }
        this.f15182e.mo35075d();
    }

    /* renamed from: a */
    public final void mo35069a(byte b) {
        this.f15182e.mo35069a(b);
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        this.f15182e.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        super.mo35076e();
        try {
            this.f15183f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15182e.mo35076e();
            throw th;
        }
        this.f15182e.mo35076e();
    }

    /* renamed from: a */
    public static AdSessionContext m17818a(C6301q qVar, String str, String str2) {
        if (qVar != null) {
            return C5991eu.C5992a.f15193a.mo35120a((WebView) qVar, str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        View view;
        try {
            if (this.f15090c.viewability.omidConfig.omidEnabled && C5991eu.C5992a.f15193a.mo35123a()) {
                if (this.f15088a instanceof C6281n) {
                    C6281n nVar = (C6281n) this.f15088a;
                    view = nVar.f15856t == null ? nVar.f15857u : nVar.f15856t;
                } else {
                    view = this.f15182e.mo35073b() instanceof WebView ? (WebView) this.f15182e.mo35073b() : null;
                }
                if (view != null) {
                    this.f15183f.mo35117a(view, map, (View) null);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15182e.mo35072a(map);
            throw th;
        }
        this.f15182e.mo35072a(map);
    }
}
