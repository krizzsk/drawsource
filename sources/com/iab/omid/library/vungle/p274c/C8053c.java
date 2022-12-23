package com.iab.omid.library.vungle.p274c;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.p273b.C8041a;
import com.iab.omid.library.vungle.p274c.C8050a;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.p275d.C8061f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.c */
public class C8053c implements C8050a {

    /* renamed from: a */
    private final C8050a f19479a;

    public C8053c(C8050a aVar) {
        this.f19479a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo56110a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C8041a a = C8041a.m22925a();
        if (a != null) {
            Collection<C8039a> c = a.mo56062c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C8039a d : c) {
                View d2 = d.mo56028d();
                if (d2 != null && C8061f.m23029c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C8061f.m23027a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C8061f.m23027a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo56105a(View view) {
        return C8056b.m22996a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo56106a(View view, JSONObject jSONObject, C8050a.C8051a aVar, boolean z) {
        Iterator<View> it = mo56110a().iterator();
        while (it.hasNext()) {
            aVar.mo56107a(it.next(), this.f19479a, jSONObject);
        }
    }
}
