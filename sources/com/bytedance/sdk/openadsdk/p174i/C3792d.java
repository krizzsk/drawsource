package com.bytedance.sdk.openadsdk.p174i;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p102b.p103a.C2735d;
import com.bytedance.sdk.component.p118e.C2839a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3789c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.i.d */
/* compiled from: TTNetClient */
public class C3792d {

    /* renamed from: a */
    private static volatile C3792d f9766a;

    /* renamed from: b */
    private Context f9767b;

    /* renamed from: c */
    private final C2839a f9768c;

    /* renamed from: d */
    private C3789c f9769d;

    /* renamed from: a */
    public static C3792d m12395a() {
        if (f9766a == null) {
            synchronized (C3792d.class) {
                if (f9766a == null) {
                    f9766a = new C3792d(C3513m.m10963a());
                }
            }
        }
        return f9766a;
    }

    private C3792d(Context context) {
        this.f9767b = context == null ? C3513m.m10963a() : context.getApplicationContext();
        C2839a a = new C2839a.C2841a().mo17687a(10000, TimeUnit.MILLISECONDS).mo17690b(10000, TimeUnit.MILLISECONDS).mo17691c(10000, TimeUnit.MILLISECONDS).mo17688a(true).mo17689a();
        this.f9768c = a;
        C2735d a2 = a.mo17686e().mo17399a();
        if (a2 != null) {
            a2.mo17401a(32);
        }
    }

    /* renamed from: b */
    public C2839a mo20615b() {
        return this.f9768c;
    }

    /* renamed from: c */
    public C3789c mo20616c() {
        m12396d();
        return this.f9769d;
    }

    /* renamed from: a */
    public void mo20614a(String str, ImageView imageView) {
        C3707a.m12123a(str).mo17632a(imageView);
    }

    /* renamed from: a */
    public void mo20613a(C3417k kVar, ImageView imageView) {
        if (kVar != null && !TextUtils.isEmpty(kVar.mo19468a()) && imageView != null) {
            C3707a.m12122a(kVar).mo17632a(imageView);
        }
    }

    /* renamed from: d */
    private void m12396d() {
        if (this.f9769d == null) {
            this.f9769d = new C3789c();
        }
    }
}
