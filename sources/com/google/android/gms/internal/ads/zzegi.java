package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzegi implements zzefl {
    private final Context zza;
    private final zzcws zzb;
    private final Executor zzc;

    public zzegi(Context context, zzcws zzcws, Executor executor) {
        this.zza = context;
        this.zzb = zzcws;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfbx r7, com.google.android.gms.internal.ads.zzfbl r8, com.google.android.gms.internal.ads.zzefg r9) throws com.google.android.gms.internal.ads.zzfci, com.google.android.gms.internal.ads.zzeit {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzgB
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzai
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfcy r0 = (com.google.android.gms.internal.ads.zzfcy) r0
            com.google.android.gms.internal.ads.zzbuj r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfvl r0 = com.google.android.gms.internal.ads.zzfvc.zzi(r1)
            com.google.android.gms.internal.ads.zzegh r3 = new com.google.android.gms.internal.ads.zzegh
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzfvm r2 = com.google.android.gms.internal.ads.zzcfv.zze
            com.google.android.gms.internal.ads.zzfvl r0 = com.google.android.gms.internal.ads.zzfvc.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfci r8 = new com.google.android.gms.internal.ads.zzfci
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfci r7 = new com.google.android.gms.internal.ads.zzfci
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfci r8 = new com.google.android.gms.internal.ads.zzfci
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r7)
            com.google.android.gms.internal.ads.zzfci r8 = new com.google.android.gms.internal.ads.zzfci
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfcy r0 = (com.google.android.gms.internal.ads.zzfcy) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcws r0 = r6.zzb
            com.google.android.gms.internal.ads.zzcym r3 = new com.google.android.gms.internal.ads.zzcym
            java.lang.String r4 = r9.zza
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.zzcwc r7 = new com.google.android.gms.internal.ads.zzcwc
            java.lang.Object r4 = r9.zzb
            com.google.android.gms.internal.ads.zzfcy r4 = (com.google.android.gms.internal.ads.zzfcy) r4
            com.google.android.gms.internal.ads.zzegg r5 = new com.google.android.gms.internal.ads.zzegg
            r5.<init>(r4)
            java.util.List r8 = r8.zzv
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzfbm r8 = (com.google.android.gms.internal.ads.zzfbm) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.zzcvw r7 = r0.zza(r3, r7)
            com.google.android.gms.internal.ads.zzdjb r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzdcs r8 = r7.zzd()
            com.google.android.gms.internal.ads.zzctj r0 = new com.google.android.gms.internal.ads.zzctj
            java.lang.Object r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfcy r1 = (com.google.android.gms.internal.ads.zzfcy) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.zzc
            r8.zzj(r0, r1)
            com.google.android.gms.internal.ads.zzddd r8 = r9.zzc
            com.google.android.gms.internal.ads.zzegz r8 = (com.google.android.gms.internal.ads.zzegz) r8
            com.google.android.gms.internal.ads.zzekf r9 = r7.zzi()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcvv r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegi.zza(com.google.android.gms.internal.ads.zzfbx, com.google.android.gms.internal.ads.zzfbl, com.google.android.gms.internal.ads.zzefg):java.lang.Object");
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        zzq zza2;
        zzq zzq = zzfbx.zza.zza.zze;
        if (zzq.zzn) {
            zza2 = new zzq(this.zza, zzb.zzd(zzq.zze, zzq.zzb));
        } else {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl.zzai) {
                zza2 = zzfch.zza(this.zza, zzfbl.zzv);
            } else {
                zza2 = new zzq(this.zza, zzb.zze(zzq.zze, zzq.zzb));
            }
        }
        zzq zzq2 = zza2;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl.zzai) {
            ((zzfcy) zzefg.zzb).zzl(this.zza, zzq2, zzfbx.zza.zza.zzd, zzfbl.zzw.toString(), zzbu.zzl(zzfbl.zzt), (zzbug) zzefg.zzc);
        } else {
            ((zzfcy) zzefg.zzb).zzm(this.zza, zzq2, zzfbx.zza.zza.zzd, zzfbl.zzw.toString(), zzbu.zzl(zzfbl.zzt), (zzbug) zzefg.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(View view, zzfbl zzfbl, Object obj) throws Exception {
        return zzfvc.zzi(zzcxj.zza(this.zza, view, zzfbl));
    }
}
