package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.g0 */
public abstract class C5085g0 {

    /* renamed from: a */
    public static final C5085g0 f13555a = new C5087b();

    /* renamed from: b */
    public static final C5085g0 f13556b = new C5088c();

    /* renamed from: a */
    public abstract void mo25889a(Object obj, long j);

    /* renamed from: a */
    public abstract <L> void mo25890a(Object obj, Object obj2, long j);

    /* renamed from: b */
    public abstract <L> List<L> mo25891b(Object obj, long j);

    /* renamed from: com.fyber.inneractive.sdk.protobuf.g0$c */
    public static final class C5088c extends C5085g0 {
        public C5088c() {
            super();
        }

        /* renamed from: a */
        public void mo25889a(Object obj, long j) {
            ((C5194z.C5205j) C5154r1.m15983g(obj, j)).mo25766b();
        }

        /* renamed from: b */
        public <L> List<L> mo25891b(Object obj, long j) {
            C5194z.C5205j jVar = (C5194z.C5205j) C5154r1.m15983g(obj, j);
            if (jVar.mo25768d()) {
                return jVar;
            }
            int size = jVar.size();
            C5194z.C5205j b = jVar.mo25786b(size == 0 ? 10 : size * 2);
            C5154r1.m15970a(obj, j, (Object) b);
            return b;
        }

        /* renamed from: a */
        public <E> void mo25890a(Object obj, Object obj2, long j) {
            C5194z.C5205j jVar = (C5194z.C5205j) C5154r1.m15983g(obj, j);
            C5194z.C5205j jVar2 = (C5194z.C5205j) C5154r1.m15983g(obj2, j);
            int size = jVar.size();
            int size2 = jVar2.size();
            if (size > 0 && size2 > 0) {
                if (!jVar.mo25768d()) {
                    jVar = jVar.mo25786b(size2 + size);
                }
                jVar.addAll(jVar2);
            }
            if (size > 0) {
                jVar2 = jVar;
            }
            C5154r1.m15970a(obj, j, (Object) jVar2);
        }
    }

    public C5085g0() {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.g0$b */
    public static final class C5087b extends C5085g0 {

        /* renamed from: c */
        public static final Class<?> f13557c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C5087b() {
            super();
        }

        /* renamed from: a */
        public void mo25889a(Object obj, long j) {
            Object obj2;
            List list = (List) C5154r1.m15983g(obj, j);
            if (list instanceof C5082f0) {
                obj2 = ((C5082f0) list).mo25797a();
            } else if (!f13557c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C5206z0) || !(list instanceof C5194z.C5205j)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C5194z.C5205j jVar = (C5194z.C5205j) list;
                    if (jVar.mo25768d()) {
                        jVar.mo25766b();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C5154r1.m15970a(obj, j, obj2);
        }

        /* renamed from: b */
        public <L> List<L> mo25891b(Object obj, long j) {
            return m15452a(obj, j, 10);
        }

        /* renamed from: a */
        public <E> void mo25890a(Object obj, Object obj2, long j) {
            List list = (List) C5154r1.m15983g(obj2, j);
            List a = m15452a(obj, j, list.size());
            int size = a.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                a.addAll(list);
            }
            if (size > 0) {
                list = a;
            }
            C5154r1.m15970a(obj, j, (Object) list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.fyber.inneractive.sdk.protobuf.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.fyber.inneractive.sdk.protobuf.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.fyber.inneractive.sdk.protobuf.e0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m15452a(java.lang.Object r3, long r4, int r6) {
            /*
                java.lang.Object r0 = com.fyber.inneractive.sdk.protobuf.C5154r1.m15983g(r3, r4)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5082f0
                if (r1 == 0) goto L_0x0016
                com.fyber.inneractive.sdk.protobuf.e0 r0 = new com.fyber.inneractive.sdk.protobuf.e0
                r0.<init>((int) r6)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5206z0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5194z.C5205j
                if (r1 == 0) goto L_0x0026
                com.fyber.inneractive.sdk.protobuf.z$j r0 = (com.fyber.inneractive.sdk.protobuf.C5194z.C5205j) r0
                com.fyber.inneractive.sdk.protobuf.z$j r6 = r0.mo25786b(r6)
                r0 = r6
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x002b:
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15970a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
                goto L_0x0087
            L_0x002f:
                java.lang.Class<?> r1 = f13557c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15970a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            L_0x004b:
                r0 = r1
                goto L_0x0087
            L_0x004d:
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5144p1
                if (r1 == 0) goto L_0x006a
                com.fyber.inneractive.sdk.protobuf.e0 r1 = new com.fyber.inneractive.sdk.protobuf.e0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.fyber.inneractive.sdk.protobuf.p1 r0 = (com.fyber.inneractive.sdk.protobuf.C5144p1) r0
                java.util.List<java.lang.Object> r6 = r1.f13545b
                int r6 = r6.size()
                r1.addAll(r6, r0)
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15970a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
                goto L_0x004b
            L_0x006a:
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5206z0
                if (r1 == 0) goto L_0x0087
                boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C5194z.C5205j
                if (r1 == 0) goto L_0x0087
                r1 = r0
                com.fyber.inneractive.sdk.protobuf.z$j r1 = (com.fyber.inneractive.sdk.protobuf.C5194z.C5205j) r1
                boolean r2 = r1.mo25768d()
                if (r2 != 0) goto L_0x0087
                int r0 = r0.size()
                int r0 = r0 + r6
                com.fyber.inneractive.sdk.protobuf.z$j r0 = r1.mo25786b(r0)
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15970a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            L_0x0087:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5085g0.C5087b.m15452a(java.lang.Object, long, int):java.util.List");
        }
    }
}
