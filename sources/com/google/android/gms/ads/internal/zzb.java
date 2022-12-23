package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzccj;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzccj zzc;
    private final zzbzj zzd = new zzbzj(false, Collections.emptyList());

    public zzb(Context context, zzccj zzccj, zzbzj zzbzj) {
        this.zza = context;
        this.zzc = zzccj;
    }

    private final boolean zzd() {
        zzccj zzccj = this.zzc;
        return (zzccj != null && zzccj.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzccj zzccj = this.zzc;
            if (zzccj != null) {
                zzccj.zzd(str, (Map) null, 3);
                return;
            }
            zzbzj zzbzj = this.zzd;
            if (zzbzj.zza && (list = zzbzj.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzt.zzp();
                        zzs.zzG(this.zza, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
