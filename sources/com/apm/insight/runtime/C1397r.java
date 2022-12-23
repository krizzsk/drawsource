package com.apm.insight.runtime;

import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apm.insight.C1186b;
import com.apm.insight.C1215c;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.r */
public class C1397r {

    /* renamed from: a */
    private static File f1493a;

    /* renamed from: com.apm.insight.runtime.r$a */
    public static class C1398a {

        /* renamed from: a */
        public String f1494a;

        /* renamed from: b */
        public String f1495b;

        /* renamed from: c */
        public long f1496c;

        C1398a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.f1494a = split[0];
                this.f1495b = split[1];
                try {
                    this.f1496c = Long.parseLong(split[2]);
                } catch (Throwable th) {
                    C1215c a = C1186b.m1306a();
                    a.mo12441a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str, th));
                }
            } else {
                C1215c a2 = C1186b.m1306a();
                a2.mo12441a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str));
            }
        }
    }

    /* renamed from: a */
    private static File m2328a() {
        if (f1493a == null) {
            String c = C1295a.m1782c(C1250h.m1615g());
            if (c == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j = C1318o.m1917j(C1250h.m1615g());
            f1493a = new File(j, "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + c.replace(':', '_') + ".txt");
        }
        return f1493a;
    }

    /* renamed from: a */
    public static File m2329a(long j) {
        String j2 = C1318o.m1917j(C1250h.m1615g());
        return new File(j2, "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* renamed from: a */
    public static HashMap<String, C1398a> m2330a(long j, String str) {
        File file = new File(C1318o.m1917j(C1250h.m1615g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, C1398a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a = C1308i.m1824a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0);
                    int length2 = a.length() - 1;
                    while (true) {
                        if (length2 < 0) {
                            break;
                        }
                        String optString = a.optString(length2);
                        if (!TextUtils.isEmpty(optString)) {
                            if (optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new C1398a(optString));
                                break;
                            }
                        }
                        length2--;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m2331a(String str, String str2) {
        try {
            File a = m2328a();
            if (a != null) {
                C1308i.m1826a(a, str + ' ' + str2 + ' ' + System.currentTimeMillis() + 10, true);
            }
        } catch (Throwable unused) {
        }
    }
}
