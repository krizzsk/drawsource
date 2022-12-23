package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzedy implements zzffi {
    public final /* synthetic */ zzedz zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbfq zzd;
    public final /* synthetic */ zzbfz zze;

    public /* synthetic */ zzedy(zzedz zzedz, boolean z, ArrayList arrayList, zzbfq zzbfq, zzbfz zzbfz) {
        this.zza = zzedz;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzbfq;
        this.zze = zzbfz;
    }

    public final Object zza(Object obj) {
        zzedz zzedz = this.zza;
        boolean z = this.zzb;
        ArrayList arrayList = this.zzc;
        zzbfq zzbfq = this.zzd;
        zzbfz zzbfz = this.zze;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzedz.zzb.zzf()) {
            return null;
        }
        byte[] zze2 = zzeea.zze(zzedz.zzb, z, arrayList, zzbfq, zzbfz);
        zzeed.zzg(sQLiteDatabase, z, true);
        zzeed.zzd(sQLiteDatabase, zzedz.zzb.zzf.zzd(), zze2);
        return null;
    }
}
