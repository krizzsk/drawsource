package com.bytedance.sdk.component.p118e.p121c;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.C2839a;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import com.bytedance.sdk.component.p118e.p122d.C2870e;
import com.bytedance.sdk.component.p118e.p122d.C2871f;
import com.bytedance.sdk.component.p118e.p122d.C2872g;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.c.a */
/* compiled from: AppConfig */
public class C2851a implements C2872g.C2873a {

    /* renamed from: b */
    private static C2851a f6383b;

    /* renamed from: a */
    final C2872g f6384a = new C2872g(Looper.getMainLooper(), this);

    /* renamed from: c */
    private final boolean f6385c;

    /* renamed from: d */
    private volatile boolean f6386d = false;

    /* renamed from: e */
    private boolean f6387e = true;

    /* renamed from: f */
    private boolean f6388f = false;

    /* renamed from: g */
    private long f6389g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f6390h = 0;

    /* renamed from: i */
    private ThreadPoolExecutor f6391i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f6392j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f6393k;

    /* renamed from: l */
    private volatile boolean f6394l = false;

    /* renamed from: m */
    private C2839a f6395m;

    /* renamed from: n */
    private int f6396n;

    /* renamed from: a */
    public static C2851a m7918a(Context context) {
        C2851a aVar;
        synchronized (C2851a.class) {
            if (f6383b == null) {
                f6383b = new C2851a(context.getApplicationContext(), C2871f.m8008b(context));
            }
            aVar = f6383b;
        }
        return aVar;
    }

    private C2851a(Context context, boolean z) {
        this.f6393k = context;
        this.f6385c = z;
    }

    public C2851a(Context context, int i) {
        this.f6393k = context;
        this.f6385c = C2871f.m8008b(context);
        this.f6396n = i;
    }

    /* renamed from: a */
    public void mo17722a() {
        mo17725a(false);
    }

