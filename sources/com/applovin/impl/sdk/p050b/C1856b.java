package com.applovin.impl.sdk.p050b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.b.b */
public class C1856b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f3028a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f3029b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AlertDialog f3030c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1863a f3031d;

    /* renamed from: com.applovin.impl.sdk.b.b$a */
    public interface C1863a {
        /* renamed from: a */
        void mo13025a();

        /* renamed from: b */
        void mo13026b();
    }

    public C1856b(Activity activity, C1969m mVar) {
        this.f3028a = mVar;
        this.f3029b = activity;
    }

    /* renamed from: a */
    public void mo14261a() {
        this.f3029b.runOnUiThread(new Runnable() {
            public void run() {
                if (C1856b.this.f3030c != null) {
                    C1856b.this.f3030c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo14262a(final C1839e eVar, final Runnable runnable) {
        this.f3029b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C1856b.this.f3029b);
                builder.setTitle(eVar.mo14217an());
                String ao = eVar.mo14218ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.mo14219ap(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                AlertDialog unused = C1856b.this.f3030c = builder.show();
            }
        });
    }

    /* renamed from: a */
    public void mo14263a(C1863a aVar) {
        this.f3031d = aVar;
    }

    /* renamed from: b */
    public void mo14264b() {
        this.f3029b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog unused = C1856b.this.f3030c = new AlertDialog.Builder(C1856b.this.f3029b).setTitle((CharSequence) C1856b.this.f3028a.mo14534a(C1867b.f3200bv)).setMessage((CharSequence) C1856b.this.f3028a.mo14534a(C1867b.f3201bw)).setCancelable(false).setPositiveButton((CharSequence) C1856b.this.f3028a.mo14534a(C1867b.f3203by), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1856b.this.f3031d.mo13025a();
                    }
                }).setNegativeButton((CharSequence) C1856b.this.f3028a.mo14534a(C1867b.f3202bx), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1856b.this.f3031d.mo13026b();
                    }
                }).show();
            }
        });
    }

    /* renamed from: c */
    public boolean mo14265c() {
        AlertDialog alertDialog = this.f3030c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
