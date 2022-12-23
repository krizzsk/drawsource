package com.fyber.inneractive.sdk.network;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.g0 */
public class C4487g0 extends C4482e0<String> {

    /* renamed from: g */
    public String f11035g;

    /* renamed from: h */
    public final String f11036h;

    /* renamed from: i */
    public final AtomicInteger f11037i = new AtomicInteger();

    public C4487g0(C4521u<String> uVar, String str, String str2, C4486g gVar) {
        super(uVar, gVar);
        this.f11036h = str;
        this.f11035g = str2;
        this.f11024c = gVar;
    }

    /* renamed from: a */
    public String mo24640a() {
        return this.f11036h;
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return this.f11037i.getAndIncrement() < 4;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11195b;
    }

    /* renamed from: p */
    public int mo24656p() {
        return ((int) Math.pow(2.0d, (double) this.f11037i.get())) * 1000;
    }

    /* renamed from: a */
    public C4472a0 mo24638a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C4472a0 a0Var = new C4472a0();
            a0Var.f10996a = String.valueOf(i);
            return a0Var;
        } catch (Exception e) {
            IAlog.m16445a("failed parse event network request", e, new Object[0]);
            throw new C4529z(e);
        }
    }

    /* renamed from: k */
    public byte[] mo24652k() {
        byte[] bArr;
        try {
            IAlog.m16446a("NetworkRequestEvent: network request body %s", this.f11035g);
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = this.f11035g.getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = this.f11035g.getBytes("UTF-8");
            }
            return bArr;
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
