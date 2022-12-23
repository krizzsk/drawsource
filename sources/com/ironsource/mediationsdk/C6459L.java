package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p205f.C6391b;
import com.ironsource.mediationsdk.C6473Q;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p209c.C6565g;
import com.ironsource.mediationsdk.adunit.p209c.C6566h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.impressionData.C6633a;
import com.ironsource.mediationsdk.logger.C6641b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.C6655f;
import com.ironsource.mediationsdk.model.C6656g;
import com.ironsource.mediationsdk.model.C6657h;
import com.ironsource.mediationsdk.model.C6658i;
import com.ironsource.mediationsdk.model.C6660k;
import com.ironsource.mediationsdk.model.C6666p;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.sdk.C6701i;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.C6741g;
import com.ironsource.mediationsdk.utils.C6743i;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.C6748l;
import com.ironsource.mediationsdk.utils.C6755p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p198c.C6353a;
import com.ironsource.p199d.C6356a;
import com.ironsource.p199d.C6357b;
import com.ironsource.sdk.p278a.C8105e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.L */
public final class C6459L implements C6743i {

    /* renamed from: aq */
    private static boolean f16368aq = false;

    /* renamed from: A */
    C6494W f16369A;

    /* renamed from: B */
    C6484T f16370B;

    /* renamed from: C */
    C6565g f16371C;

    /* renamed from: D */
    C6566h f16372D;

    /* renamed from: E */
    boolean f16373E;

    /* renamed from: F */
    boolean f16374F;

    /* renamed from: G */
    boolean f16375G;

    /* renamed from: H */
    boolean f16376H;

    /* renamed from: I */
    boolean f16377I;

    /* renamed from: J */
    boolean f16378J;

    /* renamed from: K */
    boolean f16379K;

    /* renamed from: L */
    int f16380L;

    /* renamed from: M */
    C6759w f16381M;

    /* renamed from: N */
    C6745k f16382N;

    /* renamed from: O */
    C6633a f16383O;

    /* renamed from: P */
    private final String f16384P;

    /* renamed from: Q */
    private final String f16385Q;

    /* renamed from: R */
    private AbstractAdapter f16386R;

    /* renamed from: S */
    private AtomicBoolean f16387S;

    /* renamed from: T */
    private final Object f16388T;

    /* renamed from: U */
    private AtomicBoolean f16389U;

    /* renamed from: V */
    private boolean f16390V;

    /* renamed from: W */
    private List<IronSource.AD_UNIT> f16391W;

    /* renamed from: X */
    private Set<IronSource.AD_UNIT> f16392X;

    /* renamed from: Y */
    private Set<IronSource.AD_UNIT> f16393Y;

    /* renamed from: Z */
    private boolean f16394Z;

    /* renamed from: a */
    final String f16395a;

    /* renamed from: aa */
    private final String f16396aa;

    /* renamed from: ab */
    private boolean f16397ab;

    /* renamed from: ac */
    private boolean f16398ac;

    /* renamed from: ad */
    private ConcurrentHashMap<String, ISDemandOnlyBannerLayout> f16399ad;

    /* renamed from: ae */
    private Boolean f16400ae;

    /* renamed from: af */
    private IronSourceBannerLayout f16401af;

    /* renamed from: ag */
    private String f16402ag;

    /* renamed from: ah */
    private InitializationListener f16403ah;

    /* renamed from: ai */
    private AtomicBoolean f16404ai;

    /* renamed from: aj */
    private boolean f16405aj;

    /* renamed from: ak */
    private CopyOnWriteArraySet<String> f16406ak;

    /* renamed from: al */
    private CopyOnWriteArraySet<String> f16407al;

    /* renamed from: am */
    private CopyOnWriteArraySet<String> f16408am;

    /* renamed from: an */
    private C6762y f16409an;

    /* renamed from: ao */
    private C8105e f16410ao;

    /* renamed from: ap */
    private C6610am f16411ap;

    /* renamed from: b */
    C6596af f16412b;

    /* renamed from: c */
    C6450I f16413c;

    /* renamed from: d */
    C6483S f16414d;

    /* renamed from: e */
    C6683p f16415e;

    /* renamed from: f */
    IronSourceLoggerManager f16416f;

    /* renamed from: g */
    C6701i f16417g;

    /* renamed from: h */
    C6641b f16418h;

    /* renamed from: i */
    C6748l f16419i;

    /* renamed from: j */
    public String f16420j;

    /* renamed from: k */
    public String f16421k;

    /* renamed from: l */
    String f16422l;

    /* renamed from: m */
    public String f16423m;

    /* renamed from: n */
    public Map<String, String> f16424n;

    /* renamed from: o */
    public String f16425o;

    /* renamed from: p */
    public String f16426p;

    /* renamed from: q */
    Context f16427q;

    /* renamed from: r */
    Boolean f16428r;

    /* renamed from: s */
    IronSourceSegment f16429s;

    /* renamed from: t */
    int f16430t;

    /* renamed from: u */
    boolean f16431u;

    /* renamed from: v */
    boolean f16432v;

    /* renamed from: w */
    boolean f16433w;

    /* renamed from: x */
    boolean f16434x;

    /* renamed from: y */
    Boolean f16435y;

    /* renamed from: z */
    C6424D f16436z;

    /* renamed from: com.ironsource.mediationsdk.L$1 */
    static /* synthetic */ class C64601 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16437a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16438b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.C6745k.C6747a.m20459a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16438b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.C6745k.C6747a.f17640a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f16438b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.C6745k.C6747a.f17641b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = f16438b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.C6745k.C6747a.f17642c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = f16438b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.C6745k.C6747a.f17643d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f16437a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f16437a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = f16437a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16437a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.C64601.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.L$a */
    public interface C6461a {
        /* renamed from: a */
        void mo36161a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.L$b */
    static class C6462b {

        /* renamed from: a */
        static volatile C6459L f16439a = new C6459L((byte) 0);
    }

    private C6459L() {
        this.f16395a = getClass().getName();
        this.f16384P = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.2.4";
        this.f16385Q = "Activity=";
        this.f16388T = new Object();
        this.f16419i = null;
        this.f16420j = null;
        this.f16421k = null;
        this.f16422l = null;
        this.f16423m = null;
        this.f16424n = null;
        this.f16425o = null;
        this.f16390V = false;
        this.f16426p = null;
        this.f16428r = null;
        this.f16394Z = true;
        this.f16396aa = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f16435y = null;
        this.f16416f = IronSourceLoggerManager.getLogger(0);
        C6641b bVar = new C6641b((LogListener) null, 1);
        this.f16418h = bVar;
        this.f16416f.addLogger(bVar);
        this.f16417g = new C6701i();
        C6596af afVar = new C6596af();
        this.f16412b = afVar;
        afVar.f17082m = this.f16417g;
        C6450I i = new C6450I();
        this.f16413c = i;
        i.f16305m = this.f16417g;
        C6483S s = new C6483S();
        this.f16414d = s;
        s.f16563b = this.f16417g;
        this.f16387S = new AtomicBoolean();
        this.f16392X = new HashSet();
        this.f16393Y = new HashSet();
        this.f16432v = false;
        this.f16431u = false;
        this.f16397ab = false;
        this.f16389U = new AtomicBoolean(true);
        this.f16404ai = new AtomicBoolean(false);
        this.f16430t = 0;
        this.f16433w = false;
        this.f16434x = false;
        this.f16398ac = false;
        this.f16426p = UUID.randomUUID().toString();
        this.f16400ae = Boolean.FALSE;
        this.f16378J = false;
        this.f16402ag = null;
        this.f16436z = null;
        this.f16369A = null;
        this.f16403ah = null;
        this.f16370B = null;
        this.f16373E = false;
        this.f16374F = false;
        this.f16376H = false;
        this.f16379K = false;
        this.f16406ak = new CopyOnWriteArraySet<>();
        this.f16407al = new CopyOnWriteArraySet<>();
        this.f16408am = new CopyOnWriteArraySet<>();
        this.f16399ad = new ConcurrentHashMap<>();
        this.f16381M = null;
        this.f16409an = null;
        this.f16382N = null;
        this.f16415e = null;
        this.f16380L = 1;
        this.f16383O = new C6633a();
        this.f16410ao = new C8105e();
        this.f16411ap = new C6610am();
    }

    /* synthetic */ C6459L(byte b) {
        this();
    }

    /* renamed from: A */
    private void m19293A() {
        if (this.f16432v) {
            m19349z();
            return;
        }
        C6658i iVar = this.f16419i.f17750c.f17353b;
        this.f16376H = iVar.f17365i.f17568a;
        this.f16377I = iVar.f17365i.f17569b;
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f16376H, 1));
        if (!this.f16376H) {
            m19348y();
        } else if (this.f16377I) {
            m19345w();
        } else {
            m19347x();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19294B() {
        /*
            r13 = this;
            boolean r0 = r13.f16397ab
            if (r0 == 0) goto L_0x0008
            r13.m19295C()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.f16400ae
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.f17355d     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.c r1 = r1.f17349g     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.f17568a     // Catch:{ all -> 0x00e5 }
            r13.f16379K = r1     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            boolean r3 = r13.f16379K     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r3 = r13.f16400ae     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.f16379K     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00e5 }
            m19327b((int) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = r4
        L_0x0055:
            com.ironsource.mediationsdk.utils.l r2 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r2 = r2.f17671a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f17394e     // Catch:{ all -> 0x00e5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r2) goto L_0x0083
            com.ironsource.mediationsdk.utils.l r2 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r2 = r2.f17671a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f17394e     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e5 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0080
            com.ironsource.mediationsdk.utils.l r5 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.o r5 = r5.f17724b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.mo36788a((java.lang.String) r2)     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0080
            r6.add(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0083:
            int r1 = r6.size()     // Catch:{ all -> 0x00e5 }
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r13.f16379K     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0092
            r13.m19318a((java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings>) r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0092:
            com.ironsource.mediationsdk.utils.l r1 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.f17355d     // Catch:{ all -> 0x00e5 }
            long r9 = r1.f17344b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.f17355d     // Catch:{ all -> 0x00e5 }
            int r11 = r1.f17347e     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f16419i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.f r1 = r1.f17355d     // Catch:{ all -> 0x00e5 }
            int r12 = r1.f17348f     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.p r1 = new com.ironsource.mediationsdk.p     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r13.f16420j     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00e5 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00e5 }
            r13.f16415e = r1     // Catch:{ all -> 0x00e5 }
            r13.m19296D()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r13.f16379K     // Catch:{ all -> 0x00e5 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00e5 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00e5 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r5[r3] = r6     // Catch:{ all -> 0x00e5 }
            r2[r4] = r5     // Catch:{ all -> 0x00e5 }
            m19319a((org.json.JSONObject) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x00e5 }
            r2 = 83314(0x14572, float:1.16748E-40)
            m19327b((int) r2, (org.json.JSONObject) r1)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00e5 }
            r13.m19311a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r1, (boolean) r4)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.m19294B():void");
    }

    /* renamed from: C */
    private void m19295C() {
        this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16419i.f17671a.f17394e.size(); i++) {
            String str = this.f16419i.f17671a.f17394e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16419i.f17724b.mo36788a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16408am) {
                this.f16382N = new C6745k(arrayList, this.f16419i.f17750c.f17355d, this.f16420j, this.f16421k);
            }
            Iterator<String> it = this.f16408am.iterator();
            while (it.hasNext()) {
                String next = it.next();
                this.f16382N.mo36976a(this.f16399ad.get(next), next);
            }
            this.f16399ad.clear();
            this.f16408am.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.BANNER, false);
    }

    /* renamed from: D */
    private void m19296D() {
        if (this.f16400ae.booleanValue()) {
            this.f16400ae = Boolean.FALSE;
            mo36124a(this.f16401af, this.f16402ag);
            this.f16401af = null;
            this.f16402ag = null;
        }
    }

