package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3262c;
import com.bytedance.sdk.openadsdk.component.reward.top.C3312b;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3574p;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* renamed from: S */
    private static TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f6863S;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f6864R;

    /* renamed from: T */
    private boolean f6865T;

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo18328I() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8505b(bundle)) {
            mo18373t();
            mo18374u();
            mo18345d();
            mo18331a();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f6863S = this.f6864R;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8507c(final String str) {
        C2882e.m8044c(new C2885g("FullScreen_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.mo18330a(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f6796d, str);
                } catch (Throwable th) {
                    C2905l.m8115c("TTFullScreenVideoActivity", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18332a(Intent intent) {
        super.mo18332a(intent);
        if (intent != null) {
            this.f6764F = intent.getBooleanExtra("is_verity_playable", false);
        }
    }

    /* renamed from: b */
    private boolean m8505b(Bundle bundle) {
        String stringExtra;
        if (C3948b.m12959c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f6795c = C3356b.m9935a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C2905l.m8115c("TTFullScreenVideoActivity", "initData MultiGlobalInfo throws ", e);
                }
            }
        } else {
            this.f6795c = C3580t.m11322a().mo20135c();
            this.f6864R = C3580t.m11322a().mo20137e();
        }
        if (!C3948b.m12959c()) {
            C3580t.m11322a().mo20140h();
        }
        if (bundle != null) {
            if (this.f6864R == null) {
                this.f6864R = f6863S;
                f6863S = null;
            }
            try {
                this.f6795c = C3356b.m9935a(new JSONObject(bundle.getString("material_meta")));
                this.f6815w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f6815w.get()) {
                    this.f6803k.mo18948d(true);
                    m8500N();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f6795c == null) {
            C2905l.m8118e("TTFullScreenVideoActivity", "mMaterialMeta is null , no data to display ,the TTFullScreenVideoActivity finished !!");
            finish();
            return false;
        }
        this.f6806n.mo18907a(this.f6795c, this.f6785a);
        this.f6806n.mo18905a();
        this.f6795c.mo19538a(this.f6795c.mo19618g(), 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo18327H() {
        View k = this.f6801i.mo19237k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTFullScreenVideoActivity.this.f6807o.mo19041r();
                    TTFullScreenVideoActivity.this.mo18372s();
                    TTFullScreenVideoActivity.this.finish();
                }
            });
        }
        this.f6803k.mo18937a((C3312b) new C3312b() {
            /* renamed from: a */
            public void mo18436a(View view) {
                if (C3434p.m10497i(TTFullScreenVideoActivity.this.f6795c) || (C3418l.m10264a(TTFullScreenVideoActivity.this.f6795c) && !TTFullScreenVideoActivity.this.f6799g.get())) {
                    if (C3948b.m12959c()) {
                        TTFullScreenVideoActivity.this.m8507c("onSkippedVideo");
                    } else if (TTFullScreenVideoActivity.this.f6864R != null) {
                        TTFullScreenVideoActivity.this.f6864R.onSkippedVideo();
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                C3084o.C3085a aVar = new C3084o.C3085a();
                aVar.mo18632a(TTFullScreenVideoActivity.this.f6805m.mo18999s());
                aVar.mo18639c(TTFullScreenVideoActivity.this.f6805m.mo19001u());
                aVar.mo18636b(TTFullScreenVideoActivity.this.f6805m.mo18990j());
                aVar.mo18643e(3);
                aVar.mo18645f(TTFullScreenVideoActivity.this.f6805m.mo18998r());
                C3067a.m8767a(TTFullScreenVideoActivity.this.f6805m.mo18982c(), aVar, TTFullScreenVideoActivity.this.f6805m.mo18966a());
                C3574p.m11297c(TTFullScreenVideoActivity.this.f6812t);
                TTFullScreenVideoActivity.this.f6805m.mo18973a("skip", (Map<String, Object>) null);
                TTFullScreenVideoActivity.this.f6803k.mo18948d(false);
                if (C3948b.m12959c()) {
                    TTFullScreenVideoActivity.this.m8507c("onSkippedVideo");
                } else if (TTFullScreenVideoActivity.this.f6864R != null) {
                    TTFullScreenVideoActivity.this.f6864R.onSkippedVideo();
                }
                if (TTFullScreenVideoActivity.this.mo18352i()) {
                    TTFullScreenVideoActivity.this.mo18335a(true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.f6795c != null && TTFullScreenVideoActivity.this.f6795c.mo19590ax() != null && TTFullScreenVideoActivity.this.f6805m != null) {
                    TTFullScreenVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19964f(TTFullScreenVideoActivity.this.f6805m.mo18999s());
                    TTFullScreenVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19962e(TTFullScreenVideoActivity.this.f6805m.mo18999s());
                }
            }

            /* renamed from: b */
            public void mo18437b(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f6810r = !tTFullScreenVideoActivity.f6810r;
                if (!(TTFullScreenVideoActivity.this.f6770L == null || TTFullScreenVideoActivity.this.f6770L.mo19079a() == null)) {
                    TTFullScreenVideoActivity.this.f6770L.mo19079a().mo19088a(TTFullScreenVideoActivity.this.f6810r);
                }
                TTFullScreenVideoActivity.this.f6805m.mo18980b(TTFullScreenVideoActivity.this.f6810r);
                if (!C3434p.m10498j(TTFullScreenVideoActivity.this.f6795c) || TTFullScreenVideoActivity.this.f6814v.get()) {
                    if (C3434p.m10489a(TTFullScreenVideoActivity.this.f6795c)) {
                        TTFullScreenVideoActivity.this.f6763E.mo20531a(TTFullScreenVideoActivity.this.f6810r, true);
                    }
                    TTFullScreenVideoActivity.this.f6807o.mo19027d(TTFullScreenVideoActivity.this.f6810r);
                    if (TTFullScreenVideoActivity.this.f6795c != null && TTFullScreenVideoActivity.this.f6795c.mo19590ax() != null && TTFullScreenVideoActivity.this.f6795c.mo19590ax().mo19887a() != null && TTFullScreenVideoActivity.this.f6805m != null) {
                        if (TTFullScreenVideoActivity.this.f6810r) {
                            TTFullScreenVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19968h(TTFullScreenVideoActivity.this.f6805m.mo18999s());
                        } else {
                            TTFullScreenVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19970i(TTFullScreenVideoActivity.this.f6805m.mo18999s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo18438c(View view) {
                TTFullScreenVideoActivity.this.mo18326G();
            }
        });
    }

    /* renamed from: a */
    public boolean mo18426a(long j, boolean z) {
        C3100j jVar = new C3100j();
        jVar.mo18681a(System.currentTimeMillis(), 1.0f);
        if (this.f6770L == null || !(this.f6770L instanceof C3262c)) {
            this.f6805m.mo18969a(this.f6801i.mo19234h(), this.f6795c, this.f6785a, mo18328I(), jVar);
        } else {
            this.f6805m.mo18969a(((C3262c) this.f6770L).mo19096d(), this.f6795c, this.f6785a, mo18328I(), jVar);
        }
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(this.f6762D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f6762D);
        }
        this.f6805m.mo18974a((Map<String, Object>) hashMap);
        C30004 r1 = new C2405c.C2406a() {
            /* renamed from: a */
            public void mo16056a(long j, int i) {
                TTFullScreenVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18324E();
                TTFullScreenVideoActivity.this.mo18429M();
                if (C3418l.m10266b(TTFullScreenVideoActivity.this.f6795c)) {
                    TTFullScreenVideoActivity.this.mo18357n();
                    TTFullScreenVideoActivity.this.f6772N.set(true);
                } else if (TTFullScreenVideoActivity.this.mo18352i()) {
                    TTFullScreenVideoActivity.this.mo18335a(false);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: b */
            public void mo16058b(long j, int i) {
                TTFullScreenVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18323D();
                if (!TTFullScreenVideoActivity.this.f6805m.mo18981b()) {
                    TTFullScreenVideoActivity.this.mo18324E();
                    TTFullScreenVideoActivity.this.f6805m.mo18993m();
                    C2905l.m8118e("TTFullScreenVideoActivity", "onError、、、、、、、、");
                    if (TTFullScreenVideoActivity.this.mo18352i()) {
                        TTFullScreenVideoActivity.this.mo18336a(false, true);
                        TTFullScreenVideoActivity.this.f6805m.mo18967a(TTFullScreenVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo16055a() {
                TTFullScreenVideoActivity.this.f6809q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18324E();
                C2905l.m8111b("TTFullScreenVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenVideoActivity.this.mo18352i()) {
                    TTFullScreenVideoActivity.this.mo18336a(false, true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.f6805m.mo18967a(TTFullScreenVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0, true ^ TTFullScreenVideoActivity.this.f6805m.mo18962B() ? 1 : 0);
                TTFullScreenVideoActivity.this.f6805m.mo18993m();
            }

            /* renamed from: a */
            public void mo16057a(long j, long j2) {
                if (!TTFullScreenVideoActivity.this.f6766H && TTFullScreenVideoActivity.this.f6805m.mo18981b()) {
                    TTFullScreenVideoActivity.this.f6805m.mo18995o();
                }
                if (!TTFullScreenVideoActivity.this.f6814v.get()) {
                    TTFullScreenVideoActivity.this.f6809q.removeMessages(300);
                    if (j != TTFullScreenVideoActivity.this.f6805m.mo18986f()) {
                        TTFullScreenVideoActivity.this.mo18324E();
                    }
                    TTFullScreenVideoActivity.this.f6805m.mo18968a(j);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    long j3 = j / 1000;
                    tTFullScreenVideoActivity.f6811s = (int) (tTFullScreenVideoActivity.f6805m.mo18963C() - ((double) j3));
                    int i = (int) j3;
                    if ((TTFullScreenVideoActivity.this.f6759A.get() || TTFullScreenVideoActivity.this.f6817y.get()) && TTFullScreenVideoActivity.this.f6805m.mo18981b()) {
                        TTFullScreenVideoActivity.this.f6805m.mo18995o();
                    }
                    TTFullScreenVideoActivity.this.mo18430e(i);
                    if (TTFullScreenVideoActivity.this.f6811s >= 0) {
                        TTFullScreenVideoActivity.this.f6803k.mo18938a(String.valueOf(TTFullScreenVideoActivity.this.f6811s), (CharSequence) null);
                    }
                    if (TTFullScreenVideoActivity.this.f6811s <= 0) {
                        TTFullScreenVideoActivity.this.f6772N.set(true);
                        C2905l.m8111b("TTFullScreenVideoActivity", "onProgressUpdate、、、、、、、、");
                        if (TTFullScreenVideoActivity.this.mo18352i()) {
                            TTFullScreenVideoActivity.this.mo18335a(false);
                        } else {
                            TTFullScreenVideoActivity.this.finish();
                        }
                    }
                }
            }
        };
        this.f6805m.mo18970a((C2405c.C2406a) r1);
        if (this.f6801i.f7955x != null) {
            this.f6801i.f7955x.mo19482a((C2405c.C2406a) r1);
        }
        return mo18338a(j, z, (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18430e(int i) {
        int e = C3513m.m10973h().mo19847e(this.f6812t);
        if (e < 0) {
            e = 5;
        }
        if (C3513m.m10973h().mo19843c(String.valueOf(this.f6812t)) && (C3431n.m10311c(this.f6795c) || mo18352i())) {
            if (!this.f6815w.getAndSet(true)) {
                this.f6803k.mo18948d(true);
            }
            if (i <= e) {
                m8508g(e - i);
                this.f6803k.mo18949e(false);
                return;
            }
            m8500N();
        } else if (i >= e) {
            if (!this.f6815w.getAndSet(true)) {
                this.f6803k.mo18948d(true);
            }
            m8500N();
        }
    }

    /* renamed from: N */
    private void m8500N() {
        if (C3431n.m10311c(this.f6795c) || mo18352i()) {
            this.f6803k.mo18938a((String) null, (CharSequence) C3471f.f8593c);
        } else {
            this.f6803k.mo18938a((String) null, (CharSequence) "X");
        }
        this.f6803k.mo18949e(true);
    }

    /* renamed from: g */
    private void m8508g(int i) {
        this.f6803k.mo18938a((String) null, (CharSequence) new SpannableStringBuilder(String.format(C2914t.m8151a(C3513m.m10963a(), "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(i)})));
    }

    public void onRewardBarClick(View view) {
        if (!(this.f6795c == null || this.f6795c.mo19580an() == 100.0f)) {
            this.f6865T = true;
        }
        if (C3948b.m12959c()) {
            m8507c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f6864R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: K */
    public void mo18427K() {
        if (C3948b.m12959c()) {
            m8507c("onAdShow");
        } else {
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f6864R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdShow();
            }
        }
        if (mo18329J()) {
            this.f6804l.mo19210j();
        }
    }

    /* renamed from: L */
    public void mo18428L() {
        if (C3948b.m12959c()) {
            m8507c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f6864R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: f */
    public void mo18431f(int i) {
        if (i == 10002) {
            mo18429M();
        }
    }

    public void finish() {
        this.f6808p.mo18922b(this.f6764F);
        try {
            m8501O();
        } catch (Exception unused) {
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m8501O();
        if (C3948b.m12959c()) {
            m8507c("recycleRes");
        }
        this.f6864R = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f6863S = null;
    }

    /* renamed from: O */
    private void m8501O() {
        if (!this.f6765G) {
            this.f6765G = true;
            if (C3948b.m12959c()) {
                m8507c("onAdClose");
                return;
            }
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f6864R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18429M() {
        if (C3948b.m12959c()) {
            m8507c("onVideoComplete");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f6864R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (m8506b(this.f6795c) && !m8504a(this.f6795c)) {
            if (this.f6865T) {
                this.f6865T = false;
                finish();
            } else if (this.f6807o.mo19047x()) {
                finish();
            }
        }
    }

    /* renamed from: a */
    private boolean m8504a(C3431n nVar) {
        return nVar == null || nVar.mo19580an() == 100.0f;
    }

    /* renamed from: b */
    private boolean m8506b(C3431n nVar) {
        if (nVar == null) {
            return false;
        }
        return C3513m.m10973h().mo19855g(this.f6812t);
    }
}
