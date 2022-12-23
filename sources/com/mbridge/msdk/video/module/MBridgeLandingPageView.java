package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.mbsignalcommon.base.C8856a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.factory.C9618b;

public class MBridgeLandingPageView extends MBridgeH5EndCardView {
    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62968a() {
        if (this.f23196b != null) {
            return C6779b.m20642a(this.f23196b.getClickURL(), "-999", "-999");
        }
        return null;
    }

    public void preLoadData(C9618b bVar) {
        if (this.f23200f) {
            this.f23287q.setFilter(new C9437a());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    public void webviewshow() {
        try {
            C8672v.m24874a(MBridgeBaseView.TAG, "webviewshow");
            C8887g.m25669a().mo58687a((WebView) this.f23287q, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeLandingPageView$a */
    private static final class C9437a implements C8856a {
        private C9437a() {
        }

        /* renamed from: a */
        public final boolean mo58583a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            C8675y.m24897b(C8388a.m23845e().mo56913g(), str, (NativeListener.NativeTrackingListener) null);
            return true;
        }
    }
}
