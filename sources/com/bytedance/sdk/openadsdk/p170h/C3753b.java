package com.bytedance.sdk.openadsdk.p170h;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3388c;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.b */
/* compiled from: StatsLogManager */
public class C3753b {

    /* renamed from: a */
    private static volatile C3753b f9695a;

    /* renamed from: b */
    private ExecutorService f9696b = Executors.newFixedThreadPool(5);

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m12292g(C3752b bVar) {
        return bVar == null;
    }

    private C3753b() {
    }

    /* renamed from: a */
    public static C3753b m12287a() {
        if (f9695a == null) {
            synchronized (C3753b.class) {
                if (f9695a == null) {
                    f9695a = new C3753b();
                }
            }
        }
        return f9695a;
    }

    /* renamed from: a */
    public void mo20568a(final C3752b bVar) {
        if (!m12292g(bVar)) {
            bVar.mo20543a(System.currentTimeMillis() / 1000);
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo20575b(final C3752b bVar) {
        if (!m12292g(bVar)) {
            bVar.mo20544a("express_ad_render");
            bVar.mo20543a(System.currentTimeMillis() / 1000);
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12290a(String str, int i) {
        C3388c a = C3388c.m10078a(C3513m.m10963a());
        boolean z = false;
        int b = a.mo19368b(str, 0);
        if ((b & 2) == 0 || (b & 1) != i) {
            z = true;
        }
        if (z) {
            a.mo19364a(str, i + 2);
        }
        return z;
    }

    /* renamed from: c */
    public void mo20578c(final C3752b bVar) {
        if (!m12292g(bVar)) {
            this.f9696b.execute(new Runnable() {
                public void run() {
                    if (!C3753b.this.m12292g(bVar) && C3753b.this.m12290a(bVar.mo20552e(), 1)) {
                        bVar.mo20544a("reg_creative");
                        C3513m.m10974i().mo20586a(new C3750a() {
                            /* renamed from: a */
                            public C3751a mo18582a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo20579d(final C3752b bVar) {
        if (!m12292g(bVar)) {
            this.f9696b.execute(new Runnable() {
                public void run() {
                    if (!C3753b.this.m12292g(bVar) && C3753b.this.m12290a(bVar.mo20552e(), 0)) {
                        bVar.mo20544a("no_reg_creative");
                        C3513m.m10974i().mo20586a(new C3750a() {
                            /* renamed from: a */
                            public C3751a mo18582a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo20580e(final C3752b bVar) {
        if (!m12292g(bVar)) {
            bVar.mo20544a("load_icon_error");
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: f */
    public void mo20581f(final C3752b bVar) {
        if (!m12292g(bVar)) {
            bVar.mo20544a("show_backup_endcard");
            bVar.mo20543a(System.currentTimeMillis() / 1000);
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20574a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final C3752b b = C3752b.m12257b().mo20544a("app_env").mo20543a(System.currentTimeMillis() / 1000).mo20546b(jSONObject.toString());
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return b;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20570a(final String str) {
        C3513m.m10974i().mo20587a(new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return C3752b.m12257b().mo20544a("click_playable_test_tool").mo20546b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: b */
    public void mo20576b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
        } catch (Throwable unused) {
        }
        final C3752b b = C3752b.m12257b().mo20544a("close_playable_test_tool").mo20546b(jSONObject.toString());
        C3513m.m10974i().mo20587a(new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20571a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
            jSONObject.put("error_code", i);
            jSONObject.put("error_message", str2);
        } catch (Throwable unused) {
        }
        final C3752b b = C3752b.m12257b().mo20544a("use_playable_test_tool_error").mo20546b(jSONObject.toString());
        C3513m.m10974i().mo20587a(new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20567a(long j, long j2, int i) {
        final long j3 = j2 - j;
        final long j4 = j;
        final long j5 = j2;
        final int i2 = i;
        C3513m.m10974i().mo20587a(new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j4);
                    jSONObject.put("endtime", j5);
                    jSONObject.put("start_type", i2);
                } catch (Throwable unused) {
                }
                C3752b a = C3752b.m12257b().mo20544a("general_label");
                return a.mo20557h(j3 + "").mo20546b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: a */
    public void mo20572a(final String str, long j) {
        if (!C2361a.m5461b()) {
            final long currentTimeMillis = System.currentTimeMillis() - j;
            C3513m.m10974i().mo20587a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", currentTimeMillis);
                        jSONObject.put("method_name", str);
                    } catch (Throwable unused) {
                    }
                    return C3752b.m12257b().mo20544a("log_mssdk_method_time_report").mo20546b(jSONObject.toString());
                }
            }, false);
        }
    }

    /* renamed from: a */
    public void mo20573a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            final C3752b b = C3752b.m12257b().mo20544a(str).mo20546b(jSONObject.toString());
            C3513m.m10974i().mo20587a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return b;
                }
            }, false);
        }
    }

    /* renamed from: b */
    public static void m12291b() {
        try {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    long a = m12286a(file2);
                    j += a;
                    jSONObject.put(file2.getName(), a);
                }
            }
            if (j >= 524288000) {
                final C3752b b = C3752b.m12257b().mo20544a("disk_log").mo20546b(jSONObject.toString());
                C3513m.m10974i().mo20587a(new C3750a() {
                    /* renamed from: a */
                    public C3751a mo18582a() throws Exception {
                        return b;
                    }
                }, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo20577c() {
        try {
            C3513m.m10974i().mo20587a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return C3752b.m12257b().mo20544a("bidding_get_creative");
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static long m12286a(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File a : file.listFiles()) {
            j += m12286a(a);
        }
        return j;
    }

    /* renamed from: a */
    public void mo20569a(C3750a aVar) {
        C3513m.m10974i().mo20587a(aVar, false);
    }
}
