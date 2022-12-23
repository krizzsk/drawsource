package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzelo extends zzbr implements zzdej {
    private final Context zza;
    private final zzexv zzb;
    private final String zzc;
    private final zzemh zzd;
    private zzq zze;
    private final zzfcb zzf;
    private final zzcfo zzg;
    /* access modifiers changed from: private */
    public zzcvv zzh;

    public zzelo(Context context, zzq zzq, String str, zzexv zzexv, zzemh zzemh, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzexv;
        this.zze = zzq;
        this.zzc = str;
        this.zzd = zzemh;
        this.zzf = zzexv.zzi();
        this.zzg = zzcfo;
        zzexv.zzp(this);
    }

    private final synchronized void zze(zzq zzq) {
        this.zzf.zzr(zzq);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(zzl zzl) throws RemoteException {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!zzs.zzD(this.zza) || zzl.zzs != null) {
            zzfcx.zza(this.zza, zzl.zzf);
            return this.zzb.zzb(zzl, this.zzc, (zzemv) null, new zzeln(this));
        }
        zze.zzg("Failed to load the ad because app ID is missing.");
        zzemh zzemh = this.zzd;
        if (zzemh != null) {
            zzemh.zza(zzfdc.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z;
        if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
                return this.zzg.zzc >= ((Integer) zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.zzc >= ((Integer) zzay.zzc().zzb(zzbhz.zziw)).intValue()) {
        }
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            zzcvv.zzg();
        }
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            zzcvv.zzm().zzc((Context) null);
        }
    }

    public final void zzC(zzbc zzbc) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbc);
    }

    public final void zzD(zzbf zzbf) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbf);
    }

    public final void zzE(zzbw zzbw) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzq);
        this.zze = zzq;
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            zzcvv.zzh(this.zzb.zzd(), zzq);
        }
    }

    public final void zzG(zzbz zzbz) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzbz);
    }

    public final void zzH(zzbcj zzbcj) {
    }

    public final void zzI(zzw zzw) {
    }

    public final void zzJ(zzcg zzcg) {
    }

    public final void zzK(zzdo zzdo) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(zzbye zzbye) {
    }

    public final synchronized void zzN(boolean z) {
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z);
    }

    public final synchronized void zzO(zzbiu zzbiu) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbiu);
    }

    public final void zzP(zzde zzde) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzh(zzde);
    }

    public final void zzQ(zzbyh zzbyh, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzcar zzcar) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzff zzff) {
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzff);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            zzq zzg2 = this.zzf.zzg();
            zzcvv zzcvv = this.zzh;
            if (!(zzcvv == null || zzcvv.zzf() == null || !this.zzf.zzO())) {
                zzg2 = zzfch.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg2);
            try {
                zzf(this.zzf.zze());
            } catch (RemoteException unused) {
                zze.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.zzb.zzn();
        }
    }

    public final synchronized boolean zzaa(zzl zzl) throws RemoteException {
        zze(this.zze);
        return zzf(zzl);
    }

    public final synchronized void zzab(zzcd zzcd) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcd);
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            return zzfch.zza(this.zza, Collections.singletonList(zzcvv.zze()));
        }
        return this.zzf.zzg();
    }

    public final zzbf zzi() {
        return this.zzd.zzc();
    }

    public final zzbz zzj() {
        return this.zzd.zzd();
    }

    public final synchronized zzdh zzk() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return null;
        }
        zzcvv zzcvv = this.zzh;
        if (zzcvv == null) {
            return null;
        }
        return zzcvv.zzl();
    }

    public final synchronized zzdk zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv == null) {
            return null;
        }
        return zzcvv.zzd();
    }

    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    public final synchronized String zzr() {
        return this.zzc;
    }

    public final synchronized String zzs() {
        zzcvv zzcvv = this.zzh;
        if (zzcvv == null || zzcvv.zzl() == null) {
            return null;
        }
        return zzcvv.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzcvv zzcvv = this.zzh;
        if (zzcvv == null || zzcvv.zzl() == null) {
            return null;
        }
        return zzcvv.zzl().zzg();
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            zzcvv.zzV();
        }
    }

    public final void zzy(zzl zzl, zzbi zzbi) {
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcvv zzcvv = this.zzh;
        if (zzcvv != null) {
            zzcvv.zzm().zzb((Context) null);
        }
    }
}
