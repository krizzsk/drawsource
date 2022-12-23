package com.applovin.impl.mediation.debugger.p041ui.p046d;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.b */
public class C1716b {

    /* renamed from: a */
    public TextView f2562a;

    /* renamed from: b */
    public TextView f2563b;

    /* renamed from: c */
    public ImageView f2564c;

    /* renamed from: d */
    public ImageView f2565d;

    /* renamed from: e */
    private C1717c f2566e;

    /* renamed from: f */
    private int f2567f;

    /* renamed from: a */
    public int mo13750a() {
        return this.f2567f;
    }

    /* renamed from: a */
    public void mo13751a(int i) {
        this.f2567f = i;
    }

    /* renamed from: a */
    public void mo13752a(C1717c cVar) {
        this.f2566e = cVar;
        this.f2562a.setText(cVar.mo13756k());
        this.f2562a.setTextColor(cVar.mo13759n());
        if (this.f2563b != null) {
            if (!TextUtils.isEmpty(cVar.mo13731c_())) {
                this.f2563b.setTypeface((Typeface) null, 0);
                this.f2563b.setVisibility(0);
                this.f2563b.setText(cVar.mo13731c_());
                this.f2563b.setTextColor(cVar.mo13710c());
                if (cVar.mo13732d_()) {
                    this.f2563b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.f2563b.setVisibility(8);
            }
        }
        if (this.f2564c != null) {
            if (cVar.mo13727e() > 0) {
                this.f2564c.setImageResource(cVar.mo13727e());
                this.f2564c.setColorFilter(cVar.mo13760o());
                this.f2564c.setVisibility(0);
            } else {
                this.f2564c.setVisibility(8);
            }
        }
        if (this.f2565d == null) {
            return;
        }
        if (cVar.mo13728f() > 0) {
            this.f2565d.setImageResource(cVar.mo13728f());
            this.f2565d.setColorFilter(cVar.mo13729g());
            this.f2565d.setVisibility(0);
            return;
        }
        this.f2565d.setVisibility(8);
    }

    /* renamed from: b */
    public C1717c mo13753b() {
        return this.f2566e;
    }
}
