package com.apm.insight.p014b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.C1377g;
import com.apm.insight.runtime.C1403u;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.h */
public class C1198h {

    /* renamed from: b */
    public static boolean f1014b = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static int f1015t = 2;

    /* renamed from: a */
    C1204c f1016a;

    /* renamed from: c */
    private int f1017c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile int f1018d;

    /* renamed from: e */
    private int f1019e;

    /* renamed from: f */
    private int f1020f;

    /* renamed from: g */
    private C1207f f1021g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1203b f1022h;

    /* renamed from: i */
    private long f1023i;

    /* renamed from: j */
    private long f1024j;

    /* renamed from: k */
    private int f1025k;

    /* renamed from: l */
    private long f1026l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f1027m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f1028n;

    /* renamed from: o */
    private C1195e f1029o;

    /* renamed from: p */
    private volatile boolean f1030p;

    /* renamed from: q */
    private boolean f1031q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1403u f1032r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile boolean f1033s;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Runnable f1034u;

    /* renamed from: com.apm.insight.b.h$a */
    private static class C1202a {

        /* renamed from: a */
        long f1043a;

        /* renamed from: b */
        long f1044b;

        /* renamed from: c */
        long f1045c;

        /* renamed from: d */
        boolean f1046d;

        /* renamed from: e */
        int f1047e;

        /* renamed from: f */
        StackTraceElement[] f1048f;

        private C1202a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12427a() {
            this.f1043a = -1;
            this.f1044b = -1;
            this.f1045c = -1;
            this.f1047e = -1;
            this.f1048f = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$b */
    private static class C1203b {

        /* renamed from: a */
        final int f1049a;

        /* renamed from: b */
        C1202a f1050b;

        /* renamed from: c */
        final List<C1202a> f1051c;

        /* renamed from: d */
        private int f1052d = 0;

        public C1203b(int i) {
            this.f1049a = i;
            this.f1051c = new ArrayList(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1202a mo12428a() {
            C1202a aVar = this.f1050b;
            if (aVar == null) {
                return new C1202a();
            }
            this.f1050b = null;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12429a(C1202a aVar) {
            int i;
            int size = this.f1051c.size();
            int i2 = this.f1049a;
            if (size < i2) {
                this.f1051c.add(aVar);
                i = this.f1051c.size();
            } else {
                int i3 = this.f1052d % i2;
                this.f1052d = i3;
                C1202a aVar2 = this.f1051c.set(i3, aVar);
                aVar2.mo12427a();
                this.f1050b = aVar2;
                i = this.f1052d + 1;
            }
            this.f1052d = i;
        }
    }

    /* renamed from: com.apm.insight.b.h$c */
    public interface C1204c {
    }

    /* renamed from: com.apm.insight.b.h$d */
    public static class C1205d {

        /* renamed from: a */
        long f1053a;

        /* renamed from: b */
        long f1054b;

        /* renamed from: c */
        long f1055c;

        /* renamed from: d */
        long f1056d;

        /* renamed from: e */
        long f1057e;
    }

    /* renamed from: com.apm.insight.b.h$e */
    public static class C1206e {

        /* renamed from: a */
        public long f1058a;

        /* renamed from: b */
        long f1059b;

        /* renamed from: c */
        long f1060c;

        /* renamed from: d */
        int f1061d;

        /* renamed from: e */
        int f1062e;

        /* renamed from: f */
        long f1063f;

        /* renamed from: g */
        long f1064g;

        /* renamed from: h */
        String f1065h;

        /* renamed from: i */
        public String f1066i;

        /* renamed from: j */
        String f1067j;

        /* renamed from: k */
        C1205d f1068k;

        /* renamed from: a */
        private void m1389a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f1067j);
            jSONObject.put("sblock_uuid", this.f1067j);
            jSONObject.put("belong_frame", this.f1068k != null);
            C1205d dVar = this.f1068k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f1060c - (dVar.f1053a / 1000000));
                jSONObject.put("doFrameTime", (this.f1068k.f1054b / 1000000) - this.f1060c);
                jSONObject.put("inputHandlingTime", (this.f1068k.f1055c / 1000000) - (this.f1068k.f1054b / 1000000));
                jSONObject.put("animationsTime", (this.f1068k.f1056d / 1000000) - (this.f1068k.f1055c / 1000000));
                jSONObject.put("performTraversalsTime", (this.f1068k.f1057e / 1000000) - (this.f1068k.f1056d / 1000000));
                jSONObject.put("drawTime", this.f1059b - (this.f1068k.f1057e / 1000000));
            }
        }

        /* renamed from: a */
        public JSONObject mo12430a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", C1198h.m1364a(this.f1065h));
                jSONObject.put("cpuDuration", this.f1064g);
                jSONObject.put("duration", this.f1063f);
                jSONObject.put("type", this.f1061d);
                jSONObject.put("count", this.f1062e);
                jSONObject.put("messageCount", this.f1062e);
                jSONObject.put("lastDuration", this.f1059b - this.f1060c);
                jSONObject.put("start", this.f1058a);
                jSONObject.put("end", this.f1059b);
                m1389a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12431b() {
            this.f1061d = -1;
            this.f1062e = -1;
            this.f1063f = -1;
            this.f1065h = null;
            this.f1067j = null;
            this.f1068k = null;
            this.f1066i = null;
        }
    }

