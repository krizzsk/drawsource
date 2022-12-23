package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfmw {
    final zzfmz zza;
    final boolean zzb;

    private zzfmw(zzfmz zzfmz) {
        this.zza = zzfmz;
        this.zzb = zzfmz != null;
    }

    public static zzfmw zzb(Context context, String str, String str2) {
        zzfmz zzfmz;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (instantiate == null) {
                zzfmz = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfmz = queryLocalInterface instanceof zzfmz ? (zzfmz) queryLocalInterface : new zzfmx(instantiate);
            }
            try {
                zzfmz.zze(ObjectWrapper.wrap(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfmw(zzfmz);
            } catch (RemoteException | zzfly | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfmw(new zzfna());
            }
        } catch (Exception e) {
            throw new zzfly(e);
        } catch (Exception e2) {
            throw new zzfly(e2);
        }
    }

    public static zzfmw zzc() {
        zzfna zzfna = new zzfna();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfmw(zzfna);
    }

    public final zzfmv zza(byte[] bArr) {
        return new zzfmv(this, bArr, (zzfmu) null);
    }
}
