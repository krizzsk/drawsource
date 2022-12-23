package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.f */
public class C1738f {

    /* renamed from: a */
    private final Map<String, C1740g> f2668a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: b */
    private final C1969m f2669b;

    /* renamed from: c */
    private final C2102v f2670c;

    /* renamed from: d */
    private final Object f2671d = new Object();

    /* renamed from: e */
    private final Map<String, Class<? extends MaxAdapter>> f2672e = new HashMap();

    /* renamed from: f */
    private final Set<String> f2673f = new HashSet();

    /* renamed from: g */
    private final Object f2674g = new Object();

    /* renamed from: h */
    private final Set<C1739a> f2675h = new HashSet();

    /* renamed from: com.applovin.impl.mediation.f$a */
    private static class C1739a {

        /* renamed from: a */
        private final String f2676a;

        /* renamed from: b */
        private final String f2677b;

        /* renamed from: c */
        private final MaxAdFormat f2678c;

        /* renamed from: d */
        private final JSONObject f2679d;

        C1739a(String str, String str2, C1583a aVar, C1969m mVar) {
            this.f2676a = str;
            this.f2677b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f2679d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(this.f2679d, "operation", str2);
            if (aVar != null) {
                this.f2678c = aVar.getFormat();
                if (aVar.getFormat() != null) {
                    JsonUtils.putString(this.f2679d, "format", aVar.getFormat().getLabel());
                    return;
                }
                return;
            }
            this.f2678c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public JSONObject mo13826a() {
            return this.f2679d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1739a aVar = (C1739a) obj;
            if (!this.f2676a.equals(aVar.f2676a) || !this.f2677b.equals(aVar.f2677b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f2678c;
            MaxAdFormat maxAdFormat2 = aVar.f2678c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.f2676a.hashCode() * 31) + this.f2677b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f2678c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f2676a + '\'' + ", operationTag='" + this.f2677b + '\'' + ", format=" + this.f2678c + '}';
        }
    }

    public C1738f(C1969m mVar) {
        if (mVar != null) {
            this.f2669b = mVar;
            this.f2670c = mVar.mo14509A();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: a */
    private C1740g m3696a(C1588f fVar, Class<? extends MaxAdapter> cls, boolean z) {
        try {
            return new C1740g(fVar, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.f2669b.mo14532Y()}), z, this.f2669b);
        } catch (Throwable th) {
            if (!C2102v.m5104a()) {
                return null;
            }
            C2102v.m5106c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    /* renamed from: a */
    private Class<? extends MaxAdapter> m3697a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            if (!C2102v.m5104a()) {
                return null;
            }
            C2102v.m5110i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1740g mo13820a(C1588f fVar) {
        return mo13821a(fVar, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.mediation.C1740g mo13821a(com.applovin.impl.mediation.p031a.C1588f r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0118
            java.lang.String r0 = r10.mo13431L()
            java.lang.String r1 = r10.mo13430K()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0035
            boolean r10 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r10 == 0) goto L_0x0034
            com.applovin.impl.sdk.v r10 = r9.f2670c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No adapter name provided for "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", not loading the adapter "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.mo15016e(r11, r0)
        L_0x0034:
            return r3
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x005f
            boolean r10 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r10 == 0) goto L_0x005e
            com.applovin.impl.sdk.v r10 = r9.f2670c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find default className for '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.mo15016e(r11, r0)
        L_0x005e:
            return r3
        L_0x005f:
            if (r11 == 0) goto L_0x006c
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r2 = r9.f2668a
            java.lang.Object r2 = r2.get(r1)
            com.applovin.impl.mediation.g r2 = (com.applovin.impl.mediation.C1740g) r2
            if (r2 == 0) goto L_0x006c
            return r2
        L_0x006c:
            java.lang.Object r2 = r9.f2671d
            monitor-enter(r2)
            java.util.Set<java.lang.String> r4 = r9.f2673f     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.contains(r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f2672e     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0088
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f2672e     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0115 }
            goto L_0x0095
        L_0x0088:
            java.lang.Class r4 = r9.m3697a((java.lang.String) r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x0095
            java.util.Set<java.lang.String> r10 = r9.f2673f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0095:
            com.applovin.impl.mediation.g r5 = r9.m3696a((com.applovin.impl.mediation.p031a.C1588f) r10, (java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>) r4, (boolean) r11)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00cb
            boolean r3 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x00b9
            com.applovin.impl.sdk.v r3 = r9.f2670c     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "MediationAdapterManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "Loaded "
            r7.append(r8)     // Catch:{ all -> 0x0115 }
            r7.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0115 }
            r3.mo15012b(r6, r0)     // Catch:{ all -> 0x0115 }
        L_0x00b9:
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r0 = r9.f2672e     // Catch:{ all -> 0x0115 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0115 }
            if (r11 == 0) goto L_0x00c9
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r11 = r9.f2668a     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r10.mo13430K()     // Catch:{ all -> 0x0115 }
            r11.put(r10, r5)     // Catch:{ all -> 0x0115 }
        L_0x00c9:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r5
        L_0x00cb:
            boolean r10 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x00e9
            com.applovin.impl.sdk.v r10 = r9.f2670c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r4.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "Failed to load "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            r4.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0115 }
            r10.mo15016e(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x00e9:
            java.util.Set<java.lang.String> r10 = r9.f2673f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x00f0:
            boolean r10 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x0113
            com.applovin.impl.sdk.v r10 = r9.f2670c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "Not attempting to load "
            r1.append(r4)     // Catch:{ all -> 0x0115 }
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = " due to prior errors"
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0115 }
            r10.mo15012b(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0115:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r10
        L_0x0118:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "No adapter spec specified"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.C1738f.mo13821a(com.applovin.impl.mediation.a.f, boolean):com.applovin.impl.mediation.g");
    }

    /* renamed from: a */
    public Collection<String> mo13822a() {
        Set unmodifiableSet;
        synchronized (this.f2671d) {
            HashSet hashSet = new HashSet(this.f2672e.size());
            for (Class<? extends MaxAdapter> name : this.f2672e.values()) {
                hashSet.add(name.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* renamed from: a */
    public void mo13823a(String str, String str2, C1583a aVar) {
        synchronized (this.f2674g) {
            if (C2102v.m5104a()) {
                C2102v A = this.f2669b.mo14509A();
                A.mo15016e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f2675h.add(new C1739a(str, str2, aVar, this.f2669b));
        }
    }

    /* renamed from: b */
    public Collection<String> mo13824b() {
        Set<T> unmodifiableSet;
        synchronized (this.f2671d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f2673f);
        }
        return unmodifiableSet;
    }

    /* renamed from: c */
    public Collection<JSONObject> mo13825c() {
        ArrayList arrayList;
        synchronized (this.f2674g) {
            arrayList = new ArrayList(this.f2675h.size());
            for (C1739a a : this.f2675h) {
                arrayList.add(a.mo13826a());
            }
        }
        return arrayList;
    }
}
