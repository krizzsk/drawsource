package com.iab.omid.library.fyber.p244c;

import android.view.View;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.p244c.C7785a;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7796f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.c.c */
public class C7788c implements C7785a {

    /* renamed from: a */
    private final C7785a f18830a;

    public C7788c(C7785a aVar) {
        this.f18830a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54998a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7776a a = C7776a.m21696a();
        if (a != null) {
            Collection<C7774a> c = a.mo54950c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7774a e : c) {
                View e2 = e.mo54916e();
                if (e2 != null && C7796f.m21802c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7796f.m21800a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7796f.m21800a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54993a(View view) {
        return C7791b.m21767a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54994a(View view, JSONObject jSONObject, C7785a.C7786a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54998a().iterator();
        while (it.hasNext()) {
            aVar.mo54995a(it.next(), this.f18830a, jSONObject, z2);
        }
    }
}
