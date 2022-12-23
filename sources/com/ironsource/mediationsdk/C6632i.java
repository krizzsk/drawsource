package com.ironsource.mediationsdk;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.C6736c;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/AuctionHelper;", "", "settings", "Lcom/ironsource/mediationsdk/utils/AuctionSettings;", "isOneToken", "", "sessionId", "", "(Lcom/ironsource/mediationsdk/utils/AuctionSettings;ZLjava/lang/String;)V", "generateAuctionHttpRequestTask", "Lcom/ironsource/mediationsdk/AuctionHandler$AuctionHttpRequestTask;", "context", "Landroid/content/Context;", "auctionParams", "Lcom/ironsource/mediationsdk/AuctionParams;", "auctionListener", "Lcom/ironsource/mediationsdk/AuctionEventListener;", "generateRequest", "Lorg/json/JSONObject;", "getSegmentDataJson", "segment", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "isAuctionEnabled", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.i */
public final class C6632i {

    /* renamed from: a */
    final C6736c f17221a;

    /* renamed from: b */
    final boolean f17222b;

    /* renamed from: c */
    final String f17223c;

    public C6632i(C6736c cVar, boolean z, String str) {
        Intrinsics.checkNotNullParameter(cVar, "settings");
        Intrinsics.checkNotNullParameter(str, "sessionId");
        this.f17221a = cVar;
        this.f17222b = z;
        this.f17223c = str;
    }

    /* renamed from: a */
    static JSONObject m20193a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a = ironSourceSegment.mo36082a();
        Intrinsics.checkNotNullExpressionValue(a, "segmentData");
        int size = a.size();
        for (int i = 0; i < size; i++) {
            try {
                jSONObject.put((String) a.get(i).first, a.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }
}
