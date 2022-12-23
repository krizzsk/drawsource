package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5003b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i */
public final class C4811i implements Parcelable {
    public static final Parcelable.Creator<C4811i> CREATOR = new C4812a();

    /* renamed from: A */
    public int f12749A;

    /* renamed from: a */
    public final String f12750a;

    /* renamed from: b */
    public final int f12751b;

    /* renamed from: c */
    public final String f12752c;

    /* renamed from: d */
    public final C4828a f12753d;

    /* renamed from: e */
    public final String f12754e;

    /* renamed from: f */
    public final String f12755f;

    /* renamed from: g */
    public final int f12756g;

    /* renamed from: h */
    public final List<byte[]> f12757h;

    /* renamed from: i */
    public final C4644a f12758i;

    /* renamed from: j */
    public final int f12759j;

    /* renamed from: k */
    public final int f12760k;

    /* renamed from: l */
    public final float f12761l;

    /* renamed from: m */
    public final int f12762m;

    /* renamed from: n */
    public final float f12763n;

    /* renamed from: o */
    public final int f12764o;

    /* renamed from: p */
    public final byte[] f12765p;

    /* renamed from: q */
    public final C5003b f12766q;

    /* renamed from: r */
    public final int f12767r;

    /* renamed from: s */
    public final int f12768s;

    /* renamed from: t */
    public final int f12769t;

    /* renamed from: u */
    public final int f12770u;

    /* renamed from: v */
    public final int f12771v;

    /* renamed from: w */
    public final long f12772w;

    /* renamed from: x */
    public final int f12773x;

    /* renamed from: y */
    public final String f12774y;

    /* renamed from: z */
    public final int f12775z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i$a */
    public class C4812a implements Parcelable.Creator<C4811i> {
        public Object createFromParcel(Parcel parcel) {
            return new C4811i(parcel);
        }

        public Object[] newArray(int i) {
            return new C4811i[i];
        }
    }

    public C4811i(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C5003b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, C4644a aVar, C4828a aVar2) {
        this.f12750a = str;
        this.f12754e = str2;
        this.f12755f = str3;
        this.f12752c = str4;
        this.f12751b = i;
        this.f12756g = i2;
        this.f12759j = i3;
        this.f12760k = i4;
        this.f12761l = f;
        this.f12762m = i5;
        this.f12763n = f2;
        this.f12765p = bArr;
        this.f12764o = i6;
        this.f12766q = bVar;
        this.f12767r = i7;
        this.f12768s = i8;
        this.f12769t = i9;
        this.f12770u = i10;
        this.f12771v = i11;
        this.f12773x = i12;
        this.f12774y = str5;
        this.f12775z = i13;
        this.f12772w = j;
        this.f12757h = list == null ? Collections.emptyList() : list;
        this.f12758i = aVar;
        this.f12753d = aVar2;
    }

