package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5796be;
import com.inmobi.media.C5991eu;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6281n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C11130Ad;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.squareup.picasso.Picasso;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.af */
/* compiled from: AdUnit */
public abstract class C5706af extends C6321s implements C5742ak, C5796be.C5801a, C5842br, C5932dm, C5948du, C6094fv.C6097c, C6278k {

    /* renamed from: H */
    private static HashSet<Byte> f14330H = new HashSet<>(Arrays.asList(new Byte[]{(byte) 5, (byte) 53, Byte.valueOf(Ascii.DLE), (byte) 39, Byte.valueOf(Ascii.NAK)}));

    /* renamed from: a */
    static final String f14331a = C5706af.class.getSimpleName();

    /* renamed from: A */
    private C5796be f14332A;

    /* renamed from: B */
    private WeakReference<C5724a> f14333B;

    /* renamed from: C */
    private long f14334C = 0;

    /* renamed from: D */
    private HashMap<Integer, Set<C5951dx>> f14335D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f14336E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C6301q f14337F;

    /* renamed from: G */
    private C5933dn f14338G;

    /* renamed from: I */
    private String f14339I;

    /* renamed from: J */
    private Map<String, C6166hj> f14340J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C6321s f14341K;

    /* renamed from: b */
    byte f14342b;

    /* renamed from: c */
    C6074ft f14343c;

    /* renamed from: d */
    protected ArrayList<C6301q> f14344d = new ArrayList<>();

    /* renamed from: e */
    long f14345e;

    /* renamed from: f */
    long f14346f = 0;

    /* renamed from: g */
    public C6281n f14347g;

    /* renamed from: h */
    byte f14348h;

    /* renamed from: i */
    public Handler f14349i;

    /* renamed from: j */
    boolean f14350j;

    /* renamed from: k */
    boolean f14351k;

    /* renamed from: l */
    boolean f14352l = false;

    /* renamed from: m */
    boolean f14353m;

    /* renamed from: n */
    C5873cm f14354n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C5791bc f14355o;

    /* renamed from: p */
    C5794bd f14356p;

    /* renamed from: q */
    boolean f14357q = false;

    /* renamed from: r */
    int f14358r = 0;

    /* renamed from: s */
    int f14359s = 0;

    /* renamed from: t */
    long f14360t = -1;

    /* renamed from: u */
    TreeSet<Integer> f14361u = new TreeSet<>();

    /* renamed from: v */
    boolean f14362v = false;

    /* renamed from: w */
    final C6185hy f14363w;

    /* renamed from: x */
    protected C5705ae f14364x;

    /* renamed from: y */
    private WeakReference<Context> f14365y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C6268jq f14366z;

    /* renamed from: com.inmobi.media.af$a */
    /* compiled from: AdUnit */
    public static abstract class C5724a {
        /* renamed from: a */
        public void mo34521a() {
        }

        /* renamed from: a */
        public void mo34522a(int i, int i2, C6301q qVar) {
        }

