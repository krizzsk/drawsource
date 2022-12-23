package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a */
    private int f17296a;

    /* renamed from: b */
    private String f17297b;

    /* renamed from: c */
    private boolean f17298c;

    /* renamed from: d */
    private C6661l f17299d;

    public InterstitialPlacement(int i, String str, boolean z, C6661l lVar) {
        this.f17296a = i;
        this.f17297b = str;
        this.f17298c = z;
        this.f17299d = lVar;
    }

    public C6661l getPlacementAvailabilitySettings() {
        return this.f17299d;
    }

    public int getPlacementId() {
        return this.f17296a;
    }

    public String getPlacementName() {
        return this.f17297b;
    }

    public boolean isDefault() {
        return this.f17298c;
    }

    public String toString() {
        return "placement name: " + this.f17297b;
    }
}
