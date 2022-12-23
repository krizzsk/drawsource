package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.e */
/* compiled from: OguryTokenManager.kt */
public final class C9772e {

    /* renamed from: a */
    private final SharedPreferences f24677a;

    static {
        new C9773a((byte) 0);
    }

    public C9772e(Context context) {
        C9717ai.m28145b(context, "context");
        this.f24677a = context.getSharedPreferences("ogury_core_token_file", 0);
    }

    /* renamed from: com.ogury.core.internal.e$a */
    /* compiled from: OguryTokenManager.kt */
    public static final class C9773a {
        private C9773a() {
        }

        public /* synthetic */ C9773a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64128a(String str) {
        C9717ai.m28145b(str, "keyName");
        String string = this.f24677a.getString(str, (String) null);
        CharSequence charSequence = string;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        C9717ai.m28143a((Object) uuid, "UUID.randomUUID().toString()");
        C9717ai.m28145b(str, "keyName");
        C9717ai.m28145b(uuid, "keyValue");
        this.f24677a.edit().putString(str, uuid).apply();
        return uuid;
    }
}
