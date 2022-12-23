package com.tapjoy.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.tapjoy.internal.gm */
public class C11527gm extends Observable {

    /* renamed from: b */
    public final List<C11528a> f27692b = new ArrayList();

    /* renamed from: com.tapjoy.internal.gm$a */
    public class C11528a {

        /* renamed from: a */
        public final String f27693a;

        /* renamed from: b */
        public volatile Map<String, Object> f27694b;

        C11528a(String str) {
            this.f27693a = str;
        }

        /* renamed from: a */
        public final Object mo70080a(String str) {
            Map<String, Object> map = this.f27694b;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11528a mo70075a(String str) {
        C11528a aVar = new C11528a(str);
        this.f27692b.add(aVar);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void setChanged() {
        super.setChanged();
        notifyObservers();
    }

    /* renamed from: a */
    public final boolean mo70076a(String str, boolean z) {
        for (C11528a a : this.f27692b) {
            Object a2 = a.mo70080a(str);
            if (a2 != null) {
                if (a2 instanceof Boolean) {
                    return ((Boolean) a2).booleanValue();
                }
                if (!(a2 instanceof String)) {
                    continue;
                } else if ("true".equals(a2)) {
                    return true;
                } else {
                    if ("false".equals(a2)) {
                        return false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final long mo70077b(String str) {
        for (C11528a a : this.f27692b) {
            Object a2 = a.mo70080a(str);
            if (a2 != null) {
                if (a2 instanceof Number) {
                    return ((Number) a2).longValue();
                }
                if (a2 instanceof String) {
                    try {
                        return Long.parseLong((String) a2);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static long m31558a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final C11526gl mo70078c(String str) {
        double parseDouble;
        for (C11528a a : this.f27692b) {
            Object a2 = a.mo70080a(str);
            if (a2 instanceof List) {
                List list = (List) a2;
                try {
                    long a3 = m31558a(list.get(0));
                    long a4 = m31558a(list.get(1));
                    long a5 = m31558a(list.get(2));
                    Object obj = list.get(3);
                    if (obj instanceof Number) {
                        parseDouble = ((Number) obj).doubleValue();
                    } else if (obj instanceof String) {
                        parseDouble = Double.parseDouble((String) obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return new C11526gl(a3, a4, a5, parseDouble);
                } catch (RuntimeException unused) {
                }
            }
        }
        return C11526gl.f27686a;
    }
}
