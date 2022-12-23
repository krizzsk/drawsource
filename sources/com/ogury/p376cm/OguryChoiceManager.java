package com.ogury.p376cm;

import android.app.Activity;
import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.internal.aaaaa;
import com.ogury.p376cm.internal.aaaab;
import com.ogury.p376cm.internal.aaaac;
import com.ogury.p376cm.internal.aaaba;
import com.ogury.p376cm.internal.aabbb;
import com.ogury.p376cm.internal.aacaa;
import com.ogury.p376cm.internal.abbba;
import com.ogury.p376cm.internal.abbca;
import com.ogury.p376cm.internal.accba;
import com.ogury.p376cm.internal.babca;
import com.ogury.p376cm.internal.bbabb;
import com.ogury.p376cm.internal.bbabc;
import com.ogury.p376cm.internal.bbacb;
import com.ogury.p376cm.internal.bbcbc;

/* renamed from: com.ogury.cm.OguryChoiceManager */
public final class OguryChoiceManager {
    public static final int CCPAF_VERSION_1 = 1;
    public static final OguryChoiceManager INSTANCE = new OguryChoiceManager();
    public static final int TCF_VERSION_2 = 2;

    /* renamed from: a */
    private static aaaaa f24134a;

    /* renamed from: b */
    private static bbacb f24135b;

    /* renamed from: c */
    private static Context f24136c;

    /* renamed from: d */
    private static String f24137d;

    /* renamed from: e */
    private static boolean f24138e;

    /* renamed from: com.ogury.cm.OguryChoiceManager$Answer */
    public enum Answer {
        FULL_APPROVAL,
        PARTIAL_APPROVAL,
        REFUSAL,
        NO_ANSWER,
        CCPAF_SALE_DENIED,
        CCPAF_SALE_ALLOWED
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$CcpafV1 */
    public static final class CcpafV1 {
        public static final CcpafV1 INSTANCE = new CcpafV1();

        private CcpafV1() {
        }

        public static final String getUspString() {
            OguryChoiceManager.m27634b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m28048a();
            }
            abbba abbba = abbba.f24320a;
            return abbba.m27831c().mo63846d().mo63853a();
        }

        public static final boolean hasSeenNotice() {
            OguryChoiceManager.m27634b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m28048a();
            }
            abbba abbba = abbba.f24320a;
            return abbba.m27831c().mo63846d().mo63857b();
        }

