package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzfkh extends AsyncTask {
    private zzfki zza;
    protected final zzfjz zzd;

    public zzfkh(zzfjz zzfjz, byte[] bArr) {
        this.zzd = zzfjz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfki zzfki = this.zza;
        if (zzfki != null) {
            zzfki.zza(this);
        }
    }

    public final void zzb(zzfki zzfki) {
        this.zza = zzfki;
    }
}
