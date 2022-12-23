package com.mbridge.msdk.reward.p342a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8457b;
import com.mbridge.msdk.foundation.entity.C8460e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.p298db.C8407b;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8415h;
import com.mbridge.msdk.foundation.p298db.C8416i;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.reward.adapter.C9131a;
import com.mbridge.msdk.reward.adapter.C9132b;
import com.mbridge.msdk.reward.adapter.C9133c;
import com.mbridge.msdk.reward.adapter.C9154d;
import com.mbridge.msdk.reward.p343b.C9176a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9311h;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.videocommon.download.C9667j;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p372a.C9627a;
import com.mbridge.msdk.videocommon.p373b.C9629b;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.a.a */
/* compiled from: RewardVideoController */
public class C9110a {

    /* renamed from: K */
    private static Map<String, Integer> f22129K = new HashMap();

    /* renamed from: L */
    private static ConcurrentHashMap<String, String> f22130L = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String f22131a;

    /* renamed from: b */
    public static Map<String, C9127d> f22132b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f22133A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f22134B = false;

    /* renamed from: C */
    private boolean f22135C = false;

    /* renamed from: D */
    private boolean f22136D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f22137E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f22138F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ArrayList<Integer> f22139G = new ArrayList<>(7);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f22140H = false;

    /* renamed from: I */
    private final Object f22141I = new Object();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f22142J = false;

    /* renamed from: M */
    private Queue<Integer> f22143M;

    /* renamed from: N */
    private String f22144N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C8414g f22145O = null;

    /* renamed from: P */
    private volatile boolean f22146P = true;

    /* renamed from: Q */
    private volatile boolean f22147Q = false;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public volatile boolean f22148R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public volatile boolean f22149S = false;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public volatile boolean f22150T = false;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public volatile boolean f22151U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public volatile boolean f22152V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public CopyOnWriteArrayList<CampaignEx> f22153W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public List<CampaignEx> f22154X;

    /* renamed from: c */
    volatile boolean f22155c = false;

    /* renamed from: d */
    volatile boolean f22156d = false;

    /* renamed from: e */
    volatile boolean f22157e = false;

    /* renamed from: f */
    volatile boolean f22158f = false;

    /* renamed from: g */
    volatile boolean f22159g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f22160h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f22161i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9154d f22162j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9640c f22163k;

    /* renamed from: l */
    private C9637a f22164l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile InterVideoOutListener f22165m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C9126c f22166n;

    /* renamed from: o */
    private String f22167o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f22168p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public MBridgeIds f22169q;

    /* renamed from: r */
    private String f22170r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile String f22171s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f22172t;

