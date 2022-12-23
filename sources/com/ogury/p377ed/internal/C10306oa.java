package com.ogury.p377ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.oa */
final class C10306oa implements C10291np<C10282nh> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f25635a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f25636b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f25637c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10239lv<CharSequence, Integer, C10176jz<Integer, Integer>> f25638d;

    public C10306oa(CharSequence charSequence, int i, C10239lv<? super CharSequence, ? super Integer, C10176jz<Integer, Integer>> lvVar) {
        C10263mq.m29882b(charSequence, "input");
        C10263mq.m29882b(lvVar, "getNextMatch");
        this.f25635a = charSequence;
        this.f25638d = lvVar;
    }

    /* renamed from: com.ogury.ed.internal.oa$a */
    public static final class C10307a implements C10270mx, Iterator<C10282nh> {

        /* renamed from: a */
        final /* synthetic */ C10306oa f25639a;

        /* renamed from: b */
        private int f25640b = -1;

        /* renamed from: c */
        private int f25641c;

        /* renamed from: d */
        private int f25642d;

        /* renamed from: e */
        private C10282nh f25643e;

        /* renamed from: f */
        private int f25644f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C10307a(C10306oa oaVar) {
            this.f25639a = oaVar;
            int c = C10284ni.m29922c(oaVar.f25636b, oaVar.f25635a.length());
            this.f25641c = c;
            this.f25642d = c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p377ed.internal.C10306oa.m29939a(r6.f25639a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m29944a() {
            /*
                r6 = this;
                int r0 = r6.f25642d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f25640b = r1
                r0 = 0
                r6.f25643e = r0
                return
            L_0x000b:
                com.ogury.ed.internal.oa r0 = r6.f25639a
                int r0 = r0.f25637c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f25644f
                int r0 = r0 + r3
                r6.f25644f = r0
                com.ogury.ed.internal.oa r4 = r6.f25639a
                int r4 = r4.f25637c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f25642d
                com.ogury.ed.internal.oa r4 = r6.f25639a
                java.lang.CharSequence r4 = r4.f25635a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f25641c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f25639a
                java.lang.CharSequence r4 = r4.f25635a
                int r4 = com.ogury.p377ed.internal.C10312oc.m29971c(r4)
                r1.<init>(r0, r4)
                r6.f25643e = r1
                r6.f25642d = r2
                goto L_0x009b
            L_0x0046:
                com.ogury.ed.internal.oa r0 = r6.f25639a
                com.ogury.ed.internal.lv r0 = r0.f25638d
                com.ogury.ed.internal.oa r4 = r6.f25639a
                java.lang.CharSequence r4 = r4.f25635a
                int r5 = r6.f25642d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo64398a(r4, r5)
                com.ogury.ed.internal.jz r0 = (com.ogury.p377ed.internal.C10176jz) r0
                if (r0 != 0) goto L_0x0076
                int r0 = r6.f25641c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f25639a
                java.lang.CharSequence r4 = r4.f25635a
                int r4 = com.ogury.p377ed.internal.C10312oc.m29971c(r4)
                r1.<init>(r0, r4)
                r6.f25643e = r1
                r6.f25642d = r2
                goto L_0x009b
            L_0x0076:
                java.lang.Object r2 = r0.mo65020c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo65021d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f25641c
                com.ogury.ed.internal.nh r4 = com.ogury.p377ed.internal.C10284ni.m29920a(r4, r2)
                r6.f25643e = r4
                int r2 = r2 + r0
                r6.f25641c = r2
                if (r0 != 0) goto L_0x0098
                r1 = r3
            L_0x0098:
                int r2 = r2 + r1
                r6.f25642d = r2
            L_0x009b:
                r6.f25640b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10306oa.C10307a.m29944a():void");
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10282nh next() {
            if (this.f25640b == -1) {
                m29944a();
            }
            if (this.f25640b != 0) {
                C10282nh nhVar = this.f25643e;
                if (nhVar != null) {
                    this.f25643e = null;
                    this.f25640b = -1;
                    return nhVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.f25640b == -1) {
                m29944a();
            }
            return this.f25640b == 1;
        }
    }

    /* renamed from: a */
    public final Iterator<C10282nh> mo65159a() {
        return new C10307a(this);
    }
}
