package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcrp extends zzcl {
    private final Context zza;
    private final zzcfo zzb;
    private final zzduc zzc;
    private final zzeff zzd;
    private final zzele zze;
    private final zzdyj zzf;
    private final zzcdn zzg;
    private final zzduh zzh;
    private final zzdzb zzi;
    private final zzbki zzj;
    private final zzfhu zzk;
    private final zzfcw zzl;
    private boolean zzm = false;

    zzcrp(Context context, zzcfo zzcfo, zzduc zzduc, zzeff zzeff, zzele zzele, zzdyj zzdyj, zzcdn zzcdn, zzduh zzduh, zzdzb zzdzb, zzbki zzbki, zzfhu zzfhu, zzfcw zzfcw) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzduc;
        this.zzd = zzeff;
        this.zze = zzele;
        this.zzf = zzdyj;
        this.zzg = zzcdn;
        this.zzh = zzduh;
        this.zzi = zzdzb;
        this.zzj = zzbki;
        this.zzk = zzfhu;
        this.zzl = zzfcw;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (zzt.zzo().zzh().zzO()) {
            if (!zzt.zzs().zzj(this.zza, zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                zzt.zzo().zzh().zzB(false);
                zzt.zzo().zzh().zzA("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze2 = zzt.zzo().zzh().zzh().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zze.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbtv zzbtv : zze2.values()) {
                    for (zzbtu zzbtu : zzbtv.zza) {
                        String str = zzbtu.zzk;
                        for (String str2 : zzbtu.zzc) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzefg zza2 = this.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzfcy zzfcy = (zzfcy) zza2.zzb;
                            if (!zzfcy.zzA() && zzfcy.zzz()) {
                                zzfcy.zzj(this.zza, (zzeha) zza2.zzc, (List) entry.getValue());
                                zze.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfci e) {
                        zze.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfdf.zzb(this.zza, true);
    }

    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    public final String zzf() {
        return this.zzb.zza;
    }

    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final synchronized void zzj() {
        if (this.zzm) {
            zze.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbhz.zzc(this.zza);
        zzt.zzo().zzr(this.zza, this.zzb);
        zzt.zzc().zzi(this.zza);
        this.zzm = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdb)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzf();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzcfv.zza.execute(new zzcrl(this));
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzio)).booleanValue()) {
            zzcfv.zza.execute(new zzcrk(this));
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
            zzcfv.zza.execute(new zzcrm(this));
        }
    }

    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzcrn zzcrn;
        zzbhz.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdd)).booleanValue()) {
            zzt.zzp();
            str2 = zzs.zzo(this.zza);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhz.zzda)).booleanValue() | ((Boolean) zzay.zzc().zzb(zzbhz.zzaK)).booleanValue();
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzaK)).booleanValue()) {
                zzcrn = new zzcrn(this, (Runnable) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcrn = null;
                z = booleanValue;
            }
            zzcrn zzcrn2 = zzcrn;
            if (z) {
                zzt.zza().zza(this.zza, this.zzb, str3, zzcrn2, this.zzk);
            }
        }
    }

    public final void zzl(zzcy zzcy) throws RemoteException {
        this.zzi.zzg(zzcy, zzdza.API);
    }

    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zze.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zze.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzas = new zzas(context);
        zzas.zzn(str);
        zzas.zzo(this.zzb.zza);
        zzas.zzr();
    }

    public final void zzn(zzbua zzbua) throws RemoteException {
        this.zzl.zze(zzbua);
    }

    public final synchronized void zzo(boolean z) {
        zzt.zzr().zzc(z);
    }

    public final synchronized void zzp(float f) {
        zzt.zzr().zzd(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzq(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbhz.zzc(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzda     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.ads.internal.zze r1 = com.google.android.gms.ads.internal.zzt.zza()     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzcfo r3 = r7.zzb     // Catch:{ all -> 0x0031 }
            r5 = 0
            com.google.android.gms.internal.ads.zzfhu r6 = r7.zzk     // Catch:{ all -> 0x0031 }
            r4 = r8
            r1.zza(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcrp.zzq(java.lang.String):void");
    }

    public final void zzr(zzbqn zzbqn) throws RemoteException {
        this.zzf.zzs(zzbqn);
    }

    public final void zzs(zzez zzez) throws RemoteException {
        this.zzg.zzq(this.zza, zzez);
    }

    public final synchronized boolean zzt() {
        return zzt.zzr().zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzu() {
        this.zzj.zza(new zzbzd());
    }
}
