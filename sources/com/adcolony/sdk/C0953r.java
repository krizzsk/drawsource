package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C0826e0;

/* renamed from: com.adcolony.sdk.r */
class C0953r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0850h0 f737a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f738b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f739c;

    /* renamed from: com.adcolony.sdk.r$a */
    class C0954a implements C0865j0 {
        C0954a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (!C0723a.m195c() || !(C0723a.m186a() instanceof Activity)) {
                new C0826e0.C0827a().mo10746a("Missing Activity reference, can't build AlertDialog.").mo10747a(C0826e0.f462i);
            } else if (C0773c0.m382b(h0Var.mo10834a(), "on_resume")) {
                C0850h0 unused = C0953r.this.f737a = h0Var;
            } else {
                C0953r.this.m996a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C0955b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0850h0 f741a;

        C0955b(C0850h0 h0Var) {
            this.f741a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0953r.this.f738b = null;
            dialogInterface.dismiss();
            C0832f1 b = C0773c0.m379b();
            C0773c0.m385b(b, "positive", true);
            boolean unused2 = C0953r.this.f739c = false;
            this.f741a.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C0956c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0850h0 f743a;

        C0956c(C0850h0 h0Var) {
            this.f743a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0953r.this.f738b = null;
            dialogInterface.dismiss();
            C0832f1 b = C0773c0.m379b();
            C0773c0.m385b(b, "positive", false);
            boolean unused2 = C0953r.this.f739c = false;
            this.f743a.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$d */
    class C0957d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0850h0 f745a;

        C0957d(C0850h0 h0Var) {
            this.f745a = h0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C0953r.this.f738b = null;
            boolean unused2 = C0953r.this.f739c = false;
            C0832f1 b = C0773c0.m379b();
            C0773c0.m385b(b, "positive", false);
            this.f745a.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.r$e */
    class C0958e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f747a;

        C0958e(AlertDialog.Builder builder) {
            this.f747a = builder;
        }

        public void run() {
            boolean unused = C0953r.this.f739c = true;
            AlertDialog unused2 = C0953r.this.f738b = this.f747a.show();
        }
    }

    C0953r() {
        C0723a.m192a("Alert.show", (C0865j0) new C0954a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11081c() {
        C0850h0 h0Var = this.f737a;
        if (h0Var != null) {
            m996a(h0Var);
            this.f737a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11080b() {
        return this.f739c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m996a(C0850h0 h0Var) {
        AlertDialog.Builder builder;
        Context a = C0723a.m186a();
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder = new AlertDialog.Builder(a, 16974374);
            } else {
                builder = new AlertDialog.Builder(a, 16974126);
            }
            C0832f1 a2 = h0Var.mo10834a();
            String h = C0773c0.m393h(a2, "message");
            String h2 = C0773c0.m393h(a2, "title");
            String h3 = C0773c0.m393h(a2, "positive");
            String h4 = C0773c0.m393h(a2, "negative");
            builder.setMessage(h);
            builder.setTitle(h2);
            builder.setPositiveButton(h3, new C0955b(h0Var));
            if (!h4.equals("")) {
                builder.setNegativeButton(h4, new C0956c(h0Var));
            }
            builder.setOnCancelListener(new C0957d(h0Var));
            C1047z0.m1259b((Runnable) new C0958e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo11078a() {
        return this.f738b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11079a(AlertDialog alertDialog) {
        this.f738b = alertDialog;
    }
}
