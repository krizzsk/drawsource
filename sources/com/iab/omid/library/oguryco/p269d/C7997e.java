package com.iab.omid.library.oguryco.p269d;

import android.text.TextUtils;
import com.iab.omid.library.oguryco.Omid;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.adsession.CreativeType;
import com.iab.omid.library.oguryco.adsession.ImpressionType;
import com.iab.omid.library.oguryco.adsession.Owner;

/* renamed from: com.iab.omid.library.oguryco.d.e */
public class C7997e {
    /* renamed from: a */
    public static void m22693a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m22694a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m22695a(C7975a aVar) {
        if (aVar.mo55694f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m22696a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m22697a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m22698a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m22699b(C7975a aVar) {
        if (aVar.mo55695g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m22700c(C7975a aVar) {
        m22705h(aVar);
        m22699b(aVar);
    }

    /* renamed from: d */
    public static void m22701d(C7975a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55809c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m22702e(C7975a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55810d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m22703f(C7975a aVar) {
        if (!aVar.mo55696h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m22704g(C7975a aVar) {
        if (!aVar.mo55697i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m22705h(C7975a aVar) {
        if (!aVar.mo55694f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
