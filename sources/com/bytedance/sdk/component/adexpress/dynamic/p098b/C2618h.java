package com.bytedance.sdk.component.adexpress.dynamic.p098b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.h */
/* compiled from: DynamicLayoutUnit */
public class C2618h {

    /* renamed from: a */
    private String f5669a;

    /* renamed from: b */
    private float f5670b;

    /* renamed from: c */
    private float f5671c;

    /* renamed from: d */
    private float f5672d;

    /* renamed from: e */
    private float f5673e;

    /* renamed from: f */
    private float f5674f;

    /* renamed from: g */
    private float f5675g;

    /* renamed from: h */
    private float f5676h;

    /* renamed from: i */
    private C2615e f5677i;

    /* renamed from: j */
    private List<C2618h> f5678j;

    /* renamed from: k */
    private C2618h f5679k;

    /* renamed from: l */
    private List<List<C2618h>> f5680l;

    /* renamed from: m */
    private String f5681m;

    /* renamed from: a */
    public String mo17060a() {
        return this.f5681m;
    }

    /* renamed from: a */
    public void mo17064a(String str) {
        this.f5681m = str;
    }

    /* renamed from: b */
    public String mo17066b() {
        return this.f5669a;
    }

    /* renamed from: b */
    public void mo17069b(String str) {
        this.f5669a = str;
    }

    /* renamed from: c */
    public float mo17071c() {
        return this.f5672d;
    }

    /* renamed from: a */
    public void mo17061a(float f) {
        this.f5672d = f;
    }

    /* renamed from: d */
    public float mo17073d() {
        return this.f5673e;
    }

    /* renamed from: b */
    public void mo17067b(float f) {
        this.f5673e = f;
    }

    /* renamed from: e */
    public float mo17075e() {
        return this.f5670b;
    }

    /* renamed from: c */
    public void mo17072c(float f) {
        this.f5670b = f;
    }

    /* renamed from: f */
    public float mo17077f() {
        return this.f5671c;
    }

    /* renamed from: d */
    public void mo17074d(float f) {
        this.f5671c = f;
    }

    /* renamed from: g */
    public float mo17079g() {
        return this.f5674f;
    }

    /* renamed from: e */
    public void mo17076e(float f) {
        this.f5674f = f;
    }

    /* renamed from: h */
    public float mo17081h() {
        return this.f5675g;
    }

    /* renamed from: f */
    public void mo17078f(float f) {
        this.f5675g = f;
    }

    /* renamed from: g */
    public void mo17080g(float f) {
        this.f5676h = f;
    }

    /* renamed from: i */
    public C2615e mo17082i() {
        return this.f5677i;
    }

    /* renamed from: a */
    public void mo17062a(C2615e eVar) {
        this.f5677i = eVar;
    }

    /* renamed from: j */
    public List<C2618h> mo17083j() {
        return this.f5678j;
    }

    /* renamed from: a */
    public void mo17065a(List<C2618h> list) {
        this.f5678j = list;
    }

    /* renamed from: a */
    public void mo17063a(C2618h hVar) {
        if (this.f5678j == null) {
            this.f5678j = new ArrayList();
        }
        this.f5678j.add(hVar);
    }

    /* renamed from: b */
    public void mo17068b(C2618h hVar) {
        this.f5679k = hVar;
    }

    /* renamed from: k */
    public C2618h mo17084k() {
        return this.f5679k;
    }

    /* renamed from: l */
    public int mo17085l() {
        C2616f e = this.f5677i.mo16882e();
        return e.mo16887C() + e.mo16888D();
    }

    /* renamed from: m */
    public int mo17086m() {
        C2616f e = this.f5677i.mo16882e();
        return e.mo16885A() + e.mo16886B();
    }

    /* renamed from: n */
    public float mo17087n() {
        C2616f e = this.f5677i.mo16882e();
        return ((float) mo17085l()) + e.mo16960g() + e.mo16965h() + (e.mo16945d() * 2.0f);
    }

    /* renamed from: o */
    public float mo17088o() {
        C2616f e = this.f5677i.mo16882e();
        return ((float) mo17086m()) + e.mo16970i() + e.mo16955f() + (e.mo16945d() * 2.0f);
    }

    /* renamed from: b */
    public void mo17070b(List<List<C2618h>> list) {
        this.f5680l = list;
    }

    /* renamed from: p */
    public List<List<C2618h>> mo17089p() {
        return this.f5680l;
    }

    /* renamed from: q */
    public boolean mo17090q() {
        List<C2618h> list = this.f5678j;
        return list == null || list.size() <= 0;
    }

    /* renamed from: r */
    public void mo17091r() {
        List<List<C2618h>> list = this.f5680l;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List next : this.f5680l) {
                if (next != null && next.size() > 0) {
                    arrayList.add(next);
                }
            }
            this.f5680l = arrayList;
        }
    }

    /* renamed from: s */
    public boolean mo17092s() {
        return TextUtils.equals(this.f5677i.mo16882e().mo17003r(), "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f5669a + '\'' + ", x=" + this.f5670b + ", y=" + this.f5671c + ", width=" + this.f5674f + ", height=" + this.f5675g + ", remainWidth=" + this.f5676h + ", rootBrick=" + this.f5677i + ", childrenBrickUnits=" + this.f5678j + '}';
    }

    /* renamed from: a */
    public static void m6958a(JSONObject jSONObject, C2618h hVar, C2618h hVar2) {
        if (jSONObject != null && hVar != null) {
            hVar.mo17069b(jSONObject.optString("id", "root"));
            hVar.mo17072c((float) jSONObject.optDouble("x", 0.0d));
            hVar.mo17074d((float) jSONObject.optDouble("y", 0.0d));
            hVar.mo17076e((float) jSONObject.optDouble("width", 0.0d));
            hVar.mo17078f((float) jSONObject.optDouble("height", 0.0d));
            hVar.mo17080g((float) jSONObject.optDouble("remainWidth", 0.0d));
            C2615e eVar = new C2615e();
            C2615e.m6765a(jSONObject.optJSONObject("brick"), eVar);
            hVar.mo17062a(eVar);
            hVar.mo17068b(hVar2);
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    Object opt = optJSONArray.opt(i);
                    if (opt != null && !"null".equals(opt.toString()) && (opt instanceof JSONArray)) {
                        int i2 = 0;
                        while (true) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (i2 >= jSONArray.length()) {
                                break;
                            }
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            C2618h hVar3 = new C2618h();
                            m6958a(optJSONObject, hVar3, hVar);
                            hVar.mo17063a(hVar3);
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public boolean mo17093t() {
        return this.f5677i.mo16882e().mo16907W() < 0 || this.f5677i.mo16882e().mo16908X() < 0 || this.f5677i.mo16882e().mo16905U() < 0 || this.f5677i.mo16882e().mo16906V() < 0;
    }
}
