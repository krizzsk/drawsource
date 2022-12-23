package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.component.adexpress.p093b.C2558h;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.i */
/* compiled from: ExpressRenderEventMonitor */
public class C3549i implements C2558h {

    /* renamed from: a */
    private C3118u f8943a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f8944b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3431n f8945c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f8946d;

    /* renamed from: e */
    private long f8947e;

    /* renamed from: f */
    private long f8948f;

    public C3549i(C3118u uVar, String str, C3431n nVar, String str2) {
        this.f8943a = uVar;
        this.f8944b = str;
        this.f8946d = str2;
        this.f8945c = nVar;
    }

    /* renamed from: a */
    public void mo16645a() {
        this.f8943a.mo18718a();
        C2905l.m8111b("ExpressRenderEvent", "start render ");
    }

    /* renamed from: a */
    public void mo16648a(boolean z) {
        this.f8943a.mo18726b(z ? 1 : 0);
        C2905l.m8111b("ExpressRenderEvent", "webview start request");
    }

    /* renamed from: b */
    public void mo16649b() {
        C2905l.m8111b("ExpressRenderEvent", "WebView start load");
    }

    /* renamed from: c */
    public void mo16651c() {
        C2905l.m8111b("ExpressRenderEvent", "webview render success");
        this.f8943a.mo18725b();
    }

    /* renamed from: a */
    public void mo16646a(int i) {
        this.f8943a.mo18719a(i);
        C3548h.m11162a(i, this.f8944b, this.f8946d, this.f8945c);
        C2905l.m8111b("ExpressRenderEvent", "WebView render fail");
    }

    /* renamed from: b */
    public void mo16650b(int i) {
        C2905l.m8111b("ExpressRenderEvent", "dynamic start render");
        this.f8947e = System.currentTimeMillis();
        if (i == 3) {
            this.f8943a.mo18732c("dynamic_render2_start");
        } else {
            this.f8943a.mo18732c("dynamic_render_start");
        }
    }

    /* renamed from: c */
    public void mo16652c(int i) {
        if (i == 3) {
            this.f8943a.mo18734d("dynamic_sub_analysis2_start");
        } else {
            this.f8943a.mo18734d("dynamic_sub_analysis_start");
        }
    }

    /* renamed from: d */
    public void mo16654d(int i) {
        if (i == 3) {
            this.f8943a.mo18734d("dynamic_sub_analysis2_end");
        } else {
            this.f8943a.mo18734d("dynamic_sub_analysis_end");
        }
    }

    /* renamed from: e */
    public void mo16656e(int i) {
        if (i == 3) {
            this.f8943a.mo18734d("dynamic_sub_render2_start");
        } else {
            this.f8943a.mo18734d("dynamic_sub_render_start");
        }
    }

    /* renamed from: f */
    public void mo16658f(int i) {
        if (i == 3) {
            this.f8943a.mo18734d("dynamic_sub_render2_end");
        } else {
            this.f8943a.mo18734d("dynamic_sub_render_end");
        }
    }

    /* renamed from: g */
    public void mo16660g(int i) {
        final String str;
        this.f8948f = System.currentTimeMillis();
        C2905l.m8111b("ExpressRenderEvent", "dynamic render success render type: " + i + "; ****cost time(ms): " + (this.f8948f - this.f8947e) + "****");
        if (i == 3) {
            this.f8943a.mo18736e("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f8943a.mo18736e("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f8943a.mo18724a(true);
        C2882e.m8041b((C2885g) new C2885g("dynamic_success") {
            public void run() {
                C3090e.m8922c(C3513m.m10963a(), C3549i.this.f8945c, C3549i.this.f8944b, str, (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: a */
    public void mo16647a(int i, int i2, boolean z) {
        C2905l.m8111b("ExpressRenderEvent", "dynamic fail");
        if (!z) {
            this.f8943a.mo18724a(true);
        }
        if (i == 3) {
            this.f8943a.mo18727b(i2, "dynamic_render2_error");
        } else {
            this.f8943a.mo18727b(i2, "dynamic_render_error");
        }
        C3548h.m11162a(i2, this.f8944b, this.f8946d, this.f8945c);
    }

    /* renamed from: d */
    public void mo16653d() {
        C2905l.m8111b("ExpressRenderEvent", "native render start");
        this.f8943a.mo18731c();
    }

    /* renamed from: e */
    public void mo16655e() {
        C2905l.m8111b("ExpressRenderEvent", "native success");
        this.f8943a.mo18724a(true);
        this.f8943a.mo18745n();
        C2882e.m8041b((C2885g) new C2885g("native_success") {
            public void run() {
                C3548h.m11163a(C3549i.this.f8944b, C3549i.this.f8946d, C3549i.this.f8945c);
                C3090e.m8922c(C3513m.m10963a(), C3549i.this.f8945c, C3549i.this.f8944b, "dynamic_backup_render", (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: f */
    public void mo16657f() {
        C2905l.m8111b("ExpressRenderEvent", "no native render");
        this.f8943a.mo18746o();
    }

    /* renamed from: g */
    public void mo16659g() {
        C2905l.m8111b("ExpressRenderEvent", "render fail");
        this.f8943a.mo18747p();
    }

    /* renamed from: h */
    public void mo16661h() {
        C2905l.m8111b("ExpressRenderEvent", "render success");
        this.f8943a.mo18725b();
    }

    /* renamed from: i */
    public void mo20094i() {
        this.f8943a.mo18743l();
        this.f8943a.mo18744m();
    }
}
