package com.mbridge.msdk.foundation.same.net.p311f;

import com.mbridge.msdk.foundation.same.net.p306a.C8508a;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.a */
/* compiled from: CommonHttpConfig */
public final class C8537a {
    /* renamed from: a */
    public static String m24452a(C8508a aVar) {
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i = aVar.f20851a;
            int i2 = 0;
            if (aVar.f20852b != null) {
                i2 = aVar.f20852b.f20912a;
            }
            if (i == -2) {
                return "Network is canceled";
            }
            if (i == 1) {
                return "Network error,Load failed";
            }
            switch (i) {
                case 3:
                    return "Network error,timeout exception";
                case 4:
                    return "Network unknown error";
                case 5:
                    return "Network error，https is not work,please check your phone time";
                case 6:
                    if (i2 == 0) {
                        return "Network error,please check ";
                    }
                    return "Network error,please check state code" + i2;
                case 7:
                    if (i2 == 0) {
                        return "The server returns an exception ";
                    }
                    return "The server returns an exception state code " + i2;
                case 8:
                    return "Cast exception, return data can not be casted correctly";
                case 9:
                case 12:
                    return "Network error,disconnected network exception";
                case 10:
                    return "Network error,socket timeout exception";
                case 11:
                    return "Network error，sslp exception";
                case 13:
                    if (aVar.f20852b == null) {
                        return "Unknown socket exception";
                    }
                    byte[] bArr = aVar.f20852b.f20913b;
                    return bArr != null ? new String(bArr) : "Socket exception message is NULL";
                default:
                    return "Network error,I/O exception";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
