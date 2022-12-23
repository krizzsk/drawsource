package com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a;

import android.content.Context;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.component.p123f.C2885g;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.b */
/* compiled from: DiskCache */
public class C2290b extends C2289a {

    /* renamed from: a */
    public final File f4599a;

    /* renamed from: a */
    public void mo15694a() {
        C2361a.m5450a((C2885g) new C2885g("clear") {
            public void run() {
                C2290b.this.mo15695b();
            }
        });
    }

    /* renamed from: b */
    public void mo15695b() {
        C2315d.m5308c().mo15748d();
        Context a = C2325e.m5324a();
        if (a != null) {
            C2306c.m5297a(a).mo15729a(1);
        }
        for (File delete : this.f4599a.listFiles()) {
            try {
                delete.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public File mo15692c(String str) {
        return mo15696e(str);
    }

    /* renamed from: d */
    public File mo15693d(String str) {
        return mo15696e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public File mo15696e(String str) {
        return new File(this.f4599a, str);
    }
}
