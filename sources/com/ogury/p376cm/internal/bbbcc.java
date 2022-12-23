package com.ogury.p376cm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbcc */
final class bbbcc implements bbbba<bbbac> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f24553a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f24554b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f24555c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final bbaac<CharSequence, Integer, babbc<Integer, Integer>> f24556d;

    /* renamed from: com.ogury.cm.internal.bbbcc$aaaaa */
    public static final class aaaaa implements Iterator<bbbac> {

        /* renamed from: a */
        final /* synthetic */ bbbcc f24557a;

        /* renamed from: b */
        private int f24558b = -1;

        /* renamed from: c */
        private int f24559c;

        /* renamed from: d */
        private int f24560d;

        /* renamed from: e */
        private bbbac f24561e;

        /* renamed from: f */
        private int f24562f;

        aaaaa(bbbcc bbbcc) {
            this.f24557a = bbbcc;
            int d = bbbcc.f24554b;
            int length = bbbcc.f24553a.length();
            if (length >= 0) {
                if (d < 0) {
                    d = 0;
                } else if (d > length) {
                    d = length;
                }
                this.f24559c = d;
                this.f24560d = d;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p376cm.internal.bbbcc.m28071a(r6.f24557a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m28076a() {
            /*
                r6 = this;
                int r0 = r6.f24560d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f24558b = r1
                r0 = 0
                r6.f24561e = r0
                return
            L_0x000b:
                com.ogury.cm.internal.bbbcc r0 = r6.f24557a
                int r0 = r0.f24555c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f24562f
                int r0 = r0 + r3
                r6.f24562f = r0
                com.ogury.cm.internal.bbbcc r4 = r6.f24557a
                int r4 = r4.f24555c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f24560d
                com.ogury.cm.internal.bbbcc r4 = r6.f24557a
                java.lang.CharSequence r4 = r4.f24553a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f24559c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f24557a
                java.lang.CharSequence r4 = r4.f24553a
                int r4 = com.ogury.p376cm.internal.bbcbc.m28100b(r4)
                r1.<init>(r0, r4)
            L_0x0041:
                r6.f24561e = r1
            L_0x0043:
                r6.f24560d = r2
                goto L_0x0096
            L_0x0046:
                com.ogury.cm.internal.bbbcc r0 = r6.f24557a
                com.ogury.cm.internal.bbaac r0 = r0.f24556d
                com.ogury.cm.internal.bbbcc r4 = r6.f24557a
                java.lang.CharSequence r4 = r4.f24553a
                int r5 = r6.f24560d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo64001a(r4, r5)
                com.ogury.cm.internal.babbc r0 = (com.ogury.p376cm.internal.babbc) r0
                if (r0 != 0) goto L_0x0072
                int r0 = r6.f24559c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f24557a
                java.lang.CharSequence r4 = r4.f24553a
                int r4 = com.ogury.p376cm.internal.bbcbc.m28100b(r4)
                r1.<init>(r0, r4)
                goto L_0x0041
            L_0x0072:
                java.lang.Object r2 = r0.mo63950c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo63951d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f24559c
                com.ogury.cm.internal.bbbac r4 = com.ogury.p376cm.internal.bbbaa.aaaaa.m28059a(r4, r2)
                r6.f24561e = r4
                int r2 = r2 + r0
                r6.f24559c = r2
                if (r0 != 0) goto L_0x0094
                r1 = r3
            L_0x0094:
                int r2 = r2 + r1
                goto L_0x0043
            L_0x0096:
                r6.f24558b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376cm.internal.bbbcc.aaaaa.m28076a():void");
        }

        public final boolean hasNext() {
            if (this.f24558b == -1) {
                m28076a();
            }
            return this.f24558b == 1;
        }

        public final /* synthetic */ Object next() {
            if (this.f24558b == -1) {
                m28076a();
            }
            if (this.f24558b != 0) {
                bbbac bbbac = this.f24561e;
                if (bbbac != null) {
                    this.f24561e = null;
                    this.f24558b = -1;
                    return bbbac;
                }
                throw new babca("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbcc(CharSequence charSequence, int i, int i2, bbaac<? super CharSequence, ? super Integer, babbc<Integer, Integer>> bbaac) {
        bbabc.m28052b(charSequence, "input");
        bbabc.m28052b(bbaac, "getNextMatch");
        this.f24553a = charSequence;
        this.f24556d = bbaac;
    }

    /* renamed from: a */
    public final Iterator<bbbac> mo63994a() {
        return new aaaaa(this);
    }
}
