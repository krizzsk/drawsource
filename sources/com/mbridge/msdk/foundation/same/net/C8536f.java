package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8462g;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p311f.C8539c;
import com.mbridge.msdk.foundation.same.report.p313a.C8573a;
import com.mbridge.msdk.foundation.tools.C8672v;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f */
/* compiled from: Listener */
public class C8536f<T> implements C8532e<T> {

    /* renamed from: a */
    private long f20916a;

    /* renamed from: b */
    private C8573a f20917b = null;

    /* renamed from: d */
    public String f20918d = "";

    /* renamed from: e */
    public String f20919e = "";

    /* renamed from: f */
    public int f20920f = 0;

    /* renamed from: a */
    public void mo57893a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo57894a(C8508a aVar) {
    }

    /* renamed from: b */
    public void mo57896b() {
    }

    /* renamed from: c */
    public void mo57952c() {
    }

    /* renamed from: d */
    public final void mo57954d() {
    }

    /* renamed from: e */
    public final void mo57955e() {
    }

    /* renamed from: a */
    public void mo57951a() {
        this.f20916a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo57895a(C8557k<T> kVar) {
        try {
            String str = C8388a.m23845e().mo56914h() + "_" + this.f20919e + "_" + this.f20918d + "_" + this.f20920f;
            if (kVar.f21015a instanceof JSONObject) {
                C8539c.m24459a().mo57964a(str, ((JSONObject) kVar.f21015a).optInt("status"), ((JSONObject) kVar.f21015a).toString(), System.currentTimeMillis());
            }
            if (kVar.f21015a instanceof String) {
                C8539c.m24459a().mo57964a(str, new JSONObject((String) kVar.f21015a).optInt("status"), (String) kVar.f21015a, System.currentTimeMillis());
            }
        } catch (Exception e) {
            C8672v.m24878d("Listener", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo57961a(long j) {
        C8573a aVar = new C8573a(new C8462g());
        this.f20917b = aVar;
        aVar.mo58050b(this.f20918d);
        this.f20917b.mo58047a(1);
        C8573a aVar2 = this.f20917b;
        aVar2.mo58048a((j - this.f20916a) + "");
    }

    /* renamed from: a */
    public final void mo57960a(int i) {
        C8573a aVar = this.f20917b;
        if (aVar != null) {
            aVar.mo58049b(i);
            this.f20917b.mo58046a();
        }
    }

    /* renamed from: b */
    public final void mo57962b(int i) {
        C8573a aVar = this.f20917b;
        if (aVar != null) {
            aVar.mo58051c(i);
        }
    }
}
