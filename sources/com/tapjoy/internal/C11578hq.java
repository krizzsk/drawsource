package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hq */
public abstract class C11578hq {

    /* renamed from: c */
    long f27810c;

    /* renamed from: d */
    boolean f27811d;

    /* renamed from: e */
    public C11547hc f27812e;

    /* renamed from: f */
    public String f27813f;

    /* renamed from: g */
    C11488fs f27814g;

    /* renamed from: a */
    public abstract void mo70090a(C11560hk hkVar, C11496fy fyVar);

    /* renamed from: b */
    public abstract void mo70091b();

    /* renamed from: c */
    public boolean mo70092c() {
        return true;
    }

    /* renamed from: a */
    static void m31740a(Context context, @Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
        }
    }
}
