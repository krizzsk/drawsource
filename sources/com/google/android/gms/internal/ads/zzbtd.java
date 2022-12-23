package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbtd implements zzboz {
    final /* synthetic */ zzbte zza;
    private final zzbsg zzb;
    private final zzcga zzc;

    public zzbtd(zzbte zzbte, zzbsg zzbsg, zzcga zzcga) {
        this.zza = zzbte;
        this.zzb = zzbsg;
        this.zzc = zzcga;
    }

    public final void zza(String str) {
        zzbsg zzbsg;
        if (str == null) {
            try {
                this.zzc.zze(new zzbsp());
            } catch (IllegalStateException unused) {
                zzbsg = this.zzb;
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zze(new zzbsp(str));
        }
        zzbsg = this.zzb;
        zzbsg.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        zzbsg zzbsg;
        try {
            this.zzc.zzd(this.zza.zza.zza(jSONObject));
            zzbsg = this.zzb;
        } catch (IllegalStateException unused) {
            zzbsg = this.zzb;
        } catch (JSONException e) {
            this.zzc.zze(e);
            zzbsg = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbsg.zzb();
    }
}
