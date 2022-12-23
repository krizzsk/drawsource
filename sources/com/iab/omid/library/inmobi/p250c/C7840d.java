package com.iab.omid.library.inmobi.p250c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.p250c.C7836a;
import com.iab.omid.library.inmobi.p251d.C7842b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.d */
public class C7840d implements C7836a {

    /* renamed from: a */
    private final int[] f18947a = new int[2];

    /* renamed from: a */
    private void m21986a(ViewGroup viewGroup, JSONObject jSONObject, C7836a.C7837a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55190a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m21987b(ViewGroup viewGroup, JSONObject jSONObject, C7836a.C7837a aVar) {
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
                aVar.mo55190a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55188a(View view) {
        if (view == null) {
            return C7842b.m21995a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18947a);
        int[] iArr = this.f18947a;
        return C7842b.m21995a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55189a(View view, JSONObject jSONObject, C7836a.C7837a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21986a(viewGroup, jSONObject, aVar);
            } else {
                m21987b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
