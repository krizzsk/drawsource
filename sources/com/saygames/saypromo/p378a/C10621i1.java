package com.saygames.saypromo.p378a;

import android.content.Context;
import java.io.File;

/* renamed from: com.saygames.saypromo.a.i1 */
public final class C10621i1 implements C10613h1 {

    /* renamed from: a */
    private final File f26202a;

    /* renamed from: b */
    private final File f26203b;

    /* renamed from: c */
    private final File f26204c;

    C10621i1(Context context) {
        this.f26202a = context.getCacheDir();
        this.f26203b = context.getFilesDir();
        this.f26204c = context.getExternalCacheDir();
    }

    /* renamed from: a */
    public final File mo65479a() {
        return this.f26204c;
    }

    /* renamed from: b */
    public final File mo65480b() {
        return this.f26202a;
    }

    /* renamed from: c */
    public final File mo65481c() {
        return this.f26203b;
    }
}
