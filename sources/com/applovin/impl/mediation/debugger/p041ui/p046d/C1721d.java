package com.applovin.impl.mediation.debugger.p041ui.p046d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.d */
public abstract class C1721d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    private List<C1717c> f2602a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, Integer> f2603b = new HashMap();
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public Context f2604c;

    /* renamed from: d */
    private C1723a f2605d;

    /* renamed from: e */
    private LayoutInflater f2606e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.d$a */
    public interface C1723a {
        /* renamed from: a */
        void mo13699a(C1715a aVar, C1717c cVar);
    }

    protected C1721d(Context context) {
        this.f2604c = context;
    }

    /* renamed from: a */
    private LayoutInflater mo13704a() {
        LayoutInflater layoutInflater = this.f2606e;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = (LayoutInflater) this.f2604c.getSystemService("layout_inflater");
        this.f2606e = layoutInflater2;
        return layoutInflater2;
    }

    /* renamed from: e */
    private C1715a m3633e(int i) {
        for (int i2 = 0; i2 < mo13705b(); i2++) {
            Integer num = this.f2603b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo13703a(i2)) {
                    return new C1715a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo13703a(int i);

    /* renamed from: a */
    public Bitmap mo13776a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList<Bitmap> arrayList = new ArrayList<>(count);
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = getView(i3, (View) null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i2 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        for (Bitmap bitmap : arrayList) {
            canvas.drawBitmap(bitmap, 0.0f, (float) i, paint);
            i += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    /* renamed from: a */
    public void mo13777a(C1723a aVar) {
        this.f2605d = aVar;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo13705b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1717c mo13706b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C1717c> mo13707c(int i);

    /* renamed from: d */
    public C1717c getItem(int i) {
        return this.f2602a.get(i);
    }

    public int getCount() {
        return this.f2602a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return getItem(i).mo13754i();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1716b bVar;
        C1717c d = getItem(i);
        if (view == null) {
            view = mo13704a().inflate(d.mo13755j(), viewGroup, false);
            bVar = new C1716b();
            bVar.f2562a = (TextView) view.findViewById(16908308);
            bVar.f2563b = (TextView) view.findViewById(16908309);
            bVar.f2564c = (ImageView) view.findViewById(C2271R.C2273id.imageView);
            bVar.f2565d = (ImageView) view.findViewById(C2271R.C2273id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (C1716b) view.getTag();
        }
        bVar.mo13751a(i);
        bVar.mo13752a(d);
        view.setEnabled(d.mo13709b());
        return view;
    }

    public int getViewTypeCount() {
        return C1717c.m3601h();
    }

    public boolean isEnabled(int i) {
        return getItem(i).mo13709b();
    }

    /* renamed from: j */
    public void mo13787j() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1721d.this.notifyDataSetChanged();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1717c mo13788k() {
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f2602a = new ArrayList();
        Integer num = 0;
        Integer valueOf = Integer.valueOf(mo13705b());
        this.f2603b = new HashMap(valueOf.intValue());
        C1717c k = mo13788k();
        if (k != null) {
            this.f2602a.add(k);
            num = Integer.valueOf(num.intValue() + 1);
        }
        for (int i = 0; i < valueOf.intValue(); i++) {
            Integer valueOf2 = Integer.valueOf(mo13703a(i));
            if (valueOf2.intValue() != 0) {
                this.f2602a.add(mo13706b(i));
                this.f2602a.addAll(mo13707c(i));
                this.f2603b.put(Integer.valueOf(i), num);
                num = Integer.valueOf(num.intValue() + valueOf2.intValue() + 1);
            }
        }
        this.f2602a.add(new C1724e(""));
    }

    public void onClick(View view) {
        C1716b bVar = (C1716b) view.getTag();
        C1717c b = bVar.mo13753b();
        C1715a e = m3633e(bVar.mo13750a());
        C1723a aVar = this.f2605d;
        if (aVar != null && e != null) {
            aVar.mo13699a(e, b);
        }
    }
}
