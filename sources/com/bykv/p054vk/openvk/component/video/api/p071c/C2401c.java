package com.bykv.p054vk.openvk.component.video.api.p071c;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.c */
/* compiled from: VideoUrlModel */
public class C2401c implements Serializable {

    /* renamed from: a */
    public String f4891a;

    /* renamed from: b */
    public int f4892b;

    /* renamed from: c */
    public final HashMap<String, Object> f4893c = new HashMap<>();

    /* renamed from: d */
    private C2400b f4894d;

    /* renamed from: e */
    private C2400b f4895e;

    /* renamed from: f */
    private String f4896f;

    /* renamed from: g */
    private int f4897g = 204800;

    /* renamed from: h */
    private String f4898h;

    /* renamed from: i */
    private int f4899i;

    /* renamed from: j */
    private int f4900j;

    /* renamed from: k */
    private List<String> f4901k;

    /* renamed from: l */
    private String f4902l;

    /* renamed from: m */
    private long f4903m;

    /* renamed from: n */
    private boolean f4904n;

    /* renamed from: o */
    private int f4905o = 0;

    /* renamed from: p */
    private int f4906p = 0;

    /* renamed from: q */
    private int f4907q = 10000;

    /* renamed from: r */
    private int f4908r = 10000;

    /* renamed from: s */
    private int f4909s = 10000;

    /* renamed from: t */
    private int f4910t = 0;

    public C2401c(String str, C2400b bVar, C2400b bVar2, int i, int i2) {
        this.f4896f = str;
        this.f4894d = bVar;
        this.f4895e = bVar2;
        this.f4905o = i;
        this.f4906p = i2;
    }

    /* renamed from: a */
    public String mo15966a() {
        return this.f4896f;
    }

    /* renamed from: a */
    public void mo15969a(String str) {
        this.f4896f = str;
    }

    /* renamed from: b */
    public int mo15973b() {
        if (mo15990i()) {
            return this.f4895e.mo15958m();
        }
        C2400b bVar = this.f4894d;
        if (bVar != null) {
            return bVar.mo15958m();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo15975b(String str) {
        this.f4898h = str;
    }

    /* renamed from: c */
    public int mo15976c() {
        return this.f4899i;
    }

    /* renamed from: a */
    public void mo15967a(int i) {
        this.f4899i = i;
    }

    /* renamed from: d */
    public int mo15979d() {
        return this.f4900j;
    }

    /* renamed from: b */
    public void mo15974b(int i) {
        this.f4900j = i;
    }

    /* renamed from: a */
    public void mo15971a(List<String> list) {
        this.f4901k = list;
    }

    /* renamed from: c */
    public void mo15978c(String str) {
        this.f4902l = str;
    }

    /* renamed from: e */
    public long mo15982e() {
        return this.f4903m;
    }

    /* renamed from: a */
    public void mo15968a(long j) {
        this.f4903m = j;
    }

    /* renamed from: f */
    public boolean mo15986f() {
        return this.f4904n;
    }

    /* renamed from: a */
    public void mo15972a(boolean z) {
        this.f4904n = z;
    }

    /* renamed from: g */
    public long mo15987g() {
        if (mo15990i()) {
            return this.f4895e.mo15943e();
        }
        C2400b bVar = this.f4894d;
        if (bVar != null) {
            return bVar.mo15943e();
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo15989h() {
        if (mo15990i()) {
            return this.f4895e.mo15965t();
        }
        C2400b bVar = this.f4894d;
        if (bVar != null) {
            return bVar.mo15965t();
        }
        return true;
    }

    /* renamed from: d */
    public void mo15981d(String str) {
        this.f4891a = str;
    }

    /* renamed from: c */
    public void mo15977c(int i) {
        this.f4892b = i;
    }

    /* renamed from: i */
    public boolean mo15990i() {
        return this.f4905o == 1 && this.f4906p == 1 && this.f4895e != null;
    }

    /* renamed from: j */
    public String mo15991j() {
        if (mo15990i()) {
            return this.f4895e.mo15953i();
        }
        C2400b bVar = this.f4894d;
        if (bVar != null) {
            return bVar.mo15953i();
        }
        return null;
    }

    /* renamed from: k */
    public String mo15992k() {
        if (mo15990i()) {
            return this.f4895e.mo15957l();
        }
        C2400b bVar = this.f4894d;
        if (bVar != null) {
            return bVar.mo15957l();
        }
        return null;
    }

    /* renamed from: l */
    public int mo15993l() {
        return this.f4905o;
    }

    /* renamed from: a */
    public synchronized void mo15970a(String str, Object obj) {
        this.f4893c.put(str, obj);
    }

    /* renamed from: e */
    public synchronized Object mo15983e(String str) {
        return this.f4893c.get(str);
    }

    /* renamed from: m */
    public int mo15994m() {
        return this.f4907q;
    }

    /* renamed from: d */
    public void mo15980d(int i) {
        this.f4907q = i;
    }

    /* renamed from: n */
    public int mo15995n() {
        return this.f4908r;
    }

    /* renamed from: e */
    public void mo15984e(int i) {
        this.f4908r = i;
    }

    /* renamed from: o */
    public int mo15996o() {
        return this.f4909s;
    }

    /* renamed from: f */
    public void mo15985f(int i) {
        this.f4909s = i;
    }

    /* renamed from: p */
    public int mo15997p() {
        return this.f4910t;
    }

    /* renamed from: g */
    public void mo15988g(int i) {
        this.f4910t = i;
    }

    /* renamed from: q */
    public C2400b mo15998q() {
        return this.f4894d;
    }

    /* renamed from: r */
    public C2400b mo15999r() {
        return this.f4895e;
    }
}
