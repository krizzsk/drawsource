package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4686j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4871h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4882m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4886o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4887p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g */
public final class C4683g implements C4882m, C4686j.C4688b, C4698e.C4700b {

    /* renamed from: a */
    public final C4698e f11787a;

    /* renamed from: b */
    public final C4680d f11788b;

    /* renamed from: c */
    public final int f11789c;

    /* renamed from: d */
    public final C4868f.C4869a f11790d;

    /* renamed from: e */
    public final C4913b f11791e;

    /* renamed from: f */
    public final IdentityHashMap<C4886o, Integer> f11792f = new IdentityHashMap<>();

    /* renamed from: g */
    public final C4689k f11793g = new C4689k();

    /* renamed from: h */
    public final Handler f11794h = new Handler();

    /* renamed from: i */
    public final long f11795i;

    /* renamed from: j */
    public C4882m.C4883a f11796j;

    /* renamed from: k */
    public int f11797k;

    /* renamed from: l */
    public boolean f11798l;

    /* renamed from: m */
    public C4890s f11799m;

    /* renamed from: n */
    public C4686j[] f11800n;

    /* renamed from: o */
    public C4686j[] f11801o;

    /* renamed from: p */
    public C4871h f11802p;

    public C4683g(C4698e eVar, C4680d dVar, int i, C4868f.C4869a aVar, C4913b bVar, long j) {
        this.f11787a = eVar;
        this.f11788b = dVar;
        this.f11789c = i;
        this.f11790d = aVar;
        this.f11791e = bVar;
        this.f11795i = j;
    }

