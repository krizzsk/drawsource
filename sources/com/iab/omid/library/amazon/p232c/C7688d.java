package com.iab.omid.library.amazon.p232c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.amazon.p232c.C7684a;
import com.iab.omid.library.amazon.p233d.C7690b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.c.d */
public class C7688d implements C7684a {

    /* renamed from: a */
    private final int[] f18597a = new int[2];

    /* renamed from: a */
    private void m21298a(ViewGroup viewGroup, JSONObject jSONObject, C7684a.C7685a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo54597a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m21299b(ViewGroup viewGroup, JSONObject jSONObject, C7684a.C7685a aVar, boolean z) {
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
                aVar.mo54597a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo54595a(View view) {
        if (view == null) {
            return C7690b.m21307a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18597a);
        int[] iArr = this.f18597a;
        return C7690b.m21307a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo54596a(View view, JSONObject jSONObject, C7684a.C7685a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m21298a(viewGroup, jSONObject, aVar, z2);
            } else {
                m21299b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
