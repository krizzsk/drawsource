package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11481fp;
import com.tapjoy.internal.C11488fs;
import com.tapjoy.internal.C11496fy;
import com.tapjoy.internal.C11519gh;
import com.tapjoy.internal.C11520gi;
import com.tapjoy.internal.C11547hc;
import com.tapjoy.internal.C11550hf;
import com.tapjoy.internal.C11558hj;
import com.tapjoy.internal.C11572ho;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TJPlacement {

    /* renamed from: a */
    TJPlacementListener f26670a;

    /* renamed from: b */
    private TJCorePlacement f26671b;

    /* renamed from: c */
    private TJPlacementListener f26672c;

    /* renamed from: d */
    private TJPlacementVideoListener f26673d;

    /* renamed from: e */
    private String f26674e;
    public String pushId;

    @Deprecated
    public TJPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = TJPlacementManager.m30756a(str);
        a = a == null ? TJPlacementManager.m30757a(str, "", "", false, false) : a;
        a.setContext(context);
        m30754a(a, tJPlacementListener);
    }

    TJPlacement(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        m30754a(tJCorePlacement, tJPlacementListener);
    }

    /* renamed from: a */
    private void m30754a(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        this.f26671b = tJCorePlacement;
        this.f26674e = UUID.randomUUID().toString();
        this.f26672c = tJPlacementListener;
        this.f26670a = tJPlacementListener != null ? (TJPlacementListener) C11481fp.m31447a(tJPlacementListener, TJPlacementListener.class) : null;
        FiveRocksIntegration.addPlacementCallback(getName(), this);
    }

    public TJPlacementListener getListener() {
        return this.f26672c;
    }

    public void setVideoListener(TJPlacementVideoListener tJPlacementVideoListener) {
        this.f26673d = tJPlacementVideoListener;
    }

    public TJPlacementVideoListener getVideoListener() {
        return this.f26673d;
    }

    public String getName() {
        return this.f26671b.getPlacementData() != null ? this.f26671b.getPlacementData().getPlacementName() : "";
    }

    public boolean isLimited() {
        return this.f26671b.isLimited();
    }

    public boolean isContentReady() {
        boolean isContentReady = this.f26671b.isContentReady();
        C11496fy fyVar = this.f26671b.f26608f;
        if (isContentReady) {
            fyVar.mo70021a(4);
        } else {
            fyVar.mo70021a(2);
        }
        return isContentReady;
    }

    public boolean isContentAvailable() {
        this.f26671b.f26608f.mo70021a(1);
        return this.f26671b.isContentAvailable();
    }

    public void setMediationId(String str) {
        this.f26671b.f26619q = str;
    }

    public void requestContent() {
        boolean z;
        String name = getName();
        TapjoyLog.m30842i("TJPlacement", "requestContent() called for placement ".concat(String.valueOf(name)));
        C11520gi.m31523a("TJPlacement.requestContent").mo70066a("placement", (Object) name).mo70066a("placement_type", (Object) this.f26671b.f26605c.getPlacementType());
        if (C11519gh.m31513a() != null && TextUtils.isEmpty(C11519gh.m31513a().f27659a)) {
            TapjoyLog.m30844w("TJPlacement", "[INFO] Your application calls requestContent without having previously called setUserConsent. You can review Tapjoy supported consent API here - https://dev.tapjoy.com/sdk-integration/#sdk11122_gdpr_release.");
        }
        if (!isLimited()) {
            z = TapjoyConnectCore.isConnected();
        } else {
            z = TapjoyConnectCore.isLimitedConnected();
        }
        boolean z2 = false;
        if (!z) {
            C11520gi.m31530b("TJPlacement.requestContent").mo70069b("not connected").mo70071c();
            m30755a(new TJError(0, "SDK not connected -- connect must be called first with a successful callback"));
        } else if (this.f26671b.getContext() == null) {
            C11520gi.m31530b("TJPlacement.requestContent").mo70069b("no context").mo70071c();
            m30755a(new TJError(0, "Context is null -- TJPlacement requires a valid Context."));
        } else if (TextUtils.isEmpty(name)) {
            C11520gi.m31530b("TJPlacement.requestContent").mo70069b("invalid name").mo70071c();
            m30755a(new TJError(0, "Invalid placement name -- TJPlacement requires a valid placement name."));
        } else {
            try {
                TJCorePlacement tJCorePlacement = this.f26671b;
                tJCorePlacement.mo69378a("REQUEST", this);
                if (tJCorePlacement.f26607e - SystemClock.elapsedRealtime() > 0) {
                    TapjoyLog.m30839d(TJCorePlacement.f26602a, "Content has not expired yet for " + tJCorePlacement.f26605c.getPlacementName());
                    if (tJCorePlacement.f26614l) {
                        C11520gi.m31530b("TJPlacement.requestContent").mo70066a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) tJCorePlacement.mo69380b()).mo70066a(Constants.MessagePayloadKeys.FROM, (Object) "cache").mo70071c();
                        tJCorePlacement.f26613k = false;
                        tJCorePlacement.mo69376a(this);
                        tJCorePlacement.mo69381c();
                    } else {
                        C11520gi.m31530b("TJPlacement.requestContent").mo70066a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) "none").mo70066a(Constants.MessagePayloadKeys.FROM, (Object) "cache").mo70071c();
                        tJCorePlacement.mo69376a(this);
                    }
                } else {
                    if (tJCorePlacement.f26614l) {
                        C11520gi.m31532c("TJPlacement.requestContent").mo70066a("was_available", (Object) Boolean.TRUE);
                    }
                    if (tJCorePlacement.f26615m) {
                        C11520gi.m31532c("TJPlacement.requestContent").mo70066a("was_ready", (Object) Boolean.TRUE);
                    }
                    if (!TextUtils.isEmpty(tJCorePlacement.f26618p)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_AGENT, tJCorePlacement.f26618p);
                        hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_ID, tJCorePlacement.f26619q);
                        if (tJCorePlacement.f26620r != null && !tJCorePlacement.f26620r.isEmpty()) {
                            z2 = true;
                        }
                        if (z2) {
                            for (String next : tJCorePlacement.f26620r.keySet()) {
                                hashMap.put(TJAdUnitConstants.AUCTION_PARAM_PREFIX.concat(String.valueOf(next)), tJCorePlacement.f26620r.get(next));
                            }
                            tJCorePlacement.mo69379a(tJCorePlacement.f26605c.getAuctionMediationURL(), (Map<String, String>) hashMap);
                        } else {
                            tJCorePlacement.mo69379a(tJCorePlacement.f26605c.getMediationURL(), (Map<String, String>) hashMap);
                        }
                    } else {
                        tJCorePlacement.mo69375a();
                    }
                }
            } finally {
                C11520gi.m31533d("TJPlacement.requestContent");
            }
        }
    }

    public void showContent() {
        int i;
        TapjoyLog.m30842i("TJPlacement", "showContent() called for placement ".concat(String.valueOf(getName())));
        TJCorePlacement tJCorePlacement = this.f26671b;
        C11520gi.m31523a("TJPlacement.showContent").mo70066a("placement", (Object) tJCorePlacement.f26605c.getPlacementName()).mo70066a("placement_type", (Object) tJCorePlacement.f26605c.getPlacementType()).mo70066a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) tJCorePlacement.mo69380b());
        C11496fy fyVar = tJCorePlacement.f26608f;
        fyVar.mo70021a(8);
        C11488fs fsVar = fyVar.f27591a;
        if (fsVar != null) {
            fsVar.mo70012a();
        }
        if (!this.f26671b.isContentAvailable()) {
            TapjoyLog.m30840e("TJPlacement", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "No placement content available. Can not show content for non-200 placement."));
            C11520gi.m31530b("TJPlacement.showContent").mo70069b("no content").mo70071c();
            return;
        }
        try {
            TJCorePlacement tJCorePlacement2 = this.f26671b;
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                TapjoyLog.m30844w(TJCorePlacement.f26602a, "Only one view can be presented at a time.");
                C11520gi.m31530b("TJPlacement.showContent").mo70069b("another content showing").mo70071c();
            } else {
                if (TapjoyConnectCore.isViewOpen()) {
                    TapjoyLog.m30844w(TJCorePlacement.f26602a, "Will close N2E content.");
                    TJPlacementManager.dismissContentShowing(false);
                }
                tJCorePlacement2.mo69378a("SHOW", this);
                C11520gi.C11522a d = C11520gi.m31533d("TJPlacement.showContent");
                if (tJCorePlacement2.f26609g.isPrerendered()) {
                    d.mo70066a("prerendered", (Object) Boolean.TRUE);
                }
                if (tJCorePlacement2.isContentReady()) {
                    d.mo70066a("content_ready", (Object) Boolean.TRUE);
                }
                tJCorePlacement2.f26608f.f27594d = d;
                String uuid = UUID.randomUUID().toString();
                if (tJCorePlacement2.f26611i != null) {
                    tJCorePlacement2.f26611i.f27813f = uuid;
                    if (tJCorePlacement2.f26611i == null) {
                        i = 1;
                    } else if (tJCorePlacement2.f26611i instanceof C11550hf) {
                        i = 3;
                    } else {
                        i = tJCorePlacement2.f26611i instanceof C11572ho ? 2 : 0;
                    }
                    TapjoyConnectCore.viewWillOpen(uuid, i);
                    tJCorePlacement2.f26611i.f27812e = new C11547hc(uuid) {

                        /* renamed from: a */
                        final /* synthetic */ String f26638a;

                        {
                            this.f26638a = r2;
                        }

                        /* renamed from: a */
                        public final void mo69393a(Context context, String str, String str2) {
                            if (str2 == null) {
                                TJCorePlacement.this.f26605c.setRedirectURL(str);
                            } else {
                                TJCorePlacement.this.f26605c.setBaseURL(str);
                                TJCorePlacement.this.f26605c.setHttpResponse(str2);
                            }
                            TJCorePlacement.this.f26605c.setHasProgressSpinner(true);
                            TJCorePlacement.this.f26605c.setContentViewId(this.f26638a);
                            Intent intent = new Intent(TJCorePlacement.this.f26604b, TJAdUnitActivity.class);
                            intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, TJCorePlacement.this.f26605c);
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                        }
                    };
                    C11558hj.m31648a((Runnable) new Runnable() {
                        public final void run() {
                            TJCorePlacement.this.f26611i.mo70090a(C11558hj.m31644a().f27754o, TJCorePlacement.this.f26608f);
                        }
                    });
                } else {
                    tJCorePlacement2.f26605c.setContentViewId(uuid);
                    Intent intent = new Intent(tJCorePlacement2.f26604b, TJAdUnitActivity.class);
                    intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, tJCorePlacement2.f26605c);
                    intent.setFlags(268435456);
                    tJCorePlacement2.f26604b.startActivity(intent);
                }
                tJCorePlacement2.f26607e = 0;
                tJCorePlacement2.f26614l = false;
                tJCorePlacement2.f26615m = false;
            }
        } finally {
            C11520gi.m31533d("TJPlacement.showContent");
        }
    }

    public void setAuctionData(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            TapjoyLog.m30839d("TJPlacement", "auctionData can not be null or empty");
            return;
        }
        TJCorePlacement tJCorePlacement = this.f26671b;
        tJCorePlacement.f26620r = hashMap;
        String e = tJCorePlacement.mo69383e();
        if (!TextUtils.isEmpty(e)) {
            tJCorePlacement.f26605c.setAuctionMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/bid_content?");
            return;
        }
        TapjoyLog.m30842i(TJCorePlacement.f26602a, "Placement auction data can not be set for a null app ID");
    }

    public void setMediationName(String str) {
        TapjoyLog.m30839d("TJPlacement", "setMediationName=".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            TJCorePlacement tJCorePlacement = this.f26671b;
            Context context = tJCorePlacement != null ? tJCorePlacement.getContext() : null;
            TJCorePlacement a = TJPlacementManager.m30757a(getName(), str, "", false, isLimited());
            this.f26671b = a;
            a.f26618p = str;
            a.f26616n = str;
            a.f26605c.setPlacementType(str);
            String e = a.mo69383e();
            if (!TextUtils.isEmpty(e)) {
                a.f26605c.setMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + e + "/mediation_content?");
            } else {
                TapjoyLog.m30842i(TJCorePlacement.f26602a, "Placement mediation name can not be set for a null app ID");
            }
            if (context != null) {
                this.f26671b.setContext(context);
            }
        }
    }

    public void setAdapterVersion(String str) {
        this.f26671b.f26617o = str;
    }

    public static void dismissContent() {
        TJPlacementManager.dismissContentShowing("true".equals(TapjoyConnectCore.getConnectFlagValue("TJC_OPTION_DISMISS_CONTENT_ALL")));
    }

    public String getGUID() {
        return this.f26674e;
    }

    /* renamed from: a */
    private void m30755a(TJError tJError) {
        this.f26671b.mo69377a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, tJError);
    }
}
