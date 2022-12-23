package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.f */
/* compiled from: ExpressClickListener */
public class C3546f extends C3360b {
    public C3546f(Context context, C3431n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3409g mo19302a(float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        long j4;
        int i7;
        char c;
        int i8;
        int[] a = C3904y.m12867a(view);
        if (a == null || a.length != 2) {
            f10 = f;
            f9 = f2;
            f8 = f3;
            f7 = f4;
            i4 = 0;
            i3 = 0;
        } else {
            i4 = a[0];
            i3 = a[1];
            if (this.f8062r == 0) {
                float b = C3904y.m12868b(this.f8046b, f);
                float f11 = (float) i4;
                float b2 = C3904y.m12868b(this.f8046b, f2);
                float f12 = (float) i3;
                f8 = (C3904y.m12868b(this.f8046b, f3) + f11) - 0.5f;
                f7 = (C3904y.m12868b(this.f8046b, f4) + f12) - 0.5f;
                f9 = (b2 + f12) - 0.5f;
                f10 = (b + f11) - 0.5f;
            } else {
                f10 = f;
                f9 = f2;
                f8 = f3;
                f7 = f4;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.f8047c != null) {
            j4 = this.f8047c.f8269e;
            int i9 = i4;
            j3 = this.f8047c.f8270f;
            if (this.f8062r == 0) {
                iArr[0] = ((int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8271g)) + i9;
                iArr[1] = ((int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8272h)) + i3;
                i8 = (int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8273i);
                i7 = (int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8274j);
                c = 0;
                i5 = 1;
            } else {
                c = 0;
                iArr[0] = this.f8047c.f8271g;
                i5 = 1;
                iArr[1] = this.f8047c.f8272h;
                i8 = this.f8047c.f8273i;
                i7 = this.f8047c.f8274j;
            }
            iArr2[c] = i8;
            iArr2[i5] = i7;
            if (i8 == 0 && i7 == 0 && view2 != null) {
                iArr = C3904y.m12867a(view2);
                iArr2 = C3904y.m12880c(view2);
            }
            i6 = 0;
        } else {
            i5 = 1;
            j4 = j;
            i6 = 0;
            j3 = j2;
        }
        this.f8062r = i6;
        return new C3409g.C3411a().mo19441f(f10).mo19439e(f9).mo19436d(f8).mo19433c(f7).mo19431b(j4).mo19423a(j3).mo19432b(a).mo19427a(iArr).mo19435c(C3904y.m12880c(view)).mo19438d(iArr2).mo19437d(this.f8081y).mo19440e(this.f8082z).mo19442f(this.f8069A).mo19430b(C3457h.m10580d().mo19752b() ? i5 : 2).mo19424a(sparseArray).mo19425a(str).mo19422a(i2).mo19426a(jSONObject).mo19428a();
    }

    /* renamed from: a */
    public void mo20093a(C3414j jVar) {
        this.f8047c = jVar;
    }
}
