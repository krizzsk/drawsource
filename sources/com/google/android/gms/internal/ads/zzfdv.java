package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdv> CREATOR = new zzfdw();
    @Nullable
    public final Context zza;
    public final zzfds zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfds[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfdv(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzh = zzfds.values();
        this.zzl = zzfdt.zza();
        int[] zza2 = zzfdu.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = this.zzh[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = this.zzl[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzfdv zza(zzfds zzfds, Context context) {
        if (zzfds == zzfds.Rewarded) {
            return new zzfdv(context, zzfds, ((Integer) zzay.zzc().zzb(zzbhz.zzfq)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfw)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfy)).intValue(), (String) zzay.zzc().zzb(zzbhz.zzfA), (String) zzay.zzc().zzb(zzbhz.zzfs), (String) zzay.zzc().zzb(zzbhz.zzfu));
        } else if (zzfds == zzfds.zzb) {
            return new zzfdv(context, zzfds, ((Integer) zzay.zzc().zzb(zzbhz.zzfr)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfx)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfz)).intValue(), (String) zzay.zzc().zzb(zzbhz.zzfB), (String) zzay.zzc().zzb(zzbhz.zzft), (String) zzay.zzc().zzb(zzbhz.zzfv));
        } else if (zzfds != zzfds.AppOpen) {
            return null;
        } else {
            return new zzfdv(context, zzfds, ((Integer) zzay.zzc().zzb(zzbhz.zzfE)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfG)).intValue(), ((Integer) zzay.zzc().zzb(zzbhz.zzfH)).intValue(), (String) zzay.zzc().zzb(zzbhz.zzfC), (String) zzay.zzc().zzb(zzbhz.zzfD), (String) zzay.zzc().zzb(zzbhz.zzfF));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdv(@Nullable Context context, zzfds zzfds, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfds.values();
        this.zzl = zzfdt.zza();
        this.zzm = zzfdu.zza();
        this.zza = context;
        this.zzi = zzfds.ordinal();
        this.zzb = zzfds;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
