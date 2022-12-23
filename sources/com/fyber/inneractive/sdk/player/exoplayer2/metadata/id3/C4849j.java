package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j */
public final class C4849j extends C4846h {
    public static final Parcelable.Creator<C4849j> CREATOR = new C4850a();

    /* renamed from: b */
    public final String f12869b;

    /* renamed from: c */
    public final String f12870c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j$a */
    public class C4850a implements Parcelable.Creator<C4849j> {
        public Object createFromParcel(Parcel parcel) {
            return new C4849j(parcel);
        }

        public Object[] newArray(int i) {
            return new C4849j[i];
        }
    }

    public C4849j(String str, String str2, String str3) {
        super(str);
        this.f12869b = str2;
        this.f12870c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4849j.class != obj.getClass()) {
            return false;
        }
        C4849j jVar = (C4849j) obj;
        if (!this.f12866a.equals(jVar.f12866a) || !C4991u.m15140a((Object) this.f12869b, (Object) jVar.f12869b) || !C4991u.m15140a((Object) this.f12870c, (Object) jVar.f12870c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f12866a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f12869b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12870c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12866a);
        parcel.writeString(this.f12869b);
        parcel.writeString(this.f12870c);
    }

    public C4849j(Parcel parcel) {
        super(parcel.readString());
        this.f12869b = parcel.readString();
        this.f12870c = parcel.readString();
    }
}
