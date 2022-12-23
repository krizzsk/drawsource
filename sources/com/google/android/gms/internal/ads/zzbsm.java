package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbsm {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final zzcfo zzd;
    /* access modifiers changed from: private */
    public final zzfhu zze;
    private final zzbb zzf;
    private final zzbb zzg;
    /* access modifiers changed from: private */
    public zzbsl zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzbsm(Context context, zzcfo zzcfo, String str, zzbb zzbb, zzbb zzbb2, zzfhu zzfhu) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcfo;
        this.zze = zzfhu;
        this.zzf = zzbb;
        this.zzg = zzbb2;
    }

    public final zzbsg zzb(zzaoc zzaoc) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbsl zzbsl = this.zzh;
                if (zzbsl != null && this.zzi == 0) {
                    zzbsl.zzi(new zzbrr(this), zzbrs.zza);
                }
            }
            zzbsl zzbsl2 = this.zzh;
            if (zzbsl2 != null) {
                if (zzbsl2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        zzbsg zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i == 1) {
                        this.zzi = 2;
                        zzd((zzaoc) null);
                        zzbsg zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zzbsg zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            zzbsl zzd2 = zzd((zzaoc) null);
            this.zzh = zzd2;
            zzbsg zza5 = zzd2.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzbsl zzd(zzaoc zzaoc) {
        zzfhh zza2 = zzfhg.zza(this.zzb, 6);
        zza2.zzf();
        zzbsl zzbsl = new zzbsl(this.zzg);
        zzcfv.zze.execute(new zzbrt(this, (zzaoc) null, zzbsl));
        zzbsl.zzi(new zzbsb(this, zzbsl, zza2), new zzbsc(this, zzbsl, zza2));
        return zzbsl;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbsl r4, com.google.android.gms.internal.ads.zzbrh r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.zzg()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzfvm r4 = com.google.android.gms.internal.ads.zzcfv.zze     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzbrw r1 = new com.google.android.gms.internal.ads.zzbrw     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsm.zzi(com.google.android.gms.internal.ads.zzbsl, com.google.android.gms.internal.ads.zzbrh):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzaoc zzaoc, zzbsl zzbsl) {
        try {
            zzbrp zzbrp = new zzbrp(this.zzb, this.zzd, (zzaoc) null, (zza) null);
            zzbrp.zzk(new zzbrv(this, zzbsl, zzbrp));
            zzbrp.zzq("/jsLoaded", new zzbrx(this, zzbsl, zzbrp));
            zzca zzca = new zzca();
            zzbry zzbry = new zzbry(this, (zzaoc) null, zzbrp, zzca);
            zzca.zzb(zzbry);
            zzbrp.zzq("/requestReload", zzbry);
            if (this.zzc.endsWith(".js")) {
                zzbrp.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbrp.zzf(this.zzc);
            } else {
                zzbrp.zzg(this.zzc);
            }
            zzs.zza.postDelayed(new zzbsa(this, zzbsl, zzbrp), 60000);
        } catch (Throwable th) {
            zze.zzh("Error creating webview.", th);
            zzt.zzo().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbsl.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbrh zzbrh) {
        if (zzbrh.zzi()) {
            this.zzi = 1;
        }
    }
}
