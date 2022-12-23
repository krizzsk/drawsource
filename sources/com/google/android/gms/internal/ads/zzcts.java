package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcts implements zzdbt, zzddh, zzdcn, zza, zzdcj {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfbx zze;
    /* access modifiers changed from: private */
    public final zzfbl zzf;
    /* access modifiers changed from: private */
    public final zzfie zzg;
    /* access modifiers changed from: private */
    public final zzfcm zzh;
    private final zzaoc zzi;
    private final zzbiy zzj;
    private final zzfhs zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbja zzp;

    zzcts(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbx zzfbx, zzfbl zzfbl, zzfie zzfie, zzfcm zzfcm, View view, zzcli zzcli, zzaoc zzaoc, zzbiy zzbiy, zzbja zzbja, zzfhs zzfhs, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbx;
        this.zzf = zzfbl;
        this.zzg = zzfie;
        this.zzh = zzfcm;
        this.zzi = zzaoc;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcli);
        this.zzj = zzbiy;
        this.zzp = zzbja;
        this.zzk = zzfhs;
    }

    /* access modifiers changed from: private */
    public final void zzs() {
        int i;
        String zzh2 = ((Boolean) zzay.zzc().zzb(zzbhz.zzcF)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), (Activity) null) : null;
        if ((!((Boolean) zzay.zzc().zzb(zzbhz.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjo.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbjo.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
                zzcli zzcli = (zzcli) this.zzm.get();
            }
            zzfvc.zzr((zzfut) zzfvc.zzo(zzfut.zzv(zzfvc.zzi((Object) null)), ((Long) zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctr(this, zzh2), this.zzb);
            return;
        }
        zzfcm zzfcm = this.zzh;
        zzfie zzfie = this.zzg;
        zzfbx zzfbx = this.zze;
        zzfbl zzfbl = this.zzf;
        zzfcm.zza(zzfie.zzb(zzfbx, zzfbl, false, zzh2, (String) null, zzfbl.zzd));
    }

    private final void zzt(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new zzctl(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzay.zzc().zzb(zzbhz.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjo.zzd.zze()).booleanValue()) {
            zzfvc.zzr(zzfvc.zzf(zzfut.zzv(this.zzj.zza()), Throwable.class, zzctm.zza, zzcfv.zzf), new zzctq(this), this.zzb);
            return;
        }
        zzfcm zzfcm = this.zzh;
        zzfie zzfie = this.zzg;
        zzfbx zzfbx = this.zze;
        zzfbl zzfbl = this.zzf;
        List zza2 = zzfie.zza(zzfbx, zzfbl, zzfbl.zzc);
        int i = 1;
        if (true == zzt.zzo().zzv(this.zza)) {
            i = 2;
        }
        zzfcm.zzc(zza2, i);
    }

    public final void zzbv() {
        zzfcm zzfcm = this.zzh;
        zzfie zzfie = this.zzg;
        zzfbx zzfbx = this.zze;
        zzfbl zzfbl = this.zzf;
        zzfcm.zza(zzfie.zza(zzfbx, zzfbl, zzfbl.zzj));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzb.execute(new zzctp(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(int i, int i2) {
        this.zzb.execute(new zzctn(this, i, i2));
    }

    public final void zzj() {
    }

    public final void zzk(zze zze2) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zza(this.zze, this.zzf, zzfie.zzd(2, zze2.zza, this.zzf.zzp)));
        }
    }

    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) zzay.zzc().zzb(zzbhz.zzcI)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) zzay.zzc().zzb(zzbhz.zzcJ)).intValue());
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzcH)).booleanValue()) {
                this.zzc.execute(new zzcto(this));
            } else {
                zzs();
            }
        }
    }

    public final void zzm() {
    }

    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzb(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzfcm zzfcm = this.zzh;
            zzfie zzfie = this.zzg;
            zzfbx zzfbx = this.zze;
            zzfbl zzfbl = this.zzf;
            zzfcm.zza(zzfie.zza(zzfbx, zzfbl, zzfbl.zzn));
            zzfcm zzfcm2 = this.zzh;
            zzfie zzfie2 = this.zzg;
            zzfbx zzfbx2 = this.zze;
            zzfbl zzfbl2 = this.zzf;
            zzfcm2.zza(zzfie2.zza(zzfbx2, zzfbl2, zzfbl2.zzg));
        }
        this.zzn = true;
    }

    public final void zzo() {
    }

    public final void zzp(zzcal zzcal, String str, String str2) {
        zzfcm zzfcm = this.zzh;
        zzfie zzfie = this.zzg;
        zzfbl zzfbl = this.zzf;
        zzfcm.zza(zzfie.zzc(zzfbl, zzfbl.zzi, zzcal));
    }

    public final void zzr() {
        zzfcm zzfcm = this.zzh;
        zzfie zzfie = this.zzg;
        zzfbx zzfbx = this.zze;
        zzfbl zzfbl = this.zzf;
        zzfcm.zza(zzfie.zza(zzfbx, zzfbl, zzfbl.zzh));
    }
}
