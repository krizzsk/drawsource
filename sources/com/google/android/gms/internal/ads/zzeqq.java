package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeqq implements zzetg {
    private final zzfvm zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeqq(zzfvm zzfvm, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfvm;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzeqp(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqr zzc() throws Exception {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeR)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeqr(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        boolean z = null;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeS)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                boolean z2 = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z2 = false;
                        }
                        z = Boolean.valueOf(z2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    z = true;
                }
                return new zzeqr(z);
            }
        }
        return new zzeqr((Boolean) null);
    }
}
