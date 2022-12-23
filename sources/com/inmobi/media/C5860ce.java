package com.inmobi.media;

import java.util.Locale;

/* renamed from: com.inmobi.media.ce */
/* compiled from: NativeTextAsset */
public class C5860ce extends C5847bw {

    /* renamed from: com.inmobi.media.ce$a */
    /* compiled from: NativeTextAsset */
    public static class C5861a extends C5848bx {

        /* renamed from: l */
        protected int f14782l;

        /* renamed from: m */
        protected String f14783m;

        /* renamed from: n */
        protected int f14784n;

        /* renamed from: o */
        protected String[] f14785o;

        /* renamed from: p */
        public byte f14786p;

        public C5861a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5862cf cfVar) {
            this(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, 12, (byte) 0, Integer.MAX_VALUE, "#ff000000", new String[]{"none"}, cfVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5861a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, byte b, int i10, String str5, String[] strArr, C5862cf cfVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, cfVar);
            String[] strArr2 = strArr;
            this.f14782l = i9;
            this.f14783m = str5.length() == 0 ? "#ff000000" : str5;
            this.f14784n = i10;
            int min = Math.min(strArr2.length, 4);
            String[] strArr3 = new String[min];
            this.f14785o = strArr3;
            this.f14786p = b;
            System.arraycopy(strArr2, 0, strArr3, 0, min);
        }

        /* renamed from: h */
        public final int mo34850h() {
            return this.f14782l;
        }

        /* renamed from: i */
        public final String mo34851i() {
            return this.f14783m.toLowerCase(Locale.US);
        }

        /* renamed from: j */
        public final String[] mo34852j() {
            return this.f14785o;
        }

        /* renamed from: e */
        public final String mo34831e() {
            return this.f14737j.toLowerCase(Locale.US);
        }
    }

    public C5860ce(String str, String str2, C5848bx bxVar, String str3) {
        super(str, str2, "TEXT", bxVar);
        this.f14707e = str3;
    }

    public C5860ce(String str, String str2, String str3, C5848bx bxVar, String str4) {
        super(str, str2, str3, bxVar);
        this.f14707e = str4;
    }
}
