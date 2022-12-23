package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbcu {
    private final Runnable zza = new zzbcq(this);
    /* access modifiers changed from: private */
    public final Object zzb = new Object();
    /* access modifiers changed from: private */
    public zzbcx zzc;
    private Context zzd;
    /* access modifiers changed from: private */
    public zzbda zze;

    static /* bridge */ /* synthetic */ void zzh(zzbcu zzbcu) {
        synchronized (zzbcu.zzb) {
            zzbcx zzbcx = zzbcu.zzc;
            if (zzbcx != null) {
                if (zzbcx.isConnected() || zzbcu.zzc.isConnecting()) {
                    zzbcu.zzc.disconnect();
                }
                zzbcu.zzc = null;
                zzbcu.zze = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            android.content.Context r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzbcx r1 = r3.zzc     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzbcs r1 = new com.google.android.gms.internal.ads.zzbcs     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbct r2 = new com.google.android.gms.internal.ads.zzbct     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbcx r1 = r3.zzd(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.zzc = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcu.zzl():void");
    }

    public final long zza(zzbcy zzbcy) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return -2;
            }
            if (this.zzc.zzp()) {
                try {
                    long zze2 = this.zze.zze(zzbcy);
                    return zze2;
                } catch (RemoteException e) {
                    zze.zzh("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    public final zzbcv zzb(zzbcy zzbcy) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                zzbcv zzbcv = new zzbcv();
                return zzbcv;
            }
            try {
                if (this.zzc.zzp()) {
                    zzbcv zzg = this.zze.zzg(zzbcy);
                    return zzg;
                }
                zzbcv zzf = this.zze.zzf(zzbcy);
                return zzf;
            } catch (RemoteException e) {
                zze.zzh("Unable to call into cache service.", e);
                return new zzbcv();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized zzbcx zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbcx(this.zzd, zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            android.content.Context r1 = r2.zzd     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zzd = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zzdl     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.zzl()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zzdk     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzbcr r3 = new com.google.android.gms.internal.ads.zzbcr     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbbh r1 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ all -> 0x0048 }
            r1.zzc(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcu.zzi(android.content.Context):void");
    }

    public final void zzj() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdm)).booleanValue()) {
            synchronized (this.zzb) {
                zzl();
                zzs.zza.removeCallbacks(this.zza);
                zzs.zza.postDelayed(this.zza, ((Long) zzay.zzc().zzb(zzbhz.zzdn)).longValue());
            }
        }
    }
}
