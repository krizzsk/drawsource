package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdpt implements Callable {
    public final /* synthetic */ zzdpu zza;
    public final /* synthetic */ zzfvl zzb;
    public final /* synthetic */ zzfvl zzc;
    public final /* synthetic */ zzfvl zzd;
    public final /* synthetic */ zzfvl zze;
    public final /* synthetic */ zzfvl zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ zzfvl zzh;
    public final /* synthetic */ zzfvl zzi;
    public final /* synthetic */ zzfvl zzj;
    public final /* synthetic */ zzfvl zzk;

    public /* synthetic */ zzdpt(zzdpu zzdpu, zzfvl zzfvl, zzfvl zzfvl2, zzfvl zzfvl3, zzfvl zzfvl4, zzfvl zzfvl5, JSONObject jSONObject, zzfvl zzfvl6, zzfvl zzfvl7, zzfvl zzfvl8, zzfvl zzfvl9) {
        this.zza = zzdpu;
        this.zzb = zzfvl;
        this.zzc = zzfvl2;
        this.zzd = zzfvl3;
        this.zze = zzfvl4;
        this.zzf = zzfvl5;
        this.zzg = jSONObject;
        this.zzh = zzfvl6;
        this.zzi = zzfvl7;
        this.zzj = zzfvl8;
        this.zzk = zzfvl9;
    }

    public final Object call() {
        zzfvl zzfvl = this.zzb;
        zzfvl zzfvl2 = this.zzc;
        zzfvl zzfvl3 = this.zzd;
        zzfvl zzfvl4 = this.zze;
        zzfvl zzfvl5 = this.zzf;
        JSONObject jSONObject = this.zzg;
        zzfvl zzfvl6 = this.zzh;
        zzfvl zzfvl7 = this.zzi;
        zzfvl zzfvl8 = this.zzj;
        zzfvl zzfvl9 = this.zzk;
        zzdnh zzdnh = (zzdnh) zzfvl.get();
        zzdnh.zzN((List) zzfvl2.get());
        zzdnh.zzK((zzblb) zzfvl3.get());
        zzdnh.zzO((zzblb) zzfvl4.get());
        zzdnh.zzH((zzbkt) zzfvl5.get());
        zzdnh.zzQ(zzdqh.zzj(jSONObject));
        zzdnh.zzJ(zzdqh.zzi(jSONObject));
        zzcli zzcli = (zzcli) zzfvl6.get();
        if (zzcli != null) {
            zzdnh.zzY(zzcli);
            zzdnh.zzX(zzcli.zzH());
            zzdnh.zzW(zzcli.zzs());
        }
        zzcli zzcli2 = (zzcli) zzfvl7.get();
        if (zzcli2 != null) {
            zzdnh.zzM(zzcli2);
            zzdnh.zzZ(zzcli2.zzH());
        }
        zzcli zzcli3 = (zzcli) zzfvl8.get();
        if (zzcli3 != null) {
            zzdnh.zzR(zzcli3);
        }
        for (zzdql zzdql : (List) zzfvl9.get()) {
            if (zzdql.zza != 1) {
                zzdnh.zzL(zzdql.zzb, zzdql.zzd);
            } else {
                zzdnh.zzU(zzdql.zzb, zzdql.zzc);
            }
        }
        return zzdnh;
    }
}
