package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzekp implements zzefd {
    private final zzbiu zza;
    private final zzfvm zzb;
    private final zzfgf zzc;
    /* access modifiers changed from: private */
    public final zzeky zzd;

    public zzekp(zzfgf zzfgf, zzfvm zzfvm, zzbiu zzbiu, zzeky zzeky, byte[] bArr) {
        this.zzc = zzfgf;
        this.zzb = zzfvm;
        this.zza = zzbiu;
        this.zzd = zzeky;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        zzcga zzcga = new zzcga();
        zzeku zzeku = new zzeku();
        zzeku.zzd(new zzeko(this, zzcga, zzfbx, zzfbl, zzeku));
        zzfbq zzfbq = zzfbl.zzt;
        zzbip zzbip = new zzbip(zzeku, zzfbq.zzb, zzfbq.zza);
        zzfgf zzfgf = this.zzc;
        return zzffp.zzd(new zzekn(this, zzbip), this.zzb, zzffz.CUSTOM_RENDER_SYN, zzfgf).zzb(zzffz.CUSTOM_RENDER_ACK).zzd(zzcga).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfbx r1, com.google.android.gms.internal.ads.zzfbl r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbiu r1 = r0.zza
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfbq r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekp.zzb(com.google.android.gms.internal.ads.zzfbx, com.google.android.gms.internal.ads.zzfbl):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbip zzbip) throws Exception {
        this.zza.zze(zzbip);
    }
}
