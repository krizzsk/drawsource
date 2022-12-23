package com.bytedance.sdk.openadsdk.core.p154j;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3474a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3482a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3484b;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.d */
/* compiled from: VideoTrackers */
public class C3501d {

    /* renamed from: a */
    public List<C3487c> f8746a = new ArrayList();

    /* renamed from: b */
    public List<C3487c> f8747b = new ArrayList();

    /* renamed from: c */
    public List<C3487c> f8748c = new ArrayList();

    /* renamed from: d */
    public List<C3487c> f8749d = new ArrayList();

    /* renamed from: e */
    public List<C3487c> f8750e = new ArrayList();

    /* renamed from: f */
    public List<C3487c> f8751f = new ArrayList();

    /* renamed from: g */
    public List<C3487c> f8752g = new ArrayList();

    /* renamed from: h */
    public List<C3487c> f8753h = new ArrayList();

    /* renamed from: i */
    public List<C3487c> f8754i = new ArrayList();

    /* renamed from: j */
    public List<C3487c> f8755j = new ArrayList();

    /* renamed from: k */
    public List<C3484b> f8756k = new ArrayList();

    /* renamed from: l */
    public List<C3482a> f8757l = new ArrayList();

    /* renamed from: m */
    private C3473a f8758m;

    /* renamed from: n */
    private final AtomicBoolean f8759n = new AtomicBoolean(false);

    /* renamed from: o */
    private long f8760o;

    /* renamed from: p */
    private C3431n f8761p;

    /* renamed from: q */
    private boolean f8762q;

    /* renamed from: r */
    private boolean f8763r;

    /* renamed from: s */
    private boolean f8764s;

    /* renamed from: t */
    private String f8765t;

    public C3501d(C3473a aVar) {
        this.f8758m = aVar;
    }

    /* renamed from: a */
    public void mo19949a(C3474a aVar) {
        m10881a(-1, this.f8746a, aVar);
    }

    /* renamed from: a */
    public void mo19946a(long j) {
        if (this.f8759n.compareAndSet(false, true)) {
            m10881a(j, this.f8747b, (C3474a) null);
        }
    }

    /* renamed from: b */
    public void mo19956b(long j) {
        m10881a(j, this.f8748c, (C3474a) null);
    }

    /* renamed from: c */
    public void mo19958c(long j) {
        m10881a(j, this.f8749d, (C3474a) null);
    }

    /* renamed from: d */
    public void mo19960d(long j) {
        m10881a(j, this.f8750e, (C3474a) null);
    }

    /* renamed from: e */
    public void mo19962e(long j) {
        m10881a(j, this.f8751f, (C3474a) null);
    }

    /* renamed from: f */
    public void mo19964f(long j) {
        m10881a(j, this.f8752g, (C3474a) null);
    }

    /* renamed from: g */
    public void mo19966g(long j) {
        m10881a(j, this.f8753h, (C3474a) null);
    }

    /* renamed from: h */
    public void mo19968h(long j) {
        m10881a(j, this.f8754i, (C3474a) null);
    }

    /* renamed from: i */
    public void mo19970i(long j) {
        m10881a(j, this.f8755j, (C3474a) null);
    }

