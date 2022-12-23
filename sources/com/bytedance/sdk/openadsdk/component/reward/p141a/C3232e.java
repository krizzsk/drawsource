package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.C3264c;
import com.bytedance.sdk.openadsdk.component.reward.C3265d;
import com.bytedance.sdk.openadsdk.component.reward.C3289h;
import com.bytedance.sdk.openadsdk.component.reward.C3290i;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3606a;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3622b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.e */
/* compiled from: RewardFullVideoPlayerManager */
public class C3232e {

    /* renamed from: a */
    long f7624a;

    /* renamed from: b */
    protected boolean f7625b = false;

    /* renamed from: c */
    boolean f7626c = false;

    /* renamed from: d */
    String f7627d;

    /* renamed from: e */
    boolean f7628e;

    /* renamed from: f */
    protected boolean f7629f = false;

    /* renamed from: g */
    C2405c f7630g;

    /* renamed from: h */
    long f7631h;

    /* renamed from: i */
    private Activity f7632i;

    /* renamed from: j */
    private C3431n f7633j;

    /* renamed from: k */
    private FrameLayout f7634k;

    /* renamed from: l */
    private String f7635l;

    /* renamed from: m */
    private boolean f7636m = false;

    /* renamed from: n */
    private C3100j f7637n;

    /* renamed from: a */
    public C3100j mo18966a() {
        return this.f7637n;
    }

    public C3232e(Activity activity) {
        this.f7632i = activity;
    }

