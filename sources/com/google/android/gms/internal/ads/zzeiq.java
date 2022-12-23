package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeiq {
    /* access modifiers changed from: private */
    public final Clock zza;
    /* access modifiers changed from: private */
    public final zzeir zzb;
    /* access modifiers changed from: private */
    public final zzfii zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzefi zzf;

    public zzeiq(Clock clock, zzeir zzeir, zzefi zzefi, zzfii zzfii) {
        this.zza = clock;
        this.zzb = zzeir;
        this.zze = ((Boolean) zzay.zzc().zzb(zzbhz.zzfP)).booleanValue();
        this.zzf = zzefi;
        this.zzc = zzfii;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeiq zzeiq, String str, int i, long j, String str2) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        zzeiq.zzd.add(str3);
    }

    /* access modifiers changed from: package-private */
    public final zzfvl zze(zzfbx zzfbx, zzfbl zzfbl, zzfvl zzfvl, zzfie zzfie) {
        zzfbo zzfbo = zzfbx.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbl.zzx;
        if (str != null) {
            zzfvc.zzr(zzfvl, new zzeip(this, elapsedRealtime, str, zzfbl, zzfbo, zzfie, zzfbx), zzcfv.zzf);
        }
        return zzfvl;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
