package com.ogury.p376cm.internal;

import com.ogury.p376cm.OguryChoiceManager;

/* renamed from: com.ogury.cm.internal.abbcb */
public final class abbcb {

    /* renamed from: a */
    private OguryChoiceManager.Answer f24342a;

    /* renamed from: b */
    private boolean f24343b;

    /* renamed from: c */
    private abcab f24344c;

    /* renamed from: d */
    private abcaa f24345d;

    public abbcb() {
        this((abcab) null, (abcaa) null, 3, (bbabb) null);
    }

    public abbcb(abcab abcab, abcaa abcaa) {
        bbabc.m28052b(abcab, "consentResultTcf");
        bbabc.m28052b(abcaa, "consentResultCcpaf");
        this.f24344c = abcab;
        this.f24345d = abcaa;
        this.f24342a = OguryChoiceManager.Answer.NO_ANSWER;
    }

    public /* synthetic */ abbcb(abcab abcab, abcaa abcaa, int i, bbabb bbabb) {
        this(new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final OguryChoiceManager.Answer mo63841a() {
        return this.f24342a;
    }

    /* renamed from: a */
    public final void mo63842a(OguryChoiceManager.Answer answer) {
        bbabc.m28052b(answer, "<set-?>");
        this.f24342a = answer;
    }

    /* renamed from: a */
    public final void mo63843a(boolean z) {
        this.f24343b = z;
    }

    /* renamed from: b */
    public final boolean mo63844b() {
        return this.f24343b;
    }

    /* renamed from: c */
    public final abcab mo63845c() {
        return this.f24344c;
    }

    /* renamed from: d */
    public final abcaa mo63846d() {
        return this.f24345d;
    }
}
