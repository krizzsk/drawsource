package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a */
/* compiled from: CustomCommonDialog */
public class C3680a extends Dialog {

    /* renamed from: a */
    public C3683a f9507a;

    /* renamed from: b */
    private ImageView f9508b;

    /* renamed from: c */
    private TextView f9509c;

    /* renamed from: d */
    private TextView f9510d;

    /* renamed from: e */
    private Button f9511e;

    /* renamed from: f */
    private Button f9512f;

    /* renamed from: g */
    private View f9513g;

    /* renamed from: h */
    private Context f9514h;

    /* renamed from: i */
    private String f9515i;

    /* renamed from: j */
    private String f9516j;

    /* renamed from: k */
    private String f9517k;

    /* renamed from: l */
    private String f9518l;

    /* renamed from: m */
    private int f9519m = -1;

    /* renamed from: n */
    private boolean f9520n = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.a$a */
    /* compiled from: CustomCommonDialog */
    public interface C3683a {
        /* renamed from: a */
        void mo18494a();

        /* renamed from: b */
        void mo18495b();
    }

    public void onBackPressed() {
    }

    public C3680a(Context context) {
        super(context, C2914t.m8160g(context, "tt_custom_dialog"));
        this.f9514h = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2914t.m8159f(this.f9514h, "tt_custom_dailog_layout"));
        setCanceledOnTouchOutside(false);
        m12027c();
        m12026b();
        m12025a();
    }

    /* renamed from: a */
    private void m12025a() {
        this.f9512f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3680a.this.f9507a != null) {
                    C3680a.this.f9507a.mo18494a();
                }
            }
        });
        this.f9511e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3680a.this.f9507a != null) {
                    C3680a.this.f9507a.mo18495b();
                }
            }
        });
    }

    /* renamed from: b */
    private void m12026b() {
        if (!TextUtils.isEmpty(this.f9516j)) {
            this.f9509c.setText(this.f9516j);
            this.f9509c.setVisibility(0);
        } else {
            this.f9509c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9515i)) {
            this.f9510d.setText(this.f9515i);
        }
        if (!TextUtils.isEmpty(this.f9517k)) {
            this.f9512f.setText(this.f9517k);
        } else {
            this.f9512f.setText(C2914t.m8151a(C3513m.m10963a(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f9518l)) {
            this.f9511e.setText(this.f9518l);
        } else {
            this.f9511e.setText(C2914t.m8151a(C3513m.m10963a(), "tt_negtive_txt"));
        }
        int i = this.f9519m;
        if (i != -1) {
            this.f9508b.setImageResource(i);
            this.f9508b.setVisibility(0);
        } else {
            this.f9508b.setVisibility(8);
        }
        if (this.f9520n) {
            this.f9513g.setVisibility(8);
            this.f9511e.setVisibility(8);
            return;
        }
        this.f9511e.setVisibility(0);
        this.f9513g.setVisibility(0);
    }

    public void show() {
        super.show();
        m12026b();
    }

    /* renamed from: c */
    private void m12027c() {
        this.f9511e = (Button) findViewById(C2914t.m8158e(this.f9514h, "tt_negtive"));
        this.f9512f = (Button) findViewById(C2914t.m8158e(this.f9514h, "tt_positive"));
        this.f9509c = (TextView) findViewById(C2914t.m8158e(this.f9514h, "tt_title"));
        this.f9510d = (TextView) findViewById(C2914t.m8158e(this.f9514h, "tt_message"));
        this.f9508b = (ImageView) findViewById(C2914t.m8158e(this.f9514h, "tt_image"));
        this.f9513g = findViewById(C2914t.m8158e(this.f9514h, "tt_column_line"));
    }

    /* renamed from: a */
    public C3680a mo20437a(C3683a aVar) {
        this.f9507a = aVar;
        return this;
    }

    /* renamed from: a */
    public C3680a mo20438a(String str) {
        this.f9515i = str;
        return this;
    }

    /* renamed from: b */
    public C3680a mo20439b(String str) {
        this.f9517k = str;
        return this;
    }

    /* renamed from: c */
    public C3680a mo20440c(String str) {
        this.f9518l = str;
        return this;
    }
}
