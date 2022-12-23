package p397e;

import android.text.TextUtils;
import android.util.Log;
import p001a.C0000a;

/* renamed from: e.c */
public final class C12467c {
    /* renamed from: a */
    public static void m33302a(String str) {
        if (C0000a.f0a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m33303a(String str, Exception exc) {
        if ((C0000a.f0a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
