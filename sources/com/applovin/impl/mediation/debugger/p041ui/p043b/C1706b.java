package com.applovin.impl.mediation.debugger.p041ui.p043b;

import android.app.Activity;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1665a;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1666b;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1667c;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1668d;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p041ui.p043b.p044a.C1704a;
import com.applovin.impl.mediation.debugger.p041ui.p043b.p044a.C1705b;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1724e;
import com.applovin.impl.sdk.C1883e;
import com.applovin.impl.sdk.C1954j;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2048f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.b */
public class C1706b extends C1721d implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private C1969m f2507a;

    /* renamed from: b */
    private List<C1665a> f2508b;

    /* renamed from: d */
    private String f2509d;

    /* renamed from: e */
    private String f2510e;

    /* renamed from: f */
    private String f2511f;

    /* renamed from: g */
    private final StringBuilder f2512g = new StringBuilder("");

    /* renamed from: h */
    private final AtomicBoolean f2513h = new AtomicBoolean();

    /* renamed from: i */
    private boolean f2514i = false;

    /* renamed from: j */
    private List<C1671b> f2515j = new ArrayList();

    /* renamed from: k */
    private List<C1671b> f2516k = new ArrayList();

    /* renamed from: l */
    private List<C1671b> f2517l = new ArrayList();

    /* renamed from: m */
    private List<C1668d> f2518m = new ArrayList();

    /* renamed from: n */
    private List<C1668d> f2519n = new ArrayList();

    /* renamed from: o */
    private List<C1717c> f2520o = new ArrayList();

    /* renamed from: p */
    private List<C1717c> f2521p = new ArrayList();

    /* renamed from: q */
    private List<C1717c> f2522q = new ArrayList();

    /* renamed from: r */
    private List<C1717c> f2523r = new ArrayList();

    /* renamed from: s */
    private List<C1717c> f2524s = new ArrayList();

    /* renamed from: t */
    private List<C1717c> f2525t = new ArrayList();

    /* renamed from: u */
    private List<C1717c> f2526u = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$a */
    public enum C1708a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b */
    public enum C1709b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C1706b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private C1717c m3545a(String str, String str2) {
        C1717c.C1719a a = C1717c.m3602p().mo13764a(str);
        if (StringUtils.isValidString(str2)) {
            a.mo13769b(str2);
        } else {
            a.mo13761a(C2271R.C2272drawable.applovin_ic_x_mark);
            a.mo13771c(C2048f.m4936a(C2271R.color.applovin_sdk_xmarkColor, this.f2604c));
        }
        return a.mo13766a();
    }

    /* renamed from: a */
    private void m3546a(C1717c.C1719a aVar, String str) {
        aVar.mo13772c("MAX Ad Review").mo13773d(str).mo13761a(C2271R.C2272drawable.applovin_ic_x_mark).mo13771c(C2048f.m4936a(C2271R.color.applovin_sdk_xmarkColor, this.f2604c)).mo13765a(true);
    }

    /* renamed from: a */
    private void m3547a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.f2507a.mo14534a(C1867b.f3137al)).intValue()) {
            C2102v.m5107f("MediationDebuggerListAdapter", sb2);
            this.f2512g.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* renamed from: a */
    private void m3548a(List<C1671b> list) {
        List<C1671b> list2;
        for (C1671b next : list) {
            if (!next.mo13658g()) {
                if (next.mo13651a() == C1671b.C1672a.INCOMPLETE_INTEGRATION || next.mo13651a() == C1671b.C1672a.INVALID_INTEGRATION) {
                    list2 = this.f2515j;
                } else if (next.mo13651a() == C1671b.C1672a.COMPLETE) {
                    list2 = this.f2516k;
                } else if (next.mo13651a() == C1671b.C1672a.MISSING) {
                    list2 = this.f2517l;
                }
                list2.add(next);
            }
        }
    }

    /* renamed from: b */
    private void m3549b(List<C1665a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1665a e : list) {
            C1667c e2 = e.mo13627e();
            for (C1666b a : e2.mo13634a()) {
                hashSet.add(a.mo13629a());
            }
            for (C1666b a2 : e2.mo13635b()) {
                hashSet2.add(a2.mo13629a());
            }
        }
        this.f2518m = new ArrayList(hashSet);
        this.f2519n = new ArrayList(hashSet2);
        Collections.sort(this.f2518m);
        Collections.sort(this.f2519n);
    }

    /* renamed from: c */
    private List<C1717c> m3550c(List<C1671b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1671b aVar : list) {
            arrayList.add(new C1704a(aVar, this.f2604c));
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m3551l() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.f2604c, this.f2507a));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f2507a.mo14518J().mo13806a() ? TJAdUnitConstants.String.ENABLED : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f2507a.mo14529V().mo14829h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f2507a.mo14534a(C1867b.f3308dz);
        String a = C1883e.m4176a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = str3;
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(a)) {
            a = "Disabled";
        }
        sb4.append(a);
        sb.append(sb4.toString());
        if (this.f2507a.mo14577g() && (metaData = Utils.getMetaData(this.f2507a.mo14586p())) != null) {
            String str4 = metaData.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            sb5.append(str3);
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(C1954j.m4419a(this.f2604c));
        sb.append("\n========== NETWORKS ==========");
        for (C1671b w : this.f2516k) {
            m3547a(sb, w.mo13675w());
        }
        for (C1671b w2 : this.f2515j) {
            m3547a(sb, w2.mo13675w());
        }
        sb.append("\n========== AD UNITS ==========");
        for (C1665a f : this.f2508b) {
            m3547a(sb, f.mo13628f());
        }
        sb.append("\n========== END ==========");
        C2102v.m5107f("MediationDebuggerListAdapter", sb.toString());
        this.f2512g.append(sb.toString());
    }

    /* renamed from: m */
    private List<C1717c> m3552m() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f2604c.getPackageManager().getPackageInfo(this.f2604c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(C1717c.m3602p().mo13764a("Package Name").mo13769b(this.f2604c.getPackageName()).mo13766a());
        C1717c.C1719a a = C1717c.m3602p().mo13764a("App Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(a.mo13769b(str).mo13766a());
        arrayList.add(C1717c.m3602p().mo13764a("OS").mo13769b(Utils.getAndroidOSInfo()).mo13766a());
        arrayList.add(C1717c.m3602p().mo13764a("Account").mo13769b(StringUtils.isValidString(this.f2511f) ? this.f2511f : str2).mo13766a());
        C1717c.C1719a a2 = C1717c.m3602p().mo13764a("Mediation Provider");
        if (StringUtils.isValidString(this.f2507a.mo14590t())) {
            str2 = this.f2507a.mo14590t();
        }
        arrayList.add(a2.mo13769b(str2).mo13766a());
        arrayList.add(C1717c.m3602p().mo13764a("OM SDK Version").mo13769b(this.f2507a.mo14562al().mo14086c()).mo13766a());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c> m3553n() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c.m3602p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13764a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13769b((java.lang.String) r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13766a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f2507a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.p051c.C1867b.f3308dz
            java.lang.Object r1 = r1.mo14534a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c.m3602p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.mo13764a((java.lang.String) r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.mo13769b((java.lang.String) r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13766a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c.m3602p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo13764a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.impl.sdk.C1883e.m4176a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L_0x0096
            java.lang.String r3 = com.applovin.impl.sdk.C1883e.m4177b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L_0x0092
            com.applovin.impl.sdk.m r5 = r6.f2507a
            java.lang.String r5 = r5.mo14597z()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.m r3 = r6.f2507a
            boolean r3 = r3.mo14577g()
            if (r3 == 0) goto L_0x0083
            java.lang.String r3 = "SDK key is downloaded"
            goto L_0x0085
        L_0x0083:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L_0x0085:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0098
        L_0x0092:
            r1.mo13769b((java.lang.String) r2)
            goto L_0x009b
        L_0x0096:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L_0x0098:
            r6.m3546a((com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c.C1719a) r1, (java.lang.String) r2)
        L_0x009b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo13766a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f2507a
            boolean r1 = r1.mo14577g()
            if (r1 == 0) goto L_0x00ce
            com.applovin.impl.sdk.m r1 = r6.f2507a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.mo14586p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto L_0x00ce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto L_0x00c5
            r4 = r1
        L_0x00c5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.m3545a((java.lang.String) r1, (java.lang.String) r4)
            r0.add(r1)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p041ui.p043b.C1706b.m3553n():java.util.List");
    }

    /* renamed from: o */
    private List<C1717c> m3554o() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C1705b(C1954j.m4418a(), true, this.f2604c));
        arrayList.add(new C1705b(C1954j.m4423b(), false, this.f2604c));
        arrayList.add(new C1705b(C1954j.m4425c(), true, this.f2604c));
        return arrayList;
    }

    /* renamed from: p */
    private List<C1717c> m3555p() {
        ArrayList arrayList = new ArrayList(2);
        C1717c.C1719a p = C1717c.m3602p();
        arrayList.add(p.mo13764a("View Ad Units (" + this.f2508b.size() + ")").mo13762a(this.f2604c).mo13765a(true).mo13766a());
        arrayList.add(m3556q());
        return arrayList;
    }

    /* renamed from: q */
    private C1717c m3556q() {
        C1717c.C1719a p = C1717c.m3602p();
        if (!this.f2507a.mo14518J().mo13806a()) {
            p.mo13762a(this.f2604c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2507a.mo14518J().mo13809c() != null ? "" : "Select ");
        sb.append("Live Network");
        return p.mo13764a(sb.toString()).mo13769b(this.f2507a.mo14518J().mo13806a() ? "Enable" : null).mo13767b(-16776961).mo13773d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").mo13765a(true).mo13766a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13703a(int i) {
        return (i == C1709b.APP_INFO.ordinal() ? this.f2520o : i == C1709b.MAX.ordinal() ? this.f2521p : i == C1709b.PRIVACY.ordinal() ? this.f2522q : i == C1709b.ADS.ordinal() ? this.f2523r : i == C1709b.INCOMPLETE_NETWORKS.ordinal() ? this.f2524s : i == C1709b.COMPLETED_NETWORKS.ordinal() ? this.f2525t : this.f2526u).size();
    }

    /* renamed from: a */
    public void mo13733a(List<C1671b> list, List<C1665a> list2, String str, String str2, String str3, C1969m mVar) {
        Activity an;
        this.f2507a = mVar;
        this.f2508b = list2;
        this.f2509d = str;
        this.f2510e = str2;
        this.f2511f = str3;
        if (!(this.f2604c instanceof Activity) && (an = mVar.mo14564an()) != null) {
            this.f2604c = an;
        }
        if (list != null && this.f2513h.compareAndSet(false, true)) {
            mVar.mo14509A().mo15012b("MediationDebuggerListAdapter", "Populating networks...");
            m3548a(list);
            m3549b(list2);
            this.f2520o.addAll(m3552m());
            this.f2521p.addAll(m3553n());
            this.f2522q.addAll(m3554o());
            this.f2523r.addAll(m3555p());
            this.f2524s = m3550c(this.f2515j);
            this.f2525t = m3550c(this.f2516k);
            this.f2526u = m3550c(this.f2517l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.f2604c).subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) arrayList);
            m3551l();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1706b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void mo13734a(boolean z) {
        this.f2514i = z;
    }

    /* renamed from: a */
    public boolean mo13704a() {
        return this.f2513h.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13705b() {
        return C1709b.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1717c mo13706b(int i) {
        return i == C1709b.APP_INFO.ordinal() ? new C1724e("APP INFO") : i == C1709b.MAX.ordinal() ? new C1724e("MAX") : i == C1709b.PRIVACY.ordinal() ? new C1724e("PRIVACY") : i == C1709b.ADS.ordinal() ? new C1724e("ADS") : i == C1709b.INCOMPLETE_NETWORKS.ordinal() ? new C1724e("INCOMPLETE INTEGRATIONS") : i == C1709b.COMPLETED_NETWORKS.ordinal() ? new C1724e("COMPLETED INTEGRATIONS") : new C1724e("MISSING INTEGRATIONS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1717c> mo13707c(int i) {
        return i == C1709b.APP_INFO.ordinal() ? this.f2520o : i == C1709b.MAX.ordinal() ? this.f2521p : i == C1709b.PRIVACY.ordinal() ? this.f2522q : i == C1709b.ADS.ordinal() ? this.f2523r : i == C1709b.INCOMPLETE_NETWORKS.ordinal() ? this.f2524s : i == C1709b.COMPLETED_NETWORKS.ordinal() ? this.f2525t : this.f2526u;
    }

    /* renamed from: c */
    public boolean mo13735c() {
        return this.f2514i;
    }

    /* renamed from: d */
    public C1969m mo13736d() {
        return this.f2507a;
    }

    /* renamed from: e */
    public List<C1665a> mo13737e() {
        return this.f2508b;
    }

    /* renamed from: f */
    public String mo13738f() {
        return this.f2509d;
    }

    /* renamed from: g */
    public String mo13739g() {
        return this.f2510e;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* renamed from: h */
    public List<C1668d> mo13740h() {
        return this.f2518m;
    }

    /* renamed from: i */
    public List<C1668d> mo13741i() {
        return this.f2519n;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2522q = m3554o();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2524s = m3550c(this.f2515j);
            this.f2525t = m3550c(this.f2516k);
        } else {
            return;
        }
        mo13787j();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f2513h.get() + "}";
    }
}
