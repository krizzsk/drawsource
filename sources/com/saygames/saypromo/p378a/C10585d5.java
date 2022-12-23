package com.saygames.saypromo.p378a;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.saygames.saypromo.a.d5 */
public final class C10585d5 implements C10577c5 {

    /* renamed from: a */
    final /* synthetic */ Context f26097a;

    C10585d5(Context context) {
        this.f26097a = context;
    }

    /* renamed from: a */
    public final String mo65438a() {
        try {
            return Settings.Secure.getString(this.f26097a.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return null;
        }
    }
}
