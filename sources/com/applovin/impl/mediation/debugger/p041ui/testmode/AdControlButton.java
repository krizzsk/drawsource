package com.applovin.impl.mediation.debugger.p041ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C1433a;
import com.applovin.impl.sdk.utils.C2048f;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C2271R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final Button f2624a;

    /* renamed from: b */
    private final C1433a f2625b;

    /* renamed from: c */
    private C1731b f2626c;

    /* renamed from: d */
    private MaxAdFormat f2627d;

    /* renamed from: e */
    private C1730a f2628e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    public interface C1730a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    public enum C1731b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2624a = new Button(getContext());
        this.f2625b = new C1433a(getContext(), 20, 16842873);
        this.f2626c = C1731b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2624a.setTextColor(-1);
        this.f2624a.setOnClickListener(this);
        frameLayout.addView(this.f2624a, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2625b.setColor(-1);
        addView(this.f2625b, new FrameLayout.LayoutParams(-1, -1, 17));
        m3660a(C1731b.LOAD);
    }

    /* renamed from: a */
    private void m3660a(C1731b bVar) {
        if (C1731b.LOADING == bVar) {
            setEnabled(false);
            this.f2625b.mo12955a();
        } else {
            setEnabled(true);
            this.f2625b.mo12956b();
        }
        this.f2624a.setText(m3661b(bVar));
        this.f2624a.setBackgroundColor(m3662c(bVar));
    }

    /* renamed from: b */
    private String m3661b(C1731b bVar) {
        return C1731b.LOAD == bVar ? "Load" : C1731b.LOADING == bVar ? "" : "Show";
    }

    /* renamed from: c */
    private int m3662c(C1731b bVar) {
        return C2048f.m4936a((C1731b.LOAD == bVar || C1731b.LOADING == bVar) ? C2271R.color.applovin_sdk_brand_color : C2271R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public C1731b getControlState() {
        return this.f2626c;
    }

    public MaxAdFormat getFormat() {
        return this.f2627d;
    }

    public void onClick(View view) {
        C1730a aVar = this.f2628e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(C1731b bVar) {
        if (this.f2626c != bVar) {
            m3660a(bVar);
        }
        this.f2626c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f2627d = maxAdFormat;
    }

    public void setOnClickListener(C1730a aVar) {
        this.f2628e = aVar;
    }
}
