package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbdm {
    private final zzbds zza;
    private final zzbfb zzb;
    private final boolean zzc;

    private zzbdm() {
        this.zzb = zzbfc.zzd();
        this.zzc = false;
        this.zza = new zzbds();
    }

    public static zzbdm zza() {
        return new zzbdm();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzk(), Long.valueOf(zzt.zzA().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbfc) this.zzb.zzal()).zzaw(), 3)});
    }

    private final synchronized void zze(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i) {
        zzbfb zzbfb = this.zzb;
        zzbfb.zzd();
        List<String> zzb2 = zzbhz.zzb();
        ArrayList arrayList = new ArrayList();
        for (String split : zzb2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbfb.zzc(arrayList);
        zzbdr zzbdr = new zzbdr(this.zza, ((zzbfc) this.zzb.zzal()).zzaw(), (zzbdq) null);
        int i2 = i - 1;
        zzbdr.zza(i2);
        zzbdr.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbdl zzbdl) {
        if (this.zzc) {
            try {
                zzbdl.zza(this.zzb);
            } catch (NullPointerException e) {
                zzt.zzo().zzt(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzdW)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbdm(zzbds zzbds) {
        this.zzb = zzbfc.zzd();
        this.zza = zzbds;
        this.zzc = ((Boolean) zzay.zzc().zzb(zzbhz.zzdV)).booleanValue();
    }
}
