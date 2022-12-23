package p396d;

import android.view.View;
import com.iab.omid.library.smaato.adsession.C8021a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p012c.C0689a;
import p396d.C12459a;
import p397e.C12465b;
import p397e.C12470f;

/* renamed from: d.c */
public class C12462c implements C12459a {

    /* renamed from: a */
    private final C12459a f29784a;

    public C12462c(C12459a aVar) {
        this.f29784a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo72488a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C0689a c = C0689a.m34c();
        if (c != null) {
            Collection<C8021a> a = c.mo10261a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            for (C8021a c2 : a) {
                View c3 = c2.mo55901c();
                if (c3 != null && C12470f.m33322e(c3) && (rootView = c3.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c4 = C12470f.m33320c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C12470f.m33320c(arrayList.get(size - 1)) > c4) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo72484a(View view) {
        return C12465b.m33286a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo72485a(View view, JSONObject jSONObject, C12459a.C12460a aVar, boolean z, boolean z2) {
        Iterator<View> it = mo72488a().iterator();
        while (it.hasNext()) {
            aVar.mo55958a(it.next(), this.f29784a, jSONObject, z2);
        }
    }
}
