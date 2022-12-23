package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.iu */
public final class C10139iu implements C10087hj {

    /* renamed from: a */
    public static final C10140a f25459a = new C10140a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10139iu f25460c = new C10139iu((C10087hj[]) ((Object[]) new C10087hj[0]));

    /* renamed from: b */
    private final C10087hj[] f25461b;

    /* renamed from: com.ogury.ed.internal.iu$a */
    public static final class C10140a {
        public /* synthetic */ C10140a(byte b) {
            this();
        }

        private C10140a() {
        }

        /* renamed from: a */
        public static C10139iu m29609a() {
            return C10139iu.f25460c;
        }
    }

    public C10139iu(C10087hj[] hjVarArr) {
        C10263mq.m29882b(hjVarArr, "mraidUrlHandlers");
        this.f25461b = hjVarArr;
    }

    /* renamed from: a */
    public final boolean mo64822a(String str, C10158jh jhVar, C9981eb ebVar) {
        C10263mq.m29882b(str, "url");
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        C10087hj[] hjVarArr = this.f25461b;
        int length = hjVarArr.length;
        int i = 0;
        while (i < length) {
            C10087hj hjVar = hjVarArr[i];
            i++;
            if (hjVar.mo64822a(str, jhVar, ebVar)) {
                return true;
            }
        }
        return false;
    }
}
