package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfkt implements Continuation {
    public final /* synthetic */ zzaku zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfkt(zzaku zzaku, int i) {
        this.zza = zzaku;
        this.zzb = i;
    }

    public final Object then(Task task) {
        zzaku zzaku = this.zza;
        int i = this.zzb;
        int i2 = zzfku.zza;
        if (!task.isSuccessful()) {
            return false;
        }
        zzfmv zza2 = ((zzfmw) task.getResult()).zza(((zzaky) zzaku.zzal()).zzaw());
        zza2.zza(i);
        zza2.zzc();
        return true;
    }
}
