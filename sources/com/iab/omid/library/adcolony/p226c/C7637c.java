package com.iab.omid.library.adcolony.p226c;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p225b.C7625a;
import com.iab.omid.library.adcolony.p226c.C7634a;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7645f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
public class C7637c implements C7634a {

    /* renamed from: a */
    private final C7634a f18479a;

    public C7637c(C7634a aVar) {
        this.f18479a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54401a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7625a a = C7625a.m21006a();
        if (a != null) {
            Collection<C7623a> c = a.mo54353c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7623a e : c) {
                View e2 = e.mo54319e();
                if (e2 != null && C7645f.m21112c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7645f.m21110a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7645f.m21110a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54396a(View view) {
        return C7640b.m21077a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54397a(View view, JSONObject jSONObject, C7634a.C7635a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54401a().iterator();
        while (it.hasNext()) {
            aVar.mo54398a(it.next(), this.f18479a, jSONObject, z2);
        }
    }
}
