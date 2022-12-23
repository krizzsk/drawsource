package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.C4400a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAlog {

    /* renamed from: a */
    public static int f13936a = 4;

    /* renamed from: b */
    public static final C4400a f13937b = new C4400a();

    /* renamed from: c */
    public static final List<FMPLogger> f13938c = new C5252a();

    /* renamed from: com.fyber.inneractive.sdk.util.IAlog$a */
    public class C5252a extends CopyOnWriteArrayList<FMPLogger> {
        public C5252a() {
            add(IAlog.f13937b);
        }
    }

    /* renamed from: b */
    public static void m16447b(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, (Throwable) null, objArr);
        }
    }

    /* renamed from: c */
    public static void m16448c(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m16449d(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    /* renamed from: e */
    public static void m16450e(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m16446a(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m16445a(String str, Throwable th, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    /* renamed from: a */
    public static void m16444a(int i, Exception exc, String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f13938c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(i, (Exception) null, str, objArr);
        }
    }

    /* renamed from: a */
    public static String m16443a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    /* renamed from: a */
    public static String m16442a(Class<?> cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
