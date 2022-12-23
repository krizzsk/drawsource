package com.ironsource.mediationsdk.p206a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.p201b.C6371b;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.C6459L;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6667q;
import com.ironsource.mediationsdk.sdk.C6697e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p197b.C6350a;
import com.ironsource.p197b.C6351b;
import com.ironsource.p197b.C6352c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.b */
public abstract class C6509b {

    /* renamed from: A */
    private int f16742A = 1024;

    /* renamed from: B */
    private int f16743B = 5;

    /* renamed from: C */
    private String f16744C = "supersonic_sdk.db";

    /* renamed from: D */
    private String f16745D = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: E */
    private String f16746E = "placement";

    /* renamed from: F */
    private final String f16747F = "abt";

    /* renamed from: G */
    private final String f16748G = "mt";

    /* renamed from: H */
    private C6508a f16749H;

    /* renamed from: I */
    private int f16750I = 5000;

    /* renamed from: J */
    private int[] f16751J;

    /* renamed from: K */
    private Map<String, String> f16752K = new HashMap();

    /* renamed from: L */
    private C6667q f16753L;

    /* renamed from: M */
    private final Object f16754M = new Object();

    /* renamed from: a */
    public boolean f16755a;

    /* renamed from: b */
    boolean f16756b = false;

    /* renamed from: c */
    public boolean f16757c = false;

    /* renamed from: d */
    C6350a f16758d;

    /* renamed from: e */
    ArrayList<C6517c> f16759e;

    /* renamed from: f */
    public boolean f16760f = true;

    /* renamed from: g */
    int f16761g;

    /* renamed from: h */
    String f16762h;

    /* renamed from: i */
    Context f16763i;

    /* renamed from: j */
    int f16764j = 100;

    /* renamed from: k */
    int f16765k = 1;

    /* renamed from: l */
    int[] f16766l;

    /* renamed from: m */
    int[] f16767m;

    /* renamed from: n */
    int[] f16768n;

    /* renamed from: o */
    Map<String, String> f16769o = new HashMap();

    /* renamed from: p */
    public String f16770p = "";

    /* renamed from: q */
    int f16771q;

    /* renamed from: r */
    String f16772r;

    /* renamed from: s */
    String f16773s;

    /* renamed from: t */
    Set<Integer> f16774t;

    /* renamed from: u */
    C6516b f16775u;

    /* renamed from: v */
    public IronSourceSegment f16776v;

    /* renamed from: w */
    private int f16777w = 1;

    /* renamed from: x */
    private int f16778x = 100;

    /* renamed from: y */
    private int f16779y = 5000;

    /* renamed from: z */
    private int f16780z = 90000;

    /* renamed from: com.ironsource.mediationsdk.a.b$a */
    public enum C6515a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f */
        int f16795f;

