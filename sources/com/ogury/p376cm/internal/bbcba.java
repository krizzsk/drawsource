package com.ogury.p376cm.internal;

import com.ogury.p376cm.internal.bbbaa;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: com.ogury.cm.internal.bbcba */
final class bbcba implements bbcac {

    /* renamed from: a */
    private final bbcab f24565a = new aaaab(this);

    /* renamed from: b */
    private List<String> f24566b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Matcher f24567c;

    /* renamed from: d */
    private final CharSequence f24568d;

    /* renamed from: com.ogury.cm.internal.bbcba$aaaaa */
    public static final class aaaaa extends bacab<String> {

        /* renamed from: b */
        final /* synthetic */ bbcba f24569b;

        aaaaa(bbcba bbcba) {
            this.f24569b = bbcba;
        }

        /* renamed from: a */
        public final int mo63956a() {
            return this.f24569b.f24567c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final /* synthetic */ Object get(int i) {
            String group = this.f24569b.f24567c.group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbcba$aaaab */
    public static final class aaaab extends bacaa<bbcaa> implements bbcab {

        /* renamed from: a */
        final /* synthetic */ bbcba f24570a;

        /* renamed from: com.ogury.cm.internal.bbcba$aaaab$aaaaa */
        static final class aaaaa extends bbaca implements bbaab<Integer, bbcaa> {

            /* renamed from: a */
            final /* synthetic */ aaaab f24571a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaaa(aaaab aaaab) {
                super(1);
                this.f24571a = aaaab;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo63791a(Object obj) {
                int intValue = ((Number) obj).intValue();
                aaaab aaaab = this.f24571a;
                MatchResult a = aaaab.f24570a.f24567c;
                bbbac a2 = bbbaa.aaaaa.m28059a(a.start(intValue), a.end(intValue));
                if (a2.mo64005a() < 0) {
                    return null;
                }
                String group = aaaab.f24570a.f24567c.group(intValue);
                bbabc.m28049a((Object) group, "matchResult.group(index)");
                return new bbcaa(group, a2);
            }
        }

        aaaab(bbcba bbcba) {
            this.f24570a = bbcba;
        }

        /* renamed from: a */
        public final int mo63956a() {
            return this.f24570a.f24567c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj != null ? obj instanceof bbcaa : true)) {
                return false;
            }
            return super.contains((bbcaa) obj);
        }

        public final boolean isEmpty() {
            return false;
        }

        public final Iterator<bbcaa> iterator() {
            bbabc.m28052b(this, "receiver$0");
            Iterable bbbac = new bbbac(0, size() - 1);
            bbabc.m28052b(bbbac, "receiver$0");
            return bbbbb.m28064a(new bacac(bbbac), new aaaaa(this)).mo63994a();
        }
    }

    public bbcba(Matcher matcher, CharSequence charSequence) {
        bbabc.m28052b(matcher, "matcher");
        bbabc.m28052b(charSequence, "input");
        this.f24567c = matcher;
        this.f24568d = charSequence;
    }

    /* renamed from: a */
    public final List<String> mo64024a() {
        if (this.f24566b == null) {
            this.f24566b = new aaaaa(this);
        }
        List<String> list = this.f24566b;
        if (list == null) {
            bbabc.m28048a();
        }
        return list;
    }
}
