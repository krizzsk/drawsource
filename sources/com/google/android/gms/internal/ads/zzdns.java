package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdns {
    public static final zzdns zza = new zzdns(new zzdnq());
    private final zzbmc zzb;
    private final zzblz zzc;
    private final zzbmp zzd;
    private final zzbmm zze;
    private final zzbrb zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdns(zzdnq zzdnq) {
        this.zzb = zzdnq.zza;
        this.zzc = zzdnq.zzb;
        this.zzd = zzdnq.zzc;
        this.zzg = new SimpleArrayMap(zzdnq.zzf);
        this.zzh = new SimpleArrayMap(zzdnq.zzg);
        this.zze = zzdnq.zzd;
        this.zzf = zzdnq.zze;
    }

    public final zzblz zza() {
        return this.zzc;
    }

    public final zzbmc zzb() {
        return this.zzb;
    }

    public final zzbmf zzc(String str) {
        return (zzbmf) this.zzh.get(str);
    }

    public final zzbmi zzd(String str) {
        return (zzbmi) this.zzg.get(str);
    }

    public final zzbmm zze() {
        return this.zze;
    }

    public final zzbmp zzf() {
        return this.zzd;
    }

    public final zzbrb zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
