package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.aaaac */
public abstract class aaaac {

    /* renamed from: com.ogury.cm.internal.aaaac$aaaaa */
    static final class aaaaa extends bbaca implements bbaab<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ aaaac f24191a;

        /* renamed from: b */
        final /* synthetic */ int f24192b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaaac aaaac, int i) {
            super(1);
            this.f24191a = aaaac;
            this.f24192b = i;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63791a(Object obj) {
            ((Number) obj).intValue();
            aabcc aabcc = aabcc.f24272a;
            return Boolean.valueOf(aabcc.m27767a(this.f24191a.mo63788a().mo63867c(), this.f24192b));
        }
    }

    /* renamed from: a */
    public static boolean m27686a(int i, Integer[] numArr, bbaab<? super Integer, Boolean> bbaab) {
        bbabc.m28052b(numArr, "conditionValues");
        bbabc.m28052b(bbaab, "unit");
        if (m27687a(numArr, i)) {
            return bbaab.mo63791a(Integer.valueOf(i)).booleanValue();
        }
        abbbc abbbc = abbbc.f24336a;
        abbbc.m27854a("Value that you are trying to check is not valid.");
        return false;
    }

    /* renamed from: a */
    private static boolean m27687a(Integer[] numArr, int i) {
        if (numArr.length == 0) {
            return true;
        }
        if (i != 0) {
            aabcc aabcc = aabcc.f24272a;
            bbabc.m28052b(numArr, "receiver$0");
            int i2 = 0;
            for (Integer intValue : numArr) {
                i2 += intValue.intValue();
            }
            if (aabcc.m27767a(i2, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract abcab mo63788a();

    /* renamed from: a */
    public final boolean mo63789a(int i) {
        return m27686a(i, mo63790b(), new aaaaa(this, i));
    }

    /* renamed from: b */
    public abstract Integer[] mo63790b();
}
