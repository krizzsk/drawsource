package com.unity3d.scar.adapter.common.scarads;

public class ScarAdMetadata {

    /* renamed from: a */
    private String f28528a;

    /* renamed from: b */
    private String f28529b;

    /* renamed from: c */
    private String f28530c;

    /* renamed from: d */
    private String f28531d;

    /* renamed from: e */
    private Integer f28532e;

    public ScarAdMetadata(String str, String str2) {
        this(str, str2, (String) null, (String) null, (Integer) null);
    }

    public String getAdString() {
        return this.f28531d;
    }

    public String getAdUnitId() {
        return this.f28530c;
    }

    public String getPlacementId() {
        return this.f28528a;
    }

    public String getQueryId() {
        return this.f28529b;
    }

    public Integer getVideoLengthMs() {
        return this.f28532e;
    }

    public ScarAdMetadata(String str, String str2, String str3, String str4, Integer num) {
        this.f28528a = str;
        this.f28529b = str2;
        this.f28530c = str3;
        this.f28531d = str4;
        this.f28532e = num;
    }
}
