package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfkl extends zzfkg {
    public zzfkl(zzfjz zzfjz, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjz, hashSet, jSONObject, j, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjt.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzfjc zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfjc.zza()) != null) {
            for (zzfir zzfir : zza.zzc()) {
                if (this.zza.contains(zzfir.zzh())) {
                    zzfir.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
