package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.room.RoomMasterTable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8460e;
import com.mbridge.msdk.foundation.entity.C8461f;
import com.mbridge.msdk.foundation.entity.C8465j;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8416i;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.same.p304e.C8493b;
import com.mbridge.msdk.foundation.same.p304e.C8495c;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbnative.controller.C8820a;
import com.mbridge.msdk.mbnative.p332a.C8798b;
import com.mbridge.msdk.mbnative.p332a.C8799c;
import com.mbridge.msdk.mbnative.p333b.C8800a;
import com.mbridge.msdk.mbnative.p334c.C8801a;
import com.mbridge.msdk.mbnative.p335d.C8835a;
import com.mbridge.msdk.mbnative.p335d.C8838b;
import com.mbridge.msdk.mbnative.p336e.p337a.C8842a;
import com.mbridge.msdk.mbnative.p336e.p337a.C8843b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8878a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnImageLoadListener;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2452c;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9670k;
import com.mbridge.msdk.widget.C9676a;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeController {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static boolean f21625A;

    /* renamed from: c */
    public static Map<String, Long> f21626c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f21627e = NativeController.class.getSimpleName();

    /* renamed from: B */
    private int f21628B = 0;

    /* renamed from: C */
    private int f21629C = 0;

    /* renamed from: D */
    private int f21630D = 0;

    /* renamed from: E */
    private int f21631E = 0;

    /* renamed from: F */
    private C8493b f21632F;

    /* renamed from: G */
    private List<C8820a> f21633G;

    /* renamed from: H */
    private List<C8820a.C8824a> f21634H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public CopyOnWriteArrayList<C8490a> f21635I = new CopyOnWriteArrayList<>();

    /* renamed from: J */
    private Hashtable<String, AdSession> f21636J = new Hashtable<>();

    /* renamed from: K */
    private int f21637K = 1;

    /* renamed from: L */
    private int f21638L = 2;

    /* renamed from: M */
    private C8813a f21639M;

    /* renamed from: N */
    private boolean f21640N;

    /* renamed from: O */
    private boolean f21641O;

    /* renamed from: P */
    private Timer f21642P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public String f21643Q = "";
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f21644R = "";

    /* renamed from: S */
    private C2456d f21645S;

    /* renamed from: T */
    private long f21646T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f21647U;

    /* renamed from: V */
    private int f21648V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f21649W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f21650X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f21651Y;

    /* renamed from: Z */
    private boolean f21652Z;

    /* renamed from: a */
    protected List<Integer> f21653a;

    /* renamed from: b */
    protected List<Integer> f21654b;

    /* renamed from: d */
    Map<String, Object> f21655d;

    /* renamed from: f */
    private C2452c f21656f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8801a f21657g;

    /* renamed from: h */
    private NativeListener.NativeTrackingListener f21658h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f21659i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f21660j;

    /* renamed from: k */
    private String f21661k;

    /* renamed from: l */
    private Queue<Integer> f21662l;

    /* renamed from: m */
    private Queue<Long> f21663m;

    /* renamed from: n */
    private String f21664n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8817e f21665o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8582d f21666p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f21667q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6765a f21668r;

    /* renamed from: s */
    private int f21669s = 1;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f21670t = 1;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f21671u = -1;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f21672v = 0;

    /* renamed from: w */
    private String f21673w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f21674x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f21675y = false;

    /* renamed from: z */
    private boolean f21676z = false;

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$b */
    public interface C8814b {
        /* renamed from: a */
        void mo58504a();
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$e */
    private static class C8817e extends Handler {

        /* renamed from: a */
        private WeakReference<NativeController> f21721a;

        public C8817e(NativeController nativeController) {
            this.f21721a = new WeakReference<>(nativeController);
        }

        public final void handleMessage(Message message) {
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (!(message.what != 0 || this.f21721a == null || (nativeController = (NativeController) this.f21721a.get()) == null)) {
                    nativeController.f21666p.mo58063a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    if (!(this.f21721a == null || this.f21721a.get() == null)) {
                        nativeController2 = (NativeController) this.f21721a.get();
                    }
                    if (nativeController2 != null) {
                        boolean unused = nativeController2.f21675y = true;
                        List<Campaign> b = nativeController2.mo58496b(nativeController2.f21660j, nativeController2.f21670t, nativeController2.f21643Q);
                        if (!nativeController2.f21674x) {
                            boolean unused2 = nativeController2.m25379a(b);
                        }
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
        }
    }

    public NativeController(C8801a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        List list;
        C8798b<String, List<Campaign>> a;
        this.f21659i = context;
        this.f21655d = map;
        this.f21656f = new C2452c();
        this.f21657g = aVar;
        this.f21658h = nativeTrackingListener;
        this.f21633G = new ArrayList();
        this.f21634H = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f21660j = str;
        if (!TextUtils.isEmpty(str)) {
            if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
                this.f21661k = "";
            } else {
                this.f21661k = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                f21625A = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
            }
            this.f21662l = new LinkedList();
            this.f21663m = new LinkedList();
            this.f21632F = new C8493b(this.f21659i);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            this.f21665o = new C8817e(this);
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                this.f21673w = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            try {
                if (!(C8825b.m25460b().containsKey(this.f21660j) ? C8825b.m25460b().get(this.f21660j).booleanValue() : false)) {
                    if (map.containsKey("ad_num")) {
                        int intValue = ((Integer) map.get("ad_num")).intValue();
                        intValue = intValue < 1 ? 1 : intValue;
                        intValue = intValue > 10 ? 10 : intValue;
                        this.f21670t = intValue;
                        this.f21669s = intValue;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                        this.f21630D = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                    }
                } else if (C8825b.m25464d().containsKey(this.f21660j)) {
                    this.f21670t = C8825b.m25464d().get(this.f21660j).intValue();
                    if (map.containsKey("ad_num")) {
                        int intValue2 = ((Integer) map.get("ad_num")).intValue();
                        this.f21628B = intValue2;
                        this.f21669s = intValue2;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                        int intValue3 = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                        this.f21629C = intValue3;
                        this.f21630D = intValue3;
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d(f21627e, C8800a.m25352a(e));
            }
            this.f21666p = new C8582d(this.f21659i);
            this.f21668r = new C6765a(this.f21659i, this.f21660j);
            try {
                Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                Class.forName("com.mbridge.msdk.videocommon.download.c");
                this.f21641O = true;
                if (this.f21655d != null && (this.f21655d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f21655d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                    this.f21640N = true;
                }
                C8832c.m25499a(this.f21659i, this.f21660j);
                C8666t.m24864b();
                if (!TextUtils.isEmpty(this.f21660j)) {
                    C8410e.m23925a((C8412f) C8414g.m23969a(this.f21659i)).mo56984a();
                    int a2 = m25358a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                    String str2 = this.f21660j;
                    a2 = a2 <= 0 ? this.f21669s : a2;
                    C2456d e2 = C2445b.m6020a().mo16292e("", str2);
                    this.f21645S = e2;
                    if (e2 == null) {
                        this.f21645S = C2456d.m6070d(str2);
                    }
                    List<Integer> q = this.f21645S.mo16326q();
                    this.f21653a = q;
                    if (q == null || q.size() <= 0 || !this.f21653a.contains(1) || (a = C8799c.m25351a(1)) == null) {
                        list = null;
                    } else {
                        list = a.mo58484b(str2, a2);
                    }
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < list.size(); i++) {
                            CampaignEx campaignEx = (CampaignEx) list.get(i);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Class<?> cls = Class.forName("com.mbridge.msdk.videocommon.download.c");
                            Class<?> cls2 = Class.forName("com.mbridge.msdk.videocommon.listener.a");
                            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
                            cls.getMethod("createUnitCache", new Class[]{Context.class, String.class, List.class, Integer.TYPE, cls2}).invoke(invoke, new Object[]{context, this.f21660j, arrayList, 1, null});
                            cls.getMethod("load", new Class[]{String.class}).invoke(invoke, new Object[]{this.f21660j});
                        }
                    }
                }
            } catch (Throwable unused) {
                C8672v.m24878d(f21627e, "please import the nativex aar");
            }
        }
    }

    public NativeController() {
    }

    /* renamed from: a */
    private int m25358a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(f21627e, C8800a.m25352a(e));
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo58491a(int i, String str) {
        String str2;
        boolean z;
        this.f21674x = false;
        this.f21675y = false;
        this.f21676z = false;
        this.f21649W = false;
        this.f21643Q = str;
        this.f21657g.mo58487a(!TextUtils.isEmpty(str));
        String str3 = null;
        this.f21639M = null;
        Map<String, Long> map = f21626c;
        if (map != null && map.size() > 0) {
            f21626c.clear();
        }
        if (!((C8825b.m25460b() == null || !C8825b.m25460b().containsKey(this.f21660j)) ? false : C8825b.m25460b().get(this.f21660j).booleanValue()) || i != 1 || !m25376a(i)) {
            if (!this.f21655d.containsKey("app_id") || !this.f21655d.containsKey(MBridgeConstans.APP_KEY) || !this.f21655d.containsKey(MBridgeConstans.KEY_WORD)) {
                str2 = null;
            } else {
                str3 = (String) this.f21655d.get("app_id");
                str2 = (String) this.f21655d.get(MBridgeConstans.APP_KEY);
            }
            this.f21656f.mo16303a(this.f21659i, str3, str2, this.f21660j);
            C2456d e = C2445b.m6020a().mo16292e(str3, this.f21660j);
            this.f21645S = e;
            if (e == null) {
                this.f21645S = C2456d.m6070d(this.f21660j);
            }
            C8825b.m25465e().put(this.f21660j, Integer.valueOf(this.f21645S.mo16331u() * this.f21670t));
            this.f21653a = this.f21645S.mo16326q();
            this.f21654b = this.f21645S.mo16327r();
            this.f21648V = this.f21645S.mo16324o();
            this.f21647U = this.f21645S.mo16325p();
            this.f21670t = this.f21669s;
            List<Integer> list = this.f21653a;
            if (list == null || list.size() == 0) {
                C8801a aVar = this.f21657g;
                if (aVar != null) {
                    this.f21674x = true;
                    aVar.onAdLoadError("don't have sorceList");
                    return;
                }
                return;
            }
            try {
                z = C8878a.m25646a(C8388a.m23845e().mo56913g());
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                C8801a aVar2 = this.f21657g;
                if (aVar2 != null) {
                    aVar2.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f21664n == null) {
                String str4 = (String) this.f21655d.get(MBridgeConstans.NATIVE_INFO);
                this.f21664n = str4;
                if (str4 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(this.f21664n);
                        if (jSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                                int optInt = jSONObject.optInt("id", 0);
                                if (2 == optInt) {
                                    this.f21650X = jSONObject.optInt("ad_num");
                                    if (this.f21648V > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f21648V);
                                    }
                                } else if (3 == optInt) {
                                    this.f21651Y = jSONObject.optInt("ad_num");
                                    if (this.f21648V > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f21648V);
                                    }
                                }
                            }
                        }
                        this.f21637K = Math.max(this.f21650X, this.f21651Y);
                        this.f21664n = jSONArray.toString();
                    } catch (JSONException e2) {
                        C8672v.m24878d(f21627e, C8800a.m25352a(e2));
                    }
                }
            }
            if ((this.f21653a.contains(1) && this.f21653a.get(0).intValue() != 1) || i != 0 || !m25379a(mo58496b(this.f21660j, this.f21670t, this.f21643Q))) {
                this.f21652Z = true;
                if (this.f21653a.contains(1) && i == 0 && this.f21653a.get(0).intValue() != 1) {
                    int intValue = this.f21653a.get(0).intValue();
                    C8798b<String, List<Campaign>> a = C8799c.m25351a(intValue);
                    if (intValue != 2 || !this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        this.f21670t = this.f21669s;
                    } else {
                        this.f21670t = this.f21637K;
                    }
                    if (a == null || !m25379a(m25362a(intValue, m25396d(a.mo58484b(this.f21660j, this.f21670t))))) {
                        this.f21652Z = false;
                        try {
                            m25386b(1, (long) (this.f21654b.get(this.f21653a.indexOf(1)).intValue() * 1000), i, this.f21643Q);
                        } catch (Exception unused2) {
                        }
                    } else {
                        return;
                    }
                }
                this.f21665o.sendEmptyMessageDelayed(1, (long) (this.f21645S.mo16321l() * 1000));
                List<Integer> list2 = this.f21653a;
                if (list2 != null && list2.size() > 0) {
                    Queue<Integer> queue = this.f21662l;
                    if (queue != null && queue.size() > 0) {
                        this.f21662l.clear();
                    }
                    for (Integer next : this.f21653a) {
                        Queue<Integer> queue2 = this.f21662l;
                        if (queue2 != null) {
                            queue2.add(next);
                        }
                    }
                }
                List<Integer> list3 = this.f21654b;
                if (list3 != null && list3.size() > 0) {
                    Queue<Long> queue3 = this.f21663m;
                    if (queue3 != null && queue3.size() > 0) {
                        this.f21663m.clear();
                    }
                    for (Integer next2 : this.f21654b) {
                        Queue<Long> queue4 = this.f21663m;
                        if (queue4 != null) {
                            queue4.add(Long.valueOf((long) (next2.intValue() * 1000)));
                        }
                    }
                }
                m25387b(i, this.f21643Q);
            }
        }
    }

    /* renamed from: a */
    private boolean m25376a(int i) {
        int i2;
        int i3;
        int i4;
        C8801a aVar;
        int i5 = 0;
        if (C8825b.m25460b().containsKey(this.f21660j) && C8825b.m25460b().get(this.f21660j).booleanValue()) {
            Map<String, Map<Long, Object>> a = C8825b.m25453a();
            Map map = a.get(i + "_" + this.f21660j);
            Integer num = C8825b.m25464d().get(this.f21660j);
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (num != null) {
                this.f21670t = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long l = (Long) map.keySet().iterator().next();
                long currentTimeMillis = System.currentTimeMillis();
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                if (currentTimeMillis - l.longValue() >= b.mo16162Q() * 1000) {
                    a.remove(i + "_" + this.f21660j);
                } else if (i == 1) {
                    List<Frame> list = (List) map.get(l);
                    if (list == null || list.size() <= 0 || (aVar = this.f21657g) == null) {
                        return false;
                    }
                    if (this.f21630D >= list.size()) {
                        a.remove(i + "_" + this.f21660j);
                        aVar.onAdFramesLoaded(list);
                        return true;
                    } else if (this.f21630D == 0) {
                        return false;
                    } else {
                        List subList = list.subList(0, this.f21629C);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(subList);
                        map.put(l, subList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i5 >= this.f21630D) {
                                arrayList.add(frame);
                            }
                            i5++;
                        }
                        map.put(l, arrayList);
                        a.put(i + "_" + this.f21660j, map);
                        aVar.onAdFramesLoaded(subList);
                        return true;
                    }
                } else {
                    List list2 = (List) map.get(l);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f21664n)) {
                                i2 = Math.min(this.f21628B, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f21664n);
                                    if (jSONArray.length() > 0) {
                                        i4 = 0;
                                        i3 = 0;
                                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i6);
                                            int optInt = jSONObject.optInt("id", 0);
                                            if (2 == optInt) {
                                                i4 = jSONObject.optInt("ad_num");
                                            } else if (3 == optInt) {
                                                i3 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        i4 = 0;
                                        i3 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        i2 = Math.min(i3, list2.size());
                                    } else {
                                        i2 = Math.min(i4, list2.size());
                                    }
                                } catch (Exception unused) {
                                    C8672v.m24878d(f21627e, "load from catch error in get nativeinfo adnum");
                                    i2 = 0;
                                }
                            }
                            if (i2 <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i5 != i2) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i5++;
                            }
                        } else {
                            int min = Math.min(this.f21628B, list2.size());
                            if (min > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i5 != min) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i5++;
                                }
                            }
                        }
                        m25379a((List<Campaign>) arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m25387b(int i, String str) {
        C8801a aVar;
        Queue<Integer> queue = this.f21662l;
        if (queue != null && queue.size() > 0) {
            int intValue = this.f21662l.poll().intValue();
            this.f21646T = (long) MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f21663m;
            if (queue2 != null && queue2.size() > 0) {
                this.f21646T = this.f21663m.poll().longValue();
            }
            m25365a(intValue, this.f21646T, i, str);
        } else if (!this.f21674x && (aVar = this.f21657g) != null) {
            this.f21674x = true;
            aVar.onAdLoadError("no ad source");
        }
    }

    /* renamed from: a */
    private void m25365a(int i, long j, int i2, String str) {
        C8798b<String, List<Campaign>> a;
        if (i2 == 0 && (a = C8799c.m25351a(i)) != null) {
            if ((i == 1 || i == 2) && this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f21670t = this.f21637K;
            } else {
                this.f21670t = this.f21669s;
            }
            if (m25379a(m25362a(i, m25396d(a.mo58484b(this.f21660j, this.f21670t))))) {
                return;
            }
        }
        if (i == 1) {
            m25386b(1, j, i2, this.f21643Q);
        } else if (i != 2) {
            m25386b(i, j, i2, str);
        } else {
            m25386b(2, j, i2, str);
        }
    }

    /* renamed from: a */
    public final void mo58494a(String str, int i, String str2) {
        Queue<Integer> queue = this.f21662l;
        if ((queue == null || queue.size() > 0) && this.f21662l != null) {
            m25387b(i, str2);
            return;
        }
        C8801a aVar = this.f21657g;
        if (aVar != null && !this.f21674x) {
            this.f21674x = true;
            aVar.onAdLoadError(str);
        }
    }

    /* renamed from: b */
    private synchronized void m25386b(int i, long j, int i2, String str) {
        C8465j jVar;
        if (this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO)) {
            this.f21670t = Math.max(this.f21650X, this.f21651Y);
        }
        if (i2 == 0) {
            C8798b<String, List<Campaign>> a = C8799c.m25351a(i);
            if (a == null || !m25379a(m25362a(1, m25396d(a.mo58484b(this.f21660j, this.f21670t))))) {
                try {
                    if (this.f21639M != null && !this.f21649W) {
                        this.f21639M.mo58510b(true);
                    }
                    if (this.f21649W && !this.f21674x) {
                        mo58494a("mb load failed", i2, str);
                    }
                    if (!this.f21652Z) {
                        return;
                    }
                } catch (Exception e) {
                    C8672v.m24878d(f21627e, C8800a.m25352a(e));
                    C8672v.m24878d(f21627e, e.getMessage());
                }
            } else {
                return;
            }
        }
        if (this.f21671u == -1) {
            this.f21671u = i;
        } else if (this.f21671u != i) {
            this.f21672v = 0;
        }
        C8410e.m23925a((C8412f) C8414g.m23969a(this.f21659i)).mo56984a();
        C8842a aVar = new C8842a(this.f21659i);
        C8550d dVar = new C8550d();
        String h = C8388a.m23845e().mo56914h();
        String j2 = C8388a.m23845e().mo56916j();
        if (this.f21655d != null && this.f21655d.containsKey("app_id") && this.f21655d.containsKey(MBridgeConstans.APP_KEY) && this.f21655d.containsKey(MBridgeConstans.KEY_WORD) && this.f21655d.get(MBridgeConstans.KEY_WORD) != null) {
            String str2 = null;
            if (this.f21655d.get("app_id") instanceof String) {
                h = (String) this.f21655d.get("app_id");
            }
            if (this.f21655d.get(MBridgeConstans.APP_KEY) instanceof String) {
                j2 = (String) this.f21655d.get(MBridgeConstans.APP_KEY);
            }
            if (this.f21655d.get(MBridgeConstans.KEY_WORD) instanceof String) {
                str2 = (String) this.f21655d.get(MBridgeConstans.KEY_WORD);
            }
            if (!TextUtils.isEmpty(str2)) {
                dVar.mo57981a("smart", C8659q.m24801a(str2));
            }
        }
        dVar.mo57981a("app_id", h);
        dVar.mo57981a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21660j);
        if (!TextUtils.isEmpty(this.f21661k)) {
            dVar.mo57981a(MBridgeConstans.PLACEMENT_ID, this.f21661k);
        }
        dVar.mo57981a("req_type", "2");
        if (!TextUtils.isEmpty(this.f21673w)) {
            dVar.mo57981a("category", this.f21673w);
        }
        dVar.mo57981a("sign", SameMD5.getMD5(h + j2));
        if (this.f21648V <= 0 || i2 != 0) {
            dVar.mo57981a("ad_num", this.f21669s + "");
        } else {
            dVar.mo57981a("ad_num", this.f21648V + "");
        }
        String g = C8677z.m24946g(this.f21660j);
        if (!TextUtils.isEmpty(g)) {
            dVar.mo57981a("j", g);
        }
        dVar.mo57981a("only_impression", "1");
        dVar.mo57981a("ping_mode", "1");
        if (this.f21630D != 0) {
            dVar.mo57981a("frame_num", this.f21630D + "");
        }
        if (!TextUtils.isEmpty(this.f21664n)) {
            dVar.mo57981a(MBridgeConstans.NATIVE_INFO, this.f21664n);
            if (i == 1 && !C6765a.f17824a) {
                dVar.mo57981a("tnum", this.f21637K + "");
            }
        } else if (i == 1 && !C6765a.f17824a) {
            dVar.mo57981a("tnum", this.f21669s + "");
        }
        String a2 = C8473d.m24277a(this.f21660j, "native");
        if (!TextUtils.isEmpty(a2)) {
            dVar.mo57981a(C8550d.f20982b, a2);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            if (this.f21655d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                dVar.mo57981a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH, ((Integer) this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f21655d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                dVar.mo57981a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT, ((Integer) this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f21655d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f21655d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            dVar.mo57981a("video_version", "2.0");
        }
        if (C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h()) == null) {
            C2445b.m6020a().mo16285b();
        }
        if (!m25380a(this.f21655d)) {
            JSONArray a3 = C8677z.m24914a(this.f21659i, this.f21660j);
            if (a3.length() > 0) {
                dVar.mo57981a(C8550d.f20983c, C8677z.m24912a(a3));
            }
        }
        if (C8825b.m25460b().containsKey(this.f21660j) && C8825b.m25460b().get(this.f21660j).booleanValue() && C8825b.m25463c().get(this.f21660j) != null && (jVar = C8825b.m25463c().get(this.f21660j)) != null) {
            if (i == 1) {
                this.f21672v = jVar.mo57791b();
            } else if (i == 2) {
                this.f21672v = jVar.mo57789a();
            }
        }
        dVar.mo57981a("offset", this.f21672v + "");
        dVar.mo57981a("ad_type", RoomMasterTable.DEFAULT_ID);
        dVar.mo57981a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
        if (!TextUtils.isEmpty(this.f21667q)) {
            dVar.mo57981a(C8550d.f20981a, this.f21667q);
        }
        C8813a aVar2 = new C8813a();
        aVar2.mo58507a(m25385b(this.f21655d));
        aVar2.f20918d = this.f21660j;
        aVar2.f20919e = this.f21661k;
        aVar2.f20920f = 42;
        aVar2.mo58510b(true);
        C8815c cVar = new C8815c(1, aVar2, i2, str);
        aVar2.mo58506a((Runnable) cVar);
        aVar2.mo58557g(i2);
        aVar2.mo58554a(str);
        if (i2 == 0) {
            if (!TextUtils.isEmpty(str)) {
                dVar.mo57981a("token", str);
            }
            aVar.mo57973a(1, dVar, (C8532e) aVar2, str);
        }
        if (i2 == 1) {
            aVar.mo57977b(1, C8543d.m24463a().f20964m, dVar, aVar2);
        }
        this.f21665o.postDelayed(cVar, j);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58493a(com.mbridge.msdk.out.Campaign r5, android.view.View r6, java.util.List<android.view.View> r7) {
        /*
            r4 = this;
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r4.f21658h     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x000b
            com.mbridge.msdk.click.a r0 = r4.f21668r     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r4.f21658h     // Catch:{ Exception -> 0x0089 }
            r0.mo37044a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ Exception -> 0x0089 }
        L_0x000b:
            int r0 = r5.getType()     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.mbnative.a.b r0 = com.mbridge.msdk.mbnative.p332a.C8799c.m25351a(r0)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r1 = r4.f21660j     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = r4.f21643Q     // Catch:{ Exception -> 0x0089 }
            r0.mo58483a((java.lang.String) r1, (com.mbridge.msdk.out.Campaign) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x0089 }
            r0 = 0
            java.lang.String r1 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            java.lang.String r1 = r4.f21660j     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = "native"
            com.mbridge.msdk.foundation.same.p300a.C8473d.m24279a((java.lang.String) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x0090
            if (r6 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0037
            boolean r1 = r0.isInstance(r6)     // Catch:{ Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0037
            return
        L_0x0037:
            com.mbridge.msdk.mbnative.controller.NativeController$1 r1 = new com.mbridge.msdk.mbnative.controller.NativeController$1     // Catch:{ Exception -> 0x0089 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0089 }
            r6.setOnClickListener(r1)     // Catch:{ Exception -> 0x0089 }
        L_0x003f:
            if (r7 == 0) goto L_0x0069
            int r1 = r7.size()     // Catch:{ Exception -> 0x0089 }
            if (r1 <= 0) goto L_0x0069
            java.util.Iterator r1 = r7.iterator()     // Catch:{ Exception -> 0x0089 }
        L_0x004b:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0089 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x0060
            boolean r3 = r0.isInstance(r2)     // Catch:{ Exception -> 0x0089 }
            if (r3 == 0) goto L_0x0060
            goto L_0x0069
        L_0x0060:
            com.mbridge.msdk.mbnative.controller.NativeController$4 r3 = new com.mbridge.msdk.mbnative.controller.NativeController$4     // Catch:{ Exception -> 0x0089 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0089 }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x0089 }
            goto L_0x004b
        L_0x0069:
            boolean r0 = r5.isReport()     // Catch:{ Exception -> 0x0089 }
            if (r0 != 0) goto L_0x0090
            r4.m25368a((com.mbridge.msdk.foundation.entity.CampaignEx) r5, (android.view.View) r6, (java.util.List<android.view.View>) r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = f21627e     // Catch:{ Exception -> 0x0089 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r7.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = "sendImpression"
            r7.append(r0)     // Catch:{ Exception -> 0x0089 }
            r7.append(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0089 }
            android.util.Log.e(r6, r5)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r5 = f21627e
            java.lang.String r6 = "registerview exception!"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r5, r6)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.mo58493a(com.mbridge.msdk.out.Campaign, android.view.View, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo58492a(Campaign campaign, View view) {
        try {
            if (this.f21658h != null) {
                this.f21668r.mo37044a(this.f21658h);
            }
            C8799c.m25351a(campaign.getType()).mo58483a(this.f21660j, campaign, this.f21643Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            C8473d.m24279a(this.f21660j, campaignEx, "native");
            if (campaignEx != null) {
                C88085 r0 = new C9676a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58499a(View view) {
                        C6765a unused = NativeController.this.f21668r;
                        C6765a.f17824a = false;
                        NativeController.this.f21668r.mo37042a(campaignEx, (NativeListener.NativeAdListener) NativeController.this.f21657g);
                        NativeController.m25369a(NativeController.this, campaignEx);
                    }
                };
                try {
                    m25366a(view, (View.OnClickListener) r0, (Class) Class.forName("com.mbridge.msdk.nativex.view.MBMediaView"));
                } catch (Throwable unused) {
                    m25366a(view, (View.OnClickListener) r0, (Class) null);
                }
                if (!campaignEx.isReport()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    m25368a(campaignEx, view, (List<View>) arrayList);
                    String str = f21627e;
                    C8672v.m24876b(str, "sendImpression" + campaignEx);
                }
            }
        } catch (Exception unused2) {
            C8672v.m24878d(f21627e, "registerview exception!");
        }
    }

    /* renamed from: a */
    private AdSession m25359a(CampaignEx campaignEx) {
        if (this.f21636J == null) {
            this.f21636J = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSession = this.f21636J.get(requestIdNotice);
        if (adSession == null && campaignEx.isActiveOm()) {
            adSession = C2427b.m5855a(this.f21659i, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f21660j, "", campaignEx.getRequestIdNotice());
        }
        if (adSession != null) {
            this.f21636J.put(requestIdNotice, adSession);
        }
        return adSession;
    }

    /* renamed from: a */
    private void m25368a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSession = null;
        try {
            if (!(this.f21659i == null || campaignEx == null || (adSession = m25359a(campaignEx)) == null)) {
                adSession.registerAdView(view);
                adSession.start();
            }
            AdSession adSession2 = adSession;
            int i = 0;
            if (this.f21645S != null) {
                i = this.f21645S.mo16313d();
            }
            int i2 = i;
            final C8818f fVar = new C8818f(campaignEx, view, list, this, adSession2);
            if (this.f21635I == null) {
                this.f21635I = new CopyOnWriteArrayList<>();
            }
            this.f21635I.add(fVar);
            fVar.f20826d = new C8490a.C8492b() {
                /* renamed from: a */
                public final void mo37107a(C8490a.C8491a aVar) {
                    if (aVar == C8490a.C8491a.FINISH && NativeController.this.f21635I != null && NativeController.this.f21635I.size() > 0 && NativeController.this.f21635I.contains(fVar)) {
                        NativeController.this.f21635I.remove(fVar);
                    }
                }
            };
            if (this.f21665o != null) {
                this.f21665o.postDelayed(fVar, (long) (i2 * 1000));
            }
        } catch (Exception e) {
            C8672v.m24878d(f21627e, C8800a.m25352a(e));
        }
    }

    /* renamed from: a */
    private void m25366a(View view, View.OnClickListener onClickListener, Class cls) {
        if (view != null && onClickListener != null) {
            if (cls != null) {
                try {
                    if (cls.isInstance(view)) {
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            view.setOnClickListener(onClickListener);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25366a(viewGroup.getChildAt(i), onClickListener, cls);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$f */
    private static class C8818f extends C8490a {

        /* renamed from: a */
        private CampaignEx f21722a;

        /* renamed from: e */
        private WeakReference<View> f21723e;

        /* renamed from: f */
        private WeakReference<List<View>> f21724f;

        /* renamed from: g */
        private WeakReference<NativeController> f21725g;

        /* renamed from: h */
        private WeakReference<AdSession> f21726h;

        /* renamed from: b */
        public final void mo37111b() {
        }

        public C8818f(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f21722a = campaignEx;
            this.f21723e = new WeakReference<>(view);
            this.f21724f = new WeakReference<>(list);
            this.f21725g = new WeakReference<>(nativeController);
            this.f21726h = new WeakReference<>(adSession);
        }

        /* renamed from: a */
        public final void mo37110a() {
            try {
                if (this.f21725g != null && this.f21723e != null && this.f21724f != null) {
                    View view = (View) this.f21723e.get();
                    List list = (List) this.f21724f.get();
                    NativeController nativeController = (NativeController) this.f21725g.get();
                    AdSession adSession = null;
                    if (this.f21726h != null) {
                        adSession = (AdSession) this.f21726h.get();
                    }
                    if (view != null && nativeController != null) {
                        NativeController.m25370a(nativeController, this.f21722a, view, list, adSession);
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
        }
    }

    /* renamed from: b */
    public final void mo58497b(Campaign campaign, View view) {
        mo58498b(campaign, view, (List<View>) null);
    }

    /* renamed from: b */
    public final void mo58498b(Campaign campaign, View view, List<View> list) {
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class<?> cls = null;
                try {
                    cls = Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                } catch (Throwable unused) {
                }
                if (list != null && list.size() > 0) {
                    for (View a : list) {
                        m25367a(a, (Class) cls);
                    }
                } else if (view != null) {
                    m25367a(view, (Class) cls);
                }
            }
        }
    }

    /* renamed from: a */
    private void m25367a(View view, Class cls) {
        if (view != null) {
            if (cls != null) {
                try {
                    if (cls.isInstance(view)) {
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            view.setOnClickListener((View.OnClickListener) null);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25367a(viewGroup.getChildAt(i), cls);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58490a() {
        C8490a next;
        C8493b bVar = this.f21632F;
        if (bVar != null) {
            bVar.mo57902a();
            this.f21632F = null;
        }
        Hashtable<String, AdSession> hashtable = this.f21636J;
        if (hashtable != null) {
            for (AdSession next2 : hashtable.values()) {
                if (next2 != null) {
                    next2.finish();
                }
            }
            this.f21636J.clear();
        }
        C8817e eVar = this.f21665o;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages((Object) null);
        }
        this.f21658h = null;
        this.f21668r.mo37040a();
        try {
            if (this.f21659i != null) {
                C8481b.m24310a(this.f21659i).mo57885c();
            }
            if (this.f21633G != null && this.f21633G.size() > 0) {
                for (C8820a a : this.f21633G) {
                    a.mo58513a();
                }
                this.f21633G.clear();
                this.f21633G = null;
            }
            if (this.f21634H != null && this.f21634H.size() > 0) {
                for (C8820a.C8824a next3 : this.f21634H) {
                }
                this.f21634H.clear();
                this.f21634H = null;
            }
            if (this.f21635I != null && this.f21635I.size() > 0) {
                Iterator<C8490a> it = this.f21635I.iterator();
                if (it.hasNext() && (next = it.next()) != null) {
                    next.mo57900d();
                    this.f21665o.removeCallbacks(next);
                }
                this.f21635I.clear();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$c */
    public class C8815c implements Runnable {

        /* renamed from: b */
        private int f21713b;

        /* renamed from: c */
        private C8495c f21714c;

        /* renamed from: d */
        private int f21715d;

        /* renamed from: e */
        private String f21716e;

        public C8815c(int i, C8495c cVar, int i2, String str) {
            this.f21713b = i;
            this.f21714c = cVar;
            this.f21715d = i2;
            this.f21716e = str;
        }

        public final void run() {
            this.f21714c.mo57905a(true);
            int i = this.f21713b;
            if (i == 1) {
                boolean unused = NativeController.this.f21649W = true;
                NativeController.this.mo58494a("REQUEST_TIMEOUT", this.f21715d, this.f21716e);
            } else if (i == 2) {
                if (!NativeController.this.f21674x || this.f21715d == 1) {
                    NativeController.this.mo58494a("REQUEST_TIMEOUT", this.f21715d, this.f21716e);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$a */
    public class C8813a extends C8843b implements C8495c {

        /* renamed from: b */
        private boolean f21708b = false;

        /* renamed from: c */
        private Runnable f21709c;

        /* renamed from: g */
        private boolean f21710g = true;

        /* renamed from: h */
        private List<String> f21711h = null;

        public C8813a() {
        }

        /* renamed from: b */
        public final void mo58510b(boolean z) {
            this.f21710g = z;
        }

        /* renamed from: a */
        public final void mo57905a(boolean z) {
            this.f21708b = z;
        }

        /* renamed from: a */
        public final void mo58507a(List<String> list) {
            this.f21711h = list;
        }

        /* renamed from: a */
        public final void mo58508a(List<C8513b> list, CampaignUnit campaignUnit) {
            int i = 1;
            boolean unused = NativeController.this.f21649W = true;
            C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(NativeController.this.f21659i));
            a.mo57031b();
            if (this.f21709c != null) {
                NativeController.this.f21665o.removeCallbacks(this.f21709c);
            }
            int i2 = 0;
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.f20918d = "0_" + this.f20918d;
                C8825b.m25461b(NativeController.this.f21671u, this.f20918d);
                int unused2 = NativeController.this.f21672v = 0;
                return;
            }
            String unused3 = NativeController.this.f21667q = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (NativeController.this.f21647U <= 0) {
                if (NativeController.this.f21647U == -3) {
                    int unused4 = NativeController.this.f21647U = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    int unused5 = nativeController.f21647U = nativeController.f21670t;
                }
                if (NativeController.this.f21650X != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    int unused6 = nativeController2.f21647U = nativeController2.f21650X;
                }
                if (NativeController.this.f21651Y != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    int unused7 = nativeController3.f21647U = nativeController3.f21651Y;
                }
            }
            for (int i3 = 0; i3 < campaignUnit.getAds().size(); i3++) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i3);
                campaignEx.setCampaignUnitId(this.f20918d);
                if (!TextUtils.isEmpty(NativeController.this.f21643Q)) {
                    campaignEx.setBidToken(NativeController.this.f21643Q);
                    campaignEx.setIsBidCampaign(true);
                }
                if (NativeController.f21625A) {
                    campaignEx.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                    campaignEx.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                }
                if (campaignEx != null) {
                    boolean c = C8677z.m24934c(NativeController.this.f21659i, campaignEx.getPackageName());
                    if (i3 < NativeController.this.f21670t && campaignEx.getOfferType() != 99) {
                        if (C8677z.m24930b(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (campaignEx.getWtick() == 1 || !c) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else if (C8677z.m24930b(campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else {
                            C8677z.m24917a(this.f20918d, campaignEx, C8469a.f20761v);
                        }
                    }
                    if (i3 < NativeController.this.f21647U && campaignEx.getOfferType() != 99) {
                        if (C8677z.m24930b(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (!c) {
                            arrayList2.add(campaignEx);
                        } else if (C8677z.m24930b(campaignEx)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                    if (!a.mo57029a(campaignEx.getId())) {
                        C8461f fVar = new C8461f();
                        fVar.mo57724a(campaignEx.getId());
                        fVar.mo57722a(campaignEx.getFca());
                        fVar.mo57726b(campaignEx.getFcb());
                        fVar.mo57730d(0);
                        fVar.mo57728c(0);
                        fVar.mo57723a(System.currentTimeMillis());
                        a.mo57028a(fVar);
                    }
                    C6779b.m20644a(NativeController.this.f21659i, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                }
            }
            NativeController.m25388b(NativeController.this, (List) arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            C8798b<String, List<Campaign>> a2 = C8799c.m25351a(type);
            if (a2 != null) {
                a2.mo58482a(this.f20918d, arrayList2, NativeController.this.f21643Q);
            }
            if (arrayList.size() == 0) {
                NativeController.this.mo58494a("APP ALREADY INSTALLED", mo58556g(), mo58555f());
                return;
            }
            NativeController nativeController4 = NativeController.this;
            boolean unused8 = nativeController4.m25379a((List<Campaign>) nativeController4.m25362a(type, (List<Campaign>) nativeController4.m25396d((List<Campaign>) arrayList)));
            if (!C8825b.m25460b().containsKey(this.f20918d) || !C8825b.m25460b().get(this.f20918d).booleanValue()) {
                if (C8825b.m25465e().containsKey(this.f20918d)) {
                    i = C8825b.m25465e().get(this.f20918d).intValue();
                }
                int c2 = NativeController.this.f21670t + NativeController.this.f21672v;
                if (c2 <= i) {
                    i2 = c2;
                }
                int unused9 = NativeController.this.f21672v = i2;
                return;
            }
            C8825b.m25457a(NativeController.this.f21671u, this.f20918d);
        }

        /* renamed from: a */
        public final void mo58505a(int i, String str) {
            boolean unused = NativeController.this.f21649W = true;
            if (!this.f21708b) {
                if (i == -1) {
                    C8825b.m25461b(NativeController.this.f21671u, this.f20918d);
                    int unused2 = NativeController.this.f21672v = 0;
                }
                if (this.f21709c != null) {
                    NativeController.this.f21665o.removeCallbacks(this.f21709c);
                }
                if (NativeController.this.f21674x) {
                    return;
                }
                if (mo58556g() == 1 || this.f21710g) {
                    NativeController.this.mo58494a(str, mo58556g(), mo58555f());
                }
            } else if (!NativeController.this.f21674x && this.f21710g) {
                NativeController.this.mo58494a(str, mo58556g(), mo58555f());
            }
        }

        /* renamed from: a */
        public final void mo58506a(Runnable runnable) {
            this.f21709c = runnable;
        }

        /* renamed from: b */
        public final void mo58509b(List<Frame> list) {
            if (!this.f21708b) {
                if (this.f21709c != null) {
                    NativeController.this.f21665o.removeCallbacks(this.f21709c);
                }
                if (list != null && list.size() != 0) {
                    for (Frame campaigns : list) {
                        List<CampaignEx> campaigns2 = campaigns.getCampaigns();
                        if (campaigns2 != null && campaigns2.size() != 0) {
                            for (Campaign next : campaigns2) {
                                if (NativeController.f21625A) {
                                    next.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                                    next.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                                }
                            }
                        } else if (NativeController.this.f21657g != null) {
                            boolean unused = NativeController.this.f21674x = true;
                            NativeController.this.f21657g.onAdLoadError("ads in frame is empty");
                            return;
                        } else {
                            return;
                        }
                    }
                    if (NativeController.this.f21657g != null) {
                        NativeController.this.f21657g.onAdFramesLoaded(list);
                    }
                } else if (NativeController.this.f21657g != null) {
                    boolean unused2 = NativeController.this.f21674x = true;
                    NativeController.this.f21657g.onAdLoadError("frame is empty");
                }
            }
        }
    }

    /* renamed from: b */
    public final List<Campaign> mo58496b(String str, int i, String str2) {
        int i2;
        int i3;
        List<Campaign> list = null;
        if (this.f21653a != null) {
            ArrayList arrayList = new ArrayList(this.f21653a);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C8798b<String, List<Campaign>> a = C8799c.m25351a(((Integer) arrayList.get(i4)).intValue());
                if (a != null) {
                    if ((((Integer) arrayList.get(i4)).intValue() == 1 || ((Integer) arrayList.get(i4)).intValue() == 2) && this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i3 = this.f21637K;
                    } else {
                        i3 = this.f21669s;
                    }
                    list = m25362a(((Integer) arrayList.get(i4)).intValue(), a.mo58484b(str, i3));
                    if (list != null) {
                        break;
                    }
                }
            }
            if (list == null) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    C8798b<String, List<Campaign>> a2 = C8799c.m25351a(((Integer) arrayList.get(i5)).intValue());
                    if ((((Integer) arrayList.get(i5)).intValue() == 1 || ((Integer) arrayList.get(i5)).intValue() == 2) && this.f21655d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i2 = this.f21637K;
                    } else {
                        i2 = this.f21669s;
                    }
                    list = m25362a(((Integer) arrayList.get(i5)).intValue(), a2.mo58480a(str, i2));
                    if (list != null) {
                        break;
                    }
                }
            }
        }
        return m25396d(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25379a(final List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.f21643Q) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        final C8801a aVar = this.f21657g;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        final int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(this.f21659i));
        a.mo57031b();
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i);
            if (!a.mo57029a(campaignEx2.getId())) {
                C8461f fVar = new C8461f();
                fVar.mo57724a(campaignEx2.getId());
                fVar.mo57722a(campaignEx2.getFca());
                fVar.mo57726b(campaignEx2.getFcb());
                fVar.mo57730d(0);
                fVar.mo57728c(0);
                fVar.mo57723a(System.currentTimeMillis());
                a.mo57028a(fVar);
            }
        }
        campaignEx.getType();
        if (!this.f21641O || !this.f21640N) {
            if (list == null || list.size() <= 0) {
                m25373a((NativeListener.NativeAdListener) aVar, "has no ads");
                return true;
            }
            for (Campaign videoLength : list) {
                videoLength.setVideoLength(0);
            }
            m25374a(list, template, (NativeListener.NativeAdListener) aVar);
            return true;
        } else if (m25398e().mo16316g() == 3) {
            final List<Campaign> b = m25384b(list);
            if (list == null || list.size() <= 0) {
                m25373a((NativeListener.NativeAdListener) aVar, "has no ads");
                return true;
            }
            m25375a(list, (C8814b) new C8814b() {
                /* renamed from: a */
                public final void mo58504a() {
                    List a = NativeController.m25364a(NativeController.this, b, true);
                    if (a == null || a.size() <= 0) {
                        NativeController.this.m25373a(aVar, "has no ads");
                    } else {
                        NativeController.this.m25374a((List<Campaign>) a, template, aVar);
                    }
                }
            });
            return true;
        } else {
            List<Campaign> c = m25393c(list);
            if (c == null || c.size() <= 0) {
                m25374a(list, template, (NativeListener.NativeAdListener) aVar);
                return true;
            }
            m25375a(c, (C8814b) new C8814b() {
                /* renamed from: a */
                public final void mo58504a() {
                    List a = NativeController.m25364a(NativeController.this, list, false);
                    if (a == null || a.size() <= 0) {
                        NativeController.this.m25373a(aVar, "has no ads");
                    } else {
                        NativeController.this.m25374a((List<Campaign>) a, template, aVar);
                    }
                }
            });
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25374a(final List<Campaign> list, final int i, final NativeListener.NativeAdListener nativeAdListener) {
        this.f21665o.post(new Runnable() {
            public final void run() {
                List list = list;
                if (list != null && list.size() > 0) {
                    String unused = NativeController.this.f21644R = ((CampaignEx) list.get(0)).getRequestId();
                }
                boolean unused2 = NativeController.this.f21674x = true;
                nativeAdListener.onAdLoaded(list, i);
                C8835a.m25505a(NativeController.this.f21659i, list, NativeController.this.f21660j);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25373a(final NativeListener.NativeAdListener nativeAdListener, final String str) {
        this.f21665o.post(new Runnable() {
            public final void run() {
                nativeAdListener.onAdLoadError(str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r4.size();
        r1 = r2.f21651Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.mbridge.msdk.out.Campaign> m25362a(int r3, java.util.List<com.mbridge.msdk.out.Campaign> r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f21655d
            java.lang.String r1 = "native_info"
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0045
            r3 = 0
            java.lang.Object r1 = r4.get(r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1
            if (r1 == 0) goto L_0x0022
            int r0 = r1.getTemplate()
        L_0x0022:
            r1 = 2
            if (r0 != r1) goto L_0x0034
            if (r4 == 0) goto L_0x0045
            int r0 = r4.size()
            int r1 = r2.f21650X
            if (r0 < r1) goto L_0x0045
            java.util.List r4 = r4.subList(r3, r1)
            goto L_0x0045
        L_0x0034:
            r1 = 3
            if (r0 != r1) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            int r0 = r4.size()
            int r1 = r2.f21651Y
            if (r0 < r1) goto L_0x0045
            java.util.List r4 = r4.subList(r3, r1)
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.m25362a(int, java.util.List):java.util.List");
    }

    /* renamed from: a */
    public static boolean m25380a(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (!map.containsKey("app_id") || !map.containsKey(MBridgeConstans.APP_KEY) || !map.containsKey(MBridgeConstans.KEY_WORD) || map.get(MBridgeConstans.KEY_WORD) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C8672v.m24878d(f21627e, C8800a.m25352a(e));
            return false;
        }
    }

    /* renamed from: b */
    public static List<String> m25385b(Map<String, Object> map) {
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("p");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    C8672v.m24878d(f21627e, C8800a.m25352a(e));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
            C8672v.m24878d(f21627e, C8800a.m25352a(e));
            return arrayList;
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$d */
    private static class C8816d implements C9652g.C9658b {

        /* renamed from: a */
        private String f21717a;

        /* renamed from: b */
        private CampaignEx f21718b;

        /* renamed from: c */
        private long f21719c = System.currentTimeMillis();

        /* renamed from: d */
        private boolean f21720d = true;

        public C8816d(String str, CampaignEx campaignEx, boolean z) {
            this.f21717a = str;
            this.f21718b = campaignEx;
            this.f21720d = z;
        }

        /* renamed from: a */
        public final void mo58372a(String str) {
            try {
                if (this.f21720d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21719c;
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    C8468m mVar = new C8468m("2000043", 20, currentTimeMillis + "", str, this.f21718b.getId(), this.f21717a, "", "2");
                    if (this.f21718b != null && !TextUtils.isEmpty(this.f21718b.getId())) {
                        mVar.mo57846n(this.f21718b.getId());
                    }
                    if (this.f21718b != null) {
                        mVar.mo57840k(this.f21718b.getRequestId());
                        mVar.mo57842l(this.f21718b.getRequestIdNotice());
                        mVar.mo57819b(this.f21718b.getAdSpaceT());
                    }
                    mVar.mo57834h("1");
                    C8580c.m24606a(mVar, this.f21717a);
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
        }

        /* renamed from: a */
        public final void mo58373a(String str, String str2) {
            try {
                if (this.f21720d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21719c;
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    C8468m mVar = new C8468m("2000043", 21, currentTimeMillis + "", str, this.f21718b.getId(), this.f21717a, str2, "2");
                    mVar.mo57840k(this.f21718b.getRequestId());
                    mVar.mo57842l(this.f21718b.getRequestIdNotice());
                    if (this.f21718b != null && !TextUtils.isEmpty(this.f21718b.getId())) {
                        mVar.mo57846n(this.f21718b.getId());
                    }
                    if (this.f21718b != null) {
                        mVar.mo57819b(this.f21718b.getAdSpaceT());
                    }
                    mVar.mo57834h("1");
                    C8580c.m24606a(mVar, this.f21717a);
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$g */
    private static final class C8819g implements C9652g.C9660d {

        /* renamed from: a */
        String f21727a;

        /* renamed from: b */
        CampaignEx f21728b;

        /* renamed from: c */
        private long f21729c = System.currentTimeMillis();

        /* renamed from: d */
        private boolean f21730d = true;

        public C8819g(String str, CampaignEx campaignEx, boolean z) {
            this.f21727a = str;
            this.f21728b = campaignEx;
            this.f21730d = z;
        }

        /* renamed from: a */
        public final void mo58372a(String str) {
            try {
                if (this.f21730d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21729c;
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    C8468m mVar = new C8468m("2000043", 14, currentTimeMillis + "", str, this.f21728b.getId(), this.f21727a, "", "1");
                    if (this.f21728b != null && !TextUtils.isEmpty(this.f21728b.getId())) {
                        mVar.mo57846n(this.f21728b.getId());
                    }
                    if (this.f21728b != null) {
                        mVar.mo57840k(this.f21728b.getRequestId());
                        mVar.mo57842l(this.f21728b.getRequestIdNotice());
                        mVar.mo57819b(this.f21728b.getAdSpaceT());
                    }
                    mVar.mo57834h("2");
                    C8580c.m24606a(mVar, this.f21727a);
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
        }

        /* renamed from: a */
        public final void mo58373a(String str, String str2) {
            try {
                if (this.f21730d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21729c;
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    C8468m mVar = new C8468m("2000043", 3, currentTimeMillis + "", str2, this.f21728b.getId(), this.f21727a, str, "1");
                    if (this.f21728b != null && !TextUtils.isEmpty(this.f21728b.getId())) {
                        mVar.mo57846n(this.f21728b.getId());
                    }
                    if (this.f21728b != null) {
                        mVar.mo57840k(this.f21728b.getRequestId());
                        mVar.mo57842l(this.f21728b.getRequestIdNotice());
                        mVar.mo57819b(this.f21728b.getAdSpaceT());
                    }
                    mVar.mo57834h("2");
                    C8580c.m24606a(mVar, this.f21727a);
                }
            } catch (Exception e) {
                C8672v.m24878d(NativeController.f21627e, C8800a.m25352a(e));
            }
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

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C2456d m25398e() {
        C2456d e = C2445b.m6020a().mo16292e("", this.f21660j);
        this.f21645S = e;
        if (e == null) {
            this.f21645S = C2456d.m6070d(this.f21660j);
        }
        return this.f21645S;
    }

    /* renamed from: b */
    private List<Campaign> m25384b(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign remove = list.remove(size);
                    C8799c.m25351a(campaignEx.getType()).mo58483a(this.f21660j, remove, this.f21643Q);
                    C8672v.m24874a(f21627e, "remove no videoURL ads:" + remove);
                }
            }
        }
        return list;
    }

    /* renamed from: c */
    private List<Campaign> m25393c(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign next : list) {
                if (next instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) next;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m25375a(List<Campaign> list, C8814b bVar) {
        m25401f();
        final long currentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.f21642P = timer;
        final C8814b bVar2 = bVar;
        final List<Campaign> list2 = list;
        timer.schedule(new TimerTask() {
            public final void run() {
                boolean z;
                if (System.currentTimeMillis() - currentTimeMillis >= 60000) {
                    bVar2.mo58504a();
                    NativeController.this.m25401f();
                    return;
                }
                int o = C8660r.m24840o(NativeController.this.f21659i);
                int j = NativeController.this.m25398e().mo16320j();
                if (o != 9 && j == 2) {
                    bVar2.mo58504a();
                    NativeController.this.m25401f();
                } else if (j == 3) {
                    bVar2.mo58504a();
                    NativeController.this.m25401f();
                } else {
                    loop0:
                    while (true) {
                        z = false;
                        for (Campaign campaign : list2) {
                            String id = campaign.getId();
                            if (campaign instanceof CampaignEx) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(id);
                                CampaignEx campaignEx = (CampaignEx) campaign;
                                sb.append(campaignEx.getVideoUrlEncode());
                                sb.append(campaignEx.getBidToken());
                                id = sb.toString();
                            }
                            C9641a a = C9645c.getInstance().mo63652a(NativeController.this.f21660j, id);
                            if (a != null && C9670k.m27583a(a, NativeController.this.m25398e().mo16314e())) {
                                z = true;
                            }
                        }
                        break loop0;
                    }
                    if (z) {
                        bVar2.mo58504a();
                        NativeController.this.m25401f();
                    }
                }
            }
        }, 0, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25401f() {
        Timer timer = this.f21642P;
        if (timer != null) {
            timer.cancel();
            this.f21642P = null;
        }
    }

    /* renamed from: b */
    public final String mo58495b() {
        return this.f21644R;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public List<Campaign> m25396d(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign next : list) {
            if (next instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) next;
                if (TextUtils.isEmpty(this.f21643Q) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.f21643Q) && TextUtils.equals(campaignEx.getBidToken(), this.f21643Q)) {
                    arrayList.add(next);
                }
            } else {
                arrayList2.add(next);
            }
        }
        return TextUtils.isEmpty(this.f21643Q) ? arrayList2 : arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m25369a(NativeController nativeController, CampaignEx campaignEx) {
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57761e() != null) {
                C6765a.m20559a(nativeController.f21659i, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57761e(), false, false);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25370a(NativeController nativeController, final CampaignEx campaignEx, View view, List list, AdSession adSession) {
        try {
            C88107 r0 = new C8820a.C8824a() {
                /* renamed from: a */
                public final void mo58503a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
                    if (arrayList != null && arrayList.size() > 0) {
                        C8838b.m25512a(campaignEx, NativeController.this.f21659i, NativeController.this.f21660j, NativeController.this.f21657g);
                    }
                }
            };
            C8820a aVar = new C8820a(list, r0, new Handler(Looper.getMainLooper()));
            aVar.mo58514a(view);
            if (nativeController.f21633G != null) {
                nativeController.f21633G.add(aVar);
            }
            if (nativeController.f21634H != null) {
                nativeController.f21634H.add(r0);
            }
            if (adSession != null) {
                AdEvents.createAdEvents(adSession).impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24878d(f21627e, "please import the videocommon and nativex aar");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0103 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m25388b(com.mbridge.msdk.mbnative.controller.NativeController r12, java.util.List r13) {
        /*
            java.lang.String r0 = "com.mbridge.msdk.videocommon.download.c"
            if (r13 == 0) goto L_0x0113
            int r1 = r13.size()     // Catch:{ all -> 0x010b }
            if (r1 <= 0) goto L_0x0113
            java.lang.String r1 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0103 }
            java.lang.Class.forName(r0)     // Catch:{ all -> 0x0103 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "com.mbridge.msdk.videocommon.listener.a"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r2 = "getInstance"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0103 }
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r4)     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r4 = "createUnitCache"
            r6 = 5
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0103 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r3] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r10 = 2
            r7[r10] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0103 }
            r11 = 3
            r7[r11] = r8     // Catch:{ all -> 0x0103 }
            r8 = 4
            r7[r8] = r1     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r1 = r0.getMethod(r4, r7)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0103 }
            android.content.Context r6 = r12.f21659i     // Catch:{ all -> 0x0103 }
            r4[r3] = r6     // Catch:{ all -> 0x0103 }
            java.lang.String r6 = r12.f21660j     // Catch:{ all -> 0x0103 }
            r4[r9] = r6     // Catch:{ all -> 0x0103 }
            r4[r10] = r13     // Catch:{ all -> 0x0103 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0103 }
            r4[r11] = r6     // Catch:{ all -> 0x0103 }
            r4[r8] = r5     // Catch:{ all -> 0x0103 }
            r1.invoke(r2, r4)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "load"
            java.lang.Class[] r4 = new java.lang.Class[r9]     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = r12.f21660j     // Catch:{ all -> 0x0103 }
            r1[r3] = r4     // Catch:{ all -> 0x0103 }
            r0.invoke(r2, r1)     // Catch:{ all -> 0x0103 }
        L_0x0079:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0103 }
        L_0x007d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r0.getImageUrl()     // Catch:{ all -> 0x0103 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0103 }
            if (r1 != 0) goto L_0x00ad
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0103 }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r2 = r0.getImageUrl()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.mbnative.controller.NativeController$2 r3 = new com.mbridge.msdk.mbnative.controller.NativeController$2     // Catch:{ all -> 0x0103 }
            r3.<init>()     // Catch:{ all -> 0x0103 }
            r1.mo57883a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p302c.C8484c) r3)     // Catch:{ all -> 0x0103 }
        L_0x00ad:
            java.lang.String r1 = "com.mbridge.msdk.videocommon.download.g"
            java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r0.getendcard_url()     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007d }
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = ".zip"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x007d }
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = "md5filename"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x007d }
            if (r2 == 0) goto L_0x00e7
            com.mbridge.msdk.videocommon.download.g r2 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo63670b((java.lang.String) r1)     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.mbnative.controller.NativeController$g r3 = new com.mbridge.msdk.mbnative.controller.NativeController$g     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r12.f21660j     // Catch:{ Exception -> 0x007d }
            r3.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x007d }
            r0.mo63671b(r1, r3)     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x00e7:
            com.mbridge.msdk.videocommon.download.h r2 = com.mbridge.msdk.videocommon.download.C9661h.m27556a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo63674b(r1)     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.mbnative.controller.NativeController$d r3 = new com.mbridge.msdk.mbnative.controller.NativeController$d     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r12.f21660j     // Catch:{ Exception -> 0x007d }
            r3.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x007d }
            r0.mo63671b(r1, r3)     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x0103:
            java.lang.String r12 = f21627e     // Catch:{ all -> 0x010b }
            java.lang.String r13 = "please import the videocommon and nativex aar"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r12, r13)     // Catch:{ all -> 0x010b }
            goto L_0x0113
        L_0x010b:
            r12 = move-exception
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r13 == 0) goto L_0x0113
            r12.printStackTrace()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.m25388b(com.mbridge.msdk.mbnative.controller.NativeController, java.util.List):void");
    }

    /* renamed from: a */
    static /* synthetic */ List m25364a(NativeController nativeController, List list, boolean z) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = (Campaign) list.get(size);
                String id = campaign.getId();
                boolean z2 = campaign instanceof CampaignEx;
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb.append(campaignEx.getVideoUrlEncode());
                    sb.append(campaignEx.getBidToken());
                    id = sb.toString();
                }
                C9641a a = C9645c.getInstance().mo63652a(nativeController.f21660j, id);
                if (z) {
                    if (a == null || !C9670k.m27583a(a, nativeController.m25398e().mo16314e())) {
                        C8799c.m25351a(campaign.getType()).mo58483a(nativeController.f21660j, (Campaign) list.remove(size), nativeController.f21643Q);
                    }
                } else if (z2) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (a == null || !C9670k.m27583a(a, nativeController.m25398e().mo16314e()))) {
                        C8799c.m25351a(campaign.getType()).mo58483a(nativeController.f21660j, (Campaign) list.remove(size), nativeController.f21643Q);
                    }
                }
            }
        }
        return list;
    }
}
