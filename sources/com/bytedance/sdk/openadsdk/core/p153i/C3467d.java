package com.bytedance.sdk.openadsdk.core.p153i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f;
import com.bytedance.sdk.component.p108d.p111c.C2804f;
import com.bytedance.sdk.component.p108d.p117d.C2815g;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.p118e.p120b.C2849d;
import com.bytedance.sdk.component.p118e.p121c.C2856c;
import com.bytedance.sdk.component.p118e.p121c.C2857d;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2893e;
import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p133c.C3150d;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3869f;
import com.bytedance.sdk.openadsdk.p178l.C3884m;
import com.bytedance.sdk.openadsdk.p178l.C3889p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.d */
/* compiled from: SdkSettingsHelper */
public class C3467d implements Runnable {

    /* renamed from: d */
    private static final AtomicLong f8581d = new AtomicLong(0);

    /* renamed from: e */
    private static volatile C3467d f8582e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f8583f = false;

    /* renamed from: g */
    private static boolean f8584g = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3465b f8585a;

    /* renamed from: b */
    private final Context f8586b;

    /* renamed from: c */
    private final Executor f8587c;

    /* renamed from: com.bytedance.sdk.openadsdk.core.i.d$a */
    /* compiled from: SdkSettingsHelper */
    private class C3469a extends BroadcastReceiver {
        private C3469a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(C2736e.e1659536876632dc("b^opcZoc"), -1);
                if (intExtra == 1) {
                    long longExtra = intent.getLongExtra(C2736e.e1659536876632dc("b^opcZrnel"), -1);
                    if (longExtra > 0) {
                        C3467d.m10688d().set(longExtra);
                    }
                } else if (intExtra == 2) {
                    try {
                        if (C3467d.this.f8585a != null) {
                            C3467d.this.f8585a.mo19818a();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private C3467d(C3465b bVar) {
        this.f8585a = bVar == null ? C3513m.m10973h() : bVar;
        this.f8586b = C3513m.m10963a();
        this.f8587c = Executors.newSingleThreadExecutor();
        if (C3948b.m12959c()) {
            try {
                this.f8586b.registerReceiver(new C3469a(), new IntentFilter(C2856c.c1659536876586dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T")));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m10676a(Context context) {
        if (context == null || !m10687c(context)) {
            return -2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(C2804f.f1659536876622dc("I@@WGCY`lyxJ|}bfub"), -1);
    }

    /* renamed from: a */
    public static C3467d m10678a(C3465b bVar) {
        Class<C3467d> cls = C3467d.class;
        if (f8582e == null) {
            synchronized (cls) {
                if (f8582e == null) {
                    f8582e = new C3467d(bVar);
                }
            }
        }
        return f8582e;
    }

    /* renamed from: a */
    private JSONObject m10679a(JSONObject jSONObject) {
        return f8584g ? C2888a.m8062a(jSONObject) : jSONObject;
    }

    /* renamed from: a */
    public static void m10680a() {
        try {
            Context a = C3513m.m10963a();
            File file = new File(Build.VERSION.SDK_INT >= 24 ? new File(a.getDataDir(), C2815g.g1659536876620dc("sicqaaYwzllx")) : new File(a.getDatabasePath(C2815g.g1659536876620dc("1")).getParentFile().getParentFile(), C2815g.g1659536876620dc("sicqaaYwzllx")), C2815g.g1659536876620dc("tu]p`nYtm}~bbj}!h|~"));
            if (file.exists()) {
                if (file.isFile()) {
                    String replace = file.getName().replace(C2815g.g1659536876620dc(".yoo"), "");
                    if (Build.VERSION.SDK_INT >= 24) {
                        a.deleteSharedPreferences(replace);
                    } else {
                        a.getSharedPreferences(replace, 0).edit().clear().apply();
                        C2894f.m8086c(file);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m10681a(long j) {
        if (j > 0 && C3513m.m10963a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C2856c.c1659536876586dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C2856c.c1659536876586dc("b^opcZoc"), 1);
                intent.putExtra(C2856c.c1659536876586dc("b^opcZrnel"), j);
                C3513m.m10963a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10683a(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                int intValue = Integer.valueOf(map.get(C2722f.f1659536876631dc("abvjr`+dgg~yca"))).intValue();
                long longValue = Long.valueOf(map.get(C2722f.f1659536876631dc("tr"))).longValue();
                String str2 = map.get(C2722f.f1659536876631dc("prv"));
                String a = C2414b.m5821a(str + intValue + longValue);
                if (a != null && a.equalsIgnoreCase(str2)) {
                    i = intValue;
                }
            }
        } catch (Throwable unused) {
        }
        C3470e.m10696a(i);
    }

    /* renamed from: b */
    public static String m10684b(Context context) {
        return context != null ? PreferenceManager.getDefaultSharedPreferences(context).getString(C3471f.f8592b, "") : "";
    }

    /* renamed from: b */
    public static void m10685b() {
        if (C3513m.m10963a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C2856c.c1659536876586dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C2856c.c1659536876586dc("b^opcZoc"), 2);
                C3513m.m10963a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        switch(r1) {
            case 91: goto L_0x0016;
            case 92: goto L_0x0014;
            case 93: goto L_0x0014;
            default: goto L_0x0013;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        f8583f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = '[';
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ boolean m10686b(boolean r2) {
        /*
        L_0x0000:
            r0 = 93
            r1 = r0
        L_0x0003:
            switch(r0) {
                case 92: goto L_0x000b;
                case 93: goto L_0x0010;
                case 94: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0000
        L_0x0007:
            r0 = 4
            if (r1 > r0) goto L_0x000f
            goto L_0x0000
        L_0x000b:
            switch(r1) {
                case 21: goto L_0x0014;
                case 22: goto L_0x000f;
                case 23: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0010
        L_0x000f:
            return r2
        L_0x0010:
            switch(r1) {
                case 91: goto L_0x0016;
                case 92: goto L_0x0014;
                case 93: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x001b
        L_0x0014:
            f8583f = r2
        L_0x0016:
            r0 = 94
            r1 = 75
            goto L_0x0003
        L_0x001b:
            r1 = 91
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p153i.C3467d.m10686b(boolean):boolean");
    }

    /* renamed from: c */
    private static boolean m10687c(Context context) {
        if (context == null) {
            return true;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return (defaultSharedPreferences.getInt(C2804f.f1659536876622dc("I@@WGCYDeyYogDJ"), Integer.MIN_VALUE) == Integer.MIN_VALUE && defaultSharedPreferences.getInt(C2804f.f1659536876622dc("I@@WGCYDeyYog[k}cx}}"), Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: d */
    static /* synthetic */ AtomicLong m10688d() {
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return f8581d;
    }

    /* renamed from: f */
    private boolean m10690f() {
        return TextUtils.isEmpty(C3457h.m10580d().mo19764f());
    }

    /* renamed from: g */
    private JSONObject m10691g() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        C3898x.m12763a(jSONObject, true);
        try {
            int j = C3457h.m10580d().mo19770j();
            String f1659536876631dc = C2722f.f1659536876631dc("sdvwmka");
            C2905l.m8111b(f1659536876631dc, C2722f.f1659536876631dc("Sdvwmkat  $bJjbDavf5+") + C3513m.m10973h().mo19884x());
            jSONObject.put(C2722f.f1659536876631dc("mnffh"), Build.MODEL);
            jSONObject.put(C2722f.f1659536876631dc("ddtjg`Yda}s"), C3898x.m12826n());
            C3471f h = C3513m.m10973h();
            if (h.mo19876p(C2722f.f1659536876631dc("g`kg"))) {
                jSONObject.put(C2736e.e1659536876632dc("g`kg"), C3970a.m13090a().mo20862b());
            }
            jSONObject.put(C2722f.f1659536876631dc("gerq"), j);
            jSONObject.put(C2722f.f1659536876631dc("cnrse"), C3457h.m10580d().mo19769i());
            jSONObject.put(C2722f.f1659536876631dc("cbrb"), C3457h.m10580d().mo19782v());
            String f1659536876631dc2 = C2722f.f1659536876631dc("SeiPaqrnfnyCia~jb");
            C2905l.m8114c(f1659536876631dc2, C2722f.f1659536876631dc("cnrse%;") + C3457h.m10580d().mo19769i());
            if (h.mo19876p(C2722f.f1659536876631dc("mba"))) {
                jSONObject.put(C2736e.e1659536876632dc("mba"), C3889p.m12704b());
            }
            jSONObject.put(C2722f.f1659536876631dc("cnlm[qwm"), C3898x.m12832p(this.f8586b));
            jSONObject.put(C2722f.f1659536876631dc("or"), 1);
            jSONObject.put(C2722f.f1659536876631dc("owgqw`gX~lxxeb`Pdhbv"), 1);
            jSONObject.put(C2722f.f1659536876631dc("or]uawungg"), String.valueOf(Build.VERSION.RELEASE));
            jSONObject.put(C2722f.f1659536876631dc("sei\\r`ttafd"), C2722f.f1659536876631dc("4/7-4+1"));
            jSONObject.put(C2736e.e1659536876632dc("l`ldqdab"), C3472j.m10773a());
            jSONObject.put(C2736e.e1659536876632dc("thof[iim"), C3898x.m12834q());
            jSONObject.put(C2736e.e1659536876632dc("p`ahebcXfhgn"), C3898x.m12785d());
            boolean c = C3898x.m12780c(this.f8586b, C3898x.m12785d());
            String e1659536876632dc = C2736e.e1659536876632dc("irCstiodi}cdbKa}uv`|a{r");
            C2905l.m8114c(e1659536876632dc, C2736e.e1659536876632dc("irCstiodi}cdbKa}uv`|a{r-") + c);
            String e1659536876632dc2 = C2736e.e1659536876632dc("pnqjplii");
            if (!c) {
                i = 2;
            }
            jSONObject.put(e1659536876632dc2, i);
            jSONObject.put(C2736e.e1659536876632dc("aqr\\r`ttafd"), C3898x.m12797f());
            jSONObject.put(C2736e.e1659536876632dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C2736e.e1659536876632dc("utkg"), C3472j.m10778c(this.f8586b));
            if (!(C3457h.m10580d() == null || C3457h.m10580d().mo19764f() == null)) {
                jSONObject.put(C2736e.e1659536876632dc("aqr\\ma"), C3457h.m10580d().mo19764f());
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(C2736e.e1659536876632dc("tr"), currentTimeMillis);
            String str = "";
            if (!(C3457h.m10580d() == null || C3457h.m10580d().mo19764f() == null)) {
                str = C3457h.m10580d().mo19764f().concat(String.valueOf(currentTimeMillis)).concat(C2736e.e1659536876632dc("4/7-4+1"));
            }
            jSONObject.put(C2736e.e1659536876632dc("rds\\wlai"), C2893e.m8077a(str));
            jSONObject.put(C2736e.e1659536876632dc("tbqwvlh`"), m10684b(this.f8586b));
            jSONObject.put(C2736e.e1659536876632dc("tbd\\cavu"), m10676a(this.f8586b));
            jSONObject.put(C2736e.e1659536876632dc("llv"), C3869f.m12612b());
            jSONObject.put(C2736e.e1659536876632dc("lnabh`Ykigm~mjk"), C3869f.m12618c());
            jSONObject.put(C2736e.e1659536876632dc("cicmj`j"), C2736e.e1659536876632dc("m`km"));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo19820a(boolean z) {
        try {
            if (!m10690f()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (z || currentTimeMillis - f8581d.get() >= 600000) {
                    f8581d.set(currentTimeMillis);
                    if (C3948b.m12959c()) {
                        m10681a(currentTimeMillis);
                    }
                    this.f8587c.execute(this);
                }
            }
        } catch (Throwable th) {
            C2905l.m8106a(C2857d.d1659536876571dc("SeiPaqrnfnyCia~jb"), C2857d.d1659536876571dc("lncg$vbl(zoxd`hc1wafzd-8"), th);
        }
    }

    /* renamed from: c */
    public void mo19821c() {
        C3869f.m12627g();
    }

    public void run() {
        if (!C3884m.m12674b(this.f8586b)) {
            try {
                this.f8585a.mo19818a();
            } catch (Throwable unused) {
            }
        } else if (!m10690f()) {
            C2905l.m8114c(C2857d.d1659536876571dc("SeiPaqrnfnyCia~jb"), C2857d.d1659536876571dc("Fdv`l%ub|}cek-|jadw``5ecykn"));
            JSONObject g = m10691g();
            C2849d b = C3792d.m12395a().mo20615b().mo17683b();
            try {
                b.mo17711a(C3150d.m9112a(b, C3898x.m12802g(C2857d.d1659536876571dc("/`rj+db(}gcdb\"}k{>av`ayj5"))));
                b.mo17714b(C2857d.d1659536876571dc("Urgq)Dabf}"), C3898x.m12768b());
            } catch (Exception unused2) {
            }
            b.mo17721c(m10679a(g).toString());
            b.mo17719a((C2842a) new C2842a() {
                /* JADX WARNING: Can't fix incorrect switch cases order */
                /* JADX WARNING: Can't wrap try/catch for region: R(9:12|(2:14|(3:16|17|18))|21|22|23|24|(3:26|42|30)|38|(2:41|44)(1:45)) */
                /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                    com.bytedance.sdk.openadsdk.core.p153i.C3467d.m10686b(true);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo17693a(com.bytedance.sdk.component.p118e.p120b.C2848c r6, com.bytedance.sdk.component.p118e.C2843b r7) {
                    /*
                        r5 = this;
                        r6 = 5
                        if (r7 == 0) goto L_0x0081
                        boolean r0 = r7.mo17701f()
                        if (r0 == 0) goto L_0x0081
                        java.lang.String r0 = r7.mo17699d()
                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x0081
                        r0 = 0
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0020 }
                        java.lang.String r2 = r7.mo17699d()     // Catch:{ JSONException -> 0x0020 }
                        r1.<init>(r2)     // Catch:{ JSONException -> 0x0020 }
                        goto L_0x0027
                    L_0x0020:
                        r1 = move-exception
                        org.json.JSONException r1 = (org.json.JSONException) r1
                        r1.printStackTrace()
                        r1 = r0
                    L_0x0027:
                        if (r1 == 0) goto L_0x0081
                        java.lang.String r2 = "cxrkaw"
                        java.lang.String r2 = com.bytedance.sdk.component.p118e.p122d.C2863b.b1659536876590dc(r2)
                        r3 = -1
                        int r2 = r1.optInt(r2, r3)
                        r3 = 3
                        if (r2 != r3) goto L_0x0065
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.p118e.p122d.C2863b.b1659536876590dc(r0)
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r0 = com.bytedance.sdk.component.utils.C2888a.m8064b(r0)
                        r2 = r0
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r2 = android.text.TextUtils.isEmpty(r2)
                        if (r2 != 0) goto L_0x0065
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0055 }
                        r2.<init>(r0)     // Catch:{ all -> 0x0055 }
                        r1 = r2
                        goto L_0x0065
                    L_0x0055:
                        r2 = move-exception
                        java.lang.String r3 = "SeiPaqrnfnyCia~jb"
                        java.lang.String r3 = com.bytedance.sdk.component.p118e.p122d.C2863b.b1659536876590dc(r3)
                        java.lang.String r4 = "sdvwmka'lh~j,h|}c )4"
                        java.lang.String r4 = com.bytedance.sdk.component.p118e.p122d.C2863b.b1659536876590dc(r4)
                        com.bytedance.sdk.component.utils.C2905l.m8106a(r3, r4, r2)
                    L_0x0065:
                        java.util.Map r7 = r7.mo17698c()     // Catch:{ all -> 0x006e }
                        com.bytedance.sdk.openadsdk.core.i.d r2 = com.bytedance.sdk.openadsdk.core.p153i.C3467d.this     // Catch:{ all -> 0x006e }
                        r2.m10683a(r0, r7)     // Catch:{ all -> 0x006e }
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p153i.C3467d.this     // Catch:{ all -> 0x009b }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f8585a     // Catch:{ all -> 0x009b }
                        r7.mo19819a(r1)     // Catch:{ all -> 0x009b }
                        boolean r7 = com.bytedance.sdk.openadsdk.core.p153i.C3467d.f8583f     // Catch:{ all -> 0x009b }
                        if (r7 != 0) goto L_0x009b
                        r7 = 11
                        r0 = r7
                        goto L_0x00a5
                    L_0x0081:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p153i.C3467d.this     // Catch:{ all -> 0x00a8 }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f8585a     // Catch:{ all -> 0x00a8 }
                        r7.mo19818a()     // Catch:{ all -> 0x00a8 }
                        r7 = 64
                        r0 = r6
                    L_0x008d:
                        switch(r7) {
                            case 63: goto L_0x0097;
                            case 64: goto L_0x0091;
                            case 65: goto L_0x0097;
                            default: goto L_0x0090;
                        }
                    L_0x0090:
                        goto L_0x00a5
                    L_0x0091:
                        r7 = 4
                        if (r0 == r7) goto L_0x0097
                        if (r0 == r6) goto L_0x00a8
                        r6 = 6
                    L_0x0097:
                        r6 = 1
                        com.bytedance.sdk.openadsdk.core.p153i.C3467d.m10686b((boolean) r6)     // Catch:{ all -> 0x009b }
                    L_0x009b:
                        boolean r6 = com.bytedance.sdk.openadsdk.multipro.C3948b.m12959c()
                        if (r6 == 0) goto L_0x00a4
                        com.bytedance.sdk.openadsdk.core.p153i.C3467d.m10685b()
                    L_0x00a4:
                        return
                    L_0x00a5:
                        r7 = 63
                        goto L_0x008d
                    L_0x00a8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p153i.C3467d.C34681.mo17693a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                    try {
                        C3467d.this.f8585a.mo19818a();
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            return;
        }
        mo19821c();
    }
}
