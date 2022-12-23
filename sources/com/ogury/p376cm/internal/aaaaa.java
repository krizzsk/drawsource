package com.ogury.p376cm.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p376cm.OguryChoiceManager;
import com.ogury.p376cm.OguryConsentListener;
import com.ogury.p376cm.internal.aacaa;
import com.ogury.p376cm.internal.aacab;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaaaa */
public final class aaaaa implements aacbc {

    /* renamed from: a */
    private bbbbb f24162a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f24163b;

    /* renamed from: c */
    private Handler f24164c;

    /* renamed from: d */
    private ababb f24165d;

    /* renamed from: e */
    private abbbb f24166e;

    /* renamed from: f */
    private abcba f24167f;

    /* renamed from: g */
    private baccc f24168g;

    /* renamed from: h */
    private com.ogury.p376cm.aaaac f24169h;

    /* renamed from: i */
    private accba f24170i;

    /* renamed from: j */
    private aacca f24171j;

    /* renamed from: k */
    private boolean f24172k;

    /* renamed from: l */
    private String f24173l;

    /* renamed from: m */
    private final aaaac f24174m;

    /* renamed from: n */
    private final babac f24175n;

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaaa  reason: collision with other inner class name */
    public static final class C12657aaaaa implements babaa {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f24176a;

        C12657aaaaa(CountDownLatch countDownLatch) {
            this.f24176a = countDownLatch;
        }

