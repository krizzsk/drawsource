package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzmo implements zzms {
    public static final zzfpj zza = zzmm.zza;
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzch zzc;
    /* access modifiers changed from: private */
    public final zzcf zzd;
    private final HashMap zze;
    private final zzfpj zzf;
    private zzmr zzg;
    private zzci zzh;
    private String zzi;

    public zzmo() {
        throw null;
    }

    private final zzmn zzk(int i, zzsa zzsa) {
        int i2;
        zzmn zzmn = null;
        long j = Long.MAX_VALUE;
        for (zzmn zzmn2 : this.zze.values()) {
            zzmn2.zzg(i, zzsa);
            if (zzmn2.zzj(i, zzsa)) {
                long zzb2 = zzmn2.zzd;
                if (zzb2 == -1 || zzb2 < j) {
                    zzmn = zzmn2;
                    j = zzb2;
                } else if (i2 == 0) {
                    int i3 = zzeg.zza;
                    if (!(zzmn.zze == null || zzmn2.zze == null)) {
                        zzmn = zzmn2;
                    }
                }
            }
        }
        if (zzmn != null) {
            return zzmn;
        }
        String zzl = zzl();
        zzmn zzmn3 = new zzmn(this, zzl, i, zzsa);
        this.zze.put(zzl, zzmn3);
        return zzmn3;
    }

    /* access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({"listener"})
    private final void zzm(zzki zzki) {
        if (zzki.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmn zzmn = (zzmn) this.zze.get(this.zzi);
        zzmn zzk = zzk(zzki.zzc, zzki.zzd);
        this.zzi = zzk.zzb;
        zzh(zzki);
        zzsa zzsa = zzki.zzd;
        if (zzsa != null && zzsa.zzb()) {
            if (zzmn == null || zzmn.zzd != zzki.zzd.zzd || zzmn.zze == null || zzmn.zze.zzb != zzki.zzd.zzb || zzmn.zze.zzc != zzki.zzd.zzc) {
                zzsa zzsa2 = zzki.zzd;
                String unused = zzk(zzki.zzc, new zzsa(zzsa2.zza, zzsa2.zzd)).zzb;
                String unused2 = zzk.zzb;
            }
        }
    }

    public final synchronized String zzd() {
        return this.zzi;
    }

    public final synchronized String zze(zzci zzci, zzsa zzsa) {
        return zzk(zzci.zzn(zzsa.zza, this.zzd).zzd, zzsa).zzb;
    }

    public final synchronized void zzf(zzki zzki) {
        zzmr zzmr;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmn = (zzmn) it.next();
            it.remove();
            if (zzmn.zzf && (zzmr = this.zzg) != null) {
                zzmr.zzd(zzki, zzmn.zzb, false);
            }
        }
    }

    public final void zzg(zzmr zzmr) {
        this.zzg = zzmr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r10.zzd.zzd < com.google.android.gms.internal.ads.zzmn.zzb(r0)) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzki r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzmr r0 = r9.zzg     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzci r0 = r10.zzb     // Catch:{ all -> 0x00cc }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r9)
            return
        L_0x000f:
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmn r0 = (com.google.android.gms.internal.ads.zzmn) r0     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            long r1 = r0.zzd     // Catch:{ all -> 0x00cc }
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            int r0 = r0.zzc     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            if (r0 != r1) goto L_0x003e
            goto L_0x0040
        L_0x0032:
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            long r1 = r1.zzd     // Catch:{ all -> 0x00cc }
            long r3 = r0.zzd     // Catch:{ all -> 0x00cc }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x003e:
            monitor-exit(r9)
            return
        L_0x0040:
            int r0 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmn r0 = r9.zzk(r0, r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            r9.zzi = r1     // Catch:{ all -> 0x00cc }
        L_0x0052:
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            r2 = 1
            if (r1 == 0) goto L_0x009c
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r1.zza     // Catch:{ all -> 0x00cc }
            long r5 = r1.zzd     // Catch:{ all -> 0x00cc }
            int r1 = r1.zzb     // Catch:{ all -> 0x00cc }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmn r1 = r9.zzk(r1, r3)     // Catch:{ all -> 0x00cc }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00cc }
            if (r3 != 0) goto L_0x009c
            r1.zzf = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzci r3 = r10.zzb     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsa r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzcf r5 = r9.zzd     // Catch:{ all -> 0x00cc }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzcf r3 = r9.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsa r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            int r4 = r4.zzb     // Catch:{ all -> 0x00cc }
            r3.zzh(r4)     // Catch:{ all -> 0x00cc }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r7 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00cc }
        L_0x009c:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00a8
            r0.zzf = true     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00cc }
        L_0x00a8:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r9.zzi     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00c8
            r0.zzg = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmr r1 = r9.zzg     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00cc }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r9)
            return
        L_0x00c8:
            monitor-exit(r9)
            return
        L_0x00ca:
            r10 = 0
            throw r10     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmo.zzh(com.google.android.gms.internal.ads.zzki):void");
    }

    public final synchronized void zzi(zzki zzki, int i) {
        if (this.zzg != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzmn zzmn = (zzmn) it.next();
                if (zzmn.zzk(zzki)) {
                    it.remove();
                    if (zzmn.zzf) {
                        boolean equals = zzmn.zzb.equals(this.zzi);
                        boolean z = false;
                        if (i == 0 && equals && zzmn.zzg) {
                            z = true;
                        }
                        if (equals) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzki, zzmn.zzb, z);
                    }
                }
            }
            zzm(zzki);
        } else {
            throw null;
        }
    }

    public final synchronized void zzj(zzki zzki) {
        if (this.zzg != null) {
            zzci zzci = this.zzh;
            this.zzh = zzki.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzmn zzmn = (zzmn) it.next();
                if (!zzmn.zzl(zzci, this.zzh) || zzmn.zzk(zzki)) {
                    it.remove();
                    if (zzmn.zzf) {
                        if (zzmn.zzb.equals(this.zzi)) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzki, zzmn.zzb, false);
                    }
                }
            }
            zzm(zzki);
        } else {
            throw null;
        }
    }

    public zzmo(zzfpj zzfpj) {
        this.zzf = zzfpj;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}
