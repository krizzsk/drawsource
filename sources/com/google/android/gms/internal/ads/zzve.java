package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzve extends zzvj {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzfsr zzb = zzfsr.zzb(zzun.zza);
    /* access modifiers changed from: private */
    public static final zzfsr zzc = zzfsr.zzb(zzuo.zza);
    private final AtomicReference zzd;
    private final zzud zze;

    @Deprecated
    public zzve() {
        zzut zzut = zzut.zzD;
        throw null;
    }

    protected static int zza(zzad zzad, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzad.zzd)) {
            return 4;
        }
        String zzf = zzf(str);
        String zzf2 = zzf(zzad.zzd);
        if (zzf2 == null || zzf == null) {
            if (!z || zzf2 != null) {
                return 0;
            }
            return 1;
        } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
            return 3;
        } else {
            if (zzeg.zzag(zzf2, "-")[0].equals(zzeg.zzag(zzf, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    protected static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static boolean zzi(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzp(zzty zzty, zzcp zzcp, Map map) {
        int i = 0;
        while (i < zzty.zzc) {
            if (((zzcm) zzcp.zzB.get(zzty.zzb(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    private static final Pair zzq(int i, zzvi zzvi, int[][][] iArr, zzuz zzuz, Comparator comparator) {
        int i2;
        Object obj;
        zzvi zzvi2 = zzvi;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i == zzvi2.zzc(i3)) {
                zzty zzd2 = zzvi2.zzd(i3);
                int i4 = 0;
                while (i4 < zzd2.zzc) {
                    zzck zzb2 = zzd2.zzb(i4);
                    List zza2 = zzuz.zza(i3, zzb2, iArr[i3][i4]);
                    int i5 = zzb2.zzb;
                    int i6 = 1;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (true) {
                        int i8 = zzb2.zzb;
                        if (i7 > 0) {
                            break;
                        }
                        zzva zzva = (zzva) zza2.get(i7);
                        int zzb3 = zzva.zzb();
                        if (zArr[i7] || zzb3 == 0) {
                            i2 = i6;
                        } else {
                            if (zzb3 == i6) {
                                obj = zzfrj.zzp(zzva);
                                i2 = i6;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzva);
                                int i9 = i7 + 1;
                                while (true) {
                                    int i10 = zzb2.zzb;
                                    if (i9 > 0) {
                                        break;
                                    }
                                    zzva zzva2 = (zzva) zza2.get(i9);
                                    if (zzva2.zzb() == 2 && zzva.zzc(zzva2)) {
                                        arrayList2.add(zzva2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    zzvi zzvi3 = zzvi;
                                }
                                i2 = 1;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i7++;
                        i6 = i2;
                        zzvi zzvi4 = zzvi;
                    }
                    i4++;
                    zzvi zzvi5 = zzvi;
                }
            }
            zzuz zzuz2 = zzuz;
            i3++;
            zzvi2 = zzvi;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((zzva) list.get(i11)).zzc;
        }
        zzva zzva3 = (zzva) list.get(0);
        return Pair.create(new zzvf(zzva3.zzb, iArr2, 0), Integer.valueOf(zzva3.zza));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.zzvg[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.google.android.gms.internal.ads.zzue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: com.google.android.gms.internal.ads.zzvh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.gms.internal.ads.zzvh} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzvi r24, int[][][] r25, int[] r26, com.google.android.gms.internal.ads.zzsa r27, com.google.android.gms.internal.ads.zzci r28) throws com.google.android.gms.internal.ads.zzgt {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.concurrent.atomic.AtomicReference r3 = r0.zzd
            java.lang.Object r3 = r3.get()
            com.google.android.gms.internal.ads.zzut r3 = (com.google.android.gms.internal.ads.zzut) r3
            r4 = 2
            com.google.android.gms.internal.ads.zzvf[] r5 = new com.google.android.gms.internal.ads.zzvf[r4]
            com.google.android.gms.internal.ads.zzuj r6 = new com.google.android.gms.internal.ads.zzuj
            r7 = r26
            r6.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzuk r7 = com.google.android.gms.internal.ads.zzuk.zza
            android.util.Pair r6 = zzq(r4, r1, r2, r6, r7)
            if (r6 == 0) goto L_0x002e
            java.lang.Object r7 = r6.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzvf r6 = (com.google.android.gms.internal.ads.zzvf) r6
            r5[r7] = r6
        L_0x002e:
            r6 = 0
            r7 = r6
        L_0x0030:
            r8 = 1
            if (r7 >= r4) goto L_0x0046
            int r9 = r1.zzc(r7)
            if (r9 != r4) goto L_0x0043
            com.google.android.gms.internal.ads.zzty r9 = r1.zzd(r7)
            int r9 = r9.zzc
            if (r9 <= 0) goto L_0x0043
            r7 = r8
            goto L_0x0047
        L_0x0043:
            int r7 = r7 + 1
            goto L_0x0030
        L_0x0046:
            r7 = r6
        L_0x0047:
            com.google.android.gms.internal.ads.zzuh r9 = new com.google.android.gms.internal.ads.zzuh
            r9.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzui r7 = com.google.android.gms.internal.ads.zzui.zza
            android.util.Pair r7 = zzq(r8, r1, r2, r9, r7)
            if (r7 == 0) goto L_0x0062
            java.lang.Object r9 = r7.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.zzvf r10 = (com.google.android.gms.internal.ads.zzvf) r10
            r5[r9] = r10
        L_0x0062:
            if (r7 != 0) goto L_0x0066
            r7 = 0
            goto L_0x007a
        L_0x0066:
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.zzvf r10 = (com.google.android.gms.internal.ads.zzvf) r10
            com.google.android.gms.internal.ads.zzck r10 = r10.zza
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzvf r7 = (com.google.android.gms.internal.ads.zzvf) r7
            int[] r7 = r7.zzb
            r7 = r7[r6]
            com.google.android.gms.internal.ads.zzad r7 = r10.zzb(r7)
            java.lang.String r7 = r7.zzd
        L_0x007a:
            com.google.android.gms.internal.ads.zzul r10 = new com.google.android.gms.internal.ads.zzul
            r10.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzum r7 = com.google.android.gms.internal.ads.zzum.zza
            r11 = 3
            android.util.Pair r7 = zzq(r11, r1, r2, r10, r7)
            if (r7 == 0) goto L_0x0096
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzvf r7 = (com.google.android.gms.internal.ads.zzvf) r7
            r5[r10] = r7
        L_0x0096:
            r7 = r6
        L_0x0097:
            if (r7 >= r4) goto L_0x0109
            int r10 = r1.zzc(r7)
            if (r10 == r4) goto L_0x0100
            if (r10 == r8) goto L_0x0100
            if (r10 == r11) goto L_0x0100
            com.google.android.gms.internal.ads.zzty r10 = r1.zzd(r7)
            r12 = r2[r7]
            r13 = r6
            r15 = r13
            r14 = 0
            r16 = 0
        L_0x00ae:
            int r11 = r10.zzc
            if (r13 >= r11) goto L_0x00ef
            com.google.android.gms.internal.ads.zzck r11 = r10.zzb(r13)
            r17 = r12[r13]
            r4 = r6
            r9 = r16
        L_0x00bb:
            int r6 = r11.zzb
            if (r4 > 0) goto L_0x00e5
            r6 = r17[r4]
            boolean r8 = r3.zzP
            boolean r6 = zzi(r6, r8)
            if (r6 == 0) goto L_0x00df
            com.google.android.gms.internal.ads.zzad r6 = r11.zzb(r4)
            com.google.android.gms.internal.ads.zzuq r8 = new com.google.android.gms.internal.ads.zzuq
            r2 = r17[r4]
            r8.<init>(r6, r2)
            if (r9 == 0) goto L_0x00dc
            int r2 = r8.compareTo(r9)
            if (r2 <= 0) goto L_0x00df
        L_0x00dc:
            r15 = r4
            r9 = r8
            r14 = r11
        L_0x00df:
            int r4 = r4 + 1
            r2 = r25
            r8 = 1
            goto L_0x00bb
        L_0x00e5:
            int r13 = r13 + 1
            r2 = r25
            r16 = r9
            r4 = 2
            r6 = 0
            r8 = 1
            goto L_0x00ae
        L_0x00ef:
            if (r14 != 0) goto L_0x00f3
            r2 = 0
            goto L_0x00fe
        L_0x00f3:
            com.google.android.gms.internal.ads.zzvf r2 = new com.google.android.gms.internal.ads.zzvf
            r4 = 1
            int[] r6 = new int[r4]
            r4 = 0
            r6[r4] = r15
            r2.<init>(r14, r6, r4)
        L_0x00fe:
            r5[r7] = r2
        L_0x0100:
            int r7 = r7 + 1
            r2 = r25
            r4 = 2
            r6 = 0
            r8 = 1
            r11 = 3
            goto L_0x0097
        L_0x0109:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = 0
            r6 = 2
        L_0x0110:
            if (r4 >= r6) goto L_0x011c
            com.google.android.gms.internal.ads.zzty r7 = r1.zzd(r4)
            zzp(r7, r3, r2)
            int r4 = r4 + 1
            goto L_0x0110
        L_0x011c:
            com.google.android.gms.internal.ads.zzty r4 = r24.zze()
            zzp(r4, r3, r2)
            r4 = 0
        L_0x0124:
            if (r4 >= r6) goto L_0x013b
            int r7 = r1.zzc(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            com.google.android.gms.internal.ads.zzcm r7 = (com.google.android.gms.internal.ads.zzcm) r7
            if (r7 != 0) goto L_0x0139
            int r4 = r4 + 1
            goto L_0x0124
        L_0x0139:
            r4 = 0
            throw r4
        L_0x013b:
            r4 = 0
            r2 = 0
        L_0x013d:
            if (r2 >= r6) goto L_0x0167
            com.google.android.gms.internal.ads.zzty r6 = r1.zzd(r2)
            boolean r7 = r3.zzg(r2, r6)
            if (r7 != 0) goto L_0x014a
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.internal.ads.zzux r7 = r3.zze(r2, r6)
            if (r7 == 0) goto L_0x015f
            int r7 = r4.length
            if (r7 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzvf r7 = new com.google.android.gms.internal.ads.zzvf
            r8 = 0
            com.google.android.gms.internal.ads.zzck r6 = r6.zzb(r8)
            r7.<init>(r6, r4, r8)
            r4 = r7
            goto L_0x0160
        L_0x015f:
            r4 = 0
        L_0x0160:
            r5[r2] = r4
        L_0x0162:
            int r2 = r2 + 1
            r4 = 0
            r6 = 2
            goto L_0x013d
        L_0x0167:
            r2 = r6
            r4 = 0
        L_0x0169:
            if (r4 >= r2) goto L_0x018b
            int r2 = r1.zzc(r4)
            boolean r6 = r3.zzf(r4)
            if (r6 != 0) goto L_0x0184
            com.google.android.gms.internal.ads.zzfro r6 = r3.zzC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r2 = 0
            goto L_0x0187
        L_0x0184:
            r2 = 0
            r5[r4] = r2
        L_0x0187:
            int r4 = r4 + 1
            r2 = 2
            goto L_0x0169
        L_0x018b:
            r2 = 0
            com.google.android.gms.internal.ads.zzud r4 = r0.zze
            com.google.android.gms.internal.ads.zzvu r12 = r23.zzl()
            com.google.android.gms.internal.ads.zzfrj r13 = com.google.android.gms.internal.ads.zzue.zzf(r5)
            r6 = 2
            com.google.android.gms.internal.ads.zzvg[] r14 = new com.google.android.gms.internal.ads.zzvg[r6]
            r15 = 0
        L_0x019a:
            if (r15 >= r6) goto L_0x01e3
            r6 = r5[r15]
            if (r6 == 0) goto L_0x01db
            int[] r8 = r6.zzb
            int r7 = r8.length
            if (r7 != 0) goto L_0x01a6
            goto L_0x01db
        L_0x01a6:
            r11 = 1
            if (r7 != r11) goto L_0x01c1
            com.google.android.gms.internal.ads.zzvh r7 = new com.google.android.gms.internal.ads.zzvh
            com.google.android.gms.internal.ads.zzck r6 = r6.zza
            r16 = 0
            r19 = r8[r16]
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r18 = r11
            goto L_0x01d8
        L_0x01c1:
            r16 = 0
            com.google.android.gms.internal.ads.zzck r7 = r6.zza
            r9 = 0
            java.lang.Object r6 = r13.get(r15)
            r17 = r6
            com.google.android.gms.internal.ads.zzfrj r17 = (com.google.android.gms.internal.ads.zzfrj) r17
            r6 = r4
            r10 = r12
            r18 = r11
            r11 = r17
            com.google.android.gms.internal.ads.zzue r7 = r6.zza(r7, r8, r9, r10, r11)
        L_0x01d8:
            r14[r15] = r7
            goto L_0x01df
        L_0x01db:
            r16 = 0
            r18 = 1
        L_0x01df:
            int r15 = r15 + 1
            r6 = 2
            goto L_0x019a
        L_0x01e3:
            r16 = 0
            com.google.android.gms.internal.ads.zzjv[] r4 = new com.google.android.gms.internal.ads.zzjv[r6]
            r5 = r16
        L_0x01e9:
            if (r5 >= r6) goto L_0x0216
            int r7 = r1.zzc(r5)
            boolean r8 = r3.zzf(r5)
            if (r8 != 0) goto L_0x0210
            com.google.android.gms.internal.ads.zzfro r8 = r3.zzC
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x0202
            goto L_0x0210
        L_0x0202:
            int r7 = r1.zzc(r5)
            r8 = -2
            if (r7 == r8) goto L_0x020d
            r7 = r14[r5]
            if (r7 == 0) goto L_0x0210
        L_0x020d:
            com.google.android.gms.internal.ads.zzjv r7 = com.google.android.gms.internal.ads.zzjv.zza
            goto L_0x0211
        L_0x0210:
            r7 = r2
        L_0x0211:
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x01e9
        L_0x0216:
            boolean r1 = r3.zzQ
            android.util.Pair r1 = android.util.Pair.create(r4, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zzb(com.google.android.gms.internal.ads.zzvi, int[][][], int[], com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzci):android.util.Pair");
    }

    public final zzut zzc() {
        return (zzut) this.zzd.get();
    }

    public final void zzg(zzuv zzuv) {
        zzut zzut = new zzut(zzuv);
        if (!((zzut) this.zzd.getAndSet(zzut)).equals(zzut)) {
            zzn();
        }
    }

    public final boolean zzh() {
        return true;
    }

    public zzve(Context context) {
        zzud zzud = new zzud();
        zzut zzc2 = zzut.zzc(context);
        this.zze = zzud;
        this.zzd = new AtomicReference(zzc2);
    }
}
