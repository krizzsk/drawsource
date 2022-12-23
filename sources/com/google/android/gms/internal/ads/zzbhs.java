package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbhs {
    private final Collection zza = new ArrayList();
    private final Collection zzb = new ArrayList();
    private final Collection zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbhr zzb2 : this.zzb) {
            String str = (String) zzay.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbia.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbhr zzb2 : this.zzc) {
            String str = (String) zzay.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbia.zzb());
        return zza2;
    }

    public final void zzc(zzbhr zzbhr) {
        this.zzb.add(zzbhr);
    }

    public final void zzd(zzbhr zzbhr) {
        this.zza.add(zzbhr);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbhr zzbhr : this.zza) {
            if (zzbhr.zze() == 1) {
                zzbhr.zzd(editor, zzbhr.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcfi.zzg("Flag Json is null.");
        }
    }
}
