package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.C4220b;
import com.fyber.inneractive.sdk.config.global.C4243k;
import com.fyber.inneractive.sdk.config.global.C4246n;
import com.fyber.inneractive.sdk.config.global.C4248p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.e */
public abstract class C4229e extends C4248p {

    /* renamed from: b */
    public String f10424b;

    /* renamed from: c */
    public List<C4220b> f10425c = new ArrayList();

    /* renamed from: d */
    public Map<String, C4243k> f10426d = new HashMap();

    public C4229e(String str) {
        this.f10424b = str;
    }

    /* renamed from: a */
    public String mo24237a(String str, String str2) {
        String str3;
        Iterator<String> it = this.f10426d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.f10426d.get(it.next()).mo24241c(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        C4246n nVar = this.f10449a;
        return nVar != null ? nVar.mo24237a(str, str2) : str2;
    }

    /* renamed from: b */
    public abstract C4229e mo24234b();

    /* renamed from: b */
    public Integer mo24240b(String str) {
        Integer num;
        Iterator<String> it = this.f10426d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.f10426d.get(it.next()).mo24240b(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.mo24240b(str) : num;
    }

    /* renamed from: c */
    public String mo24241c(String str) {
        return mo24237a(str, (String) null);
    }

    /* renamed from: d */
    public Boolean mo24242d(String str) {
        Boolean bool;
        Iterator<String> it = this.f10426d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.f10426d.get(it.next()).mo24242d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.mo24242d(str) : bool;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", new Object[]{this.f10424b, this.f10449a, this.f10425c});
    }

    /* renamed from: a */
    public Double mo24236a(String str) {
        Double d;
        Iterator<String> it = this.f10426d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.f10426d.get(it.next()).mo24236a(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.mo24236a(str) : d;
    }

    /* renamed from: a */
    public boolean mo24239a(String str, boolean z) {
        Boolean d = mo24242d(str);
        return d != null ? d.booleanValue() : z;
    }

    /* renamed from: a */
    public void mo24238a(C4229e eVar) {
        eVar.f10424b = this.f10424b;
        eVar.f10449a = this.f10449a;
        eVar.f10425c = new ArrayList(this.f10425c);
        eVar.f10426d = new HashMap(this.f10426d);
    }
}
