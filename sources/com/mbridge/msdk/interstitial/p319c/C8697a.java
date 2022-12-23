package com.mbridge.msdk.interstitial.p319c;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitial.p317a.C8692a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2452c;
import com.mbridge.msdk.p078c.C2456d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.interstitial.c.a */
/* compiled from: InterstitialController */
public final class C8697a {

    /* renamed from: a */
    public static String f21331a;

    /* renamed from: c */
    public static Map<String, Integer> f21332c = new HashMap();

    /* renamed from: d */
    public static Map<String, Integer> f21333d = new HashMap();

    /* renamed from: e */
    public static Map<String, C8701c> f21334e = new HashMap();

    /* renamed from: b */
    public boolean f21335b = false;

    /* renamed from: f */
    private String f21336f = "InterstitialController";

    /* renamed from: g */
    private Context f21337g;

    /* renamed from: h */
    private String f21338h;

    /* renamed from: i */
    private String f21339i;

    /* renamed from: j */
    private String f21340j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MBridgeIds f21341k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f21342l;

    /* renamed from: m */
    private C2456d f21343m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public InterstitialListener f21344n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f21345o = "";

    /* renamed from: p */
    private String f21346p = "";

    /* renamed from: q */
    private boolean f21347q = false;

    /* renamed from: a */
    public static void m25014a(String str, int i) {
        try {
            if (f21332c != null && !TextUtils.isEmpty(str)) {
                f21332c.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m25009a(String str) {
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || f21332c == null || !f21332c.containsKey(str) || (num = f21332c.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo58218a(InterstitialListener interstitialListener) {
        this.f21344n = interstitialListener;
    }

    public C8697a() {
        try {
            this.f21342l = new Handler(Looper.getMainLooper()) {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r6) {
                    /*
                        r5 = this;
                        if (r6 != 0) goto L_0x0003
                        return
                    L_0x0003:
                        int r0 = r6.what
                        r1 = 1
                        if (r0 == r1) goto L_0x00ce
                        r2 = 2
                        java.lang.String r3 = "can't show because unknow error"
                        java.lang.String r4 = ""
                        if (r0 == r2) goto L_0x009f
                        r2 = 3
                        if (r0 == r2) goto L_0x0083
                        r1 = 4
                        if (r0 == r1) goto L_0x0054
                        r6 = 6
                        if (r0 == r6) goto L_0x003b
                        r6 = 7
                        if (r0 == r6) goto L_0x001d
                        goto L_0x00e5
                    L_0x001d:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        r0 = 0
                        r6.f21335b = r0
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialClosed(r0)
                        goto L_0x00e5
                    L_0x003b:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialAdClick(r0)
                        goto L_0x00e5
                    L_0x0054:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f21344n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x006b
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x006b:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x0072
                        goto L_0x0073
                    L_0x0072:
                        r3 = r4
                    L_0x0073:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialShowFail(r0, r3)
                        goto L_0x00e5
                    L_0x0083:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        r6.f21335b = r1
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialShowSuccess(r0)
                        goto L_0x00e5
                    L_0x009f:
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r0 = r0.f21344n
                        if (r0 == 0) goto L_0x00e5
                        java.lang.Object r0 = r6.obj
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r0 = r6.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x00b6
                        java.lang.Object r6 = r6.obj
                        r4 = r6
                        java.lang.String r4 = (java.lang.String) r4
                    L_0x00b6:
                        boolean r6 = android.text.TextUtils.isEmpty(r4)
                        if (r6 == 0) goto L_0x00bd
                        goto L_0x00be
                    L_0x00bd:
                        r3 = r4
                    L_0x00be:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialLoadFail(r0, r3)
                        goto L_0x00e5
                    L_0x00ce:
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        if (r6 == 0) goto L_0x00e5
                        com.mbridge.msdk.interstitial.c.a r6 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.InterstitialListener r6 = r6.f21344n
                        com.mbridge.msdk.interstitial.c.a r0 = com.mbridge.msdk.interstitial.p319c.C8697a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f21341k
                        r6.onInterstitialLoadSuccess(r0)
                    L_0x00e5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p319c.C8697a.C86981.handleMessage(android.os.Message):void");
                }
            };
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58219a(Context context, Map<String, Object> map) {
        try {
            this.f21347q = false;
            if (!(map == null || context == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID))) {
                if (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) {
                    if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                        this.f21340j = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                    }
                    this.f21338h = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    this.f21337g = context;
                    if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                        this.f21339i = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    }
                    this.f21341k = new MBridgeIds(this.f21339i, this.f21338h);
                    this.f21347q = true;
                    return this.f21347q;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.f21347q = false;
        }
    }

    /* renamed from: a */
    public final void mo58217a() {
        try {
            if (this.f21337g == null) {
                m25018b("context is null");
            } else if (TextUtils.isEmpty(this.f21338h)) {
                m25018b("unitid is null");
            } else if (!this.f21347q) {
                m25018b("init error");
            } else {
                m25023d();
                try {
                    if (this.f21343m != null) {
                        int p = this.f21343m.mo16325p();
                        int u = this.f21343m.mo16331u();
                        if (p <= 0) {
                            p = 1;
                        }
                        if (u <= 0) {
                            u = 1;
                        }
                        int i = u * p;
                        if (f21333d != null && !TextUtils.isEmpty(this.f21338h)) {
                            f21333d.put(this.f21338h, Integer.valueOf(i));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                m25015a(false);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m25018b("can't show because unknow error");
        }
    }

    /* renamed from: b */
    public final String mo58220b() {
        if (this.f21335b) {
            return this.f21346p;
        }
        return this.f21345o;
    }

    /* renamed from: c */
    public final void mo58221c() {
        try {
            if (this.f21337g == null) {
                m25022c("context is null");
            } else if (TextUtils.isEmpty(this.f21338h)) {
                m25022c("unitid is null");
            } else if (!this.f21347q) {
                m25022c("init error");
            } else {
                m25023d();
                m25019b(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m25022c("can't show because unknow error");
        }
    }

    /* renamed from: d */
    private void m25023d() {
        try {
            m25025e();
            C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), this.f21338h);
            this.f21343m = e;
            if (e == null) {
                this.f21343m = C2456d.m6072f(this.f21338h);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m25015a(boolean z) {
        try {
            C8692a aVar = new C8692a(this.f21337g, this.f21338h, this.f21339i, this.f21340j, z);
            C8700b bVar = new C8700b(aVar);
            aVar.mo58205a(new C8699a(aVar, bVar));
            if (this.f21342l != null) {
                this.f21342l.postDelayed(bVar, 30000);
            }
            aVar.mo58206b();
        } catch (Exception e) {
            e.printStackTrace();
            if (!z) {
                m25018b("can't show because unknow error");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25019b(boolean z) {
        try {
            CampaignEx a = new C8692a(this.f21337g, this.f21338h, this.f21339i, this.f21340j, true).mo58204a();
            if (a != null) {
                m25011a(a);
            } else if (z) {
                m25015a(true);
            } else {
                m25022c("no ads available can show");
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f21344n != null) {
                m25022c("can't show because unknow error");
            }
        }
    }

    /* renamed from: a */
    private void m25011a(CampaignEx campaignEx) {
        C8701c cVar = new C8701c();
        if (f21334e != null && !TextUtils.isEmpty(this.f21338h)) {
            f21334e.put(this.f21338h, cVar);
        }
        Intent intent = new Intent(this.f21337g, MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f21338h)) {
            intent.putExtra("unitId", this.f21338h);
        }
        if (campaignEx != null) {
            this.f21346p = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f21337g;
        if (context != null) {
            context.startActivity(intent);
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$b */
    /* compiled from: InterstitialController */
    public class C8700b implements Runnable {

        /* renamed from: b */
        private C8692a f21353b;

        public C8700b(C8692a aVar) {
            this.f21353b = aVar;
        }

        public final void run() {
            try {
                if (this.f21353b != null) {
                    if (this.f21353b.mo58207c()) {
                        C8697a.this.m25022c("load timeout");
                    } else if (C8697a.this.f21344n != null) {
                        C8697a.this.m25018b("load timeout");
                    }
                    this.f21353b.mo58205a((C8699a) null);
                    this.f21353b = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$a */
    /* compiled from: InterstitialController */
    public class C8699a {

        /* renamed from: b */
        private C8692a f21350b;

        /* renamed from: c */
        private C8700b f21351c;

        public C8699a(C8692a aVar, C8700b bVar) {
            this.f21350b = aVar;
            this.f21351c = bVar;
        }

        /* renamed from: a */
        public final void mo58223a(boolean z, String str) {
            try {
                String unused = C8697a.this.f21345o = str;
                if (this.f21351c != null) {
                    if (C8697a.this.f21342l != null) {
                        C8697a.this.f21342l.removeCallbacks(this.f21351c);
                    }
                    if (z) {
                        C8697a.this.m25019b(false);
                    } else if (C8697a.this.f21344n != null) {
                        C8697a.m25024d(C8697a.this);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo58224b(boolean z, String str) {
            try {
                if (this.f21350b != null) {
                    this.f21350b.mo58205a((C8699a) null);
                    this.f21350b = null;
                }
                if (this.f21351c != null) {
                    if (C8697a.this.f21342l != null) {
                        C8697a.this.f21342l.removeCallbacks(this.f21351c);
                    }
                    if (z) {
                        if (C8697a.this.f21344n != null) {
                            C8697a.this.m25022c(str);
                        }
                    } else if (C8697a.this.f21344n != null) {
                        C8697a.this.m25018b(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.interstitial.c.a$c */
    /* compiled from: InterstitialController */
    public class C8701c {
        public C8701c() {
        }

        /* renamed from: a */
        public final void mo58227a(String str) {
            try {
                C8697a.this.m25022c(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo58226a() {
            try {
                C8697a.m25026e(C8697a.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo58228b() {
            try {
                if (C8697a.this.f21342l != null) {
                    C8697a.this.f21342l.sendEmptyMessage(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public final void mo58229c() {
            try {
                if (C8697a.this.f21342l != null) {
                    C8697a.this.f21342l.sendEmptyMessage(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25018b(String str) {
        try {
            if (this.f21342l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 2;
                this.f21342l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25022c(String str) {
        try {
            if (this.f21342l != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f21342l.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m25025e() {
        try {
            new C2452c().mo16303a(this.f21337g, (String) null, (String) null, this.f21338h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25024d(C8697a aVar) {
        Handler handler = aVar.f21342l;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m25026e(C8697a aVar) {
        Handler handler = aVar.f21342l;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }
}