    /* renamed from: a */
    public static C4811i m14719a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, C4644a aVar) {
        return m14720a(str, str2, (String) null, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C5003b) null, (C4644a) null);
    }

    /* renamed from: b */
    public int mo25300b() {
        int i;
        int i2 = this.f12759j;
        if (i2 == -1 || (i = this.f12760k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4811i.class == obj.getClass()) {
            C4811i iVar = (C4811i) obj;
            if (this.f12751b == iVar.f12751b && this.f12756g == iVar.f12756g && this.f12759j == iVar.f12759j && this.f12760k == iVar.f12760k && this.f12761l == iVar.f12761l && this.f12762m == iVar.f12762m && this.f12763n == iVar.f12763n && this.f12764o == iVar.f12764o && this.f12767r == iVar.f12767r && this.f12768s == iVar.f12768s && this.f12769t == iVar.f12769t && this.f12770u == iVar.f12770u && this.f12771v == iVar.f12771v && this.f12772w == iVar.f12772w && this.f12773x == iVar.f12773x && C4991u.m15140a((Object) this.f12750a, (Object) iVar.f12750a) && C4991u.m15140a((Object) this.f12774y, (Object) iVar.f12774y) && this.f12775z == iVar.f12775z && C4991u.m15140a((Object) this.f12754e, (Object) iVar.f12754e) && C4991u.m15140a((Object) this.f12755f, (Object) iVar.f12755f) && C4991u.m15140a((Object) this.f12752c, (Object) iVar.f12752c) && C4991u.m15140a((Object) this.f12758i, (Object) iVar.f12758i) && C4991u.m15140a((Object) this.f12753d, (Object) iVar.f12753d) && C4991u.m15140a((Object) this.f12766q, (Object) iVar.f12766q) && Arrays.equals(this.f12765p, iVar.f12765p) && this.f12757h.size() == iVar.f12757h.size()) {
                for (int i = 0; i < this.f12757h.size(); i++) {
                    if (!Arrays.equals(this.f12757h.get(i), iVar.f12757h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f12749A == 0) {
            String str = this.f12750a;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f12754e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f12755f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12752c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f12751b) * 31) + this.f12759j) * 31) + this.f12760k) * 31) + this.f12767r) * 31) + this.f12768s) * 31;
            String str5 = this.f12774y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f12775z) * 31;
            C4644a aVar = this.f12758i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C4828a aVar2 = this.f12753d;
            if (aVar2 != null) {
                i = Arrays.hashCode(aVar2.f12837a);
            }
            this.f12749A = hashCode6 + i;
        }
        return this.f12749A;
    }

    public String toString() {
        return "Format(" + this.f12750a + ", " + this.f12754e + ", " + this.f12755f + ", " + this.f12751b + ", " + this.f12774y + ", [" + this.f12759j + ", " + this.f12760k + ", " + this.f12761l + "], [" + this.f12767r + ", " + this.f12768s + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12750a);
        parcel.writeString(this.f12754e);
        parcel.writeString(this.f12755f);
        parcel.writeString(this.f12752c);
        parcel.writeInt(this.f12751b);
        parcel.writeInt(this.f12756g);
        parcel.writeInt(this.f12759j);
        parcel.writeInt(this.f12760k);
        parcel.writeFloat(this.f12761l);
        parcel.writeInt(this.f12762m);
        parcel.writeFloat(this.f12763n);
        parcel.writeInt(this.f12765p != null ? 1 : 0);
        byte[] bArr = this.f12765p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f12764o);
        parcel.writeParcelable(this.f12766q, i);
        parcel.writeInt(this.f12767r);
        parcel.writeInt(this.f12768s);
        parcel.writeInt(this.f12769t);
        parcel.writeInt(this.f12770u);
        parcel.writeInt(this.f12771v);
        parcel.writeInt(this.f12773x);
        parcel.writeString(this.f12774y);
        parcel.writeInt(this.f12775z);
        parcel.writeLong(this.f12772w);
        int size = this.f12757h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f12757h.get(i2));
        }
        parcel.writeParcelable(this.f12758i, 0);
        parcel.writeParcelable(this.f12753d, 0);
    }

    /* renamed from: a */
    public static C4811i m14720a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C5003b bVar, C4644a aVar) {
        return new C4811i(str, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14722a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C4644a aVar, int i6, String str4) {
        return m14721a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str4, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14721a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C4644a aVar, int i8, String str4, C4828a aVar2) {
        return new C4811i(str, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    /* renamed from: a */
    public static C4811i m14727a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new C4811i(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, (List<byte[]>) null, (C4644a) null, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14724a(String str, String str2, String str3, int i, int i2, String str4, C4644a aVar) {
        return m14723a(str, str2, (String) null, i, i2, str4, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C4811i m14723a(String str, String str2, String str3, int i, int i2, String str4, int i3, C4644a aVar, long j, List<byte[]> list) {
        return new C4811i(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, aVar, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14726a(String str, String str2, String str3, int i, List<byte[]> list, String str4, C4644a aVar) {
        return new C4811i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, aVar, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14718a(String str, String str2, long j) {
        return new C4811i((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (C4644a) null, (C4828a) null);
    }

    /* renamed from: a */
    public static C4811i m14725a(String str, String str2, String str3, int i, C4644a aVar) {
        return new C4811i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (C4828a) null);
    }

    /* renamed from: a */
    public C4811i mo25299a(long j) {
        return new C4811i(this.f12750a, this.f12754e, this.f12755f, this.f12752c, this.f12751b, this.f12756g, this.f12759j, this.f12760k, this.f12761l, this.f12762m, this.f12763n, this.f12765p, this.f12764o, this.f12766q, this.f12767r, this.f12768s, this.f12769t, this.f12770u, this.f12771v, this.f12773x, this.f12774y, this.f12775z, j, this.f12757h, this.f12758i, this.f12753d);
    }

    /* renamed from: a */
    public final MediaFormat mo25298a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f12755f);
        String str = this.f12774y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m14728a(mediaFormat, "max-input-size", this.f12756g);
        m14728a(mediaFormat, "width", this.f12759j);
        m14728a(mediaFormat, "height", this.f12760k);
        float f = this.f12761l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m14728a(mediaFormat, "rotation-degrees", this.f12762m);
        m14728a(mediaFormat, "channel-count", this.f12767r);
        m14728a(mediaFormat, "sample-rate", this.f12768s);
        m14728a(mediaFormat, "encoder-delay", this.f12770u);
        m14728a(mediaFormat, "encoder-padding", this.f12771v);
        for (int i = 0; i < this.f12757h.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.f12757h.get(i)));
        }
        C5003b bVar = this.f12766q;
        if (bVar != null) {
            m14728a(mediaFormat, "color-transfer", bVar.f13338c);
            m14728a(mediaFormat, "color-standard", bVar.f13336a);
            m14728a(mediaFormat, "color-range", bVar.f13337b);
            byte[] bArr = bVar.f13339d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public C4811i(Parcel parcel) {
        this.f12750a = parcel.readString();
        this.f12754e = parcel.readString();
        this.f12755f = parcel.readString();
        this.f12752c = parcel.readString();
        this.f12751b = parcel.readInt();
        this.f12756g = parcel.readInt();
        this.f12759j = parcel.readInt();
        this.f12760k = parcel.readInt();
        this.f12761l = parcel.readFloat();
        this.f12762m = parcel.readInt();
        this.f12763n = parcel.readFloat();
        this.f12765p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f12764o = parcel.readInt();
        this.f12766q = (C5003b) parcel.readParcelable(C5003b.class.getClassLoader());
        this.f12767r = parcel.readInt();
        this.f12768s = parcel.readInt();
        this.f12769t = parcel.readInt();
        this.f12770u = parcel.readInt();
        this.f12771v = parcel.readInt();
        this.f12773x = parcel.readInt();
        this.f12774y = parcel.readString();
        this.f12775z = parcel.readInt();
        this.f12772w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12757h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f12757h.add(parcel.createByteArray());
        }
        this.f12758i = (C4644a) parcel.readParcelable(C4644a.class.getClassLoader());
        this.f12753d = (C4828a) parcel.readParcelable(C4828a.class.getClassLoader());
    }

    /* renamed from: a */
    public static void m14728a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