        /* renamed from: a */
        public void mo34523a(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: a */
        public void mo34524a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34525a(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34526a(C5706af afVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo34527a(C5791bc bcVar, C5794bd bdVar) {
        }

        /* renamed from: a */
        public void mo34528a(C6173ho hoVar) {
        }

        /* renamed from: a */
        public void mo34529a(Map<Object, Object> map) {
        }

        /* renamed from: a */
        public void mo34530a(boolean z) {
        }

        /* renamed from: a */
        public void mo34531a(byte[] bArr) {
        }

        /* renamed from: b */
        public void mo34532b() {
        }

        /* renamed from: b */
        public void mo34533b(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: b */
        public void mo34534b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo34535b(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo34536b(Map<Object, Object> map) {
        }

        /* renamed from: c */
        public void mo34537c() {
        }

        /* renamed from: c */
        public void mo34538c(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: d */
        public void mo34539d() {
        }

        /* renamed from: e */
        public void mo34540e() {
        }

        /* renamed from: f */
        public void mo34541f() {
        }

        /* renamed from: g */
        public boolean mo34542g() {
            return true;
        }

        /* renamed from: h */
        public void mo34543h() {
        }

        /* renamed from: i */
        public void mo34544i() {
        }

        /* renamed from: j */
        public void mo34545j() {
        }

        /* renamed from: k */
        public void mo34546k() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo34392P() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo34393Q() {
    }

    /* renamed from: S */
    public abstract void mo34395S();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34417a(C5791bc bcVar, boolean z) {
    }

    /* renamed from: a */
    public void mo34422a(C6301q qVar, Context context) {
    }

    /* renamed from: b */
    public boolean mo34446b(C6301q qVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34468f(C5724a aVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34471g(C5724a aVar) {
    }

    /* renamed from: k */
    public abstract String mo34479k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract byte mo34481l();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Integer mo34493w() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007c, code lost:
        if (r1 != null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5706af(android.content.Context r4, com.inmobi.media.C5791bc r5, com.inmobi.media.C5706af.C5724a r6) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f14344d = r0
            r0 = 0
            r3.f14346f = r0
            r3.f14334C = r0
            r0 = 0
            r3.f14352l = r0
            r3.f14357q = r0
            r3.f14358r = r0
            r3.f14359s = r0
            r1 = -1
            r3.f14360t = r1
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r3.f14361u = r1
            r3.f14362v = r0
            r1 = 0
            r3.f14339I = r1
            com.inmobi.media.hy r2 = com.inmobi.media.C6185hy.m18355a()
            r3.f14363w = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.f14340J = r2
            com.inmobi.media.af$3 r2 = new com.inmobi.media.af$3
            r2.<init>()
            r3.f14341K = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            r3.f14365y = r2
            r3.f14355o = r5
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r6)
            r3.f14333B = r4
            com.inmobi.media.ae r4 = new com.inmobi.media.ae
            java.lang.ref.WeakReference<com.inmobi.media.af$a> r5 = r3.f14333B
            r4.<init>(r5)
            r3.f14364x = r4
            java.lang.String r4 = com.inmobi.media.C6183hw.m18332f()
            java.lang.String r5 = "ads"
            com.inmobi.media.fu r4 = com.inmobi.media.C6094fv.m18084a(r5, r4, r3)
            com.inmobi.media.ft r4 = (com.inmobi.media.C6074ft) r4
            r3.f14343c = r4
            com.inmobi.media.bc r4 = r3.f14355o
            java.lang.String r4 = r4.mo34715a()
            java.lang.String r5 = "AerServ"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x007f
            com.inmobi.media.jm r4 = com.inmobi.media.C6258jo.m18615c()
            if (r4 == 0) goto L_0x007c
            com.inmobi.media.jq r1 = r4.mo35487f()
        L_0x007c:
            if (r1 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            com.inmobi.media.ft r4 = r3.f14343c
            com.inmobi.media.jq r1 = r4.timeouts
        L_0x0083:
            r3.f14366z = r1
            r3.f14342b = r0
            com.inmobi.media.be r4 = new com.inmobi.media.be
            com.inmobi.media.bc r5 = r3.f14355o
            r4.<init>(r3, r3, r5)
            r3.f14332A = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f14335D = r4
            r4 = -1
            r3.f14348h = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            r3.f14349i = r4
            r3.f14350j = r0
            com.inmobi.media.dn r4 = new com.inmobi.media.dn
            r4.<init>(r3)
            r3.f14338G = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5706af.<init>(android.content.Context, com.inmobi.media.bc, com.inmobi.media.af$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34409a(Context context, C5791bc bcVar, C5724a aVar) {
        mo34408a(context);
        mo34412a(aVar);
        this.f14364x = new C5705ae(this.f14333B);
        this.f14355o = bcVar;
        this.f14340J.put("AdImpressionSuccessful", new C6166hj(this));
    }

    /* renamed from: a */
    public void mo34420a(C6093fu fuVar) {
        if (fuVar instanceof C6074ft) {
            this.f14343c = (C6074ft) fuVar;
        }
    }

    /* renamed from: h */
    public final Context mo34473h() {
        WeakReference<Context> weakReference = this.f14365y;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: a */
    public void mo34408a(Context context) {
        this.f14365y = new WeakReference<>(context);
    }

    /* renamed from: i */
    public final C5791bc mo34475i() {
        return this.f14355o;
    }

    /* renamed from: j */
    public final byte mo34477j() {
        return this.f14342b;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Set<C5951dx> m16762f(int i) {
        return this.f14335D.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, String> mo34483m() {
        return new HashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo34484n() {
        C5783aw u = mo34491u();
        if (u == null) {
            return "unknown";
        }
        return u.mo34679i();
    }

    /* renamed from: o */
    public final C6074ft mo34485o() {
        return this.f14343c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C5724a mo34486p() {
        C5724a aVar = (C5724a) this.f14333B.get();
        if (aVar == null) {
            C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo34412a(C5724a aVar) {
        this.f14333B = new WeakReference<>(aVar);
        this.f14364x = new C5705ae(this.f14333B);
    }

    /* renamed from: q */
    public final boolean mo34487q() {
        C5783aw u = mo34491u();
        return u != null && u.mo34669a(this.f14343c.mo35277a(mo34479k()).timeToLive);
    }

    /* renamed from: r */
    public final C5796be mo34488r() {
        if (this.f14332A == null) {
            this.f14332A = new C5796be(this, this, mo34475i());
        }
        return this.f14332A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.inmobi.media.C6234j mo34489s() {
        /*
            r7 = this;
            byte r0 = r7.mo34477j()
            java.lang.String r1 = r7.mo34484n()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == r3) goto L_0x0033
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L_0x0029
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 == r3) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r6
            goto L_0x003e
        L_0x0029:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r4
            goto L_0x003e
        L_0x0033:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r5
            goto L_0x003e
        L_0x003d:
            r1 = -1
        L_0x003e:
            r2 = 0
            if (r1 == r6) goto L_0x0053
            if (r1 == r4) goto L_0x0053
            if (r1 == r5) goto L_0x0046
            return r2
        L_0x0046:
            if (r0 == 0) goto L_0x0052
            if (r6 == r0) goto L_0x0052
            if (r5 == r0) goto L_0x0052
            if (r4 != r0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            com.inmobi.media.n r0 = r7.f14347g
            return r0
        L_0x0052:
            return r2
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            if (r6 == r0) goto L_0x005f
            if (r5 != r0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            com.inmobi.media.q r0 = r7.mo34490t()
            return r0
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5706af.mo34489s():com.inmobi.media.j");
    }

    /* renamed from: t */
    public C6301q mo34490t() {
        return this.f14344d.get(this.f14359s);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m16765g(int i) {
        C5783aw b = mo34436b(i);
        return b != null && b.mo34675e();
    }

    /* renamed from: u */
    public C5783aw mo34491u() {
        return mo34436b(0);
    }

    /* renamed from: b */
    public C5783aw mo34436b(int i) {
        if (i > 0) {
            C5794bd bdVar = this.f14356p;
            if (bdVar == null) {
                return null;
            }
            return bdVar.mo34756b().get(i);
        }
        C5794bd bdVar2 = this.f14356p;
        if (bdVar2 == null) {
            return null;
        }
        return bdVar2.mo34766l();
    }

    /* renamed from: Y */
    private AdMetaInfo mo34549Y() {
        C5783aw u = mo34491u();
        if (u == null) {
            return null;
        }
        return u.mo34677g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34439b(C5724a aVar) {
        AdMetaInfo Y = mo34549Y();
        if (Y == null) {
            mo34404a((byte) 3);
            aVar.mo34524a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        aVar.mo34523a(Y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34451c(C5724a aVar) {
        AdMetaInfo Y = mo34549Y();
        if (Y == null) {
            aVar.mo34525a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            aVar.mo34533b(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34459d(C5724a aVar) {
        AdMetaInfo Y = mo34549Y();
        if (Y == null) {
            mo34413a(aVar, (byte) 85);
        } else {
            aVar.mo34538c(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34413a(C5724a aVar, byte b) {
        mo34450c((int) b);
        aVar.mo34521a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r11 = com.inmobi.media.C6183hw.m18324c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34434a(com.inmobi.media.C5783aw r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "creativeType"
            java.lang.String r2 = "omidEnabled"
            java.lang.String r3 = "omsdkInfo"
            java.lang.String r4 = "tracking"
            java.lang.String r5 = "metaInfo"
            java.lang.String r6 = "viewability"
            java.lang.String r7 = "unknown"
            java.lang.String r8 = "reason"
            java.lang.String r9 = "errorCode"
            r11 = 0
            org.json.JSONObject r12 = r19.mo34670b()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            java.lang.String r13 = r19.mo34679i()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            boolean r14 = r7.equals(r13)     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            if (r14 == 0) goto L_0x0024
            return r11
        L_0x0024:
            java.lang.String r14 = r19.mo34680j()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            int r15 = r14.length()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            if (r15 == 0) goto L_0x0047
            java.lang.String r15 = "@__imm_aft@"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0163, IllegalArgumentException -> 0x013d }
            long r10 = r1.f14345e     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            long r16 = r16 - r10
            java.lang.String r10 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r10 = r14.replace(r15, r10)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r11 = r19
            r11.mo34671b((java.lang.String) r10)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r10 = 1
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            java.lang.String r11 = "mediationJson"
            boolean r11 = r11.equals(r13)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r11 == 0) goto L_0x0051
            return r10
        L_0x0051:
            android.content.Context r11 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r11 != 0) goto L_0x0058
            return r10
        L_0x0058:
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.dx>> r13 = r1.f14335D     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r13 != 0) goto L_0x0072
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.dx>> r13 = r1.f14335D     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r15.<init>()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r13.put(r14, r15)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x0072:
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.dx>> r13 = r1.f14335D     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r13 == 0) goto L_0x0135
            boolean r14 = r13.isEmpty()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x0135
            com.inmobi.media.ft r14 = r1.f14343c     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.ft$m r14 = r14.viewability     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.ft$h r14 = r14.omidConfig     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r14.omidEnabled     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            boolean r14 = r12.has(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            org.json.JSONObject r5 = r12.getJSONObject(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r5.has(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            org.json.JSONObject r3 = r5.getJSONObject(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r14 = r3.has(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r14 == 0) goto L_0x00ec
            boolean r2 = r3.getBoolean(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 == 0) goto L_0x00ec
            boolean r2 = r5.has(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r7 = r5.getString(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x00ba:
            android.os.Handler r0 = r1.f14349i     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.af$1 r2 = new com.inmobi.media.af$1     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2.<init>(r11)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r0.post(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            com.inmobi.media.dx r0 = new com.inmobi.media.dx     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2 = 3
            r0.<init>(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r2 = "isolateVerificationScripts"
            boolean r2 = r3.optBoolean(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r5 = "customReferenceData"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r11 = "macros"
            org.json.JSONObject r11 = r3.optJSONObject(r11)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.String r14 = "impressionType"
            int r3 = r3.optInt(r14)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            byte r3 = (byte) r3     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Map r2 = com.inmobi.media.C5706af.C5725b.m16935a(r7, r5, r2, r11, r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r0.f15087b = r2     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r13.add(r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x00ec:
            boolean r0 = r12.has(r6)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            org.json.JSONArray r0 = r12.getJSONArray(r6)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Map r0 = m16750a((org.json.JSONArray) r0)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r2 != 0) goto L_0x011b
            com.inmobi.media.dx r2 = new com.inmobi.media.dx     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r3 = 2
            r2.<init>(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            r2.f15087b = r0     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.HashMap<java.lang.Integer, java.util.Set<com.inmobi.media.dx>> r0 = r1.f14335D     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            r0.add(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
        L_0x011b:
            boolean r0 = r12.has(r4)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "web"
            java.lang.String r2 = r12.getString(r4)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x013a, IllegalArgumentException -> 0x0137 }
            if (r0 == 0) goto L_0x0135
            r2 = 0
            r1.f14348h = r2     // Catch:{ JSONException -> 0x0133, IllegalArgumentException -> 0x0131 }
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            goto L_0x013f
        L_0x0133:
            r0 = move-exception
            goto L_0x0165
        L_0x0135:
            r11 = r10
            goto L_0x0189
        L_0x0137:
            r0 = move-exception
            r2 = 0
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            r2 = 0
            goto L_0x0165
        L_0x013d:
            r0 = move-exception
            r2 = r11
        L_0x013f:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.put(r9, r4)
            java.lang.String r4 = r0.getMessage()
            r3.put(r8, r4)
            r1.mo34444b((java.util.Map<java.lang.String, java.lang.Object>) r3)
            com.inmobi.media.gj r3 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r4 = new com.inmobi.media.hk
            r4.<init>(r0)
            r3.mo35310a((com.inmobi.media.C6167hk) r4)
            goto L_0x0188
        L_0x0163:
            r0 = move-exception
            r2 = r11
        L_0x0165:
            com.inmobi.media.gj r3 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r4 = new com.inmobi.media.hk
            r4.<init>(r0)
            r3.mo35310a((com.inmobi.media.C6167hk) r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.put(r9, r4)
            java.lang.String r0 = r0.getMessage()
            r3.put(r8, r0)
            r1.mo34444b((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0188:
            r11 = r2
        L_0x0189:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5706af.mo34434a(com.inmobi.media.aw, int):boolean");
    }

    /* renamed from: a */
    private static Map<String, Object> m16750a(JSONArray jSONArray) {
        JSONObject jSONObject;
        try {
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i++;
            }
            if (jSONObject == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("frame", jSONObject.optJSONArray("frame"));
            int c = mo34559c(jSONObject.optString("time"));
            if (c != -1) {
                hashMap.put("time", Integer.valueOf(c));
            }
            int c2 = mo34559c(jSONObject.optString("view"));
            if (c2 != -1) {
                hashMap.put("view", Integer.valueOf(c2));
            }
            int c3 = mo34559c(jSONObject.optString("pixel"));
            if (c3 != -1) {
                hashMap.put("pixel", Integer.valueOf(c3));
            }
            int optInt = jSONObject.optInt("type");
            if (optInt != -1) {
                hashMap.put("type", Integer.valueOf(optInt));
            }
            return hashMap;
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }

    /* renamed from: c */
    private static int mo34559c(String str) {
        if (str.startsWith("track_")) {
            str = str.substring(6);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34440b(C5794bd bdVar) {
        if (mo34477j() == 1) {
            this.f14356p = bdVar;
            this.f14362v = bdVar.mo34758d();
            this.f14344d = new ArrayList<>(this.f14356p.mo34756b().size());
            for (int i = 0; i < this.f14356p.mo34756b().size(); i++) {
                this.f14344d.add((Object) null);
            }
            C5783aw l = bdVar.mo34766l();
            if (l == null) {
                mo34432a(false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            this.f14363w.mo35396a(hashCode(), new C5768at(this, l, bdVar, false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR)));
        }
    }

    /* renamed from: a */
    public final void mo34411a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, byte b) {
        if (mo34477j() == 1 && z) {
            this.f14342b = 3;
        }
        C5724a p = mo34486p();
        if (p != null) {
            p.mo34525a(this, inMobiAdRequestStatus);
        }
        if (f14330H.contains(Byte.valueOf(b))) {
            mo34437b(b);
        } else if (b != 0) {
            mo34404a(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34431a(boolean z) {
        C5783aw b;
        List<String> c;
        try {
            int i = this.f14358r;
            Context h = mo34473h();
            if (h != null) {
                try {
                    if (this.f14344d.get(i) == null || this.f14344d.get(i).f15957q.get()) {
                        C5783aw b2 = mo34436b(i);
                        C6301q qVar = new C6301q(h, mo34481l(), this.f14335D.get(Integer.valueOf(i)), b2 == null ? null : b2.mo34676f(), Boolean.FALSE, b2.mo34691u() != null ? b2.mo34691u() : "DEFAULT");
                        if (b2 != null) {
                            qVar.f15964x = b2.mo34692v();
                            qVar.setMarkupType(b2.mo34679i());
                        }
                        this.f14344d.set(i, qVar);
                        if (this.f14355o.mo34732l().equals("banner")) {
                            qVar.setAdSize(this.f14355o.mo34733m());
                        }
                        qVar.mo35576a(this, mo34485o(), mo34397U(), true);
                        qVar.setAdPodHandler(this);
                        qVar.setPlacementId(this.f14355o.mo34723e());
                        qVar.setAllowAutoRedirection(m16765g(i));
                        qVar.setContentUrl(this.f14355o.mo34727h());
                        AdMetaInfo Y = mo34549Y();
                        if (Y != null) {
                            qVar.setCreativeId(Y.getCreativeID());
                        }
                        if (this.f14355o.mo34725f()) {
                            qVar.mo35448a();
                        }
                        qVar.setTelemetryManagerMap(this.f14340J);
                    }
                } catch (Exception e) {
                    mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
            if (!z || mo34465e((byte) 2)) {
                this.f14356p.mo34756b().get(this.f14358r).mo34676f();
                C6301q qVar2 = this.f14344d.get(this.f14358r);
                if (qVar2 != null) {
                    if (qVar2.getMarkupType().equals(TJAdUnitConstants.String.HTML)) {
                        qVar2.mo35578a(mo34402a(this.f14358r));
                    } else if (qVar2.getMarkupType().equals("htmlUrl")) {
                        qVar2.mo35581b(mo34402a(this.f14358r));
                    }
                }
                mo34482l(qVar2);
                if (qVar2 != null && qVar2.getMarkupType().equals("htmlUrl") && (b = mo34436b(this.f14344d.indexOf(qVar2))) != null && (c = b.mo34673c(C5783aw.LOAD_AD_TOKEN_URL)) != null) {
                    for (String a : c) {
                        C5820bn.m17365a().mo34792a(a, true);
                    }
                }
            }
        } catch (Exception e2) {
            mo34467f((byte) 2);
            C6195ic.m18378a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            C6130gj.m18161a().mo35310a(new C6167hk(e2));
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: b */
    public void mo34441b(String str) {
        this.f14355o.mo34718b(str);
    }

    /* renamed from: a */
    public void mo34429a(Map<String, String> map) {
        this.f14355o.mo34719b(map);
    }

    /* renamed from: v */
    public Map<String, String> mo34492v() {
        return this.f14355o.mo34720c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo34494x() {
        try {
            RecyclerView.class.getName();
            Picasso.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: a */
    public void mo34430a(final JSONObject jSONObject) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5706af.this.f14363w.mo35396a(C5706af.this.hashCode(), new C5726ag(C5706af.this, jSONObject));
            }
        });
    }

    /* renamed from: y */
    public void mo34495y() {
        this.f14346f = SystemClock.elapsedRealtime();
        if (!C6196id.m18389a()) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
        } else {
            mo34550Z();
        }
    }

    /* renamed from: a */
    public void mo34433a(byte[] bArr) {
        if (!mo34377A()) {
            if (bArr == null || bArr.length == 0) {
                mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (byte) 3);
                return;
            }
            if (this.f14354n == null) {
                this.f14354n = new C5873cm(this);
            }
            this.f14342b = 1;
            this.f14363w.mo35396a(hashCode(), new C5757ap(this, this.f14354n, bArr, mo34475i().mo34723e()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34452c(C5794bd bdVar) {
        mo34419a(bdVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34496z() {
        /*
            r6 = this;
            com.inmobi.media.af$a r0 = r6.mo34486p()
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r6.f14353m
            r4 = 1
            if (r3 == 0) goto L_0x0017
            r0 = 2
            java.lang.String r3 = "InMobi"
            java.lang.String r5 = "getSignals() call is already in progress. Please wait for its execution to get complete"
            com.inmobi.media.C6195ic.m18378a((byte) r0, (java.lang.String) r3, (java.lang.String) r5)
        L_0x0015:
            r0 = r4
            goto L_0x0030
        L_0x0017:
            boolean r3 = r6.mo34494x()
            if (r3 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x0029
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r5 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r3.<init>(r5)
            r0.mo34534b((com.inmobi.ads.InMobiAdRequestStatus) r3)
        L_0x0029:
            r0 = 39
            r6.mo34405a((int) r0, (long) r1)
            goto L_0x0015
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            r6.f14353m = r4
            com.inmobi.media.cm r0 = r6.f14354n
            if (r0 != 0) goto L_0x0040
            com.inmobi.media.cm r0 = new com.inmobi.media.cm
            r0.<init>(r6)
            r6.f14354n = r0
        L_0x0040:
            com.inmobi.media.hy r0 = r6.f14363w
            int r3 = r6.hashCode()
            com.inmobi.media.al r4 = new com.inmobi.media.al
            r4.<init>(r6, r1)
            r0.mo35396a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5706af.mo34496z():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo34377A() {
        if (!C6196id.m18389a()) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
            return true;
        } else if (!C6219in.m18467h()) {
            mo34380D();
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), false, (byte) Ascii.NAK);
            return true;
        } else if (mo34494x()) {
            mo34479k();
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
            return true;
        } else {
            byte b = this.f14342b;
            if (b == 1) {
                mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (byte) 53);
                return true;
            } else if (b != 7) {
                return false;
            } else {
                mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f18305SI);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final byte mo34461e(C5724a aVar) {
        C5949dv dvVar;
        final WeakReference weakReference = new WeakReference(aVar);
        try {
            byte l = mo34481l();
            JSONObject jSONObject = new JSONObject(mo34402a(0));
            C6074ft o = mo34485o();
            HashMap<String, String> a = this.f14356p == null ? null : C6196id.m18385a(this.f14356p.mo34767m());
            C5783aw u = mo34491u();
            if (u != null) {
                if (u instanceof C5839bo) {
                    C5839bo boVar = (C5839bo) u;
                    C5803bg.m17287a();
                    C5784ax b = C5803bg.m17290b(boVar.f14685a);
                    if (b == null || !b.mo34693a()) {
                        throw new IllegalStateException("Asset not available in cache");
                    }
                    dvVar = new C5949dv(b.f14524e, boVar.f14686b, boVar.f14687c, boVar.f14688d, boVar.f14689e, mo34485o().vastVideo);
                } else {
                    dvVar = null;
                }
                C5854ca caVar = new C5854ca((int) l, jSONObject, o, a, dvVar);
                C5783aw u2 = mo34491u();
                if (!caVar.mo34848d() || mo34473h() == null || u2 == null) {
                    return Ascii.DC4;
                }
                C6281n a2 = C6281n.C6294b.m18786a(mo34473h(), mo34481l(), caVar, u2.mo34676f(), m16762f(0), mo34485o(), this.f14355o.mo34723e(), m16765g(0), u2.mo34690t());
                a2.mo35526a((C6281n.C6295c) new C6281n.C6295c() {
                    /* renamed from: a */
                    public final void mo34504a() {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                C5706af.this.mo34413a(aVar, (byte) 91);
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo34508b() {
                        C5706af.this.mo34467f((byte) 4);
                        if (!C5706af.this.f14352l) {
                            C5706af.this.f14349i.post(new Runnable() {
                                public final void run() {
                                    C5706af.this.mo34468f((C5724a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: c */
                    public final void mo34509c() {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34532b();
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: d */
                    public final void mo34510d() {
                        C6195ic.m18378a((byte) 2, "InMobi", "Successfully impressed ad for placement id: " + C5706af.this.f14355o.toString());
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34540e();
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: e */
                    public final void mo34511e() {
                        C6195ic.m18378a((byte) 2, "InMobi", "Ad interaction for placement id: " + C5706af.this.f14355o.toString());
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34529a((Map<Object, Object>) new HashMap());
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: f */
                    public final void mo34512f() {
                        if (!C5706af.this.f14352l) {
                            C6195ic.m18378a((byte) 2, "InMobi", "Ad dismissed for placement id: " + C5706af.this.f14355o.toString());
                            C5706af.this.f14349i.post(new Runnable() {
                                public final void run() {
                                    C5706af.this.mo34471g((C5724a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public final void mo34506a(Map<String, String> map) {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34536b((Map<Object, Object>) new HashMap(map));
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: g */
                    public final void mo34513g() {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34539d();
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: h */
                    public final void mo34514h() {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34541f();
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: i */
                    public final void mo34515i() {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34543h();
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo34507a(boolean z) {
                        if (!C5706af.this.f14352l) {
                            C5724a aVar = (C5724a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo34530a(z);
                            } else {
                                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo34505a(C6173ho hoVar) {
                        if (hoVar != null) {
                            hoVar.f15591d = "nativeBeacon";
                        }
                        if (!C5706af.this.f14352l) {
                            C5706af.this.f14364x.mo34376a(hoVar);
                        } else if (hoVar != null) {
                            hoVar.mo35385c();
                        }
                    }
                });
                this.f14347g = a2;
                a2.f15859w = this.f14340J;
                return 0;
            }
            throw new IllegalStateException("No ad");
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return Ascii.f18296CR;
        } catch (IllegalStateException unused) {
            return 83;
        } catch (Exception e2) {
            C6130gj.m18161a().mo35310a(new C6167hk(e2));
            return 88;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo34378B() {
        C6234j s = mo34489s();
        if (s != null) {
            s.mo35449a((byte) 2, (Map<String, String>) null);
        }
    }

    /* renamed from: C */
    public C5876cp mo34379C() {
        String str = this.f14343c.url;
        C6236ja jaVar = new C6236ja(this.f14343c.mo35283f());
        C5803bg.m17287a();
        C5876cp cpVar = new C5876cp(str, jaVar, C5803bg.m17295e(), this.f14355o);
        cpVar.f14842c = this.f14355o.mo34721d();
        cpVar.f14841b = mo34479k();
        cpVar.f14840a = "unifiedSdkJson";
        cpVar.f14843d = mo34483m();
        cpVar.f15531l = this.f14343c.fetchTimeout * 1000;
        cpVar.f15532m = this.f14343c.fetchTimeout * 1000;
        cpVar.mo35339a(this.f14343c.rendering.enablePubMuteControl && C6183hw.m18331e());
        cpVar.f14844e = this.f14355o.mo34726g();
        return cpVar;
    }

    /* renamed from: D */
    public void mo34380D() {
        if (!this.f14352l) {
            this.f14352l = true;
            mo34381E();
            this.f14335D.clear();
            mo34382F();
            this.f14342b = 0;
            this.f14363w.mo35395a(hashCode());
            this.f14336E = false;
            this.f14337F = null;
            this.f14350j = false;
            this.f14351k = false;
            this.f14353m = false;
            this.f14356p = null;
            this.f14362v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo34382F() {
        int i;
        C6281n nVar = this.f14347g;
        if (nVar != null) {
            nVar.destroy();
            this.f14347g = null;
        }
        if (this.f14359s >= 0 && this.f14344d.size() > (i = this.f14359s) && this.f14344d.get(i) != null) {
            mo34458d(this.f14359s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34478j(C6301q qVar) {
        this.f14344d.indexOf(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo34480k(C6301q qVar) {
        this.f14344d.indexOf(qVar);
        if (qVar != null && qVar.getMarkupType().equals("htmlUrl")) {
            m16766m(qVar);
        }
        mo34404a((byte) Ascii.SYN);
    }

    /* renamed from: e */
    public void mo34464e(C6301q qVar) {
        this.f14344d.indexOf(qVar);
    }

    /* renamed from: f */
    public void mo34469f(C6301q qVar) {
        this.f14344d.indexOf(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo34383G() {
        if (2 == mo34477j()) {
            mo34467f((byte) 2);
            this.f14342b = 3;
            mo34404a((byte) 42);
            if (mo34486p() != null) {
                mo34486p().mo34525a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34410a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (mo34384H()) {
            try {
                C6301q M = mo34389M();
                if (M != null) {
                    M.stopLoading();
                    return;
                }
                C6234j s = mo34489s();
                if (s instanceof C6301q) {
                    ((C6301q) s).stopLoading();
                }
                this.f14342b = 3;
                mo34404a((byte) 41);
                if (mo34486p() != null) {
                    mo34486p().mo34525a(this, inMobiAdRequestStatus);
                }
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo34384H() {
        return mo34477j() == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo34385I() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14346f));
        hashMap.put("markupType", mo34484n());
        m16757c((Map<String, Object>) hashMap);
        mo34454c("AdLoadSuccessful", hashMap);
    }

    /* renamed from: c */
    private void m16757c(Map<String, Object> map) {
        map.put(C11130Ad.AD_TYPE, mo34479k());
        map.put("networkType", C6210ik.m18428b());
        map.put("plId", Long.valueOf(this.f14355o.mo34723e()));
        map.put("plType", this.f14355o.mo34736p());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34404a(byte b) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14346f));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b));
        hashMap.put("markupType", mo34484n());
        m16757c((Map<String, Object>) hashMap);
        m16760d((Map<String, Object>) hashMap);
        mo34454c("AdLoadFailed", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo34386J() {
        HashMap hashMap = new HashMap();
        m16757c((Map<String, Object>) hashMap);
        mo34454c("AdLoadCalled", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34437b(byte b) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b));
        m16757c((Map<String, Object>) hashMap);
        mo34454c("AdLoadDroppedAtSDK", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34444b(Map<String, Object> map) {
        if (this.f14332A != null) {
            if (map.get(IronSourceConstants.EVENTS_ERROR_REASON) == null) {
                map.put(IronSourceConstants.EVENTS_ERROR_REASON, "");
            }
            m16760d(map);
            this.f14332A.mo34771a(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34405a(int i, long j) {
        this.f14353m = false;
        HashMap hashMap = new HashMap();
        hashMap.put(C11130Ad.AD_TYPE, mo34479k());
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C6210ik.m18428b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo34454c("AdGetSignalsFailed", hashMap);
    }

    /* renamed from: K */
    public void mo34387K() {
        this.f14334C = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", mo34484n());
        m16757c((Map<String, Object>) hashMap);
        mo34454c("AdShowCalled", hashMap);
    }

    /* renamed from: L */
    public void mo34388L() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14334C));
        hashMap.put("markupType", mo34484n());
        m16757c((Map<String, Object>) hashMap);
        mo34454c("AdShowSuccessful", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34450c(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14334C));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("markupType", mo34484n());
        m16757c((Map<String, Object>) hashMap);
        m16760d((Map<String, Object>) hashMap);
        mo34454c("AdShowFailed", hashMap);
    }

    /* renamed from: d */
    private void m16760d(Map<String, Object> map) {
        C5783aw u = mo34491u();
        if (u != null) {
            map.put("creativeId", "\"" + u.mo34690t() + "\"");
            map.put("impressionId", "\"" + u.mo34676f() + "\"");
        }
    }

    /* renamed from: a */
    public void mo34426a(String str, Map<String, Object> map) {
        mo34454c(str, map);
    }

    /* renamed from: b */
    public final void mo34442b(String str, Map<String, Object> map) {
        mo34454c(str, map);
    }

    /* renamed from: c */
    public void mo34454c(String str, Map<String, Object> map) {
        C6168hl.m18270a().mo35377a(str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34414a(C5783aw awVar) {
        VerificationScriptResource verificationScriptResource;
        C5783aw awVar2 = awVar;
        Context h = mo34473h();
        if (mo34485o().viewability.omidConfig.omidEnabled && C5991eu.C5992a.f15193a.mo35123a()) {
            boolean z = awVar2 instanceof C5839bo;
            for (C5951dx next : m16762f(0)) {
                if (3 == next.f15086a) {
                    if ("video" != next.f15087b.get(StaticResource.CREATIVE_TYPE) || !z) {
                        m16751a(h, next);
                    } else {
                        C5839bo boVar = (C5839bo) awVar2;
                        try {
                            C5854ca caVar = new C5854ca((int) mo34481l(), new JSONObject(mo34402a(0)), mo34485o(), this.f14356p == null ? null : C6196id.m18385a(this.f14356p.mo34767m()), new C5949dv(boVar.f14685a, boVar.f14686b, boVar.f14687c, boVar.f14688d, boVar.f14689e, mo34485o().vastVideo));
                            C5869cj cjVar = (C5869cj) caVar.mo34847c(ShareConstants.VIDEO_URL).get(0);
                            if (h != null) {
                                ArrayList arrayList = new ArrayList();
                                for (C5868ci next2 : cjVar.f14723u) {
                                    if ("OMID_VIEWABILITY".equals(next2.f14815d) && (next2 instanceof C5985ep)) {
                                        C5985ep epVar = (C5985ep) next2;
                                        Map map = (Map) next.mo35066a("macros", Map.class);
                                        String d = m16759d(epVar.f15174g, map);
                                        String str = epVar.f15175h;
                                        String d2 = m16759d(epVar.f14813b, map);
                                        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str)) {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                                        } else {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                                        }
                                        arrayList.add(verificationScriptResource);
                                    }
                                }
                                if (arrayList.size() != 0) {
                                    C5847bw a = m16748a(caVar);
                                    if (a != null) {
                                        next.f15087b.put("videoSkippable", Boolean.TRUE);
                                        next.f15087b.put("videoSkipOffset", Integer.valueOf(a.f14717o));
                                    } else {
                                        next.f15087b.put("videoSkippable", Boolean.FALSE);
                                        next.f15087b.put("videoSkipOffset", 0);
                                    }
                                    next.f15087b.put("videoAutoPlay", cjVar.f14724v.get("shouldAutoPlay"));
                                    next.f15087b.put("omidAdSession", C5990et.m17837a((List<VerificationScriptResource>) arrayList, (String) next.f15087b.get(StaticResource.CREATIVE_TYPE), this.f14355o.mo34727h()));
                                    next.f15087b.put("deferred", Boolean.TRUE);
                                }
                            }
                        } catch (Exception e) {
                            C6130gj.m18161a().mo35310a(new C6167hk(e));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m16751a(Context context, C5951dx dxVar) {
        VerificationScriptResource verificationScriptResource;
        try {
            C5847bw bwVar = new C5854ca((int) mo34481l(), new JSONObject(mo34402a(0)), mo34485o(), this.f14356p == null ? null : C6196id.m18385a(this.f14356p.mo34767m()), (C5949dv) null).mo34847c("CONTAINER").get(0);
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                for (C5868ci next : bwVar.f14723u) {
                    if ("OMID_VIEWABILITY".equals(next.f14815d) && (next instanceof C5985ep)) {
                        C5985ep epVar = (C5985ep) next;
                        Map map = (Map) dxVar.mo35066a("macros", Map.class);
                        String d = m16759d(epVar.f15174g, map);
                        String str = epVar.f15175h;
                        String d2 = m16759d(epVar.f14813b, map);
                        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str)) {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                        } else {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                        }
                        arrayList.add(verificationScriptResource);
                    }
                }
                if (arrayList.size() != 0) {
                    dxVar.f15087b.put("omidAdSession", C5989es.m17828a((List<VerificationScriptResource>) arrayList, this.f14355o.mo34727h(), (String) dxVar.f15087b.get(StaticResource.CREATIVE_TYPE)));
                    dxVar.f15087b.put("deferred", Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    /* renamed from: a */
    private static C5847bw m16748a(C5854ca caVar) {
        for (String c : caVar.mo34849e()) {
            C5847bw bwVar = caVar.mo34847c(c).get(0);
            if (2 == bwVar.f14714l) {
                return bwVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo34482l(C6301q qVar) {
        if (mo34485o().viewability.omidConfig.omidEnabled && C5991eu.C5992a.f15193a.mo35123a()) {
            for (C5951dx next : m16762f(this.f14344d.indexOf(qVar))) {
                if (3 == next.f15086a) {
                    try {
                        C5983en a = C5988er.m17819a((String) next.mo35066a(StaticResource.CREATIVE_TYPE, String.class), qVar, ((Boolean) next.mo35066a("isolateVerificationScripts", Boolean.class)).booleanValue(), this.f14355o.mo34727h(), ((Byte) next.mo35066a("impressionType", Byte.class)).byteValue(), (String) next.mo35066a("customReferenceData", String.class));
                        if (a != null) {
                            next.f15087b.put("omidAdSession", a);
                            next.f15087b.put("deferred", Boolean.TRUE);
                        }
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static String m16759d(String str, Map map) {
        if (!(map == null || str == null)) {
            for (Object next : map.keySet()) {
                str = str.replace(next.toString(), map.get(next).toString());
            }
        }
        return str;
    }

    /* renamed from: com.inmobi.media.af$b */
    /* compiled from: AdUnit */
    public static class C5725b {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static java.util.Map<java.lang.String, java.lang.Object> m16935a(java.lang.String r7, java.lang.String r8, boolean r9, org.json.JSONObject r10, byte r11) {
            /*
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                int r1 = r7.hashCode()
                r2 = 112202875(0x6b0147b, float:6.6233935E-35)
                java.lang.String r3 = "nonvideo"
                java.lang.String r4 = "video"
                r5 = 2
                r6 = 1
                if (r1 == r2) goto L_0x0022
                r2 = 1425678798(0x54fa21ce, float:8.5944718E12)
                if (r1 == r2) goto L_0x001a
                goto L_0x002a
            L_0x001a:
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x002a
                r7 = r6
                goto L_0x002b
            L_0x0022:
                boolean r7 = r7.equals(r4)
                if (r7 == 0) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = -1
            L_0x002b:
                if (r7 == r6) goto L_0x0033
                if (r7 == r5) goto L_0x0032
                java.lang.String r3 = "unknown"
                goto L_0x0033
            L_0x0032:
                r3 = r4
            L_0x0033:
                java.lang.String r7 = "creativeType"
                r0.put(r7, r3)
                java.lang.String r7 = "customReferenceData"
                r0.put(r7, r8)
                java.lang.Byte r7 = java.lang.Byte.valueOf(r11)
                java.lang.String r8 = "impressionType"
                r0.put(r8, r7)
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                if (r10 == 0) goto L_0x0065
                java.util.Iterator r8 = r10.keys()
            L_0x0051:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x0065
                java.lang.Object r11 = r8.next()
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r1 = r10.optString(r11)
                r7.put(r11, r1)
                goto L_0x0051
            L_0x0065:
                java.lang.String r8 = "macros"
                r0.put(r8, r7)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
                java.lang.String r8 = "isolateVerificationScripts"
                r0.put(r8, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5706af.C5725b.m16935a(java.lang.String, java.lang.String, boolean, org.json.JSONObject, byte):java.util.Map");
        }
    }

    /* renamed from: M */
    public C6301q mo34389M() {
        return this.f14337F;
    }

    /* renamed from: a */
    public void mo34424a(final String str, final String str2) {
        this.f14363w.mo35396a(hashCode(), new C5727ah<C5706af>(this) {
            /* renamed from: a */
            public final void mo34371a() {
                C5706af afVar = (C5706af) this.f14402f.get();
                if (afVar != null) {
                    C5783aw u = afVar.mo34491u();
                    if (u == null || str == null || !u.mo34676f().equals(str2)) {
                        String str = C5706af.f14331a;
                        return;
                    }
                    C5706af.m16752a(afVar, u, str);
                    String str2 = C5706af.f14331a;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34425a(String str, String str2, C6279l lVar, String str3) {
        final String str4 = str3;
        final C6279l lVar2 = lVar;
        final String str5 = str;
        final String str6 = str2;
        this.f14363w.mo35396a(hashCode(), new C5727ah<C5706af>(this) {
            /* renamed from: a */
            public final void mo34371a() {
                C5706af afVar = (C5706af) this.f14402f.get();
                if (afVar != null) {
                    try {
                        C5783aw u = afVar.mo34491u();
                        if (u == null || !u.mo34676f().equals(str4)) {
                            String str = C5706af.f14331a;
                            lVar2.mo35510a(str5, str6, "");
                            return;
                        }
                        lVar2.mo35510a(str5, str6, u.mo34672c());
                        String str2 = C5706af.f14331a;
                    } catch (Exception e) {
                        String str3 = C5706af.f14331a;
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo34390N() {
        this.f14363w.mo35396a(hashCode(), new C5727ah<C5706af>(this) {
            /* renamed from: a */
            public final void mo34371a() {
                C5706af afVar = (C5706af) this.f14402f.get();
                if (afVar != null) {
                    try {
                        final C5854ca caVar = new C5854ca((int) afVar.mo34481l(), new JSONObject(afVar.mo34402a(0)), afVar.mo34485o(), afVar.f14356p == null ? null : C6196id.m18385a(afVar.f14356p.mo34767m()), (C5949dv) null);
                        C5706af.this.f14349i.post(new Runnable() {
                            public final void run() {
                                try {
                                    C5871ck ckVar = caVar.f14758k;
                                    C5783aw u = C5706af.this.mo34491u();
                                    if (ckVar != null && C5706af.this.mo34473h() != null && u != null) {
                                        C5706af afVar = C5706af.this;
                                        Context h = C5706af.this.mo34473h();
                                        byte l = C5706af.this.mo34481l();
                                        Set b = C5706af.this.m16762f(0);
                                        C5706af afVar2 = C5706af.this;
                                        C6301q unused = afVar.f14337F = new C6301q(h, l, b, afVar2.f14356p == null ? null : afVar2.f14356p.mo34759e(), Boolean.FALSE, "DEFAULT");
                                        C5706af.this.f14337F.mo35576a(C5706af.this.f14341K, C5706af.this.mo34485o(), C5706af.this.mo34397U(), false);
                                        C5706af.this.f14337F.f15949i = true;
                                        C5706af.this.f14337F.setBlobProvider(C5706af.this);
                                        C5706af.this.f14337F.setIsPreload(true);
                                        C5706af.this.f14337F.setPlacementId(C5706af.this.f14355o.mo34723e());
                                        C5706af.this.f14337F.setCreativeId(u.mo34690t());
                                        C5706af.this.f14337F.setAllowAutoRedirection(C5706af.this.m16765g(0));
                                        C5706af.this.f14337F.setShouldFireRenderBeacon(false);
                                        if (C5706af.this.f14348h == 0) {
                                            C5706af.this.mo34482l(C5706af.this.f14337F);
                                        }
                                        if (C5706af.this.mo34465e((byte) 2)) {
                                            if ("URL".equals(ckVar.f14829z)) {
                                                C5706af.this.f14337F.mo35581b((String) ckVar.f14707e);
                                            } else {
                                                C5706af.this.f14337F.mo35578a((String) ckVar.f14707e);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    String str = C5706af.f14331a;
                                    C5706af.this.f14342b = 3;
                                    C5706af.this.mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                                }
                            }
                        });
                    } catch (Exception e) {
                        String str = C5706af.f14331a;
                        afVar.f14342b = 3;
                        afVar.mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 76);
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            }

            /* renamed from: b */
            public final void mo34373b() {
                super.mo34373b();
                C5706af afVar = (C5706af) this.f14402f.get();
                if (afVar != null) {
                    afVar.f14342b = 3;
                    afVar.mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), false, (byte) 40);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo34391O() {
        if (this.f14350j && this.f14351k && this.f14336E) {
            mo34392P();
        }
    }

    /* renamed from: b */
    public void mo34438b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5794bd bdVar = this.f14356p;
        C5783aw k = bdVar == null ? null : bdVar.mo34765k();
        if (k == null) {
            C5724a p = mo34486p();
            if (p != null) {
                p.mo34526a(this, false, inMobiAdRequestStatus);
                return;
            }
            return;
        }
        this.f14363w.mo35396a(hashCode(), new C5768at(this, k, this.f14356p, true, inMobiAdRequestStatus));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo34394R() {
        C5783aw u = mo34491u();
        if (u != null && 4 == mo34477j() && !mo34487q()) {
            C5724a p = mo34486p();
            if (p != null) {
                mo34451c(p);
            }
            return true;
        } else if (u != null && 2 == mo34477j() && !mo34487q()) {
            return false;
        } else {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (byte) 49);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo34396T() throws IllegalStateException {
        C5783aw aa = mo34553aa();
        if (aa != null) {
            String i = aa.mo34679i();
            char c = 65535;
            switch (i.hashCode()) {
                case -1470802432:
                    if (i.equals("mediationJson")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1084172778:
                    if (i.equals("inmobiJson")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3213227:
                    if (i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1236050372:
                    if (i.equals("htmlUrl")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (!(c == 2 || c == 3)) {
                if (c == 4) {
                    aa.mo34676f();
                    C5794bd bdVar = this.f14356p;
                    if (bdVar != null) {
                        bdVar.mo34754a(this.f14343c, (C5948du) this);
                    }
                } else {
                    aa.mo34679i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo34679i());
                }
            }
            List<String> c2 = aa.mo34673c(C5783aw.WIN_BEACON);
            if (this.f14362v) {
                for (int i2 = 1; i2 < this.f14356p.mo34756b().size(); i2++) {
                    List<String> c3 = this.f14356p.mo34756b().get(i2).mo34673c(C5783aw.WIN_BEACON);
                    if (c3 != null) {
                        c2.addAll(c3);
                    }
                }
            }
            if (c2 != null) {
                for (String a : c2) {
                    C5820bn.m17365a().mo34792a(a, true);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to get topAd");
    }

    /* renamed from: aa */
    private C5783aw mo34553aa() {
        C5783aw u = mo34491u();
        if (u != null && !mo34487q()) {
            return u;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34415a(C5783aw awVar, boolean z, byte b) {
        C5794bd bdVar;
        C5783aw aa = mo34553aa();
        if (aa != null) {
            aa.mo34676f();
            String i = aa.mo34679i();
            char c = 65535;
            switch (i.hashCode()) {
                case -1470802432:
                    if (i.equals("mediationJson")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1084172778:
                    if (i.equals("inmobiJson")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3213227:
                    if (i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1236050372:
                    if (i.equals("htmlUrl")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c != 2 && c != 3) {
                if (c != 4) {
                    aa.mo34679i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo34679i());
                } else if (mo34477j() == 2 && (bdVar = this.f14356p) != null) {
                    bdVar.mo34753a(awVar);
                    C5796be r = mo34488r();
                    String h = this.f14356p.mo34762h();
                    if (awVar != null) {
                        Set<C5841bq> h2 = awVar.mo34678h();
                        if (h2.size() == 0) {
                            r.f14582a.mo34418a(r.f14583b, true, (byte) 0);
                            return;
                        }
                        C5786ay ayVar = new C5786ay(UUID.randomUUID().toString(), h, h2, r.f14585d);
                        C5806bi a = C5806bi.m17300a();
                        a.f14598a.execute(new Runnable(ayVar, awVar.mo34666a()) {

                            /* renamed from: a */
                            final /* synthetic */ C5786ay f14615a;

                            /* renamed from: b */
                            final /* synthetic */ String f14616b;

                            public final void run(
/*
Method generation error in method: com.inmobi.media.bi.4.run():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.bi.4.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final boolean mo34397U() {
        C5783aw u = mo34491u();
        return u != null && u.mo34688r();
    }

    /* renamed from: f */
    public void mo34466f() {
        mo34467f((byte) 4);
        C5724a p = mo34486p();
        if (p != null) {
            p.mo34546k();
            p.mo34540e();
        }
    }

    /* renamed from: a */
    public void mo34406a(int i, C6301q qVar, Context context) {
        this.f14344d.indexOf(qVar);
        if (i >= 0) {
            this.f14359s = i;
        } else {
            this.f14359s++;
        }
    }

    /* renamed from: c */
    public JSONArray mo34448c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = this.f14361u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().intValue());
        }
        return jSONArray;
    }

    /* renamed from: g */
    public void mo34470g() {
        this.f14349i.post(new Runnable() {
            public final void run() {
                C5724a p;
                if ((C5706af.this.mo34477j() == 6 || C5706af.this.mo34477j() == 7) && (p = C5706af.this.mo34486p()) != null) {
                    p.mo34545j();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo34449c(byte b) {
        C5724a p;
        if (b == 0) {
            mo34416a(this.f14355o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (byte) 7);
        } else if (b != 1) {
            if (b == 2) {
                int size = this.f14344d.size();
                int i = this.f14359s;
                if (size > i && this.f14344d.get(i) != null && this.f14344d.get(this.f14359s).getMarkupType().equals("htmlUrl")) {
                    m16766m(this.f14344d.get(this.f14359s));
                }
                mo34410a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (b == 4 && (p = mo34486p()) != null) {
                p.mo34544i();
            }
        } else if (2 == mo34477j()) {
            this.f14342b = 3;
            C5724a p2 = mo34486p();
            if (p2 != null) {
                p2.mo34535b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            mo34404a((byte) 47);
        }
    }

    /* renamed from: d */
    public void mo34457d(byte b) {
        C5724a p;
        if (b == 0) {
            mo34416a(this.f14355o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
        } else if (b != 1) {
            if (b == 2) {
                mo34410a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            } else if (b == 4 && (p = mo34486p()) != null) {
                p.mo34544i();
            }
        } else if (2 == mo34477j()) {
            this.f14342b = 3;
            C5724a p2 = mo34486p();
            if (p2 != null) {
                p2.mo34535b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            }
            mo34404a((byte) 40);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo34465e(byte b) {
        int i;
        if (b == 0) {
            i = this.f14366z.mo35500c();
        } else if (b == 1) {
            i = this.f14366z.mo35503f();
        } else if (b == 2) {
            i = this.f14366z.mo35506i();
        } else if (b != 4) {
            return false;
        } else {
            i = this.f14366z.mo35504g();
        }
        long j = (long) i;
        C5933dn dnVar = this.f14338G;
        return dnVar != null && dnVar.mo35042a(b, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34467f(byte b) {
        C5933dn dnVar = this.f14338G;
        if (dnVar != null) {
            dnVar.mo35041a(b);
        }
    }

    /* renamed from: c_ */
    public C6268jq mo34455c_() {
        return this.f14366z;
    }

    /* renamed from: V */
    public boolean mo34398V() {
        return this.f14357q;
    }

    /* renamed from: W */
    public void mo34399W() {
        this.f14357q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo34400X() {
        for (int i = 0; i < this.f14344d.size(); i++) {
            mo34458d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34458d(int i) {
        if (this.f14344d.size() > i && this.f14344d.get(i) != null) {
            this.f14344d.get(i).stopLoading();
            this.f14344d.get(i).destroy();
            this.f14344d.set(i, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo34407a(int i, boolean z) {
        C6301q qVar;
        if (i >= 0 && i < this.f14344d.size() && (qVar = this.f14344d.get(i)) != null) {
            qVar.mo35589d(z);
        }
    }

    /* renamed from: e */
    public void mo34463e(int i) {
        this.f14359s = i;
    }

    /* renamed from: h */
    public void mo34474h(C6301q qVar) {
        List<String> c;
        super.mo34474h(qVar);
        C5783aw b = mo34436b(this.f14344d.indexOf(qVar));
        if ((b == null || b.mo34692v() == null || !b.mo34692v().equals("video")) && b != null && (c = b.mo34673c("click")) != null) {
            for (String a : c) {
                C5820bn.m17365a().mo34792a(a, true);
            }
        }
    }

    /* renamed from: i */
    public void mo34476i(C6301q qVar) {
        List<String> c;
        super.mo34476i(qVar);
        C5783aw b = mo34436b(this.f14344d.indexOf(qVar));
        if ((b == null || b.mo34692v() == null || !b.mo34692v().equals("video")) && b != null && (c = b.mo34673c("impression")) != null) {
            for (String a : c) {
                C6173ho telemetryOnAdImpression = qVar.getTelemetryOnAdImpression();
                telemetryOnAdImpression.f15591d = "adResponseTracker";
                C5820bn.m17365a().mo34793a(a, true, (C5817bk) new C5704ad(this.f14364x, telemetryOnAdImpression));
            }
        }
    }

    /* renamed from: m */
    private void m16766m(C6301q qVar) {
        List<String> c;
        C5783aw b = mo34436b(this.f14344d.indexOf(qVar));
        if (b != null && (c = b.mo34673c(C5783aw.LOAD_AD_TOKEN_URL_FAILURE)) != null) {
            for (String a : c) {
                C5820bn.m17365a().mo34792a(a, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo34402a(int i) {
        if (i > 0 && !this.f14362v) {
            return "";
        }
        if (mo34436b(i) == null) {
            return null;
        }
        return mo34436b(i).mo34680j();
    }

    /* renamed from: a */
    public void mo34418a(C5791bc bcVar, boolean z, byte b) {
        if (!this.f14352l && mo34473h() != null) {
            if (b != 0) {
                mo34404a(b);
            }
            mo34417a(bcVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34419a(C5794bd bdVar) {
        if (!this.f14352l && mo34473h() != null) {
            mo34440b(bdVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34432a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f14342b = 2;
        } else {
            mo34411a(inMobiAdRequestStatus, true, (byte) 0);
        }
    }

    /* renamed from: a */
    public void mo34416a(C5791bc bcVar, InMobiAdRequestStatus inMobiAdRequestStatus, byte b) {
        if (!this.f14352l && mo34473h() != null) {
            try {
                if (this.f14355o.equals(bcVar) && mo34477j() == 1) {
                    C6195ic.m18378a((byte) 2, "InMobi", "Failed to fetch ad for placement id: " + this.f14355o.toString() + ", reason phrase available in onAdLoadFailed callback.");
                    inMobiAdRequestStatus.getMessage();
                    this.f14342b = 3;
                    if (b != 0) {
                        mo34437b(b);
                    }
                    C5724a p = mo34486p();
                    if (p != null) {
                        p.mo34524a(inMobiAdRequestStatus);
                    }
                }
            } catch (Exception e) {
                C6195ic.m18378a((byte) 1, "InMobi", "Unable to load Ad; SDK encountered an unexpected error");
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
    }

    /* renamed from: Z */
    private int mo34550Z() {
        try {
            this.f14342b = 1;
            C6232iz.m18518a().mo35444c();
            if (!mo34465e((byte) 0)) {
                return -2;
            }
            this.f14363w.mo35396a(hashCode(), new C5703ac(this));
            return 0;
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34427a(WeakReference<C5724a> weakReference, byte b, InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f14342b = 3;
        if (!this.f14352l) {
            C5724a aVar = (C5724a) weakReference.get();
            if (aVar == null) {
                C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            } else if ("int".equals(mo34479k())) {
                mo34413a(aVar, b);
            } else {
                mo34404a(b);
                aVar.mo34525a(this, inMobiAdRequestStatus);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo34381E() {
        if (this.f14362v) {
            mo34400X();
            this.f14344d.clear();
            this.f14358r = 0;
            this.f14359s = 0;
            this.f14361u.clear();
        }
    }

    /* renamed from: c */
    public final void mo34453c(final C6301q qVar) {
        if (!this.f14352l && mo34473h() != null) {
            this.f14349i.post(new Runnable() {
                public final void run() {
                    C5706af.this.mo34478j(qVar);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo34460d(final C6301q qVar) {
        if (!this.f14352l && mo34473h() != null) {
            this.f14349i.post(new Runnable() {
                public final void run() {
                    C5706af.this.mo34480k(qVar);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo34423a(String str) {
        if (this.f14362v) {
            this.f14339I = str;
        }
    }

    /* renamed from: e */
    public String mo34462e() {
        if (this.f14362v) {
            return this.f14339I;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34403a() {
        if (!this.f14352l && mo34473h() != null) {
            this.f14349i.post(new Runnable() {
                public final void run() {
                    if (6 == C5706af.this.mo34477j()) {
                        C5706af.this.f14342b = 3;
                        if (C5706af.this.mo34486p() != null) {
                            C5706af afVar = C5706af.this;
                            afVar.mo34413a(afVar.mo34486p(), (byte) 92);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public void mo34472g(final C6301q qVar) {
        if (!this.f14352l && mo34473h() != null) {
            try {
                this.f14349i.post(new Runnable() {
                    public final void run() {
                        C5706af.this.mo34383G();
                    }
                });
            } catch (Exception unused) {
                C6195ic.m18378a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            }
        }
    }

    /* renamed from: b */
    public void mo34443b(HashMap<Object, Object> hashMap) {
        if (!this.f14352l && mo34473h() != null && mo34486p() != null) {
            mo34486p().mo34536b((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo34428a(HashMap<Object, Object> hashMap) {
        if (!this.f14352l && mo34473h() != null && mo34486p() != null) {
            mo34486p().mo34529a((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: a_ */
    public void mo34435a_() {
        if (!this.f14352l && mo34473h() != null && mo34486p() != null) {
            mo34486p().mo34539d();
        }
    }

    /* renamed from: a */
    public void mo34421a(C6173ho hoVar) {
        hoVar.f15591d = "imraid_impressionFired";
        if (this.f14352l || mo34473h() == null) {
            hoVar.mo35385c();
        } else {
            this.f14364x.mo34376a(hoVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34445b(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f14342b = 2;
        }
        C5724a p = mo34486p();
        if (p != null) {
            p.mo34526a(this, z, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    public int mo34401a(C6301q qVar) {
        if (this.f14362v) {
            return this.f14344d.indexOf(qVar);
        }
        return -1;
    }

    /* renamed from: b_ */
    public long mo34447b_() {
        if (this.f14362v) {
            return System.currentTimeMillis() - this.f14360t;
        }
        return -1;
    }

    /* renamed from: d */
    public long mo34456d() {
        if (this.f14362v) {
            return this.f14360t;
        }
        return -1;
    }

    /* renamed from: a */
    static /* synthetic */ void m16752a(C5706af afVar, C5783aw awVar, String str) {
        awVar.mo34667a(str);
        C5794bd bdVar = afVar.f14356p;
        if (bdVar != null) {
            bdVar.mo34753a(awVar);
        }
    }
}
