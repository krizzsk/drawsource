package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdto {
    private final zzdbr zza;
    private final zzdje zzb;
    /* access modifiers changed from: private */
    public final zzdda zzc;
    private final zzddn zzd;
    private final zzddz zze;
    private final zzdgm zzf;
    private final Executor zzg;
    private final zzdjb zzh;
    private final zzcud zzi;
    private final zzb zzj;
    private final zzccj zzk;
    private final zzaoc zzl;
    /* access modifiers changed from: private */
    public final zzdgd zzm;
    private final zzees zzn;
    private final zzfii zzo;
    private final zzdwh zzp;
    private final zzfgp zzq;

    public zzdto(zzdbr zzdbr, zzdda zzdda, zzddn zzddn, zzddz zzddz, zzdgm zzdgm, Executor executor, zzdjb zzdjb, zzcud zzcud, zzb zzb2, zzccj zzccj, zzaoc zzaoc, zzdgd zzdgd, zzees zzees, zzfii zzfii, zzdwh zzdwh, zzfgp zzfgp, zzdje zzdje) {
        this.zza = zzdbr;
        this.zzc = zzdda;
        this.zzd = zzddn;
        this.zze = zzddz;
        this.zzf = zzdgm;
        this.zzg = executor;
        this.zzh = zzdjb;
        this.zzi = zzcud;
        this.zzj = zzb2;
        this.zzk = zzccj;
        this.zzl = zzaoc;
        this.zzm = zzdgd;
        this.zzn = zzees;
        this.zzo = zzfii;
        this.zzp = zzdwh;
        this.zzq = zzfgp;
        this.zzb = zzdje;
    }

    public static final zzfvl zzj(zzcli zzcli, String str, String str2) {
        zzcga zzcga = new zzcga();
        zzcli.zzP().zzz(new zzdtm(zzcga));
        zzcli.zzad(str, str2, (String) null);
        return zzcga;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcli, zzcli zzcli2, Map map) {
        this.zzi.zzh(zzcli);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        return false;
    }

    public final void zzi(zzcli zzcli, boolean z, zzbop zzbop) {
        zzany zzc2;
        zzcli zzcli2 = zzcli;
        zzcmv zzP = zzcli.zzP();
        zzdtf zzdtf = r4;
        zzdtf zzdtf2 = new zzdtf(this);
        zzddn zzddn = this.zzd;
        zzddz zzddz = this.zze;
        zzdtg zzdtg = r7;
        zzdtg zzdtg2 = new zzdtg(this);
        zzdth zzdth = r10;
        zzdth zzdth2 = new zzdth(this);
        zzb zzb2 = this.zzj;
        zzdtn zzdtn = r12;
        zzdtn zzdtn2 = new zzdtn(this);
        zzP.zzL(zzdtf, zzddn, zzddz, zzdtg, zzdth, z, zzbop, zzb2, zzdtn, this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, (zzbon) null, this.zzb);
        zzcli zzcli3 = zzcli;
        zzcli3.setOnTouchListener(new zzdti(this));
        zzcli3.setOnClickListener(new zzdtj(this));
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcf)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzn((View) zzcli3);
        }
        this.zzh.zzj(zzcli3, this.zzg);
        this.zzh.zzj(new zzdtk(zzcli3), this.zzg);
        this.zzh.zza((View) zzcli3);
        zzcli3.zzaf("/trackActiveViewUnit", new zzdtl(this, zzcli3));
        this.zzi.zzi(zzcli3);
    }
}
