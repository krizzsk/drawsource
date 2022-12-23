package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.cache.session.h */
public class C4198h extends PriorityQueue<C4191e> {

    /* renamed from: a */
    public int f10323a;

    public C4198h(int i) {
        super(1, new C4199i());
        this.f10323a = i;
    }

    /* renamed from: a */
    public boolean add(C4191e eVar) {
        boolean add = super.add(eVar);
        if (super.size() > this.f10323a) {
            poll();
        }
        return add;
    }

    public int size() {
        return super.size();
    }
}
