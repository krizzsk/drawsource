package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeem implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcfn zzc;

    public /* synthetic */ zzeem(SQLiteDatabase sQLiteDatabase, String str, zzcfn zzcfn) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzcfn;
    }

    public final void run() {
        zzees.zzf(this.zza, this.zzb, this.zzc);
    }
}
