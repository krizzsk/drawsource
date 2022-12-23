package com.iab.omid.library.oguryco.p268c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.oguryco.p268c.C7987a;
import com.iab.omid.library.oguryco.p269d.C7993b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.d */
public class C7991d implements C7987a {

    /* renamed from: a */
    private final int[] f19299a = new int[2];

    /* renamed from: a */
    private void m22666a(ViewGroup viewGroup, JSONObject jSONObject, C7987a.C7988a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55789a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m22667b(ViewGroup viewGroup, JSONObject jSONObject, C7987a.C7988a aVar) {
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
                aVar.mo55789a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55787a(View view) {
        if (view == null) {
            return C7993b.m22675a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19299a);
        int[] iArr = this.f19299a;
        return C7993b.m22675a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55788a(View view, JSONObject jSONObject, C7987a.C7988a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22666a(viewGroup, jSONObject, aVar);
            } else {
                m22667b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
