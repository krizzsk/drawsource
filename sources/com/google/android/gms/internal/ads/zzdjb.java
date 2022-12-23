package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdjb extends zzdhc implements zzban {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfbl zzd;

    public zzdjb(Context context, Set set, zzfbl zzfbl) {
        super(set);
        this.zzc = context;
        this.zzd = zzfbl;
    }

    public final synchronized void zza(View view) {
        zzbao zzbao = (zzbao) this.zzb.get(view);
        if (zzbao == null) {
            zzbao = new zzbao(this.zzc, view);
            zzbao.zzc(this);
            this.zzb.put(view, zzbao);
        }
        if (this.zzd.zzY) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzbh)).booleanValue()) {
                zzbao.zzg(((Long) zzay.zzc().zzb(zzbhz.zzbg)).longValue());
                return;
            }
        }
        zzbao.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzbao) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzc(zzbam zzbam) {
        zzo(new zzdja(zzbam));
    }
}
