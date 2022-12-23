package com.applovin.impl.mediation.p034c;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.c.a */
public class C1629a extends C1887a {

    /* renamed from: a */
    private final List<C1588f> f2240a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f2241c;

    /* renamed from: com.applovin.impl.mediation.c.a$a */
    public static class C1631a extends C1887a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1588f f2244a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final List<C1588f> f2245c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Activity f2246d;

        private C1631a(C1588f fVar, List<C1588f> list, C1969m mVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.mo13430K(), mVar, true);
            this.f2246d = activity;
            this.f2244a = fVar;
            this.f2245c = list;
        }

        public void run() {
            if (C2102v.m5104a()) {
                mo14365a("Auto-initing " + this.f2244a + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f3496b.mo14512D().mo13814a(this.f2244a, this.f2246d, new Runnable() {
                public void run() {
                    if (C2102v.m5104a()) {
                        C1631a aVar = C1631a.this;
                        aVar.mo14365a("Initialization task for adapter '" + C1631a.this.f2244a.mo13431L() + "' finished");
                    }
                    int indexOf = C1631a.this.f2245c.indexOf(C1631a.this.f2244a);
                    if (indexOf < C1631a.this.f2245c.size() - 1) {
                        C1588f fVar = (C1588f) C1631a.this.f2245c.get(indexOf + 1);
                        C1631a.this.f3496b.mo14526S().mo14430a((C1887a) new C1631a(fVar, C1631a.this.f2245c, C1631a.this.f3496b, C1631a.this.f2246d), C1918o.C1920a.MAIN, fVar.mo13444Y());
                    } else if (C2102v.m5104a()) {
                        C1631a.this.mo14365a("Finished initializing adapters");
                    }
                }
            });
        }
    }

    public C1629a(List<C1588f> list, Activity activity, C1969m mVar) {
        super("TaskAutoInitAdapters", mVar, true);
        this.f2240a = list;
        this.f2241c = activity;
    }

    public void run() {
        try {
            if (this.f2240a.size() > 0) {
                if (C2102v.m5104a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(this.f2240a.size());
                    sb.append(" adapters");
                    sb.append(this.f3496b.mo14518J().mo13806a() ? " in test mode" : "");
                    sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                    mo14365a(sb.toString());
                }
                if (TextUtils.isEmpty(this.f3496b.mo14590t())) {
                    this.f3496b.mo14572c("max");
                } else if (!this.f3496b.mo14576f() && C2102v.m5104a()) {
                    C2102v.m5110i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f3496b.mo14590t());
                }
                if (C2102v.m5104a() && this.f2241c == null) {
                    C2102v.m5110i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f3496b.mo14534a(C1866a.f3063Q)).booleanValue()) {
                    C1588f fVar = this.f2240a.get(0);
                    this.f3496b.mo14526S().mo14430a((C1887a) new C1631a(fVar, this.f2240a, this.f3496b, this.f2241c), C1918o.C1920a.MAIN, fVar.mo13444Y());
                    return;
                }
                for (final C1588f next : this.f2240a) {
                    this.f3496b.mo14526S().mo14432a((Runnable) new Runnable() {
                        public void run() {
                            if (C2102v.m5104a()) {
                                C1629a aVar = C1629a.this;
                                aVar.mo14365a("Auto-initing adapter: " + next);
                            }
                            C1629a.this.f3496b.mo14512D().mo13813a(next, C1629a.this.f2241c);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Failed to auto-init adapters", th);
            }
        }
    }
}
