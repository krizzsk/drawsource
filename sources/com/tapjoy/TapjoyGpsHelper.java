package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;

public class TapjoyGpsHelper {

    /* renamed from: a */
    private Context f26891a;

    /* renamed from: b */
    private String f26892b;

    /* renamed from: c */
    private boolean f26893c;

    /* renamed from: d */
    private int f26894d = 0;

    /* renamed from: e */
    private int f26895e = 0;

    /* renamed from: f */
    private boolean f26896f;

    /* renamed from: g */
    private Boolean f26897g;

    /* renamed from: h */
    private Boolean f26898h;

    /* renamed from: i */
    private Boolean f26899i;

    public TapjoyGpsHelper(Context context) {
        this.f26891a = context;
    }

    public void loadAdvertisingId(boolean z) {
        TapjoyLog.m30842i("TapjoyGpsHelper", "Looking for Google Play Services...");
        if (!isGooglePlayServicesAvailable() || !isGooglePlayManifestConfigured()) {
            TapjoyLog.m30842i("TapjoyGpsHelper", "Google Play Services not found");
            return;
        }
        TapjoyLog.m30842i("TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
        TapjoyLog.m30842i("TapjoyGpsHelper", "Packaged Google Play Services version: " + this.f26895e);
        TapjoyAdIdClient tapjoyAdIdClient = new TapjoyAdIdClient(this.f26891a);
        if (isAdvertisingIdAllowed()) {
            this.f26896f = tapjoyAdIdClient.setupAdIdInfo();
        } else {
            this.f26896f = false;
        }
        try {
            this.f26894d = this.f26891a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            TapjoyLog.m30842i("TapjoyGpsHelper", "Device's Google Play Services version: " + this.f26894d);
        } catch (Exception unused) {
            TapjoyLog.m30842i("TapjoyGpsHelper", "Error getting device's Google Play Services version");
        }
        if (this.f26896f) {
            this.f26893c = tapjoyAdIdClient.isAdTrackingEnabled();
            this.f26892b = tapjoyAdIdClient.getAdvertisingId();
            TapjoyLog.m30842i("TapjoyGpsHelper", "Found advertising ID: " + this.f26892b);
            TapjoyLog.m30842i("TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.f26893c));
            return;
        }
        TapjoyLog.m30842i("TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
        if (z) {
            this.f26893c = false;
            if (isAdvertisingIdAllowed()) {
                this.f26892b = "00000000-0000-0000-0000-000000000000";
                this.f26896f = true;
                return;
            }
            resetAdvertisingID();
            this.f26896f = false;
        }
    }

    public void checkGooglePlayIntegration() {
        if (!isGooglePlayServicesAvailable()) {
            throw new TapjoyIntegrationException("Tapjoy SDK is disabled because Google Play Services was not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        } else if (!isGooglePlayManifestConfigured()) {
            throw new TapjoyIntegrationException("Failed to load manifest.xml meta-data, 'com.google.android.gms.version' not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
    }

    public boolean isGooglePlayServicesAvailable() {
        if (this.f26897g == null) {
            try {
                this.f26891a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.f26897g = Boolean.TRUE;
            } catch (Exception unused) {
                this.f26897g = Boolean.FALSE;
            } catch (Error unused2) {
                this.f26897g = Boolean.FALSE;
            }
        }
        return this.f26897g.booleanValue();
    }

    public boolean isGooglePlayManifestConfigured() {
        if (this.f26898h == null) {
            try {
                this.f26895e = this.f26891a.getPackageManager().getApplicationInfo(this.f26891a.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
                this.f26898h = Boolean.TRUE;
            } catch (Exception unused) {
                this.f26898h = Boolean.FALSE;
            }
        }
        return this.f26898h.booleanValue();
    }

    public String getAdvertisingId() {
        return this.f26892b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f26893c;
    }

    public boolean isAdIdAvailable() {
        return this.f26896f;
    }

    public int getDeviceGooglePlayServicesVersion() {
        return this.f26894d;
    }

    public int getPackagedGooglePlayServicesVersion() {
        return this.f26895e;
    }

    public void resetAdvertisingID() {
        this.f26892b = "";
    }

    public boolean isAdvertisingIdAllowed() {
        SharedPreferences sharedPreferences = this.f26891a.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        if (!sharedPreferences.contains(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID)) {
            return true;
        }
        Boolean valueOf = Boolean.valueOf(sharedPreferences.getBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, false));
        this.f26899i = valueOf;
        if (!valueOf.booleanValue()) {
            return true;
        }
        return false;
    }
}
