package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzglg {
    private static final zzgkc zzb = zzgkc.zza();
    protected volatile zzgma zza;
    private volatile zzgji zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzglg)) {
            return false;
        }
        zzglg zzglg = (zzglg) obj;
        zzgma zzgma = this.zza;
        zzgma zzgma2 = zzglg.zza;
        if (zzgma == null && zzgma2 == null) {
            return zzb().equals(zzglg.zzb());
        }
        if (zzgma != null && zzgma2 != null) {
            return zzgma.equals(zzgma2);
        }
        if (zzgma != null) {
            zzglg.zzc(zzgma.zzbh());
            return zzgma.equals(zzglg.zza);
        }
        zzc(zzgma2.zzbh());
        return this.zza.equals(zzgma2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgje) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzax();
        }
        return 0;
    }

    public final zzgji zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgji zzgji = this.zzc;
                return zzgji;
            }
            if (this.zza == null) {
                this.zzc = zzgji.zzb;
            } else {
                this.zzc = this.zza.zzas();
            }
            zzgji zzgji2 = this.zzc;
            return zzgji2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.ads.zzgma r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgma r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgma r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzglc -> 0x0011 }
            com.google.android.gms.internal.ads.zzgji r0 = com.google.android.gms.internal.ads.zzgji.zzb     // Catch:{ zzglc -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzglc -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgji r2 = com.google.android.gms.internal.ads.zzgji.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzglg.zzc(com.google.android.gms.internal.ads.zzgma):void");
    }
}
