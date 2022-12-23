package com.bytedance.sdk.component.p118e.p121c;

import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.c.c */
/* compiled from: TNCConfig */
public class C2856c {

    /* renamed from: a */
    public boolean f6401a = false;

    /* renamed from: b */
    public boolean f6402b = true;

    /* renamed from: c */
    public Map<String, Integer> f6403c = null;

    /* renamed from: d */
    public Map<String, String> f6404d = null;

    /* renamed from: e */
    public int f6405e = 10;

    /* renamed from: f */
    public int f6406f = 1;

    /* renamed from: g */
    public int f6407g = 1;

    /* renamed from: h */
    public int f6408h = 10;

    /* renamed from: i */
    public int f6409i = 1;

    /* renamed from: j */
    public int f6410j = 1;

    /* renamed from: k */
    public int f6411k = ErrorCode.UNDEFINED_ERROR;

    /* renamed from: l */
    public int f6412l = 120;

    /* renamed from: m */
    public String f6413m = null;

    /* renamed from: n */
    public int f6414n = 0;

    /* renamed from: o */
    public long f6415o = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c1659536876586dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(java.lang.String):java.lang.String");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f6401a);
        sb.append(" probeEnable: ");
        sb.append(this.f6402b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f6403c;
        int i = 0;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.f6404d;
        if (map2 != null) {
            i = map2.size();
        }
        sb.append(i);
        sb.append(" reqTo: ");
        sb.append(this.f6405e);
        sb.append("#");
        sb.append(this.f6406f);
        sb.append("#");
        sb.append(this.f6407g);
        sb.append(" reqErr: ");
        sb.append(this.f6408h);
        sb.append("#");
        sb.append(this.f6409i);
        sb.append("#");
        sb.append(this.f6410j);
        sb.append(" updateInterval: ");
        sb.append(this.f6411k);
        sb.append(" updateRandom: ");
        sb.append(this.f6412l);
        sb.append(" httpBlack: ");
        sb.append(this.f6413m);
        return sb.toString();
    }
}
