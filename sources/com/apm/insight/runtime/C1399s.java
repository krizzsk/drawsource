package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.entity.Header;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.runtime.p027a.C1353b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.s */
public class C1399s {

    /* renamed from: a */
    private static C1399s f1497a;

    /* renamed from: b */
    private File f1498b;

    /* renamed from: c */
    private File f1499c;

    /* renamed from: d */
    private File f1500d;

    /* renamed from: e */
    private Context f1501e;

    /* renamed from: f */
    private C1401a f1502f = null;

    /* renamed from: com.apm.insight.runtime.s$a */
    private static class C1401a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f1505a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f1506b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public File f1507c;

        /* renamed from: d */
        private JSONObject f1508d;

        private C1401a(File file) {
            this.f1508d = null;
            this.f1507c = file;
            String[] split = file.getName().split("-|\\.");
            this.f1505a = Long.parseLong(split[0]);
            this.f1506b = Long.parseLong(split[1]);
        }

        /* renamed from: a */
        private String m2349a() {
            return this.f1505a + "-" + this.f1506b + ".ctx";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2351a(long j) {
            this.f1506b = j;
            this.f1507c.renameTo(new File(this.f1507c.getParent(), m2349a()));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public JSONObject m2354b() {
            if (this.f1508d == null) {
                try {
                    this.f1508d = new JSONObject(C1308i.m1842c(this.f1507c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f1508d == null) {
                    this.f1508d = new JSONObject();
                }
            }
            return this.f1508d;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m2355b(long j) {
            long j2 = this.f1505a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f1506b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f1507c.lastModified() < j && j - this.f1507c.lastModified() > 604800000;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2358c() {
            this.f1507c.delete();
        }
    }

    private C1399s(Context context) {
        File c = C1318o.m1896c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
            C1353b.m2121a();
        }
        this.f1498b = c;
        this.f1499c = new File(c, "did");
        this.f1500d = new File(c, "device_uuid");
        this.f1501e = context;
    }

    /* renamed from: a */
    public static int m2332a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.m1448c(jSONObject)) {
            return 2;
        }
        if (Header.m1448c(jSONObject2)) {
            return 0;
        }
        return (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) || !Header.m1449d(jSONObject)) ? 2 : 1;
    }

    /* renamed from: a */
    public static C1399s m2333a() {
        if (f1497a == null) {
            f1497a = new C1399s(C1250h.m1615g());
        }
        return f1497a;
    }

    /* renamed from: a */
    private void m2334a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f1498b;
        File file2 = new File(file, "" + j + "-" + j2 + ".ctx");
        File file3 = this.f1498b;
        File file4 = new File(file3, "" + j + "-" + j2 + ".allData");
        try {
            C1308i.m1829a(file2, jSONObject, false);
            C1308i.m1828a(file4, jSONArray, false);
            this.f1502f = new C1401a(file2);
        } catch (IOException e) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) e);
        }
    }

    /* renamed from: c */
    private C1401a m2335c() {
        if (this.f1502f == null) {
            m2338d(".ctx");
        }
        return this.f1502f;
    }

    /* renamed from: c */
    private void m2336c(long j) {
        try {
            ArrayList<C1401a> d = m2338d("");
            if (d.size() > 6) {
                Iterator<C1401a> it = d.iterator();
                while (it.hasNext()) {
                    C1401a next = it.next();
                    if (next.m2355b(j)) {
                        next.m2358c();
                    }
                }
            }
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
    }

    /* renamed from: d */
    private File m2337d(long j) {
        Iterator<C1401a> it = m2338d(".ctx").iterator();
        while (it.hasNext()) {
            C1401a next = it.next();
            if (j >= next.f1505a && j <= next.f1506b) {
                return next.f1507c;
            }
        }
        return null;
    }

    /* renamed from: d */
    private ArrayList<C1401a> m2338d(final String str) {
        File[] listFiles = this.f1498b.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
            }
        });
        C1321q.m1927a((Object) "foundRuntimeContextFiles " + listFiles.length);
        ArrayList<C1401a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C1401a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                C1401a aVar3 = new C1401a(aVar2);
                arrayList.add(aVar3);
                if (this.f1502f == null && ".ctx".equals(str)) {
                    if (aVar != null) {
                        if (aVar3.f1506b < aVar.f1506b) {
                        }
                    }
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
        if (this.f1502f == null && aVar != null) {
            this.f1502f = aVar;
        }
        return arrayList;
    }

    /* renamed from: e */
    private File m2339e(long j) {
        Iterator<C1401a> it = m2338d(".allData").iterator();
        while (it.hasNext()) {
            C1401a next = it.next();
            if (j >= next.f1505a && j <= next.f1506b) {
                return next.f1507c;
            }
        }
        return null;
    }

    /* renamed from: f */
    private File m2340f(long j) {
        Iterator<C1401a> it = m2338d(".ctx").iterator();
        C1401a aVar = null;
        while (it.hasNext()) {
            C1401a next = it.next();
            if (aVar == null || Math.abs(aVar.f1506b - j) > Math.abs(next.f1506b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f1507c;
    }

    /* renamed from: g */
    private File m2341g(long j) {
        Iterator<C1401a> it = m2338d(".allData").iterator();
        C1401a aVar = null;
        while (it.hasNext()) {
            C1401a next = it.next();
            if (aVar == null || Math.abs(aVar.f1506b - j) > Math.abs(next.f1506b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f1507c;
    }

    /* renamed from: a */
    public String mo12736a(String str) {
        try {
            return C1308i.m1842c(this.f1500d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public JSONObject mo12737a(long j) {
        boolean z;
        String str;
        File d = m2337d(j);
        if (d == null) {
            d = m2340f(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (d != null) {
            try {
                str = C1308i.m1842c(d.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e) {
                        C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) e);
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo12738a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a = Header.m1440a(this.f1501e).mo12459a(map);
        if (!Header.m1448c(a)) {
            long currentTimeMillis = System.currentTimeMillis();
            C1401a c = m2335c();
            if (c == null) {
                m2334a(currentTimeMillis, currentTimeMillis, a, jSONArray);
                return;
            }
            int a2 = m2332a(c.m2354b(), a);
            if (a2 == 1) {
                m2334a(c.f1505a, currentTimeMillis, a, jSONArray);
                C1308i.m1834a(c.f1507c);
            } else if (a2 == 2) {
                m2334a(currentTimeMillis, currentTimeMillis, a, jSONArray);
            } else if (a2 == 3) {
                c.m2351a(currentTimeMillis);
            }
            m2336c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo12739b() {
        try {
            return C1308i.m1842c(this.f1499c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: b */
    public JSONArray mo12740b(long j) {
        String str;
        File e = m2339e(j);
        if (e == null) {
            e = m2341g(j);
        }
        if (e == null) {
            return null;
        }
        try {
            str = C1308i.m1842c(e.getAbsolutePath());
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                th = th;
                C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12741b(String str) {
        try {
            C1308i.m1826a(this.f1499c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo12742c(String str) {
        try {
            C1308i.m1826a(this.f1500d, str, false);
        } catch (Throwable unused) {
        }
    }
}
