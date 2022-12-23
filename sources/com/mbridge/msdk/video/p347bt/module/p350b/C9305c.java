package com.mbridge.msdk.video.p347bt.module.p350b;

import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.p347bt.module.p349a.C9302b;
import com.mbridge.msdk.videocommon.p373b.C9630c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.c */
/* compiled from: H5ShowRewardListener */
public final class C9305c extends C9304b {

    /* renamed from: a */
    private C9302b f22837a;

    /* renamed from: b */
    private String f22838b;

    public C9305c(C9302b bVar, String str) {
        this.f22837a = bVar;
        this.f22838b = str;
    }

    /* renamed from: a */
    public final void mo61307a() {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onAdShow");
            this.f22837a.mo62661a(this.f22838b);
        }
    }

    /* renamed from: a */
    public final void mo61312a(boolean z, C9630c cVar) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onAdClose");
            this.f22837a.mo62665a(this.f22838b, z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo61309a(String str) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onShowFail");
            this.f22837a.mo62663a(this.f22838b, str);
        }
    }

    /* renamed from: a */
    public final void mo61313a(boolean z, String str, String str2) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onVideoAdClicked");
            this.f22837a.mo62664a(this.f22838b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo61310a(String str, String str2) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onVideoComplete");
            this.f22837a.mo62667b(this.f22838b, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo61314b(String str, String str2) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onEndcardShow");
            this.f22837a.mo62668c(this.f22838b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo61308a(int i, String str, String str2) {
        if (this.f22837a != null) {
            C8672v.m24874a("H5ShowRewardListener", "onAutoLoad");
            this.f22837a.mo62662a(this.f22838b, i, str, str2);
        }
    }
}
