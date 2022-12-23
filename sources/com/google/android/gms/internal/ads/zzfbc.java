package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfbc extends zzcbd {
    private final zzfay zza;
    private final zzfao zzb;
    private final String zzc;
    private final zzfby zzd;
    private final Context zze;
    private final zzcfo zzf;
    /* access modifiers changed from: private */
    public zzdst zzg;
    private boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();

    public zzfbc(String str, zzfay zzfay, Context context, zzfao zzfao, zzfby zzfby, zzcfo zzcfo) {
        this.zzc = str;
        this.zza = zzfay;
        this.zzb = zzfao;
        this.zzd = zzfby;
        this.zze = context;
        this.zzf = zzcfo;
    }

    private final synchronized void zzt(zzl zzl, zzcbl zzcbl, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbjn.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzcbl);
        zzt.zzp();
        if (zzs.zzD(this.zze)) {
            if (zzl.zzs == null) {
                zze.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zza(zzfdc.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                return;
            }
        }
        if (this.zzg == null) {
            zzfaq zzfaq = new zzfaq((String) null);
            this.zza.zzj(i);
            this.zza.zzb(zzl, this.zzc, zzfaq, new zzfbb(this));
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdst = this.zzg;
        return zzdst != null ? zzdst.zza() : new Bundle();
    }

    public final zzdh zzc() {
        zzdst zzdst;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfK)).booleanValue() && (zzdst = this.zzg) != null) {
            return zzdst.zzl();
        }
        return null;
    }

    public final zzcbb zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdst = this.zzg;
        if (zzdst != null) {
            return zzdst.zzc();
        }
        return null;
    }

    public final synchronized String zze() throws RemoteException {
        zzdst zzdst = this.zzg;
        if (zzdst == null || zzdst.zzl() == null) {
            return null;
        }
        return zzdst.zzl().zzg();
    }

    public final synchronized void zzf(zzl zzl, zzcbl zzcbl) throws RemoteException {
        zzt(zzl, zzcbl, 2);
    }

    public final synchronized void zzg(zzl zzl, zzcbl zzcbl) throws RemoteException {
        zzt(zzl, zzcbl, 3);
    }

    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    public final void zzi(zzdb zzdb) {
        if (zzdb == null) {
            this.zzb.zzb((zzfko) null);
        } else {
            this.zzb.zzb(new zzfba(this, zzdb));
        }
    }

    public final void zzj(zzde zzde) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzde);
    }

    public final void zzk(zzcbh zzcbh) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzcbh);
    }

    public final synchronized void zzl(zzcbs zzcbs) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfby zzfby = this.zzd;
        zzfby.zza = zzcbs.zza;
        zzfby.zzb = zzcbs.zzb;
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzh);
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            zze.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfdc.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        this.zzg.zzg(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdst = this.zzg;
        return zzdst != null && !zzdst.zze();
    }

    public final void zzp(zzcbm zzcbm) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbm);
    }
}
