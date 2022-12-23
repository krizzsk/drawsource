package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdod;
import com.google.android.gms.internal.ads.zzdxp;
import com.google.android.gms.internal.ads.zzell;
import com.google.android.gms.internal.ads.zzewj;
import com.google.android.gms.internal.ads.zzewk;
import com.google.android.gms.internal.ads.zzexx;
import com.google.android.gms.internal.ads.zzezq;
import com.google.android.gms.internal.ads.zzfbe;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class ClientApi extends zzcb {
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzell(zzcnf.zza(context, zzbua, i), context, str);
    }

    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewj zzr = zzcnf.zza(context, zzbua, i).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzewk zzc = zzr.zzc();
        if (i >= ((Integer) zzay.zzc().zzb(zzbhz.zzek)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexx zzs = zzcnf.zza(context, zzbua, i).zzs();
        zzs.zzc(context);
        zzs.zza(zzq);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezq zzt = zzcnf.zza(context, zzbua, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzq);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzq, str, new zzcfo(221908000, i, true, false));
    }

    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbua) null, i).zzb();
    }

    public final zzblf zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdod((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 221908000);
    }

    public final zzbll zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdob((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzbpk zzj(IObjectWrapper iObjectWrapper, zzbua zzbua, int i, zzbph zzbph) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdxp zzj = zzcnf.zza(context, zzbua, i).zzj();
        zzj.zzb(context);
        zzj.zza(zzbph);
        return zzj.zzc().zzd();
    }

    public final zzbxl zzk(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbua, i).zzl();
    }

    public final zzbxv zzl(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzt(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzs(activity);
        }
        if (i == 2) {
            return new zzab(activity);
        }
        if (i == 3) {
            return new zzac(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzt(activity) : new zzz(activity);
        }
        return new zzv(activity, zza);
    }

    public final zzcao zzm(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbe zzu = zzcnf.zza(context, zzbua, i).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    public final zzcbe zzn(IObjectWrapper iObjectWrapper, String str, zzbua zzbua, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbe zzu = zzcnf.zza(context, zzbua, i).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbua zzbua, int i) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbua, i).zzo();
    }
}
