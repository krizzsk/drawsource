package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.network.C4474b0;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.response.C5238j;
import com.fyber.inneractive.sdk.response.C5239k;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.e0 */
public abstract class C4482e0<T> implements C4474b0<T> {

    /* renamed from: a */
    public volatile boolean f11022a = false;

    /* renamed from: b */
    public final C4521u<T> f11023b;

    /* renamed from: c */
    public C4486g f11024c;

    /* renamed from: d */
    public C4474b0.C4475a f11025d;

    /* renamed from: e */
    public C4493j f11026e;

    /* renamed from: f */
    public volatile C4501m0 f11027f = C4501m0.INITIAL;

    /* renamed from: com.fyber.inneractive.sdk.network.e0$a */
    public class C4483a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f11028a;

        /* renamed from: b */
        public final /* synthetic */ Exception f11029b;

        /* renamed from: c */
        public final /* synthetic */ boolean f11030c;

        public C4483a(Object obj, Exception exc, boolean z) {
            this.f11028a = obj;
            this.f11029b = exc;
            this.f11030c = z;
        }

        public void run() {
            C4482e0.this.f11023b.mo24154a(this.f11028a, this.f11029b, this.f11030c);
        }
    }

    public C4482e0(C4521u<T> uVar, C4486g gVar) {
        this.f11023b = uVar;
        this.f11024c = gVar;
    }

    /* renamed from: a */
    public void mo24641a(C4472a0 a0Var, String str, String str2) {
    }

    /* renamed from: a */
    public void mo24643a(T t, Exception exc, boolean z) {
        C5299n.f14024b.post(new C4483a(t, exc, z));
    }

    /* renamed from: b */
    public void mo24644b() {
        try {
            C4493j jVar = this.f11026e;
            if (jVar != null) {
                jVar.mo24680a();
            }
            this.f11024c.mo24674b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public String mo24645c() {
        return null;
    }

    /* renamed from: e */
    public boolean mo24646e() {
        return this.f11022a;
    }

    /* renamed from: g */
    public C4471a<T> mo24648g() {
        return null;
    }

    /* renamed from: h */
    public C4251s mo24649h() {
        return null;
    }

    /* renamed from: i */
    public C4508o0 mo24650i() {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        return new C4508o0(iAConfigManager.f10356v.f10459b.mo24271a("connect_timeout", 5000, 1), iAConfigManager.f10356v.f10459b.mo24271a("read_timeout", 5000, 1));
    }

    /* renamed from: k */
    public byte[] mo24652k() {
        return null;
    }

    /* renamed from: l */
    public C4501m0 mo24653l() {
        return this.f11027f;
    }

    /* renamed from: m */
    public String mo24654m() {
        return "application/json; charset=utf-8";
    }

    /* renamed from: q */
    public Map<String, String> mo24657q() {
        return null;
    }

    /* renamed from: a */
    public C4493j mo24639a(String str) throws Exception {
        try {
            C4474b0.C4475a aVar = this.f11025d;
            if (aVar != null) {
                aVar.mo24155a("sdkInitNetworkRequest");
            }
            this.f11026e = this.f11024c.mo24673a(this, C5292l.m16517f(), str);
            C4474b0.C4475a aVar2 = this.f11025d;
            if (aVar2 != null) {
                aVar2.mo24155a("sdkGotServerResponse");
            }
            return this.f11026e;
        } catch (C4473b e) {
            IAlog.m16445a("failed start network request", e, new Object[0]);
            throw e;
        } catch (C4515q0 e2) {
            IAlog.m16445a("failed read network response", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m16445a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    /* renamed from: a */
    public void mo24642a(C4501m0 m0Var) {
        this.f11027f = m0Var;
    }

    /* renamed from: a */
    public C5233e mo24671a(int i, C4500m mVar, C5238j jVar, C4306g gVar) throws Exception {
        try {
            C5229a a = C5229a.m16362a(i);
            if (a == null) {
                a = C5229a.RETURNED_ADTYPE_MRAID;
            }
            C5230b a2 = C4339b.C4340a.f10657a.mo24484a(a);
            if (a2 == null) {
                IAlog.m16450e("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (C4339b.C4340a.f10657a.f10656a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new C4529z("Could not find parser for ad type " + i);
            }
            IAlog.m16446a("Received ad type %s - Got parser! %s", Integer.valueOf(i), a2);
            if (jVar != null) {
                a2.f13856c = jVar;
            }
            a2.f13854a = a2.mo24319a();
            if (mVar != null) {
                a2.f13856c = new C5239k(mVar);
            }
            C5233e a3 = a2.mo26309a((String) null);
            if (gVar != null) {
                a3.f13883s = gVar;
            }
            C4474b0.C4475a aVar = this.f11025d;
            if (aVar != null) {
                aVar.mo24155a("sdkParsedResponse");
            }
            return a3;
        } catch (Exception e) {
            IAlog.m16445a("failed parse ad network request", e, new Object[0]);
            throw new C4529z(e);
        }
    }
}
