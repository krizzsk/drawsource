package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* renamed from: com.google.android.exoplayer2.-$$Lambda$_TNbpzxdf4mF--qqZ6N0idYO0xg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$_TNbpzxdf4mFqqZ6N0idYO0xg implements Bundleable.Creator {
    public static final /* synthetic */ $$Lambda$_TNbpzxdf4mFqqZ6N0idYO0xg INSTANCE = new $$Lambda$_TNbpzxdf4mFqqZ6N0idYO0xg();

    private /* synthetic */ $$Lambda$_TNbpzxdf4mFqqZ6N0idYO0xg() {
    }

    public final Bundleable fromBundle(Bundle bundle) {
        return new PlaybackException(bundle);
    }
}
