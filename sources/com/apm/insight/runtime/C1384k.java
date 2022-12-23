package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1305f;
import com.apm.insight.p026l.C1310k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.k */
public class C1384k {

    /* renamed from: a */
    private static C1383j f1465a;

    /* renamed from: a */
    public static JSONArray m2259a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C1310k.m1852a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    e.printStackTrace();
                    C1310k.m1852a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    C1310k.m1852a((Closeable) bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
            e.printStackTrace();
            C1310k.m1852a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1310k.m1852a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m2260a(C1383j jVar) {
        f1465a = jVar;
    }

    /* renamed from: b */
    public static JSONArray m2261b(String str) {
        if (f1465a != null && C1250h.m1614f().equals(str)) {
            try {
                return m2259a(f1465a.mo12728a());
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
        try {
            return m2259a(C1305f.m1808a(str, C1250h.m1617i().getLogcatDumpCount(), C1250h.m1617i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th2);
            return null;
        }
    }
}
