package com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e;

import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.InputStream;
import java.util.List;
import p405ms.p406bd.p407o.Pgl.C12600c;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.a */
/* compiled from: AbsResponseWrapper */
public abstract class C2327a {

    /* renamed from: a */
    List<C2352i.C2354b> f4694a;

    /* renamed from: b */
    C2332e f4695b;

    /* renamed from: a */
    public abstract int mo15759a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15761a(int i) {
        switch (i) {
            case 200:
                return "OK";
            case ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR /*201*/:
                return "Created";
            case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR /*202*/:
                return "Accepted";
            case ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR /*203*/:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR /*205*/:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i) {
                    case 300:
                        return "Multiple Choices";
                    case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                        return "See Other";
                    case ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR /*304*/:
                        return "Not Modified";
                    case IronSourceConstants.OFFERWALL_OPENED /*305*/:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /*404*/:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case TTAdConstant.LANDING_PAGE_TYPE_CODE /*406*/:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /*407*/:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /*411*/:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /*413*/:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /*414*/:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /*415*/:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /*501*/:
                                        return "Not Implemented";
                                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /*502*/:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case C12600c.COLLECT_MODE_TIKTOK_GUEST /*504*/:
                                        return "Gateway Timeout";
                                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /*505*/:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    public abstract String mo15762a(String str, String str2);

    /* renamed from: b */
    public abstract boolean mo15763b();

    /* renamed from: c */
    public abstract List<C2352i.C2354b> mo15764c();

    /* renamed from: d */
    public abstract InputStream mo15765d();

    /* renamed from: e */
    public abstract String mo15766e();

    /* renamed from: f */
    public abstract String mo15767f();

    /* renamed from: g */
    public C2332e mo15768g() {
        return this.f4695b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2352i.C2354b mo15760a(String str) {
        List<C2352i.C2354b> list;
        if (!(str == null || (list = this.f4694a) == null || list.size() <= 0)) {
            for (C2352i.C2354b next : this.f4694a) {
                if (str.equals(next.f4765a)) {
                    return next;
                }
            }
        }
        return null;
    }
}
