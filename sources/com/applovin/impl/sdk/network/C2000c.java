package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1867b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.c */
public class C2000c<T> {

    /* renamed from: a */
    private String f3817a;

    /* renamed from: b */
    private String f3818b;

    /* renamed from: c */
    private Map<String, String> f3819c;

    /* renamed from: d */
    private Map<String, String> f3820d;

    /* renamed from: e */
    private final JSONObject f3821e;

    /* renamed from: f */
    private String f3822f;

    /* renamed from: g */
    private final T f3823g;

    /* renamed from: h */
    private final int f3824h;

    /* renamed from: i */
    private int f3825i;

    /* renamed from: j */
    private final int f3826j;

    /* renamed from: k */
    private final int f3827k;

    /* renamed from: l */
    private final boolean f3828l;

    /* renamed from: m */
    private final boolean f3829m;

    /* renamed from: n */
    private final boolean f3830n;

    /* renamed from: o */
    private final boolean f3831o;

    /* renamed from: com.applovin.impl.sdk.network.c$a */
    public static class C2001a<T> {

        /* renamed from: a */
        String f3832a;

        /* renamed from: b */
        String f3833b;

        /* renamed from: c */
        String f3834c;

        /* renamed from: d */
        Map<String, String> f3835d;

        /* renamed from: e */
        Map<String, String> f3836e;

        /* renamed from: f */
        JSONObject f3837f;

        /* renamed from: g */
        T f3838g;

        /* renamed from: h */
        int f3839h = 1;

        /* renamed from: i */
        int f3840i;

        /* renamed from: j */
        int f3841j;

        /* renamed from: k */
        boolean f3842k;

        /* renamed from: l */
        boolean f3843l;

        /* renamed from: m */
        boolean f3844m;

        /* renamed from: n */
        boolean f3845n;

        public C2001a(C1969m mVar) {
            this.f3840i = ((Integer) mVar.mo14534a(C1867b.f3219cO)).intValue();
            this.f3841j = ((Integer) mVar.mo14534a(C1867b.f3218cN)).intValue();
            this.f3843l = ((Boolean) mVar.mo14534a(C1867b.f3217cM)).booleanValue();
            this.f3844m = ((Boolean) mVar.mo14534a(C1867b.f3348ep)).booleanValue();
            this.f3845n = ((Boolean) mVar.mo14534a(C1867b.f3353eu)).booleanValue();
            this.f3835d = new HashMap();
        }

        /* renamed from: a */
        public C2001a<T> mo14722a(int i) {
            this.f3839h = i;
            return this;
        }

        /* renamed from: a */
        public C2001a<T> mo14723a(T t) {
            this.f3838g = t;
            return this;
        }

        /* renamed from: a */
        public C2001a<T> mo14724a(String str) {
            this.f3833b = str;
            return this;
        }

        /* renamed from: a */
        public C2001a<T> mo14725a(Map<String, String> map) {
            this.f3835d = map;
            return this;
        }

        /* renamed from: a */
        public C2001a<T> mo14726a(JSONObject jSONObject) {
            this.f3837f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C2001a<T> mo14727a(boolean z) {
            this.f3842k = z;
            return this;
        }

        /* renamed from: a */
        public C2000c<T> mo14728a() {
            return new C2000c<>(this);
        }

        /* renamed from: b */
        public C2001a<T> mo14729b(int i) {
            this.f3840i = i;
            return this;
        }

        /* renamed from: b */
        public C2001a<T> mo14730b(String str) {
            this.f3832a = str;
            return this;
        }

        /* renamed from: b */
        public C2001a<T> mo14731b(Map<String, String> map) {
            this.f3836e = map;
            return this;
        }

        /* renamed from: b */
        public C2001a<T> mo14732b(boolean z) {
            this.f3843l = z;
            return this;
        }

        /* renamed from: c */
        public C2001a<T> mo14733c(int i) {
            this.f3841j = i;
            return this;
        }

        /* renamed from: c */
        public C2001a<T> mo14734c(String str) {
            this.f3834c = str;
            return this;
        }

        /* renamed from: c */
        public C2001a<T> mo14735c(boolean z) {
            this.f3844m = z;
            return this;
        }

        /* renamed from: d */
        public C2001a<T> mo14736d(boolean z) {
            this.f3845n = z;
            return this;
        }
    }

    protected C2000c(C2001a<T> aVar) {
        this.f3817a = aVar.f3833b;
        this.f3818b = aVar.f3832a;
        this.f3819c = aVar.f3835d;
        this.f3820d = aVar.f3836e;
        this.f3821e = aVar.f3837f;
        this.f3822f = aVar.f3834c;
        this.f3823g = aVar.f3838g;
        this.f3824h = aVar.f3839h;
        this.f3825i = aVar.f3839h;
        this.f3826j = aVar.f3840i;
        this.f3827k = aVar.f3841j;
        this.f3828l = aVar.f3842k;
        this.f3829m = aVar.f3843l;
        this.f3830n = aVar.f3844m;
        this.f3831o = aVar.f3845n;
    }

