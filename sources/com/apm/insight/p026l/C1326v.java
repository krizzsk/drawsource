package com.apm.insight.p026l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p026l.C1303e;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.v */
public final class C1326v {

    /* renamed from: a */
    private static final StackTraceElement f1341a = new StackTraceElement("", "", "", 0);

    /* renamed from: com.apm.insight.l.v$a */
    public static class C1327a {

        /* renamed from: a */
        public int f1342a = -1;

        /* renamed from: b */
        public int f1343b = -1;

        public C1327a(int i, int i2) {
            this.f1342a = i;
            this.f1343b = i2;
        }

        /* renamed from: a */
        public JSONObject mo12597a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f1342a);
                jSONObject.put("end", this.f1343b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1959a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x005b }
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ all -> 0x005b }
            r7.<init>(r0)     // Catch:{ all -> 0x005b }
            r6.<init>(r7)     // Catch:{ all -> 0x005b }
            r0 = r5
        L_0x0031:
            java.lang.String r1 = r6.readLine()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0056
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L_0x0045
            r8.add(r1)     // Catch:{ all -> 0x005a }
            r3.append(r1)     // Catch:{ all -> 0x005a }
            r3.append(r4)     // Catch:{ all -> 0x005a }
            goto L_0x0053
        L_0x0045:
            r2.add(r1)     // Catch:{ all -> 0x005a }
            int r1 = r2.size()     // Catch:{ all -> 0x005a }
            if (r1 <= r7) goto L_0x0053
            r2.poll()     // Catch:{ all -> 0x005a }
            int r5 = r5 + 1
        L_0x0053:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x0056:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r6)
            goto L_0x005e
        L_0x005a:
            r1 = r6
        L_0x005b:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r1)
        L_0x005e:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x008a
            if (r5 == 0) goto L_0x0073
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L_0x0073:
            java.util.Iterator r8 = r2.iterator()
        L_0x0077:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L_0x0077
        L_0x008a:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p026l.C1326v.m1959a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m1960a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m1971a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* renamed from: a */
    public static String m1961a(Throwable th, Thread thread, PrintStream printStream, C1303e.C1304a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        C1303e eVar = new C1303e(printStream, messageDigest, aVar);
        try {
            m1971a(th, (PrintWriter) eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest != null) {
            return m1962a(messageDigest.digest());
        }
        return null;
    }

    /* renamed from: a */
    private static String m1962a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & Ascii.f18305SI];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    public static String m1963a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement a : stackTraceElementArr) {
            m1964a(a, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static StringBuilder m1964a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    /* renamed from: a */
    public static JSONArray m1965a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        C1327a aVar = new C1327a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (aVar.f1342a == -1) {
                if (m1975a(stackTraceElementArr[i].getClassName(), strArr)) {
                    aVar.f1342a = i;
                    aVar.f1343b = i;
                }
            } else if (!m1975a(stackTraceElementArr[i].getClassName(), strArr)) {
                aVar.f1343b = i;
                jSONArray.put(aVar.mo12597a());
                aVar = new C1327a(-1, -1);
            }
        }
        if (aVar.f1342a != -1) {
            aVar.f1343b = stackTraceElementArr.length;
            jSONArray.put(aVar.mo12597a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1966a(String[] strArr, String[] strArr2) {
        C1327a aVar = new C1327a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < strArr.length; i++) {
            if (aVar.f1342a == -1) {
                if (m1975a(strArr[i], strArr2)) {
                    aVar.f1342a = i;
                    aVar.f1343b = i;
                }
            } else if (!m1975a(strArr[i], strArr2)) {
                aVar.f1343b = i;
                jSONArray.put(aVar.mo12597a());
                aVar = new C1327a(-1, -1);
            }
        }
        if (aVar.f1342a != -1) {
            aVar.f1343b = strArr.length;
            jSONArray.put(aVar.mo12597a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static void m1967a(StackTraceElement stackTraceElement, int i) {
        String str;
        String valueOf;
        try {
            m1968a("\tat ", i);
            m1968a(stackTraceElement.getClassName(), i);
            m1968a(".", i);
            m1968a(stackTraceElement.getMethodName(), i);
            if (stackTraceElement.isNativeMethod()) {
                str = "(Native Method)";
            } else {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        m1968a("(", i);
                        m1968a(stackTraceElement.getFileName(), i);
                        m1968a(CertificateUtil.DELIMITER, i);
                        valueOf = String.valueOf(stackTraceElement.getLineNumber());
                    } else {
                        m1968a("(", i);
                        valueOf = stackTraceElement.getFileName();
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    m1968a("(Unknown Source:", i);
                    valueOf = String.valueOf(stackTraceElement.getLineNumber());
                } else {
                    str = "(Unknown Source)";
                }
                m1968a(valueOf, i);
                m1968a(")", i);
                m1968a("\n", i);
            }
            m1968a(str, i);
            m1968a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m1968a(String str, int i) {
        NativeImpl.m2004a(i, str);
    }

    /* renamed from: a */
    public static void m1969a(Throwable th, int i) {
        try {
            m1979c(th, i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m1970a(Throwable th, int i, String str, String str2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        try {
            NativeImpl.m2004a(i, str2);
            NativeImpl.m2004a(i, str);
        } catch (Throwable unused) {
        }
        m1977b(th, i);
        for (StackTraceElement a : stackTrace) {
            m1967a(a, i);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (Throwable a2 : th.getSuppressed()) {
                m1970a(a2, i, "Suppressed: ", str2 + "\t");
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m1970a(cause, i, "Caused by: ", str2);
        }
    }

    /* renamed from: a */
    private static void m1971a(Throwable th, PrintWriter printWriter) {
        if (th != null && printWriter != null) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            printWriter.println(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (z && i2 > 256) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\t... skip ");
                    sb.append((stackTrace.length - i2) - 128);
                    sb.append(" lines");
                    printWriter.println(sb.toString());
                    break;
                }
                printWriter.println("\tat " + stackTraceElement);
                i2++;
                i++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable a : th.getSuppressed()) {
                    m1972a(a, printWriter, stackTrace, "Suppressed: ", "\t", (Set<Throwable>) newSetFromMap, 128);
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m1972a(cause, printWriter, stackTrace, "Caused by: ", "", (Set<Throwable>) newSetFromMap, 128);
            }
        }
    }

    /* renamed from: a */
    private static void m1972a(Throwable th, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        Throwable th2 = th;
        PrintWriter printWriter2 = printWriter;
        String str3 = str2;
        Set<Throwable> set2 = set;
        int i2 = i;
        if (set2.contains(th2)) {
            printWriter2.println("\t[CIRCULAR REFERENCE:" + th2 + "]");
            return;
        }
        set2.add(th2);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i2;
        printWriter2.println(str3 + str + th2);
        int length = stackTrace.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (z && i4 > i2) {
                printWriter2.println("\t... skip " + ((stackTrace.length - i4) - (i2 / 2)) + " lines");
                break;
            }
            printWriter2.println("\tat " + stackTraceElement);
            i4++;
            i3++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i2 / 2); length2 < stackTrace.length; length2++) {
                printWriter2.println("\tat " + stackTrace[length2]);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (Throwable a : th.getSuppressed()) {
                int i5 = i2 / 2;
                m1972a(a, printWriter, stackTrace, "Suppressed: ", str3 + "\t", set, i5 > 10 ? i5 : 10);
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i6 = i2 / 2;
            m1972a(cause, printWriter, stackTrace, "Caused by: ", str2, set, i6 > 10 ? i6 : 10);
        }
    }

    /* renamed from: a */
    private static void m1973a(Throwable th, List<StackTraceElement> list) {
        if (th != null && list != null) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            list.add(f1341a);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (z && i2 > 256) {
                    list.add(f1341a);
                    break;
                }
                list.add(stackTraceElement);
                i2++;
                i++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable a : th.getSuppressed()) {
                    m1974a(a, list, stackTrace, "Suppressed: ", "\t", (Set<Throwable>) newSetFromMap, 128);
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m1974a(cause, list, stackTrace, "Caused by: ", "", (Set<Throwable>) newSetFromMap, 128);
            }
        }
    }

    /* renamed from: a */
    private static void m1974a(Throwable th, List<StackTraceElement> list, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        Throwable th2 = th;
        List<StackTraceElement> list2 = list;
        Set<Throwable> set2 = set;
        int i2 = i;
        if (set2.contains(th2)) {
            list2.add(f1341a);
            return;
        }
        set2.add(th2);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i2;
        list2.add(f1341a);
        int length = stackTrace.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (z && i4 > i2) {
                list2.add(f1341a);
                break;
            }
            list2.add(stackTraceElement);
            i4++;
            i3++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i2 / 2); length2 < stackTrace.length; length2++) {
                list2.add(stackTrace[length2]);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (Throwable a : th.getSuppressed()) {
                int i5 = i2 / 2;
                m1974a(a, list, stackTrace, "Suppressed: ", str2 + "\t", set, i5 > 10 ? i5 : 10);
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i6 = i2 / 2;
            m1974a(cause, list, stackTrace, "Caused by: ", str2, set, i6 > 10 ? i6 : 10);
        }
    }

    /* renamed from: a */
    public static boolean m1975a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0029 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m1976b(java.lang.String r16) {
        /*
            r0 = r16
            java.lang.String r1 = ")"
            java.lang.String r2 = "("
            r3 = 0
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()     // Catch:{ all -> 0x00e0 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00e0 }
            r5.<init>()     // Catch:{ all -> 0x00e0 }
            if (r4 != 0) goto L_0x0013
            return r3
        L_0x0013:
            java.lang.String r6 = "thread_all_count"
            int r7 = r4.size()     // Catch:{ all -> 0x00e0 }
            r5.put(r6, r7)     // Catch:{ all -> 0x00e0 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ all -> 0x00e0 }
            r6.<init>()     // Catch:{ all -> 0x00e0 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00e0 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e0 }
        L_0x0029:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x00e0 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x00e0 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x00e0 }
            r8.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r9 = r7.getKey()     // Catch:{ all -> 0x00e0 }
            java.lang.Thread r9 = (java.lang.Thread) r9     // Catch:{ all -> 0x00e0 }
            java.lang.String r10 = r9.getName()     // Catch:{ all -> 0x00e0 }
            boolean r11 = m1980c((java.lang.String) r10)     // Catch:{ all -> 0x00e0 }
            if (r11 != 0) goto L_0x0029
            if (r0 == 0) goto L_0x005f
            boolean r11 = r0.equals(r10)     // Catch:{ all -> 0x00e0 }
            if (r11 != 0) goto L_0x0029
            boolean r11 = r10.startsWith(r0)     // Catch:{ all -> 0x00e0 }
            if (r11 != 0) goto L_0x0029
            boolean r10 = r10.endsWith(r0)     // Catch:{ all -> 0x00e0 }
            if (r10 == 0) goto L_0x005f
            goto L_0x0029
        L_0x005f:
            java.lang.String r10 = "thread_name"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r11.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r12 = r9.getName()     // Catch:{ all -> 0x00e0 }
            r11.append(r12)     // Catch:{ all -> 0x00e0 }
            r11.append(r2)     // Catch:{ all -> 0x00e0 }
            long r12 = r9.getId()     // Catch:{ all -> 0x00e0 }
            r11.append(r12)     // Catch:{ all -> 0x00e0 }
            r11.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x00e0 }
            r8.put(r10, r9)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x00e0 }
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x00d2
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ all -> 0x00e0 }
            r10.<init>()     // Catch:{ all -> 0x00e0 }
            int r11 = r7.length     // Catch:{ all -> 0x00e0 }
            r12 = 0
            r13 = r12
        L_0x0091:
            if (r13 >= r11) goto L_0x00c4
            r14 = r7[r13]     // Catch:{ all -> 0x00e0 }
            java.lang.String r15 = r14.getClassName()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r9.<init>()     // Catch:{ all -> 0x00e0 }
            r9.append(r15)     // Catch:{ all -> 0x00e0 }
            java.lang.String r15 = "."
            r9.append(r15)     // Catch:{ all -> 0x00e0 }
            java.lang.String r15 = r14.getMethodName()     // Catch:{ all -> 0x00e0 }
            r9.append(r15)     // Catch:{ all -> 0x00e0 }
            r9.append(r2)     // Catch:{ all -> 0x00e0 }
            int r14 = r14.getLineNumber()     // Catch:{ all -> 0x00e0 }
            r9.append(r14)     // Catch:{ all -> 0x00e0 }
            r9.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00e0 }
            r10.put(r9)     // Catch:{ all -> 0x00e0 }
            int r13 = r13 + 1
            goto L_0x0091
        L_0x00c4:
            java.lang.String r7 = "thread_stack"
            r8.put(r7, r10)     // Catch:{ all -> 0x00e0 }
            int r7 = r10.length()     // Catch:{ all -> 0x00e0 }
            if (r7 <= 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r9 = r12
            goto L_0x00d3
        L_0x00d2:
            r9 = 1
        L_0x00d3:
            if (r9 == 0) goto L_0x0029
            r6.put(r8)     // Catch:{ all -> 0x00e0 }
            goto L_0x0029
        L_0x00da:
            java.lang.String r0 = "thread_stacks"
            r5.put(r0, r6)     // Catch:{ all -> 0x00e0 }
            return r5
        L_0x00e0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p026l.C1326v.m1976b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: b */
    private static void m1977b(Throwable th, int i) {
        th.getClass().getName();
        String localizedMessage = th.getLocalizedMessage();
        try {
            m1968a(th.getClass().getName(), i);
            if (localizedMessage != null) {
                m1968a(": ", i);
                m1968a(localizedMessage, i);
            }
            m1968a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static StackTraceElement[] m1978b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            m1973a(th, (List<StackTraceElement>) arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    /* renamed from: c */
    private static void m1979c(Throwable th, int i) {
        if (th != null && i > 0) {
            m1977b(th, i);
            for (StackTraceElement a : th.getStackTrace()) {
                m1967a(a, i);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable a2 : th.getSuppressed()) {
                    m1970a(a2, i, "Suppressed: ", "\t");
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m1970a(cause, i, "Caused by: ", "");
            }
        }
    }

    /* renamed from: c */
    private static boolean m1980c(String str) {
        Set<String> a = C1309j.m1850a();
        if (a.contains(str)) {
            return true;
        }
        for (String next : a) {
            if (!TextUtils.isEmpty(str) && str.startsWith(next)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m1981c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if (th instanceof OutOfMemoryError) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m1982d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }
}
