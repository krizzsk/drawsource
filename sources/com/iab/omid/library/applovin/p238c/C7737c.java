package com.iab.omid.library.applovin.p238c;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p237b.C7725a;
import com.iab.omid.library.applovin.p238c.C7734a;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7745f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.c.c */
public class C7737c implements C7734a {

    /* renamed from: a */
    private final C7734a f18713a;

    public C7737c(C7734a aVar) {
        this.f18713a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54799a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7725a a = C7725a.m21466a();
        if (a != null) {
            Collection<C7723a> c = a.mo54751c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7723a e : c) {
                View e2 = e.mo54717e();
                if (e2 != null && C7745f.m21572c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7745f.m21570a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7745f.m21570a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54794a(View view) {
        return C7740b.m21537a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54795a(View view, JSONObject jSONObject, C7734a.C7735a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54799a().iterator();
        while (it.hasNext()) {
            aVar.mo54796a(it.next(), this.f18713a, jSONObject, z2);
        }
    }
}
