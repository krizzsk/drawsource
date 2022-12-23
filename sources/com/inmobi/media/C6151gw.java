package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.gw */
/* compiled from: InMobiNetworkClient */
public class C6151gw<T> implements Runnable {

    /* renamed from: b */
    private static final String f15510b = C6151gw.class.getSimpleName();

    /* renamed from: a */
    Class<T> f15511a;

    /* renamed from: c */
    private C6158hc f15512c;

    /* renamed from: d */
    private C6152gx f15513d;

    public C6151gw(C6152gx<T> gxVar, C6158hc hcVar, Class<T> cls) {
        this.f15513d = gxVar;
        this.f15512c = hcVar;
        this.f15511a = cls;
    }

    /* renamed from: a */
    public final void mo35332a() {
        new Thread(this).start();
    }

    public void run() {
        int i = 0;
        while (i <= this.f15512c.f15548b) {
            C6157hb a = new C6153gy(this.f15512c).mo35336a();
            if (!this.f15512c.f15547a.get()) {
                if (!a.mo35349a()) {
                    try {
                        if (this.f15513d != null) {
                            JSONObject jSONObject = new JSONObject(a.mo35350b());
                            if (this.f15511a.equals(JSONObject.class)) {
                                this.f15513d.mo35335a(jSONObject);
                                return;
                            }
                            this.f15513d.mo35335a(new C6225is().mo35434a(jSONObject, this.f15511a));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        if (this.f15513d != null && i == this.f15512c.f15548b) {
                            this.f15513d.mo35334a(new C6154gz(-10, e.getMessage()));
                            return;
                        }
                    }
                } else if (i == this.f15512c.f15548b) {
                    this.f15513d.mo35334a(a.f15541a);
                    return;
                }
                try {
                    Thread.sleep((long) (this.f15512c.f15549c * 1000));
                } catch (InterruptedException unused) {
                }
                if (!this.f15512c.f15547a.get()) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
