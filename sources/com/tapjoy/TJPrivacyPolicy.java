package com.tapjoy;

import android.text.TextUtils;
import com.tapjoy.internal.C11519gh;

public class TJPrivacyPolicy {

    /* renamed from: a */
    private static final TJPrivacyPolicy f26697a = new TJPrivacyPolicy();

    public static TJPrivacyPolicy getInstance() {
        return f26697a;
    }

    public void setSubjectToGDPR(boolean z) {
        C11519gh.m31513a().mo70055a(z);
    }

    public void setUserConsent(String str) {
        C11519gh.m31513a().mo70054a(str);
    }

    public void setBelowConsentAge(boolean z) {
        C11519gh.m31513a().mo70057b(z);
    }

    public void setUSPrivacy(String str) {
        C11519gh a = C11519gh.m31513a();
        if (!TextUtils.isEmpty(str)) {
            a.f27660b = str;
            if (!a.mo70058c()) {
                a.f27661c = true;
            }
        }
    }
}