    /* renamed from: com.apm.insight.b.h$f */
    private static class C1207f {

        /* renamed from: a */
        int f1069a;

        /* renamed from: b */
        int f1070b;

        /* renamed from: c */
        C1206e f1071c;

        /* renamed from: d */
        List<C1206e> f1072d = new ArrayList();

        C1207f(int i) {
            this.f1069a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1206e mo12432a(int i) {
            C1206e eVar = this.f1071c;
            if (eVar != null) {
                eVar.f1061d = i;
                C1206e eVar2 = this.f1071c;
                this.f1071c = null;
                return eVar2;
            }
            C1206e eVar3 = new C1206e();
            eVar3.f1061d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C1206e> mo12433a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f1072d.size() == this.f1069a) {
                for (int i2 = this.f1070b; i2 < this.f1072d.size(); i2++) {
                    arrayList.add(this.f1072d.get(i2));
                }
                while (i < this.f1070b - 1) {
                    arrayList.add(this.f1072d.get(i));
                    i++;
                }
            } else {
                while (i < this.f1072d.size()) {
                    arrayList.add(this.f1072d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12434a(C1206e eVar) {
            int i;
            int size = this.f1072d.size();
            int i2 = this.f1069a;
            if (size < i2) {
                this.f1072d.add(eVar);
                i = this.f1072d.size();
            } else {
                int i3 = this.f1070b % i2;
                this.f1070b = i3;
                C1206e eVar2 = this.f1072d.set(i3, eVar);
                eVar2.mo12431b();
                this.f1071c = eVar2;
                i = this.f1070b + 1;
            }
            this.f1070b = i;
        }
    }

    public C1198h(int i) {
        this(i, false);
    }

    public C1198h(int i, boolean z) {
        this.f1017c = 0;
        this.f1018d = 0;
        this.f1019e = 100;
        this.f1020f = 200;
        this.f1023i = -1;
        this.f1024j = -1;
        this.f1025k = -1;
        this.f1026l = -1;
        this.f1030p = false;
        this.f1031q = false;
        this.f1033s = false;
        this.f1034u = new Runnable() {

            /* renamed from: b */
            private long f1037b = 0;

            /* renamed from: c */
            private long f1038c;

            /* renamed from: d */
            private int f1039d = -1;

            /* renamed from: e */
            private int f1040e = 0;

            /* renamed from: f */
            private int f1041f = 0;

            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                C1202a a = C1198h.this.f1022h.mo12428a();
                if (this.f1039d == C1198h.this.f1018d) {
                    this.f1040e++;
                } else {
                    this.f1040e = 0;
                    this.f1041f = 0;
                    this.f1038c = uptimeMillis;
                }
                this.f1039d = C1198h.this.f1018d;
                int i = this.f1040e;
                if (i > 0 && i - this.f1041f >= C1198h.f1015t && this.f1037b != 0 && uptimeMillis - this.f1038c > 700 && C1198h.this.f1033s) {
                    a.f1048f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f1041f = this.f1040e;
                }
                a.f1046d = C1198h.this.f1033s;
                a.f1045c = (uptimeMillis - this.f1037b) - 300;
                a.f1043a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f1037b = uptimeMillis2;
                a.f1044b = uptimeMillis2 - uptimeMillis;
                a.f1047e = C1198h.this.f1018d;
                C1198h.this.f1032r.mo12750a(C1198h.this.f1034u, 300);
                C1198h.this.f1022h.mo12429a(a);
            }
        };
        this.f1016a = new C1204c() {
        };
        if (z || f1014b) {
            C1403u uVar = new C1403u("looper_monitor");
            this.f1032r = uVar;
            uVar.mo12751b();
            this.f1022h = new C1203b(300);
            this.f1032r.mo12750a(this.f1034u, 300);
            return;
        }
        this.f1032r = null;
    }

    /* renamed from: a */
    private static long m1361a(int i) {
        if (i < 0) {
            return 0;
        }
        try {
            return C1377g.m2250a(i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m1364a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(CertificateUtil.DELIMITER);
            String str2 = split.length == 2 ? split[1] : "";
            if (!str.contains("{") || !str.contains("}")) {
                String str3 = str;
            } else {
                String str4 = str.split("\\{")[0];
                try {
                    str = str4 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str4;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: a */
    private void m1365a(int i, long j, String str) {
        m1366a(i, j, str, true);
    }

    /* renamed from: a */
    private void m1366a(int i, long j, String str, boolean z) {
        this.f1031q = true;
        C1206e a = this.f1021g.mo12432a(i);
        a.f1063f = j - this.f1023i;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a.f1064g = currentThreadTimeMillis - this.f1026l;
            this.f1026l = currentThreadTimeMillis;
        } else {
            a.f1064g = -1;
        }
        a.f1062e = this.f1017c;
        a.f1065h = str;
        a.f1066i = this.f1027m;
        a.f1058a = this.f1023i;
        a.f1059b = j;
        a.f1060c = this.f1024j;
        this.f1021g.mo12434a(a);
        this.f1017c = 0;
        this.f1023i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1368a(boolean z, long j) {
        boolean z2;
        String str;
        int i;
        C1198h hVar;
        int i2 = this.f1018d + 1;
        this.f1018d = i2;
        this.f1018d = i2 & 65535;
        this.f1031q = false;
        if (this.f1023i < 0) {
            this.f1023i = j;
        }
        if (this.f1024j < 0) {
            this.f1024j = j;
        }
        if (this.f1025k < 0) {
            this.f1025k = Process.myTid();
            this.f1026l = SystemClock.currentThreadTimeMillis();
        }
        int i3 = this.f1020f;
        if (j - this.f1023i > ((long) i3)) {
            long j2 = this.f1024j;
            if (j - j2 > ((long) i3)) {
                int i4 = this.f1017c;
                if (z) {
                    if (i4 == 0) {
                        m1365a(1, j, "no message running");
                    } else {
                        m1365a(9, j2, this.f1027m);
                        i = 1;
                        z2 = false;
                        str = "no message running";
                    }
                } else if (i4 == 0) {
                    i = 8;
                    str = this.f1028n;
                    z2 = true;
                } else {
                    hVar = this;
                    hVar.m1366a(9, j2, this.f1027m, false);
                    i = 8;
                    str = this.f1028n;
                    z2 = true;
                    hVar.m1366a(i, j, str, z2);
                }
                hVar = this;
                hVar.m1366a(i, j, str, z2);
            } else {
                m1365a(9, j, this.f1028n);
            }
        }
        this.f1024j = j;
    }

    /* renamed from: e */
    private void m1376e() {
        this.f1019e = 100;
        this.f1020f = 300;
    }

    /* renamed from: f */
    static /* synthetic */ int m1377f(C1198h hVar) {
        int i = hVar.f1017c;
        hVar.f1017c = i + 1;
        return i;
    }

    /* renamed from: a */
    public C1206e mo12422a(long j) {
        C1206e eVar = new C1206e();
        eVar.f1065h = this.f1028n;
        eVar.f1066i = this.f1027m;
        eVar.f1063f = j - this.f1024j;
        eVar.f1064g = m1361a(this.f1025k) - this.f1026l;
        eVar.f1062e = this.f1017c;
        return eVar;
    }

    /* renamed from: a */
    public void mo12423a() {
        if (!this.f1030p) {
            this.f1030p = true;
            m1376e();
            this.f1021g = new C1207f(this.f1019e);
            this.f1029o = new C1195e() {
                /* renamed from: a */
                public void mo12416a(String str) {
                    boolean unused = C1198h.this.f1033s = true;
                    String unused2 = C1198h.this.f1028n = str;
                    super.mo12416a(str);
                    C1198h.this.m1368a(true, C1195e.f1005a);
                }

                /* renamed from: a */
                public boolean mo12417a() {
                    return true;
                }

                /* renamed from: b */
                public void mo12418b(String str) {
                    super.mo12418b(str);
                    C1198h.m1377f(C1198h.this);
                    C1198h.this.m1368a(false, C1195e.f1005a);
                    C1198h hVar = C1198h.this;
                    String unused = hVar.f1027m = hVar.f1028n;
                    String unused2 = C1198h.this.f1028n = "no message running";
                    boolean unused3 = C1198h.this.f1033s = false;
                }
            };
            C1208i.m1395a();
            C1208i.m1396a(this.f1029o);
            C1214k.m1406a(C1214k.m1407a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12424b() {
        mo12423a();
    }

    /* renamed from: c */
    public JSONArray mo12425c() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C1206e> a = this.f1021g.mo12433a();
            if (a == null) {
                return jSONArray;
            }
            int i = 0;
            for (C1206e next : a) {
                if (next != null) {
                    i++;
                    jSONArray.put(next.mo12430a().put("id", i));
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
        }
    }
}
