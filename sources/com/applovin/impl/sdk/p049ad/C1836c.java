package com.applovin.impl.sdk.p049ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
public class C1836c {

    /* renamed from: a */
    private final C1969m f2958a;

    /* renamed from: b */
    private final String f2959b;

    /* renamed from: com.applovin.impl.sdk.ad.c$a */
    public enum C1837a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d */
        private final String f2964d;

        private C1837a(String str) {
            this.f2964d = str;
        }

        public String toString() {
            return this.f2964d;
        }
    }

    public C1836c(String str, C1969m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (mVar != null) {
            this.f2959b = str;
            this.f2958a = mVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private String m3896a(C1867b<String> bVar) {
        for (String next : this.f2958a.mo14567b(bVar)) {
            if (this.f2959b.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo14146a() {
        return this.f2959b;
    }

    /* renamed from: b */
    public C1837a mo14147b() {
        return m3896a(C1867b.f3179ba) != null ? C1837a.REGULAR : m3896a(C1867b.f3180bb) != null ? C1837a.AD_RESPONSE_JSON : C1837a.UNSPECIFIED;
    }

    /* renamed from: c */
    public String mo14148c() {
        String a = m3896a(C1867b.f3179ba);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = m3896a(C1867b.f3180bb);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }

    /* renamed from: d */
    public JSONObject mo14149d() {
        if (mo14147b() != C1837a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f2959b.substring(mo14148c().length()), 0), "UTF-8"));
                if (C2102v.m5104a()) {
                    C2102v A = this.f2958a.mo14509A();
                    A.mo15012b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                C2102v A2 = this.f2958a.mo14509A();
                A2.mo15013b("AdToken", "Unable to decode token '" + this.f2959b + "' into JSON", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            if (!C2102v.m5104a()) {
                return null;
            }
            C2102v A3 = this.f2958a.mo14509A();
            A3.mo15013b("AdToken", "Unable to process ad response from token '" + this.f2959b + "'", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1836c)) {
            return false;
        }
        String str = this.f2959b;
        String str2 = ((C1836c) obj).f2959b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f2959b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f2959b);
        return "AdToken{id=" + prefixToIndex + ", type=" + mo14147b() + '}';
    }
}
