package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzawt {
    private final zzatw[] zza;
    private final zzatx zzb;
    private zzatw zzc;

    public zzawt(zzatw[] zzatwArr, zzatx zzatx) {
        this.zza = zzatwArr;
        this.zzb = zzatx;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzatw zzb(zzatv zzatv, Uri uri) throws IOException, InterruptedException {
        zzatw zzatw = this.zzc;
        if (zzatw != null) {
            return zzatw;
        }
        zzatw[] zzatwArr = this.zza;
        int length = zzatwArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzatw zzatw2 = zzatwArr[i];
            try {
                if (zzatw2.zzg(zzatv)) {
                    this.zzc = zzatw2;
                    zzatv.zze();
                    break;
                }
                zzatv.zze();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzatv.zze();
                throw th;
            }
        }
        zzatw zzatw3 = this.zzc;
        if (zzatw3 != null) {
            zzatw3.zzd(this.zzb);
            return this.zzc;
        }
        String zzk = zzazo.zzk(this.zza);
        throw new zzaxr("None of the available extractors (" + zzk + ") could read the stream.", uri);
    }
}
