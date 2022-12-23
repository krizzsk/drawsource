package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ha */
/* compiled from: NetworkRequest */
public class C6156ha {

    /* renamed from: a */
    private static final String f15521a = C6156ha.class.getSimpleName();

    /* renamed from: b */
    private String f15522b;

    /* renamed from: c */
    private C6236ja f15523c;

    /* renamed from: d */
    private boolean f15524d;

    /* renamed from: f */
    protected Map<String, String> f15525f;

    /* renamed from: g */
    protected Map<String, String> f15526g;

    /* renamed from: h */
    protected Map<String, String> f15527h;

    /* renamed from: i */
    protected JSONObject f15528i;

    /* renamed from: j */
    String f15529j;

    /* renamed from: k */
    String f15530k;

    /* renamed from: l */
    public int f15531l;

    /* renamed from: m */
    public int f15532m;

    /* renamed from: n */
    public boolean f15533n;

    /* renamed from: o */
    public boolean f15534o;

    /* renamed from: p */
    long f15535p;

    /* renamed from: q */
    public boolean f15536q;

    /* renamed from: r */
    protected boolean f15537r;

    /* renamed from: s */
    protected String f15538s;

    /* renamed from: t */
    public boolean f15539t;

    public C6156ha(String str, String str2, C6236ja jaVar) {
        this(str, str2, jaVar, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
    }

    public C6156ha(String str, String str2) {
        this(str, str2, (C6236ja) null, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15524d = false;
    }

    public C6156ha(String str, String str2, C6236ja jaVar, boolean z, String str3) {
        this.f15525f = new HashMap();
        this.f15531l = 60000;
        this.f15532m = 60000;
        this.f15533n = true;
        this.f15534o = true;
        this.f15535p = -1;
        this.f15536q = false;
        this.f15524d = true;
        this.f15537r = false;
        this.f15538s = C6183hw.m18332f();
        this.f15539t = true;
        this.f15529j = str;
        this.f15522b = str2;
        this.f15523c = jaVar;
        this.f15525f.put("User-Agent", C6183hw.m18337i());
        this.f15536q = z;
        if (ShareTarget.METHOD_GET.equals(str)) {
            this.f15526g = new HashMap();
        } else if (ShareTarget.METHOD_POST.equals(str)) {
            this.f15527h = new HashMap();
            this.f15528i = new JSONObject();
        }
        this.f15530k = str3;
    }

    /* renamed from: c */
    public final boolean mo35342c() {
        return this.f15535p != -1;
    }

    /* renamed from: a */
    public final void mo35338a(Map<String, String> map) {
        if (map != null) {
            this.f15525f.putAll(map);
        }
    }

    /* renamed from: b */
    public final void mo35340b(Map<String, String> map) {
        if (map != null) {
            this.f15526g.putAll(map);
        }
    }

    /* renamed from: c */
    public final void mo35341c(Map<String, String> map) {
        this.f15527h.putAll(map);
    }

    /* renamed from: d */
    public final Map<String, String> mo35343d() {
        C6196id.m18388a(this.f15525f);
        return this.f15525f;
    }

    /* renamed from: e */
    public final String mo35345e() {
        String b;
        String str = this.f15522b;
        if (this.f15526g == null || (b = mo35295b()) == null || b.trim().length() == 0) {
            return str;
        }
        if (!str.contains("?")) {
            str = str + "?";
        }
        if (!str.endsWith("&") && !str.endsWith("?")) {
            str = str + "&";
        }
        return str + b;
    }

    /* renamed from: a */
    public void mo34869a() {
        JSONObject b;
        C6219in.m18466g();
        this.f15536q = C6219in.m18457a(this.f15536q);
        if (this.f15534o) {
            if (ShareTarget.METHOD_GET.equals(this.f15529j)) {
                m18223e(this.f15526g);
            } else if (ShareTarget.METHOD_POST.equals(this.f15529j)) {
                m18223e(this.f15527h);
            }
        }
        if (this.f15524d && (b = C6219in.m18458b()) != null) {
            if (ShareTarget.METHOD_GET.equals(this.f15529j)) {
                this.f15526g.put("consentObject", b.toString());
            } else if (ShareTarget.METHOD_POST.equals(this.f15529j)) {
                this.f15527h.put("consentObject", b.toString());
            }
        }
        if (!this.f15539t) {
            return;
        }
        if (ShareTarget.METHOD_GET.equals(this.f15529j)) {
            this.f15526g.put("u-appsecure", Byte.toString(C6205ii.m18418a().f15657d));
        } else if (ShareTarget.METHOD_POST.equals(this.f15529j)) {
            this.f15527h.put("u-appsecure", Byte.toString(C6205ii.m18418a().f15657d));
        }
    }

    /* renamed from: b */
    private String mo35295b() {
        C6196id.m18388a(this.f15526g);
        return C6196id.m18384a(this.f15526g, "&");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo35346f() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f15530k
            int r1 = r0.hashCode()
            r2 = -1485569826(0xffffffffa77400de, float:-3.3862272E-15)
            r3 = 1
            if (r1 == r2) goto L_0x001c
            r2 = -43840953(0xfffffffffd630a47, float:-1.8861757E37)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "application/json"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "application/x-www-form-urlencoded"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == 0) goto L_0x003c
            if (r0 == r3) goto L_0x002e
            java.lang.String r0 = ""
            goto L_0x0042
        L_0x002e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f15527h
            com.inmobi.media.C6196id.m18388a((java.util.Map<java.lang.String, java.lang.String>) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f15527h
            java.lang.String r1 = "&"
            java.lang.String r0 = com.inmobi.media.C6196id.m18384a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r1)
            goto L_0x0042
        L_0x003c:
            org.json.JSONObject r0 = r4.f15528i
            java.lang.String r0 = r0.toString()
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6156ha.mo35346f():java.lang.String");
    }

    /* renamed from: a */
    public final void mo35339a(boolean z) {
        this.f15537r = z;
    }

    /* renamed from: e */
    private void m18223e(Map<String, String> map) {
        map.putAll(C6205ii.m18418a().f15656c);
        map.putAll(C6210ik.m18426a(this.f15537r));
        map.putAll(C6220io.m18469a());
        mo35344d(map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo35344d(Map<String, String> map) {
        C6236ja jaVar = this.f15523c;
        if (jaVar != null) {
            map.putAll(jaVar.mo35464a());
        }
    }

    /* renamed from: g */
    public final long mo35347g() {
        try {
            if (ShareTarget.METHOD_GET.equals(this.f15529j)) {
                return 0 + ((long) mo35295b().length());
            }
            if (ShareTarget.METHOD_POST.equals(this.f15529j)) {
                return ((long) mo35346f().length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    protected static void m18221a(Map<String, String> map, Pair<String, String> pair) {
        if (pair != null && map != null) {
            map.put((String) pair.first, (String) pair.second);
        }
    }
}
