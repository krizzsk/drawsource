package com.mbridge.msdk.foundation.webview;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.NativeListener;

public class WebViewFragment extends BaseFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowserView browserView = new BrowserView(getActivity());
        browserView.loadUrl(getActivity().getIntent().getExtras().getString("msg"));
        browserView.setListener(new BrowserView.C8684a() {
            /* renamed from: a */
            public final boolean mo16133a(WebView webView, String str) {
                return false;
            }

            /* renamed from: a */
            public final void mo16131a() {
                WebViewFragment.this.getActivity().finish();
            }

            /* renamed from: a */
            public final void mo16132a(WebView webView, String str, Bitmap bitmap) {
                if (C8675y.C8676a.m24900a(str) && C8675y.C8676a.m24899a(WebViewFragment.this.getActivity().getApplicationContext(), str, (NativeListener.NativeTrackingListener) null)) {
                    WebViewFragment.this.getActivity().finish();
                }
            }
        });
        return browserView;
    }
}
