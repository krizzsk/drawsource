package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.activities.c */
public class C4118c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10142a;

    public C4118c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10142a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        if (this.f10142a.f10131d.canGoBack()) {
            this.f10142a.f10131d.goBack();
        }
    }
}
