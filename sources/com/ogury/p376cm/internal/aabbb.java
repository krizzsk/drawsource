package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.internal.aacaa;
import com.ogury.p376cm.internal.bacab;
import java.util.List;

/* renamed from: com.ogury.cm.internal.aabbb */
public final class aabbb {

    /* renamed from: a */
    public static final aaaaa f24251a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f24252b;

    /* renamed from: c */
    private final abaab f24253c;

    /* renamed from: com.ogury.cm.internal.aabbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aabbb(Context context, abaab abaab) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(abaab, "timeUtils");
        this.f24253c = abaab;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentExternal", 0);
        bbabc.m28049a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f24252b = sharedPreferences;
    }

    public /* synthetic */ aabbb(Context context, abaab abaab, int i, bbabb bbabb) {
        this(context, abaab.f24291a);
    }

    /* renamed from: a */
    private static aabac m27748a(aabab aabab) {
        return aabab instanceof aabac ? (aabac) aabab : new aabac(aabab.mo63813b(), aabab.mo63814c(), new Integer[0]);
    }

    /* renamed from: b */
    private synchronized aabab m27750b() {
        Integer[] numArr;
        int i = this.f24252b.getInt("tcfVersion", 0);
        String string = this.f24252b.getString("consentString", "");
        if (i == 2) {
            SharedPreferences sharedPreferences = this.f24252b;
            Integer[] numArr2 = new Integer[0];
            bbabc.m28052b(sharedPreferences, "receiver$0");
            bbabc.m28052b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
            bbabc.m28052b(numArr2, "defaultIntArray");
            String string2 = sharedPreferences.getString("tcfv2_nonIabVendorIdsAccepted", "");
            bbabc.m28049a((Object) string2, "serializedIntArray");
            if (string2.length() == 0) {
                numArr = numArr2;
            } else {
                Object[] array = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(string2)).toArray(new Integer[0]);
                if (array != null) {
                    numArr = (Integer[]) array;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            bbabc.m28049a((Object) string, "consentString");
            return new aabac(string, (aabba) null, numArr, 2, (bbabb) null);
        }
        bbabc.m28049a((Object) string, "consentString");
        return new aabab(i, string, (aabba) null, 4, (bbabb) null);
    }

    /* renamed from: a */
    public final void mo63816a() {
        this.f24252b.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo63817a(aaacc aaacc, boolean z) {
        bbabc.m28052b(aaacc, "externalConsentData");
        if (aaacc instanceof aabab) {
            OguryIntegrationLogger.m28105d("[Consent][External] Marking the consent data as sent...");
            SharedPreferences.Editor edit = this.f24252b.edit();
            edit.clear();
            edit.putLong("dt", z ? abaab.m27794a() : -1);
            edit.putInt("tcfVersion", ((aabab) aaacc).mo63812a());
            edit.putString("consentString", ((aabab) aaacc).mo63813b());
            if (((aabab) aaacc).mo63812a() == 2) {
                Integer[] d = aaacc instanceof aabac ? ((aabac) aaacc).mo63815d() : new Integer[0];
                bbabc.m28049a((Object) edit, "editor");
                bbabc.m28052b(edit, "receiver$0");
                bbabc.m28052b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
                bbabc.m28052b(d, "intArray");
                edit.putString("tcfv2_nonIabVendorIdsAccepted", aacaa.aaaaa.m27769a(d));
            }
            edit.apply();
            OguryIntegrationLogger.m28105d("[Consent][External] Consent data marked");
        }
    }

    /* renamed from: a */
    public final boolean mo63818a(aaacc aaacc) {
        bbabc.m28052b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return false;
        }
        aabab b = m27750b();
        aabab aabab = (aabab) aaacc;
        if (b.mo63812a() != aabab.mo63812a() || (!bbabc.m28051a((Object) b.mo63813b(), (Object) aabab.mo63813b()))) {
            return false;
        }
        if (b.mo63812a() != 2) {
            return true;
        }
        List a = bacab.aaaaa.m28028a((T[]) m27748a(b).mo63815d());
        List a2 = bacab.aaaaa.m28028a((T[]) m27748a(aabab).mo63815d());
        bbabc.m28052b(a, "receiver$0");
        bbabc.m28052b(a2, "other");
        if (a == a2) {
            return true;
        }
        if (a.size() != a2.size()) {
            return false;
        }
        return a.containsAll(a2);
    }

    /* renamed from: b */
    public final boolean mo63819b(aaacc aaacc) {
        bbabc.m28052b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return true;
        }
        long j = this.f24252b.getLong("dt", 0);
        if (j == -1) {
            return false;
        }
        return j == 0 || abaab.m27794a() > j + 86400000;
    }
}
