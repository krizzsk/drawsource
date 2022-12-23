package com.bytedance.sdk.openadsdk.p176j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.j.g */
/* compiled from: PlayablePlugin */
public class C3828g {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public WeakReference<View> f9814A;

    /* renamed from: B */
    private C3799e f9815B;

    /* renamed from: C */
    private C3793a f9816C;

    /* renamed from: D */
    private C3797c f9817D;

    /* renamed from: E */
    private int f9818E = 0;

    /* renamed from: F */
    private int f9819F = 0;

    /* renamed from: G */
    private JSONObject f9820G = new JSONObject();

    /* renamed from: H */
    private String f9821H;

    /* renamed from: I */
    private String f9822I;

    /* renamed from: J */
    private String f9823J;

    /* renamed from: K */
    private Map<String, String> f9824K = new HashMap();

    /* renamed from: L */
    private JSONObject f9825L;

    /* renamed from: M */
    private String f9826M;

    /* renamed from: N */
    private JSONObject f9827N;

    /* renamed from: O */
    private float f9828O;

    /* renamed from: P */
    private int f9829P;

    /* renamed from: Q */
    private int f9830Q;

    /* renamed from: R */
    private int f9831R;

    /* renamed from: S */
    private int f9832S;

    /* renamed from: T */
    private int f9833T;

    /* renamed from: U */
    private int f9834U;

    /* renamed from: V */
    private int f9835V;

    /* renamed from: W */
    private int f9836W;

    /* renamed from: X */
    private int f9837X;

    /* renamed from: Y */
    private int f9838Y;

    /* renamed from: Z */
    private String f9839Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f9840a = new Handler(Looper.getMainLooper());

    /* renamed from: aa */
    private boolean f9841aa;

    /* renamed from: ab */
    private boolean f9842ab;

    /* renamed from: ac */
    private boolean f9843ac;

    /* renamed from: ad */
    private boolean f9844ad;

    /* renamed from: ae */
    private String f9845ae;

    /* renamed from: af */
    private String f9846af;

    /* renamed from: ag */
    private boolean f9847ag = false;

    /* renamed from: ah */
    private ViewTreeObserver.OnGlobalLayoutListener f9848ah = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            try {
                View view = (View) C3828g.this.f9814A.get();
                if (view != null) {
                    C3828g.this.m12468b(view);
                }
            } catch (Throwable th) {
                C3826f.m12457a("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Runnable f9849b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f9850c;

    /* renamed from: d */
    private Timer f9851d = new Timer();

    /* renamed from: e */
    private TimerTask f9852e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3794b f9853f;

    /* renamed from: g */
    private boolean f9854g = true;

    /* renamed from: h */
    private Set<String> f9855h = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));

    /* renamed from: i */
    private String f9856i = null;

    /* renamed from: j */
    private String f9857j = "embeded_ad";

    /* renamed from: k */
    private boolean f9858k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f9859l = true;

    /* renamed from: m */
    private boolean f9860m = true;

    /* renamed from: n */
    private long f9861n = 10;

    /* renamed from: o */
    private long f9862o = 10;

    /* renamed from: p */
    private long f9863p = 0;

    /* renamed from: q */
    private long f9864q = 0;

    /* renamed from: r */
    private long f9865r = -1;

    /* renamed from: s */
    private long f9866s = -1;

    /* renamed from: t */
    private long f9867t = -1;

    /* renamed from: u */
    private long f9868u = -1;

    /* renamed from: v */
    private int f9869v = 0;

    /* renamed from: w */
    private int f9870w = 0;

    /* renamed from: x */
    private C3837a f9871x = C3837a.MAIN;

    /* renamed from: y */
    private Context f9872y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f9873z;

    /* renamed from: com.bytedance.sdk.openadsdk.j.g$a */
    /* compiled from: PlayablePlugin */
    enum C3837a {
        MAIN,
        RIFLE
    }

    /* renamed from: q */
    public void mo20677q() {
    }

    /* renamed from: r */
    public void mo20678r() {
    }

    /* renamed from: w */
    public String mo20683w() {
        return "function playable_callJS(){return \"Android调用了JS的callJS方法\";}";
    }

    /* renamed from: h */
    static /* synthetic */ int m12476h(C3828g gVar) {
        int i = gVar.f9869v;
        gVar.f9869v = i + 1;
        return i;
    }

    private C3828g(Context context, WebView webView, C3797c cVar, C3793a aVar) {
        this.f9873z = webView;
        C3838h.m12530a(webView);
        mo20643a((View) webView);
        m12463a(context, cVar, aVar);
        m12477x();
    }

