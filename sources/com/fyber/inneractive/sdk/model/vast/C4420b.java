package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.measurement.C4410i;
import com.fyber.inneractive.sdk.response.C5237i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.model.vast.b */
public class C4420b implements C5237i {

    /* renamed from: a */
    public String f10859a;

    /* renamed from: b */
    public String f10860b;

    /* renamed from: c */
    public Map<C4435q, List<String>> f10861c = new HashMap();

    /* renamed from: d */
    public PriorityQueue<C4431m> f10862d;

    /* renamed from: e */
    public final List<C4410i> f10863e = new ArrayList();

    /* renamed from: f */
    public PriorityQueue<C4421c> f10864f;

    /* renamed from: g */
    public C4421c f10865g = null;

    /* renamed from: h */
    public int f10866h = 0;

    /* renamed from: i */
    public int f10867i = 0;

    public C4420b(Comparator<C4431m> comparator, Comparator<C4421c> comparator2) {
        this.f10862d = new PriorityQueue<>(1, comparator);
        this.f10864f = new PriorityQueue<>(1, comparator2);
    }

    /* renamed from: a */
    public List<String> mo24589a(C4435q qVar) {
        Map<C4435q, List<String>> map = this.f10861c;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: b */
    public List<C4431m> mo24610b() {
        return new ArrayList(this.f10862d);
    }

    /* renamed from: c */
    public List<C4410i> mo24611c() {
        return this.f10863e;
    }

    /* renamed from: a */
    public int mo24608a() {
        return this.f10862d.size();
    }

    /* renamed from: a */
    public void mo24609a(C4435q qVar, String str) {
        List list = this.f10861c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f10861c.put(qVar, list);
        }
        list.add(str);
    }
}
