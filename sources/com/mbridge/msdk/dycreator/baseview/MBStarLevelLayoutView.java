package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;

public class MBStarLevelLayoutView extends MBLinearLayout {
    public MBStarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i) {
        try {
            removeAllViews();
            if (i == 0) {
                i = 5;
            }
            for (int i2 = 0; i2 < 5; i2++) {
                ImageView imageView = new ImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i2 < i) {
                    imageView.setImageResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_demo_star_sel", "drawable"));
                } else {
                    imageView.setImageResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_demo_star_nor", "drawable"));
                }
                layoutParams.leftMargin = C8371b.m23818a(getContext(), 5.0f);
                addView(imageView, layoutParams);
            }
        } catch (Exception e) {
            C8672v.m24878d("MBStarLevelLayoutView", e.getMessage());
        }
    }
}
