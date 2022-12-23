package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.h0 */
public class C4489h0 extends C4482e0<String> {

    /* renamed from: g */
    public final String f11038g;

    /* renamed from: h */
    public final AtomicInteger f11039h;

    public C4489h0(C4521u<String> uVar, String str) {
        this(uVar, str, C4522v.m13803b().mo24698a());
    }

    /* renamed from: a */
    public String mo24640a() {
        return this.f11038g;
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return this.f11039h.getAndIncrement() < 4;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11197d;
    }

    /* renamed from: p */
    public int mo24656p() {
        return ((int) Math.pow(2.0d, (double) this.f11039h.get())) * 1000;
    }

    public C4489h0(C4521u<String> uVar, String str, C4486g gVar) {
        super(uVar, gVar);
        this.f11039h = new AtomicInteger();
        this.f11038g = str;
    }

    /* renamed from: a */
    public C4472a0 mo24638a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C4472a0 a0Var = new C4472a0();
            a0Var.f10996a = String.valueOf(i);
            if (inputStream != null) {
                a0Var.f10997b = C5312s.m16535a(inputStream, false).toString();
            }
            return a0Var;
        } catch (Exception e) {
            IAlog.m16445a("failed parse hit network request", e, new Object[0]);
            throw new C4529z(e);
        }
    }
}
