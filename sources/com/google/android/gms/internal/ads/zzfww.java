package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfww {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwv zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwv zzfwv = (zzfwv) it.next();
            if (zzfwv.zza()) {
                return zzfwv;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
