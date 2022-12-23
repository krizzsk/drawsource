package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeco extends zzbzm {
    private final Context zza;
    private final Executor zzb;
    private final zzfvm zzc;
    private final zzcag zzd;
    private final zzcsm zze;
    private final ArrayDeque zzf;
    private final zzfhu zzg;
    private final zzcah zzh;
    private final zzect zzi;

    public zzeco(Context context, Executor executor, zzfvm zzfvm, zzcah zzcah, zzcsm zzcsm, zzcag zzcag, ArrayDeque arrayDeque, zzect zzect, zzfhu zzfhu, byte[] bArr) {
        zzbhz.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvm;
        this.zzh = zzcah;
        this.zzd = zzcag;
        this.zze = zzcsm;
        this.zzf = arrayDeque;
        this.zzi = zzect;
        this.zzg = zzfhu;
    }

    private final synchronized zzecl zzl(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzecl zzecl = (zzecl) it.next();
            if (zzecl.zzd.equals(str)) {
                it.remove();
                return zzecl;
            }
        }
        return null;
    }

    private final synchronized zzecl zzm(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzecl zzecl = (zzecl) it.next();
            if (zzecl.zzc.equals(str)) {
                it.remove();
                return zzecl;
            }
        }
        return null;
    }

    private static zzfvl zzn(zzfvl zzfvl, zzfgf zzfgf, zzbta zzbta, zzfhs zzfhs, zzfhh zzfhh) {
        zzbsq zza2 = zzbta.zza("AFMA_getAdDictionary", zzbsx.zza, zzecf.zza);
        zzfhr.zzd(zzfvl, zzfhh);
        zzffk zza3 = zzfgf.zzb(zzffz.BUILD_URL, zzfvl).zzf(zza2).zza();
        zzfhr.zzc(zza3, zzfhs, zzfhh);
        return zza3;
    }

    private static zzfvl zzo(zzbzv zzbzv, zzfgf zzfgf, zzety zzety) {
        zzebz zzebz = new zzebz(zzety);
        return zzfgf.zzb(zzffz.GMS_SIGNALS, zzfvc.zzi(zzbzv.zza)).zzf(zzebz).zze(zzeca.zza).zza();
    }

    private final synchronized void zzp(zzecl zzecl) {
        zzq();
        this.zzf.addLast(zzecl);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) zzbjv.zzc.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzr(zzfvl zzfvl, zzbzr zzbzr) {
        zzfvc.zzr(zzfvc.zzn(zzfvl, new zzeci(this), zzcfv.zza), new zzeck(this, zzbzr), zzcfv.zzf);
    }

    public final zzfvl zzb(zzbzv zzbzv, int i) {
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        zzfdv zzfdv = zzbzv.zzi;
        if (zzfdv == null) {
            return zzfvc.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfdv.zzc == 0 || zzfdv.zzd == 0) {
            return zzfvc.zzh(new Exception("Caching is disabled."));
        }
        zzbta zzb2 = zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        zzety zzp = this.zze.zzp(zzbzv, i);
        zzfgf zzc2 = zzp.zzc();
        zzfvl zzo = zzo(zzbzv, zzc2, zzp);
        zzfhs zzd2 = zzp.zzd();
        zzfhh zza2 = zzfhg.zza(this.zza, 9);
        zzfvl zzn = zzn(zzo, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzffz.GET_URL_AND_CACHE_KEY, zzo, zzn).zza(new zzece(this, zzn, zzo, zzbzv, zza2)).zza();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvl zzc(com.google.android.gms.internal.ads.zzbzv r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzbsr r2 = com.google.android.gms.ads.internal.zzt.zzf()
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzcfo r4 = com.google.android.gms.internal.ads.zzcfo.zza()
            com.google.android.gms.internal.ads.zzfhu r5 = r0.zzg
            com.google.android.gms.internal.ads.zzbta r2 = r2.zzb(r3, r4, r5)
            com.google.android.gms.internal.ads.zzcsm r3 = r0.zze
            r8 = r18
            com.google.android.gms.internal.ads.zzety r3 = r3.zzp(r1, r8)
            com.google.android.gms.internal.ads.zzbst r4 = com.google.android.gms.internal.ads.zzecn.zza
            com.google.android.gms.internal.ads.zzbss r5 = com.google.android.gms.internal.ads.zzbsx.zzb
            java.lang.String r6 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbsq r10 = r2.zza(r6, r4, r5)
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjv.zza
            java.lang.Object r4 = r4.zze()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 != 0) goto L_0x0046
            java.lang.String r4 = r1.zzj
            if (r4 == 0) goto L_0x0044
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
        L_0x0044:
            r11 = r5
            goto L_0x0073
        L_0x0046:
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjv.zzd
            java.lang.Object r4 = r4.zze()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r1.zzh
            com.google.android.gms.internal.ads.zzecl r4 = r0.zzm(r4)
        L_0x005a:
            r5 = r4
            goto L_0x006b
        L_0x005c:
            java.lang.String r4 = r1.zzj
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = r1.zzj
            com.google.android.gms.internal.ads.zzecl r4 = r0.zzl(r4)
            goto L_0x005a
        L_0x006b:
            if (r5 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            goto L_0x0044
        L_0x0073:
            if (r11 != 0) goto L_0x007e
            android.content.Context r4 = r0.zza
            r5 = 9
            com.google.android.gms.internal.ads.zzfhh r4 = com.google.android.gms.internal.ads.zzfhg.zza(r4, r5)
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.ads.zzfhh r4 = r11.zze
        L_0x0080:
            r12 = r4
            com.google.android.gms.internal.ads.zzfhs r13 = r3.zzd()
            android.os.Bundle r4 = r1.zza
            java.lang.String r5 = "ad_types"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzecv r14 = new com.google.android.gms.internal.ads.zzecv
            java.lang.String r4 = r1.zzg
            r14.<init>(r4, r13, r12)
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzcfo r4 = r1.zzb
            java.lang.String r6 = r4.zza
            com.google.android.gms.internal.ads.zzcah r7 = r0.zzh
            com.google.android.gms.internal.ads.zzecs r15 = new com.google.android.gms.internal.ads.zzecs
            r9 = 0
            r4 = r15
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.gms.internal.ads.zzfgf r4 = r3.zzc()
            android.content.Context r5 = r0.zza
            r6 = 11
            com.google.android.gms.internal.ads.zzfhh r5 = com.google.android.gms.internal.ads.zzfhg.zza(r5, r6)
            r6 = 10
            r7 = 1
            r8 = 0
            r9 = 2
            if (r11 != 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzfvl r1 = zzo(r1, r4, r3)
            com.google.android.gms.internal.ads.zzfvl r2 = zzn(r1, r4, r2, r13, r12)
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzfhh r3 = com.google.android.gms.internal.ads.zzfhg.zza(r3, r6)
            com.google.android.gms.internal.ads.zzffz r6 = com.google.android.gms.internal.ads.zzffz.HTTP
            com.google.android.gms.internal.ads.zzfvl[] r11 = new com.google.android.gms.internal.ads.zzfvl[r9]
            r11[r8] = r2
            r11[r7] = r1
            com.google.android.gms.internal.ads.zzffn r6 = r4.zza(r6, r11)
            com.google.android.gms.internal.ads.zzecc r11 = new com.google.android.gms.internal.ads.zzecc
            r11.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzffw r6 = r6.zza(r11)
            com.google.android.gms.internal.ads.zzffw r6 = r6.zze(r14)
            com.google.android.gms.internal.ads.zzfhn r11 = new com.google.android.gms.internal.ads.zzfhn
            r11.<init>(r3)
            com.google.android.gms.internal.ads.zzffw r6 = r6.zze(r11)
            com.google.android.gms.internal.ads.zzffw r6 = r6.zze(r15)
            com.google.android.gms.internal.ads.zzffk r6 = r6.zza()
            com.google.android.gms.internal.ads.zzfhr.zza(r6, r13, r3)
            com.google.android.gms.internal.ads.zzfhr.zzd(r6, r5)
            com.google.android.gms.internal.ads.zzffz r3 = com.google.android.gms.internal.ads.zzffz.PRE_PROCESS
            r11 = 3
            com.google.android.gms.internal.ads.zzfvl[] r11 = new com.google.android.gms.internal.ads.zzfvl[r11]
            r11[r8] = r1
            r11[r7] = r2
            r11[r9] = r6
            com.google.android.gms.internal.ads.zzffn r3 = r4.zza(r3, r11)
            com.google.android.gms.internal.ads.zzecd r4 = new com.google.android.gms.internal.ads.zzecd
            r4.<init>(r6, r1, r2)
            com.google.android.gms.internal.ads.zzffw r1 = r3.zza(r4)
            com.google.android.gms.internal.ads.zzffw r1 = r1.zzf(r10)
            com.google.android.gms.internal.ads.zzffk r1 = r1.zza()
            goto L_0x016f
        L_0x011a:
            com.google.android.gms.internal.ads.zzecu r1 = new com.google.android.gms.internal.ads.zzecu
            org.json.JSONObject r2 = r11.zzb
            com.google.android.gms.internal.ads.zzbzy r3 = r11.zza
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzfhh r2 = com.google.android.gms.internal.ads.zzfhg.zza(r2, r6)
            com.google.android.gms.internal.ads.zzffz r3 = com.google.android.gms.internal.ads.zzffz.HTTP
            com.google.android.gms.internal.ads.zzfvl r1 = com.google.android.gms.internal.ads.zzfvc.zzi(r1)
            com.google.android.gms.internal.ads.zzffw r1 = r4.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzffw r1 = r1.zze(r14)
            com.google.android.gms.internal.ads.zzfhn r3 = new com.google.android.gms.internal.ads.zzfhn
            r3.<init>(r2)
            com.google.android.gms.internal.ads.zzffw r1 = r1.zze(r3)
            com.google.android.gms.internal.ads.zzffw r1 = r1.zze(r15)
            com.google.android.gms.internal.ads.zzffk r1 = r1.zza()
            com.google.android.gms.internal.ads.zzfhr.zza(r1, r13, r2)
            com.google.android.gms.internal.ads.zzfvl r2 = com.google.android.gms.internal.ads.zzfvc.zzi(r11)
            com.google.android.gms.internal.ads.zzfhr.zzd(r1, r5)
            com.google.android.gms.internal.ads.zzffz r3 = com.google.android.gms.internal.ads.zzffz.PRE_PROCESS
            com.google.android.gms.internal.ads.zzfvl[] r6 = new com.google.android.gms.internal.ads.zzfvl[r9]
            r6[r8] = r1
            r6[r7] = r2
            com.google.android.gms.internal.ads.zzffn r3 = r4.zza(r3, r6)
            com.google.android.gms.internal.ads.zzech r4 = new com.google.android.gms.internal.ads.zzech
            r4.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzffw r1 = r3.zza(r4)
            com.google.android.gms.internal.ads.zzffw r1 = r1.zzf(r10)
            com.google.android.gms.internal.ads.zzffk r1 = r1.zza()
        L_0x016f:
            com.google.android.gms.internal.ads.zzfhr.zza(r1, r13, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeco.zzc(com.google.android.gms.internal.ads.zzbzv, int):com.google.android.gms.internal.ads.zzfvl");
    }

    public final zzfvl zzd(zzbzv zzbzv, int i) {
        zzbta zzb2 = zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        if (!((Boolean) zzbka.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Signal collection disabled."));
        }
        zzety zzp = this.zze.zzp(zzbzv, i);
        zzetj zza2 = zzp.zza();
        zzbsq zza3 = zzb2.zza("google.afma.request.getSignals", zzbsx.zza, zzbsx.zzb);
        zzfhh zza4 = zzfhg.zza(this.zza, 22);
        zzffk zza5 = zzp.zzc().zzb(zzffz.GET_SIGNALS, zzfvc.zzi(zzbzv.zza)).zze(new zzfhn(zza4)).zzf(new zzecg(zza2)).zzb(zzffz.JS_SIGNALS).zzf(zza3).zza();
        zzfhs zzd2 = zzp.zzd();
        zzd2.zzd(zzbzv.zza.getStringArrayList("ad_types"));
        zzfhr.zzb(zza5, zzd2, zza4);
        return zza5;
    }

    public final void zze(zzbzv zzbzv, zzbzr zzbzr) {
        zzr(zzb(zzbzv, Binder.getCallingUid()), zzbzr);
    }

    public final void zzf(zzbzv zzbzv, zzbzr zzbzr) {
        zzr(zzd(zzbzv, Binder.getCallingUid()), zzbzr);
    }

    public final void zzg(zzbzv zzbzv, zzbzr zzbzr) {
        zzfvl zzc2 = zzc(zzbzv, Binder.getCallingUid());
        zzr(zzc2, zzbzr);
        if (((Boolean) zzbjn.zzg.zze()).booleanValue()) {
            zzc2.zzc(new zzecb(this), this.zzc);
        } else {
            zzc2.zzc(new zzecb(this), this.zzb);
        }
    }

    public final void zzh(String str, zzbzr zzbzr) {
        zzr(zzi(str), zzbzr);
    }

    public final zzfvl zzi(String str) {
        zzecl zzecl;
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        zzecj zzecj = new zzecj(this);
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            zzecl = zzm(str);
        } else {
            zzecl = zzl(str);
        }
        if (zzecl == null) {
            return zzfvc.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfvc.zzi(zzecj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(zzfvl zzfvl, zzfvl zzfvl2, zzbzv zzbzv, zzfhh zzfhh) throws Exception {
        String zzc2 = ((zzbzy) zzfvl.get()).zzc();
        String str = zzbzv.zzh;
        zzp(new zzecl((zzbzy) zzfvl.get(), (JSONObject) zzfvl2.get(), str, zzc2, zzfhh));
        return new ByteArrayInputStream(zzc2.getBytes(zzfoi.zzc));
    }
}