        private C6515a(int i) {
            this.f16795f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b */
    class C6516b extends HandlerThread {

        /* renamed from: a */
        Handler f16796a;

        C6516b(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo36367a(Runnable runnable) {
            this.f16796a.post(runnable);
        }
    }

    /* renamed from: a */
    private ArrayList<C6517c> m19685a(ArrayList<C6517c> arrayList, ArrayList<C6517c> arrayList2, int i) {
        ArrayList<C6517c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<C6517c>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C6517c) obj).mo36371b() >= ((C6517c) obj2).mo36371b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.f16758d.mo35839a(arrayList4.subList(i, arrayList4.size()), this.f16773s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    /* renamed from: a */
    static /* synthetic */ void m19686a(C6509b bVar) {
        synchronized (bVar.f16754M) {
            bVar.f16758d.mo35839a(bVar.f16759e, bVar.f16773s);
            bVar.f16759e.clear();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m19687a(C6509b bVar, C6517c cVar, String str) {
        JSONObject d = cVar.mo36373d();
        if (d != null && d.has(str)) {
            try {
                String optString = d.optString(str, (String) null);
                if (optString != null) {
                    cVar.mo36370a(str, (Object) optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m19688a(String str) {
        C6508a aVar = this.f16749H;
        if (aVar == null || !aVar.mo36335c().equals(str)) {
            this.f16749H = C6517c.m19724a(str, this.f16771q);
        }
    }

    /* renamed from: a */
    public static void m19689a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    /* renamed from: a */
    static boolean m19691a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19693d() {
        ArrayList<C6517c> a;
        this.f16756b = false;
        synchronized (this.f16754M) {
            a = m19685a(this.f16759e, this.f16758d.mo35838a(this.f16773s), this.f16750I);
            if (a.size() > 0) {
                this.f16759e.clear();
                this.f16758d.mo35840b(this.f16773s);
            }
        }
        if (a.size() > 0) {
            this.f16761g = 0;
            JSONObject b = C6697e.m20344a().mo36915b();
            try {
                if (this.f16776v != null) {
                    if (this.f16776v.getAge() > 0) {
                        b.put("age", this.f16776v.getAge());
                    }
                    if (!TextUtils.isEmpty(this.f16776v.getGender())) {
                        b.put(IronSourceSegment.GENDER, this.f16776v.getGender());
                    }
                    if (this.f16776v.getLevel() > 0) {
                        b.put(IronSourceSegment.LEVEL, this.f16776v.getLevel());
                    }
                    if (this.f16776v.getIsPaying() != null) {
                        b.put(IronSourceSegment.PAYING, this.f16776v.getIsPaying().get());
                    }
                    if (this.f16776v.getIapt() > 0.0d) {
                        b.put(IronSourceSegment.IAPT, this.f16776v.getIapt());
                    }
                    if (this.f16776v.getUcd() > 0) {
                        b.put(IronSourceSegment.USER_CREATION_DATE, this.f16776v.getUcd());
                    }
                }
                if (this.f16753L != null) {
                    String str = this.f16753L.f17412b;
                    if (!TextUtils.isEmpty(str)) {
                        b.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.f16753L.f17413c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                try {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f16770p;
            if (!TextUtils.isEmpty(str2)) {
                b.put("abt", str2);
            }
            String str3 = C6459L.m19304a().f16425o;
            if (!TextUtils.isEmpty(str3)) {
                b.put("mt", str3);
            }
            Map<String, String> map = this.f16752K;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b.has((String) next2.getKey())) {
                        b.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            C6371b bVar = new C6371b();
            JSONObject a2 = bVar.f16136b.mo36834a(bVar.f16135a);
            Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
            Iterator<String> keys2 = a2.keys();
            while (keys2.hasNext()) {
                String next3 = keys2.next();
                b.put(next3, a2.get(next3));
            }
            String a3 = this.f16749H.mo36332a(a, b);
            if (TextUtils.isEmpty(a3)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                mo36342a(a);
                return;
            }
            if (this.f16757c) {
                try {
                    a3 = Base64.encodeToString(C6363a.C63641.m19013b(a3), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            C6387c.f16171a.mo35897c(new C6351b(new C6352c() {
                /* renamed from: a */
                public final synchronized void mo35844a(final ArrayList<C6517c> arrayList, final boolean z) {
                    C6509b.this.f16775u.mo36367a(new Runnable() {
                        public final void run() {
                            if (z) {
                                ArrayList<C6517c> a = C6509b.this.f16758d.mo35838a(C6509b.this.f16773s);
                                C6509b.this.f16761g = a.size() + C6509b.this.f16759e.size();
                                return;
                            }
                            IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                            C6509b.this.mo36342a((ArrayList<C6517c>) arrayList);
                        }
                    });
                }
            }, a3, this.f16749H.mo36331a(), a));
        }
    }

    /* renamed from: e */
    protected static int m19694e(int i) {
        C6515a aVar;
        int i2 = C6515a.NOT_SUPPORTED.f16795f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = C6515a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = C6515a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = C6515a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = C6515a.BANNER;
        }
        return aVar.f16795f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo36336a(C6517c cVar) {
        return cVar.mo36368a() + 90000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36337a() {
        this.f16759e = new ArrayList<>();
        this.f16761g = 0;
        this.f16749H = C6517c.m19724a(this.f16772r, this.f16771q);
        C6516b bVar = new C6516b(this.f16773s + "EventThread");
        this.f16775u = bVar;
        bVar.start();
        C6516b bVar2 = this.f16775u;
        bVar2.f16796a = new Handler(bVar2.getLooper());
        this.f16762h = IronSourceUtils.getSessionId();
        this.f16774t = new HashSet();
        mo36347b();
    }

    /* renamed from: a */
    public final void mo36338a(int i) {
        if (i > 0) {
            this.f16765k = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36339a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f16773s, this.f16772r);
        this.f16772r = defaultEventsFormatterType;
        m19688a(defaultEventsFormatterType);
        this.f16749H.f16736c = IronSourceUtils.getDefaultEventsURL(context, this.f16773s, (String) null);
        this.f16758d = C6350a.m18967a(context, "supersonic_sdk.db", 5);
        this.f16775u.mo36367a(new Runnable() {
            public final void run() {
                C6509b.m19686a(C6509b.this);
            }
        });
        this.f16766l = IronSourceUtils.getDefaultOptOutEvents(context, this.f16773s);
        this.f16767m = IronSourceUtils.getDefaultOptInEvents(context, this.f16773s);
        this.f16768n = IronSourceUtils.getDefaultTriggerEvents(context, this.f16773s);
        this.f16751J = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f16773s);
        this.f16776v = ironSourceSegment;
        this.f16763i = context;
    }

    /* renamed from: a */
    public final synchronized void mo36340a(C6667q qVar) {
        this.f16753L = qVar;
    }

    /* renamed from: a */
    public final void mo36341a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C6508a aVar = this.f16749H;
            if (aVar != null) {
                aVar.f16736c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f16773s, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36342a(ArrayList<C6517c> arrayList) {
        if (arrayList != null) {
            synchronized (this.f16754M) {
                this.f16758d.mo35839a(arrayList, this.f16773s);
                this.f16761g = this.f16758d.mo35838a(this.f16773s).size() + this.f16759e.size();
            }
        }
    }

    /* renamed from: a */
    public final void mo36343a(Map<String, String> map) {
        this.f16752K.putAll(map);
    }

    /* renamed from: a */
    public final void mo36344a(int[] iArr, Context context) {
        this.f16766l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f16773s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36345a(int i, int[] iArr) {
        if (!m19691a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return m19691a(r1.f16751J) ? mo36345a(r3.mo36368a(), r1.f16751J) : r1.f16774t.contains(java.lang.Integer.valueOf(r3.mo36368a()));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo36346a(java.lang.String r2, com.ironsource.mediationsdk.p206a.C6517c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.f16751J     // Catch:{ all -> 0x002f }
            boolean r2 = m19691a((int[]) r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.mo36368a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.f16751J     // Catch:{ all -> 0x002f }
            boolean r2 = r1.mo36345a((int) r2, (int[]) r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.f16774t     // Catch:{ all -> 0x002f }
            int r3 = r3.mo36368a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p206a.C6509b.mo36346a(java.lang.String, com.ironsource.mediationsdk.a.c):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36347b() {
    }

    /* renamed from: b */
    public final void mo36348b(int i) {
        if (i > 0) {
            this.f16764j = i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo36349b(final C6517c cVar) {
        this.f16775u.mo36367a(new Runnable() {
            public final void run() {
                if (cVar != null && C6509b.this.f16760f) {
                    cVar.mo36370a("eventSessionId", (Object) C6509b.this.f16762h);
                    String connectionType = IronSourceUtils.getConnectionType(C6509b.this.f16763i);
                    if (C6509b.this.mo36362g(cVar)) {
                        cVar.mo36370a("connectionType", (Object) connectionType);
                    }
                    if (C6509b.this.mo36346a(connectionType, cVar)) {
                        C6517c cVar = cVar;
                        cVar.mo36369a(C6509b.this.mo36336a(cVar));
                    }
                    int e = C6509b.m19694e(cVar.mo36368a());
                    if (e != C6515a.NOT_SUPPORTED.f16795f) {
                        cVar.mo36370a("adUnit", (Object) Integer.valueOf(e));
                    }
                    C6509b.m19687a(C6509b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                    C6509b.m19687a(C6509b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                    if (!C6509b.this.f16769o.isEmpty()) {
                        for (Map.Entry next : C6509b.this.f16769o.entrySet()) {
                            if (!(cVar.mo36373d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                cVar.mo36370a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    C6509b bVar = C6509b.this;
                    C6517c cVar2 = cVar;
                    boolean z = false;
                    if (cVar2 != null ? C6509b.m19691a(bVar.f16766l) ? !bVar.mo36345a(cVar2.mo36368a(), bVar.f16766l) : C6509b.m19691a(bVar.f16767m) ? bVar.mo36345a(cVar2.mo36368a(), bVar.f16767m) : true : false) {
                        if (C6509b.this.mo36361f(cVar)) {
                            JSONObject d = cVar.mo36373d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                cVar.mo36370a(IronSourceConstants.KEY_SESSION_DEPTH, (Object) Integer.valueOf(C6509b.this.mo36360e(cVar)));
                            }
                        }
                        if (!TextUtils.isEmpty(C6509b.this.mo36357d(cVar.mo36368a())) && C6509b.this.mo36356c(cVar)) {
                            C6517c cVar3 = cVar;
                            cVar3.mo36370a("placement", (Object) C6509b.this.mo36357d(cVar3.mo36368a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(C6509b.this.f16763i);
                        if (firstSessionTimestamp != -1) {
                            cVar.mo36370a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, (Object) Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + cVar.mo36368a() + ",\"timestamp\":" + cVar.mo36371b() + "," + cVar.mo36372c().substring(1)).replace(",", "\n"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C6509b.this.f16759e.add(cVar);
                        C6509b.this.f16761g++;
                    }
                    boolean a = C6509b.m19691a(C6509b.this.f16768n) ? C6509b.this.mo36345a(cVar.mo36368a(), C6509b.this.f16768n) : C6509b.this.mo36359d(cVar);
                    if (!C6509b.this.f16756b && a) {
                        C6509b.this.f16756b = true;
                    }
                    if (C6509b.this.f16758d != null) {
                        C6509b bVar2 = C6509b.this;
                        if ((bVar2.f16761g >= bVar2.f16764j || bVar2.f16756b) && bVar2.f16755a) {
                            C6509b.this.m19693d();
                            return;
                        }
                        C6509b bVar3 = C6509b.this;
                        ArrayList<C6517c> arrayList = bVar3.f16759e;
                        if (arrayList != null && arrayList.size() >= bVar3.f16765k) {
                            z = true;
                        }
                        if (z || a) {
                            C6509b.m19686a(C6509b.this);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo36350b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f16772r = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f16773s, str);
            m19688a(str);
        }
    }

    /* renamed from: b */
    public final void mo36351b(Map<String, String> map) {
        this.f16769o.putAll(map);
    }

    /* renamed from: b */
    public final void mo36352b(int[] iArr, Context context) {
        this.f16767m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f16773s, iArr);
    }

    /* renamed from: c */
    public final void mo36353c() {
        m19693d();
    }

    /* renamed from: c */
    public final void mo36354c(int i) {
        if (i > 0) {
            this.f16750I = i;
        }
    }

    /* renamed from: c */
    public final void mo36355c(int[] iArr, Context context) {
        this.f16768n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f16773s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo36356c(C6517c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo36357d(int i);

    /* renamed from: d */
    public final void mo36358d(int[] iArr, Context context) {
        this.f16751J = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f16773s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo36359d(C6517c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo36360e(C6517c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo36361f(C6517c cVar) {
        return (cVar.mo36368a() == 14 || cVar.mo36368a() == 114 || cVar.mo36368a() == 514 || cVar.mo36368a() == 140 || cVar.mo36368a() == 40 || cVar.mo36368a() == 41 || cVar.mo36368a() == 50 || cVar.mo36368a() == 51 || cVar.mo36368a() == 52) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo36362g(C6517c cVar) {
        return (cVar.mo36368a() == 40 || cVar.mo36368a() == 41 || cVar.mo36368a() == 50 || cVar.mo36368a() == 51 || cVar.mo36368a() == 52) ? false : true;
    }
}
