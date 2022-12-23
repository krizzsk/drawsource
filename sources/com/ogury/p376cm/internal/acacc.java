package com.ogury.p376cm.internal;

import android.content.Context;
import com.ogury.p376cm.internal.acbac;

/* renamed from: com.ogury.cm.internal.acacc */
public final class acacc {

    /* renamed from: a */
    private acbaa[] f24447a;

    public acacc() {
        this((acbac) null, (acbab) null, 3, (bbabb) null);
    }

    private acacc(acbac acbac, acbab acbab) {
        bbabc.m28052b(acbac, "outsideShareTcf");
        bbabc.m28052b(acbab, "outsideShareCcpaf");
        this.f24447a = new acbaa[]{acbac, acbab};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acacc(acbac acbac, acbab acbab, int i, bbabb bbabb) {
        this(abbba.m27819a() != 2 ? new acbba() : new acbba(), new acbab());
        acbac.aaaaa aaaaa = acbac.f24449a;
        abbba abbba = abbba.f24320a;
    }

    /* renamed from: a */
    public final void mo63910a(Context context) {
        bbabc.m28052b(context, "context");
        for (acbaa a : this.f24447a) {
            a.mo63911a(context);
        }
    }
}
