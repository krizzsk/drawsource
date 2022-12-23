package com.apm.insight.runtime.p027a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.entity.C1227a;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1307h;
import com.apm.insight.p026l.C1328w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.c */
public abstract class C1356c {

    /* renamed from: a */
    protected CrashType f1422a;

    /* renamed from: b */
    protected Context f1423b;

    /* renamed from: c */
    protected ICommonParams f1424c = C1250h.m1599a().mo12714c();

    /* renamed from: d */
    protected C1353b f1425d;

    /* renamed from: e */
    protected C1358d f1426e;

    /* renamed from: com.apm.insight.runtime.a.c$a */
    public interface C1357a {
        /* renamed from: a */
        C1227a mo12530a(int i, C1227a aVar);

        /* renamed from: a */
        C1227a mo12531a(int i, C1227a aVar, boolean z);

        /* renamed from: a */
        void mo12532a(Throwable th);
    }

    C1356c(CrashType crashType, Context context, C1353b bVar, C1358d dVar) {
        this.f1422a = crashType;
        this.f1423b = context;
        this.f1425d = bVar;
        this.f1426e = dVar;
    }

    /* renamed from: i */
    private void m2168i(C1227a aVar) {
        List<AttachUserData> a = C1250h.m1609b().mo12388a(this.f1422a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.mo12488h().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.mo12474a("custom", (Object) optJSONObject);
        }
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                try {
                    AttachUserData attachUserData = a.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C1227a.m1468a(optJSONObject, attachUserData.getUserData(this.f1422a));
                    hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C1227a.m1467a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", C1307h.m1816a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> b = C1250h.m1609b().mo12395b(this.f1422a);
        if (b != null) {
            JSONObject optJSONObject2 = aVar.mo12488h().optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.mo12474a("custom_long", (Object) optJSONObject2);
            }
            for (int i2 = 0; i2 < b.size(); i2++) {
                try {
                    AttachUserData attachUserData2 = b.get(i2);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    C1227a.m1468a(optJSONObject2, attachUserData2.getUserData(this.f1422a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    C1227a.m1467a(optJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public C1227a mo12685a(int i, C1227a aVar) {
        if (aVar == null) {
            aVar = new C1227a();
        }
        if (i == 0) {
            mo12688b(aVar);
        } else if (i == 1) {
            mo12689c(aVar);
            m2168i(aVar);
        } else if (i == 2) {
            mo12693e(aVar);
        } else if (i == 4) {
            mo12694f(aVar);
        } else if (i == 5) {
            mo12691d(aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public C1227a mo12670a(C1227a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C1227a mo12686a(C1227a aVar, C1357a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new C1227a();
        }
        C1227a aVar3 = aVar;
        for (int i = 0; i < mo12687b(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.mo12530a(i, aVar3);
                } catch (Throwable th) {
                    aVar2.mo12532a(th);
                }
            }
            try {
                aVar3 = mo12685a(i, aVar3);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.mo12532a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != mo12687b() - 1) {
                        z2 = false;
                    }
                    aVar3 = aVar2.mo12531a(i, aVar3, z2);
                } catch (Throwable th3) {
                    aVar2.mo12532a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar.mo12482c(aVar3.mo12488h());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new C1227a();
                }
            }
            aVar.mo12476b("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo12670a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12671a() {
        return false;
    }

    /* renamed from: b */
    public int mo12687b() {
        return 6;
    }

    /* renamed from: b */
    public C1227a mo12688b(C1227a aVar) {
        aVar.mo12465a(C1250h.m1624p(), C1250h.m1625q());
        if (C1250h.m1621m()) {
            aVar.mo12474a("is_mp", (Object) 1);
        }
        try {
            aVar.mo12472a(this.f1424c.getPluginInfo());
        } catch (Throwable unused) {
        }
        aVar.mo12477b((Map<Integer, String>) C1250h.m1623o());
        aVar.mo12474a("process_name", (Object) C1295a.m1782c(C1250h.m1615g()));
        return aVar;
    }

    /* renamed from: c */
    public C1227a mo12689c(C1227a aVar) {
        C1353b bVar;
        if (!C1295a.m1781b(C1250h.m1615g())) {
            aVar.mo12474a("remote_process", (Object) 1);
        }
        aVar.mo12474a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.mo12466a(C1250h.m1618j());
        if (mo12690c() && (bVar = this.f1425d) != null) {
            aVar.mo12468a(bVar);
        }
        try {
            aVar.mo12471a(this.f1424c.getPatchInfo());
        } catch (Throwable unused) {
        }
        String k = C1250h.m1619k();
        if (k != null) {
            aVar.mo12474a("business", (Object) k);
        }
        aVar.mo12474a("is_background", (Object) Boolean.valueOf(!C1295a.m1779a(this.f1423b)));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo12690c() {
        return true;
    }

    /* renamed from: d */
    public C1227a mo12691d(C1227a aVar) {
        if (mo12692d()) {
            aVar.mo12478b(C1328w.m1985a(this.f1423b));
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo12692d() {
        return true;
    }

    /* renamed from: e */
    public C1227a mo12693e(C1227a aVar) {
        C1358d dVar = this.f1426e;
        aVar.mo12474a("battery", (Object) Integer.valueOf(dVar == null ? 0 : dVar.mo12697a()));
        aVar.mo12480c((Map<? extends String, ? extends String>) C1250h.m1609b().mo12389a());
        return aVar;
    }

    /* renamed from: f */
    public C1227a mo12694f(C1227a aVar) {
        if (mo12671a()) {
            mo12696h(aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12695g(C1227a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo12696h(C1227a aVar) {
    }
}
