package com.iab.omid.library.oguryco.p267b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.oguryco.adsession.C7975a;

/* renamed from: com.iab.omid.library.oguryco.b.b */
public class C7978b {

    /* renamed from: a */
    private static C7978b f19266a = new C7978b();

    /* renamed from: b */
    private Context f19267b;

    /* renamed from: c */
    private BroadcastReceiver f19268c;

    /* renamed from: d */
    private boolean f19269d;

    /* renamed from: e */
    private boolean f19270e;

    /* renamed from: f */
    private C7980a f19271f;

    /* renamed from: com.iab.omid.library.oguryco.b.b$a */
    public interface C7980a {
        /* renamed from: a */
        void mo55759a(boolean z);
    }

    private C7978b() {
    }

    /* renamed from: a */
    public static C7978b m22608a() {
        return f19266a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22610a(boolean z) {
        if (this.f19270e != z) {
            this.f19270e = z;
            if (this.f19269d) {
                m22613g();
                C7980a aVar = this.f19271f;
                if (aVar != null) {
                    aVar.mo55759a(mo55757d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m22611e() {
        this.f19268c = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C7978b.this.m22610a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C7978b.this.m22610a(false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C7978b.this.m22610a(false);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f19267b.registerReceiver(this.f19268c, intentFilter);
    }

    /* renamed from: f */
    private void m22612f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f19267b;
        if (context != null && (broadcastReceiver = this.f19268c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f19268c = null;
        }
    }

    /* renamed from: g */
    private void m22613g() {
        boolean z = !this.f19270e;
        for (C7975a adSessionStatePublisher : C7977a.m22601a().mo55748b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55806a(z);
        }
    }

    /* renamed from: a */
    public void mo55753a(Context context) {
        this.f19267b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo55754a(C7980a aVar) {
        this.f19271f = aVar;
    }

    /* renamed from: b */
    public void mo55755b() {
        m22611e();
        this.f19269d = true;
        m22613g();
    }

    /* renamed from: c */
    public void mo55756c() {
        m22612f();
        this.f19269d = false;
        this.f19270e = false;
        this.f19271f = null;
    }

    /* renamed from: d */
    public boolean mo55757d() {
        return !this.f19270e;
    }
}
