package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfme> CREATOR = new zzfmf();
    public final int zza;
    private zzaly zzb = null;
    private byte[] zzc;

    zzfme(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaw();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaly zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaly.zze(this.zzc, zzgkc.zza());
                this.zzc = null;
            } catch (zzglc | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzaly zzaly = this.zzb;
        if (zzaly == null && this.zzc != null) {
            return;
        }
        if (zzaly != null && this.zzc == null) {
            return;
        }
        if (zzaly != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzaly == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
