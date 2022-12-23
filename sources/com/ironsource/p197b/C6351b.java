package com.ironsource.p197b;

import android.util.Pair;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.p199d.C6357b;
import com.ironsource.p199d.C6360c;
import java.util.ArrayList;

/* renamed from: com.ironsource.b.b */
public final class C6351b implements Runnable {

    /* renamed from: a */
    private C6352c f16072a;

    /* renamed from: b */
    private String f16073b;

    /* renamed from: c */
    private String f16074c;

    /* renamed from: d */
    private ArrayList<C6517c> f16075d;

    public C6351b(C6352c cVar, String str, String str2, ArrayList<C6517c> arrayList) {
        this.f16072a = cVar;
        this.f16073b = str;
        this.f16074c = str2;
        this.f16075d = arrayList;
    }

    public final void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C6360c a = C6357b.m18988a(this.f16074c, this.f16073b, arrayList);
            if (a != null && (a.f16096a == 200 || a.f16096a == 204)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        C6352c cVar = this.f16072a;
        if (cVar != null) {
            cVar.mo35844a((ArrayList<C6517c>) null, z);
        }
    }
}
