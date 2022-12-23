package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, C2618h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f5751l.mo17021A()) {
            this.f5754o = new AnimationText(context, this.f5751l.mo17040g(), this.f5751l.mo17038e(), 1, this.f5751l.mo17041h());
            ((AnimationText) this.f5754o).setMaxLines(1);
        } else {
            this.f5754o = new TextView(context);
        }
        this.f5754o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5754o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17171h() {
        int i;
        super.mo17171h();
        if (TextUtils.isEmpty(getText())) {
            this.f5754o.setVisibility(4);
            return true;
        } else if (this.f5751l.mo17021A()) {
            m7152k();
            return true;
        } else {
            ((TextView) this.f5754o).setText(this.f5751l.mo17039f());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5754o.setTextAlignment(this.f5751l.mo17041h());
            }
            ((TextView) this.f5754o).setTextColor(this.f5751l.mo17040g());
            ((TextView) this.f5754o).setTextSize(this.f5751l.mo17038e());
            if (!this.f5751l.mo17053t()) {
                ((TextView) this.f5754o).setMaxLines(1);
                ((TextView) this.f5754o).setGravity(17);
                ((TextView) this.f5754o).setEllipsize(TextUtils.TruncateAt.END);
            } else {
                int u = this.f5751l.mo17054u();
                if (u > 0) {
                    ((TextView) this.f5754o).setLines(u);
                    ((TextView) this.f5754o).setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            if (!(this.f5752m == null || this.f5752m.mo17082i() == null)) {
                if (!C2570c.m6619b() || !m7149a() || (!TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "text_star") && !TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count") && !TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count-type-1") && !TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count-type-2"))) {
                    if (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count") || TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count-type-2")) {
                        try {
                            i = Integer.parseInt(getText());
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i < 0) {
                            try {
                                if (C2570c.m6619b()) {
                                    setVisibility(8);
                                    return true;
                                }
                                this.f5754o.setVisibility(0);
                            } catch (Exception unused2) {
                            }
                        }
                        m7150i();
                        if (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count-type-2")) {
                            ((TextView) this.f5754o).setText(String.format(new DecimalFormat("(###,###,###)").format((long) i), new Object[]{Integer.valueOf(i)}));
                            ((TextView) this.f5754o).setGravity(17);
                            return true;
                        }
                        mo17207a((TextView) this.f5754o, i, getContext(), "tt_comment_num");
                    } else if (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "text_star")) {
                        double d = -1.0d;
                        try {
                            d = Double.parseDouble(getText());
                        } catch (Exception e) {
                            C2905l.m8118e("DynamicStarView applyNativeStyle", e.toString());
                        }
                        if (d < 0.0d || d > 5.0d) {
                            if (C2570c.m6619b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.f5754o.setVisibility(0);
                        }
                        m7150i();
                        ((TextView) this.f5754o).setIncludeFontPadding(false);
                        ((TextView) this.f5754o).setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.f5754o.setTextAlignment(4);
                        }
                        ((TextView) this.f5754o).setText(String.format("%.1f", new Object[]{Double.valueOf(d)}));
                    } else if (TextUtils.equals("privacy-detail", this.f5752m.mo17082i().mo16876b())) {
                        ((TextView) this.f5754o).setText("权限列表 | 隐私政策");
                    } else if (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "development-name")) {
                        ((TextView) this.f5754o).setText("开发者：" + getText());
                    } else if (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "app-version")) {
                        ((TextView) this.f5754o).setText("版本号：V" + getText());
                    } else {
                        ((TextView) this.f5754o).setText(getText());
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f5754o.setTextAlignment(this.f5751l.mo17041h());
                        ((TextView) this.f5754o).setGravity(this.f5751l.mo17042i());
                    }
                    if (C2570c.m6619b()) {
                        m7151j();
                    }
                } else {
                    setVisibility(8);
                    return true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m7149a() {
        return (this.f5753n == null || this.f5753n.getRenderRequest() == null || this.f5753n.getRenderRequest().mo16681k() == 4) ? false : true;
    }

    /* renamed from: i */
    private void m7150i() {
        if ((this.f5751l.mo17032a() != 0 || this.f5751l.mo17035b() <= 0) && C2570c.m6619b()) {
            this.f5754o.setTranslationY((float) (-(((int) ((((float) this.f5747h) - ((TextView) this.f5754o).getTextSize()) - C2572b.m6622a(getContext(), (float) (this.f5751l.mo17035b() + this.f5751l.mo17032a())))) / 2)));
        }
    }

    /* renamed from: j */
    private void m7151j() {
        if ((TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "source") || TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "title")) && Build.VERSION.SDK_INT >= 17) {
            this.f5754o.setTextAlignment(2);
        }
        if ((TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "text_star") || TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "fillButton")) && Build.VERSION.SDK_INT >= 17) {
            this.f5754o.setTextAlignment(2);
            ((TextView) this.f5754o).setGravity(17);
        }
    }

    public String getText() {
        String f = this.f5751l.mo17039f();
        if (TextUtils.isEmpty(f)) {
            if (!C2570c.m6619b() && TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "text_star")) {
                f = "5";
            }
            if (!C2570c.m6619b() && TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "score-count")) {
                f = "6870";
            }
        }
        return (TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "title") || TextUtils.equals(this.f5752m.mo17082i().mo16876b(), "subtitle")) ? f.replace("\n", "") : f;
    }

    /* renamed from: a */
    public void mo17207a(TextView textView, int i, Context context, String str) {
        String format = String.format(C2914t.m8151a(context, str), new Object[]{Integer.valueOf(i)});
        textView.setText("(" + format + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m7152k() {
        if (this.f5754o instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                arrayList.add(text);
            }
            ((AnimationText) this.f5754o).setMaxLines(1);
            ((AnimationText) this.f5754o).setTextColor(this.f5751l.mo17040g());
            ((AnimationText) this.f5754o).setTextSize(this.f5751l.mo17038e());
            ((AnimationText) this.f5754o).setAnimationText(arrayList);
            ((AnimationText) this.f5754o).setAnimationType(this.f5751l.mo17023C());
            ((AnimationText) this.f5754o).setAnimationDuration(this.f5751l.mo17022B() * 1000);
            ((AnimationText) this.f5754o).mo17239a();
        }
    }
}
