package com.unity3d.scar.adapter.common;

public class WebViewAdsError implements IUnityAdsError {

    /* renamed from: a */
    protected String f28525a;

    /* renamed from: b */
    private Enum f28526b;

    /* renamed from: c */
    protected Object[] f28527c;

    public WebViewAdsError(Enum<?> enumR, String str, Object... objArr) {
        this.f28526b = enumR;
        this.f28525a = str;
        this.f28527c = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this.f28525a;
    }

    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this.f28527c;
    }

    public Enum<?> getErrorCategory() {
        return this.f28526b;
    }
}
