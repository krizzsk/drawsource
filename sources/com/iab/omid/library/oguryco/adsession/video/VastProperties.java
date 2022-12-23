package com.iab.omid.library.oguryco.adsession.video;

import com.iab.omid.library.oguryco.adsession.media.Position;
import com.iab.omid.library.oguryco.p269d.C7997e;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19257a;

    /* renamed from: b */
    private final Float f19258b;

    /* renamed from: c */
    private final boolean f19259c;

    /* renamed from: d */
    private final Position f19260d;

    /* renamed from: e */
    private com.iab.omid.library.oguryco.adsession.media.VastProperties f19261e;

    private VastProperties(boolean z, Float f, boolean z2, Position position, com.iab.omid.library.oguryco.adsession.media.VastProperties vastProperties) {
        this.f19257a = z;
        this.f19258b = f;
        this.f19259c = z2;
        this.f19260d = position;
        this.f19261e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z, Position position) {
        C7997e.m22696a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z, Position position) {
        C7997e.m22696a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.valueOf(position.toString().toUpperCase())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final com.iab.omid.library.oguryco.adsession.media.VastProperties mo55723a() {
        return this.f19261e;
    }

    public final Position getPosition() {
        return this.f19260d;
    }

    public final Float getSkipOffset() {
        return this.f19258b;
    }

    public final boolean isAutoPlay() {
        return this.f19259c;
    }

    public final boolean isSkippable() {
        return this.f19257a;
    }
}
