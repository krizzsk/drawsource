package com.ogury.p376cm.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.ogury.core.OguryError;
import com.ogury.p376cm.ConsentActivity;
import com.ogury.p376cm.internal.aacaa;
import com.ogury.p376cm.internal.aacab;
import com.ogury.p376cm.internal.bbacb;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Typography;

/* renamed from: com.ogury.cm.internal.abaac */
public final class abaac {

    /* renamed from: a */
    public static final aaaaa f24292a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.abaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abaac f24293a;

        /* renamed from: b */
        final /* synthetic */ WebView f24294b;

        /* renamed from: c */
        final /* synthetic */ abbbb f24295c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(abaac abaac, WebView webView, abbbb abbbb) {
            super(0);
            this.f24293a = abaac;
            this.f24294b = webView;
            this.f24295c = abbbb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f24528a = "";
            final bbacb.aaaab aaaab2 = new bbacb.aaaab();
            aaaab2.f24528a = "";
            baaba.f24478a.setQueryProductDetailsListener(new baacc() {
                /* renamed from: a */
                public final void mo63832a(String str, String str2) {
                    bbabc.m28052b(str, "status");
                    bbabc.m28052b(str2, "skuDetailsJson");
                    aaaab.f24528a = str;
                    aaaab2.f24528a = str2;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            baaba.f24478a.setQueryProductDetailsListener((baacc) null);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ aaaab f24299a;

                {
                    this.f24299a = r1;
                }

                public final void run() {
                    if (bbabc.m28051a((Object) (String) aaaab.f24528a, (Object) "ok")) {
                        abaac.m27797a(this.f24299a.f24294b, (String) aaaab2.f24528a);
                        this.f24299a.f24295c.mo63771a("ready");
                        return;
                    }
                    this.f24299a.f24295c.mo63770a(new OguryError(1005, aacaa.aaaaa.m27776e((String) aaaab.f24528a)));
                }
            });
            if (!bbabc.m28051a((Object) (String) aaaab.f24528a, (Object) "ok")) {
                new abcba();
                abcba.m27906a((String) aaaab.f24528a, (acabb) new acabb(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f24302a;

                    {
                        this.f24302a = r1;
                    }

                    /* renamed from: a */
                    public final void mo63783a(int i, String str) {
                        OguryError oguryError;
                        bbabc.m28052b(str, "error");
                        if (i == 0 || (500 <= i && 599 >= i)) {
                            oguryError = new OguryError(3, str);
                        } else {
                            aacab.aaaaa aaaaa = aacab.f24274a;
                            oguryError = aacab.aaaaa.m27777a(str);
                        }
                        this.f24302a.f24295c.mo63770a(oguryError);
                    }

                    /* renamed from: a */
                    public final void mo63784a(String str) {
                        bbabc.m28052b(str, "response");
                        this.f24302a.f24295c.mo63771a(str);
                    }
                });
            }
            return babcc.f24512a;
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaac */
    public static final class aaaac implements baaaa {

        /* renamed from: a */
        final /* synthetic */ abaac f24303a;

        /* renamed from: b */
        final /* synthetic */ WebView f24304b;

        aaaac(abaac abaac, WebView webView) {
            this.f24303a = abaac;
            this.f24304b = webView;
        }

        /* renamed from: a */
        public final void mo63834a(String str) {
            bbabc.m28052b(str, "jsonResult");
            abaac.m27799a(str, this.f24304b);
            baaba.f24478a.setBillingFinishedListener((baaaa) null);
        }
    }

    /* renamed from: a */
    private static String m27795a(String str) {
        String str2;
        if (str != null) {
            str2 = ", \"" + aacaa.aaaaa.m27774c(str) + Typography.quote;
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("javascript:(function(){ogFormBridge.init(\"");
        abbba abbba = abbba.f24320a;
        sb.append(aacaa.aaaaa.m27774c(abbba.m27842j()));
        sb.append(Typography.quote);
        sb.append(str2);
        sb.append(")})()");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m27796a(Context context) {
        if (context instanceof ConsentActivity) {
            ((ConsentActivity) context).finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m27797a(WebView webView, String str) {
        webView.setVisibility(0);
        webView.loadUrl(m27795a(str));
    }

    /* renamed from: a */
    public static void m27799a(String str, WebView webView) {
        bbabc.m28052b(str, "jsonResult");
        bbabc.m28052b(webView, "webView");
        webView.loadUrl("javascript:(function(){ogFormBridge.purchase(\"" + aacaa.aaaaa.m27774c(str) + "\")})()");
    }

    /* renamed from: a */
    public final void mo63831a(String str, Context context, abbbb abbbb, WebView webView) {
        String str2 = str;
        Context context2 = context;
        abbbb abbbb2 = abbbb;
        WebView webView2 = webView;
        bbabc.m28052b(str2, "url");
        bbabc.m28052b(context2, "context");
        bbabc.m28052b(abbbb2, "callback");
        bbabc.m28052b(webView2, "webView");
        Locale locale = Locale.US;
        bbabc.m28049a((Object) locale, "Locale.US");
        String lowerCase = str2.toLowerCase(locale);
        bbabc.m28049a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (bbcbc.m28090a(lowerCase, "https://ogyconsent", false, 2, (Object) null)) {
            String substring = str2.substring(20);
            bbabc.m28049a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            if (bbcbc.m28090a(substring, "consent=", false, 2, (Object) null)) {
                abbba abbba = abbba.f24320a;
                abbba.m27837f().mo63912a(substring, false);
                abbba abbba2 = abbba.f24320a;
                if (abbba.m27849q()) {
                    StringBuilder sb = new StringBuilder("parsedConfig=");
                    abbba abbba3 = abbba.f24320a;
                    sb.append(abbba.m27841i());
                    abbbb2.mo63771a(sb.toString());
                } else {
                    abbba abbba4 = abbba.f24320a;
                    abbbb2.mo63770a(abbba.m27841i().mo63915b());
                }
                m27796a(context);
                baaba.f24478a.endDataSourceConnections();
            } else if (bbcbc.m28090a(substring, "ogyRedirect=", false, 2, (Object) null)) {
                try {
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bbcbc.m28096a(substring, "ogyRedirect=", (String) null, 2, (Object) null))));
                } catch (ActivityNotFoundException unused) {
                } catch (Exception e) {
                    abbbc abbbc = abbbc.f24336a;
                    abbbc.m27856a((Throwable) e);
                }
            } else if (!bbcbc.m28090a(substring, "error=", false, 2, (Object) null)) {
            } else {
                if (substring != null) {
                    String substring2 = substring.substring(6);
                    bbabc.m28049a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    abbbb2.mo63770a(new OguryError(1003, bbcbc.m28085a(bbcbc.m28085a(substring2, "%20", " ", false, 4, (Object) null), "%22", "\"", false, 4, (Object) null)));
                    m27796a(context);
                    return;
                }
                throw new babca("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            CharSequence charSequence = str2;
            if (bbcbc.m28099a(charSequence, (CharSequence) "?ready", false, 2, (Object) null)) {
                if (baaba.f24478a.isProductActivated()) {
                    bacbb.m28035a(false, false, (ClassLoader) null, (String) null, 0, new aaaab(this, webView2, abbbb2), 31, (Object) null);
                    return;
                }
                m27797a(webView2, (String) null);
                abbbb2.mo63771a("ready");
            } else if (bbcbc.m28099a(charSequence, (CharSequence) "?success", false, 2, (Object) null)) {
                abbbb2.mo63771a("success");
            } else if (bbcbc.m28099a(charSequence, (CharSequence) "?purchase", false, 2, (Object) null)) {
                baaba.f24478a.setBillingFinishedListener(new aaaac(this, webView2));
                baaba baaba = baaba.f24478a;
                if (context2 != null) {
                    baaba.launchBillingFlow((Activity) context2);
                    return;
                }
                throw new babca("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
