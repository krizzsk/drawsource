package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

public class MBSplashData implements C8377a {

    /* renamed from: a */
    private DyOption f20373a;

    /* renamed from: b */
    private String f20374b;

    /* renamed from: c */
    private String f20375c;

    /* renamed from: d */
    private String f20376d;

    /* renamed from: e */
    private String f20377e;

    /* renamed from: f */
    private CampaignEx f20378f;

    /* renamed from: g */
    private int f20379g;

    /* renamed from: h */
    private int f20380h;

    /* renamed from: i */
    private float f20381i;

    /* renamed from: j */
    private float f20382j;

    /* renamed from: k */
    private int f20383k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f20373a = dyOption;
        this.f20378f = dyOption.getCampaignEx();
    }

    public DyOption getDyOption() {
        return this.f20373a;
    }

    public int getNoticeImage() {
        return this.f20379g;
    }

    public void setNoticeImage(int i) {
        this.f20379g = i;
    }

    public int getLogoImage() {
        return this.f20380h;
    }

    public void setLogoImage(int i) {
        this.f20380h = i;
    }

    public String getAppInfo() {
        return this.f20374b;
    }

    public void setAppInfo(String str) {
        this.f20374b = str;
    }

    public String getAdClickText() {
        return this.f20375c;
    }

    public void setAdClickText(String str) {
        this.f20375c = str;
    }

    public String getCountDownText() {
        return this.f20376d;
    }

    public void setCountDownText(String str) {
        this.f20376d = str;
    }

    public CampaignEx getBindData() {
        return this.f20378f;
    }

    public DyOption getEffectData() {
        return this.f20373a;
    }

    public float getxInScreen() {
        return this.f20381i;
    }

    public void setxInScreen(float f) {
        this.f20381i = f;
    }

    public float getyInScreen() {
        return this.f20382j;
    }

    public void setyInScreen(float f) {
        this.f20382j = f;
    }

    public int getClickType() {
        return this.f20383k;
    }

    public void setClickType(int i) {
        this.f20383k = i;
    }

    public String getLogoText() {
        return this.f20377e;
    }

    public void setLogoText(String str) {
        this.f20377e = str;
    }
}
