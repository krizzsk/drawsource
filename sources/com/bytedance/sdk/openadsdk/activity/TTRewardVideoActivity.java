package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.top.C3312b;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.C3562o;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.core.widget.C3680a;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTRewardVideoActivity extends TTBaseVideoActivity {

    /* renamed from: U */
    private static final String f6961U = C2914t.m8151a(C3513m.m10963a(), "tt_reward_msg");

    /* renamed from: V */
    private static final String f6962V = C2914t.m8151a(C3513m.m10963a(), "tt_msgPlayable");

    /* renamed from: W */
    private static final String f6963W = C2914t.m8151a(C3513m.m10963a(), "tt_negtiveBtnBtnText");

    /* renamed from: X */
    private static final String f6964X = C2914t.m8151a(C3513m.m10963a(), "tt_postiveBtnText");

    /* renamed from: Y */
    private static final String f6965Y = C2914t.m8151a(C3513m.m10963a(), "tt_postiveBtnTextPlayable");

    /* renamed from: ad */
    private static TTRewardVideoAd.RewardAdInteractionListener f6966ad;

    /* renamed from: R */
    protected int f6967R;

    /* renamed from: S */
    protected int f6968S;

    /* renamed from: T */
    protected TTRewardVideoAd.RewardAdInteractionListener f6969T;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f6970Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public int f6971aa;

    /* renamed from: ab */
    private String f6972ab;

    /* renamed from: ac */
    private String f6973ac;

    /* renamed from: ae */
    private AtomicBoolean f6974ae = new AtomicBoolean(false);

    /* renamed from: af */
    private int f6975af = -1;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0066, code lost:
        if (r3.f6799g.get() == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0071  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8611O() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.b.b.b.o$a r0 = new com.bytedance.sdk.openadsdk.b.b.b.o$a
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            long r1 = r1.mo18999s()
            r0.mo18632a((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            long r1 = r1.mo19001u()
            r0.mo18639c((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            long r1 = r1.mo18990j()
            r0.mo18636b((long) r1)
            r1 = 3
            r0.mo18643e(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            int r1 = r1.mo18998r()
            r0.mo18645f(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            com.bykv.vk.openvk.component.video.api.b.a r1 = r1.mo18982c()
            com.bytedance.sdk.openadsdk.component.reward.a.e r2 = r3.f6805m
            com.bytedance.sdk.openadsdk.b.j r2 = r2.mo18966a()
            com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a.m8767a((com.bykv.p054vk.openvk.component.video.api.p070b.C2398a) r1, (com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o.C3085a) r0, (com.bytedance.sdk.openadsdk.p128b.C3100j) r2)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f6805m
            r0.mo18993m()
            int r0 = r3.f6812t
            com.bytedance.sdk.openadsdk.core.C3574p.m11297c((int) r0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f6805m
            java.lang.String r1 = "skip"
            r2 = 0
            r0.mo18973a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r0 = r3.mo18352i()
            if (r0 == 0) goto L_0x0068
            r0 = 1
            r3.mo18335a((boolean) r0)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f6795c
            boolean r0 = com.bytedance.sdk.openadsdk.core.p149e.C3418l.m10264a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0)
            if (r0 == 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f6799g
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006b
        L_0x0068:
            r3.finish()
        L_0x006b:
            boolean r0 = com.bytedance.sdk.openadsdk.multipro.C3948b.m12959c()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "onSkippedVideo"
            r3.mo18490c((java.lang.String) r0)
            goto L_0x007e
        L_0x0077:
            com.bytedance.sdk.openadsdk.TTRewardVideoAd$RewardAdInteractionListener r0 = r3.f6969T
            if (r0 == 0) goto L_0x007e
            r0.onSkippedVideo()
        L_0x007e:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f6795c
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f6795c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19590ax()
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f6805m
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f6795c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19590ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo19887a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            long r1 = r1.mo18999s()
            r0.mo19964f((long) r1)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f6795c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19590ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo19887a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f6805m
            long r1 = r1.mo18999s()
            r0.mo19962e((long) r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.m8611O():void");
    }

    /* renamed from: P */
    private JSONObject m8612P() {
        JSONObject jSONObject = new JSONObject();
        int v = (int) this.f6805m.mo19002v();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f6970Z);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f6971aa);
            jSONObject.put("network", C2909o.m8136c(this.f6794b));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int F = this.f6795c.mo19513F();
            String str = "unKnow";
            if (F == 2) {
                str = C3898x.m12751a();
            } else if (F == 1) {
                str = C3898x.m12768b();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f6795c.mo19564aH());
            jSONObject.put("media_extra", this.f6972ab);
            jSONObject.put("video_duration", this.f6795c.mo19517J().mo15946f());
            jSONObject.put("play_start_ts", this.f6967R);
            jSONObject.put("play_end_ts", this.f6968S);
            jSONObject.put("duration", v);
            jSONObject.put("user_id", this.f6973ac);
            jSONObject.put("trans_id", C3885n.m12675a().replace("-", ""));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Q */
    private void m8613Q() {
        if (!this.f6765G) {
            this.f6765G = true;
            if (C3948b.m12959c()) {
                mo18490c("onAdClose");
                return;
            }
            TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
            if (rewardAdInteractionListener != null) {
                rewardAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8617a(String str, boolean z, int i, String str2, int i2, String str3) {
        final String str4 = str;
        final boolean z2 = z;
        final int i3 = i;
        final String str5 = str2;
        final int i4 = i2;
        final String str6 = str3;
        C2882e.m8044c(new C2885g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTRewardVideoActivity.this.mo18330a(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f6796d, str4, z2, i3, str5, i4, str6);
                } catch (Throwable th) {
                    C2905l.m8115c("TTRewardVideoActivity", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8619b(final boolean z, final boolean z2) {
        String str;
        C3680a aVar;
        if (!C3513m.m10973h().mo19846d(String.valueOf(this.f6812t))) {
            if (z) {
                if (!z2) {
                    if (C3948b.m12959c()) {
                        mo18490c("onSkippedVideo");
                    } else {
                        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
                        if (rewardAdInteractionListener != null) {
                            rewardAdInteractionListener.onSkippedVideo();
                        }
                    }
                }
                finish();
                return;
            }
            m8611O();
        } else if (!this.f6974ae.get()) {
            this.f6759A.set(true);
            this.f6805m.mo18995o();
            if (z) {
                mo18378y();
            }
            final C3680a aVar2 = new C3680a(this);
            this.f6760B = aVar2;
            C3680a aVar3 = this.f6760B;
            if (z) {
                aVar = aVar3.mo20438a(f6962V);
                str = f6965Y;
            } else {
                aVar = aVar3.mo20438a(f6961U);
                str = f6964X;
            }
            aVar.mo20439b(str).mo20440c(f6963W);
            this.f6760B.mo20437a((C3680a.C3683a) new C3680a.C3683a() {
                /* renamed from: a */
                public void mo18494a() {
                    TTRewardVideoActivity.this.f6805m.mo18994n();
                    if (z) {
                        TTRewardVideoActivity.this.mo18379z();
                    }
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f6759A.set(false);
                }

                /* renamed from: b */
                public void mo18495b() {
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f6759A.set(false);
                    TTRewardVideoActivity.this.f6808p.mo18925d(Integer.MAX_VALUE);
                    if (z) {
                        TTRewardVideoActivity.this.mo18372s();
                        if (!z2) {
                            if (C3948b.m12959c()) {
                                TTRewardVideoActivity.this.mo18490c("onSkippedVideo");
                            } else if (TTRewardVideoActivity.this.f6969T != null) {
                                TTRewardVideoActivity.this.f6969T.onSkippedVideo();
                            }
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    TTRewardVideoActivity.this.m8611O();
                }
            }).show();
        } else if (z) {
            if (!z2) {
                if (C3948b.m12959c()) {
                    mo18490c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener2 = this.f6969T;
                    if (rewardAdInteractionListener2 != null) {
                        rewardAdInteractionListener2.onSkippedVideo();
                    }
                }
            }
            finish();
        } else {
            m8611O();
        }
    }

    /* renamed from: b */
    private boolean m8620b(Bundle bundle) {
        String stringExtra;
        if (C3948b.m12959c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f6795c = C3356b.m9935a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C2905l.m8115c("TTRewardVideoActivity", "TTRewardVideoActivity MultiGlobalInfo throw ", e);
                }
            }
        } else {
            this.f6795c = C3580t.m11322a().mo20135c();
            this.f6969T = C3580t.m11322a().mo20136d();
        }
        if (!C3948b.m12959c()) {
            C3580t.m11322a().mo20140h();
        }
        if (bundle != null) {
            if (this.f6969T == null) {
                this.f6969T = f6966ad;
                f6966ad = null;
            }
            try {
                this.f6795c = C3356b.m9935a(new JSONObject(bundle.getString("material_meta")));
                this.f6815w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f6815w.get()) {
                    this.f6803k.mo18948d(true);
                    this.f6803k.mo18938a((String) null, (CharSequence) C3471f.f8593c);
                    this.f6803k.mo18949e(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f6795c == null) {
            C2905l.m8118e("TTRewardVideoActivity", "mMaterialMeta is null , no data to display ,the TTRewardVideoActivity finished !!");
            finish();
            return false;
        }
        this.f6806n.mo18907a(this.f6795c, this.f6785a);
        this.f6806n.mo18905a();
        this.f6795c.mo19538a(this.f6795c.mo19618g(), 7);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r12.f6807o.mo19028e().mo20369e() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (((1.0d - (((double) r12.f6811s) / r12.f6805m.mo18963C())) * 100.0d) >= ((double) r0)) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18320A() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()
            int r1 = r12.f6812t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.i.a r0 = r0.mo19872n(r1)
            int r0 = r0.f8558f
            com.bytedance.sdk.openadsdk.core.e.n r1 = r12.f6795c
            boolean r1 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10498j(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r12.f6805m
            double r8 = r1.mo18963C()
            int r1 = r12.f6811s
            double r10 = (double) r1
            double r10 = r10 / r8
            double r6 = r6 - r10
            double r6 = r6 * r4
            double r0 = (double) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            r3 = r2
            goto L_0x0072
        L_0x0033:
            r1 = 1120403456(0x42c80000, float:100.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r12.f6795c
            int r5 = r5.mo19586at()
            float r5 = (float) r5
            com.bytedance.sdk.openadsdk.component.reward.a.b r6 = r12.f6808p
            int r6 = r6.mo18933k()
            float r6 = (float) r6
            float r6 = r6 / r5
            float r4 = r4 - r6
            float r4 = r4 * r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            r0 = r2
            goto L_0x0050
        L_0x004f:
            r0 = r3
        L_0x0050:
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()
            int r4 = r12.f6812t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.mo19833a((java.lang.String) r4)
            if (r1 != 0) goto L_0x006f
            if (r0 == 0) goto L_0x0030
            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = r12.f6807o
            com.bytedance.sdk.openadsdk.core.w r0 = r0.mo19028e()
            boolean r0 = r0.mo20369e()
            if (r0 == 0) goto L_0x0030
            goto L_0x0031
        L_0x006f:
            if (r1 != r2) goto L_0x0072
            r3 = r0
        L_0x0072:
            if (r3 == 0) goto L_0x0079
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.mo18431f(r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.mo18320A():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo18327H() {
        View k = this.f6801i.mo19237k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTRewardVideoActivity.this.f6807o.mo19041r();
                    TTRewardVideoActivity.this.mo18372s();
                    if (C3434p.m10497i(TTRewardVideoActivity.this.f6795c)) {
                        TTRewardVideoActivity.this.m8619b(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            });
        }
        this.f6803k.mo18937a((C3312b) new C3312b() {
            /* renamed from: a */
            public void mo18436a(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.m8619b(C3434p.m10497i(tTRewardVideoActivity.f6795c), false);
            }

            /* renamed from: b */
            public void mo18437b(View view) {
                if (!(TTRewardVideoActivity.this.f6770L == null || TTRewardVideoActivity.this.f6770L.mo19079a() == null)) {
                    TTRewardVideoActivity.this.f6770L.mo19079a().mo19088a(TTRewardVideoActivity.this.f6810r);
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f6810r = !tTRewardVideoActivity.f6810r;
                C2905l.m8111b("TTRewardVideoActivity", "will set is Mute " + TTRewardVideoActivity.this.f6810r + " mLastVolume=" + TTRewardVideoActivity.this.f6763E.mo20532b());
                TTRewardVideoActivity.this.f6805m.mo18980b(TTRewardVideoActivity.this.f6810r);
                if (!C3434p.m10498j(TTRewardVideoActivity.this.f6795c) || TTRewardVideoActivity.this.f6814v.get()) {
                    if (C3434p.m10489a(TTRewardVideoActivity.this.f6795c)) {
                        TTRewardVideoActivity.this.f6763E.mo20531a(TTRewardVideoActivity.this.f6810r, true);
                    }
                    TTRewardVideoActivity.this.f6807o.mo19027d(TTRewardVideoActivity.this.f6810r);
                    if (TTRewardVideoActivity.this.f6795c != null && TTRewardVideoActivity.this.f6795c.mo19590ax() != null && TTRewardVideoActivity.this.f6795c.mo19590ax().mo19887a() != null && TTRewardVideoActivity.this.f6805m != null) {
                        if (TTRewardVideoActivity.this.f6810r) {
                            TTRewardVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19968h(TTRewardVideoActivity.this.f6805m.mo18999s());
                        } else {
                            TTRewardVideoActivity.this.f6795c.mo19590ax().mo19887a().mo19970i(TTRewardVideoActivity.this.f6805m.mo18999s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo18438c(View view) {
                TTRewardVideoActivity.this.mo18326G();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo18328I() {
        return true;
    }

    /* renamed from: K */
    public void mo18427K() {
        if (C3948b.m12959c()) {
            mo18490c("onAdShow");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdShow();
        }
    }

    /* renamed from: L */
    public void mo18428L() {
        if (C3948b.m12959c()) {
            mo18490c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18429M() {
        if (!this.f6974ae.get()) {
            this.f6974ae.set(true);
            if (!C3513m.m10973h().mo19868l(String.valueOf(this.f6812t))) {
                C3513m.m10971f().mo19986a(m8612P(), (C3516n.C3518b) new C3516n.C3518b() {
                    /* renamed from: a */
                    public void mo18497a(int i, String str) {
                        if (C3948b.m12959c()) {
                            TTRewardVideoActivity.this.m8617a("onRewardVerify", false, 0, "", i, str);
                        } else if (TTRewardVideoActivity.this.f6969T != null) {
                            TTRewardVideoActivity.this.f6969T.onRewardVerify(false, 0, "", i, str);
                        }
                    }

                    /* renamed from: a */
                    public void mo18498a(final C3562o.C3573b bVar) {
                        final int a = bVar.f9030c.mo19706a();
                        final String b = bVar.f9030c.mo19709b();
                        if (C3948b.m12959c()) {
                            TTRewardVideoActivity.this.m8617a("onRewardVerify", bVar.f9029b, a, b, 0, "");
                        } else {
                            TTRewardVideoActivity.this.f6809q.post(new Runnable() {
                                public void run() {
                                    if (TTRewardVideoActivity.this.f6969T != null) {
                                        TTRewardVideoActivity.this.f6969T.onRewardVerify(bVar.f9029b, a, b, 0, "");
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (C3948b.m12959c()) {
                m8617a("onRewardVerify", true, this.f6971aa, this.f6970Z, 0, "");
            } else {
                this.f6809q.post(new Runnable() {
                    public void run() {
                        if (TTRewardVideoActivity.this.f6969T != null) {
                            TTRewardVideoActivity.this.f6969T.onRewardVerify(true, TTRewardVideoActivity.this.f6971aa, TTRewardVideoActivity.this.f6970Z, 0, "");
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo18488N() {
        if (C3948b.m12959c()) {
            mo18490c("onVideoComplete");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18489a(long j, long j2) {
        long j3 = j + (((long) this.f6773O) * 1000);
        if (this.f6975af == -1) {
            this.f6975af = C3513m.m10973h().mo19872n(String.valueOf(this.f6812t)).f8558f;
        }
        if (j2 > 0) {
            if (j2 >= 30000 && j3 >= 27000) {
                mo18429M();
            } else if (((float) (j3 * 100)) / ((float) j2) >= ((float) this.f6975af)) {
                mo18429M();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18332a(Intent intent) {
        super.mo18332a(intent);
        if (intent != null) {
            this.f6970Z = intent.getStringExtra(CampaignEx.JSON_KEY_REWARD_NAME);
            this.f6971aa = intent.getIntExtra(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0);
            this.f6972ab = intent.getStringExtra("media_extra");
            this.f6973ac = intent.getStringExtra("user_id");
        }
    }

    /* renamed from: a */
    public boolean mo18426a(long j, boolean z) {
        HashMap hashMap;
        C3100j jVar = new C3100j();
        jVar.mo18681a(System.currentTimeMillis(), 1.0f);
        this.f6805m.mo18969a(this.f6801i.mo19234h(), this.f6795c, this.f6785a, mo18328I(), jVar);
        if (!TextUtils.isEmpty(this.f6762D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f6762D);
        } else {
            hashMap = null;
        }
        this.f6805m.mo18974a((Map<String, Object>) hashMap);
        C30275 r1 = new C2405c.C2406a() {
            /* renamed from: a */
            public void mo16056a(long j, int i) {
                TTRewardVideoActivity.this.f6809q.removeMessages(300);
                TTRewardVideoActivity.this.mo18324E();
                TTRewardVideoActivity.this.mo18488N();
                TTRewardVideoActivity.this.f6772N.set(true);
                if (TTRewardVideoActivity.this.mo18352i()) {
                    TTRewardVideoActivity.this.mo18335a(false);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f6968S = (int) (System.currentTimeMillis() / 1000);
                TTRewardVideoActivity.this.mo18429M();
            }

            /* renamed from: b */
            public void mo16058b(long j, int i) {
                TTRewardVideoActivity.this.f6809q.removeMessages(300);
                if (C3948b.m12959c()) {
                    TTRewardVideoActivity.this.mo18490c("onVideoError");
                } else if (TTRewardVideoActivity.this.f6969T != null) {
                    TTRewardVideoActivity.this.f6969T.onVideoError();
                }
                TTRewardVideoActivity.this.mo18323D();
                if (!TTRewardVideoActivity.this.f6805m.mo18981b()) {
                    TTRewardVideoActivity.this.mo18324E();
                    TTRewardVideoActivity.this.f6805m.mo18993m();
                    TTRewardVideoActivity.this.mo18429M();
                    if (TTRewardVideoActivity.this.mo18352i()) {
                        TTRewardVideoActivity.this.mo18336a(false, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                    TTRewardVideoActivity.this.f6805m.mo18967a(true ^ TTRewardVideoActivity.this.f6805m.mo18962B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo16055a() {
                TTRewardVideoActivity.this.f6809q.removeMessages(300);
                TTRewardVideoActivity.this.mo18324E();
                if (TTRewardVideoActivity.this.mo18352i()) {
                    TTRewardVideoActivity.this.mo18336a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f6805m.mo18967a(TTRewardVideoActivity.this.f6805m.mo18962B() ^ true ? 1 : 0, true ^ TTRewardVideoActivity.this.f6805m.mo18962B() ? 1 : 0);
                TTRewardVideoActivity.this.f6805m.mo18993m();
            }

            /* renamed from: a */
            public void mo16057a(long j, long j2) {
                if (!TTRewardVideoActivity.this.f6766H && TTRewardVideoActivity.this.f6805m.mo18981b()) {
                    TTRewardVideoActivity.this.f6805m.mo18995o();
                }
                if (!TTRewardVideoActivity.this.f6814v.get()) {
                    TTRewardVideoActivity.this.f6809q.removeMessages(300);
                    if (j != TTRewardVideoActivity.this.f6805m.mo18986f()) {
                        TTRewardVideoActivity.this.mo18324E();
                    }
                    TTRewardVideoActivity.this.f6805m.mo18968a(j);
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    long j3 = j / 1000;
                    double d = (double) j3;
                    tTRewardVideoActivity.f6811s = (int) (tTRewardVideoActivity.f6805m.mo18963C() - d);
                    if (TTRewardVideoActivity.this.f6811s >= 0) {
                        TTRewardVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardVideoActivity.this.f6811s), (CharSequence) null);
                    }
                    TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity2.f6811s = (int) (tTRewardVideoActivity2.f6805m.mo18963C() - d);
                    int i = (int) j3;
                    int f = C3513m.m10973h().mo19851f(String.valueOf(TTRewardVideoActivity.this.f6812t));
                    boolean z = f >= 0;
                    if ((TTRewardVideoActivity.this.f6759A.get() || TTRewardVideoActivity.this.f6817y.get()) && TTRewardVideoActivity.this.f6805m.mo18981b()) {
                        TTRewardVideoActivity.this.f6805m.mo18995o();
                    }
                    TTRewardVideoActivity.this.f6801i.mo19228c(i);
                    TTRewardVideoActivity.this.mo18489a(j, j2);
                    if (TTRewardVideoActivity.this.f6811s > 0) {
                        TTRewardVideoActivity.this.f6803k.mo18948d(true);
                        if (!z || i < f) {
                            TTRewardVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardVideoActivity.this.f6811s), (CharSequence) null);
                            return;
                        }
                        TTRewardVideoActivity.this.f6815w.getAndSet(true);
                        TTRewardVideoActivity.this.f6803k.mo18938a(String.valueOf(TTRewardVideoActivity.this.f6811s), (CharSequence) C3471f.f8593c);
                        TTRewardVideoActivity.this.f6803k.mo18949e(true);
                    } else if (C3418l.m10268c(TTRewardVideoActivity.this.f6795c) || C3418l.m10266b(TTRewardVideoActivity.this.f6795c)) {
                        TTRewardVideoActivity.this.mo18335a(false);
                    } else if (C3418l.m10264a(TTRewardVideoActivity.this.f6795c) && !TTRewardVideoActivity.this.f6799g.get()) {
                        TTRewardVideoActivity.this.f6815w.getAndSet(true);
                        TTRewardVideoActivity.this.f6803k.mo18948d(true);
                        TTRewardVideoActivity.this.f6803k.mo18949e(true);
                    } else if (TTRewardVideoActivity.this.mo18352i()) {
                        TTRewardVideoActivity.this.mo18335a(false);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            }
        };
        this.f6805m.mo18970a((C2405c.C2406a) r1);
        this.f6805m.mo18970a((C2405c.C2406a) r1);
        if (this.f6801i.f7955x != null) {
            this.f6801i.f7955x.mo19482a((C2405c.C2406a) r1);
        }
        boolean a = mo18338a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f6967R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18490c(String str) {
        m8617a(str, false, 0, "", 0, "");
    }

    /* renamed from: e */
    public void mo18347e() {
        mo18429M();
    }

    /* renamed from: f */
    public void mo18431f(int i) {
        if (i == 10000) {
            mo18429M();
        } else if (i == 10001) {
            mo18488N();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f6966ad = null;
    }

    public void finish() {
        m8613Q();
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8620b(bundle)) {
            mo18373t();
            mo18374u();
            mo18345d();
            mo18331a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6804l != null) {
            this.f6804l.mo19206f();
        }
        m8613Q();
        if (C3948b.m12959c()) {
            mo18490c("recycleRes");
        }
        this.f6969T = null;
    }

    public void onRewardBarClick(View view) {
        if (C3948b.m12959c()) {
            mo18490c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f6969T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f6966ad = this.f6969T;
        super.onSaveInstanceState(bundle);
    }
}
