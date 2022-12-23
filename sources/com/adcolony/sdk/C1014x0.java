package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.adcolony.sdk.C0826e0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.x0 */
class C1014x0 {

    /* renamed from: com.adcolony.sdk.x0$a */
    class C1015a implements C0865j0 {
        C1015a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C1014x0.this.m1161f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$b */
    class C1016b implements C0865j0 {
        C1016b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C1014x0.this.m1153a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$c */
    class C1017c implements C0865j0 {
        C1017c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11185c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$d */
    class C1018d implements C0865j0 {
        C1018d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C1014x0.this.m1164n(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$e */
    class C1019e implements C0865j0 {
        C1019e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C1014x0.this.m1163j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$f */
    class C1020f implements C0865j0 {
        C1020f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C1014x0.this.m1162i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$g */
    class C1021g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f892a;

        C1021g(C1014x0 x0Var, String str) {
            this.f892a = str;
        }

        public void run() {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "type", "open_hook");
            C0773c0.m376a(b, "message", this.f892a);
            new C0850h0("CustomMessage.controller_send", 0, b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.x0$h */
    class C1022h implements C0865j0 {
        C1022h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11189h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$i */
    class C1023i implements C0865j0 {
        C1023i() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11192m(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$j */
    class C1024j implements C0865j0 {
        C1024j() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11190k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$k */
    class C1025k implements C0865j0 {
        C1025k() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11193o(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$l */
    class C1026l implements C0865j0 {
        C1026l() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11188g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$m */
    class C1027m implements C0865j0 {
        C1027m() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11187e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$n */
    class C1028n implements C0865j0 {
        C1028n() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11186d(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$o */
    class C1029o implements C0865j0 {
        C1029o() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11183b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$p */
    class C1030p implements C0865j0 {
        C1030p() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1014x0.this.mo11191l(h0Var);
        }
    }

    C1014x0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m1161f(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        C0790d c = C0723a.m193b().mo10889c();
        String h = C0773c0.m393h(a, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = c.mo10723f().get(h);
        AdColonyAdView adColonyAdView = c.mo10720d().get(h);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo10443d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C0850h0("AdUnit.make_in_app_purchase", adColonyInterstitial.mo10443d().mo10653k()).mo10838c();
        }
        mo11182a(h);
        m1156b(h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m1162i(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(C0773c0.m391f(a, "clickOverride"), "url");
        String h2 = C0773c0.m393h(a, "ad_session_id");
        C0790d c = C0723a.m193b().mo10889c();
        AdColonyInterstitial adColonyInterstitial = c.mo10723f().get(h2);
        AdColonyAdView adColonyAdView = c.mo10720d().get(h2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo10438b(h);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(h);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m1163j(C0850h0 h0Var) {
        int i;
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "ad_session_id");
        int d = C0773c0.m389d(a, TJAdUnitConstants.String.ORIENTATION);
        C0790d c = C0723a.m193b().mo10889c();
        AdColonyAdView adColonyAdView = c.mo10720d().get(h);
        AdColonyInterstitial adColonyInterstitial = c.mo10723f().get(h);
        Context a2 = C0723a.m186a();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(d);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo10429a(d);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C0826e0.C0827a().mo10746a("Invalid ad session id sent with set orientation properties message: ").mo10746a(h).mo10747a(C0826e0.f462i);
            return false;
        } else if (!(a2 instanceof C0739b)) {
            return true;
        } else {
            C0739b bVar = (C0739b) a2;
            if (adColonyAdView == null) {
                i = adColonyInterstitial.mo10448f();
            } else {
                i = adColonyAdView.getOrientation();
            }
            bVar.mo10557a(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m1164n(C0850h0 h0Var) {
        AdColonyAdView adColonyAdView = C0723a.m193b().mo10889c().mo10720d().get(C0773c0.m393h(h0Var.mo10834a(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C0773c0.m382b(h0Var.mo10834a(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo11188g(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "url");
        String h2 = C0773c0.m393h(a, "ad_session_id");
        AdColonyAdView adColonyAdView = C0723a.m193b().mo10889c().mo10720d().get(h2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.mo10332c()) {
            return false;
        }
        if (h.startsWith("browser")) {
            h = h.replaceFirst("browser", "http");
        }
        if (h.startsWith("safari")) {
            h = h.replaceFirst("safari", "http");
        }
        m1158d(h);
        if (C1047z0.m1240a(new Intent("android.intent.action.VIEW", Uri.parse(h)))) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h2);
            mo11182a(h2);
            m1156b(h2);
            return true;
        }
        C1047z0.m1245a("Failed to launch browser.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo11189h(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "product_id");
        String h2 = C0773c0.m393h(a, "ad_session_id");
        if (h.equals("")) {
            h = C0773c0.m393h(a, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h));
        m1158d(h);
        if (C1047z0.m1240a(intent)) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h2);
            mo11182a(h2);
            m1156b(h2);
            return true;
        }
        C1047z0.m1245a("Unable to open.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo11190k(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        C0832f1 b = C0773c0.m379b();
        String h = C0773c0.m393h(a, "ad_session_id");
        C0828e1 a2 = C0773c0.m366a(a, "recipients");
        String str = "";
        for (int i = 0; i < a2.mo10752b(); i++) {
            if (i != 0) {
                str = str + ";";
            }
            str = str + C0773c0.m381b(a2, i);
        }
        if (C1047z0.m1240a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C0773c0.m393h(a, "body")))) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h);
            mo11182a(h);
            m1156b(h);
            return true;
        }
        C1047z0.m1245a("Failed to create sms.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo11191l(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C0773c0.m393h(a, "text") + " " + C0773c0.m393h(a, "url"));
        String h = C0773c0.m393h(a, "ad_session_id");
        if (C1047z0.m1241a(putExtra, true)) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h);
            mo11182a(h);
            m1156b(h);
            return true;
        }
        C1047z0.m1245a("Unable to create social post.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11192m(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C0773c0.m393h(a, "phone_number")));
        String h = C0773c0.m393h(a, "ad_session_id");
        if (C1047z0.m1240a(data)) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h);
            mo11182a(h);
            m1156b(h);
            return true;
        }
        C1047z0.m1245a("Failed to dial number.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo11193o(C0850h0 h0Var) {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        int a2 = C0773c0.m363a(h0Var.mo10834a(), "length_ms", 500);
        C0832f1 b = C0773c0.m379b();
        C0828e1 e = C1047z0.m1269e(a);
        boolean z = false;
        for (int i = 0; i < e.mo10752b(); i++) {
            if (C0773c0.m381b(e, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C0826e0.C0827a().mo10746a("No vibrate permission detected.").mo10747a(C0826e0.f459f);
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        } else if (Build.VERSION.SDK_INT < 11 || !C1047z0.m1239a(a, (long) a2)) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        } else {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11181a() {
        C0723a.m192a("System.open_store", (C0865j0) new C1022h());
        C0723a.m192a("System.telephone", (C0865j0) new C1023i());
        C0723a.m192a("System.sms", (C0865j0) new C1024j());
        C0723a.m192a("System.vibrate", (C0865j0) new C1025k());
        C0723a.m192a("System.open_browser", (C0865j0) new C1026l());
        C0723a.m192a("System.mail", (C0865j0) new C1027m());
        C0723a.m192a("System.launch_app", (C0865j0) new C1028n());
        C0723a.m192a("System.create_calendar_event", (C0865j0) new C1029o());
        C0723a.m192a("System.social_post", (C0865j0) new C1030p());
        C0723a.m192a("System.make_in_app_purchase", (C0865j0) new C1015a());
        C0723a.m192a("System.close", (C0865j0) new C1016b());
        C0723a.m192a("System.expand", (C0865j0) new C1017c());
        C0723a.m192a("System.use_custom_close", (C0865j0) new C1018d());
        C0723a.m192a("System.set_orientation_properties", (C0865j0) new C1019e());
        C0723a.m192a("System.click_override", (C0865j0) new C1020f());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11183b(com.adcolony.sdk.C0850h0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            com.adcolony.sdk.f1 r2 = com.adcolony.sdk.C0773c0.m379b()
            com.adcolony.sdk.f1 r3 = r25.mo10834a()
            java.lang.String r4 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C0773c0.m393h(r3, r4)
            java.lang.String r5 = "params"
            com.adcolony.sdk.f1 r3 = com.adcolony.sdk.C0773c0.m391f(r3, r5)
            java.lang.String r5 = "recurrence"
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C0773c0.m391f(r3, r5)
            com.adcolony.sdk.e1 r6 = com.adcolony.sdk.C0773c0.m365a()
            com.adcolony.sdk.e1 r7 = com.adcolony.sdk.C0773c0.m365a()
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C0773c0.m365a()
            java.lang.String r9 = "description"
            java.lang.String r10 = com.adcolony.sdk.C0773c0.m393h(r3, r9)
            java.lang.String r11 = "location"
            com.adcolony.sdk.C0773c0.m393h(r3, r11)
            java.lang.String r11 = "start"
            java.lang.String r11 = com.adcolony.sdk.C0773c0.m393h(r3, r11)
            java.lang.String r12 = "end"
            java.lang.String r12 = com.adcolony.sdk.C0773c0.m393h(r3, r12)
            java.lang.String r13 = "summary"
            java.lang.String r3 = com.adcolony.sdk.C0773c0.m393h(r3, r13)
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x0078
            boolean r14 = r5.mo10791b()
            if (r14 != 0) goto L_0x0078
            java.lang.String r6 = "expires"
            java.lang.String r6 = com.adcolony.sdk.C0773c0.m393h(r5, r6)
            java.lang.String r7 = "frequency"
            java.lang.String r7 = com.adcolony.sdk.C0773c0.m393h(r5, r7)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toUpperCase(r8)
            java.lang.String r8 = "daysInWeek"
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C0773c0.m366a((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r8)
            java.lang.String r14 = "daysInMonth"
            com.adcolony.sdk.e1 r14 = com.adcolony.sdk.C0773c0.m366a((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r14)
            java.lang.String r15 = "daysInYear"
            com.adcolony.sdk.e1 r15 = com.adcolony.sdk.C0773c0.m366a((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r15)
            goto L_0x007d
        L_0x0078:
            r14 = r7
            r15 = r8
            r7 = r13
            r8 = r6
            r6 = r7
        L_0x007d:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0084
            r3 = r10
        L_0x0084:
            java.util.Date r11 = com.adcolony.sdk.C1047z0.m1274g(r11)
            java.util.Date r12 = com.adcolony.sdk.C1047z0.m1274g(r12)
            java.util.Date r6 = com.adcolony.sdk.C1047z0.m1274g(r6)
            java.lang.String r13 = "success"
            if (r11 == 0) goto L_0x0206
            if (r12 != 0) goto L_0x0098
            goto L_0x0206
        L_0x0098:
            long r0 = r11.getTime()
            r16 = r13
            long r12 = r12.getTime()
            r17 = 0
            if (r6 == 0) goto L_0x00b5
            long r19 = r6.getTime()
            long r21 = r11.getTime()
            long r19 = r19 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            goto L_0x00b7
        L_0x00b5:
            r19 = r17
        L_0x00b7:
            java.lang.String r6 = "DAILY"
            boolean r6 = r7.equals(r6)
            r21 = 1
            if (r6 == 0) goto L_0x00cd
            r17 = 86400(0x15180, double:4.26873E-319)
            long r19 = r19 / r17
        L_0x00c6:
            long r17 = r19 + r21
        L_0x00c8:
            r19 = r12
            r11 = r17
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r6 = "WEEKLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00db
            r17 = 604800(0x93a80, double:2.98811E-318)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00db:
            java.lang.String r6 = "MONTHLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            r17 = 2629800(0x2820a8, double:1.299294E-317)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00e9:
            java.lang.String r6 = "YEARLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c8
            r17 = 31557600(0x1e187e0, double:1.5591526E-316)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00f7:
            java.lang.String r6 = "endTime"
            java.lang.String r13 = "beginTime"
            r17 = r4
            java.lang.String r4 = "title"
            r18 = r2
            java.lang.String r2 = "vnd.android.cursor.item/event"
            r21 = r6
            java.lang.String r6 = "android.intent.action.EDIT"
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r5.mo10791b()
            if (r5 != 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r22 = r0
            java.lang.String r0 = "FREQ="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ";COUNT="
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            int r1 = r8.mo10752b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = com.adcolony.sdk.C1047z0.m1236a((com.adcolony.sdk.C0828e1) r8)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            int r1 = r14.mo10752b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = com.adcolony.sdk.C1047z0.m1255b((com.adcolony.sdk.C0828e1) r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYMONTHDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            int r1 = r15.mo10752b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = com.adcolony.sdk.C1047z0.m1255b((com.adcolony.sdk.C0828e1) r15)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYYEARDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.Intent r1 = r1.setType(r2)
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r9, r10)
            r7 = r22
            android.content.Intent r1 = r1.putExtra(r13, r7)
            r11 = r19
            r5 = r21
            android.content.Intent r1 = r1.putExtra(r5, r11)
            java.lang.String r2 = "rrule"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x01c8
        L_0x01aa:
            r7 = r0
            r11 = r19
            r5 = r21
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.content.Intent r0 = r0.setType(r2)
            android.content.Intent r0 = r0.putExtra(r4, r3)
            android.content.Intent r0 = r0.putExtra(r9, r10)
            android.content.Intent r0 = r0.putExtra(r13, r7)
            android.content.Intent r0 = r0.putExtra(r5, r11)
        L_0x01c8:
            boolean r0 = com.adcolony.sdk.C1047z0.m1240a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x01ed
            r0 = 1
            r2 = r16
            r1 = r18
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r1, (java.lang.String) r2, (boolean) r0)
            r3 = r25
            com.adcolony.sdk.h0 r1 = r3.mo10835a(r1)
            r1.mo10838c()
            r4 = r24
            r1 = r17
            r4.mo11184c((java.lang.String) r1)
            r4.mo11182a((java.lang.String) r1)
            r4.m1156b((java.lang.String) r1)
            return r0
        L_0x01ed:
            r4 = r24
            r3 = r25
            r2 = r16
            r1 = r18
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event."
            com.adcolony.sdk.C1047z0.m1245a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo10835a(r1)
            r1.mo10838c()
            return r0
        L_0x0206:
            r4 = r24
            r3 = r1
            r1 = r2
            r2 = r13
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event"
            com.adcolony.sdk.C1047z0.m1245a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo10835a(r1)
            r1.mo10838c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C1014x0.mo11183b(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11185c(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        Context a2 = C0723a.m186a();
        if (a2 != null && C0723a.m196d()) {
            String h = C0773c0.m393h(a, "ad_session_id");
            C0866k b = C0723a.m193b();
            AdColonyAdView adColonyAdView = b.mo10889c().mo10720d().get(h);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.mo10332c()) && b.mo10902k() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(h0Var);
                adColonyAdView.setExpandedWidth(C0773c0.m389d(a, "width"));
                adColonyAdView.setExpandedHeight(C0773c0.m389d(a, "height"));
                adColonyAdView.setOrientation(C0773c0.m363a(a, TJAdUnitConstants.String.ORIENTATION, -1));
                adColonyAdView.setNoCloseButton(C0773c0.m382b(a, "use_custom_close"));
                b.mo10879a(adColonyAdView);
                b.mo10884a(adColonyAdView.getContainer());
                Intent intent = new Intent(a2, AdColonyAdViewActivity.class);
                m1156b(h);
                mo11182a(h);
                C1047z0.m1240a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo11186d(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "ad_session_id");
        if (C0773c0.m382b(a, CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
            return mo11189h(h0Var);
        }
        Context a2 = C0723a.m186a();
        if (a2 == null) {
            return false;
        }
        if (C1047z0.m1240a(a2.getPackageManager().getLaunchIntentForPackage(C0773c0.m393h(a, "handle")))) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h);
            mo11182a(h);
            m1156b(h);
            return true;
        }
        C1047z0.m1245a("Failed to launch external application.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11187e(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0832f1 a = h0Var.mo10834a();
        C0828e1 a2 = C0773c0.m366a(a, "recipients");
        boolean b2 = C0773c0.m382b(a, TJAdUnitConstants.String.HTML);
        String h = C0773c0.m393h(a, "subject");
        String h2 = C0773c0.m393h(a, "body");
        String h3 = C0773c0.m393h(a, "ad_session_id");
        String[] strArr = new String[a2.mo10752b()];
        for (int i = 0; i < a2.mo10752b(); i++) {
            strArr[i] = C0773c0.m381b(a2, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!b2) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h).putExtra("android.intent.extra.TEXT", h2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C1047z0.m1240a(intent)) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            mo11184c(h3);
            mo11182a(h3);
            m1156b(h3);
            return true;
        }
        C1047z0.m1245a("Failed to send email.", 0);
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11184c(String str) {
        C0790d c = C0723a.m193b().mo10889c();
        AdColonyInterstitial adColonyInterstitial = c.mo10723f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = c.mo10720d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* renamed from: d */
    private void m1158d(String str) {
        if (!C1047z0.m1243a((Runnable) new C1021g(this, str))) {
            new C0826e0.C0827a().mo10746a("Executing ADCSystem.sendOpenCustomMessage failed").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1153a(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "ad_session_id");
        Activity activity = C0723a.m186a() instanceof Activity ? (Activity) C0723a.m186a() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C0739b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo10359b();
            return true;
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "id", h);
        new C0850h0("AdSession.on_request_close", ((C0739b) activity).f281c, b).mo10838c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11182a(String str) {
        C0790d c = C0723a.m193b().mo10889c();
        AdColonyInterstitial adColonyInterstitial = c.mo10723f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null || !adColonyInterstitial.mo10453h()) {
            AdColonyAdView adColonyAdView = c.mo10720d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null && adColonyAdView.mo10332c()) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* renamed from: b */
    private boolean m1156b(String str) {
        if (C0723a.m193b().mo10889c().mo10720d().get(str) == null) {
            return false;
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "ad_session_id", str);
        new C0850h0("MRAID.on_event", 1, b).mo10838c();
        return true;
    }
}
