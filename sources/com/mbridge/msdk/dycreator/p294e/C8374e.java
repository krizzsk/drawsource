package com.mbridge.msdk.dycreator.p294e;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: com.mbridge.msdk.dycreator.e.e */
/* compiled from: InflaterUtil */
public class C8374e {

    /* renamed from: a */
    private static volatile C8374e f20436a;

    /* renamed from: b */
    private C6811b f20437b = null;

    /* renamed from: a */
    public static C8374e m23828a(Context context) {
        if (f20436a == null) {
            synchronized (C8374e.class) {
                if (f20436a == null) {
                    f20436a = new C8374e(context.getApplicationContext());
                }
            }
        }
        return f20436a;
    }

    private C8374e(Context context) {
        C6811b a = C6811b.m20739a();
        this.f20437b = a;
        a.mo37129a(context, "");
    }

    /* renamed from: a */
    public final View mo56879a(String str) {
        if (new File(str).exists()) {
            return this.f20437b.mo37137f(str);
        }
        return null;
    }

    /* renamed from: a */
    public final View mo56878a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            return this.f20437b.mo37127a(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
