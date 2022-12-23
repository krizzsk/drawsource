package com.bytedance.sdk.openadsdk.p170h.p173c;

import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.openadsdk.multipro.p183c.C3952a;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3897w;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.d */
/* compiled from: LogUploaderImpl4MultiProcess */
public class C3779d implements C3773a {
    /* renamed from: b */
    public void mo20588b() {
    }

    /* renamed from: a */
    public void mo20585a() {
        C3952a.m12979e();
    }

    /* renamed from: a */
    public void mo20586a(final C3750a aVar) {
        try {
            C3897w.m12745a(new C2885g("uploadEvent") {
                public void run() {
                    try {
                        C3952a.m12976b(aVar.mo18582a().mo20541a().toString());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m12344b(C3750a aVar) throws Exception {
        return new C3775c.C3778a(C3885n.m12675a(), aVar.mo18582a().mo20541a()).mo20594a();
    }

    /* renamed from: a */
    public void mo20587a(final C3750a aVar, final boolean z) {
        try {
            C3897w.m12745a(new C2885g("uploadEvent") {
                public void run() {
                    try {
                        C3952a.m12973a(C3779d.this.m12344b(aVar), z);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
