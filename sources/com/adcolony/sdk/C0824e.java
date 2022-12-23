package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0826e0;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.regex.Matcher;
import kotlin.text.Regex;

/* renamed from: com.adcolony.sdk.e */
public final class C0824e extends C0857j {

    /* renamed from: G */
    private String f453G = "";

    /* renamed from: H */
    private String f454H = "";

    /* renamed from: com.adcolony.sdk.e$a */
    static final class C0825a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0824e f455a;

        C0825a(C0824e eVar) {
            this.f455a = eVar;
        }

        public final void run() {
            C0824e.super.mo10671c();
        }
    }

    public C0824e(Context context, int i, C0850h0 h0Var) {
        super(context, i, h0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void mo10669b(Exception exc) {
        new C0826e0.C0827a().mo10746a(exc.getClass().toString()).mo10746a(" during metadata injection w/ metadata = ").mo10746a(C0773c0.m393h(getInfo(), "metadata")).mo10747a(C0826e0.f462i);
        AdColonyInterstitial remove = C0723a.m193b().mo10889c().mo10723f().remove(C0773c0.m393h(getInfo(), "ad_session_id"));
        if (remove != null) {
            remove.mo10461p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        kotlin.p403io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        throw r2;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m497p() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f454H
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x0036
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "script\\s*src\\s*=\\s*\"mraid.js\""
            r0.<init>((java.lang.String) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "script src=\"file://"
            r1.append(r2)
            java.lang.String r2 = r8.getMraidFilepath()
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f454H
            java.lang.String r0 = r0.replaceFirst(r2, r1)
            goto L_0x0086
        L_0x0036:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r2 = r8.f453G
            r0.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            int r3 = r0.available()     // Catch:{ all -> 0x0087 }
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x0087 }
        L_0x004a:
            int r5 = r0.read(r4, r1, r3)     // Catch:{ all -> 0x0087 }
            if (r5 < 0) goto L_0x005b
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0087 }
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0087 }
            r6.<init>(r4, r1, r5, r7)     // Catch:{ all -> 0x0087 }
            r2.append(r6)     // Catch:{ all -> 0x0087 }
            goto L_0x004a
        L_0x005b:
            java.lang.String r3 = r8.f453G     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = ".html"
            r5 = 2
            r6 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (boolean) r1, (int) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0087 }
            goto L_0x0082
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "<html><script>"
            r1.append(r3)     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = "</script></html>"
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0087 }
        L_0x0082:
            kotlin.p403io.CloseableKt.closeFinally(r0, r6)
            r0 = r1
        L_0x0086:
            return r0
        L_0x0087:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r2 = move-exception
            kotlin.p403io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0824e.m497p():java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ String mo10672d(C0832f1 f1Var) {
        if (this.f454H.length() > 0) {
            return "";
        }
        return super.mo10672d(f1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10595i() {
        C0850h0 message = getMessage();
        C0832f1 a = message == null ? null : message.mo10834a();
        if (a == null) {
            a = C0773c0.m379b();
        }
        this.f453G = mo10670c(a);
        this.f454H = C0773c0.m393h(a, "interstitial_html");
        super.mo10595i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public /* synthetic */ void mo10596j() {
        try {
            C0850h0 message = getMessage();
            C0832f1 a = message == null ? null : message.mo10834a();
            if (a == null) {
                a = C0773c0.m379b();
            }
            String h = C0773c0.m393h(C0773c0.m391f(a, TJAdUnitConstants.String.VIDEO_INFO), "metadata");
            String a2 = mo10665a(m497p(), C0773c0.m393h(C0773c0.m380b(h), "iab_filepath"));
            Regex regex = new Regex("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;");
            String replaceFirst = regex.replaceFirst(a2, Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + h + ';'));
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                mUrl = getBaseUrl();
            }
            loadDataWithBaseURL(mUrl, replaceFirst, "text/html", (String) null, (String) null);
        } catch (IOException e) {
            mo10669b(e);
        } catch (IllegalArgumentException e2) {
            mo10669b(e2);
        } catch (IndexOutOfBoundsException e3) {
            mo10669b(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10597k() {
    }

    /* renamed from: c */
    public void mo10671c() {
        if (!getDestroyed()) {
            C1047z0.m1244a((Runnable) new C0825a(this), mo10679n() ? 1000 : 0);
        }
    }
}
