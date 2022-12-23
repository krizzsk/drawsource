package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.hu */
public final class C10104hu {

    /* renamed from: a */
    public static final C10105a f25369a = new C10105a((byte) 0);

    /* renamed from: b */
    private final Context f25370b;

    /* renamed from: c */
    private final SharedPreferences f25371c;

    public C10104hu(Context context) {
        C10263mq.m29882b(context, "context");
        this.f25370b = context;
        this.f25371c = context.getSharedPreferences("PERSISTED_SETS", 0);
    }

    /* renamed from: com.ogury.ed.internal.hu$a */
    public static final class C10105a {
        public /* synthetic */ C10105a(byte b) {
            this();
        }

        private C10105a() {
        }
    }

    /* renamed from: a */
    public final boolean mo64855a(String str) {
        C10263mq.m29882b(str, "identifier");
        Set<String> stringSet = this.f25371c.getStringSet("shortcutIdentifierList", (Set) null);
        if (stringSet == null) {
            return false;
        }
        return stringSet.contains(str);
    }

    /* renamed from: a */
    public final String mo64854a(String str, String str2) {
        C10263mq.m29882b(str, "id");
        C10263mq.m29882b(str2, "argsJson");
        this.f25371c.edit().putString(C10263mq.m29874a("argsJson:", (Object) str), str2).apply();
        return str;
    }

    /* renamed from: b */
    public final String mo64856b(String str) {
        C10263mq.m29882b(str, "id");
        String string = this.f25371c.getString(C10263mq.m29874a("argsJson:", (Object) str), "");
        return string == null ? "" : string;
    }

    /* renamed from: c */
    public final boolean mo64857c(String str) {
        C10263mq.m29882b(str, "id");
        String string = this.f25371c.getString(C10263mq.m29874a("argsJson:", (Object) str), "");
        return string != null && string.length() > 0;
    }
}
