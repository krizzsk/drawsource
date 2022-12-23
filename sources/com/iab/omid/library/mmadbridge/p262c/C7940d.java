package com.iab.omid.library.mmadbridge.p262c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.p262c.C7936a;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.c.d */
public class C7940d implements C7936a {

    /* renamed from: a */
    private final int[] f19175a = new int[2];

    /* renamed from: a */
    private void m22433a(ViewGroup viewGroup, JSONObject jSONObject, C7936a.C7937a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo55574a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* renamed from: b */
    private void m22434b(ViewGroup viewGroup, JSONObject jSONObject, C7936a.C7937a aVar, boolean z) {
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
                aVar.mo55574a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo55572a(View view) {
        if (view == null) {
            return C7942b.m22442a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19175a);
        int[] iArr = this.f19175a;
        return C7942b.m22442a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo55573a(View view, JSONObject jSONObject, C7936a.C7937a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22433a(viewGroup, jSONObject, aVar, z2);
            } else {
                m22434b(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
