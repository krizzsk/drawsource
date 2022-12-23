package com.bytedance.sdk.openadsdk.p174i;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.bytedance.sdk.openadsdk.i.b */
/* compiled from: StatsImageListener */
public class C3790b implements C2832n<Bitmap> {

    /* renamed from: a */
    private boolean f9762a;

    /* renamed from: b */
    private C3752b f9763b;

    /* renamed from: a */
    public void mo20609a(String str) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20547c(str);
        }
    }

    /* renamed from: a */
    public void mo20608a(int i) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20542a(i);
        }
    }

    /* renamed from: b */
    public void mo20610b(String str) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20551e(str);
        }
    }

    /* renamed from: c */
    public void mo20611c(String str) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20549d(str);
        }
    }

    /* renamed from: d */
    public void mo20612d(String str) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20555g(str);
        }
    }

    public C3790b(boolean z) {
        this.f9762a = z;
        if (z) {
            this.f9763b = C3752b.m12257b();
        }
    }

    /* renamed from: a */
    public void mo17179a(C2828j<Bitmap> jVar) {
        if (this.f9762a && this.f9763b != null) {
            if (jVar == null || jVar.mo17647b() == null) {
                this.f9763b.mo20545b((int) ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR).mo20553f(C3446g.m10553a(ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR));
                C3753b.m12287a().mo20580e(this.f9763b);
            }
        }
    }

    /* renamed from: a */
    public void mo17178a(int i, String str, Throwable th) {
        C3752b bVar;
        if (this.f9762a && (bVar = this.f9763b) != null) {
            bVar.mo20545b((int) ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR).mo20553f(C3446g.m10553a(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR));
            C3753b.m12287a().mo20580e(this.f9763b);
        }
    }
}
