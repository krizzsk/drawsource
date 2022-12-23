package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n1 */
public final class C5138n1 {

    /* renamed from: f */
    public static final C5138n1 f13646f = new C5138n1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f13647a;

    /* renamed from: b */
    public int[] f13648b;

    /* renamed from: c */
    public Object[] f13649c;

    /* renamed from: d */
    public int f13650d;

    /* renamed from: e */
    public boolean f13651e;

    public C5138n1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static C5138n1 m15914a(C5138n1 n1Var, C5138n1 n1Var2) {
        int i = n1Var.f13647a + n1Var2.f13647a;
        int[] copyOf = Arrays.copyOf(n1Var.f13648b, i);
        System.arraycopy(n1Var2.f13648b, 0, copyOf, n1Var.f13647a, n1Var2.f13647a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f13649c, i);
        System.arraycopy(n1Var2.f13649c, 0, copyOf2, n1Var.f13647a, n1Var2.f13647a);
        return new C5138n1(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static C5138n1 m15916c() {
        return new C5138n1(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public int mo26123b() {
        int i;
        int i2 = this.f13650d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13647a; i4++) {
            int i5 = this.f13648b[i4];
            int i6 = C5169t1.f13694a;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i8 == 0) {
                i = C5125l.m15792e(i7, ((Long) this.f13649c[i4]).longValue());
            } else if (i8 == 1) {
                i = C5125l.m15771a(i7, ((Long) this.f13649c[i4]).longValue());
            } else if (i8 == 2) {
                i = C5125l.m15772a(i7, (C5093i) this.f13649c[i4]);
            } else if (i8 == 3) {
                i = (C5125l.m15781b(i7) * 2) + ((C5138n1) this.f13649c[i4]).mo26123b();
            } else if (i8 == 5) {
                i = C5125l.m15782b(i7, ((Integer) this.f13649c[i4]).intValue());
            } else {
                throw new IllegalStateException(C5061a0.m15274d());
            }
            i3 += i;
        }
        this.f13650d = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5138n1)) {
            return false;
        }
        C5138n1 n1Var = (C5138n1) obj;
        int i = this.f13647a;
        if (i == n1Var.f13647a) {
            int[] iArr = this.f13648b;
            int[] iArr2 = n1Var.f13648b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f13649c;
                Object[] objArr2 = n1Var.f13649c;
                int i3 = this.f13647a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public int hashCode() {
        int i = this.f13647a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f13648b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f13649c;
        int i7 = this.f13647a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C5138n1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13650d = -1;
        this.f13647a = i;
        this.f13648b = iArr;
        this.f13649c = objArr;
        this.f13651e = z;
    }

    /* renamed from: a */
    public void mo26119a() {
        if (!this.f13651e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo26121a(C5184u1 u1Var) throws IOException {
        if (this.f13647a != 0) {
            u1Var.getClass();
            for (int i = 0; i < this.f13647a; i++) {
                m15915a(this.f13648b[i], this.f13649c[i], u1Var);
            }
        }
    }

    /* renamed from: a */
    public static void m15915a(int i, Object obj, C5184u1 u1Var) throws IOException {
        int i2 = C5169t1.f13694a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            ((C5133m) u1Var).f13640a.mo26057g(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((C5133m) u1Var).f13640a.mo26054f(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((C5133m) u1Var).f13640a.mo26045b(i3, (C5093i) obj);
        } else if (i4 == 3) {
            C5133m mVar = (C5133m) u1Var;
            mVar.f13640a.mo26059i(i3, 3);
            ((C5138n1) obj).mo26121a(u1Var);
            mVar.f13640a.mo26059i(i3, 4);
        } else if (i4 == 5) {
            ((C5133m) u1Var).f13640a.mo26056g(i3, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(C5061a0.m15274d());
        }
    }

    /* renamed from: a */
    public void mo26120a(int i, Object obj) {
        mo26119a();
        int i2 = this.f13647a;
        int[] iArr = this.f13648b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f13648b = Arrays.copyOf(iArr, i3);
            this.f13649c = Arrays.copyOf(this.f13649c, i3);
        }
        int[] iArr2 = this.f13648b;
        int i4 = this.f13647a;
        iArr2[i4] = i;
        this.f13649c[i4] = obj;
        this.f13647a = i4 + 1;
    }

    /* renamed from: a */
    public boolean mo26122a(int i, C5114j jVar) throws IOException {
        int t;
        mo26119a();
        int i2 = C5169t1.f13694a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            mo26120a(i, (Object) Long.valueOf(jVar.mo25987l()));
            return true;
        } else if (i4 == 1) {
            mo26120a(i, (Object) Long.valueOf(jVar.mo25984i()));
            return true;
        } else if (i4 == 2) {
            mo26120a(i, (Object) jVar.mo25979e());
            return true;
        } else if (i4 == 3) {
            C5138n1 n1Var = new C5138n1(0, new int[8], new Object[8], true);
            do {
                t = jVar.mo25995t();
                if (t == 0 || !n1Var.mo26122a(t, jVar)) {
                    jVar.mo25971a(C5169t1.m16117a(i3, 4));
                    mo26120a(i, (Object) n1Var);
                }
                t = jVar.mo25995t();
                break;
            } while (!n1Var.mo26122a(t, jVar));
            jVar.mo25971a(C5169t1.m16117a(i3, 4));
            mo26120a(i, (Object) n1Var);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                mo26120a(i, (Object) Integer.valueOf(jVar.mo25983h()));
                return true;
            }
            throw C5061a0.m15274d();
        }
    }
}
