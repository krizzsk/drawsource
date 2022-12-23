package com.inmobi.unifiedId;

import java.util.Arrays;
import java.util.HashMap;

public final class InMobiUserDataModel {

    /* renamed from: a */
    private final InMobiUserDataTypes f16040a;

    /* renamed from: b */
    private final InMobiUserDataTypes f16041b;

    /* renamed from: c */
    private final HashMap<String, String> f16042c;

    /* synthetic */ InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap hashMap, byte b) {
        this(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    private InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> hashMap) {
        this.f16040a = inMobiUserDataTypes;
        this.f16041b = inMobiUserDataTypes2;
        this.f16042c = hashMap;
    }

    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f16040a;
    }

    public final InMobiUserDataTypes getEmailId() {
        return this.f16041b;
    }

    public final HashMap<String, String> getExtras() {
        return this.f16042c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r1 = r5.f16040a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.inmobi.unifiedId.InMobiUserDataModel
            if (r1 == 0) goto L_0x005f
            com.inmobi.unifiedId.InMobiUserDataModel r6 = (com.inmobi.unifiedId.InMobiUserDataModel) r6
            com.inmobi.unifiedId.InMobiUserDataTypes r1 = r5.f16040a
            r2 = 1
            if (r1 != 0) goto L_0x0015
            com.inmobi.unifiedId.InMobiUserDataTypes r1 = r6.getPhoneNumber()
            if (r1 == 0) goto L_0x0023
        L_0x0015:
            com.inmobi.unifiedId.InMobiUserDataTypes r1 = r5.f16040a
            if (r1 == 0) goto L_0x0025
            com.inmobi.unifiedId.InMobiUserDataTypes r3 = r6.getPhoneNumber()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0025
        L_0x0023:
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r1 = r0
        L_0x0026:
            r1 = r1 & r2
            com.inmobi.unifiedId.InMobiUserDataTypes r3 = r5.f16041b
            if (r3 != 0) goto L_0x0031
            com.inmobi.unifiedId.InMobiUserDataTypes r3 = r6.getEmailId()
            if (r3 == 0) goto L_0x003f
        L_0x0031:
            com.inmobi.unifiedId.InMobiUserDataTypes r3 = r5.f16041b
            if (r3 == 0) goto L_0x0041
            com.inmobi.unifiedId.InMobiUserDataTypes r4 = r6.getEmailId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0041
        L_0x003f:
            r3 = r2
            goto L_0x0042
        L_0x0041:
            r3 = r0
        L_0x0042:
            r1 = r1 & r3
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r5.f16042c
            if (r3 != 0) goto L_0x004d
            java.util.HashMap r3 = r6.getExtras()
            if (r3 == 0) goto L_0x005b
        L_0x004d:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r5.f16042c
            if (r3 == 0) goto L_0x005c
            java.util.HashMap r6 = r6.getExtras()
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            r6 = r1 & r0
            return r6
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUserDataModel.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getPhoneNumber(), getEmailId(), getExtras()});
    }

    public static class Builder {

        /* renamed from: a */
        private InMobiUserDataTypes f16043a;

        /* renamed from: b */
        private InMobiUserDataTypes f16044b;

        /* renamed from: c */
        private HashMap<String, String> f16045c;

        public Builder phoneNumber(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f16043a = inMobiUserDataTypes;
            return this;
        }

        public Builder emailId(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f16044b = inMobiUserDataTypes;
            return this;
        }

        public Builder extras(HashMap<String, String> hashMap) {
            this.f16045c = hashMap;
            return this;
        }

        public InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f16043a, this.f16044b, this.f16045c, (byte) 0);
        }
    }
}
