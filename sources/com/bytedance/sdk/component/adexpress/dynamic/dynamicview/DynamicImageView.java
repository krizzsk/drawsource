package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p094c.C2571a;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.p108d.C2827i;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DynamicImageView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private String f5767a;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f5751l.mo17048o() > 0.0f) {
            this.f5754o = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.f5754o).setXRound((int) C2572b.m6622a(context, this.f5751l.mo17048o()));
            ((TTRoundRectImageView) this.f5754o).setYRound((int) C2572b.m6622a(context, this.f5751l.mo17048o()));
        } else {
            this.f5754o = new ImageView(context);
        }
        this.f5767a = getImageKey();
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hVar.mo17082i().mo16876b())) {
            if (this.f5751l.mo17035b() > 0 || this.f5751l.mo17032a() > 0) {
                this.f5746g = Math.min(this.f5746g, this.f5747h);
                this.f5747h = Math.min(this.f5746g, this.f5747h);
                this.f5748i = (int) (((float) this.f5748i) + C2572b.m6622a(context, ((float) (this.f5751l.mo17035b() + (this.f5751l.mo17032a() / 2))) + 0.5f));
            } else {
                this.f5746g = Math.max(this.f5746g, this.f5747h);
                this.f5747h = Math.max(this.f5746g, this.f5747h);
            }
            this.f5751l.mo17033a((float) (this.f5746g / 2));
        }
        addView(this.f5754o, new FrameLayout.LayoutParams(this.f5746g, this.f5747h));
    }

    /* renamed from: h */
    public boolean mo17171h() {
        super.mo17171h();
        if ("arrowButton".equals(this.f5752m.mo17082i().mo16876b())) {
            ((ImageView) this.f5754o).setImageResource(C2914t.m8157d(this.f5750k, "tt_white_righterbackicon_titlebar"));
            this.f5754o.setPadding(0, 0, 0, 0);
            ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f5754o.setBackgroundColor(this.f5751l.mo17056w());
        if ("user".equals(this.f5752m.mo17082i().mo16879c())) {
            ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f5754o).setColorFilter(this.f5751l.mo17040g());
            ((ImageView) this.f5754o).setImageDrawable(C2914t.m8156c(getContext(), "tt_user"));
            ((ImageView) this.f5754o).setPadding(this.f5746g / 10, this.f5747h / 5, this.f5746g / 10, 0);
        }
        if (!m7114a() || Build.VERSION.SDK_INT < 17) {
            C2827i a = C2529a.m6339a().mo16552e().mo17599a(this.f5751l.mo17044k()).mo17639a(this.f5767a);
            String o = this.f5753n.getRenderRequest().mo16685o();
            if (!TextUtils.isEmpty(o)) {
                a.mo17642b(o);
            }
            a.mo17632a((ImageView) this.f5754o);
            ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((ImageView) this.f5754o).setScaleType(ImageView.ScaleType.FIT_CENTER);
            C2529a.m6339a().mo16552e().mo17599a(this.f5751l.mo17044k()).mo17638a(C2838t.BITMAP).mo17633a((C2832n) new C2832n<Bitmap>() {
                /* renamed from: a */
                public void mo17178a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo17179a(C2828j<Bitmap> jVar) {
                    Bitmap a = C2571a.m6621a(DynamicImageView.this.f5750k, jVar.mo17647b(), 25);
                    if (a != null) {
                        DynamicImageView.this.f5754o.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), a));
                    }
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    private boolean m7114a() {
        String l = this.f5751l.mo17045l();
        if (this.f5751l.mo17052s()) {
            return true;
        }
        if (TextUtils.isEmpty(l)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(l);
            if (Math.abs((((float) this.f5746g) / (((float) this.f5747h) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) <= 0.01f) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> l = this.f5753n.getRenderRequest().mo16682l();
        if (l == null || l.size() <= 0) {
            return null;
        }
        return l.get(this.f5751l.mo17044k());
    }
}
