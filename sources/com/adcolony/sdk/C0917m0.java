package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C0826e0;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.m0 */
class C0917m0 {

    /* renamed from: a */
    private ScheduledExecutorService f642a;

    /* renamed from: b */
    private ScheduledFuture<?> f643b;

    /* renamed from: c */
    private String f644c;

    /* renamed from: com.adcolony.sdk.m0$a */
    class C0918a implements C0865j0 {
        C0918a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0917m0.this.m818c();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$b */
    class C0919b implements C0865j0 {
        C0919b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0917m0.this.m821f();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$c */
    class C0920c implements Runnable {
        C0920c() {
        }

        public void run() {
            C0917m0.this.m820d();
        }
    }

    C0917m0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m820d() {
        String e = mo10946e();
        if (!e.equals(this.f644c)) {
            this.f644c = e;
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "network_type", e);
            new C0850h0("Network.on_status_change", 1, b).mo10838c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m821f() {
        ScheduledFuture<?> scheduledFuture = this.f643b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f643b.cancel(false);
            }
            this.f643b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10946e() {
        return m815a();
    }

    /* renamed from: a */
    private String m815a() {
        NetworkInfo networkInfo;
        Context a = C0723a.m186a();
        if (a == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return "none";
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
            }
            if (type == 0) {
                return "cell";
            }
            if (type >= 2) {
                return "cell";
            }
            return "none";
        } catch (SecurityException e) {
            new C0826e0.C0827a().mo10746a("SecurityException - please ensure you added the ").mo10746a("ACCESS_NETWORK_STATE permission: ").mo10746a(e.toString()).mo10747a(C0826e0.f461h);
            return "none";
        } catch (Exception e2) {
            new C0826e0.C0827a().mo10746a("Exception occurred when retrieving activeNetworkInfo in ").mo10746a("ADCNetwork.getConnectivityStatus(): ").mo10746a(e2.toString()).mo10747a(C0826e0.f462i);
            return "none";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m818c() {
        if (this.f642a == null) {
            this.f642a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f643b == null) {
            try {
                this.f643b = this.f642a.scheduleAtFixedRate(new C0920c(), 0, 1000, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0826e0.C0827a().mo10746a("Error when scheduling network checks: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            }
            m820d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10945b() {
        this.f644c = mo10946e();
        C0723a.m192a("Network.start_notifications", (C0865j0) new C0918a());
        C0723a.m192a("Network.stop_notifications", (C0865j0) new C0919b());
    }
}
