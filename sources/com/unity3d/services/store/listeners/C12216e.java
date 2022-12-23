package com.unity3d.services.store.listeners;

import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.store.C12165b;
import com.unity3d.services.store.gpbl.C12175a;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12195c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.unity3d.services.store.listeners.e */
/* compiled from: PurchasesResponseListener */
public class C12216e implements C12214c {

    /* renamed from: a */
    private final Integer f29769a;

    /* renamed from: b */
    private final C12165b f29770b;

    /* renamed from: c */
    private final C12165b f29771c;

    public C12216e(C12165b bVar, C12165b bVar2) {
        this((Integer) null, bVar, bVar2);
    }

    /* renamed from: a */
    public void mo71400a(C12177a aVar, List<C12195c> list) {
        ArrayList arrayList = new ArrayList();
        Integer num = this.f29769a;
        if (num != null) {
            arrayList.add(num);
        }
        if (aVar.mo71370i() == C12175a.OK) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C12195c k : list) {
                    jSONArray.put(k.mo71383k());
                }
            }
            arrayList.add(jSONArray);
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) this.f29770b, arrayList.toArray());
            return;
        }
        arrayList.add(aVar.mo71370i());
        C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) this.f29771c, arrayList.toArray());
    }

    public C12216e(Integer num, C12165b bVar, C12165b bVar2) {
        this.f29769a = num;
        this.f29770b = bVar;
        this.f29771c = bVar2;
    }
}
