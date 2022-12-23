package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.e */
public class C4120e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10144a;

    public C4120e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10144a = inneractiveInternalBrowserActivity;
    }

    public void onClick(View view) {
        this.f10144a.f10131d.reload();
        int i = IAlog.f13936a;
        IAlog.m16444a(1, (Exception) null, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f10144a.f10131d.getUrl());
    }
}
