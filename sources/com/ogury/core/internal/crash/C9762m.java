package com.ogury.core.internal.crash;

import android.content.Context;
import com.facebook.share.internal.ShareInternalUtility;
import com.ogury.core.internal.C9710ab;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9731au;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.m */
/* compiled from: FileStore.kt */
public final class C9762m {

    /* renamed from: a */
    private final File f24663a;

    static {
        new C9763a((byte) 0);
    }

    public C9762m(Context context) {
        C9717ai.m28145b(context, "context");
        File file = new File(context.getFilesDir(), "oguryCrashDir");
        this.f24663a = file;
        file.mkdirs();
    }

    /* renamed from: com.ogury.core.internal.crash.m$a */
    /* compiled from: FileStore.kt */
    public static final class C9763a {
        private C9763a() {
        }

        public /* synthetic */ C9763a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64115a(String str) {
        C9717ai.m28145b(str, "sdkKey");
        new File(this.f24663a, m28215d(str)).createNewFile();
        new File(this.f24663a, m28216e(str)).createNewFile();
    }

    /* renamed from: d */
    private static String m28215d(String str) {
        return "crash_" + str;
    }

    /* renamed from: e */
    private static String m28216e(String str) {
        return "crash_level_two_crashes_" + str;
    }

    /* renamed from: a */
    public static void m28213a(File file) {
        C9717ai.m28145b(file, ShareInternalUtility.STAGING_PARAM);
        try {
            new PrintWriter(file).print("");
        } catch (Exception e) {
            C9754i iVar = C9754i.f24647a;
            C9754i.m28207a(e);
        }
    }

    /* renamed from: b */
    public final File mo64116b(String str) {
        C9717ai.m28145b(str, "sdkKey");
        return new File(this.f24663a, m28216e(str));
    }

    /* renamed from: c */
    public final File mo64117c(String str) {
        C9717ai.m28145b(str, "sdkKey");
        return new File(this.f24663a, m28215d(str));
    }

    /* renamed from: a */
    public final File mo64114a(String str, int i) {
        C9717ai.m28145b(str, "sdkKey");
        if (i == 1) {
            return mo64117c(str);
        }
        if (i == 2) {
            return mo64116b(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m28214b(File file) throws Exception {
        C9717ai.m28145b(file, ShareInternalUtility.STAGING_PARAM);
        try {
            return new JSONArray(C9710ab.m28134a(file, C9731au.f24608a));
        } catch (Exception e) {
            C9754i iVar = C9754i.f24647a;
            C9754i.m28207a(e);
            return new JSONArray();
        }
    }
}
