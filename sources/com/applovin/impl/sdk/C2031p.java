package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.p */
public class C2031p {

    /* renamed from: a */
    private final String f3946a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final String f3947b;

    /* renamed from: c */
    private final Map<String, Object> f3948c;

    /* renamed from: d */
    private final long f3949d;

    public C2031p(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f3947b = str;
        HashMap hashMap = new HashMap();
        this.f3948c = hashMap;
        hashMap.putAll(map);
        this.f3948c.put("applovin_sdk_super_properties", map2);
        this.f3949d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public String mo14840a() {
        return this.f3947b;
    }

    /* renamed from: b */
    public Map<String, Object> mo14841b() {
        return this.f3948c;
    }

    /* renamed from: c */
    public long mo14842c() {
        return this.f3949d;
    }

    /* renamed from: d */
    public String mo14843d() {
        return this.f3946a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2031p pVar = (C2031p) obj;
        if (this.f3949d != pVar.f3949d) {
            return false;
        }
        String str = this.f3947b;
        if (str == null ? pVar.f3947b != null : !str.equals(pVar.f3947b)) {
            return false;
        }
        Map<String, Object> map = this.f3948c;
        if (map == null ? pVar.f3948c != null : !map.equals(pVar.f3948c)) {
            return false;
        }
        String str2 = this.f3946a;
        String str3 = pVar.f3946a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3947b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f3948c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f3949d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f3946a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event{name='" + this.f3947b + '\'' + ", id='" + this.f3946a + '\'' + ", creationTimestampMillis=" + this.f3949d + ", parameters=" + this.f3948c + '}';
    }
}
