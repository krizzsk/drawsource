package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeek {
    private final zzbdm zza;
    private final Context zzb;
    private final zzedo zzc;
    private final zzcfo zzd;
    private final String zze;
    private final zzfgp zzf;
    private final zzg zzg = zzt.zzo().zzh();

    public zzeek(Context context, zzcfo zzcfo, zzbdm zzbdm, zzedo zzedo, String str, zzfgp zzfgp) {
        this.zzb = context;
        this.zzd = zzcfo;
        this.zza = zzbdm;
        this.zzc = zzedo;
        this.zze = str;
        this.zzf = zzfgp;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbfv zzbfv = (zzbfv) arrayList.get(i);
            if (zzbfv.zzw() == 2 && zzbfv.zze() > j) {
                j = zzbfv.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    public final void zzb(boolean z) {
        try {
            this.zzc.zza(new zzeeg(this, z));
        } catch (Exception e) {
            zze.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzb2 = zzfgo.zzb("oa_upload");
            zzb2.zza("oa_failed_reqs", String.valueOf(zzeed.zza(sQLiteDatabase, 0)));
            zzb2.zza("oa_total_reqs", String.valueOf(zzeed.zza(sQLiteDatabase, 1)));
            zzb2.zza("oa_upload_time", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzb2.zza("oa_last_successful_time", String.valueOf(zzeed.zzb(sQLiteDatabase, 2)));
            zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb2);
            ArrayList zzc2 = zzeed.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc2);
            int size = zzc2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbfv zzbfv = (zzbfv) zzc2.get(i2);
                zzfgo zzb3 = zzfgo.zzb("oa_signals");
                if (this.zzg.zzP()) {
                    str = "";
                } else {
                    str = this.zze;
                }
                zzb3.zza("oa_session_id", str);
                zzbfq zzf2 = zzbfv.zzf();
                String valueOf = zzf2.zzf() ? String.valueOf(zzf2.zzh() - 1) : "-1";
                String obj = zzfrx.zzb(zzbfv.zzk(), zzeej.zza).toString();
                zzb3.zza("oa_sig_ts", String.valueOf(zzbfv.zze()));
                zzb3.zza("oa_sig_status", String.valueOf(zzbfv.zzw() - 1));
                zzb3.zza("oa_sig_resp_lat", String.valueOf(zzbfv.zzd()));
                zzb3.zza("oa_sig_render_lat", String.valueOf(zzbfv.zzc()));
                zzb3.zza("oa_sig_formats", obj);
                zzb3.zza("oa_sig_nw_type", valueOf);
                zzb3.zza("oa_sig_wifi", String.valueOf(zzbfv.zzx() - 1));
                zzb3.zza("oa_sig_airplane", String.valueOf(zzbfv.zzt() - 1));
                zzb3.zza("oa_sig_data", String.valueOf(zzbfv.zzu() - 1));
                zzb3.zza("oa_sig_nw_resp", String.valueOf(zzbfv.zza()));
                zzb3.zza("oa_sig_offline", String.valueOf(zzbfv.zzv() - 1));
                zzb3.zza("oa_sig_nw_state", String.valueOf(zzbfv.zzj().zza()));
                if (zzf2.zze() && zzf2.zzf() && zzf2.zzh() == 2) {
                    zzb3.zza("oa_sig_cell_type", String.valueOf(zzf2.zzg() - 1));
                }
                this.zzf.zzb(zzb3);
            }
        } else {
            ArrayList zzc3 = zzeed.zzc(sQLiteDatabase);
            zzbfw zza2 = zzbga.zza();
            zza2.zzb(this.zzb.getPackageName());
            zza2.zzd(Build.MODEL);
            zza2.zze(zzeed.zza(sQLiteDatabase, 0));
            zza2.zza(zzc3);
            zza2.zzg(zzeed.zza(sQLiteDatabase, 1));
            zza2.zzc(zzeed.zza(sQLiteDatabase, 3));
            zza2.zzh(zzt.zzA().currentTimeMillis());
            zza2.zzf(zzeed.zzb(sQLiteDatabase, 2));
            zzc(sQLiteDatabase, zzc3);
            this.zza.zzb(new zzeeh((zzbga) zza2.zzal()));
            zzbgl zza3 = zzbgm.zza();
            zza3.zza(this.zzd.zzb);
            zza3.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i = 0;
            }
            zza3.zzb(i);
            this.zza.zzb(new zzeei((zzbgm) zza3.zzal()));
            this.zza.zzc(10004);
        }
        zzeed.zzf(sQLiteDatabase);
        return null;
    }
}
