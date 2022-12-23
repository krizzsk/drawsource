package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzekd implements zzefd {
    private final zzeff zza;
    private final zzefl zzb;
    private final zzfgf zzc;
    private final zzfvm zzd;

    public zzekd(zzfgf zzfgf, zzfvm zzfvm, zzeff zzeff, zzefl zzefl) {
        this.zzc = zzfgf;
        this.zzd = zzfvm;
        this.zzb = zzefl;
        this.zza = zzeff;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        zzefg zzefg;
        Iterator it = zzfbl.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefg = null;
                break;
            }
            try {
                zzefg = this.zza.zza((String) it.next(), zzfbl.zzw);
                break;
            } catch (zzfci unused) {
            }
        }
        if (zzefg == null) {
            return zzfvc.zzh(new zzeif("Unable to instantiate mediation adapter class."));
        }
        zzcga zzcga = new zzcga();
        zzefg.zzc.zza(new zzekc(this, zzefg, zzcga));
        if (zzfbl.zzN) {
            Bundle bundle = zzfbx.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgf zzfgf = this.zzc;
        return zzffp.zzd(new zzeka(this, zzfbx, zzfbl, zzefg), this.zzd, zzffz.ADAPTER_LOAD_AD_SYN, zzfgf).zzb(zzffz.ADAPTER_LOAD_AD_ACK).zzd(zzcga).zzb(zzffz.ADAPTER_WRAP_ADAPTER).zze(new zzekb(this, zzfbx, zzfbl, zzefg)).zza();
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        return !zzfbl.zzu.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg, Void voidR) throws Exception {
        return this.zzb.zza(zzfbx, zzfbl, zzefg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws Exception {
        this.zzb.zzb(zzfbx, zzfbl, zzefg);
    }
}