    /* renamed from: a */
    public void mo25118a(C4882m.C4883a aVar) {
        this.f11787a.f11908h.add(this);
        this.f11796j = aVar;
        C4691a aVar2 = this.f11787a.f11911k;
        ArrayList arrayList = new ArrayList(aVar2.f11845b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C4691a.C4692a aVar3 = (C4691a.C4692a) arrayList.get(i);
            if (aVar3.f11851b.f12760k > 0 || m14310a(aVar3, "avc")) {
                arrayList2.add(aVar3);
            } else if (m14310a(aVar3, "mp4a")) {
                arrayList3.add(aVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<C4691a.C4692a> list = aVar2.f11846c;
        List<C4691a.C4692a> list2 = aVar2.f11847d;
        int size = list.size() + 1 + list2.size();
        this.f11800n = new C4686j[size];
        this.f11797k = size;
        C4965a.m15049a(!arrayList.isEmpty());
        C4691a.C4692a[] aVarArr = new C4691a.C4692a[arrayList.size()];
        arrayList.toArray(aVarArr);
        C4686j a = mo25116a(0, aVarArr, aVar2.f11848e, aVar2.f11849f);
        this.f11800n[0] = a;
        a.f11812c.f11748h = true;
        a.mo25145g();
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            C4686j a2 = mo25116a(1, new C4691a.C4692a[]{list.get(i2)}, (C4811i) null, Collections.emptyList());
            this.f11800n[i3] = a2;
            a2.mo25145g();
            i2++;
            i3++;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C4691a.C4692a aVar4 = list2.get(i4);
            C4686j a3 = mo25116a(3, new C4691a.C4692a[]{aVar4}, (C4811i) null, Collections.emptyList());
            a3.mo25139a(0).mo25074a(aVar4.f11851b);
            a3.f11823n = true;
            a3.mo25147i();
            this.f11800n[i3] = a3;
            i4++;
            i3++;
        }
    }

    /* renamed from: b */
    public C4890s mo25122b() {
        return this.f11799m;
    }

    /* renamed from: c */
    public void mo25123c() {
        mo25128g();
    }

    /* renamed from: c */
    public void mo25124c(long j) {
    }

    /* renamed from: d */
    public long mo25125d() {
        long j;
        long j2 = Long.MAX_VALUE;
        for (C4686j jVar : this.f11801o) {
            if (jVar.f11834y) {
                j = Long.MIN_VALUE;
            } else if (jVar.mo25146h()) {
                j = jVar.f11833x;
            } else {
                long j3 = jVar.f11832w;
                C4682f last = jVar.f11820k.getLast();
                if (!last.f11769F) {
                    if (jVar.f11820k.size() > 1) {
                        LinkedList<C4682f> linkedList = jVar.f11820k;
                        last = linkedList.get(linkedList.size() - 2);
                    } else {
                        last = null;
                    }
                }
                if (last != null) {
                    j3 = Math.max(j3, last.f12906g);
                }
                int size = jVar.f11819j.size();
                for (int i = 0; i < size; i++) {
                    j3 = Math.max(j3, jVar.f11819j.valueAt(i).mo25080d());
                }
                j = j3;
            }
            if (j != Long.MIN_VALUE) {
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    /* renamed from: e */
    public void mo25126e() throws IOException {
        C4686j[] jVarArr = this.f11800n;
        if (jVarArr != null) {
            for (C4686j j : jVarArr) {
                j.mo25148j();
            }
        }
    }

    /* renamed from: f */
    public long mo25127f() {
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo25128g() {
        if (this.f11799m != null) {
            ((C4806h) this.f11796j).mo25270a((C4887p) this);
            return;
        }
        for (C4686j g : this.f11800n) {
            g.mo25145g();
        }
    }

    /* renamed from: b */
    public long mo25121b(long j) {
        this.f11793g.f11836a.clear();
        for (C4686j d : this.f11801o) {
            d.mo25144d(j);
        }
        return j;
    }

    /* renamed from: a */
    public long mo25115a(C4906e[] eVarArr, boolean[] zArr, C4886o[] oVarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        C4906e[] eVarArr2 = eVarArr;
        C4886o[] oVarArr2 = oVarArr;
        long j3 = j;
        int[] iArr = new int[eVarArr2.length];
        int[] iArr2 = new int[eVarArr2.length];
        for (int i2 = 0; i2 < eVarArr2.length; i2++) {
            if (oVarArr2[i2] == null) {
                i = -1;
            } else {
                i = this.f11792f.get(oVarArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (eVarArr2[i2] != null) {
                C4889r b = eVarArr2[i2].mo25418b();
                int i3 = 0;
                while (true) {
                    C4686j[] jVarArr = this.f11800n;
                    if (i3 >= jVarArr.length) {
                        break;
                    } else if (jVarArr[i3].f11829t.mo25410a(b) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f11792f.clear();
        int length = eVarArr2.length;
        C4886o[] oVarArr3 = new C4886o[length];
        C4886o[] oVarArr4 = new C4886o[eVarArr2.length];
        C4906e[] eVarArr3 = new C4906e[eVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f11800n.length);
        int i4 = 0;
        boolean z = false;
        while (i4 < this.f11800n.length) {
            for (int i5 = 0; i5 < eVarArr2.length; i5++) {
                C4906e eVar = null;
                oVarArr4[i5] = iArr[i5] == i4 ? oVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    eVar = eVarArr2[i5];
                }
                eVarArr3[i5] = eVar;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            C4906e[] eVarArr4 = eVarArr3;
            z |= this.f11800n[i4].mo25143a(eVarArr3, zArr, oVarArr4, zArr2, !this.f11798l);
            boolean z2 = false;
            for (int i7 = 0; i7 < eVarArr2.length; i7++) {
                if (iArr2[i7] == i6) {
                    C4965a.m15051b(oVarArr4[i7] != null);
                    oVarArr3[i7] = oVarArr4[i7];
                    this.f11792f.put(oVarArr4[i7], Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    C4965a.m15051b(oVarArr4[i7] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.f11800n[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            eVarArr3 = eVarArr4;
            long j4 = j;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oVarArr3, 0, oVarArr2, 0, length);
        C4686j[] jVarArr2 = new C4686j[arrayList3.size()];
        this.f11801o = jVarArr2;
        arrayList3.toArray(jVarArr2);
        C4686j[] jVarArr3 = this.f11801o;
        if (jVarArr3.length > 0) {
            jVarArr3[0].f11812c.f11748h = true;
            int i8 = 1;
            while (true) {
                C4686j[] jVarArr4 = this.f11801o;
                if (i8 >= jVarArr4.length) {
                    break;
                }
                jVarArr4[i8].f11812c.f11748h = false;
                i8++;
            }
        }
        this.f11802p = new C4871h(this.f11801o);
        if (!this.f11798l || !z) {
            j2 = j;
        } else {
            j2 = j;
            mo25121b(j2);
            for (int i9 = 0; i9 < eVarArr2.length; i9++) {
                if (oVarArr2[i9] != null) {
                    zArr2[i9] = true;
                }
            }
        }
        this.f11798l = true;
        return j2;
    }

    /* renamed from: a */
    public boolean mo25120a(long j) {
        return this.f11802p.mo25120a(j);
    }

    /* renamed from: a */
    public long mo25114a() {
        return this.f11802p.mo25114a();
    }

    /* renamed from: a */
    public void mo25119a(C4887p pVar) {
        if (this.f11799m != null) {
            ((C4806h) this.f11796j).mo25270a((C4887p) this);
        }
    }

    /* renamed from: a */
    public void mo25117a(C4691a.C4692a aVar, long j) {
        int c;
        for (C4686j jVar : this.f11800n) {
            C4676c cVar = jVar.f11812c;
            int a = cVar.f11746f.mo25406a(aVar.f11851b);
            if (!(a == -1 || (c = cVar.f11756p.mo25420c(a)) == -1)) {
                cVar.f11756p.mo25416a(c, j);
            }
        }
        mo25128g();
    }

    /* renamed from: a */
    public final C4686j mo25116a(int i, C4691a.C4692a[] aVarArr, C4811i iVar, List<C4811i> list) {
        C4676c cVar = new C4676c(this.f11787a, aVarArr, this.f11788b, this.f11793g, list);
        C4913b bVar = this.f11791e;
        long j = this.f11795i;
        return new C4686j(i, this, cVar, bVar, j, iVar, this.f11789c, this.f11790d);
    }

    /* renamed from: a */
    public static boolean m14310a(C4691a.C4692a aVar, String str) {
        String str2 = aVar.f11851b.f12752c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String startsWith : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (startsWith.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
