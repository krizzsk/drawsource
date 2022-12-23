package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.device.reader.C12034b;
import com.unity3d.services.core.log.C12065a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.token.d */
/* compiled from: NativeTokenGenerator */
public class C11906d implements C11904b {

    /* renamed from: a */
    private ExecutorService f28869a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12033a f28870b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f28871c;

    /* renamed from: com.unity3d.services.ads.token.d$a */
    /* compiled from: NativeTokenGenerator */
    class C11907a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11905c f28872a;

        C11907a(C11905c cVar) {
            this.f28872a = cVar;
        }

        public void run() {
            try {
                String encodeToString = Base64.encodeToString(new C12034b(C11906d.this.f28870b.mo71172a()).mo71176b(), 2);
                if (C11906d.this.f28871c == null || C11906d.this.f28871c.isEmpty()) {
                    this.f28872a.mo70858a(encodeToString);
                    return;
                }
                StringBuilder sb = new StringBuilder(C11906d.this.f28871c.length() + encodeToString.length());
                sb.append(C11906d.this.f28871c);
                sb.append(encodeToString);
                this.f28872a.mo70858a(sb.toString());
            } catch (Exception e) {
                C12065a.m32842a("Unity Ads failed to generate token.", e);
                this.f28872a.mo70858a((String) null);
            }
        }
    }

    public C11906d(ExecutorService executorService, C12033a aVar) {
        this(executorService, aVar, "1:");
    }

    public C11906d(ExecutorService executorService, C12033a aVar, String str) {
        this.f28869a = executorService;
        this.f28870b = aVar;
        this.f28871c = str;
    }

    /* renamed from: a */
    public void mo70860a(C11905c cVar) {
        this.f28869a.execute(new C11907a(cVar));
    }
}
