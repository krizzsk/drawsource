package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.e */
/* compiled from: TTPrivacyAdReportDialog */
public class C3167e extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f7432b = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: a */
    private Handler f7433a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f7434c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f7435d;

    public C3167e(Context context) {
        super(context, C2914t.m8160g(context, "tt_privacy_dialog_theme_ad_report"));
    }

    /* renamed from: a */
    public void mo18804a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f7434c = C2888a.m8062a(new JSONObject(str)).toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C2914t.m8159f(getContext(), "tt_ad_report_info"), (ViewGroup) null), new ViewGroup.LayoutParams(C3904y.m12877c(getContext()), (int) (((double) C3904y.m12881d(getContext())) * 0.9d)));
        m9161b();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    /* renamed from: b */
    private void m9161b() {
        this.f7435d = (TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_creative_info"));
        final String d = C3898x.m12785d();
        final String f = C3898x.m12797f();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_sdk_version"))).setText(BuildConfig.VERSION_NAME);
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_app_package_name"))).setText(d);
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_app_version"))).setText(f);
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_os"))).setText(str);
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_device"))).setText(str2);
        this.f7435d.setText("loading ...");
        ((Button) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_copy_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) C3167e.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder("");
                    String[] strArr = {BuildConfig.VERSION_NAME, d, f, str, str2, C3167e.this.f7434c};
                    for (int i = 0; i < C3167e.f7432b.length; i++) {
                        sb.append(C3167e.f7432b[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                }
            }
        });
        ((ImageView) findViewById(C2914t.m8158e(getContext(), "tt_ad_report_close_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3167e.this.f7435d.setText("loading ...");
                C3167e.this.cancel();
            }
        });
    }

    public void show() {
        super.show();
        this.f7433a.postDelayed(new Runnable() {
            public void run() {
                C3167e.this.f7435d.setText(C3167e.this.f7434c);
            }
        }, 1000);
    }
}
