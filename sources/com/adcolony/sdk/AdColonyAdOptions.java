package com.adcolony.sdk;

public class AdColonyAdOptions {

    /* renamed from: a */
    boolean f111a;

    /* renamed from: b */
    boolean f112b;

    /* renamed from: c */
    AdColonyUserMetadata f113c;

    /* renamed from: d */
    C0832f1 f114d = C0773c0.m379b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f111a = z;
        C0773c0.m385b(this.f114d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f112b = z;
        C0773c0.m385b(this.f114d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return C0773c0.m392g(this.f114d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f113c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (C1047z0.m1270e(str)) {
            C0773c0.m385b(this.f114d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f113c = adColonyUserMetadata;
        C0773c0.m375a(this.f114d, "user_metadata", adColonyUserMetadata.f191b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (C1047z0.m1270e(str)) {
            C0773c0.m373a(this.f114d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            C0773c0.m376a(this.f114d, str, str2);
        }
        return this;
    }
}
