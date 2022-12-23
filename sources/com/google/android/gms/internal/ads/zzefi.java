package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzefi {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private zzfbo zzc = null;
    private zzfbl zzd = null;
    private zzu zze = null;

    private final void zzh(zzfbl zzfbl, long j, zze zze2, boolean z) {
        String str = zzfbl.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zzd == null) {
                this.zzd = zzfbl;
            }
            zzu zzu = (zzu) this.zzb.get(str);
            zzu.zzb = j;
            zzu.zzc = zze2;
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzfM)).booleanValue() && z) {
                this.zze = zzu;
            }
        }
    }

    public final zzu zza() {
        return this.zze;
    }

    public final zzdbm zzb() {
        return new zzdbm(this.zzd, "", this, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbl zzfbl) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfbl.zzx;
        if (!this.zzb.containsKey(str5)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfbl.zzw.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfbl.zzw.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzfL)).booleanValue()) {
                String str6 = zzfbl.zzG;
                String str7 = zzfbl.zzH;
                str4 = str6;
                str3 = str7;
                str2 = zzfbl.zzI;
                str = zzfbl.zzJ;
            } else {
                str4 = "";
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            zzu zzu = new zzu(zzfbl.zzF, 0, (zze) null, bundle, str4, str3, str2, str);
            this.zza.add(zzu);
            this.zzb.put(str5, zzu);
        }
    }

    public final void zze(zzfbl zzfbl, long j, zze zze2) {
        zzh(zzfbl, j, zze2, false);
    }

    public final void zzf(zzfbl zzfbl, long j, zze zze2) {
        zzh(zzfbl, j, (zze) null, true);
    }

    public final void zzg(zzfbo zzfbo) {
        this.zzc = zzfbo;
    }
}
