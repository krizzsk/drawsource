package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c */
public final class C4835c extends C4846h {
    public static final Parcelable.Creator<C4835c> CREATOR = new C4836a();

    /* renamed from: b */
    public final String f12843b;

    /* renamed from: c */
    public final int f12844c;

    /* renamed from: d */
    public final int f12845d;

    /* renamed from: e */
    public final long f12846e;

    /* renamed from: f */
    public final long f12847f;

    /* renamed from: g */
    public final C4846h[] f12848g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c$a */
    public class C4836a implements Parcelable.Creator<C4835c> {
        public Object createFromParcel(Parcel parcel) {
            return new C4835c(parcel);
        }

        public Object[] newArray(int i) {
            return new C4835c[i];
        }
    }

    public C4835c(String str, int i, int i2, long j, long j2, C4846h[] hVarArr) {
        super("CHAP");
        this.f12843b = str;
        this.f12844c = i;
        this.f12845d = i2;
        this.f12846e = j;
        this.f12847f = j2;
        this.f12848g = hVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4835c.class != obj.getClass()) {
            return false;
        }
        C4835c cVar = (C4835c) obj;
        if (this.f12844c == cVar.f12844c && this.f12845d == cVar.f12845d && this.f12846e == cVar.f12846e && this.f12847f == cVar.f12847f && C4991u.m15140a((Object) this.f12843b, (Object) cVar.f12843b) && Arrays.equals(this.f12848g, cVar.f12848g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f12844c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f12845d) * 31) + ((int) this.f12846e)) * 31) + ((int) this.f12847f)) * 31;
        String str = this.f12843b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12843b);
        parcel.writeInt(this.f12844c);
        parcel.writeInt(this.f12845d);
        parcel.writeLong(this.f12846e);
        parcel.writeLong(this.f12847f);
        parcel.writeInt(this.f12848g.length);
        for (C4846h writeParcelable : this.f12848g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4835c(Parcel parcel) {
        super("CHAP");
        this.f12843b = parcel.readString();
        this.f12844c = parcel.readInt();
        this.f12845d = parcel.readInt();
        this.f12846e = parcel.readLong();
        this.f12847f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12848g = new C4846h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12848g[i] = (C4846h) parcel.readParcelable(C4846h.class.getClassLoader());
        }
    }
}
