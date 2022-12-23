package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f142a = "";

    /* renamed from: b */
    AdColonyAdSize f143b;

    /* renamed from: c */
    C0939p0 f144c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo10368a() {
        return this.f143b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0939p0 mo10372b() {
        return this.f144c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10373c() {
        return this.f142a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    public void onShow(AdColonyAdView adColonyAdView) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10370a(C0939p0 p0Var) {
        this.f144c = p0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10371a(String str) {
        this.f142a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10369a(AdColonyAdSize adColonyAdSize) {
        this.f143b = adColonyAdSize;
    }
}
