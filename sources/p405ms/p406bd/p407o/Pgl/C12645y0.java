package p405ms.p406bd.p407o.Pgl;

/* renamed from: ms.bd.o.Pgl.y0 */
public class C12645y0 {

    /* renamed from: c */
    private static volatile C12645y0 f29927c;

    /* renamed from: a */
    private int f29928a = 0;

    /* renamed from: b */
    private Throwable f29929b = null;

    private C12645y0() {
    }

    /* renamed from: a */
    public static C12645y0 m33544a() {
        if (f29927c == null) {
            synchronized (C12645y0.class) {
                if (f29927c == null) {
                    f29927c = new C12645y0();
                }
            }
        }
        return f29927c;
    }

    /* renamed from: b */
    public synchronized Throwable mo74938b() {
        return this.f29929b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo74939c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.f29929b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            int r0 = r2.f29928a     // Catch:{ all -> 0x001e }
            int r1 = r0 + 1
            r2.f29928a = r1     // Catch:{ all -> 0x001e }
            r1 = 30
            if (r0 >= r1) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            r0 = 0
            r2.f29928a = r0     // Catch:{ all -> 0x001e }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r2.f29929b = r0     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p405ms.p406bd.p407o.Pgl.C12645y0.mo74939c():void");
    }
}
