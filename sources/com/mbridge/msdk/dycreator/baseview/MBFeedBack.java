package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.widget.FeedBackButton;

public class MBFeedBack extends MBTextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public MBFeedBack(Context context) {
        super(context);
        m20757a();
    }

    public MBFeedBack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20757a();
    }

    public MBFeedBack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20757a();
    }

    /* renamed from: a */
    private void m20757a() {
        setText(C8658p.m24799a(getContext(), "mbridge_cm_feedback_btn_text", "string"));
        Context context = getContext();
        int b = C8677z.m24924b(context, 13.0f);
        setPadding(b, 0, b, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) C8677z.m24924b(context, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }
}
