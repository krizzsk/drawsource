package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.Locale;

public class PlayableLoadingView extends FrameLayout {

    /* renamed from: a */
    private ProgressBar f9437a;

    /* renamed from: b */
    private TextView f9438b;

    /* renamed from: c */
    private TextView f9439c;

    public PlayableLoadingView(Context context) {
        super(context);
        m12003a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12003a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12003a(context);
    }

    /* renamed from: a */
    private void m12003a(Context context) {
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        setVisibility(8);
        LayoutInflater.from(context).inflate(C2914t.m8159f(context, "tt_playable_loading_layout"), this, true);
        this.f9437a = (ProgressBar) findViewById(C2914t.m8158e(context, "tt_playable_pb_view"));
        this.f9438b = (TextView) findViewById(C2914t.m8158e(context, "tt_playable_progress_tip"));
        TextView textView = (TextView) findViewById(C2914t.m8158e(context, "tt_playable_play"));
        this.f9439c = textView;
        textView.setText(C2914t.m8151a(context, "tt_try_now"));
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        ProgressBar progressBar = this.f9437a;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        TextView textView = this.f9438b;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo20386a() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo20387b() {
        setVisibility(0);
    }

    public TextView getPlayView() {
        return this.f9439c;
    }
}
