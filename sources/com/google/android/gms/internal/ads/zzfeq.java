package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfeq {
    private final zzfej zza;
    private final zzfvl zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfeq(zzfdo zzfdo, zzfei zzfei, zzfej zzfej) {
        this.zza = zzfej;
        this.zzb = zzfvc.zzg(zzfvc.zzn(zzfei.zza(zzfej), new zzfeo(this, zzfei, zzfdo, zzfej), zzfej.zzb()), Exception.class, new zzfep(this, zzfei), zzfej.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfvl zza(com.google.android.gms.internal.ads.zzfej r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzfej r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdy r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfdy r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfej r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdy r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdy r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfvl r3 = r2.zzb     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeq.zza(com.google.android.gms.internal.ads.zzfej):com.google.android.gms.internal.ads.zzfvl");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzfei zzfei, zzfdo zzfdo, zzfej zzfej, zzfdx zzfdx) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfei.zzb(zzfdx);
            if (!this.zzc) {
                zzfdo.zzd(zzfej.zza(), zzfdx);
                zzfvl zzi = zzfvc.zzi((Object) null);
                return zzi;
            }
            zzfvl zzi2 = zzfvc.zzi(new zzfeh(zzfdx, zzfej));
            return zzi2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfei zzfei, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuy zzfuy) {
        zzfvc.zzr(zzfvc.zzn(this.zzb, zzfen.zza, this.zza.zzb()), zzfuy, this.zza.zzb());
    }
}
