package com.bytedance.sdk.openadsdk.component.p140g;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.component.p139f.C3214a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;

/* renamed from: com.bytedance.sdk.openadsdk.component.g.b */
/* compiled from: TTAppOpenVideoManager */
public class C3216b {

    /* renamed from: a */
    private Context f7567a;

    /* renamed from: b */
    private FrameLayout f7568b;

    /* renamed from: c */
    private C3431n f7569c;

    /* renamed from: d */
    private C3215a f7570d;

    public C3216b(Context context) {
        this.f7567a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo18893a(FrameLayout frameLayout, C3431n nVar) {
        this.f7568b = frameLayout;
        this.f7569c = nVar;
        this.f7570d = new C3215a(this.f7567a, this.f7568b, this.f7569c);
    }

    /* renamed from: a */
    public boolean mo18895a() {
        String str;
        int f = C3898x.m12794f(this.f7569c);
        if (Build.VERSION.SDK_INT >= 23) {
            str = C3214a.m9311a(C3513m.m10963a(), f);
        } else {
            try {
                str = C3214a.m9310a();
            } catch (Throwable unused) {
                str = "";
            }
        }
        C2401c a = C3431n.m10306a(str, this.f7569c);
        a.mo15975b(this.f7569c.mo19532Y());
        a.mo15967a(this.f7568b.getWidth());
        a.mo15974b(this.f7568b.getHeight());
        a.mo15978c(this.f7569c.mo19569ac());
        a.mo15968a(0);
        a.mo15972a(true);
        return this.f7570d.mo16029a(a);
    }

    /* renamed from: b */
    public boolean mo18896b() {
        C3215a aVar = this.f7570d;
        return (aVar == null || aVar.mo16049n() == null || !this.f7570d.mo16049n().mo15885l()) ? false : true;
    }

    /* renamed from: c */
    public boolean mo18897c() {
        C3215a aVar = this.f7570d;
        return (aVar == null || aVar.mo16049n() == null || !this.f7570d.mo16049n().mo15886m()) ? false : true;
    }

    /* renamed from: a */
    public void mo18894a(C2405c.C2406a aVar) {
        C3215a aVar2 = this.f7570d;
        if (aVar2 != null) {
            aVar2.mo16023a(aVar);
        }
    }

    /* renamed from: d */
    public void mo18898d() {
        try {
            if (mo18896b()) {
                this.f7570d.mo16030b();
            }
        } catch (Throwable th) {
            C2905l.m8110b("AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo18899e() {
        C3215a aVar = this.f7570d;
        if (aVar != null) {
            aVar.mo16037d();
        }
    }

    /* renamed from: f */
    public void mo18900f() {
        C3215a aVar = this.f7570d;
        if (aVar != null) {
            this.f7567a = null;
            aVar.mo16039e();
            this.f7570d = null;
        }
    }

    /* renamed from: g */
    public long mo18901g() {
        C3215a aVar = this.f7570d;
        if (aVar != null) {
            return aVar.mo16042g();
        }
        return 0;
    }

    /* renamed from: h */
    public long mo18902h() {
        C3215a aVar = this.f7570d;
        if (aVar != null) {
            return aVar.mo16043h();
        }
        return 0;
    }

    /* renamed from: i */
    public long mo18903i() {
        C3215a aVar = this.f7570d;
        if (aVar != null) {
            return aVar.mo16045j() + this.f7570d.mo16043h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo18892a(int i) {
        if (this.f7570d != null) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18632a(mo18901g());
            aVar.mo18639c(mo18903i());
            aVar.mo18636b(mo18902h());
            aVar.mo18643e(i);
            aVar.mo18645f(this.f7570d.mo16044i());
            this.f7570d.mo18884a(aVar);
        }
    }
}
