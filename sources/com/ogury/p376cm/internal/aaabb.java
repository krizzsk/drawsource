package com.ogury.p376cm.internal;

import android.content.Context;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.internal.aacab;

/* renamed from: com.ogury.cm.internal.aaabb */
public final class aaabb {

    /* renamed from: a */
    private bbbbb f24213a = new bbbbb();

    /* renamed from: b */
    private aabbc f24214b = new aabbc();

    /* renamed from: c */
    private final acbca f24215c = new acbca();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public aabbb f24216d = new aabbb(this.f24219g, (abaab) null, 2, (bbabb) null);

    /* renamed from: e */
    private abacc f24217e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public abacc f24218f;

    /* renamed from: g */
    private Context f24219g;

    /* renamed from: h */
    private String f24220h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f24221i;

    /* renamed from: com.ogury.cm.internal.aaabb$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaabb f24222a;

        /* renamed from: b */
        final /* synthetic */ aaacc f24223b;

        /* renamed from: com.ogury.cm.internal.aaabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12660aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f24224a;

            /* renamed from: b */
            final /* synthetic */ String f24225b;

            /* renamed from: c */
            final /* synthetic */ int f24226c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12660aaaaa(aaaaa aaaaa, String str, int i) {
                super(0);
                this.f24224a = aaaaa;
                this.f24225b = str;
                this.f24226c = i;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo63787a() {
                aacab.aaaaa aaaaa = aacab.f24274a;
                final OguryError a = aacab.aaaaa.m27777a(this.f24225b);
                abbac abbac = abbac.f24317a;
                abbac.m27818b().mo63835a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C12660aaaaa f24227a;

                    {
                        this.f24227a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo63787a() {
                        int i = this.f24227a.f24226c;
                        if (400 <= i && 499 >= i) {
                            OguryIntegrationLogger.m28105d("[Consent][External] Sending failed. Servers could not process the request (error code: " + a.getErrorCode() + ", message: " + a.getMessage() + ')');
                            this.f24227a.f24224a.f24222a.f24216d.mo63817a(this.f24227a.f24224a.f24223b, false);
                        } else {
                            OguryIntegrationLogger.m28105d("[Consent][External] Sending failed (HTTP status code: " + this.f24227a.f24226c + ')');
                        }
                        OguryIntegrationLogger.m28106e("[Consent][External] Failed to pass external consent data");
                        aabca aabca = aabca.f24267a;
                        aabca.m27763a("ERROR");
                        return babcc.f24512a;
                    }
                });
                return babcc.f24512a;
            }
        }

        aaaaa(aaabb aaabb, aaacc aaacc) {
            this.f24222a = aaabb;
            this.f24223b = aaacc;
        }

        /* renamed from: a */
        public final void mo63783a(int i, String str) {
            bbabc.m28052b(str, "error");
            abbac abbac = abbac.f24317a;
            abbac.m27817a().mo63835a(new C12660aaaaa(this, str, i));
        }

        /* renamed from: a */
        public final void mo63784a(String str) {
            bbabc.m28052b(str, "response");
            OguryIntegrationLogger.m28105d("[Consent][External] Sending succeed. External consent data successfully passed!");
            this.f24222a.f24216d.mo63817a(this.f24223b, true);
            int i = aaabc.f24232a[acbca.m27954a(str).ordinal()];
            if (i == 1 || i == 2) {
                aabca aabca = aabca.f24267a;
                aabca.m27761a();
            }
            aabca aabca2 = aabca.f24267a;
            aabca.m27763a("COMPLETE");
        }
    }

    /* renamed from: com.ogury.cm.internal.aaabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaabb f24229a;

        /* renamed from: b */
        final /* synthetic */ aaacc f24230b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aaabb aaabb, aaacc aaacc) {
            super(0);
            this.f24229a = aaabb;
            this.f24230b = aaacc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            if (aaabb.m27717a(this.f24229a, this.f24230b)) {
                aabca aabca = aabca.f24267a;
                aabca.m27763a("PASSING");
                this.f24229a.f24218f.mo63835a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f24231a;

                    {
                        this.f24231a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo63787a() {
                        aaabb.m27716a(this.f24231a.f24229a, this.f24231a.f24229a.f24221i, this.f24231a.f24230b);
                        return babcc.f24512a;
                    }
                });
            }
            return babcc.f24512a;
        }
    }

    public aaabb(Context context, String str, String str2) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(str2, "consentToken");
        this.f24219g = context;
        this.f24220h = str;
        this.f24221i = str2;
        abbac abbac = abbac.f24317a;
        this.f24217e = abbac.m27817a();
        abbac abbac2 = abbac.f24317a;
        this.f24218f = abbac.m27818b();
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27716a(aaabb aaabb, String str, aaacc aaacc) {
        OguryIntegrationLogger.m28105d("[Consent][External] Sending consent data to Ogury servers...");
        aaabb.f24214b.mo63820a(aaabb.f24219g, aaabb.f24220h, str, aaacc, new aaaaa(aaabb, aaacc));
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m27717a(aaabb aaabb, aaacc aaacc) {
        String str;
        if (!bbbbb.m28067a(aaabb.f24219g)) {
            OguryIntegrationLogger.m28106e("[Consent][External] Failed to pass external consent data (no Internet connection)");
            return false;
        }
        OguryIntegrationLogger.m28105d("[Consent][External] Internet connection is OK");
        if (!aaabb.f24216d.mo63818a(aaacc)) {
            str = "[Consent][External] This Consent data has never been passed. It can be sent.";
        } else if (aaabb.f24216d.mo63819b(aaacc)) {
            str = "[Consent][External] Consent data should be resent (cache expired)";
        } else {
            OguryIntegrationLogger.m28105d("[Consent][External] Consent data do not need to be passed (already sent)");
            return false;
        }
        OguryIntegrationLogger.m28105d(str);
        return true;
    }

    /* renamed from: a */
    public final void mo63799a(aaacc aaacc) {
        bbabc.m28052b(aaacc, "externalConsentData");
        this.f24217e.mo63835a(new aaaab(this, aaacc));
    }
}
