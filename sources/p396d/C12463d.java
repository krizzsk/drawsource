package p396d;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p396d.C12459a;
import p397e.C12465b;

/* renamed from: d.d */
public class C12463d implements C12459a {

    /* renamed from: a */
    private final int[] f29785a = new int[2];

    /* renamed from: a */
    private void m33276a(ViewGroup viewGroup, JSONObject jSONObject, C12459a.C12460a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55958a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m33277b(ViewGroup viewGroup, JSONObject jSONObject, C12459a.C12460a aVar, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo55958a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo72484a(View view) {
        if (view == null) {
            return C12465b.m33286a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f29785a);
        int[] iArr = this.f29785a;
        return C12465b.m33286a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo72485a(View view, JSONObject jSONObject, C12459a.C12460a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m33276a(viewGroup, jSONObject, aVar, z2);
            } else {
                m33277b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
