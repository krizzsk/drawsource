package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzacf extends zzacb {
    public static final Parcelable.Creator<zzacf> CREATOR = new zzace();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzacf(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.f14273ID);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacf zzacf = (zzacf) obj;
            return this.zza == zzacf.zza && this.zzb == zzacf.zzb && this.zzc == zzacf.zzc && Arrays.equals(this.zzd, zzacf.zzd) && Arrays.equals(this.zze, zzacf.zze);
        }
    }

    public final int hashCode() {
        return ((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    zzacf(Parcel parcel) {
        super(MlltFrame.f14273ID);
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzeg.zzG(parcel.createIntArray());
        this.zze = (int[]) zzeg.zzG(parcel.createIntArray());
    }
}
