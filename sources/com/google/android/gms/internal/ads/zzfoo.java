package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzfoo {
    private final String zza;
    private final zzfon zzb;
    private zzfon zzc;

    /* synthetic */ zzfoo(String str, zzfom zzfom) {
        zzfon zzfon = new zzfon((zzfom) null);
        this.zzb = zzfon;
        this.zzc = zzfon;
        if (str != null) {
            this.zza = str;
            return;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfon zzfon = this.zzb.zzb;
        String str = "";
        while (zzfon != null) {
            Object obj = zzfon.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfon = zzfon.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfoo zza(@CheckForNull Object obj) {
        zzfon zzfon = new zzfon((zzfom) null);
        this.zzc.zzb = zzfon;
        this.zzc = zzfon;
        zzfon.zza = obj;
        return this;
    }
}
