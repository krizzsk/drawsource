package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.m */
class C0915m implements C0865j0 {

    /* renamed from: com.adcolony.sdk.m$a */
    class C0916a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f640a;

        /* renamed from: b */
        final /* synthetic */ String f641b;

        C0916a(C0915m mVar, String str, String str2) {
            this.f640a = str;
            this.f641b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C0723a.m193b().mo10904m().get(this.f640a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f640a, this.f641b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C0915m() {
        C0723a.m192a("CustomMessage.controller_send", (C0865j0) this);
    }

    /* renamed from: a */
    public void mo10531a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        C1047z0.m1259b((Runnable) new C0916a(this, C0773c0.m393h(a, "type"), C0773c0.m393h(a, "message")));
    }
}
