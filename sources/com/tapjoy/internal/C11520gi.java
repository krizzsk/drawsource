package com.tapjoy.internal;

import android.os.SystemClock;
import com.facebook.login.LoginLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gi */
public abstract class C11520gi {
    @Nullable

    /* renamed from: a */
    static Set<String> f27665a = null;

    /* renamed from: b */
    private static final ThreadLocal<Map<String, C11522a>> f27666b = new ThreadLocal<Map<String, C11522a>>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new HashMap();
        }
    };

    /* renamed from: c */
    private static C11520gi f27667c;

    /* renamed from: d */
    private static volatile boolean f27668d = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70059a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70060a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70061a(long j, String str, @Nullable String str2, @Nullable Map<String, Long> map);

    /* renamed from: a */
    public static void m31524a(C11524gk gkVar) {
        if (f27667c == null) {
            f27667c = gkVar;
            if (f27668d) {
                gkVar.mo70060a(C11685u.m32055b());
            }
        }
    }

    /* renamed from: a */
    public static void m31529a(boolean z) {
        if (f27668d != z) {
            f27668d = z;
            C11520gi giVar = f27667c;
            if (giVar == null) {
                return;
            }
            if (z) {
                giVar.mo70060a(C11685u.m32055b());
            } else {
                giVar.mo70059a();
            }
        }
    }

    /* renamed from: a */
    public static void m31528a(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            f27665a = null;
        } else {
            f27665a = new HashSet(collection);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31531b(String str, @Nullable String str2, @Nullable Map<String, Long> map) {
        C11520gi giVar;
        Set<String> set = f27665a;
        if ((set == null || !set.contains(str)) && f27668d && (giVar = f27667c) != null) {
            giVar.mo70061a(C11685u.m32055b(), str, str2, map);
        }
    }

    /* renamed from: a */
    public static void m31527a(String str, @Nullable TreeMap<String, Object> treeMap, @Nullable Map<String, Long> map) {
        m31531b(str, treeMap != null ? C11287bb.m30888a((Object) treeMap) : null, map);
    }

    /* renamed from: a */
    public static C11522a m31523a(String str) {
        C11522a a = new C11522a(str).mo70063a();
        f27666b.get().put(str, a);
        return a;
    }

    /* renamed from: b */
    public static C11522a m31530b(String str) {
        C11522a aVar = (C11522a) f27666b.get().remove(str);
        return aVar != null ? aVar.mo70068b() : new C11522a(str);
    }

    /* renamed from: c */
    public static C11522a m31532c(String str) {
        return (C11522a) f27666b.get().get(str);
    }

    /* renamed from: d */
    public static C11522a m31533d(String str) {
        return (C11522a) f27666b.get().remove(str);
    }

    /* renamed from: a */
    public static void m31525a(String str, C11522a aVar) {
        if (aVar == null) {
            Object[] objArr = new Object[1];
        } else if (str.equals(aVar.f27669a)) {
            f27666b.get().put(str, aVar);
        } else {
            Object[] objArr2 = new Object[2];
            String str2 = aVar.f27669a;
        }
    }

    /* renamed from: e */
    public static C11522a m31534e(String str) {
        return new C11522a(str);
    }

    /* renamed from: com.tapjoy.internal.gi$a */
    public static final class C11522a {

        /* renamed from: a */
        final String f27669a;

        /* renamed from: b */
        private final TreeMap<String, Object> f27670b = new TreeMap<>();

        /* renamed from: c */
        private final Map<String, Long> f27671c = new HashMap();

        /* renamed from: d */
        private volatile long f27672d;

        C11522a(String str) {
            this.f27669a = str;
        }

        /* renamed from: a */
        public final C11522a mo70063a() {
            try {
                this.f27672d = SystemClock.elapsedRealtime();
            } catch (NullPointerException unused) {
                this.f27672d = -1;
            }
            return this;
        }

        /* renamed from: b */
        public final C11522a mo70068b() {
            long j = this.f27672d;
            if (j != -1) {
                try {
                    mo70065a("spent_time", SystemClock.elapsedRealtime() - j);
                } catch (NullPointerException unused) {
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C11522a mo70066a(String str, Object obj) {
            this.f27670b.put(str, obj);
            return this;
        }

        /* renamed from: a */
        public final C11522a mo70067a(Map<String, Object> map) {
            if (map != null) {
                this.f27670b.putAll(map);
            }
            return this;
        }

        /* renamed from: a */
        public final C11522a mo70064a(String str) {
            this.f27670b.put(LoginLogger.EVENT_EXTRAS_FAILURE, str);
            return this;
        }

        /* renamed from: b */
        public final C11522a mo70069b(String str) {
            this.f27670b.put("misuse", str);
            return this;
        }

        /* renamed from: a */
        public final C11522a mo70065a(String str, long j) {
            this.f27671c.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: b */
        public final C11522a mo70070b(Map<String, Long> map) {
            if (map != null) {
                this.f27671c.putAll(map);
            }
            return this;
        }

        /* renamed from: c */
        public final void mo70071c() {
            String str = this.f27669a;
            Map<String, Long> map = null;
            String a = this.f27670b.size() > 0 ? C11287bb.m30888a((Object) this.f27670b) : null;
            if (this.f27671c.size() > 0) {
                map = this.f27671c;
            }
            C11520gi.m31531b(str, a, map);
        }
    }
}
