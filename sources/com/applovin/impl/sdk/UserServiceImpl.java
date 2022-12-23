package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a */
    private final C1969m f2857a;

    UserServiceImpl(C1969m mVar) {
        this.f2857a = mVar;
    }

    public void preloadConsentDialog() {
        this.f2857a.mo14530W().mo14501c();
    }

    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f2857a.mo14530W().mo14500a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
