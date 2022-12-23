package com.mbridge.msdk.click.p217a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8420m;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.net.URLEncoder;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.click.a.a */
/* compiled from: RetryReportControl */
public final class C6772a {

    /* renamed from: a */
    public static String f17850a = "mtg_retry_report=1";

    /* renamed from: b */
    public static int f17851b = 10000;

    /* renamed from: c */
    public static int f17852c = 3;

    /* renamed from: d */
    public static int f17853d = 50;

    /* renamed from: e */
    public static int f17854e = 600000;

    /* renamed from: f */
    public static int f17855f = 0;

    /* renamed from: g */
    public static int f17856g = 1;

    /* renamed from: h */
    public static int f17857h = 2;

    /* renamed from: i */
    public static int f17858i = 3;

    /* renamed from: j */
    public static int f17859j = 4;

    /* renamed from: k */
    public static int f17860k = 5;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static String f17861l = "RetryReportControl";

    /* renamed from: o */
    private static int f17862o;

    /* renamed from: p */
    private static int f17863p;

    /* renamed from: m */
    private ConcurrentHashMap<String, C6777b> f17864m;

    /* renamed from: n */
    private C6778c f17865n;

    /* renamed from: q */
    private BroadcastReceiver f17866q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f17867r;

    /* renamed from: com.mbridge.msdk.click.a.a$a */
    /* compiled from: RetryReportControl */
    private static class C6775a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6772a f17871a = new C6772a();
    }

    private C6772a() {
        this.f17864m = new ConcurrentHashMap<>();
        this.f17865n = new C6778c(f17853d);
        this.f17867r = new C6776b(Looper.getMainLooper());
        C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
        f17852c = f.mo16243m();
        f17851b = f.mo16247o() * 1000;
        f17854e = f.mo16245n() * 1000;
        f17862o = f.mo16241l();
        f17863p = f.mo16239k();
        try {
            if (this.f17866q == null) {
                this.f17866q = new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            C6772a.this.f17867r.sendEmptyMessage(2);
                        }
                    }
                };
                Context g = C8388a.m23845e().mo56913g();
                if (g != null) {
                    g.registerReceiver(this.f17866q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C6772a m20600a() {
        return C6775a.f17871a;
    }

    /* renamed from: com.mbridge.msdk.click.a.a$b */
    /* compiled from: RetryReportControl */
    private static class C6776b extends Handler {
        public C6776b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof String) {
                    C6772a.m20600a().m20607a((String) obj, C6777b.f17872a);
                }
            } else if (i == 2) {
                C6772a.m20603a(C6772a.m20600a());
            }
        }
    }

    /* renamed from: a */
    private void m20605a(C6777b bVar) {
        String str;
        String str2;
        try {
            CampaignEx f = bVar.mo37069f();
            if (f != null) {
                String requestId = f.getRequestId();
                str = f.getRequestIdNotice();
                str2 = requestId;
            } else {
                str2 = "";
                str = str2;
            }
            m20602a(C8388a.m23845e().mo56913g(), bVar.mo37072i().toString(), bVar.mo37070g(), str2, str, bVar.mo37067d());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m20602a(Context context, String str, String str2, String str3, String str4, int i) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000105&");
                    stringBuffer.append("url=" + URLEncoder.encode(str2, "utf-8") + "&");
                    stringBuffer.append("type=" + i + "&");
                    if (!TextUtils.isEmpty(C8469a.f20750k)) {
                        stringBuffer.append("b=" + C8469a.f20750k + "&");
                    }
                    if (!TextUtils.isEmpty(C8469a.f20751l)) {
                        stringBuffer.append("c=" + C8469a.f20751l + "&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + URLEncoder.encode(str, "utf-8"));
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        m20601a(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m20601a(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24660a(str, context), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C6772a.f17861l, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8466k kVar = new C8466k();
                        kVar.mo57800c(str);
                        kVar.mo57795a(System.currentTimeMillis());
                        kVar.mo57794a(0);
                        kVar.mo57798b(ShareTarget.METHOD_POST);
                        kVar.mo57796a(C8543d.m24463a().f20952a);
                        C8420m.m24001a((C8412f) C8414g.m23969a(context)).mo57042a(kVar);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f17861l, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m20606a(String str) {
        Message obtainMessage = this.f17867r.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f17867r.sendMessageDelayed(obtainMessage, (long) f17851b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20607a(String str, int i) {
        String str2;
        C6778c cVar = this.f17865n;
        if (cVar != null) {
            C6777b a = cVar.mo37079b(str);
            this.f17865n.mo37076a(str);
            if (a == null) {
                C6777b bVar = this.f17864m.get(str);
                if (bVar != null && System.currentTimeMillis() <= bVar.mo37073j() + ((long) f17854e) && bVar.mo37071h() < f17852c && i != C6777b.f17873b) {
                    m20606a(str);
                }
            } else if (System.currentTimeMillis() <= a.mo37073j() + ((long) f17854e)) {
                a.mo37057a(i);
                this.f17864m.put(str, a);
                if (C8617ae.m24721b(str) == 0) {
                    str2 = str + "?" + f17850a;
                } else {
                    str2 = str + "&" + f17850a;
                }
                C6765a.m20558a(C8388a.m23845e().mo56913g(), a.mo37069f(), a.mo37068e(), str2, a.mo37061a(), a.mo37065b(), a.mo37067d());
            } else if (i != C6777b.f17873b) {
                m20605a(a);
            }
        }
    }

    /* renamed from: a */
    private boolean m20608a(int i) {
        return i == f17859j || i == f17858i;
    }

    /* renamed from: b */
    private boolean m20611b(int i) {
        return i == f17856g || i == f17857h;
    }

    /* renamed from: a */
    public final void mo37052a(String str, String str2, CampaignEx campaignEx, String str3, boolean z, boolean z2, int i) {
        boolean z3 = false;
        if ((m20608a(i) || m20611b(i) || i == f17860k) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f17850a, "").replace("&" + f17850a, "");
            if (this.f17864m == null) {
                this.f17864m = new ConcurrentHashMap<>();
            }
            C6777b remove = this.f17864m.remove(replace);
            if (remove == null) {
                remove = new C6777b(str, str2);
                remove.mo37062b(i);
                remove.mo37060a(z);
                remove.mo37064b(z2);
                remove.mo37058a(campaignEx);
                remove.mo37059a(str3);
            } else if (remove.mo37066c() != C6777b.f17873b) {
                remove.mo37063b(str2);
            }
            if ((m20608a(i) && f17862o != 0) || ((m20611b(i) && f17863p != 0) || i == f17860k)) {
                z3 = true;
            }
            if (!z3) {
                m20605a(remove);
            } else if (System.currentTimeMillis() < remove.mo37073j() + ((long) f17854e)) {
                if (this.f17865n == null) {
                    this.f17865n = new C6778c(f17853d);
                }
                this.f17865n.mo37077a(replace, remove);
                if (remove.mo37066c() != C6777b.f17872a) {
                    return;
                }
                if (remove.mo37071h() <= f17852c) {
                    m20606a(replace);
                } else {
                    m20605a(remove);
                }
            } else if (remove.mo37066c() == C6777b.f17872a) {
                m20605a(remove);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m20603a(C6772a aVar) {
        C6778c cVar = aVar.f17865n;
        if (cVar != null) {
            for (String a : cVar.mo37075a()) {
                aVar.m20607a(a, C6777b.f17873b);
            }
        }
    }
}
