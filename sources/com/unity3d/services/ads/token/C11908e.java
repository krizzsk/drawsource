package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.C12074d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.token.e */
/* compiled from: NativeTokenGeneratorWithPrivacyAwait */
public class C11908e implements C11904b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11904b f28874a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ConditionVariable f28875b = new ConditionVariable();

    /* renamed from: c */
    private final ExecutorService f28876c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f28877d;

    /* renamed from: com.unity3d.services.ads.token.e$a */
    /* compiled from: NativeTokenGeneratorWithPrivacyAwait */
    class C11909a implements C12074d<PrivacyConfig> {
        C11909a() {
        }

        /* renamed from: a */
        public void mo70863a(PrivacyConfig privacyConfig) {
            C11908e.this.f28875b.open();
        }
    }

    /* renamed from: com.unity3d.services.ads.token.e$b */
    /* compiled from: NativeTokenGeneratorWithPrivacyAwait */
    class C11910b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12074d f28879a;

        /* renamed from: b */
        final /* synthetic */ C11905c f28880b;

        C11910b(C12074d dVar, C11905c cVar) {
            this.f28879a = dVar;
            this.f28880b = cVar;
        }

        public void run() {
            C11908e.this.f28875b.block((long) C11908e.this.f28877d);
            PrivacyConfigStorage.getInstance().unregisterObserver(this.f28879a);
            C11908e.this.f28874a.mo70860a(this.f28880b);
        }
    }

    public C11908e(ExecutorService executorService, C11904b bVar, int i) {
        this.f28876c = executorService;
        this.f28874a = bVar;
        this.f28877d = i;
    }

    /* renamed from: a */
    public void mo70860a(C11905c cVar) {
        C11909a aVar = new C11909a();
        PrivacyConfigStorage.getInstance().registerObserver(aVar);
        this.f28876c.execute(new C11910b(aVar, cVar));
    }
}
