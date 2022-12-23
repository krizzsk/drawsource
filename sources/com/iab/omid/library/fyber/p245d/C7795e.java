package com.iab.omid.library.fyber.p245d;

import android.text.TextUtils;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;

/* renamed from: com.iab.omid.library.fyber.d.e */
public class C7795e {
    /* renamed from: a */
    public static void m21787a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m21788a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m21789a(C7774a aVar) {
        if (aVar.mo54918g()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m21790a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m21791a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m21792a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m21793b(C7774a aVar) {
        if (aVar.mo54919h()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m21794c(C7774a aVar) {
        m21799h(aVar);
        m21793b(aVar);
    }

    /* renamed from: d */
    public static void m21795d(C7774a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55015c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m21796e(C7774a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55016d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m21797f(C7774a aVar) {
        if (!aVar.mo54920i()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m21798g(C7774a aVar) {
        if (!aVar.mo54921j()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m21799h(C7774a aVar) {
        if (!aVar.mo54918g()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
