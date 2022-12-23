package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzesg implements zzetg {
    final String zza;
    private final zzfvm zzb;
    private final ScheduledExecutorService zzc;
    private final zzele zzd;
    private final Context zze;
    private final zzfcd zzf;
    private final zzela zzg;
    private final zzduc zzh;

    public zzesg(zzfvm zzfvm, ScheduledExecutorService scheduledExecutorService, String str, zzele zzele, Context context, zzfcd zzfcd, zzela zzela, zzduc zzduc) {
        this.zzb = zzfvm;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzele;
        this.zze = context;
        this.zzf = zzfcd;
        this.zzg = zzela;
        this.zzh = zzduc;
    }

    public static /* synthetic */ zzfvl zzc(zzesg zzesg) {
        Map zza2 = zzesg.zzd.zza(zzesg.zza, ((Boolean) zzay.zzc().zzb(zzbhz.zzim)).booleanValue() ? zzesg.zzf.zzf.toLowerCase(Locale.ROOT) : zzesg.zzf.zzf);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfrm) zza2).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzesg.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzesg.zze(str, list, bundle, true, true));
        }
        for (Map.Entry value : ((zzfrm) zzesg.zzd.zzb()).entrySet()) {
            zzeli zzeli = (zzeli) value.getValue();
            String str2 = zzeli.zza;
            Bundle bundle3 = zzesg.zzf.zzd.zzm;
            arrayList.add(zzesg.zze(str2, Collections.singletonList(zzeli.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzeli.zzb, zzeli.zzc));
        }
        return zzfvc.zzc(arrayList).zza(new zzesd(arrayList), zzesg.zzb);
    }

    private final zzfut zze(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzfut zzv = zzfut.zzv(zzfvc.zzl(new zzese(this, str, list, bundle, z, z2), this.zzb));
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
            zzv = (zzfut) zzfvc.zzo(zzv, ((Long) zzay.zzc().zzb(zzbhz.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfut) zzfvc.zzf(zzv, Throwable.class, new zzesf(str), this.zzb);
    }

    public final int zza() {
        return 32;
    }

    public final zzfvl zzb() {
        return zzfvc.zzl(new zzesb(this), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbvt zzbvt;
        zzbvt zzb2;
        zzcga zzcga = new zzcga();
        if (z2) {
            this.zzg.zzb(str);
            zzb2 = this.zzg.zza(str);
        } else {
            try {
                zzb2 = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zze.zzh("Couldn't create RTB adapter : ", e);
                zzbvt = null;
            }
        }
        zzbvt = zzb2;
        if (zzbvt == null) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzbn)).booleanValue()) {
                zzelh.zzb(str, zzcga);
            } else {
                throw null;
            }
        } else {
            zzelh zzelh = new zzelh(str, zzbvt, zzcga);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
                this.zzc.schedule(new zzesc(zzelh), ((Long) zzay.zzc().zzb(zzbhz.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbvt.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelh);
            } else {
                zzelh.zzd();
            }
        }
        return zzcga;
    }
}
