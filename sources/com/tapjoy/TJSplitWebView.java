package com.tapjoy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11534gs;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJSplitWebView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TJWebView f26698a;

    /* renamed from: b */
    private C11238a f26699b;

    /* renamed from: c */
    private C11238a f26700c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f26701d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f26702e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f26703f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Uri f26704g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HashSet<String> f26705h;

    /* renamed from: i */
    private JSONObject f26706i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public TJAdUnitJSBridge f26707j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Context f26708k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Boolean f26709l;

    /* renamed from: m */
    private RelativeLayout f26710m;

    /* renamed from: n */
    private FrameLayout f26711n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressBar f26712o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextView f26713p;

    /* renamed from: q */
    private TJImageButton f26714q;

    /* renamed from: r */
    private TJImageButton f26715r;

    /* renamed from: s */
    private String f26716s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f26717t;

    /* renamed from: u */
    private String f26718u;

    /* renamed from: v */
    private String f26719v;

    /* renamed from: w */
    private String f26720w;

    public TJSplitWebView(Context context, JSONObject jSONObject, TJAdUnitJSBridge tJAdUnitJSBridge) {
        super(context);
        this.f26707j = tJAdUnitJSBridge;
        this.f26708k = context;
        JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ERROR_DIALOG_STRINGS);
        this.f26716s = jSONObject.optString(TJAdUnitConstants.String.SPLIT_VIEW_URL_FOR_EXTERNAL_OPEN);
        this.f26706i = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        setLayoutOption(optJSONObject);
        setExitHosts(optJSONArray);
        setErrorDialog(optJSONObject2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TJWebView tJWebView = new TJWebView(this.f26708k);
        this.f26698a = tJWebView;
        tJWebView.setId(TapjoyUtil.generateViewId());
        this.f26698a.setBackgroundColor(-1);
        WebSettings settings = this.f26698a.getSettings();
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        this.f26698a.setWebViewClient(new C11239b(this, (byte) 0));
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean(TJAdUnitConstants.String.SPLIT_VIEW_SHOW_TOOLBAR));
        this.f26709l = valueOf;
        if (valueOf.booleanValue()) {
            addToolbar();
            addLineBreak();
            addProgressBar();
            this.f26698a.setWebChromeClient(new WebChromeClient() {
                public final void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    TJSplitWebView.this.f26712o.setProgress(i);
                    TJSplitWebView.this.isFirstOrLastPage();
                }
            });
        }
        addView(this.f26698a, layoutParams);
    }

    public void addToolbar() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f26708k);
        this.f26710m = relativeLayout;
        relativeLayout.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale() * 40.0f));
        layoutParams.addRule(6);
        this.f26710m.setBackgroundColor(-1);
        this.f26710m.setVisibility(0);
        setupToolbarUI();
        addView(this.f26710m, layoutParams);
    }

    public void addProgressBar() {
        ProgressBar progressBar = new ProgressBar(this.f26708k, (AttributeSet) null, 16842872);
        this.f26712o = progressBar;
        progressBar.setMax(100);
        this.f26712o.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#5d95ff")));
        this.f26712o.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#dddddd")));
        addView(this.f26712o);
    }

    public void addLineBreak() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f26711n = frameLayout;
        frameLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        addView(this.f26711n);
    }

    public void setupToolbarUI() {
        float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TJImageButton tJImageButton = new TJImageButton(this.f26708k);
        this.f26714q = tJImageButton;
        tJImageButton.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        int i = (int) (10.0f * screenDensityScale);
        layoutParams.setMargins(i, i, i, i);
        int i2 = (int) (5.0f * screenDensityScale);
        this.f26714q.setPadding(i2, i, i, i);
        this.f26714q.setEnabledImageBitmap(TapjoyIcons.getBackEnabledImage(screenDensityScale));
        this.f26714q.setDisableImageBitmap(TapjoyIcons.getBackDisabledImage(screenDensityScale));
        this.f26714q.setBackgroundColor(0);
        this.f26714q.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (TJSplitWebView.this.f26698a.canGoBack()) {
                    TJSplitWebView.this.f26698a.goBack();
                }
            }
        });
        relativeLayout.addView(this.f26714q, layoutParams);
        this.f26715r = new TJImageButton(this.f26708k);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, this.f26714q.getId());
        layoutParams2.setMargins(i, i, i, i);
        this.f26715r.setPadding(i, i, i2, i);
        this.f26715r.setEnabledImageBitmap(TapjoyIcons.getForwardEnabledImage(screenDensityScale));
        this.f26715r.setDisableImageBitmap(TapjoyIcons.getForwardDisabledImage(screenDensityScale));
        this.f26715r.setBackgroundColor(0);
        this.f26715r.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.f26698a.goForward();
            }
        });
        relativeLayout.addView(this.f26715r, layoutParams2);
        ImageButton imageButton = new ImageButton(this.f26708k);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(i, i, i, i);
        imageButton.setPadding(i2, i2, i2, i2);
        imageButton.setImageBitmap(TapjoyIcons.getCloseImage(screenDensityScale));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.mo69473a();
            }
        });
        relativeLayout.addView(imageButton, layoutParams3);
        TextView textView = new TextView(this.f26708k);
        this.f26713p = textView;
        textView.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(13);
        this.f26713p.setMaxLines(1);
        this.f26713p.setMaxEms(200);
        this.f26713p.setTextAlignment(4);
        this.f26713p.setTextColor(Color.parseColor("#5d95ff"));
        this.f26713p.setBackgroundColor(0);
        this.f26713p.setEnabled(false);
        this.f26713p.setTypeface(Typeface.create("sans-serif-medium", 0));
        relativeLayout.addView(this.f26713p, layoutParams4);
        ImageButton imageButton2 = new ImageButton(this.f26708k);
        imageButton2.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.f26713p.getId());
        layoutParams5.addRule(15);
        imageButton2.setPadding(i2, i2, i2, i2);
        imageButton2.setImageBitmap(TapjoyIcons.getOpenBrowserImage(screenDensityScale));
        imageButton2.setBackgroundColor(0);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.openInExternalBrowser();
            }
        });
        relativeLayout.addView(imageButton2, layoutParams5);
        this.f26710m.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void openInExternalBrowser() {
        Uri uri;
        if (TextUtils.isEmpty(this.f26716s)) {
            uri = Uri.parse(this.f26698a.getUrl());
            if (uri == null) {
                uri = Uri.parse(getLastUrl());
            }
        } else {
            uri = Uri.parse(this.f26716s);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (this.f26698a.getContext() != null) {
            try {
                this.f26698a.getContext().startActivity(intent);
            } catch (Exception e) {
                TapjoyLog.m30839d("TJSplitWebView", e.getMessage());
            }
        }
    }

    public boolean goBack() {
        if (!this.f26698a.canGoBack()) {
            return false;
        }
        this.f26698a.goBack();
        return true;
    }

    public void isFirstOrLastPage() {
        this.f26714q.setEnabled(this.f26698a.canGoBack());
        this.f26715r.setEnabled(this.f26698a.canGoForward());
    }

    public void showErrorDialog() {
        new AlertDialog.Builder(this.f26708k, 16974394).setMessage(this.f26718u).setPositiveButton(this.f26719v, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setNegativeButton(this.f26720w, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(TJSplitWebView.this.getLastUrl())) {
                    TJSplitWebView tJSplitWebView = TJSplitWebView.this;
                    tJSplitWebView.loadUrl(tJSplitWebView.f26701d);
                } else {
                    TJSplitWebView tJSplitWebView2 = TJSplitWebView.this;
                    tJSplitWebView2.loadUrl(tJSplitWebView2.getLastUrl());
                }
                dialogInterface.cancel();
            }
        }).create().show();
    }

    public void applyLayoutOption(JSONObject jSONObject) {
        setLayoutOption(jSONObject);
        m30762a(getWidth(), getHeight());
    }

    public void setExitHosts(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.f26705h = null;
            return;
        }
        this.f26705h = new HashSet<>();
        for (int i = 0; i <= jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                this.f26705h.add(optString);
            }
        }
    }

    public void setErrorDialog(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f26717t = true;
            this.f26718u = jSONObject.optString("description");
            this.f26719v = jSONObject.optString("close");
            this.f26720w = jSONObject.optString("reload");
        }
    }

    public void setUserAgent(String str) {
        this.f26698a.getSettings().setUserAgentString(str);
    }

    public void setTrigger(String str, String str2) {
        this.f26703f = C11534gs.m31572b(str);
        this.f26704g = str2 != null ? Uri.parse(str2) : null;
    }

    public void loadUrl(String str) {
        TJWebView tJWebView = this.f26698a;
        if (tJWebView != null) {
            this.f26701d = str;
            this.f26702e = str;
            tJWebView.loadUrl(str);
        }
    }

    public String getLastUrl() {
        return this.f26702e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69473a() {
        this.f26707j.dismissSplitView((JSONObject) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void setLayoutOption(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("landscape");
            C11238a aVar = null;
            this.f26700c = optJSONObject != null ? new C11238a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("portrait");
            if (optJSONObject2 != null) {
                aVar = new C11238a(optJSONObject2);
            }
            this.f26699b = aVar;
        }
    }

    /* renamed from: a */
    private void m30762a(int i, int i2) {
        C11238a aVar = i <= i2 ? this.f26699b : this.f26700c;
        if (aVar == null) {
            this.f26698a.setVisibility(4);
            return;
        }
        double d = (double) i;
        int i3 = (int) (aVar.f26730a * d);
        double d2 = (double) i2;
        int i4 = (int) (aVar.f26731b * d2);
        if (i3 == 0 || i4 == 0) {
            this.f26698a.setVisibility(4);
            return;
        }
        int i5 = (int) (d * aVar.f26732c);
        int i6 = (int) (d2 * aVar.f26733d);
        int i7 = (i - i3) - i5;
        int i8 = (i2 - i4) - i6;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f26698a.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        Boolean bool = this.f26709l;
        if (bool == null || !bool.booleanValue()) {
            layoutParams.setMargins(i5, i6, i7, i8);
        } else {
            float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
            int height = ((int) (40.0f * screenDensityScale)) + this.f26711n.getHeight();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f26710m.getLayoutParams();
            layoutParams2.setMargins(i5, i6, i7, i8);
            this.f26710m.setLayoutParams(layoutParams2);
            layoutParams.setMargins(i5, i6 + height, i7, i8);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i3, (int) screenDensityScale);
            layoutParams3.setMargins(i5, layoutParams.topMargin - this.f26712o.getHeight(), i7, i8);
            this.f26712o.setLayoutParams(layoutParams3);
            this.f26711n.setLayoutParams(layoutParams3);
        }
        this.f26698a.setLayoutParams(layoutParams);
        this.f26698a.setVisibility(0);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (aVar.f26734e > 0.0f) {
            float[] fArr = new float[8];
            final float f = aVar.f26734e * getResources().getDisplayMetrics().density;
            Boolean bool2 = this.f26709l;
            if (bool2 == null || !bool2.booleanValue()) {
                Arrays.fill(fArr, f);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(-1);
                this.f26698a.setBackground(shapeDrawable);
                this.f26698a.setClipToOutline(true);
                return;
            }
            this.f26710m.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    int width = view.getWidth();
                    float f = f;
                    outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
                }
            });
            this.f26710m.setClipToOutline(true);
            return;
        }
        this.f26698a.setBackground((Drawable) null);
        this.f26698a.setClipToOutline(false);
        Boolean bool3 = this.f26709l;
        if (bool3 != null && bool3.booleanValue()) {
            this.f26710m.setClipToOutline(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f26698a != null) {
            m30762a(size, size2);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: com.tapjoy.TJSplitWebView$a */
    static class C11238a {

        /* renamed from: a */
        final double f26730a;

        /* renamed from: b */
        final double f26731b;

        /* renamed from: c */
        final double f26732c;

        /* renamed from: d */
        final double f26733d;

        /* renamed from: e */
        final float f26734e;

        C11238a(JSONObject jSONObject) {
            this.f26730a = jSONObject.optDouble("width", 0.0d);
            this.f26731b = jSONObject.optDouble("height", 0.0d);
            this.f26732c = jSONObject.optDouble("left", 0.0d);
            this.f26733d = jSONObject.optDouble("top", 0.0d);
            this.f26734e = (float) jSONObject.optDouble("cornerRadius", 0.0d);
        }
    }

    public void animateOpen(ViewGroup viewGroup) {
        JSONObject jSONObject = this.f26706i;
        if (jSONObject != null && jSONObject.has(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN) && this.f26706i.optString(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN).equalsIgnoreCase(TJAdUnitConstants.String.ANIMATION_TYPE_SLIDE_UP)) {
            setY((float) viewGroup.getHeight());
            animate().translationY(0.0f);
        }
    }

    /* renamed from: com.tapjoy.TJSplitWebView$b */
    class C11239b extends WebViewClient {
        private C11239b() {
        }

        /* synthetic */ C11239b(TJSplitWebView tJSplitWebView, byte b) {
            this();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TJSplitWebView.this.f26709l.booleanValue()) {
                TJSplitWebView.this.f26713p.setText(TapjoyUrlFormatter.getDomain(str));
                TJSplitWebView.this.f26712o.setVisibility(0);
            }
            TapjoyLog.m30839d("TJSplitWebView", "onPageStarted: ".concat(String.valueOf(str)));
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            TapjoyLog.m30839d("TJSplitWebView", "shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (!(scheme == null || host == null || ((!scheme.equals("http") && !scheme.equals("https")) || (TJSplitWebView.this.f26705h != null && TJSplitWebView.this.f26705h.contains(host))))) {
                    String unused = TJSplitWebView.this.f26702e = str;
                    return false;
                }
            }
            try {
                TJSplitWebView.this.f26708k.startActivity(new Intent("android.intent.action.VIEW", parse));
                if (TJSplitWebView.this.f26709l.booleanValue()) {
                    return true;
                }
                TJSplitWebView.this.mo69473a();
                return true;
            } catch (Exception e) {
                TapjoyLog.m30841e("TJSplitWebView", e.getMessage());
                return true;
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String h = TJSplitWebView.this.f26703f;
            Uri i = TJSplitWebView.this.f26704g;
            if (!(h == null || i == null || str == null || !str.startsWith(h))) {
                TJSplitWebView.this.f26708k.startActivity(new Intent("android.intent.action.VIEW", i));
                TJSplitWebView.this.mo69473a();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m30839d("TJSplitWebView", "onReceivedError: " + str2 + " firstUrl:" + TJSplitWebView.this.f26701d);
            if (TJSplitWebView.this.f26717t) {
                TJSplitWebView.this.showErrorDialog();
            } else if (str2.equals(TJSplitWebView.this.f26701d)) {
                TJSplitWebView.this.mo69473a();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TJSplitWebView.this.f26709l.booleanValue()) {
                if (TJSplitWebView.this.f26712o != null) {
                    TJSplitWebView.this.f26712o.setProgress(0);
                    TJSplitWebView.this.f26712o.setVisibility(8);
                }
                TJSplitWebView.this.isFirstOrLastPage();
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (TJSplitWebView.this.f26698a != null) {
                ViewGroup viewGroup = (ViewGroup) TJSplitWebView.this.f26698a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJSplitWebView.this.f26698a);
                    viewGroup.removeAllViews();
                }
                TJSplitWebView.this.f26698a.destroy();
                TJWebView unused = TJSplitWebView.this.f26698a = null;
            }
            if (TJSplitWebView.this.f26707j != null) {
                TJSplitWebView.this.f26707j.cleanUpJSBridge();
                TJAdUnitJSBridge unused2 = TJSplitWebView.this.f26707j = null;
            }
            TapjoyLog.m30840e("TJSplitWebView", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }
    }
}
