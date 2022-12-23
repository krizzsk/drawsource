package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzekk implements zzefd {
    private final Context zza;
    private final zzcws zzb;
    private final zzbiu zzc;
    private final zzfvm zzd;
    private final zzfgf zze;

    public zzekk(Context context, zzcws zzcws, zzfgf zzfgf, zzfvm zzfvm, zzbiu zzbiu) {
        this.zza = context;
        this.zzb = zzcws;
        this.zze = zzfgf;
        this.zzd = zzfvm;
        this.zzc = zzbiu;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        zzcvw zza2 = this.zzb.zza(new zzcym(zzfbx, zzfbl, (String) null), new zzeki(this, new View(this.zza), (zzcli) null, zzekg.zza, (zzfbm) zzfbl.zzv.get(0)));
        zzekj zzk = zza2.zzk();
        zzfbq zzfbq = zzfbl.zzt;
        zzbip zzbip = new zzbip(zzk, zzfbq.zzb, zzfbq.zza);
        zzfgf zzfgf = this.zze;
        return zzffp.zzd(new zzekh(this, zzbip), this.zzd, zzffz.CUSTOM_RENDER_SYN, zzfgf).zzb(zzffz.CUSTOM_RENDER_ACK).zzd(zzfvc.zzi(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfbx r1, com.google.android.gms.internal.ads.zzfbl r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbiu r1 = r0.zzc
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfbq r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekk.zzb(com.google.android.gms.internal.ads.zzfbx, com.google.android.gms.internal.ads.zzfbl):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbip zzbip) throws Exception {
        this.zzc.zze(zzbip);
    }
}
