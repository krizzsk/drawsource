package com.applovin.impl.sdk.p053e;

import android.text.TextUtils;
import com.applovin.impl.adview.C1523d;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2020i;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.g */
public class C1900g extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2020i f3520a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinPostbackListener f3521c;

    /* renamed from: d */
    private final C1918o.C1920a f3522d;

    public C1900g(C2020i iVar, C1918o.C1920a aVar, C1969m mVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", mVar);
        if (iVar != null) {
            this.f3520a = iVar;
            this.f3521c = appLovinPostbackListener;
            this.f3522d = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4254a() {
        C19022 r0 = new C1935u<Object>(this.f3520a, mo14369d()) {

            /* renamed from: a */
            final String f3524a = C1900g.this.f3520a.mo14701a();

            /* renamed from: a */
            public void mo13585a(int i, String str, Object obj) {
                if (C2102v.m5104a()) {
                    mo14370d("Failed to dispatch postback. Error code: " + i + " URL: " + this.f3524a);
                }
                if (C1900g.this.f3521c != null) {
                    C1900g.this.f3521c.onPostbackFailure(this.f3524a, i);
                }
                if (C1900g.this.f3520a.mo14802p()) {
                    this.f3496b.mo14557ag().mo14485a(C1900g.this.f3520a.mo14803q(), this.f3524a, i, obj, str, false);
                }
            }

            /* renamed from: a */
            public void mo13587a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String next : this.f3496b.mo14567b(C1867b.f3114aO)) {
                        if (next.startsWith(next)) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    C2050h.m4962d(jSONObject, this.f3496b);
                                    C2050h.m4961c(jSONObject, this.f3496b);
                                    C2050h.m4964e(jSONObject, this.f3496b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (C1900g.this.f3521c != null) {
                    C1900g.this.f3521c.onPostbackSuccess(this.f3524a);
                }
                if (C1900g.this.f3520a.mo14802p()) {
                    this.f3496b.mo14557ag().mo14485a(C1900g.this.f3520a.mo14803q(), this.f3524a, i, obj, (String) null, true);
                }
            }
        };
        r0.mo14454a(this.f3522d);
        mo14369d().mo14526S().mo14428a((C1887a) r0);
    }

    public void run() {
        if (!StringUtils.isValidString(this.f3520a.mo14701a())) {
            if (C2102v.m5104a()) {
                mo14367b("Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f3521c;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f3520a.mo14701a(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f3520a.mo14804r()) {
            C1523d.m2831a(this.f3520a, mo14369d(), new AppLovinPostbackListener() {
                public void onPostbackFailure(String str, int i) {
                    C1900g.this.m4254a();
                }

                public void onPostbackSuccess(String str) {
                    if (C1900g.this.f3521c != null) {
                        C1900g.this.f3521c.onPostbackSuccess(C1900g.this.f3520a.mo14701a());
                    }
                }
            });
        } else {
            m4254a();
        }
    }
}
