package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqb extends zzaqn {
    public zzaqb(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", zzali, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhz.zzci)).booleanValue();
        zzaoj zzaoj = new zzaoj((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(booleanValue)}));
        synchronized (this.zze) {
            this.zze.zzi(zzaoj.zza);
            this.zze.zzB(zzaoj.zzb);
        }
    }
}
