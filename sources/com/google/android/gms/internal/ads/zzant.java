package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzant implements zzfmp {
    final /* synthetic */ zzfkp zza;

    zzant(zzanv zzanv, zzfkp zzfkp) {
        this.zza = zzfkp;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
