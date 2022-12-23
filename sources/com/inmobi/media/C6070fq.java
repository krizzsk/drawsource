package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.inmobi.media.C6031fi;

/* renamed from: com.inmobi.media.fq */
/* compiled from: ScrollableDeckFreeContainer */
class C6070fq extends C6031fi {

    /* renamed from: a */
    private RecyclerView f15381a;

    /* renamed from: b */
    private boolean f15382b = false;

    public C6070fq(Context context) {
        super(context, (byte) 1);
    }

    /* renamed from: a */
    public final void mo35190a(C5849by byVar, C6033fj fjVar, int i, int i2, C6031fi.C6032a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C6052fo.m17995a(byVar.mo34834a(0), (ViewGroup) this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i2;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f15381a = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f15381a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addView(this.f15381a);
        this.f15381a.setAdapter((NativeRecyclerViewAdapter) fjVar);
    }
}
