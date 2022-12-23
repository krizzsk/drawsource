package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzfoz extends zzfpe {
    final /* synthetic */ zzfpa zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfoz(zzfpa zzfpa, zzfpg zzfpg, CharSequence charSequence) {
        super(zzfpg, charSequence);
        this.zza = zzfpa;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        zzfoh zzfoh = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfou.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfoh.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
