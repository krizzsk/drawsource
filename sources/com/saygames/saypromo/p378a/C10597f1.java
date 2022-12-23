package com.saygames.saypromo.p378a;

import android.util.Base64;
import kotlin.text.Charsets;

/* renamed from: com.saygames.saypromo.a.f1 */
public final class C10597f1 implements C10589e1 {
    C10597f1() {
    }

    /* renamed from: a */
    public final String mo65452a(String str) {
        return new String(Base64.decode(str, 0), Charsets.UTF_8);
    }

    /* renamed from: b */
    public final String mo65453b(String str) {
        return Base64.encodeToString(str.getBytes(Charsets.UTF_8), 2);
    }
}
