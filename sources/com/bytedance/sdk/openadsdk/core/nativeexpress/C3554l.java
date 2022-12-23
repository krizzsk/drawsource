package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p093b.C2549a;
import com.bytedance.sdk.component.adexpress.p093b.C2552c;
import com.bytedance.sdk.component.adexpress.p093b.C2556f;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.C3502k;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.l */
/* compiled from: NativeRender */
public class C3554l extends C2549a<BackupView> {

    /* renamed from: a */
    AtomicBoolean f8956a = new AtomicBoolean(false);

    /* renamed from: b */
    private BackupView f8957b;

    /* renamed from: c */
    private View f8958c;

    /* renamed from: d */
    private C2552c f8959d;

    /* renamed from: e */
    private C2556f f8960e;

    /* renamed from: f */
    private C2563l f8961f;

    public C3554l(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C2563l lVar) {
        this.f8958c = view;
        this.f8961f = lVar;
    }

    /* renamed from: a */
    public void mo16641a(C2556f fVar) {
        this.f8960e = fVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m11194b();
        } else {
            C3502k.m10922d().post(new Runnable() {
                public void run() {
                    C3554l.this.m11194b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11194b() {
        if (!this.f8956a.get()) {
            C2552c cVar = this.f8959d;
            boolean z = false;
            if (cVar != null && cVar.mo16640a((NativeExpressView) this.f8958c, 0)) {
                z = true;
            }
            if (!z) {
                this.f8960e.mo16638a(107);
                return;
            }
            this.f8961f.mo16673c().mo16655e();
            BackupView backupView = (BackupView) this.f8958c.findViewWithTag("tt_express_backup_fl_tag_26");
            this.f8957b = backupView;
            if (backupView != null) {
                C2565m mVar = new C2565m();
                BackupView backupView2 = this.f8957b;
                float f = 0.0f;
                float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
                BackupView backupView3 = this.f8957b;
                if (backupView3 != null) {
                    f = backupView3.getRealHeight();
                }
                mVar.mo16707a(true);
                mVar.mo16703a((double) realWidth);
                mVar.mo16710b((double) f);
                this.f8960e.mo16639a(this.f8957b, mVar);
                return;
            }
            this.f8960e.mo16638a(107);
        }
    }

    /* renamed from: a */
    public BackupView mo16642e() {
        return this.f8957b;
    }

    /* renamed from: a */
    public void mo16631a(C2552c cVar) {
        this.f8959d = cVar;
    }
}
