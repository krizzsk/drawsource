package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzemh implements zzdeo, zzddh, zzdbw, zzdcn, zza, zzdbt, zzdee, zzarc, zzdcj, zzdjg {
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) zzay.zzc().zzb(zzbhz.zzhs)).intValue());
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final zzfgp zzj;

    public zzemh(zzfgp zzfgp) {
        this.zzj = zzfgp;
    }

    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            for (Pair zzely : this.zza) {
                zzeyo.zza(this.zzc, new zzely(zzely));
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            zzeyo.zza(this.zzb, zzelz.zza);
        }
    }

    public final void zza(zze zze2) {
        zzeyo.zza(this.zzb, new zzemb(zze2));
        zzeyo.zza(this.zzb, new zzemc(zze2));
        zzeyo.zza(this.zze, new zzemd(zze2));
        this.zzg.set(false);
        this.zza.clear();
    }

    public final void zzb(zzfbx zzfbx) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    public final void zzbE(zzbzv zzbzv) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzbu(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.zza     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.ads.internal.util.zze.zze(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfgp r0 = r3.zzj     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.zzfgo r1 = com.google.android.gms.internal.ads.zzfgo.zzb(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.zza(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.zza(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.zzb(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzc     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzelu r1 = new com.google.android.gms.internal.ads.zzelu     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzeyo.zza(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemh.zzbu(java.lang.String, java.lang.String):void");
    }

    public final void zzbv() {
    }

    public final synchronized zzbf zzc() {
        return (zzbf) this.zzb.get();
    }

    public final synchronized zzbz zzd() {
        return (zzbz) this.zzc.get();
    }

    public final void zze(zzbf zzbf) {
        this.zzb.set(zzbf);
    }

    public final void zzf(zzbi zzbi) {
        this.zze.set(zzbi);
    }

    public final void zzg(zzs zzs) {
        zzeyo.zza(this.zzd, new zzelw(zzs));
    }

    public final void zzh(zzde zzde) {
        this.zzd.set(zzde);
    }

    public final void zzi(zzbz zzbz) {
        this.zzc.set(zzbz);
        this.zzh.set(true);
        zzt();
    }

    public final void zzj() {
        zzeyo.zza(this.zzb, zzemg.zza);
        zzeyo.zza(this.zzf, zzelq.zza);
    }

    public final void zzk(zze zze2) {
        zzeyo.zza(this.zzf, new zzelv(zze2));
    }

    public final void zzl() {
        zzeyo.zza(this.zzb, zzelp.zza);
    }

    public final void zzm() {
        zzeyo.zza(this.zzb, zzelx.zza);
    }

    public final synchronized void zzn() {
        zzeyo.zza(this.zzb, zzeme.zza);
        zzeyo.zza(this.zze, zzemf.zza);
        this.zzi.set(true);
        zzt();
    }

    public final void zzo() {
        zzeyo.zza(this.zzb, zzelr.zza);
        zzeyo.zza(this.zzf, zzels.zza);
        zzeyo.zza(this.zzf, zzelt.zza);
    }

    public final void zzp(zzcal zzcal, String str, String str2) {
    }

    public final void zzq() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            zzeyo.zza(this.zzb, zzelz.zza);
        }
        zzeyo.zza(this.zzf, zzema.zza);
    }

    public final void zzr() {
    }

    public final void zzs(zzcg zzcg) {
        this.zzf.set(zzcg);
    }
}
