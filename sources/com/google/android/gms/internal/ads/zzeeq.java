package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeeq implements zzffi {
    public final /* synthetic */ zzees zza;
    public final /* synthetic */ zzcfn zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeeq(zzees zzees, zzcfn zzcfn, String str) {
        this.zza = zzees;
        this.zzb = zzcfn;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
