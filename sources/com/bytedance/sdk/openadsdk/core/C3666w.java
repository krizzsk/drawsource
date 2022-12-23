package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.adexpress.p095d.C2577b;
import com.bytedance.sdk.component.p088a.C2484a;
import com.bytedance.sdk.component.p088a.C2504l;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f;
import com.bytedance.sdk.component.p108d.p117d.C2815g;
import com.bytedance.sdk.component.p118e.p121c.C2856c;
import com.bytedance.sdk.component.p118e.p121c.C2857d;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import com.bytedance.sdk.component.utils.C2901k;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.common.C3158a;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3552j;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p144b.C3364d;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3684a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import com.bytedance.sdk.openadsdk.p166e.C3728b;
import com.bytedance.sdk.openadsdk.p166e.C3729c;
import com.bytedance.sdk.openadsdk.p166e.C3730d;
import com.bytedance.sdk.openadsdk.p167f.C3731a;
import com.bytedance.sdk.openadsdk.p167f.p168a.C3732a;
import com.bytedance.sdk.openadsdk.p167f.p168a.C3735b;
import com.bytedance.sdk.openadsdk.p167f.p168a.C3737c;
import com.bytedance.sdk.openadsdk.p167f.p168a.C3739d;
import com.bytedance.sdk.openadsdk.p167f.p168a.C3740e;
import com.bytedance.sdk.openadsdk.p169g.C3741a;
import com.bytedance.sdk.openadsdk.p169g.C3742b;
import com.bytedance.sdk.openadsdk.p169g.C3743c;
import com.bytedance.sdk.openadsdk.p169g.C3744d;
import com.bytedance.sdk.openadsdk.p169g.C3745e;
import com.bytedance.sdk.openadsdk.p169g.C3749h;
import com.bytedance.sdk.openadsdk.p178l.C3869f;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3883l;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.facebook.appevents.UserDataStore;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.w */
/* compiled from: TTAndroidObject */
public class C3666w implements C2577b, C2923x.C2924a, C3728b {

    /* renamed from: g */
    private static final Map<String, Boolean> f9379g;

    /* renamed from: A */
    private C3742b f9380A;

    /* renamed from: B */
    private C3749h f9381B;

    /* renamed from: C */
    private boolean f9382C = true;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public List<C3431n> f9383D;

    /* renamed from: E */
    private HashMap<String, C3463i> f9384E;

    /* renamed from: F */
    private boolean f9385F = false;

    /* renamed from: G */
    private boolean f9386G = false;

    /* renamed from: H */
    private C3118u f9387H;

    /* renamed from: I */
    private C2512r f9388I;

    /* renamed from: J */
    private String f9389J;

    /* renamed from: K */
    private boolean f9390K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C3684a f9391L;

    /* renamed from: a */
    protected Map<String, Object> f9392a;

    /* renamed from: b */
    boolean f9393b;

    /* renamed from: c */
    boolean f9394c = false;

    /* renamed from: d */
    private WeakReference<SSWebView> f9395d;

    /* renamed from: e */
    private C2923x f9396e;

    /* renamed from: f */
    private String f9397f;

    /* renamed from: h */
    private WeakReference<Context> f9398h;

    /* renamed from: i */
    private C3729c f9399i;

    /* renamed from: j */
    private String f9400j;

    /* renamed from: k */
    private WeakReference<View> f9401k;

    /* renamed from: l */
    private String f9402l;

    /* renamed from: m */
    private int f9403m;

    /* renamed from: n */
    private String f9404n;

    /* renamed from: o */
    private int f9405o;

    /* renamed from: p */
    private boolean f9406p = true;

    /* renamed from: q */
    private C3431n f9407q;

    /* renamed from: r */
    private C2561j f9408r;

    /* renamed from: s */
    private C3552j f9409s;

    /* renamed from: t */
    private JSONObject f9410t;

    /* renamed from: u */
    private C3730d f9411u;

    /* renamed from: v */
    private C3741a f9412v;

    /* renamed from: w */
    private C3745e f9413w;

    /* renamed from: x */
    private C3744d f9414x;

    /* renamed from: y */
    private JSONObject f9415y;

    /* renamed from: z */
    private C3364d f9416z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.w$a */
    /* compiled from: TTAndroidObject */
    public static class C3676a {

        /* renamed from: a */
        public String f9432a;

        /* renamed from: b */
        public String f9433b;

        /* renamed from: c */
        public String f9434c;

        /* renamed from: d */
        public JSONObject f9435d;

        /* renamed from: e */
        public int f9436e;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f9379g = concurrentHashMap;
        concurrentHashMap.put(C2863b.b1659536876590dc("lne\\asci|"), Boolean.TRUE);
        f9379g.put(C2863b.b1659536876590dc("pskueqc"), Boolean.TRUE);
        f9379g.put(C2863b.b1659536876590dc("dhqseqeoWdoxlij"), Boolean.TRUE);
        f9379g.put(C2863b.b1659536876590dc("ctqwkhYb~ld"), Boolean.TRUE);
        f9379g.put(C2863b.b1659536876590dc("lne\\asci|V|8"), Boolean.TRUE);
    }

