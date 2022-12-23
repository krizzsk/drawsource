package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.C9502a;
import com.mbridge.msdk.video.signal.C9520b;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9620h;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.factory.C9617a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import org.json.JSONObject;

public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a */
    private int f23862a = 0;

    /* renamed from: b */
    private int f23863b = 1;
    /* access modifiers changed from: protected */

    /* renamed from: j */
    public Activity f23864j;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public String f23865k;
    /* access modifiers changed from: protected */

    /* renamed from: l */
    public String f23866l;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public C9640c f23867m;

    /* renamed from: n */
    protected String f23868n;

    /* renamed from: o */
    protected C9630c f23869o;

    /* renamed from: p */
    protected String f23870p;

    /* renamed from: q */
    protected int f23871q = 2;
    /* access modifiers changed from: protected */

    /* renamed from: r */
    public boolean f23872r = false;

    /* renamed from: s */
    protected boolean f23873s = false;

    /* renamed from: t */
    protected int f23874t;

    /* renamed from: u */
    protected int f23875u;

    /* renamed from: v */
    protected int f23876v;
    /* access modifiers changed from: protected */

    /* renamed from: w */
    public boolean f23877w = false;

    /* renamed from: x */
    protected IJSFactory f23878x = new C9617a();

    public AbstractJSContainer(Context context) {
        super(context);
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f23878x = iJSFactory;
    }

    public void onResume() {
        if (!C2470b.f5205c) {
            if (getJSCommon().mo63249b()) {
                getActivityProxy().mo63231b();
            }
            getActivityProxy().mo63229a(0);
        }
    }

    public void onPause() {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63228a();
        }
        getActivityProxy().mo63229a(1);
    }

    public void onStop() {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63232c();
        }
        getActivityProxy().mo63229a(3);
    }

    public void onRestart() {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63234e();
        }
        getActivityProxy().mo63229a(4);
    }

    public void onStart() {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63233d();
        }
        getActivityProxy().mo63229a(2);
    }

    public void onDestroy() {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63235f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63230a(configuration);
        }
    }

    public C9502a getActivityProxy() {
        return this.f23878x.getActivityProxy();
    }

    public C9521c getJSCommon() {
        return this.f23878x.getJSCommon();
    }

    public C9621i getJSVideoModule() {
        return this.f23878x.getJSVideoModule();
    }

    public C9616f getJSNotifyProxy() {
        return this.f23878x.getJSNotifyProxy();
    }

    public C9615e getJSContainerModule() {
        return this.f23878x.getJSContainerModule();
    }

    public C9620h getIJSRewardVideoV1() {
        return this.f23878x.getIJSRewardVideoV1();
    }

    public C9520b getJSBTModule() {
        return this.f23878x.getJSBTModule();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63473a(Object obj) {
        C8887g.m25669a().mo58688a(obj, m27279a(this.f23862a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63474a(Object obj, String str) {
        C8887g.m25669a().mo58690b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* renamed from: a */
    private String m27279a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8672v.m24878d("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    public void setRewardId(String str) {
        this.f23870p = str;
    }

    public void setUserId(String str) {
        this.f23868n = str;
    }

    public void setUnitId(String str) {
        this.f23865k = str;
    }

    public String getUnitId() {
        return this.f23865k;
    }

    public String getPlacementId() {
        return this.f23866l;
    }

    public void setPlacementId(String str) {
        this.f23866l = str;
    }

    public void setActivity(Activity activity) {
        this.f23864j = activity;
    }

    public void setReward(C9630c cVar) {
        this.f23869o = cVar;
    }

    public void setMute(int i) {
        this.f23871q = i;
    }

    public void setIV(boolean z) {
        this.f23872r = z;
    }

    public void setBidCampaign(boolean z) {
        this.f23873s = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f23874t = i;
        this.f23875u = i2;
        this.f23876v = i3;
    }

    public void setBigOffer(boolean z) {
        this.f23877w = z;
    }

    public void setRewardUnitSetting(C9640c cVar) {
        this.f23867m = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62581a(String str) {
        C8672v.m24878d("AbstractJSContainer", str);
        Activity activity = this.f23864j;
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9514j mo63475b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        C9625a.C9626a a = C9625a.m27299a(this.f23872r ? 287 : 94, campaignEx);
        if (a != null && a.mo63502c()) {
            WindVaneWebView a2 = a.mo63497a();
            if (a2.getObject() instanceof C9514j) {
                return (C9514j) a2.getObject();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo63477c(CampaignEx campaignEx) {
        C9514j b = mo63475b(campaignEx);
        if (b != null) {
            return b.mo63265l();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63472a(C9640c cVar, CampaignEx campaignEx) {
        CampaignEx.C8454c rewardTemplateMode;
        if (mo63477c(campaignEx) != 1) {
            boolean z = false;
            if (!(campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null)) {
                z = m27280b(rewardTemplateMode.mo57574c());
            }
            if (!z && cVar != null) {
                m27280b(this.f23867m.mo63572c());
            }
        }
    }

    /* renamed from: b */
    private boolean m27280b(int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f23864j.setRequestedOrientation(11);
                } else {
                    this.f23864j.setRequestedOrientation(0);
                }
            } catch (Throwable th) {
                C8672v.m24875a("AbstractJSContainer", th.getMessage(), th);
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f23864j.setRequestedOrientation(12);
        } else {
            this.f23864j.setRequestedOrientation(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo63476b() {
        C9640c cVar;
        if (!TextUtils.isEmpty(this.f23866l) || (cVar = this.f23867m) == null || TextUtils.isEmpty(cVar.mo63616y())) {
            return this.f23866l;
        }
        return this.f23867m.mo63616y();
    }
}
