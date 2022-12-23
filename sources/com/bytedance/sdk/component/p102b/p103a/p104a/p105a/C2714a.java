package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2735d;
import com.bytedance.sdk.component.p102b.p103a.C2740g;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.a */
/* compiled from: NetCall */
public class C2714a implements C2724b {

    /* renamed from: c */
    private static AtomicBoolean f6041c = new AtomicBoolean(false);

    /* renamed from: a */
    C2746k f6042a;

    /* renamed from: b */
    C2735d f6043b;

    C2714a(C2746k kVar, C2735d dVar) {
        this.f6042a = kVar;
        this.f6043b = dVar;
    }

    /* renamed from: a */
    public C2750m mo17389a() throws IOException {
        this.f6043b.mo17403c().remove(this);
        this.f6043b.mo17404d().add(this);
        if (this.f6043b.mo17403c().size() + this.f6043b.mo17404d().size() > this.f6043b.mo17400a() || f6041c.get()) {
            this.f6043b.mo17404d().remove(this);
            return null;
        } else if (this.f6042a.f6129a == null || this.f6042a.f6129a.f6109a == null || this.f6042a.f6129a.f6109a.size() <= 0) {
            return mo17390a(this.f6042a);
        } else {
            ArrayList arrayList = new ArrayList(this.f6042a.f6129a.f6109a);
            arrayList.add(new C2740g() {
                /* renamed from: a */
                public C2750m mo17394a(C2740g.C2741a aVar) throws IOException {
                    return C2714a.this.mo17390a(aVar.mo17396a());
                }
            });
            return ((C2740g) arrayList.get(0)).mo17394a(new C2717b(arrayList, this.f6042a));
        }
    }

    /* renamed from: a */
    public C2750m mo17390a(C2746k kVar) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(kVar.mo17505b().mo17478a().toString()).openConnection();
            if (kVar.mo17507d() != null && kVar.mo17507d().size() > 0) {
                for (Map.Entry next : kVar.mo17507d().entrySet()) {
                    for (String addRequestProperty : (List) next.getValue()) {
                        httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                    }
                }
            }
            if (kVar.mo17509f() == null) {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            } else {
                if (!m7319c() && kVar.mo17509f().f6137a != null && !TextUtils.isEmpty(kVar.mo17509f().f6137a.mo17495a())) {
                    httpURLConnection.addRequestProperty("Content-Type", kVar.mo17509f().f6137a.mo17495a());
                }
                httpURLConnection.setRequestMethod(kVar.mo17506c());
                if (ShareTarget.METHOD_POST.equalsIgnoreCase(kVar.mo17506c())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(kVar.mo17509f().f6138b.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (kVar.f6129a != null) {
                if (kVar.f6129a.f6111c != null) {
                    httpURLConnection.setConnectTimeout((int) kVar.f6129a.f6111c.toMillis(kVar.f6129a.f6110b));
                }
                if (kVar.f6129a.f6111c != null) {
                    httpURLConnection.setReadTimeout((int) kVar.f6129a.f6113e.toMillis(kVar.f6129a.f6112d));
                }
            }
            httpURLConnection.connect();
            if (f6041c.get()) {
                httpURLConnection.disconnect();
                this.f6043b.mo17404d().remove(this);
                return null;
            }
            C2722f fVar = new C2722f(httpURLConnection, kVar);
            this.f6043b.mo17404d().remove(this);
            return fVar;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.f6043b.mo17404d().remove(this);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m7319c() {
        if (this.f6042a.mo17507d() == null) {
            return false;
        }
        return this.f6042a.mo17507d().containsKey("Content-Type");
    }

    /* renamed from: a */
    public void mo17391a(final C2734c cVar) {
        this.f6043b.mo17402b().submit(new Runnable() {
            public void run() {
                try {
                    C2750m a = C2714a.this.mo17389a();
                    if (a == null) {
                        cVar.mo15674a((C2724b) C2714a.this, new IOException("response is null"));
                    } else {
                        cVar.mo15673a((C2724b) C2714a.this, a);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    cVar.mo15674a((C2724b) C2714a.this, e);
                }
            }
        });
    }

    /* renamed from: b */
    public C2724b clone() {
        return new C2714a(this.f6042a, this.f6043b);
    }
}
