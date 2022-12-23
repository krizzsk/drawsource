package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1798a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2042a;

/* renamed from: com.applovin.impl.mediation.a */
public class C1581a extends C2042a {

    /* renamed from: a */
    private final C1798a f2079a;

    /* renamed from: b */
    private final C2102v f2080b;

    /* renamed from: c */
    private C1582a f2081c;

    /* renamed from: d */
    private C1585c f2082d;

    /* renamed from: e */
    private int f2083e;

    /* renamed from: f */
    private boolean f2084f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    public interface C1582a {
        /* renamed from: a */
        void mo13354a(C1585c cVar);
    }

    C1581a(C1969m mVar) {
        this.f2080b = mVar.mo14509A();
        this.f2079a = mVar.mo14556af();
    }

    /* renamed from: a */
    public void mo13352a() {
        if (C2102v.m5104a()) {
            this.f2080b.mo15012b("AdActivityObserver", "Cancelling...");
        }
        this.f2079a.mo14048b(this);
        this.f2081c = null;
        this.f2082d = null;
        this.f2083e = 0;
        this.f2084f = false;
    }

    /* renamed from: a */
    public void mo13353a(C1585c cVar, C1582a aVar) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2080b;
            vVar.mo15012b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo13352a();
        this.f2081c = aVar;
        this.f2082d = cVar;
        this.f2079a.mo14046a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f2084f) {
            this.f2084f = true;
        }
        this.f2083e++;
        if (C2102v.m5104a()) {
            this.f2080b.mo15012b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f2083e);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f2084f) {
            this.f2083e--;
            if (C2102v.m5104a()) {
                this.f2080b.mo15012b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f2083e);
            }
            if (this.f2083e <= 0) {
                if (C2102v.m5104a()) {
                    this.f2080b.mo15012b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f2081c != null) {
                    if (C2102v.m5104a()) {
                        this.f2080b.mo15012b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f2081c.mo13354a(this.f2082d);
                }
                mo13352a();
            }
        }
    }
}