    /* renamed from: a */
    public synchronized void mo17725a(boolean z) {
        if (this.f6385c) {
            m7929c(z);
        } else if (this.f6389g <= 0) {
            try {
                mo17732g().execute(new Runnable() {
                    public void run() {
                        C2851a.this.mo17726b();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m7927b(Context context) {
        C2851a aVar = f6383b;
        if (aVar == null) {
            return;
        }
        if (C2871f.m8008b(context)) {
            aVar.mo17725a(true);
        } else {
            aVar.mo17722a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo17726b() {
        if (System.currentTimeMillis() - this.f6389g > 3600000) {
            this.f6389g = System.currentTimeMillis();
            try {
                if (C2861g.m7987a().mo17766a(this.f6396n).mo17762h() != null) {
                    C2861g.m7987a().mo17766a(this.f6396n).mo17762h().mo17747b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m7929c(boolean z) {
        if (!this.f6388f) {
            if (this.f6387e) {
                this.f6387e = false;
                this.f6389g = 0;
                this.f6390h = 0;
            }
            long j = z ? 10800000 : 43200000;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6389g <= j) {
                return;
            }
            if (currentTimeMillis - this.f6390h > 120000 || !this.f6394l) {
                mo17728c();
            }
        }
    }

    /* renamed from: c */
    public boolean mo17728c() {
        C2863b.m7994b("TNCManager", "doRefresh: updating state " + this.f6392j.get());
        mo17732g().execute(new Runnable() {
            public void run() {
                boolean a = C2870e.m8005a(C2851a.this.f6393k);
                if (a) {
                    long unused = C2851a.this.f6390h = System.currentTimeMillis();
                    if (!C2851a.this.f6392j.compareAndSet(false, true)) {
                        C2863b.m7994b("TNCManager", "doRefresh, already running");
                    } else {
                        C2851a.this.mo17727b(a);
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo17723a(Message message) {
        int i = message.what;
        if (i == 101) {
            this.f6388f = false;
            this.f6389g = System.currentTimeMillis();
            C2863b.m7994b("TNCManager", "doRefresh, succ");
            if (this.f6387e) {
                mo17722a();
            }
            this.f6392j.set(false);
        } else if (i == 102) {
            this.f6388f = false;
            if (this.f6387e) {
                mo17722a();
            }
            C2863b.m7994b("TNCManager", "doRefresh, error");
            this.f6392j.set(false);
        }
    }

    /* renamed from: d */
    public synchronized void mo17729d() {
        if (!this.f6394l) {
            this.f6394l = true;
            long j = this.f6393k.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                j = currentTimeMillis;
            }
            this.f6389g = j;
            try {
                if (C2861g.m7987a().mo17766a(this.f6396n).mo17762h() != null) {
                    C2861g.m7987a().mo17766a(this.f6396n).mo17762h().mo17745a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public void mo17730e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                if (this.f6385c) {
                    mo17729d();
                } else {
                    mo17726b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17727b(boolean z) {
        C2863b.m7994b("TNCManager", "doRefresh, actual request");
        mo17729d();
        this.f6388f = true;
        if (!z) {
            this.f6384a.sendEmptyMessage(102);
            return;
        }
        try {
            m7930h();
        } catch (Exception unused) {
            this.f6392j.set(false);
        }
    }

    /* renamed from: f */
    public String[] mo17731f() {
        String[] f = C2861g.m7987a().mo17766a(this.f6396n).mo17758d() != null ? C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17743f() : null;
        return (f == null || f.length <= 0) ? new String[0] : f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7924a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.f6393k.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (C2861g.m7987a().mo17766a(this.f6396n).mo17762h() == null) {
            return true;
        }
        C2861g.m7987a().mo17766a(this.f6396n).mo17762h().mo17746a(jSONObject2);
        return true;
    }

    /* renamed from: h */
    private boolean m7930h() {
        String[] f = mo17731f();
        if (!(f == null || f.length == 0)) {
            m7920a(0);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7920a(final int i) {
        String[] f = mo17731f();
        if (f == null || f.length <= i) {
            m7926b(102);
            return;
        }
        String str = f[i];
        if (TextUtils.isEmpty(str)) {
            m7926b(102);
            return;
        }
        try {
            String a = m7919a(str);
            if (TextUtils.isEmpty(a)) {
                m7926b(102);
                return;
            }
            C2846b c = m7931i().mo17684c();
            c.mo17711a(a);
            m7921a(c);
            c.mo17708a(new C2842a() {
                /* renamed from: a */
                public void mo17693a(C2848c cVar, C2843b bVar) {
                    JSONObject jSONObject;
                    if (bVar == null || !bVar.mo17701f()) {
                        C2851a.this.m7920a(i + 1);
                        return;
                    }
                    String str = null;
                    try {
                        jSONObject = new JSONObject(bVar.mo17699d());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        C2851a.this.m7920a(i + 1);
                        return;
                    }
                    try {
                        str = jSONObject.getString("message");
                    } catch (Exception unused2) {
                    }
                    if (!"success".equals(str)) {
                        C2851a.this.m7920a(i + 1);
                        return;
                    }
                    try {
                        if (C2851a.this.m7924a((Object) jSONObject)) {
                            C2851a.this.m7926b(101);
                        } else {
                            C2851a.this.m7920a(i + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                    C2851a.this.m7920a(i + 1);
                }
            });
        } catch (Throwable th) {
            C2863b.m7994b("AppConfig", "try app config exception: " + th);
        }
    }

    /* renamed from: i */
    private C2839a m7931i() {
        if (this.f6395m == null) {
            this.f6395m = new C2839a.C2841a().mo17687a(10, TimeUnit.SECONDS).mo17690b(10, TimeUnit.SECONDS).mo17691c(10, TimeUnit.SECONDS).mo17689a();
        }
        return this.f6395m;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7926b(int i) {
        C2872g gVar = this.f6384a;
        if (gVar != null) {
            gVar.sendEmptyMessage(i);
        }
    }

    /* renamed from: a */
    private String m7919a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* renamed from: a */
    private void m7921a(C2846b bVar) {
        String str;
        if (bVar != null) {
            Address address = null;
            if (C2861g.m7987a().mo17766a(this.f6396n).mo17758d() != null) {
                address = C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17736a(this.f6393k);
            }
            if (address != null && address.hasLatitude() && address.hasLongitude()) {
                bVar.mo17709a("latitude", address.getLatitude() + "");
                bVar.mo17709a("longitude", address.getLongitude() + "");
                String locality = address.getLocality();
                if (!TextUtils.isEmpty(locality)) {
                    bVar.mo17709a("city", Uri.encode(locality));
                }
            }
            if (this.f6386d) {
                bVar.mo17709a("force", "1");
            }
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    str = Build.CPU_ABI;
                } else {
                    str = Build.SUPPORTED_ABIS[0];
                }
                bVar.mo17709a("abi", str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (C2861g.m7987a().mo17766a(this.f6396n).mo17758d() != null) {
                bVar.mo17709a("aid", C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17735a() + "");
                bVar.mo17709a("device_platform", C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17740c());
                bVar.mo17709a("channel", C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17739b());
                bVar.mo17709a("version_code", C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17741d() + "");
                bVar.mo17709a("custom_info_1", C2861g.m7987a().mo17766a(this.f6396n).mo17758d().mo17742e());
            }
        }
    }

    /* renamed from: g */
    public ThreadPoolExecutor mo17732g() {
        if (this.f6391i == null) {
            synchronized (C2851a.class) {
                if (this.f6391i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.f6391i = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.f6391i;
    }

    /* renamed from: a */
    public void mo17724a(ThreadPoolExecutor threadPoolExecutor) {
        this.f6391i = threadPoolExecutor;
    }
}
