package com.ogury.p377ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hb */
public final class C10078hb {

    /* renamed from: a */
    public static final C10079a f25309a = new C10079a((byte) 0);

    /* renamed from: b */
    private final C10158jh f25310b;

    public C10078hb(C10158jh jhVar) {
        C10263mq.m29882b(jhVar, "webView");
        this.f25310b = jhVar;
    }

    /* renamed from: com.ogury.ed.internal.hb$a */
    public static final class C10079a {
        public /* synthetic */ C10079a(byte b) {
            this();
        }

        private C10079a() {
        }
    }

    /* renamed from: a */
    public final C10158jh mo64799a() {
        return this.f25310b;
    }

    /* renamed from: a */
    public final void mo64805a(String str, String str2) {
        C10263mq.m29882b(str, "command");
        C10263mq.m29882b(str2, "message");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29292a(str, str2));
    }

    /* renamed from: a */
    public final void mo64800a(int i) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29287a(i));
    }

    /* renamed from: b */
    public final void mo64809b() {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29286a());
    }

    /* renamed from: a */
    public final void mo64806a(String str, boolean z) {
        C10263mq.m29882b(str, TJAdUnitConstants.String.ORIENTATION);
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29293a(str, z));
    }

    /* renamed from: a */
    public final void mo64808a(boolean z, String str) {
        C10263mq.m29882b(str, "forceOrientation");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29296a(z, str));
    }

    /* renamed from: a */
    public final void mo64801a(int i, int i2) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29288a(i, i2));
    }

    /* renamed from: a */
    public final void mo64804a(String str) {
        C10263mq.m29882b(str, "placementType");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29291a(str));
    }

    /* renamed from: a */
    public final void mo64807a(boolean z) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29295a(z));
    }

    /* renamed from: b */
    public final void mo64810b(int i, int i2) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29298b(i, i2));
    }

    /* renamed from: a */
    public final void mo64802a(int i, int i2, int i3, int i4) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29289a(i, i2, i3, i4));
    }

    /* renamed from: b */
    public final void mo64811b(int i, int i2, int i3, int i4) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29299b(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo64816c(int i, int i2, int i3, int i4) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29304c(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo64815c(int i, int i2) {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29303c(i, i2));
    }

    /* renamed from: b */
    public final void mo64812b(String str) {
        C10263mq.m29882b(str, "state");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29300b(str));
        this.f25310b.setAdState(str);
    }

    /* renamed from: b */
    public final void mo64813b(String str, String str2) {
        C10263mq.m29882b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10263mq.m29882b(str2, IronSourceConstants.EVENTS_RESULT);
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29301b(str, str2));
    }

    /* renamed from: a */
    public final void mo64803a(C10074gy gyVar) {
        C10263mq.m29882b(gyVar, "adExposure");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29290a(gyVar));
        m29266b(gyVar);
    }

    /* renamed from: b */
    private final void m29266b(C10074gy gyVar) {
        if (gyVar.mo64798c() < 50.0f) {
            mo64807a(false);
        } else if (!this.f25310b.mo64970b()) {
            mo64807a(true);
        }
    }

    /* renamed from: c */
    public final void mo64814c() {
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29302c());
    }

    /* renamed from: c */
    public final void mo64817c(String str) {
        C10263mq.m29882b(str, "url");
        C10158jh jhVar = this.f25310b;
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29305c(str));
    }
}
