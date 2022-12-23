package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: com.inmobi.media.fd */
/* compiled from: NativeDataSource */
final class C6010fd extends PagerAdapter implements C6033fj {

    /* renamed from: a */
    private static final String f15231a = C6010fd.class.getSimpleName();

    /* renamed from: e */
    private static Handler f15232e = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f15233b;

    /* renamed from: c */
    private final C5854ca f15234c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6016ff f15235d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SparseArray<Runnable> f15236f = new SparseArray<>();

    C6010fd(C5854ca caVar, C6016ff ffVar) {
        this.f15234c = caVar;
        this.f15235d = ffVar;
    }

    public final int getItemPosition(Object obj) {
        Object tag = obj == null ? null : ((View) obj).getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -2;
    }

    public final int getCount() {
        return this.f15234c.mo34846c();
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C5849by a = this.f15234c.mo34842a(i);
        if (a == null) {
            return null;
        }
        ViewGroup a2 = this.f15235d.mo35173a(viewGroup, a);
        int abs = Math.abs(this.f15235d.f15251a - i);
        final int i2 = i;
        final ViewGroup viewGroup2 = a2;
        final ViewGroup viewGroup3 = viewGroup;
        final C5849by byVar = a;
        C60122 r1 = new Runnable() {
            public final void run() {
                if (!C6010fd.this.f15233b) {
                    C6010fd.this.f15236f.remove(i2);
                    C6010fd.this.f15235d.mo35176b(viewGroup2, byVar);
                }
            }
        };
        this.f15236f.put(i, r1);
        f15232e.postDelayed(r1, (long) (abs * 50));
        a2.setLayoutParams(C6052fo.m17995a((C5847bw) a, viewGroup));
        a2.setTag(Integer.valueOf(i));
        viewGroup.addView(a2);
        return a2;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, final Object obj) {
        viewGroup.removeView((View) obj);
        Runnable runnable = this.f15236f.get(i);
        if (runnable != null) {
            f15232e.removeCallbacks(runnable);
            C6052fo.class.getSimpleName();
        }
        f15232e.post(new Runnable() {
            public final void run() {
                C6010fd.this.f15235d.f15253c.mo35260a((View) obj);
            }
        });
    }

    public final void destroy() {
        this.f15233b = true;
        int size = this.f15236f.size();
        for (int i = 0; i < size; i++) {
            f15232e.removeCallbacks(this.f15236f.get(this.f15236f.keyAt(i)));
        }
        this.f15236f.clear();
    }
}
