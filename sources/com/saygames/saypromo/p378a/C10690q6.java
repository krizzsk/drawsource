package com.saygames.saypromo.p378a;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.saygames.saypromo.SayPromoThrowable;
import java.io.File;

/* renamed from: com.saygames.saypromo.a.q6 */
public abstract class C10690q6 extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10634j6 f26317a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10634j6 f26318b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10666n6 f26319c;

    public C10690q6(Context context) {
        super(context);
        C10607g3 a = C10615h3.m30453a(getContext());
        this.f26317a = (C10634j6) a.mo65470j().mo65365a();
        this.f26318b = (C10634j6) a.mo65471k().mo65365a();
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(m30557a());
        setWebViewClient(m30560b());
        setBackgroundColor(0);
        setInitialScale(0);
    }

    public C10690q6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C10607g3 a = C10615h3.m30453a(getContext());
        this.f26317a = (C10634j6) a.mo65470j().mo65365a();
        this.f26318b = (C10634j6) a.mo65471k().mo65365a();
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(m30557a());
        setWebViewClient(m30560b());
        setBackgroundColor(0);
        setInitialScale(0);
    }

    /* renamed from: a */
    private final C10674o6 m30557a() {
        return new C10674o6(this);
    }

    /* renamed from: a */
    public static final void m30558a(C10690q6 q6Var, String str, Throwable th) {
        q6Var.getClass();
        SayPromoThrowable.Show.Web web = new SayPromoThrowable.Show.Web(str, th);
        C10666n6 n6Var = q6Var.f26319c;
        if (n6Var != null) {
            ((C10541Y) n6Var).mo65398a(web);
        }
    }

    /* renamed from: b */
    private final C10682p6 m30560b() {
        return new C10682p6(this);
    }

    /* renamed from: a */
    public final void mo65533a(C10541Y y) {
        this.f26319c = y;
    }

    /* renamed from: a */
    public final void mo65534a(File file) {
        loadUrl(Uri.fromFile(file).toString());
    }

    public final void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            SayPromoThrowable.Show.Web web = new SayPromoThrowable.Show.Web("loadUrl", th);
            C10666n6 n6Var = this.f26319c;
            if (n6Var != null) {
                ((C10541Y) n6Var).mo65398a(web);
            }
        }
    }
}
