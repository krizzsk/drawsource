package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.video.module.p367a.p368a.C9484j;
import com.mbridge.msdk.video.signal.factory.C9618b;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: n */
    private final String f23373n = "MBridgeVideoEndCoverView";

    /* renamed from: o */
    private View f23374o;

    /* renamed from: p */
    private ImageView f23375p;

    /* renamed from: q */
    private ImageView f23376q;

    /* renamed from: r */
    private TextView f23377r;

    /* renamed from: s */
    private TextView f23378s;

    /* renamed from: t */
    private TextView f23379t;

    /* renamed from: u */
    private C9618b f23380u;

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f23197c.inflate(findLayout, (ViewGroup) null);
            this.f23374o = inflate;
            if (inflate != null) {
                this.f23200f = m26908a(inflate);
                addView(this.f23374o, -1, -1);
                mo62973c();
            }
        }
    }

    public void preLoadData(C9618b bVar) {
        this.f23380u = bVar;
        try {
            if (this.f23196b != null && this.f23200f && this.f23196b != null) {
                if (!TextUtils.isEmpty(this.f23196b.getIconUrl()) && this.f23375p != null) {
                    C8481b.m24310a(this.f23195a.getApplicationContext()).mo57883a(this.f23196b.getIconUrl(), (C8484c) new C9484j(this.f23375p, C8677z.m24924b(C8388a.m23845e().mo56913g(), 8.0f)));
                }
                if (this.f23377r != null) {
                    this.f23377r.setText(this.f23196b.getAppName());
                }
                if (this.f23379t != null) {
                    this.f23379t.setText(this.f23196b.getAdCall());
                }
                if (this.f23378s != null) {
                    this.f23378s.setText(this.f23196b.getAppDesc());
                }
            }
        } catch (Throwable th) {
            C8672v.m24874a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f23201g = motionEvent.getRawX();
        this.f23202h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f23198d = configuration.orientation;
        removeView(this.f23374o);
        View view = this.f23374o;
        if (view == null) {
            init(this.f23195a);
            preLoadData(this.f23380u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f23374o.getParent()).removeView(this.f23374o);
        }
        addView(this.f23374o);
        m26908a(this.f23374o);
        mo62973c();
    }

    /* renamed from: a */
    private boolean m26908a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f23375p = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f23376q = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f23377r = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f23378s = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f23379t = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            C8672v.m24878d("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        super.mo62973c();
        this.f23376q.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.f23199e.mo62631a(104, "");
            }
        });
        this.f23375p.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.mo63127a();
            }
        });
        this.f23379t.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.mo63127a();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63127a() {
        JSONObject jSONObject;
        JSONException e;
        JSONObject jSONObject2;
        JSONException e2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(C8469a.f20744e, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f23201g));
                    jSONObject2.put(C8469a.f20745f, C8677z.m24906a(C8388a.m23845e().mo56913g(), this.f23202h));
                    jSONObject2.put(C8469a.f20747h, 0);
                    try {
                        this.f23198d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    jSONObject2.put(C8469a.f20748i, this.f23198d);
                    jSONObject2.put(C8469a.f20749j, (double) C8677z.m24936d(getContext()));
                } catch (JSONException e4) {
                    e2 = e4;
                    C8672v.m24878d("MBridgeVideoEndCoverView", e2.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(C8469a.f20746g, jSONObject2);
                    this.f23199e.mo62631a(105, jSONObject);
                }
            } catch (JSONException e5) {
                JSONException jSONException = e5;
                jSONObject2 = jSONObject3;
                e2 = jSONException;
                C8672v.m24878d("MBridgeVideoEndCoverView", e2.getMessage());
                jSONObject = new JSONObject();
                jSONObject.put(C8469a.f20746g, jSONObject2);
                this.f23199e.mo62631a(105, jSONObject);
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8469a.f20746g, jSONObject2);
            } catch (JSONException e6) {
                e = e6;
            }
        } catch (JSONException e7) {
            JSONException jSONException2 = e7;
            jSONObject = null;
            e = jSONException2;
            e.printStackTrace();
            this.f23199e.mo62631a(105, jSONObject);
        }
        this.f23199e.mo62631a(105, jSONObject);
    }
}
