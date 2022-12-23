package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import java.util.HashMap;
import java.util.Map;

public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo18329J() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18358o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18374u() {
        if (this.f6795c == null) {
            finish();
            return;
        }
        this.f6807o.mo19018a(false);
        super.mo18374u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18345d() {
        super.mo18345d();
        if (C3434p.m10497i(this.f6795c)) {
            this.f6807o.mo19018a(true);
            this.f6807o.mo19021b();
            mo18335a(false);
            return;
        }
        mo18346d(0);
    }

    /* renamed from: a */
    public boolean mo18426a(long j, boolean z) {
        C3100j jVar;
        if (this.f6804l == null || this.f6804l.mo19194a() == null) {
            jVar = new C3100j();
        } else {
            jVar = this.f6804l.mo19194a().getAdShowTime();
        }
        this.f6805m.mo18969a(this.f6804l.mo19201b(), this.f6795c, this.f6785a, mo18328I(), jVar);
        HashMap hashMap = new HashMap();
        if (this.f6804l != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.f6804l.mo19209i()));
        }
        if (!TextUtils.isEmpty(this.f6762D)) {
            hashMap.put("rit_scene", this.f6762D);
        }
        this.f6805m.mo18974a((Map<String, Object>) hashMap);
        this.f6805m.mo18970a((C2405c.C2406a) new C2405c.C2406a() {
            /* renamed from: a */
            public void mo16056a(long j, int i) {
                TTRewardExpressVideoActivity.this.f6809q.removeMessages(300);
                TTRewardExpressVideoActivity.this.mo18324E();
                TTRewardExpressVideoActivity.this.f6804l.mo19202b(true);
                TTRewardExpressVideoActivity.this.mo18488N();
                if (C3418l.m10266b(TTRewardExpressVideoActivity.this.f6795c)) {
                    TTRewardExpressVideoActivity.this.f6772N.set(true);
                    TTRewardExpressVideoActivity.this.mo18357n();
                } else if (TTRewardExpressVideoActivity.this.mo18352i()) {
                    TTRewardExpressVideoActivity.this.mo18335a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f6968S = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.mo18429M();
            }

            /* renamed from: b */
            public void mo16058b(long j, int i) {
                TTRewardExpressVideoActivity.this.f6809q.removeMessages(300);
                if (C3948b.m12959c()) {
                    TTRewardExpressVideoActivity.this.mo18490c("onVideoError");
                } else if (TTRewardExpressVideoActivity.this.f6969T != null) {
                    TTRewardExpressVideoActivity.this.f6969T.onVideoError();
                }
                TTRewardExpressVideoActivity.this.mo18323D();
                if (!TTRewardExpressVideoActivity.this.f6805m.mo18981b()) {
                    TTRewardExpressVideoActivity.this.mo18324E();
                    TTRewardExpressVideoActivity.this.mo18429M();
                    TTRewardExpressVideoActivity.this.f6805m.mo18993m();
                    if (TTRewardExpressVideoActivity.this.mo18352i()) {
                        TTRewardExpressVideoActivity.this.mo18335a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                    TTRewardExpressVideoActivity.this.f6804l.mo19200a(true);
                    TTRewardExpressVideoActivity.this.f6805m.mo18967a(true ^ TTRewardExpressVideoActivity.this.f6805m.mo18962B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo16055a() {
                TTRewardExpressVideoActivity.this.f6809q.removeMessages(300);
                TTRewardExpressVideoActivity.this.mo18324E();
                if (TTRewardExpressVideoActivity.this.mo18352i()) {
                    TTRewardExpressVideoActivity.this.mo18335a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f6805m.mo18967a(TTRewardExpressVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0, TTRewardExpressVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0);
                TTRewardExpressVideoActivity.this.f6805m.mo18993m();
            }

            /* renamed from: a */
            public void mo16057a(long j, long j2) {
                if (!TTRewardExpressVideoActivity.this.f6766H && TTRewardExpressVideoActivity.this.f6805m.mo18981b()) {
                    TTRewardExpressVideoActivity.this.f6805m.mo18995o();
                }
                if (!TTRewardExpressVideoActivity.this.f6814v.get()) {
                    TTRewardExpressVideoActivity.this.f6809q.removeMessages(300);
                    if (j != TTRewardExpressVideoActivity.this.f6805m.mo18986f()) {
                        TTRewardExpressVideoActivity.this.mo18324E();
                    }
                    if (TTRewardExpressVideoActivity.this.f6805m.mo18981b()) {
                        TTRewardExpressVideoActivity.this.f6805m.mo18968a(j);
                        int f = C3513m.m10973h().mo19851f(String.valueOf(TTRewardExpressVideoActivity.this.f6812t));
                        boolean z = TTRewardExpressVideoActivity.this.f6804l.mo19208h() && f != -1 && f >= 0;
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTRewardExpressVideoActivity.f6811s = (int) (tTRewardExpressVideoActivity.f6805m.mo18963C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTRewardExpressVideoActivity.this.f6759A.get() || TTRewardExpressVideoActivity.this.f6817y.get()) && TTRewardExpressVideoActivity.this.f6805m.mo18981b()) {
                            TTRewardExpressVideoActivity.this.f6805m.mo18995o();
                        }
                        if (TTRewardExpressVideoActivity.this.f6811s >= 0) {
                            TTRewardExpressVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardExpressVideoActivity.this.f6811s), (CharSequence) null);
                        }
                        TTRewardExpressVideoActivity.this.f6801i.mo19228c(i);
                        TTRewardExpressVideoActivity.this.mo18489a(j, j2);
                        if (!(TTRewardExpressVideoActivity.this.f6804l == null || TTRewardExpressVideoActivity.this.f6804l.mo19194a() == null)) {
                            TTRewardExpressVideoActivity.this.f6804l.mo19194a().mo17097a((CharSequence) String.valueOf(TTRewardExpressVideoActivity.this.f6811s), i, 0);
                        }
                        if (TTRewardExpressVideoActivity.this.f6811s > 0) {
                            if (!z || i < f || TTRewardExpressVideoActivity.this.f6795c.mo19615f() == 5) {
                                TTRewardExpressVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardExpressVideoActivity.this.f6811s), (CharSequence) null);
                                return;
                            }
                            TTRewardExpressVideoActivity.this.f6815w.getAndSet(true);
                            TTRewardExpressVideoActivity.this.f6803k.mo18948d(true);
                            TTRewardExpressVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardExpressVideoActivity.this.f6811s), (CharSequence) C3471f.f8593c);
                            TTRewardExpressVideoActivity.this.f6803k.mo18949e(true);
                        } else if (TTRewardExpressVideoActivity.this.mo18352i()) {
                            TTRewardExpressVideoActivity.this.mo18335a(false);
                        } else {
                            TTRewardExpressVideoActivity.this.finish();
                        }
                    }
                }
            }
        });
        boolean a = mo18338a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f6967R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }
}
