package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.k */
/* compiled from: WindVaneWebViewChromeClient */
public final class C8891k extends WebChromeClient {

    /* renamed from: a */
    WindVaneWebView f21922a;

    /* renamed from: b */
    private C8884d f21923b;

    public C8891k(WindVaneWebView windVaneWebView) {
        this.f21922a = windVaneWebView;
    }

    /* renamed from: a */
    public final void mo58693a(C8884d dVar) {
        this.f21923b = dVar;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C8672v.m24878d("H5_ENTRY", str2 + "");
        C8883c signalCommunication = this.f21922a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.mo58678a(str3)) {
            return false;
        }
        signalCommunication.mo58679b(str2);
        jsPromptResult.confirm("");
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C8884d dVar = this.f21923b;
        if (dVar != null) {
            dVar.mo58281b(webView, i);
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        C8883c signalCommunication = this.f21922a.getSignalCommunication();
        if (!(signalCommunication == null || consoleMessage == null)) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            C8672v.m24874a("H5_ENTRY", "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.mo58678a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                C8672v.m24874a("H5_ENTRY", "message = " + substring);
                signalCommunication.mo58679b(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
