package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FeaturesManager {

    /* renamed from: a */
    private static volatile FeaturesManager f19725a;

    /* renamed from: b */
    private Map<String, ?> f19726b;

    /* renamed from: c */
    private ArrayList<String> f19727c = new ArrayList<String>() {
        {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
        }
    };

    private FeaturesManager() {
        if (f19725a == null) {
            this.f19726b = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f19725a == null) {
            synchronized (FeaturesManager.class) {
                if (f19725a == null) {
                    f19725a = new FeaturesManager();
                }
            }
        }
        return f19725a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList<String> mo56373a() {
        return new ArrayList<>(this.f19727c);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f19726b.containsKey("debugMode")) {
                num = (Integer) this.f19726b.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f19726b = map;
        }
    }
}
