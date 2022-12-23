package com.unity3d.services.ads.adunit;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.ads.adunit.e */
/* compiled from: AdUnitRelativeLayout */
public class C11813e extends RelativeLayout {

    /* renamed from: a */
    private final ArrayList<C11811c> f28699a = new ArrayList<>();

    /* renamed from: b */
    private int f28700b = 10000;

    /* renamed from: c */
    private boolean f28701c = false;

    public C11813e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo70737a(int i) {
        this.f28700b = i;
        this.f28701c = true;
    }

    /* renamed from: b */
    public void mo70738b() {
        this.f28701c = false;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this.f28699a) {
            size = this.f28699a.size();
        }
        return size;
    }

    public int getMaxEventCount() {
        return this.f28700b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        super.onInterceptTouchEvent(motionEvent);
        if (!this.f28701c || this.f28699a.size() >= this.f28700b) {
            return false;
        }
        boolean z = (motionEvent.getFlags() & 1) != 0;
        synchronized (this.f28699a) {
            ArrayList<C11811c> arrayList = this.f28699a;
            C11811c cVar = r5;
            C11811c cVar2 = new C11811c(motionEvent.getActionMasked(), z, motionEvent2.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent2.getX(0), motionEvent2.getY(0), motionEvent.getEventTime(), motionEvent2.getPressure(0), motionEvent2.getSize(0));
            arrayList.add(cVar);
        }
        return false;
    }

    /* renamed from: a */
    public void mo70736a() {
        synchronized (this.f28699a) {
            this.f28699a.clear();
        }
    }

    /* renamed from: a */
    public SparseArray<SparseArray<C11811c>> mo70734a(SparseArray<ArrayList<Integer>> sparseArray) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<SparseArray<C11811c>> sparseArray2 = new SparseArray<>();
        synchronized (this.f28699a) {
            Iterator<C11811c> it = this.f28699a.iterator();
            while (it.hasNext()) {
                C11811c next = it.next();
                ArrayList arrayList = sparseArray.get(next.mo70724a());
                if (arrayList != null) {
                    int intValue = ((Integer) arrayList.get(0)).intValue();
                    if (sparseIntArray.get(next.mo70724a(), 0) == intValue) {
                        if (sparseArray2.get(next.mo70724a()) == null) {
                            sparseArray2.put(next.mo70724a(), new SparseArray());
                        }
                        sparseArray2.get(next.mo70724a()).put(intValue, next);
                        arrayList.remove(0);
                    }
                    sparseIntArray.put(next.mo70724a(), sparseIntArray.get(next.mo70724a()) + 1);
                }
            }
        }
        return sparseArray2;
    }

    /* renamed from: a */
    public SparseIntArray mo70735a(ArrayList<Integer> arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        synchronized (this.f28699a) {
            Iterator<C11811c> it = this.f28699a.iterator();
            while (it.hasNext()) {
                C11811c next = it.next();
                Iterator<Integer> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Integer next2 = it2.next();
                    if (next.mo70724a() == next2.intValue()) {
                        sparseIntArray.put(next2.intValue(), sparseIntArray.get(next2.intValue(), 0) + 1);
                        break;
                    }
                }
            }
        }
        return sparseIntArray;
    }
}
