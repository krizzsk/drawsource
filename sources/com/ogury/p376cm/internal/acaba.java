package com.ogury.p376cm.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;

/* renamed from: com.ogury.cm.internal.acaba */
public final class acaba {

    /* renamed from: a */
    private String f24434a = "";

    /* renamed from: b */
    private String f24435b = "";

    /* renamed from: c */
    private String f24436c = "";

    /* renamed from: d */
    private acabb f24437d;

    /* renamed from: e */
    private ArrayList<babbc<String, String>> f24438e;

    /* renamed from: a */
    public final acaba mo63899a(acabb acabb) {
        this.f24437d = acabb;
        return this;
    }

    /* renamed from: a */
    public final acaba mo63900a(String str) {
        bbabc.m28052b(str, "requestMethod");
        this.f24434a = str;
        return this;
    }

    /* renamed from: a */
    public final acaba mo63901a(String str, String str2) {
        bbabc.m28052b(str, SDKConstants.PARAM_KEY);
        bbabc.m28052b(str2, "value");
        if (this.f24438e == null) {
            this.f24438e = new ArrayList<>();
        }
        babbc babbc = new babbc(str, str2);
        ArrayList<babbc<String, String>> arrayList = this.f24438e;
        if (arrayList != null) {
            arrayList.add(babbc);
        }
        return this;
    }

    /* renamed from: a */
    public final String mo63902a() {
        return this.f24434a;
    }

    /* renamed from: b */
    public final acaba mo63903b(String str) {
        bbabc.m28052b(str, "requestBody");
        this.f24435b = str;
        return this;
    }

    /* renamed from: b */
    public final String mo63904b() {
        return this.f24435b;
    }

    /* renamed from: c */
    public final acaba mo63905c(String str) {
        bbabc.m28052b(str, "url");
        this.f24436c = str;
        return this;
    }

    /* renamed from: c */
    public final String mo63906c() {
        return this.f24436c;
    }

    /* renamed from: d */
    public final acabb mo63907d() {
        return this.f24437d;
    }

    /* renamed from: e */
    public final ArrayList<babbc<String, String>> mo63908e() {
        return this.f24438e;
    }

    /* renamed from: f */
    public final abccc mo63909f() {
        return new abccc(this);
    }
}
