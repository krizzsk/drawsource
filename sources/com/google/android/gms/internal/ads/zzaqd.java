package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqd extends zzaqn {
    private List zzi = null;

    public zzaqd(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "EQnlrBUlHjk2AEt0zmKDh6D/4LKq1nD5m8E6B+NGkhfc83YRi+bdMQpWJDofZ7UC", "vT7QqRHPYW89dMOJkMQAS7XgxAAvbeOb6ybNiPRYWg8=", zzali, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzV(-1);
        this.zze.zzR(-1);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzV(((Long) this.zzi.get(0)).longValue());
                this.zze.zzR(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
