package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.tapjoy.internal.iv */
public final class C11634iv extends C11630is<Void> {

    /* renamed from: c */
    private final C11450fc f28031c;

    /* renamed from: d */
    private final C11432ew f28032d;

    /* renamed from: e */
    private final C11471fj f28033e;

    /* renamed from: f */
    private final String f28034f;

    /* renamed from: c */
    public final String mo69757c() {
        return "api/v1/tokens";
    }

    private C11634iv(C11450fc fcVar, C11432ew ewVar, C11471fj fjVar, String str) {
        this.f28031c = fcVar;
        this.f28032d = ewVar;
        this.f28033e = fjVar;
        this.f28034f = str;
    }

    public C11634iv(C11453fd fdVar, String str) {
        this(fdVar.f27417d, fdVar.f27418e, fdVar.f27419f, str);
    }

    /* renamed from: e */
    public final Map<String, Object> mo69759e() {
        Map<String, Object> e = super.mo69759e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C11295bg(C11592hz.m31780a(this.f28031c)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C11295bg(C11592hz.m31776a(this.f28032d)));
        e.put("user", new C11295bg(C11592hz.m31781a(this.f28033e)));
        if (!TextUtils.isEmpty(this.f28034f)) {
            e.put("push_token", this.f28034f);
        }
        return e;
    }
}