    public C3666w(Context context) {
        this.f9398h = new WeakReference<>(context);
        this.f9396e = new C2923x(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private void m11902a(final C3676a aVar, final JSONObject jSONObject) {
        if (aVar != null) {
            try {
                mo20351a(aVar.f9435d, (C3743c) new C3743c() {
                    /* renamed from: a */
                    public void mo20385a(boolean z, List<C3431n> list) {
                        if (z) {
                            try {
                                jSONObject.put(C3924h.h1659536876613dc("csgbplpb{"), C3666w.m11910b(list));
                                C3666w.this.m11912b(aVar.f9433b, jSONObject);
                            } catch (Exception unused) {
                            }
                        } else {
                            C3666w.this.m11912b(aVar.f9433b, jSONObject);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m11906a(String str, boolean z) {
        if (this.f9387H != null && !TextUtils.isEmpty(str)) {
            if (z) {
                this.f9387H.mo18721a(str);
            } else {
                this.f9387H.mo18728b(str);
            }
        }
    }

    @JProtect
    /* renamed from: a */
    private void m11907a(JSONObject jSONObject, int i) throws Exception {
        String e1659536876632dc;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String put : m11933q()) {
            jSONArray.put(put);
        }
        jSONObject.put(C2736e.e1659536876632dc("aqrMehc"), C3158a.m9134a());
        jSONObject.put(C2736e.e1659536876632dc("iolfvDvwFhgn"), C3158a.m9139e());
        jSONObject.put(C2736e.e1659536876632dc("ahf"), C3158a.m9136b());
        jSONObject.put(C2736e.e1659536876632dc("seiF`lrngg"), C3158a.m9137c());
        jSONObject.put(C2736e.e1659536876632dc("aqrUawungg"), C3158a.m9138d());
        jSONObject.put(C2736e.e1659536876632dc("ndvW}uc"), C3158a.m9140f());
        jSONObject.put(C2736e.e1659536876632dc("strskwrKaz~"), jSONArray);
        jSONObject.put(C2736e.e1659536876632dc("ddtjg`Oc"), C3158a.m9135a(C3513m.m10963a()));
        if (C3869f.m12615b(C3513m.m10963a())) {
            e1659536876632dc = C2736e.e1659536876632dc("ddtjg`Ywdh~mcc");
            str = "AofqklbXXhn";
        } else {
            e1659536876632dc = C2736e.e1659536876632dc("ddtjg`Ywdh~mcc");
            str = "Aofqklb";
        }
        jSONObject.put(e1659536876632dc, C2736e.e1659536876632dc(str));
        jSONObject.put(C2736e.e1659536876632dc("ddtjg`Ysqyo"), Build.VERSION.RELEASE);
    }

    @JProtect
    /* renamed from: a */
    private boolean m11908a(String str, int i, C3414j jVar) {
        HashMap<String, C3463i> hashMap;
        C3463i iVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f9384E) == null || (iVar = hashMap.get(str)) == null) {
            return false;
        }
        iVar.mo19790a(i, jVar);
        return true;
    }

    /* renamed from: b */
    public static JSONArray m11910b(List<C3431n> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).mo19584ar());
        }
        return jSONArray;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11912b(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C2857d.d1659536876571dc("_^opcZr~xl"), C2857d.d1659536876571dc("c`nofdel"));
            jSONObject2.put(C2857d.d1659536876571dc("_^abhidfkbUbh"), str);
            if (jSONObject != null) {
                jSONObject2.put(C2857d.d1659536876571dc("_^rbvdkt"), jSONObject);
            }
            m11934q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m11914c(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3886o.o1659536876602dc("_^opcZr~xl"), C3886o.o1659536876602dc("ewgmp"));
                jSONObject2.put(C3886o.o1659536876602dc("_^guakrXam"), str);
                if (jSONObject != null) {
                    jSONObject2.put(C3886o.o1659536876602dc("_^rbvdkt"), jSONObject);
                }
                m11934q(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m11915e(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(this.f9400j)) {
            jSONObject.put(C3513m.m1659536876602dc("chf"), this.f9400j);
        }
        if (!TextUtils.isEmpty(this.f9402l)) {
            jSONObject.put(C3513m.m1659536876602dc("lne\\a}rui"), this.f9402l);
        }
        if (!TextUtils.isEmpty(this.f9404n)) {
            jSONObject.put(C3513m.m1659536876602dc("dnumhjgcW|xg"), this.f9404n);
        }
        jSONObject.put(C3513m.m1659536876602dc(UserDataStore.DATE_OF_BIRTH), TextUtils.isEmpty(C3513m.m10973h().mo19883w()) ? C3513m.m10973h().mo19883w() : C3513m.m1659536876602dc("SF"));
        jSONObject.put(C3513m.m1659536876602dc("l`ldqdab"), C3898x.m12816k(C3513m.m10963a()));
    }

    /* renamed from: f */
    private void m11916f(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(C3434p.m10490b(this.f9407q))) {
            jSONObject.put(C3513m.m1659536876602dc("pmczegjbWz~r`h"), C3434p.m10490b(this.f9407q));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|(1:8)|9|10|(1:24)(2:12|(2:14|25)(2:15|23))|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11917g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "TUCm`winlFhainz"
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x008e }
            r2 = 2
            byte[] r2 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x008e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x008e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x008e }
            r3 = 0
        L_0x001d:
            if (r3 >= r1) goto L_0x00be
            com.bytedance.sdk.openadsdk.core.w$a r4 = new com.bytedance.sdk.openadsdk.core.w$a     // Catch:{ Exception -> 0x008e }
            r4.<init>()     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r5 = r2.optJSONObject(r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = "_^opcZr~xl"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ all -> 0x0067 }
            r7 = 0
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f9432a = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "_^abhidfkbUbh"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f9433b = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "ftl`"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x0067 }
            r4.f9434c = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "p`pbiv"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0067 }
            r4.f9435d = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "JRQGO"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ all -> 0x0067 }
            int r5 = r5.optInt(r6)     // Catch:{ all -> 0x0067 }
            r4.f9436e = r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            java.lang.String r5 = r4.f9432a     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = r4.f9434c     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 == 0) goto L_0x007c
            goto L_0x008b
        L_0x007c:
            com.bytedance.sdk.component.utils.x r5 = r8.f9396e     // Catch:{ Exception -> 0x008e }
            r6 = 11
            android.os.Message r5 = r5.obtainMessage(r6)     // Catch:{ Exception -> 0x008e }
            r5.obj = r4     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.x r4 = r8.f9396e     // Catch:{ Exception -> 0x008e }
            r4.sendMessage(r5)     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x008e:
            boolean r1 = com.bytedance.sdk.component.utils.C2905l.m8108a()
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD\u0002"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r2)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.bytedance.sdk.component.utils.C2905l.m8117d(r0, r9)
            goto L_0x00be
        L_0x00b1:
            java.lang.String r9 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)
            java.lang.String r0 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)
            com.bytedance.sdk.component.utils.C2905l.m8117d(r9, r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11917g(java.lang.String):void");
    }

    /* renamed from: g */
    private void m11918g(JSONObject jSONObject) {
        C3118u uVar;
        if (jSONObject != null && (uVar = this.f9387H) != null) {
            uVar.mo18730b(jSONObject);
        }
    }

    /* renamed from: h */
    private void m11919h(JSONObject jSONObject) {
        C3742b bVar = this.f9380A;
        if (bVar != null && jSONObject != null) {
            bVar.mo18389a(jSONObject.optBoolean(C3924h.h1659536876613dc("irPfjacu[|i"), false), jSONObject.optInt(C3924h.h1659536876613dc("cnff"), -1), jSONObject.optString(C3924h.h1659536876613dc("mre"), ""));
        }
    }

    /* renamed from: h */
    private boolean m11920h(String str) {
        return TextUtils.isEmpty(str) || !C3886o.o1659536876602dc("cmk`oZis`lx").equals(str) || mo20376k();
    }

    /* renamed from: i */
    private String m11921i(String str) {
        if (this.f9408r != null) {
            return str;
        }
        int i = this.f9403m;
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '_';
                c2 = '_';
            }
        }
        return C3898x.m12752a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m11922i(JSONObject jSONObject) {
        if (this.f9409s != null && jSONObject != null) {
            try {
                this.f9409s.mo18407a(jSONObject.optBoolean(C3886o.o1659536876602dc("mtvf"), false));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r1.length();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11923j(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "bxvf`dhdm3%$"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r0 = "bxvf`dhdm3%$hd}qeq{Kxsdkx}~3"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)
            java.lang.String r1 = "bxvf`dhdm3%$|gyqew<gpbe}jowh2"
            java.lang.String r1 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r1)
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0032
            android.webkit.WebView r3 = r2.m11929o()     // Catch:{ Exception -> 0x0064 }
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "j`tbwftnx}0_cxzfq~X@Vgs|4Dzxj|HpWFQ@\u000e\u000e"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)     // Catch:{ Exception -> 0x0064 }
            com.bytedance.sdk.component.utils.C2901k.m8099a(r3, r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x0032:
            boolean r0 = r3.startsWith(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r1.length()     // Catch:{ Exception -> 0x0064 }
            r1 = 38
            int r1 = r3.indexOf(r1, r0)     // Catch:{ Exception -> 0x0064 }
            if (r1 > 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.String r0 = r3.substring(r0, r1)     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = "SBGMAZ@B\\JBZYH[J"
            java.lang.String r1 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r1)     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r3.length()     // Catch:{ Exception -> 0x0064 }
            if (r0 <= 0) goto L_0x0064
            r2.m11917g((java.lang.String) r3)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11923j(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m11924j(JSONObject jSONObject) {
        if (this.f9409s != null && jSONObject != null) {
            try {
                this.f9409s.mo18406a(jSONObject.optInt(C3886o.o1659536876602dc("sucwaQwm"), -1));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    private boolean m11925k(JSONObject jSONObject) {
        C3552j jVar = this.f9409s;
        if (!(jVar == null || jSONObject == null)) {
            double c = (double) jVar.mo18410c();
            int d = this.f9409s.mo18411d();
            try {
                jSONObject.put(C2736e.e1659536876632dc("ctpqakrSado"), c / 1000.0d);
                jSONObject.put(C2736e.e1659536876632dc("sucwa"), d);
                String e1659536876632dc = C2736e.e1659536876632dc("TUCm`winlFhainz");
                C2905l.m8111b(e1659536876632dc, C2736e.e1659536876632dc("ctpqakrSado'yo{u+") + d);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        switch(r2) {
            case 40: goto L_0x0117;
            case 41: goto L_0x011b;
            case 42: goto L_0x011e;
            default: goto L_0x011a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        switch(r1) {
            case 70: goto L_0x0102;
            case 71: goto L_0x0102;
            case 72: goto L_0x0111;
            default: goto L_0x011e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r4 = '6';
        r2 = 'Q';
        r1 = '[';
     */
    @com.bytedance.JProtect
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11926l(org.json.JSONObject r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.bytedance.sdk.component.adexpress.b.j r2 = r0.f9408r
            if (r2 == 0) goto L_0x013c
            if (r1 != 0) goto L_0x000c
            goto L_0x013c
        L_0x000c:
            com.bytedance.sdk.component.adexpress.b.m r2 = new com.bytedance.sdk.component.adexpress.b.m
            r2.<init>()
            r3 = 1
            r2.mo16705a((int) r3)
            java.lang.String r4 = "irPfjacu[|i"
            java.lang.String r4 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r4)     // Catch:{ Exception -> 0x012b }
            boolean r4 = r1.optBoolean(r4)     // Catch:{ Exception -> 0x012b }
            java.lang.String r5 = "AeQj~`"
            java.lang.String r5 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r5)     // Catch:{ Exception -> 0x012b }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r7 = "whfwl"
            r8 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.String r8 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r7)     // Catch:{ Exception -> 0x012b }
            double r8 = r5.optDouble(r8)     // Catch:{ Exception -> 0x012b }
            java.lang.String r10 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r6)     // Catch:{ Exception -> 0x012b }
            double r10 = r5.optDouble(r10)     // Catch:{ Exception -> 0x012b }
            goto L_0x0043
        L_0x0042:
            r10 = r8
        L_0x0043:
            java.lang.String r5 = "vhffkLhag"
            java.lang.String r5 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r5)     // Catch:{ Exception -> 0x012b }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x012b }
            if (r5 == 0) goto L_0x00ca
            java.lang.String r12 = "x"
            java.lang.String r12 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r12)     // Catch:{ Exception -> 0x00c5 }
            double r12 = r5.optDouble(r12)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r14 = "y"
            java.lang.String r14 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r14)     // Catch:{ Exception -> 0x00c5 }
            double r14 = r5.optDouble(r14)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r7 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r7)     // Catch:{ Exception -> 0x00c5 }
            r16 = r4
            double r3 = r5.optDouble(r7)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r6)     // Catch:{ Exception -> 0x00c5 }
            double r6 = r5.optDouble(r6)     // Catch:{ Exception -> 0x00c5 }
            boolean r17 = r0.m11927m(r5)     // Catch:{ Exception -> 0x00c5 }
            if (r17 == 0) goto L_0x00b6
            java.lang.String r17 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r17)     // Catch:{ Exception -> 0x00c5 }
            r17 = r10
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16704a((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16711b((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16716c((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16719d((float) r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00b8
        L_0x00b6:
            r17 = r10
        L_0x00b8:
            r2.mo16715c((double) r12)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16718d((double) r14)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16721e(r3)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16723f(r6)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r1 = 101(0x65, float:1.42E-43)
            r0 = r19
            goto L_0x012d
        L_0x00ca:
            r16 = r4
            r17 = r10
        L_0x00ce:
            java.lang.String r0 = "mdqpebc"
            java.lang.String r0 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r0)     // Catch:{ Exception -> 0x0129 }
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3446g.m10553a(r3)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r4)     // Catch:{ Exception -> 0x0125 }
            int r1 = r1.optInt(r4, r3)     // Catch:{ Exception -> 0x0125 }
            r3 = r16
            r2.mo16707a((boolean) r3)     // Catch:{ Exception -> 0x0129 }
            r2.mo16703a((double) r8)     // Catch:{ Exception -> 0x0129 }
            r8 = r17
            r2.mo16710b((double) r8)     // Catch:{ Exception -> 0x0129 }
            r2.mo16706a((java.lang.String) r0)     // Catch:{ Exception -> 0x0129 }
            r2.mo16712b((int) r1)     // Catch:{ Exception -> 0x0129 }
            r0 = r19
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f9408r     // Catch:{ Exception -> 0x012b }
            r1.mo16670a(r2)     // Catch:{ Exception -> 0x012b }
        L_0x0102:
            r1 = -84
            r3 = 17
            r2 = r3
        L_0x0107:
            if (r2 == r3) goto L_0x010f
        L_0x0109:
            switch(r1) {
                case 89: goto L_0x0102;
                case 90: goto L_0x0102;
                case 91: goto L_0x013c;
                default: goto L_0x010c;
            }
        L_0x010c:
            r1 = 90
            goto L_0x0109
        L_0x010f:
            r4 = 11
        L_0x0111:
            r4 = 56
        L_0x0113:
            switch(r4) {
                case 54: goto L_0x0107;
                case 55: goto L_0x0117;
                case 56: goto L_0x011e;
                default: goto L_0x0116;
            }
        L_0x0116:
            goto L_0x0111
        L_0x0117:
            switch(r2) {
                case 40: goto L_0x0117;
                case 41: goto L_0x011b;
                case 42: goto L_0x011e;
                default: goto L_0x011a;
            }
        L_0x011a:
            goto L_0x011e
        L_0x011b:
            switch(r1) {
                case 70: goto L_0x0102;
                case 71: goto L_0x0102;
                case 72: goto L_0x0111;
                default: goto L_0x011e;
            }
        L_0x011e:
            r4 = 54
            r2 = 81
            r1 = 91
            goto L_0x0113
        L_0x0125:
            r0 = r19
            r1 = r3
            goto L_0x012d
        L_0x0129:
            r0 = r19
        L_0x012b:
            r1 = 101(0x65, float:1.42E-43)
        L_0x012d:
            r2.mo16712b((int) r1)
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.C3446g.m10553a(r1)
            r2.mo16706a((java.lang.String) r1)
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f9408r
            r1.mo16670a(r2)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11926l(org.json.JSONObject):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: m */
    private boolean m11927m(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r0)
            boolean r0 = r5.has(r0)
            r1 = 0
            r2 = 56
            r3 = 60
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r0)
            boolean r5 = r5.has(r0)
            goto L_0x0043
        L_0x0034:
            r5 = r1
        L_0x0035:
            r0 = 41
        L_0x0037:
            switch(r0) {
                case 40: goto L_0x003b;
                case 41: goto L_0x0055;
                case 42: goto L_0x0035;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0035
        L_0x003b:
            switch(r3) {
                case 81: goto L_0x003f;
                case 82: goto L_0x0049;
                case 83: goto L_0x0047;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0055
        L_0x003f:
            switch(r2) {
                case 29: goto L_0x0047;
                case 30: goto L_0x0047;
                case 31: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0049
        L_0x0043:
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x004d
        L_0x0047:
            r1 = r5
            goto L_0x0055
        L_0x0049:
            switch(r2) {
                case 39: goto L_0x004d;
                case 40: goto L_0x0034;
                case 41: goto L_0x0055;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0052
        L_0x004d:
            r0 = 40
            r3 = 83
            goto L_0x0037
        L_0x0052:
            r2 = 39
            goto L_0x0049
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11927m(org.json.JSONObject):boolean");
    }

    /* renamed from: n */
    private void m11928n(JSONObject jSONObject) {
        if (jSONObject != null) {
            C2905l.m8111b(C2856c.c1659536876586dc("TUCm`winlFhainz"), C2856c.c1659536876586dc("TUCm`winlFhainz/xp|wxpdSaw{vu~JmABI"));
            try {
                Uri parse = Uri.parse(jSONObject.optString(C2856c.c1659536876586dc("tsc`oAgsi")));
                if (C2856c.c1659536876586dc("bxvf`dhdm").equals(parse.getScheme().toLowerCase())) {
                    C3881j.m12667a(parse, this);
                    char c = '8';
                    char c2 = Typography.less;
                    while (true) {
                        char c3 = ')';
                        while (true) {
                            switch (c3) {
                                case '(':
                                    switch (c2) {
                                        case 'Q':
                                            switch (c) {
                                                case 29:
                                                case 30:
                                                case 31:
                                                    return;
                                            }
                                        case 'R':
                                            break;
                                        case 'S':
                                            return;
                                    }
                                    while (true) {
                                        switch (c) {
                                            case '\'':
                                                break;
                                            case '(':
                                            case ')':
                                                continue;
                                            default:
                                                c = '\'';
                                        }
                                    }
                                    break;
                                case ')':
                                    break;
                            }
                            c3 = '(';
                            c2 = 'S';
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o */
    private WebView m11929o() {
        WeakReference<SSWebView> weakReference = this.f9395d;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((SSWebView) this.f9395d.get()).getWebView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        switch(r5) {
            case 29: goto L_0x0045;
            case 30: goto L_0x0025;
            case 31: goto L_0x0035;
            default: goto L_0x0032;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r5 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11930o(org.json.JSONObject r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0045
            com.bytedance.sdk.openadsdk.e.d r0 = r4.f9411u
            if (r0 != 0) goto L_0x0007
            goto L_0x0045
        L_0x0007:
            r0 = 0
            r1 = 0
            java.lang.String r2 = "tdobmUthl|iEi}"
            java.lang.String r2 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r2)     // Catch:{ Exception -> 0x0040 }
            org.json.JSONArray r5 = r5.optJSONArray(r2)     // Catch:{ Exception -> 0x0040 }
            if (r5 == 0) goto L_0x003a
            int r2 = r5.length()     // Catch:{ Exception -> 0x0040 }
            if (r2 <= 0) goto L_0x003a
            com.bytedance.sdk.openadsdk.e.d r2 = r4.f9411u     // Catch:{ Exception -> 0x0040 }
            r3 = 1
            r2.mo18439a(r3, r5)     // Catch:{ Exception -> 0x0040 }
            r5 = 72
            r0 = 95
        L_0x0025:
            r1 = 38
        L_0x0027:
            switch(r1) {
                case 38: goto L_0x0035;
                case 39: goto L_0x002b;
                case 40: goto L_0x0025;
                default: goto L_0x002a;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x002a:
            goto L_0x0025
        L_0x002b:
            switch(r0) {
                case 52: goto L_0x0045;
                case 53: goto L_0x0035;
                case 54: goto L_0x002f;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x002e:
            goto L_0x0025
        L_0x002f:
            switch(r5) {
                case 29: goto L_0x0045;
                case 30: goto L_0x0025;
                case 31: goto L_0x0035;
                default: goto L_0x0032;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x0032:
            r5 = 31
            goto L_0x002f
        L_0x0035:
            r1 = 39
            r0 = 52
            goto L_0x0027
        L_0x003a:
            com.bytedance.sdk.openadsdk.e.d r5 = r4.f9411u     // Catch:{ Exception -> 0x0040 }
            r5.mo18439a(r1, r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            com.bytedance.sdk.openadsdk.e.d r5 = r4.f9411u
            r5.mo18439a(r1, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11930o(org.json.JSONObject):void");
    }

    @JProtect
    /* renamed from: p */
    private JSONObject m11931p() {
        try {
            View view = (View) this.f9401k.get();
            View view2 = (View) this.f9395d.get();
            if (view != null) {
                if (view2 != null) {
                    int[] b = C3904y.m12875b(view);
                    int[] b2 = C3904y.m12875b(view2);
                    if (b != null) {
                        if (b2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C2815g.g1659536876620dc("x"), C3904y.m12882d(C3513m.m10963a(), (float) (b[0] - b2[0])));
                            jSONObject.put(C2815g.g1659536876620dc("y"), C3904y.m12882d(C3513m.m10963a(), (float) (b[1] - b2[1])));
                            jSONObject.put(C2815g.g1659536876620dc("w"), C3904y.m12882d(C3513m.m10963a(), (float) view.getWidth()));
                            jSONObject.put(C2815g.g1659536876620dc("h"), C3904y.m12882d(C3513m.m10963a(), (float) view.getHeight()));
                            jSONObject.put(C2815g.g1659536876620dc("irG{mvr"), true);
                            return jSONObject;
                        }
                    }
                    C2905l.m8118e(C2815g.g1659536876620dc("TUCm`winlFhainz"), C2815g.g1659536876620dc("sdv@hjubJ|~ccGav~2vfgye8iuhuiwpN\u0001MQ\u0004RCE~@O\\|B]FDX]]\u0014\\E\u0017VLVW"));
                    return null;
                }
            }
            C2905l.m8118e(C2815g.g1659536876620dc("TUCm`winlFhainz"), C2815g.g1659536876620dc("sdv@hjubJ|~ccGav~2vfgye8zvtox\\jTUMM\u0004LU\u0007F\\FG"));
            return null;
        } catch (Throwable th) {
            C2905l.m8106a(C2863b.b1659536876590dc("TUCm`winlFhainz"), C2863b.b1659536876590dc("sdv@hjubJ|~ccGav~2vfgye"), th);
            return null;
        }
    }

    /* renamed from: p */
    private boolean m11932p(JSONObject jSONObject) {
        try {
            jSONObject.put(C2863b.b1659536876590dc("csgbplpb{"), m11910b(this.f9383D));
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '7':
                        case '8':
                        case '9':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: q */
    private List<String> m11933q() {
        return Arrays.asList(new String[]{C2722f.f1659536876631dc("aqrJjci"), C2722f.f1659536876631dc("aeKmbj"), C2722f.f1659536876631dc("gdvWahvki}oBbka"), C2722f.f1659536876631dc("gdvWaHgnImy")});
    }

    /* renamed from: q */
    private void m11934q(JSONObject jSONObject) {
        WebView o;
        if (jSONObject != null && (o = m11929o()) != null) {
            String str = C2857d.d1659536876571dc("j`tbwftnx}0_cxzfq~X@Vgs|4Dt|p{LDoFWVG@MoXDAyAZDXS\\\u001c") + jSONObject.toString() + C2857d.d1659536876571dc(")");
            C2901k.m8099a(o, str);
            if (C2905l.m8108a()) {
                C2905l.m8105a(C2857d.d1659536876571dc("TUCm`winlFhainz"), C2857d.d1659536876571dc("jr]nwb&") + str);
            }
        }
    }

    /* renamed from: r */
    private JSONObject m11935r(JSONObject jSONObject) {
        if (this.f9392a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString(C3886o.o1659536876602dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry next : this.f9392a.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                jSONObject.put(C3886o.o1659536876602dc("ae]f|qtfWmkm"), jSONObject2.toString());
            } catch (Exception e) {
                C2905l.m8110b(e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: r */
    private void m11936r() {
        C3749h hVar = this.f9381B;
        if (hVar != null) {
            hVar.mo19055a();
        }
    }

    /* renamed from: s */
    private void m11937s() {
        C3749h hVar = this.f9381B;
        if (hVar != null) {
            hVar.mo19056b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m11938t() {
        C3552j jVar = this.f9409s;
        if (jVar != null) {
            jVar.mo18405a();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private void m11939u() {
        WeakReference<Context> weakReference = this.f9398h;
        if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(C3513m.m10973h().mo19879s())) {
            TTWebsiteActivity.m8711a((Context) this.f9398h.get(), this.f9407q, this.f9389J);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[Catch:{ Exception -> 0x00c2 }] */
    @com.bytedance.JProtect
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11940v() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()
            if (r1 == 0) goto L_0x00c2
            com.bytedance.sdk.openadsdk.core.e.n r1 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            int r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12794f((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            int r2 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12790e((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r3 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r3 = r3.mo19851f((java.lang.String) r4)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.mo19847e((int) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r5 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            boolean r5 = r5.mo19843c((java.lang.String) r6)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r6 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            boolean r6 = com.bytedance.sdk.openadsdk.core.p149e.C3431n.m10311c((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r6)     // Catch:{ Exception -> 0x00c2 }
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0051
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r6 = r6.mo19863j((java.lang.String) r9)     // Catch:{ Exception -> 0x00c2 }
            if (r6 != r7) goto L_0x0051
            r6 = r7
            goto L_0x0052
        L_0x0051:
            r6 = r8
        L_0x0052:
            r9 = 7
            if (r2 == r9) goto L_0x0063
            r9 = 8
            if (r2 != r9) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo19837a((int) r1)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x006b
        L_0x0063:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo19839b((int) r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x006b:
            java.lang.String r2 = "vnk`aZehf}xd`"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r2)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "rw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "fw]polvX{ae|"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "iw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "simt[aotd`an"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            boolean r2 = r2.mo19582ap()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = r8
        L_0x00a3:
            r0.put(r1, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "vhffkZgciy~jxdaa"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00b6
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9407q     // Catch:{ Exception -> 0x00c2 }
            int r8 = r2.mo19656t()     // Catch:{ Exception -> 0x00c2 }
        L_0x00b6:
            r0.put(r1, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "sjks[fnffnoTxbQl|~av"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11940v():org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m11941w() {
        Context context;
        List<C3431n> list = this.f9383D;
        if (list != null && list.size() > 0) {
            this.f9384E = new HashMap<>();
            View view = null;
            WeakReference<SSWebView> weakReference = this.f9395d;
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            WeakReference<Context> weakReference2 = this.f9398h;
            if (weakReference2 != null && (context = (Context) weakReference2.get()) != null) {
                for (C3431n next : this.f9383D) {
                    this.f9384E.put(next.mo19532Y(), new C3463i(context, next, view));
                }
            }
        }
    }

    /* renamed from: x */
    private boolean m11942x() {
        C3431n nVar = this.f9407q;
        if (nVar == null || nVar.mo19577ak() == null || C3434p.m10489a(this.f9407q) || this.f9385F || this.f9407q.mo19577ak().optInt(C3513m.m1659536876602dc("p`pfjqYsqyo")) != 2) {
            return false;
        }
        int e = C3898x.m12790e(this.f9407q);
        if (e != 8 && e != 7) {
            return false;
        }
        this.f9385F = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11943y() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r3.f9399i
            r1 = 95
            if (r0 != 0) goto L_0x000f
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f9407q
            com.bytedance.sdk.openadsdk.e.a r0 = com.bytedance.sdk.openadsdk.p166e.C3727a.m12184a((com.bytedance.sdk.openadsdk.p166e.C3728b) r3, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0)
            r3.f9399i = r0
            goto L_0x0021
        L_0x000f:
            r0 = r1
            r2 = r0
        L_0x0011:
            switch(r0) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0015;
                case 96: goto L_0x001a;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0021
        L_0x0015:
            switch(r2) {
                case 94: goto L_0x000f;
                case 95: goto L_0x0019;
                case 96: goto L_0x000f;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            switch(r2) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0021;
                case 57: goto L_0x000f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x000f
        L_0x001e:
            r0 = 39
            goto L_0x000f
        L_0x0021:
            r0 = 94
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.m11943y():void");
    }

    /* renamed from: a */
    public C2512r mo20330a() {
        return this.f9388I;
    }

    /* renamed from: a */
    public C3666w mo20331a(int i) {
        this.f9405o = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        switch(r1) {
            case 91: goto L_0x001b;
            case 92: goto L_0x0000;
            case 93: goto L_0x001b;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = '[';
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.C3666w mo20332a(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = r0
        L_0x0003:
            switch(r0) {
                case 92: goto L_0x000b;
                case 93: goto L_0x0017;
                case 94: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0000
        L_0x0007:
            r0 = 4
            if (r1 > r0) goto L_0x000f
            goto L_0x0000
        L_0x000b:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x000f;
                case 23: goto L_0x001b;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0017
        L_0x000f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f9401k = r0
            return r2
        L_0x0017:
            switch(r1) {
                case 91: goto L_0x001b;
                case 92: goto L_0x0000;
                case 93: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0020
        L_0x001b:
            r0 = 94
            r1 = 75
            goto L_0x0003
        L_0x0020:
            r1 = 91
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.mo20332a(android.view.View):com.bytedance.sdk.openadsdk.core.w");
    }

    /* renamed from: a */
    public C3666w mo20333a(C2561j jVar) {
        this.f9408r = jVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20334a(SSWebView sSWebView) {
        String o1659536876602dc = C3886o.o1659536876602dc("wd`um`qwgff");
        C2905l.m8118e(o1659536876602dc, C3886o.o1659536876602dc("=<?vw`Ltj;*|ioXfuf2{uf~Tw}!") + sSWebView.hashCode());
        if (sSWebView == null && sSWebView.getWebView() == null) {
            return this;
        }
        try {
            C2512r b = C2512r.m6298a(sSWebView.getWebView()).mo16494a((C2484a) new C3731a()).mo16496a(C3886o.o1659536876602dc("TnwwmdiM[Kxbhjk")).mo16495a((C2504l) new C2504l() {
                /* renamed from: a */
                public <T> T mo16507a(String str, Type type) {
                    return null;
                }

                /* renamed from: a */
                public <T> String mo16508a(T t) {
                    return null;
                }
            }).mo16497a(C3457h.m10580d().mo19779s()).mo16498b(true).mo16493a().mo16499b();
            this.f9388I = b;
            C3740e.m12228a(b, this);
            C3732a.m12207a(this.f9388I, this);
            C3735b.m12215a(this.f9388I, this);
            C3737c.m12220a(this.f9388I, this);
            C3739d.m12225a(this.f9388I, this);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C3666w mo20335a(C3118u uVar) {
        this.f9387H = uVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20336a(C3364d dVar) {
        this.f9416z = dVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20337a(C3431n nVar) {
        this.f9407q = nVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20338a(C3552j jVar) {
        this.f9409s = jVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20339a(C3730d dVar) {
        this.f9411u = dVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20340a(C3741a aVar) {
        this.f9412v = aVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20341a(C3742b bVar) {
        this.f9380A = bVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20342a(C3744d dVar) {
        this.f9414x = dVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20343a(C3745e eVar) {
        this.f9413w = eVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20344a(C3749h hVar) {
        this.f9381B = hVar;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20345a(List<C3431n> list) {
        this.f9383D = list;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20346a(Map<String, Object> map) {
        this.f9392a = map;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20347a(JSONObject jSONObject) {
        this.f9410t = jSONObject;
        return this;
    }

    /* renamed from: a */
    public C3666w mo20348a(boolean z) {
        this.f9393b = z;
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x045a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045c, code lost:
        r3 = r5;
     */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo20349a(com.bytedance.sdk.openadsdk.core.C3666w.C3676a r22, int r23) throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "c`no"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r3)
            java.lang.String r4 = r1.f9432a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0016
            r1 = 0
            return r1
        L_0x0016:
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3457h.m10580d()
            boolean r3 = r3.mo19779s()
            java.lang.String r4 = "TUCm`winlFhainz"
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[KQA)WCVU)|n~~g`~+"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " lgwljb="
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            r5.append(r6)
            java.lang.String r6 = r1.f9434c
            r5.append(r6)
            java.lang.String r6 = " qcqehu:"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            r5.append(r6)
            org.json.JSONObject r6 = r1.f9435d
            if (r6 == 0) goto L_0x0059
            org.json.JSONObject r6 = r1.f9435d
            java.lang.String r6 = r6.toString()
            goto L_0x005b
        L_0x0059:
            java.lang.String r6 = ""
        L_0x005b:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x0065:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = r1.f9434c
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 0
            java.lang.String r9 = "oqgmTwoqijs"
            r10 = -1
            r11 = 1
            switch(r6) {
                case -2036781162: goto L_0x028b;
                case -1423303823: goto L_0x027d;
                case -1330994877: goto L_0x026e;
                case -1169135450: goto L_0x025f;
                case -1023873614: goto L_0x0250;
                case -844321441: goto L_0x0241;
                case -800853518: goto L_0x0232;
                case -794273169: goto L_0x0223;
                case -715147645: goto L_0x0214;
                case -511324706: goto L_0x0206;
                case -489318846: goto L_0x01f6;
                case -278382602: goto L_0x01e6;
                case -173752734: goto L_0x01d7;
                case 27837080: goto L_0x01c7;
                case 94756344: goto L_0x01b7;
                case 105049135: goto L_0x01a7;
                case 399543522: goto L_0x0197;
                case 402955465: goto L_0x0188;
                case 425443791: goto L_0x0178;
                case 442647767: goto L_0x0168;
                case 571273292: goto L_0x0158;
                case 650209982: goto L_0x0149;
                case 672928467: goto L_0x0139;
                case 711635577: goto L_0x0129;
                case 885131792: goto L_0x0119;
                case 1107374321: goto L_0x0109;
                case 1151744482: goto L_0x00f9;
                case 1237100796: goto L_0x00e9;
                case 1532142616: goto L_0x00d9;
                case 1634511418: goto L_0x00c9;
                case 1713585602: goto L_0x00b9;
                case 1731806400: goto L_0x00aa;
                case 1979895452: goto L_0x009b;
                case 2086000188: goto L_0x008b;
                case 2105008900: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x029a
        L_0x007b:
            java.lang.String r6 = "l`lgwfgwmVigene"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 16
            goto L_0x029b
        L_0x008b:
            java.lang.String r6 = "sjksRlbbg"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 20
            goto L_0x029b
        L_0x009b:
            java.lang.String r6 = "sdlgHja"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 2
            goto L_0x029b
        L_0x00aa:
            java.lang.String r6 = "pmczegjbWz~r`h"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r7
            goto L_0x029b
        L_0x00b9:
            java.lang.String r6 = "gdvMaqqhzbNjxl"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 26
            goto L_0x029b
        L_0x00c9:
            java.lang.String r6 = "eof`ewbXdfko"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 27
            goto L_0x029b
        L_0x00d9:
            java.lang.String r6 = "rdolr`Jhimcek"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 10
            goto L_0x029b
        L_0x00e9:
            java.lang.String r6 = "rdlgawBnlOcee~f"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 18
            goto L_0x029b
        L_0x00f9:
            java.lang.String r6 = "mtvfRlbbg"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 21
            goto L_0x029b
        L_0x0109:
            java.lang.String r6 = "p`wpaRce^`o|Xdcjbb"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 29
            goto L_0x029b
        L_0x0119:
            java.lang.String r6 = "gdvUkisjm"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 9
            goto L_0x029b
        L_0x0129:
            java.lang.String r6 = "gdv@qwtbf}\\bhha\\dpfv"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 23
            goto L_0x029b
        L_0x0139:
            java.lang.String r6 = "c`l`aiYcg~dgcljPqabLuq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 14
            goto L_0x029b
        L_0x0149:
            java.lang.String r6 = "gdvWahvki}oBbka"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 4
            goto L_0x029b
        L_0x0158:
            java.lang.String r6 = "dxlbileSzhi`"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 19
            goto L_0x029b
        L_0x0168:
            java.lang.String r6 = "sdlgV`qfzm"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 11
            goto L_0x029b
        L_0x0178:
            java.lang.String r6 = "gdvMeqoqmZciN{|d~Wuaw"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 33
            goto L_0x029b
        L_0x0188:
            java.lang.String r6 = "irTjargedl"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 6
            goto L_0x029b
        L_0x0197:
            java.lang.String r6 = "gdv@hjubJ|~ccGav~"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 8
            goto L_0x029b
        L_0x01a7:
            java.lang.String r6 = "uoqvfveuakoTm}~Pqu"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 15
            goto L_0x029b
        L_0x01b7:
            java.lang.String r6 = "cmmpa"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 34
            goto L_0x029b
        L_0x01c7:
            java.lang.String r6 = "dnumhjgcWhz{Slj"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 13
            goto L_0x029b
        L_0x01d7:
            java.lang.String r6 = "gdvWaHgnImy"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 5
            goto L_0x029b
        L_0x01e6:
            java.lang.String r6 = "sdlg[qcji`U{~bjzseMzpf"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 24
            goto L_0x029b
        L_0x01f6:
            java.lang.String r6 = "gdvNeqcuahfFiyo"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 25
            goto L_0x029b
        L_0x0206:
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r9)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 31
            goto L_0x029b
        L_0x0214:
            java.lang.String r6 = "gdvPgwcbfZcqi"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 7
            goto L_0x029b
        L_0x0223:
            java.lang.String r6 = "aqrJjci"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r8
            goto L_0x029b
        L_0x0232:
            java.lang.String r6 = "cmk`o@pbf}"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 17
            goto L_0x029b
        L_0x0241:
            java.lang.String r6 = "wd`um`qX|`gnSy|nsz"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 30
            goto L_0x029b
        L_0x0250:
            java.lang.String r6 = "oqgmEaJffmZjkhBf~za"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 32
            goto L_0x029b
        L_0x025f:
            java.lang.String r6 = "cicmc`PnlleXxlzj"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 22
            goto L_0x029b
        L_0x026e:
            java.lang.String r6 = "p`wpaRce^`o|"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 28
            goto L_0x029b
        L_0x027d:
            java.lang.String r6 = "aeKmbj"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r11
            goto L_0x029b
        L_0x028b:
            java.lang.String r6 = "st`pgwoemVk{|Rok"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 12
            goto L_0x029b
        L_0x029a:
            r5 = r10
        L_0x029b:
            switch(r5) {
                case 0: goto L_0x051e;
                case 1: goto L_0x051a;
                case 2: goto L_0x048e;
                case 3: goto L_0x0489;
                case 4: goto L_0x045f;
                case 5: goto L_0x0458;
                case 6: goto L_0x044f;
                case 7: goto L_0x042d;
                case 8: goto L_0x0426;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03dd;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03af;
                case 13: goto L_0x0387;
                case 14: goto L_0x037c;
                case 15: goto L_0x0371;
                case 16: goto L_0x035a;
                case 17: goto L_0x0353;
                case 18: goto L_0x034c;
                case 19: goto L_0x0345;
                case 20: goto L_0x0340;
                case 21: goto L_0x0339;
                case 22: goto L_0x0332;
                case 23: goto L_0x032d;
                case 24: goto L_0x0326;
                case 25: goto L_0x0321;
                case 26: goto L_0x031c;
                case 27: goto L_0x0315;
                case 28: goto L_0x0310;
                case 29: goto L_0x030b;
                case 30: goto L_0x0304;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e0;
                case 33: goto L_0x02b2;
                case 34: goto L_0x02a0;
                default: goto L_0x029e;
            }
        L_0x029e:
            goto L_0x0523
        L_0x02a0:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.String r6 = "MDVKKAYDDFYN"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r5, (java.lang.String) r6)
            r21.mo20371f()
            goto L_0x0523
        L_0x02b2:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.String r6 = "MDVKKAY@M]UEMYGYUNAZ@PITMJNTQBZ^t`"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r5, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r0.f9407q
            if (r5 == 0) goto L_0x0523
            java.lang.String r5 = r5.mo19511D()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0523
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f9407q
            java.lang.String r6 = r6.mo19511D()
            r3.put(r5, r6)
            goto L_0x0523
        L_0x02e0:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.String r6 = "MDVKKAYHXLDTC]KAOPVLXTXSHX]^CQWQkr"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r5, (java.lang.String) r6)
            org.json.JSONObject r5 = r1.f9435d
            r0.mo20363c((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x02f4:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r9)
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r5, (java.lang.String) r6)
            r21.m11939u()
            goto L_0x0523
        L_0x0304:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11918g((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x030b:
            r21.m11937s()
            goto L_0x0523
        L_0x0310:
            r21.m11936r()
            goto L_0x0523
        L_0x0315:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11919h((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x031c:
            r0.m11902a((com.bytedance.sdk.openadsdk.core.C3666w.C3676a) r1, (org.json.JSONObject) r3)
            goto L_0x0523
        L_0x0321:
            r0.m11932p(r3)
            goto L_0x0523
        L_0x0326:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11930o(r5)
            goto L_0x0523
        L_0x032d:
            r0.m11925k(r3)
            goto L_0x0523
        L_0x0332:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11924j((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x0339:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11922i((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x0340:
            r21.m11938t()
            goto L_0x0523
        L_0x0345:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11928n(r5)
            goto L_0x0523
        L_0x034c:
            org.json.JSONObject r5 = r1.f9435d
            r0.m11926l(r5)
            goto L_0x0523
        L_0x0353:
            org.json.JSONObject r5 = r1.f9435d
            r0.mo20365d((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x035a:
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9398h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0523
            boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.core.video.p162c.C3622b
            if (r6 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.core.video.c.b r5 = (com.bytedance.sdk.openadsdk.core.video.p162c.C3622b) r5
            r5.mo18428L()
            goto L_0x0523
        L_0x0371:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9399i
            if (r5 == 0) goto L_0x0523
            org.json.JSONObject r6 = r1.f9435d
            r5.mo20518a(r6)
            goto L_0x0523
        L_0x037c:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9399i
            if (r5 == 0) goto L_0x0523
            org.json.JSONObject r6 = r1.f9435d
            r5.mo20520b(r6)
            goto L_0x0523
        L_0x0387:
            r0.f9390K = r11
            com.bytedance.sdk.openadsdk.core.b.d r5 = r0.f9416z
            if (r5 == 0) goto L_0x0394
            boolean r6 = r0.f9382C
            r5.mo18459a(r6)
            goto L_0x0523
        L_0x0394:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9399i
            if (r5 == 0) goto L_0x0523
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9398h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.e.c r6 = r0.f9399i
            org.json.JSONObject r7 = r1.f9435d
            java.lang.String r8 = r0.f9389J
            r6.mo20516a(r5, r7, r8)
            goto L_0x0523
        L_0x03af:
            r21.m11943y()
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9398h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            r13 = r5
            android.content.Context r13 = (android.content.Context) r13
            if (r13 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.e.c r12 = r0.f9399i
            org.json.JSONObject r14 = r1.f9435d
            java.lang.String r15 = r0.f9402l
            int r5 = r0.f9403m
            boolean r6 = r0.f9406p
            r16 = r5
            r17 = r6
            r12.mo20517a(r13, r14, r15, r16, r17)
            goto L_0x0523
        L_0x03d2:
            r0.f9394c = r11
            com.bytedance.sdk.openadsdk.g.e r5 = r0.f9413w
            if (r5 == 0) goto L_0x0523
            r5.mo18400a()
            goto L_0x0523
        L_0x03dd:
            com.bytedance.sdk.openadsdk.g.d r5 = r0.f9414x
            if (r5 == 0) goto L_0x0523
            r5.mo18401a()
            goto L_0x0523
        L_0x03e6:
            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            java.lang.String r6 = "atfjk"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x0418
            int r10 = r5.getStreamVolume(r7)
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Mtqjg%phd|gn,301.1Sfp|yZyw{|yo32\u001eBWQV@HS~FF^AH\u0013"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r5, (java.lang.String) r6)
        L_0x0418:
            if (r10 > 0) goto L_0x041b
            r8 = r11
        L_0x041b:
            java.lang.String r5 = "eof`ewbXe|~n"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            r3.put(r5, r8)
            goto L_0x0523
        L_0x0426:
            org.json.JSONObject r5 = r21.m11931p()
            if (r5 == 0) goto L_0x0523
            goto L_0x045c
        L_0x042d:
            com.bytedance.sdk.openadsdk.g.a r5 = r0.f9412v
            if (r5 == 0) goto L_0x0523
            int r5 = r5.mo19054b()
            com.bytedance.sdk.openadsdk.g.a r6 = r0.f9412v
            int r6 = r6.mo19053a()
            java.lang.String r7 = "whfwl"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            r3.put(r7, r5)
            java.lang.String r5 = "hdkdlq"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
        L_0x044a:
            r3.put(r5, r6)
            goto L_0x0523
        L_0x044f:
            java.lang.String r5 = "vhgtWqgs}z"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            boolean r6 = r0.f9386G
            goto L_0x044a
        L_0x0458:
            org.json.JSONObject r5 = r0.f9415y
            if (r5 == 0) goto L_0x0523
        L_0x045c:
            r3 = r5
            goto L_0x0523
        L_0x045f:
            org.json.JSONObject r3 = r0.f9410t
            if (r3 == 0) goto L_0x0485
            java.lang.String r5 = "sdvwmka"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            org.json.JSONObject r6 = r21.m11940v()
            r3.put(r5, r6)
            com.bytedance.sdk.openadsdk.core.e.n r3 = r0.f9407q
            if (r3 == 0) goto L_0x0485
            org.json.JSONObject r3 = r0.f9410t
            java.lang.String r5 = "eyvfjvohf"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f9407q
            org.json.JSONObject r6 = r6.mo19558aB()
            r3.put(r5, r6)
        L_0x0485:
            org.json.JSONObject r3 = r0.f9410t
            goto L_0x0523
        L_0x0489:
            r0.m11916f((org.json.JSONObject) r3)
            goto L_0x0523
        L_0x048e:
            org.json.JSONObject r5 = r1.f9435d
            if (r5 == 0) goto L_0x0523
            java.lang.String r6 = "eyvIwjh"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)
            org.json.JSONObject r6 = r5.getJSONObject(r6)
            if (r6 == 0) goto L_0x0523
            java.lang.String r7 = "c`vfcjt~"
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            boolean r8 = r6.has(r8)
            if (r8 == 0) goto L_0x0523
            java.lang.String r8 = "t`e"
            java.lang.String r9 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)
            boolean r9 = r6.has(r9)
            if (r9 == 0) goto L_0x0523
            java.lang.String r9 = "l``fh"
            java.lang.String r10 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r9)
            boolean r10 = r6.has(r10)
            if (r10 == 0) goto L_0x0523
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            java.lang.String r13 = r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)
            r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r9)
            java.lang.String r15 = r6.getString(r7)
            java.lang.String r7 = "v`nva"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            long r16 = r5.getLong(r7)
            java.lang.String r7 = "eyvUeisb"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r7)
            long r18 = r5.getLong(r7)
            java.lang.String r5 = "u`]skiodq"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)     // Catch:{ Exception -> 0x04fc }
            int r7 = r0.f9405o     // Catch:{ Exception -> 0x04fc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04fc }
            r6.putOpt(r5, r7)     // Catch:{ Exception -> 0x04fc }
        L_0x04fc:
            java.lang.String r5 = "cmk`o"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x050c
            org.json.JSONObject r6 = r0.m11935r(r6)
        L_0x050c:
            r20 = r6
            int r5 = r0.f9403m
            java.lang.String r14 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12752a((int) r5)
            com.bytedance.sdk.openadsdk.core.e.n r12 = r0.f9407q
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8908a(r12, r13, r14, r15, r16, r18, r20)
            goto L_0x0523
        L_0x051a:
            r0.m11915e((org.json.JSONObject) r3)
            goto L_0x0523
        L_0x051e:
            int r5 = r1.f9436e
            r0.m11907a((org.json.JSONObject) r3, (int) r5)
        L_0x0523:
            if (r2 != r11) goto L_0x0566
            java.lang.String r5 = r1.f9433b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0566
            java.lang.String r1 = r1.f9433b
            r0.m11912b((java.lang.String) r1, (org.json.JSONObject) r3)
            com.bytedance.sdk.openadsdk.core.h r1 = com.bytedance.sdk.openadsdk.core.C3457h.m10580d()
            boolean r1 = r1.mo19779s()
            if (r1 == 0) goto L_0x0566
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[KQA)WUWU)|n~~g`~+"
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r5)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " ecwe8"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r2)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r1, r2)
        L_0x0566:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.mo20349a(com.bytedance.sdk.openadsdk.core.w$a, int):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof C3676a)) {
            try {
                mo20349a((C3676a) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo16750a(String str) {
    }

    /* renamed from: a */
    public void mo20350a(String str, JSONObject jSONObject) {
        m11914c(str, jSONObject);
    }

    @JProtect
    /* renamed from: a */
    public void mo20351a(JSONObject jSONObject, final C3743c cVar) {
        if (cVar != null) {
            try {
                if (this.f9407q != null) {
                    if (!TextUtils.isEmpty(this.f9402l)) {
                        int e = C3898x.m12790e(this.f9407q);
                        AdSlot x = this.f9407q.mo19664x();
                        C3433o oVar = new C3433o();
                        if (this.f9407q.mo19514G() != null) {
                            oVar.f8445f = 2;
                        }
                        JSONObject ak = this.f9407q.mo19577ak();
                        if (ak == null) {
                            ak = new JSONObject();
                        }
                        if (jSONObject != null) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                ak.put(next, jSONObject.opt(next));
                            }
                        }
                        oVar.f8447h = ak;
                        C3513m.m10971f().mo19983a(x, oVar, e, new C3516n.C3517a() {
                            /* renamed from: a */
                            public void mo18456a(int i, String str) {
                                cVar.mo20385a(false, (List<C3431n>) null);
                            }

                            /* renamed from: a */
                            public void mo18457a(C3402a aVar, C3403b bVar) {
                                if (aVar.mo19386b() == null || aVar.mo19386b().isEmpty()) {
                                    cVar.mo20385a(false, (List<C3431n>) null);
                                    bVar.mo19391a(-3);
                                    C3403b.m10134a(bVar);
                                    return;
                                }
                                cVar.mo20385a(true, aVar.mo19386b());
                            }
                        });
                        return;
                    }
                }
                cVar.mo20385a(false, (List<C3431n>) null);
            } catch (Exception e2) {
                C2905l.m8115c(C2856c.c1659536876586dc("TUCm`winlFhainz"), C2856c.c1659536876586dc("gdv#eau'm{xd~"), e2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo20352a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!C2815g.g1659536876620dc("bxvf`dhdm").equals(uri.getScheme())) {
                return false;
            }
            return f9379g.containsKey(uri.getHost());
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m11915e(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m11907a(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C3666w mo20353b(int i) {
        this.f9403m = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        switch(r1) {
            case 91: goto L_0x001b;
            case 92: goto L_0x0000;
            case 93: goto L_0x001b;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = '[';
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.C3666w mo20354b(com.bytedance.sdk.component.widget.SSWebView r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = r0
        L_0x0003:
            switch(r0) {
                case 92: goto L_0x000b;
                case 93: goto L_0x0017;
                case 94: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0000
        L_0x0007:
            r0 = 4
            if (r1 > r0) goto L_0x000f
            goto L_0x0000
        L_0x000b:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x000f;
                case 23: goto L_0x001b;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0017
        L_0x000f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f9395d = r0
            return r2
        L_0x0017:
            switch(r1) {
                case 91: goto L_0x001b;
                case 92: goto L_0x0000;
                case 93: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0020
        L_0x001b:
            r0 = 94
            r1 = 75
            goto L_0x0003
        L_0x0020:
            r1 = 91
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.mo20354b(com.bytedance.sdk.component.widget.SSWebView):com.bytedance.sdk.openadsdk.core.w");
    }

    /* renamed from: b */
    public C3666w mo20355b(JSONObject jSONObject) {
        this.f9415y = jSONObject;
        return this;
    }

    /* renamed from: b */
    public C3666w mo20356b(boolean z) {
        this.f9386G = z;
        return this;
    }

    /* renamed from: b */
    public void mo20357b() {
        C2512r rVar = this.f9388I;
        if (rVar != null) {
            rVar.mo16528a();
            this.f9388I = null;
        }
    }

    /* renamed from: b */
    public void mo20358b(Uri uri) {
        long j;
        String str;
        JSONObject jSONObject;
        try {
            String host = uri.getHost();
            if (!C2815g.g1659536876620dc("lne\\asci|").equals(host) && !C2863b.b1659536876590dc("ctqwkhYb~ld").equals(host)) {
                if (!C2863b.b1659536876590dc("lne\\asci|V|8").equals(host)) {
                    if (!C2863b.b1659536876590dc("pskueqc").equals(host)) {
                        if (!C2863b.b1659536876590dc("dhqseqeoWdoxlij").equals(host)) {
                            C2905l.m8117d(C2863b.b1659536876590dc("TUCm`winlFhainz"), C2863b.b1659536876590dc("h`lghwSnz3*ecy.bqeq{4fu}t{;trmk"));
                            return;
                        }
                    }
                    m11923j(uri.toString());
                    return;
                }
            }
            String queryParameter = uri.getQueryParameter(C2815g.g1659536876620dc("c`vfcjt~"));
            String queryParameter2 = uri.getQueryParameter(C2815g.g1659536876620dc("t`e"));
            this.f9389J = queryParameter2;
            String queryParameter3 = uri.getQueryParameter(C2815g.g1659536876620dc("l``fh"));
            if (m11920h(queryParameter3)) {
                long j2 = 0;
                try {
                    j = Long.parseLong(uri.getQueryParameter(C2815g.g1659536876620dc("v`nva")));
                } catch (Exception unused) {
                    j = 0;
                }
                try {
                    j2 = Long.parseLong(uri.getQueryParameter(C2815g.g1659536876620dc("eyv\\rdjrm")));
                } catch (Exception unused2) {
                }
                long j3 = j2;
                JSONObject jSONObject2 = null;
                String queryParameter4 = uri.getQueryParameter(C2815g.g1659536876620dc("eyvqe"));
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter4);
                        try {
                            jSONObject3.putOpt(C2863b.b1659536876590dc("u`]skiodq"), Integer.valueOf(this.f9405o));
                        } catch (Exception unused3) {
                        }
                        jSONObject2 = jSONObject3;
                    } catch (Exception unused4) {
                    }
                }
                if (C2815g.g1659536876620dc("cmk`o").equals(queryParameter3)) {
                    jSONObject2 = m11935r(jSONObject2);
                }
                if (!C2815g.g1659536876620dc("l`lgmkaXxlxmSh|}c").equals(queryParameter3)) {
                    if (!C2863b.b1659536876590dc("l`lgmkaXxlxmS~zndb").equals(queryParameter3)) {
                        str = m11921i(queryParameter2);
                        jSONObject = jSONObject2;
                        C3090e.m8908a(this.f9407q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                    }
                }
                try {
                    jSONObject = new JSONObject();
                    for (String next : uri.getQueryParameterNames()) {
                        try {
                            if (C2815g.g1659536876620dc("eyvqe").equals(next)) {
                                jSONObject.put(C2863b.b1659536876590dc("ae]f|qtfWmkm"), new JSONObject(uri.getQueryParameter(next)).optString(C2863b.b1659536876590dc("ae]f|qtfWmkm")));
                            } else {
                                jSONObject.put(next, uri.getQueryParameter(next));
                            }
                        } catch (Exception unused5) {
                        }
                    }
                    str = this.f9397f;
                    C3090e.m8908a(this.f9407q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                } catch (Exception unused6) {
                }
            }
        } catch (Exception e) {
            C2905l.m8112b(C2863b.b1659536876590dc("TUCm`winlFhainz"), C2863b.b1659536876590dc("h`lgh`Sua)osoh~{y~|)4"), e);
        }
    }

    /* renamed from: b */
    public void mo16753b(String str) {
    }

    /* renamed from: c */
    public C3431n mo20359c() {
        return this.f9407q;
    }

    /* renamed from: c */
    public C3666w mo20360c(String str) {
        this.f9397f = str;
        return this;
    }

    /* renamed from: c */
    public C3666w mo20361c(boolean z) {
        this.f9382C = z;
        return this;
    }

    /* renamed from: c */
    public void mo20362c(int i) {
        C3552j jVar = this.f9409s;
        if (jVar != null) {
            jVar.mo18409b(i);
        }
    }

    /* renamed from: c */
    public void mo20363c(JSONObject jSONObject) {
        WeakReference<Context> weakReference;
        int optInt = jSONObject.optInt(C2722f.f1659536876631dc("l`lgmkaT|pfn"));
        String optString = jSONObject.optString(C2722f.f1659536876631dc("usn"));
        String optString2 = jSONObject.optString(C2722f.f1659536876631dc("f`nofdelW|xg"));
        if (!TextUtils.isEmpty(optString)) {
            if (optInt == 0) {
                if (m11929o() != null) {
                    m11929o().loadUrl(optString);
                }
            } else if (optInt == 1) {
                WeakReference<Context> weakReference2 = this.f9398h;
                if (weakReference2 != null && (weakReference2.get() instanceof Activity)) {
                    C3883l.m12669a((Activity) this.f9398h.get(), optString);
                }
            } else if (optInt == 2 && (weakReference = this.f9398h) != null && (weakReference.get() instanceof Activity) && !C3883l.m12671b((Activity) this.f9398h.get(), optString)) {
                C3883l.m12669a((Activity) this.f9398h.get(), optString2);
            }
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m11924j(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3666w.this.m11924j(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo20365d(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3666w.this.mo20365d(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public C3666w mo20364d(String str) {
        this.f9400j = str;
        return this;
    }

    /* renamed from: d */
    public void mo20365d(JSONObject jSONObject) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String str;
        double d7;
        double d8;
        JSONObject jSONObject2;
        double d9;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
            C2905l.m8111b(C2722f.f1659536876631dc("TUCm`winlFhainz"), C2722f.f1659536876631dc("TUCm`winlFhainz/xp|wxpU{qzq^jxpk"));
            try {
                String optString = jSONObject3.optString(C2722f.f1659536876631dc("aeKg"));
                int optInt = jSONObject3.optInt(C2722f.f1659536876631dc("asgbP|vb"), 1);
                String optString2 = jSONObject3.optString(C2722f.f1659536876631dc("cmk`oDtbi]s{i"));
                JSONObject optJSONObject = jSONObject3.optJSONObject(C2722f.f1659536876631dc("cmk`oLhag"));
                double d10 = 0.0d;
                if (optJSONObject != null) {
                    double optDouble = optJSONObject.optDouble(C3924h.h1659536876613dc("dnum[}"), 0.0d);
                    d7 = optJSONObject.optDouble(C3924h.h1659536876613dc("dnum[|"), 0.0d);
                    double optDouble2 = optJSONObject.optDouble(C3924h.h1659536876613dc("uq]{"), 0.0d);
                    double optDouble3 = optJSONObject.optDouble(C3924h.h1659536876613dc("uq]z"), 0.0d);
                    double optDouble4 = optJSONObject.optDouble(C3924h.h1659536876613dc("dnum[qojm"), 0.0d);
                    double optDouble5 = optJSONObject.optDouble(C3924h.h1659536876613dc("uq]wmhc"), 0.0d);
                    double optDouble6 = optJSONObject.optDouble(C3924h.h1659536876613dc("btvwkkY"), 0.0d);
                    double optDouble7 = optJSONObject.optDouble(C3924h.h1659536876613dc("btvwkkY~"), 0.0d);
                    double optDouble8 = optJSONObject.optDouble(C3924h.h1659536876613dc("btvwkkYpam~c"), 0.0d);
                    double optDouble9 = optJSONObject.optDouble(C3924h.h1659536876613dc("btvwkkYom`mcx"), 0.0d);
                    jSONObject2 = optJSONObject.optJSONObject(C3924h.h1659536876613dc("rdawMk`h"));
                    d = optDouble9;
                    d10 = optDouble;
                    d8 = optDouble2;
                    d6 = optDouble4;
                    d5 = optDouble5;
                    d4 = optDouble6;
                    d3 = optDouble7;
                    d2 = optDouble8;
                    str = optString;
                    d9 = optDouble3;
                } else {
                    str = optString;
                    d9 = 0.0d;
                    d8 = 0.0d;
                    d7 = 0.0d;
                    d6 = 0.0d;
                    d5 = 0.0d;
                    d4 = 0.0d;
                    d3 = 0.0d;
                    d2 = 0.0d;
                    d = 0.0d;
                    jSONObject2 = null;
                }
                C3414j a = new C3414j.C3416a().mo19464d((float) d10).mo19462c((float) d7).mo19459b((float) d8).mo19451a((float) d9).mo19461b((long) d6).mo19453a((long) d5).mo19463c((int) d4).mo19465d((int) d3).mo19466e((int) d2).mo19467f((int) d).mo19455a(optString2).mo19454a((SparseArray<C3362c.C3363a>) null).mo19457a(true).mo19460b(optInt).mo19456a(jSONObject2).mo19452a(jSONObject3.optInt(C2722f.f1659536876631dc("cmk`oDtbiJkija}i"), -1)).mo19458a();
                if (this.f9408r != null) {
                    this.f9408r.mo16669a((View) null, optInt, a);
                }
                m11908a(str, optInt, a);
                while (true) {
                    boolean z = true;
                    while (true) {
                        if (z) {
                            return;
                        }
                        if (z || !z) {
                            z = true;
                        }
                    }
                }
            } catch (Exception unused) {
                C2561j jVar = this.f9408r;
                if (jVar != null) {
                    jVar.mo16669a((View) null, -1, (C2548b) null);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo20366d(boolean z) {
        this.f9394c = z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:5:0x000e->B:12:0x0023, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x000a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0012 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0015 A[SYNTHETIC] */
    /* renamed from: d */
    public boolean mo20367d() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f9407q
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.mo19645o()
            goto L_0x0019
        L_0x0009:
            r0 = 0
        L_0x000a:
            r1 = 74
            r2 = 55
        L_0x000e:
            switch(r1) {
                case 72: goto L_0x000a;
                case 73: goto L_0x0012;
                case 74: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0023
        L_0x0012:
            switch(r2) {
                case 94: goto L_0x001e;
                case 95: goto L_0x000a;
                case 96: goto L_0x000a;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r2) {
                case 55: goto L_0x001d;
                case 56: goto L_0x0019;
                case 57: goto L_0x000a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x001e
        L_0x0019:
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x001e
        L_0x001d:
            return r0
        L_0x001e:
            r1 = 73
            r2 = 96
            goto L_0x000e
        L_0x0023:
            r1 = 72
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.mo20367d():boolean");
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            m11928n(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public C3666w mo20368e(String str) {
        this.f9402l = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo20369e() {
        boolean z = this.f9394c;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return z;
    }

    /* renamed from: f */
    public C3666w mo20370f(String str) {
        this.f9404n = str;
        return this;
    }

    /* renamed from: f */
    public void mo20371f() {
        WeakReference<Context> weakReference = this.f9398h;
        if (weakReference != null && (weakReference.get() instanceof Activity) && C3883l.m12670a((Activity) this.f9398h.get())) {
            ((Activity) this.f9398h.get()).finish();
        }
    }

    /* renamed from: g */
    public void mo20372g() {
        C3552j jVar = this.f9409s;
        if (jVar != null) {
            jVar.mo18408b();
            char c = '\\';
            while (true) {
                char c2 = 14;
                while (true) {
                    switch (c2) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c) {
                                case '_':
                                    return;
                            }
                    }
                    c2 = 15;
                    c = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        m11925k(jSONObject);
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        m11906a(C2815g.g1659536876620dc("gdvWahvki}oBbka"), true);
        try {
            if (this.f9410t != null) {
                this.f9410t.put(C2815g.g1659536876620dc("sdvwmka"), m11940v());
                if (this.f9407q != null) {
                    this.f9410t.put(C2815g.g1659536876620dc("eyvfjvohf"), this.f9407q.mo19558aB());
                }
            }
            m11906a(C2815g.g1659536876620dc("gdvWahvki}oBbka"), false);
            return this.f9410t.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @JProtect
    /* renamed from: h */
    public void mo20373h() {
        mo20351a((JSONObject) null, (C3743c) new C3743c() {
            /* renamed from: a */
            public void mo20385a(boolean z, List<C3431n> list) {
                List unused = C3666w.this.f9383D = list;
                C3666w.this.m11941w();
                C3666w.this.mo20374i();
            }
        });
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        while (true) {
                            switch (c2) {
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                                default:
                                    c2 = '[';
                            }
                        }
                    case '^':
                        if (c2 <= 4) {
                            continue;
                        } else {
                            return;
                        }
                }
                c = '^';
                c2 = 'K';
            }
        }
    }

    /* renamed from: i */
    public void mo20374i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3513m.m1659536876602dc("m`vfvlgk"), m11910b(this.f9383D));
            mo20350a(C3513m.m1659536876602dc("m`vfvlgkEl~j"), jSONObject);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void initRenderFinish() {
        C2905l.m8111b(C2722f.f1659536876631dc("TUCm`winlFhainz"), C2722f.f1659536876631dc("iokwV`hcm{Lbbd}g"));
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (C3666w.this.f9391L != null) {
                    C3666w.this.f9391L.mo20446a();
                }
            }
        });
    }

    /* renamed from: j */
    public boolean mo20375j() {
        boolean z = this.f9390K;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != 1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        switch(r3) {
            case 55: goto L_0x001d;
            case 56: goto L_0x000a;
            case 57: goto L_0x001d;
            default: goto L_0x001c;
        };
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20376k() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r5.f9407q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x001d
        L_0x0006:
            int r0 = r0.mo19516I()
        L_0x000a:
            r2 = 94
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 95
        L_0x0010:
            switch(r2) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0014;
                case 96: goto L_0x0019;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000a
        L_0x0014:
            switch(r3) {
                case 94: goto L_0x0027;
                case 95: goto L_0x0018;
                case 96: goto L_0x0027;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            switch(r3) {
                case 55: goto L_0x001d;
                case 56: goto L_0x000a;
                case 57: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0023
        L_0x001d:
            return r1
        L_0x001e:
            r2 = 39
            if (r3 != r2) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            r2 = 1
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x0027:
            r2 = r4
            r3 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3666w.mo20376k():boolean");
    }

    /* renamed from: l */
    public void mo20377l() {
        C3729c cVar = this.f9399i;
        if (cVar != null) {
            cVar.mo20515a();
        }
        if (m11942x()) {
            mo20373h();
        }
    }

    /* renamed from: m */
    public void mo20378m() {
        C3729c cVar = this.f9399i;
        if (cVar != null) {
            cVar.mo20519b();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m11922i(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3666w.this.m11922i(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
            C2905l.m8118e(C2857d.d1659536876571dc("TUCm`winlFhainz"), "");
        }
    }

    /* renamed from: n */
    public void mo20379n() {
        C3729c cVar = this.f9399i;
        if (cVar != null) {
            cVar.mo20521c();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            m11926l(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m11938t();
            } else {
                this.f9396e.post(new Runnable() {
                    public void run() {
                        C3666w.this.m11938t();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
