package com.apm.insight.runtime.p027a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1296b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.b */
public class C1353b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f1390a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f1391b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f1392c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f1393d = 1;

    /* renamed from: e */
    private static boolean f1394e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static long f1395f = -1;

    /* renamed from: z */
    private static volatile C1353b f1396z;

    /* renamed from: A */
    private int f1397A = 50;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f1398B;

    /* renamed from: g */
    private Application f1399g;

    /* renamed from: h */
    private Context f1400h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<String> f1401i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<Long> f1402j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<String> f1403k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<Long> f1404l = new ArrayList();

    /* renamed from: m */
    private LinkedList<C1355a> f1405m = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f1406n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f1407o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f1408p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f1409q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f1410r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f1411s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f1412t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f1413u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f1414v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f1415w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f1416x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f1417y = -1;

    /* renamed from: com.apm.insight.runtime.a.b$a */
    private static class C1355a {

        /* renamed from: a */
        String f1419a;

        /* renamed from: b */
        String f1420b;

        /* renamed from: c */
        long f1421c;

        C1355a(String str, String str2, long j) {
            this.f1420b = str2;
            this.f1421c = j;
            this.f1419a = str;
        }

        public String toString() {
            return C1296b.m1787a().format(new Date(this.f1421c)) + " : " + this.f1419a + ' ' + this.f1420b;
        }
    }

    private C1353b(Application application) {
        this.f1400h = application;
        this.f1399g = application;
        try {
            m2155m();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private C1355a m2117a(String str, String str2, long j) {
        C1355a aVar;
        if (this.f1405m.size() >= this.f1397A) {
            aVar = this.f1405m.poll();
            if (aVar != null) {
                this.f1405m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        C1355a aVar2 = new C1355a(str, str2, j);
        this.f1405m.add(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private JSONObject m2120a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m2121a() {
        f1394e = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2123a(String str, long j, String str2) {
        try {
            C1355a a = m2117a(str, str2, j);
            a.f1420b = str2;
            a.f1419a = str;
            a.f1421c = j;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static int m2126b() {
        int i = f1393d;
        return i == 1 ? f1394e ? 2 : 1 : i;
    }

    /* renamed from: c */
    public static long m2131c() {
        return f1395f;
    }

    /* renamed from: d */
    public static C1353b m2137d() {
        if (f1396z == null) {
            synchronized (C1353b.class) {
                if (f1396z == null) {
                    f1396z = new C1353b(C1250h.m1616h());
                }
            }
        }
        return f1396z;
    }

    /* renamed from: g */
    static /* synthetic */ int m2145g(C1353b bVar) {
        int i = bVar.f1398B;
        bVar.f1398B = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m2152l(C1353b bVar) {
        int i = bVar.f1398B;
        bVar.f1398B = i - 1;
        return i;
    }

    /* renamed from: m */
    private void m2155m() {
        if (Build.VERSION.SDK_INT >= 14 && this.f1399g != null) {
            this.f1399g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String unused = C1353b.this.f1406n = activity.getClass().getName();
                    long unused2 = C1353b.this.f1407o = System.currentTimeMillis();
                    boolean unused3 = C1353b.f1391b = bundle != null;
                    boolean unused4 = C1353b.f1392c = true;
                    C1353b.this.f1401i.add(C1353b.this.f1406n);
                    C1353b.this.f1402j.add(Long.valueOf(C1353b.this.f1407o));
                    C1353b bVar = C1353b.this;
                    bVar.m2123a(bVar.f1406n, C1353b.this.f1407o, "onCreate");
                }

                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = C1353b.this.f1401i.indexOf(name);
                    if (indexOf > -1 && indexOf < C1353b.this.f1401i.size()) {
                        C1353b.this.f1401i.remove(indexOf);
                        C1353b.this.f1402j.remove(indexOf);
                    }
                    C1353b.this.f1403k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    C1353b.this.f1404l.add(Long.valueOf(currentTimeMillis));
                    C1353b.this.m2123a(name, currentTimeMillis, "onDestroy");
                }

                public void onActivityPaused(Activity activity) {
                    String unused = C1353b.this.f1412t = activity.getClass().getName();
                    long unused2 = C1353b.this.f1413u = System.currentTimeMillis();
                    C1353b.m2152l(C1353b.this);
                    if (C1353b.this.f1398B != 0) {
                        if (C1353b.this.f1398B < 0) {
                            int unused3 = C1353b.this.f1398B = 0;
                        }
                        C1353b bVar = C1353b.this;
                        bVar.m2123a(bVar.f1412t, C1353b.this.f1413u, "onPause");
                    }
                    boolean unused4 = C1353b.this.f1416x = false;
                    boolean unused5 = C1353b.f1392c = false;
                    long unused6 = C1353b.this.f1417y = SystemClock.uptimeMillis();
                    C1353b bVar2 = C1353b.this;
                    bVar2.m2123a(bVar2.f1412t, C1353b.this.f1413u, "onPause");
                }

                public void onActivityResumed(Activity activity) {
                    String unused = C1353b.this.f1410r = activity.getClass().getName();
                    long unused2 = C1353b.this.f1411s = System.currentTimeMillis();
                    C1353b.m2145g(C1353b.this);
                    if (!C1353b.this.f1416x) {
                        if (C1353b.f1390a) {
                            boolean unused3 = C1353b.f1390a = false;
                            int unused4 = C1353b.f1393d = 1;
                            long unused5 = C1353b.f1395f = C1353b.this.f1411s;
                        }
                        if (C1353b.this.f1410r.equals(C1353b.this.f1412t)) {
                            if (C1353b.f1392c && !C1353b.f1391b) {
                                int unused6 = C1353b.f1393d = 4;
                                long unused7 = C1353b.f1395f = C1353b.this.f1411s;
                                return;
                            } else if (!C1353b.f1392c) {
                                int unused8 = C1353b.f1393d = 3;
                                long unused9 = C1353b.f1395f = C1353b.this.f1411s;
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    boolean unused10 = C1353b.this.f1416x = true;
                    C1353b bVar = C1353b.this;
                    bVar.m2123a(bVar.f1410r, C1353b.this.f1411s, "onResume");
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                    String unused = C1353b.this.f1408p = activity.getClass().getName();
                    long unused2 = C1353b.this.f1409q = System.currentTimeMillis();
                    C1353b bVar = C1353b.this;
                    bVar.m2123a(bVar.f1408p, C1353b.this.f1409q, "onStart");
                }

                public void onActivityStopped(Activity activity) {
                    String unused = C1353b.this.f1414v = activity.getClass().getName();
                    long unused2 = C1353b.this.f1415w = System.currentTimeMillis();
                    C1353b bVar = C1353b.this;
                    bVar.m2123a(bVar.f1414v, C1353b.this.f1415w, "onStop");
                }
            });
        }
    }

    /* renamed from: n */
    private JSONArray m2157n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f1401i;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f1401i.size()) {
                try {
                    jSONArray.put(m2120a(this.f1401i.get(i), this.f1402j.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    private JSONArray m2159o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f1403k;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f1403k.size()) {
                try {
                    jSONArray.put(m2120a(this.f1403k.get(i), this.f1404l.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public long mo12672e() {
        return SystemClock.uptimeMillis() - this.f1417y;
    }

    /* renamed from: f */
    public boolean mo12673f() {
        return this.f1416x;
    }

    /* renamed from: g */
    public JSONObject mo12674g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m2120a(this.f1406n, this.f1407o));
            jSONObject.put("last_start_activity", m2120a(this.f1408p, this.f1409q));
            jSONObject.put("last_resume_activity", m2120a(this.f1410r, this.f1411s));
            jSONObject.put("last_pause_activity", m2120a(this.f1412t, this.f1413u));
            jSONObject.put("last_stop_activity", m2120a(this.f1414v, this.f1415w));
            jSONObject.put("alive_activities", m2157n());
            jSONObject.put("finish_activities", m2159o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    public String mo12675h() {
        return String.valueOf(this.f1410r);
    }

    /* renamed from: i */
    public JSONArray mo12676i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f1405m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1355a) it.next()).toString());
        }
        return jSONArray;
    }
}
