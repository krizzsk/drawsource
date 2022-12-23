package com.mbridge.msdk.foundation.same.net.stack;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.net.stack.b */
/* compiled from: OKHTTPClientManager */
public final class C8565b {

    /* renamed from: a */
    private OkHttpClient f21034a;

    /* renamed from: b */
    private C2440a f21035b;

    /* renamed from: c */
    private String f21036c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.b$a */
    /* compiled from: OKHTTPClientManager */
    private static final class C8569a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8565b f21041a = new C8565b();
    }

    private C8565b() {
        this.f21034a = null;
        this.f21036c = "";
    }

    /* renamed from: a */
    public static C8565b m24560a() {
        return C8569a.f21041a;
    }

    /* renamed from: b */
    public final synchronized OkHttpClient mo58033b() {
        if (this.f21034a == null) {
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(10);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.readTimeout(100, TimeUnit.SECONDS);
            builder.connectTimeout(60, TimeUnit.SECONDS);
            builder.writeTimeout(60, TimeUnit.SECONDS);
            builder.connectionPool(new ConnectionPool(32, 5, TimeUnit.MINUTES));
            builder.dispatcher(dispatcher);
            builder.eventListener(new EventListener() {
            });
            this.f21034a = builder.build();
        }
        return this.f21034a;
    }

    /* renamed from: c */
    public final C8570b mo58034c() {
        C8570b bVar = new C8570b();
        bVar.f21047f = this.f21036c;
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo58032a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f21035b == null) {
                this.f21035b = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
            }
            if (this.f21035b == null) {
                return false;
            }
            String s = this.f21035b.mo16255s();
            String str2 = C8543d.m24463a().f20952a;
            if (TextUtils.isEmpty(s) || !str.startsWith(s) || TextUtils.equals(s, str2)) {
                return false;
            }
            this.f21036c = s;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo58031a(C8570b bVar) {
        if (bVar != null) {
            final C8570b a = C8570b.m24568a(bVar);
            C8498b.m24359a().execute(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder("key=2000102&");
                        sb.append("app_id=");
                        sb.append(C8388a.m23845e().mo56914h());
                        sb.append("&");
                        sb.append("status=");
                        sb.append(a.f21042a);
                        sb.append("&");
                        sb.append("domain=");
                        sb.append(a.f21047f);
                        sb.append("&");
                        sb.append("method=");
                        sb.append(a.f21045d);
                        sb.append("&");
                        if (!TextUtils.isEmpty(a.f21049h)) {
                            sb.append("dns_r=");
                            sb.append(a.f21049h);
                            sb.append("&");
                            sb.append("dns_d=");
                            sb.append(a.f21048g);
                            sb.append("&");
                            sb.append("host=");
                            sb.append(a.f21046e);
                            sb.append("&");
                            if (!TextUtils.isEmpty(a.f21051j)) {
                                sb.append("connect_e=");
                                sb.append(a.f21051j);
                            } else if (TextUtils.isEmpty(a.f21044c)) {
                                sb.append("call_d=");
                                sb.append(a.f21043b);
                                sb.append("&");
                                sb.append("connect_d=");
                                sb.append(a.f21050i);
                                sb.append("&");
                                sb.append("connection_d=");
                                sb.append(a.f21052k);
                            } else {
                                sb.append("connect_d=");
                                sb.append(a.f21050i);
                                sb.append("&");
                                sb.append("connection_e=");
                                sb.append(a.f21044c);
                            }
                        } else if (!TextUtils.isEmpty(a.f21044c)) {
                            sb.append("connect_e=");
                            sb.append(a.f21044c);
                        } else if (!TextUtils.isEmpty(a.f21051j)) {
                            sb.append("connect_e=");
                            sb.append(a.f21051j);
                        }
                        if (C8574b.m24577a().mo58054c()) {
                            C8574b.m24577a().mo58052a(sb.toString());
                            return;
                        }
                        C8565b bVar = C8565b.this;
                        String sb2 = sb.toString();
                        Context g = C8388a.m23845e().mo56913g();
                        C8596a aVar = new C8596a(g);
                        C8550d a = C8598e.m24658a(g);
                        a.mo57981a("data", URLEncoder.encode(sb2, "utf-8"));
                        a.mo57981a("m_sdk", "msdk");
                        aVar.mo57978c(0, C8543d.m24463a().f20952a, a, new C8597b() {
                            /* renamed from: a */
                            public final void mo37053a(String str) {
                                C8672v.m24874a("OKHTTPClientManager", "report success");
                            }

                            /* renamed from: b */
                            public final void mo37054b(String str) {
                                C8672v.m24874a("OKHTTPClientManager", "report failed");
                            }
                        });
                    } catch (Exception e) {
                        C8672v.m24878d("OKHTTPClientManager", e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.stack.b$b */
    /* compiled from: OKHTTPClientManager */
    public static class C8570b implements Serializable {

        /* renamed from: a */
        public int f21042a;

        /* renamed from: b */
        public long f21043b = 0;

        /* renamed from: c */
        public String f21044c = "";

        /* renamed from: d */
        public String f21045d = "";

        /* renamed from: e */
        public String f21046e = "";

        /* renamed from: f */
        public String f21047f = "";

        /* renamed from: g */
        public long f21048g = 0;

        /* renamed from: h */
        public String f21049h = "";

        /* renamed from: i */
        public long f21050i = 0;

        /* renamed from: j */
        public String f21051j = "";

        /* renamed from: k */
        public long f21052k = 0;

        /* renamed from: a */
        public static C8570b m24568a(C8570b bVar) {
            C8570b bVar2 = new C8570b();
            bVar2.f21042a = bVar.f21042a;
            bVar2.f21045d = bVar.f21045d;
            bVar2.f21047f = bVar.f21047f;
            bVar2.f21043b = bVar.f21043b;
            bVar2.f21050i = bVar.f21050i;
            bVar2.f21044c = bVar.f21044c;
            bVar2.f21049h = bVar.f21049h;
            bVar2.f21048g = bVar.f21048g;
            bVar2.f21046e = bVar.f21046e;
            bVar2.f21051j = bVar.f21051j;
            bVar2.f21052k = bVar.f21052k;
            return bVar2;
        }
    }
}
