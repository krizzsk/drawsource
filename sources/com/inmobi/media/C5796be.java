package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C11130Ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.be */
/* compiled from: AdStore */
public class C5796be {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f14581e = C5796be.class.getSimpleName();

    /* renamed from: a */
    public final C5801a f14582a;

    /* renamed from: b */
    public final C5791bc f14583b;

    /* renamed from: c */
    public long f14584c = 0;

    /* renamed from: d */
    public final C5816bj f14585d = new C5816bj() {
        /* renamed from: a */
        public final void mo34773a(C5786ay ayVar, final byte b) {
            C5796be.this.f14587g.mo34773a(ayVar, b);
            String unused = C5796be.f14581e;
            C5791bc unused2 = C5796be.this.f14583b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5796be.this.f14582a.mo34418a(C5796be.this.f14583b, false, C5796be.m17267a(b));
                }
            });
        }

        /* renamed from: a */
        public final void mo34772a(C5786ay ayVar) {
            C5796be.this.f14587g.mo34772a(ayVar);
            String unused = C5796be.f14581e;
            C5791bc unused2 = C5796be.this.f14583b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5796be.this.f14582a.mo34418a(C5796be.this.f14583b, true, (byte) 0);
                }
            });
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5842br f14586f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5816bj f14587g = new C5816bj() {
        /* renamed from: a */
        public final void mo34773a(C5786ay ayVar, byte b) {
            String unused = C5796be.f14581e;
            if (ayVar == null) {
            }
        }

        /* renamed from: a */
        public final void mo34772a(C5786ay ayVar) {
            String unused = C5796be.f14581e;
            if (ayVar != null) {
                Set<C5841bq> set = ayVar.f14541b;
                for (C5784ax next : ayVar.f14540a) {
                    if (!next.f14529j) {
                        String a = C5796be.m17270a(set, next);
                        HashMap hashMap = new HashMap();
                        hashMap.put("latency", Long.valueOf(next.f14520a));
                        hashMap.put("size", Float.valueOf((((float) C6237jb.m18539a(next.f14524e)) * 1.0f) / 1024.0f));
                        hashMap.put("assetType", a);
                        hashMap.put("networkType", C6210ik.m18428b());
                        hashMap.put(C11130Ad.AD_TYPE, C5796be.this.f14583b.mo34732l());
                        C5796be.this.f14586f.mo34442b("AssetDownloaded", hashMap);
                    }
                }
            }
            String unused2 = C5796be.f14581e;
            C5791bc unused3 = C5796be.this.f14583b;
        }
    };

    /* renamed from: com.inmobi.media.be$a */
    /* compiled from: AdStore */
    public interface C5801a {
        /* renamed from: a */
        void mo34418a(C5791bc bcVar, boolean z, byte b);
    }

    /* renamed from: a */
    static /* synthetic */ byte m17267a(byte b) {
        switch (b) {
            case 1:
                return 78;
            case 2:
                return 79;
            case 3:
                return 80;
            case 4:
                return 81;
            case 5:
                return 5;
            case 6:
                return 77;
            case 7:
                return Ascii.f18308US;
            case 8:
                return Ascii.ESC;
            default:
                return 82;
        }
    }

    public C5796be(C5801a aVar, C5842br brVar, C5791bc bcVar) {
        this.f14582a = aVar;
        this.f14586f = brVar;
        this.f14583b = bcVar;
    }

    /* renamed from: a */
    public final C5794bd mo34769a(C5877cq cqVar) throws C5843bs {
        try {
            return mo34770a(new JSONObject(cqVar.f14846a.mo35350b()));
        } catch (JSONException unused) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            mo34771a((Map<String, Object>) hashMap);
            throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        }
    }

    /* renamed from: a */
    public final C5794bd mo34770a(JSONObject jSONObject) throws C5843bs {
        C5794bd b = m17273b(jSONObject);
        if (b != null) {
            m17274b();
            if (!b.mo34757c() || b.mo34766l() != null) {
                return b;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            mo34771a((Map<String, Object>) hashMap);
            throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
        mo34771a((Map<String, Object>) hashMap2);
        throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
    }

    /* renamed from: b */
    private void m17274b() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14584c));
        hashMap.put(C11130Ad.AD_TYPE, this.f14583b.mo34732l());
        hashMap.put("networkType", C6210ik.m18428b());
        hashMap.put("plId", Long.valueOf(this.f14583b.mo34723e()));
        hashMap.put("plType", "NonAB");
        this.f14586f.mo34442b("ServerFill", hashMap);
    }

    /* renamed from: b */
    private C5794bd m17273b(JSONObject jSONObject) {
        try {
            String trim = jSONObject.optString("winningAdSetId").trim();
            JSONArray jSONArray = jSONObject.getJSONArray("adSets");
            String string = jSONObject.getString(C5794bd.KEY_REQUEST_ID);
            if (jSONArray.length() != 0) {
                C5794bd a = C5794bd.m17250a(jSONArray.getJSONObject(0), this.f14583b.mo34723e(), this.f14583b.mo34732l(), string);
                if (a != null) {
                    return a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
                mo34771a((Map<String, Object>) hashMap);
                return null;
            } else if (!TextUtils.isEmpty(trim)) {
                return null;
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14584c));
                hashMap2.put(C11130Ad.AD_TYPE, this.f14583b.mo34732l());
                hashMap2.put("networkType", C6210ik.m18428b());
                hashMap2.put("plId", Long.valueOf(this.f14583b.mo34723e()));
                hashMap2.put("plType", "NonAB");
                this.f14586f.mo34442b("ServerNoFill", hashMap2);
                throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), (byte) 0);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo34771a(Map<String, Object> map) {
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14584c));
        map.put(C11130Ad.AD_TYPE, this.f14583b.mo34732l());
        map.put("networkType", C6210ik.m18428b());
        map.put("plId", Long.valueOf(this.f14583b.mo34723e()));
        map.put("plType", "NonAB");
        this.f14586f.mo34442b("ServerError", map);
    }

    /* renamed from: a */
    public static void m17271a(C5876cp cpVar) {
        if (cpVar != null) {
            Map<String, String> map = cpVar.f14843d;
            if (map == null) {
                map = new HashMap<>();
            }
            cpVar.f14843d = map;
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m17270a(Set set, C5784ax axVar) {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C5841bq bqVar = (C5841bq) it.next();
            if (bqVar.f14697b.equals(axVar.f14523d)) {
                byte b = bqVar.f14696a;
                if (b == 0) {
                    str = "video";
                } else if (b == 1) {
                    str = "gif";
                } else if (b != 2) {
                    return "";
                } else {
                    str = "image";
                }
                return str;
            }
        }
        return "";
    }
}
