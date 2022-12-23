package com.applovin.impl.sdk.p053e;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.u */
public abstract class C1935u<T> extends C1887a implements C1995b.C1999c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2000c<T> f3599a;

    /* renamed from: c */
    private final C1995b.C1999c<T> f3600c;

    /* renamed from: d */
    protected C1995b.C1997a f3601d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1918o.C1920a f3602e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1867b<String> f3603f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1867b<String> f3604g;

    public C1935u(C2000c<T> cVar, C1969m mVar) {
        this(cVar, mVar, false);
    }

    public C1935u(C2000c<T> cVar, final C1969m mVar, boolean z) {
        super("TaskRepeatRequest", mVar, z);
        this.f3602e = C1918o.C1920a.BACKGROUND;
        this.f3603f = null;
        this.f3604g = null;
        if (cVar != null) {
            this.f3599a = cVar;
            this.f3601d = new C1995b.C1997a();
            this.f3600c = new C1995b.C1999c<T>() {
                /* renamed from: a */
                public void mo13585a(int i, String str, T t) {
                    C1867b bVar;
                    C1935u uVar;
                    boolean z = false;
                    boolean z2 = i < 200 || i >= 500;
                    boolean z3 = i == 429;
                    if ((i != -1009) && (z2 || z3 || C1935u.this.f3599a.mo14718m())) {
                        String f = C1935u.this.f3599a.mo14710f();
                        if (C1935u.this.f3599a.mo14712h() > 0) {
                            if (C2102v.m5104a()) {
                                C1935u.this.mo14368c("Unable to send request due to server failure (code " + i + "). " + C1935u.this.f3599a.mo14712h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) C1935u.this.f3599a.mo14716k()) + " seconds...");
                            }
                            int h = C1935u.this.f3599a.mo14712h() - 1;
                            C1935u.this.f3599a.mo14702a(h);
                            if (h == 0) {
                                C1935u uVar2 = C1935u.this;
                                uVar2.m4341c(uVar2.f3603f);
                                if (StringUtils.isValidString(f) && f.length() >= 4) {
                                    if (C2102v.m5104a()) {
                                        C1935u.this.mo14367b("Switching to backup endpoint " + f);
                                    }
                                    C1935u.this.f3599a.mo14703a(f);
                                    z = true;
                                }
                            }
                            long millis = (!((Boolean) mVar.mo14534a(C1867b.f3286dd)).booleanValue() || !z) ? C1935u.this.f3599a.mo14717l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) C1935u.this.f3599a.mo14714i())) : (long) C1935u.this.f3599a.mo14716k() : 0;
                            C1918o S = mVar.mo14526S();
                            C1935u uVar3 = C1935u.this;
                            S.mo14430a((C1887a) uVar3, uVar3.f3602e, millis);
                            return;
                        }
                        if (f == null || !f.equals(C1935u.this.f3599a.mo14701a())) {
                            uVar = C1935u.this;
                            bVar = uVar.f3603f;
                        } else {
                            uVar = C1935u.this;
                            bVar = uVar.f3604g;
                        }
                        uVar.m4341c(bVar);
                    }
                    C1935u.this.mo13585a(i, str, t);
                }

                /* renamed from: a */
                public void mo13587a(T t, int i) {
                    C1935u.this.f3599a.mo14702a(0);
                    C1935u.this.mo13587a(t, i);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <ST> void m4341c(C1867b<ST> bVar) {
        if (bVar != null) {
            mo14369d().mo14519K().mo14286a((C1867b<?>) bVar, (Object) bVar.mo14281b());
        }
    }

    /* renamed from: a */
    public abstract void mo13585a(int i, String str, T t);

    /* renamed from: a */
    public void mo14453a(C1867b<String> bVar) {
        this.f3603f = bVar;
    }

    /* renamed from: a */
    public void mo14454a(C1918o.C1920a aVar) {
        this.f3602e = aVar;
    }

    /* renamed from: a */
    public abstract void mo13587a(T t, int i);

    /* renamed from: b */
    public void mo14455b(C1867b<String> bVar) {
        this.f3604g = bVar;
    }

    public void run() {
        int i;
        C1995b R = mo14369d().mo14525R();
        if (!mo14369d().mo14573c() && !mo14369d().mo14574d()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "AppLovin SDK is disabled");
            }
            i = -22;
        } else if (!StringUtils.isValidString(this.f3599a.mo14701a()) || this.f3599a.mo14701a().length() < 4) {
            if (C2102v.m5104a()) {
                mo14370d("Task has an invalid or null request endpoint.");
            }
            i = AppLovinErrorCodes.INVALID_URL;
        } else {
            if (TextUtils.isEmpty(this.f3599a.mo14704b())) {
                this.f3599a.mo14705b(this.f3599a.mo14708e() != null ? ShareTarget.METHOD_POST : ShareTarget.METHOD_GET);
            }
            R.mo14697a(this.f3599a, this.f3601d, this.f3600c);
            return;
        }
        mo13585a(i, (String) null, (Object) null);
    }
}
