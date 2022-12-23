package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5119j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.k */
public final class C5122k implements C5078e1 {

    /* renamed from: a */
    public final C5114j f13623a;

    /* renamed from: b */
    public int f13624b;

    /* renamed from: c */
    public int f13625c;

    /* renamed from: d */
    public int f13626d = 0;

    public C5122k(C5114j jVar) {
        C5114j jVar2 = (C5114j) C5194z.m16182a(jVar, "input");
        this.f13623a = jVar2;
        jVar2.f13597d = this;
    }

    /* renamed from: a */
    public <T> T mo25807a(Class<T> cls, C5147q qVar) throws IOException {
        mo26028b(3);
        return mo26029c(C5066b1.f13524c.mo25762a(cls), qVar);
    }

    /* renamed from: b */
    public final void mo26028b(int i) throws IOException {
        int i2 = this.f13624b;
        int i3 = C5169t1.f13694a;
        if ((i2 & 7) != i) {
            throw C5061a0.m15274d();
        }
    }

    /* renamed from: c */
    public final <T> T mo26029c(C5083f1<T> f1Var, C5147q qVar) throws IOException {
        int i = this.f13625c;
        int i2 = this.f13624b;
        int i3 = C5169t1.f13694a;
        this.f13625c = C5169t1.m16117a(i2 >>> 3, 4);
        try {
            T a = f1Var.mo25868a();
            f1Var.mo25869a(a, this, qVar);
            f1Var.mo25876c(a);
            if (this.f13624b == this.f13625c) {
                return a;
            }
            throw C5061a0.m15277g();
        } finally {
            this.f13625c = i;
        }
    }

