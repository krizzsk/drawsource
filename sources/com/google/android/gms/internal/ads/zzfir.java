package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfir extends zzfin {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfip zzb;
    private final zzfio zzc;
    private final List zzd = new ArrayList();
    private zzfkm zze;
    private zzfjp zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi;

    zzfir(zzfio zzfio, zzfip zzfip) {
        this.zzc = zzfio;
        this.zzb = zzfip;
        this.zzi = UUID.randomUUID().toString();
        zzk((View) null);
        if (zzfip.zzd() == zzfiq.HTML || zzfip.zzd() == zzfiq.JAVASCRIPT) {
            this.zzf = new zzfjq(zzfip.zza());
        } else {
            this.zzf = new zzfjs(zzfip.zzi(), (String) null);
        }
        this.zzf.zzj();
        zzfjc.zza().zzd(this);
        zzfji.zza().zzd(this.zzf.zza(), zzfio.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfkm(view);
    }

    public final void zzb(View view, zzfit zzfit, String str) {
        zzfjf zzfjf;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfjf = null;
                    break;
                }
                zzfjf = (zzfjf) it.next();
                if (zzfjf.zzb().get() == view) {
                    break;
                }
            }
            if (zzfjf == null) {
                this.zzd.add(new zzfjf(view, zzfit, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    public final void zzc() {
        if (!this.zzh) {
            this.zze.clear();
            if (!this.zzh) {
                this.zzd.clear();
            }
            this.zzh = true;
            zzfji.zza().zzc(this.zzf.zza());
            zzfjc.zza().zze(this);
            this.zzf.zzc();
            this.zzf = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzh && zzf() != view) {
            zzk(view);
            this.zzf.zzb();
            Collection<zzfir> zzc2 = zzfjc.zza().zzc();
            if (zzc2 != null && zzc2.size() > 0) {
                for (zzfir zzfir : zzc2) {
                    if (zzfir != this && zzfir.zzf() == view) {
                        zzfir.zze.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zzg) {
            this.zzg = true;
            zzfjc.zza().zzf(this);
            this.zzf.zzh(zzfjj.zzb().zza());
            this.zzf.zzf(this, this.zzb);
        }
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfjp zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
