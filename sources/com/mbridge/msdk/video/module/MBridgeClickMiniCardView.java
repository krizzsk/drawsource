package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.videocommon.download.C9652g;
import org.json.JSONObject;

public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: y */
    private boolean f23224y = false;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f23200f) {
            m26822a(this.f23284n);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo62969b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo63002e() {
        super.mo63002e();
        if (this.f23200f) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            m26822a(this.f23284n);
            setClickable(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62968a() {
        String str = null;
        if (this.f23196b == null) {
            return null;
        }
        CampaignEx.C8454c rewardTemplateMode = this.f23196b.getRewardTemplateMode();
        if (rewardTemplateMode != null) {
            str = rewardTemplateMode.mo57575d();
        }
        if (TextUtils.isEmpty(str) || !str.contains(".zip")) {
            return str;
        }
        String b = C9652g.m27539a().mo63670b(str);
        return !TextUtils.isEmpty(b) ? b : str;
    }

    public void preLoadData(C9618b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void webviewshow() {
        if (this.f23287q != null) {
            this.f23287q.post(new Runnable() {
                public final void run() {
                    try {
                        C8672v.m24874a(MBridgeBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBridgeClickMiniCardView.this.f23287q.getLocationOnScreen(iArr);
                            C8672v.m24878d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", C8677z.m24906a(C8388a.m23845e().mo56913g(), (float) iArr[0]));
                            jSONObject.put("startY", C8677z.m24906a(C8388a.m23845e().mo56913g(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
                        }
                        C8887g.m25669a().mo58687a((WebView) MBridgeClickMiniCardView.this.f23287q, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m26822a(View view) {
        int h = C8677z.m24947h(this.f23195a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((((float) h) * 0.7f) + 0.5f);
        layoutParams.height = (int) ((((float) C8677z.m24945g(this.f23195a)) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f23224y = true;
        resizeMiniCard(i3, i4);
    }

    public void resizeMiniCard(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            View findViewById = ((Activity) this.f23195a).getWindow().findViewById(16908290);
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            if (i > 0 && i2 > 0 && i <= width && i2 <= height) {
                ViewGroup.LayoutParams layoutParams = this.f23284n.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.f23284n.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) C8677z.m24924b(getContext(), (float) i));
            gradientDrawable.setColor(-1);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f23287q.setBackground(gradientDrawable);
            } else {
                this.f23287q.setBackgroundDrawable(gradientDrawable);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f23287q.setClipToOutline(true);
            }
        }
    }
}
