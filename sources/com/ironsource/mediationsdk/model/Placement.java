package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a */
    private int f17314a;

    /* renamed from: b */
    private String f17315b;

    /* renamed from: c */
    private boolean f17316c;

    /* renamed from: d */
    private String f17317d;

    /* renamed from: e */
    private int f17318e;

    /* renamed from: f */
    private C6661l f17319f;

    public Placement(int i, String str, boolean z, String str2, int i2, C6661l lVar) {
        this.f17314a = i;
        this.f17315b = str;
        this.f17316c = z;
        this.f17317d = str2;
        this.f17318e = i2;
        this.f17319f = lVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f17314a = interstitialPlacement.getPlacementId();
        this.f17315b = interstitialPlacement.getPlacementName();
        this.f17316c = interstitialPlacement.isDefault();
        this.f17319f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public C6661l getPlacementAvailabilitySettings() {
        return this.f17319f;
    }

    public int getPlacementId() {
        return this.f17314a;
    }

    public String getPlacementName() {
        return this.f17315b;
    }

    public int getRewardAmount() {
        return this.f17318e;
    }

    public String getRewardName() {
        return this.f17317d;
    }

    public boolean isDefault() {
        return this.f17316c;
    }

    public String toString() {
        return "placement name: " + this.f17315b + ", reward name: " + this.f17317d + " , amount: " + this.f17318e;
    }
}
