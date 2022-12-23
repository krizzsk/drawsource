package com.tapjoy.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.is */
public abstract class C11630is<Result> extends C11313bt<Result> {
    /* renamed from: b */
    public final String mo69756b() {
        return ShareTarget.METHOD_POST;
    }

    /* renamed from: d */
    public final String mo69758d() {
        return "application/json";
    }

    /* renamed from: e */
    public Map<String, Object> mo69759e() {
        Map<String, Object> e = super.mo69759e();
        C11558hj a = C11558hj.m31644a();
        e.put("sdk_ver", a.f27751l + "/Android");
        e.put(TapjoyConstants.TJC_API_KEY, a.f27750k);
        if (C11554hg.f27724a) {
            e.put("debug", Boolean.TRUE);
        }
        return e;
    }

    /* renamed from: f */
    public Result mo69760f() {
        try {
            return super.mo69760f();
        } catch (Exception e) {
            Object[] objArr = new Object[1];
            throw e;
        }
    }

    @Nullable
    /* renamed from: a */
    public Result mo69752a(C11296bh bhVar) {
        bhVar.mo69733s();
        return null;
    }
}
