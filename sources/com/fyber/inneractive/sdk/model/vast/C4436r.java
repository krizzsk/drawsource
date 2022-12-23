package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C5312s;
import com.smaato.sdk.core.dns.DnsName;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.r */
public class C4436r implements Comparable<C4436r> {

    /* renamed from: a */
    public Integer[] f10950a = new Integer[0];

    /* renamed from: b */
    public final String f10951b;

    /* renamed from: com.fyber.inneractive.sdk.model.vast.r$a */
    public static class C4437a extends Exception {
    }

    public C4436r(String str) throws C4437a {
        mo24625b(str);
        mo24624a(str);
        this.f10951b = str;
    }

    /* renamed from: a */
    public final void mo24624a(String str) throws C4437a {
        ArrayList arrayList = new ArrayList();
        for (String a : str.split(DnsName.ESCAPED_DOT)) {
            arrayList.add(Integer.valueOf(C5312s.m16530a(a, 0)));
        }
        this.f10950a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    /* renamed from: b */
    public final void mo24625b(String str) throws C4437a {
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new C4437a();
        }
    }

    public String toString() {
        return this.f10951b;
    }

    /* renamed from: a */
    public int compareTo(C4436r rVar) {
        if (rVar == null) {
            return 1;
        }
        int max = Math.max(this.f10950a.length, rVar.f10950a.length);
        int i = 0;
        while (i < max) {
            Integer[] numArr = this.f10950a;
            int intValue = numArr.length > i ? numArr[i].intValue() : 0;
            Integer[] numArr2 = rVar.f10950a;
            int intValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
