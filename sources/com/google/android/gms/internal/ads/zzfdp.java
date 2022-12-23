package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfdp implements zzfdo {
    private final ConcurrentHashMap zza;
    private final zzfdv zzb;
    private final zzfdr zzc = new zzfdr();

    public zzfdp(zzfdv zzfdv) {
        this.zza = new ConcurrentHashMap(zzfdv.zzd);
        this.zzb = zzfdv;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdv> creator = zzfdv.CREATOR;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfp)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfdy) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdn) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfdn) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdn) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zze.zze(sb.toString());
        }
    }

    public final zzfdv zza() {
        return this.zzb;
    }

    public final synchronized zzfdx zzb(zzfdy zzfdy) {
        zzfdx zzfdx;
        zzfdn zzfdn = (zzfdn) this.zza.get(zzfdy);
        if (zzfdn != null) {
            zzfdx = zzfdn.zze();
            if (zzfdx == null) {
                this.zzc.zze();
            }
            zzfel zzf = zzfdn.zzf();
            if (zzfdx != null) {
                zzbeb zza2 = zzbeh.zza();
                zzbdz zza3 = zzbea.zza();
                zza3.zzd(2);
                zzbed zza4 = zzbee.zza();
                zza4.zza(zzf.zza);
                zza4.zzb(zzf.zzb);
                zza3.zza(zza4);
                zza2.zza(zza3);
                zzfdx.zza.zzb().zzc().zze((zzbeh) zza2.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdx = null;
        }
        return zzfdx;
    }

    @Deprecated
    public final zzfdy zzc(zzl zzl, String str, zzw zzw) {
        return new zzfdz(zzl, str, new zzbzz(this.zzb.zza).zza().zzk, this.zzb.zzf, zzw);
    }

    public final synchronized boolean zzd(zzfdy zzfdy, zzfdx zzfdx) {
        boolean zzh;
        zzfdn zzfdn = (zzfdn) this.zza.get(zzfdy);
        zzfdx.zzd = zzt.zzA().currentTimeMillis();
        if (zzfdn == null) {
            zzfdv zzfdv = this.zzb;
            zzfdn = new zzfdn(zzfdv.zzd, zzfdv.zze * 1000);
            int size = this.zza.size();
            zzfdv zzfdv2 = this.zzb;
            if (size == zzfdv2.zzc) {
                int i = zzfdv2.zzg;
                int i2 = i - 1;
                zzfdy zzfdy2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdn) entry.getValue()).zzc() < j) {
                                j = ((zzfdn) entry.getValue()).zzc();
                                zzfdy2 = (zzfdy) entry.getKey();
                            }
                        }
                        if (zzfdy2 != null) {
                            this.zza.remove(zzfdy2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdn) entry2.getValue()).zzd() < j) {
                                j = ((zzfdn) entry2.getValue()).zzd();
                                zzfdy2 = (zzfdy) entry2.getKey();
                            }
                        }
                        if (zzfdy2 != null) {
                            this.zza.remove(zzfdy2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdn) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfdn) entry3.getValue()).zza();
                                zzfdy2 = (zzfdy) entry3.getKey();
                            }
                        }
                        if (zzfdy2 != null) {
                            this.zza.remove(zzfdy2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfdy, zzfdn);
            this.zzc.zzd();
        }
        zzh = zzfdn.zzh(zzfdx);
        this.zzc.zzc();
        zzfdq zza2 = this.zzc.zza();
        zzfel zzf = zzfdn.zzf();
        if (zzfdx != null) {
            zzbeb zza3 = zzbeh.zza();
            zzbdz zza4 = zzbea.zza();
            zza4.zzd(2);
            zzbef zza5 = zzbeg.zza();
            zza5.zza(zza2.zza);
            zza5.zzb(zza2.zzb);
            zza5.zzc(zzf.zzb);
            zza4.zzc(zza5);
            zza3.zza(zza4);
            zzfdx.zza.zzb().zzc().zzf((zzbeh) zza3.zzal());
        }
        zzf();
        return zzh;
    }

    public final synchronized boolean zze(zzfdy zzfdy) {
        zzfdn zzfdn = (zzfdn) this.zza.get(zzfdy);
        if (zzfdn == null) {
            return true;
        }
        if (zzfdn.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
