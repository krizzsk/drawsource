package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdrl extends zzblu {
    private final Context zza;
    private final zzdnh zzb;
    private zzdoh zzc;
    /* access modifiers changed from: private */
    public zzdnc zzd;

    public zzdrl(Context context, zzdnh zzdnh, zzdoh zzdoh, zzdnc zzdnc) {
        this.zza = context;
        this.zzb = zzdnh;
        this.zzc = zzdoh;
        this.zzd = zzdnc;
    }

    public final zzdk zze() {
        return this.zzb.zzj();
    }

    public final zzblb zzf(String str) {
        return (zzblb) this.zzb.zzh().get(str);
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzh() {
        return this.zzb.zzy();
    }

    public final String zzi(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzj() {
        SimpleArrayMap zzh = this.zzb.zzh();
        SimpleArrayMap zzi = this.zzb.zzi();
        String[] strArr = new String[(zzh.size() + zzi.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzh.size()) {
            strArr[i3] = (String) zzh.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzi.size()) {
            strArr[i3] = (String) zzi.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final void zzk() {
        zzdnc zzdnc = this.zzd;
        if (zzdnc != null) {
            zzdnc.zzV();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzl() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            zze.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzA)) {
            zze.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdnc zzdnc = this.zzd;
            if (zzdnc != null) {
                zzdnc.zzq(zzA, false);
            }
        }
    }

    public final void zzm(String str) {
        zzdnc zzdnc = this.zzd;
        if (zzdnc != null) {
            zzdnc.zzy(str);
        }
    }

    public final void zzn() {
        zzdnc zzdnc = this.zzd;
        if (zzdnc != null) {
            zzdnc.zzB();
        }
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        zzdnc zzdnc;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdnc = this.zzd) != null) {
            zzdnc.zzC((View) unwrap);
        }
    }

    public final boolean zzp() {
        zzdnc zzdnc = this.zzd;
        if ((zzdnc == null || zzdnc.zzO()) && this.zzb.zzq() != null && this.zzb.zzr() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        zzdoh zzdoh;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdoh = this.zzc) == null || !zzdoh.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzr().zzaq(new zzdrk(this));
        return true;
    }

    public final boolean zzr() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu != null) {
            zzt.zzh().zzd(zzu);
            if (this.zzb.zzq() == null) {
                return true;
            }
            this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
            return true;
        }
        zze.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
