package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ig */
final class C11608ig extends C11591hy implements C11541gz {

    /* renamed from: a */
    public static final C11288bc<C11608ig> f27919a = new C11288bc<C11608ig>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            bhVar.mo69722h();
            String str = "";
            String str2 = str;
            while (bhVar.mo69724j()) {
                String l = bhVar.mo69726l();
                if ("campaign_id".equals(l)) {
                    str = bhVar.mo69712c("");
                } else if ("product_id".equals(l)) {
                    str2 = bhVar.mo69712c("");
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return new C11608ig(str, str2);
        }
    };

    /* renamed from: b */
    private final String f27920b;

    /* renamed from: c */
    private final String f27921c;

    C11608ig(String str, String str2) {
        this.f27920b = str;
        this.f27921c = str2;
    }

    /* renamed from: a */
    public final String mo70083a() {
        return this.f27920b;
    }

    /* renamed from: b */
    public final String mo70084b() {
        return this.f27921c;
    }
}