    /* renamed from: a */
    private void m12463a(Context context, C3797c cVar, C3793a aVar) {
        this.f9856i = UUID.randomUUID().toString();
        this.f9872y = context;
        this.f9815B = new C3799e(this);
        this.f9816C = aVar;
        this.f9817D = cVar;
    }

    /* renamed from: x */
    private void m12477x() {
        this.f9853f = new C3794b(this);
        this.f9849b = new Runnable() {
            public void run() {
                if (C3828g.this.f9859l) {
                    boolean unused = C3828g.this.f9859l = false;
                    C3828g.this.f9840a.removeCallbacks(C3828g.this.f9850c);
                    C3828g.this.mo20641a(2, "容器加载超时");
                }
            }
        };
        this.f9850c = new Runnable() {
            public void run() {
                if (C3828g.this.f9859l) {
                    boolean unused = C3828g.this.f9859l = false;
                    C3828g.this.f9840a.removeCallbacks(C3828g.this.f9849b);
                    C3828g.this.mo20641a(3, "JSSDK加载超时");
                }
            }
        };
        this.f9852e = new TimerTask() {
            public void run() {
                C3828g.this.f9840a.post(new Runnable() {
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 19 && C3828g.this.f9873z != null) {
                            C3828g.this.f9873z.evaluateJavascript("javascript:playable_callJS()", new ValueCallback<String>() {
                                /* renamed from: a */
                                public void onReceiveValue(String str) {
                                    if (C3828g.this.f9853f != null) {
                                        C3828g.this.f9853f.mo20624a(System.currentTimeMillis());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
    }

    /* renamed from: y */
    private boolean m12478y() {
        String str = this.f9826M;
        if (str != null) {
            return str.contains("/union-fe/playable/") || this.f9826M.contains("/union-fe-sg/playable/") || this.f9826M.contains("/union-fe-i18n/playable/");
        }
        return false;
    }

    /* renamed from: a */
    public void mo20643a(View view) {
        if (view != null) {
            try {
                this.f9814A = new WeakReference<>(view);
                m12468b(view);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f9848ah);
            } catch (Throwable th) {
                C3826f.m12457a("PlayablePlugin", "setViewForScreenSize error", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12468b(View view) {
        if (view != null) {
            try {
                if (this.f9818E != view.getWidth() || this.f9819F != view.getHeight()) {
                    this.f9818E = view.getWidth();
                    this.f9819F = view.getHeight();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", this.f9818E);
                    jSONObject.put("height", this.f9819F);
                    mo20644a(MraidJsMethods.RESIZE, jSONObject);
                    this.f9820G = jSONObject;
                }
            } catch (Throwable th) {
                C3826f.m12457a("PlayablePlugin", "resetViewDataJsonByView error", th);
            }
        }
    }

    /* renamed from: a */
    public Context mo20636a() {
        return this.f9872y;
    }

    /* renamed from: a */
    public C3828g mo20638a(String str, String str2) {
        this.f9824K.put(str, str2);
        return this;
    }

    /* renamed from: b */
    public Map<String, String> mo20648b() {
        return this.f9824K;
    }

    /* renamed from: a */
    public C3828g mo20637a(String str) {
        this.f9821H = str;
        return this;
    }

    /* renamed from: b */
    public C3828g mo20646b(String str) {
        this.f9822I = str;
        return this;
    }

    /* renamed from: c */
    public JSONObject mo20653c() {
        return this.f9827N;
    }

    /* renamed from: c */
    public C3828g mo20651c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.f9827N = jSONObject;
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    /* renamed from: d */
    public String mo20657d() {
        return this.f9822I;
    }

    /* renamed from: e */
    public String mo20660e() {
        return this.f9821H;
    }

    /* renamed from: d */
    public C3828g mo20656d(String str) {
        this.f9823J = str;
        return this;
    }

    /* renamed from: f */
    public String mo20663f() {
        return this.f9823J;
    }

    /* renamed from: e */
    public C3828g mo20659e(String str) {
        this.f9839Z = str;
        return this;
    }

    /* renamed from: g */
    public String mo20664g() {
        return this.f9839Z;
    }

    /* renamed from: a */
    public C3828g mo20640a(boolean z) {
        this.f9841aa = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.f9841aa);
            mo20644a("volumeChange", jSONObject);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    /* renamed from: h */
    public boolean mo20667h() {
        return this.f9841aa;
    }

    /* renamed from: b */
    public C3828g mo20647b(boolean z) {
        if (this.f9842ab == z) {
            return this;
        }
        this.f9842ab = z;
        m12472d(z ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", (JSONObject) null);
        if (this.f9866s == -1 && this.f9842ab) {
            this.f9866s = System.currentTimeMillis();
            m12472d("PL_sdk_page_show", (JSONObject) null);
        }
        if (this.f9842ab) {
            this.f9865r = System.currentTimeMillis();
        } else if (this.f9865r != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9865r;
            C3826f.m12456a("PlayablePlugin", "playable show time +" + currentTimeMillis);
            this.f9863p = this.f9863p + currentTimeMillis;
            this.f9865r = -1;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", this.f9842ab);
            mo20644a("viewableChange", jSONObject);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "setViewable error", th);
        }
        return this;
    }

    /* renamed from: i */
    public boolean mo20669i() {
        return this.f9842ab;
    }

    /* renamed from: c */
    public C3828g mo20652c(boolean z) {
        this.f9843ac = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f9843ac);
            mo20644a("change_playable_click", jSONObject);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    /* renamed from: j */
    public Set<String> mo20670j() {
        return this.f9815B.mo20628a();
    }

    /* renamed from: a */
    public void mo20644a(String str, JSONObject jSONObject) {
        if (C3826f.m12458a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CALL JS [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C3826f.m12456a("PlayablePlugin", sb.toString());
        }
        C3797c cVar = this.f9817D;
        if (cVar != null) {
            cVar.mo18485a(str, jSONObject);
        }
    }

    /* renamed from: k */
    public C3798d mo20671k() {
        return this.f9816C.mo18480a();
    }

    /* renamed from: l */
    public C3793a mo20672l() {
        return this.f9816C;
    }

    /* renamed from: m */
    public JSONObject mo20673m() {
        return this.f9820G;
    }

    /* renamed from: n */
    public JSONObject mo20674n() {
        return this.f9825L;
    }

    /* renamed from: a */
    public C3828g mo20639a(JSONObject jSONObject) {
        this.f9825L = jSONObject;
        return this;
    }

    /* renamed from: f */
    public C3828g mo20662f(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } catch (Throwable unused) {
            }
        }
        this.f9826M = str;
        return this;
    }

    /* renamed from: o */
    public JSONObject mo20675o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", (double) this.f9828O);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.f9829P);
            jSONObject2.put("height", this.f9830Q);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.f9832S);
            jSONObject3.put("y", this.f9831R);
            jSONObject3.put("width", this.f9833T);
            jSONObject3.put("height", this.f9834U);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f9836W);
            jSONObject4.put("y", this.f9835V);
            jSONObject4.put("width", this.f9837X);
            jSONObject4.put("height", this.f9838Y);
            jSONObject.put(TJAdUnitConstants.String.VISIBLE, jSONObject4);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    /* renamed from: p */
    public void mo20676p() {
        this.f9816C.mo18482b();
    }

    /* renamed from: g */
    public void mo20665g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f9867t = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f9866s != -1) {
                j = this.f9867t - this.f9866s;
            }
            jSONObject.put("playable_page_show_duration", j);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        m12472d("PL_sdk_html_load_start", jSONObject);
        if (this.f9858k && this.f9871x == C3837a.MAIN) {
            this.f9840a.postDelayed(this.f9849b, this.f9861n * 1000);
            this.f9840a.postDelayed(this.f9850c, this.f9862o * 1000);
            this.f9858k = false;
        }
    }

    /* renamed from: h */
    public void mo20666h(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f9868u = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f9867t != -1) {
                j = this.f9868u - this.f9867t;
            }
            jSONObject.put("playable_html_load_start_duration", j);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        m12472d("PL_sdk_html_load_finish", jSONObject);
        this.f9840a.removeCallbacks(this.f9849b);
        if (Build.VERSION.SDK_INT >= 19 && this.f9854g) {
            this.f9854g = false;
            this.f9873z.evaluateJavascript(mo20683w(), new ValueCallback<String>() {
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C3826f.m12456a("Playable_CrashMonitor", "加载注入js=" + str);
                }
            });
        }
        try {
            if (this.f9871x == C3837a.MAIN && this.f9860m && this.f9853f != null) {
                this.f9860m = false;
                this.f9853f.mo20624a(System.currentTimeMillis());
                this.f9851d.schedule(this.f9852e, 0, 1500);
                this.f9853f.mo20623a(1000);
            }
        } catch (Throwable th2) {
            C3826f.m12457a("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    /* renamed from: s */
    public void mo20679s() {
        this.f9840a.removeCallbacks(this.f9849b);
        this.f9840a.removeCallbacks(this.f9850c);
    }

    /* renamed from: b */
    public void mo20650b(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.optBoolean("success", true) && this.f9859l) {
            this.f9859l = false;
            this.f9840a.removeCallbacks(this.f9849b);
            this.f9840a.removeCallbacks(this.f9850c);
            mo20641a(4, "素材渲染失败");
        }
    }

    /* renamed from: b */
    private void m12467b(int i, String str) {
        if (this.f9816C != null && m12478y()) {
            this.f9816C.mo20617a(i, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20641a(int i, String str) {
        m12467b(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "reportRenderFatal error", th);
        }
        m12472d("PL_sdk_global_faild", jSONObject);
    }

    /* renamed from: t */
    public void mo20680t() {
        C3826f.m12456a("Playable_CrashMonitor", "-- 检测到页面卡顿超过2s  需要上报");
        m12472d("PL_sdk_page_stuck", (JSONObject) null);
        Timer timer = this.f9851d;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20649b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            m12472d(str, jSONObject);
        }
    }

    /* renamed from: b */
    private String m12466b(String str, String str2) {
        return String.format("rubeex://playable-lynx?accessKey=%1s&groupId=%2s&cardId=main", new Object[]{str, str2});
    }

    /* renamed from: d */
    private void m12472d(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("playable_event", str);
                jSONObject.put("playable_ts", System.currentTimeMillis());
                jSONObject.put("playable_viewable", this.f9842ab);
                jSONObject.put("playable_session_id", this.f9856i);
                if (this.f9871x == C3837a.MAIN) {
                    jSONObject.put("playable_url", this.f9826M);
                } else {
                    jSONObject.put("playable_url", m12466b(this.f9845ae, this.f9846af));
                }
                jSONObject.put("playable_is_prerender", this.f9844ad);
                jSONObject.put("playable_render_type", this.f9871x.ordinal());
                jSONObject.put("playable_sdk_version", "5.2.2");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ad_extra_data", jSONObject);
                jSONObject2.put("tag", this.f9857j);
                jSONObject2.put("nt", 4);
                jSONObject2.put("category", "umeng");
                jSONObject2.put("is_ad_event", "1");
                jSONObject2.put("refer", "playable");
                jSONObject2.put("value", this.f9825L.opt(BidResponsedEx.KEY_CID));
                jSONObject2.put("log_extra", this.f9825L.opt("log_extra"));
                if (this.f9816C != null) {
                    if (this.f9871x == C3837a.MAIN) {
                        if (m12478y()) {
                            C3826f.m12456a("PlayablePlugin", "reportEvent by ActionProxy");
                            this.f9816C.mo20618a("playable_track", jSONObject2);
                            this.f9816C.mo18484c(jSONObject);
                            return;
                        }
                    }
                    if (this.f9871x != C3837a.MAIN) {
                        C3826f.m12456a("PlayablePlugin", "reportEvent by ActionProxy");
                        this.f9816C.mo20618a("playable_track", jSONObject2);
                        this.f9816C.mo18484c(jSONObject);
                        return;
                    }
                    C3826f.m12456a("PlayablePlugin", "reportEvent error no not playable url");
                    return;
                }
                C3826f.m12456a("PlayablePlugin", "reportEvent error no impl");
            } catch (Throwable th) {
                C3826f.m12457a("PlayablePlugin", "reportEvent error", th);
            }
        }
    }

    /* renamed from: i */
    public void mo20668i(String str) {
        this.f9840a.post(new Runnable() {
            public void run() {
                C3828g.m12476h(C3828g.this);
            }
        });
    }

    /* renamed from: u */
    public void mo20681u() {
        this.f9828O = 0.0f;
        this.f9829P = 0;
        this.f9830Q = 0;
        this.f9831R = 0;
        this.f9832S = 0;
        this.f9833T = 0;
        this.f9834U = 0;
        this.f9835V = 0;
        this.f9836W = 0;
        this.f9837X = 0;
        this.f9838Y = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|(2:7|(1:9)(1:10))|11|12|13|14|(1:16)|17|(1:19)|22|23|24|25|(1:27)|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[Catch:{ all -> 0x00b9 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20682v() {
        /*
            r7 = this;
            boolean r0 = r7.f9847ag
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r7.f9847ag = r0
            r0 = 0
            r7.f9864q = r0
            r7.mo20681u()
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f9814A     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            r2 = 16
            if (r1 < r2) goto L_0x0029
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f9848ah     // Catch:{ all -> 0x0032 }
            r0.removeOnGlobalLayoutListener(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0032
        L_0x0029:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f9848ah     // Catch:{ all -> 0x0032 }
            r0.removeGlobalOnLayoutListener(r1)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            com.bytedance.sdk.openadsdk.j.e r0 = r7.f9815B     // Catch:{ all -> 0x0037 }
            r0.mo20630b()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            java.util.Timer r0 = r7.f9851d     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0040
            java.util.Timer r0 = r7.f9851d     // Catch:{ all -> 0x004d }
            r0.cancel()     // Catch:{ all -> 0x004d }
        L_0x0040:
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f9853f     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0064
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f9853f     // Catch:{ all -> 0x004d }
            r0.mo20622a()     // Catch:{ all -> 0x004d }
            r0 = 0
            r7.f9853f = r0     // Catch:{ all -> 0x004d }
            goto L_0x0064
        L_0x004d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "发生crash -- "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Playable_CrashMonitor"
            com.bytedance.sdk.openadsdk.p176j.C3826f.m12456a(r1, r0)
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x007c }
            r0.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_all_times"
            int r2 = r7.f9869v     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_hit_times"
            int r2 = r7.f9870w     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "PL_sdk_preload_times"
            r7.m12472d(r1, r0)     // Catch:{ all -> 0x007c }
        L_0x007c:
            long r0 = r7.f9865r     // Catch:{ all -> 0x00b9 }
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b9 }
            long r4 = r7.f9865r     // Catch:{ all -> 0x00b9 }
            long r0 = r0 - r4
            java.lang.String r4 = "PlayablePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r5.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "playable show time +"
            r5.append(r6)     // Catch:{ all -> 0x00b9 }
            r5.append(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b9 }
            com.bytedance.sdk.openadsdk.p176j.C3826f.m12456a(r4, r5)     // Catch:{ all -> 0x00b9 }
            long r4 = r7.f9863p     // Catch:{ all -> 0x00b9 }
            long r4 = r4 + r0
            r7.f9863p = r4     // Catch:{ all -> 0x00b9 }
            r7.f9865r = r2     // Catch:{ all -> 0x00b9 }
        L_0x00a8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00b9 }
            r0.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "playable_user_play_duration"
            long r2 = r7.f9863p     // Catch:{ all -> 0x00b9 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "PL_sdk_user_play_duration"
            r7.m12472d(r1, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p176j.C3828g.mo20682v():void");
    }

    /* renamed from: a */
    public void mo20642a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            jSONObject.put("description", str);
            jSONObject.put("failingUrl", str2);
        } catch (Throwable th) {
            C3826f.m12457a("PlayablePlugin", "onWebReceivedError error", th);
        }
        m12472d("PL_sdk_html_load_error", jSONObject);
        if (this.f9859l) {
            this.f9859l = false;
            this.f9840a.removeCallbacks(this.f9849b);
            this.f9840a.removeCallbacks(this.f9850c);
            mo20641a(1, "容器加载失败");
        }
    }

    /* renamed from: a */
    public void mo20645a(boolean z, String str, int i) {
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
                jSONObject.put("failingUrl", str);
            } catch (Throwable th) {
                C3826f.m12457a("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            m12472d("PL_sdk_html_load_error", jSONObject);
            if (this.f9859l) {
                this.f9859l = false;
                this.f9840a.removeCallbacks(this.f9849b);
                this.f9840a.removeCallbacks(this.f9850c);
                mo20641a(1, "容器加载失败");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20655c(JSONObject jSONObject) {
        this.f9816C.mo20619d(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20658d(JSONObject jSONObject) {
        this.f9816C.mo20620e(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20661e(JSONObject jSONObject) {
        this.f9816C.mo20621f(jSONObject);
    }

    /* renamed from: c */
    public JSONObject mo20654c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (C3826f.m12458a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayablePlugin JSB-REQ [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : str2);
            C3826f.m12456a("PlayablePlugin", sb.toString());
        }
        JSONObject a = this.f9815B.mo20629a(str, jSONObject);
        if (C3826f.m12458a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PlayablePlugin JSB-RSP [");
            sb2.append(str);
            sb2.append("] time:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ");
            if (a != null) {
                str2 = a.toString();
            }
            sb2.append(str2);
            C3826f.m12456a("PlayablePlugin", sb2.toString());
        }
        return a;
    }

    /* renamed from: a */
    public static C3828g m12461a(Context context, WebView webView, C3797c cVar, C3793a aVar) {
        if (webView == null || cVar == null || aVar == null) {
            return null;
        }
        return new C3828g(context, webView, cVar, aVar);
    }
}
