package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4432n;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.d */
public class C4386d implements Comparator<C4431m> {

    /* renamed from: a */
    public int f10794a;

    /* renamed from: b */
    public int f10795b;

    /* renamed from: c */
    public int f10796c;

    public C4386d(int i, int i2, int i3) {
        this.f10794a = i;
        this.f10795b = i2;
        this.f10796c = i3;
    }

    /* renamed from: a */
    public final Integer mo24567a(String str) {
        HashMap hashMap = (HashMap) C4432n.f10921f;
        C4432n nVar = hashMap.containsKey(str) ? (C4432n) hashMap.get(str) : C4432n.UNKNOWN;
        if (nVar == C4432n.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (nVar == C4432n.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (nVar == C4432n.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C4431m mVar = (C4431m) obj;
        C4431m mVar2 = (C4431m) obj2;
        if (!TextUtils.equals("VPAID", mVar2.f10915f)) {
            if (!TextUtils.equals("VPAID", mVar.f10915f)) {
                Integer num = mVar.f10914e;
                if (num == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                Integer num2 = mVar2.f10914e;
                if (num2 == null) {
                    i2 = 0;
                } else {
                    i2 = num2.intValue();
                }
                int i7 = this.f10794a;
                if (i2 <= i7 || i > i7) {
                    if (i <= i7 || i2 > i7) {
                        int compareTo = mo24567a(mVar2.f10913d).compareTo(mo24567a(mVar.f10913d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (i >= i2) {
                            if (i <= i2) {
                                Integer num3 = mVar.f10911b;
                                if (num3 == null) {
                                    i3 = 0;
                                } else {
                                    i3 = num3.intValue();
                                }
                                Integer num4 = mVar.f10912c;
                                if (num4 == null) {
                                    i4 = 0;
                                } else {
                                    i4 = num4.intValue();
                                }
                                Integer num5 = mVar2.f10911b;
                                if (num5 == null) {
                                    i5 = 0;
                                } else {
                                    i5 = num5.intValue();
                                }
                                Integer num6 = mVar2.f10912c;
                                if (num6 == null) {
                                    i6 = 0;
                                } else {
                                    i6 = num6.intValue();
                                }
                                int i8 = i3 * i4;
                                int i9 = i5 * i6;
                                int i10 = this.f10795b * this.f10796c;
                                int abs = Math.abs(i8 - i10);
                                int abs2 = Math.abs(i9 - i10);
                                if (abs >= abs2) {
                                    if (abs > abs2) {
                                        return 1;
                                    }
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
