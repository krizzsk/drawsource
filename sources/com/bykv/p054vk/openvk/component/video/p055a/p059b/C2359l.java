package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.l */
/* compiled from: Urls */
public class C2359l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<String> f4774a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Set<String> f4775b = new HashSet();

    /* renamed from: c */
    private final ArrayList<C2360a> f4776c;

    /* renamed from: d */
    private final int f4777d;

    /* renamed from: e */
    private int f4778e = -1;

    /* renamed from: f */
    private int f4779f;

    /* renamed from: g */
    private final int f4780g;

    C2359l(List<String> list) {
        int i;
        if (!list.isEmpty()) {
            this.f4777d = list.size();
            this.f4776c = new ArrayList<>(this.f4777d);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String next : list) {
                C2360a aVar = new C2360a(next);
                if (f4774a.contains(next)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(aVar);
                } else if (f4775b.contains(next)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(aVar);
                } else {
                    this.f4776c.add(aVar);
                }
            }
            if (arrayList != null) {
                this.f4776c.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f4776c.addAll(arrayList2);
            }
            Integer num = C2325e.f4691i;
            if (num == null || num.intValue() <= 0) {
                i = this.f4777d >= 2 ? 1 : 2;
            } else {
                i = num.intValue();
            }
            this.f4780g = i;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    C2359l(String str) {
        ArrayList<C2360a> arrayList = new ArrayList<>(1);
        this.f4776c = arrayList;
        arrayList.add(new C2360a(str));
        this.f4777d = 1;
        this.f4780g = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15809a() {
        return this.f4779f < this.f4780g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2360a mo15810b() {
        if (mo15809a()) {
            int i = this.f4778e + 1;
            if (i >= this.f4777d - 1) {
                this.f4778e = -1;
                this.f4779f++;
            } else {
                this.f4778e = i;
            }
            C2360a aVar = this.f4776c.get(i);
            aVar.f4782b = (this.f4779f * this.f4777d) + this.f4778e;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.l$a */
    /* compiled from: Urls */
    public class C2360a {

        /* renamed from: a */
        final String f4781a;

        /* renamed from: b */
        int f4782b;

        C2360a(String str) {
            this.f4781a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15811a() {
            C2359l.f4774a.add(this.f4781a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15812b() {
            C2359l.f4775b.add(this.f4781a);
        }

        public String toString() {
            return this.f4781a;
        }
    }
}
