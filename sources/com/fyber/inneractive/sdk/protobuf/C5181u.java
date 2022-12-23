package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5068c0;
import com.fyber.inneractive.sdk.protobuf.C5149q0;
import com.fyber.inneractive.sdk.protobuf.C5169t1;
import com.fyber.inneractive.sdk.protobuf.C5181u.C5182a;
import com.fyber.inneractive.sdk.protobuf.C5194z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u */
public final class C5181u<T extends C5182a<T>> {

    /* renamed from: d */
    public static final C5181u f13733d;

    /* renamed from: a */
    public final C5106i1<T, Object> f13734a;

    /* renamed from: b */
    public boolean f13735b;

    /* renamed from: c */
    public boolean f13736c;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.u$a */
    public interface C5182a<T extends C5182a<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo25739a();

        /* renamed from: a */
        C5149q0.C5150a mo25740a(C5149q0.C5150a aVar, C5149q0 q0Var);

        /* renamed from: b */
        boolean mo25741b();

        /* renamed from: c */
        C5169t1.C5171b mo25742c();

        /* renamed from: d */
        C5169t1.C5176c mo25744d();

        /* renamed from: e */
        boolean mo25745e();
    }

    static {
        C5181u uVar = new C5181u(C5106i1.m15554b(0));
        uVar.mo26214g();
        f13733d = uVar;
    }

    public C5181u() {
        this.f13734a = C5106i1.m15554b(16);
    }

    /* renamed from: b */
    public static <T extends C5182a<T>> C5181u<T> m16132b() {
        return f13733d;
    }

    /* renamed from: a */
    public C5181u<T> clone() {
        C5181u<T> uVar = new C5181u<>();
        for (int i = 0; i < this.f13734a.f13579b.size(); i++) {
            Map.Entry<T, Object> a = this.f13734a.mo25934a(i);
            uVar.mo26206c((C5182a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f13734a.mo25936b()) {
            uVar.mo26206c((C5182a) next.getKey(), next.getValue());
        }
        uVar.f13736c = this.f13736c;
        return uVar;
    }

    /* renamed from: c */
    public void mo26206c(T t, Object obj) {
        if (!t.mo25741b()) {
            mo26210d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo26210d(t, it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C5068c0) {
            this.f13736c = true;
        }
        this.f13734a.put(t, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.mo25739a()), r6.mo25742c().f13717a, r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C5068c0) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C5194z.C5197c) == false) goto L_0x0043;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26210d(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.protobuf.t1$b r0 = r6.mo25742c()
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.C5194z.f13762a
            r7.getClass()
            com.fyber.inneractive.sdk.protobuf.t1$c r0 = r0.f13717a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003d;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0034;
                case 5: goto L_0x0031;
                case 6: goto L_0x0027;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5149q0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5068c0
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x001e:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5194z.C5197c
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x0027:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5093i
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0043
        L_0x002f:
            r0 = r2
            goto L_0x0044
        L_0x0031:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0044
        L_0x0034:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0037:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0044
        L_0x003a:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0044
        L_0x003d:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0044
        L_0x0040:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.mo25739a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.fyber.inneractive.sdk.protobuf.t1$b r6 = r6.mo25742c()
            com.fyber.inneractive.sdk.protobuf.t1$c r6 = r6.f13717a
            r3[r2] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r3[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5181u.mo26210d(com.fyber.inneractive.sdk.protobuf.u$a, java.lang.Object):void");
    }

    /* renamed from: e */
    public boolean mo26211e() {
        for (int i = 0; i < this.f13734a.f13579b.size(); i++) {
            if (!m16133b(this.f13734a.mo25934a(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> b : this.f13734a.mo25936b()) {
            if (!m16133b(b)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5181u)) {
            return false;
        }
        return this.f13734a.equals(((C5181u) obj).f13734a);
    }

    /* renamed from: f */
    public Iterator<Map.Entry<T, Object>> mo26213f() {
        if (this.f13736c) {
            return new C5068c0.C5070b(this.f13734a.entrySet().iterator());
        }
        return this.f13734a.entrySet().iterator();
    }

    /* renamed from: g */
    public void mo26214g() {
        if (!this.f13735b) {
            this.f13734a.mo25941d();
            this.f13735b = true;
        }
    }

    public int hashCode() {
        return this.f13734a.hashCode();
    }

    /* renamed from: b */
    public static <T extends C5182a<T>> boolean m16133b(Map.Entry<T, Object> entry) {
        C5182a aVar = (C5182a) entry.getKey();
        if (aVar.mo25744d() == C5169t1.C5176c.MESSAGE) {
            if (aVar.mo25741b()) {
                for (C5149q0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C5149q0) {
                    if (!((C5149q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C5068c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public C5181u(C5106i1<T, Object> i1Var) {
        this.f13734a = i1Var;
        mo26214g();
    }

    /* renamed from: a */
    public static int m16129a(C5169t1.C5171b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.f13718b;
    }

    /* renamed from: a */
    public Object mo26202a(T t) {
        Object obj = this.f13734a.get(t);
        return obj instanceof C5068c0 ? ((C5068c0) obj).mo25793a((C5149q0) null) : obj;
    }

    /* renamed from: a */
    public void mo26203a(T t, Object obj) {
        List list;
        if (((GeneratedMessageLite.C5052c) t).f13493d) {
            mo26210d(t, obj);
            Object a = mo26202a(t);
            if (a == null) {
                list = new ArrayList();
                this.f13734a.put(t, list);
            } else {
                list = (List) a;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public static int m16131b(C5182a<?> aVar, Object obj) {
        C5169t1.C5171b c = aVar.mo25742c();
        int a = aVar.mo25739a();
        if (!aVar.mo25741b()) {
            return m16127a(c, a, obj);
        }
        int i = 0;
        if (aVar.mo25745e()) {
            for (Object a2 : (List) obj) {
                i += m16128a(c, a2);
            }
            return C5125l.m15781b(a) + i + C5125l.m15785c(i);
        }
        for (Object a3 : (List) obj) {
            i += m16127a(c, a, a3);
        }
        return i;
    }

    /* renamed from: a */
    public void mo26204a(C5181u<T> uVar) {
        for (int i = 0; i < uVar.f13734a.f13579b.size(); i++) {
            mo26207c(uVar.f13734a.mo25934a(i));
        }
        for (Map.Entry<T, Object> c : uVar.f13734a.mo25936b()) {
            mo26207c(c);
        }
    }

    /* renamed from: c */
    public final void mo26207c(Map.Entry<T, Object> entry) {
        C5182a aVar = (C5182a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5068c0) {
            value = ((C5068c0) value).mo25793a((C5149q0) null);
        }
        if (aVar.mo25741b()) {
            Object a = mo26202a(aVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m16130a(a2));
            }
            this.f13734a.put(aVar, a);
        } else if (aVar.mo25744d() == C5169t1.C5176c.MESSAGE) {
            Object a3 = mo26202a(aVar);
            if (a3 == null) {
                this.f13734a.put(aVar, m16130a(value));
                return;
            }
            this.f13734a.put(aVar, ((GeneratedMessageLite.C5050a) aVar.mo25740a(((C5149q0) a3).toBuilder(), (C5149q0) value)).mo25734a());
        } else {
            this.f13734a.put(aVar, m16130a(value));
        }
    }

    /* renamed from: a */
    public static Object m16130a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final int mo26200a(Map.Entry<T, Object> entry) {
        int b;
        int c;
        C5182a aVar = (C5182a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.mo25744d() != C5169t1.C5176c.MESSAGE || aVar.mo25741b() || aVar.mo25745e()) {
            return m16131b(aVar, value);
        }
        if (value instanceof C5068c0) {
            b = (C5125l.m15781b(1) * 2) + C5125l.m15793f(2, ((C5182a) entry.getKey()).mo25739a());
            c = C5125l.m15781b(3) + C5125l.m15777a((C5073d0) (C5068c0) value);
        } else {
            b = (C5125l.m15781b(1) * 2) + C5125l.m15793f(2, ((C5182a) entry.getKey()).mo25739a());
            int b2 = C5125l.m15781b(3);
            int serializedSize = ((C5149q0) value).getSerializedSize();
            c = b2 + C5125l.m15785c(serializedSize) + serializedSize;
        }
        return b + c;
    }

    /* renamed from: d */
    public int mo26209d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13734a.f13579b.size(); i2++) {
            Map.Entry<T, Object> a = this.f13734a.mo25934a(i2);
            i += m16131b((C5182a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f13734a.mo25936b()) {
            i += m16131b((C5182a) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: a */
    public static int m16127a(C5169t1.C5171b bVar, int i, Object obj) {
        int b = C5125l.m15781b(i);
        if (bVar == C5169t1.C5171b.GROUP) {
            b *= 2;
        }
        return b + m16128a(bVar, obj);
    }

    /* renamed from: c */
    public int mo26205c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13734a.f13579b.size(); i2++) {
            i += mo26200a(this.f13734a.mo25934a(i2));
        }
        for (Map.Entry<T, Object> a : this.f13734a.mo25936b()) {
            i += mo26200a(a);
        }
        return i;
    }

    /* renamed from: a */
    public static int m16128a(C5169t1.C5171b bVar, Object obj) {
        int serializedSize;
        int c;
        switch (bVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = C5125l.f13629b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = C5125l.f13629b;
                return 4;
            case 2:
                return C5125l.m15776a(((Long) obj).longValue());
            case 3:
                return C5125l.m15776a(((Long) obj).longValue());
            case 4:
                return C5125l.m15767a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = C5125l.f13629b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = C5125l.f13629b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = C5125l.f13629b;
                return 1;
            case 8:
                if (obj instanceof C5093i) {
                    return C5125l.m15778a((C5093i) obj);
                }
                return C5125l.m15779a((String) obj);
            case 9:
                Logger logger6 = C5125l.f13629b;
                return ((C5149q0) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof C5068c0)) {
                    Logger logger7 = C5125l.f13629b;
                    serializedSize = ((C5149q0) obj).getSerializedSize();
                    c = C5125l.m15785c(serializedSize);
                    break;
                } else {
                    return C5125l.m15777a((C5073d0) (C5068c0) obj);
                }
            case 11:
                if (!(obj instanceof C5093i)) {
                    Logger logger8 = C5125l.f13629b;
                    serializedSize = ((byte[]) obj).length;
                    c = C5125l.m15785c(serializedSize);
                    break;
                } else {
                    return C5125l.m15778a((C5093i) obj);
                }
            case 12:
                return C5125l.m15785c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C5194z.C5197c) {
                    return C5125l.m15767a(((C5194z.C5197c) obj).mo24014a());
                }
                return C5125l.m15767a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = C5125l.f13629b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = C5125l.f13629b;
                return 8;
            case 16:
                return C5125l.m15785c(C5125l.m15788d(((Integer) obj).intValue()));
            case 17:
                return C5125l.m15776a(C5125l.m15784b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c + serializedSize;
    }
}
