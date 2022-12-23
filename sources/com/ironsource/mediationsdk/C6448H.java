package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/InitServerResponse;", "", "()V", "Companion", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.H */
public final class C6448H {

    /* renamed from: a */
    private static C6449a f16304a = new C6449a((byte) 0);

    @Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\r"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/InitServerResponse$Companion;", "", "()V", "getCachedResponse", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "isResponseCached", "", "loadFromCache", "Lcom/ironsource/mediationsdk/utils/ServerResponseWrapper;", "loadResponseFromCache", "Lcom/ironsource/mediationsdk/CachedResponse;", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
    /* renamed from: com.ironsource.mediationsdk.H$a */
    public static final class C6449a {
        private C6449a() {
        }

        public /* synthetic */ C6449a(byte b) {
            this();
        }

        /* renamed from: b */
        private static JSONObject m19238b(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final C6731t mo36021a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject b = m19238b(context);
            String optString = b.optString("appKey");
            String optString2 = b.optString(DataKeys.USER_ID);
            String optString3 = b.optString("response");
            Intrinsics.checkNotNullExpressionValue(optString, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(optString2, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(optString3, "cachedSettings");
            return new C6731t(optString, optString2, optString3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if ((r0.f17551c.length() > 0) != false) goto L_0x003e;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ironsource.mediationsdk.utils.C6748l m19236a(android.content.Context r4) {
        /*
            com.ironsource.mediationsdk.H$a r0 = f16304a
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            com.ironsource.mediationsdk.H$a r0 = (com.ironsource.mediationsdk.C6448H.C6449a) r0
            com.ironsource.mediationsdk.t r0 = r0.mo36021a(r4)
            java.lang.String r1 = r0.f17549a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = r3
        L_0x001c:
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r0.f17550b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x002a
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r1 = r3
        L_0x002b:
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r0.f17551c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0039
            r1 = r2
            goto L_0x003a
        L_0x0039:
            r1 = r3
        L_0x003a:
            if (r1 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            r1 = 0
            if (r2 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            if (r0 == 0) goto L_0x0055
            com.ironsource.mediationsdk.utils.l r1 = new com.ironsource.mediationsdk.utils.l
            java.lang.String r2 = r0.f17549a
            java.lang.String r3 = r0.f17550b
            java.lang.String r0 = r0.f17551c
            r1.<init>(r4, r2, r3, r0)
            int r4 = com.ironsource.mediationsdk.utils.C6748l.C6749a.f17775b
            r1.mo36980a((int) r4)
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6448H.m19236a(android.content.Context):com.ironsource.mediationsdk.utils.l");
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m19237b(Context context) {
        C6449a aVar = f16304a;
        Intrinsics.checkNotNullParameter(context, "context");
        C6731t a = aVar.mo36021a(context);
        if (a.f17549a.length() > 0) {
            if (a.f17550b.length() > 0) {
                if (a.f17551c.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
