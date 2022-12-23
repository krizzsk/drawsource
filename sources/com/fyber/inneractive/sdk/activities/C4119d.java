package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.d */
public class C4119d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10143a;

    public C4119d(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10143a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f10143a.f10131d.canGoForward()) {
            this.f10143a.f10131d.goForward();
        }
    }
}
