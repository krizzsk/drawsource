package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.model.vast.a */
public class C4419a {

    /* renamed from: a */
    public final String f10855a;

    /* renamed from: b */
    public final String f10856b;

    /* renamed from: c */
    public final String f10857c;

    /* renamed from: d */
    public final boolean f10858d;

    public C4419a(String str, String str2, String str3) {
        String str4 = null;
        String trim = str != null ? str.trim() : null;
        this.f10855a = trim;
        String trim2 = str2 != null ? str2.trim() : null;
        this.f10856b = trim2;
        str4 = str3 != null ? str3.trim() : str4;
        this.f10857c = str4;
        this.f10858d = !TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(str4) && str4.contains("[TIME]");
    }
}
