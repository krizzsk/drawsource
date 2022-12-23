package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzfj extends zzer {
    public final zzev zzb;
    public final int zzc;

    public zzfj(zzev zzev, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzev;
        this.zzc = 1;
    }

    public static zzfj zza(IOException iOException, zzev zzev, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfoc.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfi(iOException, zzev);
        }
        return new zzfj(iOException, zzev, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfj(IOException iOException, zzev zzev, int i, int i2) {
        super((Throwable) iOException, zzb(i, i2));
        this.zzb = zzev;
        this.zzc = i2;
    }

    public zzfj(String str, zzev zzev, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzev;
        this.zzc = i2;
    }

    public zzfj(String str, IOException iOException, zzev zzev, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzev;
        this.zzc = i2;
    }
}
