package com.bytedance.sdk.openadsdk.component.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.component.view.a */
/* compiled from: TTAppOpenAdUserInfo */
public class C3330a {

    /* renamed from: a */
    private static boolean f7979a;

    /* renamed from: b */
    private static Drawable f7980b;

    /* renamed from: c */
    private LinearLayout f7981c;

    /* renamed from: d */
    private TTRoundRectImageView f7982d;

    /* renamed from: e */
    private TextView f7983e;

    /* renamed from: a */
    public void mo19255a(Activity activity) {
        this.f7981c = (LinearLayout) activity.findViewById(C2914t.m8158e(activity, "tt_user_info"));
        this.f7982d = (TTRoundRectImageView) activity.findViewById(C2914t.m8158e(activity, "tt_app_icon"));
        this.f7983e = (TextView) activity.findViewById(C2914t.m8158e(activity, "tt_app_name"));
        this.f7981c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    /* renamed from: a */
    public void mo19254a() {
        String g = C3457h.m10580d().mo19767g();
        if (TextUtils.isEmpty(g)) {
            this.f7983e.setVisibility(8);
        } else {
            this.f7983e.setText(g);
        }
        mo19257b();
        try {
            if (f7980b == null) {
                this.f7982d.setVisibility(8);
                return;
            }
            this.f7982d.setImageDrawable(f7980b);
            if (this.f7983e.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7982d.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f7982d.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.f7982d.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo19257b() {
        if (!f7979a) {
            try {
                int h = C3457h.m10580d().mo19768h();
                if (h != 0) {
                    f7980b = C3513m.m10963a().getResources().getDrawable(h);
                }
            } catch (Throwable unused) {
            }
            f7979a = true;
        }
    }

    /* renamed from: c */
    public static Drawable m9905c() {
        return f7980b;
    }

    /* renamed from: a */
    public void mo19256a(C3431n nVar, float f, float f2) {
        int i;
        int i2;
        int d = nVar.mo19607d();
        if (d == 1 || d == 3) {
            if (C3431n.m10311c(nVar)) {
                i2 = nVar.mo19517J().mo15937c();
                i = nVar.mo19517J().mo15934b();
            } else {
                i2 = nVar.mo19523P().get(0).mo19472b();
                i = nVar.mo19523P().get(0).mo19475c();
            }
            if (i2 > 0 && i > 0) {
                float f3 = (float) i;
                float min = f2 - (f3 * Math.min(f / ((float) i2), f2 / f3));
                try {
                    float e = (float) C3904y.m12886e(C3513m.m10963a(), 60.0f);
                    if (min < e) {
                        min = e;
                    }
                    this.f7981c.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) min));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
