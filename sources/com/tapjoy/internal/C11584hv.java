package com.tapjoy.internal;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hv */
public final class C11584hv implements Flushable {

    /* renamed from: a */
    private final File f27857a;

    /* renamed from: b */
    private final Object f27858b = this;

    /* renamed from: c */
    private C11276ar<C11435ex> f27859c;

    public C11584hv(File file) {
        this.f27857a = file;
        try {
            this.f27859c = C11273ao.m30865a(new C11444f(file, new C11282ax<C11435ex>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo69687a(OutputStream outputStream, Object obj) {
                    C11435ex exVar = (C11435ex) obj;
                    C11400el<C11435ex> elVar = C11435ex.f27288c;
                    C11399ek.m31148a(exVar, "value == null");
                    C11399ek.m31148a(outputStream, "stream == null");
                    C11646jc a = C11649jf.m31948a(C11649jf.m31950a(outputStream));
                    elVar.mo69856a(a, exVar);
                    a.mo70247a();
                }

                /* renamed from: b */
                public final /* synthetic */ Object mo69686b(InputStream inputStream) {
                    C11400el<C11435ex> elVar = C11435ex.f27288c;
                    C11399ek.m31148a(inputStream, "stream == null");
                    return elVar.mo69853a(C11649jf.m31949a(C11649jf.m31951a(inputStream)));
                }
            }));
        } catch (Exception unused) {
            m31758c();
        }
    }

    /* renamed from: c */
    private void m31758c() {
        this.f27857a.delete();
        C11276ar<C11435ex> arVar = this.f27859c;
        if (arVar instanceof Closeable) {
            try {
                ((Closeable) arVar).close();
            } catch (Exception unused) {
            }
        }
        this.f27859c = new C11274ap(new LinkedList());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f27858b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f27859c     // Catch:{ all -> 0x0016 }
            boolean r1 = r1 instanceof java.io.Flushable     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f27859c     // Catch:{ Exception -> 0x0011 }
            java.io.Flushable r1 = (java.io.Flushable) r1     // Catch:{ Exception -> 0x0011 }
            r1.flush()     // Catch:{ Exception -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r2.m31758c()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11584hv.flush():void");
    }

    /* renamed from: a */
    public final int mo70169a() {
        int size;
        synchronized (this.f27858b) {
            try {
                size = this.f27859c.size();
            } catch (Exception unused) {
                m31758c();
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    /* renamed from: b */
    public final boolean mo70173b() {
        boolean isEmpty;
        synchronized (this.f27858b) {
            try {
                isEmpty = this.f27859c.isEmpty();
            } catch (Exception unused) {
                m31758c();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70170a(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f27858b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f27859c     // Catch:{ Exception -> 0x000b }
            r1.mo69632b(r3)     // Catch:{ Exception -> 0x000b }
            goto L_0x000e
        L_0x0009:
            r3 = move-exception
            goto L_0x0010
        L_0x000b:
            r2.m31758c()     // Catch:{ all -> 0x0009 }
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11584hv.mo70170a(int):void");
    }

    @Nullable
    /* renamed from: b */
    public final C11435ex mo70172b(int i) {
        C11435ex a;
        synchronized (this.f27858b) {
            try {
                a = this.f27859c.mo69631a(i);
            } catch (Exception unused) {
                m31758c();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70171a(com.tapjoy.internal.C11435ex r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f27858b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f27859c     // Catch:{ Exception -> 0x000b }
            r1.add(r3)     // Catch:{ Exception -> 0x000b }
            goto L_0x0013
        L_0x0009:
            r3 = move-exception
            goto L_0x0015
        L_0x000b:
            r2.m31758c()     // Catch:{ all -> 0x0009 }
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f27859c     // Catch:{ Exception -> 0x0013 }
            r1.add(r3)     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11584hv.mo70171a(com.tapjoy.internal.ex):void");
    }
}
