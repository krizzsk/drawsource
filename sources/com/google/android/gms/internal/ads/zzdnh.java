package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdnh {
    private int zza;
    private zzdk zzb;
    private zzbkt zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzef zzg;
    private Bundle zzh;
    private zzcli zzi;
    private zzcli zzj;
    private zzcli zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzblb zzq;
    private zzblb zzr;
    private String zzs;
    private final SimpleArrayMap zzt = new SimpleArrayMap();
    private final SimpleArrayMap zzu = new SimpleArrayMap();
    private float zzv;
    private String zzw;

    public static zzdnh zzab(zzbul zzbul) {
        try {
            zzdng zzaf = zzaf(zzbul.zzg(), (zzbup) null);
            zzbkt zzh2 = zzbul.zzh();
            String zzo2 = zzbul.zzo();
            List zzr2 = zzbul.zzr();
            String zzm2 = zzbul.zzm();
            Bundle zzf2 = zzbul.zzf();
            String zzn2 = zzbul.zzn();
            IObjectWrapper zzl2 = zzbul.zzl();
            String zzq2 = zzbul.zzq();
            String zzp2 = zzbul.zzp();
            double zze2 = zzbul.zze();
            zzblb zzi2 = zzbul.zzi();
            zzdnh zzdnh = new zzdnh();
            zzdnh.zza = 2;
            zzdnh.zzb = zzaf;
            zzdnh.zzc = zzh2;
            zzdnh.zzd = (View) zzah(zzbul.zzj());
            zzdnh.zzU("headline", zzo2);
            zzdnh.zze = zzr2;
            zzdnh.zzU("body", zzm2);
            zzdnh.zzh = zzf2;
            zzdnh.zzU("call_to_action", zzn2);
            zzdnh.zzm = (View) zzah(zzbul.zzk());
            zzdnh.zzo = zzl2;
            zzdnh.zzU(TapjoyConstants.TJC_STORE, zzq2);
            zzdnh.zzU("price", zzp2);
            zzdnh.zzp = zze2;
            zzdnh.zzq = zzi2;
            return zzdnh;
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdnh zzac(zzbum zzbum) {
        try {
            zzdng zzaf = zzaf(zzbum.zzf(), (zzbup) null);
            zzbkt zzg2 = zzbum.zzg();
            String zzo2 = zzbum.zzo();
            List zzp2 = zzbum.zzp();
            String zzm2 = zzbum.zzm();
            Bundle zze2 = zzbum.zze();
            String zzn2 = zzbum.zzn();
            IObjectWrapper zzk2 = zzbum.zzk();
            String zzl2 = zzbum.zzl();
            zzblb zzh2 = zzbum.zzh();
            zzdnh zzdnh = new zzdnh();
            zzdnh.zza = 1;
            zzdnh.zzb = zzaf;
            zzdnh.zzc = zzg2;
            zzdnh.zzd = (View) zzah(zzbum.zzi());
            zzdnh.zzU("headline", zzo2);
            zzdnh.zze = zzp2;
            zzdnh.zzU("body", zzm2);
            zzdnh.zzh = zze2;
            zzdnh.zzU("call_to_action", zzn2);
            zzdnh.zzm = (View) zzah(zzbum.zzj());
            zzdnh.zzo = zzk2;
            zzdnh.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, zzl2);
            zzdnh.zzr = zzh2;
            return zzdnh;
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdnh zzad(zzbul zzbul) {
        try {
            return zzag(zzaf(zzbul.zzg(), (zzbup) null), zzbul.zzh(), (View) zzah(zzbul.zzj()), zzbul.zzo(), zzbul.zzr(), zzbul.zzm(), zzbul.zzf(), zzbul.zzn(), (View) zzah(zzbul.zzk()), zzbul.zzl(), zzbul.zzq(), zzbul.zzp(), zzbul.zze(), zzbul.zzi(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdnh zzae(zzbum zzbum) {
        try {
            return zzag(zzaf(zzbum.zzf(), (zzbup) null), zzbum.zzg(), (View) zzah(zzbum.zzi()), zzbum.zzo(), zzbum.zzp(), zzbum.zzm(), zzbum.zze(), zzbum.zzn(), (View) zzah(zzbum.zzj()), zzbum.zzk(), (String) null, (String) null, -1.0d, zzbum.zzh(), zzbum.zzl(), 0.0f);
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdng zzaf(zzdk zzdk, zzbup zzbup) {
        if (zzdk == null) {
            return null;
        }
        return new zzdng(zzdk, zzbup);
    }

    private static zzdnh zzag(zzdk zzdk, zzbkt zzbkt, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzblb zzblb, String str6, float f) {
        zzdnh zzdnh = new zzdnh();
        zzdnh.zza = 6;
        zzdnh.zzb = zzdk;
        zzdnh.zzc = zzbkt;
        zzdnh.zzd = view;
        String str7 = str;
        zzdnh.zzU("headline", str);
        zzdnh.zze = list;
        String str8 = str2;
        zzdnh.zzU("body", str2);
        zzdnh.zzh = bundle;
        String str9 = str3;
        zzdnh.zzU("call_to_action", str3);
        zzdnh.zzm = view2;
        zzdnh.zzo = iObjectWrapper;
        String str10 = str4;
        zzdnh.zzU(TapjoyConstants.TJC_STORE, str4);
        String str11 = str5;
        zzdnh.zzU("price", str5);
        zzdnh.zzp = d;
        zzdnh.zzq = zzblb;
        zzdnh.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, str6);
        zzdnh.zzP(f);
        return zzdnh;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdnh zzs(zzbup zzbup) {
        try {
            return zzag(zzaf(zzbup.zzj(), zzbup), zzbup.zzk(), (View) zzah(zzbup.zzm()), zzbup.zzs(), zzbup.zzv(), zzbup.zzq(), zzbup.zzi(), zzbup.zzr(), (View) zzah(zzbup.zzn()), zzbup.zzo(), zzbup.zzu(), zzbup.zzt(), zzbup.zze(), zzbup.zzl(), zzbup.zzp(), zzbup.zzf());
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD("price");
    }

    public final synchronized String zzC() {
        return zzD(TapjoyConstants.TJC_STORE);
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.get(str);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcli zzcli = this.zzi;
        if (zzcli != null) {
            zzcli.destroy();
            this.zzi = null;
        }
        zzcli zzcli2 = this.zzj;
        if (zzcli2 != null) {
            zzcli2.destroy();
            this.zzj = null;
        }
        zzcli zzcli3 = this.zzk;
        if (zzcli3 != null) {
            zzcli3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzbkt zzbkt) {
        this.zzc = zzbkt;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(zzef zzef) {
        this.zzg = zzef;
    }

    public final synchronized void zzK(zzblb zzblb) {
        this.zzq = zzblb;
    }

    public final synchronized void zzL(String str, zzbkn zzbkn) {
        if (zzbkn == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzbkn);
        }
    }

    public final synchronized void zzM(zzcli zzcli) {
        this.zzj = zzcli;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzblb zzblb) {
        this.zzr = zzblb;
    }

    public final synchronized void zzP(float f) {
        this.zzv = f;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcli zzcli) {
        this.zzk = zzcli;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d) {
        this.zzp = d;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i) {
        this.zza = i;
    }

    public final synchronized void zzW(zzdk zzdk) {
        this.zzb = zzdk;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcli zzcli) {
        this.zzi = zzcli;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzt;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzu;
    }

    public final synchronized zzdk zzj() {
        return this.zzb;
    }

    public final synchronized zzef zzk() {
        return this.zzg;
    }

    public final synchronized zzbkt zzl() {
        return this.zzc;
    }

    public final zzblb zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbla.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzblb zzn() {
        return this.zzq;
    }

    public final synchronized zzblb zzo() {
        return this.zzr;
    }

    public final synchronized zzcli zzp() {
        return this.zzj;
    }

    public final synchronized zzcli zzq() {
        return this.zzk;
    }

    public final synchronized zzcli zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER);
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
