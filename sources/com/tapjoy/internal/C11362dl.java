package com.tapjoy.internal;

import android.view.View;
import com.tapjoy.internal.C11359dj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dl */
public final class C11362dl implements C11359dj {

    /* renamed from: a */
    private final C11359dj f27135a;

    public C11362dl(C11359dj djVar) {
        this.f27135a = djVar;
    }

    /* renamed from: a */
    public final JSONObject mo69810a(View view) {
        return C11365do.m31078a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo69811a(View view, JSONObject jSONObject, C11359dj.C11360a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C11351dd a = C11351dd.m31050a();
        if (a != null) {
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(a.f27112b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (T c : unmodifiableCollection) {
                View c2 = c.mo69788c();
                if (c2 != null && C11369dr.m31096b(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C11369dr.m31095a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11369dr.m31095a((View) arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.mo69812a((View) it.next(), this.f27135a, jSONObject);
        }
    }
}
