package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a */
public final class C4828a implements Parcelable {
    public static final Parcelable.Creator<C4828a> CREATOR = new C4829a();

    /* renamed from: a */
    public final C4830b[] f12837a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$a */
    public class C4829a implements Parcelable.Creator<C4828a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4828a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4828a[0];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$b */
    public interface C4830b extends Parcelable {
    }

    public C4828a(List<? extends C4830b> list) {
        C4830b[] bVarArr = new C4830b[list.size()];
        this.f12837a = bVarArr;
        list.toArray(bVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4828a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12837a, ((C4828a) obj).f12837a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12837a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12837a.length);
        for (C4830b writeParcelable : this.f12837a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4828a(Parcel parcel) {
        this.f12837a = new C4830b[parcel.readInt()];
        int i = 0;
        while (true) {
            C4830b[] bVarArr = this.f12837a;
            if (i < bVarArr.length) {
                bVarArr[i] = (C4830b) parcel.readParcelable(C4830b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