    /* renamed from: a */
    public void mo18969a(FrameLayout frameLayout, C3431n nVar, String str, boolean z, C3100j jVar) {
        if (!this.f7636m) {
            this.f7636m = true;
            this.f7633j = nVar;
            this.f7634k = frameLayout;
            this.f7635l = str;
            this.f7628e = z;
            this.f7637n = jVar;
            if (z) {
                this.f7630g = new C3289h(this.f7632i, this.f7634k, this.f7633j, jVar);
            } else {
                this.f7630g = new C3264c(this.f7632i, this.f7634k, this.f7633j, jVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo18981b() {
        C2405c cVar = this.f7630g;
        return (cVar == null || cVar.mo16049n() == null || !this.f7630g.mo16049n().mo15885l()) ? false : true;
    }

    /* renamed from: c */
    public C2398a mo18982c() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16050o();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo18984d() {
        C2405c cVar = this.f7630g;
        return (cVar == null || cVar.mo16049n() == null || !this.f7630g.mo16049n().mo15886m()) ? false : true;
    }

    /* renamed from: e */
    public boolean mo18985e() {
        C2405c cVar = this.f7630g;
        return cVar != null && cVar.mo16053r();
    }

    /* renamed from: a */
    public void mo18968a(long j) {
        this.f7631h = j;
    }

    /* renamed from: f */
    public long mo18986f() {
        return this.f7631h;
    }

    /* renamed from: g */
    public boolean mo18987g() {
        return this.f7625b;
    }

    /* renamed from: h */
    public long mo18988h() {
        return this.f7624a;
    }

    /* renamed from: b */
    public void mo18979b(long j) {
        this.f7624a = j;
    }

    /* renamed from: a */
    public void mo18975a(boolean z) {
        this.f7625b = z;
    }

    /* renamed from: i */
    public void mo18989i() {
        try {
            if (mo18981b()) {
                this.f7630g.mo16030b();
            }
        } catch (Throwable th) {
            C2905l.m8110b("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo18967a(int i, int i2) {
        if (this.f7630g != null) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18636b(mo18990j());
            aVar.mo18639c(mo19001u());
            aVar.mo18632a(mo18999s());
            aVar.mo18638c(i);
            aVar.mo18641d(i2);
            C3067a.m8783d(this.f7630g.mo16050o(), aVar);
        }
    }

    /* renamed from: j */
    public long mo18990j() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16043h();
        }
        return 0;
    }

    /* renamed from: F */
    private void m9413F() {
        C2405c cVar = this.f7630g;
        if (cVar != null && cVar.mo16049n() != null) {
            this.f7624a = this.f7630g.mo16042g();
            if (this.f7630g.mo16049n().mo15882i() || !this.f7630g.mo16049n().mo15881h()) {
                this.f7630g.mo16030b();
                this.f7630g.mo16039e();
                this.f7625b = true;
            }
        }
    }

    /* renamed from: k */
    public void mo18991k() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16039e();
            this.f7630g = null;
        }
    }

    /* renamed from: l */
    public void mo18992l() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16034c();
            this.f7630g.mo16041f();
        }
    }

    /* renamed from: m */
    public void mo18993m() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16041f();
        }
    }

    /* renamed from: n */
    public void mo18994n() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16037d();
        }
    }

    /* renamed from: o */
    public void mo18995o() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16030b();
        }
    }

    /* renamed from: a */
    public void mo18974a(Map<String, Object> map) {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16026a(map);
        }
    }

    /* renamed from: a */
    public void mo18970a(C2405c.C2406a aVar) {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16023a(aVar);
        }
    }

    /* renamed from: b */
    public void mo18980b(boolean z) {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            cVar.mo16033b(z);
        }
    }

    /* renamed from: p */
    public long mo18996p() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16045j();
        }
        return 0;
    }

    /* renamed from: q */
    public int mo18997q() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16047l();
        }
        return 0;
    }

    /* renamed from: r */
    public int mo18998r() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16044i();
        }
        return 0;
    }

    /* renamed from: s */
    public long mo18999s() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16042g();
        }
        return this.f7624a;
    }

    /* renamed from: t */
    public void mo19000t() {
        C2405c cVar = this.f7630g;
        if (cVar != null && cVar.mo16049n() != null) {
            this.f7630g.mo16049n().mo15876c();
        }
    }

    /* renamed from: u */
    public long mo19001u() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16045j() + this.f7630g.mo16043h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo18973a(String str, Map<String, Object> map) {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            Map<String, Object> a = C3898x.m12757a(this.f7633j, cVar.mo16043h(), this.f7630g.mo16049n());
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    a.put(next.getKey(), next.getValue());
                }
            }
            C3090e.m8894a((Context) this.f7632i, this.f7633j, this.f7635l, str, mo19001u(), mo18997q(), a, this.f7637n);
            C2905l.m8111b("TTBaseVideoActivity", "event tag:" + this.f7635l + ", TotalPlayDuration=" + mo19001u() + ",mBasevideoController.getPct()=" + mo18997q());
        }
    }

    /* renamed from: v */
    public long mo19002v() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            return cVar.mo16045j();
        }
        return 0;
    }

    /* renamed from: w */
    public boolean mo19003w() {
        C2405c cVar = this.f7630g;
        if (cVar != null) {
            if (cVar.mo16049n() != null) {
                C2394a n = this.f7630g.mo16049n();
                if (n.mo15886m() || n.mo15887n()) {
                    ((C3606a) this.f7630g).mo20181I();
                    return true;
                }
            } else if (mo18987g()) {
                mo18975a(false);
                ((C3606a) this.f7630g).mo20181I();
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo19004x() {
        return this.f7630g != null;
    }

    /* renamed from: y */
    public boolean mo19005y() {
        C2405c cVar = this.f7630g;
        return cVar != null && cVar.mo16049n() == null;
    }

    /* renamed from: a */
    public boolean mo18978a(long j, boolean z) {
        C2905l.m8111b("TTBaseVideoActivity", "playVideo start");
        if (this.f7630g == null || this.f7633j.mo19517J() == null) {
            C2905l.m8111b("TTBaseVideoActivity", "playVideo controller is Empty");
            return false;
        }
        File file = new File(CacheDirFactory.getICacheDir(this.f7633j.mo19560aD()).mo15665b(), this.f7633j.mo19517J().mo15957l());
        if (file.exists() && file.length() > 0) {
            this.f7626c = true;
        }
        C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f7633j.mo19560aD()).mo15665b(), this.f7633j);
        a.mo15975b(this.f7633j.mo19532Y());
        a.mo15967a(this.f7634k.getWidth());
        a.mo15974b(this.f7634k.getHeight());
        a.mo15978c(this.f7633j.mo19569ac());
        a.mo15968a(j);
        a.mo15972a(z);
        return this.f7630g.mo16029a(a);
    }

    /* renamed from: a */
    public void mo18972a(String str) {
        this.f7627d = str;
    }

    /* renamed from: z */
    public String mo19006z() {
        return this.f7627d;
    }

    /* renamed from: c */
    public void mo18983c(boolean z) {
        mo18991k();
        if (!TextUtils.isEmpty(this.f7627d)) {
            return;
        }
        if (z) {
            C3290i.m9699a(C3513m.m10963a()).mo19127a();
        } else {
            C3265d.m9641a(C3513m.m10963a()).mo19102b();
        }
    }

    /* renamed from: A */
    public void mo18961A() {
        try {
            if (mo18981b()) {
                this.f7629f = true;
                mo18995o();
            }
        } catch (Throwable th) {
            C2905l.m8118e("TTBaseVideoActivity", "onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo18976a(boolean z, C3622b bVar) {
        try {
            this.f7629f = false;
            if (mo18987g()) {
                m9413F();
                mo18971a(bVar);
            } else if (mo18984d()) {
                mo18994n();
            }
        } catch (Throwable th) {
            C2905l.m8118e("TTBaseVideoActivity", "onContinue throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo18977a(boolean z, C3622b bVar, boolean z2) {
        if (z2 && !z && !this.f7629f) {
            if (mo18984d()) {
                mo18994n();
                Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: continue play");
                return;
            }
            m9413F();
            mo18971a(bVar);
            Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    /* renamed from: B */
    public boolean mo18962B() {
        C2405c cVar = this.f7630g;
        if (cVar == null || cVar.mo16049n() == null) {
            return false;
        }
        return this.f7630g.mo16049n().mo15878e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18971a(C3622b bVar) {
        if (mo19003w() && bVar != null) {
            bVar.mo18426a(mo18988h(), true);
        }
    }

    /* renamed from: C */
    public double mo18963C() {
        if (C3418l.m10268c(this.f7633j) && this.f7633j.mo19534a() != null) {
            return (double) this.f7633j.mo19534a().mo19502b();
        }
        C3431n nVar = this.f7633j;
        if (nVar == null || nVar.mo19517J() == null) {
            return 0.0d;
        }
        return this.f7633j.mo19517J().mo15946f();
    }

    /* renamed from: D */
    public void mo18964D() {
        C2405c cVar = this.f7630g;
        if (cVar instanceof C3606a) {
            ((C3606a) cVar).mo20180H();
        }
    }

    /* renamed from: E */
    public View mo18965E() {
        C2405c cVar = this.f7630g;
        if (cVar instanceof C3606a) {
            return (View) ((C3606a) cVar).mo20182J();
        }
        return null;
    }
}
