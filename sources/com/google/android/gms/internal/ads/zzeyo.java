package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeyo {
    public static void zza(AtomicReference atomicReference, zzeyn zzeyn) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzeyn.zza(obj);
            } catch (RemoteException e) {
                zze.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zze.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
