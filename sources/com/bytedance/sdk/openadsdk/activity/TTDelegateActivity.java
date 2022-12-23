package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p151g.C3450d;
import com.bytedance.sdk.openadsdk.core.p151g.C3451e;
import com.bytedance.sdk.openadsdk.core.widget.C3688b;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p178l.C3862d;
import com.bytedance.sdk.openadsdk.p178l.C3865e;
import com.facebook.internal.NativeProtocol;
import org.json.JSONException;
import org.json.JSONObject;

public class TTDelegateActivity extends Activity {

    /* renamed from: a */
    private Intent f6847a;

    /* renamed from: b */
    private AlertDialog f6848b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3688b f6849c;

    /* renamed from: d */
    private TTAdDislike f6850d;

    /* renamed from: a */
    public static void m8478a() {
        Intent intent = new Intent(C3513m.m10963a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 5);
        if (C3513m.m10963a() != null) {
            C3513m.m10963a().startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m8479a(C3431n nVar, String str) {
        Intent intent = new Intent(C3513m.m10963a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("materialmeta", nVar.mo19584ar().toString());
        intent.putExtra("closed_listener_key", str);
        if (C3513m.m10963a() != null) {
            C3513m.m10963a().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        m8484b();
        this.f6847a = getIntent();
        if (C3513m.m10963a() == null) {
            C3513m.m10965a(this);
        }
    }

    /* renamed from: b */
    private void m8484b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C3513m.m10963a() == null) {
            C3513m.m10965a(this);
        }
        setIntent(intent);
        this.f6847a = intent;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (getIntent() != null) {
            m8485c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f6848b != null && this.f6848b.isShowing()) {
                this.f6848b.dismiss();
            }
            if (this.f6849c != null && this.f6849c.isShowing()) {
                this.f6849c.dismiss();
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private void m8485c() {
        int intExtra = this.f6847a.getIntExtra("type", 0);
        String stringExtra = this.f6847a.getStringExtra("app_download_url");
        this.f6847a.getStringExtra(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
        if (intExtra == 1) {
            return;
        }
        if (intExtra == 3) {
            m8482a(stringExtra, this.f6847a.getStringExtra("dialog_title_key"), this.f6847a.getStringExtra("dialog_content_key"));
        } else if (intExtra == 4) {
            m8483a(this.f6847a.getStringExtra("permission_id_key"), this.f6847a.getStringArrayExtra("permission_content_key"));
        } else if (intExtra == 5) {
            m8486d();
        } else if (intExtra != 6) {
            finish();
        } else {
            m8480a(this.f6847a.getStringExtra("materialmeta"), this.f6847a.getStringExtra("closed_listener_key"));
        }
    }

    /* renamed from: a */
    private void m8480a(String str, String str2) {
        if (str != null && this.f6850d == null) {
            try {
                C3716b bVar = new C3716b(this, C3356b.m9935a(new JSONObject(str)));
                this.f6850d = bVar;
                bVar.mo20494a(str2);
                this.f6850d.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() {
                    public void onSelected(int i, String str) {
                        C2905l.m8114c("showDislike", "onSelected->position=" + i + ",value=" + str);
                        TTDelegateActivity.this.finish();
                    }

                    public void onCancel() {
                        C2905l.m8114c("showDislike", "onCancel->onCancel....");
                        TTDelegateActivity.this.finish();
                    }

                    public void onRefuse() {
                        C2905l.m8114c("showDislike", "onRefuse->onRefuse....");
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        TTAdDislike tTAdDislike = this.f6850d;
        if (tTAdDislike != null) {
            tTAdDislike.showDislikeDialog();
        }
    }

    /* renamed from: d */
    private void m8486d() {
        if (this.f6849c == null) {
            C3688b bVar = new C3688b(this);
            this.f6849c = bVar;
            bVar.mo20456a(C2914t.m8151a(this, "no_thank_you"), (C3688b.C3692b) new C3688b.C3692b() {
                /* renamed from: a */
                public void mo18420a() {
                    TTAdSdk.setGdpr(0);
                    if (TTDelegateActivity.this.f6849c.isShowing()) {
                        TTDelegateActivity.this.f6849c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            }).mo20457a(C2914t.m8151a(this, "yes_i_agree"), (C3688b.C3693c) new C3688b.C3693c() {
                /* renamed from: a */
                public void mo18419a() {
                    TTAdSdk.setGdpr(1);
                    if (TTDelegateActivity.this.f6849c.isShowing()) {
                        TTDelegateActivity.this.f6849c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            });
        }
        if (!this.f6849c.isShowing()) {
            this.f6849c.show();
        }
    }

    /* renamed from: a */
    private void m8483a(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            finish();
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                C3450d.m10560a().mo19732a((Activity) this, strArr, (C3451e) new C3451e() {
                    /* renamed from: a */
                    public void mo18421a() {
                        C3865e.m12600a(str);
                        TTDelegateActivity.this.finish();
                    }

                    /* renamed from: a */
                    public void mo18422a(String str) {
                        C3865e.m12601a(str, str);
                        TTDelegateActivity.this.finish();
                    }
                });
            } catch (Exception unused) {
                finish();
            }
        } else {
            C2905l.m8111b(TTAdConstant.TAG, "Already have permission");
            finish();
        }
    }

    /* renamed from: a */
    private void m8482a(final String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C2914t.m8151a(this, "tt_tip");
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        m8481a(str4, str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C3862d.m12590a(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C3862d.m12593b(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C3862d.m12594c(str);
                TTDelegateActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    private void m8481a(String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        String str3;
        try {
            if (this.f6848b == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    str3 = "Theme.Dialog.TTDownload";
                } else {
                    str3 = "Theme.Dialog.TTDownloadOld";
                }
                this.f6848b = new AlertDialog.Builder(this, C2914t.m8160g(this, str3)).create();
            }
            this.f6848b.setTitle(String.valueOf(str));
            this.f6848b.setMessage(String.valueOf(str2));
            this.f6848b.setButton(-1, C2914t.m8151a(this, "tt_label_ok"), onClickListener);
            this.f6848b.setButton(-2, C2914t.m8151a(this, "tt_label_cancel"), onClickListener2);
            this.f6848b.setOnCancelListener(onCancelListener);
            if (!this.f6848b.isShowing()) {
                this.f6848b.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C3450d.m10560a().mo19733a((Activity) this, strArr, iArr);
        finish();
    }
}
