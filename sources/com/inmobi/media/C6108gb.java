package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gb */
/* compiled from: ConfigNetworkResponse */
final class C6108gb {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15427b = C6108gb.class.getSimpleName();

    /* renamed from: a */
    Map<String, C6109a> f15428a = new HashMap();

    /* renamed from: c */
    private TreeMap<String, C6093fu> f15429c;

    /* renamed from: d */
    private C6157hb f15430d;

    /* renamed from: e */
    private C6099fx f15431e;

    /* renamed from: f */
    private long f15432f;

    /* renamed from: a */
    private static boolean m18123a(int i) {
        return 500 <= i && i < 600;
    }

    C6108gb(C6107ga gaVar, C6157hb hbVar, long j) {
        this.f15429c = new TreeMap<>(gaVar.f15426c);
        this.f15430d = hbVar;
        this.f15432f = j;
        m18126c();
    }

    /* renamed from: c */
    private void m18126c() {
        if (!this.f15430d.mo35349a()) {
            try {
                JSONObject jSONObject = new JSONObject(this.f15430d.mo35350b());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (this.f15429c.get(next) != null) {
                        this.f15428a.put(next, new C6109a(jSONObject2, this.f15429c.get(next)));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("name", m18122a((Map<String, C6093fu>) this.f15429c));
                hashMap.put("lts", m18125b(this.f15429c));
                C6168hl.m18270a().mo35377a("ConfigFetched", (Map<String, Object>) hashMap);
            } catch (JSONException e) {
                this.f15431e = new C6099fx((byte) 2, e.getLocalizedMessage());
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                hashMap2.put("name", m18122a((Map<String, C6093fu>) this.f15429c));
                hashMap2.put("lts", m18125b(this.f15429c));
                hashMap2.put("networkType", C6210ik.m18428b());
                C6168hl.m18270a().mo35377a("InvalidConfig", (Map<String, Object>) hashMap2);
            }
        } else {
            for (Map.Entry next2 : this.f15429c.entrySet()) {
                C6109a aVar = new C6109a((JSONObject) null, (C6093fu) next2.getValue());
                aVar.f15435c = new C6099fx((byte) 0, "Network error in fetching config.");
                this.f15428a.put((String) next2.getKey(), aVar);
            }
            this.f15431e = new C6099fx((byte) 0, this.f15430d.f15541a.f15518b);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(this.f15430d.f15541a.f15517a));
            hashMap3.put("name", m18122a((Map<String, C6093fu>) this.f15429c));
            hashMap3.put("lts", m18125b(this.f15429c));
            hashMap3.put("networkType", C6210ik.m18428b());
            C6168hl.m18270a().mo35377a("InvalidConfig", (Map<String, Object>) hashMap3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35296a() {
        C6157hb hbVar = this.f15430d;
        if (hbVar == null || hbVar.f15541a == null) {
            return false;
        }
        return this.f15430d.f15541a.f15517a == -7 || m18123a(this.f15430d.f15541a.f15517a);
    }

    /* renamed from: com.inmobi.media.gb$a */
    /* compiled from: ConfigNetworkResponse */
    public static class C6109a {

        /* renamed from: a */
        int f15433a;

        /* renamed from: b */
        C6093fu f15434b;

        /* renamed from: c */
        C6099fx f15435c;

        C6109a(JSONObject jSONObject, C6093fu fuVar) {
            this.f15434b = fuVar;
            if (jSONObject != null) {
                try {
                    int i = jSONObject.getInt("status");
                    int i2 = 500;
                    if (i == 200) {
                        i2 = 200;
                    } else if (i == 304) {
                        i2 = 304;
                    } else if (i == 404) {
                        i2 = 404;
                    } else if (i != 500) {
                        i2 = -1;
                    }
                    this.f15433a = i2;
                    if (i2 == 200) {
                        C6093fu a = C6093fu.m18078a(this.f15434b.mo35278b(), jSONObject.getJSONObject("content"), this.f15434b.mo35284g());
                        if (a != null) {
                            this.f15434b = a;
                        }
                        if (this.f15434b == null || !this.f15434b.mo35280d()) {
                            this.f15435c = new C6099fx((byte) 2, "The received config has failed validation.");
                            String unused = C6108gb.f15427b;
                            this.f15434b.mo35278b();
                        }
                    } else if (i2 == 304) {
                        String unused2 = C6108gb.f15427b;
                        this.f15434b.mo35278b();
                    } else {
                        this.f15435c = new C6099fx((byte) 1, "Internal error");
                        String unused3 = C6108gb.f15427b;
                        this.f15434b.mo35278b();
                    }
                } catch (JSONException e) {
                    this.f15435c = new C6099fx((byte) 2, e.getLocalizedMessage());
                    String unused4 = C6108gb.f15427b;
                    this.f15434b.mo35278b();
                }
            }
        }

        /* renamed from: a */
        public final boolean mo35297a() {
            return this.f15435c != null;
        }
    }

    /* renamed from: a */
    private static String m18122a(Map<String, C6093fu> map) {
        if (map.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : map.keySet()) {
            sb.append(append);
            sb.append(",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }

    /* renamed from: b */
    private static String m18125b(Map<String, C6093fu> map) {
        if (map.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        new C6098fw();
        for (Map.Entry next : map.entrySet()) {
            sb.append(C6098fw.m18105c((String) next.getKey(), ((C6093fu) next.getValue()).mo35284g()));
            sb.append(",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }
}
