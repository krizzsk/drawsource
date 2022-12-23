package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxc {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private zzfwz zzb;
    private final Class zzc;

    private zzfxc(Class cls) {
        this.zzc = cls;
    }

    public static zzfxc zzc(Class cls) {
        return new zzfxc(cls);
    }

    public final zzfwz zza(Object obj, zzgfv zzgfv) throws GeneralSecurityException {
        byte[] bArr;
        if (zzgfv.zzi() == 3) {
            int zzj = zzgfv.zzj() - 2;
            if (zzj != 1) {
                if (zzj != 2) {
                    if (zzj == 3) {
                        bArr = zzfwk.zza;
                    } else if (zzj != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgfv.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgfv.zza()).array();
            }
            zzfwz zzfwz = new zzfwz(obj, bArr, zzgfv.zzi(), zzgfv.zzj(), zzgfv.zza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzfwz);
            zzfxb zzfxb = new zzfxb(zzfwz.zzb(), (zzfxa) null);
            List list = (List) this.zza.put(zzfxb, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzfwz);
                this.zza.put(zzfxb, Collections.unmodifiableList(arrayList2));
            }
            return zzfwz;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final zzfwz zzb() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfxb(bArr, (zzfxa) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final void zzf(zzfwz zzfwz) {
        if (zzfwz.zzc() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!zze(zzfwz.zzb()).isEmpty()) {
            this.zzb = zzfwz;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