    /* renamed from: a */
    public static <T> C2001a<T> m4627a(C1969m mVar) {
        return new C2001a<>(mVar);
    }

    /* renamed from: a */
    public String mo14701a() {
        return this.f3817a;
    }

    /* renamed from: a */
    public void mo14702a(int i) {
        this.f3825i = i;
    }

    /* renamed from: a */
    public void mo14703a(String str) {
        this.f3817a = str;
    }

    /* renamed from: b */
    public String mo14704b() {
        return this.f3818b;
    }

    /* renamed from: b */
    public void mo14705b(String str) {
        this.f3818b = str;
    }

    /* renamed from: c */
    public Map<String, String> mo14706c() {
        return this.f3819c;
    }

    /* renamed from: d */
    public Map<String, String> mo14707d() {
        return this.f3820d;
    }

    /* renamed from: e */
    public JSONObject mo14708e() {
        return this.f3821e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2000c)) {
            return false;
        }
        C2000c cVar = (C2000c) obj;
        String str = this.f3817a;
        if (str == null ? cVar.f3817a != null : !str.equals(cVar.f3817a)) {
            return false;
        }
        Map<String, String> map = this.f3819c;
        if (map == null ? cVar.f3819c != null : !map.equals(cVar.f3819c)) {
            return false;
        }
        Map<String, String> map2 = this.f3820d;
        if (map2 == null ? cVar.f3820d != null : !map2.equals(cVar.f3820d)) {
            return false;
        }
        String str2 = this.f3822f;
        if (str2 == null ? cVar.f3822f != null : !str2.equals(cVar.f3822f)) {
            return false;
        }
        String str3 = this.f3818b;
        if (str3 == null ? cVar.f3818b != null : !str3.equals(cVar.f3818b)) {
            return false;
        }
        JSONObject jSONObject = this.f3821e;
        if (jSONObject == null ? cVar.f3821e != null : !jSONObject.equals(cVar.f3821e)) {
            return false;
        }
        T t = this.f3823g;
        if (t == null ? cVar.f3823g == null : t.equals(cVar.f3823g)) {
            return this.f3824h == cVar.f3824h && this.f3825i == cVar.f3825i && this.f3826j == cVar.f3826j && this.f3827k == cVar.f3827k && this.f3828l == cVar.f3828l && this.f3829m == cVar.f3829m && this.f3830n == cVar.f3830n && this.f3831o == cVar.f3831o;
        }
        return false;
    }

    /* renamed from: f */
    public String mo14710f() {
        return this.f3822f;
    }

    /* renamed from: g */
    public T mo14711g() {
        return this.f3823g;
    }

    /* renamed from: h */
    public int mo14712h() {
        return this.f3825i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3817a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3822f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3818b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f3823g;
        if (t != null) {
            i = t.hashCode();
        }
        int i2 = ((((((((((((((((hashCode4 + i) * 31) + this.f3824h) * 31) + this.f3825i) * 31) + this.f3826j) * 31) + this.f3827k) * 31) + (this.f3828l ? 1 : 0)) * 31) + (this.f3829m ? 1 : 0)) * 31) + (this.f3830n ? 1 : 0)) * 31) + (this.f3831o ? 1 : 0);
        Map<String, String> map = this.f3819c;
        if (map != null) {
            i2 = (i2 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f3820d;
        if (map2 != null) {
            i2 = (i2 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f3821e;
        if (jSONObject == null) {
            return i2;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (i2 * 31) + new String(charArray).hashCode();
    }

    /* renamed from: i */
    public int mo14714i() {
        return this.f3824h - this.f3825i;
    }

    /* renamed from: j */
    public int mo14715j() {
        return this.f3826j;
    }

    /* renamed from: k */
    public int mo14716k() {
        return this.f3827k;
    }

    /* renamed from: l */
    public boolean mo14717l() {
        return this.f3828l;
    }

    /* renamed from: m */
    public boolean mo14718m() {
        return this.f3829m;
    }

    /* renamed from: n */
    public boolean mo14719n() {
        return this.f3830n;
    }

    /* renamed from: o */
    public boolean mo14720o() {
        return this.f3831o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f3817a + ", backupEndpoint=" + this.f3822f + ", httpMethod=" + this.f3818b + ", httpHeaders=" + this.f3820d + ", body=" + this.f3821e + ", emptyResponse=" + this.f3823g + ", initialRetryAttempts=" + this.f3824h + ", retryAttemptsLeft=" + this.f3825i + ", timeoutMillis=" + this.f3826j + ", retryDelayMillis=" + this.f3827k + ", exponentialRetries=" + this.f3828l + ", retryOnAllErrors=" + this.f3829m + ", encodingEnabled=" + this.f3830n + ", gzipBodyEncoding=" + this.f3831o + '}';
    }
}
