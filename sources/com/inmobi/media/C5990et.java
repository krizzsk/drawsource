package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.C5953dz;
import com.inmobi.media.C5991eu;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.et */
/* compiled from: OmidTrackedNativeV2VideoAd */
public class C5990et extends C5952dy {

    /* renamed from: d */
    private static final String f15187d = C5990et.class.getSimpleName();

    /* renamed from: e */
    private final VastProperties f15188e;

    /* renamed from: f */
    private final WeakReference<Context> f15189f;

    /* renamed from: g */
    private final C5953dz f15190g;

    /* renamed from: h */
    private C5983en f15191h;

    /* renamed from: i */
    private WeakReference<View> f15192i;

    public C5990et(Context context, C5953dz dzVar, C6296o oVar, C5983en enVar, VastProperties vastProperties) {
        super(oVar);
        this.f15189f = new WeakReference<>(context);
        this.f15190g = dzVar;
        this.f15191h = enVar;
        this.f15188e = vastProperties;
    }

    /* renamed from: c */
    public final View mo35074c() {
        return this.f15190g.mo35074c();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15190g.mo35067a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15190g.mo35073b();
    }

    /* renamed from: a */
    public final C5953dz.C5954a mo35068a() {
        return this.f15190g.mo35068a();
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        this.f15190g.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        super.mo35076e();
        try {
            this.f15189f.clear();
            if (this.f15192i != null) {
                this.f15192i.clear();
            }
            this.f15191h = null;
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15190g.mo35076e();
            throw th;
        }
        this.f15190g.mo35076e();
    }

    /* renamed from: a */
    public static C5983en m17837a(List<VerificationScriptResource> list, String str, String str2) {
        return new C5984eo("native_video_ad", ImpressionType.VIEWABLE, C5991eu.C5992a.f15193a.mo35121a(list, str2, str));
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        C6051fn fnVar;
        try {
            if (this.f15090c.viewability.omidConfig.omidEnabled && C5991eu.C5992a.f15193a.mo35123a() && (this.f15088a instanceof C6296o) && (fnVar = (C6051fn) this.f15088a.getVideoContainerView()) != null) {
                C6035fl mediaController = fnVar.getVideoView().getMediaController();
                WeakReference<View> weakReference = new WeakReference<>(fnVar);
                this.f15192i = weakReference;
                this.f15191h.mo35117a((View) weakReference.get(), mediaController != null ? mediaController.getFriendlyViews() : null, this.f15190g.mo35073b());
                this.f15191h.hashCode();
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15190g.mo35072a(map);
            throw th;
        }
        this.f15190g.mo35072a(map);
    }

    /* renamed from: d */
    public final void mo35075d() {
        try {
            if (!((C6296o) this.f15088a).mo35537j()) {
                this.f15191h.mo35114a();
                this.f15191h.hashCode();
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15190g.mo35075d();
            throw th;
        }
        this.f15190g.mo35075d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (((com.inmobi.media.C6296o) r6.f15088a).mo35537j() != false) goto L_0x0064;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35069a(byte r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 5
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r1) goto L_0x0054
            r1 = 6
            if (r7 == r1) goto L_0x0011
            r1 = 13
            if (r7 == r1) goto L_0x006b
            r1 = 14
            goto L_0x006a
        L_0x0011:
            com.inmobi.media.j r1 = r6.f15088a     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1 instanceof com.inmobi.media.C6296o     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.j r1 = r6.f15088a     // Catch:{ Exception -> 0x0075 }
            android.view.View r1 = r1.getVideoContainerView()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.fn r1 = (com.inmobi.media.C6051fn) r1     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.fm r0 = r1.getVideoView()     // Catch:{ Exception -> 0x0075 }
            int r0 = r0.getDuration()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.fm r1 = r1.getVideoView()     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r1 = r1.getTag()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.cj r1 = (com.inmobi.media.C5869cj) r1     // Catch:{ Exception -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f14724v     // Catch:{ Exception -> 0x0075 }
            java.lang.String r5 = "currentMediaVolume"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0075 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0075 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0075 }
            if (r4 <= 0) goto L_0x006b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f14724v     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = "lastMediaVolume"
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0075 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0075 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0075 }
            if (r1 != 0) goto L_0x006b
            goto L_0x006a
        L_0x0054:
            com.inmobi.media.j r1 = r6.f15088a     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1 instanceof com.inmobi.media.C6296o     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.j r1 = r6.f15088a     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.o r1 = (com.inmobi.media.C6296o) r1     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1.mo35537j()     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
        L_0x0064:
            com.inmobi.media.dz r0 = r6.f15190g
            r0.mo35069a((byte) r7)
            return
        L_0x006a:
            r2 = r3
        L_0x006b:
            com.inmobi.media.en r1 = r6.f15191h     // Catch:{ Exception -> 0x0075 }
            com.iab.omid.library.inmobi.adsession.media.VastProperties r3 = r6.f15188e     // Catch:{ Exception -> 0x0075 }
            r1.mo35116a(r7, r0, r2, r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0064
        L_0x0073:
            r0 = move-exception
            goto L_0x0083
        L_0x0075:
            r0 = move-exception
            com.inmobi.media.gj r1 = com.inmobi.media.C6130gj.m18161a()     // Catch:{ all -> 0x0073 }
            com.inmobi.media.hk r2 = new com.inmobi.media.hk     // Catch:{ all -> 0x0073 }
            r2.<init>(r0)     // Catch:{ all -> 0x0073 }
            r1.mo35310a((com.inmobi.media.C6167hk) r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0064
        L_0x0083:
            com.inmobi.media.dz r1 = r6.f15190g
            r1.mo35069a((byte) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5990et.mo35069a(byte):void");
    }
}
