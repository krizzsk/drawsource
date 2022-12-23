package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

public class TopLayoutDislike2 extends FrameLayout implements C3311a<TopLayoutDislike2> {

    /* renamed from: a */
    private View f7874a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f7875b;

    /* renamed from: c */
    private TextView f7876c;

    /* renamed from: d */
    private boolean f7877d;

    /* renamed from: e */
    private C3431n f7878e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f7879f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3312b f7880g;

    /* renamed from: h */
    private CharSequence f7881h;

    /* renamed from: i */
    private CharSequence f7882i;

    public TopLayoutDislike2(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7881h = "";
        this.f7882i = "";
    }

    /* renamed from: a */
    public TopLayoutDislike2 mo19150a(boolean z, C3431n nVar) {
        this.f7877d = z;
        this.f7878e = nVar;
        LayoutInflater.from(getContext()).inflate(C2914t.m8159f(getContext(), "tt_top_reward_dislike_2"), this, true);
        this.f7874a = findViewById(C2914t.m8158e(getContext(), "tt_top_dislike"));
        if (nVar.mo19589aw()) {
            this.f7874a.setVisibility(8);
        }
        ((TextView) this.f7874a).setText(C2914t.m8151a(C3513m.m10963a(), "tt_reward_feedback"));
        this.f7875b = (ImageView) findViewById(C2914t.m8158e(getContext(), "tt_top_mute"));
        TextView textView = (TextView) findViewById(C2914t.m8158e(getContext(), "tt_top_skip"));
        this.f7876c = textView;
        textView.setVisibility(0);
        this.f7876c.setText("");
        this.f7876c.setEnabled(false);
        this.f7876c.setClickable(false);
        m9764d();
        return this;
    }

    /* renamed from: d */
    private void m9764d() {
        View view = this.f7874a;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f7880g != null) {
                        TopLayoutDislike2.this.f7880g.mo18438c(view);
                    }
                }
            });
        }
        ImageView imageView = this.f7875b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int i;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    boolean unused = topLayoutDislike2.f7879f = !topLayoutDislike2.f7879f;
                    if (TopLayoutDislike2.this.f7879f) {
                        i = C2914t.m8157d(TopLayoutDislike2.this.getContext(), "tt_mute");
                    } else {
                        i = C2914t.m8157d(TopLayoutDislike2.this.getContext(), "tt_unmute");
                    }
                    TopLayoutDislike2.this.f7875b.setImageResource(i);
                    if (TopLayoutDislike2.this.f7880g != null) {
                        TopLayoutDislike2.this.f7880g.mo18437b(view);
                    }
                }
            });
        }
        TextView textView = this.f7876c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f7880g != null) {
                        TopLayoutDislike2.this.f7880g.mo18436a(view);
                    }
                }
            });
        }
    }

    public void setShowSkip(boolean z) {
        TextView textView = this.f7876c;
        if (textView != null) {
            if (!z) {
                textView.setText("");
            }
            if (this.f7876c.getVisibility() != 4) {
                this.f7876c.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setSkipEnable(boolean z) {
        TextView textView = this.f7876c;
        if (textView != null) {
            textView.setEnabled(z);
            this.f7876c.setClickable(z);
        }
    }

    public void setShowSound(boolean z) {
        ImageView imageView = this.f7875b;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setSoundMute(boolean z) {
        int i;
        this.f7879f = z;
        if (z) {
            i = C2914t.m8157d(getContext(), "tt_mute");
        } else {
            i = C2914t.m8157d(getContext(), "tt_unmute");
        }
        this.f7875b.setImageResource(i);
    }

    /* renamed from: a */
    public void mo19152a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7881h = charSequence;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.f7882i = charSequence2;
        }
        if (this.f7876c != null) {
            CharSequence charSequence3 = this.f7881h;
            if (!TextUtils.isEmpty(this.f7882i)) {
                charSequence3 = charSequence3 + " | " + this.f7882i;
            }
            this.f7876c.setText(charSequence3);
        }
    }

    public void setShowDislike(boolean z) {
        View view = this.f7874a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setListener(C3312b bVar) {
        this.f7880g = bVar;
    }

    /* renamed from: a */
    public void mo19151a() {
        TextView textView = this.f7876c;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: b */
    public void mo19153b() {
        ImageView imageView = this.f7875b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    /* renamed from: c */
    public void mo19154c() {
        this.f7876c.setWidth(20);
        this.f7876c.setVisibility(4);
    }
}
