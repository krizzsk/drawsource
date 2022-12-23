package com.ogury.p376cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaccb */
public final class aaccb extends aacca {

    /* renamed from: com.ogury.cm.internal.aaccb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaccb f24280a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f24281b;

        /* renamed from: c */
        final /* synthetic */ Context f24282c;

        /* renamed from: d */
        final /* synthetic */ acabc f24283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaccb aaccb, CountDownLatch countDownLatch, Context context, acabc acabc) {
            super(0);
            this.f24280a = aaccb;
            this.f24281b = countDownLatch;
            this.f24282c = context;
            this.f24283d = acabc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            this.f24281b.await();
            this.f24280a.mo63821a().mo63776a(this.f24282c, this.f24283d, this.f24281b);
            return babcc.f24512a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaccb(aacbc aacbc) {
        super(aacbc);
        bbabc.m28052b(aacbc, "requestScheduler");
    }

    /* renamed from: a */
    public final void mo63822a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(acabc, "requestType");
        bbabc.m28052b(countDownLatch, "countDownLatch");
        mo63821a().mo63778a(context, countDownLatch);
        bacbb.m28035a(false, false, (ClassLoader) null, (String) null, 0, new aaaaa(this, countDownLatch, context, acabc), 31, (Object) null);
    }
}
