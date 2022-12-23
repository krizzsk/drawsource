package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgkq;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgkq<MessageType extends zzgkq<MessageType, BuilderType>, BuilderType extends zzgkm<MessageType, BuilderType>> extends zzgir<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgnl zzc = zzgnl.zzc();
    protected int zzd = -1;

    private static zzgkq zza(zzgkq zzgkq) throws zzglc {
        if (zzgkq == null || zzgkq.zzaR()) {
            return zzgkq;
        }
        zzglc zza = new zzgnj(zzgkq).zza();
        zza.zzh(zzgkq);
        throw zza;
    }

    static zzgkq zzaA(Class cls) {
        zzgkq zzgkq = (zzgkq) zzb.get(cls);
        if (zzgkq == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgkq = (zzgkq) zzb.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgkq == null) {
            zzgkq = (zzgkq) ((zzgkq) zzgnu.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgkq != null) {
                zzb.put(cls, zzgkq);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgkq;
    }

    protected static zzgkq zzaB(zzgkq zzgkq, zzgji zzgji) throws zzglc {
        zzgkc zza = zzgkc.zza();
        zzgjq zzl = zzgji.zzl();
        zzgkq zzgkq2 = (zzgkq) zzgkq.zzb(4, (Object) null, (Object) null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkq2.getClass());
            zzb2.zzh(zzgkq2, zzgjr.zzq(zzl), zza);
            zzb2.zzf(zzgkq2);
            try {
                zzl.zzz(0);
                zza(zzgkq2);
                zza(zzgkq2);
                return zzgkq2;
            } catch (zzglc e) {
                e.zzh(zzgkq2);
                throw e;
            }
        } catch (zzglc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzglc((IOException) e);
            }
            e.zzh(zzgkq2);
            throw e;
        } catch (zzgnj e3) {
            zzglc zza2 = e3.zza();
            zza2.zzh(zzgkq2);
            throw zza2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            zzglc zzglc = new zzglc(e4);
            zzglc.zzh(zzgkq2);
            throw zzglc;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzglc) {
                throw ((zzglc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgkq zzaC(zzgkq zzgkq, byte[] bArr) throws zzglc {
        zzgkq zzc2 = zzc(zzgkq, bArr, 0, bArr.length, zzgkc.zza());
        zza(zzc2);
        return zzc2;
    }

    protected static zzgkq zzaD(zzgkq zzgkq, zzgji zzgji, zzgkc zzgkc) throws zzglc {
        zzgjq zzl = zzgji.zzl();
        zzgkq zzgkq2 = (zzgkq) zzgkq.zzb(4, (Object) null, (Object) null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkq2.getClass());
            zzb2.zzh(zzgkq2, zzgjr.zzq(zzl), zzgkc);
            zzb2.zzf(zzgkq2);
            try {
                zzl.zzz(0);
                zza(zzgkq2);
                return zzgkq2;
            } catch (zzglc e) {
                e.zzh(zzgkq2);
                throw e;
            }
        } catch (zzglc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzglc((IOException) e);
            }
            e.zzh(zzgkq2);
            throw e;
        } catch (zzgnj e3) {
            zzglc zza = e3.zza();
            zza.zzh(zzgkq2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            zzglc zzglc = new zzglc(e4);
            zzglc.zzh(zzgkq2);
            throw zzglc;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzglc) {
                throw ((zzglc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgkq zzaE(zzgkq zzgkq, InputStream inputStream, zzgkc zzgkc) throws zzglc {
        zzgjq zzH = zzgjq.zzH(inputStream, 4096);
        zzgkq zzgkq2 = (zzgkq) zzgkq.zzb(4, (Object) null, (Object) null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkq2.getClass());
            zzb2.zzh(zzgkq2, zzgjr.zzq(zzH), zzgkc);
            zzb2.zzf(zzgkq2);
            zza(zzgkq2);
            return zzgkq2;
        } catch (zzglc e) {
            e = e;
            if (e.zzl()) {
                e = new zzglc((IOException) e);
            }
            e.zzh(zzgkq2);
            throw e;
        } catch (zzgnj e2) {
            zzglc zza = e2.zza();
            zza.zzh(zzgkq2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzglc) {
                throw ((zzglc) e3.getCause());
            }
            zzglc zzglc = new zzglc(e3);
            zzglc.zzh(zzgkq2);
            throw zzglc;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgkq zzaF(zzgkq zzgkq, byte[] bArr, zzgkc zzgkc) throws zzglc {
        zzgkq zzc2 = zzc(zzgkq, bArr, 0, bArr.length, zzgkc);
        zza(zzc2);
        return zzc2;
    }

    protected static zzgkv zzaG() {
        return zzgkr.zzf();
    }

    protected static zzgkv zzaH(zzgkv zzgkv) {
        int size = zzgkv.size();
        return zzgkv.zzg(size == 0 ? 10 : size + size);
    }

    protected static zzgky zzaI() {
        return zzglp.zzf();
    }

    protected static zzgkz zzaJ() {
        return zzgmj.zze();
    }

    protected static zzgkz zzaK(zzgkz zzgkz) {
        int size = zzgkz.size();
        return zzgkz.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaN(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzaO(zzgma zzgma, String str, Object[] objArr) {
        return new zzgmk(zzgma, str, objArr);
    }

    protected static void zzaP(Class cls, zzgkq zzgkq) {
        zzb.put(cls, zzgkq);
    }

    private static zzgkq zzc(zzgkq zzgkq, byte[] bArr, int i, int i2, zzgkc zzgkc) throws zzglc {
        zzgkq zzgkq2 = (zzgkq) zzgkq.zzb(4, (Object) null, (Object) null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkq2.getClass());
            zzb2.zzi(zzgkq2, bArr, 0, i2, new zzgiu(zzgkc));
            zzb2.zzf(zzgkq2);
            if (zzgkq2.zza == 0) {
                return zzgkq2;
            }
            throw new RuntimeException();
        } catch (zzglc e) {
            e = e;
            if (e.zzl()) {
                e = new zzglc((IOException) e);
            }
            e.zzh(zzgkq2);
            throw e;
        } catch (zzgnj e2) {
            zzglc zza = e2.zza();
            zza.zzh(zzgkq2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzglc) {
                throw ((zzglc) e3.getCause());
            }
            zzglc zzglc = new zzglc(e3);
            zzglc.zzh(zzgkq2);
            throw zzglc;
        } catch (IndexOutOfBoundsException unused) {
            zzglc zzj = zzglc.zzj();
            zzj.zzh(zzgkq2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgmi.zza().zzb(getClass()).zzj(this, (zzgkq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgmi.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgmc.zza(this, super.toString());
    }

    public final /* synthetic */ zzglz zzaL() {
        return (zzgkm) zzb(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzglz zzaM() {
        zzgkm zzgkm = (zzgkm) zzb(5, (Object) null, (Object) null);
        zzgkm.zzaj(this);
        return zzgkm;
    }

    public final void zzaQ(zzgjx zzgjx) throws IOException {
        zzgmi.zza().zzb(getClass()).zzn(this, zzgjy.zza(zzgjx));
    }

    public final boolean zzaR() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgmi.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        zzb(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final int zzar() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzau(int i) {
        this.zzd = i;
    }

    public final int zzax() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzgmi.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    /* access modifiers changed from: protected */
    public final zzgkm zzay() {
        return (zzgkm) zzb(5, (Object) null, (Object) null);
    }

    public final zzgkm zzaz() {
        zzgkm zzgkm = (zzgkm) zzb(5, (Object) null, (Object) null);
        zzgkm.zzaj(this);
        return zzgkm;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i, Object obj, Object obj2);

    public final /* synthetic */ zzgma zzbh() {
        return (zzgkq) zzb(6, (Object) null, (Object) null);
    }
}
