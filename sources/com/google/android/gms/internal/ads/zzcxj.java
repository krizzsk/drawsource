package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxj(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxj zza(Context context, View view, zzfbl zzfbl) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxj zzcxj = new zzcxj(context);
        if (!(zzfbl.zzv.isEmpty() || (resources = zzcxj.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfbm zzfbm = (zzfbm) zzfbl.zzv.get(0);
            zzcxj.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfbm.zza) * displayMetrics.density), (int) (((float) zzfbm.zzb) * displayMetrics.density)));
        }
        zzcxj.zzb = view;
        zzcxj.addView(view);
        zzt.zzx();
        zzcgi.zzb(zzcxj, zzcxj);
        zzt.zzx();
        zzcgi.zza(zzcxj, zzcxj);
        JSONObject jSONObject = zzfbl.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxj.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxj.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxj.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcxj.addView(relativeLayout);
        return zzcxj;
    }

    private final int zzb(double d) {
        zzaw.zzb();
        return zzcfb.zzw(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
