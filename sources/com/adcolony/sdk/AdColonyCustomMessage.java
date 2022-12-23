package com.adcolony.sdk;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f148a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f149b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C0715a implements Runnable {
        C0715a() {
        }

        public void run() {
            AdColony.m95b();
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "type", AdColonyCustomMessage.this.f148a);
            C0773c0.m376a(b, "message", AdColonyCustomMessage.this.f149b);
            new C0850h0("CustomMessage.native_send", 1, b).mo10838c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (C1047z0.m1270e(str) || C1047z0.m1270e(str2)) {
            this.f148a = str;
            this.f149b = str2;
        }
    }

    public String getMessage() {
        return this.f149b;
    }

    public String getType() {
        return this.f148a;
    }

    public void send() {
        AdColony.m92a((Runnable) new C0715a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f148a = str;
        this.f149b = str2;
        return this;
    }
}
