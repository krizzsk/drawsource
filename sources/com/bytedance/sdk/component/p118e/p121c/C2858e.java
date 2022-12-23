package com.bytedance.sdk.component.p118e.p121c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.c.e */
/* compiled from: TNCManager */
public class C2858e {

    /* renamed from: a */
    Handler f6421a = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 10000) {
                C2858e.this.m7965b(message.arg1 != 0);
            }
        }
    };

    /* renamed from: b */
    private long f6422b = 0;

    /* renamed from: c */
    private C2851a f6423c;

    /* renamed from: d */
    private boolean f6424d;

    /* renamed from: e */
    private C2855b f6425e;

    /* renamed from: f */
    private boolean f6426f = false;

    /* renamed from: g */
    private Context f6427g;

    /* renamed from: h */
    private C2857d f6428h;

    /* renamed from: i */
    private int f6429i = 0;

    /* renamed from: j */
    private long f6430j = 19700101000L;

    /* renamed from: k */
    private int f6431k = 0;

    /* renamed from: l */
    private HashMap<String, Integer> f6432l = new HashMap<>();

    /* renamed from: m */
    private HashMap<String, Integer> f6433m = new HashMap<>();

    /* renamed from: n */
    private int f6434n = 0;

    /* renamed from: o */
    private HashMap<String, Integer> f6435o = new HashMap<>();

    /* renamed from: p */
    private HashMap<String, Integer> f6436p = new HashMap<>();

    /* renamed from: q */
    private boolean f6437q = true;

    /* renamed from: r */
    private Map<String, Integer> f6438r = new HashMap();

    /* renamed from: s */
    private int f6439s;

    /* renamed from: a */
    private boolean m7963a(int i) {
        return i >= 200 && i < 400;
    }

    private C2858e() {
    }

    public C2858e(int i) {
        this.f6439s = i;
    }

    /* renamed from: a */
    public String mo17749a() {
        return "ttnet_tnc_config" + this.f6439s;
    }

    /* renamed from: b */
    public C2851a mo17756b() {
        return this.f6423c;
    }

    /* renamed from: a */
    public void mo17755a(boolean z) {
        this.f6424d = z;
    }

    /* renamed from: a */
    public void mo17754a(C2855b bVar) {
        this.f6425e = bVar;
    }

    /* renamed from: c */
    public boolean mo17757c() {
        return this.f6424d;
    }

    /* renamed from: d */
    public C2855b mo17758d() {
        return this.f6425e;
    }

    /* renamed from: e */
    public void mo17759e() {
        this.f6438r.clear();
    }

    /* renamed from: a */
    public synchronized void mo17751a(Context context, boolean z) {
        if (!this.f6426f) {
            this.f6427g = context;
            this.f6437q = z;
            this.f6428h = new C2857d(context, z, this.f6439s);
            if (z) {
                m7969i();
            }
            C2863b.m7994b("TNCManager", "initTnc, isMainProc: " + z + " probeCmd: " + this.f6429i + " probeVersion: " + this.f6430j);
            this.f6423c = C2861g.m7987a().mo17765a(this.f6439s, this.f6427g);
            this.f6426f = true;
        }
    }

    /* renamed from: i */
    private void m7969i() {
        SharedPreferences sharedPreferences = this.f6427g.getSharedPreferences(mo17749a(), 0);
        this.f6429i = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f6430j = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    /* renamed from: f */
    public C2856c mo17760f() {
        C2857d dVar = this.f6428h;
        if (dVar != null) {
            return dVar.mo17748c();
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, String> mo17761g() {
        C2856c f = mo17760f();
        if (f != null) {
            return f.f6404d;
        }
        return null;
    }

    /* renamed from: h */
    public C2857d mo17762h() {
        return this.f6428h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17750a(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = "/get_domains/v4"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = "/ies/speed"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x00f8
        L_0x0020:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0031 }
            r1.<init>(r7)     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r1.getProtocol()     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r1.getHost()     // Catch:{ all -> 0x002f }
            goto L_0x0036
        L_0x002f:
            r1 = move-exception
            goto L_0x0033
        L_0x0031:
            r1 = move-exception
            r2 = r0
        L_0x0033:
            r1.printStackTrace()
        L_0x0036:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00f8
        L_0x004c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0054
            goto L_0x00f8
        L_0x0054:
            boolean r1 = r6.m7968d(r0)
            java.lang.String r3 = "TNCManager"
            if (r1 == 0) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, TNC host faild num over limit: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r3, r0)
            return r7
        L_0x0071:
            java.util.Map r1 = r6.mo17761g()
            if (r1 == 0) goto L_0x00e4
            boolean r4 = r1.containsKey(r0)
            if (r4 != 0) goto L_0x007e
            goto L_0x00e4
        L_0x007e:
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x008b
            return r7
        L_0x008b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleHostMapping, match, origin: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "://"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto L_0x00cf
            java.lang.String r7 = r7.replaceFirst(r0, r1)
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleHostMapping, target: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r3, r0)
            return r7
        L_0x00e4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleHostMapping, nomatch: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r3, r0)
        L_0x00f8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2858e.mo17750a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17752a(com.bytedance.sdk.component.p102b.p103a.C2746k r8, com.bytedance.sdk.component.p102b.p103a.C2750m r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x0199
            if (r9 != 0) goto L_0x0007
            goto L_0x0199
        L_0x0007:
            boolean r0 = r7.f6437q     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            android.content.Context r0 = r7.f6427g     // Catch:{ all -> 0x0196 }
            boolean r0 = com.bytedance.sdk.component.p118e.p122d.C2870e.m8005a(r0)     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r0 = 0
            com.bytedance.sdk.component.b.a.f r1 = r8.mo17505b()     // Catch:{ Exception -> 0x0020 }
            java.net.URL r0 = r1.mo17478a()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return
        L_0x0024:
            java.lang.String r1 = r0.getProtocol()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = r0.getHost()     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = r7.m7959a((com.bytedance.sdk.component.p102b.p103a.C2746k) r8)     // Catch:{ all -> 0x0196 }
            int r3 = r9.mo17419c()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0196 }
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0196 }
            if (r4 != 0) goto L_0x004a
            monitor-exit(r7)
            return
        L_0x004a:
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0196 }
            if (r4 == 0) goto L_0x0052
            monitor-exit(r7)
            return
        L_0x0052:
            java.lang.String r4 = "TNCManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r5.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "onResponse, url: "
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "://"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r8)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0196 }
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r4, r5)     // Catch:{ all -> 0x0196 }
            com.bytedance.sdk.component.e.c.c r4 = r7.mo17760f()     // Catch:{ all -> 0x0196 }
            if (r4 == 0) goto L_0x008d
            boolean r5 = r4.f6402b     // Catch:{ all -> 0x0196 }
            if (r5 == 0) goto L_0x008d
            r7.m7960a((com.bytedance.sdk.component.p102b.p103a.C2750m) r9, (java.lang.String) r2)     // Catch:{ all -> 0x0196 }
        L_0x008d:
            if (r4 != 0) goto L_0x0091
            monitor-exit(r7)
            return
        L_0x0091:
            java.lang.String r9 = "TNCManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r5.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "onResponse, url matched: "
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "://"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r8)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            r5.append(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            int r6 = r7.f6431k     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6432l     // Catch:{ all -> 0x0196 }
            int r6 = r6.size()     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6433m     // Catch:{ all -> 0x0196 }
            int r6 = r6.size()     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            int r6 = r7.f6434n     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6435o     // Catch:{ all -> 0x0196 }
            int r6 = r6.size()     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r7.f6436p     // Catch:{ all -> 0x0196 }
            int r6 = r6.size()     // Catch:{ all -> 0x0196 }
            r5.append(r6)     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0196 }
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r9, r5)     // Catch:{ all -> 0x0196 }
            if (r3 <= 0) goto L_0x0194
            boolean r9 = r7.m7963a((int) r3)     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x0122
            int r8 = r7.f6431k     // Catch:{ all -> 0x0196 }
            if (r8 > 0) goto L_0x011b
            int r8 = r7.f6434n     // Catch:{ all -> 0x0196 }
            if (r8 <= 0) goto L_0x011e
        L_0x011b:
            r7.m7970j()     // Catch:{ all -> 0x0196 }
        L_0x011e:
            r7.m7967c(r2)     // Catch:{ all -> 0x0196 }
            goto L_0x0194
        L_0x0122:
            boolean r9 = r7.m7966b((int) r3)     // Catch:{ all -> 0x0196 }
            if (r9 != 0) goto L_0x0194
            int r9 = r7.f6434n     // Catch:{ all -> 0x0196 }
            int r9 = r9 + 1
            r7.f6434n = r9     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6435o     // Catch:{ all -> 0x0196 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0196 }
            r9.put(r0, r6)     // Catch:{ all -> 0x0196 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6436p     // Catch:{ all -> 0x0196 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0196 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0196 }
            int r9 = r7.f6434n     // Catch:{ all -> 0x0196 }
            int r0 = r4.f6408h     // Catch:{ all -> 0x0196 }
            if (r9 < r0) goto L_0x0191
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6435o     // Catch:{ all -> 0x0196 }
            int r9 = r9.size()     // Catch:{ all -> 0x0196 }
            int r0 = r4.f6409i     // Catch:{ all -> 0x0196 }
            if (r9 < r0) goto L_0x0191
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f6436p     // Catch:{ all -> 0x0196 }
            int r9 = r9.size()     // Catch:{ all -> 0x0196 }
            int r0 = r4.f6410j     // Catch:{ all -> 0x0196 }
            if (r9 < r0) goto L_0x0191
            java.lang.String r9 = "TNCManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r0.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "onResponse, url doUpdate: "
            r0.append(r4)     // Catch:{ all -> 0x0196 }
            r0.append(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = "://"
            r0.append(r1)     // Catch:{ all -> 0x0196 }
            r0.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = "#"
            r0.append(r1)     // Catch:{ all -> 0x0196 }
            r0.append(r8)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = "#"
            r0.append(r8)     // Catch:{ all -> 0x0196 }
            r0.append(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0196 }
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r9, r8)     // Catch:{ all -> 0x0196 }
            r8 = 0
            r7.m7962a((boolean) r5, (long) r8)     // Catch:{ all -> 0x0196 }
            r7.m7970j()     // Catch:{ all -> 0x0196 }
        L_0x0191:
            r7.m7964b((java.lang.String) r2)     // Catch:{ all -> 0x0196 }
        L_0x0194:
            monitor-exit(r7)
            return
        L_0x0196:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0199:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2858e.mo17752a(com.bytedance.sdk.component.b.a.k, com.bytedance.sdk.component.b.a.m):void");
    }

    /* renamed from: a */
    private String m7959a(C2746k kVar) {
        if (kVar == null || kVar.mo17505b() == null || kVar.mo17505b().mo17478a() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(kVar.mo17505b().mo17478a().getHost()).getHostAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private void m7964b(String str) {
        Map<String, String> g;
        if (TextUtils.isEmpty(str) || (g = mo17761g()) == null || !g.containsValue(str)) {
            return;
        }
        if (this.f6438r.get(str) == null) {
            this.f6438r.put(str, 1);
            return;
        }
        this.f6438r.put(str, Integer.valueOf(this.f6438r.get(str).intValue() + 1));
    }

    /* renamed from: c */
    private void m7967c(String str) {
        if (!TextUtils.isEmpty(str) && this.f6438r.containsKey(str)) {
            this.f6438r.put(str, 0);
        }
    }

    /* renamed from: d */
    private boolean m7968d(String str) {
        Map<String, String> g = mo17761g();
        if (g == null) {
            return false;
        }
        String str2 = g.get(str);
        if (TextUtils.isEmpty(str2) || this.f6438r.get(str2) == null || this.f6438r.get(str2).intValue() < 3) {
            return false;
        }
        C2863b.m7994b("TNCManager", "handleHostMapping, TNC host faild num over limit: " + str);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17753a(com.bytedance.sdk.component.p102b.p103a.C2746k r7, java.lang.Exception r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto L_0x012f
            com.bytedance.sdk.component.b.a.f r0 = r7.mo17505b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x012f
            if (r8 != 0) goto L_0x000d
            goto L_0x012f
        L_0x000d:
            boolean r8 = r6.f6437q     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x0013
            monitor-exit(r6)
            return
        L_0x0013:
            android.content.Context r8 = r6.f6427g     // Catch:{ all -> 0x012c }
            boolean r8 = com.bytedance.sdk.component.p118e.p122d.C2870e.m8005a(r8)     // Catch:{ all -> 0x012c }
            if (r8 != 0) goto L_0x001d
            monitor-exit(r6)
            return
        L_0x001d:
            r8 = 0
            com.bytedance.sdk.component.b.a.f r0 = r7.mo17505b()     // Catch:{ Exception -> 0x0026 }
            java.net.URL r8 = r0.mo17478a()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r6)
            return
        L_0x002a:
            java.lang.String r0 = r8.getProtocol()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r8.getHost()     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r6.m7959a((com.bytedance.sdk.component.p102b.p103a.C2746k) r7)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = "https"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x004c
            monitor-exit(r6)
            return
        L_0x004c:
            com.bytedance.sdk.component.e.c.c r2 = r6.mo17760f()     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0054
            monitor-exit(r6)
            return
        L_0x0054:
            java.lang.String r3 = "TNCManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r4.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "onError, url matched: "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "://"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            r4.append(r7)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "# "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            int r5 = r6.f6431k     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6432l     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6433m     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x012c }
            int r5 = r6.f6434n     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6435o     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.f6436p     // Catch:{ all -> 0x012c }
            int r5 = r5.size()     // Catch:{ all -> 0x012c }
            r4.append(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x012c }
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r3, r4)     // Catch:{ all -> 0x012c }
            int r3 = r6.f6431k     // Catch:{ all -> 0x012c }
            int r3 = r3 + 1
            r6.f6431k = r3     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.f6432l     // Catch:{ all -> 0x012c }
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x012c }
            r3.put(r8, r5)     // Catch:{ all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6433m     // Catch:{ all -> 0x012c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x012c }
            r8.put(r7, r3)     // Catch:{ all -> 0x012c }
            int r8 = r6.f6431k     // Catch:{ all -> 0x012c }
            int r3 = r2.f6405e     // Catch:{ all -> 0x012c }
            if (r8 < r3) goto L_0x0127
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6432l     // Catch:{ all -> 0x012c }
            int r8 = r8.size()     // Catch:{ all -> 0x012c }
            int r3 = r2.f6406f     // Catch:{ all -> 0x012c }
            if (r8 < r3) goto L_0x0127
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r6.f6433m     // Catch:{ all -> 0x012c }
            int r8 = r8.size()     // Catch:{ all -> 0x012c }
            int r2 = r2.f6407g     // Catch:{ all -> 0x012c }
            if (r8 < r2) goto L_0x0127
            java.lang.String r8 = "TNCManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = "onError, url doUpate: "
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "://"
            r2.append(r0)     // Catch:{ all -> 0x012c }
            r2.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "#"
            r2.append(r0)     // Catch:{ all -> 0x012c }
            r2.append(r7)     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x012c }
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r8, r7)     // Catch:{ all -> 0x012c }
            r7 = 0
            r6.m7962a((boolean) r4, (long) r7)     // Catch:{ all -> 0x012c }
            r6.m7970j()     // Catch:{ all -> 0x012c }
        L_0x0127:
            r6.m7964b((java.lang.String) r1)     // Catch:{ all -> 0x012c }
            monitor-exit(r6)
            return
        L_0x012c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x012f:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2858e.mo17753a(com.bytedance.sdk.component.b.a.k, java.lang.Exception):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7960a(com.bytedance.sdk.component.p102b.p103a.C2750m r12, java.lang.String r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r11.f6437q
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 0
            java.lang.String r1 = "tnc-cmd"
            java.lang.String r12 = r12.mo17417a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r1 = "TNCManager"
            if (r0 == 0) goto L_0x002c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "handleTncProbe, no probeProto, "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r1, r12)
            return
        L_0x002c:
            java.lang.String r0 = "@"
            java.lang.String[] r12 = r12.split(r0)
            if (r12 == 0) goto L_0x0105
            int r2 = r12.length
            r3 = 2
            if (r2 == r3) goto L_0x003a
            goto L_0x0105
        L_0x003a:
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = r12[r5]     // Catch:{ all -> 0x004d }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x004d }
            r12 = r12[r2]     // Catch:{ all -> 0x004b }
            long r7 = java.lang.Long.parseLong(r12)     // Catch:{ all -> 0x004b }
            goto L_0x0067
        L_0x004b:
            r12 = move-exception
            goto L_0x004f
        L_0x004d:
            r12 = move-exception
            r6 = r5
        L_0x004f:
            r12.printStackTrace()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r7 = "handleTncProbe, probeProto except, "
            r12.append(r7)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r1, r12)
            r7 = r3
        L_0x0067:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "handleTncProbe, local: "
            r12.append(r9)
            int r9 = r11.f6429i
            r12.append(r9)
            r12.append(r0)
            long r9 = r11.f6430j
            r12.append(r9)
            java.lang.String r9 = " svr: "
            r12.append(r9)
            r12.append(r6)
            r12.append(r0)
            r12.append(r7)
            java.lang.String r0 = " "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r1, r12)
            long r9 = r11.f6430j
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x00a2
            return
        L_0x00a2:
            r11.f6429i = r6
            r11.f6430j = r7
            android.content.Context r12 = r11.f6427g
            java.lang.String r9 = r11.mo17749a()
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r9, r5)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r5 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r12 = r12.putInt(r5, r6)
            java.lang.String r5 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r12 = r12.putLong(r5, r7)
            r12.apply()
            int r12 = r11.f6429i
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r12 != r5) goto L_0x0104
            com.bytedance.sdk.component.e.c.c r12 = r11.mo17760f()
            if (r12 != 0) goto L_0x00d0
            return
        L_0x00d0:
            java.util.Random r5 = new java.util.Random
            long r6 = java.lang.System.currentTimeMillis()
            r5.<init>(r6)
            int r6 = r12.f6412l
            if (r6 <= 0) goto L_0x00e7
            int r12 = r12.f6412l
            int r12 = r5.nextInt(r12)
            long r3 = (long) r12
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
        L_0x00e7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "handleTncProbe, updateConfig delay: "
            r12.append(r5)
            r12.append(r3)
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r1, r12)
            r11.m7962a((boolean) r2, (long) r3)
        L_0x0104:
            return
        L_0x0105:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "handleTncProbe, probeProto err, "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.bytedance.sdk.component.p118e.p122d.C2863b.m7994b(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2858e.m7960a(com.bytedance.sdk.component.b.a.m, java.lang.String):void");
    }

    /* renamed from: a */
    private void m7962a(boolean z, long j) {
        if (!this.f6421a.hasMessages(10000)) {
            Message obtainMessage = this.f6421a.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            if (j > 0) {
                this.f6421a.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f6421a.sendMessage(obtainMessage);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7965b(boolean z) {
        C2856c f = mo17760f();
        if (f != null) {
            C2863b.m7994b("TNCManager", "doUpdateRemote, " + z);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f6422b + (((long) f.f6411k) * 1000) <= elapsedRealtime) {
                this.f6422b = elapsedRealtime;
                C2861g.m7987a().mo17765a(this.f6439s, this.f6427g).mo17728c();
                return;
            }
            C2863b.m7994b("TNCManager", "doUpdateRemote, time limit");
        }
    }

    /* renamed from: j */
    private void m7970j() {
        C2863b.m7994b("TNCManager", "resetTNCControlState");
        this.f6431k = 0;
        this.f6432l.clear();
        this.f6433m.clear();
        this.f6434n = 0;
        this.f6435o.clear();
        this.f6436p.clear();
    }

    /* renamed from: b */
    private boolean m7966b(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        C2856c f = mo17760f();
        if (f == null || TextUtils.isEmpty(f.f6413m)) {
            return false;
        }
        String str = f.f6413m;
        if (str.contains("" + i)) {
            return true;
        }
        return false;
    }
}
