package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgir;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgiq<MessageType extends zzgir<MessageType, BuilderType>, BuilderType extends zzgiq<MessageType, BuilderType>> implements zzglz {
    /* renamed from: zzaf */
    public abstract zzgiq clone();

    /* access modifiers changed from: protected */
    public abstract zzgiq zzag(zzgir zzgir);

    public final /* bridge */ /* synthetic */ zzglz zzah(zzgma zzgma) {
        if (zzbh().getClass().isInstance(zzgma)) {
            return zzag((zzgir) zzgma);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
