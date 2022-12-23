package com.fyber.inneractive.sdk.p191ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager */
public class CloseButtonFlowManager {

    /* renamed from: a */
    public final View f13909a;

    /* renamed from: b */
    public final TextView f13910b;

    /* renamed from: c */
    public final View f13911c;

    /* renamed from: d */
    public final ImageView f13912d;

    /* renamed from: e */
    public final FrameLayout f13913e;

    /* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager$a */
    public class C5244a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ InneractiveFullscreenAdActivity f13914a;

        public C5244a(CloseButtonFlowManager closeButtonFlowManager, InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
            this.f13914a = inneractiveFullscreenAdActivity;
        }

        public void onClick(View view) {
            this.f13914a.dismissAd(true);
        }
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View findViewById = inneractiveFullscreenAdActivity.findViewById(C4109R.C4111id.ia_fl_close_button);
        this.f13909a = findViewById;
        this.f13910b = (TextView) inneractiveFullscreenAdActivity.findViewById(C4109R.C4111id.ia_tv_close_button);
        View findViewById2 = inneractiveFullscreenAdActivity.findViewById(C4109R.C4111id.ia_clickable_close_button);
        this.f13911c = findViewById2;
        this.f13912d = (ImageView) inneractiveFullscreenAdActivity.findViewById(C4109R.C4111id.ia_iv_close_button);
        this.f13913e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(C4109R.C4111id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(new C5244a(this, inneractiveFullscreenAdActivity));
    }
}
