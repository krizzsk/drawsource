package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeep implements zzffi {
    public final /* synthetic */ zzees zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzeep(zzees zzees, String str) {
        this.zza = zzees;
        this.zzb = str;
    }

    public final Object zza(Object obj) {
        zzees.zzi((SQLiteDatabase) obj, this.zzb);
        return null;
    }
}
