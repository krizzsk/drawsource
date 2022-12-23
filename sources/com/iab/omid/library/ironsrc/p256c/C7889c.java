package com.iab.omid.library.ironsrc.p256c;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p255b.C7877a;
import com.iab.omid.library.ironsrc.p256c.C7886a;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7897f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.c */
public class C7889c implements C7886a {

    /* renamed from: a */
    private final C7886a f19060a;

    public C7889c(C7886a aVar) {
        this.f19060a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55379a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7877a a = C7877a.m22148a();
        if (a != null) {
            Collection<C7875a> c = a.mo55339c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7875a d : c) {
                View d2 = d.mo55305d();
                if (d2 != null && C7897f.m22249c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7897f.m22247a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7897f.m22247a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55374a(View view) {
        return C7892b.m22216a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55375a(View view, JSONObject jSONObject, C7886a.C7887a aVar, boolean z) {
        Iterator<View> it = mo55379a().iterator();
        while (it.hasNext()) {
            aVar.mo55376a(it.next(), this.f19060a, jSONObject);
        }
    }
}
