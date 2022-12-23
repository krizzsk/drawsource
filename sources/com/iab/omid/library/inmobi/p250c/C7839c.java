package com.iab.omid.library.inmobi.p250c;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.p249b.C7827a;
import com.iab.omid.library.inmobi.p250c.C7836a;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7847f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.c */
public class C7839c implements C7836a {

    /* renamed from: a */
    private final C7836a f18946a;

    public C7839c(C7836a aVar) {
        this.f18946a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55193a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7827a a = C7827a.m21924a();
        if (a != null) {
            Collection<C7825a> c = a.mo55145c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7825a d : c) {
                View d2 = d.mo55111d();
                if (d2 != null && C7847f.m22028c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7847f.m22026a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7847f.m22026a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55188a(View view) {
        return C7842b.m21995a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55189a(View view, JSONObject jSONObject, C7836a.C7837a aVar, boolean z) {
        Iterator<View> it = mo55193a().iterator();
        while (it.hasNext()) {
            aVar.mo55190a(it.next(), this.f18946a, jSONObject);
        }
    }
}
