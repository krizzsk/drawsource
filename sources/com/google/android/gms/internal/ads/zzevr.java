package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzevr implements zzgqu {
    public static zzetj zza(Context context, zzcef zzcef, zzceg zzceg, Object obj, zzeub zzeub, zzeve zzeve, zzgqo zzgqo, zzgqo zzgqo2, zzgqo zzgqo3, zzgqo zzgqo4, zzgqo zzgqo5, zzgqo zzgqo6, zzgqo zzgqo7, zzgqo zzgqo8, zzgqo zzgqo9, Executor executor, zzfhs zzfhs, zzdwh zzdwh) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeux) obj);
        zzeub zzeub2 = zzeub;
        hashSet.add(zzeub);
        zzeve zzeve2 = zzeve;
        hashSet.add(zzeve);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeI)).booleanValue()) {
            hashSet.add((zzetg) zzgqo.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeJ)).booleanValue()) {
            hashSet.add((zzetg) zzgqo2.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeK)).booleanValue()) {
            hashSet.add((zzetg) zzgqo3.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeL)).booleanValue()) {
            hashSet.add((zzetg) zzgqo4.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeP)).booleanValue()) {
            hashSet.add((zzetg) zzgqo6.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeQ)).booleanValue()) {
            hashSet.add((zzetg) zzgqo7.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcq)).booleanValue()) {
            hashSet.add((zzetg) zzgqo9.zzb());
        }
        return new zzetj(context, executor, hashSet, zzfhs, zzdwh);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
