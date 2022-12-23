package com.saygames.saypromo.p378a;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.p403io.FilesKt;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.n1 */
public final class C10661n1 implements C10637k1 {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f26272c = {C10532W4.m30277a(C10661n1.class, "cacheDirectories", "getCacheDirectories()Lcom/saygames/saypromo/common/CacheDirectories;", 0)};

    /* renamed from: a */
    private final C10484P4 f26273a;

    /* renamed from: b */
    private final File f26274b;

    C10661n1(C10491Q4 q4) {
        this.f26273a = q4;
        File a = ((C10621i1) m30522b()).mo65479a();
        if (a == null) {
            this.f26274b = new File(((C10621i1) m30522b()).mo65480b(), "SayPromo");
        } else {
            this.f26274b = new File(a, "SayPromo");
            FilesKt.deleteRecursively(new File(a, "SPCache"));
        }
        try {
            C10434I3.m30173a(new File(mo65505c(), ".nomedia"));
        } catch (Throwable unused) {
        }
        try {
            m30520a(((C10621i1) m30522b()).mo65481c(), C10645l1.f26255a);
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private static void m30520a(File file, Function1 function1) {
        File[] listFiles = file.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return C10661n1.m30521a(Function1.this, file, str);
            }
        });
        if (listFiles != null) {
            for (File deleteRecursively : listFiles) {
                FilesKt.deleteRecursively(deleteRecursively);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m30521a(Function1 function1, File file, String str) {
        return ((Boolean) function1.invoke(str)).booleanValue();
    }

    /* renamed from: b */
    private final C10613h1 m30522b() {
        C10484P4 p4 = this.f26273a;
        KProperty kProperty = f26272c[0];
        return (C10613h1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final Unit mo65504a() {
        try {
            m30520a(this.f26274b, C10653m1.f26262a);
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final File mo65505c() {
        return this.f26274b;
    }
}
