package com.ogury.p377ed.internal;

import android.graphics.Rect;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hc */
public final class C10080hc {

    /* renamed from: a */
    public static final C10080hc f25311a = new C10080hc();

    /* renamed from: a */
    public static String m29286a() {
        return "ogySdkMraidGateway.updateSupportFlags({sms: false, tel: false, calendar: false, storePicture: false, inlineVideo: false, vpaid: false, location: false})";
    }

    /* renamed from: b */
    public static String m29297b() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnCloseSystem\", {})";
    }

    /* renamed from: c */
    public static String m29302c() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnTouchEnd\", {})";
    }

    private C10080hc() {
    }

    /* renamed from: a */
    public static String m29292a(String str, String str2) {
        C10263mq.m29882b(str, "command");
        C10263mq.m29882b(str2, "message");
        return "ogySdkMraidGateway.callErrorListeners(\"" + str2 + "\", \"" + str + "\")";
    }

    /* renamed from: a */
    public static String m29287a(int i) {
        return "ogySdkMraidGateway.updateAudioVolume(" + i + ')';
    }

    /* renamed from: a */
    public static String m29293a(String str, boolean z) {
        C10263mq.m29882b(str, TJAdUnitConstants.String.ORIENTATION);
        return "ogySdkMraidGateway.updateCurrentAppOrientation({orientation: \"" + str + "\", locked: " + z + "})";
    }

    /* renamed from: a */
    public static String m29296a(boolean z, String str) {
        C10263mq.m29882b(str, "forceOrientation");
        return "ogySdkMraidGateway.updateOrientationProperties({allowOrientationChange: " + z + ", forceOrientation: \"" + str + "\"})";
    }

    /* renamed from: a */
    public static String m29288a(int i, int i2) {
        return "ogySdkMraidGateway.updateScreenSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m29291a(String str) {
        C10263mq.m29882b(str, "placementType");
        return "ogySdkMraidGateway.updatePlacementType(\"" + str + "\")";
    }

    /* renamed from: a */
    public static String m29295a(boolean z) {
        return "ogySdkMraidGateway.updateViewability(" + z + ')';
    }

    /* renamed from: b */
    public static String m29298b(int i, int i2) {
        return "ogySdkMraidGateway.updateMaxSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m29289a(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateDefaultPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: b */
    public static String m29299b(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateCurrentPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: c */
    public static String m29304c(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateResizeProperties({width: " + i + ", height: " + i2 + ", offsetX: " + i3 + ", offsetY: " + i4 + ", customClosePosition: \"right\", allowOffscreen: false})";
    }

    /* renamed from: c */
    public static String m29303c(int i, int i2) {
        return "ogySdkMraidGateway.updateExpandProperties({width: " + i + ", height: " + i2 + ", useCustomClose: false, isModal: true})";
    }

    /* renamed from: b */
    public static String m29300b(String str) {
        C10263mq.m29882b(str, "state");
        return "ogySdkMraidGateway.updateState(\"" + str + "\")";
    }

    /* renamed from: b */
    public static String m29301b(String str, String str2) {
        C10263mq.m29882b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10263mq.m29882b(str2, IronSourceConstants.EVENTS_RESULT);
        return "ogySdkMraidGateway.callPendingMethodCallback(\"" + str + "\", null, " + str2 + ')';
    }

    /* renamed from: a */
    public static String m29290a(C10074gy gyVar) {
        String str;
        C10263mq.m29882b(gyVar, "adExposure");
        StringBuilder sb = new StringBuilder();
        for (Rect next : gyVar.mo64797b()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("{x: " + C10054gi.m29195a(next.left) + ", y: " + C10054gi.m29195a(next.top) + ", width: " + C10054gi.m29195a(next.width()) + ", height: " + C10054gi.m29195a(next.height()) + '}');
        }
        Rect a = gyVar.mo64793a();
        if (a != null) {
            str = "visibleRectangle: {x: " + C10054gi.m29195a(a.left) + ", y: " + C10054gi.m29195a(a.top) + ", width: " + C10054gi.m29195a(a.width()) + ", height: " + C10054gi.m29195a(a.height()) + '}';
        } else {
            str = "visibleRectangle: null";
        }
        return "ogySdkMraidGateway.updateExposure({exposedPercentage: " + gyVar.mo64798c() + ", " + str + ", occlusionRectangles: [" + sb + "]})";
    }

    /* renamed from: a */
    public static String m29294a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C10263mq.m29882b(str, "event");
        C10263mq.m29882b(str2, "webViewId");
        C10263mq.m29882b(str3, "url");
        C10263mq.m29882b(str4, "pageTitle");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnNavigation\", {event: \"" + str + "\", canGoBack: " + z2 + ", canGoForward: " + z + ", webviewId: \"" + str2 + "\", url: \"" + str3 + "\", \"pageTitle\": \"" + str4 + "\"})";
    }

    /* renamed from: c */
    public static String m29305c(String str) {
        C10263mq.m29882b(str, "url");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnOpenedUrl\", {url: \"" + str + "\"})";
    }
}
