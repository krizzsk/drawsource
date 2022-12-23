package com.ogury.p377ed.internal;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mk */
public final class C10256mk implements C10255mj, C10288nm<Object> {

    /* renamed from: a */
    public static final C10257a f25595a = new C10257a((byte) 0);

    /* renamed from: c */
    private static final Map<Class<? extends Object<?>>, Integer> f25596c;

    /* renamed from: d */
    private static final HashMap<String, String> f25597d;

    /* renamed from: e */
    private static final HashMap<String, String> f25598e;

    /* renamed from: f */
    private static final HashMap<String, String> f25599f;

    /* renamed from: g */
    private static final Map<String, String> f25600g;

    /* renamed from: b */
    private final Class<?> f25601b;

    public C10256mk(Class<?> cls) {
        C10263mq.m29882b(cls, "jClass");
        this.f25601b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo65136a() {
        return this.f25601b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10256mk) && C10263mq.m29881a((Object) C10226li.m29854a(this), (Object) C10226li.m29854a((C10288nm) obj));
    }

    public final int hashCode() {
        return C10226li.m29854a(this).hashCode();
    }

    public final String toString() {
        return mo65136a().toString() + " (Kotlin reflection is not available)";
    }

    /* renamed from: com.ogury.ed.internal.mk$a */
    public static final class C10257a {
        private C10257a() {
        }

        public /* synthetic */ C10257a(byte b) {
            this();
        }
    }

    static {
        int i = 0;
        Iterable b = C10190km.m29758b(C10227lj.class, C10228lk.class, C10239lv.class, C10243lz.class, C10245ma.class, C10246mb.class, C10247mc.class, C10248md.class, C10249me.class, C10250mf.class, C10229ll.class, C10230lm.class, C10231ln.class, C10232lo.class, C10233lp.class, C10234lq.class, C10235lr.class, C10236ls.class, C10237lt.class, C10238lu.class, C10240lw.class, C10241lx.class, C10242ly.class);
        Collection arrayList = new ArrayList(C10190km.m29760a(b));
        for (Object next : b) {
            int i2 = i + 1;
            if (i < 0) {
                C10190km.m29759b();
            }
            arrayList.add(C10179kb.m29744a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f25596c = C10220lc.m29848a((List) arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f25597d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f25598e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f25597d);
        hashMap3.putAll(f25598e);
        Collection<String> values = f25597d.values();
        C10263mq.m29879a((Object) values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C10263mq.m29879a((Object) str, "kotlinName");
            sb.append(C10312oc.m29961a(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C10176jz a = C10179kb.m29744a(sb2, str + ".Companion");
            hashMap3.put(a.mo65018a(), a.mo65019b());
        }
        for (Map.Entry next2 : f25596c.entrySet()) {
            hashMap3.put(((Class) next2.getKey()).getName(), "kotlin.Function".concat(String.valueOf(((Number) next2.getValue()).intValue())));
        }
        f25599f = hashMap3;
        Map map = hashMap3;
        Map<String, String> linkedHashMap = new LinkedHashMap<>(C10220lc.m29845a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C10312oc.m29961a((String) entry.getValue()));
        }
        f25600g = linkedHashMap;
    }
}
