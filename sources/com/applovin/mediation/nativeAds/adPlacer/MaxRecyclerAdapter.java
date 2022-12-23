package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.p032b.p033a.C1622c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import java.util.Collection;

public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MaxAdPlacer f4494a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RecyclerView.Adapter f4495b;

    /* renamed from: c */
    private final C2268a f4496c = new C2268a();

    /* renamed from: d */
    private RecyclerView f4497d;

    /* renamed from: e */
    private C1622c f4498e;

    /* renamed from: f */
    private MaxAdPlacer.Listener f4499f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f4500g = 8;

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ViewGroup f4502a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f4502a = (ViewGroup) view.findViewById(C2271R.C2273id.native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f4502a;
        }
    }

    /* renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$a */
    private class C2268a extends RecyclerView.AdapterDataObserver {
        private C2268a() {
        }

        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f4494a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f4494a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        public void onItemRangeInserted(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f4494a.getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f4494a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f4494a.getAdjustedPosition(i);
            int itemCount = MaxRecyclerAdapter.this.f4495b.getItemCount();
            int adjustedCount = MaxRecyclerAdapter.this.f4494a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f4494a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f4494a.getAdjustedCount(itemCount);
            int i4 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f4494a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i4 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i4 - i2), i4);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f4494a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f4495b = adapter;
        adapter.registerAdapterDataObserver(this.f4496c);
    }

    /* renamed from: a */
    private int m5171a(int i) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f4497d.getContext(), this.f4497d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.f4497d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.getSpanCount()) * gridLayoutManager.getSpanSizeLookup().getSpanSize(i);
    }

    public void destroy() {
        try {
            this.f4495b.unregisterAdapterDataObserver(this.f4496c);
        } catch (Exception unused) {
        }
        this.f4494a.destroy();
        C1622c cVar = this.f4498e;
        if (cVar != null) {
            cVar.mo13566a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f4494a;
    }

    public int getAdjustedPosition(int i) {
        return this.f4494a.getAdjustedPosition(i);
    }

    public int getItemCount() {
        return this.f4494a.getAdjustedCount(this.f4495b.getItemCount());
    }

    public long getItemId(int i) {
        if (!this.f4495b.hasStableIds()) {
            return -1;
        }
        return this.f4494a.isFilledPosition(i) ? this.f4494a.getAdItemId(i) : this.f4495b.getItemId(this.f4494a.getOriginalPosition(i));
    }

    public int getItemViewType(int i) {
        if (this.f4494a.isAdPosition(i)) {
            return -42;
        }
        return this.f4495b.getItemViewType(this.f4494a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f4494a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f4494a.loadAds();
    }

    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f4499f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f4499f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f4499f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f4499f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f4497d = recyclerView;
        C1622c cVar = new C1622c(recyclerView);
        this.f4498e = cVar;
        cVar.mo13569a((C1622c.C1625a) new C1622c.C1625a() {
            /* renamed from: a */
            public void mo13572a(int i, int i2) {
                MaxRecyclerAdapter.this.f4494a.updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.this.f4500g, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f4498e.mo13568a(viewHolder.itemView, i);
        if (this.f4494a.isAdPosition(i)) {
            AppLovinSdkUtils.Size adSize = this.f4494a.getAdSize(i, m5171a(i));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                containerView.setLayoutParams(layoutParams);
                this.f4494a.renderAd(i, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f4495b.onBindViewHolder(viewHolder, this.f4494a.getOriginalPosition(i));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f4495b.onCreateViewHolder(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C2271R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f4497d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f4497d = null;
        C1622c cVar = this.f4498e;
        if (cVar != null) {
            cVar.mo13566a();
            this.f4498e = null;
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f4495b.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f4495b.onViewAttachedToWindow(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f4495b.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C1622c cVar = this.f4498e;
        if (cVar != null) {
            cVar.mo13567a(viewHolder.itemView);
        }
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            if (this.f4494a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
            }
            super.onViewRecycled(viewHolder);
            return;
        }
        this.f4495b.onViewRecycled(viewHolder);
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f4495b.unregisterAdapterDataObserver(this.f4496c);
        this.f4495b.setHasStableIds(z);
        this.f4495b.registerAdapterDataObserver(this.f4496c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f4499f = listener;
    }

    public void setLookAhead(int i) {
        this.f4500g = i;
    }
}
