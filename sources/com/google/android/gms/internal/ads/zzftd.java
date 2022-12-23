package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzftd extends AbstractSet {
    zzftd() {
    }

    public boolean removeAll(Collection collection) {
        return zzfte.zzd(this, collection);
    }

    public boolean retainAll(Collection collection) {
        if (collection != null) {
            return super.retainAll(collection);
        }
        throw null;
    }
}
