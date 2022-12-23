package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.C2102v;
import java.util.Set;
import java.util.TreeSet;

public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f4489a;

    /* renamed from: b */
    private final Set<Integer> f4490b = new TreeSet();

    /* renamed from: c */
    private int f4491c = 0;

    /* renamed from: d */
    private int f4492d = 256;

    /* renamed from: e */
    private int f4493e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f4489a = str;
    }

    public void addFixedPosition(int i) {
        this.f4490b.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f4489a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f4490b;
    }

    public int getMaxAdCount() {
        return this.f4492d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f4493e;
    }

    public int getRepeatingInterval() {
        return this.f4491c;
    }

    public boolean hasValidPositioning() {
        return !this.f4490b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f4491c >= 2;
    }

    public void resetFixedPositions() {
        this.f4490b.clear();
    }

    public void setMaxAdCount(int i) {
        this.f4492d = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f4493e = i;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f4491c = i;
            C2102v.m5107f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f4491c = 0;
        C2102v.m5109h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of " + 2);
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f4489a + '\'' + ", fixedPositions=" + this.f4490b + ", repeatingInterval=" + this.f4491c + ", maxAdCount=" + this.f4492d + ", maxPreloadedAdCount=" + this.f4493e + '}';
    }
}
