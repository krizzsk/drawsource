package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfii {
    private final Context zza;
    private final Executor zzb;
    private final zzcfn zzc;
    private final zzfhu zzd;

    zzfii(Context context, Executor executor, zzcfn zzcfn, zzfhu zzfhu) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfn;
        this.zzd = zzfhu;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfhs zzfhs) {
        zzfhh zza2 = zzfhg.zza(this.zza, 14);
        zza2.zzf();
        zza2.zze(this.zzc.zza(str));
        if (zzfhs == null) {
            this.zzd.zzb(zza2.zzj());
            return;
        }
        zzfhs.zza(zza2);
        zzfhs.zzg();
    }

    public final void zzc(String str, zzfhs zzfhs) {
        if (!zzfhu.zza() || !((Boolean) zzbji.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzfig(this, str));
        } else {
            this.zzb.execute(new zzfih(this, str, zzfhs));
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), (zzfhs) null);
        }
    }
}
