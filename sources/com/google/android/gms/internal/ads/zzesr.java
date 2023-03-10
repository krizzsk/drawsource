package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzesr implements zzetg {
    private final zzcdn zza;
    private final zzfvm zzb;
    private final Context zzc;

    public zzesr(zzcdn zzcdn, zzfvm zzfvm, Context context) {
        this.zza = zzcdn;
        this.zzb = zzfvm;
        this.zzc = context;
    }

    public final int zza() {
        return 34;
    }

    public final zzfvl zzb() {
        return this.zzb.zzb(new zzesq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzess zzc() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.zza.zzu(this.zzc)) {
            return new zzess((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zze = this.zza.zze(this.zzc);
        String str4 = zze == null ? "" : zze;
        String zzc2 = this.zza.zzc(this.zzc);
        if (zzc2 == null) {
            str = "";
        } else {
            str = zzc2;
        }
        String zza2 = this.zza.zza(this.zzc);
        if (zza2 == null) {
            str2 = "";
        } else {
            str2 = zza2;
        }
        String zzb2 = this.zza.zzb(this.zzc);
        if (zzb2 == null) {
            str3 = "";
        } else {
            str3 = zzb2;
        }
        return new zzess(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzay.zzc().zzb(zzbhz.zzad) : null);
    }
}
