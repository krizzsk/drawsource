package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bd */
/* compiled from: AdSet */
public final class C5794bd {
    static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = C5794bd.class.getSimpleName();
    private String adSetAuctionMeta = null;
    private String adSetId = "";
    private LinkedList<C5783aw> ads = new LinkedList<>();
    private boolean isAuctionClosed = true;
    private boolean isPod = false;
    private String mAdType;
    private boolean mCanLoadBeforeShow;
    private JSONObject mMacros;
    private long mPlacementId;
    private String requestId = "";

    /* renamed from: a */
    public static C6225is<C5794bd> m17251a() {
        return new C6225is().mo35433a(new C6230ix("ads", C5794bd.class), (C6229iw) new C6227iu(new Constructor<List<C5783aw>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, C5783aw.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.inmobi.media.C5789ba.m17197a(r5, r1.getJSONObject(r10), r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r5 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5794bd m17250a(org.json.JSONObject r8, long r9, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 0
            java.lang.String r1 = "expiry"
            r2 = -1
            long r4 = r8.optLong(r1, r2)     // Catch:{ JSONException -> 0x00a8 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ JSONException -> 0x00a8 }
            long r2 = r1.toMillis(r4)     // Catch:{ JSONException -> 0x00a8 }
        L_0x0016:
            java.lang.String r1 = "ads"
            org.json.JSONArray r1 = r8.getJSONArray(r1)     // Catch:{ JSONException -> 0x00a8 }
            int r4 = r1.length()     // Catch:{ JSONException -> 0x00a8 }
            if (r4 != 0) goto L_0x0023
            return r0
        L_0x0023:
            com.inmobi.media.is r4 = m17251a()     // Catch:{ JSONException -> 0x00a8 }
            java.lang.Class<com.inmobi.media.bd> r5 = com.inmobi.media.C5794bd.class
            java.lang.Object r8 = r4.mo35434a((org.json.JSONObject) r8, r5)     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.bd r8 = (com.inmobi.media.C5794bd) r8     // Catch:{ JSONException -> 0x00a8 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r4 = r8.adSetId     // Catch:{ JSONException -> 0x00a8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00a8 }
            if (r4 != 0) goto L_0x00a8
            r8.mPlacementId = r9     // Catch:{ JSONException -> 0x00a8 }
            r8.requestId = r12     // Catch:{ JSONException -> 0x00a8 }
            r8.mAdType = r11     // Catch:{ JSONException -> 0x00a8 }
            r9 = 0
            r10 = r9
        L_0x0041:
            int r12 = r1.length()     // Catch:{ JSONException -> 0x00a8 }
            if (r10 >= r12) goto L_0x008e
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch:{ JSONException -> 0x00a8 }
            java.util.LinkedList<com.inmobi.media.aw> r4 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x00a8 }
        L_0x0051:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x00a8 }
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.aw r5 = (com.inmobi.media.C5783aw) r5     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r6 = "impressionId"
            java.lang.String r6 = r12.optString(r6)     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r7 = r5.mo34676f()     // Catch:{ JSONException -> 0x00a8 }
            boolean r6 = r6.equals(r7)     // Catch:{ JSONException -> 0x00a8 }
            if (r6 == 0) goto L_0x0051
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.C5789ba.m17197a(r5, r12, r11, r2)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0083
        L_0x0075:
            r12 = move-exception
            com.inmobi.media.gj r4 = com.inmobi.media.C6130gj.m18161a()     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.hk r6 = new com.inmobi.media.hk     // Catch:{ JSONException -> 0x00a8 }
            r6.<init>(r12)     // Catch:{ JSONException -> 0x00a8 }
            r4.mo35310a((com.inmobi.media.C6167hk) r6)     // Catch:{ JSONException -> 0x00a8 }
            goto L_0x0084
        L_0x0083:
            r5 = r0
        L_0x0084:
            if (r5 == 0) goto L_0x008b
            java.util.LinkedList<com.inmobi.media.aw> r12 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            r12.remove(r5)     // Catch:{ JSONException -> 0x00a8 }
        L_0x008b:
            int r10 = r10 + 1
            goto L_0x0041
        L_0x008e:
            java.util.LinkedList<com.inmobi.media.aw> r10 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            boolean r10 = r10.isEmpty()     // Catch:{ JSONException -> 0x00a8 }
            if (r10 != 0) goto L_0x00a4
            java.util.LinkedList<com.inmobi.media.aw> r11 = r8.ads     // Catch:{ JSONException -> 0x00a8 }
            java.lang.Object r9 = r11.get(r9)     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.aw r9 = (com.inmobi.media.C5783aw) r9     // Catch:{ JSONException -> 0x00a8 }
            boolean r9 = r9.mo34681k()     // Catch:{ JSONException -> 0x00a8 }
            r8.mCanLoadBeforeShow = r9     // Catch:{ JSONException -> 0x00a8 }
        L_0x00a4:
            if (r10 == 0) goto L_0x00a7
            return r0
        L_0x00a7:
            return r8
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5794bd.m17250a(org.json.JSONObject, long, java.lang.String, java.lang.String):com.inmobi.media.bd");
    }

    /* renamed from: b */
    public final LinkedList<C5783aw> mo34756b() {
        return this.ads;
    }

    /* renamed from: c */
    public final boolean mo34757c() {
        return this.isAuctionClosed;
    }

    /* renamed from: d */
    public final boolean mo34758d() {
        return this.isPod;
    }

    /* renamed from: e */
    public final String mo34759e() {
        return this.adSetId;
    }

    /* renamed from: f */
    public final String mo34760f() {
        return this.mAdType;
    }

    /* renamed from: g */
    public final String mo34761g() {
        return this.adSetAuctionMeta;
    }

    /* renamed from: h */
    public final String mo34762h() {
        return this.requestId;
    }

    /* renamed from: i */
    public final long mo34763i() {
        return this.mPlacementId;
    }

    /* renamed from: j */
    public final boolean mo34764j() {
        return this.mCanLoadBeforeShow;
    }

    /* renamed from: k */
    public final C5783aw mo34765k() {
        try {
            if (!this.ads.isEmpty()) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        return mo34766l();
    }

    /* renamed from: l */
    public final C5783aw mo34766l() {
        try {
            if (this.ads.isEmpty()) {
                return null;
            }
            return this.ads.getFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C5783aw m17249a(String str) {
        Iterator it = this.ads.iterator();
        while (it.hasNext()) {
            C5783aw awVar = (C5783aw) it.next();
            if (str.equals(awVar.mo34676f())) {
                return awVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo34755a(JSONObject jSONObject, C6074ft ftVar) throws JSONException {
        if (!this.isAuctionClosed) {
            String string = jSONObject.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            if (this.requestId.equals(string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string2 = jSONObject2.getString(KEY_IMPRESSION_ID);
                        this.mMacros = jSONObject2.optJSONObject(KEY_MACROS);
                        C5783aw a = m17249a(string2);
                        if (a != null) {
                            a.mo34668a(this.mMacros);
                            try {
                                a = C5789ba.m17193a(a, ftVar);
                            } catch (C5845bu unused) {
                            }
                            if (a != null) {
                                JSONObject jSONObject3 = this.mMacros;
                                if (jSONObject3 != null) {
                                    if (jSONObject3.has(MACRO_ADV_PRICE)) {
                                        String string3 = this.mMacros.getString(MACRO_ADV_PRICE);
                                        try {
                                            if (a.transaction != null) {
                                                a.transaction.put(BUYER_PRICE, Double.parseDouble(string3));
                                                a.mAdContent.put("transaction", a.transaction);
                                            }
                                        } catch (Exception e) {
                                            C6130gj.m18161a().mo35310a(new C6167hk(e));
                                        }
                                    }
                                    if (this.mMacros.has(MACRO_CTX_HASH)) {
                                        String string4 = this.mMacros.getString(MACRO_CTX_HASH);
                                        try {
                                            if (a.transaction != null) {
                                                a.transaction.put(CTX_HASH_KEY, string4);
                                                a.mAdContent.put("transaction", a.transaction);
                                            }
                                        } catch (JSONException e2) {
                                            C6130gj.m18161a().mo35310a(new C6167hk(e2));
                                        }
                                    }
                                }
                                linkedList.add(a);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render");
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads");
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId");
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response");
    }

    /* renamed from: m */
    public final JSONObject mo34767m() {
        return this.mMacros;
    }

    /* renamed from: a */
    public final void mo34754a(C6074ft ftVar, C5948du duVar) {
        C5783aw l = mo34766l();
        if (l != null) {
            C5944dt a = C5944dt.m17659a();
            a.f15064a.execute(new Runnable(l, ftVar, duVar) {

                /* renamed from: a */
                final /* synthetic */ C5783aw f15066a;

                /* renamed from: b */
                final /* synthetic */ C6074ft f15067b;

                /* renamed from: c */
                final /* synthetic */ C5948du f15068c;

                {
                    this.f15066a = r2;
                    this.f15067b = r3;
                    this.f15068c = r4;
                }

                public final void run() {
                    C5944dt.m17661a(C5944dt.this, this.f15066a, this.f15067b, this.f15068c);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34753a(C5783aw awVar) {
        try {
            if (mo34766l() != null) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        this.ads.addFirst(awVar);
    }
}
