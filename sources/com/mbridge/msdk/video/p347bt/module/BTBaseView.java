package com.mbridge.msdk.video.p347bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.BTBaseView */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n */
    protected static int f22637n = 0;

    /* renamed from: o */
    protected static int f22638o = 1;

    /* renamed from: a */
    protected Context f22639a;

    /* renamed from: b */
    protected CampaignEx f22640b;

    /* renamed from: c */
    protected String f22641c;

    /* renamed from: d */
    protected String f22642d;

    /* renamed from: e */
    protected C9640c f22643e;

    /* renamed from: f */
    protected LayoutInflater f22644f;

    /* renamed from: g */
    protected int f22645g;

    /* renamed from: h */
    protected boolean f22646h;

    /* renamed from: i */
    protected float f22647i;

    /* renamed from: j */
    protected float f22648j;

    /* renamed from: k */
    protected Rect f22649k;

    /* renamed from: l */
    protected int f22650l;

    /* renamed from: m */
    protected int f22651m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62549a() {
    }

    public abstract void init(Context context);

    public abstract void onDestory();

    public String getUnitId() {
        return this.f22641c;
    }

    public void setUnitId(String str) {
        this.f22641c = str;
    }

    public String getInstanceId() {
        return this.f22642d;
    }

    public void setInstanceId(String str) {
        this.f22642d = str;
    }

    public BTBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22642d = "";
        this.f22645g = 1;
        this.f22646h = false;
        this.f22639a = context;
        this.f22644f = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f22645g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f22645g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22640b = campaignEx;
    }

    public void setRewardUnitSetting(C9640c cVar) {
        this.f22643e = cVar;
    }

    public int findID(String str) {
        return C8658p.m24799a(this.f22639a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8658p.m24799a(this.f22639a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C8658p.m24799a(this.f22639a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C8658p.m24799a(this.f22639a.getApplicationContext(), str, "drawable");
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public void defaultShow() {
        C8672v.m24874a(TAG, "defaultShow");
    }

    public boolean isLandscape() {
        return this.f22639a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public CampaignEx getCampaign() {
        return this.f22640b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22647i = motionEvent.getRawX();
        this.f22648j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo62548a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C8469a.f20744e, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f22647i));
                jSONObject2.put(C8469a.f20745f, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f22648j));
                jSONObject2.put(C8469a.f20747h, i);
                try {
                    this.f22645g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C8469a.f20748i, this.f22645g);
                jSONObject2.put(C8469a.f20749j, (double) C8677z.m24936d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject;
        }
    }

    public Rect getRect() {
        return this.f22649k;
    }

    public void setRect(Rect rect) {
        this.f22649k = rect;
    }

    public void setLayout(int i, int i2) {
        this.f22650l = i;
        this.f22651m = i2;
    }

    public int getViewWidth() {
        return this.f22650l;
    }

    public int getViewHeight() {
        return this.f22651m;
    }

    /* renamed from: a */
    protected static void m26279a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22637n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            C8887g.m25669a().mo58687a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C9261c.m26212a().mo62502a(webView, e.getMessage());
            C8672v.m24874a(TAG, e.getMessage());
        }
    }
}