    /* renamed from: a */
    public void mo19947a(long j, long j2) {
        if (System.currentTimeMillis() - this.f8760o >= 1000 && j >= 0 && j2 > 0) {
            this.f8760o = System.currentTimeMillis();
            float f = ((float) j) / ((float) j2);
            m10881a(j, mo19944a(j, f), (C3474a) null);
            if (f >= 0.25f && !this.f8762q) {
                m10883b(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
                this.f8762q = true;
            } else if (f >= 0.5f && !this.f8763r) {
                m10883b("midpoint");
                this.f8763r = true;
            } else if (f >= 0.75f && !this.f8764s) {
                m10883b(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
                this.f8764s = true;
            }
        }
    }

    /* renamed from: b */
    private void m10883b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            C3090e.m8919b(C3513m.m10963a(), this.f8761p, this.f8765t, "vast_play_track", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m10881a(long j, List<C3487c> list, C3474a aVar) {
        C3473a aVar2 = this.f8758m;
        C3487c.m10849b(list, aVar, j, aVar2 != null ? aVar2.mo19903g() : null);
    }

    /* renamed from: a */
    public List<C3487c> mo19944a(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f8756k.size(); i++) {
            C3484b bVar = this.f8756k.get(i);
            if (bVar.mo19923a(f)) {
                arrayList.add(bVar);
            }
        }
        for (int i2 = 0; i2 < this.f8757l.size(); i2++) {
            C3482a aVar = this.f8757l.get(i2);
            if (aVar.mo19919a(j)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo19954a(List<C3487c> list) {
        this.f8747b.addAll(list);
    }

    /* renamed from: b */
    public void mo19957b(List<C3487c> list) {
        this.f8748c.addAll(list);
    }

    /* renamed from: c */
    public void mo19959c(List<C3487c> list) {
        this.f8749d.addAll(list);
    }

    /* renamed from: d */
    public void mo19961d(List<C3487c> list) {
        this.f8750e.addAll(list);
    }

    /* renamed from: e */
    public void mo19963e(List<C3487c> list) {
        this.f8751f.addAll(list);
    }

    /* renamed from: f */
    public void mo19965f(List<C3487c> list) {
        this.f8752g.addAll(list);
    }

    /* renamed from: g */
    public void mo19967g(List<C3487c> list) {
        this.f8753h.addAll(list);
    }

    /* renamed from: h */
    public void mo19969h(List<C3484b> list) {
        this.f8756k.addAll(list);
        Collections.sort(this.f8756k);
    }

    /* renamed from: i */
    public void mo19971i(List<C3482a> list) {
        this.f8757l.addAll(list);
        Collections.sort(this.f8757l);
    }

    /* renamed from: j */
    public void mo19972j(List<C3487c> list) {
        this.f8746a.addAll(list);
    }

    /* renamed from: k */
    public void mo19973k(List<C3487c> list) {
        this.f8754i.addAll(list);
    }

    /* renamed from: l */
    public void mo19974l(List<C3487c> list) {
        this.f8755j.addAll(list);
    }

    /* renamed from: a */
    public JSONObject mo19945a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", C3487c.m10848b(this.f8746a));
        jSONObject.put("impressionTrackers", C3487c.m10848b(this.f8747b));
        jSONObject.put("pauseTrackers", C3487c.m10848b(this.f8748c));
        jSONObject.put("resumeTrackers", C3487c.m10848b(this.f8749d));
        jSONObject.put("completeTrackers", C3487c.m10848b(this.f8750e));
        jSONObject.put("closeTrackers", C3487c.m10848b(this.f8751f));
        jSONObject.put("skipTrackers", C3487c.m10848b(this.f8752g));
        jSONObject.put("clickTrackers", C3487c.m10848b(this.f8753h));
        jSONObject.put("muteTrackers", C3487c.m10848b(this.f8754i));
        jSONObject.put("unMuteTrackers", C3487c.m10848b(this.f8755j));
        jSONObject.put("fractionalTrackers", m10882b());
        jSONObject.put("absoluteTrackers", m10884c());
        return jSONObject;
    }

    /* renamed from: b */
    private JSONArray m10882b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C3484b b : this.f8756k) {
            jSONArray.put(b.mo19924b());
        }
        return jSONArray;
    }

    /* renamed from: c */
    private JSONArray m10884c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C3482a a : this.f8757l) {
            jSONArray.put(a.mo19918a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public void mo19955a(JSONObject jSONObject) {
        mo19972j(C3487c.m10844a(jSONObject.optJSONArray("errorTrackers")));
        mo19954a(C3487c.m10844a(jSONObject.optJSONArray("impressionTrackers")));
        mo19957b(C3487c.m10845a(jSONObject.optJSONArray("pauseTrackers"), true));
        mo19959c(C3487c.m10845a(jSONObject.optJSONArray("resumeTrackers"), true));
        mo19961d(C3487c.m10844a(jSONObject.optJSONArray("completeTrackers")));
        mo19963e(C3487c.m10844a(jSONObject.optJSONArray("closeTrackers")));
        mo19965f(C3487c.m10844a(jSONObject.optJSONArray("skipTrackers")));
        mo19967g(C3487c.m10844a(jSONObject.optJSONArray("clickTrackers")));
        mo19973k(C3487c.m10845a(jSONObject.optJSONArray("muteTrackers"), true));
        mo19974l(C3487c.m10845a(jSONObject.optJSONArray("unMuteTrackers"), true));
        mo19969h(C3487c.m10847b(jSONObject.optJSONArray("fractionalTrackers")));
        mo19971i(C3487c.m10850c(jSONObject.optJSONArray("absoluteTrackers")));
    }

    /* renamed from: a */
    public void mo19948a(C3431n nVar) {
        this.f8761p = nVar;
    }

    /* renamed from: a */
    public void mo19951a(String str) {
        this.f8765t = str;
    }

    /* renamed from: a */
    public void mo19953a(String str, long j) {
        if (!TextUtils.isEmpty(str) && j >= 0) {
            mo19971i((List<C3482a>) Collections.singletonList(new C3482a.C3483a(str, j).mo19921a()));
        }
    }

    /* renamed from: a */
    public void mo19952a(String str, float f) {
        if (!TextUtils.isEmpty(str) && f >= 0.0f) {
            mo19969h((List<C3484b>) Collections.singletonList(new C3484b.C3486a(str, f).mo19927a()));
        }
    }

    /* renamed from: a */
    public void mo19950a(C3501d dVar) {
        mo19972j(dVar.f8746a);
        mo19954a(dVar.f8747b);
        mo19957b(dVar.f8748c);
        mo19959c(dVar.f8749d);
        mo19961d(dVar.f8750e);
        mo19963e(dVar.f8751f);
        mo19965f(dVar.f8752g);
        mo19967g(dVar.f8753h);
        mo19973k(dVar.f8754i);
        mo19974l(dVar.f8755j);
        mo19969h(dVar.f8756k);
        mo19971i(dVar.f8757l);
    }
}
