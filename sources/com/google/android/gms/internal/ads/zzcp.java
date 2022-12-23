package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzcp {
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    @Deprecated
    public static final zzl zzc = zzcn.zza;
    public final boolean zzA;
    public final zzfrm zzB;
    public final zzfro zzC;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrj zzo;
    public final int zzp;
    public final zzfrj zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfrj zzu;
    public final zzfrj zzv;
    public final int zzw;
    public final int zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcp zzcp = new zzcp(new zzco());
        zza = zzcp;
        zzb = zzcp;
    }

    protected zzcp(zzco zzco) {
        this.zzl = zzco.zze;
        this.zzm = zzco.zzf;
        this.zzn = zzco.zzg;
        this.zzo = zzco.zzh;
        this.zzp = 0;
        this.zzq = zzco.zzi;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = zzco.zzl;
        this.zzv = zzco.zzm;
        this.zzw = zzco.zzn;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        this.zzB = zzfrm.zzc(zzco.zzo);
        this.zzC = zzfro.zzl(zzco.zzp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcp = (zzcp) obj;
            return this.zzn == zzcp.zzn && this.zzl == zzcp.zzl && this.zzm == zzcp.zzm && this.zzo.equals(zzcp.zzo) && this.zzq.equals(zzcp.zzq) && this.zzu.equals(zzcp.zzu) && this.zzv.equals(zzcp.zzv) && this.zzw == zzcp.zzw && this.zzB.equals(zzcp.zzB) && this.zzC.equals(zzcp.zzC);
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - true) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 28629151) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
