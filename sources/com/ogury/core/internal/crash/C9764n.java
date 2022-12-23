package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9732av;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.n */
/* compiled from: OguryPackageExtractor.kt */
public final class C9764n {

    /* renamed from: a */
    private final C9750f f24664a;

    public C9764n(C9750f fVar) {
        C9717ai.m28145b(fVar, "crashReportDao");
        this.f24664a = fVar;
    }

    /* renamed from: a */
    public final String mo64118a(String str) {
        C9717ai.m28145b(str, "stackTrace");
        Set<String> a = this.f24664a.mo64100a();
        if (a == null) {
            return null;
        }
        for (String next : a) {
            if (C9732av.m28162a((CharSequence) str, (CharSequence) next, false, 2)) {
                return next;
            }
        }
        return null;
    }
}
