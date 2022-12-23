package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcvy extends zzcvv {
    private final Context zzc;
    private final View zzd;
    private final zzcli zze;
    private final zzfbm zzf;
    private final zzcxv zzg;
    private final zzdns zzh;
    private final zzdji zzi;
    private final zzgqo zzj;
    private final Executor zzk;
    private zzq zzl;

    zzcvy(zzcxw zzcxw, Context context, zzfbm zzfbm, View view, zzcli zzcli, zzcxv zzcxv, zzdns zzdns, zzdji zzdji, zzgqo zzgqo, Executor executor) {
        super(zzcxw);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcli;
        this.zzf = zzfbm;
        this.zzg = zzcxv;
        this.zzh = zzdns;
        this.zzi = zzdji;
        this.zzj = zzgqo;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcvy zzcvy) {
        zzdns zzdns = zzcvy.zzh;
        if (zzdns.zze() != null) {
            try {
                zzdns.zze().zze((zzbs) zzcvy.zzj.zzb(), ObjectWrapper.wrap(zzcvy.zzc));
            } catch (RemoteException e) {
                zze.zzh("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    public final void zzW() {
        this.zzk.execute(new zzcvx(this));
        super.zzW();
    }

    public final int zza() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgC)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzc() {
        return this.zzd;
    }

    public final zzdk zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfci unused) {
            return null;
        }
    }

    public final zzfbm zze() {
        zzq zzq = this.zzl;
        if (zzq != null) {
            return zzfch.zzc(zzq);
        }
        zzfbl zzfbl = this.zzb;
        if (zzfbl.zzad) {
            for (String str : zzfbl.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfbm(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfch.zzb(this.zzb.zzs, this.zzf);
    }

    public final zzfbm zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
        zzcli zzcli;
        if (viewGroup != null && (zzcli = this.zze) != null) {
            zzcli.zzai(zzcmx.zzc(zzq));
            viewGroup.setMinimumHeight(zzq.zzc);
            viewGroup.setMinimumWidth(zzq.zzf);
            this.zzl = zzq;
        }
    }
}
