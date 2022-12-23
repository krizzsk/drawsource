package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbso implements zzbrf, zzbsn {
    private final zzbsn zza;
    private final HashSet zzb = new HashSet();

    public zzbso(zzbsn zzbsn) {
        this.zza = zzbsn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbre.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbom) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbom) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbre.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbre.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbre.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbom zzbom) {
        this.zza.zzq(str, zzbom);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbom));
    }

    public final void zzr(String str, zzbom zzbom) {
        this.zza.zzr(str, zzbom);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbom));
    }
}
