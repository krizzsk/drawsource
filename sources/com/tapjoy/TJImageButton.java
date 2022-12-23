package com.tapjoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class TJImageButton extends ImageButton {

    /* renamed from: a */
    private Bitmap f26664a;

    /* renamed from: b */
    private Bitmap f26665b;

    public TJImageButton(Context context) {
        super(context);
    }

    public TJImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setEnabledImageBitmap(Bitmap bitmap) {
        this.f26664a = bitmap;
    }

    public void setDisableImageBitmap(Bitmap bitmap) {
        this.f26665b = bitmap;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setImageBitmap(z ? this.f26664a : this.f26665b);
    }
}
