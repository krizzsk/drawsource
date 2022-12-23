package com.smaato.sdk.core.p383ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.smaato.sdk.core.C10776R;

/* renamed from: com.smaato.sdk.core.ui.ProgressView */
public final class ProgressView extends FrameLayout {
    static /* synthetic */ void lambda$init$0(View view) {
    }

    public ProgressView(Context context) {
        super(context);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public void init() {
        setId(C10776R.C10778id.smaato_sdk_core_progress_view_id);
        setBackgroundResource(C10776R.color.smaato_sdk_corelight_ui_semitransparent);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener($$Lambda$ProgressView$vlIjQCXO6g4ByFnfJtX_FgNcJdE.INSTANCE);
        ProgressBar progressBar = new ProgressBar(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        progressBar.setIndeterminateDrawable(getResources().getDrawable(C10776R.C10777drawable.smaato_sdk_corelight_progress_bar));
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }
}
