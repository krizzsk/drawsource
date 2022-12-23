package com.iab.omid.library.oguryco.p268c;

import android.view.View;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.p267b.C7977a;
import com.iab.omid.library.oguryco.p268c.C7987a;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7998f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.c */
public class C7990c implements C7987a {

    /* renamed from: a */
    private final C7987a f19298a;

    public C7990c(C7987a aVar) {
        this.f19298a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55792a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7977a a = C7977a.m22601a();
        if (a != null) {
            Collection<C7975a> c = a.mo55750c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7975a d : c) {
                View d2 = d.mo55692d();
                if (d2 != null && C7998f.m22708c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7998f.m22706a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7998f.m22706a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55787a(View view) {
        return C7993b.m22675a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55788a(View view, JSONObject jSONObject, C7987a.C7988a aVar, boolean z) {
        Iterator<View> it = mo55792a().iterator();
        while (it.hasNext()) {
            aVar.mo55789a(it.next(), this.f19298a, jSONObject);
        }
    }
}
