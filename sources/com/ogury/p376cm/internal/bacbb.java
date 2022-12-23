package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.bacbb */
public final class bacbb {

    /* renamed from: com.ogury.cm.internal.bacbb$aaaaa */
    public static final class aaaaa extends Thread {

        /* renamed from: a */
        final /* synthetic */ bbaaa f24522a;

        aaaaa(bbaaa bbaaa) {
            this.f24522a = bbaaa;
        }

        public final void run() {
            this.f24522a.mo63787a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m28035a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, bbaaa bbaaa, int i2, Object obj) {
        bbabc.m28052b(bbaaa, "block");
        aaaaa aaaaa2 = new aaaaa(bbaaa);
        aaaaa2.start();
        return aaaaa2;
    }
}
