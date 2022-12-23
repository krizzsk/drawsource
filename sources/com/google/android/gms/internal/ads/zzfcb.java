package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfcb {
    /* access modifiers changed from: private */
    public zzl zza;
    /* access modifiers changed from: private */
    public zzq zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzff zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbkp zzh;
    /* access modifiers changed from: private */
    public zzw zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzbz zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbqs zzn;
    /* access modifiers changed from: private */
    public final zzfbr zzo = new zzfbr();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public zzemh zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    /* access modifiers changed from: private */
    public zzcd zzs;

    public final zzfcb zzA(zzbkp zzbkp) {
        this.zzh = zzbkp;
        return this;
    }

    public final zzfcb zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfcb zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfcb zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfcb zzE(zzl zzl2) {
        this.zza = zzl2;
        return this;
    }

    public final zzfcb zzF(zzff zzff) {
        this.zzd = zzff;
        return this;
    }

    public final zzfcd zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcd(this, (zzfcc) null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfcb zzQ(zzcd zzcd) {
        this.zzs = zzcd;
        return this;
    }

    public final zzl zze() {
        return this.zza;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzfbr zzo() {
        return this.zzo;
    }

    public final zzfcb zzp(zzfcd zzfcd) {
        this.zzo.zza(zzfcd.zzo.zza);
        this.zza = zzfcd.zzd;
        this.zzb = zzfcd.zze;
        this.zzs = zzfcd.zzr;
        this.zzc = zzfcd.zzf;
        this.zzd = zzfcd.zza;
        this.zzf = zzfcd.zzg;
        this.zzg = zzfcd.zzh;
        this.zzh = zzfcd.zzi;
        this.zzi = zzfcd.zzj;
        zzq(zzfcd.zzl);
        zzD(zzfcd.zzm);
        this.zzp = zzfcd.zzp;
        this.zzq = zzfcd.zzc;
        this.zzr = zzfcd.zzq;
        return this;
    }

    public final zzfcb zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfcb zzr(zzq zzq2) {
        this.zzb = zzq2;
        return this;
    }

    public final zzfcb zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfcb zzt(zzw zzw) {
        this.zzi = zzw;
        return this;
    }

    public final zzfcb zzu(zzemh zzemh) {
        this.zzq = zzemh;
        return this;
    }

    public final zzfcb zzv(zzbqs zzbqs) {
        this.zzn = zzbqs;
        this.zzd = new zzff(false, true, false);
        return this;
    }

    public final zzfcb zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfcb zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfcb zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfcb zzz(int i) {
        this.zzm = i;
        return this;
    }
}
