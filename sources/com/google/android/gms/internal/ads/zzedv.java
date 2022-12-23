package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzedv implements zzffi {
    public final /* synthetic */ zzedw zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzedv(zzedw zzedw, long j) {
        this.zza = zzedw;
        this.zzb = j;
    }

    public final Object zza(Object obj) {
        zzedw zzedw = this.zza;
        long j = this.zzb;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzedw.zzf()) {
            return null;
        }
        zzbfu zzg = zzbfv.zzg();
        zzg.zzh(j);
        byte[] zzaw = ((zzbfv) zzg.zzal()).zzaw();
        zzeed.zzg(sQLiteDatabase, false, false);
        zzeed.zzd(sQLiteDatabase, j, zzaw);
        return null;
    }
}
