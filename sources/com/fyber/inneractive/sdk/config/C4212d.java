package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.d */
public class C4212d {

    /* renamed from: a */
    public Boolean f10393a = null;

    /* renamed from: b */
    public String f10394b = null;

    /* renamed from: c */
    public InneractiveAdManager.GdprConsentSource f10395c = null;

    /* renamed from: d */
    public String f10396d = null;

    /* renamed from: e */
    public String f10397e = null;

    /* renamed from: f */
    public Boolean f10398f = null;

    /* renamed from: g */
    public SharedPreferences f10399g;

    /* renamed from: a */
    public Boolean mo24205a() {
        if (C5292l.f14015a == null) {
            return null;
        }
        return this.f10393a;
    }

    /* renamed from: b */
    public void mo24208b() {
        Application application = C5292l.f14015a;
        if (this.f10399g == null && application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
            this.f10399g = sharedPreferences;
            if (sharedPreferences != null) {
                if (sharedPreferences.contains("IAGDPRBool")) {
                    this.f10393a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                }
                if (sharedPreferences.contains("IAGdprConsentData")) {
                    this.f10394b = sharedPreferences.getString("IAGdprConsentData", (String) null);
                }
                if (sharedPreferences.contains("IACCPAConsentData")) {
                    this.f10397e = sharedPreferences.getString("IACCPAConsentData", (String) null);
                }
                if (sharedPreferences.contains("IAGdprSource")) {
                    try {
                        this.f10395c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                    } catch (Exception unused) {
                        this.f10395c = InneractiveAdManager.GdprConsentSource.Internal;
                    }
                }
                if (sharedPreferences.contains("IALgpdConsentStatus")) {
                    this.f10398f = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                }
                if (sharedPreferences.contains("keyUserID")) {
                    this.f10396d = sharedPreferences.getString("keyUserID", (String) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24207a(String str, boolean z) {
        if (C5292l.f14015a == null) {
            return false;
        }
        mo24208b();
        SharedPreferences sharedPreferences = this.f10399g;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    /* renamed from: a */
    public final boolean mo24206a(String str, String str2) {
        if (C5292l.f14015a == null) {
            return false;
        }
        mo24208b();
        if (this.f10399g == null) {
            return false;
        }
        IAlog.m16446a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f10399g.edit().putString(str, str2).apply();
        return true;
    }
}
