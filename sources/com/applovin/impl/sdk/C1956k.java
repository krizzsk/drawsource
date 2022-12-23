package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2092o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.k */
class C1956k implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static AlertDialog f3650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f3651c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1962l f3652a;

    /* renamed from: d */
    private C2092o f3653d;

    /* renamed from: com.applovin.impl.sdk.k$a */
    public interface C1961a {
        /* renamed from: a */
        void mo14497a();

        /* renamed from: b */
        void mo14498b();
    }

    C1956k(C1962l lVar, C1969m mVar) {
        this.f3652a = lVar;
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo14492a(long j, final C1969m mVar, final C1961a aVar) {
        if (j > 0) {
            AlertDialog alertDialog = f3650b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f3651c.getAndSet(true)) {
                    if (j < this.f3653d.mo14973a()) {
                        if (C2102v.m5104a()) {
                            C2102v A = mVar.mo14509A();
                            A.mo15012b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f3653d.mo14973a() + "ms)");
                        }
                        this.f3653d.mo14976d();
                    } else if (C2102v.m5104a()) {
                        C2102v A2 = mVar.mo14509A();
                        A2.mo15015d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f3653d.mo14973a() + " milliseconds");
                        return;
                    } else {
                        return;
                    }
                }
                if (C2102v.m5104a()) {
                    C2102v A3 = mVar.mo14509A();
                    A3.mo15012b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
                }
                this.f3653d = C2092o.m5058a(j, mVar, new Runnable() {
                    public void run() {
                        String str;
                        C2102v vVar;
                        if (!C1956k.this.f3652a.mo14502d()) {
                            Activity a = mVar.mo14556af().mo14045a();
                            if (a == null || !C2050h.m4957a(mVar.mo14520L())) {
                                if (C2102v.m5104a()) {
                                    if (a == null) {
                                        vVar = mVar.mo14509A();
                                        str = "No parent Activity found - rescheduling consent alert...";
                                    } else {
                                        vVar = mVar.mo14509A();
                                        str = "No internet available - rescheduling consent alert...";
                                    }
                                    vVar.mo15016e("ConsentAlertManager", str);
                                }
                                C1956k.f3651c.set(false);
                                C1956k.this.mo14492a(((Long) mVar.mo14534a(C1867b.f3105aF)).longValue(), mVar, aVar);
                                return;
                            }
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    AlertDialog unused = C1956k.f3650b = new AlertDialog.Builder(mVar.mo14556af().mo14045a()).setTitle((CharSequence) mVar.mo14534a(C1867b.f3106aG)).setMessage((CharSequence) mVar.mo14534a(C1867b.f3107aH)).setCancelable(false).setPositiveButton((CharSequence) mVar.mo14534a(C1867b.f3108aI), new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            aVar.mo14497a();
                                            dialogInterface.dismiss();
                                            C1956k.f3651c.set(false);
                                        }
                                    }).setNegativeButton((CharSequence) mVar.mo14534a(C1867b.f3109aJ), new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            aVar.mo14498b();
                                            dialogInterface.dismiss();
                                            C1956k.f3651c.set(false);
                                            C1956k.this.mo14492a(((Long) mVar.mo14534a(C1867b.f3104aE)).longValue(), mVar, aVar);
                                        }
                                    }).create();
                                    C1956k.f3650b.show();
                                }
                            });
                        } else if (C2102v.m5104a()) {
                            mVar.mo14509A().mo15016e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                        }
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f3653d != null) {
            String action = intent.getAction();
            if ("com.applovin.application_paused".equals(action)) {
                this.f3653d.mo14974b();
            } else if ("com.applovin.application_resumed".equals(action)) {
                this.f3653d.mo14975c();
            }
        }
    }
}