    /* renamed from: u */
    private int f22173u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f22174v = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            Message message2 = message;
            switch (message2.what) {
                case 8:
                    if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                        boolean z = (C9110a.this.f22154X == null || C9110a.this.f22154X.size() <= 0) ? false : !TextUtils.isEmpty(((CampaignEx) C9110a.this.f22154X.get(0)).getCMPTEntryUrl());
                        int nscpt = ((CampaignEx) C9110a.this.f22153W.get(0)).getNscpt();
                        if (C9110a.this.f22162j == null || !C9110a.this.f22162j.mo61344a((List<CampaignEx>) C9110a.this.f22153W, z, nscpt)) {
                            if (C9110a.this.f22166n != null && C9110a.this.f22137E) {
                                C9625a.m27307c(C9110a.this.f22168p);
                                C9625a.m27301a();
                                C9126c.m25950a(C9110a.this.f22166n, "load timeout");
                                return;
                            }
                            return;
                        } else if (C9110a.this.f22166n != null && C9110a.this.f22137E) {
                            C9126c.m25951a(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 9:
                    if (C9110a.this.f22165m != null && C9110a.this.f22137E) {
                        Object obj = message2.obj;
                        if (obj instanceof String) {
                            obj.toString();
                        }
                        Bundle data = message.getData();
                        if (data != null && data.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty = TextUtils.isEmpty(data.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C9110a.this.f22134B) {
                                C9110a.m25898j(C9110a.this);
                            }
                            C9110a.this.f22165m.onVideoLoadSuccess(C9110a.this.f22169q);
                            return;
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 16:
                case 18:
                    if (C9110a.this.f22165m != null && C9110a.this.f22137E) {
                        Object obj2 = message2.obj;
                        String obj3 = obj2 instanceof String ? obj2.toString() : "";
                        C9625a.m27307c(C9110a.this.f22168p);
                        C9625a.m27301a();
                        try {
                            if (C9110a.this.f22134B) {
                                C9110a.m25898j(C9110a.this);
                            }
                            C9110a.this.f22165m.onVideoLoadFail(C9110a.this.f22169q, obj3);
                            return;
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 17:
                    if (C9110a.this.f22165m != null && C9110a.this.f22137E) {
                        Object obj4 = message2.obj;
                        if (obj4 instanceof String) {
                            obj4.toString();
                        }
                        Bundle data2 = message.getData();
                        if (data2 != null && data2.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty2 = TextUtils.isEmpty(data2.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C9110a.this.f22134B) {
                                C9110a.m25898j(C9110a.this);
                            }
                            C9110a.this.f22165m.onLoadSuccess(C9110a.this.f22169q);
                            return;
                        } catch (Exception e3) {
                            if (MBridgeConstans.DEBUG) {
                                e3.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 1001001:
                    C9110a.this.mo61288d(false);
                    return;
                case 1001002:
                    int E = C9110a.this.f22163k != null ? C9110a.this.f22163k.mo63563E() : 0;
                    if (C9110a.this.f22162j != null) {
                        if (C9110a.this.f22162j.mo61348b()) {
                            if (C9110a.this.f22166n != null) {
                                C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady exception");
                                try {
                                    CopyOnWriteArrayList<CampaignEx> d = C9110a.this.f22162j.mo61351d();
                                    if (d != null && d.size() > 0) {
                                        Context g = C8388a.m23845e().mo56913g();
                                        C9176a.m26122a(d.get(0), g, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9110a.this.f22168p, C9110a.this.f22134B, "", "", (long) E);
                                        C9176a.m26120a(C9110a.this.f22160h, d, C9110a.this.f22168p, 0);
                                    }
                                } catch (Throwable th) {
                                    C8672v.m24878d("RewardVideoController", th.getMessage());
                                }
                                C9126c.m25955b(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
                                return;
                            }
                            return;
                        } else if (C9110a.this.f22162j.mo61354f(false)) {
                            if (!C9110a.this.f22162j.mo61348b()) {
                                C9110a.this.f22162j.mo61353e(false);
                                if (C9110a.this.f22162j.mo61354f(true)) {
                                    if (!C9110a.this.f22162j.mo61348b()) {
                                        if (C9110a.this.f22166n != null) {
                                            C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + "s exception");
                                        }
                                        C9110a.this.f22162j.mo61353e(true);
                                        return;
                                    } else if (C9110a.this.f22166n != null) {
                                        C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                        C9110a.this.f22162j.mo61352d(true);
                                        try {
                                            CopyOnWriteArrayList<CampaignEx> d2 = C9110a.this.f22162j.mo61351d();
                                            if (d2 != null && d2.size() > 0) {
                                                Context g2 = C8388a.m23845e().mo56913g();
                                                C9176a.m26122a(d2.get(0), g2, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9110a.this.f22168p, C9110a.this.f22134B, "", "", (long) E);
                                                C9176a.m26120a(C9110a.this.f22160h, d2, C9110a.this.f22168p, 0);
                                            }
                                        } catch (Throwable th2) {
                                            C8672v.m24878d("RewardVideoController", th2.getMessage());
                                        }
                                        C9126c.m25955b(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (C9110a.this.f22166n != null) {
                                    C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + "s exception");
                                    return;
                                } else {
                                    return;
                                }
                            } else if (C9110a.this.f22166n != null) {
                                C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                C9110a.this.f22162j.mo61352d(false);
                                try {
                                    CopyOnWriteArrayList<CampaignEx> d3 = C9110a.this.f22162j.mo61351d();
                                    if (d3 != null && d3.size() > 0) {
                                        Context g3 = C8388a.m23845e().mo56913g();
                                        C9176a.m26122a(d3.get(0), g3, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9110a.this.f22168p, C9110a.this.f22134B, "", "", (long) E);
                                        C9176a.m26120a(C9110a.this.f22160h, d3, C9110a.this.f22168p, 0);
                                    }
                                } catch (Throwable th3) {
                                    C8672v.m24878d("RewardVideoController", th3.getMessage());
                                }
                                C9126c.m25955b(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C9110a.this.f22162j.mo61354f(true)) {
                            if (!C9110a.this.f22162j.mo61348b()) {
                                if (C9110a.this.f22166n != null) {
                                    C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + " s");
                                }
                                C9110a.this.f22162j.mo61353e(true);
                                return;
                            } else if (C9110a.this.f22166n != null) {
                                C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState");
                                C9110a.this.f22162j.mo61352d(true);
                                try {
                                    CopyOnWriteArrayList<CampaignEx> d4 = C9110a.this.f22162j.mo61351d();
                                    if (d4 != null && d4.size() > 0) {
                                        Context g4 = C8388a.m23845e().mo56913g();
                                        C9176a.m26122a(d4.get(0), g4, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9110a.this.f22168p, C9110a.this.f22134B, "", "", (long) E);
                                        C9176a.m26120a(C9110a.this.f22160h, d4, C9110a.this.f22168p, 0);
                                    }
                                } catch (Throwable th4) {
                                    C8672v.m24878d("RewardVideoController", th4.getMessage());
                                }
                                C9126c.m25955b(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C9110a.this.f22166n != null) {
                            C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + " s");
                            return;
                        } else {
                            return;
                        }
                    } else if (C9110a.this.f22166n != null) {
                        C8672v.m24874a("RewardVideoController", "load timeout task called for onVideoLoadFail by mRewardMvVideoAdapter is null exception");
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f22175w = 2;

    /* renamed from: x */
    private int f22176x;

    /* renamed from: y */
    private int f22177y;

    /* renamed from: z */
    private int f22178z;

    /* renamed from: a */
    public final void mo61282a(boolean z) {
        this.f22133A = z;
    }

    /* renamed from: b */
    public final void mo61286b(boolean z) {
        this.f22134B = z;
    }

    /* renamed from: a */
    public final void mo61277a(int i) {
        this.f22175w = i;
    }

    /* renamed from: a */
    public final String mo61276a() {
        C9154d dVar = this.f22162j;
        return dVar != null ? dVar.mo61335a(this.f22140H) : "";
    }

    /* renamed from: a */
    public final void mo61281a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f22160h;
            C8614ab.m24712a(context, "MBridge_ConfirmTitle" + this.f22168p, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            Context context2 = this.f22160h;
            C8614ab.m24712a(context2, "MBridge_ConfirmContent" + this.f22168p, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            Context context3 = this.f22160h;
            C8614ab.m24712a(context3, "MBridge_CancelText" + this.f22168p, str4.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            Context context4 = this.f22160h;
            C8614ab.m24712a(context4, "MBridge_ConfirmText" + this.f22168p, str3.trim());
        }
    }

    /* renamed from: c */
    public final void mo61287c(boolean z) {
        this.f22138F = z;
    }

    /* renamed from: a */
    public final void mo61278a(int i, int i2, int i3) {
        this.f22176x = i;
        this.f22177y = i2;
        if (i2 == C8469a.f20756q) {
            this.f22178z = i3 < 0 ? 5 : i3;
        }
        if (this.f22177y == C8469a.f20755p) {
            this.f22178z = i3 < 0 ? 80 : i3;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = 1;
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == C8469a.f20753n ? 0 : 1);
            if (i2 == C8469a.f20755p) {
                i4 = 0;
            }
            jSONObject.put("ivRewardPlayValueMode", i4);
            jSONObject.put("ivRewardPlayValue", i3);
            C2445b.m6020a();
            String str = this.f22168p;
            String jSONObject2 = jSONObject.toString();
            C2461a.m6124a().mo16388a("ivreward_" + str, jSONObject2);
        } catch (Exception unused) {
            C8672v.m24878d("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* renamed from: a */
    public static void m25866a(String str, int i) {
        try {
            if (f22129K != null && C8616ad.m24718b(str)) {
                f22129K.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m25859a(String str) {
        Integer num;
        try {
            if (!C8616ad.m24718b(str) || f22129K == null || !f22129K.containsKey(str) || (num = f22129K.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m25867a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (concurrentHashMap = f22130L) != null && !concurrentHashMap.containsKey(str)) {
            f22130L.put(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo61284b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (this.f22140H && (concurrentHashMap = f22130L) != null && !concurrentHashMap.containsKey(mo61276a())) {
            f22130L.remove(mo61276a());
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C8388a.m23845e().mo56913g() != null) {
            C8416i a = C8416i.m23982a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            C8460e eVar = new C8460e();
            eVar.mo57715a(System.currentTimeMillis());
            eVar.mo57718b(str);
            eVar.mo57716a(campaignEx.getId());
            a.mo57026a(eVar);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$d */
    /* compiled from: RewardVideoController */
    private final class C9127d implements C9311h {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C9110a f22232b;

        /* renamed from: c */
        private int f22233c;

        /* renamed from: d */
        private Handler f22234d;

        /* renamed from: e */
        private int f22235e;

        private C9127d(C9110a aVar, int i, Handler handler) {
            this.f22235e = 0;
            this.f22232b = aVar;
            this.f22233c = i;
            this.f22234d = handler;
        }

        /* renamed from: a */
        public final void mo61307a() {
            boolean unused = C9110a.this.f22142J = false;
            try {
                if (this.f22232b != null) {
                    boolean unused2 = this.f22232b.f22140H = true;
                    if (this.f22232b.f22162j != null) {
                        this.f22232b.f22162j.f22397b = "";
                    }
                    C8498b.m24359a().execute(new Runnable(this.f22233c) {

                        /* renamed from: a */
                        final /* synthetic */ int f22215a;

                        {
                            this.f22215a = r2;
                        }

                        public final void run() {
                            try {
                                if (C9110a.this.f22145O == null) {
                                    C8414g unused = C9110a.this.f22145O = C8414g.m23969a(C8388a.m23845e().mo56913g());
                                }
                                C8415h a = C8415h.m23977a((C8412f) C9110a.this.f22145O);
                                if (a != null) {
                                    a.mo57024a(C9110a.this.f22168p);
                                }
                            } catch (Throwable unused2) {
                                C8672v.m24878d("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                            if (this.f22215a == 1) {
                                Context m = C9110a.this.f22160h;
                                C8614ab.m24712a(m, C9110a.this.f22171s + "_" + this.f22215a, Integer.valueOf(C9110a.this.f22161i + 1));
                            }
                        }
                    });
                    if (C9110a.this.f22134B) {
                        C9110a.m25898j(C9110a.this);
                    }
                    if (this.f22232b.f22165m != null) {
                        this.f22232b.f22165m.onAdShow(C9110a.this.f22169q);
                        this.f22235e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo61312a(boolean z, C9630c cVar) {
            try {
                if (this.f22232b != null && this.f22232b.f22165m != null) {
                    if (cVar == null) {
                        cVar = C9630c.m27342b(this.f22232b.f22172t);
                    }
                    if (C9110a.this.f22134B) {
                        C9110a.m25898j(C9110a.this);
                        C9110a.this.mo61284b();
                        C8473d.m24288d(C9110a.this.f22168p, C9110a.this.mo61276a());
                    }
                    this.f22232b.f22165m.onAdClose(C9110a.this.f22169q, new RewardInfo(z, cVar.mo63524a(), String.valueOf(cVar.mo63527b())));
                    this.f22235e = 7;
                    boolean unused = this.f22232b.f22140H = false;
                    C9110a.this.f22139G.clear();
                    this.f22232b = null;
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0073 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo61309a(java.lang.String r12) {
            /*
                r11 = this;
                r0 = 0
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x008f }
                boolean unused = r1.f22142J = r0     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.a.a r1 = r11.f22232b     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0099
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x008f }
                boolean r1 = r1.f22134B     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0017
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.p342a.C9110a.m25898j(r1)     // Catch:{ Exception -> 0x008f }
            L_0x0017:
                com.mbridge.msdk.reward.a.a r1 = r11.f22232b     // Catch:{ Exception -> 0x008f }
                boolean unused = r1.f22140H = r0     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.a.a r1 = r11.f22232b     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.videocommon.listener.InterVideoOutListener r1 = r1.f22165m     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0099
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0073 }
                java.util.concurrent.CopyOnWriteArrayList r1 = r1.f22153W     // Catch:{ Exception -> 0x0073 }
                if (r1 == 0) goto L_0x0073
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0073 }
                java.util.concurrent.CopyOnWriteArrayList r1 = r1.f22153W     // Catch:{ Exception -> 0x0073 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0073 }
                if (r1 <= 0) goto L_0x0073
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0073 }
                java.util.concurrent.CopyOnWriteArrayList r1 = r1.f22153W     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0073 }
                r2 = r1
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0073 }
                android.content.Context r3 = r1.mo56913g()     // Catch:{ Exception -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
                r1.<init>()     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = "show failed: "
                r1.append(r4)     // Catch:{ Exception -> 0x0073 }
                r1.append(r12)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0073 }
                java.lang.String r5 = r1.f22168p     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0073 }
                boolean r6 = r1.f22134B     // Catch:{ Exception -> 0x0073 }
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r9 = 0
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0073 }
            L_0x0073:
                com.mbridge.msdk.reward.a.a r1 = r11.f22232b     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.videocommon.listener.InterVideoOutListener r1 = r1.f22165m     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.reward.a.a r2 = com.mbridge.msdk.reward.p342a.C9110a.this     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.out.MBridgeIds r2 = r2.f22169q     // Catch:{ Exception -> 0x0083 }
                r1.onShowFail(r2, r12)     // Catch:{ Exception -> 0x0083 }
                goto L_0x008b
            L_0x0083:
                r12 = move-exception
                boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x008b
                r12.printStackTrace()     // Catch:{ Exception -> 0x008f }
            L_0x008b:
                r12 = 4
                r11.f22235e = r12     // Catch:{ Exception -> 0x008f }
                goto L_0x0099
            L_0x008f:
                r12 = move-exception
                r11.f22235e = r0
                boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r0 == 0) goto L_0x0099
                r12.printStackTrace()
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342a.C9110a.C9127d.mo61309a(java.lang.String):void");
        }

        /* renamed from: a */
        public final void mo61313a(boolean z, String str, String str2) {
            try {
                if (this.f22232b != null && this.f22232b.f22165m != null) {
                    if (C9110a.this.f22134B) {
                        C9110a.m25898j(C9110a.this);
                    }
                    boolean unused = this.f22232b.f22140H = false;
                    try {
                        this.f22232b.f22165m.onVideoAdClicked(z, C9110a.this.f22169q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo61310a(String str, String str2) {
            try {
                if (this.f22232b != null && this.f22232b.f22165m != null) {
                    try {
                        this.f22232b.f22165m.onVideoComplete(C9110a.this.f22169q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f22235e = 5;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo61311a(boolean z, int i) {
            try {
                if (this.f22232b != null && this.f22232b.f22165m != null) {
                    try {
                        this.f22232b.f22165m.onAdCloseWithIVReward(C9110a.this.f22169q, new RewardInfo(z, i));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void mo61314b(String str, String str2) {
            try {
                if (this.f22232b != null && this.f22232b.f22165m != null) {
                    try {
                        this.f22232b.f22165m.onEndcardShow(C9110a.this.f22169q);
                        C2470b a = C2470b.m6168a();
                        a.mo16430c(str2 + "_" + 2, 2);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f22235e = 6;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo61308a(int i, String str, String str2) {
            this.f22235e = i;
            C9110a aVar = this.f22232b;
            if (aVar != null && !aVar.f22134B && !this.f22232b.f22133A && this.f22232b.f22163k != null && this.f22232b.f22163k.mo63605s(this.f22235e) && this.f22232b.f22166n != null && this.f22232b.f22166n.f22227c.get() != 1 && this.f22232b.f22166n.f22227c.get() != 3 && !C9110a.this.f22139G.contains(Integer.valueOf(this.f22235e))) {
                C9110a.this.f22139G.add(Integer.valueOf(this.f22235e));
                int z = this.f22232b.f22163k.mo63617z() * 1000;
                if (this.f22235e == 4) {
                    z = 3000;
                }
                Handler handler = this.f22234d;
                if (handler != null) {
                    handler.removeMessages(1001001);
                    this.f22234d.sendEmptyMessageDelayed(1001001, (long) z);
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        if (C9127d.this.f22232b != null) {
                            C9127d.this.f22232b.mo61288d(false);
                        }
                    }
                }, (long) z);
            }
        }
    }

    /* renamed from: a */
    public final void mo61279a(InterVideoOutListener interVideoOutListener) {
        this.f22165m = interVideoOutListener;
        this.f22166n = new C9126c(interVideoOutListener, this.f22174v, this.f22168p);
    }

    /* renamed from: b */
    public final void mo61285b(String str, String str2) {
        List<CampaignEx> a;
        try {
            this.f22160h = C8388a.m23845e().mo56913g();
            this.f22168p = str2;
            this.f22171s = str;
            this.f22169q = new MBridgeIds(this.f22171s, this.f22168p);
            this.f22164l = C9638b.m27377a().mo63556b();
            C8498b.m24360b().execute(new Runnable() {
                public final void run() {
                    if (C9110a.this.f22160h != null && !TextUtils.isEmpty(C9110a.this.f22168p)) {
                        try {
                            C9176a.m26118a(C9110a.this.f22160h, C9110a.this.f22168p);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
            C8666t.m24864b();
            C9667j.m27573a().mo63686b();
            C9661h.m27556a().mo63675b();
            C9638b.m27377a().mo63557b(this.f22168p);
            if (!TextUtils.isEmpty(this.f22168p) && (a = C9627a.m27316a().mo63504a(this.f22168p, 1)) != null && a.size() > 0) {
                C9645c.getInstance().createUnitCache(this.f22160h, this.f22168p, a, 94, (C9673a) null);
            }
            if (this.f22145O == null) {
                this.f22145O = C8414g.m23969a(C8388a.m23845e().mo56913g());
            }
        } catch (Throwable th) {
            C8672v.m24875a("RewardVideoController", th.getMessage(), th);
        }
    }

    /* renamed from: d */
    public final void mo61288d(boolean z) {
        mo61283a(z, "");
    }

    /* renamed from: c */
    private void m25879c() {
        C8410e.m23925a((C8412f) C8414g.m23969a(this.f22160h)).mo56986a(this.f22168p);
    }

    /* renamed from: d */
    private void m25883d() {
        try {
            List<CampaignEx> b = C8410e.m23925a((C8412f) C8414g.m23969a(this.f22160h)).mo57000b(this.f22168p);
            if (b != null && b.size() > 0) {
                for (CampaignEx next : b) {
                    if (!TextUtils.isEmpty(next.getCMPTEntryUrl())) {
                        C9625a.m27306b(this.f22168p + "_" + next.getRequestId() + "_" + next.getCMPTEntryUrl());
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57576e())) {
                            C9625a.m27306b(this.f22168p + "_" + next.getId() + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57576e());
                        }
                    } else {
                        C9625a.m27304b(next.getAdType(), next);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:72|73|74|(1:78)|79|80|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25950a(r13.f22166n, "load exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d1 */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d5 A[Catch:{ Exception -> 0x01db }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61283a(boolean r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "load exception"
            com.mbridge.msdk.reward.a.a$c r1 = r13.f22166n
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0045
            com.mbridge.msdk.reward.a.a$c r1 = r13.f22166n
            int r1 = r1.f22227c.get()
            if (r1 != r2) goto L_0x0045
            boolean r15 = r13.f22137E
            if (r15 == 0) goto L_0x0040
            if (r14 == 0) goto L_0x0044
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W
            if (r14 == 0) goto L_0x0038
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0038
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W
            java.lang.Object r14 = r14.get(r3)
            r0 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            android.content.Context r1 = r13.f22160h
            java.lang.String r3 = r13.f22168p
            boolean r4 = r13.f22134B
            java.lang.String r2 = "current unit is loading"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            com.mbridge.msdk.reward.p343b.C9176a.m26124b(r0, r1, r2, r3, r4, r5, r6)
        L_0x0038:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n
            java.lang.String r15 = "errorCode: 3501 errorMessage: current unit is loading"
            r14.m25952a((java.lang.String) r15)
            goto L_0x0044
        L_0x0040:
            if (r14 == 0) goto L_0x0044
            r13.f22137E = r14
        L_0x0044:
            return
        L_0x0045:
            com.mbridge.msdk.reward.a.a$c r1 = r13.f22166n
            if (r1 == 0) goto L_0x0055
            com.mbridge.msdk.reward.a.a$c r1 = r13.f22166n
            int r1 = r1.f22227c.get()
            r4 = 3
            if (r1 != r4) goto L_0x0055
            r13.f22146P = r3
            goto L_0x005c
        L_0x0055:
            r13.f22146P = r2
            com.mbridge.msdk.reward.a.a$c r1 = r13.f22166n
            r1.f22227c.set(r2)
        L_0x005c:
            r13.f22137E = r14
            android.os.Handler r1 = r13.f22174v
            r2 = 1001001(0xf4629, float:1.402701E-39)
            r1.removeMessages(r2)
            r13.f22149S = r3
            r13.f22148R = r3
            r13.f22150T = r3
            r13.f22151U = r3
            r13.m25883d()
            r13.m25879c()
            com.mbridge.msdk.reward.adapter.C9133c.m25977a()
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x0098
            boolean r1 = r13.f22133A     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x008d
            com.mbridge.msdk.d.b r1 = com.mbridge.msdk.p219d.C6802b.getInstance()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f22171s     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            r1.addInterstitialList(r2, r4)     // Catch:{ Exception -> 0x01db }
            goto L_0x0098
        L_0x008d:
            com.mbridge.msdk.d.b r1 = com.mbridge.msdk.p219d.C6802b.getInstance()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f22171s     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            r1.addRewardList(r2, r4)     // Catch:{ Exception -> 0x01db }
        L_0x0098:
            boolean r1 = r13.f22134B     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x00d2
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x00d2
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00d1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00ca
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01db }
            if (r14 <= 0) goto L_0x00ca
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x01db }
            r4 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01db }
            android.content.Context r5 = r13.f22160h     // Catch:{ Exception -> 0x01db }
            java.lang.String r6 = "bidToken is empty"
            java.lang.String r7 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            boolean r8 = r13.f22134B     // Catch:{ Exception -> 0x01db }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            com.mbridge.msdk.reward.p343b.C9176a.m26124b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01db }
        L_0x00ca:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            java.lang.String r15 = "bidToken is empty"
            com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25956c(r14, r15)     // Catch:{ Exception -> 0x01db }
        L_0x00d1:
            return
        L_0x00d2:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.mbridge.msdk.system.C9196a.f22581a     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0106
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x0105
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00fe
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01db }
            if (r14 <= 0) goto L_0x00fe
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f22153W     // Catch:{ Exception -> 0x01db }
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x01db }
            r4 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01db }
            android.content.Context r5 = r13.f22160h     // Catch:{ Exception -> 0x01db }
            java.lang.String r6 = "init error"
            java.lang.String r7 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            boolean r8 = r13.f22134B     // Catch:{ Exception -> 0x01db }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            com.mbridge.msdk.reward.p343b.C9176a.m26124b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01db }
        L_0x00fe:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            java.lang.String r15 = "init error"
            com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25956c(r14, r15)     // Catch:{ Exception -> 0x01db }
        L_0x0105:
            return
        L_0x0106:
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.c r1 = r1.mo63550a(r2, r4)     // Catch:{ Exception -> 0x01db }
            r13.f22163k = r1     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0154
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r1 = r1.mo56914h()     // Catch:{ Exception -> 0x01db }
            r13.f22144N = r1     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f22144N     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r4.mo56916j()     // Catch:{ Exception -> 0x01db }
            java.lang.String r5 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.reward.a.a$3 r6 = new com.mbridge.msdk.reward.a.a$3     // Catch:{ Exception -> 0x01db }
            r6.<init>()     // Catch:{ Exception -> 0x01db }
            r1.mo63554a(r2, r4, r5, r6)     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f22168p     // Catch:{ Exception -> 0x01db }
            boolean r5 = r13.f22133A     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.c r1 = r1.mo63551a((java.lang.String) r2, (java.lang.String) r4, (boolean) r5)     // Catch:{ Exception -> 0x01db }
            r13.f22163k = r1     // Catch:{ Exception -> 0x01db }
        L_0x0154:
            java.lang.String r1 = r13.f22171s     // Catch:{ Exception -> 0x01db }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0163
            com.mbridge.msdk.videocommon.d.c r1 = r13.f22163k     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f22171s     // Catch:{ Exception -> 0x01db }
            r1.mo63571b((java.lang.String) r2)     // Catch:{ Exception -> 0x01db }
        L_0x0163:
            com.mbridge.msdk.videocommon.d.c r1 = r13.f22163k     // Catch:{ Exception -> 0x01db }
            int r1 = r1.mo63563E()     // Catch:{ Exception -> 0x01db }
            int r1 = r1 * 1000
            android.os.Handler r2 = r13.f22174v     // Catch:{ Exception -> 0x01db }
            if (r2 == 0) goto L_0x0178
            android.os.Handler r2 = r13.f22174v     // Catch:{ Exception -> 0x01db }
            r4 = 1001002(0xf462a, float:1.402703E-39)
            long r5 = (long) r1     // Catch:{ Exception -> 0x01db }
            r2.sendEmptyMessageDelayed(r4, r5)     // Catch:{ Exception -> 0x01db }
        L_0x0178:
            com.mbridge.msdk.videocommon.d.c r1 = r13.f22163k     // Catch:{ Exception -> 0x01db }
            java.util.Queue r1 = r1.mo63559A()     // Catch:{ Exception -> 0x01db }
            r13.f22143M = r1     // Catch:{ Exception -> 0x01db }
            boolean r1 = r13.m25890f()     // Catch:{ Exception -> 0x018a }
            if (r1 == 0) goto L_0x0192
            r13.m25886e()     // Catch:{ Exception -> 0x018a }
            goto L_0x0192
        L_0x018a:
            r1 = move-exception
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01db }
            if (r2 == 0) goto L_0x0192
            r1.printStackTrace()     // Catch:{ Exception -> 0x01db }
        L_0x0192:
            r13.m25875b((boolean) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0221
        L_0x0197:
            r14 = move-exception
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f22153W     // Catch:{ Exception -> 0x01d1 }
            if (r15 == 0) goto L_0x01d1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f22153W     // Catch:{ Exception -> 0x01d1 }
            int r15 = r15.size()     // Catch:{ Exception -> 0x01d1 }
            if (r15 <= 0) goto L_0x01d1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f22153W     // Catch:{ Exception -> 0x01d1 }
            java.lang.Object r15 = r15.get(r3)     // Catch:{ Exception -> 0x01d1 }
            r4 = r15
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01d1 }
            android.content.Context r5 = r13.f22160h     // Catch:{ Exception -> 0x01d1 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d1 }
            r15.<init>()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "load exception: "
            r15.append(r1)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ Exception -> 0x01d1 }
            r15.append(r14)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r7 = r13.f22168p     // Catch:{ Exception -> 0x01d1 }
            boolean r8 = r13.f22134B     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r11 = 0
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01d1 }
        L_0x01d1:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25950a((com.mbridge.msdk.reward.p342a.C9110a.C9126c) r14, (java.lang.String) r0)     // Catch:{ Exception -> 0x01db }
            goto L_0x0221
        L_0x01db:
            r14 = move-exception
            com.mbridge.msdk.reward.a.a$c r15 = r13.f22166n
            if (r15 == 0) goto L_0x021a
            com.mbridge.msdk.reward.a.a$c r15 = r13.f22166n
            com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25950a((com.mbridge.msdk.reward.p342a.C9110a.C9126c) r15, (java.lang.String) r0)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f22153W
            if (r15 == 0) goto L_0x021a
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x021a
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f22153W
            java.lang.Object r15 = r15.get(r3)
            r0 = r15
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            android.content.Context r1 = r13.f22160h
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "load exception "
            r15.append(r2)
            java.lang.String r2 = r14.getMessage()
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            java.lang.String r3 = r13.f22168p
            boolean r4 = r13.f22134B
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            com.mbridge.msdk.reward.p343b.C9176a.m26124b(r0, r1, r2, r3, r4, r5, r6)
        L_0x021a:
            boolean r15 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r15 == 0) goto L_0x0221
            r14.printStackTrace()
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342a.C9110a.mo61283a(boolean, java.lang.String):void");
    }

    /* renamed from: b */
    private void m25875b(boolean z, String str) {
        if (this.f22166n == null) {
            return;
        }
        if (!this.f22134B) {
            this.f22152V = m25877b(this.f22168p);
            if (!this.f22152V) {
                this.f22152V = false;
                C9154d dVar = this.f22162j;
                if (dVar != null) {
                    dVar.mo61343a((List<CampaignEx>) this.f22153W);
                }
                this.f22166n.mo61306a(this.f22134B);
                m25868a(this.f22143M, z, str);
            } else if (!m25899j()) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22153W;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    C9126c.m25957c(this.f22166n, this.f22171s, this.f22168p);
                    CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                    this.f22166n.mo61306a(this.f22134B);
                    C9154d dVar2 = this.f22162j;
                    if (dVar2 == null || !dVar2.mo61344a((List<CampaignEx>) copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                        m25869a(copyOnWriteArrayList, this.f22162j);
                    } else {
                        C9176a.m26120a(this.f22160h, this.f22153W, this.f22168p, 0);
                        C9126c.m25955b(this.f22166n, this.f22171s, this.f22168p);
                    }
                    if (this.f22146P) {
                        C9154d dVar3 = this.f22162j;
                        if (dVar3 != null) {
                            dVar3.mo61343a((List<CampaignEx>) this.f22153W);
                        }
                        m25868a(this.f22143M, z, str);
                    }
                }
            } else {
                this.f22152V = false;
                C9154d dVar4 = this.f22162j;
                if (dVar4 != null) {
                    dVar4.mo61343a((List<CampaignEx>) this.f22153W);
                }
                this.f22166n.mo61306a(this.f22134B);
                m25868a(this.f22143M, z, str);
            }
        } else {
            List<CampaignEx> a = C9627a.m27316a().mo63506a(this.f22168p, 1, this.f22134B, "");
            if (a == null || a.size() <= 0) {
                if (!m25899j()) {
                    this.f22152V = false;
                    this.f22166n.mo61306a(this.f22134B);
                    m25868a(this.f22143M, z, str);
                    return;
                }
                C9627a.m27316a().mo63511a(this.f22168p, str);
                if (z && this.f22166n != null) {
                    C9126c.m25956c(this.f22166n, "checkOverCap failed");
                }
            } else if (!m25899j()) {
                CopyOnWriteArrayList<CampaignEx> b = m25874b(str, a);
                if (b == null || b.size() <= 0) {
                    CopyOnWriteArrayList<CampaignEx> a2 = m25862a(str, a);
                    if (a2 != null && a2.size() > 0) {
                        m25870a(a2, str);
                        C8407b.m23908a(C8388a.m23845e().mo56913g()).mo56971a(str, (List<CampaignEx>) a2);
                        C9154d dVar5 = this.f22162j;
                        if (dVar5 != null) {
                            dVar5.mo61343a((List<CampaignEx>) a2);
                        }
                    }
                    this.f22152V = false;
                    this.f22166n.mo61306a(this.f22134B);
                    m25868a(this.f22143M, z, str);
                    return;
                }
                m25870a(b, str);
            } else {
                C9627a.m27316a().mo63511a(this.f22168p, str);
                if (z && this.f22166n != null) {
                    C9126c.m25956c(this.f22166n, "checkOverCap failed");
                }
            }
        }
    }

    /* renamed from: a */
    private void m25870a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str) {
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            this.f22152V = true;
            this.f22166n.mo61306a(this.f22134B);
            C9126c.m25957c(this.f22166n, this.f22171s, this.f22168p);
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            m25867a(campaignEx.getRequestId(), str);
            C9154d dVar = this.f22162j;
            if (dVar == null || !dVar.mo61344a((List<CampaignEx>) copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                m25869a(copyOnWriteArrayList, this.f22162j);
                return;
            }
            C9176a.m26120a(this.f22160h, this.f22153W, this.f22168p, 0);
            C9126c.m25955b(this.f22166n, this.f22171s, this.f22168p);
        }
    }

    /* renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> m25862a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i = 1;
                    for (CampaignEx next : list) {
                        if (next != null) {
                            if (next.getVcn() > i) {
                                i = next.getVcn();
                            }
                            if (next.getTokenRule() == 1) {
                                String requestId = next.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        ((List) linkedHashMap.get(requestId)).add(next);
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(next);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = next.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        ((List) linkedHashMap2.get(requestId2)).add(next);
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(next);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (!(linkedHashMap2.size() + linkedHashMap.size() < i || linkedHashMap.size() <= 0 || linkedHashMap.entrySet() == null || linkedHashMap.entrySet().iterator() == null || linkedHashMap.entrySet().iterator().next() == null || ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() == null)) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        C8473d.m24280a(this.f22168p, str, i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: b */
    private CopyOnWriteArrayList<CampaignEx> m25874b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx next : list) {
                if (next != null && str.equals(next.getBidToken())) {
                    copyOnWriteArrayList.add(next);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: a */
    private void m25869a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C9154d dVar) {
        final CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        final int nscpt = campaignEx.getNscpt();
        this.f22155c = false;
        this.f22156d = false;
        this.f22157e = false;
        this.f22158f = false;
        this.f22159g = false;
        C9133c a = C9133c.m25977a();
        Context context = this.f22160h;
        boolean z2 = this.f22134B;
        final boolean z3 = z;
        final CampaignEx campaignEx2 = campaignEx;
        final C9154d dVar2 = dVar;
        final int i = nscpt;
        int i2 = nscpt;
        final boolean z4 = z;
        CampaignEx campaignEx3 = campaignEx;
        a.mo61320a(context, z, nscpt, z2, this.f22133A ? 287 : 94, this.f22171s, this.f22168p, campaignEx.getRequestId(), copyOnWriteArrayList, new C9133c.C9140c() {
            /* renamed from: a */
            public final void mo61294a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
                String str4 = str2;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
                C9110a.this.f22155c = true;
                if (!z3) {
                    Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        final CampaignEx next = it.next();
                        if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo57576e()) || next.getRewardTemplateMode().mo57576e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C9110a.this.f22174v == null) {
                            C9154d dVar = dVar2;
                            if (dVar == null || !dVar.mo61344a((List<CampaignEx>) copyOnWriteArrayList2, z3, i)) {
                                String str5 = str;
                                C9110a aVar = C9110a.this;
                                C9110a.m25865a(aVar, str4, aVar.f22154X);
                                if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                    C9110a.this.f22158f = true;
                                    C8672v.m24874a("RewardVideoController", "Cache onVideoLoadFailForCache");
                                    if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                        C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), C9110a.this.f22160h, "have no temp but isReady false", C9110a.this.f22168p, C9110a.this.f22134B, str3, next.getRequestIdNotice());
                                    }
                                    C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                }
                            } else if (C9110a.this.f22166n != null && !C9110a.this.f22159g) {
                                C9110a.this.f22159g = true;
                                C8672v.m24874a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                C9176a.m26120a(C9110a.this.f22160h, copyOnWriteArrayList2, C9110a.this.f22168p, 0);
                                C9126c.m25955b(C9110a.this.f22166n, str, str4);
                            }
                        } else {
                            final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = copyOnWriteArrayList;
                            final String str6 = str;
                            final String str7 = str2;
                            final String str8 = str3;
                            C9110a.this.f22174v.post(new Runnable() {
                                public final void run() {
                                    C9133c a = C9133c.m25977a();
                                    boolean r = C9110a.this.f22138F;
                                    Handler q = C9110a.this.f22174v;
                                    boolean p = C9110a.this.f22133A;
                                    boolean i = C9110a.this.f22134B;
                                    String e = next.getRewardTemplateMode().mo57576e();
                                    int s = C9110a.this.f22175w;
                                    CampaignEx campaignEx = campaignEx2;
                                    CopyOnWriteArrayList copyOnWriteArrayList = copyOnWriteArrayList3;
                                    String b = C9652g.m27539a().mo63670b(next.getRewardTemplateMode().mo57576e());
                                    String str = str6;
                                    String str2 = str7;
                                    String str3 = str8;
                                    String requestIdNotice = next.getRequestIdNotice();
                                    C9640c l = C9110a.this.f22163k;
                                    C91161 r17 = r6;
                                    C91161 r6 = new C9133c.C9148j() {
                                        /* renamed from: a */
                                        public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                            if (dVar2 == null || !dVar2.mo61344a((List<CampaignEx>) copyOnWriteArrayList3, z3, i)) {
                                                C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                                if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                                    C9110a.this.f22158f = true;
                                                    if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                                        C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), C9110a.this.f22160h, "temp preload success but isReady false", C9110a.this.f22168p, C9110a.this.f22134B, str4, next.getRequestIdNotice());
                                                    }
                                                    C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                                }
                                            } else if (C9110a.this.f22166n != null && !C9110a.this.f22159g) {
                                                C9110a.this.f22159g = true;
                                                C9176a.m26120a(C9110a.this.f22160h, copyOnWriteArrayList3, C9110a.this.f22168p, 0);
                                                C9126c.m25955b(C9110a.this.f22166n, str2, str3);
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                            C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                            if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                                C9110a.this.f22158f = true;
                                                if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                                    Context m = C9110a.this.f22160h;
                                                    C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "temp preload failed: " + str6, C9110a.this.f22168p, C9110a.this.f22134B, str4, next.getRequestIdNotice());
                                                }
                                                C9126c d = C9110a.this.f22166n;
                                                C9126c.m25958d(d, "errorCode: 3301 errorMessage: temp preload failed: " + str6);
                                            }
                                        }
                                    };
                                    a.mo61321a(r, q, p, i, (WindVaneWebView) null, e, s, campaignEx, copyOnWriteArrayList, b, str, str2, str3, requestIdNotice, l, r17);
                                }
                            });
                        }
                        String str9 = str;
                    }
                    return;
                }
                String str10 = str;
                if (C9110a.this.f22156d && !C9110a.this.f22157e && C9110a.this.f22174v != null) {
                    C9110a.this.f22157e = true;
                    final String str11 = str3;
                    final String str12 = str;
                    final String str13 = str2;
                    final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = copyOnWriteArrayList;
                    C9110a.this.f22174v.post(new Runnable() {
                        public final void run() {
                            C9133c a = C9133c.m25977a();
                            boolean r = C9110a.this.f22138F;
                            Handler q = C9110a.this.f22174v;
                            boolean p = C9110a.this.f22133A;
                            boolean i = C9110a.this.f22134B;
                            String str = str11;
                            String requestIdNotice = campaignEx2.getRequestIdNotice();
                            String str2 = str12;
                            String str3 = str13;
                            String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                            int s = C9110a.this.f22175w;
                            CampaignEx campaignEx = campaignEx2;
                            CopyOnWriteArrayList copyOnWriteArrayList = copyOnWriteArrayList4;
                            String b = C9652g.m27539a().mo63670b(campaignEx2.getCMPTEntryUrl());
                            String str4 = str13;
                            C9133c cVar = a;
                            C9640c l = C9110a.this.f22163k;
                            C91181 r17 = r1;
                            C91181 r1 = new C9133c.C9148j() {
                                /* renamed from: a */
                                public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                    if (dVar2 == null || !dVar2.mo61344a((List<CampaignEx>) copyOnWriteArrayList4, z3, i)) {
                                        C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                        if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                            C9110a.this.f22158f = true;
                                            if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                                C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), C9110a.this.f22160h, "tpl temp preload success but isReady false", C9110a.this.f22168p, C9110a.this.f22134B, str4, campaignEx2.getRequestIdNotice());
                                            }
                                            C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                                        }
                                    } else if (C9110a.this.f22166n != null && !C9110a.this.f22159g) {
                                        C9110a.this.f22159g = true;
                                        C8672v.m24874a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                        C9176a.m26120a(C9110a.this.f22160h, copyOnWriteArrayList4, C9110a.this.f22168p, 0);
                                        C9126c.m25955b(C9110a.this.f22166n, str2, str3);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                    C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                    if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                        C9110a.this.f22158f = true;
                                        if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                            Context m = C9110a.this.f22160h;
                                            C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "tpl temp preload failed: " + str6, C9110a.this.f22168p, C9110a.this.f22134B, str4, campaignEx2.getRequestIdNotice());
                                        }
                                        C9126c d = C9110a.this.f22166n;
                                        C9126c.m25958d(d, "errorCode: 3302 errorMessage: tpl temp preload failed: " + str6);
                                    }
                                }
                            };
                            cVar.mo61322a(r, q, p, i, str, requestIdNotice, str2, str3, cMPTEntryUrl, s, campaignEx, copyOnWriteArrayList, b, str4, l, r17, true);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo61295a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str4) {
                C9110a.this.f22155c = false;
                C9110a aVar = C9110a.this;
                C9110a.m25865a(aVar, str2, aVar.f22154X);
                if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                    C9110a.this.f22158f = true;
                    if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                        Context m = C9110a.this.f22160h;
                        C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "" + str4, C9110a.this.f22168p, C9110a.this.f22134B, str3, campaignEx2.getRequestIdNotice());
                    }
                    C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3201 errorMessage: campaign resource download failed");
                }
            }
        }, new C9133c.C9147i() {
            /* renamed from: a */
            public final void mo61300a(String str, String str2, String str3, String str4) {
            }

            /* renamed from: a */
            public final void mo61301a(String str, String str2, String str3, String str4, String str5) {
                C9110a aVar = C9110a.this;
                C9110a.m25865a(aVar, str2, aVar.f22154X);
                if (z || C9110a.this.f22166n == null) {
                    if (nscpt == 1 && !C9110a.this.f22158f && C9110a.this.f22166n != null) {
                        C9110a.this.f22158f = true;
                        if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                            C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), C9110a.this.f22160h, "temp resource download failed", C9110a.this.f22168p, C9110a.this.f22134B, str3, campaignEx.getRequestIdNotice());
                        }
                        C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3202 errorMessage: temp resource download failed");
                    }
                } else if (!C9110a.this.f22158f) {
                    C9110a.this.f22158f = true;
                    if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                        Context m = C9110a.this.f22160h;
                        C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "" + str5, C9110a.this.f22168p, C9110a.this.f22134B, str3, campaignEx.getRequestIdNotice());
                    }
                    C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3202 errorMessage: temp resource download failed");
                }
            }
        });
        if (z4) {
            final CampaignEx campaignEx4 = campaignEx3;
            final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
            final C9154d dVar3 = dVar;
            final int i3 = i2;
            C9133c.m25977a().mo61319a(this.f22160h, campaignEx3, this.f22171s, this.f22168p, campaignEx3.getRequestId(), new C9133c.C9147i() {
                /* renamed from: a */
                public final void mo61300a(final String str, final String str2, final String str3, String str4) {
                    C9110a.this.f22156d = true;
                    if (C9110a.this.f22155c && !C9110a.this.f22157e && C9110a.this.f22174v != null) {
                        C9110a.this.f22157e = true;
                        C9110a.this.f22174v.post(new Runnable() {
                            public final void run() {
                                C9133c a = C9133c.m25977a();
                                boolean r = C9110a.this.f22138F;
                                Handler q = C9110a.this.f22174v;
                                boolean p = C9110a.this.f22133A;
                                boolean i = C9110a.this.f22134B;
                                String str = str3;
                                String requestIdNotice = campaignEx4.getRequestIdNotice();
                                String str2 = str;
                                String str3 = str2;
                                String cMPTEntryUrl = campaignEx4.getCMPTEntryUrl();
                                int s = C9110a.this.f22175w;
                                CampaignEx campaignEx = campaignEx4;
                                CopyOnWriteArrayList copyOnWriteArrayList = copyOnWriteArrayList2;
                                String b = C9652g.m27539a().mo63670b(campaignEx4.getCMPTEntryUrl());
                                String str4 = str2;
                                C9133c cVar = a;
                                C9640c l = C9110a.this.f22163k;
                                C91221 r17 = r1;
                                C91221 r1 = new C9133c.C9148j() {
                                    /* renamed from: a */
                                    public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                        if (!dVar3.mo61344a((List<CampaignEx>) copyOnWriteArrayList2, z4, i3)) {
                                            C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                            if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                                C9110a.this.f22158f = true;
                                                if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                                    C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), C9110a.this.f22160h, "tpl temp preload success but isReady false", C9110a.this.f22168p, C9110a.this.f22134B, str4, campaignEx4.getRequestIdNotice());
                                                }
                                                C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        } else if (C9110a.this.f22166n != null && !C9110a.this.f22159g) {
                                            C9110a.this.f22159g = true;
                                            C8672v.m24874a("RewardVideoController", "Cache onVideoLoadSuccess");
                                            C9176a.m26120a(C9110a.this.f22160h, copyOnWriteArrayList2, C9110a.this.f22168p, 0);
                                            C9126c.m25955b(C9110a.this.f22166n, str2, str3);
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                        C9110a.m25865a(C9110a.this, str3, C9110a.this.f22154X);
                                        if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                                            C9110a.this.f22158f = true;
                                            if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                                                Context m = C9110a.this.f22160h;
                                                C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "tpl temp preload failed: " + str6, C9110a.this.f22168p, C9110a.this.f22134B, str4, campaignEx4.getRequestIdNotice());
                                            }
                                            C9126c d = C9110a.this.f22166n;
                                            C9126c.m25958d(d, "errorCode: 3303 errorMessage: tpl temp preload failed: " + str6);
                                        }
                                    }
                                };
                                cVar.mo61322a(r, q, p, i, str, requestIdNotice, str2, str3, cMPTEntryUrl, s, campaignEx, copyOnWriteArrayList, b, str4, l, r17, true);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo61301a(String str, String str2, String str3, String str4, String str5) {
                    C9110a aVar = C9110a.this;
                    C9110a.m25865a(aVar, str2, aVar.f22154X);
                    C9110a.this.f22156d = false;
                    if (C9110a.this.f22166n != null && !C9110a.this.f22158f) {
                        C9110a.this.f22158f = true;
                        if (C9110a.this.f22153W != null && C9110a.this.f22153W.size() > 0) {
                            Context m = C9110a.this.f22160h;
                            C9176a.m26121a((CampaignEx) C9110a.this.f22153W.get(0), m, "" + str5, C9110a.this.f22168p, C9110a.this.f22134B, str3, campaignEx4.getRequestIdNotice());
                        }
                        C9126c.m25958d(C9110a.this.f22166n, "errorCode: 3203 errorMessage: tpl temp resource download failed");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m25877b(String str) {
        try {
            if (this.f22162j == null || !str.equals(this.f22162j.mo61334a())) {
                C9154d dVar = new C9154d(this.f22160h, this.f22171s, str);
                this.f22162j = dVar;
                dVar.mo61347b(this.f22133A);
                this.f22162j.mo61349c(this.f22134B);
            }
            this.f22162j.mo61336a(this.f22175w);
            this.f22162j.mo61341a(this.f22163k);
        } catch (Exception unused) {
        }
        List<CampaignEx> a = C9627a.m27316a().mo63505a(str, 1, this.f22134B);
        this.f22154X = C9627a.m27316a().mo63516b(str, 1, this.f22134B);
        if (a == null || a.size() <= 0) {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22153W;
            if (copyOnWriteArrayList == null) {
                return false;
            }
            copyOnWriteArrayList.clear();
            return false;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f22153W;
        if (copyOnWriteArrayList2 == null) {
            this.f22153W = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList2.clear();
        }
        this.f22153W.addAll(a);
        return true;
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$c */
    /* compiled from: RewardVideoController */
    private final class C9126c {

        /* renamed from: b */
        private WeakReference<InterVideoOutListener> f22226b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile AtomicInteger f22227c;

        /* renamed from: d */
        private Handler f22228d;

        /* renamed from: e */
        private String f22229e;

        /* renamed from: f */
        private boolean f22230f;

        private C9126c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f22226b = new WeakReference<>(interVideoOutListener);
            this.f22227c = new AtomicInteger(0);
            this.f22228d = handler;
            this.f22229e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m25952a(String str) {
            if (this.f22228d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.f22228d.sendMessage(obtain);
            }
        }

        /* renamed from: a */
        public final void mo61306a(boolean z) {
            this.f22230f = z;
        }

        /* renamed from: a */
        static /* synthetic */ void m25951a(C9126c cVar, String str, String str2) {
            Handler handler = cVar.f22228d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f22227c.get() == 1 || cVar.f22227c.get() == 3) && cVar.f22228d != null) {
                    cVar.f22227c.set(2);
                    if (!C9110a.this.f22149S) {
                        boolean unused = C9110a.this.f22149S = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f22228d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m25950a(C9126c cVar, String str) {
            Handler handler = cVar.f22228d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f22227c.get() == 1 || cVar.f22227c.get() == 3) && cVar.f22228d != null) {
                    boolean unused = C9110a.this.f22150T = true;
                    if (!C9110a.this.f22152V || str.contains("resource load timeout")) {
                        boolean unused2 = C9110a.this.f22151U = true;
                    }
                    if (C9110a.this.f22149S) {
                        cVar.f22227c.set(2);
                    }
                    if (C9110a.this.f22150T && C9110a.this.f22151U && !C9110a.this.f22149S) {
                        cVar.f22227c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f22228d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: b */
        static /* synthetic */ void m25955b(C9126c cVar, String str, String str2) {
            Handler handler = cVar.f22228d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f22227c.get() == 1 || cVar.f22227c.get() == 3) && cVar.f22228d != null) {
                    if (cVar.f22227c.get() == 1) {
                        cVar.f22227c.set(3);
                    }
                    if (!C9110a.this.f22149S) {
                        boolean unused = C9110a.this.f22149S = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f22228d.sendMessage(obtain);
                        if (C9110a.this.f22150T) {
                            cVar.f22227c.set(2);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        static /* synthetic */ void m25956c(C9126c cVar, String str) {
            cVar.f22227c.set(2);
            cVar.m25952a(str);
        }

        /* renamed from: c */
        static /* synthetic */ void m25957c(C9126c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null && cVar.f22228d != null && !C9110a.this.f22148R) {
                boolean unused = C9110a.this.f22148R = true;
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f22228d.sendMessage(obtain);
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m25958d(C9126c cVar, String str) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f22227c.get() == 1 || cVar.f22227c.get() == 3) && cVar.f22228d != null) {
                    boolean unused = C9110a.this.f22151U = true;
                    if (str.contains("resource load timeout")) {
                        boolean unused2 = C9110a.this.f22150T = true;
                    }
                    if (C9110a.this.f22151U && C9110a.this.f22150T && !C9110a.this.f22149S) {
                        cVar.f22227c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f22228d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m25959d(C9126c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f22226b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f22227c.get() == 1 || cVar.f22227c.get() == 3) && cVar.f22228d != null && !C9110a.this.f22148R) {
                    boolean unused = C9110a.this.f22148R = true;
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    cVar.f22228d.sendMessage(obtain);
                }
            }
        }
    }

    /* renamed from: e */
    private void m25886e() {
        try {
            List<C9629b> w = this.f22163k.mo63612w();
            if (w != null && w.size() > 0) {
                for (int i = 0; i < w.size(); i++) {
                    C8614ab.m24712a(this.f22160h, this.f22171s + "_" + w.get(i).mo63522a(), 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private boolean m25890f() {
        int i;
        try {
            List<C9629b> w = this.f22163k.mo63612w();
            if (this.f22164l == null) {
                this.f22164l = C9638b.m27377a().mo63556b();
            }
            Map<String, Integer> h = this.f22164l.mo63547h();
            if (w == null || w.size() <= 0) {
                return true;
            }
            for (int i2 = 0; i2 < w.size(); i2++) {
                C9629b bVar = w.get(i2);
                if (h.containsKey(bVar.mo63522a() + "")) {
                    i = h.get(bVar.mo63522a() + "").intValue();
                } else {
                    i = 0;
                }
                Object b = C8614ab.m24713b(this.f22160h, this.f22171s + "_" + bVar.mo63522a(), 0);
                if ((b != null ? ((Integer) b).intValue() : 0) < i) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            C8672v.m24878d("RewardVideoController", e.getMessage());
            return true;
        }
    }

    /* renamed from: a */
    private void m25868a(Queue<Integer> queue, boolean z, String str) {
        int i = 8;
        if (queue != null) {
            try {
                if (queue.size() > 0) {
                    i = queue.poll().intValue();
                }
            } catch (Exception e) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22153W;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    C9176a.m26124b(this.f22153W.get(0), this.f22160h, "can't show because unknow error", this.f22168p, this.f22134B, "", "");
                }
                m25880c("can't show because unknow error");
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        try {
            m25863a(1, i, z, str);
        } catch (Exception e2) {
            if (this.f22153W != null) {
                if (this.f22153W.size() > 0) {
                    Context context = this.f22160h;
                    C9176a.m26124b(this.f22153W.get(0), context, "load mv api error:" + e2.getMessage(), this.f22168p, this.f22134B, "", "");
                }
            }
            m25880c("load mv api error:" + e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25880c(String str) {
        if (this.f22166n != null) {
            this.f22151U = true;
            C9126c.m25950a(this.f22166n, str);
        }
    }

    /* renamed from: a */
    private void m25863a(int i, int i2, boolean z, String str) {
        try {
            if (this.f22162j == null || !this.f22168p.equals(this.f22162j.mo61334a())) {
                C9154d dVar = new C9154d(this.f22160h, this.f22171s, this.f22168p);
                this.f22162j = dVar;
                dVar.mo61347b(this.f22133A);
                this.f22162j.mo61349c(this.f22134B);
            }
            if (this.f22133A) {
                this.f22162j.mo61337a(this.f22176x, this.f22177y, this.f22178z);
            }
            this.f22162j.mo61336a(this.f22175w);
            this.f22162j.mo61341a(this.f22163k);
            C9124a aVar = new C9124a(this.f22162j, i, z);
            C9125b bVar = new C9125b(this.f22162j, z);
            bVar.mo61305a((Runnable) aVar);
            this.f22162j.mo61318a((C9132b) bVar);
            this.f22174v.postDelayed(aVar, (long) (i2 * 1000));
            this.f22162j.mo61339a(i, i2, z, str, this.f22138F);
        } catch (Exception e) {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22153W;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                C9176a.m26124b(this.f22153W.get(0), this.f22160h, e.getMessage(), this.f22168p, this.f22134B, "", "");
            }
            m25880c(e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r7 = r13.f22164l.mo63547h();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25884d(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "_"
            java.lang.String r2 = "RewardVideoController"
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 0
            com.mbridge.msdk.videocommon.d.a r7 = r13.f22164l     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0027
            com.mbridge.msdk.videocommon.d.a r7 = r13.f22164l     // Catch:{ Exception -> 0x015e }
            java.util.Map r7 = r7.mo63547h()     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0027
            boolean r8 = r7.containsKey(r0)     // Catch:{ Exception -> 0x015e }
            if (r8 == 0) goto L_0x0027
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x015e }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x015e }
            goto L_0x0028
        L_0x0027:
            r0 = r6
        L_0x0028:
            android.content.Context r7 = r13.f22160h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r8.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r13.f22171s     // Catch:{ Exception -> 0x015e }
            r8.append(r9)     // Catch:{ Exception -> 0x015e }
            r8.append(r1)     // Catch:{ Exception -> 0x015e }
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C8614ab.m24713b(r7, r8, r9)     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x006e
            android.content.Context r7 = r13.f22160h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r8.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r13.f22171s     // Catch:{ Exception -> 0x015e }
            r8.append(r9)     // Catch:{ Exception -> 0x015e }
            r8.append(r1)     // Catch:{ Exception -> 0x015e }
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C8614ab.m24713b(r7, r8, r9)     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x015e }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x015e }
            r13.f22161i = r7     // Catch:{ Exception -> 0x015e }
        L_0x006e:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            if (r7 != 0) goto L_0x0075
            r13.m25896i()     // Catch:{ Exception -> 0x015e }
        L_0x0075:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x00f5
            java.lang.String r7 = "controller 819"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r7)     // Catch:{ Exception -> 0x015e }
            boolean r7 = r13.f22134B     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0087
            boolean r7 = r13.m25893g()     // Catch:{ Exception -> 0x015e }
            goto L_0x008d
        L_0x0087:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            boolean r7 = r7.mo61348b()     // Catch:{ Exception -> 0x015e }
        L_0x008d:
            if (r7 == 0) goto L_0x00be
            int r1 = r13.f22161i     // Catch:{ Exception -> 0x015e }
            if (r1 < r0) goto L_0x0098
            if (r0 <= 0) goto L_0x0098
            r13.f22142J = r6     // Catch:{ Exception -> 0x015e }
            return
        L_0x0098:
            java.lang.String r0 = "invoke adapter show isReady"
            com.mbridge.msdk.foundation.tools.C8672v.m24876b(r2, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015e }
            android.os.Handler r11 = r13.f22174v     // Catch:{ Exception -> 0x015e }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015e }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f22132b     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = r13.f22168p     // Catch:{ Exception -> 0x015e }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.f22167o     // Catch:{ Exception -> 0x015e }
            int r11 = r13.f22175w     // Catch:{ Exception -> 0x015e }
            java.lang.String r12 = r13.f22170r     // Catch:{ Exception -> 0x015e }
            r8 = r0
            r9 = r14
            r7.mo61340a((com.mbridge.msdk.video.p347bt.module.p350b.C9311h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015e }
            return
        L_0x00be:
            boolean r0 = r13.f22134B     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r13.m25895h()     // Catch:{ Exception -> 0x015e }
            goto L_0x00cd
        L_0x00c7:
            com.mbridge.msdk.reward.adapter.d r0 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            boolean r0 = r0.mo61350c()     // Catch:{ Exception -> 0x015e }
        L_0x00cd:
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "invoke adapter show isSpareOfferReady"
            com.mbridge.msdk.foundation.tools.C8672v.m24876b(r2, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015e }
            android.os.Handler r11 = r13.f22174v     // Catch:{ Exception -> 0x015e }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015e }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f22132b     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = r13.f22168p     // Catch:{ Exception -> 0x015e }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f22162j     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.f22167o     // Catch:{ Exception -> 0x015e }
            int r11 = r13.f22175w     // Catch:{ Exception -> 0x015e }
            java.lang.String r12 = r13.f22170r     // Catch:{ Exception -> 0x015e }
            r8 = r0
            r9 = r14
            r7.mo61340a((com.mbridge.msdk.video.p347bt.module.p350b.C9311h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015e }
            return
        L_0x00f5:
            int r0 = r13.f22161i     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x011a
            android.content.Context r0 = r13.f22160h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r7.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r13.f22171s     // Catch:{ Exception -> 0x015e }
            r7.append(r8)     // Catch:{ Exception -> 0x015e }
            r7.append(r1)     // Catch:{ Exception -> 0x015e }
            r7.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.foundation.tools.C8614ab.m24712a(r0, r1, r7)     // Catch:{ Exception -> 0x015e }
            r13.m25884d((java.lang.String) r14)     // Catch:{ Exception -> 0x015e }
            return
        L_0x011a:
            r13.f22142J = r6     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f22165m     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x0132
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f22165m     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.out.MBridgeIds r0 = r13.f22169q     // Catch:{ Exception -> 0x012a }
            java.lang.String r1 = "can't show because load is failed"
            r14.onShowFail(r0, r1)     // Catch:{ Exception -> 0x012a }
            goto L_0x0132
        L_0x012a:
            r14 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x0132
            r14.printStackTrace()     // Catch:{ Exception -> 0x015e }
        L_0x0132:
            boolean r14 = r13.f22133A     // Catch:{ Exception -> 0x015e }
            if (r14 != 0) goto L_0x01aa
            boolean r14 = r13.f22134B     // Catch:{ Exception -> 0x015e }
            if (r14 != 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f22163k     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f22163k     // Catch:{ Exception -> 0x015e }
            boolean r14 = r14.mo63605s(r4)     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x015e }
            int r14 = r14.f22227c.get()     // Catch:{ Exception -> 0x015e }
            if (r14 == r5) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n     // Catch:{ Exception -> 0x015e }
            int r14 = r14.f22227c.get()     // Catch:{ Exception -> 0x015e }
            if (r14 == r3) goto L_0x01aa
            r13.mo61288d((boolean) r6)     // Catch:{ Exception -> 0x015e }
            goto L_0x01aa
        L_0x015e:
            r14 = move-exception
            r13.f22142J = r6
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = r14.getLocalizedMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
        L_0x016c:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f22165m
            if (r0 == 0) goto L_0x0181
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f22165m     // Catch:{ Exception -> 0x017a }
            com.mbridge.msdk.out.MBridgeIds r1 = r13.f22169q     // Catch:{ Exception -> 0x017a }
            java.lang.String r2 = "show exception"
            r0.onShowFail(r1, r2)     // Catch:{ Exception -> 0x017a }
            goto L_0x0181
        L_0x017a:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x0181
            r14.printStackTrace()
        L_0x0181:
            boolean r14 = r13.f22133A
            if (r14 != 0) goto L_0x01aa
            boolean r14 = r13.f22134B
            if (r14 != 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f22163k
            if (r14 == 0) goto L_0x01aa
            boolean r14 = r14.mo63605s(r4)
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n
            int r14 = r14.f22227c.get()
            if (r14 == r5) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f22166n
            int r14 = r14.f22227c.get()
            if (r14 == r3) goto L_0x01aa
            r13.mo61288d((boolean) r6)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342a.C9110a.m25884d(java.lang.String):void");
    }

    /* renamed from: e */
    public final boolean mo61289e(boolean z) {
        try {
            if (m25899j()) {
                return false;
            }
            if (this.f22134B) {
                try {
                    return m25893g();
                } catch (Exception unused) {
                    return false;
                }
            } else {
                if (this.f22162j == null) {
                    m25896i();
                }
                if (this.f22162j == null) {
                    return false;
                }
                boolean b = this.f22162j.mo61348b();
                return !b ? this.f22162j.mo61350c() : b;
            }
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    private boolean m25893g() {
        if (this.f22162j == null) {
            m25896i();
        }
        List<C8457b> a = C9627a.m27316a().mo63503a(this.f22168p);
        boolean z = false;
        if (a == null || a.size() <= 0) {
            return false;
        }
        String c = C8473d.m24286c(this.f22168p);
        if (!TextUtils.isEmpty(c)) {
            z = m25872a(a, c);
        }
        if (z) {
            return z;
        }
        for (C8457b next : a) {
            if (next != null) {
                this.f22162j.mo61342a(next.mo57675b());
                if (this.f22162j.mo61348b()) {
                    return true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m25872a(List<C8457b> list, String str) {
        if (list == null) {
            return false;
        }
        for (C8457b next : list) {
            if (next != null && str.equals(next.mo57670a())) {
                this.f22162j.mo61342a(next.mo57675b());
                if (this.f22162j.mo61348b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m25895h() {
        if (this.f22162j == null) {
            m25896i();
        }
        List<C8457b> a = C9627a.m27316a().mo63503a(this.f22168p);
        if (a == null || a.size() <= 0) {
            return false;
        }
        for (C8457b next : a) {
            if (next != null) {
                this.f22162j.mo61342a(next.mo57675b());
                if (this.f22162j.mo61350c()) {
                    return true;
                }
                C9627a.m27316a().mo63519b(this.f22168p, next.mo57675b());
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m25896i() {
        C9154d dVar = new C9154d(this.f22160h, this.f22171s, this.f22168p);
        this.f22162j = dVar;
        dVar.mo61347b(this.f22133A);
        this.f22162j.mo61349c(this.f22134B);
        if (this.f22133A) {
            this.f22162j.mo61337a(this.f22176x, this.f22177y, this.f22178z);
        }
        this.f22162j.mo61341a(this.f22163k);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:148|149|193) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0104, code lost:
        if (r6.f22166n == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x010c, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 1) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0114, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 3) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0116, code lost:
        mo61283a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x011b, code lost:
        r6.f22142J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0122, code lost:
        if (m25899j() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0126, code lost:
        if (r6.f22165m == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r6.f22165m.onShowFail(r6.f22169q, "Play more than limit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0132, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0135, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0137, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x013c, code lost:
        if (r6.f22133A != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0140, code lost:
        if (r6.f22134B != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0144, code lost:
        if (r6.f22163k == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x014c, code lost:
        if (r6.f22163k.mo63605s(4) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0150, code lost:
        if (r6.f22166n == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0158, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0160, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 3) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0162, code lost:
        mo61283a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0167, code lost:
        r6.f22142J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0170, code lost:
        if (android.text.TextUtils.isEmpty(r6.f22167o) == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0172, code lost:
        r6.f22167o = com.mbridge.msdk.foundation.tools.C8660r.m24832k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r8 = new java.text.SimpleDateFormat("dd").format(new java.util.Date());
        r9 = (java.lang.String) com.mbridge.msdk.foundation.tools.C8614ab.m24713b(r6.f22160h, "reward_date", "0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0198, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x019e, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01a4, code lost:
        if (r9.equals(r8) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a6, code lost:
        com.mbridge.msdk.foundation.tools.C8614ab.m24712a(r6.f22160h, "reward_date", r8);
        r8 = r6.f22160h;
        com.mbridge.msdk.foundation.tools.C8614ab.m24712a(r8, r6.f22171s + "_" + 1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        m25884d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        if (r6.f22166n == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25953b(r6.f22166n).get() != 1) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r6.f22165m == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.f22165m.onShowFail(r6.f22169q, "campaing is loading");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        if (r6.f22133A != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
        if (r6.f22134B != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        if (r6.f22163k == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        if (r6.f22163k.mo63605s(4) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0068, code lost:
        if (r6.f22166n == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 3) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        mo61283a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
        r6.f22142J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0084, code lost:
        if (r6.f22160h != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0088, code lost:
        if (r6.f22165m == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r6.f22165m.onShowFail(r6.f22169q, "context is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0099, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009e, code lost:
        if (r6.f22133A != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a2, code lost:
        if (r6.f22134B != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a6, code lost:
        if (r6.f22163k == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if (r6.f22163k.mo63605s(4) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b2, code lost:
        if (r6.f22166n == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ba, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c2, code lost:
        if (com.mbridge.msdk.reward.p342a.C9110a.C9126c.m25948a(r6.f22166n) == 3) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c4, code lost:
        mo61283a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c9, code lost:
        r6.f22142J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ce, code lost:
        if (r6.f22133A == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d6, code lost:
        if (com.mbridge.msdk.foundation.tools.C8677z.m24933c(r6.f22160h) != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00da, code lost:
        if (r6.f22165m == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.f22165m.onShowFail(r6.f22169q, "network exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00e9, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00eb, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00f0, code lost:
        if (r6.f22133A != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00f4, code lost:
        if (r6.f22134B != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00f8, code lost:
        if (r6.f22163k == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0100, code lost:
        if (r6.f22163k.mo63605s(4) == false) goto L_0x011b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x01cc */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61280a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 3
            r1 = 4
            r2 = 1
            r3 = 0
            r6.f22172t = r7     // Catch:{ Exception -> 0x01d3 }
            r6.f22167o = r8     // Catch:{ Exception -> 0x01d3 }
            r6.f22170r = r9     // Catch:{ Exception -> 0x01d3 }
            java.lang.Object r8 = r6.f22141I     // Catch:{ Exception -> 0x01d3 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x01d3 }
            boolean r9 = r6.f22142J     // Catch:{ all -> 0x01d0 }
            if (r9 == 0) goto L_0x0029
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ all -> 0x01d0 }
            if (r7 == 0) goto L_0x0027
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x001f }
            com.mbridge.msdk.out.MBridgeIds r9 = r6.f22169q     // Catch:{ Exception -> 0x001f }
            java.lang.String r4 = "campaing is show progressing "
            r7.onShowFail(r9, r4)     // Catch:{ Exception -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r7 = move-exception
            boolean r9 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01d0 }
            if (r9 == 0) goto L_0x0027
            r7.printStackTrace()     // Catch:{ all -> 0x01d0 }
        L_0x0027:
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            return
        L_0x0029:
            r6.f22142J = r2     // Catch:{ all -> 0x01d0 }
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            com.mbridge.msdk.reward.a.a$c r8 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0082
            com.mbridge.msdk.reward.a.a$c r8 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            java.util.concurrent.atomic.AtomicInteger r8 = r8.f22227c     // Catch:{ Exception -> 0x01d3 }
            int r8 = r8.get()     // Catch:{ Exception -> 0x01d3 }
            if (r8 != r2) goto L_0x0082
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0052
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x004a }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f22169q     // Catch:{ Exception -> 0x004a }
            java.lang.String r9 = "campaing is loading"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x004a }
            goto L_0x0052
        L_0x004a:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0052
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x0052:
            boolean r7 = r6.f22133A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x007f
            boolean r7 = r6.f22134B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x007f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63605s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x007f
            java.lang.String r7 = ""
            r6.mo61283a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x007f:
            r6.f22142J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x0082:
            android.content.Context r8 = r6.f22160h     // Catch:{ Exception -> 0x01d3 }
            if (r8 != 0) goto L_0x00cc
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x009c
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x0094 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f22169q     // Catch:{ Exception -> 0x0094 }
            java.lang.String r9 = "context is null"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x0094 }
            goto L_0x009c
        L_0x0094:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x009c
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x009c:
            boolean r7 = r6.f22133A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x00c9
            boolean r7 = r6.f22134B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x00c9
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63605s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x00c9
            java.lang.String r7 = ""
            r6.mo61283a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x00c9:
            r6.f22142J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x00cc:
            boolean r8 = r6.f22133A     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x011e
            android.content.Context r8 = r6.f22160h     // Catch:{ Exception -> 0x01d3 }
            boolean r8 = com.mbridge.msdk.foundation.tools.C8677z.m24933c((android.content.Context) r8)     // Catch:{ Exception -> 0x01d3 }
            if (r8 != 0) goto L_0x011e
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00ee
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f22169q     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r9 = "network exception"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x00ee
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x00ee:
            boolean r7 = r6.f22133A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x011b
            boolean r7 = r6.f22134B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x011b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63605s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x011b
            java.lang.String r7 = ""
            r6.mo61283a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x011b:
            r6.f22142J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x011e:
            boolean r8 = r6.m25899j()     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x016a
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x013a
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f22165m     // Catch:{ Exception -> 0x0132 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f22169q     // Catch:{ Exception -> 0x0132 }
            java.lang.String r9 = "Play more than limit"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x0132 }
            goto L_0x013a
        L_0x0132:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x013a
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x013a:
            boolean r7 = r6.f22133A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x0167
            boolean r7 = r6.f22134B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x0167
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63605s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f22227c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x0167
            java.lang.String r7 = ""
            r6.mo61283a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x0167:
            r6.f22142J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x016a:
            java.lang.String r8 = r6.f22167o     // Catch:{ Exception -> 0x01d3 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0178
            java.lang.String r8 = com.mbridge.msdk.foundation.tools.C8660r.m24832k()     // Catch:{ Exception -> 0x01d3 }
            r6.f22167o = r8     // Catch:{ Exception -> 0x01d3 }
        L_0x0178:
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = "dd"
            r8.<init>(r9)     // Catch:{ Exception -> 0x01cc }
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x01cc }
            r9.<init>()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r8 = r8.format(r9)     // Catch:{ Exception -> 0x01cc }
            android.content.Context r9 = r6.f22160h     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "reward_date"
            java.lang.String r5 = "0"
            java.lang.Object r9 = com.mbridge.msdk.foundation.tools.C8614ab.m24713b(r9, r4, r5)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x01cc }
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x01cc }
            if (r4 != 0) goto L_0x01cc
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x01cc }
            if (r4 != 0) goto L_0x01cc
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x01cc }
            if (r9 != 0) goto L_0x01cc
            android.content.Context r9 = r6.f22160h     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "reward_date"
            com.mbridge.msdk.foundation.tools.C8614ab.m24712a(r9, r4, r8)     // Catch:{ Exception -> 0x01cc }
            android.content.Context r8 = r6.f22160h     // Catch:{ Exception -> 0x01cc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cc }
            r9.<init>()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = r6.f22171s     // Catch:{ Exception -> 0x01cc }
            r9.append(r4)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "_"
            r9.append(r4)     // Catch:{ Exception -> 0x01cc }
            r9.append(r2)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01cc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x01cc }
            com.mbridge.msdk.foundation.tools.C8614ab.m24712a(r8, r9, r4)     // Catch:{ Exception -> 0x01cc }
        L_0x01cc:
            r6.m25884d((java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
            goto L_0x0221
        L_0x01d0:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            throw r7     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            r7 = move-exception
            r6.f22142J = r3
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01e3
            java.lang.String r8 = "RewardVideoController"
            java.lang.String r9 = r7.getLocalizedMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r8, r9)
        L_0x01e3:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f22165m
            if (r8 == 0) goto L_0x01f8
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f22165m     // Catch:{ Exception -> 0x01f1 }
            com.mbridge.msdk.out.MBridgeIds r9 = r6.f22169q     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r4 = "show exception"
            r8.onShowFail(r9, r4)     // Catch:{ Exception -> 0x01f1 }
            goto L_0x01f8
        L_0x01f1:
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01f8
            r7.printStackTrace()
        L_0x01f8:
            boolean r7 = r6.f22133A
            if (r7 != 0) goto L_0x0221
            boolean r7 = r6.f22134B
            if (r7 != 0) goto L_0x0221
            com.mbridge.msdk.videocommon.d.c r7 = r6.f22163k
            if (r7 == 0) goto L_0x0221
            boolean r7 = r7.mo63605s(r1)
            if (r7 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n
            if (r7 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n
            int r7 = r7.f22227c.get()
            if (r7 == r2) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f22166n
            int r7 = r7.f22227c.get()
            if (r7 == r0) goto L_0x0221
            r6.mo61288d((boolean) r3)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p342a.C9110a.mo61280a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    private boolean m25899j() {
        try {
            if (this.f22145O == null) {
                this.f22145O = C8414g.m23969a(C8388a.m23845e().mo56913g());
            }
            C8415h a = C8415h.m23977a((C8412f) this.f22145O);
            if (this.f22163k == null) {
                this.f22163k = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f22168p, this.f22133A);
            }
            int d = this.f22163k.mo63574d();
            if (a == null || !a.mo57025a(this.f22168p, d)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            C8672v.m24878d("RewardVideoController", "cap check error");
            return false;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$a */
    /* compiled from: RewardVideoController */
    public class C9124a implements Runnable {

        /* renamed from: b */
        private C9131a f22218b;

        /* renamed from: c */
        private int f22219c;

        /* renamed from: d */
        private boolean f22220d;

        public C9124a(C9131a aVar, int i, boolean z) {
            this.f22218b = aVar;
            this.f22219c = i;
            this.f22220d = z;
        }

        public final void run() {
            C8672v.m24878d("RewardVideoController", "adSource=" + this.f22219c + " CommonCancelTimeTask mIsDevCall：" + this.f22220d);
            C9176a.m26124b((CampaignEx) null, C9110a.this.f22160h, "v3 is timeout", C9110a.this.f22168p, C9110a.this.f22134B, "", "");
            C9110a.this.m25880c("v3 is timeout");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$b */
    /* compiled from: RewardVideoController */
    public class C9125b implements C9132b {

        /* renamed from: b */
        private C9131a f22222b;

        /* renamed from: c */
        private boolean f22223c;

        /* renamed from: d */
        private Runnable f22224d;

        public C9125b(C9131a aVar, boolean z) {
            this.f22222b = aVar;
            this.f22223c = z;
        }

        /* renamed from: a */
        public final void mo61305a(Runnable runnable) {
            this.f22224d = runnable;
        }

        /* renamed from: b */
        public final void mo37118b(String str) {
            if (this.f22224d != null) {
                C9110a.this.f22174v.removeCallbacks(this.f22224d);
            }
            if (C9110a.this.f22166n != null) {
                C9126c.m25959d(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
            }
        }

        /* renamed from: a */
        public final void mo37116a() {
            if (this.f22224d != null) {
                C9110a.this.f22174v.removeCallbacks(this.f22224d);
            }
            if (C9110a.this.f22166n != null) {
                C9126c.m25951a(C9110a.this.f22166n, C9110a.this.f22171s, C9110a.this.f22168p);
            }
        }

        /* renamed from: a */
        public final void mo37117a(String str) {
            if (this.f22224d != null) {
                C9110a.this.f22174v.removeCallbacks(this.f22224d);
            }
            C9131a aVar = this.f22222b;
            if (aVar != null) {
                aVar.mo61318a((C9132b) null);
                this.f22222b = null;
            }
            if (C9110a.this.f22166n != null) {
                C9126c.m25950a(C9110a.this.f22166n, str);
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m25898j(C9110a aVar) {
        String str;
        if (aVar.f22169q != null) {
            if (aVar.f22140H) {
                String a = aVar.mo61276a();
                if (!TextUtils.isEmpty(a)) {
                    ConcurrentHashMap<String, String> concurrentHashMap = f22130L;
                    if (concurrentHashMap != null && concurrentHashMap.containsKey(a) && !TextUtils.isEmpty(f22130L.get(a))) {
                        str = f22130L.get(a);
                        aVar.f22169q.setBidToken(str);
                    }
                } else {
                    return;
                }
            }
            str = "";
            aVar.f22169q.setBidToken(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25865a(C9110a aVar, String str, List list) {
        if (list != null && list.size() > 0 && !aVar.f22149S) {
            C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo56997a((List<CampaignEx>) list, str);
        }
    }
}
