package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeea extends zzeeb {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzdaz zzd;
    private final TelephonyManager zze;
    /* access modifiers changed from: private */
    public final zzeds zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfz.CONNECTED);
        zzb.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbfz.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbfz.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbfz.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfz.DISCONNECTING);
        zzb.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbfz.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbfz.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbfz.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbfz.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbfz.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfz.SUSPENDED);
        zzb.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbfz.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbfz.CONNECTING);
    }

    zzeea(Context context, zzdaz zzdaz, zzeds zzeds, zzedo zzedo, zzg zzg2) {
        super(zzedo, zzg2);
        this.zzc = context;
        this.zzd = zzdaz;
        this.zzf = zzeds;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbfq zza(zzeea zzeea, Bundle bundle) {
        zzbfj zza = zzbfq.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzeea.zzg = 2;
        } else {
            zzeea.zzg = 1;
            if (i == 0) {
                zza.zzb(2);
            } else if (i != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza.zza(i3);
        }
        return (zzbfq) zza.zzal();
    }

    static /* bridge */ /* synthetic */ zzbfz zzb(zzeea zzeea, Bundle bundle) {
        return (zzbfz) zzb.get(zzfco.zza(zzfco.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbfz.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzeea zzeea, boolean z, ArrayList arrayList, zzbfq zzbfq, zzbfz zzbfz) {
        zzbfu zzg2 = zzbfv.zzg();
        zzg2.zza(arrayList);
        boolean z2 = false;
        zzg2.zzi(zzg(Settings.Global.getInt(zzeea.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg2.zzj(zzt.zzq().zzh(zzeea.zzc, zzeea.zze));
        zzg2.zzf(zzeea.zzf.zze());
        zzg2.zze(zzeea.zzf.zzb());
        zzg2.zzb(zzeea.zzf.zza());
        zzg2.zzc(zzbfz);
        zzg2.zzd(zzbfq);
        zzg2.zzk(zzeea.zzg);
        zzg2.zzl(zzg(z));
        zzg2.zzh(zzeea.zzf.zzd());
        zzg2.zzg(zzt.zzA().currentTimeMillis());
        if (Settings.Global.getInt(zzeea.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        zzg2.zzm(zzg(z2));
        return ((zzbfv) zzg2.zzal()).zzaw();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfvc.zzr(this.zzd.zzb(), new zzedz(this, z), zzcfv.zzf);
    }
}
