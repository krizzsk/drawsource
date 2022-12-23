package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcjn;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzefc;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzcg zzA;
    private final zzcjn zzB;
    private final zzcgi zzC;
    private final zza zzb;
    private final zzm zzc;
    private final zzs zzd;
    private final zzclu zze;
    private final zzaa zzf;
    private final zzbbh zzg;
    private final zzcer zzh;
    private final zzab zzi;
    private final zzbcu zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbif zzm;
    private final zzaw zzn;
    private final zzcad zzo;
    private final zzbrg zzp;
    private final zzcgb zzq;
    private final zzbsr zzr;
    private final zzbv zzs;
    private final zzx zzt;
    private final zzy zzu;
    private final zzbtw zzv;
    private final zzbw zzw;
    private final zzbxp zzx;
    private final zzbdj zzy;
    private final zzcdn zzz;

    protected zzt() {
        zza zza2 = new zza();
        zzm zzm2 = new zzm();
        zzs zzs2 = new zzs();
        zzclu zzclu = new zzclu();
        zzaa zzm3 = zzaa.zzm(Build.VERSION.SDK_INT);
        zzbbh zzbbh = new zzbbh();
        zzcer zzcer = new zzcer();
        zzab zzab = new zzab();
        zzbcu zzbcu = new zzbcu();
        Clock instance = DefaultClock.getInstance();
        zze zze2 = new zze();
        zzbif zzbif = new zzbif();
        zzaw zzaw = new zzaw();
        zzcad zzcad = new zzcad();
        zzbrg zzbrg = new zzbrg();
        zzcgb zzcgb = new zzcgb();
        zzbsr zzbsr = new zzbsr();
        zzbv zzbv = new zzbv();
        zzx zzx2 = new zzx();
        zzy zzy2 = new zzy();
        zzbtw zzbtw = new zzbtw();
        zzbw zzbw = new zzbw();
        zzefc zzefc = new zzefc();
        zzbdj zzbdj = new zzbdj();
        zzcdn zzcdn = new zzcdn();
        zzcg zzcg = new zzcg();
        zzcjn zzcjn = new zzcjn();
        zzcgi zzcgi = new zzcgi();
        this.zzb = zza2;
        this.zzc = zzm2;
        this.zzd = zzs2;
        this.zze = zzclu;
        this.zzf = zzm3;
        this.zzg = zzbbh;
        this.zzh = zzcer;
        this.zzi = zzab;
        this.zzj = zzbcu;
        this.zzk = instance;
        this.zzl = zze2;
        this.zzm = zzbif;
        this.zzn = zzaw;
        this.zzo = zzcad;
        this.zzp = zzbrg;
        this.zzq = zzcgb;
        this.zzr = zzbsr;
        this.zzs = zzbv;
        this.zzt = zzx2;
        this.zzu = zzy2;
        this.zzv = zzbtw;
        this.zzw = zzbw;
        this.zzx = zzefc;
        this.zzy = zzbdj;
        this.zzz = zzcdn;
        this.zzA = zzcg;
        this.zzB = zzcjn;
        this.zzC = zzcgi;
    }

    public static Clock zzA() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzbbh zzb() {
        return zza.zzg;
    }

    public static zzbcu zzc() {
        return zza.zzj;
    }

    public static zzbdj zzd() {
        return zza.zzy;
    }

    public static zzbif zze() {
        return zza.zzm;
    }

    public static zzbsr zzf() {
        return zza.zzr;
    }

    public static zzbtw zzg() {
        return zza.zzv;
    }

    public static zzbxp zzh() {
        return zza.zzx;
    }

    public static zza zzi() {
        return zza.zzb;
    }

    public static zzm zzj() {
        return zza.zzc;
    }

    public static zzx zzk() {
        return zza.zzt;
    }

    public static zzy zzl() {
        return zza.zzu;
    }

    public static zzcad zzm() {
        return zza.zzo;
    }

    public static zzcdn zzn() {
        return zza.zzz;
    }

    public static zzcer zzo() {
        return zza.zzh;
    }

    public static zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzs;
    }

    public static zzbw zzu() {
        return zza.zzw;
    }

    public static zzcg zzv() {
        return zza.zzA;
    }

    public static zzcgb zzw() {
        return zza.zzq;
    }

    public static zzcgi zzx() {
        return zza.zzC;
    }

    public static zzcjn zzy() {
        return zza.zzB;
    }

    public static zzclu zzz() {
        return zza.zze;
    }
}
