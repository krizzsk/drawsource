package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.inmobi.media.bc */
/* compiled from: AdPlacement */
public final class C5791bc implements Parcelable {
    public static final Parcelable.Creator<C5791bc> CREATOR = new Parcelable.Creator<C5791bc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C5791bc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C5791bc(parcel, (byte) 0);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f14554a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f14555b;

    /* renamed from: c */
    private final String f14556c;

    /* renamed from: d */
    private String f14557d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, String> f14558e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14559f;

    /* renamed from: g */
    private final String f14560g;

    /* renamed from: h */
    private String f14561h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f14562i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f14563j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f14564k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f14565l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ASRequestParams f14566m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f14567n;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ C5791bc(long j, long j2, String str, String str2, String str3, String str4, byte b) {
        this(j, j2, str, str2, str3, str4);
    }

    /* synthetic */ C5791bc(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: com.inmobi.media.bc$a */
    /* compiled from: AdPlacement */
    public static class C5793a {

        /* renamed from: a */
        private long f14568a = Long.MIN_VALUE;

        /* renamed from: b */
        private long f14569b = Long.MIN_VALUE;

        /* renamed from: c */
        private String f14570c;

        /* renamed from: d */
        private Map<String, String> f14571d;

        /* renamed from: e */
        private String f14572e;

        /* renamed from: f */
        private String f14573f;

        /* renamed from: g */
        private String f14574g;

        /* renamed from: h */
        private String f14575h;

        /* renamed from: i */
        private String f14576i = "";

        /* renamed from: j */
        private boolean f14577j;

        /* renamed from: k */
        private String f14578k = "activity";

        /* renamed from: l */
        private ASRequestParams f14579l;

        /* renamed from: m */
        private String f14580m;

        public C5793a(String str, String str2) {
            this.f14573f = str;
            this.f14570c = str2;
            this.f14575h = UUID.randomUUID().toString();
        }

        /* renamed from: a */
        public final C5793a mo34741a(long j) {
            this.f14568a = j;
            return this;
        }

        /* renamed from: b */
        public final C5793a mo34748b(long j) {
            this.f14569b = j;
            return this;
        }

        /* renamed from: a */
        public final C5793a mo34742a(C5791bc bcVar) {
            this.f14569b = bcVar.f14555b;
            this.f14568a = bcVar.f14554a;
            this.f14578k = bcVar.f14564k;
            this.f14571d = bcVar.f14558e;
            this.f14576i = bcVar.f14563j;
            return this;
        }

        /* renamed from: a */
        public final C5793a mo34744a(String str) {
            this.f14576i = str;
            return this;
        }

        /* renamed from: b */
        public final C5793a mo34749b(String str) {
            this.f14578k = str;
            return this;
        }

        /* renamed from: a */
        public final C5793a mo34745a(Map<String, String> map) {
            this.f14571d = map;
            return this;
        }

        /* renamed from: c */
        public final C5793a mo34750c(String str) {
            this.f14572e = str;
            return this;
        }

        /* renamed from: a */
        public final C5793a mo34746a(boolean z) {
            this.f14577j = z;
            return this;
        }

        /* renamed from: a */
        public final C5793a mo34743a(ASRequestParams aSRequestParams) {
            this.f14579l = aSRequestParams;
            return this;
        }

        /* renamed from: d */
        public final C5793a mo34751d(String str) {
            this.f14574g = str;
            return this;
        }

        /* renamed from: e */
        public final C5793a mo34752e(String str) {
            this.f14580m = str;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.inmobi.media.C5791bc mo34747a() {
            /*
                r11 = this;
                java.lang.String r0 = r11.f14570c
                int r1 = r0.hashCode()
                r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
                r3 = 2
                if (r1 == r2) goto L_0x001c
                r2 = 557596132(0x213c3de4, float:6.377879E-19)
                if (r1 == r2) goto L_0x0012
                goto L_0x0026
            L_0x0012:
                java.lang.String r1 = "AerServ"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = r3
                goto L_0x0027
            L_0x001c:
                java.lang.String r1 = "InMobi"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = 1
                goto L_0x0027
            L_0x0026:
                r0 = -1
            L_0x0027:
                r1 = -9223372036854775808
                if (r0 == r3) goto L_0x003a
                long r3 = r11.f14568a
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0032
                goto L_0x0040
            L_0x0032:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is IM, IM-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            L_0x003a:
                long r3 = r11.f14569b
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0080
            L_0x0040:
                com.inmobi.media.bc r0 = new com.inmobi.media.bc
                long r2 = r11.f14568a
                long r4 = r11.f14569b
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.f14571d
                java.lang.String r6 = com.inmobi.media.C5791bc.m17207a((java.util.Map<java.lang.String, java.lang.String>) r1)
                java.lang.String r7 = r11.f14573f
                java.lang.String r8 = r11.f14570c
                java.lang.String r9 = r11.f14574g
                r10 = 0
                r1 = r0
                r1.<init>(r2, r4, r6, r7, r8, r9, r10)
                java.lang.String r1 = r11.f14572e
                java.lang.String unused = r0.f14559f = r1
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.f14571d
                java.util.Map unused = r0.f14558e = r1
                java.lang.String r1 = r11.f14576i
                java.lang.String unused = r0.f14563j = r1
                java.lang.String r1 = r11.f14578k
                java.lang.String unused = r0.f14564k = r1
                java.lang.String r1 = r11.f14575h
                java.lang.String unused = r0.f14562i = r1
                boolean r1 = r11.f14577j
                boolean unused = r0.f14565l = r1
                com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14579l
                com.inmobi.unification.sdk.model.ASRequestParams unused = r0.f14566m = r1
                java.lang.String r1 = r11.f14580m
                java.lang.String unused = r0.f14567n = r1
                return r0
            L_0x0080:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is AS, AS-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5791bc.C5793a.mo34747a():com.inmobi.media.bc");
        }
    }

    private C5791bc(long j, long j2, String str, String str2, String str3, String str4) {
        this.f14563j = "";
        this.f14564k = "activity";
        this.f14554a = j;
        this.f14555b = j2;
        this.f14556c = str3;
        this.f14557d = str;
        this.f14560g = str2;
        if (str == null) {
            this.f14557d = "";
        }
        this.f14561h = str4;
    }

    private C5791bc(Parcel parcel) {
        this.f14563j = "";
        String str = "activity";
        this.f14564k = str;
        this.f14555b = parcel.readLong();
        this.f14554a = parcel.readLong();
        this.f14556c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            char c = 65535;
            int hashCode = readString.hashCode();
            if (hashCode != -1655966961) {
                if (hashCode == -1006804125 && readString.equals("others")) {
                    c = 2;
                }
            } else if (readString.equals(str)) {
                c = 1;
            }
            if (c == 2) {
                str = "others";
            }
        }
        this.f14564k = str;
        this.f14560g = parcel.readString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r2.get("tp");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17207a(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = "tp"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0010
            return r0
        L_0x0010:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5791bc.m17207a(java.util.Map):java.lang.String");
    }

    /* renamed from: a */
    public final String mo34715a() {
        return this.f14556c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo34717b() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f14556c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            java.lang.String r0 = "im"
            return r0
        L_0x002c:
            java.lang.String r0 = "as"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5791bc.mo34717b():java.lang.String");
    }

    /* renamed from: b */
    public final void mo34719b(Map<String, String> map) {
        this.f14558e = map;
    }

    /* renamed from: c */
    public final Map<String, String> mo34720c() {
        return this.f14558e;
    }

    /* renamed from: d */
    public final String mo34721d() {
        return this.f14559f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo34723e() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f14556c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            long r0 = r4.f14554a
            return r0
        L_0x002c:
            long r0 = r4.f14555b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5791bc.mo34723e():long");
    }

    /* renamed from: f */
    public final boolean mo34725f() {
        return this.f14565l;
    }

    /* renamed from: g */
    public final ASRequestParams mo34726g() {
        return this.f14566m;
    }

    /* renamed from: h */
    public final String mo34727h() {
        return this.f14567n;
    }

    /* renamed from: i */
    public final long mo34729i() {
        return this.f14555b;
    }

    /* renamed from: j */
    public final long mo34730j() {
        return this.f14554a;
    }

    /* renamed from: k */
    public final String mo34731k() {
        return this.f14557d;
    }

    /* renamed from: l */
    public final String mo34732l() {
        return this.f14560g;
    }

    /* renamed from: a */
    public final void mo34716a(String str) {
        this.f14563j = str;
    }

    /* renamed from: m */
    public final String mo34733m() {
        return this.f14563j;
    }

    /* renamed from: n */
    public final String mo34734n() {
        return this.f14564k;
    }

    /* renamed from: b */
    public final void mo34718b(String str) {
        this.f14564k = str;
    }

    /* renamed from: o */
    public final String mo34735o() {
        return this.f14562i;
    }

    /* renamed from: p */
    public final String mo34736p() {
        return this.f14561h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5791bc bcVar = (C5791bc) obj;
            return this.f14554a == bcVar.f14554a && this.f14555b == bcVar.f14555b && this.f14556c.equals(bcVar.f14556c) && this.f14564k.equals(bcVar.f14564k) && this.f14557d.equals(bcVar.f14557d) && this.f14560g.equals(bcVar.f14560g);
        }
    }

    public final int hashCode() {
        long j = this.f14555b;
        long j2 = this.f14554a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 30) + this.f14560g.hashCode()) * 29) + this.f14564k.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo34715a()
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001e
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = r3
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == r3) goto L_0x0032
            long r0 = r4.f14554a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0032:
            long r0 = r4.f14555b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5791bc.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14555b);
        parcel.writeLong(this.f14554a);
        parcel.writeString(this.f14556c);
        parcel.writeString(this.f14564k);
        parcel.writeString(this.f14560g);
    }
}
