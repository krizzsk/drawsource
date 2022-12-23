package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.p195h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzau {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzek zzc;
    /* access modifiers changed from: private */
    public final zzbna zzd;
    private final zzcbq zze;
    /* access modifiers changed from: private */
    public final zzbxs zzf;
    /* access modifiers changed from: private */
    public final zzbnb zzg;
    /* access modifiers changed from: private */
    public zzbza zzh;

    public zzau(zzk zzk, zzi zzi, zzek zzek, zzbna zzbna, zzcbq zzcbq, zzbxs zzbxs, zzbnb zzbnb) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzek;
        this.zzd = zzbna;
        this.zze = zzcbq;
        this.zzf = zzbxs;
        this.zzg = zzbnb;
    }

    static /* bridge */ /* synthetic */ void zzs(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, zzbua zzbua) {
        return (zzbo) new zzam(this, context, str, zzbua).zzd(context, false);
    }

    public final zzbs zzd(Context context, zzq zzq, String str, zzbua zzbua) {
        return (zzbs) new zzai(this, context, zzq, str, zzbua).zzd(context, false);
    }

    public final zzbs zze(Context context, zzq zzq, String str, zzbua zzbua) {
        return (zzbs) new zzak(this, context, zzq, str, zzbua).zzd(context, false);
    }

    public final zzblf zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzblf) new zzaq(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbll zzh(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbll) new zzas(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbpk zzk(Context context, zzbua zzbua, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbpk) new zzag(this, context, zzbua, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbxl zzl(Context context, zzbua zzbua) {
        return (zzbxl) new zzae(this, context, zzbua).zzd(context, false);
    }

    public final zzbxv zzn(Activity activity) {
        zzaa zzaa = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcfi.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbxv) zzaa.zzd(activity, z);
    }

    public final zzcbe zzp(Context context, String str, zzbua zzbua) {
        return (zzcbe) new zzat(this, context, str, zzbua).zzd(context, false);
    }

    public final zzcdz zzq(Context context, zzbua zzbua) {
        return (zzcdz) new zzac(this, context, zzbua).zzd(context, false);
    }
}
