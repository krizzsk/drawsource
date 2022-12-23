package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzewr implements zzemx {
    protected final zzcnf zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzexh zzd;
    /* access modifiers changed from: private */
    public final zzeza zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfhu zzh;
    private final zzfcb zzi;
    /* access modifiers changed from: private */
    @Nullable
    public zzfvl zzj;

    protected zzewr(Context context, Executor executor, zzcnf zzcnf, zzeza zzeza, zzexh zzexh, zzfcb zzfcb, zzcfo zzcfo) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnf;
        this.zze = zzeza;
        this.zzd = zzexh;
        this.zzi = zzfcb;
        this.zzf = zzcfo;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnf.zzy();
    }

    /* access modifiers changed from: private */
    public final synchronized zzdbb zzm(zzeyy zzeyy) {
        zzewq zzewq = (zzewq) zzeyy;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
            zzcvs zzcvs = new zzcvs(this.zzg);
            zzdbd zzdbd = new zzdbd();
            zzdbd.zzc(this.zzb);
            zzdbd.zzf(zzewq.zza);
            zzdbf zzg2 = zzdbd.zzg();
            zzdhd zzdhd = new zzdhd();
            zzdhd.zzc(this.zzd, this.zzc);
            zzdhd.zzl(this.zzd, this.zzc);
            return zzc(zzcvs, zzg2, zzdhd.zzn());
        }
        zzexh zzi2 = zzexh.zzi(this.zzd);
        zzdhd zzdhd2 = new zzdhd();
        zzdhd2.zzb(zzi2, this.zzc);
        zzdhd2.zzg(zzi2, this.zzc);
        zzdhd2.zzh(zzi2, this.zzc);
        zzdhd2.zzi(zzi2, this.zzc);
        zzdhd2.zzc(zzi2, this.zzc);
        zzdhd2.zzl(zzi2, this.zzc);
        zzdhd2.zzm(zzi2);
        zzcvs zzcvs2 = new zzcvs(this.zzg);
        zzdbd zzdbd2 = new zzdbd();
        zzdbd2.zzc(this.zzb);
        zzdbd2.zzf(zzewq.zza);
        return zzc(zzcvs2, zzdbd2.zzg(), zzdhd2.zzn());
    }

    public final boolean zza() {
        zzfvl zzfvl = this.zzj;
        return zzfvl != null && !zzfvl.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzemv r10, com.google.android.gms.internal.ads.zzemw r11) throws android.os.RemoteException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzbjb r10 = com.google.android.gms.internal.ads.zzbjn.zzd     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzbhr r10 = com.google.android.gms.internal.ads.zzbhz.zziv     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbhx r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = r0
            goto L_0x0026
        L_0x0025:
            r10 = r1
        L_0x0026:
            com.google.android.gms.internal.ads.zzcfo r2 = r7.zzf     // Catch:{ all -> 0x00f4 }
            int r2 = r2.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zziw     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbhx r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzewl r9 = new com.google.android.gms.internal.ads.zzewl     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfvl r10 = r7.zzj     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.zzbjb r10 = com.google.android.gms.internal.ads.zzbji.zzc     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzeza r10 = r7.zze     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzcvd r10 = (com.google.android.gms.internal.ads.zzcvd) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfhs r10 = r10.zzh()     // Catch:{ all -> 0x00f4 }
            r10.zzh(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.zzp     // Catch:{ all -> 0x00f4 }
            r10.zzb(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.zzf     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfcx.zza(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbhr r10 = com.google.android.gms.internal.ads.zzbhz.zzhv     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbhx r3 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.zzf     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzcnf r10 = r7.zza     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzdzb r10 = r10.zzk()     // Catch:{ all -> 0x00f4 }
            r10.zzl(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.zzfcb r10 = r7.zzi     // Catch:{ all -> 0x00f4 }
            r10.zzs(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.ads.internal.client.zzq r9 = com.google.android.gms.ads.internal.client.zzq.zzb()     // Catch:{ all -> 0x00f4 }
            r10.zzr(r9)     // Catch:{ all -> 0x00f4 }
            r10.zzE(r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfcd r9 = r10.zzG()     // Catch:{ all -> 0x00f4 }
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.zzfhr.zzf(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfhh r5 = com.google.android.gms.internal.ads.zzfhg.zzb(r10, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzewq r6 = new com.google.android.gms.internal.ads.zzewq     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.zza = r9     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeza r8 = r7.zze     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzezb r9 = new com.google.android.gms.internal.ads.zzezb     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzewm r10 = new com.google.android.gms.internal.ads.zzewm     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfvl r8 = r8.zzc(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.zzj = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzewo r9 = new com.google.android.gms.internal.ads.zzewo     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfvc.zzr(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewr.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemv, com.google.android.gms.internal.ads.zzemw):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract zzdbb zzc(zzcvs zzcvs, zzdbf zzdbf, zzdhf zzdhf);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfdc.zzd(6, (String) null, (zze) null));
    }

    public final void zzl(zzw zzw) {
        this.zzi.zzt(zzw);
    }
}
