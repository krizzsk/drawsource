package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f */
public final class C4841f extends C4846h {
    public static final Parcelable.Creator<C4841f> CREATOR = new C4842a();

    /* renamed from: b */
    public final String f12857b;

    /* renamed from: c */
    public final String f12858c;

    /* renamed from: d */
    public final String f12859d;

    /* renamed from: e */
    public final byte[] f12860e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f$a */
    public class C4842a implements Parcelable.Creator<C4841f> {
        public Object createFromParcel(Parcel parcel) {
            return new C4841f(parcel);
        }

        public Object[] newArray(int i) {
            return new C4841f[i];
        }
    }

    public C4841f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12857b = str;
        this.f12858c = str2;
        this.f12859d = str3;
        this.f12860e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4841f.class != obj.getClass()) {
            return false;
        }
        C4841f fVar = (C4841f) obj;
        if (!C4991u.m15140a((Object) this.f12857b, (Object) fVar.f12857b) || !C4991u.m15140a((Object) this.f12858c, (Object) fVar.f12858c) || !C4991u.m15140a((Object) this.f12859d, (Object) fVar.f12859d) || !Arrays.equals(this.f12860e, fVar.f12860e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12857b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f12858c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12859d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f12860e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12857b);
        parcel.writeString(this.f12858c);
        parcel.writeString(this.f12859d);
        parcel.writeByteArray(this.f12860e);
    }

    public C4841f(Parcel parcel) {
        super("GEOB");
        this.f12857b = parcel.readString();
        this.f12858c = parcel.readString();
        this.f12859d = parcel.readString();
        this.f12860e = parcel.createByteArray();
    }
}
