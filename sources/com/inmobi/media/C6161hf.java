package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.inmobi.media.hf */
/* compiled from: WebViewNetworkTask */
public class C6161hf {

    /* renamed from: d */
    private static final String f15552d = C6161hf.class.getSimpleName();

    /* renamed from: a */
    public C6156ha f15553a;

    /* renamed from: b */
    public WebViewClient f15554b;

    /* renamed from: c */
    public C6162a f15555c;

    public C6161hf(C6156ha haVar, WebViewClient webViewClient) {
        this.f15554b = webViewClient;
        this.f15553a = haVar;
    }

    /* renamed from: com.inmobi.media.hf$a */
    /* compiled from: WebViewNetworkTask */
    public class C6162a extends WebView {

        /* renamed from: a */
        public boolean f15556a;

        public C6162a(Context context) {
            super(context);
        }

        public final void destroy() {
            this.f15556a = true;
            super.destroy();
        }
    }
}
