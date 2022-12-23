package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.h */
public class C5364h implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C5349d f14169a;

    public C5364h(C5349d dVar) {
        this.f14169a = dVar;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f14169a.mo26480h()) {
            return false;
        }
        IAlog.m16449d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f14169a.mo26478f();
        return true;
    }
}