    /* renamed from: E */
    private boolean m19297E() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17671a == null || this.f16419i.f17671a.f17390a == null || this.f16419i.f17671a.f17390a.size() <= 0) ? false : true;
    }

    /* renamed from: F */
    private boolean m19298F() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17671a == null || this.f16419i.f17671a.f17393d == null || this.f16419i.f17671a.f17393d.size() <= 0) ? false : true;
    }

    /* renamed from: G */
    private boolean m19299G() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17355d == null) ? false : true;
    }

    /* renamed from: H */
    private boolean m19300H() {
        if (m19299G()) {
            C6748l lVar = this.f16419i;
            if ((lVar == null || lVar.f17671a == null || this.f16419i.f17671a.f17394e == null || this.f16419i.f17671a.f17394e.size() <= 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private static boolean m19301I() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    /* renamed from: J */
    private void m19302J() {
        if (this.f16403ah != null && this.f16404ai.compareAndSet(false, true)) {
            IronLog.CALLBACK.verbose("onInitializationCompleted()");
            C6522h.m19751d().mo36349b(new C6517c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
            this.f16403ah.onInitializationComplete();
        }
    }

    /* renamed from: a */
    private int m19303a(C6666p pVar) {
        return !this.f16405aj && !this.f16374F && pVar.f17410l.f17582o ? 2 : 1;
    }

    /* renamed from: a */
    public static C6459L m19304a() {
        return C6462b.f16439a;
    }

    /* renamed from: a */
    private IronSourceError m19305a(C6473Q.C6478a aVar) {
        if (!this.f16398ac) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized");
        }
        if (!this.f16397ab) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (aVar == C6473Q.C6478a.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization failed");
        }
        if (aVar != C6473Q.C6478a.INIT_IN_PROGRESS || !C6473Q.m19479a().mo36221c()) {
            return null;
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization in progress");
    }

    /* renamed from: a */
    private C6748l m19306a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.f16420j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                C6748l lVar = new C6748l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.f17752e = C6748l.C6749a.f17775b;
                return lVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m19307a(Context context) {
        String[] C = C6393h.m19090C(context);
        return (C == null || C.length != 2) ? "" : C[0];
    }

    /* renamed from: a */
    private static String m19308a(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = C64601.f16438b[i - 1];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    /* renamed from: a */
    static void m19309a(int i, JSONObject jSONObject) {
        C6522h.m19751d().mo36349b(new C6517c(i, jSONObject));
    }

    /* renamed from: a */
    private void m19310a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f16416f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: a */
    private void m19311a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = C64601.f16437a[ad_unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.f16397ab) {
                            Iterator<String> it = this.f16408am.iterator();
                            while (it.hasNext()) {
                                C6644m.m20216a().mo36714a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.BANNER_AD_UNIT));
                            }
                            this.f16408am.clear();
                            return;
                        }
                        synchronized (this.f16400ae) {
                            if (this.f16400ae.booleanValue()) {
                                this.f16400ae = Boolean.FALSE;
                                C6681o.m20255a().mo36812a(this.f16401af, new IronSourceError(602, "Init had failed"), false);
                                this.f16401af = null;
                                this.f16402ag = null;
                            }
                        }
                    }
                } else if (z || mo36152k() || this.f16393Y.contains(ad_unit)) {
                    this.f16417g.onOfferwallAvailable(false);
                }
            } else if (this.f16432v) {
                Iterator<String> it2 = this.f16406ak.iterator();
                while (it2.hasNext()) {
                    C6425E.m19206a().mo35987a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.f16406ak.clear();
            } else if (this.f16378J) {
                this.f16378J = false;
                C6732u.m20387a().mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.f16431u) {
            Iterator<String> it3 = this.f16407al.iterator();
            while (it3.hasNext()) {
                C6530ad.m19809a().mo36394a(it3.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f16407al.clear();
        } else if (this.f16374F) {
            if (this.f16375G) {
                this.f16375G = false;
                C6732u.m20387a().mo36954a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        } else if (z || mo36139d() || this.f16393Y.contains(ad_unit)) {
            C6577ae.m20001a().mo36563a(false, (AdInfo) null);
        }
    }

    /* renamed from: a */
    public static void m19312a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C6425E.m19206a().f16260a = iSDemandOnlyInterstitialListener;
    }

    /* renamed from: a */
    static void m19313a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C6530ad.m19809a().f16854a = iSDemandOnlyRewardedVideoListener;
    }

    /* renamed from: a */
    public static void m19314a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        C6432F.m19211a().mo35999a(levelPlayInterstitialListener);
    }

    /* renamed from: a */
    public static void m19315a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        C6577ae.m20001a().f17046b = levelPlayRewardedVideoListener;
    }

    /* renamed from: a */
    static void m19316a(String str, C6357b bVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    bVar.mo35851a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                bVar.mo35851a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    /* renamed from: a */
    public static void m19317a(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        C6622d.m20139a().mo36650a(str, jSONObject);
    }

    /* renamed from: a */
    private void m19318a(ArrayList<NetworkSettings> arrayList) {
        this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.f16370B = new C6484T(arrayList, new C6621b(this.f16420j, IronSourceUtils.getUserIdForNetworks(), this.f16419i.f17750c.f17355d), C6356a.m18973a().mo35847b(), this.f16429s);
        m19296D();
    }

    /* renamed from: a */
    static void m19319a(JSONObject jSONObject, Object[][] objArr) {
        int i = 0;
        while (i <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i++;
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m19320a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C6622d.m20139a().mo36653b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m19321a(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x0014
            r9.f16434x = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x001f
            r9.f16398ac = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01da }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0029
            r9.f16433w = r3     // Catch:{ all -> 0x01da }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.Q$a r0 = r0.mo36219b()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.Q$a r2 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ all -> 0x01da }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.i r10 = r9.f16417g     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.f16392X     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.m19311a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01da }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.f16390V     // Catch:{ all -> 0x01da }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = r1
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.f16392X     // Catch:{ all -> 0x01da }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01da }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f16392X     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f16393Y     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0085:
            r4 = r3
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f16416f     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r8.<init>()     // Catch:{ all -> 0x01da }
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01da }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01da }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = m19301I()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.C6363a.C63641.m19018d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.C6363a.C63641.m19015c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.mo36160o()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f16430t     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.f16430t = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0108:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x01da }
            r10.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r11)     // Catch:{ all -> 0x01da }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x01da }
            r0.mo36220b(r10)     // Catch:{ all -> 0x01da }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f16391W     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = r1
            r5 = r4
        L_0x012a:
            if (r4 >= r0) goto L_0x0167
            r6 = r11[r4]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.f16392X     // Catch:{ all -> 0x01da }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01da }
            if (r7 != 0) goto L_0x0161
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16392X     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16393Y     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16391W     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f16391W     // Catch:{ all -> 0x01da }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            r9.m19328b((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
            goto L_0x015f
        L_0x015c:
            r9.m19311a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (boolean) r1)     // Catch:{ all -> 0x01da }
        L_0x015f:
            r5 = r3
            goto L_0x0164
        L_0x0161:
            r9.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0167:
            if (r5 == 0) goto L_0x01d8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            r11.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c8 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = m19301I()     // Catch:{ Exception -> 0x01c8 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = com.ironsource.environment.C6363a.C63641.m19018d()     // Catch:{ Exception -> 0x01c8 }
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = com.ironsource.environment.C6363a.C63641.m19015c()     // Catch:{ Exception -> 0x01c8 }
        L_0x01a1:
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01a8
        L_0x01a5:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x01a1
        L_0x01a8:
            r11.append(r0)     // Catch:{ Exception -> 0x01c8 }
            boolean r0 = r9.mo36160o()     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x01b4
            r11.append(r1)     // Catch:{ Exception -> 0x01c8 }
        L_0x01b4:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f16430t     // Catch:{ Exception -> 0x01c8 }
            int r0 = r0 + r3
            r9.f16430t = r0     // Catch:{ Exception -> 0x01c8 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x01cc:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x01da }
            r10.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r11)     // Catch:{ all -> 0x01da }
        L_0x01d8:
            monitor-exit(r9)
            return
        L_0x01da:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.m19321a(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* renamed from: a */
    private boolean m19322a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        synchronized (this.f16408am) {
            if (this.f16382N != null) {
                return false;
            }
            if (!this.f16408am.contains(str)) {
                this.f16408am.add(str);
            }
            this.f16399ad.put(str, iSDemandOnlyBannerLayout);
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m19323a(C6611b bVar) {
        return bVar.f17126k > 0 && bVar.f17127l > 0;
    }

    /* renamed from: a */
    private static boolean m19324a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* renamed from: b */
    private static IronSourceError m19325b(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (activity == null && ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            return new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_MISSING_ACTIVITY, "Banner was initialized and loaded without Activity");
        }
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, iSDemandOnlyBannerLayout == null ? "Missing banner layout" : "Banner layout is destroyed");
        } else if (TextUtils.isEmpty(str)) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing instance Id");
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private C6748l m19326b(Context context, String str, C6461a aVar) {
        C6748l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a = m19307a(context);
            if (TextUtils.isEmpty(a)) {
                a = C6393h.m19143x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f16420j, str, a, this.f16425o, this.f16374F, this.f16429s != null ? this.f16429s.mo36082a() : null, mo36160o()), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog.INTERNAL.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(C6741g.m20413a().mo36969b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    IronLog.INTERNAL.warning("encoded response invalid - return null");
                    if (!f16368aq) {
                        f16368aq = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C6522h.m19751d().mo36349b(new C6517c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            C6748l lVar2 = new C6748l(context, this.f16420j, str, stringFromURL);
            try {
                lVar2.f17752e = C6748l.C6749a.f17776c;
                if (lVar2.mo36981b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                lVar = lVar2;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e3) {
            e = e3;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("exception = " + e);
            e.printStackTrace();
            return lVar;
        }
    }

    /* renamed from: b */
    private static void m19327b(int i, JSONObject jSONObject) {
        C6518d.m19731d().mo36349b(new C6517c(i, jSONObject));
    }

    /* renamed from: b */
    private void m19328b(IronSource.AD_UNIT ad_unit) {
        int i = C64601.f16437a[ad_unit.ordinal()];
        if (i == 1) {
            m19337s();
        } else if (i == 2) {
            m19293A();
        } else if (i == 3) {
            this.f16414d.mo36241a(this.f16420j, this.f16421k);
        } else if (i == 4) {
            m19294B();
        }
    }

    /* renamed from: b */
    private boolean m19329b(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        if (C6473Q.m19479a().mo36219b() != C6473Q.C6478a.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f16408am) {
            if (!this.f16408am.contains(str)) {
                this.f16408am.add(str);
            }
            this.f16399ad.put(str, iSDemandOnlyBannerLayout);
        }
        return true;
    }

    /* renamed from: p */
    private Placement m19330p(String str) {
        C6666p pVar = this.f16419i.f17750c.f17352a;
        if (pVar != null) {
            Iterator<Placement> it = pVar.f17399a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.ironsource.mediationsdk.D] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.Z] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.M] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19331p() {
        /*
            r11 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r11.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.List r5 = r11.m19341u()
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x007a
            com.ironsource.mediationsdk.utils.l r0 = r11.f16419i
            com.ironsource.mediationsdk.model.h r0 = r0.f17750c
            com.ironsource.mediationsdk.model.p r0 = r0.f17352a
            com.ironsource.mediationsdk.utils.c r0 = r0.f17410l
            boolean r0 = r0.f17582o
            if (r0 == 0) goto L_0x003d
            com.ironsource.mediationsdk.M r0 = new com.ironsource.mediationsdk.M
            com.ironsource.mediationsdk.utils.l r1 = r11.f16419i
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c
            com.ironsource.mediationsdk.model.p r6 = r1.f17352a
            java.lang.String r7 = r11.f16420j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.d.a r1 = com.ironsource.p199d.C6356a.m18973a()
            java.util.HashSet r9 = r1.mo35847b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f16429s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0059
        L_0x003d:
            com.ironsource.mediationsdk.Z r0 = new com.ironsource.mediationsdk.Z
            com.ironsource.mediationsdk.utils.l r1 = r11.f16419i
            com.ironsource.mediationsdk.model.h r1 = r1.f17750c
            com.ironsource.mediationsdk.model.p r6 = r1.f17352a
            java.lang.String r7 = r11.f16420j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.d.a r1 = com.ironsource.p199d.C6356a.m18973a()
            java.util.HashSet r9 = r1.mo35847b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f16429s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0059:
            r11.f16436z = r0
            java.lang.Boolean r0 = r11.f16428r
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.D r1 = r11.f16436z
            android.content.Context r2 = r11.f16427q
            boolean r0 = r0.booleanValue()
            r1.mo35984a(r2, r0)
            java.lang.Boolean r0 = r11.f16428r
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.af r0 = r11.f16412b
            android.content.Context r1 = r11.f16427q
            r0.mo36022a((android.content.Context) r1, (boolean) r3)
            return
        L_0x007a:
            int r0 = r11.f16380L
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            m19319a((org.json.JSONObject) r0, (java.lang.Object[][]) r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            m19309a((int) r1, (org.json.JSONObject) r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r11.m19311a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.m19331p():void");
    }

    /* renamed from: q */
    private void m19332q() {
        this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16419i.f17671a.f17390a.size(); i++) {
            String str = this.f16419i.f17671a.f17390a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16419i.f17724b.mo36788a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16407al) {
                this.f16409an = new C6762y(arrayList, this.f16419i.f17750c.f17352a, this.f16420j, this.f16421k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                m19311a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.f16407al.iterator();
            while (it.hasNext()) {
                this.f16409an.mo37008a(it.next(), (String) null, false);
            }
            this.f16407al.clear();
            return;
        }
        m19311a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19333q(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r7 = r6.m19330p(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000f
            com.ironsource.mediationsdk.model.Placement r7 = r6.mo36130b()     // Catch:{ Exception -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x002b
        L_0x000f:
            if (r7 != 0) goto L_0x0034
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f16416f     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000d }
            r3.log(r4, r2, r0)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000d }
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.ae r2 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ Exception -> 0x000d }
            r2.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0029:
            r2 = move-exception
            r7 = r1
        L_0x002b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.h r2 = r6.f16372D
            if (r2 == 0) goto L_0x0046
            boolean r2 = r6.f16374F
            if (r2 != 0) goto L_0x0040
            boolean r2 = r6.f16405aj
            if (r2 == 0) goto L_0x0046
        L_0x0040:
            com.ironsource.mediationsdk.adunit.c.h r0 = r6.f16372D
            r0.mo36513a((com.ironsource.mediationsdk.model.Placement) r7)
            return
        L_0x0046:
            com.ironsource.mediationsdk.D r2 = r6.f16436z
            if (r2 == 0) goto L_0x004e
            r2.mo35985a(r7)
            return
        L_0x004e:
            java.lang.String r7 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.log(r3, r7, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 1023(0x3ff, float:1.434E-42)
            r0.<init>(r2, r7)
            com.ironsource.mediationsdk.ae r7 = com.ironsource.mediationsdk.C6577ae.m20001a()
            r7.mo36561a((com.ironsource.mediationsdk.logger.IronSourceError) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.m19333q(java.lang.String):void");
    }

    /* renamed from: r */
    private Placement m19334r(String str) {
        Placement p = m19330p(str);
        if (p == null) {
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p = mo36130b();
            if (p == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m19308a(p.getPlacementName(), C6745k.m20446b(ContextProvider.getInstance().getApplicationContext(), p));
        if (TextUtils.isEmpty(a)) {
            return p;
        }
        this.f16416f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        C6577ae.m20001a().mo36561a(ErrorBuilder.buildCappedPerPlacementError(a), (AdInfo) null);
        return null;
    }

    /* renamed from: r */
    private void m19335r() {
        NetworkSettings a;
        NetworkSettings a2;
        NetworkSettings a3;
        C6666p pVar = this.f16419i.f17750c.f17352a;
        int i = pVar.f17403e;
        for (int i2 = 0; i2 < this.f16419i.f17671a.f17390a.size(); i2++) {
            String str = this.f16419i.f17671a.f17390a.get(i2);
            if (!TextUtils.isEmpty(str) && (a3 = this.f16419i.f17724b.mo36788a(str)) != null) {
                C6598ag agVar = new C6598ag(a3, i);
                if (m19323a((C6611b) agVar)) {
                    agVar.f17097s = this.f16412b;
                    agVar.f17129n = i2 + 1;
                    this.f16412b.mo36327a(agVar);
                }
            }
        }
        if (this.f16412b.f16718c.size() > 0) {
            this.f16412b.f17083n = pVar.f17400b.f17327a;
            this.f16412b.f16717b = pVar.f17401c;
            this.f16412b.f17084o = pVar.f17406h;
            String c = this.f16419i.mo36982c();
            if (!TextUtils.isEmpty(c) && (a2 = this.f16419i.f17724b.mo36788a(c)) != null) {
                C6598ag agVar2 = new C6598ag(a2, i);
                if (m19323a((C6611b) agVar2)) {
                    agVar2.f17097s = this.f16412b;
                    C6596af afVar = this.f16412b;
                    afVar.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar2.f17119d + " is set as backfill", 0);
                    afVar.f16719d = agVar2;
                }
            }
            String d = this.f16419i.mo36983d();
            if (!TextUtils.isEmpty(d) && (a = this.f16419i.f17724b.mo36788a(d)) != null) {
                C6598ag agVar3 = new C6598ag(a, i);
                if (m19323a((C6611b) agVar3)) {
                    agVar3.f17097s = this.f16412b;
                    C6596af afVar2 = this.f16412b;
                    afVar2.f16723h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar3.f17119d + " is set as premium", 0);
                    afVar2.f16720e = agVar3;
                }
            }
            C6596af afVar3 = this.f16412b;
            afVar3.f17085p = new C6421B(pVar.f17407i, afVar3);
            this.f16412b.mo36590a(this.f16420j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.f16380L);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19309a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: s */
    private InterstitialPlacement m19336s(String str) {
        C6658i iVar = this.f16419i.f17750c.f17353b;
        if (iVar != null) {
            Iterator<InterstitialPlacement> it = iVar.f17357a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    private void m19337s() {
        if (this.f16431u) {
            m19332q();
            return;
        }
        C6666p pVar = this.f16419i.f17750c.f17352a;
        this.f16373E = pVar.f17410l.f17568a || this.f16374F;
        this.f16405aj = pVar.f17410l.f17569b;
        int a = m19303a(pVar);
        this.f16380L = a;
        m19309a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f16373E, a));
        if (this.f16374F || this.f16405aj) {
            m19338t();
        } else if (this.f16373E) {
            m19331p();
        } else {
            m19335r();
        }
    }

    /* renamed from: t */
    private void m19338t() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> u = m19341u();
        if (u.size() > 0) {
            C6566h hVar = new C6566h(u, this.f16419i.f17750c.f17352a, IronSourceUtils.getUserIdForNetworks(), this.f16374F, C6356a.m18973a().mo35847b(), this.f16429s);
            this.f16372D = hVar;
            Boolean bool = this.f16428r;
            if (bool != null) {
                hVar.mo36525b(bool.booleanValue());
            }
            if (this.f16375G && this.f16374F) {
                this.f16375G = false;
                this.f16372D.mo36526d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f16380L);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19309a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19339t(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.m19336s(r7)     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x000e
            com.ironsource.mediationsdk.model.InterstitialPlacement r7 = r6.mo36143g()     // Catch:{ Exception -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r0 = move-exception
            goto L_0x002d
        L_0x000e:
            if (r7 != 0) goto L_0x0036
            java.lang.String r1 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f16416f     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000c }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000c }
            r3 = 1020(0x3fc, float:1.43E-42)
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.F r1 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ Exception -> 0x000c }
            r1.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r2, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r0)     // Catch:{ Exception -> 0x000c }
            return
        L_0x0029:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x002d:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L_0x0036:
            boolean r0 = r6.f16377I
            if (r0 == 0) goto L_0x0045
            com.ironsource.mediationsdk.adunit.c.g r0 = r6.f16371C
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r7)
            r0.mo36513a((com.ironsource.mediationsdk.model.Placement) r1)
            return
        L_0x0045:
            com.ironsource.mediationsdk.W r0 = r6.f16369A
            java.lang.String r7 = r7.getPlacementName()
            r0.mo36291a((java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.m19339t(java.lang.String):void");
    }

    /* renamed from: u */
    private InterstitialPlacement m19340u(String str) {
        InterstitialPlacement s = m19336s(str);
        if (s == null) {
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s = mo36143g();
            if (s == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m19308a(s.getPlacementName(), m19344w(s.getPlacementName()));
        if (TextUtils.isEmpty(a)) {
            return s;
        }
        this.f16416f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f16417g.f17495e = s;
        C6432F.m19211a().mo35997a(ErrorBuilder.buildCappedPerPlacementError(a), (AdInfo) null);
        return null;
    }

    /* renamed from: u */
    private List<NetworkSettings> m19341u() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16419i.f17671a.f17390a.size(); i++) {
            String str = this.f16419i.f17671a.f17390a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16419i.f17724b.mo36788a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private List<NetworkSettings> m19342v() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16419i.f17671a.f17393d.size(); i++) {
            String str = this.f16419i.f17671a.f17393d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16419i.f17724b.mo36788a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private static boolean m19343v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: w */
    private int m19344w(String str) {
        C6748l lVar = this.f16419i;
        if (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17353b == null) {
            return C6745k.C6747a.f17643d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m19336s(str);
            if (interstitialPlacement == null && (interstitialPlacement = mo36143g()) == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? C6745k.C6747a.f17643d : C6745k.m20445b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    /* renamed from: w */
    private void m19345w() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> v = m19342v();
        if (v.size() > 0) {
            C6565g gVar = new C6565g(v, this.f16419i.f17750c.f17353b, IronSourceUtils.getUserIdForNetworks(), C6356a.m18973a().mo35847b(), this.f16429s);
            this.f16371C = gVar;
            Boolean bool = this.f16428r;
            if (bool != null) {
                gVar.mo36525b(bool.booleanValue());
            }
            if (this.f16378J) {
                this.f16378J = false;
                this.f16371C.mo36526d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: x */
    private C6656g m19346x(String str) {
        C6655f fVar = this.f16419i.f17750c.f17355d;
        if (fVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return fVar.mo36776a();
        }
        C6656g a = fVar.mo36777a(str);
        return a != null ? a : fVar.mo36776a();
    }

    /* renamed from: x */
    private void m19347x() {
        this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> v = m19342v();
        if (v.size() > 0) {
            C6494W w = new C6494W(v, this.f16419i.f17750c.f17353b, this.f16420j, IronSourceUtils.getUserIdForNetworks(), this.f16419i.f17750c.f17353b.f17362f, C6356a.m18973a().mo35847b(), this.f16429s);
            this.f16369A = w;
            Boolean bool = this.f16428r;
            if (bool != null) {
                w.mo36292a(bool.booleanValue());
                if (this.f16428r.booleanValue()) {
                    this.f16413c.mo36022a(this.f16427q, false);
                }
            }
            if (this.f16378J) {
                this.f16378J = false;
                this.f16369A.mo36297e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: y */
    private void m19348y() {
        NetworkSettings a;
        C6658i iVar = this.f16419i.f17750c.f17353b;
        int i = iVar.f17361e;
        this.f16413c.f16306n.mo36953a(IronSource.AD_UNIT.INTERSTITIAL, iVar.f17362f);
        for (int i2 = 0; i2 < this.f16419i.f17671a.f17393d.size(); i2++) {
            String str = this.f16419i.f17671a.f17393d.get(i2);
            if (!TextUtils.isEmpty(str) && (a = this.f16419i.f17724b.mo36788a(str)) != null) {
                C6455J j = new C6455J(a, i);
                if (m19323a((C6611b) j)) {
                    j.f16361s = this.f16413c;
                    j.f17129n = i2 + 1;
                    this.f16413c.mo36327a(j);
                }
            }
        }
        if (this.f16413c.f16718c.size() > 0) {
            this.f16413c.f16717b = iVar.f17359c;
            this.f16413c.mo36029a(this.f16420j, IronSourceUtils.getUserIdForNetworks());
            if (this.f16378J) {
                this.f16378J = false;
                this.f16413c.mo36033c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: z */
    private void m19349z() {
        this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f16419i.f17671a.f17393d.size(); i++) {
            String str = this.f16419i.f17671a.f17393d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f16419i.f17724b.mo36788a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f16406ak) {
                this.f16381M = new C6759w(arrayList, this.f16419i.f17750c.f17353b, this.f16420j, this.f16421k);
            }
            Iterator<String> it = this.f16406ak.iterator();
            while (it.hasNext()) {
                this.f16381M.mo37002a(it.next(), (String) null, false);
            }
            this.f16406ak.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m19319a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m19327b((int) IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m19311a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02df, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.C6748l mo36117a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.C6459L.C6461a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f16388T
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r10.f16419i     // Catch:{ all -> 0x02e0 }
            if (r1 == 0) goto L_0x0010
            com.ironsource.mediationsdk.utils.l r11 = new com.ironsource.mediationsdk.utils.l     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.utils.l r12 = r10.f16419i     // Catch:{ all -> 0x02e0 }
            r11.<init>(r12)     // Catch:{ all -> 0x02e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x02e0 }
            return r11
        L_0x0010:
            com.ironsource.mediationsdk.utils.l r13 = r10.m19326b((android.content.Context) r11, (java.lang.String) r12, (com.ironsource.mediationsdk.C6459L.C6461a) r13)     // Catch:{ all -> 0x02e0 }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001e
            boolean r3 = r13.mo36981b()     // Catch:{ all -> 0x02e0 }
            if (r3 != 0) goto L_0x006a
        L_0x001e:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.utils.l r13 = r10.m19306a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x02e0 }
            if (r13 == 0) goto L_0x006a
            java.lang.String r3 = r10.f16420j     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r3, r12)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f16416f     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e0 }
            r5.<init>()     // Catch:{ all -> 0x02e0 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02e0 }
            r5.append(r12)     // Catch:{ all -> 0x02e0 }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x02e0 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02e0 }
            r5.append(r12)     // Catch:{ all -> 0x02e0 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x02e0 }
            r3.log(r4, r12, r1)     // Catch:{ all -> 0x02e0 }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02e0 }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            r12.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r3)     // Catch:{ all -> 0x02e0 }
        L_0x006a:
            if (r13 == 0) goto L_0x02de
            r10.f16419i = r13     // Catch:{ all -> 0x02e0 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.utils.l r12 = r10.f16419i     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.b r3 = r10.f16418h     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.h r4 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r4 = r4.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.e r4 = r4.mo56485a()     // Catch:{ all -> 0x02e0 }
            int r4 = r4.f17340a     // Catch:{ all -> 0x02e0 }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f16416f     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.h r5 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r5 = r5.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.e r5 = r5.mo56485a()     // Catch:{ all -> 0x02e0 }
            int r5 = r5.f17341b     // Catch:{ all -> 0x02e0 }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x02e0 }
            boolean r3 = r10.mo36139d()     // Catch:{ all -> 0x02e0 }
            if (r3 == 0) goto L_0x00a6
            com.ironsource.mediationsdk.model.h r3 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.p r3 = r3.f17352a     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r3 = r3.f17400b     // Catch:{ all -> 0x02e0 }
            boolean r3 = r3.f17328b     // Catch:{ all -> 0x02e0 }
            goto L_0x00a7
        L_0x00a6:
            r3 = r2
        L_0x00a7:
            boolean r4 = r10.mo36147i()     // Catch:{ all -> 0x02e0 }
            if (r4 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.model.h r4 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.i r4 = r4.f17353b     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r4 = r4.f17358b     // Catch:{ all -> 0x02e0 }
            boolean r4 = r4.f17328b     // Catch:{ all -> 0x02e0 }
            goto L_0x00b7
        L_0x00b6:
            r4 = r2
        L_0x00b7:
            boolean r5 = r10.m19299G()     // Catch:{ all -> 0x02e0 }
            if (r5 == 0) goto L_0x00c6
            com.ironsource.mediationsdk.model.h r5 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.f r5 = r5.f17355d     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r5 = r5.f17343a     // Catch:{ all -> 0x02e0 }
            boolean r5 = r5.f17328b     // Catch:{ all -> 0x02e0 }
            goto L_0x00c7
        L_0x00c6:
            r5 = r2
        L_0x00c7:
            boolean r6 = r10.mo36152k()     // Catch:{ all -> 0x02e0 }
            if (r6 == 0) goto L_0x00d6
            com.ironsource.mediationsdk.model.h r6 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.j r6 = r6.f17354c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r6 = r6.f17369c     // Catch:{ all -> 0x02e0 }
            boolean r6 = r6.f17328b     // Catch:{ all -> 0x02e0 }
            goto L_0x00d7
        L_0x00d6:
            r6 = r2
        L_0x00d7:
            com.ironsource.mediationsdk.model.h r7 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r7 = r7.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.utils.j r7 = r7.mo56492h()     // Catch:{ all -> 0x02e0 }
            boolean r8 = r7.f17632a     // Catch:{ all -> 0x02e0 }
            if (r3 == 0) goto L_0x0152
            com.ironsource.mediationsdk.model.h r3 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.p r3 = r3.f17352a     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r3 = r3.f17400b     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r9 = r3.f17331e     // Catch:{ all -> 0x02e0 }
            r6.mo36350b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r9 = r3.f17330d     // Catch:{ all -> 0x02e0 }
            r6.mo36341a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17333g     // Catch:{ all -> 0x02e0 }
            r6.mo36348b((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17334h     // Catch:{ all -> 0x02e0 }
            r6.mo36354c((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17332f     // Catch:{ all -> 0x02e0 }
            r6.mo36338a((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17335i     // Catch:{ all -> 0x02e0 }
            r6.mo36344a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17336j     // Catch:{ all -> 0x02e0 }
            r6.mo36352b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17337k     // Catch:{ all -> 0x02e0 }
            r6.mo36355c(r9, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17338l     // Catch:{ all -> 0x02e0 }
            r6.mo36358d(r9, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.h r9 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r9 = r9.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.q r9 = r9.mo56486b()     // Catch:{ all -> 0x02e0 }
            r6.mo36340a((com.ironsource.mediationsdk.model.C6667q) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            boolean r3 = r3.f17329c     // Catch:{ all -> 0x02e0 }
        L_0x014f:
            r6.f16757c = r3     // Catch:{ all -> 0x02e0 }
            goto L_0x01c7
        L_0x0152:
            if (r6 == 0) goto L_0x01c1
            com.ironsource.mediationsdk.model.h r3 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.j r3 = r3.f17354c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r3 = r3.f17369c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r9 = r3.f17331e     // Catch:{ all -> 0x02e0 }
            r6.mo36350b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r9 = r3.f17330d     // Catch:{ all -> 0x02e0 }
            r6.mo36341a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17333g     // Catch:{ all -> 0x02e0 }
            r6.mo36348b((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17334h     // Catch:{ all -> 0x02e0 }
            r6.mo36354c((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int r9 = r3.f17332f     // Catch:{ all -> 0x02e0 }
            r6.mo36338a((int) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17335i     // Catch:{ all -> 0x02e0 }
            r6.mo36344a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17336j     // Catch:{ all -> 0x02e0 }
            r6.mo36352b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17337k     // Catch:{ all -> 0x02e0 }
            r6.mo36355c(r9, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            int[] r9 = r3.f17338l     // Catch:{ all -> 0x02e0 }
            r6.mo36358d(r9, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.h r9 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r9 = r9.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.q r9 = r9.mo56486b()     // Catch:{ all -> 0x02e0 }
            r6.mo36340a((com.ironsource.mediationsdk.model.C6667q) r9)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            boolean r3 = r3.f17329c     // Catch:{ all -> 0x02e0 }
            goto L_0x014f
        L_0x01c1:
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            r3.f16760f = r2     // Catch:{ all -> 0x02e0 }
        L_0x01c7:
            if (r4 == 0) goto L_0x0238
            com.ironsource.mediationsdk.model.h r2 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.i r2 = r2.f17353b     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r2 = r2.f17358b     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = r2.f17331e     // Catch:{ all -> 0x02e0 }
            r3.mo36350b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = r2.f17330d     // Catch:{ all -> 0x02e0 }
            r3.mo36341a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17333g     // Catch:{ all -> 0x02e0 }
            r3.mo36348b((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17334h     // Catch:{ all -> 0x02e0 }
            r3.mo36354c((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17332f     // Catch:{ all -> 0x02e0 }
            r3.mo36338a((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17335i     // Catch:{ all -> 0x02e0 }
            r3.mo36344a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17336j     // Catch:{ all -> 0x02e0 }
            r3.mo36352b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17337k     // Catch:{ all -> 0x02e0 }
            r3.mo36355c(r4, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17338l     // Catch:{ all -> 0x02e0 }
            r3.mo36358d(r4, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.h r12 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r12 = r12.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.q r12 = r12.mo56486b()     // Catch:{ all -> 0x02e0 }
            r3.mo36340a((com.ironsource.mediationsdk.model.C6667q) r12)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            boolean r2 = r2.f17329c     // Catch:{ all -> 0x02e0 }
        L_0x0235:
            r12.f16757c = r2     // Catch:{ all -> 0x02e0 }
            goto L_0x02ad
        L_0x0238:
            if (r5 == 0) goto L_0x02a7
            com.ironsource.mediationsdk.model.h r2 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.f r2 = r2.f17355d     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.c r2 = r2.f17343a     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = r2.f17331e     // Catch:{ all -> 0x02e0 }
            r3.mo36350b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            java.lang.String r4 = r2.f17330d     // Catch:{ all -> 0x02e0 }
            r3.mo36341a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17333g     // Catch:{ all -> 0x02e0 }
            r3.mo36348b((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17334h     // Catch:{ all -> 0x02e0 }
            r3.mo36354c((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int r4 = r2.f17332f     // Catch:{ all -> 0x02e0 }
            r3.mo36338a((int) r4)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17335i     // Catch:{ all -> 0x02e0 }
            r3.mo36344a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17336j     // Catch:{ all -> 0x02e0 }
            r3.mo36352b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17337k     // Catch:{ all -> 0x02e0 }
            r3.mo36355c(r4, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            int[] r4 = r2.f17338l     // Catch:{ all -> 0x02e0 }
            r3.mo36358d(r4, r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.h r12 = r12.f17750c     // Catch:{ all -> 0x02e0 }
            com.ironsource.sdk.controller.u r12 = r12.f17356e     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.model.q r12 = r12.mo56486b()     // Catch:{ all -> 0x02e0 }
            r3.mo36340a((com.ironsource.mediationsdk.model.C6667q) r12)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            boolean r2 = r2.f17329c     // Catch:{ all -> 0x02e0 }
            goto L_0x0235
        L_0x02a7:
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            r12.f16760f = r2     // Catch:{ all -> 0x02e0 }
        L_0x02ad:
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            r12.f16760f = r8     // Catch:{ all -> 0x02e0 }
            if (r8 == 0) goto L_0x02ce
            java.lang.String r12 = r7.f17633b     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            r2.mo36341a((java.lang.String) r12, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            int[] r2 = r7.f17635d     // Catch:{ all -> 0x02e0 }
            r12.mo36344a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            int[] r2 = r7.f17636e     // Catch:{ all -> 0x02e0 }
            r12.mo36352b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            boolean r12 = r7.f17634c     // Catch:{ all -> 0x02e0 }
            r11.f16757c = r12     // Catch:{ all -> 0x02e0 }
        L_0x02ce:
            com.ironsource.mediationsdk.a.d r11 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02e0 }
            r11.f16755a = r1     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02e0 }
            r11.f16755a = r1     // Catch:{ all -> 0x02e0 }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02e0 }
            r11.f16755a = r1     // Catch:{ all -> 0x02e0 }
        L_0x02de:
            monitor-exit(r0)     // Catch:{ all -> 0x02e0 }
            return r13
        L_0x02e0:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02e0 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36117a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.L$a):com.ironsource.mediationsdk.utils.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36118a(android.app.Activity r5, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = m19325b((android.app.Activity) r5, (com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            r1 = 3
            if (r0 == 0) goto L_0x001a
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f16416f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r0.getErrorMessage()     // Catch:{ all -> 0x0072 }
            r5.log(r2, r3, r1)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0018
            r6.sendBannerAdLoadFailed(r7, r0)     // Catch:{ all -> 0x0072 }
        L_0x0018:
            monitor-exit(r4)
            return
        L_0x001a:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.Q$a r0 = r0.mo36219b()     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = r4.m19305a((com.ironsource.mediationsdk.C6473Q.C6478a) r0)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f16416f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r0.getErrorMessage()     // Catch:{ all -> 0x0072 }
            r5.log(r2, r3, r1)     // Catch:{ all -> 0x0072 }
            r6.sendBannerAdLoadFailed(r7, r0)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0038:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0072 }
            r0.updateActivity(r5)     // Catch:{ all -> 0x0072 }
            boolean r5 = r4.m19329b((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x0047
            monitor-exit(r4)
            return
        L_0x0047:
            boolean r5 = r4.m19322a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x004f
            monitor-exit(r4)
            return
        L_0x004f:
            boolean r5 = r4.m19300H()     // Catch:{ all -> 0x0072 }
            if (r5 != 0) goto L_0x006b
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f16416f     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "No banner configurations found"
            r5.log(r0, r2, r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "the server response does not contain banner data"
            java.lang.String r0 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r5, r0)     // Catch:{ all -> 0x0072 }
            r6.sendBannerAdLoadFailed(r7, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x006b:
            com.ironsource.mediationsdk.utils.k r5 = r4.f16382N     // Catch:{ all -> 0x0072 }
            r5.mo36976a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36118a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36119a(android.app.Activity r4, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = m19325b((android.app.Activity) r4, (com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0013
            if (r7 != 0) goto L_0x0013
            java.lang.String r0 = "Missing adm"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0080 }
            r2 = 510(0x1fe, float:7.15E-43)
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0080 }
            r0 = r1
        L_0x0013:
            r1 = 3
            if (r0 == 0) goto L_0x0028
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f16416f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r0.getErrorMessage()     // Catch:{ all -> 0x0080 }
            r4.log(r7, r2, r1)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0026
            r5.sendBannerAdLoadFailed(r6, r0)     // Catch:{ all -> 0x0080 }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.Q$a r0 = r0.mo36219b()     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = r3.m19305a((com.ironsource.mediationsdk.C6473Q.C6478a) r0)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0046
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f16416f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r0.getErrorMessage()     // Catch:{ all -> 0x0080 }
            r4.log(r7, r2, r1)     // Catch:{ all -> 0x0080 }
            r5.sendBannerAdLoadFailed(r6, r0)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0046:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0080 }
            r0.updateActivity(r4)     // Catch:{ all -> 0x0080 }
            boolean r4 = r3.m19329b((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0055
            monitor-exit(r3)
            return
        L_0x0055:
            boolean r4 = r3.m19322a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x005d
            monitor-exit(r3)
            return
        L_0x005d:
            boolean r4 = r3.m19300H()     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x0079
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f16416f     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "No banner configurations found"
            r4.log(r7, r0, r1)     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "the server response does not contain banner data"
            java.lang.String r7 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r4, r7)     // Catch:{ all -> 0x0080 }
            r5.sendBannerAdLoadFailed(r6, r4)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0079:
            com.ironsource.mediationsdk.utils.k r4 = r3.f16382N     // Catch:{ all -> 0x0080 }
            r4.mo36977a((com.ironsource.mediationsdk.ISDemandOnlyBannerLayout) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return
        L_0x0080:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36119a(android.app.Activity, com.ironsource.mediationsdk.ISDemandOnlyBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo36120a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C6530ad.m19809a().mo36394a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo36132b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36121a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f16416f     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.f16434x     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.f16432v = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.f16433w     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.f16431u = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.f16398ac     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.f16397ab = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.f16433w     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.f16431u = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.f16434x     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.f16432v = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.f16398ac     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.m19310a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.f16397ab = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo36122a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36121a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ba A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fb A[SYNTHETIC, Splitter:B:78:0x01fb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36122a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02fa }
            r0.verbose()     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x000a
            r8.f16403ah = r12     // Catch:{ all -> 0x02fa }
        L_0x000a:
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f16389U     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02d6
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f16389U     // Catch:{ all -> 0x02fa }
            r0 = 0
            r1 = 1
            boolean r12 = r12.compareAndSet(r1, r0)     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02d6
            if (r13 == 0) goto L_0x004f
            int r12 = r13.length     // Catch:{ all -> 0x02fa }
            if (r12 != 0) goto L_0x001e
            goto L_0x004f
        L_0x001e:
            int r12 = r13.length     // Catch:{ all -> 0x02fa }
            r2 = r0
        L_0x0020:
            if (r2 >= r12) goto L_0x0067
            r3 = r13[r2]     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f16392X     // Catch:{ all -> 0x02fa }
            r4.add(r3)     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f16393Y     // Catch:{ all -> 0x02fa }
            r4.add(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02fa }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0038
            r8.f16434x = r1     // Catch:{ all -> 0x02fa }
        L_0x0038:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x02fa }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0042
            r8.f16398ac = r1     // Catch:{ all -> 0x02fa }
        L_0x0042:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02fa }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x004c
            r8.f16433w = r1     // Catch:{ all -> 0x02fa }
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x004f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x02fa }
            int r2 = r12.length     // Catch:{ all -> 0x02fa }
            r3 = r0
        L_0x0055:
            if (r3 >= r2) goto L_0x0061
            r4 = r12[r3]     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r8.f16392X     // Catch:{ all -> 0x02fa }
            r5.add(r4)     // Catch:{ all -> 0x02fa }
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0061:
            r8.f16433w = r1     // Catch:{ all -> 0x02fa }
            r8.f16434x = r1     // Catch:{ all -> 0x02fa }
            r8.f16398ac = r1     // Catch:{ all -> 0x02fa }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "init(appKey:"
            r2.<init>(r3)     // Catch:{ all -> 0x02fa }
            r2.append(r10)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02fa }
            r12.info(r2)     // Catch:{ all -> 0x02fa }
            boolean r12 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x008d
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            r2 = r9
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x02fa }
            r12.updateActivity(r2)     // Catch:{ all -> 0x02fa }
        L_0x008d:
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ all -> 0x02fa }
            r12.updateAppContext(r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.C6393h.m19133q()     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x02fa }
            r12.mo56301b((java.lang.String) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            com.ironsource.c.b r2 = com.ironsource.p198c.C6353a.m18972a()     // Catch:{ all -> 0x02fa }
            r12.mo56296a((com.ironsource.p198c.C6355b) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(r9)     // Catch:{ all -> 0x02fa }
            r12.mo56303b((boolean) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.d.b r12 = new com.ironsource.d.b     // Catch:{ all -> 0x02fa }
            r12.<init>()     // Catch:{ all -> 0x02fa }
            if (r10 == 0) goto L_0x00e1
            r2 = 5
            r3 = 10
            boolean r2 = m19324a((java.lang.String) r10, (int) r2, (int) r3)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x00d8
            boolean r2 = m19343v(r10)     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x00eb
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02fa }
        L_0x00d4:
            r12.mo35851a((com.ironsource.mediationsdk.logger.IronSourceError) r2)     // Catch:{ all -> 0x02fa }
            goto L_0x00eb
        L_0x00d8:
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02fa }
            goto L_0x00d4
        L_0x00e1:
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x02fa }
            r3 = 506(0x1fa, float:7.09E-43)
            java.lang.String r4 = "Init Fail - appKey is missing"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02fa }
            goto L_0x00d4
        L_0x00eb:
            boolean r2 = r12.mo35852a()     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x00f3
            r8.f16420j = r10     // Catch:{ all -> 0x02fa }
        L_0x00f3:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02fa }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r2)     // Catch:{ all -> 0x02fa }
            long r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r2)     // Catch:{ all -> 0x02fa }
            if (r3 != 0) goto L_0x0125
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0125
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            java.lang.String r7 = "get first session timestamp = "
            r6.<init>(r7)     // Catch:{ all -> 0x02fa }
            r6.append(r3)     // Catch:{ all -> 0x02fa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02fa }
            r5.verbose(r6)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r2, r3)     // Catch:{ all -> 0x02fa }
        L_0x0125:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02fa }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = r8.f16421k     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.l r2 = r8.m19306a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x0153
            com.ironsource.environment.g r3 = com.ironsource.environment.C6392g.f16178a     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.model.h r3 = r2.f17750c     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.controller.u r3 = r3.f17356e     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.b r3 = r3.mo56490f()     // Catch:{ all -> 0x02fa }
            boolean r3 = r3.f17566c     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.C6392g.m19082a(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.g r3 = com.ironsource.environment.C6392g.f16178a     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.model.h r2 = r2.f17750c     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.controller.u r2 = r2.f17356e     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.b r2 = r2.mo56490f()     // Catch:{ all -> 0x02fa }
            boolean r2 = r2.f17567d     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.C6392g.m19086c(r2)     // Catch:{ all -> 0x02fa }
        L_0x0153:
            com.ironsource.d.a r2 = com.ironsource.p199d.C6356a.m18973a()     // Catch:{ all -> 0x02fa }
            java.util.concurrent.ConcurrentHashMap r2 = r2.mo35850d()     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "is_deviceid_optout"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x0185
            java.lang.String r3 = "is_deviceid_optout"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x02fa }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02fa }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02fa }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02fa }
            if (r3 != 0) goto L_0x0185
            boolean r2 = com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r2)     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x017f
            r2 = r1
            goto L_0x0180
        L_0x017f:
            r2 = r0
        L_0x0180:
            com.ironsource.environment.g r3 = com.ironsource.environment.C6392g.f16178a     // Catch:{ all -> 0x02fa }
            com.ironsource.environment.C6392g.m19084b(r2)     // Catch:{ all -> 0x02fa }
        L_0x0185:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f16387S     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x01b6
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f16387S     // Catch:{ all -> 0x02fa }
            boolean r2 = r2.compareAndSet(r0, r1)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x01b6
            com.ironsource.mediationsdk.a.i r2 = com.ironsource.mediationsdk.p206a.C6523i.m19757a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.utils.h r3 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x02fa }
            r3.<init>(r9)     // Catch:{ all -> 0x02fa }
            r2.mo36374a(r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16429s     // Catch:{ all -> 0x02fa }
            r2.mo36339a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16429s     // Catch:{ all -> 0x02fa }
            r2.mo36339a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p206a.C6521g.f16808w     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f16429s     // Catch:{ all -> 0x02fa }
            r2.mo36339a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02fa }
        L_0x01b6:
            java.lang.String r2 = r8.f16420j     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x01fb
            com.ironsource.mediationsdk.Q r9 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r10 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ all -> 0x02fa }
            r9.mo36216a((com.ironsource.mediationsdk.C6473Q.C6478a) r10)     // Catch:{ all -> 0x02fa }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f16392X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02fa }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x01d5
            com.ironsource.mediationsdk.ae r9 = com.ironsource.mediationsdk.C6577ae.m20001a()     // Catch:{ all -> 0x02fa }
            r10 = 0
            r9.mo36563a((boolean) r0, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r10)     // Catch:{ all -> 0x02fa }
        L_0x01d5:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f16392X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x02fa }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x01e8
            com.ironsource.mediationsdk.sdk.i r9 = r8.f16417g     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = r12.mo35853b()     // Catch:{ all -> 0x02fa }
            r9.mo36242a((boolean) r0, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x02fa }
        L_0x01e8:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r12.mo35853b()     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02fa }
            r9.log(r10, r11, r1)     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x01fb:
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            r12.mo56295a((android.content.Context) r9)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r8.f16420j     // Catch:{ all -> 0x02fa }
            r12.mo56298a((java.lang.String) r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r8.f16426p     // Catch:{ all -> 0x02fa }
            r12.mo56304c(r2)     // Catch:{ all -> 0x02fa }
            com.ironsource.sdk.a.e r12 = r8.f16410ao     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.config.ConfigFile r2 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x02fa }
            java.lang.String r2 = r2.getPluginType()     // Catch:{ all -> 0x02fa }
            r12.mo56305d(r2)     // Catch:{ all -> 0x02fa }
            boolean r12 = r8.f16394Z     // Catch:{ all -> 0x02fa }
            if (r12 == 0) goto L_0x02a8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            r12.<init>()     // Catch:{ all -> 0x02fa }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x02fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = ",androidx="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0294 }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0294 }
            r2.append(r3)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0294 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0294 }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x0294 }
            boolean r4 = m19301I()     // Catch:{ Exception -> 0x0294 }
            r3.append(r4)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0294 }
            boolean r4 = com.ironsource.environment.C6363a.C63641.m19018d()     // Catch:{ Exception -> 0x0294 }
            if (r4 == 0) goto L_0x025f
            java.lang.String r4 = "appLanguage=Kotlin"
            r12.append(r4)     // Catch:{ Exception -> 0x0294 }
            java.lang.String r4 = com.ironsource.environment.C6363a.C63641.m19015c()     // Catch:{ Exception -> 0x0294 }
        L_0x025b:
            r12.append(r4)     // Catch:{ Exception -> 0x0294 }
            goto L_0x0262
        L_0x025f:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x025b
        L_0x0262:
            r12.append(r2)     // Catch:{ Exception -> 0x0294 }
            boolean r2 = r8.mo36160o()     // Catch:{ Exception -> 0x0294 }
            if (r2 == 0) goto L_0x026e
            r12.append(r3)     // Catch:{ Exception -> 0x0294 }
        L_0x026e:
            java.lang.String r2 = "ext1"
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0294 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0294 }
            if (r13 == 0) goto L_0x0289
            int r12 = r13.length     // Catch:{ Exception -> 0x0294 }
            r2 = r0
        L_0x027b:
            if (r2 >= r12) goto L_0x0289
            r3 = r13[r2]     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0294 }
            r11.put(r3, r1)     // Catch:{ Exception -> 0x0294 }
            int r2 = r2 + 1
            goto L_0x027b
        L_0x0289:
            java.lang.String r12 = "sessionDepth"
            int r13 = r8.f16430t     // Catch:{ Exception -> 0x0294 }
            int r13 = r13 + r1
            r8.f16430t = r13     // Catch:{ Exception -> 0x0294 }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x0294 }
            goto L_0x0298
        L_0x0294:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x02fa }
        L_0x0298:
            com.ironsource.mediationsdk.a.c r12 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02fa }
            r13 = 14
            r12.<init>(r13, r11)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x02fa }
            r11.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r12)     // Catch:{ all -> 0x02fa }
            r8.f16394Z = r0     // Catch:{ all -> 0x02fa }
        L_0x02a8:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r11 = r8.f16392X     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02fa }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x02fa }
            if (r11 == 0) goto L_0x02bb
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.I r12 = r8.f16413c     // Catch:{ all -> 0x02fa }
            r11.mo36217a((com.ironsource.mediationsdk.utils.C6743i) r12)     // Catch:{ all -> 0x02fa }
        L_0x02bb:
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            r11.mo36217a((com.ironsource.mediationsdk.utils.C6743i) r8)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.impressionData.a r12 = r8.f16383O     // Catch:{ all -> 0x02fa }
            r11.mo36217a((com.ironsource.mediationsdk.utils.C6743i) r12)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r11 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            java.lang.String r12 = r8.f16421k     // Catch:{ all -> 0x02fa }
            r11.mo36215a(r9, r10, r12)     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x02d6:
            if (r13 == 0) goto L_0x02ee
            r8.m19321a((boolean) r11, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r13)     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q r9 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r9 = r9.mo36219b()     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.Q$a r10 = com.ironsource.mediationsdk.C6473Q.C6478a.INITIATED     // Catch:{ all -> 0x02fa }
            if (r9 != r10) goto L_0x02f8
            if (r11 != 0) goto L_0x02f8
            r8.m19302J()     // Catch:{ all -> 0x02fa }
            monitor-exit(r8)
            return
        L_0x02ee:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f16416f     // Catch:{ all -> 0x02fa }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = "Multiple calls to init without ad units are not allowed"
            r12 = 3
            r9.log(r10, r11, r12)     // Catch:{ all -> 0x02fa }
        L_0x02f8:
            monitor-exit(r8)
            return
        L_0x02fa:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36122a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36123a(AbstractAdapter abstractAdapter) {
        this.f16386R = abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        if (r4.f16379K != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        r4.f16415e.mo36817a(r5, m19346x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        r4.f16370B.mo36254a(r5, m19346x(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0132, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36124a(com.ironsource.mediationsdk.IronSourceBannerLayout r5, java.lang.String r6) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            boolean r0 = r4.f16397ab
            r1 = 0
            r2 = 3
            if (r0 == 0) goto L_0x0030
            java.lang.String r6 = "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C6681o.m20255a()
            java.lang.String r2 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r6, r2)
            r0.mo36812a(r5, r6, r1)
            return
        L_0x0030:
            if (r5 == 0) goto L_0x0136
            boolean r0 = r5.isDestroyed()
            if (r0 == 0) goto L_0x003a
            goto L_0x0136
        L_0x003a:
            boolean r0 = r4.f16398ac
            if (r0 != 0) goto L_0x0053
            java.lang.String r6 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C6681o.m20255a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r0.mo36812a(r5, r6, r1)
            return
        L_0x0053:
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            java.lang.String r0 = r0.getDescription()
            java.lang.String r3 = "CUSTOM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008e
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0077
            com.ironsource.mediationsdk.ISBannerSize r0 = r5.getSize()
            int r0 = r0.getHeight()
            if (r0 > 0) goto L_0x008e
        L_0x0077:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C6681o.m20255a()
            java.lang.String r0 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r0)
            r6.mo36812a(r5, r0, r1)
            return
        L_0x008e:
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()
            com.ironsource.mediationsdk.Q$a r0 = r0.mo36219b()
            com.ironsource.mediationsdk.Q$a r3 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED
            if (r0 != r3) goto L_0x00b4
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C6681o.m20255a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 600(0x258, float:8.41E-43)
            java.lang.String r3 = "Init() had failed"
            r0.<init>(r2, r3)
            r6.mo36812a(r5, r0, r1)
            return
        L_0x00b4:
            com.ironsource.mediationsdk.Q$a r3 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_IN_PROGRESS
            if (r0 != r3) goto L_0x00e5
            com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.m19479a()
            boolean r0 = r0.mo36221c()
            if (r0 == 0) goto L_0x00dc
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "init() had failed"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C6681o.m20255a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 601(0x259, float:8.42E-43)
            java.lang.String r3 = "Init had failed"
            r0.<init>(r2, r3)
            r6.mo36812a(r5, r0, r1)
            return
        L_0x00dc:
            r4.f16401af = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f16400ae = r5
            r4.f16402ag = r6
            return
        L_0x00e5:
            boolean r0 = r4.m19300H()
            if (r0 != 0) goto L_0x0105
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "No banner configurations found"
            r6.log(r0, r3, r2)
            com.ironsource.mediationsdk.o r6 = com.ironsource.mediationsdk.C6681o.m20255a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r2 = 615(0x267, float:8.62E-43)
            java.lang.String r3 = "the server response does not contain banner data"
            r0.<init>(r2, r3)
            r6.mo36812a(r5, r0, r1)
            return
        L_0x0105:
            java.lang.Boolean r0 = r4.f16400ae
            monitor-enter(r0)
            com.ironsource.mediationsdk.p r1 = r4.f16415e     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011a
            com.ironsource.mediationsdk.T r1 = r4.f16370B     // Catch:{ all -> 0x0133 }
            if (r1 != 0) goto L_0x011a
            r4.f16401af = r5     // Catch:{ all -> 0x0133 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0133 }
            r4.f16400ae = r5     // Catch:{ all -> 0x0133 }
            r4.f16402ag = r6     // Catch:{ all -> 0x0133 }
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            return
        L_0x011a:
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            boolean r0 = r4.f16379K
            if (r0 != 0) goto L_0x0129
            com.ironsource.mediationsdk.p r0 = r4.f16415e
            com.ironsource.mediationsdk.model.g r6 = r4.m19346x(r6)
            r0.mo36817a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.C6656g) r6)
            return
        L_0x0129:
            com.ironsource.mediationsdk.T r0 = r4.f16370B
            com.ironsource.mediationsdk.model.g r6 = r4.m19346x(r6)
            r0.mo36254a((com.ironsource.mediationsdk.IronSourceBannerLayout) r5, (com.ironsource.mediationsdk.model.C6656g) r6)
            return
        L_0x0133:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            throw r5
        L_0x0136:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "loadBanner can't be called - "
            r6.<init>(r0)
            if (r5 != 0) goto L_0x0142
            java.lang.String r0 = "banner layout is null "
            goto L_0x0144
        L_0x0142:
            java.lang.String r0 = "banner layout is destroyed"
        L_0x0144:
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r0.log(r3, r6, r2)
            com.ironsource.mediationsdk.o r0 = com.ironsource.mediationsdk.C6681o.m20255a()
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r6)
            r0.mo36812a(r5, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36124a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo36125a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.f16433w) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.f16374F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.f16374F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        C6577ae.m20001a().f17046b = levelPlayRewardedVideoManualListener;
    }

    /* renamed from: a */
    public final synchronized void mo36126a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.f16433w) {
            if (rewardedVideoManualListener == null) {
                this.f16374F = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.f16374F = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.f16417g.f17491a = rewardedVideoManualListener;
        C6577ae.m20001a().f17045a = rewardedVideoManualListener;
    }

    /* renamed from: a */
    public final void mo36028a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f16417g != null) {
                for (IronSource.AD_UNIT a : this.f16392X) {
                    m19311a(a, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo36127a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C6622d.m20139a().mo36649a(metaDataKey, metaDataValue);
            } else if (C6473Q.m19479a().mo36219b() != C6473Q.C6478a.INITIATED || !MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                C6356a.m18973a().mo35846a(metaDataKey, metaDataValue);
            } else {
                IronLog ironLog2 = IronLog.API;
                ironLog2.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C6622d.m20139a().f17162c;
                concurrentHashMap.putAll(C6356a.m18973a().mo35850d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.f16410ao.mo56299a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            C6522h.m19751d().mo36349b(new C6517c(C6473Q.m19479a().mo36219b() == C6473Q.C6478a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36128a(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.f16421k = str;
        if (z) {
            C6522h.m19751d().mo36349b(new C6517c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    /* renamed from: a */
    public final void mo36030a(List<IronSource.AD_UNIT> list, boolean z, C6657h hVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.f16391W = list;
            this.f16390V = true;
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C6522h.m19751d().mo36349b(new C6517c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C6518d.m19731d().mo36349b(new C6517c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            C6518d.m19731d().mo36353c();
            C6522h.m19751d().mo36353c();
            C6622d a = C6622d.m20139a();
            String str = this.f16420j;
            String str2 = this.f16421k;
            a.f17160a = str;
            a.f17161b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f16392X.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m19328b(ad_unit);
                    } else {
                        m19311a(ad_unit, false);
                    }
                }
            }
            m19302J();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized AbstractAdapter mo36129b(String str) {
        try {
            if (this.f16386R != null && this.f16386R.getProviderName().equals(str)) {
                return this.f16386R;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Placement mo36130b() {
        C6666p pVar = this.f16419i.f17750c.f17352a;
        if (pVar != null) {
            return pVar.mo36792a();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo36131b(Context context) {
        String str;
        C6755p pVar;
        JSONObject jSONObject;
        m19309a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        C6473Q.C6478a b = C6473Q.m19479a().mo36219b();
        if (b == C6473Q.C6478a.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            m19309a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b == C6473Q.C6478a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            m19309a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                C6748l a = this.f16419i != null ? this.f16419i : C6448H.m19236a(context);
                if (b == C6473Q.C6478a.NOT_INIT) {
                    this.f16410ao.mo56295a(context);
                    this.f16410ao.mo56301b(IronSourceUtils.getSDKVersion());
                    this.f16410ao.mo56304c(this.f16426p);
                    this.f16410ao.mo56305d(ConfigFile.getConfigFile().getPluginType());
                    this.f16410ao.mo56296a(C6353a.m18972a());
                    this.f16410ao.mo56303b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b != C6473Q.C6478a.INITIATED) {
                    C6473Q.m19479a().mo36218a(a);
                    if (a != null) {
                        C6473Q.m19479a().mo36214a(context, a);
                    }
                }
                if (a == null || !a.mo36981b()) {
                    pVar = new C6755p();
                } else {
                    pVar = a.f17750c.f17356e.mo56487c();
                    if (!pVar.f17792d) {
                        pVar.f17790b = a.f17724b.mo36788a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pVar, "tokenSettings");
                if (pVar.f17792d) {
                    C6391b bVar = new C6391b();
                    Intrinsics.checkNotNullParameter(context, "context");
                    JSONObject a2 = C6689r.m20300a(context, bVar.f16176a);
                    Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
                    jSONObject = C6391b.m19080a(a2);
                } else {
                    NetworkSettings networkSettings = pVar.f17790b;
                    if (networkSettings != null) {
                        C6622d a3 = C6622d.m20139a();
                        Intrinsics.checkNotNullExpressionValue(networkSettings, "it");
                        AbstractAdapter a4 = a3.mo36647a(networkSettings, networkSettings.getApplicationSettings(), true, false);
                        if (a4 != null) {
                            jSONObject = C6625f.m20163a().mo36659a(a4.getPlayerBiddingData(), pVar.f17791c, (List<String>) pVar.f17789a);
                        }
                    }
                    jSONObject = null;
                }
                C6625f.m20163a().mo36660a(jSONObject, true);
                str = pVar.f17793e ? IronSourceAES.compressAndEncrypt(jSONObject.toString()) : IronSourceAES.encrypt(jSONObject.toString());
            } catch (Throwable th) {
                m19309a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog.API.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                m19309a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo36132b(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f16416f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0162 }
            r2.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0162 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0162 }
            boolean r0 = r5.f16433w     // Catch:{ all -> 0x0144 }
            r1 = 508(0x1fc, float:7.12E-43)
            r2 = 3
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0035:
            boolean r0 = r5.f16431u     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r6 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0050:
            r0 = 0
            if (r6 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            r1.updateActivity(r6)     // Catch:{ all -> 0x0144 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x008c
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0144 }
            r8 = 81321(0x13da9, float:1.13955E-40)
            m19309a((int) r8, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x008c:
            com.ironsource.mediationsdk.Q r6 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Q$a r6 = r6.mo36219b()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ all -> 0x0144 }
            if (r6 != r1) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0144 }
            r4 = 83002(0x1443a, float:1.1631E-40)
            if (r6 != r1) goto L_0x00f6
            com.ironsource.mediationsdk.Q r6 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0144 }
            boolean r6 = r6.mo36221c()     // Catch:{ all -> 0x0144 }
            if (r6 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f16407al     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f16407al     // Catch:{ all -> 0x00f3 }
            r0.add(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00f1
            int r6 = r5.f16380L     // Catch:{ all -> 0x0144 }
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r6)     // Catch:{ all -> 0x0144 }
            m19309a((int) r4, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            monitor-exit(r5)
            return
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x00f6:
            boolean r6 = r5.mo36141e()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x0116
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f16416f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "No rewarded video configurations found"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.ad r6 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0116:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f16407al     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.y r1 = r5.f16409an     // Catch:{ all -> 0x0141 }
            if (r1 != 0) goto L_0x0130
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f16407al     // Catch:{ all -> 0x0141 }
            r0.add(r7)     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x012d
            int r8 = r5.f16380L     // Catch:{ all -> 0x0141 }
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r8)     // Catch:{ all -> 0x0141 }
            m19309a((int) r4, (org.json.JSONObject) r8)     // Catch:{ all -> 0x0141 }
        L_0x012d:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            monitor-exit(r5)
            return
        L_0x0130:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x013a
            com.ironsource.mediationsdk.y r6 = r5.f16409an     // Catch:{ all -> 0x0144 }
            r8 = 0
            r6.mo37008a((java.lang.String) r7, (java.lang.String) r8, (boolean) r0)     // Catch:{ all -> 0x0144 }
            goto L_0x0160
        L_0x013a:
            com.ironsource.mediationsdk.y r6 = r5.f16409an     // Catch:{ all -> 0x0144 }
            r6.mo37008a((java.lang.String) r7, (java.lang.String) r8, (boolean) r3)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0141:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r6 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f16416f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r8.logException(r0, r1, r6)     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.ad r8 = com.ironsource.mediationsdk.C6530ad.m19809a()     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0162 }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0162 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0162 }
            r8.mo36394a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0162 }
        L_0x0160:
            monitor-exit(r5)
            return
        L_0x0162:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36132b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo36133b(boolean z) {
        this.f16435y = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C6622d.m20139a().mo36651a(z);
        if (this.f16386R != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f16386R.setConsent(z);
        }
        int i = 40;
        if (!z) {
            i = 41;
        }
        this.f16410ao.mo56300a(z);
        C6522h.m19751d().mo36349b(new C6517c(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: c */
    public final synchronized void mo36134c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C6425E.m19206a().mo35987a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo36137d(activity, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r9.f16436z.mo35986c() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r9.f16372D.mo36514b() != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ all -> 0x008a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36135c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f16431u     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f16416f     // Catch:{ all -> 0x008f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x008f }
            return r2
        L_0x0013:
            boolean r3 = r9.f16374F     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r9.f16405aj     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            boolean r3 = r9.f16373E     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0030
            com.ironsource.mediationsdk.D r3 = r9.f16436z     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.D r3 = r9.f16436z     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo35986c()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
        L_0x002c:
            r3 = r1
            goto L_0x0044
        L_0x002e:
            r3 = r2
            goto L_0x0044
        L_0x0030:
            com.ironsource.mediationsdk.af r3 = r9.f16412b     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo36594c()     // Catch:{ all -> 0x008f }
            goto L_0x0044
        L_0x0037:
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f16372D     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f16372D     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo36514b()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            goto L_0x002c
        L_0x0044:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x008a }
            boolean r5 = r9.f16373E     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x0062
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x008a }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x008a }
            int r7 = r9.f16380L     // Catch:{ all -> 0x008a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x008a }
            r6[r1] = r7     // Catch:{ all -> 0x008a }
            r5[r2] = r6     // Catch:{ all -> 0x008a }
            m19319a((org.json.JSONObject) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x008a }
        L_0x0062:
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x006b
        L_0x0069:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x006b:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ all -> 0x008a }
            r4.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r5)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16416f     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r6.<init>(r0)     // Catch:{ all -> 0x008a }
            r6.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008a }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x008a }
            r2 = r3
            goto L_0x00ad
        L_0x008a:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0091
        L_0x008f:
            r3 = move-exception
            r4 = r2
        L_0x0091:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isRewardedVideoAvailable()"
            r0.logException(r1, r4, r3)
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36135c():boolean");
    }

    /* renamed from: c */
    public final boolean mo36136c(String str) {
        try {
            this.f16416f.log(IronSourceLogger.IronSourceTag.API, this.f16395a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            C6357b bVar = new C6357b();
            if (!m19324a(str, 1, 128)) {
                bVar.mo35851a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (bVar.mo35852a()) {
                this.f16423m = str;
                C6522h.m19751d().mo36349b(new C6517c(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, bVar.mo35853b().toString(), 2);
            return false;
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f16395a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo36137d(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f16416f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x015c }
            r2.append(r8)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x015c }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r1 = r6.f16434x     // Catch:{ all -> 0x0140 }
            r2 = 3
            if (r1 != 0) goto L_0x0035
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0035:
            boolean r1 = r6.f16432v     // Catch:{ all -> 0x0140 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0050:
            r1 = 0
            if (r7 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            r4.updateActivity(r7)     // Catch:{ all -> 0x0140 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x008c
            if (r9 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r3)     // Catch:{ all -> 0x0140 }
            r9 = 82321(0x14191, float:1.15356E-40)
            m19327b((int) r9, (org.json.JSONObject) r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r7)     // Catch:{ all -> 0x0140 }
            r9.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x008c:
            com.ironsource.mediationsdk.Q r7 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.Q$a r7 = r7.mo36219b()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.Q$a r4 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ all -> 0x0140 }
            if (r7 != r4) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.Q$a r4 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0140 }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00f4
            com.ironsource.mediationsdk.Q r7 = com.ironsource.mediationsdk.C6473Q.m19479a()     // Catch:{ all -> 0x0140 }
            boolean r7 = r7.mo36221c()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f16406ak     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f16406ak     // Catch:{ all -> 0x00f1 }
            r1.add(r8)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00ef
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0140 }
            m19327b((int) r5, (org.json.JSONObject) r7)     // Catch:{ all -> 0x0140 }
        L_0x00ef:
            monitor-exit(r6)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x00f4:
            boolean r7 = r6.mo36150j()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x0114
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f16416f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "No interstitial configurations found"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0114:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f16406ak     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.w r2 = r6.f16381M     // Catch:{ all -> 0x013d }
            if (r2 != 0) goto L_0x012c
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f16406ak     // Catch:{ all -> 0x013d }
            r1.add(r8)     // Catch:{ all -> 0x013d }
            if (r9 == 0) goto L_0x0129
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x013d }
            m19327b((int) r5, (org.json.JSONObject) r9)     // Catch:{ all -> 0x013d }
        L_0x0129:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            monitor-exit(r6)
            return
        L_0x012c:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            if (r9 != 0) goto L_0x0136
            com.ironsource.mediationsdk.w r7 = r6.f16381M     // Catch:{ all -> 0x0140 }
            r9 = 0
            r7.mo37002a((java.lang.String) r8, (java.lang.String) r9, (boolean) r1)     // Catch:{ all -> 0x0140 }
            goto L_0x015a
        L_0x0136:
            com.ironsource.mediationsdk.w r7 = r6.f16381M     // Catch:{ all -> 0x0140 }
            r7.mo37002a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x013d:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f16416f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r9.logException(r1, r2, r7)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.E r9 = com.ironsource.mediationsdk.C6425E.m19206a()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x015c }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x015c }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x015c }
            r9.mo35987a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r6)
            return
        L_0x015c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36137d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo36138d(String str) {
        try {
            this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f16395a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!m19324a(str, 1, 64) || !m19343v(str)) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f16425o = str;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f16395a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo36139d() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17352a == null) ? false : true;
    }

    /* renamed from: e */
    public final void mo36140e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f16416f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.f16431u) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                C6577ae.m20001a().mo36561a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!mo36139d()) {
                C6577ae.m20001a().mo36561a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (this.f16373E) {
                m19333q(str);
            } else {
                Placement r = m19334r(str);
                if (r != null) {
                    this.f16412b.mo36588a(r);
                    this.f16412b.mo36589a(r.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.f16416f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            C6577ae.m20001a().mo36561a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()), (AdInfo) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo36141e() {
        return mo36139d() && m19297E();
    }

    /* renamed from: f */
    public final void mo36039f() {
        synchronized (this.f16400ae) {
            if (this.f16400ae.booleanValue()) {
                this.f16400ae = Boolean.FALSE;
                C6681o.m20255a().mo36812a(this.f16401af, new IronSourceError(603, "init had failed"), false);
                this.f16401af = null;
                this.f16402ag = null;
            }
        }
        if (this.f16378J) {
            this.f16378J = false;
            C6732u.m20387a().mo36954a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        if (this.f16375G) {
            this.f16375G = false;
            C6732u.m20387a().mo36954a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f16406ak) {
            Iterator<String> it = this.f16406ak.iterator();
            while (it.hasNext()) {
                C6425E.m19206a().mo35987a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.f16406ak.clear();
        }
        synchronized (this.f16407al) {
            Iterator<String> it2 = this.f16407al.iterator();
            while (it2.hasNext()) {
                C6530ad.m19809a().mo36394a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f16407al.clear();
        }
        synchronized (this.f16408am) {
            Iterator<String> it3 = this.f16408am.iterator();
            while (it3.hasNext()) {
                C6644m.m20216a().mo36714a(it3.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.BANNER_AD_UNIT));
            }
            this.f16408am.clear();
            this.f16399ad.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo36142f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.f16431u) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                C6530ad.m19809a().mo36395b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            } else if (this.f16409an == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
                C6530ad.m19809a().mo36395b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
                return;
            } else {
                C6762y yVar = this.f16409an;
                if (!yVar.f17809a.containsKey(str)) {
                    C6762y.m20531a(1500, str);
                    C6530ad.m19809a().mo36395b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    C6763z zVar = yVar.f17809a.get(str);
                    yVar.mo37007a((int) IronSourceConstants.RV_INSTANCE_SHOW, zVar);
                    zVar.mo37009a();
                    return;
                }
            }
        } catch (Exception e) {
            this.f16416f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            C6530ad.m19809a().mo36395b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public InterstitialPlacement mo36143g() {
        C6658i iVar = this.f16419i.f17750c.f17353b;
        if (iVar != null) {
            return iVar.mo36779a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36144g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.y r0 = r4.f16409an     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.y r0 = r4.f16409an     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r2 = r0.f17809a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C6762y.m20531a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = r1
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.z> r0 = r0.f17809a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.z r5 = (com.ironsource.mediationsdk.C6763z) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo37011b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C6762y.m20530a((int) r0, (com.ironsource.mediationsdk.C6763z) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = r3
            goto L_0x0034
        L_0x002e:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C6762y.m20530a((int) r0, (com.ironsource.mediationsdk.C6763z) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36144g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0068;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36145h(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            boolean r3 = r7.f16432v     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0039
            java.lang.String r8 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f16416f     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0095 }
            r5 = 3
            r3.log(r4, r8, r5)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.F r3 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.logger.IronSourceError r4 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x0095 }
            r4.<init>(r1, r8)     // Catch:{ Exception -> 0x0095 }
            r3.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0039:
            boolean r3 = r7.mo36147i()     // Catch:{ Exception -> 0x0095 }
            if (r3 != 0) goto L_0x004f
            com.ironsource.mediationsdk.F r8 = com.ironsource.mediationsdk.C6432F.m19211a()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r4 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r3, r4)     // Catch:{ Exception -> 0x0095 }
            r8.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x004f:
            boolean r3 = r7.f16376H     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0057
            r7.m19339t(r8)     // Catch:{ Exception -> 0x0095 }
            return
        L_0x0057:
            com.ironsource.mediationsdk.model.InterstitialPlacement r3 = r7.m19340u(r8)     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = "placement"
            if (r3 == 0) goto L_0x006c
            java.lang.String r8 = r3.getPlacementName()     // Catch:{ JSONException -> 0x0073 }
        L_0x0068:
            r4.put(r5, r8)     // Catch:{ JSONException -> 0x0073 }
            goto L_0x0077
        L_0x006c:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0073 }
            if (r6 != 0) goto L_0x0077
            goto L_0x0068
        L_0x0073:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ Exception -> 0x0095 }
        L_0x0077:
            com.ironsource.mediationsdk.a.c r8 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0095 }
            r5 = 2100(0x834, float:2.943E-42)
            r8.<init>(r5, r4)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ Exception -> 0x0095 }
            r4.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r8)     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0094
            com.ironsource.mediationsdk.I r8 = r7.f16413c     // Catch:{ Exception -> 0x0095 }
            r8.mo36027a((com.ironsource.mediationsdk.model.InterstitialPlacement) r3)     // Catch:{ Exception -> 0x0095 }
            com.ironsource.mediationsdk.I r8 = r7.f16413c     // Catch:{ Exception -> 0x0095 }
            r3.getPlacementName()     // Catch:{ Exception -> 0x0095 }
            r8.mo36035d()     // Catch:{ Exception -> 0x0095 }
        L_0x0094:
            return
        L_0x0095:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r7.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3.logException(r4, r0, r8)
            com.ironsource.mediationsdk.F r0 = com.ironsource.mediationsdk.C6432F.m19211a()
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r8 = r8.getMessage()
            r3.<init>(r1, r8)
            r0.mo35997a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36145h(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r9.f16371C.mo36514b() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r9.f16413c.mo36038e() != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ all -> 0x0073 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36146h() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f16432v     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f16416f     // Catch:{ all -> 0x0078 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0013:
            boolean r3 = r9.f16376H     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r9.f16377I     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002b
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f16371C     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f16371C     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36514b()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x0045
        L_0x0029:
            r3 = r2
            goto L_0x0045
        L_0x002b:
            com.ironsource.mediationsdk.W r3 = r9.f16369A     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.W r3 = r9.f16369A     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36300f()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0038:
            com.ironsource.mediationsdk.I r3 = r9.f16413c     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.I r3 = r9.f16413c     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo36038e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0045:
            boolean r4 = r9.f16376H     // Catch:{ all -> 0x0073 }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0052
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x0054
        L_0x0052:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x0054:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p206a.C6518d.m19731d()     // Catch:{ all -> 0x0073 }
            r4.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r5)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f16416f     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r6.<init>(r0)     // Catch:{ all -> 0x0073 }
            r6.append(r3)     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0073 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0073 }
            r2 = r3
            goto L_0x0096
        L_0x0073:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x007a
        L_0x0078:
            r3 = move-exception
            r4 = r2
        L_0x007a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f16416f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36146h():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo36147i() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17353b == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36148i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.w r0 = r4.f16381M     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.w r0 = r4.f16381M     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r2 = r0.f17804a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C6759w.m20510a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = r1
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.x> r0 = r0.f17804a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.x r5 = (com.ironsource.mediationsdk.C6760x) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo37005b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C6759w.m20509a((int) r0, (com.ironsource.mediationsdk.C6760x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = r3
            goto L_0x0034
        L_0x002e:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C6759w.m20509a((int) r0, (com.ironsource.mediationsdk.C6760x) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36148i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final void mo36149j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f16416f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!mo36152k()) {
                this.f16417g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C6660k a = this.f16419i.f17750c.f17354c.mo36781a(str);
            if (a == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f16419i.f17750c.f17354c.mo36780a();
                if (a == null) {
                    this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f16414d.mo36240a(a.f17372b);
        } catch (Exception e) {
            this.f16416f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f16417g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo36150j() {
        return mo36147i() && m19298F();
    }

    /* renamed from: k */
    public final InterstitialPlacement mo36151k(String str) {
        try {
            InterstitialPlacement s = m19336s(str);
            if (s == null) {
                try {
                    this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s = mo36143g();
                } catch (Exception unused) {
                    return s;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s, 1);
            return s;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo36152k() {
        C6748l lVar = this.f16419i;
        return (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17354c == null) ? false : true;
    }

    /* renamed from: l */
    public final Placement mo36153l(String str) {
        try {
            Placement p = m19330p(str);
            if (p == null) {
                try {
                    this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p = mo36130b();
                } catch (Exception unused) {
                    return p;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p, 1);
            return p;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo36154l() {
        try {
            if (this.f16414d != null) {
                return this.f16414d.mo36243a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final String mo36155m() {
        return this.f16420j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo36156m(String str) {
        boolean z = false;
        if (this.f16432v) {
            return false;
        }
        if (m19344w(str) != C6745k.C6747a.f17643d) {
            z = true;
        }
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f16432v, this.f16376H, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.f16376H) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            C6518d.m19731d().mo36349b(new C6517c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo36157n() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            m19309a((int) r0, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            r0.info()
            com.ironsource.mediationsdk.utils.l r0 = r8.f16419i
            if (r0 != 0) goto L_0x0019
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00ec
        L_0x0019:
            com.ironsource.mediationsdk.model.o r0 = r0.f17724b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.mo36788a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00ec
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C6622d.m20139a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.mo36647a(r0, r4, r6, r5)
            if (r0 == 0) goto L_0x003c
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00cb }
        L_0x003c:
            com.ironsource.mediationsdk.utils.l r0 = r8.f16419i     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.model.h r0 = r0.f17750c     // Catch:{ Exception -> 0x00cb }
            com.ironsource.sdk.controller.u r0 = r0.f17356e     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.utils.p r0 = r0.mo56487c()     // Catch:{ Exception -> 0x00cb }
            boolean r3 = r0.f17792d     // Catch:{ Exception -> 0x00cb }
            if (r3 == 0) goto L_0x005b
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch:{ Exception -> 0x00cb }
            r2.<init>()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r2.mo35900a()     // Catch:{ Exception -> 0x00cb }
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C6625f.m20163a()     // Catch:{ Exception -> 0x00cb }
            r3.mo36660a((org.json.JSONObject) r2, (boolean) r6)     // Catch:{ Exception -> 0x00cb }
            goto L_0x0067
        L_0x005b:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C6625f.m20163a()     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r4 = r0.f17791c     // Catch:{ Exception -> 0x00cb }
            java.util.ArrayList<java.lang.String> r5 = r0.f17789a     // Catch:{ Exception -> 0x00cb }
            org.json.JSONObject r2 = r3.mo36659a((org.json.JSONObject) r2, (org.json.JSONObject) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x00cb }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            r4.append(r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cb }
            r4.append(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cb }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cb }
            boolean r0 = r0.f17793e     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch:{ Exception -> 0x00cb }
        L_0x00ac:
            if (r0 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c6 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00c6 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c6 }
            r2.verbose(r3)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ed
        L_0x00c6:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00cd
        L_0x00cb:
            r0 = move-exception
            r2 = r1
        L_0x00cd:
            r3 = 83007(0x1443f, float:1.16318E-40)
            m19309a((int) r3, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00ed
        L_0x00ec:
            r0 = r1
        L_0x00ed:
            if (r0 != 0) goto L_0x00f5
            r2 = 83006(0x1443e, float:1.16316E-40)
            m19309a((int) r2, (org.json.JSONObject) r1)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6459L.mo36157n():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo36158n(String str) {
        if (!m19299G()) {
            return false;
        }
        C6656g gVar = null;
        try {
            gVar = this.f16419i.f17750c.f17355d.mo36777a(str);
            if (gVar == null && (gVar = this.f16419i.f17750c.f17355d.mo36776a()) == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (gVar == null) {
            return false;
        }
        return C6745k.m20449b(ContextProvider.getInstance().getApplicationContext(), gVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo36159o(String str) {
        C6748l lVar = this.f16419i;
        if (lVar == null || lVar.f17750c == null || this.f16419i.f17750c.f17352a == null) {
            return C6745k.C6747a.f17643d;
        }
        Placement placement = null;
        try {
            placement = m19330p(str);
            if (placement == null && (placement = mo36130b()) == null) {
                this.f16416f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? C6745k.C6747a.f17643d : C6745k.m20446b(ContextProvider.getInstance().getApplicationContext(), placement);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo36160o() {
        return this.f16431u || this.f16432v || this.f16397ab;
    }
}
