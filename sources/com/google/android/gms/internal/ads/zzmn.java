package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzmn {
    final /* synthetic */ zzmo zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzsa zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzmn(zzmo zzmo, String str, int i, zzsa zzsa) {
        this.zza = zzmo;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsa == null ? -1 : zzsa.zzd;
        if (zzsa != null && zzsa.zzb()) {
            this.zze = zzsa;
        }
    }

    public final void zzg(int i, zzsa zzsa) {
        if (this.zzd == -1 && i == this.zzc && zzsa != null) {
            this.zzd = zzsa.zzd;
        }
    }

    public final boolean zzj(int i, zzsa zzsa) {
        if (zzsa == null) {
            return i == this.zzc;
        }
        zzsa zzsa2 = this.zze;
        return zzsa2 == null ? !zzsa.zzb() && zzsa.zzd == this.zzd : zzsa.zzd == zzsa2.zzd && zzsa.zzb == zzsa2.zzb && zzsa.zzc == zzsa2.zzc;
    }

    public final boolean zzk(zzki zzki) {
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        zzsa zzsa = zzki.zzd;
        if (zzsa == null) {
            return this.zzc != zzki.zzc;
        }
        if (zzsa.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza2 = zzki.zzb.zza(zzsa.zza);
        int zza3 = zzki.zzb.zza(this.zze.zza);
        zzsa zzsa2 = zzki.zzd;
        if (zzsa2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzsa2.zzb()) {
            zzsa zzsa3 = zzki.zzd;
            int i = zzsa3.zzb;
            int i2 = zzsa3.zzc;
            zzsa zzsa4 = this.zze;
            int i3 = zzsa4.zzb;
            if (i > i3 || (i == i3 && i2 > zzsa4.zzc)) {
                return true;
            }
            return false;
        }
        int i4 = zzki.zzd.zze;
        return i4 == -1 || i4 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzci r7, com.google.android.gms.internal.ads.zzci r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = r3
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzmo r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmo r0 = r6.zza
            com.google.android.gms.internal.ads.zzch r0 = r0.zzc
            int r0 = r0.zzo
        L_0x0026:
            com.google.android.gms.internal.ads.zzmo r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = r1.zzc
            int r1 = r1.zzp
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzmo r7 = r6.zza
            com.google.android.gms.internal.ads.zzcf r7 = r7.zzd
            com.google.android.gms.internal.ads.zzcf r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzsa r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmn.zzl(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzci):boolean");
    }
}
