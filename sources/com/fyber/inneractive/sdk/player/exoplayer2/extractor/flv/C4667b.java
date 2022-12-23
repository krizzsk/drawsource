package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b */
public final class C4667b implements C4665f, C4709m {

    /* renamed from: n */
    public static final int f11715n = C4991u.m15133a("FLV");

    /* renamed from: a */
    public final C4978k f11716a = new C4978k(4);

    /* renamed from: b */
    public final C4978k f11717b = new C4978k(9);

    /* renamed from: c */
    public final C4978k f11718c = new C4978k(11);

    /* renamed from: d */
    public final C4978k f11719d = new C4978k();

    /* renamed from: e */
    public C4673h f11720e;

    /* renamed from: f */
    public int f11721f = 1;

    /* renamed from: g */
    public int f11722g;

    /* renamed from: h */
    public int f11723h;

    /* renamed from: i */
    public int f11724i;

    /* renamed from: j */
    public long f11725j;

    /* renamed from: k */
    public C4666a f11726k;

    /* renamed from: l */
    public C4671e f11727l;

    /* renamed from: m */
    public C4668c f11728m;

    /* renamed from: a */
    public long mo25054a(long j) {
        return 0;
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        C4657b bVar = (C4657b) gVar;
        bVar.mo25061a(this.f11716a.f13243a, 0, 3, false);
        this.f11716a.mo25525e(0);
        if (this.f11716a.mo25535n() != f11715n) {
            return false;
        }
        bVar.mo25061a(this.f11716a.f13243a, 0, 2, false);
        this.f11716a.mo25525e(0);
        if ((this.f11716a.mo25538q() & 250) != 0) {
            return false;
        }
        bVar.mo25061a(this.f11716a.f13243a, 0, 4, false);
        this.f11716a.mo25525e(0);
        int c = this.f11716a.mo25520c();
        bVar.f11672e = 0;
        bVar.mo25060a(c, false);
        bVar.mo25061a(this.f11716a.f13243a, 0, 4, false);
        this.f11716a.mo25525e(0);
        if (this.f11716a.mo25520c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C4978k mo25095b(C4672g gVar) throws IOException, InterruptedException {
        if (this.f11724i > this.f11719d.mo25518b()) {
            C4978k kVar = this.f11719d;
            kVar.f13243a = new byte[Math.max(kVar.mo25518b() * 2, this.f11724i)];
            kVar.f13245c = 0;
            kVar.f13244b = 0;
        } else {
            this.f11719d.mo25525e(0);
        }
        this.f11719d.mo25523d(this.f11724i);
        ((C4657b) gVar).mo25063b(this.f11719d.f13243a, 0, this.f11724i, false);
        return this.f11719d;
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: c */
    public final boolean mo25096c(C4672g gVar) throws IOException, InterruptedException {
        boolean z;
        C4668c cVar;
        C4671e eVar;
        C4666a aVar;
        int i = this.f11723h;
        if (i == 8 && (aVar = this.f11726k) != null) {
            aVar.mo25097a(mo25095b(gVar), this.f11725j);
        } else if (i == 9 && (eVar = this.f11727l) != null) {
            eVar.mo25097a(mo25095b(gVar), this.f11725j);
        } else if (i != 18 || (cVar = this.f11728m) == null) {
            ((C4657b) gVar).mo25064c(this.f11724i);
            z = false;
            this.f11722g = 4;
            this.f11721f = 2;
            return z;
        } else {
            cVar.mo25097a(mo25095b(gVar), this.f11725j);
        }
        z = true;
        this.f11722g = 4;
        this.f11721f = 2;
        return z;
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f11728m.f11729b;
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f11720e = hVar;
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f11721f = 1;
        this.f11722g = 0;
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f11721f;
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                if (!((C4657b) gVar).mo25063b(this.f11717b.f13243a, 0, 9, true)) {
                    z = false;
                } else {
                    this.f11717b.mo25525e(0);
                    this.f11717b.mo25527f(4);
                    int l = this.f11717b.mo25533l();
                    boolean z3 = (l & 4) != 0;
                    if ((l & 1) != 0) {
                        z2 = true;
                    }
                    if (z3 && this.f11726k == null) {
                        this.f11726k = new C4666a(this.f11720e.mo25098a(8, 1));
                    }
                    if (z2 && this.f11727l == null) {
                        this.f11727l = new C4671e(this.f11720e.mo25098a(9, 2));
                    }
                    if (this.f11728m == null) {
                        this.f11728m = new C4668c((C4746n) null);
                    }
                    this.f11720e.mo25100c();
                    this.f11720e.mo25099a(this);
                    this.f11722g = (this.f11717b.mo25520c() - 9) + 4;
                    this.f11721f = 2;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                ((C4657b) gVar).mo25064c(this.f11722g);
                this.f11722g = 0;
                this.f11721f = 3;
            } else if (i == 3) {
                if (!((C4657b) gVar).mo25063b(this.f11718c.f13243a, 0, 11, true)) {
                    z = false;
                } else {
                    this.f11718c.mo25525e(0);
                    this.f11723h = this.f11718c.mo25533l();
                    this.f11724i = this.f11718c.mo25535n();
                    this.f11725j = (long) this.f11718c.mo25535n();
                    this.f11725j = (((long) (this.f11718c.mo25533l() << 24)) | this.f11725j) * 1000;
                    this.f11718c.mo25527f(3);
                    this.f11721f = 4;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4 && mo25096c(gVar)) {
                return 0;
            }
        }
    }
}
