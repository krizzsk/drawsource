package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdyw {
    private final zzdyj zza;
    private final zzdtz zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzdyw(zzdyj zzdyj, zzdtz zzdtz) {
        this.zza = zzdyj;
        this.zzb = zzdtz;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqg zzbqg = (zzbqg) it.next();
                    List list2 = this.zzd;
                    String str = zzbqg.zza;
                    String zzc2 = this.zzb.zzc(str);
                    boolean z = zzbqg.zzb;
                    list2.add(new zzdyv(str, zzc2, z ? 1 : 0, zzbqg.zzd, zzbqg.zzc));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdyv zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdyu(this));
    }
}
