package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.d */
/* compiled from: SdkType.kt */
public final class C9770d {

    /* renamed from: a */
    public static final C9771a f24675a = new C9771a((byte) 0);

    /* renamed from: b */
    private final SharedPreferences f24676b;

    public C9770d(Context context) {
        C9717ai.m28145b(context, "context");
        this.f24676b = context.getSharedPreferences("ogury_core_sdk_type_file", 0);
    }

    /* renamed from: com.ogury.core.internal.d$a */
    /* compiled from: SdkType.kt */
    public static final class C9771a {
        private C9771a() {
        }

        public /* synthetic */ C9771a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C9770d m28232a(Context context) {
            C9717ai.m28145b(context, "context");
            return new C9770d(context);
        }
    }

    /* renamed from: a */
    public final void mo64127a(int i) {
        this.f24676b.edit().putInt(TapjoyConstants.TJC_SDK_TYPE, i).apply();
    }

    /* renamed from: a */
    public final int mo64126a() {
        return this.f24676b.getInt(TapjoyConstants.TJC_SDK_TYPE, 0);
    }
}
