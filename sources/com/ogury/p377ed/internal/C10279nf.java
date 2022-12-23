package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.nf */
public class C10279nf implements C10270mx, Iterable<Integer> {

    /* renamed from: a */
    public static final C10280a f25611a = new C10280a((byte) 0);

    /* renamed from: b */
    private final int f25612b;

    /* renamed from: c */
    private final int f25613c;

    /* renamed from: d */
    private final int f25614d = 1;

    public C10279nf(int i, int i2) {
        this.f25612b = i;
        this.f25613c = C10225lh.m29851a(i, i2);
    }

    /* renamed from: a */
    public final int mo65148a() {
        return this.f25612b;
    }

    /* renamed from: b */
    public final int mo65149b() {
        return this.f25613c;
    }

    /* renamed from: c */
    public final int mo65150c() {
        return this.f25614d;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C10219lb iterator() {
        return new C10281ng(this.f25612b, this.f25613c, this.f25614d);
    }

    /* renamed from: d */
    public boolean mo65151d() {
        return this.f25614d > 0 ? this.f25612b > this.f25613c : this.f25612b < this.f25613c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10279nf)) {
            return false;
        }
        if (mo65151d() && ((C10279nf) obj).mo65151d()) {
            return true;
        }
        C10279nf nfVar = (C10279nf) obj;
        return this.f25612b == nfVar.f25612b && this.f25613c == nfVar.f25613c && this.f25614d == nfVar.f25614d;
    }

    public int hashCode() {
        if (mo65151d()) {
            return -1;
        }
        return (((this.f25612b * 31) + this.f25613c) * 31) + this.f25614d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f25614d > 0) {
            sb = new StringBuilder();
            sb.append(this.f25612b);
            sb.append("..");
            sb.append(this.f25613c);
            sb.append(" step ");
            i = this.f25614d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f25612b);
            sb.append(" downTo ");
            sb.append(this.f25613c);
            sb.append(" step ");
            i = -this.f25614d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.ed.internal.nf$a */
    public static final class C10280a {
        private C10280a() {
        }

        public /* synthetic */ C10280a(byte b) {
            this();
        }
    }
}
