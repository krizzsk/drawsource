package com.ogury.p377ed.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ob */
public final class C10308ob implements Serializable {

    /* renamed from: a */
    public static final C10309a f25645a = new C10309a((byte) 0);

    /* renamed from: b */
    private final Pattern f25646b;

    public C10308ob(Pattern pattern) {
        C10263mq.m29882b(pattern, "nativePattern");
        this.f25646b = pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10308ob(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.ogury.p377ed.internal.C10263mq.m29882b(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10308ob.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo65164a(CharSequence charSequence) {
        C10263mq.m29882b(charSequence, "input");
        return this.f25646b.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final List<String> mo65165b(CharSequence charSequence) {
        C10263mq.m29882b(charSequence, "input");
        int i = 0;
        C10312oc.m29963a(0);
        Matcher matcher = this.f25646b.matcher(charSequence);
        if (!matcher.find()) {
            return C10190km.m29753a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f25646b.toString();
        C10263mq.m29879a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f25646b.pattern();
        C10263mq.m29879a((Object) pattern, "nativePattern.pattern()");
        return new C10310b(pattern, this.f25646b.flags());
    }

    /* renamed from: com.ogury.ed.internal.ob$b */
    static final class C10310b implements Serializable {

        /* renamed from: a */
        public static final C10311a f25647a = new C10311a((byte) 0);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f25648b;

        /* renamed from: c */
        private final int f25649c;

        /* renamed from: com.ogury.ed.internal.ob$b$a */
        public static final class C10311a {
            private C10311a() {
            }

            public /* synthetic */ C10311a(byte b) {
                this();
            }
        }

        public C10310b(String str, int i) {
            C10263mq.m29882b(str, "pattern");
            this.f25648b = str;
            this.f25649c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f25648b, this.f25649c);
            C10263mq.m29879a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C10308ob(compile);
        }
    }

    /* renamed from: com.ogury.ed.internal.ob$a */
    public static final class C10309a {
        private C10309a() {
        }

        public /* synthetic */ C10309a(byte b) {
            this();
        }
    }
}
