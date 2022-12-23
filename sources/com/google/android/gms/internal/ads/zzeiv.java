package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeiv implements zzfuj {
    private final zzfgf zza;
    private final zzdbv zzb;
    private final zzfie zzc;
    private final zzfii zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcya zzg;
    private final zzeiq zzh;
    private final zzefi zzi;
    private final Context zzj;
    private final zzfhs zzk;

    zzeiv(Context context, zzfgf zzfgf, zzeiq zzeiq, zzdbv zzdbv, zzfie zzfie, zzfii zzfii, zzcya zzcya, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefi zzefi, zzfhs zzfhs) {
        this.zzj = context;
        this.zza = zzfgf;
        this.zzh = zzeiq;
        this.zzb = zzdbv;
        this.zzc = zzfie;
        this.zzd = zzfii;
        this.zzg = zzcya;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefi;
        this.zzk = zzfhs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfvl zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfbx r9 = (com.google.android.gms.internal.ads.zzfbx) r9
            com.google.android.gms.internal.ads.zzfbw r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfbo r0 = r0.zzb
            int r0 = r0.zze
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0042
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzew
            com.google.android.gms.internal.ads.zzbhx r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "No fill."
            goto L_0x0044
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0044
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "No ad config."
        L_0x0044:
            com.google.android.gms.internal.ads.zzfbw r3 = r9.zzb
            com.google.android.gms.internal.ads.zzfbo r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfbn r4 = r3.zzi
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = r4.zza()
        L_0x0050:
            com.google.android.gms.internal.ads.zzefi r4 = r8.zzi
            r4.zzg(r3)
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zzgX
            com.google.android.gms.internal.ads.zzbhx r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfbw r3 = r9.zzb
            com.google.android.gms.internal.ads.zzfbo r3 = r3.zzb
            int r3 = r3.zze
            if (r3 == 0) goto L_0x007f
            if (r3 < r1) goto L_0x0074
            if (r3 < r2) goto L_0x007f
        L_0x0074:
            com.google.android.gms.internal.ads.zzeit r9 = new com.google.android.gms.internal.ads.zzeit
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfvl r9 = com.google.android.gms.internal.ads.zzfvc.zzh(r9)
            goto L_0x015d
        L_0x007f:
            com.google.android.gms.internal.ads.zzfgf r1 = r8.zza
            com.google.android.gms.internal.ads.zzffz r2 = com.google.android.gms.internal.ads.zzffz.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.zzeit r3 = new com.google.android.gms.internal.ads.zzeit
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfvl r0 = com.google.android.gms.internal.ads.zzfvc.zzh(r3)
            com.google.android.gms.internal.ads.zzffw r0 = com.google.android.gms.internal.ads.zzffp.zzc(r0, r2, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfbw r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L_0x009c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzfbl r2 = (com.google.android.gms.internal.ads.zzfbl) r2
            com.google.android.gms.internal.ads.zzefi r3 = r8.zzi
            r3.zzd(r2)
            java.util.List r3 = r2.zza
            java.util.Iterator r3 = r3.iterator()
        L_0x00b3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzcya r5 = r8.zzg
            int r6 = r2.zzb
            com.google.android.gms.internal.ads.zzefd r4 = r5.zza(r6, r4)
            if (r4 == 0) goto L_0x00b3
            boolean r4 = r4.zzb(r9, r2)
            if (r4 == 0) goto L_0x00b3
            goto L_0x009c
        L_0x00d0:
            com.google.android.gms.internal.ads.zzefi r3 = r8.zzi
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfdc.zzd(r6, r7, r7)
            r3.zze(r2, r4, r6)
            goto L_0x009c
        L_0x00de:
            com.google.android.gms.internal.ads.zzdbv r1 = r8.zzb
            com.google.android.gms.internal.ads.zzctk r2 = new com.google.android.gms.internal.ads.zzctk
            com.google.android.gms.internal.ads.zzfii r3 = r8.zzd
            com.google.android.gms.internal.ads.zzfie r4 = r8.zzc
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.zze
            r1.zzj(r2, r3)
            com.google.android.gms.internal.ads.zzfbw r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x015c
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzfbl r3 = (com.google.android.gms.internal.ads.zzfbl) r3
            java.util.List r4 = r3.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0159
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcya r6 = r8.zzg
            int r7 = r3.zzb
            com.google.android.gms.internal.ads.zzefd r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L_0x0109
            boolean r7 = r6.zzb(r9, r3)
            if (r7 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.zzfgf r4 = r8.zza
            com.google.android.gms.internal.ads.zzffz r7 = com.google.android.gms.internal.ads.zzffz.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzffw r0 = r4.zzb(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "render-config-"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzffw r0 = r0.zzh(r4)
            com.google.android.gms.internal.ads.zzeiu r4 = new com.google.android.gms.internal.ads.zzeiu
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzffw r0 = r0.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzffk r0 = r0.zza()
        L_0x0159:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x015c:
            r9 = r0
        L_0x015d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiv.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfvl");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzfbl zzfbl, zzfbx zzfbx, zzefd zzefd, Throwable th) throws Exception {
        zzfhh zza2 = zzfhg.zza(this.zzj, 12);
        zza2.zzc(zzfbl.zzF);
        zza2.zzf();
        zzeiq zzeiq = this.zzh;
        zzfvl zzo = zzfvc.zzo(zzefd.zza(zzfbx, zzfbl), (long) zzfbl.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeiq.zze(zzfbx, zzfbl, zzo, this.zzc);
        zzfhr.zza(zzo, this.zzk, zza2);
        return zzo;
    }
}
