package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4886o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4972g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.a */
public abstract class C4611a implements C4853n {

    /* renamed from: a */
    public final int f11465a;

    /* renamed from: b */
    public C4854o f11466b;

    /* renamed from: c */
    public int f11467c;

    /* renamed from: d */
    public int f11468d;

    /* renamed from: e */
    public C4886o f11469e;

    /* renamed from: f */
    public long f11470f;

    /* renamed from: g */
    public boolean f11471g = true;

    /* renamed from: h */
    public boolean f11472h;

    public C4611a(int i) {
        this.f11465a = i;
    }

    /* renamed from: a */
    public final void mo24933a(int i) {
        this.f11467c = i;
    }

    /* renamed from: a */
    public abstract void mo24935a(long j, boolean z) throws C4639d;

    /* renamed from: a */
    public abstract void mo24937a(boolean z) throws C4639d;

    /* renamed from: a */
    public void mo24938a(C4811i[] iVarArr) throws C4639d {
    }

    /* renamed from: c */
    public final void mo24940c() {
        this.f11472h = true;
    }

    /* renamed from: d */
    public final void mo24941d() throws C4639d {
        C4965a.m15051b(this.f11468d == 2);
        this.f11468d = 1;
        mo24953r();
    }

    /* renamed from: e */
    public final void mo24942e() throws IOException {
        this.f11469e.mo25135a();
    }

    /* renamed from: f */
    public final void mo24943f() throws C4639d {
        boolean z = true;
        if (this.f11468d != 1) {
            z = false;
        }
        C4965a.m15051b(z);
        this.f11468d = 2;
        mo24952q();
    }

    /* renamed from: g */
    public final boolean mo24944g() {
        return this.f11471g;
    }

    /* renamed from: h */
    public final boolean mo24945h() {
        return this.f11472h;
    }

    /* renamed from: j */
    public C4972g mo24946j() {
        return null;
    }

    /* renamed from: k */
    public final int mo24947k() {
        return this.f11465a;
    }

    /* renamed from: l */
    public final void mo24948l() {
        boolean z = true;
        if (this.f11468d != 1) {
            z = false;
        }
        C4965a.m15051b(z);
        this.f11468d = 0;
        this.f11469e = null;
        this.f11472h = false;
        mo24951p();
    }

    /* renamed from: m */
    public final C4611a mo24949m() {
        return this;
    }

    /* renamed from: n */
    public final C4886o mo24950n() {
        return this.f11469e;
    }

    /* renamed from: p */
    public abstract void mo24951p();

    /* renamed from: q */
    public abstract void mo24952q() throws C4639d;

    /* renamed from: r */
    public abstract void mo24953r() throws C4639d;

    /* renamed from: a */
    public final int mo24931a() {
        return this.f11468d;
    }

    /* renamed from: a */
    public final void mo24936a(C4854o oVar, C4811i[] iVarArr, C4886o oVar2, long j, boolean z, long j2) throws C4639d {
        C4965a.m15051b(this.f11468d == 0);
        this.f11466b = oVar;
        this.f11468d = 1;
        mo24937a(z);
        C4965a.m15051b(!this.f11472h);
        this.f11469e = oVar2;
        this.f11471g = false;
        this.f11470f = j2;
        mo24938a(iVarArr);
        mo24935a(j, z);
    }

    /* renamed from: a */
    public final void mo24939a(C4811i[] iVarArr, C4886o oVar, long j) throws C4639d {
        C4965a.m15051b(!this.f11472h);
        this.f11469e = oVar;
        this.f11471g = false;
        this.f11470f = j;
        mo24938a(iVarArr);
    }

    /* renamed from: a */
    public final void mo24934a(long j) throws C4639d {
        this.f11472h = false;
        this.f11471g = false;
        mo24935a(j, false);
    }

    /* renamed from: a */
    public final int mo24932a(C4813j jVar, C4643b bVar, boolean z) {
        int a = this.f11469e.mo25134a(jVar, bVar, z);
        if (a == -4) {
            if (bVar.mo25034b(4)) {
                this.f11471g = true;
                if (this.f11472h) {
                    return -4;
                }
                return -3;
            }
            bVar.f11651d += this.f11470f;
        } else if (a == -5) {
            C4811i iVar = jVar.f12776a;
            long j = iVar.f12772w;
            if (j != Long.MAX_VALUE) {
                jVar.f12776a = iVar.mo25299a(j + this.f11470f);
            }
        }
        return a;
    }
}
