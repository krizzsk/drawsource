package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbm extends zzaqw implements zzbo {
    zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbl zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbl
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbl r1 = (com.google.android.gms.ads.internal.client.zzbl) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.zzbj r2 = new com.google.android.gms.ads.internal.client.zzbj
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbm.zze():com.google.android.gms.ads.internal.client.zzbl");
    }

    public final void zzf(zzblz zzblz) throws RemoteException {
        throw null;
    }

    public final void zzg(zzbmc zzbmc) throws RemoteException {
        throw null;
    }

    public final void zzh(String str, zzbmi zzbmi, zzbmf zzbmf) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqy.zzg(zza, zzbmi);
        zzaqy.zzg(zza, zzbmf);
        zzbl(5, zza);
    }

    public final void zzi(zzbrb zzbrb) throws RemoteException {
        throw null;
    }

    public final void zzj(zzbmm zzbmm, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmm);
        zzaqy.zze(zza, zzq);
        zzbl(8, zza);
    }

    public final void zzk(zzbmp zzbmp) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmp);
        zzbl(10, zza);
    }

    public final void zzl(zzbf zzbf) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbf);
        zzbl(2, zza);
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    public final void zzn(zzbqs zzbqs) throws RemoteException {
        throw null;
    }

    public final void zzo(zzbkp zzbkp) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbkp);
        zzbl(6, zza);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    public final void zzq(zzcd zzcd) throws RemoteException {
        throw null;
    }
}
