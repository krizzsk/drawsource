package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxk implements zzddh, zzdcn {
    private final Context zza;
    private final zzcli zzb;
    private final zzfbl zzc;
    private final zzcfo zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzcxk(Context context, zzcli zzcli, zzfbl zzfbl, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzcli;
        this.zzc = zzfbl;
        this.zzd = zzcfo;
    }

    private final synchronized void zza() {
        zzbxq zzbxq;
        zzbxr zzbxr;
        if (this.zzc.zzU) {
            if (this.zzb != null) {
                if (zzt.zzh().zze(this.zza)) {
                    zzcfo zzcfo = this.zzd;
                    String str = zzcfo.zzb + "." + zzcfo.zzc;
                    String zza2 = this.zzc.zzW.zza();
                    if (this.zzc.zzW.zzb() == 1) {
                        zzbxq = zzbxq.zzc;
                        zzbxr = zzbxr.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzbxq = zzbxq.HTML_DISPLAY;
                        if (this.zzc.zzf == 1) {
                            zzbxr = zzbxr.ONE_PIXEL;
                        } else {
                            zzbxr = zzbxr.BEGIN_TO_RENDER;
                        }
                    }
                    IObjectWrapper zza3 = zzt.zzh().zza(str, this.zzb.zzI(), "", "javascript", zza2, zzbxr, zzbxq, this.zzc.zzan);
                    this.zze = zza3;
                    zzcli zzcli = this.zzb;
                    if (zza3 != null) {
                        zzt.zzh().zzc(this.zze, (View) zzcli);
                        this.zzb.zzar(this.zze);
                        zzt.zzh().zzd(this.zze);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.zza()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.zzfbl r0 = r3.zzc     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.zzU     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.dynamic.IObjectWrapper r0 = r3.zze     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzcli r0 = r3.zzb     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxk.zzl():void");
    }

    public final synchronized void zzn() {
        if (!this.zzf) {
            zza();
        }
    }
}
