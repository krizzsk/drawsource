package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.fu */
/* compiled from: Config */
public abstract class C6093fu {
    private C6112ge includeIds = new C6112ge();
    @C6224ir
    private String mAccountId;

    /* renamed from: b */
    public abstract String mo35278b();

    /* renamed from: c */
    public abstract JSONObject mo35279c();

    /* renamed from: d */
    public abstract boolean mo35280d();

    public C6093fu(String str) {
        this.mAccountId = str;
    }

    /* renamed from: f */
    public C6112ge mo35283f() {
        return this.includeIds;
    }

    /* renamed from: g */
    public String mo35284g() {
        return this.mAccountId;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof C6093fu)) {
            return false;
        }
        C6093fu fuVar = (C6093fu) obj;
        if (!fuVar.mo35278b().equals(mo35278b())) {
            return false;
        }
        if ((this.mAccountId != null || fuVar.mAccountId != null) && ((str = this.mAccountId) == null || !str.equals(fuVar.mAccountId))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = mo35278b().hashCode();
        String str = this.mAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6093fu m18077a(java.lang.String r5, java.lang.String r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r0) {
                case -60641721: goto L_0x0034;
                case 96432: goto L_0x002a;
                case 3506402: goto L_0x0020;
                case 780346297: goto L_0x0016;
                case 2088265419: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "signals"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "telemetry"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "root"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "ads"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "crashReporting"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r4
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == r4) goto L_0x005f
            if (r5 == r3) goto L_0x0059
            if (r5 == r2) goto L_0x0053
            if (r5 == r1) goto L_0x004d
            com.inmobi.media.ft r5 = new com.inmobi.media.ft
            r5.<init>(r6)
            goto L_0x0064
        L_0x004d:
            com.inmobi.media.gi r5 = new com.inmobi.media.gi
            r5.<init>(r6)
            goto L_0x0064
        L_0x0053:
            com.inmobi.media.gh r5 = new com.inmobi.media.gh
            r5.<init>(r6)
            goto L_0x0064
        L_0x0059:
            com.inmobi.media.gg r5 = new com.inmobi.media.gg
            r5.<init>(r6)
            goto L_0x0064
        L_0x005f:
            com.inmobi.media.gd r5 = new com.inmobi.media.gd
            r5.<init>(r6)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6093fu.m18077a(java.lang.String, java.lang.String):com.inmobi.media.fu");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6093fu m18078a(java.lang.String r6, org.json.JSONObject r7, java.lang.String r8) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -60641721: goto L_0x0035;
                case 96432: goto L_0x002b;
                case 3506402: goto L_0x0021;
                case 780346297: goto L_0x0017;
                case 2088265419: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "signals"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r2
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "telemetry"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r1
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "root"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r3
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "ads"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r5
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "crashReporting"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r4
            goto L_0x0040
        L_0x003f:
            r6 = -1
        L_0x0040:
            if (r6 == r5) goto L_0x0080
            if (r6 == r4) goto L_0x0073
            if (r6 == r3) goto L_0x0066
            if (r6 == r2) goto L_0x0059
            if (r6 == r1) goto L_0x004c
            r6 = 0
            goto L_0x008c
        L_0x004c:
            com.inmobi.media.is r6 = com.inmobi.media.C6126gi.m18156a()
            java.lang.Class<com.inmobi.media.gi> r0 = com.inmobi.media.C6126gi.class
            java.lang.Object r6 = r6.mo35434a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fu r6 = (com.inmobi.media.C6093fu) r6
            goto L_0x008c
        L_0x0059:
            com.inmobi.media.is r6 = com.inmobi.media.C6120gh.m18152a()
            java.lang.Class<com.inmobi.media.gh> r0 = com.inmobi.media.C6120gh.class
            java.lang.Object r6 = r6.mo35434a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fu r6 = (com.inmobi.media.C6093fu) r6
            goto L_0x008c
        L_0x0066:
            com.inmobi.media.is r6 = com.inmobi.media.C6115gg.m18135a()
            java.lang.Class<com.inmobi.media.gg> r0 = com.inmobi.media.C6115gg.class
            java.lang.Object r6 = r6.mo35434a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fu r6 = (com.inmobi.media.C6093fu) r6
            goto L_0x008c
        L_0x0073:
            com.inmobi.media.is r6 = com.inmobi.media.C6111gd.m18129a()
            java.lang.Class<com.inmobi.media.gd> r0 = com.inmobi.media.C6111gd.class
            java.lang.Object r6 = r6.mo35434a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fu r6 = (com.inmobi.media.C6093fu) r6
            goto L_0x008c
        L_0x0080:
            com.inmobi.media.is r6 = com.inmobi.media.C6074ft.m18063a()
            java.lang.Class<com.inmobi.media.ft> r0 = com.inmobi.media.C6074ft.class
            java.lang.Object r6 = r6.mo35434a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fu r6 = (com.inmobi.media.C6093fu) r6
        L_0x008c:
            if (r6 == 0) goto L_0x0090
            r6.mAccountId = r8
        L_0x0090:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6093fu.m18078a(java.lang.String, org.json.JSONObject, java.lang.String):com.inmobi.media.fu");
    }
}
