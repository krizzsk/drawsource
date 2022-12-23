package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

public class WindVaneWebView extends BaseWebView {

    /* renamed from: b */
    protected C8891k f21871b;

    /* renamed from: c */
    protected C8883c f21872c;

    /* renamed from: d */
    protected C8886f f21873d;

    /* renamed from: e */
    private Object f21874e;

    /* renamed from: f */
    private Object f21875f;

    /* renamed from: g */
    private String f21876g;

    /* renamed from: h */
    private C8884d f21877h;

    /* renamed from: i */
    private String f21878i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f21879j = false;

    /* renamed from: k */
    private float f21880k = 0.0f;

    /* renamed from: l */
    private float f21881l = 0.0f;

    public WindVaneWebView(Context context) {
        super(context);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSignalCommunication(C8883c cVar) {
        this.f21872c = cVar;
        cVar.mo58677a(this);
    }

    public C8883c getSignalCommunication() {
        return this.f21872c;
    }

    public void setRid(String str) {
        this.f21878i = str;
    }

    public String getRid() {
        return this.f21878i;
    }

    public Object getJsObject(String str) {
        C8886f fVar = this.f21873d;
        if (fVar == null) {
            return null;
        }
        return fVar.mo58682a(str);
    }

    public void registerWindVanePlugin(Class cls) {
        C8886f fVar = this.f21873d;
        if (fVar != null) {
            fVar.mo58685a(cls.getSimpleName(), cls);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58576a() {
        super.mo58576a();
        getSettings().setSavePassword(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f21871b == null) {
            this.f21871b = new C8891k(this);
        }
        setWebViewChromeClient(this.f21871b);
        this.mWebViewClient = new C8892l();
        setWebViewClient(this.mWebViewClient);
        if (this.f21872c == null) {
            C8889i iVar = new C8889i(this.f21823a);
            this.f21872c = iVar;
            setSignalCommunication(iVar);
        }
        this.f21873d = new C8886f(this.f21823a, this);
    }

    public void setApiManagerContext(Context context) {
        C8886f fVar = this.f21873d;
        if (fVar != null) {
            fVar.mo58683a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        C8886f fVar = this.f21873d;
        if (fVar != null) {
            fVar.mo58684a(obj);
        }
    }

    public void setWebViewChromeClient(C8891k kVar) {
        this.f21871b = kVar;
        setWebChromeClient(kVar);
    }

    public void setObject(Object obj) {
        this.f21874e = obj;
    }

    public Object getObject() {
        return this.f21874e;
    }

    public void setMraidObject(Object obj) {
        this.f21875f = obj;
    }

    public Object getMraidObject() {
        return this.f21875f;
    }

    public void setWebViewListener(C8884d dVar) {
        this.f21877h = dVar;
        C8891k kVar = this.f21871b;
        if (kVar != null) {
            kVar.mo58693a(dVar);
        }
        if (this.mWebViewClient != null) {
            this.mWebViewClient.mo58585a(dVar);
        }
    }

    public C8884d getWebViewListener() {
        return this.f21877h;
    }

    public boolean isDestoryed() {
        return this.f21879j;
    }

    public void release() {
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener((DownloadListener) null);
            this.f21874e = null;
            int m = C8677z.m24957m(getContext());
            if (m == 0) {
                this.f21879j = true;
                destroy();
                return;
            }
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    boolean unused = WindVaneWebView.this.f21879j = true;
                    WindVaneWebView.this.destroy();
                }
            }, (long) (m * 1000));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearWebView() {
        if (!this.f21879j) {
            loadUrl("about:blank");
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public String getCampaignId() {
        return this.f21876g;
    }

    public void setCampaignId(String str) {
        this.f21876g = str;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mWebViewClient != null && (this.mWebViewClient.mo58586b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f21880k = motionEvent.getRawX();
                    this.f21881l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f21880k;
                    float y = motionEvent.getY() - this.f21881l;
                    if ((rawX >= 0.0f || rawX * -1.0f <= ((float) 48)) && ((rawX <= 0.0f || rawX <= ((float) 48)) && ((y >= 0.0f || -1.0f * y <= ((float) 48)) && (y <= 0.0f || y <= ((float) 48))))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
