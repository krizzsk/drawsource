package com.apm.insight.nativecrash;

import com.apm.insight.C1186b;
import com.apm.insight.p026l.C1310k;
import com.apm.insight.p026l.C1318o;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.apm.insight.nativecrash.d */
public class C1347d {

    /* renamed from: i */
    private static final Pattern f1372i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j */
    private static final Pattern f1373j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k */
    private static final Pattern f1374k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l */
    private static final Pattern f1375l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m */
    private static final Pattern f1376m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    private String f1377a;

    /* renamed from: b */
    private String f1378b;

    /* renamed from: c */
    private String f1379c;

    /* renamed from: d */
    private String f1380d;

    /* renamed from: e */
    private String f1381e;

    /* renamed from: f */
    private String f1382f;

    /* renamed from: g */
    private String f1383g;

    /* renamed from: h */
    private Map<String, String> f1384h = new HashMap();

    public C1347d(File file) {
        m2084b(C1318o.m1893b(file));
    }

    /* renamed from: b */
    private void m2084b(File file) {
        String str;
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i >= 64) {
                            break;
                        }
                        if (this.f1377a != null || !readLine.startsWith("pid: ")) {
                            if (this.f1381e == null) {
                                if (readLine.startsWith("signal ")) {
                                    Matcher matcher = f1373j.matcher(readLine);
                                    if (matcher.find() && matcher.groupCount() == 3) {
                                        String replace = matcher.group(1).replace(" ", "");
                                        String replace2 = matcher.group(2).replace(" ", "");
                                        int indexOf = replace2.indexOf("frompid");
                                        if (indexOf > 0) {
                                            replace2 = replace2.substring(0, indexOf) + ")";
                                        }
                                        this.f1381e = "Signal " + replace + ", Code " + replace2 + "\n";
                                    }
                                }
                            }
                            if (this.f1382f == null && readLine.startsWith("Abort ")) {
                                Matcher matcher2 = f1374k.matcher(readLine);
                                if (matcher2.find() && matcher2.groupCount() == 1) {
                                    str = "abort message: " + matcher2.group(1) + "\n";
                                }
                            } else if (this.f1382f == null && readLine.startsWith("Crash ")) {
                                Matcher matcher3 = f1375l.matcher(readLine);
                                if (matcher3.find() && matcher3.groupCount() == 1) {
                                    str = "crash message: " + matcher3.group(1) + "\n";
                                }
                            } else if (this.f1383g == null && readLine.startsWith("backtrace:")) {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 == null || !readLine2.startsWith("    #")) {
                                        i++;
                                        this.f1383g = sb.toString();
                                    } else {
                                        sb.append(readLine2.substring(4));
                                        sb.append(10);
                                    }
                                }
                                i++;
                                this.f1383g = sb.toString();
                            } else if (this.f1384h.isEmpty() && readLine.startsWith("build id:")) {
                                while (true) {
                                    String readLine3 = bufferedReader2.readLine();
                                    if (readLine3 == null) {
                                        break;
                                    } else if (!readLine3.contains("BuildId:")) {
                                        break;
                                    } else {
                                        Matcher matcher4 = f1376m.matcher(readLine3);
                                        if (matcher4.find()) {
                                            String group = matcher4.group(1);
                                            String group2 = matcher4.group(2);
                                            String group3 = matcher4.group(3);
                                            if (group.equals("data")) {
                                                this.f1384h.put(group2, group3);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f1382f = str;
                        } else {
                            Matcher matcher5 = f1372i.matcher(readLine);
                            if (matcher5.find() && matcher5.groupCount() == 4) {
                                this.f1377a = matcher5.group(1);
                                this.f1378b = matcher5.group(2);
                                this.f1380d = matcher5.group(3);
                                this.f1379c = matcher5.group(4);
                            }
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                        } finally {
                            C1310k.m1852a((Closeable) bufferedReader);
                        }
                    }
                }
                C1310k.m1852a((Closeable) bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public String mo12623a() {
        return this.f1383g;
    }

    /* renamed from: a */
    public void mo12624a(File file) {
        File b = C1318o.m1893b(file);
        if (b.exists()) {
            b.renameTo(new File(b.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m2006a(file);
        m2084b(C1318o.m1893b(file));
    }

    /* renamed from: b */
    public Map<String, String> mo12625b() {
        return this.f1384h;
    }

    /* renamed from: c */
    public String mo12626c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1381e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f1382f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f1383g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