        public static final boolean isLspa() {
            OguryChoiceManager.m27634b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m28048a();
            }
            abbba abbba = abbba.f24320a;
            return abbba.m27831c().mo63846d().mo63861d();
        }

        public static final boolean isOptOutSale() {
            OguryChoiceManager.m27634b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m28048a();
            }
            abbba abbba = abbba.f24320a;
            return abbba.m27831c().mo63846d().mo63859c();
        }
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2 */
    public static final class TcfV2 {
        public static final TcfV2 INSTANCE = new TcfV2();

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$Purpose */
        public static final class Purpose {
            public static final int CREATE_PERSONALISED_ADS = 8;
            public static final int CREATE_PERSONALISED_CONTENT = 32;
            public static final int DEVELOP_AND_IMPROVE_PRODUCTS = 1024;
            public static final Purpose INSTANCE = new Purpose();
            public static final int MARKET_RESEARCH = 512;
            public static final int MEASURE_AD_PERFORMANCE = 128;
            public static final int MEASURE_CONTENT_PERFORMANCE = 256;
            public static final int SELECT_BASIC_ADS = 4;
            public static final int SELECT_PERSONALISED_ADS = 16;
            public static final int SELECT_PERSONALISED_CONTENT = 64;
            public static final int STORE_INFORMATION = 2;

            private Purpose() {
            }
        }

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$SpecialFeature */
        public static final class SpecialFeature {
            public static final SpecialFeature INSTANCE = new SpecialFeature();
            public static final int PRECISE_GEOLOCATION = 2;
            public static final int SCAN_DEVICE_CHARACTERISTICS = 4;

            private SpecialFeature() {
            }
        }

        private TcfV2() {
        }

        public static final String getIabString() {
            OguryIntegrationLogger.m28105d("[Consent] Choice Manager - getIabString() called");
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                aaaba aaaba = (aaaba) a;
                if (aaaba.mo63788a().mo63863a().length() > 0) {
                    return aaaba.mo63788a().mo63863a();
                }
                OguryIntegrationLogger.m28106e("[Consent][data] Consent info not yet available");
                return "";
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63793c(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAllVendorConditionsMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63798h(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63795e(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiVendorMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63794d(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isPurposeAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63792b(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isSpecialFeatureAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63789a(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorAndItsPurposesAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63796f(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorsLiAndLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m28048a();
            }
            aaaac a = clientConsentImpl.mo63775a();
            if (a != null) {
                return ((aaaba) a).mo63797g(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }
    }

    private OguryChoiceManager() {
    }

    /* renamed from: a */
    private static void m27633a() {
        if (f24136c != null) {
            CharSequence charSequence = f24137d;
            if (charSequence == null || bbcbc.m28088a(charSequence)) {
                OguryIntegrationLogger.m28106e("[Consent][setup] Failed (module not correctly started: asset key is null or empty)");
                throw new IllegalStateException("AssetKey is not allowed to be empty.");
            }
            return;
        }
        OguryIntegrationLogger.m28106e("[Consent][setup] Failed (module not started)");
        throw new IllegalStateException("You must first call initialize method.");
    }

    public static final /* synthetic */ void access$checkInstance(OguryChoiceManager oguryChoiceManager, int i) {
        m27634b();
        if (i == 2) {
            aaaaa aaaaa = f24134a;
            if (aaaaa == null) {
                bbabc.m28048a();
            }
            if (!(aaaaa.mo63775a() instanceof aaaba)) {
                throw new IllegalStateException("You cannot use method from another TCF version.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Bad TCF version is passed, you can use one of versions declared in class OguryChoiceManager.");
    }

    public static final void ask(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m28052b(activity, "activity");
        bbabc.m28052b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m28105d("[Consent] Choice Manager - ask() called");
        f24138e = true;
        m27634b();
        aaaaa aaaaa = f24134a;
        if (aaaaa == null) {
            bbabc.m28048a();
        }
        Context context = activity;
        String str = f24137d;
        if (str == null) {
            bbabc.m28048a();
        }
        aaaaa.mo63777a(context, str, oguryConsentListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m27634b() {
        m27633a();
        if (!f24138e) {
            m27635c();
            Context context = f24136c;
            if (context == null) {
                bbabc.m28048a();
            }
            boolean a = bbacb.m28053a(context);
            OguryIntegrationLogger.m28106e("[Consent] Failed (consent data not synced). Please call ask() method first");
            if (a) {
                throw new IllegalStateException("You must first call ask to get config.");
            }
        }
    }

    /* renamed from: c */
    private static bbacb m27635c() {
        if (f24135b == null) {
            f24135b = new bbacb();
        }
        bbacb bbacb = f24135b;
        if (bbacb == null) {
            bbabc.m28048a();
        }
        return bbacb;
    }

    public static final boolean ccpaApplies() {
        m27634b();
        if (f24134a == null) {
            bbabc.m28048a();
        }
        abbba abbba = abbba.f24320a;
        return abbba.m27831c().mo63846d().mo63862e();
    }

    public static /* synthetic */ void clientConsentImpl$annotations() {
    }

    public static /* synthetic */ void debugUtilVal$annotations() {
    }

    public static final void edit(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m28052b(activity, "activity");
        bbabc.m28052b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m28105d("[Consent] Choice Manager - edit() called");
        f24138e = true;
        m27634b();
        aaaaa aaaaa = f24134a;
        if (aaaaa == null) {
            bbabc.m28048a();
        }
        Context context = activity;
        String str = f24137d;
        if (str == null) {
            bbabc.m28048a();
        }
        aaaaa.mo63781b(context, str, oguryConsentListener);
    }

    public static final boolean gdprApplies() {
        m27634b();
        if (f24134a == null) {
            bbabc.m28048a();
        }
        abbba abbba = abbba.f24320a;
        return abbba.m27831c().mo63845c().mo63866b();
    }

    public static final boolean hasPaid() {
        m27634b();
        if (f24134a == null) {
            bbabc.m28048a();
        }
        Context context = f24136c;
        if (context == null) {
            bbabc.m28048a();
        }
        bbabc.m28052b(context, "context");
        return accba.m27963a(context);
    }

    @Deprecated
    public static final void initialize(Context context, String str, OguryCmConfig oguryCmConfig) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m28105d("[Consent] Setting up...");
        new abbca(context, (accba) null, (aabbb) null, 6, (bbabb) null).mo63840a();
        aacaa.aaaaa aaaaa = aacaa.f24273a;
        aacaa.aaaaa.m27772a(context, oguryCmConfig);
        if (f24134a == null) {
            f24136c = context.getApplicationContext();
            f24137d = str;
            aaaab aaaab = aaaab.f24189a;
            f24134a = aaaab.m27685a(oguryCmConfig);
        }
        m27633a();
        OguryIntegrationLogger.m28105d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
        OguryIntegrationLogger.m28105d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m28105d("[Consent][setup] Completed!");
    }

    @Deprecated
    public static /* synthetic */ void initialize$default(Context context, String str, OguryCmConfig oguryCmConfig, int i, Object obj) {
        if ((i & 4) != 0) {
            oguryCmConfig = new OguryCmConfig();
        }
        initialize(context, str, oguryCmConfig);
    }

    public static final boolean isEditAvailable() {
        m27634b();
        if (f24134a == null) {
            bbabc.m28048a();
        }
        Context context = f24136c;
        if (context == null) {
            bbabc.m28048a();
        }
        bbabc.m28052b(context, "context");
        return accba.m27965b(context);
    }

    public static final void updateOguryCmConfig(OguryCmConfig oguryCmConfig) {
        bbabc.m28052b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m28105d("[Consent] Choice Manager - updateOguryCmConfig() called with tcfVersion: " + oguryCmConfig.getTcfVersion() + " and ccpaVersion: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m28105d("[Consent][setup] Manual setting up TCF and CCPA versions...");
        if (f24136c == null) {
            OguryIntegrationLogger.m28106e("[Consent][setup] Failed to set up versions (module not started)");
        } else if (f24138e) {
            OguryIntegrationLogger.m28106e("[Consent][setup] TCF or CCPA versions cannot be changed when ask() method is already called");
        } else {
            abbba abbba = abbba.f24320a;
            if (abbba.m27819a() == oguryCmConfig.getTcfVersion()) {
                abbba abbba2 = abbba.f24320a;
                if (abbba.m27828b() == oguryCmConfig.getCcpafVersion()) {
                    OguryIntegrationLogger.m28105d("[Consent][setup] versions setup aborted (no change detected)");
                    return;
                }
            }
            aacaa.aaaaa aaaaa = aacaa.f24273a;
            Context context = f24136c;
            if (context == null) {
                bbabc.m28048a();
            }
            aacaa.aaaaa.m27772a(context, oguryCmConfig);
            aaaab aaaab = aaaab.f24189a;
            f24134a = aaaab.m27685a(oguryCmConfig);
            OguryIntegrationLogger.m28105d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
            OguryIntegrationLogger.m28105d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
            OguryIntegrationLogger.m28105d("[Consent][setup] Manual setup done! ");
        }
    }

    public final aaaaa getClientConsentImpl() {
        return f24134a;
    }

    public final bbacb getDebugUtilVal$3dacfc6e() {
        return f24135b;
    }

    public final void resetClientConsentImpl$consent_manager_prodRelease() {
        f24134a = null;
    }

    public final void resetFieldsForTests() {
        f24136c = null;
        f24137d = null;
        f24138e = false;
    }

    public final void setClientConsentImpl(aaaaa aaaaa) {
        f24134a = aaaaa;
    }

    public final void setDebugUtilVal$47bacc58(bbacb bbacb) {
        f24135b = bbacb;
    }
}
