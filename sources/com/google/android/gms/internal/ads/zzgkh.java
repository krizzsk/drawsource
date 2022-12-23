package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgkh {
    private static final zzgkh zzb = new zzgkh(true);
    final zzgng zza = new zzgmw(16);
    private boolean zzc;
    private boolean zzd;

    private zzgkh() {
    }

    public static zzgkh zza() {
        throw null;
    }

    private static final void zzd(zzgkg zzgkg, Object obj) {
        boolean z;
        zzgoa zzb2 = zzgkg.zzb();
        zzgla.zze(obj);
        zzgoa zzgoa = zzgoa.DOUBLE;
        zzgob zzgob = zzgob.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgji) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgks)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgma) || (obj instanceof zzglf)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgkg.zza()), zzgkg.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgkh zzgkh = new zzgkh();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgkh.zzc((zzgkg) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgkh.zzc((zzgkg) entry.getKey(), entry.getValue());
        }
        zzgkh.zzd = this.zzd;
        return zzgkh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgkh)) {
            return false;
        }
        return this.zza.equals(((zzgkh) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgkg zzgkg, Object obj) {
        if (!zzgkg.zzc()) {
            zzd(zzgkg, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzgkg, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzglf) {
            this.zzd = true;
        }
        this.zza.put(zzgkg, obj);
    }

    private zzgkh(boolean z) {
        zzb();
        zzb();
    }
}
