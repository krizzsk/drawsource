package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

final class SubscriberMethod {

    /* renamed from: a */
    final Method f20419a;

    /* renamed from: b */
    final ThreadMode f20420b;

    /* renamed from: c */
    final Class<?> f20421c;

    /* renamed from: d */
    String f20422d;

    SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f20419a = method;
        this.f20420b = threadMode;
        this.f20421c = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        m23811a();
        return this.f20422d.equals(((SubscriberMethod) obj).f20422d);
    }

    /* renamed from: a */
    private synchronized void m23811a() {
        if (this.f20422d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f20419a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f20419a.getName());
            sb.append('(');
            sb.append(this.f20421c.getName());
            this.f20422d = sb.toString();
        }
    }

    public final int hashCode() {
        return this.f20419a.hashCode();
    }
}
