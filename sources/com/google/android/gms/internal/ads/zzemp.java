package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzemp extends zzbr {
    private final zzq zza;
    private final Context zzb;
    private final zzezo zzc;
    private final String zzd;
    private final zzcfo zze;
    private final zzemh zzf;
    private final zzfao zzg;
    /* access modifiers changed from: private */
    public zzdjz zzh;
    private boolean zzi = ((Boolean) zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();

    public zzemp(Context context, zzq zzq, String str, zzezo zzezo, zzemh zzemh, zzfao zzfao, zzcfo zzcfo) {
        this.zza = zzq;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezo;
        this.zzf = zzemh;
        this.zzg = zzfao;
        this.zze = zzcfo;
    }

    private final synchronized boolean zze() {
        zzdjz zzdjz;
        zzdjz = this.zzh;
        return zzdjz != null && !zzdjz.zza();
    }

    public final void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdjz zzdjz = this.zzh;
        if (zzdjz != null) {
            zzdjz.zzm().zzc((Context) null);
        }
    }

    public final void zzC(zzbc zzbc) {
    }

    public final void zzD(zzbf zzbf) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zze(zzbf);
    }

    public final void zzE(zzbw zzbw) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(zzq zzq) {
    }

    public final void zzG(zzbz zzbz) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzi(zzbz);
    }

    public final void zzH(zzbcj zzbcj) {
    }

    public final void zzI(zzw zzw) {
    }

    public final void zzJ(zzcg zzcg) {
        this.zzf.zzs(zzcg);
    }

    public final void zzK(zzdo zzdo) {
    }

    public final synchronized void zzL(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzi = z;
    }

    public final void zzM(zzbye zzbye) {
    }

    public final void zzN(boolean z) {
    }

    public final synchronized void zzO(zzbiu zzbiu) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbiu);
    }

    public final void zzP(zzde zzde) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzf.zzh(zzde);
    }

    public final void zzQ(zzbyh zzbyh, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzcar zzcar) {
        this.zzg.zzf(zzcar);
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzff zzff) {
    }

    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzh == null) {
            zze.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfdc.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        this.zzh.zzc(this.zzi, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        zzdjz zzdjz = this.zzh;
        if (zzdjz == null) {
            zze.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfdc.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        zzdjz.zzc(this.zzi, (Activity) null);
    }

    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC, Splitter:B:21:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjn.zzf     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zziv     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbhx r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zze     // Catch:{ all -> 0x008c }
            int r2 = r2.zzc     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbhr r3 = com.google.android.gms.internal.ads.zzbhz.zziw     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbhx r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x008c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008c }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x008c }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.zze.zzg(r6)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzemh r6 = r5.zzf     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0063
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdc.zzd(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r6.zza(r0)     // Catch:{ all -> 0x008c }
        L_0x0063:
            monitor-exit(r5)
            return r1
        L_0x0065:
            boolean r0 = r5.zze()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r5)
            return r1
        L_0x006d:
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r1 = r6.zzf     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfcx.zza(r0, r1)     // Catch:{ all -> 0x008c }
            r5.zzh = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzezo r0 = r5.zzc     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.zzd     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzezh r2 = new com.google.android.gms.internal.ads.zzezh     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.internal.client.zzq r3 = r5.zza     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzemo r3 = new com.google.android.gms.internal.ads.zzemo     // Catch:{ all -> 0x008c }
            r3.<init>(r5)     // Catch:{ all -> 0x008c }
            boolean r6 = r0.zzb(r6, r1, r2, r3)     // Catch:{ all -> 0x008c }
            monitor-exit(r5)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemp.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    public final void zzab(zzcd zzcd) {
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final zzq zzg() {
        return null;
    }

    public final zzbf zzi() {
        return this.zzf.zzc();
    }

    public final zzbz zzj() {
        return this.zzf.zzd();
    }

    public final synchronized zzdh zzk() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return null;
        }
        zzdjz zzdjz = this.zzh;
        if (zzdjz == null) {
            return null;
        }
        return zzdjz.zzl();
    }

    public final zzdk zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    public final synchronized String zzr() {
        return this.zzd;
    }

    public final synchronized String zzs() {
        zzdjz zzdjz = this.zzh;
        if (zzdjz == null || zzdjz.zzl() == null) {
            return null;
        }
        return zzdjz.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzdjz zzdjz = this.zzh;
        if (zzdjz == null || zzdjz.zzl() == null) {
            return null;
        }
        return zzdjz.zzl().zzg();
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdjz zzdjz = this.zzh;
        if (zzdjz != null) {
            zzdjz.zzm().zza((Context) null);
        }
    }

    public final void zzy(zzl zzl, zzbi zzbi) {
        this.zzf.zzf(zzbi);
        zzaa(zzl);
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdjz zzdjz = this.zzh;
        if (zzdjz != null) {
            zzdjz.zzm().zzb((Context) null);
        }
    }
}
