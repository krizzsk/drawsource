package p397e;

import android.text.TextUtils;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;

/* renamed from: e.e */
public class C12469e {
    /* renamed from: a */
    public static void m33305a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m33306a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m33307a(C8021a aVar) {
        m33313d(aVar);
        m33311b(aVar);
    }

    /* renamed from: a */
    public static void m33308a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m33309a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m33310a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m33311b(C8021a aVar) {
        if (aVar.mo55905g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m33312c(C8021a aVar) {
        if (aVar.mo55908j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: d */
    private static void m33313d(C8021a aVar) {
        if (!aVar.mo55908j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* renamed from: e */
    public static void m33314e(C8021a aVar) {
        if (!aVar.mo55906h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: f */
    public static void m33315f(C8021a aVar) {
        if (!aVar.mo55907i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: g */
    public static void m33316g(C8021a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55948c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: h */
    public static void m33317h(C8021a aVar) {
        if (aVar.getAdSessionStatePublisher().mo55949d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
