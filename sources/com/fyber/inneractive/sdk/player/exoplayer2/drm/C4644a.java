package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a */
public final class C4644a implements Comparator<C4646b>, Parcelable {
    public static final Parcelable.Creator<C4644a> CREATOR = new C4645a();

    /* renamed from: a */
    public final C4646b[] f11653a;

    /* renamed from: b */
    public int f11654b;

    /* renamed from: c */
    public final int f11655c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$a */
    public class C4645a implements Parcelable.Creator<C4644a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4644a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4644a[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4644a(boolean r4, com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.C4646b... r5) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x000c
            java.lang.Object r4 = r5.clone()
            r5 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r5 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.C4646b[]) r5
        L_0x000c:
            java.util.Arrays.sort(r5, r3)
            r4 = 1
        L_0x0010:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x0047
            int r0 = r4 + -1
            r0 = r5[r0]
            java.util.UUID r0 = r0.f11657b
            r1 = r5[r4]
            java.util.UUID r1 = r1.f11657b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r4 = r4 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Duplicate data for uuid: "
            r1.append(r2)
            r4 = r5[r4]
            java.util.UUID r4 = r4.f11657b
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0047:
            r3.f11653a = r5
            int r4 = r5.length
            r3.f11655c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.<init>(boolean, com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]):void");
    }

    public int compare(Object obj, Object obj2) {
        C4646b bVar = (C4646b) obj;
        C4646b bVar2 = (C4646b) obj2;
        UUID uuid = C4637b.f11630b;
        if (uuid.equals(bVar.f11657b)) {
            return uuid.equals(bVar2.f11657b) ? 0 : 1;
        }
        return bVar.f11657b.compareTo(bVar2.f11657b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4644a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11653a, ((C4644a) obj).f11653a);
    }

    public int hashCode() {
        if (this.f11654b == 0) {
            this.f11654b = Arrays.hashCode(this.f11653a);
        }
        return this.f11654b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f11653a, 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b */
    public static final class C4646b implements Parcelable {
        public static final Parcelable.Creator<C4646b> CREATOR = new C4647a();

        /* renamed from: a */
        public int f11656a;

        /* renamed from: b */
        public final UUID f11657b;

        /* renamed from: c */
        public final String f11658c;

        /* renamed from: d */
        public final byte[] f11659d;

        /* renamed from: e */
        public final boolean f11660e;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b$a */
        public class C4647a implements Parcelable.Creator<C4646b> {
            public Object createFromParcel(Parcel parcel) {
                return new C4646b(parcel);
            }

            public Object[] newArray(int i) {
                return new C4646b[i];
            }
        }

        public C4646b(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f11657b = (UUID) C4965a.m15047a(uuid);
            this.f11658c = (String) C4965a.m15047a(str);
            this.f11659d = (byte[]) C4965a.m15047a(bArr);
            this.f11660e = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4646b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C4646b bVar = (C4646b) obj;
            if (!this.f11658c.equals(bVar.f11658c) || !C4991u.m15140a((Object) this.f11657b, (Object) bVar.f11657b) || !Arrays.equals(this.f11659d, bVar.f11659d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f11656a == 0) {
                this.f11656a = (((this.f11657b.hashCode() * 31) + this.f11658c.hashCode()) * 31) + Arrays.hashCode(this.f11659d);
            }
            return this.f11656a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11657b.getMostSignificantBits());
            parcel.writeLong(this.f11657b.getLeastSignificantBits());
            parcel.writeString(this.f11658c);
            parcel.writeByteArray(this.f11659d);
            parcel.writeByte(this.f11660e ? (byte) 1 : 0);
        }

        public C4646b(Parcel parcel) {
            this.f11657b = new UUID(parcel.readLong(), parcel.readLong());
            this.f11658c = parcel.readString();
            this.f11659d = parcel.createByteArray();
            this.f11660e = parcel.readByte() != 0;
        }
    }

    public C4644a(Parcel parcel) {
        C4646b[] bVarArr = (C4646b[]) parcel.createTypedArray(C4646b.CREATOR);
        this.f11653a = bVarArr;
        this.f11655c = bVarArr.length;
    }
}