    /* renamed from: d */
    public int mo25818d() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25986k();
    }

    /* renamed from: e */
    public int mo25820e() {
        return this.f13624b;
    }

    /* renamed from: f */
    public long mo25822f() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25997v();
    }

    /* renamed from: g */
    public long mo25824g() throws IOException {
        mo26028b(1);
        return this.f13623a.mo25984i();
    }

    /* renamed from: h */
    public double mo25826h() throws IOException {
        mo26028b(1);
        return this.f13623a.mo25981f();
    }

    /* renamed from: i */
    public boolean mo25829i() throws IOException {
        int i;
        if (this.f13623a.mo25976c() || (i = this.f13624b) == this.f13625c) {
            return false;
        }
        return this.f13623a.mo25980e(i);
    }

    /* renamed from: j */
    public int mo25830j() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25991p();
    }

    /* renamed from: k */
    public float mo25832k() throws IOException {
        mo26028b(5);
        return this.f13623a.mo25985j();
    }

    /* renamed from: l */
    public long mo25834l() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25992q();
    }

    /* renamed from: m */
    public int mo25836m() throws IOException {
        mo26028b(5);
        return this.f13623a.mo25989n();
    }

    /* renamed from: n */
    public String mo25838n() throws IOException {
        mo26028b(2);
        return this.f13623a.mo25993r();
    }

    /* renamed from: o */
    public long mo25840o() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25987l();
    }

    /* renamed from: p */
    public String mo25842p() throws IOException {
        mo26028b(2);
        return this.f13623a.mo25994s();
    }

    /* renamed from: q */
    public int mo25844q() throws IOException {
        mo26028b(5);
        return this.f13623a.mo25983h();
    }

    /* renamed from: r */
    public boolean mo25846r() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25978d();
    }

    /* renamed from: s */
    public int mo25847s() throws IOException {
        int i = this.f13626d;
        if (i != 0) {
            this.f13624b = i;
            this.f13626d = 0;
        } else {
            this.f13624b = this.f13623a.mo25995t();
        }
        int i2 = this.f13624b;
        if (i2 == 0 || i2 == this.f13625c) {
            return Integer.MAX_VALUE;
        }
        int i3 = C5169t1.f13694a;
        return i2 >>> 3;
    }

    /* renamed from: t */
    public long mo25848t() throws IOException {
        mo26028b(1);
        return this.f13623a.mo25990o();
    }

    /* renamed from: e */
    public void mo25821e(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26030c(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    yVar.mo26230c(this.f13623a.mo25983h());
                } while (this.f13623a.mo25974b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo26230c(this.f13623a.mo25983h());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26030c(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25983h()));
                } while (this.f13623a.mo25974b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25983h()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: b */
    public <T> T mo25813b(Class<T> cls, C5147q qVar) throws IOException {
        mo26028b(2);
        return mo26031d(C5066b1.f13524c.mo25762a(cls), qVar);
    }

    /* renamed from: d */
    public final <T> T mo26031d(C5083f1<T> f1Var, C5147q qVar) throws IOException {
        int u = this.f13623a.mo25996u();
        C5114j jVar = this.f13623a;
        if (jVar.f13594a < jVar.f13595b) {
            int d = jVar.mo25977d(u);
            T a = f1Var.mo25868a();
            this.f13623a.f13594a++;
            f1Var.mo25869a(a, this, qVar);
            f1Var.mo25876c(a);
            this.f13623a.mo25971a(0);
            C5114j jVar2 = this.f13623a;
            jVar2.f13594a--;
            jVar2.mo25975c(d);
            return a;
        }
        throw C5061a0.m15278h();
    }

    /* renamed from: f */
    public void mo25823f(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26030c(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    yVar.mo26230c(this.f13623a.mo25989n());
                } while (this.f13623a.mo25974b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo26230c(this.f13623a.mo25989n());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26030c(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25989n()));
                } while (this.f13623a.mo25974b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25989n()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: g */
    public void mo25825g(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25893a(this.f13623a.mo25992q());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    h0Var.mo25893a(this.f13623a.mo25992q());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13623a.mo25992q()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Long.valueOf(this.f13623a.mo25992q()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: h */
    public void mo25827h(List<C5093i> list) throws IOException {
        int t;
        int i = this.f13624b;
        int i2 = C5169t1.f13694a;
        if ((i & 7) == 2) {
            do {
                list.add(mo25805a());
                if (!this.f13623a.mo25976c()) {
                    t = this.f13623a.mo25995t();
                } else {
                    return;
                }
            } while (t == this.f13624b);
            this.f13626d = t;
            return;
        }
        throw C5061a0.m15274d();
    }

    /* renamed from: j */
    public void mo25831j(List<Double> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5136n) {
            C5136n nVar = (C5136n) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    nVar.mo26108a(this.f13623a.mo25981f());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26032d(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    nVar.mo26108a(this.f13623a.mo25981f());
                } while (this.f13623a.mo25974b() < b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(this.f13623a.mo25981f()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26032d(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Double.valueOf(this.f13623a.mo25981f()));
                } while (this.f13623a.mo25974b() < b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: k */
    public void mo25833k(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25893a(this.f13623a.mo25987l());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    h0Var.mo25893a(this.f13623a.mo25987l());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13623a.mo25987l()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Long.valueOf(this.f13623a.mo25987l()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: l */
    public void mo25835l(List<Boolean> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5084g) {
            C5084g gVar = (C5084g) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    gVar.mo25878a(this.f13623a.mo25978d());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    gVar.mo25878a(this.f13623a.mo25978d());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f13623a.mo25978d()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Boolean.valueOf(this.f13623a.mo25978d()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: m */
    public void mo25837m(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo25893a(this.f13623a.mo25990o());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26032d(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    h0Var.mo25893a(this.f13623a.mo25990o());
                } while (this.f13623a.mo25974b() < b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f13623a.mo25990o()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26032d(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Long.valueOf(this.f13623a.mo25990o()));
                } while (this.f13623a.mo25974b() < b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: n */
    public void mo25839n(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo25893a(this.f13623a.mo25984i());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26032d(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    h0Var.mo25893a(this.f13623a.mo25984i());
                } while (this.f13623a.mo25974b() < b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f13623a.mo25984i()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26032d(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Long.valueOf(this.f13623a.mo25984i()));
                } while (this.f13623a.mo25974b() < b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: o */
    public void mo25841o(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26230c(this.f13623a.mo25986k());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    yVar.mo26230c(this.f13623a.mo25986k());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25986k()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25986k()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: p */
    public void mo25843p(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26230c(this.f13623a.mo25982g());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    yVar.mo26230c(this.f13623a.mo25982g());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25982g()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25982g()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: q */
    public void mo25845q(List<String> list) throws IOException {
        mo26027a(list, false);
    }

    /* renamed from: a */
    public <T> T mo25806a(C5083f1<T> f1Var, C5147q qVar) throws IOException {
        mo26028b(3);
        return mo26029c(f1Var, qVar);
    }

    /* renamed from: i */
    public void mo25828i(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26230c(this.f13623a.mo25996u());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    yVar.mo26230c(this.f13623a.mo25996u());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25996u()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25996u()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: a */
    public C5093i mo25805a() throws IOException {
        mo26028b(2);
        return this.f13623a.mo25979e();
    }

    /* renamed from: b */
    public <T> T mo25812b(C5083f1<T> f1Var, C5147q qVar) throws IOException {
        mo26028b(2);
        return mo26031d(f1Var, qVar);
    }

    /* renamed from: a */
    public void mo25808a(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5091h0) {
            C5091h0 h0Var = (C5091h0) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo25893a(this.f13623a.mo25997v());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    h0Var.mo25893a(this.f13623a.mo25997v());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f13623a.mo25997v()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Long.valueOf(this.f13623a.mo25997v()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: b */
    public int mo25811b() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25982g();
    }

    /* renamed from: b */
    public void mo25814b(List<String> list) throws IOException {
        mo26027a(list, true);
    }

    /* renamed from: b */
    public <T> void mo25815b(List<T> list, C5083f1<T> f1Var, C5147q qVar) throws IOException {
        int t;
        int i = this.f13624b;
        int i2 = C5169t1.f13694a;
        if ((i & 7) == 2) {
            do {
                list.add(mo26031d(f1Var, qVar));
                if (!this.f13623a.mo25976c() && this.f13626d == 0) {
                    t = this.f13623a.mo25995t();
                } else {
                    return;
                }
            } while (t == i);
            this.f13626d = t;
            return;
        }
        throw C5061a0.m15274d();
    }

    /* renamed from: d */
    public void mo25819d(List<Float> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5188w) {
            C5188w wVar = (C5188w) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f13623a.mo25996u();
                mo26030c(u);
                int b = this.f13623a.mo25974b() + u;
                do {
                    wVar.mo26218a(this.f13623a.mo25985j());
                } while (this.f13623a.mo25974b() < b);
            } else if (i3 == 5) {
                do {
                    wVar.mo26218a(this.f13623a.mo25985j());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f13623a.mo25996u();
                mo26030c(u2);
                int b2 = this.f13623a.mo25974b() + u2;
                do {
                    list.add(Float.valueOf(this.f13623a.mo25985j()));
                } while (this.f13623a.mo25974b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(this.f13623a.mo25985j()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: c */
    public int mo25816c() throws IOException {
        mo26028b(0);
        return this.f13623a.mo25996u();
    }

    /* renamed from: c */
    public void mo25817c(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C5192y) {
            C5192y yVar = (C5192y) list;
            int i = this.f13624b;
            int i2 = C5169t1.f13694a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo26230c(this.f13623a.mo25991p());
                    if (!this.f13623a.mo25976c()) {
                        t2 = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t2 == this.f13624b);
                this.f13626d = t2;
            } else if (i3 == 2) {
                int b = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    yVar.mo26230c(this.f13623a.mo25991p());
                } while (this.f13623a.mo25974b() < b);
                mo26026a(b);
            } else {
                throw C5061a0.m15274d();
            }
        } else {
            int i4 = this.f13624b;
            int i5 = C5169t1.f13694a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25991p()));
                    if (!this.f13623a.mo25976c()) {
                        t = this.f13623a.mo25995t();
                    } else {
                        return;
                    }
                } while (t == this.f13624b);
                this.f13626d = t;
            } else if (i6 == 2) {
                int b2 = this.f13623a.mo25974b() + this.f13623a.mo25996u();
                do {
                    list.add(Integer.valueOf(this.f13623a.mo25991p()));
                } while (this.f13623a.mo25974b() < b2);
                mo26026a(b2);
            } else {
                throw C5061a0.m15274d();
            }
        }
    }

    /* renamed from: a */
    public void mo26027a(List<String> list, boolean z) throws IOException {
        int t;
        int t2;
        int i = this.f13624b;
        int i2 = C5169t1.f13694a;
        if ((i & 7) != 2) {
            throw C5061a0.m15274d();
        } else if (!(list instanceof C5082f0) || z) {
            do {
                list.add(z ? mo25842p() : mo25838n());
                if (!this.f13623a.mo25976c()) {
                    t = this.f13623a.mo25995t();
                } else {
                    return;
                }
            } while (t == this.f13624b);
            this.f13626d = t;
        } else {
            C5082f0 f0Var = (C5082f0) list;
            do {
                f0Var.mo25799a(mo25805a());
                if (!this.f13623a.mo25976c()) {
                    t2 = this.f13623a.mo25995t();
                } else {
                    return;
                }
            } while (t2 == this.f13624b);
            this.f13626d = t2;
        }
    }

    /* renamed from: c */
    public final void mo26030c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C5061a0.m15277g();
        }
    }

    /* renamed from: d */
    public final void mo26032d(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C5061a0.m15277g();
        }
    }

    /* renamed from: a */
    public <T> void mo25809a(List<T> list, C5083f1<T> f1Var, C5147q qVar) throws IOException {
        int t;
        int i = this.f13624b;
        int i2 = C5169t1.f13694a;
        if ((i & 7) == 3) {
            do {
                list.add(mo26029c(f1Var, qVar));
                if (!this.f13623a.mo25976c() && this.f13626d == 0) {
                    t = this.f13623a.mo25995t();
                } else {
                    return;
                }
            } while (t == i);
            this.f13626d = t;
            return;
        }
        throw C5061a0.m15274d();
    }

    /* renamed from: a */
    public <K, V> void mo25810a(Map<K, V> map, C5119j0.C5120a<K, V> aVar, C5147q qVar) throws IOException {
        mo26028b(2);
        this.f13623a.mo25977d(this.f13623a.mo25996u());
        throw null;
    }

    /* renamed from: a */
    public final void mo26026a(int i) throws IOException {
        if (this.f13623a.mo25974b() != i) {
            throw C5061a0.m15279i();
        }
    }
}
