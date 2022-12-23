package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p367a.p368a.C9480f;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public Context f23195a;

    /* renamed from: b */
    protected CampaignEx f23196b;

    /* renamed from: c */
    protected LayoutInflater f23197c;

    /* renamed from: d */
    protected int f23198d;

    /* renamed from: e */
    protected C9473a f23199e;

    /* renamed from: f */
    protected boolean f23200f;

    /* renamed from: g */
    protected float f23201g;

    /* renamed from: h */
    protected float f23202h;

    /* renamed from: i */
    protected boolean f23203i;

    /* renamed from: j */
    protected int f23204j;

    /* renamed from: k */
    protected boolean f23205k;

    /* renamed from: l */
    protected int f23206l;

    /* renamed from: m */
    protected int f23207m;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62973c() {
    }

    public abstract void init(Context context);

    public MBridgeBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet);
        this.f23198d = 1;
        this.f23199e = new C9480f();
        this.f23200f = false;
        this.f23206l = 1;
        this.f23207m = 0;
        this.f23195a = context;
        this.f23197c = LayoutInflater.from(context);
        this.f23203i = z;
        this.f23204j = i;
        this.f23205k = z2;
        this.f23206l = i2;
        this.f23207m = i3;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23198d = 1;
        this.f23199e = new C9480f();
        this.f23200f = false;
        this.f23206l = 1;
        this.f23207m = 0;
        this.f23195a = context;
        this.f23197c = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f23198d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f23198d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setNotifyListener(C9473a aVar) {
        this.f23199e = aVar;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f23196b = campaignEx;
    }

    public int findID(String str) {
        return C8658p.m24799a(this.f23195a.getApplicationContext(), str, "id");
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int filterFindViewId(boolean z, String str) {
        if (z) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findLayout(String str) {
        return C8658p.m24799a(this.f23195a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C8658p.m24799a(this.f23195a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C8658p.m24799a(this.f23195a.getApplicationContext(), str, "drawable");
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
        return this.f23195a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
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
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
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

    public CampaignEx getCampaign() {
        return this.f23196b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f23201g = motionEvent.getRawX();
        this.f23202h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo62974d() {
        return mo62972a(0).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo62972a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C8469a.f20744e, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f23201g));
                jSONObject2.put(C8469a.f20745f, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f23202h));
                jSONObject2.put(C8469a.f20747h, i);
                try {
                    this.f23198d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C8469a.f20748i, this.f23198d);
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
}
