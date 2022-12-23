package com.iab.omid.library.amazon.p232c;

import android.view.View;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.p232c.C7684a;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.p233d.C7695f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.c */
public class C7687c implements C7684a {

    /* renamed from: a */
    private final C7684a f18596a;

    public C7687c(C7684a aVar) {
        this.f18596a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo54600a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C7675a a = C7675a.m21236a();
        if (a != null) {
            Collection<C7673a> c = a.mo54552c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C7673a e : c) {
                View e2 = e.mo54518e();
                if (e2 != null && C7695f.m21342c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C7695f.m21340a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C7695f.m21340a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo54595a(View view) {
        return C7690b.m21307a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo54596a(View view, JSONObject jSONObject, C7684a.C7685a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo54600a().iterator();
        while (it.hasNext()) {
            aVar.mo54597a(it.next(), this.f18596a, jSONObject, z2);
        }
    }
}
