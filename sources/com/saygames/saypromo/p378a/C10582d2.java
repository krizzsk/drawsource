package com.saygames.saypromo.p378a;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.d2 */
public final class C10582d2 implements C10574c2 {

    /* renamed from: a */
    private final SimpleDateFormat f26095a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);

    C10582d2() {
    }

    /* renamed from: a */
    public final String mo65437a(long j) {
        return this.f26095a.format(Long.valueOf(Duration.m35162getInWholeMillisecondsimpl(j)));
    }
}
