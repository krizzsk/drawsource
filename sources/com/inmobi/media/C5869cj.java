package com.inmobi.media;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cj */
/* compiled from: NativeVideoAsset */
public final class C5869cj extends C5847bw {

    /* renamed from: A */
    public boolean f14818A;

    /* renamed from: B */
    public boolean f14819B;

    /* renamed from: C */
    public boolean f14820C;

    /* renamed from: D */
    public boolean f14821D;

    /* renamed from: E */
    public int f14822E;

    /* renamed from: F */
    public int f14823F;

    /* renamed from: G */
    public Map<String, Object> f14824G;

    /* renamed from: H */
    private boolean f14825H;

    /* renamed from: z */
    List<C5847bw> f14826z = new ArrayList();

    /* renamed from: com.inmobi.media.cj$a */
    /* compiled from: NativeVideoAsset */
    static class C5870a extends C5848bx {
        public C5870a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C5862cf cfVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, "none", "straight", "#ff000000", "#00000000", cfVar);
        }
    }

    public C5869cj(String str, String str2, C5848bx bxVar, C5950dw dwVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<C5868ci> list, JSONObject jSONObject, boolean z6) {
        super(str, str2, ShareConstants.VIDEO_URL, bxVar);
        this.f14707e = dwVar;
        this.f14711i = 2;
        this.f14818A = z;
        this.f14819B = z2;
        this.f14820C = z3;
        this.f14821D = z4;
        this.f14825H = z6;
        if (dwVar != null) {
            this.f14720r = dwVar.mo35058a();
            List<C5868ci> d = dwVar.mo35063d();
            Map<String, String> map = null;
            if (list != null) {
                for (C5868ci next : list) {
                    if ("OMID_VIEWABILITY".equals(next.f14815d)) {
                        map = next.f14816e;
                        if (!TextUtils.isEmpty(next.f14813b)) {
                            d.add(next);
                        }
                    } else {
                        d.add(next);
                    }
                }
            }
            for (C5868ci next2 : d) {
                if ("OMID_VIEWABILITY".equals(next2.f14815d)) {
                    next2.f14816e = map;
                }
            }
            if (!d.isEmpty()) {
                mo34825a(d);
            }
        }
        if (jSONObject != null) {
            this.f14708f = jSONObject;
        }
        this.f14724v.put("placementType", (byte) 0);
        this.f14724v.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        this.f14724v.put(TJAdUnitConstants.String.VISIBLE, Boolean.FALSE);
        this.f14724v.put("seekPosition", 0);
        this.f14724v.put("didStartPlaying", Boolean.FALSE);
        this.f14724v.put("didPause", Boolean.FALSE);
        this.f14724v.put("didCompleteQ1", Boolean.FALSE);
        this.f14724v.put("didCompleteQ2", Boolean.FALSE);
        this.f14724v.put("didCompleteQ3", Boolean.FALSE);
        this.f14724v.put("didCompleteQ4", Boolean.FALSE);
        this.f14724v.put("didRequestFullScreen", Boolean.FALSE);
        this.f14724v.put("isFullScreen", Boolean.FALSE);
        this.f14724v.put("didImpressionFire", Boolean.FALSE);
        this.f14724v.put("mapViewabilityParams", new HashMap());
        this.f14724v.put("didSignalVideoCompleted", Boolean.FALSE);
        this.f14724v.put("shouldAutoPlay", Boolean.valueOf(z5));
        this.f14724v.put("lastMediaVolume", 0);
        this.f14724v.put("currentMediaVolume", 0);
        this.f14724v.put("didQ4Fire", Boolean.FALSE);
    }

    /* renamed from: a */
    public final boolean mo34866a() {
        if (this.f14825H) {
            return this.f14818A && !C6183hw.m18331e();
        }
        return this.f14818A;
    }

    /* renamed from: a */
    public final void mo34865a(C5869cj cjVar) {
        this.f14724v.putAll(cjVar.f14724v);
        this.f14824G.putAll(cjVar.f14824G);
        this.f14723u = cjVar.f14723u;
    }

    /* renamed from: b */
    public final C5950dw mo34867b() {
        if (this.f14707e == null) {
            return null;
        }
        return (C5950dw) this.f14707e;
    }
}
