package com.ogury.p377ed.internal;

import android.util.Base64;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p377ed.internal.C9918cw;
import com.smaato.sdk.video.vast.model.C11130Ad;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dm */
public final class C9954dm {

    /* renamed from: a */
    public static final C9955a f25026a = new C9955a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9967dv f25027b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10003ev f25028c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10006ex f25029d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9984ee f25030e;

    private C9954dm(C9967dv dvVar, C10003ev evVar, C10006ex exVar, C9984ee eeVar) {
        this.f25027b = dvVar;
        this.f25028c = evVar;
        this.f25029d = exVar;
        this.f25030e = eeVar;
    }

    private /* synthetic */ C9954dm(C9967dv dvVar, C10003ev evVar) {
        this(dvVar, evVar, C10006ex.f25167a, C9984ee.f25116a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9954dm(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p377ed.internal.C10263mq.m29882b(r3, r0)
            com.ogury.ed.internal.dw r0 = com.ogury.p377ed.internal.C9968dw.f25057a
            com.ogury.ed.internal.dv r0 = com.ogury.p377ed.internal.C9968dw.m28771a(r3)
            com.ogury.ed.internal.ev$a r1 = com.ogury.p377ed.internal.C10003ev.f25164a
            com.ogury.ed.internal.ev r3 = com.ogury.p377ed.internal.C10003ev.C10004a.m28961a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9954dm.<init>(android.content.Context):void");
    }

    /* renamed from: com.ogury.ed.internal.dm$a */
    public static final class C9955a {
        public /* synthetic */ C9955a(byte b) {
            this();
        }

        private C9955a() {
        }
    }

    /* renamed from: a */
    public final C9918cw<C9988ei> mo64473a(C9989ej ejVar, AdConfig adConfig, String str, C9999es esVar) {
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(str, DataKeys.USER_ID);
        C9918cw.C9919a aVar = C9918cw.f24963a;
        return C9918cw.C9919a.m28640a(new C9956b(this, ejVar, adConfig, str, esVar));
    }

    /* renamed from: com.ogury.ed.internal.dm$b */
    static final class C9956b extends C10264mr implements C10227lj<C9988ei> {

        /* renamed from: a */
        final /* synthetic */ C9954dm f25031a;

        /* renamed from: b */
        final /* synthetic */ C9989ej f25032b;

        /* renamed from: c */
        final /* synthetic */ AdConfig f25033c;

        /* renamed from: d */
        final /* synthetic */ String f25034d;

        /* renamed from: e */
        final /* synthetic */ C9999es f25035e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9956b(C9954dm dmVar, C9989ej ejVar, AdConfig adConfig, String str, C9999es esVar) {
            super(0);
            this.f25031a = dmVar;
            this.f25032b = ejVar;
            this.f25033c = adConfig;
            this.f25034d = str;
            this.f25035e = esVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C9988ei mo64355a() {
            OguryNetworkResponse a = this.f25031a.f25027b.mo64485a(this.f25032b, this.f25033c, this.f25034d, this.f25035e);
            if (a instanceof OguryNetworkResponse.Success) {
                C9984ee unused = this.f25031a.f25030e;
                String responseBody = ((OguryNetworkResponse.Success) a).getResponseBody();
                C10263mq.m29879a((Object) responseBody, "response.responseBody");
                C9988ei a2 = C9984ee.m28862a(responseBody, this.f25032b, this.f25035e);
                this.f25031a.f25029d.mo64617a(a2.mo64567a(), this.f25031a.f25028c, this.f25031a.f25027b);
                return a2;
            } else if (a instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                throw exception;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dm$c */
    static final class C9957c extends C10264mr implements C10227lj<C9988ei> {

        /* renamed from: a */
        final /* synthetic */ String f25036a;

        /* renamed from: b */
        final /* synthetic */ C9954dm f25037b;

        /* renamed from: c */
        final /* synthetic */ C9989ej f25038c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9957c(String str, C9954dm dmVar, C9989ej ejVar) {
            super(0);
            this.f25036a = str;
            this.f25037b = dmVar;
            this.f25038c = ejVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C9988ei mo64355a() {
            byte[] decode = Base64.decode(this.f25036a, 2);
            C10263mq.m29879a((Object) decode, "decode(adMarkup, Base64.NO_WRAP)");
            String str = new String(decode, C10302nz.f25622a);
            if (str.length() > 0) {
                C9984ee unused = this.f25037b.f25030e;
                C9988ei a = C9984ee.m28862a(str, this.f25038c, (C9999es) null);
                this.f25037b.f25029d.mo64617a(a.mo64567a(), this.f25037b.f25028c, this.f25037b.f25027b);
                if (!C10190km.m29766b(a.mo64567a())) {
                    return a;
                }
                throw new IllegalStateException("No available ads.");
            }
            throw new IllegalStateException("AdMarkup must not be empty.");
        }
    }

    /* renamed from: a */
    public final C9918cw<C9988ei> mo64474a(String str, C9989ej ejVar) {
        C10263mq.m29882b(str, "adMarkup");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C9918cw.C9919a aVar = C9918cw.f24963a;
        return C9918cw.C9919a.m28640a(new C9957c(str, this, ejVar));
    }
}
