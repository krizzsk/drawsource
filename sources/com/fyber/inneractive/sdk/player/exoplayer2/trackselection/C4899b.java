package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b */
public class C4899b extends C4903d {

    /* renamed from: e */
    public static final int[] f13009e = new int[0];

    /* renamed from: c */
    public final C4906e.C4907a f13010c = null;

    /* renamed from: d */
    public final AtomicReference<C4901b> f13011d = new AtomicReference<>(new C4901b());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a */
    public static final class C4900a {

        /* renamed from: a */
        public final int f13012a;

        /* renamed from: b */
        public final int f13013b;

        /* renamed from: c */
        public final String f13014c;

        public C4900a(int i, int i2, String str) {
            this.f13012a = i;
            this.f13013b = i2;
            this.f13014c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4900a.class != obj.getClass()) {
                return false;
            }
            C4900a aVar = (C4900a) obj;
            if (this.f13012a == aVar.f13012a && this.f13013b == aVar.f13013b && TextUtils.equals(this.f13014c, aVar.f13014c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f13012a * 31) + this.f13013b) * 31;
            String str = this.f13014c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b */
    public static final class C4901b {

        /* renamed from: a */
        public final String f13015a;

        /* renamed from: b */
        public final String f13016b;

        /* renamed from: c */
        public final boolean f13017c;

        /* renamed from: d */
        public final boolean f13018d;

        /* renamed from: e */
        public final int f13019e;

        /* renamed from: f */
        public final int f13020f;

        /* renamed from: g */
        public final int f13021g;

        /* renamed from: h */
        public final boolean f13022h;

        /* renamed from: i */
        public final boolean f13023i;

        /* renamed from: j */
        public final int f13024j;

        /* renamed from: k */
        public final int f13025k;

        /* renamed from: l */
        public final boolean f13026l;

        public C4901b() {
            this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4901b.class != obj.getClass()) {
                return false;
            }
            C4901b bVar = (C4901b) obj;
            if (this.f13017c == bVar.f13017c && this.f13018d == bVar.f13018d && this.f13019e == bVar.f13019e && this.f13020f == bVar.f13020f && this.f13022h == bVar.f13022h && this.f13023i == bVar.f13023i && this.f13026l == bVar.f13026l && this.f13024j == bVar.f13024j && this.f13025k == bVar.f13025k && this.f13021g == bVar.f13021g && TextUtils.equals(this.f13015a, bVar.f13015a) && TextUtils.equals(this.f13016b, bVar.f13016b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f13015a.hashCode() * 31) + this.f13016b.hashCode()) * 31) + (this.f13017c ? 1 : 0)) * 31) + (this.f13018d ? 1 : 0)) * 31) + this.f13019e) * 31) + this.f13020f) * 31) + this.f13021g) * 31) + (this.f13022h ? 1 : 0)) * 31) + (this.f13023i ? 1 : 0)) * 31) + (this.f13026l ? 1 : 0)) * 31) + this.f13024j) * 31) + this.f13025k;
        }

        public C4901b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.f13015a = null;
            this.f13016b = null;
            this.f13017c = z;
            this.f13018d = z2;
            this.f13019e = i;
            this.f13020f = i2;
            this.f13021g = i3;
            this.f13022h = z3;
            this.f13023i = z4;
            this.f13024j = i4;
            this.f13025k = i5;
            this.f13026l = z5;
        }
    }

    public C4899b(C4906e.C4907a aVar) {
    }

    /* renamed from: a */
    public static int m14912a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    public static boolean m14914a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: a */
    public static boolean m14917a(C4811i iVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m14914a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C4991u.m15140a((Object) iVar.f12755f, (Object) str)) {
            return false;
        }
        int i6 = iVar.f12759j;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = iVar.f12760k;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = iVar.f12751b;
        if (i8 == -1 || i8 <= i5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14915a(C4811i iVar, int i, C4900a aVar) {
        if (!m14914a(i, false) || iVar.f12767r != aVar.f13012a || iVar.f12768s != aVar.f13013b) {
            return false;
        }
        String str = aVar.f13014c;
        if (str == null || TextUtils.equals(str, iVar.f12755f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14916a(C4811i iVar, String str) {
        String str2;
        if (str != null) {
            String str3 = iVar.f12774y;
            int i = C4991u.f13270a;
            if (str3 == null) {
                str2 = null;
            } else {
                str2 = new Locale(str3).getLanguage();
            }
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> m14913a(com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f12993a
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0009:
            int r3 = r12.f12993a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a2
            if (r14 != r2) goto L_0x0020
            goto L_0x00a2
        L_0x0020:
            r3 = r1
            r4 = r2
        L_0x0022:
            int r5 = r12.f12993a
            r6 = 1
            if (r3 >= r5) goto L_0x007c
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r12.f12994b
            r5 = r5[r3]
            int r7 = r5.f12759j
            if (r7 <= 0) goto L_0x0079
            int r8 = r5.f12760k
            if (r8 <= 0) goto L_0x0079
            if (r15 == 0) goto L_0x0043
            if (r7 <= r8) goto L_0x0039
            r9 = r6
            goto L_0x003a
        L_0x0039:
            r9 = r1
        L_0x003a:
            if (r13 <= r14) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r6 = r1
        L_0x003e:
            if (r9 == r6) goto L_0x0043
            r6 = r13
            r9 = r14
            goto L_0x0045
        L_0x0043:
            r9 = r13
            r6 = r14
        L_0x0045:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0055
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15132a((int) r11, (int) r7)
            r6.<init>(r9, r7)
            goto L_0x005f
        L_0x0055:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15132a((int) r10, (int) r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x005f:
            int r7 = r5.f12759j
            int r5 = r5.f12760k
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x0079
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x0079
            if (r8 >= r4) goto L_0x0079
            r4 = r8
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x007c:
            if (r4 == r2) goto L_0x00a2
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0083:
            if (r13 < 0) goto L_0x00a2
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r12.f12994b
            r14 = r15[r14]
            int r14 = r14.mo25300b()
            r15 = -1
            if (r14 == r15) goto L_0x009c
            if (r14 <= r4) goto L_0x009f
        L_0x009c:
            r0.remove(r13)
        L_0x009f:
            int r13 = r13 + -1
            goto L_0x0083
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4899b.m14913a(com.fyber.inneractive.sdk.player.exoplayer2.source.r, int, int, boolean):java.util.List");
    }
}
