package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181b.C3939d;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3893s;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.l */
/* compiled from: TTRewardVideoAdImpl */
class C3305l implements TTRewardVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7857a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3431n f7858b;

    /* renamed from: c */
    private final AdSlot f7859c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener f7860d;

    /* renamed from: e */
    private C3968c f7861e;

    /* renamed from: f */
    private boolean f7862f = true;

    /* renamed from: g */
    private boolean f7863g;

    /* renamed from: h */
    private String f7864h;

    /* renamed from: i */
    private String f7865i;

    /* renamed from: j */
    private AtomicBoolean f7866j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f7867k;

    /* renamed from: l */
    private boolean f7868l;

    /* renamed from: m */
    private boolean f7869m;

    /* renamed from: n */
    private Double f7870n = null;

    C3305l(Context context, C3431n nVar, AdSlot adSlot) {
        this.f7857a = context;
        this.f7858b = nVar;
        this.f7859c = adSlot;
        if (getInteractionType() == 4) {
            this.f7861e = C3969d.m13089a(this.f7857a, this.f7858b, "rewarded_video");
        }
        this.f7863g = false;
        this.f7867k = C3885n.m12675a();
    }

    /* renamed from: a */
    public void mo19148a(String str) {
        if (!this.f7866j.get()) {
            this.f7863g = true;
            this.f7864h = str;
        }
    }

    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f7860d = rewardAdInteractionListener;
        m9753a(0);
    }

    public int getInteractionType() {
        C3431n nVar = this.f7858b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19519L();
    }

    public void setShowDownLoadBar(boolean z) {
        this.f7862f = z;
    }

    public int getRewardVideoAdType() {
        C3431n nVar = this.f7858b;
        if (nVar == null) {
            return -1;
        }
        if (C3434p.m10497i(nVar)) {
            return 2;
        }
        return C3434p.m10498j(this.f7858b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f7858b.mo19640n();
    }

    public void showRewardVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C2905l.m8118e("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C3090e.m8907a(this.f7858b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C2905l.m8118e("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        } else if (!this.f7866j.get()) {
            this.f7866j.set(true);
            C3431n nVar = this.f7858b;
            if (nVar == null || nVar.mo19517J() == null) {
                C3090e.m8907a(this.f7858b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f7857a : activity;
            if (context == null) {
                context = C3513m.m10963a();
            }
            if (this.f7858b.mo19634l() != 2 || this.f7858b.mo19615f() == 5 || this.f7858b.mo19615f() == 6) {
                intent = new Intent(context, TTRewardVideoActivity.class);
            } else {
                intent = new Intent(context, TTRewardExpressVideoActivity.class);
            }
            if (activity == null) {
                intent.addFlags(268435456);
            }
            int i = 0;
            try {
                i = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
            }
            intent.putExtra("orientation_angle", i);
            intent.putExtra(CampaignEx.JSON_KEY_REWARD_NAME, this.f7858b.mo19628j());
            intent.putExtra(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f7858b.mo19631k());
            intent.putExtra("media_extra", this.f7859c.getMediaExtra());
            intent.putExtra("user_id", this.f7859c.getUserID());
            intent.putExtra("show_download_bar", this.f7862f);
            Double d = this.f7870n;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f7865i)) {
                intent.putExtra("rit_scene", this.f7865i);
            }
            if (this.f7863g) {
                intent.putExtra("video_cache_url", this.f7864h);
            }
            if (C3948b.m12959c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f7858b.mo19584ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f7867k);
            } else {
                C3580t.m11322a().mo20140h();
                C3580t.m11322a().mo20130a(this.f7858b);
                C3580t.m11322a().mo20129a(this.f7860d);
                C3580t.m11322a().mo20131a(this.f7861e);
                this.f7860d = null;
            }
            C2889b.m8066a(context, intent, new C2889b.C2890a() {
                /* renamed from: a */
                public void mo17808a() {
                }

                /* renamed from: a */
                public void mo17809a(Throwable th) {
                    C2905l.m8115c("TTRewardVideoAdImpl", "show reward video error: ", th);
                    C3090e.m8907a(C3305l.this.f7858b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C3898x.m12755a(this.f7858b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C3290i.m9699a(this.f7857a).mo19131b(a);
                    C3290i.m9699a(this.f7857a).mo19130a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f7863g || TextUtils.isEmpty(this.f7864h)) {
                        C3290i.m9699a(this.f7857a).mo19128a(b);
                    } else {
                        C3290i.m9699a(this.f7857a).mo19133b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3431n nVar = this.f7858b;
        if (nVar != null) {
            return nVar.mo19576aj();
        }
        return null;
    }

    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C2905l.m8118e("TTRewardVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f7865i = str;
        } else {
            this.f7865i = ritScenes.getScenesName();
        }
        showRewardVideoAd(activity);
    }

    /* renamed from: a */
    private void m9753a(final int i) {
        if (C3948b.m12959c()) {
            C2882e.m8044c(new C2885g("Reward_registerMultiProcessListener") {
                public void run() {
                    C3912a a = C3912a.m12924a(C3305l.this.f7857a);
                    if (i == 0 && C3305l.this.f7860d != null) {
                        C2905l.m8111b("MultiProcess", "start registerRewardVideoListener ! ");
                        C3939d dVar = new C3939d(C3305l.this.f7860d);
                        IListenerManager asInterface = C3924h.asInterface(a.mo20782a(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(C3305l.this.f7867k, dVar);
                                C2905l.m8111b("MultiProcess", "end registerRewardVideoListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void win(Double d) {
        if (!this.f7868l) {
            C3893s.m12718a(this.f7858b, d);
            this.f7868l = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f7869m) {
            C3893s.m12719a(this.f7858b, d, str, str2);
            this.f7869m = true;
        }
    }

    public void setPrice(Double d) {
        this.f7870n = d;
    }
}
