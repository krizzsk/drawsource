package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzats implements Comparator<zzatr>, Parcelable {
    public static final Parcelable.Creator<zzats> CREATOR = new zzatp();
    public final int zza;
    private final zzatr[] zzb;
    private int zzc;

    zzats(Parcel parcel) {
        zzatr[] zzatrArr = (zzatr[]) parcel.createTypedArray(zzatr.CREATOR);
        this.zzb = zzatrArr;
        this.zza = zzatrArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzatr zzatr = (zzatr) obj;
        zzatr zzatr2 = (zzatr) obj2;
        if (zzare.zzb.equals(zzatr.zze)) {
            return !zzare.zzb.equals(zzatr2.zze) ? 1 : 0;
        }
        return zzatr.zze.compareTo(zzatr2.zze);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzats) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb);
        this.zzc = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzatr zza(int i) {
        return this.zzb[i];
    }

    public zzats(List list) {
        this(false, (zzatr[]) list.toArray(new zzatr[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.zzatr[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzats(boolean r3, com.google.android.gms.internal.ads.zzatr... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzatr[] r4 = (com.google.android.gms.internal.ads.zzatr[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0044
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.zze
            r1 = r4[r3]
            java.util.UUID r1 = r1.zze
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.zze
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Duplicate data for uuid: "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            throw r0
        L_0x0044:
            r2.zzb = r4
            r2.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzats.<init>(boolean, com.google.android.gms.internal.ads.zzatr[]):void");
    }

    public zzats(zzatr... zzatrArr) {
        this(true, zzatrArr);
    }
}
