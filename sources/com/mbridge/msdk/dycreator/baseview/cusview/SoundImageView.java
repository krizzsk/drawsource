package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8658p;

public class SoundImageView extends ImageView {

    /* renamed from: a */
    private boolean f18252a = true;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SoundImageView(Context context) {
        super(context);
    }

    public boolean getStatus() {
        return this.f18252a;
    }

    public void setSoundStatus(boolean z) {
        this.f18252a = z;
        if (z) {
            setImageResource(C8658p.m24799a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(C8658p.m24799a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }
}
