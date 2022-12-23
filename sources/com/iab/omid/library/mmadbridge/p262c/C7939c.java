package com.iab.omid.library.mmadbridge.p262c;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.p262c.C7936a;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7947f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.c.c */
public class C7939c implements C7936a {

    /* renamed from: a */
    private final C7936a f19174a;

    public C7939c(C7936a aVar) {
        this.f19174a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo55577a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7927a a = C7927a.m22371a();
        if (a != null) {
            Collection<C7925a> c = a.mo55529c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7925a e : c) {
                View e2 = e.mo55495e();
                if (e2 != null && C7947f.m22477c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7947f.m22475a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7947f.m22475a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo55572a(View view) {
        return C7942b.m22442a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo55573a(View view, JSONObject jSONObject, C7936a.C7937a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo55577a().iterator();
        while (it.hasNext()) {
            aVar.mo55574a(it.next(), this.f19174a, jSONObject, z2);
        }
    }
}
