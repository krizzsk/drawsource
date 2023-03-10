package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class zzelj extends zzbr {
    private final Context zza;
    private final zzbf zzb;
    private final zzfcd zzc;
    private final zzcvv zzd;
    private final ViewGroup zze;

    public zzelj(Context context, zzbf zzbf, zzfcd zzfcd, zzcvv zzcvv) {
        this.zza = context;
        this.zzb = zzbf;
        this.zzc = zzfcd;
        this.zzd = zzcvv;
        FrameLayout frameLayout = new FrameLayout(this.zza);
        frameLayout.removeAllViews();
        View zzc2 = this.zzd.zzc();
        zzt.zzp();
        frameLayout.addView(zzc2, zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.zzd.zzg();
    }

    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc((Context) null);
    }

    public final void zzC(zzbc zzbc) throws RemoteException {
        zze.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbf zzbf) throws RemoteException {
        zze.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzbw zzbw) throws RemoteException {
        zze.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzq zzq) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcvv zzcvv = this.zzd;
        if (zzcvv != null) {
            zzcvv.zzh(this.zze, zzq);
        }
    }

    public final void zzG(zzbz zzbz) throws RemoteException {
        zzemh zzemh = this.zzc.zzc;
        if (zzemh != null) {
            zzemh.zzi(zzbz);
        }
    }

    public final void zzH(zzbcj zzbcj) throws RemoteException {
    }

    public final void zzI(zzw zzw) throws RemoteException {
    }

    public final void zzJ(zzcg zzcg) {
    }

    public final void zzK(zzdo zzdo) throws RemoteException {
    }

    public final void zzL(boolean z) throws RemoteException {
    }

    public final void zzM(zzbye zzbye) throws RemoteException {
    }

    public final void zzN(boolean z) throws RemoteException {
        zze.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbiu zzbiu) throws RemoteException {
        zze.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzde zzde) {
        zze.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzbyh zzbyh, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(zzcar zzcar) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzff zzff) throws RemoteException {
        zze.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(zzl zzl) throws RemoteException {
        zze.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzab(zzcd zzcd) throws RemoteException {
        zze.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        zze.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfch.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    public final zzbf zzi() throws RemoteException {
        return this.zzb;
    }

    public final zzbz zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    public final zzdh zzk() {
        return this.zzd.zzl();
    }

    public final zzdk zzl() throws RemoteException {
        return this.zzd.zzd();
    }

    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzV();
    }

    public final void zzy(zzl zzl, zzbi zzbi) {
    }

    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb((Context) null);
    }
}
