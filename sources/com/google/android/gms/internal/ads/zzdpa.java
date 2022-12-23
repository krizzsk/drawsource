package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdpa {
    private final zzdtp zza;
    private final zzdse zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdpa(zzdtp zzdtp, zzdse zzdse) {
        this.zza = zzdtp;
        this.zzb = zzdse;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzaw.zzb();
        return zzcfb.zzw(context, i);
    }

    public final View zza(View view, WindowManager windowManager) throws zzclt {
        zzcli zza2 = this.zza.zza(zzq.zzc(), (zzfbl) null, (zzfbo) null);
        View view2 = (View) zza2;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza2.zzaf("/sendMessageToSdk", new zzdow(this));
        zza2.zzaf("/hideValidatorOverlay", new zzdox(this, windowManager, view));
        zza2.zzaf("/open", new zzbox((zzb) null, (zzbwp) null, (zzees) null, (zzdwh) null, (zzfgp) null));
        this.zzb.zzj(new WeakReference(zza2), "/loadNativeAdPolicyViolations", new zzdoy(this, view, windowManager));
        this.zzb.zzj(new WeakReference(zza2), "/showValidatorOverlay", zzdoz.zza);
        return view2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcli zzcli, Map map) {
        zze.zze("Hide native ad policy validator overlay.");
        zzcli.zzH().setVisibility(8);
        if (zzcli.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcli.zzH());
        }
        zzcli.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(View view, WindowManager windowManager, zzcli zzcli, Map map) {
        int i;
        zzcli.zzP().zzz(new zzdou(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzay.zzc().zzb(zzbhz.zzgL)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzay.zzc().zzb(zzbhz.zzgM)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcli.zzai(zzcmx.zzb(zzf, zzf2));
            try {
                zzcli.zzI().getSettings().setUseWideViewPort(((Boolean) zzay.zzc().zzb(zzbhz.zzgN)).booleanValue());
                zzcli.zzI().getSettings().setLoadWithOverviewMode(((Boolean) zzay.zzc().zzb(zzbhz.zzgO)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb2 = zzbx.zzb();
            zzb2.x = zzf3;
            zzb2.y = zzf4;
            windowManager.updateViewLayout(zzcli.zzH(), zzb2);
            String str = (String) map.get(TJAdUnitConstants.String.ORIENTATION);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.zzc = new zzdov(view, zzcli, str, zzb2, i - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcli.loadUrl(str2);
            }
        }
    }
}
