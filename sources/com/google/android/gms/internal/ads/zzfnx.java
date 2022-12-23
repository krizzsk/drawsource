package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfnx implements OnCompleteListener {
    public final /* synthetic */ zzfny zza;

    public /* synthetic */ zzfnx(zzfny zzfny) {
        this.zza = zzfny;
    }

    public final void onComplete(Task task) {
        zzfny zzfny = this.zza;
        if (task.isCanceled()) {
            zzfny.cancel(false);
        } else if (task.isSuccessful()) {
            zzfny.zzd(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfny.zze(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
