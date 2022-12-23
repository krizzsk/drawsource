package com.tapjoy.internal;

import android.text.TextUtils;

/* renamed from: com.tapjoy.internal.il */
public final class C11618il {

    /* renamed from: a */
    public float f27951a;

    /* renamed from: b */
    public int f27952b;

    /* renamed from: a */
    public static C11618il m31818a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11618il ilVar = new C11618il();
            int length = str.length() - 1;
            char charAt = str.charAt(length);
            if (charAt == 'w') {
                ilVar.f27951a = Float.valueOf(str.substring(0, length)).floatValue();
                ilVar.f27952b = 1;
            } else if (charAt == 'h') {
                ilVar.f27951a = Float.valueOf(str.substring(0, length)).floatValue();
                ilVar.f27952b = 2;
            } else {
                ilVar.f27951a = Float.valueOf(str).floatValue();
                ilVar.f27952b = 0;
            }
            return ilVar;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final float mo70196a(float f, float f2) {
        int i = this.f27952b;
        if (i == 1) {
            return (this.f27951a * f) / 100.0f;
        }
        if (i == 2) {
            return (this.f27951a * f2) / 100.0f;
        }
        return this.f27951a;
    }
}
