package com.ogury.p376cm.internal;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.bbacb */
public final class bbacb {

    /* renamed from: com.ogury.cm.internal.bbacb$aaaaa */
    public static final class aaaaa implements Serializable {

        /* renamed from: a */
        public boolean f24527a;

        public final String toString() {
            return String.valueOf(this.f24527a);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbacb$aaaab */
    public static final class aaaab<T> implements Serializable {

        /* renamed from: a */
        public T f24528a;

        public final String toString() {
            return String.valueOf(this.f24528a);
        }
    }

    /* renamed from: a */
    public static boolean m28053a(Context context) {
        bbabc.m28052b(context, "context");
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
