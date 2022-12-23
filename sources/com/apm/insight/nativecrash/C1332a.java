package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.p026l.C1318o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.nativecrash.a */
public class C1332a {

    /* renamed from: a */
    private Map<String, String> f1350a;

    public C1332a(File file) {
        String a;
        File c = C1318o.m1897c(file);
        if (c.exists() && c.length() != 0 && (a = NativeImpl.m2003a(c.getAbsolutePath())) != null) {
            String[] split = a.split("\n");
            this.f1350a = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    this.f1350a.put(split3[0], split3[1]);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo12599a() {
        Map<String, String> map = this.f1350a;
        return map != null && !map.isEmpty() && !TextUtils.isEmpty(this.f1350a.get("process_name")) && !TextUtils.isEmpty(this.f1350a.get("crash_thread_name")) && !TextUtils.isEmpty(this.f1350a.get("pid")) && !TextUtils.isEmpty(this.f1350a.get("tid")) && !TextUtils.isEmpty(this.f1350a.get("start_time")) && !TextUtils.isEmpty(this.f1350a.get("crash_time")) && !TextUtils.isEmpty(this.f1350a.get("signal_line"));
    }

    /* renamed from: b */
    public String mo12600b() {
        return this.f1350a.get("signal_line");
    }

    /* renamed from: c */
    public Map<String, String> mo12601c() {
        return this.f1350a;
    }
}
