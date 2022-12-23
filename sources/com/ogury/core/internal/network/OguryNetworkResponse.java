package com.ogury.core.internal.network;

import com.ogury.core.internal.C9716ah;
import com.ogury.core.internal.C9717ai;

/* compiled from: OguryNetworkResponse.kt */
public abstract class OguryNetworkResponse {

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Success extends OguryNetworkResponse {

        /* renamed from: a */
        private final String f24687a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((C9716ah) null);
            C9717ai.m28145b(str, "responseBody");
            this.f24687a = str;
        }

        public final String getResponseBody() {
            return this.f24687a;
        }
    }

    private OguryNetworkResponse() {
    }

    public /* synthetic */ OguryNetworkResponse(C9716ah ahVar) {
        this();
    }

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Failure extends OguryNetworkResponse {

        /* renamed from: a */
        private final Throwable f24686a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Throwable th) {
            super((C9716ah) null);
            C9717ai.m28145b(th, "exception");
            this.f24686a = th;
        }

        public final Throwable getException() {
            return this.f24686a;
        }
    }
}
