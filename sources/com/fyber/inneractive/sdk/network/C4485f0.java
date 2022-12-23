package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4177a;
import com.fyber.inneractive.sdk.cache.C4184h;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C4519t;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.f0 */
public class C4485f0<T> extends C4482e0<T> {

    /* renamed from: g */
    public final Context f11032g;

    /* renamed from: h */
    public final C4177a<T> f11033h;

    /* renamed from: i */
    public C4519t<T> f11034i;

    public C4485f0(C4521u<T> uVar, Context context, C4177a<T> aVar) {
        super(uVar, C4522v.m13803b().mo24698a());
        this.f11032g = context;
        this.f11033h = aVar;
    }

    /* renamed from: a */
    public C4472a0 mo24638a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        C4472a0 a0Var = new C4472a0();
        try {
            String stringBuffer = C5312s.m16535a(inputStream, false).toString();
            a0Var.f10996a = this.f11033h.mo24166a(stringBuffer);
            a0Var.f10997b = stringBuffer;
            return a0Var;
        } catch (Exception e) {
            IAlog.m16445a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C4529z(e);
        }
    }

    /* renamed from: c */
    public String mo24645c() {
        return this.f11033h.mo24170c();
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.LOW;
    }

    /* renamed from: g */
    public C4471a<T> mo24648g() {
        C4184h hVar;
        Context context = this.f11032g;
        C4177a<T> aVar = this.f11033h;
        C4519t<T> tVar = new C4519t<>(context, aVar);
        this.f11034i = tVar;
        try {
            if (!aVar.mo24171d()) {
                hVar = new C4184h(new C4519t.C4520a());
            } else {
                ResultData a = tVar.f11181b.mo24166a(tVar.mo24696a(tVar.f11181b.mo24170c()));
                if (tVar.f11182c == null) {
                    tVar.f11182c = context.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                hVar = new C4184h(a, tVar.f11182c.getString(tVar.f11181b.mo24169b(), (String) null));
            }
        } catch (Exception e) {
            if (tVar.f11182c == null) {
                tVar.f11182c = tVar.f11180a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f11182c.edit().remove(tVar.f11181b.mo24169b()).apply();
            hVar = new C4184h(e);
        }
        return new C4471a<>(hVar.f10289b, hVar.f10288a, this.f11033h.mo24170c());
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return false;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11197d;
    }

    /* renamed from: p */
    public int mo24656p() {
        return 0;
    }

    /* renamed from: a */
    public String mo24640a() {
        return this.f11033h.mo24167a();
    }

    /* renamed from: a */
    public void mo24641a(C4472a0 a0Var, String str, String str2) {
        C4519t<T> tVar = this.f11034i;
        if (tVar != null) {
            if (tVar.f11182c == null) {
                tVar.f11182c = tVar.f11180a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f11182c.edit().putString(tVar.f11181b.mo24169b(), str2).apply();
            if (!a0Var.f10997b.isEmpty() && !str.isEmpty()) {
                if (!this.f11034i.mo24697a(str, a0Var.f10997b)) {
                    IAlog.m16447b("Failed to cache file", new Object[0]);
                } else {
                    this.f11033h.mo24168a(a0Var.f10996a);
                }
            }
        }
    }
}
