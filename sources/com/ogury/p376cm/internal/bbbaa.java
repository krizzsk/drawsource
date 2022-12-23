package com.ogury.p376cm.internal;

import com.ogury.p376cm.ConsentActivity;
import com.ogury.p376cm.internal.bbbac;
import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbaa */
public class bbbaa implements Iterable<Integer> {

    /* renamed from: a */
    public static final aaaaa f24531a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f24532b;

    /* renamed from: c */
    private final int f24533c;

    /* renamed from: d */
    private final int f24534d = 1;

    /* renamed from: com.ogury.cm.internal.bbbaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static bbbac m28059a(int i, int i2) {
            if (i2 > Integer.MIN_VALUE) {
                return new bbbac(i, i2 - 1);
            }
            bbbac.aaaaa aaaaa = bbbac.f24539b;
            return bbbac.f24540c;
        }
    }

    public bbbaa(int i, int i2, int i3) {
        this.f24532b = i;
        this.f24533c = ConsentActivity.aaaaa.m27623a(i, i2, 1);
    }

    /* renamed from: a */
    public final int mo64005a() {
        return this.f24532b;
    }

    /* renamed from: b */
    public final int mo64006b() {
        return this.f24533c;
    }

    /* renamed from: c */
    public final int mo64007c() {
        return this.f24534d;
    }

    /* renamed from: d */
    public boolean mo64008d() {
        return this.f24534d > 0 ? this.f24532b > this.f24533c : this.f24532b < this.f24533c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bbbaa)) {
            return false;
        }
        if (mo64008d() && ((bbbaa) obj).mo64008d()) {
            return true;
        }
        bbbaa bbbaa = (bbbaa) obj;
        return this.f24532b == bbbaa.f24532b && this.f24533c == bbbaa.f24533c && this.f24534d == bbbaa.f24534d;
    }

    public int hashCode() {
        if (mo64008d()) {
            return -1;
        }
        return (((this.f24532b * 31) + this.f24533c) * 31) + this.f24534d;
    }

    public /* synthetic */ Iterator iterator() {
        return new bbbab(this.f24532b, this.f24533c, this.f24534d);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f24534d > 0) {
            sb = new StringBuilder();
            sb.append(this.f24532b);
            sb.append("..");
            sb.append(this.f24533c);
            sb.append(" step ");
            i = this.f24534d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f24532b);
            sb.append(" downTo ");
            sb.append(this.f24533c);
            sb.append(" step ");
            i = -this.f24534d;
        }
        sb.append(i);
        return sb.toString();
    }
}
