package com.mbridge.msdk.foundation.same.net.p310e;

import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.b */
/* compiled from: HttpResponse */
public final class C8534b {

    /* renamed from: a */
    private final int f20909a;

    /* renamed from: b */
    private final List<C8513b> f20910b;

    /* renamed from: c */
    private final InputStream f20911c;

    public C8534b(int i, List<C8513b> list, InputStream inputStream) {
        this.f20909a = i;
        this.f20910b = list;
        this.f20911c = inputStream;
    }

    /* renamed from: a */
    public final int mo57957a() {
        return this.f20909a;
    }

    /* renamed from: b */
    public final List<C8513b> mo57958b() {
        return Collections.unmodifiableList(this.f20910b);
    }

    /* renamed from: c */
    public final InputStream mo57959c() {
        return this.f20911c;
    }
}
