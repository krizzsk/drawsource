package com.iab.omid.library.amazon.p233d;

import android.text.TextUtils;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;

/* renamed from: com.iab.omid.library.amazon.d.e */
public class C7694e {
    /* renamed from: a */
    public static void m21327a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m21328a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m21329a(C7673a aVar) {
        if (aVar.mo54520g()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m21330a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m21331a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m21332a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m21333b(C7673a aVar) {
        if (aVar.mo54521h()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m21334c(C7673a aVar) {
        m21339h(aVar);
        m21333b(aVar);
    }

    /* renamed from: d */
    public static void m21335d(C7673a aVar) {
        if (aVar.getAdSessionStatePublisher().mo54617c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m21336e(C7673a aVar) {
        if (aVar.getAdSessionStatePublisher().mo54618d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m21337f(C7673a aVar) {
        if (!aVar.mo54522i()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m21338g(C7673a aVar) {
        if (!aVar.mo54523j()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m21339h(C7673a aVar) {
        if (!aVar.mo54520g()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
