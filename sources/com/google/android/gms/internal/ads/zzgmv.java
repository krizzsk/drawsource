package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmv {
    private static final Class zza;
    private static final zzgnk zzb = zzab(false);
    private static final zzgnk zzc = zzab(true);
    private static final zzgnk zzd = new zzgnm();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgnk zzA() {
        return zzc;
    }

    public static zzgnk zzB() {
        return zzd;
    }

    static Object zzC(int i, List list, zzgku zzgku, Object obj, zzgnk zzgnk) {
        if (zzgku == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgku.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgnk);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgku.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgnk);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzgnk zzgnk) {
        if (obj == null) {
            obj = zzgnk.zzf();
        }
        zzgnk.zzl(obj, i, (long) i2);
        return obj;
    }

    static void zzE(zzgkd zzgkd, Object obj, Object obj2) {
        zzgkd.zza(obj2);
        throw null;
    }

    static void zzF(zzgnk zzgnk, Object obj, Object obj2) {
        zzgnk.zzo(obj, zzgnk.zze(zzgnk.zzd(obj), zzgnk.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgkq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzglv zzglv, Object obj, Object obj2, long j) {
        zzgnu.zzv(obj, j, zzglv.zzc(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzgjy zzgjy) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzgjy zzgjy, zzgmt zzgmt) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjy.zzq(i, list.get(i2), zzgmt);
            }
        }
    }

    public static void zzR(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzgjy zzgjy, zzgmt zzgmt) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjy.zzv(i, list.get(i2), zzgmt);
            }
        }
    }

    public static void zzU(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzgjy zzgjy) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzI(i, list, z);
        }
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgjy zzgjy, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjy.zzK(i, list, z);
        }
    }

    private static zzgnk zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgnk) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgjx.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgjx.zzw((zzgji) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgjx.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkr = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(zzgkr.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjx.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzgmt zzgmt) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgjx.zzx(i, (zzgma) list.get(i3), zzgmt);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgjx.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkr = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(zzgkr.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjx.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgjx.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglp = (zzglp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(zzglp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjx.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzgmt zzgmt) {
        if (!(obj instanceof zzglg)) {
            return zzgjx.zzE(i << 3) + zzgjx.zzA((zzgma) obj, zzgmt);
        }
        int zzE = zzgjx.zzE(i << 3);
        int zza2 = ((zzglg) obj).zza();
        return zzE + zzgjx.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzgmt zzgmt) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzglg) {
                i2 = zzgjx.zzz((zzglg) obj);
            } else {
                i2 = zzgjx.zzA((zzgma) obj, zzgmt);
            }
            zzD += i2;
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgjx.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkr = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgkr.zze(i2);
                i += zzgjx.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgjx.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgjx.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglp = (zzglp) list;
            i = 0;
            while (i2 < size) {
                long zze = zzglp.zze(i2);
                i += zzgjx.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgjx.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i) * size;
        if (list instanceof zzgli) {
            zzgli zzgli = (zzgli) list;
            while (i4 < size) {
                Object zzf = zzgli.zzf(i4);
                if (zzf instanceof zzgji) {
                    i3 = zzgjx.zzw((zzgji) zzf);
                } else {
                    i3 = zzgjx.zzC((String) zzf);
                }
                zzD += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgji) {
                    i2 = zzgjx.zzw((zzgji) obj);
                } else {
                    i2 = zzgjx.zzC((String) obj);
                }
                zzD += i2;
                i4++;
            }
        }
        return zzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgjx.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkr = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzE(zzgkr.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjx.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgjx.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglp = (zzglp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(zzglp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjx.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgnk zzz() {
        return zzb;
    }
}
