package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.C5991eu;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.es */
/* compiled from: OmidTrackedNativeDisplayAd */
public class C5989es extends C5952dy {

    /* renamed from: d */
    private static final String f15184d = C5989es.class.getSimpleName();

    /* renamed from: e */
    private final C5953dz f15185e;

    /* renamed from: f */
    private C5983en f15186f;

    public C5989es(C6234j jVar, C5953dz dzVar, C5983en enVar) {
        super(jVar);
        this.f15185e = dzVar;
        this.f15186f = enVar;
    }

    /* renamed from: c */
    public final View mo35074c() {
        return this.f15185e.mo35074c();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15185e.mo35067a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15185e.mo35073b();
    }

    /* renamed from: d */
    public final void mo35075d() {
        try {
            this.f15186f.mo35114a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15185e.mo35075d();
            throw th;
        }
        this.f15185e.mo35075d();
    }

    /* renamed from: a */
    public final void mo35069a(byte b) {
        try {
            this.f15186f.mo35115a((int) b);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15185e.mo35069a(b);
            throw th;
        }
        this.f15185e.mo35069a(b);
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        this.f15185e.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        super.mo35076e();
        try {
            this.f15186f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15185e.mo35076e();
            throw th;
        }
        this.f15185e.mo35076e();
    }

    /* renamed from: a */
    public static C5983en m17828a(List<VerificationScriptResource> list, String str, String str2) {
        return new C5984eo("native_display_ad", ImpressionType.VIEWABLE, C5991eu.C5992a.f15193a.mo35121a(list, str, str2));
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        View g;
        try {
            if (this.f15090c.viewability.omidConfig.omidEnabled && C5991eu.C5992a.f15193a.mo35123a()) {
                if ((this.f15088a instanceof C6281n) && (g = ((C6281n) this.f15088a).mo35534g()) != null) {
                    this.f15186f.mo35117a(g, map, this.f15185e.mo35073b());
                }
                mo35069a((byte) 19);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f15185e.mo35072a(map);
            throw th;
        }
        this.f15185e.mo35072a(map);
    }
}
