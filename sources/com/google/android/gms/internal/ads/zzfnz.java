package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfnz {
    public static zzfvl zza(Task task) {
        zzfny zzfny = new zzfny(task);
        task.addOnCompleteListener(zzfvs.zzb(), new zzfnx(zzfny));
        return zzfny;
    }
}
