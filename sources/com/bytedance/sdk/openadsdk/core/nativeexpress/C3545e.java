package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.e */
/* compiled from: ExpressClickCreativeListener */
public class C3545e extends C3359a {
    public C3545e(Context context, C3431n nVar, String str, int i) {
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
        float f11;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
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
                float f12 = (float) i4;
                float b2 = C3904y.m12868b(this.f8046b, f2);
                float f13 = (float) i3;
                f8 = (C3904y.m12868b(this.f8046b, f3) + f12) - 0.5f;
                f7 = (C3904y.m12868b(this.f8046b, f4) + f13) - 0.5f;
                f9 = (b2 + f13) - 0.5f;
                f10 = (b + f12) - 0.5f;
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
            f11 = f8;
            j3 = this.f8047c.f8270f;
            if (this.f8062r == 0) {
                iArr[0] = ((int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8271g)) + i4;
                iArr[1] = ((int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8272h)) + i3;
                i7 = (int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8273i);
                i6 = (int) C3904y.m12868b(this.f8046b, (float) this.f8047c.f8274j);
                i5 = 1;
            } else {
                iArr[0] = this.f8047c.f8271g;
                i5 = 1;
                iArr[1] = this.f8047c.f8272h;
                i7 = this.f8047c.f8273i;
                i6 = this.f8047c.f8274j;
            }
            iArr2[0] = i7;
            iArr2[i5] = i6;
            if (i7 == 0 && i6 == 0 && view2 != null) {
                iArr = C3904y.m12867a(view2);
                iArr2 = C3904y.m12880c(view2);
            }
        } else {
            i5 = 1;
            f11 = f8;
            j4 = j;
            j3 = j2;
        }
        this.f8062r = 0;
        return new C3409g.C3411a().mo19441f(f10).mo19439e(f9).mo19436d(f11).mo19433c(f7).mo19431b(j4).mo19423a(j3).mo19432b(a).mo19427a(iArr).mo19435c(C3904y.m12880c(view)).mo19438d(iArr2).mo19437d(this.f8081y).mo19440e(this.f8082z).mo19442f(this.f8069A).mo19430b(C3457h.m10580d().mo19752b() ? i5 : 2).mo19424a(sparseArray).mo19425a(str).mo19421a(f5).mo19434c(i).mo19429b(f6).mo19422a(i2).mo19426a(jSONObject).mo19428a();
    }

    /* renamed from: a */
    public void mo20092a(C3414j jVar) {
        this.f8047c = jVar;
    }
}
