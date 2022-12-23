package com.applovin.impl.mediation.debugger.p041ui.p042a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.d */
public class C1694d extends Dialog {

    /* renamed from: a */
    private ViewGroup f2482a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f2483b;

    /* renamed from: c */
    private Activity f2484c;

    /* renamed from: d */
    private RelativeLayout f2485d;

    public C1694d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f2482a = viewGroup;
        this.f2483b = size;
        this.f2484c = activity;
        requestWindowFeature(1);
    }

    public void dismiss() {
        this.f2485d.removeView(this.f2482a);
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f2484c, this.f2483b.getWidth()), AppLovinSdkUtils.dpToPx(this.f2484c, this.f2483b.getHeight()));
        layoutParams.addRule(13);
        this.f2482a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f2484c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f2484c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f2484c.getResources().getDrawable(C2271R.C2272drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground((Drawable) null);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1694d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f2484c);
        this.f2485d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f2485d.setBackgroundColor(Integer.MIN_VALUE);
        this.f2485d.addView(imageButton);
        this.f2485d.addView(this.f2482a);
        this.f2485d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1694d.this.dismiss();
            }
        });
        setContentView(this.f2485d);
    }
}
