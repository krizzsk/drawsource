package com.iab.omid.library.adcolony.p226c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.adcolony.p226c.C7634a;
import com.iab.omid.library.adcolony.p227d.C7640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.d */
public class C7638d implements C7634a {

    /* renamed from: a */
    private final int[] f18480a = new int[2];

    /* renamed from: a */
    private void m21068a(ViewGroup viewGroup, JSONObject jSONObject, C7634a.C7635a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo54398a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m21069b(ViewGroup viewGroup, JSONObject jSONObject, C7634a.C7635a aVar, boolean z) {
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
                aVar.mo54398a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo54396a(View view) {
        if (view == null) {
            return C7640b.m21077a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18480a);
        int[] iArr = this.f18480a;
        return C7640b.m21077a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo54397a(View view, JSONObject jSONObject, C7634a.C7635a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21068a(viewGroup, jSONObject, aVar, z2);
            } else {
                m21069b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
