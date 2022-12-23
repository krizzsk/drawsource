package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzawx implements zzaxb, zzaxa {
    private final Uri zza;
    private final zzayi zzb;
    private final zzaty zzc;
    private final int zzd;
    private final Handler zze;
    private final zzaww zzf;
    private final zzasc zzg = new zzasc();
    private final int zzh;
    private zzaxa zzi;
    private zzase zzj;
    private boolean zzk;

    public zzawx(Uri uri, zzayi zzayi, zzaty zzaty, int i, Handler handler, zzaww zzaww, String str, int i2) {
        this.zza = uri;
        this.zzb = zzayi;
        this.zzc = zzaty;
        this.zzd = i;
        this.zze = handler;
        this.zzf = zzaww;
        this.zzh = i2;
    }

    public final void zza() throws IOException {
    }

    public final void zzb(zzarj zzarj, boolean z, zzaxa zzaxa) {
        this.zzi = zzaxa;
        zzaxo zzaxo = new zzaxo(-9223372036854775807L, false);
        this.zzj = zzaxo;
        zzaxa.zzg(zzaxo, (Object) null);
    }

    public final void zzc(zzawz zzawz) {
        ((zzawv) zzawz).zzx();
    }

    public final void zzd() {
        this.zzi = null;
    }

    public final zzawz zze(int i, zzaym zzaym) {
        zzayz.zzc(i == 0);
        return new zzawv(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzaym, (String) null, this.zzh, (byte[]) null);
    }

    public final void zzg(zzase zzase, Object obj) {
        zzasc zzasc = this.zzg;
        boolean z = false;
        zzase.zzd(0, zzasc, false);
        if (zzasc.zzc != -9223372036854775807L) {
            z = true;
        }
        if (!this.zzk || z) {
            this.zzj = zzase;
            this.zzk = z;
            this.zzi.zzg(zzase, (Object) null);
        }
    }
}
