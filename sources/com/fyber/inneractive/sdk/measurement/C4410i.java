package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.response.C5237i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.measurement.i */
public class C4410i implements C5237i {

    /* renamed from: a */
    public URL f10820a;

    /* renamed from: b */
    public String f10821b;

    /* renamed from: c */
    public Map<C4435q, List<String>> f10822c = new HashMap();

    /* renamed from: d */
    public String f10823d;

    /* renamed from: e */
    public String f10824e;

    /* renamed from: f */
    public String f10825f;

    /* renamed from: g */
    public boolean f10826g = false;

    /* renamed from: a */
    public void mo24591a(C4435q qVar, String str) {
        List list = this.f10822c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f10822c.put(qVar, list);
        }
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r2.f10821b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24592b() {
        /*
            r2 = this;
            boolean r0 = r2.f10826g
            if (r0 == 0) goto L_0x001e
            java.net.URL r0 = r2.f10820a
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r2.f10821b
            if (r0 == 0) goto L_0x001c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r2.f10821b
            java.lang.String r1 = "omid"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.measurement.C4410i.mo24592b():boolean");
    }

    public String toString() {
        return "Verification{mJavaScriptResource=" + this.f10820a + ", mTrackingEvents=" + this.f10822c + ", mVerificationParameters='" + this.f10823d + '\'' + ", mVendor='" + this.f10824e + '\'' + '}';
    }

    /* renamed from: a */
    public List<String> mo24589a(C4435q qVar) {
        Map<C4435q, List<String>> map;
        if (qVar == null || (map = this.f10822c) == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public String mo24590a() {
        String str;
        if (!this.f10826g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f10821b)) {
            return "apiFramework = ";
        }
        if (!this.f10821b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return String.format("apiFramework = %s", new Object[]{this.f10821b});
        }
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(this.f10825f)) {
            str = "";
        } else {
            str = this.f10825f;
        }
        objArr[0] = str;
        return String.format("JavaScriptResource_url = %s", objArr);
    }
}
