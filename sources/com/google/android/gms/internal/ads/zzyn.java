package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.p193ts.TsExtractor;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzyn implements zzyy {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final zzym zzc = new zzym();

    public final synchronized zzyr[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016e, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0170, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0172, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0151, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0152, code lost:
        switch(r3) {
            case 0: goto L_0x0172;
            case 1: goto L_0x0172;
            case 2: goto L_0x0172;
            case 3: goto L_0x0170;
            case 4: goto L_0x016e;
            case 5: goto L_0x016e;
            case 6: goto L_0x016e;
            case 7: goto L_0x016c;
            case 8: goto L_0x016a;
            case 9: goto L_0x0168;
            case 10: goto L_0x0168;
            case 11: goto L_0x0168;
            case 12: goto L_0x0168;
            case 13: goto L_0x0168;
            case 14: goto L_0x0166;
            case 15: goto L_0x0163;
            case 16: goto L_0x0163;
            case 17: goto L_0x0163;
            case 18: goto L_0x0161;
            case 19: goto L_0x015f;
            case 20: goto L_0x015d;
            case 21: goto L_0x015b;
            case 22: goto L_0x0159;
            case 23: goto L_0x0157;
            default: goto L_0x0155;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0157, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0159, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015b, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015f, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0161, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0166, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0168, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016a, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016c, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzyr[] zzb(android.net.Uri r19, java.util.Map r20) {
        /*
            r18 = this;
            monitor-enter(r18)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02e3 }
            r1 = 14
            r0.<init>(r1)     // Catch:{ all -> 0x02e3 }
            java.lang.String r2 = "Content-Type"
            r3 = r20
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x02e3 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02e3 }
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0024
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x02e3 }
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x02e3 }
        L_0x0024:
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 13
            r10 = 12
            r11 = 11
            r12 = 9
            r13 = 6
            r14 = 1
            r15 = 10
            r16 = 8
            r2 = -1
            if (r3 != 0) goto L_0x003b
        L_0x0038:
            r3 = r2
            goto L_0x0173
        L_0x003b:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbo.zze(r3)     // Catch:{ all -> 0x02e3 }
            int r17 = r3.hashCode()     // Catch:{ all -> 0x02e3 }
            switch(r17) {
                case -2123537834: goto L_0x0147;
                case -1662384011: goto L_0x013c;
                case -1662384007: goto L_0x0131;
                case -1662095187: goto L_0x0127;
                case -1606874997: goto L_0x011d;
                case -1487394660: goto L_0x0112;
                case -1248337486: goto L_0x0107;
                case -1004728940: goto L_0x00fc;
                case -387023398: goto L_0x00f2;
                case -43467528: goto L_0x00e7;
                case 13915911: goto L_0x00db;
                case 187078296: goto L_0x00d0;
                case 187078297: goto L_0x00c5;
                case 187078669: goto L_0x00ba;
                case 187090232: goto L_0x00ae;
                case 187091926: goto L_0x00a2;
                case 187099443: goto L_0x0096;
                case 1331848029: goto L_0x008a;
                case 1503095341: goto L_0x007f;
                case 1504578661: goto L_0x0074;
                case 1504619009: goto L_0x0069;
                case 1504831518: goto L_0x005e;
                case 1505118770: goto L_0x0053;
                case 2039520277: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x02e3 }
        L_0x0046:
            goto L_0x0151
        L_0x0048:
            java.lang.String r4 = "video/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r12
            goto L_0x0152
        L_0x0053:
            java.lang.String r4 = "audio/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r10
            goto L_0x0152
        L_0x005e:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r1
            goto L_0x0152
        L_0x0069:
            java.lang.String r4 = "audio/flac"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 7
            goto L_0x0152
        L_0x0074:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r14
            goto L_0x0152
        L_0x007f:
            java.lang.String r4 = "audio/3gpp"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r6
            goto L_0x0152
        L_0x008a:
            java.lang.String r4 = "video/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 15
            goto L_0x0152
        L_0x0096:
            java.lang.String r4 = "audio/wav"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 21
            goto L_0x0152
        L_0x00a2:
            java.lang.String r4 = "audio/ogg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 18
            goto L_0x0152
        L_0x00ae:
            java.lang.String r4 = "audio/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 16
            goto L_0x0152
        L_0x00ba:
            java.lang.String r4 = "audio/amr"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r7
            goto L_0x0152
        L_0x00c5:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r8
            goto L_0x0152
        L_0x00d0:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 0
            goto L_0x0152
        L_0x00db:
            java.lang.String r4 = "video/x-flv"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r16
            goto L_0x0152
        L_0x00e7:
            java.lang.String r4 = "application/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r9
            goto L_0x0152
        L_0x00f2:
            java.lang.String r4 = "audio/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r15
            goto L_0x0152
        L_0x00fc:
            java.lang.String r4 = "text/vtt"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 22
            goto L_0x0152
        L_0x0107:
            java.lang.String r4 = "application/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 17
            goto L_0x0152
        L_0x0112:
            java.lang.String r4 = "image/jpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 23
            goto L_0x0152
        L_0x011d:
            java.lang.String r4 = "audio/amr-wb"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r13
            goto L_0x0152
        L_0x0127:
            java.lang.String r4 = "video/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = r11
            goto L_0x0152
        L_0x0131:
            java.lang.String r4 = "video/mp2t"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 20
            goto L_0x0152
        L_0x013c:
            java.lang.String r4 = "video/mp2p"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 19
            goto L_0x0152
        L_0x0147:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02e3 }
            if (r3 == 0) goto L_0x0151
            r3 = 2
            goto L_0x0152
        L_0x0151:
            r3 = r2
        L_0x0152:
            switch(r3) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0172;
                case 2: goto L_0x0172;
                case 3: goto L_0x0170;
                case 4: goto L_0x016e;
                case 5: goto L_0x016e;
                case 6: goto L_0x016e;
                case 7: goto L_0x016c;
                case 8: goto L_0x016a;
                case 9: goto L_0x0168;
                case 10: goto L_0x0168;
                case 11: goto L_0x0168;
                case 12: goto L_0x0168;
                case 13: goto L_0x0168;
                case 14: goto L_0x0166;
                case 15: goto L_0x0163;
                case 16: goto L_0x0163;
                case 17: goto L_0x0163;
                case 18: goto L_0x0161;
                case 19: goto L_0x015f;
                case 20: goto L_0x015d;
                case 21: goto L_0x015b;
                case 22: goto L_0x0159;
                case 23: goto L_0x0157;
                default: goto L_0x0155;
            }     // Catch:{ all -> 0x02e3 }
        L_0x0155:
            goto L_0x0038
        L_0x0157:
            r3 = r1
            goto L_0x0173
        L_0x0159:
            r3 = r9
            goto L_0x0173
        L_0x015b:
            r3 = r10
            goto L_0x0173
        L_0x015d:
            r3 = r11
            goto L_0x0173
        L_0x015f:
            r3 = r15
            goto L_0x0173
        L_0x0161:
            r3 = r12
            goto L_0x0173
        L_0x0163:
            r3 = r16
            goto L_0x0173
        L_0x0166:
            r3 = 7
            goto L_0x0173
        L_0x0168:
            r3 = r13
            goto L_0x0173
        L_0x016a:
            r3 = r6
            goto L_0x0173
        L_0x016c:
            r3 = r7
            goto L_0x0173
        L_0x016e:
            r3 = r8
            goto L_0x0173
        L_0x0170:
            r3 = r14
            goto L_0x0173
        L_0x0172:
            r3 = 0
        L_0x0173:
            if (r3 == r2) goto L_0x0178
            zzc(r3, r0)     // Catch:{ all -> 0x02e3 }
        L_0x0178:
            java.lang.String r4 = r19.getLastPathSegment()     // Catch:{ all -> 0x02e3 }
            if (r4 != 0) goto L_0x0181
        L_0x017e:
            r15 = r2
            goto L_0x02bd
        L_0x0181:
            java.lang.String r5 = ".ac3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02bc
            java.lang.String r5 = ".ec3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0193
            goto L_0x02bc
        L_0x0193:
            java.lang.String r5 = ".ac4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x019e
            r15 = r14
            goto L_0x02bd
        L_0x019e:
            java.lang.String r5 = ".adts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02ba
            java.lang.String r5 = ".aac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01b0
            goto L_0x02ba
        L_0x01b0:
            java.lang.String r5 = ".amr"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01bb
            r15 = r8
            goto L_0x02bd
        L_0x01bb:
            java.lang.String r5 = ".flac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01c6
            r15 = r7
            goto L_0x02bd
        L_0x01c6:
            java.lang.String r5 = ".flv"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01d1
            r15 = r6
            goto L_0x02bd
        L_0x01d1:
            java.lang.String r5 = ".mk"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b8
            java.lang.String r5 = ".webm"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01e9
            goto L_0x02b8
        L_0x01e9:
            java.lang.String r5 = ".mp3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x01f4
            r15 = 7
            goto L_0x02bd
        L_0x01f4:
            java.lang.String r5 = ".mp4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = ".m4"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = ".mp4"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = ".cmf"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0228
            goto L_0x02b5
        L_0x0228:
            java.lang.String r5 = ".og"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b3
            java.lang.String r5 = ".opus"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0240
            goto L_0x02b3
        L_0x0240:
            java.lang.String r5 = ".ps"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02bd
            java.lang.String r5 = ".mpeg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02bd
            java.lang.String r5 = ".mpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02bd
            java.lang.String r5 = ".m2p"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0262
            goto L_0x02bd
        L_0x0262:
            java.lang.String r5 = ".ts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02b1
            java.lang.String r5 = ".ts"
            int r6 = r4.length()     // Catch:{ all -> 0x02e3 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0279
            goto L_0x02b1
        L_0x0279:
            java.lang.String r5 = ".wav"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02af
            java.lang.String r5 = ".wave"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x028a
            goto L_0x02af
        L_0x028a:
            java.lang.String r5 = ".vtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02ad
            java.lang.String r5 = ".webvtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x029b
            goto L_0x02ad
        L_0x029b:
            java.lang.String r5 = ".jpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x02ab
            java.lang.String r5 = ".jpeg"
            boolean r4 = r4.endsWith(r5)     // Catch:{ all -> 0x02e3 }
            if (r4 == 0) goto L_0x017e
        L_0x02ab:
            r15 = r1
            goto L_0x02bd
        L_0x02ad:
            r15 = r9
            goto L_0x02bd
        L_0x02af:
            r15 = r10
            goto L_0x02bd
        L_0x02b1:
            r15 = r11
            goto L_0x02bd
        L_0x02b3:
            r15 = r12
            goto L_0x02bd
        L_0x02b5:
            r15 = r16
            goto L_0x02bd
        L_0x02b8:
            r15 = r13
            goto L_0x02bd
        L_0x02ba:
            r15 = 2
            goto L_0x02bd
        L_0x02bc:
            r15 = 0
        L_0x02bd:
            if (r15 == r2) goto L_0x02c4
            if (r15 == r3) goto L_0x02c4
            zzc(r15, r0)     // Catch:{ all -> 0x02e3 }
        L_0x02c4:
            int[] r2 = zza     // Catch:{ all -> 0x02e3 }
            r4 = 0
        L_0x02c7:
            if (r4 >= r1) goto L_0x02d5
            r5 = r2[r4]     // Catch:{ all -> 0x02e3 }
            if (r5 == r3) goto L_0x02d2
            if (r5 == r15) goto L_0x02d2
            zzc(r5, r0)     // Catch:{ all -> 0x02e3 }
        L_0x02d2:
            int r4 = r4 + 1
            goto L_0x02c7
        L_0x02d5:
            int r1 = r0.size()     // Catch:{ all -> 0x02e3 }
            com.google.android.gms.internal.ads.zzyr[] r1 = new com.google.android.gms.internal.ads.zzyr[r1]     // Catch:{ all -> 0x02e3 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x02e3 }
            com.google.android.gms.internal.ads.zzyr[] r0 = (com.google.android.gms.internal.ads.zzyr[]) r0     // Catch:{ all -> 0x02e3 }
            monitor-exit(r18)
            return r0
        L_0x02e3:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyn.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzyr[]");
    }

    private static final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzafp());
                return;
            case 1:
                list.add(new zzafs());
                return;
            case 2:
                list.add(new zzafv(0));
                return;
            case 3:
                list.add(new zzaag(0));
                return;
            case 4:
                zzyr zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaam(0));
                    return;
                }
            case 5:
                list.add(new zzaap());
                return;
            case 6:
                list.add(new zzadg(0));
                return;
            case 7:
                list.add(new zzado(0));
                return;
            case 8:
                list.add(new zzaej(0, (zzee) null));
                list.add(new zzaeo(0));
                return;
            case 9:
                list.add(new zzafd());
                return;
            case 10:
                list.add(new zzagy());
                return;
            case 11:
                list.add(new zzahi(1, 0, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                return;
            case 12:
                list.add(new zzahu());
                return;
            case 14:
                list.add(new zzaau());
                return;
            default:
                return;
        }
    }
}
