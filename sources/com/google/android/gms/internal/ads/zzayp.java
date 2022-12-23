package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzayp extends IOException {
    public final zzayl zza;

    public zzayp(IOException iOException, zzayl zzayl, int i) {
        super(iOException);
        this.zza = zzayl;
    }

    public zzayp(String str, zzayl zzayl, int i) {
        super(str);
        this.zza = zzayl;
    }

    public zzayp(String str, IOException iOException, zzayl zzayl, int i) {
        super(str, iOException);
        this.zza = zzayl;
    }
}
