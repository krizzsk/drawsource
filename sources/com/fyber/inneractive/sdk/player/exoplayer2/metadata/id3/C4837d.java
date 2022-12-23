package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d */
public final class C4837d extends C4846h {
    public static final Parcelable.Creator<C4837d> CREATOR = new C4838a();

    /* renamed from: b */
    public final String f12849b;

    /* renamed from: c */
    public final boolean f12850c;

    /* renamed from: d */
    public final boolean f12851d;

    /* renamed from: e */
    public final String[] f12852e;

    /* renamed from: f */
    public final C4846h[] f12853f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d$a */
    public class C4838a implements Parcelable.Creator<C4837d> {
        public Object createFromParcel(Parcel parcel) {
            return new C4837d(parcel);
        }

        public Object[] newArray(int i) {
            return new C4837d[i];
        }
    }

    public C4837d(String str, boolean z, boolean z2, String[] strArr, C4846h[] hVarArr) {
        super("CTOC");
        this.f12849b = str;
        this.f12850c = z;
        this.f12851d = z2;
        this.f12852e = strArr;
        this.f12853f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4837d.class != obj.getClass()) {
            return false;
        }
        C4837d dVar = (C4837d) obj;
        if (this.f12850c != dVar.f12850c || this.f12851d != dVar.f12851d || !C4991u.m15140a((Object) this.f12849b, (Object) dVar.f12849b) || !Arrays.equals(this.f12852e, dVar.f12852e) || !Arrays.equals(this.f12853f, dVar.f12853f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((this.f12850c ? 1 : 0) + true) * 31) + (this.f12851d ? 1 : 0)) * 31;
        String str = this.f12849b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12849b);
        parcel.writeByte(this.f12850c ? (byte) 1 : 0);
        parcel.writeByte(this.f12851d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f12852e);
        parcel.writeInt(this.f12853f.length);
        int i2 = 0;
        while (true) {
            C4846h[] hVarArr = this.f12853f;
            if (i2 < hVarArr.length) {
                parcel.writeParcelable(hVarArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public C4837d(Parcel parcel) {
        super("CTOC");
        this.f12849b = parcel.readString();
        boolean z = true;
        this.f12850c = parcel.readByte() != 0;
        this.f12851d = parcel.readByte() == 0 ? false : z;
        this.f12852e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f12853f = new C4846h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12853f[i] = (C4846h) parcel.readParcelable(C4846h.class.getClassLoader());
        }
    }
}
