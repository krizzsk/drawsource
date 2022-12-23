package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.webview.bridge.e */
/* compiled from: Invocation */
public class C12148e {

    /* renamed from: a */
    private static AtomicInteger f29658a = new AtomicInteger(0);

    /* renamed from: b */
    private static Map<Integer, C12148e> f29659b;

    /* renamed from: c */
    private ArrayList<ArrayList<Object>> f29660c;

    /* renamed from: d */
    private ArrayList<ArrayList<Object>> f29661d;

    /* renamed from: e */
    private int f29662e = f29658a.getAndIncrement();

    public C12148e() {
        if (f29659b == null) {
            f29659b = new HashMap();
        }
        f29659b.put(Integer.valueOf(this.f29662e), this);
    }

    /* renamed from: a */
    public void mo71333a(String str, String str2, Object[] objArr, C12160l lVar) {
        if (this.f29660c == null) {
            this.f29660c = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(lVar);
        this.f29660c.add(arrayList);
    }

    /* renamed from: b */
    public ArrayList<ArrayList<Object>> mo71334b() {
        return this.f29661d;
    }

    /* renamed from: c */
    public boolean mo71335c() {
        ArrayList<ArrayList<Object>> arrayList = this.f29660c;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList remove = this.f29660c.remove(0);
        String str = (String) remove.get(0);
        String str2 = (String) remove.get(1);
        Object[] objArr = (Object[]) remove.get(2);
        try {
            C12150g.m33137a(str, str2, objArr, (C12160l) remove.get(3));
        } catch (Exception e) {
            C12065a.m32842a(String.format("Error handling invocation %s.%s(%s)", new Object[]{str, str2, Arrays.toString(objArr)}), e);
        }
        return true;
    }

    /* renamed from: d */
    public void mo71336d() {
        f29659b.remove(Integer.valueOf(mo71331a()));
        C12136a.m33103c().mo71309a(this);
    }

    /* renamed from: a */
    public void mo71332a(C12144a aVar, Enum enumR, Object... objArr) {
        if (this.f29661d == null) {
            this.f29661d = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        arrayList.add(enumR);
        arrayList.add(objArr);
        this.f29661d.add(arrayList);
    }

    /* renamed from: a */
    public int mo71331a() {
        return this.f29662e;
    }

    /* renamed from: a */
    public static synchronized C12148e m33127a(int i) {
        synchronized (C12148e.class) {
            Map<Integer, C12148e> map = f29659b;
            if (map == null || !map.containsKey(Integer.valueOf(i))) {
                return null;
            }
            C12148e eVar = f29659b.get(Integer.valueOf(i));
            return eVar;
        }
    }
}
