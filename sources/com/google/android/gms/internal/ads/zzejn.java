package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzejn implements zzdlg {
    private final Context zza;
    private final zzdtp zzb;
    private final zzfcd zzc;
    private final zzcfo zzd;
    private final zzfbl zze;
    private final zzfvl zzf;
    private final zzcli zzg;
    private final zzbop zzh;
    private final boolean zzi;

    zzejn(Context context, zzdtp zzdtp, zzfcd zzfcd, zzcfo zzcfo, zzfbl zzfbl, zzfvl zzfvl, zzcli zzcli, zzbop zzbop, boolean z) {
        this.zza = context;
        this.zzb = zzdtp;
        this.zzc = zzfcd;
        this.zzd = zzcfo;
        this.zze = zzfbl;
        this.zzf = zzfvl;
        this.zzg = zzcli;
        this.zzh = zzbop;
        this.zzi = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzdcg r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.zzfvl r0 = r1.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfvc.zzq(r0)
            com.google.android.gms.internal.ads.zzdsu r0 = (com.google.android.gms.internal.ads.zzdsu) r0
            com.google.android.gms.internal.ads.zzfbl r2 = r1.zze     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzcli r3 = r1.zzg     // Catch:{ zzclt -> 0x00f8 }
            boolean r3 = r3.zzaD()     // Catch:{ zzclt -> 0x00f8 }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcli r2 = r1.zzg     // Catch:{ zzclt -> 0x00f8 }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zzaG     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzbhx r5 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ zzclt -> 0x00f8 }
            java.lang.Object r3 = r5.zzb(r3)     // Catch:{ zzclt -> 0x00f8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzclt -> 0x00f8 }
            boolean r3 = r3.booleanValue()     // Catch:{ zzclt -> 0x00f8 }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzcli r2 = r1.zzg     // Catch:{ zzclt -> 0x00f8 }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.zzdtp r3 = r1.zzb     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfcd r5 = r1.zzc     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.ads.internal.client.zzq r5 = r5.zze     // Catch:{ zzclt -> 0x00f8 }
            r6 = 0
            com.google.android.gms.internal.ads.zzcli r3 = r3.zza(r5, r6, r6)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzdjp r5 = r0.zzg()     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzbpc.zzb(r3, r5)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzdtt r5 = new com.google.android.gms.internal.ads.zzdtt     // Catch:{ zzclt -> 0x00f8 }
            r5.<init>()     // Catch:{ zzclt -> 0x00f8 }
            android.content.Context r7 = r1.zza     // Catch:{ zzclt -> 0x00f8 }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ zzclt -> 0x00f8 }
            r5.zza(r7, r8)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzdto r7 = r0.zzl()     // Catch:{ zzclt -> 0x00f8 }
            boolean r8 = r1.zzi     // Catch:{ zzclt -> 0x00f8 }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbop r8 = r1.zzh     // Catch:{ zzclt -> 0x00f8 }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.zzi(r3, r4, r8)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzcmv r7 = r3.zzP()     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzejl r8 = new com.google.android.gms.internal.ads.zzejl     // Catch:{ zzclt -> 0x00f8 }
            r8.<init>(r5, r3)     // Catch:{ zzclt -> 0x00f8 }
            r7.zzz(r8)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzcmv r5 = r3.zzP()     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzejm r7 = new com.google.android.gms.internal.ads.zzejm     // Catch:{ zzclt -> 0x00f8 }
            r7.<init>(r3)     // Catch:{ zzclt -> 0x00f8 }
            r5.zzF(r7)     // Catch:{ zzclt -> 0x00f8 }
            com.google.android.gms.internal.ads.zzfbq r2 = r2.zzt     // Catch:{ zzclt -> 0x00f8 }
            java.lang.String r5 = r2.zzb     // Catch:{ zzclt -> 0x00f8 }
            java.lang.String r2 = r2.zza     // Catch:{ zzclt -> 0x00f8 }
            r3.zzad(r5, r2, r6)     // Catch:{ zzclt -> 0x00f8 }
            r11 = r3
        L_0x007e:
            r11.zzap(r4)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r3 = r1.zzi
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zzbop r3 = r1.zzh
            boolean r3 = r3.zze(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = r5
        L_0x0091:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r3 = r1.zza
            boolean r14 = com.google.android.gms.ads.internal.util.zzs.zzE(r3)
            boolean r3 = r1.zzi
            if (r3 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.zzbop r5 = r1.zzh
            boolean r5 = r5.zzd()
        L_0x00a4:
            r15 = r5
            if (r3 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.zzbop r3 = r1.zzh
            float r3 = r3.zza()
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            r16 = r3
            com.google.android.gms.internal.ads.zzfbl r3 = r1.zze
            r17 = -1
            boolean r5 = r3.zzP
            boolean r3 = r3.zzQ
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00c8
            r24.zzf()
        L_0x00c8:
            com.google.android.gms.ads.internal.zzt.zzj()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdkv r9 = r0.zzj()
            com.google.android.gms.internal.ads.zzfbl r0 = r1.zze
            int r12 = r0.zzR
            com.google.android.gms.internal.ads.zzcfo r13 = r1.zzd
            java.lang.String r14 = r0.zzC
            com.google.android.gms.internal.ads.zzfbq r0 = r0.zzt
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.zzb
            java.lang.String r0 = r0.zza
            com.google.android.gms.internal.ads.zzfcd r6 = r1.zzc
            java.lang.String r6 = r6.zzf
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.ads.internal.client.zza) r8, (com.google.android.gms.ads.internal.overlay.zzo) r9, (com.google.android.gms.ads.internal.overlay.zzw) r10, (com.google.android.gms.internal.ads.zzcli) r11, (int) r12, (com.google.android.gms.internal.ads.zzcfo) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.zzdcg) r19)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzm.zza(r0, r3, r4)
            return
        L_0x00f8:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.zzcfi.zzh(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejn.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdcg):void");
    }
}
