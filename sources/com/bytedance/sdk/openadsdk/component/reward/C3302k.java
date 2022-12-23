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
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3262c;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3922f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181b.C3933c;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3893s;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.k */
/* compiled from: TTFullScreenVideoAdImpl */
class C3302k implements TTFullScreenVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7839a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3431n f7840b;

    /* renamed from: c */
    private final AdSlot f7841c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f7842d;

    /* renamed from: e */
    private C3968c f7843e;

    /* renamed from: f */
    private boolean f7844f = true;

    /* renamed from: g */
    private boolean f7845g;

    /* renamed from: h */
    private String f7846h;

    /* renamed from: i */
    private String f7847i;

    /* renamed from: j */
    private AtomicBoolean f7848j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f7849k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f7850l;

    /* renamed from: m */
    private boolean f7851m;

    /* renamed from: n */
    private boolean f7852n;

    /* renamed from: o */
    private Double f7853o = null;

    C3302k(Context context, C3431n nVar, AdSlot adSlot) {
        this.f7839a = context;
        this.f7840b = nVar;
        this.f7841c = adSlot;
        if (getInteractionType() == 4) {
            this.f7843e = C3969d.m13089a(this.f7839a, this.f7840b, "fullscreen_interstitial_ad");
        }
        this.f7845g = false;
        this.f7850l = C3885n.m12675a();
    }

    /* renamed from: a */
    public void mo19146a(boolean z) {
        this.f7849k = z;
    }

    /* renamed from: a */
    public void mo19145a(String str) {
        if (!this.f7848j.get()) {
            this.f7845g = true;
            this.f7846h = str;
        }
    }

    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f7842d = fullScreenVideoAdInteractionListener;
        m9742a(1);
    }

    public int getInteractionType() {
        C3431n nVar = this.f7840b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19519L();
    }

    public void showFullScreenVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C2905l.m8118e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C3090e.m8907a(this.f7840b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C2905l.m8118e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        } else if (!this.f7848j.get()) {
            this.f7848j.set(true);
            C3431n nVar = this.f7840b;
            if (nVar == null || (nVar.mo19517J() == null && this.f7840b.mo19523P() == null)) {
                C3090e.m8907a(this.f7840b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f7839a : activity;
            if (context == null) {
                context = C3513m.m10963a();
            }
            if (this.f7840b.mo19634l() != 2 || this.f7840b.mo19615f() == 5 || this.f7840b.mo19615f() == 6) {
                if (C3262c.m9622a(this.f7840b)) {
                    intent = new Intent(context, TTInterstitialActivity.class);
                } else {
                    intent = new Intent(context, TTFullScreenVideoActivity.class);
                }
            } else if (C3262c.m9622a(this.f7840b)) {
                intent = new Intent(context, TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(context, TTFullScreenExpressVideoActivity.class);
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
            intent.putExtra("show_download_bar", this.f7844f);
            intent.putExtra("is_verity_playable", this.f7849k);
            Double d = this.f7853o;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f7847i)) {
                intent.putExtra("rit_scene", this.f7847i);
            }
            if (this.f7845g) {
                intent.putExtra("video_cache_url", this.f7846h);
            }
            if (C3948b.m12959c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f7840b.mo19584ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f7850l);
            } else {
                C3580t.m11322a().mo20140h();
                C3580t.m11322a().mo20130a(this.f7840b);
                C3580t.m11322a().mo20128a(this.f7842d);
                C3580t.m11322a().mo20131a(this.f7843e);
                this.f7842d = null;
            }
            C2889b.m8066a(context, intent, new C2889b.C2890a() {
                /* renamed from: a */
                public void mo17808a() {
                    if (C3302k.this.f7849k) {
                        try {
                            C3753b.m12287a().mo20570a(C3302k.this.f7840b.mo19517J().mo15955j());
                        } catch (Throwable unused) {
                        }
                    }
                }

                /* renamed from: a */
                public void mo17809a(Throwable th) {
                    C2905l.m8115c("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                    if (C3302k.this.f7849k) {
                        try {
                            C3753b.m12287a().mo20571a(C3302k.this.f7840b.mo19517J().mo15955j(), -1, th != null ? th.getMessage() : "playable tool error open");
                        } catch (Throwable unused) {
                        }
                    }
                    C3090e.m8907a(C3302k.this.f7840b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C3898x.m12755a(this.f7840b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C3265d.m9641a(this.f7839a).mo19101b(a);
                    C3265d.m9641a(this.f7839a).mo19100a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f7845g || TextUtils.isEmpty(this.f7846h)) {
                        C3265d.m9641a(this.f7839a).mo19098a(b);
                    } else {
                        C3265d.m9641a(this.f7839a).mo19103b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C2905l.m8118e("TTFullScreenVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f7847i = str;
        } else {
            this.f7847i = ritScenes.getScenesName();
        }
        showFullScreenVideoAd(activity);
    }

    public void setShowDownLoadBar(boolean z) {
        this.f7844f = z;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3431n nVar = this.f7840b;
        if (nVar != null) {
            return nVar.mo19576aj();
        }
        return null;
    }

    public int getFullVideoAdType() {
        C3431n nVar = this.f7840b;
        if (nVar == null) {
            return -1;
        }
        if (C3434p.m10497i(nVar)) {
            return 2;
        }
        return C3434p.m10498j(this.f7840b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f7840b.mo19640n();
    }

    /* renamed from: a */
    private void m9742a(final int i) {
        if (C3948b.m12959c()) {
            C2882e.m8044c(new C2885g("FullScreen_registerMultiProcessListener") {
                public void run() {
                    C3912a a = C3912a.m12924a(C3302k.this.f7839a);
                    if (i == 1 && C3302k.this.f7842d != null) {
                        C2905l.m8111b("MultiProcess", "start registerFullScreenVideoListener ! ");
                        C3933c cVar = new C3933c(C3302k.this.f7842d);
                        IListenerManager asInterface = C3922f.asInterface(a.mo20782a(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(C3302k.this.f7850l, cVar);
                                C2905l.m8111b("MultiProcess", "end registerFullScreenVideoListener ! ");
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
        if (!this.f7851m) {
            C3893s.m12718a(this.f7840b, d);
            this.f7851m = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f7852n) {
            C3893s.m12719a(this.f7840b, d, str, str2);
            this.f7852n = true;
        }
    }

    public void setPrice(Double d) {
        this.f7853o = d;
    }
}
