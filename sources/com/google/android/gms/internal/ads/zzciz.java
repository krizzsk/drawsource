package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzciz extends zzchi implements zzayy, zzaww, zzbai, zzasq, zzarg {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcio zze;
    private final zzary zzf;
    private final zzary zzg;
    private final zzaya zzh;
    private final zzchq zzi;
    private zzarj zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzchh zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final Object zzt = new Object();
    private final ArrayList zzu;
    private volatile zzcin zzv;
    private final Set zzw = new HashSet();

    public zzciz(Context context, zzchq zzchq, zzchr zzchr) {
        this.zzd = context;
        this.zzi = zzchq;
        this.zzm = new WeakReference(zzchr);
        this.zze = new zzcio();
        this.zzf = new zzazx(this.zzd, zzavt.zza, 0, zzs.zza, this, -1);
        this.zzg = new zzatf(zzavt.zza, (zzatt) null, true, zzs.zza, this);
        this.zzh = new zzaxw((zzayb) null);
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        int i = 0;
        zzarj zza = zzark.zza(new zzary[]{this.zzg, this.zzf}, this.zzh, this.zze);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzchr == null || zzchr.zzt() == null) ? "" : zzchr.zzt();
        this.zzs = zzchr != null ? zzchr.zzh() : i;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzchr != null && zzchr.zzg() > 0) {
            this.zzj.zzp(zzchr.zzg());
        }
        if (zzchr != null && zzchr.zzf() > 0) {
            this.zzj.zzo(zzchr.zzf());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) zzay.zzc().zzb(zzbhz.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzY()) {
            return (long) this.zzo;
        }
        return 0;
    }

    public final long zzB() {
        if (zzY()) {
            return this.zzv.zzf();
        }
        synchronized (this.zzt) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzq;
                Map zze2 = ((zzays) this.zzu.remove(0)).zze();
                long j2 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfoc.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzq = j + j2;
            }
        }
        return this.zzq;
    }

    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzE() {
        zzarj zzarj = this.zzj;
        if (zzarj != null) {
            zzarj.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    public final void zzF(long j) {
        this.zzj.zzm(j);
    }

    public final void zzG(int i) {
        this.zze.zzf(i);
    }

    public final void zzH(int i) {
        this.zze.zzg(i);
    }

    public final void zzI(zzchh zzchh) {
        this.zzn = zzchh;
    }

    public final void zzJ(int i) {
        this.zze.zzh(i);
    }

    public final void zzK(int i) {
        this.zze.zzi(i);
    }

    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zze(i, !z);
            }
        }
    }

    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzw) {
            zzcil zzcil = (zzcil) weakReference.get();
            if (zzcil != null) {
                zzcil.zzh(i);
            }
        }
    }

    public final void zzO(Surface surface, boolean z) {
        zzarj zzarj = this.zzj;
        if (zzarj != null) {
            zzari zzari = new zzari(this.zzf, 1, surface);
            if (z) {
                zzarj.zzf(zzari);
                return;
            }
            zzarj.zzn(zzari);
        }
    }

    public final void zzP(float f, boolean z) {
        if (this.zzj != null) {
            zzari zzari = new zzari(this.zzg, 2, Float.valueOf(f));
            this.zzj.zzn(zzari);
        }
    }

    public final void zzQ() {
        this.zzj.zzr();
    }

    public final boolean zzR() {
        return this.zzj != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzS(String str, boolean z) {
        zzciz zzciz = true != z ? null : this;
        zzchq zzchq = this.zzi;
        zzcil zzcil = new zzcil(str, zzciz, zzchq.zzd, zzchq.zzf, zzchq.zzi);
        this.zzw.add(new WeakReference(zzcil));
        return zzcil;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzT(String str, boolean z) {
        zzciz zzciz = true != z ? null : this;
        zzchq zzchq = this.zzi;
        return new zzayn(str, (zzazj) null, zzciz, zzchq.zzd, zzchq.zzf, true, (zzayr) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzU(zzayi zzayi) {
        return new zzcin(this.zzd, zzayi.zza(), this.zzr, this.zzs, this, new zzciv(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(boolean z, long j) {
        zzchh zzchh = this.zzn;
        if (zzchh != null) {
            zzchh.zzi(z, j);
        }
    }

    public final void zzW(zzayj zzayj, int i) {
        this.zzo += i;
    }

    /* renamed from: zzX */
    public final void zzk(zzayj zzayj, zzayl zzayl) {
        if (zzayj instanceof zzays) {
            synchronized (this.zzt) {
                this.zzu.add((zzays) zzayj);
            }
        } else if (zzayj instanceof zzcin) {
            this.zzv = (zzcin) zzayj;
            zzchr zzchr = (zzchr) this.zzm.get();
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr != null && this.zzv.zzh()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                zzs.zza.post(new zzciw(zzchr, hashMap));
            }
        }
    }

    public final void zza(boolean z) {
    }

    public final void zzb(zzarx zzarx) {
    }

    public final void zzc(zzarf zzarf) {
        zzchh zzchh = this.zzn;
        if (zzchh != null) {
            zzchh.zzk("onPlayerError", zzarf);
        }
    }

    public final void zzd(boolean z, int i) {
        zzchh zzchh = this.zzn;
        if (zzchh != null) {
            zzchh.zzm(i);
        }
    }

    public final void zze() {
    }

    public final void zzf(zzase zzase, Object obj) {
    }

    public final void zzg(zzaxq zzaxq, zzayc zzayc) {
    }

    public final void zzh(zzart zzart) {
        zzchr zzchr = (zzchr) this.zzm.get();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr != null && zzart != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzart.zze);
            hashMap.put("audioSampleMime", zzart.zzf);
            hashMap.put("audioCodec", zzart.zzc);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzi(IOException iOException) {
        zzchh zzchh = this.zzn;
        if (zzchh == null) {
            return;
        }
        if (this.zzi.zzl) {
            zzchh.zzl("onLoadException", iOException);
        } else {
            zzchh.zzk("onLoadError", iOException);
        }
    }

    public final /* synthetic */ void zzj(Object obj, int i) {
        this.zzo += i;
    }

    public final void zzl(int i, long j) {
        this.zzp += i;
    }

    public final void zzm(Surface surface) {
        zzchh zzchh = this.zzn;
        if (zzchh != null) {
            zzchh.zzv();
        }
    }

    public final void zzn(zzart zzart) {
        zzchr zzchr = (zzchr) this.zzm.get();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr != null && zzart != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzart.zzl));
            hashMap.put("bitRate", String.valueOf(zzart.zzb));
            int i = zzart.zzj;
            int i2 = zzart.zzk;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzart.zze);
            hashMap.put("videoSampleMime", zzart.zzf);
            hashMap.put("videoCodec", zzart.zzc);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzo(int i, int i2, int i3, float f) {
        zzchh zzchh = this.zzn;
        if (zzchh != null) {
            zzchh.zzC(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzbB)).booleanValue() == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaxb zzp(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzawx r9 = new com.google.android.gms.internal.ads.zzawx
            boolean r0 = r10.zzl
            if (r0 == 0) goto L_0x0023
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0023
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcip r0 = new com.google.android.gms.internal.ads.zzcip
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0094
        L_0x0023:
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzbK
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzbB
            com.google.android.gms.internal.ads.zzbhx r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
        L_0x0048:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r2 = r0.zzo
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzciq r0 = new com.google.android.gms.internal.ads.zzciq
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x005c:
            int r0 = r0.zzi
            if (r0 <= 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzcir r0 = new com.google.android.gms.internal.ads.zzcir
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x0066:
            com.google.android.gms.internal.ads.zzcis r0 = new com.google.android.gms.internal.ads.zzcis
            r0.<init>(r10, r12, r1)
        L_0x006b:
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.zzcit r12 = new com.google.android.gms.internal.ads.zzcit
            r12.<init>(r10, r0)
            r0 = r12
        L_0x0077:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzciu r1 = new com.google.android.gms.internal.ads.zzciu
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0094:
            com.google.android.gms.internal.ads.zzbhr r12 = com.google.android.gms.internal.ads.zzbhz.zzm
            com.google.android.gms.internal.ads.zzbhx r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcix r12 = com.google.android.gms.internal.ads.zzcix.zza
            goto L_0x00ab
        L_0x00a9:
            com.google.android.gms.internal.ads.zzciy r12 = com.google.android.gms.internal.ads.zzciy.zza
        L_0x00ab:
            r3 = r12
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfnw r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciz.zzp(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzaxb");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzayj zzq(String str, boolean z) {
        zzciz zzciz = true != z ? null : this;
        zzchq zzchq = this.zzi;
        return new zzcjd(str, zzciz, zzchq.zzd, zzchq.zzf, zzchq.zzp, zzchq.zzq);
    }

    public final int zzr() {
        return this.zzp;
    }

    public final int zzt() {
        return this.zzj.zza();
    }

    public final long zzv() {
        return this.zzj.zzb();
    }

    public final long zzw() {
        return (long) this.zzo;
    }

    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min((long) this.zzo, this.zzv.zze());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzj.zzc();
    }

    public final long zzz() {
        return this.zzj.zzd();
    }

    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaxb zzaxb;
        if (this.zzj != null) {
            this.zzk = byteBuffer;
            this.zzl = z;
            int length = uriArr.length;
            if (length == 1) {
                zzaxb = zzp(uriArr[0], str);
            } else {
                zzaxb[] zzaxbArr = new zzaxb[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzaxbArr[i] = zzp(uriArr[i], str);
                }
                zzaxb = new zzaxf(zzaxbArr);
            }
            this.zzj.zzj(zzaxb);
            zzb.incrementAndGet();
        }
    }
}
