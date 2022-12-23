package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5267e;
import com.fyber.inneractive.sdk.util.C5306p0;

/* renamed from: com.fyber.inneractive.sdk.player.controller.s */
public interface C4605s {
    /* renamed from: a */
    C5262d0.C5263a mo24914a(C5306p0 p0Var, C5267e eVar);

    /* renamed from: a */
    C5262d0.C5263a mo24915a(String str, C5306p0 p0Var);

    /* renamed from: a */
    void mo24916a(View view, String str);

    /* renamed from: a */
    void mo24917a(String str, String str2);

    /* renamed from: a */
    void mo24918a(boolean z);

    /* renamed from: a */
    void mo24919a(boolean z, Orientation orientation);

    /* renamed from: e */
    void mo24920e();

    /* renamed from: g */
    void mo24921g();

    /* renamed from: h */
    void mo24922h();

    /* renamed from: j */
    void mo24923j();

    /* renamed from: k */
    void mo24924k();

    /* renamed from: l */
    void mo24925l();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i, int i2);

    /* renamed from: r */
    void mo24929r();
}
