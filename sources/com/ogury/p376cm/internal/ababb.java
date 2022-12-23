package com.ogury.p376cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.cm.internal.ababb */
public final class ababb {

    /* renamed from: a */
    public static final ababb f24305a = new ababb();

    /* renamed from: com.ogury.cm.internal.ababb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<String> {

        /* renamed from: a */
        final /* synthetic */ Context f24306a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(Context context) {
            super(0);
            this.f24306a = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            OguryAaid aaid = InternalCore.getAaid(this.f24306a);
            bbabc.m28049a((Object) aaid, "InternalCore.getAaid(context)");
            return aaid.getId();
        }
    }

    /* renamed from: com.ogury.cm.internal.ababb$aaaab */
    static final class aaaab extends bbaca implements bbaab<String, babcc> {

        /* renamed from: a */
        final /* synthetic */ ababa f24307a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(ababa ababa) {
            super(1);
            this.f24307a = ababa;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo63791a(Object obj) {
            String str = (String) obj;
            ababa ababa = this.f24307a;
            bbabc.m28049a((Object) str, "aaid");
            ababa.mo63772a(str);
            return babcc.f24512a;
        }
    }

    private ababb() {
    }

    /* renamed from: a */
    public static void m27807a(Context context, ababa ababa) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(ababa, "aaidCallback");
        new abacb(new aaaaa(context)).mo63837a(new aaaab(ababa));
    }
}
