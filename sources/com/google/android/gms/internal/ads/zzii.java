package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzii implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxq, zznk, zzua, zzra, zzgi, zzge, zzka, zzgu {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzim zza;

    /* synthetic */ zzii(zzim zzim, zzih zzih) {
        this.zza = zzim;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzim.zzN(this.zza, surfaceTexture);
        this.zza.zzap(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzas((Object) null);
        this.zza.zzap(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzap(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzap(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzap(0, 0);
    }

    public final /* synthetic */ void zza(boolean z) {
    }

    public final void zzb(boolean z) {
        this.zza.zzaw();
    }

    public final void zzc(Exception exc) {
        this.zza.zzr.zzy(exc);
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.zzr.zzz(str, j, j2);
    }

    public final void zze(String str) {
        this.zza.zzr.zzA(str);
    }

    public final void zzf(zzgl zzgl) {
        this.zza.zzr.zzB(zzgl);
        this.zza.zzM = null;
        this.zza.zzU = null;
    }

    public final void zzg(zzgl zzgl) {
        this.zza.zzU = zzgl;
        this.zza.zzr.zzC(zzgl);
    }

    public final void zzh(zzad zzad, zzgm zzgm) {
        this.zza.zzM = zzad;
        this.zza.zzr.zzD(zzad, zzgm);
    }

    public final void zzi(long j) {
        this.zza.zzr.zzE(j);
    }

    public final void zzj(Exception exc) {
        this.zza.zzr.zzF(exc);
    }

    public final void zzk(int i, long j, long j2) {
        this.zza.zzr.zzG(i, j, j2);
    }

    public final void zzl(int i, long j) {
        this.zza.zzr.zzH(i, j);
    }

    public final void zzm(Object obj, long j) {
        this.zza.zzr.zzI(obj, j);
        zzim zzim = this.zza;
        if (zzim.zzO == obj) {
            zzdm zzz = zzim.zzl;
            zzz.zzd(26, zzic.zza);
            zzz.zzc();
        }
    }

    public final void zzn(boolean z) {
        zzim zzim = this.zza;
        if (zzim.zzY != z) {
            zzim.zzY = z;
            zzdm zzz = this.zza.zzl;
            zzz.zzd(23, new zzif(z));
            zzz.zzc();
        }
    }

    public final void zzo(Exception exc) {
        this.zza.zzr.zzJ(exc);
    }

    public final void zzp(String str, long j, long j2) {
        this.zza.zzr.zzK(str, j, j2);
    }

    public final void zzq(String str) {
        this.zza.zzr.zzL(str);
    }

    public final void zzr(zzgl zzgl) {
        this.zza.zzr.zzM(zzgl);
        this.zza.zzL = null;
        this.zza.zzT = null;
    }

    public final void zzs(zzgl zzgl) {
        this.zza.zzT = zzgl;
        this.zza.zzr.zzN(zzgl);
    }

    public final void zzt(long j, int i) {
        this.zza.zzr.zzO(j, i);
    }

    public final void zzu(zzad zzad, zzgm zzgm) {
        this.zza.zzL = zzad;
        this.zza.zzr.zzP(zzad, zzgm);
    }

    public final void zzv(zzcv zzcv) {
        this.zza.zzad = zzcv;
        zzdm zzz = this.zza.zzl;
        zzz.zzd(25, new zzig(zzcv));
        zzz.zzc();
    }
}
