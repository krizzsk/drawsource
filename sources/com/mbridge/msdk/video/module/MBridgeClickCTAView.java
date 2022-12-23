package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.dynview.C9312a;
import com.mbridge.msdk.video.dynview.C9314b;
import com.mbridge.msdk.video.dynview.p353c.C9321a;
import com.mbridge.msdk.video.dynview.p354d.C9328g;
import com.mbridge.msdk.video.dynview.p365j.C9382c;
import com.mbridge.msdk.video.module.p367a.p368a.C9478e;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.widget.C9676a;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeClickCTAView extends MBridgeBaseView {

    /* renamed from: n */
    private ViewGroup f23208n;

    /* renamed from: o */
    private ImageView f23209o;

    /* renamed from: p */
    private TextView f23210p;

    /* renamed from: q */
    private TextView f23211q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f23212r;

    /* renamed from: s */
    private String f23213s;

    /* renamed from: t */
    private float f23214t;

    /* renamed from: u */
    private float f23215u;

    /* renamed from: v */
    private int f23216v;

    /* renamed from: w */
    private ObjectAnimator f23217w;

    public void init(Context context) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f23217w = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f23213s = str;
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        super.mo62973c();
        if (this.f23200f) {
            if (this.f23196b != null && this.f23196b.isDynamicView()) {
                setOnClickListener(new C9676a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58499a(View view) {
                        MBridgeClickCTAView.m26814b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.f23211q.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeClickCTAView.m26814b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.f23209o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    public void preLoadData(C9618b bVar) {
        if (this.f23196b != null) {
            if (this.f23196b.isDynamicView()) {
                C9314b.m26503a().mo62742a(new C9382c().mo62907b((View) this, this.f23196b), new C9328g() {
                    /* renamed from: a */
                    public final void mo62659a(C9312a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.mo62736a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f23200f = mBridgeClickCTAView.m26815b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            TextView unused = mBridgeClickCTAView2.f23212r = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.mo62973c();
                        }
                    }

                    /* renamed from: a */
                    public final void mo62660a(C9321a aVar) {
                        C8672v.m24878d(MBridgeBaseView.TAG, "errorMsg:" + aVar.mo62772b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f23197c.inflate(findLayout, this);
                    this.f23200f = m26815b();
                    mo62973c();
                    setWrapContent();
                }
            }
            if (this.f23200f) {
                this.f23211q.setText(this.f23196b.getAdCall());
                if (!TextUtils.isEmpty(this.f23196b.getIconUrl())) {
                    C8481b.m24310a(this.f23195a.getApplicationContext()).mo57883a(this.f23196b.getIconUrl(), (C8484c) new C9478e(this.f23209o, this.f23196b, this.f23213s) {
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.m26812a();
                        }
                    });
                } else {
                    m26812a();
                }
                if (this.f23210p != null && !TextUtils.isEmpty(this.f23196b.getAppName())) {
                    this.f23210p.setText(this.f23196b.getAppName());
                }
                if (this.f23212r != null && !TextUtils.isEmpty(this.f23196b.getAppDesc())) {
                    this.f23212r.setText(this.f23196b.getAppDesc());
                }
            }
        }
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f23216v = configuration.orientation;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26812a() {
        ImageView imageView = this.f23209o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m26815b() {
        this.f23208n = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f23209o = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f23210p = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.f23211q = textView;
        return isNotNULL(this.f23208n, this.f23209o, this.f23210p, textView);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f23214t = motionEvent.getRawX();
        this.f23215u = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f23217w;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f23217w;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m26814b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e;
        if (mBridgeClickCTAView.f23196b != null && mBridgeClickCTAView.f23196b.isDynamicView()) {
            try {
                CampaignEx.C8454c rewardTemplateMode = mBridgeClickCTAView.f23196b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.mo57573b() + str;
                }
                C8598e.m24675a(mBridgeClickCTAView.f23195a, "cta_click", mBridgeClickCTAView.f23196b.getCampaignUnitId(), mBridgeClickCTAView.f23196b.isBidCampaign(), mBridgeClickCTAView.f23196b.getRequestId(), mBridgeClickCTAView.f23196b.getRequestIdNotice(), mBridgeClickCTAView.f23196b.getId(), str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8469a.f20746g, mBridgeClickCTAView.mo62972a(0));
            } catch (JSONException e3) {
                e = e3;
            }
        } catch (JSONException e4) {
            JSONException jSONException = e4;
            jSONObject = null;
            e = jSONException;
            e.printStackTrace();
            mBridgeClickCTAView.f23199e.mo62631a(105, jSONObject);
        }
        mBridgeClickCTAView.f23199e.mo62631a(105, jSONObject);
    }
}