        /* renamed from: a */
        public final void mo63782a() {
            this.f24176a.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ aaaaa f24177a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f24178b;

        aaaab(aaaaa aaaaa, CountDownLatch countDownLatch) {
            this.f24177a = aaaaa;
            this.f24178b = countDownLatch;
        }

        /* renamed from: a */
        public final void mo63772a(String str) {
            bbabc.m28052b(str, "aaid");
            this.f24177a.mo63779a(str);
            this.f24178b.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaac */
    public static final class aaaac implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f24179a;

        /* renamed from: b */
        final /* synthetic */ Context f24180b;

        aaaac(aaaaa aaaaa, Context context) {
            this.f24179a = aaaaa;
            this.f24180b = context;
        }

        /* renamed from: a */
        public final void mo63783a(int i, String str) {
            OguryError oguryError;
            bbabc.m28052b(str, "error");
            if (i == 0 || (500 <= i && 599 >= i)) {
                oguryError = new OguryError(3, str);
            } else {
                aacab.aaaaa aaaaa = aacab.f24274a;
                oguryError = aacab.aaaaa.m27777a(str);
            }
            aaaaa.m27664a(this.f24179a, oguryError);
            baaba.f24478a.endDataSourceConnections();
            Context context = this.f24180b;
            String message = oguryError.getMessage();
            String a = this.f24179a.f24163b;
            if (message != null && bbabc.m28051a((Object) message, (Object) aacaa.aaaaa.m27776e("assetKey-unknown"))) {
                accba.m27964b(context, a);
            }
            aaaaa aaaaa2 = this.f24179a;
            aaaaa.m27662a(aaaaa2, this.f24180b, aaaaa2.f24163b);
        }

        /* renamed from: a */
        public final void mo63784a(String str) {
            bbabc.m28052b(str, "response");
            abbba.m27829b(abbba.m27850r());
            abbba abbba = abbba.f24320a;
            abbba.m27837f().mo63912a(str, true);
            abbba abbba2 = abbba.f24320a;
            if (abbba.m27849q()) {
                aaaaa.m27661a(this.f24179a, this.f24180b);
            } else {
                aaaaa aaaaa = this.f24179a;
                abbba abbba3 = abbba.f24320a;
                aaaaa.m27664a(aaaaa, abbba.m27841i().mo63915b());
            }
            accba.m27966c(this.f24180b);
            aaaaa aaaaa2 = this.f24179a;
            aaaaa.m27662a(aaaaa2, this.f24180b, aaaaa2.f24163b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaba */
    static final class aaaba implements Runnable {

        /* renamed from: a */
        final /* synthetic */ bbaaa f24181a;

        aaaba(bbaaa bbaaa) {
            this.f24181a = bbaaa;
        }

        public final void run() {
            this.f24181a.mo63787a();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabb */
    static final class aaabb implements Runnable {

        /* renamed from: a */
        final /* synthetic */ aaaaa f24182a;

        /* renamed from: b */
        final /* synthetic */ Context f24183b;

        aaabb(aaaaa aaaaa, Context context) {
            this.f24182a = aaaaa;
            this.f24183b = context;
        }

        public final void run() {
            aaaaa.m27669b(this.f24182a, this.f24183b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabc */
    public static final class aaabc implements abbbb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f24184a;

        /* renamed from: b */
        final /* synthetic */ OguryConsentListener f24185b;

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaaa  reason: collision with other inner class name */
        static final class C12658aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f24186a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12658aaaaa(aaabc aaabc) {
                super(0);
                this.f24186a = aaabc;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo63787a() {
                OguryConsentListener oguryConsentListener = this.f24186a.f24185b;
                abbba abbba = abbba.f24320a;
                oguryConsentListener.onComplete(abbba.m27831c().mo63841a());
                return babcc.f24512a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f24187a;

            /* renamed from: b */
            final /* synthetic */ OguryError f24188b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaabc aaabc, OguryError oguryError) {
                super(0);
                this.f24187a = aaabc;
                this.f24188b = oguryError;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo63787a() {
                this.f24187a.f24185b.onError(this.f24188b);
                return babcc.f24512a;
            }
        }

        aaabc(aaaaa aaaaa, OguryConsentListener oguryConsentListener) {
            this.f24184a = aaaaa;
            this.f24185b = oguryConsentListener;
        }

        /* renamed from: a */
        public final void mo63770a(OguryError oguryError) {
            bbabc.m28052b(oguryError, "error");
            OguryIntegrationLogger.m28106e("[Consent][sync] Failed to sync consent data (" + oguryError.getMessage() + ')');
            this.f24184a.mo63780a(false);
            aaaaa.m27663a(this.f24184a, (bbaaa) new aaaab(this, oguryError));
            aabca aabca = aabca.f24267a;
            aabca.m27763a("ERROR");
        }

        /* renamed from: a */
        public final void mo63771a(String str) {
            bbabc.m28052b(str, "response");
            OguryIntegrationLogger.m28105d("[Consent][sync] Consent data successfully synced!");
            StringBuilder sb = new StringBuilder("[Consent][data] Answer: ");
            abbba abbba = abbba.f24320a;
            sb.append(abbba.m27831c().mo63841a().name());
            OguryIntegrationLogger.m28105d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Consent][data] IAB string: ");
            abbba abbba2 = abbba.f24320a;
            sb2.append(abbba.m27831c().mo63845c().mo63863a());
            OguryIntegrationLogger.m28105d(sb2.toString());
            StringBuilder sb3 = new StringBuilder("[Consent][data] USP string: ");
            abbba abbba3 = abbba.f24320a;
            sb3.append(abbba.m27831c().mo63846d().mo63853a());
            OguryIntegrationLogger.m28105d(sb3.toString());
            StringBuilder sb4 = new StringBuilder("[Consent][data] Has paid: ");
            abbba abbba4 = abbba.f24320a;
            sb4.append(abbba.m27831c().mo63844b());
            OguryIntegrationLogger.m28105d(sb4.toString());
            this.f24184a.mo63780a(false);
            aaaaa.m27663a(this.f24184a, (bbaaa) new C12658aaaaa(this));
            aabca aabca = aabca.f24267a;
            aabca.m27763a("COMPLETE");
        }
    }

    public aaaaa() {
        this((aaaac) null, (babac) null, 3, (bbabb) null);
    }

    private aaaaa(aaaac aaaac2, babac babac) {
        bbabc.m28052b(aaaac2, "clientConsentImplTcf");
        bbabc.m28052b(babac, "clientConsentImplCcpafV1");
        this.f24174m = aaaac2;
        this.f24175n = babac;
        this.f24162a = new bbbbb();
        this.f24163b = "";
        this.f24164c = new Handler(Looper.getMainLooper());
        this.f24165d = ababb.f24305a;
        this.f24167f = new abcba();
        this.f24168g = new baccc();
        this.f24169h = com.ogury.p376cm.aaaac.f24147a;
        abbba abbba = abbba.f24320a;
        this.f24170i = abbba.m27835e();
        this.f24171j = new aaccb(this);
        this.f24173l = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaaaa(aaaac aaaac2, babac babac, int i, bbabb bbabb) {
        this((i & 1) != 0 ? new aaaba() : aaaac2, (i & 2) != 0 ? new babac() : babac);
    }

    /* renamed from: a */
    private final acabb m27657a(Context context) {
        return new aaaac(this, context);
    }

    /* renamed from: a */
    private final void m27659a(Context context, String str, acabc acabc) {
        this.f24172k = true;
        this.f24163b = str;
        aabca aabca = aabca.f24267a;
        aabca.m27763a("ASKING");
        OguryIntegrationLogger.m28105d("[Consent][sync] Syncing...");
        if (bbbbb.m28067a(context)) {
            this.f24171j.mo63822a(context, acabc, new CountDownLatch(2));
            return;
        }
        abbbb abbbb = this.f24166e;
        if (abbbb == null) {
            bbabc.m28050a("consentCallback");
        }
        abbbb.mo63770a(new OguryError(0, "No internet connection"));
    }

    /* renamed from: a */
    private final void m27660a(OguryConsentListener oguryConsentListener) {
        this.f24166e = new aaabc(this, oguryConsentListener);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27661a(aaaaa aaaaa, Context context) {
        aaaaa.f24164c.post(new aaabb(aaaaa, context));
        abbba abbba = abbba.f24320a;
        abbba.m27833d().mo63910a(context);
        aaaaa.f24170i.mo63920a(context, aaaaa.f24163b);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27662a(aaaaa aaaaa, Context context, String str) {
        aaaaa.f24168g.mo64000a(context);
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        try {
            abbba abbba = abbba.f24320a;
            SdkInfo sdkInfo = new SdkInfo("3.3.0", str, abbba.m27847o());
            abbba abbba2 = abbba.f24320a;
            OguryCrashReport.start("consent", context, sdkInfo, new CrashConfig(abbba.m27839g().mo63847a(), context.getPackageName(), 5, 50));
        } catch (Throwable unused) {
            abbbc abbbc = abbbc.f24336a;
            abbbc.m27857b("crash report init failed");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27663a(aaaaa aaaaa, bbaaa bbaaa) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        bbabc.m28049a((Object) mainLooper, "Looper.getMainLooper()");
        if (bbabc.m28051a((Object) currentThread, (Object) mainLooper.getThread())) {
            bbaaa.mo63787a();
        } else {
            aaaaa.f24164c.post(new aaaba(bbaaa));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27664a(aaaaa aaaaa, OguryError oguryError) {
        abbbb abbbb = aaaaa.f24166e;
        if (abbbb == null) {
            bbabc.m28050a("consentCallback");
        }
        abbbb.mo63770a(oguryError);
    }

    /* renamed from: a */
    private final void m27666a(acabc acabc, Context context) {
        OguryIntegrationLogger.m28105d("[Consent][sync] Syncing consent data from servers...");
        abcba.m27905a(context, this.f24163b, acabc, m27657a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m27667a(OguryError oguryError) {
        baaba.f24478a.endDataSourceConnections();
        abbba abbba = abbba.f24320a;
        if (abbba.m27831c().mo63841a() != OguryChoiceManager.Answer.NO_ANSWER) {
            abbbb abbbb = this.f24166e;
            if (abbbb == null) {
                bbabc.m28050a("consentCallback");
            }
            abbba abbba2 = abbba.f24320a;
            abbbb.mo63771a(abbba.m27831c().mo63841a().toString());
            return;
        }
        abbbb abbbb2 = this.f24166e;
        if (abbbb2 == null) {
            bbabc.m28050a("consentCallback");
        }
        abbbb2.mo63770a(oguryError);
    }

    /* renamed from: b */
    private static void m27668b(Context context) {
        abbba abbba = abbba.f24320a;
        Context applicationContext = context.getApplicationContext();
        bbabc.m28049a((Object) applicationContext, "context.applicationContext");
        String packageName = applicationContext.getPackageName();
        bbabc.m28049a((Object) packageName, "context.applicationContext.packageName");
        abbba.m27834d(packageName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m27669b(com.ogury.p376cm.internal.aaaaa r6, android.content.Context r7) {
        /*
            com.ogury.cm.internal.abbba r0 = com.ogury.p376cm.internal.abbba.f24320a
            java.lang.String r0 = com.ogury.p376cm.internal.abbba.m27844l()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x0068
            boolean r0 = com.ogury.p376cm.internal.bbbbb.m28067a(r7)
            java.lang.String r3 = "consentCallback"
            if (r0 != 0) goto L_0x0030
            com.ogury.cm.internal.abbbb r0 = r6.f24166e
            if (r0 != 0) goto L_0x0024
            com.ogury.p376cm.internal.bbabc.m28050a((java.lang.String) r3)
        L_0x0024:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            java.lang.String r4 = "No internet connection"
            r1.<init>(r2, r4)
            r0.mo63770a((com.ogury.core.OguryError) r1)
        L_0x002e:
            r1 = r2
            goto L_0x005b
        L_0x0030:
            com.ogury.cm.internal.abbba r0 = com.ogury.p376cm.internal.abbba.f24320a
            java.lang.String r0 = com.ogury.p376cm.internal.abbba.m27842j()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0040
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 == 0) goto L_0x005b
            com.ogury.cm.internal.abbbb r0 = r6.f24166e
            if (r0 != 0) goto L_0x004a
            com.ogury.p376cm.internal.bbabc.m28050a((java.lang.String) r3)
        L_0x004a:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            r4 = 4
            java.lang.String r5 = "Missing consent configuration"
            r1.<init>(r4, r5)
            r0.mo63770a((com.ogury.core.OguryError) r1)
            com.ogury.cm.internal.abbbc r0 = com.ogury.p376cm.internal.abbbc.f24336a
            com.ogury.p376cm.internal.abbbc.m27857b(r5)
            goto L_0x002e
        L_0x005b:
            if (r1 == 0) goto L_0x0067
            com.ogury.cm.internal.abbbb r6 = r6.f24166e
            if (r6 != 0) goto L_0x0064
            com.ogury.p376cm.internal.bbabc.m28050a((java.lang.String) r3)
        L_0x0064:
            com.ogury.p376cm.aaaac.m27642a((android.content.Context) r7, (com.ogury.p376cm.internal.abbbb) r6)
        L_0x0067:
            return
        L_0x0068:
            r7 = 0
            r6.m27667a(new com.ogury.core.OguryError(4, "Consent not received"))
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376cm.internal.aaaaa.m27669b(com.ogury.cm.internal.aaaaa, android.content.Context):void");
    }

    /* renamed from: a */
    public final aaaac mo63775a() {
        return this.f24174m;
    }

    /* renamed from: a */
    public final void mo63776a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        boolean z;
        acabc acabc2;
        bbabc.m28052b(context, "context");
        bbabc.m28052b(acabc, "requestType");
        bbabc.m28052b(countDownLatch, "countDownLatch");
        abbba abbba = abbba.f24320a;
        abbba.m27836e(this.f24173l);
        String str = this.f24163b;
        this.f24170i.mo63921a(str, context);
        this.f24163b = str;
        if (acabc == acabc.EDIT) {
            acabc2 = acabc.EDIT;
        } else {
            String d = accba.m27967d(context);
            boolean z2 = false;
            if (bbcbc.m28088a(d) || (!bbabc.m28051a((Object) d, (Object) this.f24163b))) {
                z = false;
            } else {
                m27667a(new OguryError(1, aacaa.aaaaa.m27776e("assetKey-unknown")));
                z = true;
            }
            if (!z) {
                abbba abbba2 = abbba.f24320a;
                boolean z3 = !abbba.m27840h().after(new Date());
                boolean z4 = baaba.f24478a.tokenExistsForActiveProduct();
                boolean a = accba.m27963a(context);
                boolean z5 = z4 && !a;
                boolean z6 = !z4 && a;
                aacac aacac = aacac.f24275a;
                boolean a2 = bbabc.m28051a((Object) aacac.m27778a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE);
                aacac aacac2 = aacac.f24275a;
                boolean a3 = bbabc.m28051a((Object) aacac.m27778a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
                if (z3 || z5 || z6 || a2 || a3) {
                    z2 = true;
                }
                if (z2) {
                    OguryIntegrationLogger.m28105d("[Consent][sync] Consent cache needs to be synced with servers");
                    acabc2 = acabc.ASK;
                } else {
                    m27667a(new OguryError(4, "Consent not received"));
                    return;
                }
            } else {
                return;
            }
        }
        m27666a(acabc2, context);
    }

    /* renamed from: a */
    public final void mo63777a(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m28105d("[Consent] Syncing consent data...");
        if (!this.f24172k) {
            m27668b(context);
            m27660a(oguryConsentListener);
            m27659a(context, str, acabc.ASK);
        }
    }

    /* renamed from: a */
    public final void mo63778a(Context context, CountDownLatch countDownLatch) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(countDownLatch, "countDownLatch");
        ababb.m27807a(context, new aaaab(this, countDownLatch));
        baaba.f24478a.startDataSourceConnections(context);
        baaba.f24478a.queryPurchase(new C12657aaaaa(countDownLatch));
    }

    /* renamed from: a */
    public final void mo63779a(String str) {
        bbabc.m28052b(str, "<set-?>");
        this.f24173l = str;
    }

    /* renamed from: a */
    public final void mo63780a(boolean z) {
        this.f24172k = false;
    }

    /* renamed from: b */
    public final void mo63781b(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m28105d("[Consent] Syncing consent data...");
        if (!this.f24172k) {
            m27668b(context);
            m27660a(oguryConsentListener);
            m27659a(context, str, acabc.EDIT);
        }
    }
}
