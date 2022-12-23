package com.tapjoy.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bh */
public abstract class C11296bh implements C11293be, C11302bj {

    /* renamed from: a */
    private HashMap<String, Object> f26955a;

    /* renamed from: a */
    public static C11296bh m30909a(InputStream inputStream) {
        return C11298a.m30926a().mo69716a(inputStream);
    }

    /* renamed from: b */
    public static C11296bh m30911b(String str) {
        return C11298a.m30926a().mo69718a(str);
    }

    /* renamed from: com.tapjoy.internal.bh$a */
    public static abstract class C11298a {

        /* renamed from: a */
        private static C11298a f26957a;

        /* renamed from: a */
        public static C11298a m30926a() {
            C11298a aVar = f26957a;
            if (aVar != null) {
                return aVar;
            }
            C11298a aVar2 = C11299bi.f26958a;
            f26957a = aVar2;
            return aVar2;
        }

        /* renamed from: a */
        public final C11296bh mo69716a(InputStream inputStream) {
            return mo69717a((Reader) new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        }

        /* renamed from: a */
        public C11296bh mo69718a(String str) {
            return mo69716a((InputStream) new ByteArrayInputStream(str.getBytes("UTF-8")));
        }

        /* renamed from: a */
        public C11296bh mo69717a(Reader reader) {
            return mo69718a(C11530go.m31566a(reader).toString());
        }
    }

    /* renamed from: a */
    public final Object mo69702a(String str) {
        HashMap<String, Object> hashMap = this.f26955a;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo69703a(String str, Object obj) {
        if (this.f26955a == null) {
            this.f26955a = new HashMap<>();
        }
        this.f26955a.put(str, obj);
    }

    /* renamed from: a */
    public final boolean mo69710a() {
        return mo69725k() == C11305bm.BEGIN_OBJECT;
    }

    /* renamed from: t */
    private boolean m30913t() {
        if (mo69725k() != C11305bm.NULL) {
            return false;
        }
        mo69729o();
        return true;
    }

    /* renamed from: b */
    public final String mo69711b() {
        if (m30913t()) {
            return null;
        }
        return mo69727m();
    }

    /* renamed from: c */
    public final String mo69712c(String str) {
        if (m30913t()) {
            return str;
        }
        return mo69727m();
    }

    /* renamed from: com.tapjoy.internal.bh$1 */
    static /* synthetic */ class C112971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26956a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bm[] r0 = com.tapjoy.internal.C11305bm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26956a = r0
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26956a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26956a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26956a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26956a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.NUMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26956a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11296bh.C112971.<clinit>():void");
        }
    }

    /* renamed from: u */
    private Object m30914u() {
        C11305bm k = mo69725k();
        switch (C112971.f26956a[k.ordinal()]) {
            case 1:
                return mo69713c();
            case 2:
                return mo69714d();
            case 3:
                mo69729o();
                return null;
            case 4:
                return Boolean.valueOf(mo69728n());
            case 5:
                return new C11323cc(mo69727m());
            case 6:
                return mo69727m();
            default:
                throw new IllegalStateException("Expected a value but was ".concat(String.valueOf(k)));
        }
    }

    /* renamed from: c */
    public final <E> List<E> mo69713c() {
        LinkedList linkedList = new LinkedList();
        m30910a((List) linkedList);
        return linkedList;
    }

    /* renamed from: a */
    private void m30910a(List list) {
        mo69720f();
        while (mo69724j()) {
            list.add(m30914u());
        }
        mo69721g();
    }

    /* renamed from: d */
    public final Map<String, Object> mo69714d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo69709a((Map) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo69709a(Map map) {
        mo69722h();
        while (mo69724j()) {
            map.put(mo69726l(), m30914u());
        }
        mo69723i();
    }

    @Nullable
    /* renamed from: a */
    public final <T> T mo69707a(C11288bc<T> bcVar) {
        if (m30913t()) {
            return null;
        }
        return bcVar.mo69701a(this);
    }

    /* renamed from: a */
    public final <T> void mo69708a(List<T> list, C11288bc<T> bcVar) {
        mo69720f();
        while (mo69724j()) {
            list.add(bcVar.mo69701a(this));
        }
        mo69721g();
    }

    /* renamed from: d */
    private static URI m30912d(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new C11309bp(e);
        }
    }

    /* renamed from: e */
    public final URL mo69715e() {
        URI uri = (URI) mo69702a("BASE_URI");
        if (uri != null) {
            return uri.resolve(m30912d(mo69727m())).toURL();
        }
        return new URL(mo69727m());
    }
}
