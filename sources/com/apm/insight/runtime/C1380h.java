package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C1186b;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1322r;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.h */
public class C1380h {

    /* renamed from: a */
    private Context f1461a;

    /* renamed from: b */
    private HashMap<String, Long> f1462b = null;

    /* renamed from: c */
    private int f1463c = 50;

    /* renamed from: d */
    private int f1464d = 100;

    public C1380h(Context context) {
        this.f1461a = context;
        this.f1462b = m2254c();
        m2253b();
    }

    /* renamed from: a */
    private void m2252a(File file) {
        File g = C1318o.m1909g(this.f1461a);
        file.renameTo(new File(g, String.valueOf(System.currentTimeMillis())));
        String[] list = g.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g, list[0]).delete();
        }
    }

    /* renamed from: b */
    private void m2253b() {
        this.f1463c = C1351a.m2091a(this.f1463c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f1464d = C1351a.m2091a(this.f1464d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* renamed from: c */
    private HashMap<String, Long> m2254c() {
        File h = C1318o.m1912h(this.f1461a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray b = C1308i.m1837b(h.getAbsolutePath());
            if (C1311l.m1860a(b)) {
                return hashMap;
            }
            Long decode = Long.decode(b.optString(0, (String) null));
            if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                m2252a(h);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i = 1; i < b.length(); i++) {
                String[] split = b.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo12726a() {
        HashMap<String, Long> hashMap = this.f1462b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append(10);
        for (Map.Entry next : hashMap.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(' ');
            sb.append(next.getValue());
            sb.append(10);
        }
        try {
            C1308i.m1826a(C1318o.m1912h(this.f1461a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo12727a(String str) {
        if (str == null) {
            str = CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER;
        }
        return C1322r.m1937a(this.f1462b, str, 1L).longValue() < ((long) this.f1463c) && C1322r.m1937a(this.f1462b, TtmlNode.COMBINE_ALL, 1L).longValue() < ((long) this.f1464d);
    }
}
