package com.bykv.p054vk.openvk.component.video.p055a.p066c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2304a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2332e;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.a.c.a */
/* compiled from: Util */
public final class C2361a {

    /* renamed from: a */
    public static final Charset f4784a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f4785b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m5451a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5454a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5455a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5452a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m5456a(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: b */
    public static int m5457b(String str) {
        return m5441a(str, 0);
    }

    /* renamed from: a */
    public static int m5441a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m5445a(C2327a aVar, int i) {
        int a;
        if (aVar == null || !aVar.mo15763b()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo15766e().toUpperCase());
        sb.append(' ');
        sb.append(aVar.mo15759a());
        sb.append(' ');
        sb.append(aVar.mo15767f());
        sb.append("\r\n");
        if (C2325e.f4685c) {
            Log.i("TAG_PROXY_headers", aVar.mo15766e().toUpperCase() + " " + aVar.mo15759a() + " " + aVar.mo15767f());
        }
        List<C2352i.C2354b> a2 = m5447a(aVar.mo15764c());
        boolean z = true;
        if (a2 != null) {
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2352i.C2354b bVar = a2.get(i2);
                if (bVar != null) {
                    String str = bVar.f4765a;
                    String str2 = bVar.f4766b;
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    sb.append("\r\n");
                    if (HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(str) || (HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (a = m5440a(aVar)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i, 0));
            sb.append("-");
            sb.append(a - 1);
            sb.append("/");
            sb.append(a);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C2325e.f4685c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static String m5443a(int i, int i2) {
        String b = m5458b(i, i2);
        if (b == null) {
            return null;
        }
        return "bytes=" + b;
    }

    /* renamed from: b */
    public static String m5458b(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        } else if (i > 0) {
            return i + "-";
        } else if (i >= 0 || i2 <= 0) {
            return null;
        } else {
            return "-" + i2;
        }
    }

    /* renamed from: a */
    public static List<String> m5449a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m5456a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m5444a(C2304a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK");
            sb.append("\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content");
            sb.append("\r\n");
        }
        sb.append("Accept-Ranges: bytes");
        sb.append("\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar.f4638b);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar.f4639c);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(aVar.f4639c - 1);
            sb.append("/");
            sb.append(aVar.f4639c);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar.f4639c - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C2325e.f4685c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static int m5439a() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a */
                private Pattern f4786a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f4786a.matcher(str).matches();
                }
            })) == null) {
                return 1;
            }
            return Math.max(listFiles.length, 1);
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static int m5440a(C2327a aVar) {
        int lastIndexOf;
        if (aVar == null) {
            return -1;
        }
        if (aVar.mo15759a() == 200) {
            return m5441a(aVar.mo15762a("Content-Length", (String) null), -1);
        }
        if (aVar.mo15759a() == 206) {
            String a = aVar.mo15762a(HttpHeaders.CONTENT_RANGE, (String) null);
            if (!TextUtils.isEmpty(a) && (lastIndexOf = a.lastIndexOf("/")) >= 0 && lastIndexOf < a.length() - 1) {
                return m5441a(a.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m5446a(C2327a aVar, boolean z, boolean z2) {
        String a;
        if (aVar == null) {
            if (C2325e.f4685c) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        } else if (!aVar.mo15763b()) {
            if (C2325e.f4685c) {
                Log.e("TAG_PROXY_Response", "response code: " + aVar.mo15759a());
            }
            return "response code: " + aVar.mo15759a();
        } else {
            String a2 = aVar.mo15762a("Content-Type", (String) null);
            if (!m5462c(a2)) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_Response", "Content-Type: " + a2);
                }
                return "Content-Type: " + a2;
            }
            int a3 = m5440a(aVar);
            if (a3 <= 0) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_Response", "Content-Length: " + a3);
                }
                return "Content-Length: " + a3;
            } else if (z && ((a = aVar.mo15762a(HttpHeaders.ACCEPT_RANGES, (String) null)) == null || !a.contains("bytes"))) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: " + a);
                }
                return "Accept-Ranges: " + a;
            } else if (!z2 || aVar.mo15765d() != null) {
                return null;
            } else {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_Response", "response body null");
                }
                return "response body null";
            }
        }
    }

    /* renamed from: c */
    public static boolean m5462c(String str) {
        return str != null && (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str));
    }

    /* renamed from: b */
    public static boolean m5461b() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* renamed from: a */
    public static void m5450a(C2885g gVar) {
        if (gVar == null) {
            return;
        }
        if (m5461b()) {
            C2882e.m8035a(gVar);
            if (C2325e.f4685c) {
                Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                return;
            }
            return;
        }
        gVar.run();
        if (C2325e.f4685c) {
            Log.e("TAG_PROXY_UTIL", "invoke calling thread");
        }
    }

    /* renamed from: a */
    public static void m5453a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (m5461b()) {
            runnable.run();
        } else {
            f4785b.post(runnable);
        }
    }

    /* renamed from: a */
    public static List<C2352i.C2354b> m5447a(List<C2352i.C2354b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (C2325e.f4685c) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2352i.C2354b bVar = list.get(i);
                if (bVar != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", bVar.f4765a + ": " + bVar.f4765a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C2352i.C2354b next : list) {
            if (HttpHeaders.HOST.equals(next.f4765a) || "Keep-Alive".equals(next.f4765a) || "Connection".equals(next.f4765a) || "Proxy-Connection".equals(next.f4765a)) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        if (C2325e.f4685c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2352i.C2354b bVar2 = list.get(i2);
                if (bVar2 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", bVar2.f4765a + ": " + bVar2.f4766b);
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C2352i.C2354b> m5448a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : entrySet) {
                    arrayList.add(new C2352i.C2354b((String) next.getKey(), (String) next.getValue()));
                }
                return arrayList;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2304a m5442a(C2327a aVar, C2306c cVar, String str, int i) {
        String str2;
        String str3;
        String str4;
        C2304a a = cVar.mo15728a(str, i);
        if (a != null) {
            return a;
        }
        int a2 = m5440a(aVar);
        String a3 = aVar.mo15762a("Content-Type", (String) null);
        if (a2 <= 0 || TextUtils.isEmpty(a3)) {
            return a;
        }
        C2332e g = aVar.mo15768g();
        if (g != null) {
            str2 = g.f4699b;
            str3 = m5460b(g.f4702e);
        } else {
            str3 = "";
            str2 = str3;
        }
        String b = m5459b(aVar.mo15764c());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.REQUEST_URL, str2);
            jSONObject.put("requestHeaders", str3);
            jSONObject.put("responseHeaders", b);
            str4 = jSONObject.toString();
        } catch (Throwable unused) {
            str4 = "";
        }
        C2304a aVar2 = new C2304a(str, a3, a2, i, str4);
        cVar.mo15730a(aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public static String m5459b(List<C2352i.C2354b> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2352i.C2354b bVar = list.get(0);
            if (bVar != null) {
                sb.append(bVar.f4765a);
                sb.append(": ");
                sb.append(bVar.f4766b);
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m5460b(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
