package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3262c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import java.util.HashMap;
import java.util.Map;

public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
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
        C3100j jVar2 = jVar;
        if (this.f6770L == null || !(this.f6770L instanceof C3262c) || this.f6771M) {
            this.f6805m.mo18969a(this.f6804l.mo19201b(), this.f6795c, this.f6785a, mo18328I(), jVar2);
        } else {
            this.f6805m.mo18969a(((C3262c) this.f6770L).mo19096d(), this.f6795c, this.f6785a, mo18328I(), jVar2);
        }
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
                TTFullScreenExpressVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18324E();
                TTFullScreenExpressVideoActivity.this.f6804l.mo19202b(true);
                TTFullScreenExpressVideoActivity.this.mo18429M();
                if (TTFullScreenExpressVideoActivity.this.mo18352i()) {
                    TTFullScreenExpressVideoActivity.this.mo18335a(false);
                } else if (C3431n.m10311c(TTFullScreenExpressVideoActivity.this.f6795c)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                } else if (TTFullScreenExpressVideoActivity.this.f6804l != null && TTFullScreenExpressVideoActivity.this.f6804l.mo19194a() != null) {
                    TTFullScreenExpressVideoActivity.this.f6804l.mo19194a().mo17097a((CharSequence) "0", 0, 0);
                    if (TTFullScreenExpressVideoActivity.this.f6804l.mo19208h()) {
                        TTFullScreenExpressVideoActivity.this.f6803k.mo18938a("0", (CharSequence) "X");
                        TTFullScreenExpressVideoActivity.this.f6803k.mo18949e(true);
                    }
                }
            }

            /* renamed from: b */
            public void mo16058b(long j, int i) {
                TTFullScreenExpressVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18323D();
                if (!TTFullScreenExpressVideoActivity.this.f6805m.mo18981b()) {
                    TTFullScreenExpressVideoActivity.this.mo18324E();
                    TTFullScreenExpressVideoActivity.this.f6805m.mo18993m();
                    C2905l.m8118e("TTFullScreenExpressVideoActivity", "onError、、、、、、、、");
                    TTFullScreenExpressVideoActivity.this.f6804l.mo19200a(true);
                    if (TTFullScreenExpressVideoActivity.this.mo18352i()) {
                        TTFullScreenExpressVideoActivity.this.mo18335a(false);
                        TTFullScreenExpressVideoActivity.this.f6805m.mo18967a(true ^ TTFullScreenExpressVideoActivity.this.f6805m.mo18962B() ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo16055a() {
                TTFullScreenExpressVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.mo18324E();
                C2905l.m8111b("TTFullScreenExpressVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenExpressVideoActivity.this.mo18352i()) {
                    TTFullScreenExpressVideoActivity.this.mo18335a(false);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.f6805m.mo18967a(TTFullScreenExpressVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0, TTFullScreenExpressVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.f6805m.mo18993m();
            }

            /* renamed from: a */
            public void mo16057a(long j, long j2) {
                if (!TTFullScreenExpressVideoActivity.this.f6766H && TTFullScreenExpressVideoActivity.this.f6805m.mo18981b()) {
                    TTFullScreenExpressVideoActivity.this.f6805m.mo18995o();
                }
                if (!TTFullScreenExpressVideoActivity.this.f6814v.get()) {
                    TTFullScreenExpressVideoActivity.this.f6809q.removeMessages(300);
                    if (j != TTFullScreenExpressVideoActivity.this.f6805m.mo18986f()) {
                        TTFullScreenExpressVideoActivity.this.mo18324E();
                    }
                    if (TTFullScreenExpressVideoActivity.this.f6805m.mo18981b()) {
                        TTFullScreenExpressVideoActivity.this.f6805m.mo18968a(j);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTFullScreenExpressVideoActivity.f6811s = (int) (tTFullScreenExpressVideoActivity.f6805m.mo18963C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTFullScreenExpressVideoActivity.this.f6759A.get() || TTFullScreenExpressVideoActivity.this.f6817y.get()) && TTFullScreenExpressVideoActivity.this.f6805m.mo18981b()) {
                            TTFullScreenExpressVideoActivity.this.f6805m.mo18995o();
                        }
                        if (!(TTFullScreenExpressVideoActivity.this.f6804l == null || TTFullScreenExpressVideoActivity.this.f6804l.mo19194a() == null)) {
                            TTFullScreenExpressVideoActivity.this.f6804l.mo19194a().mo17097a((CharSequence) String.valueOf(TTFullScreenExpressVideoActivity.this.f6811s), i, 0);
                        }
                        if (TTFullScreenExpressVideoActivity.this.f6804l.mo19208h()) {
                            TTFullScreenExpressVideoActivity.this.mo18430e(i);
                            if (TTFullScreenExpressVideoActivity.this.f6811s >= 0) {
                                TTFullScreenExpressVideoActivity.this.f6803k.mo18948d(true);
                                TTFullScreenExpressVideoActivity.this.f6803k.mo18938a(String.valueOf(TTFullScreenExpressVideoActivity.this.f6811s), (CharSequence) null);
                            }
                        }
                        if (TTFullScreenExpressVideoActivity.this.f6811s <= 0) {
                            C2905l.m8111b("TTFullScreenExpressVideoActivity", "onProgressUpdate、、、、、、、、");
                            if (TTFullScreenExpressVideoActivity.this.mo18352i()) {
                                TTFullScreenExpressVideoActivity.this.mo18335a(false);
                            } else if (C3431n.m10311c(TTFullScreenExpressVideoActivity.this.f6795c)) {
                                TTFullScreenExpressVideoActivity.this.finish();
                            }
                        }
                    }
                }
            }
        });
        return mo18338a(j, z, (Map<String, Object>) hashMap);
    }
}
