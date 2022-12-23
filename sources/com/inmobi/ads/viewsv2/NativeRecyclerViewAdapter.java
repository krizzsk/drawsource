package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C5847bw;
import com.inmobi.media.C5849by;
import com.inmobi.media.C5854ca;
import com.inmobi.media.C6016ff;
import com.inmobi.media.C6033fj;
import com.inmobi.media.C6052fo;
import java.lang.ref.WeakReference;

public class NativeRecyclerViewAdapter extends RecyclerView.Adapter<C8098a> implements C6033fj {

    /* renamed from: a */
    private static final String f19601a = NativeRecyclerViewAdapter.class.getSimpleName();

    /* renamed from: b */
    private C5854ca f19602b;

    /* renamed from: c */
    private C6016ff f19603c;

    /* renamed from: d */
    private SparseArray<WeakReference<View>> f19604d = new SparseArray<>();

    public NativeRecyclerViewAdapter(C5854ca caVar, C6016ff ffVar) {
        this.f19602b = caVar;
        this.f19603c = ffVar;
    }

    /* renamed from: com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter$a */
    class C8098a extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ViewGroup f19606b;

        C8098a(View view) {
            super(view);
            this.f19606b = (ViewGroup) view;
        }
    }

    public C8098a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C8098a(new FrameLayout(viewGroup.getContext()));
    }

    public void onBindViewHolder(C8098a aVar, int i) {
        View view;
        C5854ca caVar = this.f19602b;
        C5849by a = caVar == null ? null : caVar.mo34842a(i);
        WeakReference weakReference = this.f19604d.get(i);
        if (a != null) {
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                view = buildScrollableView(i, aVar.f19606b, a);
            }
            if (view != null) {
                if (i != getItemCount() - 1) {
                    aVar.f19606b.setPadding(0, 0, 16, 0);
                }
                aVar.f19606b.addView(view);
                this.f19604d.put(i, new WeakReference(view));
            }
        }
    }

    public void onViewRecycled(C8098a aVar) {
        aVar.f19606b.removeAllViews();
        super.onViewRecycled(aVar);
    }

    public ViewGroup buildScrollableView(int i, ViewGroup viewGroup, C5849by byVar) {
        ViewGroup a = this.f19603c.mo35173a(viewGroup, byVar);
        this.f19603c.mo35176b(a, byVar);
        a.setLayoutParams(C6052fo.m17995a((C5847bw) byVar, viewGroup));
        return a;
    }

    public int getItemCount() {
        C5854ca caVar = this.f19602b;
        if (caVar == null) {
            return 0;
        }
        return caVar.mo34846c();
    }

    public void destroy() {
        C5854ca caVar = this.f19602b;
        if (caVar != null) {
            caVar.f14755h = null;
            caVar.f14753f = null;
            this.f19602b = null;
        }
        this.f19603c = null;
    }
}
