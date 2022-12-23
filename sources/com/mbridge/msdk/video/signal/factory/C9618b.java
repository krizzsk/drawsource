package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p347bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.signal.C9502a;
import com.mbridge.msdk.video.signal.C9520b;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9620h;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.p371a.C9512h;
import com.mbridge.msdk.video.signal.p371a.C9513i;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.video.signal.p371a.C9516k;
import com.mbridge.msdk.video.signal.p371a.C9517l;
import com.mbridge.msdk.video.signal.p371a.C9518m;
import com.mbridge.msdk.video.signal.p371a.C9519n;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.signal.factory.b */
/* compiled from: JSFactory */
public final class C9618b extends C9617a {

    /* renamed from: h */
    private Activity f23886h;

    /* renamed from: i */
    private WebView f23887i;

    /* renamed from: j */
    private MBridgeVideoView f23888j;

    /* renamed from: k */
    private MBridgeContainerView f23889k;

    /* renamed from: l */
    private CampaignEx f23890l;

    /* renamed from: m */
    private MBridgeBTContainer f23891m;

    /* renamed from: n */
    private C9521c.C9522a f23892n;

    /* renamed from: o */
    private String f23893o;

    /* renamed from: p */
    private List<CampaignEx> f23894p;

    public C9618b(Activity activity) {
        this.f23886h = activity;
    }

    public C9618b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f23886h = activity;
        this.f23891m = mBridgeBTContainer;
        this.f23887i = webView;
    }

    public C9618b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9521c.C9522a aVar) {
        this.f23886h = activity;
        this.f23887i = webView;
        this.f23888j = mBridgeVideoView;
        this.f23889k = mBridgeContainerView;
        this.f23890l = campaignEx;
        this.f23892n = aVar;
        this.f23893o = mBridgeVideoView.getUnitId();
    }

    public final C9502a getActivityProxy() {
        if (this.f23887i == null) {
            return super.getActivityProxy();
        }
        if (this.f23879a == null) {
            this.f23879a = new C9512h(this.f23887i);
        }
        return this.f23879a;
    }

    public final C9616f getJSNotifyProxy() {
        if (this.f23887i == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f23882d == null) {
            this.f23882d = new C9517l(this.f23887i);
        }
        return this.f23882d;
    }

    public final C9521c getJSCommon() {
        if (this.f23886h == null || this.f23890l == null) {
            return super.getJSCommon();
        }
        if (this.f23880b == null) {
            this.f23880b = new C9514j(this.f23886h, this.f23890l);
        }
        if (this.f23890l.getDynamicTempCode() == 5 && this.f23894p != null && (this.f23880b instanceof C9514j)) {
            ((C9514j) this.f23880b).mo63277a(this.f23894p);
        }
        this.f23880b.mo63241a(this.f23886h);
        this.f23880b.mo63244a(this.f23893o);
        this.f23880b.mo63242a(this.f23892n);
        return this.f23880b;
    }

    public final C9621i getJSVideoModule() {
        if (this.f23888j == null) {
            return super.getJSVideoModule();
        }
        if (this.f23881c == null) {
            this.f23881c = new C9519n(this.f23888j);
        }
        return this.f23881c;
    }

    public final C9615e getJSContainerModule() {
        if (this.f23889k == null) {
            return super.getJSContainerModule();
        }
        if (this.f23883e == null) {
            this.f23883e = new C9516k(this.f23889k);
        }
        return this.f23883e;
    }

    public final C9620h getIJSRewardVideoV1() {
        if (this.f23889k == null || this.f23886h == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f23884f == null) {
            this.f23884f = new C9518m(this.f23886h, this.f23889k);
        }
        return this.f23884f;
    }

    public final C9520b getJSBTModule() {
        if (this.f23886h == null || this.f23891m == null) {
            return super.getJSBTModule();
        }
        if (this.f23885g == null) {
            this.f23885g = new C9513i(this.f23886h, this.f23891m);
        }
        return this.f23885g;
    }

    /* renamed from: a */
    public final void mo63495a(C9514j jVar) {
        this.f23880b = jVar;
    }

    /* renamed from: a */
    public final void mo63496a(List<CampaignEx> list) {
        this.f23894p = list;
    }
}
