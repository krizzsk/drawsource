package com.bytedance.sdk.openadsdk.core.p154j.p155a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.b */
/* compiled from: VastXmlParser */
public abstract class C3480b {

    /* renamed from: e */
    public static int f8691e;

    /* renamed from: a */
    protected int f8692a;

    /* renamed from: b */
    protected final Context f8693b;

    /* renamed from: c */
    protected int f8694c = Integer.MIN_VALUE;

    /* renamed from: d */
    protected double f8695d = Double.MIN_VALUE;

    public C3480b(Context context, int i, int i2) {
        if (i2 > 0 && i > 0) {
            this.f8695d = ((double) i) / ((double) i2);
        }
        float e = C3904y.m12885e(context);
        if (e != 0.0f) {
            this.f8694c = (int) (((float) i) / e);
        }
        this.f8693b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19914a(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            C3753b.m12287a().mo20573a("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19915a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Integer.parseInt(str) < 2) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo19913a(String str, List<C3487c> list) {
        String str2;
        int i = this.f8692a;
        if (i >= 5) {
            return null;
        }
        this.f8692a = i + 1;
        if (str == null) {
            return null;
        }
        try {
            C2846b c = C3792d.m12395a().mo20615b().mo17684c();
            c.mo17711a(str);
            C2843b a = c.mo17707a();
            str2 = a.mo17699d();
            try {
                a.mo17695a();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = null;
            mo19914a(e, 0);
            if (!list.isEmpty()) {
                C3487c.m10849b(list, C3474a.WRAPPER_TIMEOUT, -1, (String) null);
            }
            return str2;
        }
        return str2;
    }
}
