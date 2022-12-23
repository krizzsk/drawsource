package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeci implements zzfuj {
    public final /* synthetic */ zzeco zza;

    public /* synthetic */ zzeci(zzeco zzeco) {
        this.zza = zzeco;
    }

    public final zzfvl zza(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzcfv.zza.execute(new zzfdb((InputStream) obj, createPipe[1]));
        return zzfvc.zzi(parcelFileDescriptor);
    }
}
