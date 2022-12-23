package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzfrm implements Map, Serializable {
    @CheckForNull
    private transient zzfro zza;
    @CheckForNull
    private transient zzfro zzb;
    @CheckForNull
    private transient zzfre zzc;

    zzfrm() {
    }

    public static zzfrm zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfrl zzfrl = new zzfrl(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfrl.zzb(entrySet);
        return zzfrl.zzc();
    }

    public static zzfrm zzd() {
        return zzfsx.zza;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        return zzfse.zzb(this, obj);
    }

    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzfte.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfro zzfro = this.zzb;
        if (zzfro != null) {
            return zzfro;
        }
        zzfro zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }

    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfqi.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzfre zza();

    /* renamed from: zzb */
    public final zzfre values() {
        zzfre zzfre = this.zzc;
        if (zzfre != null) {
            return zzfre;
        }
        zzfre zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzfro zze();

    /* access modifiers changed from: package-private */
    public abstract zzfro zzf();

    /* renamed from: zzg */
    public final zzfro entrySet() {
        zzfro zzfro = this.zza;
        if (zzfro != null) {
            return zzfro;
        }
        zzfro zze = zze();
        this.zza = zze;
        return zze;
    }
}
