package com.apm.insight.p021g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1227a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p014b.C1197g;
import com.apm.insight.p014b.C1214k;
import com.apm.insight.p015c.C1217b;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1322r;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1384k;
import com.apm.insight.runtime.p027a.C1353b;
import com.apm.insight.runtime.p027a.C1356c;
import com.apm.insight.runtime.p027a.C1362f;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g.d */
public class C1247d implements C1246c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1167a;

    public C1247d(Context context) {
        this.f1167a = context;
    }

    /* renamed from: a */
    public static int m1591a() {
        return 6;
    }

    /* renamed from: a */
    public void mo12528a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        final String str3 = str;
        final File file2 = new File(C1318o.m1887a(this.f1167a), str3);
        C1241a.m1565a().mo12518a(file2.getName());
        file2.mkdirs();
        C1308i.m1848f(file2);
        final boolean c = C1326v.m1981c(th);
        final Throwable th2 = th;
        final long j2 = j;
        final String str4 = str2;
        final boolean z2 = z;
        final Thread thread2 = thread;
        C1227a a = C1362f.m2195a().mo12701a(CrashType.JAVA, (C1227a) null, new C1356c.C1357a() {

            /* renamed from: a */
            long f1168a = 0;

            /* renamed from: a */
            public C1227a mo12530a(int i, C1227a aVar) {
                String valueOf;
                String str;
                Object b;
                String str2;
                this.f1168a = SystemClock.uptimeMillis();
                if (i != 0) {
                    if (i == 1) {
                        Thread thread = thread2;
                        aVar.mo12474a("crash_thread_name", (Object) thread != null ? thread.getName() : "");
                        aVar.mo12474a("tid", (Object) Integer.valueOf(Process.myTid()));
                        String str3 = "true";
                        aVar.mo12469a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? str3 : "false");
                        if (!NativeImpl.m2020d()) {
                            str3 = "false";
                        }
                        aVar.mo12469a("crash_after_native", str3);
                        C1241a.m1565a().mo12519a(thread2, th2, false, aVar);
                    } else if (i != 2) {
                        if (i == 3) {
                            JSONObject b2 = C1326v.m1976b(Thread.currentThread().getName());
                            if (b2 != null) {
                                aVar.mo12474a("all_thread_stacks", (Object) b2);
                            }
                            b = C1384k.m2261b(C1250h.m1614f());
                            str2 = "logcat";
                        } else if (i != 4) {
                            if (i == 5) {
                                b = str3;
                                str2 = "crash_uuid";
                            }
                        } else if (!c) {
                            C1295a.m1775a(C1247d.this.f1167a, aVar.mo12488h());
                        }
                        aVar.mo12474a(str2, b);
                    } else {
                        if (c) {
                            C1295a.m1775a(C1247d.this.f1167a, aVar.mo12488h());
                        }
                        JSONArray c = C1197g.m1357b().mo12425c();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a = C1197g.m1357b().mo12422a(uptimeMillis).mo12430a();
                        JSONArray a2 = C1214k.m1408a(100, uptimeMillis);
                        aVar.mo12474a("history_message", (Object) c);
                        aVar.mo12474a("current_message", (Object) a);
                        aVar.mo12474a("pending_messages", (Object) a2);
                        aVar.mo12469a("disable_looper_monitor", String.valueOf(C1351a.m2104d()));
                        valueOf = String.valueOf(C1217b.m1417a());
                        str = "npth_force_apm_crash";
                    }
                    return aVar;
                }
                aVar.mo12474a("data", (Object) C1326v.m1960a(th2));
                aVar.mo12474a("isOOM", (Object) Boolean.valueOf(c));
                aVar.mo12474a("isJava", (Object) 1);
                aVar.mo12474a("crash_time", (Object) Long.valueOf(j2));
                aVar.mo12474a("launch_mode", (Object) Integer.valueOf(C1353b.m2126b()));
                aVar.mo12474a("launch_time", (Object) Long.valueOf(C1353b.m2131c()));
                String str4 = str4;
                if (str4 != null) {
                    aVar.mo12474a("crash_md5", (Object) str4);
                    aVar.mo12469a("crash_md5", str4);
                    boolean z = z2;
                    if (z) {
                        valueOf = String.valueOf(z);
                        str = "has_ignore";
                    }
                }
                return aVar;
                aVar.mo12469a(str, valueOf);
                return aVar;
            }

            /* renamed from: a */
            public C1227a mo12531a(int i, C1227a aVar, boolean z) {
                if (C1322r.m1939a(C1322r.m1940b(i))) {
                    return aVar;
                }
                try {
                    File file = file2;
                    C1308i.m1829a(new File(file, file2.getName() + "." + i), aVar.mo12488h(), false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }

            /* renamed from: a */
            public void mo12532a(Throwable th) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a.mo12469a("crash_type", Constants.NORMAL);
            a.mo12476b("crash_cost", String.valueOf(currentTimeMillis));
            a.mo12469a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th3);
        }
        if (!C1322r.m1939a(4)) {
            boolean a2 = C1322r.m1939a(2048);
        }
    }

    /* renamed from: a */
    public boolean mo12529a(Throwable th) {
        return true;
    }
}
